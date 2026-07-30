package p009l;

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
import l.guv;
import l.o21;
import l.trv;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class twm extends o21<Cursor> {

    /* JADX INFO: renamed from: o */
    public final trv<Cursor>.a f20893o;

    /* JADX INFO: renamed from: p */
    public Uri f20894p;

    /* JADX INFO: renamed from: q */
    public String[] f20895q;

    /* JADX INFO: renamed from: r */
    public String f20896r;

    /* JADX INFO: renamed from: s */
    public String[] f20897s;

    /* JADX INFO: renamed from: t */
    public String f20898t;

    /* JADX INFO: renamed from: u */
    public Cursor f20899u;

    /* JADX INFO: renamed from: v */
    public CancellationSignal f20900v;

    /* JADX INFO: renamed from: w */
    public int f20901w;

    /* JADX INFO: renamed from: x */
    public int f20902x;

    public twm(@NonNull Context context, @NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2, int i, int i2) {
        super(context);
        this.f20893o = new trv.a(this);
        this.f20894p = uri;
        this.f20895q = strArr;
        this.f20896r = str;
        this.f20897s = strArr2;
        this.f20898t = str2;
        this.f20902x = i;
        this.f20901w = i2;
    }

    /* JADX INFO: renamed from: A */
    public void m22678A() {
        super.A();
        synchronized (this) {
            try {
                CancellationSignal cancellationSignal = this.f20900v;
                if (cancellationSignal != null) {
                    cancellationSignal.cancel();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public Bundle m22681I(String str, String[] strArr, String str2) {
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
        int i = this.f20902x;
        if (i != 0) {
            bundle.putInt("android:query-arg-limit", i);
        }
        int i2 = this.f20901w;
        if (i2 != 0) {
            bundle.putInt("android:query-arg-offset", i2);
        }
        return bundle;
    }

    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void m22686f(Cursor cursor) {
        if (k()) {
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        Cursor cursor2 = this.f20899u;
        this.f20899u = cursor;
        if (l()) {
            super/*l.trv*/.f(cursor);
        }
        if (cursor2 == null || cursor2 == cursor || cursor2.isClosed()) {
            return;
        }
        cursor2.close();
    }

    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public Cursor m22679F() throws Throwable {
        twm twmVar;
        synchronized (this) {
            try {
                try {
                    if (E()) {
                        throw new OperationCanceledException();
                    }
                    this.f20900v = new CancellationSignal();
                    try {
                        twmVar = this;
                        try {
                            Cursor cursorM22685M = twmVar.m22685M(i().getContentResolver(), this.f20894p, this.f20895q, this.f20896r, this.f20897s, this.f20898t, this.f20900v);
                            if (cursorM22685M != null) {
                                try {
                                    cursorM22685M.getCount();
                                    cursorM22685M.registerContentObserver(twmVar.f20893o);
                                } catch (RuntimeException e) {
                                    cursorM22685M.close();
                                    throw e;
                                }
                            }
                            synchronized (twmVar) {
                                twmVar.f20900v = null;
                            }
                            return cursorM22685M;
                        } catch (Throwable th) {
                            th = th;
                            Throwable th2 = th;
                            synchronized (twmVar) {
                                twmVar.f20900v = null;
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

    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public void m22680G(Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        cursor.close();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.core.os.OperationCanceledException */
    /* JADX INFO: renamed from: M */
    public Cursor m22685M(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) throws Exception {
        if (Build.VERSION.SDK_INT < 26) {
            if (cancellationSignal != null) {
                cancellationSignal.throwIfCanceled();
            }
            return contentResolver.query(uri, strArr, str, strArr2, str2);
        }
        try {
            return guv.a(contentResolver, uri, strArr, m22681I(str, strArr2, str2), cancellationSignal);
        } catch (Exception e) {
            if (e instanceof android.os.OperationCanceledException) {
                throw new OperationCanceledException();
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: q */
    public void m22687q() {
        super/*l.trv*/.q();
        m22689s();
        Cursor cursor = this.f20899u;
        if (cursor != null && !cursor.isClosed()) {
            this.f20899u.close();
        }
        this.f20899u = null;
    }

    /* JADX INFO: renamed from: r */
    public void m22688r() {
        Cursor cursor = this.f20899u;
        if (cursor != null) {
            m22686f(cursor);
        }
        if (y() || this.f20899u == null) {
            h();
        }
    }

    /* JADX INFO: renamed from: s */
    public void m22689s() {
        b();
    }
}
