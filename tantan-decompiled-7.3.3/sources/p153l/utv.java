package p153l;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public class utv<D> {

    /* JADX INFO: renamed from: a */
    public int f180997a;

    /* JADX INFO: renamed from: b */
    public InterfaceC20673b<D> f180998b;

    /* JADX INFO: renamed from: c */
    public Context f180999c;

    /* JADX INFO: renamed from: d */
    public boolean f181000d = false;

    /* JADX INFO: renamed from: e */
    public boolean f181001e = false;

    /* JADX INFO: renamed from: f */
    public boolean f181002f = true;

    /* JADX INFO: renamed from: g */
    public boolean f181003g = false;

    /* JADX INFO: renamed from: h */
    public boolean f181004h = false;

    /* JADX INFO: renamed from: l.utv$a */
    public final class C20672a extends ContentObserver {
        public C20672a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            utv.this.m198099o();
        }
    }

    /* JADX INFO: renamed from: l.utv$b */
    public interface InterfaceC20673b<D> {
        /* JADX INFO: renamed from: a */
        void mo3099a(@NonNull utv<D> utvVar, @Nullable D d);
    }

    public utv(@NonNull Context context) {
        this.f180999c = context.getApplicationContext();
    }

    @MainThread
    /* JADX INFO: renamed from: a */
    public void m198085a() {
        this.f181001e = true;
        m198097m();
    }

    @MainThread
    /* JADX INFO: renamed from: b */
    public boolean m198086b() {
        return mo198098n();
    }

    /* JADX INFO: renamed from: c */
    public void m198087c() {
        this.f181004h = false;
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public String m198088d(@Nullable D d) {
        StringBuilder sb = new StringBuilder(64);
        ohd.m167694a(d, sb);
        sb.append("}");
        return sb.toString();
    }

    @MainThread
    /* JADX INFO: renamed from: f */
    public void mo198090f(@Nullable D d) {
        InterfaceC20673b<D> interfaceC20673b = this.f180998b;
        if (interfaceC20673b != null) {
            interfaceC20673b.mo3099a(this, d);
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: g */
    public void mo198091g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f180997a);
        printWriter.print(" mListener=");
        printWriter.println(this.f180998b);
        if (this.f181000d || this.f181003g || this.f181004h) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f181000d);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f181003g);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f181004h);
        }
        if (this.f181001e || this.f181002f) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f181001e);
            printWriter.print(" mReset=");
            printWriter.println(this.f181002f);
        }
    }

    @MainThread
    /* JADX INFO: renamed from: h */
    public void m198092h() {
        mo198100p();
    }

    @NonNull
    /* JADX INFO: renamed from: i */
    public Context m198093i() {
        return this.f180999c;
    }

    /* JADX INFO: renamed from: j */
    public boolean m198094j() {
        return this.f181001e;
    }

    /* JADX INFO: renamed from: k */
    public boolean m198095k() {
        return this.f181002f;
    }

    /* JADX INFO: renamed from: l */
    public boolean m198096l() {
        return this.f181000d;
    }

    @MainThread
    /* JADX INFO: renamed from: n */
    public boolean mo198098n() {
        throw null;
    }

    @MainThread
    /* JADX INFO: renamed from: o */
    public void m198099o() {
        if (this.f181000d) {
            m198092h();
        } else {
            this.f181003g = true;
        }
    }

    @MainThread
    /* JADX INFO: renamed from: r */
    public void mo188607r() {
        throw null;
    }

    @MainThread
    /* JADX INFO: renamed from: t */
    public void m198103t(int i, @NonNull InterfaceC20673b<D> interfaceC20673b) {
        if (this.f180998b != null) {
            wtq0.m207906a("There is already a listener registered");
        } else {
            this.f180998b = interfaceC20673b;
            this.f180997a = i;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        ohd.m167694a(this, sb);
        sb.append(" id=");
        sb.append(this.f180997a);
        sb.append("}");
        return sb.toString();
    }

    @MainThread
    /* JADX INFO: renamed from: u */
    public void m198104u() {
        mo198101q();
        this.f181002f = true;
        this.f181000d = false;
        this.f181001e = false;
        this.f181003g = false;
        this.f181004h = false;
    }

    /* JADX INFO: renamed from: v */
    public void m198105v() {
        if (this.f181004h) {
            m198099o();
        }
    }

    @MainThread
    /* JADX INFO: renamed from: w */
    public final void m198106w() {
        this.f181000d = true;
        this.f181002f = false;
        this.f181001e = false;
        mo188607r();
    }

    @MainThread
    /* JADX INFO: renamed from: x */
    public void m198107x() {
        this.f181000d = false;
        mo198102s();
    }

    /* JADX INFO: renamed from: y */
    public boolean m198108y() {
        boolean z = this.f181003g;
        this.f181003g = false;
        this.f181004h |= z;
        return z;
    }

    @MainThread
    /* JADX INFO: renamed from: z */
    public void m198109z(@NonNull InterfaceC20673b<D> interfaceC20673b) {
        InterfaceC20673b<D> interfaceC20673b2 = this.f180998b;
        if (interfaceC20673b2 == null) {
            wtq0.m207906a("No listener register");
        } else if (interfaceC20673b2 == interfaceC20673b) {
            this.f180998b = null;
        } else {
            wg3.m206174a("Attempting to unregister the wrong listener");
        }
    }

    @MainThread
    /* JADX INFO: renamed from: e */
    public void m198089e() {
    }

    @MainThread
    /* JADX INFO: renamed from: m */
    public void m198097m() {
    }

    @MainThread
    /* JADX INFO: renamed from: p */
    public void mo198100p() {
    }

    @MainThread
    /* JADX INFO: renamed from: q */
    public void mo198101q() {
    }

    @MainThread
    /* JADX INFO: renamed from: s */
    public void mo198102s() {
    }
}
