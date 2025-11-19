package edu.pitt.se;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class PlaylistRecommenderTest 
{

    @Test
    public void testClassifyEnergy() 
    {
        assertEquals("HIGH", PlaylistRecommender.classifyEnergy(List.of(150, 160, 170)));
        assertEquals("MEDIUM", PlaylistRecommender.classifyEnergy(List.of(120, 130, 140)));
        assertEquals("LOW", PlaylistRecommender.classifyEnergy(List.of(80, 90, 70)));
    }

    @Test
    public void testIsValidTrackTitle() 
    {
        assertTrue(PlaylistRecommender.isValidTrackTitle("Valid Title"));
        assertFalse(PlaylistRecommender.isValidTrackTitle("Invalid Title!"));
        assertFalse(PlaylistRecommender.isValidTrackTitle("Invalid Titleeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee!"));
        assertFalse(PlaylistRecommender.isValidTrackTitle(null));
    }

    @Test
    public void testNormalizeVolume() 
    {
        assertEquals(0, PlaylistRecommender.normalizeVolume(-10));
        assertEquals(100, PlaylistRecommender.normalizeVolume(120));
        assertEquals(50, PlaylistRecommender.normalizeVolume(50));
    }

    
}
