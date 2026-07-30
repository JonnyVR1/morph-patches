package com.p000p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class SudJsonUtils {

    public static class InnerClass {
        public static Gson gson = new GsonBuilder().disableHtmlEscaping().create();
    }

    public static <T> T fromJson(String str, Class<T> cls) {
        try {
            return (T) getGson().fromJson(str, cls);
        } catch (Exception e) {
            CrashHelper.c(e);
            e.printStackTrace();
            return null;
        }
    }

    public static Gson getGson() {
        return InnerClass.gson;
    }

    public static String toJson(Object obj) {
        return getGson().toJson(obj);
    }
}
