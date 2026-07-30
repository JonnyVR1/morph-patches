package com.p051p1.mobile.putong.app;

import android.content.res.Resources;
import android.util.LruCache;
import com.p051p1.mobile.android.app.App;

/* JADX INFO: loaded from: classes9.dex */
public class ResourcesUtils {

    /* JADX INFO: renamed from: a */
    public static final LruCache<String, Integer> f17895a = new LruCache<>(50);

    public enum TYPE {
        DRAWABLE("drawable"),
        ID("id"),
        DIMEN("dimen"),
        RAW("raw");


        /* JADX INFO: renamed from: s */
        private String f17897s;

        TYPE(String str) {
            this.f17897s = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f17897s;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m30641a(String str, TYPE type) {
        return m30642b().getIdentifier(str, type.toString(), App.f16088e.getPackageName());
    }

    /* JADX INFO: renamed from: b */
    public static Resources m30642b() {
        return App.f16088e.getResources();
    }
}
