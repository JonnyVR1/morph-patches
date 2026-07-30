package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.data.BLiveCampaign;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.CommonH5Builder;

/* JADX INFO: loaded from: classes9.dex */
public class ypu extends fk2 {

    /* JADX INFO: renamed from: c */
    public final int f201104c;

    /* JADX INFO: renamed from: d */
    public final String f201105d;

    /* JADX INFO: renamed from: e */
    public final boolean f201106e;

    /* JADX INFO: renamed from: f */
    public final CommonH5Builder.BgType f201107f;

    /* JADX INFO: renamed from: g */
    public final int f201108g;

    /* JADX INFO: renamed from: h */
    public final int[] f201109h;

    /* JADX INFO: renamed from: i */
    public final y20<Boolean> f201110i;

    /* JADX INFO: renamed from: j */
    public final x20 f201111j;

    /* JADX INFO: renamed from: k */
    public String f201112k;

    /* JADX INFO: renamed from: l */
    public String f201113l;

    /* JADX INFO: renamed from: m */
    public boolean f201114m;

    /* JADX INFO: renamed from: n */
    public int f201115n;

    /* JADX INFO: renamed from: o */
    public boolean f201116o;

    /* JADX INFO: renamed from: l.ypu$a */
    public static class C21662a extends gk2 {

        /* JADX INFO: renamed from: c */
        public int f201117c;

        /* JADX INFO: renamed from: d */
        public String f201118d;

        /* JADX INFO: renamed from: e */
        public boolean f201119e;

        /* JADX INFO: renamed from: f */
        public CommonH5Builder.BgType f201120f;

        /* JADX INFO: renamed from: g */
        public int f201121g;

        /* JADX INFO: renamed from: h */
        public int[] f201122h;

        /* JADX INFO: renamed from: i */
        public y20<Boolean> f201123i;

        /* JADX INFO: renamed from: j */
        public x20 f201124j;

        /* JADX INFO: renamed from: k */
        public String f201125k;

        /* JADX INFO: renamed from: l */
        public String f201126l;

        /* JADX INFO: renamed from: m */
        public int f201127m;

        /* JADX INFO: renamed from: n */
        public boolean f201128n;

        /* JADX INFO: renamed from: o */
        public boolean f201129o;

        public C21662a(int i) {
            super(i);
            this.f201118d = "";
            this.f201122h = new int[]{(int) (ynp0.m216939p() * 0.86f), 0};
            this.f201127m = 0;
            this.f201129o = false;
            this.f201117c = i;
            this.f201122h[1] = (int) (bnl0.m105588w0() * 0.75f);
            this.f201121g = 17;
            this.f201120f = CommonH5Builder.BgType.DEFAULT_BG;
        }

        /* JADX INFO: renamed from: n */
        public C21662a m217058n(CommonH5Builder.BgType bgType) {
            this.f201120f = bgType;
            return this;
        }

        /* JADX INFO: renamed from: o */
        public ypu m217059o() {
            TextUtils.isEmpty(this.f201118d);
            return new ypu(this);
        }

        /* JADX INFO: renamed from: p */
        public C21662a m217060p(BLiveCampaign bLiveCampaign) {
            this.f201118d = bLiveCampaign.detailUrl;
            m217064t(bLiveCampaign.detailInset.get(0).doubleValue(), bLiveCampaign.detailInset.get(1).doubleValue());
            this.f201121g = bLiveCampaign.detailGravity == 1 ? 80 : 17;
            m217058n(bLiveCampaign.webBgType);
            this.f201125k = bLiveCampaign.campaignType;
            this.f201126l = bLiveCampaign.f45196id;
            this.f201119e = bLiveCampaign.isNeedCloseBtn;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public C21662a m217061q(int i) {
            this.f201127m = i;
            return this;
        }

        /* JADX INFO: renamed from: r */
        public C21662a m217062r(int i) {
            this.f201121g = i;
            if (i == 80) {
                int[] iArr = this.f201122h;
                if (iArr[0] == 0 || iArr[1] == 0) {
                    iArr[0] = ynp0.m216939p();
                    this.f201122h[1] = (int) (bnl0.m105588w0() * 0.75f);
                }
            }
            return this;
        }

        /* JADX INFO: renamed from: s */
        public C21662a m217063s() {
            this.f201119e = true;
            return this;
        }

        /* JADX INFO: renamed from: t */
        public C21662a m217064t(double d, double d2) {
            this.f201122h[0] = (int) Math.round(((double) ynp0.m216939p()) * d);
            this.f201122h[1] = (int) Math.round(((double) (bnl0.m105588w0() + bnl0.m105511F0())) * d2);
            this.f201129o = d2 == 1.0d;
            return this;
        }

        /* JADX INFO: renamed from: u */
        public C21662a m217065u(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.f201118d = str;
            }
            return this;
        }
    }

    public ypu(C21662a c21662a) {
        super(c21662a);
        this.f201104c = c21662a.f201117c;
        this.f201105d = c21662a.f201118d;
        this.f201106e = c21662a.f201119e;
        this.f201107f = c21662a.f201120f;
        this.f201108g = c21662a.f201121g;
        this.f201109h = c21662a.f201122h;
        this.f201110i = c21662a.f201123i;
        this.f201111j = c21662a.f201124j;
        this.f201112k = c21662a.f201125k;
        this.f201113l = c21662a.f201126l;
        this.f201114m = c21662a.f201128n;
        this.f201115n = c21662a.f201127m;
        this.f201116o = c21662a.f201129o;
    }

    /* JADX INFO: renamed from: c */
    public static C21662a m217033c(int i) {
        return new C21662a(i);
    }

    @Override // p153l.fk2
    /* JADX INFO: renamed from: a */
    public int mo125930a() {
        return this.f201104c;
    }

    /* JADX INFO: renamed from: b */
    public CommonH5Builder.BgType m217034b() {
        return this.f201107f;
    }

    /* JADX INFO: renamed from: d */
    public x20 m217035d() {
        return this.f201111j;
    }

    /* JADX INFO: renamed from: e */
    public String m217036e() {
        return this.f201112k;
    }

    /* JADX INFO: renamed from: f */
    public int m217037f() {
        return this.f201115n;
    }

    /* JADX INFO: renamed from: g */
    public String m217038g() {
        return this.f201113l;
    }

    /* JADX INFO: renamed from: h */
    public int m217039h() {
        return this.f201108g;
    }

    /* JADX INFO: renamed from: i */
    public boolean m217040i() {
        return this.f201116o;
    }

    /* JADX INFO: renamed from: j */
    public boolean m217041j() {
        return this.f201114m;
    }

    /* JADX INFO: renamed from: k */
    public boolean m217042k() {
        return this.f201106e;
    }

    /* JADX INFO: renamed from: l */
    public int[] m217043l() {
        return this.f201109h;
    }

    /* JADX INFO: renamed from: m */
    public String m217044m() {
        return this.f201105d;
    }
}
