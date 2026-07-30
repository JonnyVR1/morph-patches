package p153l;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.os.OperationCanceledException;

/* JADX INFO: loaded from: classes10.dex */
public class uym extends v21<Cursor> {

    /* JADX INFO: renamed from: o */
    public final utv<Cursor>.C20672a f181634o;

    /* JADX INFO: renamed from: p */
    public Uri f181635p;

    /* JADX INFO: renamed from: q */
    public String[] f181636q;

    /* JADX INFO: renamed from: r */
    public String f181637r;

    /* JADX INFO: renamed from: s */
    public String[] f181638s;

    /* JADX INFO: renamed from: t */
    public String f181639t;

    /* JADX INFO: renamed from: u */
    public Cursor f181640u;

    /* JADX INFO: renamed from: v */
    public CancellationSignal f181641v;

    /* JADX INFO: renamed from: w */
    public int f181642w;

    /* JADX INFO: renamed from: x */
    public int f181643x;

    public uym(@NonNull Context context, @NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2, int i, int i2) {
        super(context);
        this.f181634o = new utv.C20672a();
        this.f181635p = uri;
        this.f181636q = strArr;
        this.f181637r = str;
        this.f181638s = strArr2;
        this.f181639t = str2;
        this.f181643x = i;
        this.f181642w = i2;
    }

    @Override // p153l.v21
    /* JADX INFO: renamed from: A */
    public void mo198673A() {
        super.mo198673A();
        synchronized (this) {
            try {
                CancellationSignal cancellationSignal = this.f181641v;
                if (cancellationSignal != null) {
                    cancellationSignal.cancel();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public Bundle m198675I(String str, String[] strArr, String str2) {
        if (str == null && strArr == null && str2 == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        if (str != null) {
            bundle.putString("android:query-arg-sql-selection", str);
        }
        if (strArr != null) {
            bundle.putStringArray("android:query-arg-sql-selection-args", strArr);
        }
        if (str2 != null) {
            bundle.putString("android:query-arg-sql-sort-order", str2);
        }
        int i = this.f181643x;
        if (i != 0) {
            bundle.putInt("android:query-arg-limit", i);
        }
        int i2 = this.f181642w;
        if (i2 != 0) {
            bundle.putInt("android:query-arg-offset", i2);
        }
        return bundle;
    }

    @Override // p153l.utv
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo198090f(Cursor cursor) {
        if (m198095k()) {
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        Cursor cursor2 = this.f181640u;
        this.f181640u = cursor;
        if (m198096l()) {
            super.mo198090f(cursor);
        }
        if (cursor2 == null || cursor2 == cursor || cursor2.isClosed()) {
            return;
        }
        cursor2.close();
    }

    @Override // p153l.v21
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public Cursor mo188605F() throws Throwable {
        uym uymVar;
        synchronized (this) {
            try {
                try {
                    if (m199112E()) {
                        throw new OperationCanceledException();
                    }
                    this.f181641v = new CancellationSignal();
                    try {
                        uymVar = this;
                        try {
                            Cursor cursorM198679M = uymVar.m198679M(m198093i().getContentResolver(), this.f181635p, this.f181636q, this.f181637r, this.f181638s, this.f181639t, this.f181641v);
                            if (cursorM198679M != null) {
                                try {
                                    cursorM198679M.getCount();
                                    cursorM198679M.registerContentObserver(uymVar.f181634o);
                                } catch (RuntimeException e) {
                                    cursorM198679M.close();
                                    throw e;
                                }
                            }
                            synchronized (uymVar) {
                                uymVar.f181641v = null;
                            }
                            return cursorM198679M;
                        } catch (Throwable th) {
                            th = th;
                            Throwable th2 = th;
                            synchronized (uymVar) {
                                uymVar.f181641v = null;
                            }
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        uymVar = this;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    @Override // p153l.v21
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public void mo198674G(Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        cursor.close();
    }

    /* JADX INFO: renamed from: M */
    public Cursor m198679M(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) throws Exception {
        if (Build.VERSION.SDK_INT < 26) {
            if (cancellationSignal != null) {
                cancellationSignal.throwIfCanceled();
            }
            return contentResolver.query(uri, strArr, str, strArr2, str2);
        }
        try {
            return contentResolver.query(uri, strArr, m198675I(str, strArr2, str2), cancellationSignal);
        } catch (Exception e) {
            if (e instanceof android.os.OperationCanceledException) {
                throw new OperationCanceledException();
            }
            throw e;
        }
    }

    @Override // p153l.utv
    /* JADX INFO: renamed from: q */
    public void mo198101q() {
        super.mo198101q();
        mo198102s();
        Cursor cursor = this.f181640u;
        if (cursor != null && !cursor.isClosed()) {
            this.f181640u.close();
        }
        this.f181640u = null;
    }

    @Override // p153l.utv
    /* JADX INFO: renamed from: r */
    public void mo188607r() {
        Cursor cursor = this.f181640u;
        if (cursor != null) {
            mo198090f(cursor);
        }
        if (m198108y() || this.f181640u == null) {
            m198092h();
        }
    }

    @Override // p153l.utv
    /* JADX INFO: renamed from: s */
    public void mo198102s() {
        m198086b();
    }
}
