package p153l;

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
public final class kcx0 implements wjx0 {

    /* JADX INFO: renamed from: h */
    @GuardedBy("ConfigurationContentLoader.class")
    public static final Map<Uri, kcx0> f125109h = new l01();

    /* JADX INFO: renamed from: i */
    public static final String[] f125110i = {Constants.KEY_KEY, "value"};

    /* JADX INFO: renamed from: a */
    public final ContentResolver f125111a;

    /* JADX INFO: renamed from: b */
    public final Uri f125112b;

    /* JADX INFO: renamed from: c */
    public final Runnable f125113c;

    /* JADX INFO: renamed from: d */
    public final ContentObserver f125114d;

    /* JADX INFO: renamed from: e */
    public final Object f125115e;

    /* JADX INFO: renamed from: f */
    public volatile Map<String, String> f125116f;

    /* JADX INFO: renamed from: g */
    @GuardedBy("this")
    public final List<ahx0> f125117g;

    public kcx0(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        bex0 bex0Var = new bex0(this, null);
        this.f125114d = bex0Var;
        this.f125115e = new Object();
        this.f125117g = new ArrayList();
        xn80.m212111p(contentResolver);
        xn80.m212111p(uri);
        this.f125111a = contentResolver;
        this.f125112b = uri;
        this.f125113c = runnable;
        contentResolver.registerContentObserver(uri, false, bex0Var);
    }

    /* JADX INFO: renamed from: b */
    public static kcx0 m149134b(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        kcx0 kcx0Var;
        synchronized (kcx0.class) {
            Map<Uri, kcx0> map = f125109h;
            kcx0Var = map.get(uri);
            if (kcx0Var == null) {
                try {
                    kcx0 kcx0Var2 = new kcx0(contentResolver, uri, runnable);
                    try {
                        map.put(uri, kcx0Var2);
                    } catch (SecurityException unused) {
                    }
                    kcx0Var = kcx0Var2;
                } catch (SecurityException unused2) {
                }
            }
        }
        return kcx0Var;
    }

    /* JADX INFO: renamed from: d */
    public static synchronized void m149135d() {
        try {
            for (kcx0 kcx0Var : f125109h.values()) {
                kcx0Var.f125111a.unregisterContentObserver(kcx0Var.f125114d);
            }
            f125109h.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public final Map<String, String> m149136a() {
        Map<String, String> mapM149139f = this.f125116f;
        if (mapM149139f == null) {
            synchronized (this.f125115e) {
                try {
                    mapM149139f = this.f125116f;
                    if (mapM149139f == null) {
                        mapM149139f = m149139f();
                        this.f125116f = mapM149139f;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return mapM149139f != null ? mapM149139f : Collections.EMPTY_MAP;
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Map m149137c() {
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = this.f125111a.acquireUnstableContentProviderClient(this.f125112b);
        try {
            if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                return Collections.EMPTY_MAP;
            }
            try {
                Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(this.f125112b, f125110i, null, null, null);
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
                    Map l01Var = count <= 256 ? new l01(count) : new HashMap(count, 1.0f);
                    while (cursorQuery.moveToNext()) {
                        l01Var.put(cursorQuery.getString(0), cursorQuery.getString(1));
                    }
                    if (cursorQuery.isAfterLast()) {
                        cursorQuery.close();
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        return l01Var;
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
    public final void m149138e() {
        synchronized (this.f125115e) {
            this.f125116f = null;
            this.f125113c.run();
        }
        synchronized (this) {
            try {
                Iterator<ahx0> it = this.f125117g.iterator();
                while (it.hasNext()) {
                    it.next().zza();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final Map<String, String> m149139f() {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return (Map) xix0.m211178a(new ylx0() { // from class: l.ffx0
                @Override // p153l.ylx0
                public final Object zza() {
                    return this.f98846a.m149137c();
                }
            });
        } catch (SQLiteException | IllegalStateException | SecurityException unused) {
            return Collections.EMPTY_MAP;
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    @Override // p153l.wjx0
    public final /* synthetic */ Object zza(String str) {
        return m149136a().get(str);
    }
}
