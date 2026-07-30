package com.momo.mcamera.mask.segment;

import android.text.TextUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes7.dex */
public class SegmentFilterFactory {
    public static final String BYTEDANCE = "byteDance";
    public static final String MOMO = "momo";

    @Retention(RetentionPolicy.SOURCE)
    public @interface SegmentType {
    }

    public static AbsSegmentFilter createSegmentFilter(String str) {
        return TextUtils.equals(BYTEDANCE, str) ? new ByteDanceSegmentFilter() : new SegmentFilter();
    }
}
