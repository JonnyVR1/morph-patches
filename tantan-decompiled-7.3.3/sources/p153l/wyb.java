package p153l;

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
public class wyb extends v21<Cursor> {

    /* JADX INFO: renamed from: o */
    public final utv<Cursor>.C20672a f191584o;

    /* JADX INFO: renamed from: p */
    public Uri f191585p;

    /* JADX INFO: renamed from: q */
    public String[] f191586q;

    /* JADX INFO: renamed from: r */
    public String f191587r;

    /* JADX INFO: renamed from: s */
    public String[] f191588s;

    /* JADX INFO: renamed from: t */
    public String f191589t;

    /* JADX INFO: renamed from: u */
    public Cursor f191590u;

    /* JADX INFO: renamed from: v */
    public fg4 f191591v;

    public wyb(@NonNull Context context, @NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        super(context);
        this.f191584o = new utv.C20672a();
        this.f191585p = uri;
        this.f191586q = strArr;
        this.f191587r = str;
        this.f191588s = strArr2;
        this.f191589t = str2;
    }

    @Override // p153l.v21
    /* JADX INFO: renamed from: A */
    public void mo198673A() {
        super.mo198673A();
        synchronized (this) {
            try {
                fg4 fg4Var = this.f191591v;
                if (fg4Var != null) {
                    fg4Var.m125475a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p153l.utv
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void mo198090f(Cursor cursor) {
        if (m198095k()) {
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        Cursor cursor2 = this.f191590u;
        this.f191590u = cursor;
        if (m198096l()) {
            super.mo198090f(cursor);
        }
        if (cursor2 == null || cursor2 == cursor || cursor2.isClosed()) {
            return;
        }
        cursor2.close();
    }

    @Override // p153l.v21
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public Cursor mo188605F() {
        synchronized (this) {
            if (m199112E()) {
                throw new OperationCanceledException();
            }
            this.f191591v = new fg4();
        }
        try {
            Cursor cursorM123603b = f26.m123603b(m198093i().getContentResolver(), this.f191585p, this.f191586q, this.f191587r, this.f191588s, this.f191589t, this.f191591v);
            if (cursorM123603b != null) {
                try {
                    cursorM123603b.getCount();
                    cursorM123603b.registerContentObserver(this.f191584o);
                } catch (RuntimeException e) {
                    cursorM123603b.close();
                    throw e;
                }
            }
            synchronized (this) {
                this.f191591v = null;
            }
            return cursorM123603b;
        } catch (Throwable th) {
            synchronized (this) {
                this.f191591v = null;
                throw th;
            }
        }
    }

    @Override // p153l.v21
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void mo198674G(Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        cursor.close();
    }

    @Override // p153l.v21, p153l.utv
    @Deprecated
    /* JADX INFO: renamed from: g */
    public void mo198091g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo198091g(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("mUri=");
        printWriter.println(this.f191585p);
        printWriter.print(str);
        printWriter.print("mProjection=");
        printWriter.println(Arrays.toString(this.f191586q));
        printWriter.print(str);
        printWriter.print("mSelection=");
        printWriter.println(this.f191587r);
        printWriter.print(str);
        printWriter.print("mSelectionArgs=");
        printWriter.println(Arrays.toString(this.f191588s));
        printWriter.print(str);
        printWriter.print("mSortOrder=");
        printWriter.println(this.f191589t);
        printWriter.print(str);
        printWriter.print("mCursor=");
        printWriter.println(this.f191590u);
        printWriter.print(str);
        printWriter.print("mContentChanged=");
        printWriter.println(this.f181003g);
    }

    @Override // p153l.utv
    /* JADX INFO: renamed from: q */
    public void mo198101q() {
        super.mo198101q();
        mo198102s();
        Cursor cursor = this.f191590u;
        if (cursor != null && !cursor.isClosed()) {
            this.f191590u.close();
        }
        this.f191590u = null;
    }

    @Override // p153l.utv
    /* JADX INFO: renamed from: r */
    public void mo188607r() {
        Cursor cursor = this.f191590u;
        if (cursor != null) {
            mo198090f(cursor);
        }
        if (m198108y() || this.f191590u == null) {
            m198092h();
        }
    }

    @Override // p153l.utv
    /* JADX INFO: renamed from: s */
    public void mo198102s() {
        m198086b();
    }
}
