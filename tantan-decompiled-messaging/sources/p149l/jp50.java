package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.data.BLiveCampaign;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCampaign;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.CommonH5Builder;

/* JADX INFO: loaded from: classes4.dex */
public class jp50 extends xj2 {

    /* JADX INFO: renamed from: c */
    public final int f119054c;

    /* JADX INFO: renamed from: d */
    public final String f119055d;

    /* JADX INFO: renamed from: e */
    public final boolean f119056e;

    /* JADX INFO: renamed from: f */
    public final CommonH5Builder.BgType f119057f;

    /* JADX INFO: renamed from: g */
    public final int f119058g;

    /* JADX INFO: renamed from: h */
    public final int[] f119059h;

    /* JADX INFO: renamed from: i */
    public final e30<Boolean> f119060i;

    /* JADX INFO: renamed from: j */
    public final d30 f119061j;

    /* JADX INFO: renamed from: k */
    public String f119062k;

    /* JADX INFO: renamed from: l */
    public String f119063l;

    /* JADX INFO: renamed from: m */
    public boolean f119064m;

    /* JADX INFO: renamed from: n */
    public int f119065n;

    /* JADX INFO: renamed from: o */
    public boolean f119066o;

    /* JADX INFO: renamed from: p */
    public boolean f119067p;

    /* JADX INFO: renamed from: q */
    public boolean f119068q;

    /* JADX INFO: renamed from: l.jp50$a */
    public static class C17834a extends yj2 {

        /* JADX INFO: renamed from: c */
        public boolean f119069c;

        /* JADX INFO: renamed from: d */
        public int f119070d;

        /* JADX INFO: renamed from: e */
        public String f119071e;

        /* JADX INFO: renamed from: f */
        public boolean f119072f;

        /* JADX INFO: renamed from: g */
        public CommonH5Builder.BgType f119073g;

        /* JADX INFO: renamed from: h */
        public int f119074h;

        /* JADX INFO: renamed from: i */
        public int[] f119075i;

        /* JADX INFO: renamed from: j */
        public e30<Boolean> f119076j;

        /* JADX INFO: renamed from: k */
        public d30 f119077k;

        /* JADX INFO: renamed from: l */
        public String f119078l;

        /* JADX INFO: renamed from: m */
        public String f119079m;

        /* JADX INFO: renamed from: n */
        public int f119080n;

        /* JADX INFO: renamed from: o */
        public boolean f119081o;

        /* JADX INFO: renamed from: p */
        public boolean f119082p;

        /* JADX INFO: renamed from: q */
        public boolean f119083q;

        public C17834a(int i) {
            super(i);
            this.f119071e = "";
            this.f119075i = new int[]{(int) (uep0.m193329p() * 0.86f), 0};
            this.f119080n = 0;
            this.f119082p = false;
            this.f119070d = i;
            this.f119075i[1] = (int) (xdl0.m208408w0() * 0.75f);
            this.f119074h = 17;
            this.f119073g = CommonH5Builder.BgType.DEFAULT_BG;
        }

        /* JADX INFO: renamed from: A */
        public C17834a m142597A(int i, int i2) {
            int[] iArr = this.f119075i;
            iArr[0] = i;
            iArr[1] = i2;
            return this;
        }

        /* JADX INFO: renamed from: B */
        public C17834a m142598B(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.f119071e = str;
            }
            return this;
        }

