package edu.pitt.se;

import java.util.List;

public class PlaylistRecommender 
{

    public static String classifyEnergy(List<Integer> bpms) 
    {
        /*Return "HIGH" if avg BPM ≥ 140
        "MEDIUM" if 100–139
        "LOW" if < 100
        Reject null or empty lists */

        if (bpms == null || bpms.isEmpty()) {
            throw new IllegalArgumentException("BPM list cannot be null or empty");
        }

        //find average
        int sum = 0;
        for (int bpm : bpms) 
        {
            sum += bpm;
        }
        int average = sum / bpms.size();
        

        //classify
        if(average >= 140)
        {
            return "HIGH";
        }
        else if(average >= 100 && average <= 139) 
        {
            return "MEDIUM";
        }
        else 
        {
            return "LOW";
        }
        
    }

    public static boolean isValidTrackTitle(String title) 
    {
        if (title == null) 
        {
            return false;
        }

        /*Checks for alphabetic characters + spaces, 1–30 chars
        Reject null or special characters */
       if (title.matches("[a-zA-Z0-9 ]{1,30}")) 
       {
           return true;
       }

       return false;
    }


    public static int normalizeVolume(int volumeDb) 
    {
        //Clamp volume into range 0–100 (e.g., 120 -> 100, -10 -> 0)
        if (volumeDb < 0) 
        {
            return 0;
        } 
        else if (volumeDb > 100) 
        {
            return 100;
        } 
        else 
        {
            return volumeDb;
        }
    }
}
