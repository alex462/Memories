package com.example.travistressler.memories.Util.Database;

import android.arch.persistence.room.TypeConverter;
import android.location.Location;

import java.util.Date;

/**
 * Created by travistressler on 10/24/17.
 */

public class Converters {

    @TypeConverter
    public static Date fromTimestamp(Long value) {
        return value == null ? null : new Date(value);
    }

    @TypeConverter
    public static Long dateToTimestamp(Date date) {
        return date == null ? null : date.getTime();
    }

    @TypeConverter
    public static Location fromLocation(String value) {
        return value == null ? null : new Location(value);
    }

    @TypeConverter
    public static String locationToString(Location location) {
        return location == null ? null : location.toString();
    }
}
