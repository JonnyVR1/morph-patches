package p149l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import com.facebook.drawee.components.DraweeEventTracker;
import p149l.ice;

/* JADX INFO: loaded from: classes.dex */
public class jce<DH extends ice> implements t5m0 {

    /* JADX INFO: renamed from: d */
    public DH f117291d;

    /* JADX INFO: renamed from: a */
    public boolean f117288a = false;

    /* JADX INFO: renamed from: b */
    public boolean f117289b = false;

    /* JADX INFO: renamed from: c */
    public boolean f117290c = true;

    /* JADX INFO: renamed from: e */
    public hce f117292e = null;

    /* JADX INFO: renamed from: f */
    public final DraweeEventTracker f117293f = DraweeEventTracker.m8200a();

    public jce(DH dh) {
        if (dh != null) {
            m140893p(dh);
        }
    }

    /* JADX INFO: renamed from: c */
    public static <DH extends ice> jce<DH> m140878c(DH dh, Context context) {
        jce<DH> jceVar = new jce<>(dh);
        jceVar.m140890m(context);
        return jceVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m140879a() {
        if (this.f117288a) {
            return;
        }
        this.f117293f.m8201b(DraweeEventTracker.Event.ON_ATTACH_CONTROLLER);
        this.f117288a = true;
        hce hceVar = this.f117292e;
        if (hceVar == null || hceVar.getHierarchy() == null) {
            return;
        }
        this.f117292e.mo129599d();
    }

    /* JADX INFO: renamed from: b */
    public final void m140880b() {
        if (this.f117289b && this.f117290c) {
            m140879a();
        } else {
            m140881d();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m140881d() {
        if (this.f117288a) {
            this.f117293f.m8201b(DraweeEventTracker.Event.ON_DETACH_CONTROLLER);
            this.f117288a = false;
            if (m140886i()) {
                this.f117292e.mo129601e();
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public hce m140882e() {
        return this.f117292e;
    }

    /* JADX INFO: renamed from: f */
    public DH m140883f() {
        return (DH) rf80.m179116g(this.f117291d);
    }

    @Override // p149l.t5m0
    /* JADX INFO: renamed from: g */
    public void mo140884g(boolean z) {
        if (this.f117290c == z) {
            return;
        }
        this.f117293f.m8201b(z ? DraweeEventTracker.Event.ON_DRAWABLE_SHOW : DraweeEventTracker.Event.ON_DRAWABLE_HIDE);
        this.f117290c = z;
        m140880b();
    }

    /* JADX INFO: renamed from: h */
    public Drawable m140885h() {
        DH dh = this.f117291d;
        if (dh == null) {
            return null;
        }
        return dh.mo112055b();
    }

    /* JADX INFO: renamed from: i */
    public boolean m140886i() {
        hce hceVar = this.f117292e;
        return hceVar != null && hceVar.getHierarchy() == this.f117291d;
    }

    /* JADX INFO: renamed from: j */
    public void m140887j() {
        this.f117293f.m8201b(DraweeEventTracker.Event.ON_HOLDER_ATTACH);
        this.f117289b = true;
        m140880b();
    }

    /* JADX INFO: renamed from: k */
    public void m140888k() {
        this.f117293f.m8201b(DraweeEventTracker.Event.ON_HOLDER_DETACH);
        this.f117289b = false;
        m140880b();
    }

    /* JADX INFO: renamed from: l */
    public boolean m140889l(MotionEvent motionEvent) {
        if (m140886i()) {
            return this.f117292e.mo129596b(motionEvent);
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    public void m140891n() {
        m140892o(null);
    }

    /* JADX INFO: renamed from: o */
    public void m140892o(hce hceVar) {
        boolean z = this.f117288a;
        if (z) {
            m140881d();
        }
        if (m140886i()) {
            this.f117293f.m8201b(DraweeEventTracker.Event.ON_CLEAR_OLD_CONTROLLER);
            this.f117292e.mo116629c(null);
        }
        this.f117292e = hceVar;
        DraweeEventTracker draweeEventTracker = this.f117293f;
        if (hceVar != null) {
            draweeEventTracker.m8201b(DraweeEventTracker.Event.ON_SET_CONTROLLER);
            this.f117292e.mo116629c(this.f117291d);
        } else {
            draweeEventTracker.m8201b(DraweeEventTracker.Event.ON_CLEAR_CONTROLLER);
        }
        if (z) {
            m140879a();
        }
    }

    @Override // p149l.t5m0
    public void onDraw() {
        if (this.f117288a) {
            return;
        }
        tsf.m190557w(DraweeEventTracker.class, "%x: Draw requested for a non-attached controller %x. %s", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.f117292e)), toString());
        this.f117289b = true;
        this.f117290c = true;
        m140880b();
    }

    /* JADX INFO: renamed from: p */
    public void m140893p(DH dh) {
        this.f117293f.m8201b(DraweeEventTracker.Event.ON_SET_HIERARCHY);
        boolean zM140886i = m140886i();
        m140894q(null);
        DH dh2 = (DH) rf80.m179116g(dh);
        this.f117291d = dh2;
        Drawable drawableMo112055b = dh2.mo112055b();
        mo140884g(drawableMo112055b == null || drawableMo112055b.isVisible());
        m140894q(this);
        if (zM140886i) {
            this.f117292e.mo116629c(dh);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m140894q(t5m0 t5m0Var) {
        Object objM140885h = m140885h();
        if (objM140885h instanceof s5m0) {
            ((s5m0) objM140885h).mo135667d(t5m0Var);
        }
    }

    public String toString() {
        return t050.m186815b(this).m186818c("controllerAttached", this.f117288a).m186818c("holderAttached", this.f117289b).m186818c("drawableVisible", this.f117290c).m186817b("events", this.f117293f.toString()).toString();
    }

    /* JADX INFO: renamed from: m */
    public void m140890m(Context context) {
    }
}
