package com.onslearning.cloudservice.Week_TWO.VideoServlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpRequest;
import java.util.ArrayList;
import java.util.List;

public class VideoServlets extends HttpServlet {

    /**
     * ArrayList to add videos in the list.
     */
    private List<Video> videoList = new ArrayList<Video>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        /**
         * Set content type header so client can properly and securely display the content that I send back
         */
        resp.setContentType("text/plain");

        /**
         * This PrintWriter allows us to write data to HTTP response body that is going to be sent to the client.
         */
        PrintWriter sendToClient = resp.getWriter();

        /**
         * Loop through all the stored video in ArrayList and print their name and URL into HTTP response body.
         */
        for(Video v : videoList){
            sendToClient.write(v.getName() + " : " + v.getURL() + "\n");
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        /**
         * 1. Extract the HTTP request param that are wxpected from URL Query String or URL encoded form body.
         */
        String name = req.getParameter("name");
        String URL = req.getParameter("URL");
        String durationStr = req.getParameter("duration");

        /**
         * Convert string duration into number.
         */
        long durationVideo = -1;
        durationVideo = Long.parseLong(durationStr);

        /**
         * Set the content type Header so Client's browser know the format of the data and how to interpret it.
         */
        resp.setContentType("text/plain");

        /**
         * Validate the query parameters received from the URL. If there is invalid data in request param then Server should send
         * HTTP 400 Bad Request error to the client.
         */
        if(name == null || URL == null || durationStr == null || name.trim().length()<1 || URL.trim().length()<1 || durationStr.trim().length()<1){
            resp.sendError(400,"Invalid Name, URL or Video duration");
        }
        else{
            /**
             * If all the string param are valid then create an object of class Video with name, URL and duration.
             */
            Video v = new Video("Shiv Dhun","www.youtube.com/shivdhun",120);
            videoList.add(v);
        }

    }//end of post method.

}//End of class
