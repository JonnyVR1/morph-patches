package p149l;

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

/* JADX INFO: loaded from: classes11.dex */
public class twm extends o21<Cursor> {

    /* JADX INFO: renamed from: o */
    public final trv<Cursor>.C20261a f172403o;

    /* JADX INFO: renamed from: p */
    public Uri f172404p;

    /* JADX INFO: renamed from: q */
    public String[] f172405q;

    /* JADX INFO: renamed from: r */
    public String f172406r;

    /* JADX INFO: renamed from: s */
    public String[] f172407s;

    /* JADX INFO: renamed from: t */
    public String f172408t;

    /* JADX INFO: renamed from: u */
    public Cursor f172409u;

    /* JADX INFO: renamed from: v */
    public CancellationSignal f172410v;

    /* JADX INFO: renamed from: w */
    public int f172411w;

    /* JADX INFO: renamed from: x */
    public int f172412x;

    public twm(@NonNull Context context, @NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2, int i, int i2) {
        super(context);
        this.f172403o = new trv.C20261a();
        this.f172404p = uri;
        this.f172405q = strArr;
        this.f172406r = str;
        this.f172407s = strArr2;
        this.f172408t = str2;
        this.f172412x = i;
        this.f172411w = i2;
    }

    @Override // p149l.o21
    /* JADX INFO: renamed from: A */
    public void mo138794A() {
        super.mo138794A();
        synchronized (this) {
            try {
                CancellationSignal cancellationSignal = this.f172410v;
                if (cancellationSignal != null) {
                    cancellationSignal.cancel();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public Bundle m190862I(String str, String[] strArr, String str2) {
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
        int i = this.f172412x;
        if (i != 0) {
            bundle.putInt("android:query-arg-limit", i);
        }
        int i2 = this.f172411w;
        if (i2 != 0) {
            bundle.putInt("android:query-arg-offset", i2);
        }
        return bundle;
    }

    @Override // p149l.trv
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo138800f(Cursor cursor) {
        if (m190456k()) {
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        Cursor cursor2 = this.f172409u;
        this.f172409u = cursor;
        if (m190457l()) {
            super.mo138800f(cursor);
        }
        if (cursor2 == null || cursor2 == cursor || cursor2.isClosed()) {
            return;
        }
        cursor2.close();
    }

    @Override // p149l.o21
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public Cursor mo138795F() throws Throwable {
        twm twmVar;
        synchronized (this) {
            try {
                try {
                    if (m162279E()) {
                        throw new OperationCanceledException();
                    }
                    this.f172410v = new CancellationSignal();
                    try {
                        twmVar = this;
                        try {
                            Cursor cursorM190866M = twmVar.m190866M(m190454i().getContentResolver(), this.f172404p, this.f172405q, this.f172406r, this.f172407s, this.f172408t, this.f172410v);
                            if (cursorM190866M != null) {
                                try {
                                    cursorM190866M.getCount();
                                    cursorM190866M.registerContentObserver(twmVar.f172403o);
                                } catch (RuntimeException e) {
                                    cursorM190866M.close();
                                    throw e;
                                }
                            }
                            synchronized (twmVar) {
                                twmVar.f172410v = null;
                            }
                            return cursorM190866M;
                        } catch (Throwable th) {
                            th = th;
                            Throwable th2 = th;
                            synchronized (twmVar) {
                                twmVar.f172410v = null;
                            }
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        twmVar = this;
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

    @Override // p149l.o21
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public void mo138796G(Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        cursor.close();
    }

    /* JADX INFO: renamed from: M */
    public Cursor m190866M(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) throws Exception {
        if (Build.VERSION.SDK_INT < 26) {
            if (cancellationSignal != null) {
                cancellationSignal.throwIfCanceled();
            }
            return contentResolver.query(uri, strArr, str, strArr2, str2);
        }
        try {
            return contentResolver.query(uri, strArr, m190862I(str, strArr2, str2), cancellationSignal);
        } catch (Exception e) {
            if (e instanceof android.os.OperationCanceledException) {
                throw new OperationCanceledException();
            }
            throw e;
        }
    }

    @Override // p149l.trv
    /* JADX INFO: renamed from: q */
    public void mo138802q() {
        super.mo138802q();
        mo138804s();
        Cursor cursor = this.f172409u;
        if (cursor != null && !cursor.isClosed()) {
            this.f172409u.close();
        }
        this.f172409u = null;
    }

    @Override // p149l.trv
    /* JADX INFO: renamed from: r */
    public void mo138803r() {
        Cursor cursor = this.f172409u;
        if (cursor != null) {
            mo138800f(cursor);
        }
        if (m190465y() || this.f172409u == null) {
            m190453h();
        }
    }

    @Override // p149l.trv
    /* JADX INFO: renamed from: s */
    public void mo138804s() {
        m190449b();
    }
}
