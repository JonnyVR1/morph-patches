package com.p046p1.mobile.putong.app;

import android.content.res.Resources;
import android.util.LruCache;
import com.p046p1.mobile.android.app.App;

/* JADX INFO: loaded from: classes9.dex */
public class ResourcesUtils {

    /* JADX INFO: renamed from: a */
    public static final LruCache<String, Integer> f17176a = new LruCache<>(50);

    public enum TYPE {
        DRAWABLE("drawable"),
        ID("id"),
        DIMEN("dimen"),
        RAW("raw");


        /* JADX INFO: renamed from: s */
        private String f17178s;

        TYPE(String str) {
            this.f17178s = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f17178s;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m29643a(String str, TYPE type) {
        return m29644b().getIdentifier(str, type.toString(), App.f15369e.getPackageName());
    }

    /* JADX INFO: renamed from: b */
    public static Resources m29644b() {
        return App.f15369e.getResources();
    }
}