        /* JADX INFO: renamed from: p */
        public C17834a m142599p(CommonH5Builder.BgType bgType) {
            this.f119073g = bgType;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public jp50 m142600q() {
            TextUtils.isEmpty(this.f119071e);
            return new jp50(this);
        }

        /* JADX INFO: renamed from: r */
        public C17834a m142601r(BLiveCampaign bLiveCampaign) {
            this.f119071e = bLiveCampaign.detailUrl;
            m142609z(bLiveCampaign.detailInset.get(0).doubleValue(), bLiveCampaign.detailInset.get(1).doubleValue());
            this.f119074h = bLiveCampaign.detailGravity == 1 ? 80 : 17;
            m142599p(bLiveCampaign.webBgType);
            this.f119078l = bLiveCampaign.campaignType;
            this.f119079m = bLiveCampaign.f44348id;
            this.f119072f = bLiveCampaign.isNeedCloseBtn;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public C17834a m142602s(int i) {
            this.f119080n = i;
            return this;
        }

        /* JADX INFO: renamed from: t */
        public C17834a m142603t(int i) {
            this.f119074h = i;
            if (i == 80) {
                int[] iArr = this.f119075i;
                if (iArr[0] == 0 || iArr[1] == 0) {
                    iArr[0] = uep0.m193329p();
                    this.f119075i[1] = (int) (xdl0.m208408w0() * 0.75f);
                }
            }
            return this;
        }

        /* JADX INFO: renamed from: u */
        public C17834a m142604u(boolean z) {
            this.f119083q = z;
            return this;
        }

        /* JADX INFO: renamed from: v */
        public C17834a m142605v() {
            this.f119081o = true;
            return this;
        }

        /* JADX INFO: renamed from: w */
        public C17834a m142606w(String str) {
            this.f119069c = TextUtils.equals("1", str);
            return this;
        }

        /* JADX INFO: renamed from: x */
        public C17834a m142607x() {
            this.f119072f = true;
            return this;
        }

        /* JADX INFO: renamed from: y */
        public C17834a m142608y(BLiveVoiceCampaign bLiveVoiceCampaign) {
            this.f119071e = bLiveVoiceCampaign.detailUrl;
            if (!vwb.m200296J(bLiveVoiceCampaign.detailInset) && bLiveVoiceCampaign.detailInset.size() >= 2) {
                m142609z(bLiveVoiceCampaign.detailInset.get(0).intValue(), bLiveVoiceCampaign.detailInset.get(1).intValue());
            }
            this.f119074h = bLiveVoiceCampaign.detailGravity == 1 ? 80 : 17;
            m142599p(bLiveVoiceCampaign.webBgType);
            this.f119078l = bLiveVoiceCampaign.campaignType;
            this.f119079m = bLiveVoiceCampaign.f44490id;
            this.f119072f = bLiveVoiceCampaign.isNeedCloseBtn;
            return this;
        }

        /* JADX INFO: renamed from: z */
        public C17834a m142609z(double d, double d2) {
            this.f119075i[0] = (int) Math.round(((double) uep0.m193329p()) * d);
            this.f119075i[1] = (int) Math.round(((double) (xdl0.m208408w0() + xdl0.m208331F0())) * d2);
            this.f119082p = d2 == 1.0d;
            return this;
        }
    }

    public jp50(C17834a c17834a) {
        super(c17834a);
        this.f119065n = 0;
        this.f119054c = c17834a.f119070d;
        this.f119055d = c17834a.f119071e;
        this.f119056e = c17834a.f119072f;
        this.f119057f = c17834a.f119073g;
        this.f119058g = c17834a.f119074h;
        this.f119059h = c17834a.f119075i;
        this.f119060i = c17834a.f119076j;
        this.f119061j = c17834a.f119077k;
        this.f119062k = c17834a.f119078l;
        this.f119063l = c17834a.f119079m;
        this.f119064m = c17834a.f119081o;
        this.f119065n = c17834a.f119080n;
        this.f119066o = c17834a.f119082p;
        this.f119067p = c17834a.f119083q;
        this.f119068q = c17834a.f119069c;
    }

    /* JADX INFO: renamed from: c */
    public static C17834a m142568c(int i) {
        return new C17834a(i);
    }

    @Override // p149l.xj2
    /* JADX INFO: renamed from: a */
    public int mo142569a() {
        return this.f119054c;
    }

    /* JADX INFO: renamed from: b */
    public CommonH5Builder.BgType m142570b() {
        return this.f119057f;
    }

    /* JADX INFO: renamed from: d */
    public d30 m142571d() {
        return this.f119061j;
    }

    /* JADX INFO: renamed from: e */
    public String m142572e() {
        return this.f119062k;
    }

    /* JADX INFO: renamed from: f */
    public int m142573f() {
        return this.f119065n;
    }

    /* JADX INFO: renamed from: g */
    public String m142574g() {
        return this.f119063l;
    }

    /* JADX INFO: renamed from: h */
    public int m142575h() {
        return this.f119058g;
    }

    /* JADX INFO: renamed from: i */
    public boolean m142576i() {
        return this.f119066o;
    }

    /* JADX INFO: renamed from: j */
    public boolean m142577j() {
        return this.f119064m;
    }

    /* JADX INFO: renamed from: k */
    public boolean m142578k() {
        return this.f119056e;
    }

    /* JADX INFO: renamed from: l */
    public boolean m142579l() {
        return this.f119068q;
    }

    /* JADX INFO: renamed from: m */
    public int[] m142580m() {
        return this.f119059h;
    }

    /* JADX INFO: renamed from: n */
    public String m142581n() {
        return this.f119055d;
    }
}
