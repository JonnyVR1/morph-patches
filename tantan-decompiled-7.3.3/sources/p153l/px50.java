package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.data.BLiveCampaign;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCampaign;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.CommonH5Builder;

/* JADX INFO: loaded from: classes4.dex */
public class px50 extends fk2 {

    /* JADX INFO: renamed from: c */
    public final int f154462c;

    /* JADX INFO: renamed from: d */
    public final String f154463d;

    /* JADX INFO: renamed from: e */
    public final boolean f154464e;

    /* JADX INFO: renamed from: f */
    public final CommonH5Builder.BgType f154465f;

    /* JADX INFO: renamed from: g */
    public final int f154466g;

    /* JADX INFO: renamed from: h */
    public final int[] f154467h;

    /* JADX INFO: renamed from: i */
    public final y20<Boolean> f154468i;

    /* JADX INFO: renamed from: j */
    public final x20 f154469j;

    /* JADX INFO: renamed from: k */
    public String f154470k;

    /* JADX INFO: renamed from: l */
    public String f154471l;

    /* JADX INFO: renamed from: m */
    public boolean f154472m;

    /* JADX INFO: renamed from: n */
    public int f154473n;

    /* JADX INFO: renamed from: o */
    public boolean f154474o;

    /* JADX INFO: renamed from: p */
    public boolean f154475p;

    /* JADX INFO: renamed from: q */
    public boolean f154476q;

    /* JADX INFO: renamed from: l.px50$a */
    public static class C19461a extends gk2 {

        /* JADX INFO: renamed from: c */
        public boolean f154477c;

        /* JADX INFO: renamed from: d */
        public int f154478d;

        /* JADX INFO: renamed from: e */
        public String f154479e;

        /* JADX INFO: renamed from: f */
        public boolean f154480f;

        /* JADX INFO: renamed from: g */
        public CommonH5Builder.BgType f154481g;

        /* JADX INFO: renamed from: h */
        public int f154482h;

        /* JADX INFO: renamed from: i */
        public int[] f154483i;

        /* JADX INFO: renamed from: j */
        public y20<Boolean> f154484j;

        /* JADX INFO: renamed from: k */
        public x20 f154485k;

        /* JADX INFO: renamed from: l */
        public String f154486l;

        /* JADX INFO: renamed from: m */
        public String f154487m;

        /* JADX INFO: renamed from: n */
        public int f154488n;

        /* JADX INFO: renamed from: o */
        public boolean f154489o;

        /* JADX INFO: renamed from: p */
        public boolean f154490p;

        /* JADX INFO: renamed from: q */
        public boolean f154491q;

        public C19461a(int i) {
            super(i);
            this.f154479e = "";
            this.f154483i = new int[]{(int) (ynp0.m216939p() * 0.86f), 0};
            this.f154488n = 0;
            this.f154490p = false;
            this.f154478d = i;
            this.f154483i[1] = (int) (bnl0.m105588w0() * 0.75f);
            this.f154482h = 17;
            this.f154481g = CommonH5Builder.BgType.DEFAULT_BG;
        }

        /* JADX INFO: renamed from: A */
        public C19461a m174140A(int i, int i2) {
            int[] iArr = this.f154483i;
            iArr[0] = i;
            iArr[1] = i2;
            return this;
        }

        /* JADX INFO: renamed from: B */
        public C19461a m174141B(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.f154479e = str;
            }
            return this;
        }

