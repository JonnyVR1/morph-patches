package com.p000p1.mobile.putong.app;

import android.content.res.Resources;
import android.util.LruCache;
import com.p1.mobile.android.app.App;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class ResourcesUtils {

    /* JADX INFO: renamed from: a */
    public static final LruCache<String, Integer> f1165a = new LruCache<>(50);

    public enum TYPE {
        DRAWABLE("drawable"),
        ID("id"),
        DIMEN("dimen"),
        RAW("raw");


        /* JADX INFO: renamed from: s */
        private String f1167s;

        TYPE(String str) {
            this.f1167s = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f1167s;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m1553a(String str, TYPE type) {
        return m1554b().getIdentifier(str, type.toString(), App.e.getPackageName());
    }

    /* JADX INFO: renamed from: b */
    public static Resources m1554b() {
        return App.e.getResources();
    }
}
