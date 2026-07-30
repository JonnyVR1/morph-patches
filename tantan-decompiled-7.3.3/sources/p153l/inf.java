package p153l;

import android.graphics.Path;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.animation.PathInterpolator;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.anim.ExpandedCardClipStatus;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class inf implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: s */
    public static PathInterpolator f115925s = new PathInterpolator(0.0f, 0.0f, 0.28f, 1.0f);

    /* JADX INFO: renamed from: a */
    public jnf f115926a;

    /* JADX INFO: renamed from: d */
    public InterfaceC17749b f115929d;

    /* JADX INFO: renamed from: l */
    public HashMap<ExpandedCardClipStatus, C17748a> f115937l;

    /* JADX INFO: renamed from: r */
    public la5 f115943r;

    /* JADX INFO: renamed from: m */
    public ExpandedCardClipStatus f115938m = ExpandedCardClipStatus.UNKNOWN;

    /* JADX INFO: renamed from: n */
    public ExpandedCardClipStatus f115939n = null;

    /* JADX INFO: renamed from: o */
    public boolean f115940o = false;

    /* JADX INFO: renamed from: p */
    public float f115941p = 0.0f;

    /* JADX INFO: renamed from: q */
    public float f115942q = 1.5f;

    /* JADX INFO: renamed from: b */
    public C17748a f115927b = new C17748a();

    /* JADX INFO: renamed from: c */
    public C17748a f115928c = new C17748a();

    /* JADX INFO: renamed from: e */
    public C17748a f115930e = new C17748a();

    /* JADX INFO: renamed from: f */
    public C17748a f115931f = new C17748a();

    /* JADX INFO: renamed from: g */
    public C17748a f115932g = new C17748a();

    /* JADX INFO: renamed from: h */
    public C17748a f115933h = new C17748a();

    /* JADX INFO: renamed from: i */
    public C17748a f115934i = new C17748a();

    /* JADX INFO: renamed from: j */
    public C17748a f115935j = new C17748a();

    /* JADX INFO: renamed from: k */
    public C17748a f115936k = new C17748a();

    /* JADX INFO: renamed from: l.inf$a */
    public static class C17748a {

        /* JADX INFO: renamed from: a */
        public float f115944a;

        /* JADX INFO: renamed from: b */
        public float f115945b;

        /* JADX INFO: renamed from: c */
        public float f115946c;

        /* JADX INFO: renamed from: d */
        public float f115947d;

        /* JADX INFO: renamed from: e */
        public float f115948e;

        /* JADX INFO: renamed from: f */
        public float f115949f;

        /* JADX INFO: renamed from: g */
        public float[] f115950g = new float[8];

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C17748a clone() {
            C17748a c17748a = new C17748a();
            m141125b(c17748a);
            return c17748a;
        }

        /* JADX INFO: renamed from: b */
        public void m141125b(C17748a c17748a) {
            c17748a.f115944a = this.f115944a;
            c17748a.f115945b = this.f115945b;
            c17748a.f115946c = this.f115946c;
            c17748a.f115947d = this.f115947d;
            c17748a.f115948e = this.f115948e;
            c17748a.f115949f = this.f115949f;
        }

        /* JADX INFO: renamed from: c */
        public void m141126c(float f, float f2, float f3, float f4, float f5, float f6) {
            this.f115944a = f;
            this.f115945b = f2;
            this.f115946c = f3;
            this.f115947d = f4;
            this.f115948e = f5;
            this.f115949f = f6;
        }

        public String toString() {
            return "l:" + this.f115944a + "|t:" + this.f115945b + "|r:" + this.f115946c + "|cb" + this.f115947d + "|tr:" + this.f115948e + "|br:" + this.f115949f;
        }
    }

    /* JADX INFO: renamed from: l.inf$b */
    public interface InterfaceC17749b {
        /* JADX INFO: renamed from: u */
        void mo38950u(ExpandedCardClipStatus expandedCardClipStatus, float f);
    }

    public inf(jnf jnfVar, InterfaceC17749b interfaceC17749b) {
        this.f115926a = jnfVar;
        HashMap<ExpandedCardClipStatus, C17748a> map = new HashMap<>();
        this.f115937l = map;
        map.put(ExpandedCardClipStatus.EXPANDED_CARD, this.f115930e);
        this.f115937l.put(ExpandedCardClipStatus.EXPANDED_PROFILE, this.f115931f);
        this.f115937l.put(ExpandedCardClipStatus.SWIPE_CLIP, this.f115932g);
        this.f115937l.put(ExpandedCardClipStatus.SWIPE_CLIP_PROFILE, this.f115933h);
        this.f115937l.put(ExpandedCardClipStatus.SCROLL_CLIP, this.f115934i);
        this.f115937l.put(ExpandedCardClipStatus.SWIPE_CLIP_ANCHOR, this.f115935j);
        this.f115937l.put(ExpandedCardClipStatus.FLING_CLIP, this.f115936k);
        this.f115943r = new la5();
        this.f115929d = interfaceC17749b;
    }

    /* JADX INFO: renamed from: a */
    public final void m141114a() {
        int i = 0;
        while (i < 8) {
            C17748a c17748a = this.f115927b;
            c17748a.f115950g[i] = i < 4 ? c17748a.f115948e : c17748a.f115949f;
            i++;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m141115b(float f, ExpandedCardClipStatus expandedCardClipStatus, C17748a c17748a, float f2, String str) {
        C17748a c17748a2;
        Choreographer.getInstance().removeFrameCallback(this);
        float fMin = Math.min(1.0f, f);
        if (expandedCardClipStatus == ExpandedCardClipStatus.EXPANDED_CARD) {
            c17748a2 = this.f115930e;
        } else if (expandedCardClipStatus == ExpandedCardClipStatus.SWIPE_CLIP) {
            c17748a2 = this.f115932g;
        } else if (expandedCardClipStatus == ExpandedCardClipStatus.SCROLL_CLIP) {
            c17748a2 = this.f115934i;
        } else if (expandedCardClipStatus == ExpandedCardClipStatus.FLING_CLIP) {
            c17748a2 = this.f115936k;
        } else {
            ExpandedCardClipStatus expandedCardClipStatus2 = this.f115938m;
            if (expandedCardClipStatus2 == ExpandedCardClipStatus.SWIPE_CLIP_PROFILE) {
                c17748a2 = this.f115933h;
            } else {
                c17748a2 = expandedCardClipStatus2 == ExpandedCardClipStatus.EXPANDED_PROFILE ? this.f115931f : null;
            }
        }
        if (c17748a2 == null) {
            return;
        }
        this.f115938m = expandedCardClipStatus;
        C17748a c17748a3 = this.f115927b;
        float f3 = c17748a.f115944a;
        float f4 = ((c17748a2.f115944a - f3) * fMin) + f3;
        float f5 = c17748a.f115945b;
        float f6 = fMin * 1.0f;
        float fMin2 = ((c17748a2.f115945b - f5) * Math.min(1.0f, f6)) + f5;
        float f7 = c17748a.f115946c;
        float f8 = f7 + ((c17748a2.f115946c - f7) * fMin);
        float f9 = c17748a.f115947d;
        float fMin3 = f9 + ((c17748a2.f115947d - f9) * Math.min(1.0f, f6));
        float f10 = c17748a.f115948e;
        float f11 = f2 * fMin;
        float fMin4 = ((c17748a2.f115948e - f10) * Math.min(1.0f, f11)) + f10;
        float f12 = c17748a.f115949f;
        c17748a3.m141126c(f4, fMin2, f8, fMin3, fMin4, f12 + ((c17748a2.f115949f - f12) * Math.min(1.0f, f11)));
        InterfaceC17749b interfaceC17749b = this.f115929d;
        if (interfaceC17749b != null) {
            interfaceC17749b.mo38950u(this.f115938m, fMin);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m141116c(C17748a c17748a) {
        this.f115927b.m141125b(c17748a);
    }

    /* JADX INFO: renamed from: d */
    public boolean m141117d() {
        C17748a c17748a = this.f115927b;
        return c17748a.f115948e > 0.0f || c17748a.f115949f > 0.0f || c17748a.f115945b > 0.0f;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        la5 la5Var = this.f115943r;
        if (jElapsedRealtime >= la5Var.f130655b) {
            this.f115941p = 1.0f;
            m141121h();
            return;
        }
        float f = (jElapsedRealtime - la5Var.f130654a) / la5Var.f130656c;
        this.f115941p = f;
        this.f115941p = f115925s.getInterpolation(f);
        m141121h();
        Choreographer.getInstance().postFrameCallback(this);
    }

    /* JADX INFO: renamed from: e */
    public void m141118e(Path path) {
        m141114a();
        C17748a c17748a = this.f115927b;
        path.addRoundRect(c17748a.f115944a, c17748a.f115945b, c17748a.f115946c, c17748a.f115947d, c17748a.f115950g, Path.Direction.CW);
    }

    /* JADX INFO: renamed from: f */
    public C17748a m141119f(ExpandedCardClipStatus expandedCardClipStatus) {
        return this.f115937l.get(expandedCardClipStatus);
    }

    /* JADX INFO: renamed from: g */
    public void m141120g(int i, int i2) {
        this.f115926a.m146242a(i, i2);
        float f = i2;
        this.f115930e.m141126c(0.0f, 0.0f, i, f, 0.0f, 0.0f);
        C17748a c17748a = this.f115932g;
        jnf jnfVar = this.f115926a;
        c17748a.m141126c(jnfVar.f121838a, jnfVar.f121839b, i - jnfVar.f121840c, i2 - jnfVar.f121841d, jnfVar.f121843f, jnfVar.f121844g);
        if (gra.m131606N3()) {
            C17748a c17748a2 = this.f115930e;
            jnf jnfVar2 = this.f115926a;
            c17748a2.m141126c(jnfVar2.f121838a, 0.0f, i - jnfVar2.f121840c, i2 - qa00.m175859d(100.0f), 0.0f, this.f115926a.f121844g);
            C17748a c17748a3 = this.f115931f;
            jnf jnfVar3 = this.f115926a;
            c17748a3.m141126c(jnfVar3.f121838a, 0.0f, i - jnfVar3.f121840c, f, 0.0f, 0.0f);
            C17748a c17748a4 = this.f115932g;
            jnf jnfVar4 = this.f115926a;
            float f2 = jnfVar4.f121838a;
            float f3 = jnfVar4.f121839b;
            float f4 = i - jnfVar4.f121840c;
            float fM175859d = i2 - qa00.m175859d(100.0f);
            jnf jnfVar5 = this.f115926a;
            c17748a4.m141126c(f2, f3, f4, fM175859d, jnfVar5.f121843f, jnfVar5.f121844g);
            C17748a c17748a5 = this.f115933h;
            jnf jnfVar6 = this.f115926a;
            c17748a5.m141126c(jnfVar6.f121838a, jnfVar6.f121839b, i - jnfVar6.f121840c, i2 - jnfVar6.f121841d, jnfVar6.f121843f, jnfVar6.f121844g);
        }
        C17748a c17748a6 = this.f115934i;
        jnf jnfVar7 = this.f115926a;
        c17748a6.m141126c(jnfVar7.f121838a, jnfVar7.f121839b + jnfVar7.f121842e, i - jnfVar7.f121840c, f, jnfVar7.f121843f, 0.0f);
        C17748a c17748a7 = this.f115935j;
        jnf jnfVar8 = this.f115926a;
        c17748a7.m141126c(jnfVar8.f121838a, jnfVar8.f121839b, i - jnfVar8.f121840c, f, jnfVar8.f121843f, 0.0f);
        C17748a c17748a8 = this.f115934i;
        jnf jnfVar9 = this.f115926a;
        c17748a8.m141126c(jnfVar9.f121838a, jnfVar9.f121839b + jnfVar9.f121842e, i - jnfVar9.f121840c, f, jnfVar9.f121843f, 0.0f);
        C17748a c17748a9 = this.f115936k;
        float f5 = i / 2;
        jnf jnfVar10 = this.f115926a;
        float f6 = jnfVar10.f121843f;
        float f7 = i2 / 2;
        c17748a9.m141126c(f5 - (f6 * 1.5f), f7 - (f6 * 1.5f), f5 + (f6 * 1.5f), f7 + (f6 * 1.5f), f6 * 1.5f, jnfVar10.f121844g * 1.5f);
        if (this.f115938m == ExpandedCardClipStatus.UNKNOWN) {
            ExpandedCardClipStatus expandedCardClipStatus = this.f115939n;
            if (expandedCardClipStatus != null) {
                m141123j(expandedCardClipStatus, this.f115940o, true, true);
                return;
            }
            this.f115938m = ExpandedCardClipStatus.EXPANDED_CARD;
            this.f115930e.m141125b(this.f115928c);
            this.f115930e.m141125b(this.f115927b);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m141121h() {
        C17748a c17748a;
        ExpandedCardClipStatus expandedCardClipStatus = this.f115938m;
        if (expandedCardClipStatus == ExpandedCardClipStatus.EXPANDED_CARD) {
            c17748a = this.f115930e;
        } else if (expandedCardClipStatus == ExpandedCardClipStatus.EXPANDED_PROFILE) {
            c17748a = this.f115931f;
        } else if (expandedCardClipStatus == ExpandedCardClipStatus.SWIPE_CLIP) {
            c17748a = this.f115932g;
        } else if (expandedCardClipStatus == ExpandedCardClipStatus.SWIPE_CLIP_PROFILE) {
            c17748a = this.f115933h;
        } else if (expandedCardClipStatus == ExpandedCardClipStatus.SCROLL_CLIP) {
            c17748a = this.f115934i;
        } else {
            c17748a = expandedCardClipStatus == ExpandedCardClipStatus.FLING_CLIP ? this.f115936k : null;
        }
        if (c17748a == null) {
            return;
        }
        C17748a c17748a2 = this.f115927b;
        C17748a c17748a3 = this.f115928c;
        float f = c17748a3.f115944a;
        float f2 = c17748a.f115944a - f;
        float f3 = this.f115941p;
        float f4 = f + (f2 * f3);
        float f5 = c17748a3.f115945b;
        float fMin = f5 + ((c17748a.f115945b - f5) * Math.min(1.0f, f3 * this.f115942q));
        C17748a c17748a4 = this.f115928c;
        float f6 = c17748a4.f115946c;
        float f7 = c17748a.f115946c - f6;
        float f8 = this.f115941p;
        float f9 = f6 + (f7 * f8);
        float f10 = c17748a4.f115947d;
        float fMin2 = f10 + ((c17748a.f115947d - f10) * Math.min(1.0f, f8 * this.f115942q));
        C17748a c17748a5 = this.f115928c;
        float f11 = c17748a5.f115948e;
        float f12 = c17748a.f115948e - f11;
        float f13 = this.f115941p;
        float f14 = c17748a5.f115949f;
        c17748a2.m141126c(f4, fMin, f9, fMin2, f11 + (f12 * f13), f14 + ((c17748a.f115949f - f14) * f13));
        InterfaceC17749b interfaceC17749b = this.f115929d;
        if (interfaceC17749b != null) {
            interfaceC17749b.mo38950u(this.f115938m, this.f115941p);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m141122i(ExpandedCardClipStatus expandedCardClipStatus, boolean z) {
        m141123j(expandedCardClipStatus, z, false, true);
    }

    /* JADX INFO: renamed from: j */
    public void m141123j(ExpandedCardClipStatus expandedCardClipStatus, boolean z, boolean z2, boolean z3) {
        if (!z2 && this.f115938m == ExpandedCardClipStatus.UNKNOWN) {
            Choreographer.getInstance().removeFrameCallback(this);
            this.f115939n = expandedCardClipStatus;
            this.f115940o = z;
            return;
        }
        if (expandedCardClipStatus != this.f115938m || !z3) {
            Choreographer.getInstance().removeFrameCallback(this);
            if (z) {
                this.f115927b.m141125b(this.f115928c);
                this.f115941p = 0.0f;
                this.f115943r.m153470a(SystemClock.elapsedRealtime(), 340L);
                this.f115938m = expandedCardClipStatus;
                m141121h();
                Choreographer.getInstance().postFrameCallback(this);
            } else {
                C17748a c17748a = this.f115937l.get(expandedCardClipStatus);
                this.f115938m = expandedCardClipStatus;
                this.f115941p = 0.0f;
                c17748a.m141125b(this.f115927b);
                c17748a.m141125b(this.f115928c);
                m141121h();
            }
        }
        this.f115939n = null;
        this.f115940o = false;
    }
}
