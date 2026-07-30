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
import p149l.h5e;
import p149l.qkf0;
import p149l.rkf0;

/* JADX INFO: loaded from: classes6.dex */
public class SoLoader {

    /* JADX INFO: renamed from: h */
    public static Context f6869h;

    /* JADX INFO: renamed from: b */
    public static final ReentrantReadWriteLock f6863b = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: c */
    public static rkf0[] f6864c = null;

    /* JADX INFO: renamed from: d */
    public static int f6865d = 0;

    /* JADX INFO: renamed from: e */
    public static final HashSet<String> f6866e = new HashSet<>();

    /* JADX INFO: renamed from: f */
    public static final Map<String, Object> f6867f = new HashMap();

    /* JADX INFO: renamed from: g */
    public static final Set<String> f6868g = Collections.newSetFromMap(new ConcurrentHashMap());

    /* JADX INFO: renamed from: a */
    public static final boolean f6862a = true;

    @h5e
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
    public static void m9246a(Context context, int i, qkf0 qkf0Var) throws IOException {
        f6869h = context;
    }

    public static void init(Context context, int i) throws IOException {
        m9246a(context, i, null);
    }
}
