package com.vivo.push.util;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public class NotifyUtil {
    private static BaseNotifyDataAdapter sNotifyData = null;
    private static String sNotifyDataAdapter = "com.vivo.push.util.NotifyDataAdapter";
    private static BaseNotifyLayoutAdapter sNotifyLayout = null;
    private static String sNotifyLayoutAdapter = "com.vivo.push.util.NotifyLayoutAdapter";

    public static BaseNotifyDataAdapter getNotifyDataAdapter(Context context) {
        initAdapter(context);
        return sNotifyData;
    }

    public static BaseNotifyLayoutAdapter getNotifyLayoutAdapter(Context context) {
        initAdapter(context);
        return sNotifyLayout;
    }

    private static Object getObjectByReflect(String str, Object obj) {
        Class<?> cls;
        Object objNewInstance = null;
        try {
            cls = Class.forName(str);
        } catch (Exception unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                objNewInstance = cls.newInstance();
            } catch (Exception unused2) {
            }
        }
        return objNewInstance == null ? obj : objNewInstance;
    }

    private static synchronized void initAdapter(Context context) {
        try {
            if (sNotifyData == null) {
                BaseNotifyDataAdapter baseNotifyDataAdapter = (BaseNotifyDataAdapter) getObjectByReflect(sNotifyDataAdapter, new C14639h());
                sNotifyData = baseNotifyDataAdapter;
                baseNotifyDataAdapter.init(context);
            }
            if (sNotifyLayout == null) {
                BaseNotifyLayoutAdapter baseNotifyLayoutAdapter = (BaseNotifyLayoutAdapter) getObjectByReflect(sNotifyLayoutAdapter, new C14640i());
                sNotifyLayout = baseNotifyLayoutAdapter;
                baseNotifyLayoutAdapter.init(context);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
