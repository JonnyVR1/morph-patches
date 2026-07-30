package p002l;

import android.text.TextUtils;
import com.p1.mobile.putong.live.base.data.BLiveCampaign;
import com.p1.mobile.putong.live.base.data.BLiveVoiceCampaign;
import com.p1.mobile.putong.ui.webview.mk.CommonH5Builder;
import l.d30;
import l.e30;
import l.uep0;
import l.vwb;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class jp50 extends xj2 {

    /* JADX INFO: renamed from: c */
    public final int f13894c;

    /* JADX INFO: renamed from: d */
    public final String f13895d;

    /* JADX INFO: renamed from: e */
    public final boolean f13896e;

    /* JADX INFO: renamed from: f */
    public final CommonH5Builder.BgType f13897f;

    /* JADX INFO: renamed from: g */
    public final int f13898g;

    /* JADX INFO: renamed from: h */
    public final int[] f13899h;

    /* JADX INFO: renamed from: i */
    public final e30<Boolean> f13900i;

    /* JADX INFO: renamed from: j */
    public final d30 f13901j;

    /* JADX INFO: renamed from: k */
    public String f13902k;

    /* JADX INFO: renamed from: l */
    public String f13903l;

    /* JADX INFO: renamed from: m */
    public boolean f13904m;

    /* JADX INFO: renamed from: n */
    public int f13905n;

    /* JADX INFO: renamed from: o */
    public boolean f13906o;

    /* JADX INFO: renamed from: p */
    public boolean f13907p;

    /* JADX INFO: renamed from: q */
    public boolean f13908q;

    /* JADX INFO: renamed from: l.jp50$a */
    public static class C0638a extends yj2 {

        /* JADX INFO: renamed from: c */
        public boolean f13909c;

        /* JADX INFO: renamed from: d */
        public int f13910d;

        /* JADX INFO: renamed from: e */
        public String f13911e;

        /* JADX INFO: renamed from: f */
        public boolean f13912f;

        /* JADX INFO: renamed from: g */
        public CommonH5Builder.BgType f13913g;

        /* JADX INFO: renamed from: h */
        public int f13914h;

        /* JADX INFO: renamed from: i */
        public int[] f13915i;

        /* JADX INFO: renamed from: j */
        public e30<Boolean> f13916j;

        /* JADX INFO: renamed from: k */
        public d30 f13917k;

        /* JADX INFO: renamed from: l */
        public String f13918l;

        /* JADX INFO: renamed from: m */
        public String f13919m;

        /* JADX INFO: renamed from: n */
        public int f13920n;

        /* JADX INFO: renamed from: o */
        public boolean f13921o;

        /* JADX INFO: renamed from: p */
        public boolean f13922p;

        /* JADX INFO: renamed from: q */
        public boolean f13923q;

        public C0638a(int i) {
            super(i);
            this.f13911e = "";
            this.f13915i = new int[]{(int) (uep0.p() * 0.86f), 0};
            this.f13920n = 0;
            this.f13922p = false;
            this.f13910d = i;
            this.f13915i[1] = (int) (xdl0.w0() * 0.75f);
            this.f13914h = 17;
            this.f13913g = CommonH5Builder.BgType.DEFAULT_BG;
        }

        /* JADX INFO: renamed from: A */
        public C0638a m16093A(int i, int i2) {
            int[] iArr = this.f13915i;
            iArr[0] = i;
            iArr[1] = i2;
            return this;
        }

        /* JADX INFO: renamed from: B */
        public C0638a m16094B(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.f13911e = str;
            }
            return this;
        }

        /* JADX INFO: renamed from: p */
        public C0638a m16095p(CommonH5Builder.BgType bgType) {
            this.f13913g = bgType;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public jp50 m16096q() {
            TextUtils.isEmpty(this.f13911e);
            return new jp50(this);
        }

        /* JADX INFO: renamed from: r */
        public C0638a m16097r(BLiveCampaign bLiveCampaign) {
            this.f13911e = bLiveCampaign.detailUrl;
            m16105z(((Double) bLiveCampaign.detailInset.get(0)).doubleValue(), ((Double) bLiveCampaign.detailInset.get(1)).doubleValue());
            this.f13914h = bLiveCampaign.detailGravity == 1 ? 80 : 17;
            m16095p(bLiveCampaign.webBgType);
            this.f13918l = bLiveCampaign.campaignType;
            this.f13919m = bLiveCampaign.id;
            this.f13912f = bLiveCampaign.isNeedCloseBtn;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public C0638a m16098s(int i) {
            this.f13920n = i;
            return this;
        }

        /* JADX INFO: renamed from: t */
        public C0638a m16099t(int i) {
            this.f13914h = i;
            if (i == 80) {
                int[] iArr = this.f13915i;
                if (iArr[0] == 0 || iArr[1] == 0) {
                    iArr[0] = uep0.p();
                    this.f13915i[1] = (int) (xdl0.w0() * 0.75f);
                }
            }
            return this;
        }

        /* JADX INFO: renamed from: u */
        public C0638a m16100u(boolean z) {
            this.f13923q = z;
            return this;
        }

        /* JADX INFO: renamed from: v */
        public C0638a m16101v() {
            this.f13921o = true;
            return this;
        }

        /* JADX INFO: renamed from: w */
        public C0638a m16102w(String str) {
            this.f13909c = TextUtils.equals("1", str);
            return this;
        }

        /* JADX INFO: renamed from: x */
        public C0638a m16103x() {
            this.f13912f = true;
            return this;
        }

        /* JADX INFO: renamed from: y */
        public C0638a m16104y(BLiveVoiceCampaign bLiveVoiceCampaign) {
            this.f13911e = bLiveVoiceCampaign.detailUrl;
            if (!vwb.J(bLiveVoiceCampaign.detailInset) && bLiveVoiceCampaign.detailInset.size() >= 2) {
                m16105z(((Integer) bLiveVoiceCampaign.detailInset.get(0)).intValue(), ((Integer) bLiveVoiceCampaign.detailInset.get(1)).intValue());
            }
            this.f13914h = bLiveVoiceCampaign.detailGravity == 1 ? 80 : 17;
            m16095p(bLiveVoiceCampaign.webBgType);
            this.f13918l = bLiveVoiceCampaign.campaignType;
            this.f13919m = bLiveVoiceCampaign.id;
            this.f13912f = bLiveVoiceCampaign.isNeedCloseBtn;
            return this;
        }

        /* JADX INFO: renamed from: z */
        public C0638a m16105z(double d, double d2) {
            this.f13915i[0] = (int) Math.round(((double) uep0.p()) * d);
            this.f13915i[1] = (int) Math.round(((double) (xdl0.w0() + xdl0.F0())) * d2);
            this.f13922p = d2 == 1.0d;
            return this;
        }
    }

    public jp50(C0638a c0638a) {
        super(c0638a);
        this.f13905n = 0;
        this.f13894c = c0638a.f13910d;
        this.f13895d = c0638a.f13911e;
        this.f13896e = c0638a.f13912f;
        this.f13897f = c0638a.f13913g;
        this.f13898g = c0638a.f13914h;
        this.f13899h = c0638a.f13915i;
        this.f13900i = c0638a.f13916j;
        this.f13901j = c0638a.f13917k;
        this.f13902k = c0638a.f13918l;
        this.f13903l = c0638a.f13919m;
        this.f13904m = c0638a.f13921o;
        this.f13905n = c0638a.f13920n;
        this.f13906o = c0638a.f13922p;
        this.f13907p = c0638a.f13923q;
        this.f13908q = c0638a.f13909c;
    }

    /* JADX INFO: renamed from: c */
    public static C0638a m16064c(int i) {
        return new C0638a(i);
    }

    @Override // p002l.xj2
    /* JADX INFO: renamed from: a */
    public int mo16065a() {
        return this.f13894c;
    }

    /* JADX INFO: renamed from: b */
    public CommonH5Builder.BgType m16066b() {
        return this.f13897f;
    }

    /* JADX INFO: renamed from: d */
    public d30 m16067d() {
        return this.f13901j;
    }

    /* JADX INFO: renamed from: e */
    public String m16068e() {
        return this.f13902k;
    }

    /* JADX INFO: renamed from: f */
    public int m16069f() {
        return this.f13905n;
    }

    /* JADX INFO: renamed from: g */
    public String m16070g() {
        return this.f13903l;
    }

    /* JADX INFO: renamed from: h */
    public int m16071h() {
        return this.f13898g;
    }

    /* JADX INFO: renamed from: i */
    public boolean m16072i() {
        return this.f13906o;
    }

    /* JADX INFO: renamed from: j */
    public boolean m16073j() {
        return this.f13904m;
    }

    /* JADX INFO: renamed from: k */
    public boolean m16074k() {
        return this.f13896e;
    }

    /* JADX INFO: renamed from: l */
    public boolean m16075l() {
        return this.f13908q;
    }

    /* JADX INFO: renamed from: m */
    public int[] m16076m() {
        return this.f13899h;
    }

    /* JADX INFO: renamed from: n */
    public String m16077n() {
        return this.f13895d;
    }
}
