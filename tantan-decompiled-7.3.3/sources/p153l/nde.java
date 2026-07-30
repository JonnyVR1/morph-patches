package p153l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import com.facebook.drawee.components.DraweeEventTracker;
import p153l.mde;

/* JADX INFO: loaded from: classes.dex */
public class nde<DH extends mde> implements xem0 {

    /* JADX INFO: renamed from: d */
    public DH f141483d;

    /* JADX INFO: renamed from: a */
    public boolean f141480a = false;

    /* JADX INFO: renamed from: b */
    public boolean f141481b = false;

    /* JADX INFO: renamed from: c */
    public boolean f141482c = true;

    /* JADX INFO: renamed from: e */
    public lde f141484e = null;

    /* JADX INFO: renamed from: f */
    public final DraweeEventTracker f141485f = DraweeEventTracker.m8254a();

    public nde(DH dh) {
        if (dh != null) {
            m162695p(dh);
        }
    }

    /* JADX INFO: renamed from: c */
    public static <DH extends mde> nde<DH> m162681c(DH dh, Context context) {
        nde<DH> ndeVar = new nde<>(dh);
        ndeVar.m162692m(context);
        return ndeVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m162682a() {
        if (this.f141480a) {
            return;
        }
        this.f141485f.m8255b(DraweeEventTracker.Event.ON_ATTACH_CONTROLLER);
        this.f141480a = true;
        lde ldeVar = this.f141484e;
        if (ldeVar == null || ldeVar.getHierarchy() == null) {
            return;
        }
        this.f141484e.mo108236d();
    }

    /* JADX INFO: renamed from: b */
    public final void m162683b() {
        if (this.f141481b && this.f141482c) {
            m162682a();
        } else {
            m162684d();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m162684d() {
        if (this.f141480a) {
            this.f141485f.m8255b(DraweeEventTracker.Event.ON_DETACH_CONTROLLER);
            this.f141480a = false;
            if (m162688i()) {
                this.f141484e.mo108238e();
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public lde m162685e() {
        return this.f141484e;
    }

    /* JADX INFO: renamed from: f */
    public DH m162686f() {
        return (DH) wn80.m207182g(this.f141483d);
    }

    @Override // p153l.xem0
    /* JADX INFO: renamed from: g */
    public void mo158587g(boolean z) {
        if (this.f141482c == z) {
            return;
        }
        this.f141485f.m8255b(z ? DraweeEventTracker.Event.ON_DRAWABLE_SHOW : DraweeEventTracker.Event.ON_DRAWABLE_HIDE);
        this.f141482c = z;
        m162683b();
    }

    /* JADX INFO: renamed from: h */
    public Drawable m162687h() {
        DH dh = this.f141483d;
        if (dh == null) {
            return null;
        }
        return dh.mo157973b();
    }

    /* JADX INFO: renamed from: i */
    public boolean m162688i() {
        lde ldeVar = this.f141484e;
        return ldeVar != null && ldeVar.getHierarchy() == this.f141483d;
    }

    /* JADX INFO: renamed from: j */
    public void m162689j() {
        this.f141485f.m8255b(DraweeEventTracker.Event.ON_HOLDER_ATTACH);
        this.f141481b = true;
        m162683b();
    }

    /* JADX INFO: renamed from: k */
    public void m162690k() {
        this.f141485f.m8255b(DraweeEventTracker.Event.ON_HOLDER_DETACH);
        this.f141481b = false;
        m162683b();
    }

    /* JADX INFO: renamed from: l */
    public boolean m162691l(MotionEvent motionEvent) {
        if (m162688i()) {
            return this.f141484e.mo108232b(motionEvent);
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    public void m162693n() {
        m162694o(null);
    }

    /* JADX INFO: renamed from: o */
    public void m162694o(lde ldeVar) {
        boolean z = this.f141480a;
        if (z) {
            m162684d();
        }
        if (m162688i()) {
            this.f141485f.m8255b(DraweeEventTracker.Event.ON_CLEAR_OLD_CONTROLLER);
            this.f141484e.mo108234c(null);
        }
        this.f141484e = ldeVar;
        DraweeEventTracker draweeEventTracker = this.f141485f;
        if (ldeVar != null) {
            draweeEventTracker.m8255b(DraweeEventTracker.Event.ON_SET_CONTROLLER);
            this.f141484e.mo108234c(this.f141483d);
        } else {
            draweeEventTracker.m8255b(DraweeEventTracker.Event.ON_CLEAR_CONTROLLER);
        }
        if (z) {
            m162682a();
        }
    }

    @Override // p153l.xem0
    public void onDraw() {
        if (this.f141480a) {
            return;
        }
        huf.m137195w(DraweeEventTracker.class, "%x: Draw requested for a non-attached controller %x. %s", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.f141484e)), toString());
        this.f141481b = true;
        this.f141482c = true;
        m162683b();
    }

    /* JADX INFO: renamed from: p */
    public void m162695p(DH dh) {
        this.f141485f.m8255b(DraweeEventTracker.Event.ON_SET_HIERARCHY);
        boolean zM162688i = m162688i();
        m162696q(null);
        DH dh2 = (DH) wn80.m207182g(dh);
        this.f141483d = dh2;
        Drawable drawableMo157973b = dh2.mo157973b();
        mo158587g(drawableMo157973b == null || drawableMo157973b.isVisible());
        m162696q(this);
        if (zM162688i) {
            this.f141484e.mo108234c(dh);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m162696q(xem0 xem0Var) {
        Object objM162687h = m162687h();
        if (objM162687h instanceof wem0) {
            ((wem0) objM162687h).mo150429d(xem0Var);
        }
    }

    public String toString() {
        return i950.m139075b(this).m139078c("controllerAttached", this.f141480a).m139078c("holderAttached", this.f141481b).m139078c("drawableVisible", this.f141482c).m139077b("events", this.f141485f.toString()).toString();
    }

    /* JADX INFO: renamed from: m */
    public void m162692m(Context context) {
    }
}
