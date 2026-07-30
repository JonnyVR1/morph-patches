package com.google.firebase.crashlytics.internal.common;

/* JADX INFO: loaded from: classes7.dex */
public class ResponseParser {
    public static final int ResponseActionDiscard = 0;
    public static final int ResponseActionRetry = 1;

    public static int parse(int i) {
        if (i < 200 || i > 299) {
            return ((i < 300 || i > 399) && i >= 400 && i <= 499) ? 0 : 1;
        }
        return 0;
    }
}
