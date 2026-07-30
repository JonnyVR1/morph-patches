package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.data.BLiveCampaign;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.CommonH5Builder;

/* JADX INFO: loaded from: classes13.dex */
public class xnu extends xj2 {

    /* JADX INFO: renamed from: c */
    public final int f193732c;

    /* JADX INFO: renamed from: d */
    public final String f193733d;

    /* JADX INFO: renamed from: e */
    public final boolean f193734e;

    /* JADX INFO: renamed from: f */
    public final CommonH5Builder.BgType f193735f;

    /* JADX INFO: renamed from: g */
    public final int f193736g;

    /* JADX INFO: renamed from: h */
    public final int[] f193737h;

    /* JADX INFO: renamed from: i */
    public final e30<Boolean> f193738i;

    /* JADX INFO: renamed from: j */
    public final d30 f193739j;

    /* JADX INFO: renamed from: k */
    public String f193740k;

    /* JADX INFO: renamed from: l */
    public String f193741l;

    /* JADX INFO: renamed from: m */
    public boolean f193742m;

    /* JADX INFO: renamed from: n */
    public int f193743n;

    /* JADX INFO: renamed from: o */
    public boolean f193744o;

    /* JADX INFO: renamed from: l.xnu$a */
    public static class C21187a extends yj2 {

        /* JADX INFO: renamed from: c */
        public int f193745c;

        /* JADX INFO: renamed from: d */
        public String f193746d;

        /* JADX INFO: renamed from: e */
        public boolean f193747e;

        /* JADX INFO: renamed from: f */
        public CommonH5Builder.BgType f193748f;

        /* JADX INFO: renamed from: g */
        public int f193749g;

        /* JADX INFO: renamed from: h */
        public int[] f193750h;

        /* JADX INFO: renamed from: i */
        public e30<Boolean> f193751i;

        /* JADX INFO: renamed from: j */
        public d30 f193752j;

        /* JADX INFO: renamed from: k */
        public String f193753k;

        /* JADX INFO: renamed from: l */
        public String f193754l;

        /* JADX INFO: renamed from: m */
        public int f193755m;

        /* JADX INFO: renamed from: n */
        public boolean f193756n;

        /* JADX INFO: renamed from: o */
        public boolean f193757o;

        public C21187a(int i) {
            super(i);
            this.f193746d = "";
            this.f193750h = new int[]{(int) (uep0.m193329p() * 0.86f), 0};
            this.f193755m = 0;
            this.f193757o = false;
            this.f193745c = i;
            this.f193750h[1] = (int) (xdl0.m208408w0() * 0.75f);
            this.f193749g = 17;
            this.f193748f = CommonH5Builder.BgType.DEFAULT_BG;
        }

        /* JADX INFO: renamed from: n */
        public C21187a m210236n(CommonH5Builder.BgType bgType) {
            this.f193748f = bgType;
            return this;
        }

        /* JADX INFO: renamed from: o */
        public xnu m210237o() {
            TextUtils.isEmpty(this.f193746d);
            return new xnu(this);
        }

        /* JADX INFO: renamed from: p */
        public C21187a m210238p(BLiveCampaign bLiveCampaign) {
            this.f193746d = bLiveCampaign.detailUrl;
            m210242t(bLiveCampaign.detailInset.get(0).doubleValue(), bLiveCampaign.detailInset.get(1).doubleValue());
            this.f193749g = bLiveCampaign.detailGravity == 1 ? 80 : 17;
            m210236n(bLiveCampaign.webBgType);
            this.f193753k = bLiveCampaign.campaignType;
            this.f193754l = bLiveCampaign.f44348id;
            this.f193747e = bLiveCampaign.isNeedCloseBtn;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public C21187a m210239q(int i) {
            this.f193755m = i;
            return this;
        }

        /* JADX INFO: renamed from: r */
        public C21187a m210240r(int i) {
            this.f193749g = i;
            if (i == 80) {
                int[] iArr = this.f193750h;
                if (iArr[0] == 0 || iArr[1] == 0) {
                    iArr[0] = uep0.m193329p();
                    this.f193750h[1] = (int) (xdl0.m208408w0() * 0.75f);
                }
            }
            return this;
        }

        /* JADX INFO: renamed from: s */
        public C21187a m210241s() {
            this.f193747e = true;
            return this;
        }

        /* JADX INFO: renamed from: t */
        public C21187a m210242t(double d, double d2) {
            this.f193750h[0] = (int) Math.round(((double) uep0.m193329p()) * d);
            this.f193750h[1] = (int) Math.round(((double) (xdl0.m208408w0() + xdl0.m208331F0())) * d2);
            this.f193757o = d2 == 1.0d;
            return this;
        }

        /* JADX INFO: renamed from: u */
        public C21187a m210243u(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.f193746d = str;
            }
            return this;
        }
    }

    public xnu(C21187a c21187a) {
        super(c21187a);
        this.f193732c = c21187a.f193745c;
        this.f193733d = c21187a.f193746d;
        this.f193734e = c21187a.f193747e;
        this.f193735f = c21187a.f193748f;
        this.f193736g = c21187a.f193749g;
        this.f193737h = c21187a.f193750h;
        this.f193738i = c21187a.f193751i;
        this.f193739j = c21187a.f193752j;
        this.f193740k = c21187a.f193753k;
        this.f193741l = c21187a.f193754l;
        this.f193742m = c21187a.f193756n;
        this.f193743n = c21187a.f193755m;
        this.f193744o = c21187a.f193757o;
    }

    /* JADX INFO: renamed from: c */
    public static C21187a m210211c(int i) {
        return new C21187a(i);
    }

    @Override // p149l.xj2
    /* JADX INFO: renamed from: a */
    public int mo142569a() {
        return this.f193732c;
    }

    /* JADX INFO: renamed from: b */
    public CommonH5Builder.BgType m210212b() {
        return this.f193735f;
    }

    /* JADX INFO: renamed from: d */
    public d30 m210213d() {
        return this.f193739j;
    }

    /* JADX INFO: renamed from: e */
    public String m210214e() {
        return this.f193740k;
    }

    /* JADX INFO: renamed from: f */
    public int m210215f() {
        return this.f193743n;
    }

    /* JADX INFO: renamed from: g */
    public String m210216g() {
        return this.f193741l;
    }

    /* JADX INFO: renamed from: h */
    public int m210217h() {
        return this.f193736g;
    }

    /* JADX INFO: renamed from: i */
    public boolean m210218i() {
        return this.f193744o;
    }

    /* JADX INFO: renamed from: j */
    public boolean m210219j() {
        return this.f193742m;
    }

    /* JADX INFO: renamed from: k */
    public boolean m210220k() {
        return this.f193734e;
    }

    /* JADX INFO: renamed from: l */
    public int[] m210221l() {
        return this.f193737h;
    }

    /* JADX INFO: renamed from: m */
    public String m210222m() {
        return this.f193733d;
    }
}