        /* JADX INFO: renamed from: p */
        public C19461a m174142p(CommonH5Builder.BgType bgType) {
            this.f154481g = bgType;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public px50 m174143q() {
            TextUtils.isEmpty(this.f154479e);
            return new px50(this);
        }

        /* JADX INFO: renamed from: r */
        public C19461a m174144r(BLiveCampaign bLiveCampaign) {
            this.f154479e = bLiveCampaign.detailUrl;
            m174152z(bLiveCampaign.detailInset.get(0).doubleValue(), bLiveCampaign.detailInset.get(1).doubleValue());
            this.f154482h = bLiveCampaign.detailGravity == 1 ? 80 : 17;
            m174142p(bLiveCampaign.webBgType);
            this.f154486l = bLiveCampaign.campaignType;
            this.f154487m = bLiveCampaign.f45196id;
            this.f154480f = bLiveCampaign.isNeedCloseBtn;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public C19461a m174145s(int i) {
            this.f154488n = i;
            return this;
        }

        /* JADX INFO: renamed from: t */
        public C19461a m174146t(int i) {
            this.f154482h = i;
            if (i == 80) {
                int[] iArr = this.f154483i;
                if (iArr[0] == 0 || iArr[1] == 0) {
                    iArr[0] = ynp0.m216939p();
                    this.f154483i[1] = (int) (bnl0.m105588w0() * 0.75f);
                }
            }
            return this;
        }

        /* JADX INFO: renamed from: u */
        public C19461a m174147u(boolean z) {
            this.f154491q = z;
            return this;
        }

        /* JADX INFO: renamed from: v */
        public C19461a m174148v() {
            this.f154489o = true;
            return this;
        }

        /* JADX INFO: renamed from: w */
        public C19461a m174149w(String str) {
            this.f154477c = TextUtils.equals("1", str);
            return this;
        }

        /* JADX INFO: renamed from: x */
        public C19461a m174150x() {
            this.f154480f = true;
            return this;
        }

        /* JADX INFO: renamed from: y */
        public C19461a m174151y(BLiveVoiceCampaign bLiveVoiceCampaign) {
            this.f154479e = bLiveVoiceCampaign.detailUrl;
            if (!jyb.m147479J(bLiveVoiceCampaign.detailInset) && bLiveVoiceCampaign.detailInset.size() >= 2) {
                m174152z(bLiveVoiceCampaign.detailInset.get(0).intValue(), bLiveVoiceCampaign.detailInset.get(1).intValue());
            }
            this.f154482h = bLiveVoiceCampaign.detailGravity == 1 ? 80 : 17;
            m174142p(bLiveVoiceCampaign.webBgType);
            this.f154486l = bLiveVoiceCampaign.campaignType;
            this.f154487m = bLiveVoiceCampaign.f45338id;
            this.f154480f = bLiveVoiceCampaign.isNeedCloseBtn;
            return this;
        }

        /* JADX INFO: renamed from: z */
        public C19461a m174152z(double d, double d2) {
            this.f154483i[0] = (int) Math.round(((double) ynp0.m216939p()) * d);
            this.f154483i[1] = (int) Math.round(((double) (bnl0.m105588w0() + bnl0.m105511F0())) * d2);
            this.f154490p = d2 == 1.0d;
            return this;
        }
    }

    public px50(C19461a c19461a) {
        super(c19461a);
        this.f154473n = 0;
        this.f154462c = c19461a.f154478d;
        this.f154463d = c19461a.f154479e;
        this.f154464e = c19461a.f154480f;
        this.f154465f = c19461a.f154481g;
        this.f154466g = c19461a.f154482h;
        this.f154467h = c19461a.f154483i;
        this.f154468i = c19461a.f154484j;
        this.f154469j = c19461a.f154485k;
        this.f154470k = c19461a.f154486l;
        this.f154471l = c19461a.f154487m;
        this.f154472m = c19461a.f154489o;
        this.f154473n = c19461a.f154488n;
        this.f154474o = c19461a.f154490p;
        this.f154475p = c19461a.f154491q;
        this.f154476q = c19461a.f154477c;
    }

    /* JADX INFO: renamed from: c */
    public static C19461a m174112c(int i) {
        return new C19461a(i);
    }

    @Override // p153l.fk2
    /* JADX INFO: renamed from: a */
    public int mo125930a() {
        return this.f154462c;
    }

    /* JADX INFO: renamed from: b */
    public CommonH5Builder.BgType m174113b() {
        return this.f154465f;
    }

    /* JADX INFO: renamed from: d */
    public x20 m174114d() {
        return this.f154469j;
    }

    /* JADX INFO: renamed from: e */
    public String m174115e() {
        return this.f154470k;
    }

    /* JADX INFO: renamed from: f */
    public int m174116f() {
        return this.f154473n;
    }

    /* JADX INFO: renamed from: g */
    public String m174117g() {
        return this.f154471l;
    }

    /* JADX INFO: renamed from: h */
    public int m174118h() {
        return this.f154466g;
    }

    /* JADX INFO: renamed from: i */
    public boolean m174119i() {
        return this.f154474o;
    }

    /* JADX INFO: renamed from: j */
    public boolean m174120j() {
        return this.f154472m;
    }

    /* JADX INFO: renamed from: k */
    public boolean m174121k() {
        return this.f154464e;
    }

    /* JADX INFO: renamed from: l */
    public boolean m174122l() {
        return this.f154476q;
    }

    /* JADX INFO: renamed from: m */
    public int[] m174123m() {
        return this.f154467h;
    }

    /* JADX INFO: renamed from: n */
    public String m174124n() {
        return this.f154463d;
    }
}
