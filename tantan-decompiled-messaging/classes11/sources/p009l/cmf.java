package p009l;

import android.graphics.Path;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.animation.PathInterpolator;
import com.p000p1.mobile.putong.core.newui.home.card.expanded.anim.ExpandedCardClipStatus;
import java.util.HashMap;
import l.t100;
import l.upa;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class cmf implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: s */
    public static PathInterpolator f10669s = new PathInterpolator(0.0f, 0.0f, 0.28f, 1.0f);

    /* JADX INFO: renamed from: a */
    public dmf f10670a;

    /* JADX INFO: renamed from: d */
    public InterfaceC0823b f10673d;

    /* JADX INFO: renamed from: l */
    public HashMap<ExpandedCardClipStatus, C0822a> f10681l;

    /* JADX INFO: renamed from: r */
    public k95 f10687r;

    /* JADX INFO: renamed from: m */
    public ExpandedCardClipStatus f10682m = ExpandedCardClipStatus.UNKNOWN;

    /* JADX INFO: renamed from: n */
    public ExpandedCardClipStatus f10683n = null;

    /* JADX INFO: renamed from: o */
    public boolean f10684o = false;

    /* JADX INFO: renamed from: p */
    public float f10685p = 0.0f;

    /* JADX INFO: renamed from: q */
    public float f10686q = 1.5f;

    /* JADX INFO: renamed from: b */
    public C0822a f10671b = new C0822a();

    /* JADX INFO: renamed from: c */
    public C0822a f10672c = new C0822a();

    /* JADX INFO: renamed from: e */
    public C0822a f10674e = new C0822a();

    /* JADX INFO: renamed from: f */
    public C0822a f10675f = new C0822a();

    /* JADX INFO: renamed from: g */
    public C0822a f10676g = new C0822a();

    /* JADX INFO: renamed from: h */
    public C0822a f10677h = new C0822a();

    /* JADX INFO: renamed from: i */
    public C0822a f10678i = new C0822a();

    /* JADX INFO: renamed from: j */
    public C0822a f10679j = new C0822a();

    /* JADX INFO: renamed from: k */
    public C0822a f10680k = new C0822a();

    /* JADX INFO: renamed from: l.cmf$a */
    public static class C0822a {

        /* JADX INFO: renamed from: a */
        public float f10688a;

        /* JADX INFO: renamed from: b */
        public float f10689b;

        /* JADX INFO: renamed from: c */
        public float f10690c;

        /* JADX INFO: renamed from: d */
        public float f10691d;

        /* JADX INFO: renamed from: e */
        public float f10692e;

        /* JADX INFO: renamed from: f */
        public float f10693f;

        /* JADX INFO: renamed from: g */
        public float[] f10694g = new float[8];

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0822a clone() {
            C0822a c0822a = new C0822a();
            m12717b(c0822a);
            return c0822a;
        }

        /* JADX INFO: renamed from: b */
        public void m12717b(C0822a c0822a) {
            c0822a.f10688a = this.f10688a;
            c0822a.f10689b = this.f10689b;
            c0822a.f10690c = this.f10690c;
            c0822a.f10691d = this.f10691d;
            c0822a.f10692e = this.f10692e;
            c0822a.f10693f = this.f10693f;
        }

        /* JADX INFO: renamed from: c */
        public void m12718c(float f, float f2, float f3, float f4, float f5, float f6) {
            this.f10688a = f;
            this.f10689b = f2;
            this.f10690c = f3;
            this.f10691d = f4;
            this.f10692e = f5;
            this.f10693f = f6;
        }

        public String toString() {
            return "l:" + this.f10688a + "|t:" + this.f10689b + "|r:" + this.f10690c + "|cb" + this.f10691d + "|tr:" + this.f10692e + "|br:" + this.f10693f;
        }
    }

    /* JADX INFO: renamed from: l.cmf$b */
    public interface InterfaceC0823b {
        /* JADX INFO: renamed from: u */
        void mo1921u(ExpandedCardClipStatus expandedCardClipStatus, float f);
    }

    public cmf(dmf dmfVar, InterfaceC0823b interfaceC0823b) {
        this.f10670a = dmfVar;
        HashMap<ExpandedCardClipStatus, C0822a> map = new HashMap<>();
        this.f10681l = map;
        map.put(ExpandedCardClipStatus.EXPANDED_CARD, this.f10674e);
        this.f10681l.put(ExpandedCardClipStatus.EXPANDED_PROFILE, this.f10675f);
        this.f10681l.put(ExpandedCardClipStatus.SWIPE_CLIP, this.f10676g);
        this.f10681l.put(ExpandedCardClipStatus.SWIPE_CLIP_PROFILE, this.f10677h);
        this.f10681l.put(ExpandedCardClipStatus.SCROLL_CLIP, this.f10678i);
        this.f10681l.put(ExpandedCardClipStatus.SWIPE_CLIP_ANCHOR, this.f10679j);
        this.f10681l.put(ExpandedCardClipStatus.FLING_CLIP, this.f10680k);
        this.f10687r = new k95();
        this.f10673d = interfaceC0823b;
    }

    /* JADX INFO: renamed from: a */
    public final void m12706a() {
        int i = 0;
        while (i < 8) {
            C0822a c0822a = this.f10671b;
            c0822a.f10694g[i] = i < 4 ? c0822a.f10692e : c0822a.f10693f;
            i++;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m12707b(float f, ExpandedCardClipStatus expandedCardClipStatus, C0822a c0822a, float f2, String str) {
        C0822a c0822a2;
        Choreographer.getInstance().removeFrameCallback(this);
        float fMin = Math.min(1.0f, f);
        if (expandedCardClipStatus == ExpandedCardClipStatus.EXPANDED_CARD) {
            c0822a2 = this.f10674e;
        } else if (expandedCardClipStatus == ExpandedCardClipStatus.SWIPE_CLIP) {
            c0822a2 = this.f10676g;
        } else if (expandedCardClipStatus == ExpandedCardClipStatus.SCROLL_CLIP) {
            c0822a2 = this.f10678i;
        } else if (expandedCardClipStatus == ExpandedCardClipStatus.FLING_CLIP) {
            c0822a2 = this.f10680k;
        } else {
            ExpandedCardClipStatus expandedCardClipStatus2 = this.f10682m;
            if (expandedCardClipStatus2 == ExpandedCardClipStatus.SWIPE_CLIP_PROFILE) {
                c0822a2 = this.f10677h;
            } else {
                c0822a2 = expandedCardClipStatus2 == ExpandedCardClipStatus.EXPANDED_PROFILE ? this.f10675f : null;
            }
        }
        if (c0822a2 == null) {
            return;
        }
        this.f10682m = expandedCardClipStatus;
        C0822a c0822a3 = this.f10671b;
        float f3 = c0822a.f10688a;
        float f4 = ((c0822a2.f10688a - f3) * fMin) + f3;
        float f5 = c0822a.f10689b;
        float f6 = fMin * 1.0f;
        float fMin2 = ((c0822a2.f10689b - f5) * Math.min(1.0f, f6)) + f5;
        float f7 = c0822a.f10690c;
        float f8 = f7 + ((c0822a2.f10690c - f7) * fMin);
        float f9 = c0822a.f10691d;
        float fMin3 = f9 + ((c0822a2.f10691d - f9) * Math.min(1.0f, f6));
        float f10 = c0822a.f10692e;
        float f11 = f2 * fMin;
        float fMin4 = ((c0822a2.f10692e - f10) * Math.min(1.0f, f11)) + f10;
        float f12 = c0822a.f10693f;
        c0822a3.m12718c(f4, fMin2, f8, fMin3, fMin4, f12 + ((c0822a2.f10693f - f12) * Math.min(1.0f, f11)));
        InterfaceC0823b interfaceC0823b = this.f10673d;
        if (interfaceC0823b != null) {
            interfaceC0823b.mo1921u(this.f10682m, fMin);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m12708c(C0822a c0822a) {
        this.f10671b.m12717b(c0822a);
    }

    /* JADX INFO: renamed from: d */
    public boolean m12709d() {
        C0822a c0822a = this.f10671b;
        return c0822a.f10692e > 0.0f || c0822a.f10693f > 0.0f || c0822a.f10689b > 0.0f;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        k95 k95Var = this.f10687r;
        if (jElapsedRealtime >= k95Var.f15486b) {
            this.f10685p = 1.0f;
            m12713h();
            return;
        }
        float f = (jElapsedRealtime - k95Var.f15485a) / k95Var.f15487c;
        this.f10685p = f;
        this.f10685p = f10669s.getInterpolation(f);
        m12713h();
        Choreographer.getInstance().postFrameCallback(this);
    }

    /* JADX INFO: renamed from: e */
    public void m12710e(Path path) {
        m12706a();
        C0822a c0822a = this.f10671b;
        path.addRoundRect(c0822a.f10688a, c0822a.f10689b, c0822a.f10690c, c0822a.f10691d, c0822a.f10694g, Path.Direction.CW);
    }

    /* JADX INFO: renamed from: f */
    public C0822a m12711f(ExpandedCardClipStatus expandedCardClipStatus) {
        return this.f10681l.get(expandedCardClipStatus);
    }

    /* JADX INFO: renamed from: g */
    public void m12712g(int i, int i2) {
        this.f10670a.m13422a(i, i2);
        float f = i2;
        this.f10674e.m12718c(0.0f, 0.0f, i, f, 0.0f, 0.0f);
        C0822a c0822a = this.f10676g;
        dmf dmfVar = this.f10670a;
        c0822a.m12718c(dmfVar.f11899a, dmfVar.f11900b, i - dmfVar.f11901c, i2 - dmfVar.f11902d, dmfVar.f11904f, dmfVar.f11905g);
        if (upa.N3()) {
            C0822a c0822a2 = this.f10674e;
            dmf dmfVar2 = this.f10670a;
            c0822a2.m12718c(dmfVar2.f11899a, 0.0f, i - dmfVar2.f11901c, i2 - t100.d(100.0f), 0.0f, this.f10670a.f11905g);
            C0822a c0822a3 = this.f10675f;
            dmf dmfVar3 = this.f10670a;
            c0822a3.m12718c(dmfVar3.f11899a, 0.0f, i - dmfVar3.f11901c, f, 0.0f, 0.0f);
            C0822a c0822a4 = this.f10676g;
            dmf dmfVar4 = this.f10670a;
            float f2 = dmfVar4.f11899a;
            float f3 = dmfVar4.f11900b;
            float f4 = i - dmfVar4.f11901c;
            float fD = i2 - t100.d(100.0f);
            dmf dmfVar5 = this.f10670a;
            c0822a4.m12718c(f2, f3, f4, fD, dmfVar5.f11904f, dmfVar5.f11905g);
            C0822a c0822a5 = this.f10677h;
            dmf dmfVar6 = this.f10670a;
            c0822a5.m12718c(dmfVar6.f11899a, dmfVar6.f11900b, i - dmfVar6.f11901c, i2 - dmfVar6.f11902d, dmfVar6.f11904f, dmfVar6.f11905g);
        }
        C0822a c0822a6 = this.f10678i;
        dmf dmfVar7 = this.f10670a;
        c0822a6.m12718c(dmfVar7.f11899a, dmfVar7.f11900b + dmfVar7.f11903e, i - dmfVar7.f11901c, f, dmfVar7.f11904f, 0.0f);
        C0822a c0822a7 = this.f10679j;
        dmf dmfVar8 = this.f10670a;
        c0822a7.m12718c(dmfVar8.f11899a, dmfVar8.f11900b, i - dmfVar8.f11901c, f, dmfVar8.f11904f, 0.0f);
        C0822a c0822a8 = this.f10678i;
        dmf dmfVar9 = this.f10670a;
        c0822a8.m12718c(dmfVar9.f11899a, dmfVar9.f11900b + dmfVar9.f11903e, i - dmfVar9.f11901c, f, dmfVar9.f11904f, 0.0f);
        C0822a c0822a9 = this.f10680k;
        float f5 = i / 2;
        dmf dmfVar10 = this.f10670a;
        float f6 = dmfVar10.f11904f;
        float f7 = i2 / 2;
        c0822a9.m12718c(f5 - (f6 * 1.5f), f7 - (f6 * 1.5f), f5 + (f6 * 1.5f), f7 + (f6 * 1.5f), f6 * 1.5f, dmfVar10.f11905g * 1.5f);
        if (this.f10682m == ExpandedCardClipStatus.UNKNOWN) {
            ExpandedCardClipStatus expandedCardClipStatus = this.f10683n;
            if (expandedCardClipStatus != null) {
                m12715j(expandedCardClipStatus, this.f10684o, true, true);
                return;
            }
            this.f10682m = ExpandedCardClipStatus.EXPANDED_CARD;
            this.f10674e.m12717b(this.f10672c);
            this.f10674e.m12717b(this.f10671b);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m12713h() {
        C0822a c0822a;
        ExpandedCardClipStatus expandedCardClipStatus = this.f10682m;
        if (expandedCardClipStatus == ExpandedCardClipStatus.EXPANDED_CARD) {
            c0822a = this.f10674e;
        } else if (expandedCardClipStatus == ExpandedCardClipStatus.EXPANDED_PROFILE) {
            c0822a = this.f10675f;
        } else if (expandedCardClipStatus == ExpandedCardClipStatus.SWIPE_CLIP) {
            c0822a = this.f10676g;
        } else if (expandedCardClipStatus == ExpandedCardClipStatus.SWIPE_CLIP_PROFILE) {
            c0822a = this.f10677h;
        } else if (expandedCardClipStatus == ExpandedCardClipStatus.SCROLL_CLIP) {
            c0822a = this.f10678i;
        } else {
            c0822a = expandedCardClipStatus == ExpandedCardClipStatus.FLING_CLIP ? this.f10680k : null;
        }
        if (c0822a == null) {
            return;
        }
        C0822a c0822a2 = this.f10671b;
        C0822a c0822a3 = this.f10672c;
        float f = c0822a3.f10688a;
        float f2 = c0822a.f10688a - f;
        float f3 = this.f10685p;
        float f4 = f + (f2 * f3);
        float f5 = c0822a3.f10689b;
        float fMin = f5 + ((c0822a.f10689b - f5) * Math.min(1.0f, f3 * this.f10686q));
        C0822a c0822a4 = this.f10672c;
        float f6 = c0822a4.f10690c;
        float f7 = c0822a.f10690c - f6;
        float f8 = this.f10685p;
        float f9 = f6 + (f7 * f8);
        float f10 = c0822a4.f10691d;
        float fMin2 = f10 + ((c0822a.f10691d - f10) * Math.min(1.0f, f8 * this.f10686q));
        C0822a c0822a5 = this.f10672c;
        float f11 = c0822a5.f10692e;
        float f12 = c0822a.f10692e - f11;
        float f13 = this.f10685p;
        float f14 = c0822a5.f10693f;
        c0822a2.m12718c(f4, fMin, f9, fMin2, f11 + (f12 * f13), f14 + ((c0822a.f10693f - f14) * f13));
        InterfaceC0823b interfaceC0823b = this.f10673d;
        if (interfaceC0823b != null) {
            interfaceC0823b.mo1921u(this.f10682m, this.f10685p);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m12714i(ExpandedCardClipStatus expandedCardClipStatus, boolean z) {
        m12715j(expandedCardClipStatus, z, false, true);
    }

    /* JADX INFO: renamed from: j */
    public void m12715j(ExpandedCardClipStatus expandedCardClipStatus, boolean z, boolean z2, boolean z3) {
        if (!z2 && this.f10682m == ExpandedCardClipStatus.UNKNOWN) {
            Choreographer.getInstance().removeFrameCallback(this);
            this.f10683n = expandedCardClipStatus;
            this.f10684o = z;
            return;
        }
        if (expandedCardClipStatus != this.f10682m || !z3) {
            Choreographer.getInstance().removeFrameCallback(this);
            if (z) {
                this.f10671b.m12717b(this.f10672c);
                this.f10685p = 0.0f;
                this.f10687r.m17348a(SystemClock.elapsedRealtime(), 340L);
                this.f10682m = expandedCardClipStatus;
                m12713h();
                Choreographer.getInstance().postFrameCallback(this);
            } else {
                C0822a c0822a = this.f10681l.get(expandedCardClipStatus);
                this.f10682m = expandedCardClipStatus;
                this.f10685p = 0.0f;
                c0822a.m12717b(this.f10671b);
                c0822a.m12717b(this.f10672c);
                m12713h();
            }
        }
        this.f10683n = null;
        this.f10684o = false;
    }
}
