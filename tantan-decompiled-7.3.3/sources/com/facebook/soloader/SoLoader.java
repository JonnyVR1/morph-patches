package com.facebook.soloader;

import android.annotation.TargetApi;
import android.content.Context;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p153l.atf0;
import p153l.v6e;
import p153l.zsf0;

/* JADX INFO: loaded from: classes6.dex */
public class SoLoader {

    /* JADX INFO: renamed from: h */
    public static Context f6906h;

    /* JADX INFO: renamed from: b */
    public static final ReentrantReadWriteLock f6900b = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: c */
    public static atf0[] f6901c = null;

    /* JADX INFO: renamed from: d */
    public static int f6902d = 0;

    /* JADX INFO: renamed from: e */
    public static final HashSet<String> f6903e = new HashSet<>();

    /* JADX INFO: renamed from: f */
    public static final Map<String, Object> f6904f = new HashMap();

    /* JADX INFO: renamed from: g */
    public static final Set<String> f6905g = Collections.newSetFromMap(new ConcurrentHashMap());

    /* JADX INFO: renamed from: a */
    public static final boolean f6899a = true;

    @v6e
    @TargetApi(14)
    public static class Api14Utils {
        private Api14Utils() {
        }
    }

    public static final class WrongAbiError extends UnsatisfiedLinkError {
        public WrongAbiError(Throwable th) {
            super("APK was built for a different platform");
            initCause(th);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m9300a(Context context, int i, zsf0 zsf0Var) throws IOException {
        f6906h = context;
    }

    public static void init(Context context, int i) throws IOException {
        m9300a(context, i, null);
    }
}
