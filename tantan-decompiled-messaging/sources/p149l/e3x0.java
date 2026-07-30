package p149l;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.RemoteException;
import android.os.StrictMode;
import androidx.annotation.GuardedBy;
import com.clevertap.android.sdk.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class e3x0 implements qax0 {

    /* JADX INFO: renamed from: h */
    @GuardedBy("ConfigurationContentLoader.class")
    public static final Map<Uri, e3x0> f89220h = new e01();

    /* JADX INFO: renamed from: i */
    public static final String[] f89221i = {Constants.KEY_KEY, "value"};

    /* JADX INFO: renamed from: a */
    public final ContentResolver f89222a;

    /* JADX INFO: renamed from: b */
    public final Uri f89223b;

    /* JADX INFO: renamed from: c */
    public final Runnable f89224c;

    /* JADX INFO: renamed from: d */
    public final ContentObserver f89225d;

    /* JADX INFO: renamed from: e */
    public final Object f89226e;

    /* JADX INFO: renamed from: f */
    public volatile Map<String, String> f89227f;

    /* JADX INFO: renamed from: g */
    @GuardedBy("this")
    public final List<u7x0> f89228g;

    public e3x0(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        v4x0 v4x0Var = new v4x0(this, null);
        this.f89225d = v4x0Var;
        this.f89226e = new Object();
        this.f89228g = new ArrayList();
        sf80.m183894p(contentResolver);
        sf80.m183894p(uri);
        this.f89222a = contentResolver;
        this.f89223b = uri;
        this.f89224c = runnable;
        contentResolver.registerContentObserver(uri, false, v4x0Var);
    }

    /* JADX INFO: renamed from: b */
    public static e3x0 m114636b(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        e3x0 e3x0Var;
        synchronized (e3x0.class) {
            Map<Uri, e3x0> map = f89220h;
            e3x0Var = map.get(uri);
            if (e3x0Var == null) {
                try {
                    e3x0 e3x0Var2 = new e3x0(contentResolver, uri, runnable);
                    try {
                        map.put(uri, e3x0Var2);
                    } catch (SecurityException unused) {
                    }
                    e3x0Var = e3x0Var2;
                } catch (SecurityException unused2) {
                }
            }
        }
        return e3x0Var;
    }

    /* JADX INFO: renamed from: d */
    public static synchronized void m114637d() {
        try {
            for (e3x0 e3x0Var : f89220h.values()) {
                e3x0Var.f89222a.unregisterContentObserver(e3x0Var.f89225d);
            }
            f89220h.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public final Map<String, String> m114638a() {
        Map<String, String> mapM114641f = this.f89227f;
        if (mapM114641f == null) {
            synchronized (this.f89226e) {
                try {
                    mapM114641f = this.f89227f;
                    if (mapM114641f == null) {
                        mapM114641f = m114641f();
                        this.f89227f = mapM114641f;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return mapM114641f != null ? mapM114641f : Collections.EMPTY_MAP;
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Map m114639c() {
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = this.f89222a.acquireUnstableContentProviderClient(this.f89223b);
        try {
            if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                return Collections.EMPTY_MAP;
            }
            try {
                Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(this.f89223b, f89221i, null, null, null);
                try {
                    if (cursorQuery == null) {
                        Map map = Collections.EMPTY_MAP;
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        return map;
                    }
                    int count = cursorQuery.getCount();
                    if (count == 0) {
                        Map map2 = Collections.EMPTY_MAP;
                        cursorQuery.close();
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        return map2;
                    }
                    Map e01Var = count <= 256 ? new e01(count) : new HashMap(count, 1.0f);
                    while (cursorQuery.moveToNext()) {
                        e01Var.put(cursorQuery.getString(0), cursorQuery.getString(1));
                    }
                    if (cursorQuery.isAfterLast()) {
                        cursorQuery.close();
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        return e01Var;
                    }
                    Map map3 = Collections.EMPTY_MAP;
                    cursorQuery.close();
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    return map3;
                } catch (Throwable th) {
                    if (cursorQuery == null) {
                        throw th;
                    }
                    try {
                        cursorQuery.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (RemoteException unused) {
                Map map4 = Collections.EMPTY_MAP;
                contentProviderClientAcquireUnstableContentProviderClient.release();
                return map4;
            }
        } catch (Throwable th3) {
            contentProviderClientAcquireUnstableContentProviderClient.release();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m114640e() {
        synchronized (this.f89226e) {
            this.f89227f = null;
            this.f89224c.run();
        }
        synchronized (this) {
            try {
                Iterator<u7x0> it = this.f89228g.iterator();
                while (it.hasNext()) {
                    it.next().zza();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final Map<String, String> m114641f() {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return (Map) r9x0.m178465a(new scx0() { // from class: l.z5x0
                @Override // p149l.scx0
                public final Object zza() {
                    return this.f201871a.m114639c();
                }
            });
        } catch (SQLiteException | IllegalStateException | SecurityException unused) {
            return Collections.EMPTY_MAP;
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    @Override // p149l.qax0
    public final /* synthetic */ Object zza(String str) {
        return m114638a().get(str);
    }
}
