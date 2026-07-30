package com.cosmos.photon.push.util;

import com.p046p1.mobile.putong.live.base.arch.card.cardmodel.videoFeed.LiveVideoFeedSmallStyleCardView;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class IDUtils {
    private static String filterFile;
    private static BloomFilter idFilter;
    private static HashSet<String> idSet;

    public static synchronized boolean exists(String str) {
        if (str == null) {
            return false;
        }
        String md5 = MD5Utils.getMD5(str);
        return idSet.contains(md5) || idFilter.check(md5);
    }

    public static synchronized void init(String str) {
        idSet = new HashSet<>();
        filterFile = str;
        try {
            idFilter = BloomFilter.readFilterFromFile(str);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (idFilter == null) {
            idFilter = new BloomFilter(BloomFilter.MisjudgmentRate.MIDDLE, LiveVideoFeedSmallStyleCardView.DISTANCE_DIFFERENT_CITY, Double.valueOf(0.29d));
        }
    }

    public static synchronized void saveId(String str) {
        if (str == null) {
            return;
        }
        idFilter.add(MD5Utils.getMD5(str));
        idSet.add(str);
        try {
            idFilter.saveFilterToFile(filterFile);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
