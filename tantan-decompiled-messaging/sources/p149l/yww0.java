package p149l;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.measurement.zzgt;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class yww0 implements czw0 {
    @Override // p149l.czw0
    @Nullable
    /* JADX INFO: renamed from: a */
    public final String mo109444a(ContentResolver contentResolver, String str) throws zzgt {
        Uri uri = upw0.f177680a;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        try {
            if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                throw new zzgt("Unable to acquire ContentProviderClient");
            }
            try {
                Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, null, null, new String[]{str}, null);
                try {
                    if (cursorQuery == null) {
                        throw new zzgt("ContentProvider query returned null cursor");
                    }
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        return null;
                    }
                    String string = cursorQuery.getString(1);
                    cursorQuery.close();
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    return string;
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
            } catch (RemoteException e) {
                throw new zzgt("ContentProvider query failed", e);
            }
        } catch (Throwable th3) {
            contentProviderClientAcquireUnstableContentProviderClient.release();
            throw th3;
        }
    }

    @Override // p149l.czw0
    /* JADX INFO: renamed from: b */
    public final <T extends Map<String, String>> T mo109445b(ContentResolver contentResolver, String[] strArr, h0x0<T> h0x0Var) throws zzgt {
        Uri uri = upw0.f177681b;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        if (contentProviderClientAcquireUnstableContentProviderClient == null) {
            throw new zzgt("Unable to acquire ContentProviderClient");
        }
        try {
            try {
                Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, null, null, strArr, null);
                try {
                    if (cursorQuery == null) {
                        throw new zzgt("ContentProvider query returned null cursor");
                    }
                    T t = (T) h0x0Var.zza(cursorQuery.getCount());
                    while (cursorQuery.moveToNext()) {
                        t.put(cursorQuery.getString(0), cursorQuery.getString(1));
                    }
                    if (!cursorQuery.isAfterLast()) {
                        throw new zzgt("Cursor read incomplete (ContentProvider dead?)");
                    }
                    cursorQuery.close();
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    return t;
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
            } catch (RemoteException e) {
                throw new zzgt("ContentProvider query failed", e);
            }
        } catch (Throwable th3) {
            contentProviderClientAcquireUnstableContentProviderClient.release();
            throw th3;
        }
    }
}
