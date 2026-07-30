package com.facebook.appevents;

import android.preference.PreferenceManager;
import com.clevertap.android.sdk.Constants;
import com.facebook.C1600c;
import com.facebook.appevents.C1559a;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.aspectj.lang.JoinPoint;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.facebook.appevents.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0003R\u001c\u0010\r\u001a\n \n*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\fR\u0016\u0010\u0014\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013¨\u0006\u0015"}, m88121d2 = {"Lcom/facebook/appevents/a;", "", "<init>", "()V", "", Constants.INAPP_DATA_TAG, "", "b", "()Ljava/lang/String;", "c", "kotlin.jvm.PlatformType", "a", "Ljava/lang/String;", "TAG", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", JoinPoint.SYNCHRONIZATION_LOCK, "userID", "", "Z", "initialized", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class C1559a {

    @NotNull
    public static final C1559a INSTANCE = new C1559a();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final String TAG = C1559a.class.getSimpleName();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public static String userID;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static volatile boolean initialized;

    /* JADX INFO: renamed from: a */
    public static void m7708a() {
        INSTANCE.m7711c();
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: b */
    public static final String m7709b() {
        if (!initialized) {
            INSTANCE.m7711c();
        }
        lock.readLock().lock();
        try {
            return userID;
        } finally {
            lock.readLock().unlock();
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final void m7710d() {
        if (initialized) {
            return;
        }
        C1577f.INSTANCE.m7837c().execute(new Runnable() { // from class: l.uk0
            @Override // java.lang.Runnable
            public final void run() {
                C1559a.m7708a();
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public final void m7711c() {
        if (initialized) {
            return;
        }
        lock.writeLock().lock();
        try {
            if (!initialized) {
                userID = PreferenceManager.getDefaultSharedPreferences(C1600c.m8101l()).getString("com.facebook.appevents.AnalyticsUserIDStore.userID", null);
                initialized = true;
            }
        } finally {
            lock.writeLock().unlock();
        }
    }
}
