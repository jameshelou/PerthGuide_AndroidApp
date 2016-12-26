package com.helou.james.perthguide;

/**
 * Created by James on 21-Dec-16.
 */

public class Location {
    // Location name
    private String mLoc_name;

    // Location extra info
    private String mLoc_info;

    // Location image (if any)
    private static final int NO_IMAGE = -1;
    private int mImage_id = NO_IMAGE;

    /*
     * Location constructor (no image)
     */
    public Location(String loc_name, String loc_info) {
        this.mLoc_name = loc_name;
        this.mLoc_info = loc_info;
    }

    /*
     * Location constructor (with image)
     */
    public Location(String loc_name, String loc_info, int image_id) {
        this.mLoc_name = loc_name;
        this.mLoc_info = loc_info;
        this.mImage_id = image_id;
    }

    /*
     * Get location name
     */
    public String getLocName() { return mLoc_name; }

    /*
     * Get location info
     */
    public String getLocInfo() { return mLoc_info; }

    /*
     * Get image resource ID
     */
    public int getImageId() { return mImage_id; }

    /*
     * Has Image checker
     */
    public boolean hasImage() {
        return (mImage_id != NO_IMAGE);
    }
}
