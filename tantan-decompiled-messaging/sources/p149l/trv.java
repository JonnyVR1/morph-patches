package p149l;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public class trv<D> {

    /* JADX INFO: renamed from: a */
    public int f171864a;

    /* JADX INFO: renamed from: b */
    public InterfaceC20262b<D> f171865b;

    /* JADX INFO: renamed from: c */
    public Context f171866c;

    /* JADX INFO: renamed from: d */
    public boolean f171867d = false;

    /* JADX INFO: renamed from: e */
    public boolean f171868e = false;

    /* JADX INFO: renamed from: f */
    public boolean f171869f = true;

    /* JADX INFO: renamed from: g */
    public boolean f171870g = false;

    /* JADX INFO: renamed from: h */
    public boolean f171871h = false;

    /* JADX INFO: renamed from: l.trv$a */
    public final class C20261a extends ContentObserver {
        public C20261a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            trv.this.m190459o();
        }
    }

    /* JADX INFO: renamed from: l.trv$b */
    public interface InterfaceC20262b<D> {
        /* JADX INFO: renamed from: a */
        void mo3098a(@NonNull trv<D> trvVar, @Nullable D d);
    }

    public trv(@NonNull Context context) {
        this.f171866c = context.getApplicationContext();
    }

    @MainThread
    /* JADX INFO: renamed from: a */
    public void m190448a() {
        this.f171868e = true;
        m190458m();
    }

    @MainThread
    /* JADX INFO: renamed from: b */
    public boolean m190449b() {
        return mo162281n();
    }

    /* JADX INFO: renamed from: c */
    public void m190450c() {
        this.f171871h = false;
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public String m190451d(@Nullable D d) {
        StringBuilder sb = new StringBuilder(64);
        igd.m135980a(d, sb);
        sb.append("}");
        return sb.toString();
    }

    @MainThread
    /* JADX INFO: renamed from: f */
    public void mo138800f(@Nullable D d) {
        InterfaceC20262b<D> interfaceC20262b = this.f171865b;
        if (interfaceC20262b != null) {
            interfaceC20262b.mo3098a(this, d);
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: g */
    public void mo138801g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f171864a);
        printWriter.print(" mListener=");
        printWriter.println(this.f171865b);
        if (this.f171867d || this.f171870g || this.f171871h) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f171867d);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f171870g);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f171871h);
        }
        if (this.f171868e || this.f171869f) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f171868e);
            printWriter.print(" mReset=");
            printWriter.println(this.f171869f);
        }
    }

    @MainThread
    /* JADX INFO: renamed from: h */
    public void m190453h() {
        mo162282p();
    }

    @NonNull
    /* JADX INFO: renamed from: i */
    public Context m190454i() {
        return this.f171866c;
    }

    /* JADX INFO: renamed from: j */
    public boolean m190455j() {
        return this.f171868e;
    }

    /* JADX INFO: renamed from: k */
    public boolean m190456k() {
        return this.f171869f;
    }

    /* JADX INFO: renamed from: l */
    public boolean m190457l() {
        return this.f171867d;
    }

    @MainThread
    /* JADX INFO: renamed from: n */
    public boolean mo162281n() {
        throw null;
    }

    @MainThread
    /* JADX INFO: renamed from: o */
    public void m190459o() {
        if (this.f171867d) {
            m190453h();
        } else {
            this.f171870g = true;
        }
    }

    @MainThread
    /* JADX INFO: renamed from: r */
    public void mo138803r() {
        throw null;
    }

    @MainThread
    /* JADX INFO: renamed from: t */
    public void m190460t(int i, @NonNull InterfaceC20262b<D> interfaceC20262b) {
        if (this.f171865b != null) {
            qkq0.m175383a("There is already a listener registered");
        } else {
            this.f171865b = interfaceC20262b;
            this.f171864a = i;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        igd.m135980a(this, sb);
        sb.append(" id=");
        sb.append(this.f171864a);
        sb.append("}");
        return sb.toString();
    }

    @MainThread
    /* JADX INFO: renamed from: u */
    public void m190461u() {
        mo138802q();
        this.f171869f = true;
        this.f171867d = false;
        this.f171868e = false;
        this.f171870g = false;
        this.f171871h = false;
    }

    /* JADX INFO: renamed from: v */
    public void m190462v() {
        if (this.f171871h) {
            m190459o();
        }
    }

    @MainThread
    /* JADX INFO: renamed from: w */
    public final void m190463w() {
        this.f171867d = true;
        this.f171869f = false;
        this.f171868e = false;
        mo138803r();
    }

    @MainThread
    /* JADX INFO: renamed from: x */
    public void m190464x() {
        this.f171867d = false;
        mo138804s();
    }

    /* JADX INFO: renamed from: y */
    public boolean m190465y() {
        boolean z = this.f171870g;
        this.f171870g = false;
        this.f171871h |= z;
        return z;
    }

    @MainThread
    /* JADX INFO: renamed from: z */
    public void m190466z(@NonNull InterfaceC20262b<D> interfaceC20262b) {
        InterfaceC20262b<D> interfaceC20262b2 = this.f171865b;
        if (interfaceC20262b2 == null) {
            qkq0.m175383a("No listener register");
        } else if (interfaceC20262b2 == interfaceC20262b) {
            this.f171865b = null;
        } else {
            ig3.m135964a("Attempting to unregister the wrong listener");
        }
    }

    @MainThread
    /* JADX INFO: renamed from: e */
    public void m190452e() {
    }

    @MainThread
    /* JADX INFO: renamed from: m */
    public void m190458m() {
    }

    @MainThread
    /* JADX INFO: renamed from: p */
    public void mo162282p() {
    }

    @MainThread
    /* JADX INFO: renamed from: q */
    public void mo138802q() {
    }

    @MainThread
    /* JADX INFO: renamed from: s */
    public void mo138804s() {
    }
}
