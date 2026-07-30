package p149l;

import android.graphics.Path;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.animation.PathInterpolator;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.anim.ExpandedCardClipStatus;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class cmf implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: s */
    public static PathInterpolator f81531s = new PathInterpolator(0.0f, 0.0f, 0.28f, 1.0f);

    /* JADX INFO: renamed from: a */
    public dmf f81532a;

    /* JADX INFO: renamed from: d */
    public InterfaceC16195b f81535d;

    /* JADX INFO: renamed from: l */
    public HashMap<ExpandedCardClipStatus, C16194a> f81543l;

    /* JADX INFO: renamed from: r */
    public k95 f81549r;

    /* JADX INFO: renamed from: m */
    public ExpandedCardClipStatus f81544m = ExpandedCardClipStatus.UNKNOWN;

    /* JADX INFO: renamed from: n */
    public ExpandedCardClipStatus f81545n = null;

    /* JADX INFO: renamed from: o */
    public boolean f81546o = false;

    /* JADX INFO: renamed from: p */
    public float f81547p = 0.0f;

    /* JADX INFO: renamed from: q */
    public float f81548q = 1.5f;

    /* JADX INFO: renamed from: b */
    public C16194a f81533b = new C16194a();

    /* JADX INFO: renamed from: c */
    public C16194a f81534c = new C16194a();

    /* JADX INFO: renamed from: e */
    public C16194a f81536e = new C16194a();

    /* JADX INFO: renamed from: f */
    public C16194a f81537f = new C16194a();

    /* JADX INFO: renamed from: g */
    public C16194a f81538g = new C16194a();

    /* JADX INFO: renamed from: h */
    public C16194a f81539h = new C16194a();

    /* JADX INFO: renamed from: i */
    public C16194a f81540i = new C16194a();

    /* JADX INFO: renamed from: j */
    public C16194a f81541j = new C16194a();

    /* JADX INFO: renamed from: k */
    public C16194a f81542k = new C16194a();

    /* JADX INFO: renamed from: l.cmf$a */
    public static class C16194a {

        /* JADX INFO: renamed from: a */
        public float f81550a;

        /* JADX INFO: renamed from: b */
        public float f81551b;

        /* JADX INFO: renamed from: c */
        public float f81552c;

        /* JADX INFO: renamed from: d */
        public float f81553d;

        /* JADX INFO: renamed from: e */
        public float f81554e;

        /* JADX INFO: renamed from: f */
        public float f81555f;

        /* JADX INFO: renamed from: g */
        public float[] f81556g = new float[8];

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C16194a clone() {
            C16194a c16194a = new C16194a();
            m107627b(c16194a);
            return c16194a;
        }

        /* JADX INFO: renamed from: b */
        public void m107627b(C16194a c16194a) {
            c16194a.f81550a = this.f81550a;
            c16194a.f81551b = this.f81551b;
            c16194a.f81552c = this.f81552c;
            c16194a.f81553d = this.f81553d;
            c16194a.f81554e = this.f81554e;
            c16194a.f81555f = this.f81555f;
        }

        /* JADX INFO: renamed from: c */
        public void m107628c(float f, float f2, float f3, float f4, float f5, float f6) {
            this.f81550a = f;
            this.f81551b = f2;
            this.f81552c = f3;
            this.f81553d = f4;
            this.f81554e = f5;
            this.f81555f = f6;
        }

        public String toString() {
            return "l:" + this.f81550a + "|t:" + this.f81551b + "|r:" + this.f81552c + "|cb" + this.f81553d + "|tr:" + this.f81554e + "|br:" + this.f81555f;
        }
    }

    /* JADX INFO: renamed from: l.cmf$b */
    public interface InterfaceC16195b {
        /* JADX INFO: renamed from: u */
        void mo37947u(ExpandedCardClipStatus expandedCardClipStatus, float f);
    }

    public cmf(dmf dmfVar, InterfaceC16195b interfaceC16195b) {
        this.f81532a = dmfVar;
        HashMap<ExpandedCardClipStatus, C16194a> map = new HashMap<>();
        this.f81543l = map;
        map.put(ExpandedCardClipStatus.EXPANDED_CARD, this.f81536e);
        this.f81543l.put(ExpandedCardClipStatus.EXPANDED_PROFILE, this.f81537f);
        this.f81543l.put(ExpandedCardClipStatus.SWIPE_CLIP, this.f81538g);
        this.f81543l.put(ExpandedCardClipStatus.SWIPE_CLIP_PROFILE, this.f81539h);
        this.f81543l.put(ExpandedCardClipStatus.SCROLL_CLIP, this.f81540i);
        this.f81543l.put(ExpandedCardClipStatus.SWIPE_CLIP_ANCHOR, this.f81541j);
        this.f81543l.put(ExpandedCardClipStatus.FLING_CLIP, this.f81542k);
        this.f81549r = new k95();
        this.f81535d = interfaceC16195b;
    }

    /* JADX INFO: renamed from: a */
    public final void m107616a() {
        int i = 0;
        while (i < 8) {
            C16194a c16194a = this.f81533b;
            c16194a.f81556g[i] = i < 4 ? c16194a.f81554e : c16194a.f81555f;
            i++;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m107617b(float f, ExpandedCardClipStatus expandedCardClipStatus, C16194a c16194a, float f2, String str) {
        C16194a c16194a2;
        Choreographer.getInstance().removeFrameCallback(this);
        float fMin = Math.min(1.0f, f);
        if (expandedCardClipStatus == ExpandedCardClipStatus.EXPANDED_CARD) {
            c16194a2 = this.f81536e;
        } else if (expandedCardClipStatus == ExpandedCardClipStatus.SWIPE_CLIP) {
            c16194a2 = this.f81538g;
        } else if (expandedCardClipStatus == ExpandedCardClipStatus.SCROLL_CLIP) {
            c16194a2 = this.f81540i;
        } else if (expandedCardClipStatus == ExpandedCardClipStatus.FLING_CLIP) {
            c16194a2 = this.f81542k;
        } else {
            ExpandedCardClipStatus expandedCardClipStatus2 = this.f81544m;
            if (expandedCardClipStatus2 == ExpandedCardClipStatus.SWIPE_CLIP_PROFILE) {
                c16194a2 = this.f81539h;
            } else {
                c16194a2 = expandedCardClipStatus2 == ExpandedCardClipStatus.EXPANDED_PROFILE ? this.f81537f : null;
            }
        }
        if (c16194a2 == null) {
            return;
        }
        this.f81544m = expandedCardClipStatus;
        C16194a c16194a3 = this.f81533b;
        float f3 = c16194a.f81550a;
        float f4 = ((c16194a2.f81550a - f3) * fMin) + f3;
        float f5 = c16194a.f81551b;
        float f6 = fMin * 1.0f;
        float fMin2 = ((c16194a2.f81551b - f5) * Math.min(1.0f, f6)) + f5;
        float f7 = c16194a.f81552c;
        float f8 = f7 + ((c16194a2.f81552c - f7) * fMin);
        float f9 = c16194a.f81553d;
        float fMin3 = f9 + ((c16194a2.f81553d - f9) * Math.min(1.0f, f6));
        float f10 = c16194a.f81554e;
        float f11 = f2 * fMin;
        float fMin4 = ((c16194a2.f81554e - f10) * Math.min(1.0f, f11)) + f10;
        float f12 = c16194a.f81555f;
        c16194a3.m107628c(f4, fMin2, f8, fMin3, fMin4, f12 + ((c16194a2.f81555f - f12) * Math.min(1.0f, f11)));
        InterfaceC16195b interfaceC16195b = this.f81535d;
        if (interfaceC16195b != null) {
            interfaceC16195b.mo37947u(this.f81544m, fMin);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m107618c(C16194a c16194a) {
        this.f81533b.m107627b(c16194a);
    }

    /* JADX INFO: renamed from: d */
    public boolean m107619d() {
        C16194a c16194a = this.f81533b;
        return c16194a.f81554e > 0.0f || c16194a.f81555f > 0.0f || c16194a.f81551b > 0.0f;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        k95 k95Var = this.f81549r;
        if (jElapsedRealtime >= k95Var.f121908b) {
            this.f81547p = 1.0f;
            m107623h();
            return;
        }
        float f = (jElapsedRealtime - k95Var.f121907a) / k95Var.f121909c;
        this.f81547p = f;
        this.f81547p = f81531s.getInterpolation(f);
        m107623h();
        Choreographer.getInstance().postFrameCallback(this);
    }

    /* JADX INFO: renamed from: e */
    public void m107620e(Path path) {
        m107616a();
        C16194a c16194a = this.f81533b;
        path.addRoundRect(c16194a.f81550a, c16194a.f81551b, c16194a.f81552c, c16194a.f81553d, c16194a.f81556g, Path.Direction.CW);
    }

    /* JADX INFO: renamed from: f */
    public C16194a m107621f(ExpandedCardClipStatus expandedCardClipStatus) {
        return this.f81543l.get(expandedCardClipStatus);
    }

    /* JADX INFO: renamed from: g */
    public void m107622g(int i, int i2) {
        this.f81532a.m112467a(i, i2);
        float f = i2;
        this.f81536e.m107628c(0.0f, 0.0f, i, f, 0.0f, 0.0f);
        C16194a c16194a = this.f81538g;
        dmf dmfVar = this.f81532a;
        c16194a.m107628c(dmfVar.f86929a, dmfVar.f86930b, i - dmfVar.f86931c, i2 - dmfVar.f86932d, dmfVar.f86934f, dmfVar.f86935g);
        if (upa.m194675N3()) {
            C16194a c16194a2 = this.f81536e;
            dmf dmfVar2 = this.f81532a;
            c16194a2.m107628c(dmfVar2.f86929a, 0.0f, i - dmfVar2.f86931c, i2 - t100.m186890d(100.0f), 0.0f, this.f81532a.f86935g);
            C16194a c16194a3 = this.f81537f;
            dmf dmfVar3 = this.f81532a;
            c16194a3.m107628c(dmfVar3.f86929a, 0.0f, i - dmfVar3.f86931c, f, 0.0f, 0.0f);
            C16194a c16194a4 = this.f81538g;
            dmf dmfVar4 = this.f81532a;
            float f2 = dmfVar4.f86929a;
            float f3 = dmfVar4.f86930b;
            float f4 = i - dmfVar4.f86931c;
            float fM186890d = i2 - t100.m186890d(100.0f);
            dmf dmfVar5 = this.f81532a;
            c16194a4.m107628c(f2, f3, f4, fM186890d, dmfVar5.f86934f, dmfVar5.f86935g);
            C16194a c16194a5 = this.f81539h;
            dmf dmfVar6 = this.f81532a;
            c16194a5.m107628c(dmfVar6.f86929a, dmfVar6.f86930b, i - dmfVar6.f86931c, i2 - dmfVar6.f86932d, dmfVar6.f86934f, dmfVar6.f86935g);
        }
        C16194a c16194a6 = this.f81540i;
        dmf dmfVar7 = this.f81532a;
        c16194a6.m107628c(dmfVar7.f86929a, dmfVar7.f86930b + dmfVar7.f86933e, i - dmfVar7.f86931c, f, dmfVar7.f86934f, 0.0f);
        C16194a c16194a7 = this.f81541j;
        dmf dmfVar8 = this.f81532a;
        c16194a7.m107628c(dmfVar8.f86929a, dmfVar8.f86930b, i - dmfVar8.f86931c, f, dmfVar8.f86934f, 0.0f);
        C16194a c16194a8 = this.f81540i;
        dmf dmfVar9 = this.f81532a;
        c16194a8.m107628c(dmfVar9.f86929a, dmfVar9.f86930b + dmfVar9.f86933e, i - dmfVar9.f86931c, f, dmfVar9.f86934f, 0.0f);
        C16194a c16194a9 = this.f81542k;
        float f5 = i / 2;
        dmf dmfVar10 = this.f81532a;
        float f6 = dmfVar10.f86934f;
        float f7 = i2 / 2;
        c16194a9.m107628c(f5 - (f6 * 1.5f), f7 - (f6 * 1.5f), f5 + (f6 * 1.5f), f7 + (f6 * 1.5f), f6 * 1.5f, dmfVar10.f86935g * 1.5f);
        if (this.f81544m == ExpandedCardClipStatus.UNKNOWN) {
            ExpandedCardClipStatus expandedCardClipStatus = this.f81545n;
            if (expandedCardClipStatus != null) {
                m107625j(expandedCardClipStatus, this.f81546o, true, true);
                return;
            }
            this.f81544m = ExpandedCardClipStatus.EXPANDED_CARD;
            this.f81536e.m107627b(this.f81534c);
            this.f81536e.m107627b(this.f81533b);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m107623h() {
        C16194a c16194a;
        ExpandedCardClipStatus expandedCardClipStatus = this.f81544m;
        if (expandedCardClipStatus == ExpandedCardClipStatus.EXPANDED_CARD) {
            c16194a = this.f81536e;
        } else if (expandedCardClipStatus == ExpandedCardClipStatus.EXPANDED_PROFILE) {
            c16194a = this.f81537f;
        } else if (expandedCardClipStatus == ExpandedCardClipStatus.SWIPE_CLIP) {
            c16194a = this.f81538g;
        } else if (expandedCardClipStatus == ExpandedCardClipStatus.SWIPE_CLIP_PROFILE) {
            c16194a = this.f81539h;
        } else if (expandedCardClipStatus == ExpandedCardClipStatus.SCROLL_CLIP) {
            c16194a = this.f81540i;
        } else {
            c16194a = expandedCardClipStatus == ExpandedCardClipStatus.FLING_CLIP ? this.f81542k : null;
        }
        if (c16194a == null) {
            return;
        }
        C16194a c16194a2 = this.f81533b;
        C16194a c16194a3 = this.f81534c;
        float f = c16194a3.f81550a;
        float f2 = c16194a.f81550a - f;
        float f3 = this.f81547p;
        float f4 = f + (f2 * f3);
        float f5 = c16194a3.f81551b;
        float fMin = f5 + ((c16194a.f81551b - f5) * Math.min(1.0f, f3 * this.f81548q));
        C16194a c16194a4 = this.f81534c;
        float f6 = c16194a4.f81552c;
        float f7 = c16194a.f81552c - f6;
        float f8 = this.f81547p;
        float f9 = f6 + (f7 * f8);
        float f10 = c16194a4.f81553d;
        float fMin2 = f10 + ((c16194a.f81553d - f10) * Math.min(1.0f, f8 * this.f81548q));
        C16194a c16194a5 = this.f81534c;
        float f11 = c16194a5.f81554e;
        float f12 = c16194a.f81554e - f11;
        float f13 = this.f81547p;
        float f14 = c16194a5.f81555f;
        c16194a2.m107628c(f4, fMin, f9, fMin2, f11 + (f12 * f13), f14 + ((c16194a.f81555f - f14) * f13));
        InterfaceC16195b interfaceC16195b = this.f81535d;
        if (interfaceC16195b != null) {
            interfaceC16195b.mo37947u(this.f81544m, this.f81547p);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m107624i(ExpandedCardClipStatus expandedCardClipStatus, boolean z) {
        m107625j(expandedCardClipStatus, z, false, true);
    }

    /* JADX INFO: renamed from: j */
    public void m107625j(ExpandedCardClipStatus expandedCardClipStatus, boolean z, boolean z2, boolean z3) {
        if (!z2 && this.f81544m == ExpandedCardClipStatus.UNKNOWN) {
            Choreographer.getInstance().removeFrameCallback(this);
            this.f81545n = expandedCardClipStatus;
            this.f81546o = z;
            return;
        }
        if (expandedCardClipStatus != this.f81544m || !z3) {
            Choreographer.getInstance().removeFrameCallback(this);
            if (z) {
                this.f81533b.m107627b(this.f81534c);
                this.f81547p = 0.0f;
                this.f81549r.m145026a(SystemClock.elapsedRealtime(), 340L);
                this.f81544m = expandedCardClipStatus;
                m107623h();
                Choreographer.getInstance().postFrameCallback(this);
            } else {
                C16194a c16194a = this.f81543l.get(expandedCardClipStatus);
                this.f81544m = expandedCardClipStatus;
                this.f81547p = 0.0f;
                c16194a.m107627b(this.f81533b);
                c16194a.m107627b(this.f81534c);
                m107623h();
            }
        }
        this.f81545n = null;
        this.f81546o = false;
    }
}
