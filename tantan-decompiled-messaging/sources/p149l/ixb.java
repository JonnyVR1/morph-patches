package p149l;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.os.OperationCanceledException;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class ixb extends o21<Cursor> {

    /* JADX INFO: renamed from: o */
    public final trv<Cursor>.C20261a f115344o;

    /* JADX INFO: renamed from: p */
    public Uri f115345p;

    /* JADX INFO: renamed from: q */
    public String[] f115346q;

    /* JADX INFO: renamed from: r */
    public String f115347r;

    /* JADX INFO: renamed from: s */
    public String[] f115348s;

    /* JADX INFO: renamed from: t */
    public String f115349t;

    /* JADX INFO: renamed from: u */
    public Cursor f115350u;

    /* JADX INFO: renamed from: v */
    public gf4 f115351v;

    public ixb(@NonNull Context context, @NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        super(context);
        this.f115344o = new trv.C20261a();
        this.f115345p = uri;
        this.f115346q = strArr;
        this.f115347r = str;
        this.f115348s = strArr2;
        this.f115349t = str2;
    }

    @Override // p149l.o21
    /* JADX INFO: renamed from: A */
    public void mo138794A() {
        super.mo138794A();
        synchronized (this) {
            try {
                gf4 gf4Var = this.f115351v;
                if (gf4Var != null) {
                    gf4Var.m125873a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p149l.trv
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo138800f(Cursor cursor) {
        if (m190456k()) {
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        Cursor cursor2 = this.f115350u;
        this.f115350u = cursor;
        if (m190457l()) {
            super.mo138800f(cursor);
        }
        if (cursor2 == null || cursor2 == cursor || cursor2.isClosed()) {
            return;
        }
        cursor2.close();
    }

    @Override // p149l.o21
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public Cursor mo138795F() {
        synchronized (this) {
            if (m162279E()) {
                throw new OperationCanceledException();
            }
            this.f115351v = new gf4();
        }
        try {
            Cursor cursorM94508b = a16.m94508b(m190454i().getContentResolver(), this.f115345p, this.f115346q, this.f115347r, this.f115348s, this.f115349t, this.f115351v);
            if (cursorM94508b != null) {
                try {
                    cursorM94508b.getCount();
                    cursorM94508b.registerContentObserver(this.f115344o);
                } catch (RuntimeException e) {
                    cursorM94508b.close();
                    throw e;
                }
            }
            synchronized (this) {
                this.f115351v = null;
            }
            return cursorM94508b;
        } catch (Throwable th) {
            synchronized (this) {
                this.f115351v = null;
                throw th;
            }
        }
    }

    @Override // p149l.o21
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void mo138796G(Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        cursor.close();
    }

    @Override // p149l.o21, p149l.trv
    @Deprecated
    /* JADX INFO: renamed from: g */
    public void mo138801g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo138801g(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("mUri=");
        printWriter.println(this.f115345p);
        printWriter.print(str);
        printWriter.print("mProjection=");
        printWriter.println(Arrays.toString(this.f115346q));
        printWriter.print(str);
        printWriter.print("mSelection=");
        printWriter.println(this.f115347r);
        printWriter.print(str);
        printWriter.print("mSelectionArgs=");
        printWriter.println(Arrays.toString(this.f115348s));
        printWriter.print(str);
        printWriter.print("mSortOrder=");
        printWriter.println(this.f115349t);
        printWriter.print(str);
        printWriter.print("mCursor=");
        printWriter.println(this.f115350u);
        printWriter.print(str);
        printWriter.print("mContentChanged=");
        printWriter.println(this.f171870g);
    }

    @Override // p149l.trv
    /* JADX INFO: renamed from: q */
    public void mo138802q() {
        super.mo138802q();
        mo138804s();
        Cursor cursor = this.f115350u;
        if (cursor != null && !cursor.isClosed()) {
            this.f115350u.close();
        }
        this.f115350u = null;
    }

    @Override // p149l.trv
    /* JADX INFO: renamed from: r */
    public void mo138803r() {
        Cursor cursor = this.f115350u;
        if (cursor != null) {
            mo138800f(cursor);
        }
        if (m190465y() || this.f115350u == null) {
            m190453h();
        }
    }

    @Override // p149l.trv
    /* JADX INFO: renamed from: s */
    public void mo138804s() {
        m190449b();
    }
}
