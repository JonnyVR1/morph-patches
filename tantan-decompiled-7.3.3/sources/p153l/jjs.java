package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p051p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class jjs {

    /* JADX INFO: renamed from: a */
    public BLiveGiftItem f121227a;

    /* JADX INFO: renamed from: b */
    public final String f121228b;

    /* JADX INFO: renamed from: c */
    public boolean f121229c;

    /* JADX INFO: renamed from: e */
    public BLiveGivenGiftBrief f121231e;

    /* JADX INFO: renamed from: f */
    public final String f121232f;

    /* JADX INFO: renamed from: g */
    public final String f121233g;

    /* JADX INFO: renamed from: h */
    public int[] f121234h;

    /* JADX INFO: renamed from: i */
    public boolean f121235i;

    /* JADX INFO: renamed from: d */
    public int f121230d = 0;

    /* JADX INFO: renamed from: j */
    public boolean f121236j = true;

    public jjs(BLiveGiftItem bLiveGiftItem, String str, String str2, String str3) {
        this.f121227a = bLiveGiftItem;
        this.f121228b = str;
        this.f121232f = str2;
        this.f121233g = str3;
    }

    /* JADX INFO: renamed from: A */
    public void m145114A(boolean z) {
        this.f121229c = z;
    }

    /* JADX INFO: renamed from: a */
    public boolean m145115a() {
        BLiveGivenGiftBrief bLiveGivenGiftBrief = this.f121231e;
        return (bLiveGivenGiftBrief == null || bLiveGivenGiftBrief.canStay) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public boolean m145116b() {
        BLiveGivenGiftBrief bLiveGivenGiftBrief = this.f121231e;
        return bLiveGivenGiftBrief != null && bLiveGivenGiftBrief.canResetGearPercent;
    }

    /* JADX INFO: renamed from: c */
    public boolean m145117c() {
        BLiveGivenGiftBrief bLiveGivenGiftBrief = this.f121231e;
        return bLiveGivenGiftBrief != null && bLiveGivenGiftBrief.canShowGearPercent;
    }

    /* JADX INFO: renamed from: d */
    public boolean m145118d() {
        return TextUtils.equals("GivenGiftAndShowComboGearMenu", this.f121227a.interactRules.click.action) && !jyb.m147479J(this.f121227a.interactRules.click.combosGears);
    }

    /* JADX INFO: renamed from: e */
    public float m145119e() {
        float f = this.f121231e.gearPercent;
        if (f <= 0.0f) {
            return 1.0f;
        }
        return f;
    }

    /* JADX INFO: renamed from: f */
    public long m145120f() {
        return Math.max(this.f121227a.combosDuration, 3000L);
    }

    /* JADX INFO: renamed from: g */
    public BLiveGivenGiftBrief m145121g() {
        return this.f121231e;
    }

    /* JADX INFO: renamed from: h */
    public BLiveGiftItem m145122h() {
        return this.f121227a;
    }

    /* JADX INFO: renamed from: i */
    public String m145123i() {
        return cpj.m111768D(this.f121228b);
    }

    /* JADX INFO: renamed from: j */
    public int[] m145124j() {
        return this.f121234h;
    }

    /* JADX INFO: renamed from: k */
    public int m145125k() {
        return this.f121230d;
    }

    /* JADX INFO: renamed from: l */
    public boolean m145126l() {
        BLiveGiftItem bLiveGiftItem = this.f121227a;
        return bLiveGiftItem != null && bLiveGiftItem.hasEffectRes();
    }

    /* JADX INFO: renamed from: m */
    public boolean m145127m() {
        BLiveGiftItem bLiveGiftItem = this.f121227a;
        return (bLiveGiftItem == null || jyb.m147479J(bLiveGiftItem.gear.gearEffects)) ? false : true;
    }

    /* JADX INFO: renamed from: n */
    public boolean m145128n() {
        return this.f121235i;
    }

    /* JADX INFO: renamed from: o */
    public boolean m145129o() {
        return this.f121236j;
    }

    /* JADX INFO: renamed from: p */
    public boolean m145130p() {
        return this.f121229c;
    }

    /* JADX INFO: renamed from: q */
    public boolean m145131q(jjs jjsVar) {
        return jjsVar != null && this.f121227a.f45225id == jjsVar.m145122h().f45225id;
    }

    /* JADX INFO: renamed from: r */
    public boolean m145132r() {
        BLiveGivenGiftBrief bLiveGivenGiftBrief = this.f121231e;
        return bLiveGivenGiftBrief != null && bLiveGivenGiftBrief.isAnimationWithStarCombo;
    }

    /* JADX INFO: renamed from: s */
    public boolean m145133s() {
        return this.f121227a.combosDuration <= 0;
    }

    /* JADX INFO: renamed from: t */
    public void m145134t(BLiveGiftItem bLiveGiftItem) {
        this.f121227a = bLiveGiftItem;
    }

    /* JADX INFO: renamed from: u */
    public void m145135u() {
        List<Integer> list = this.f121231e.gearPercentInfo;
        list.set(0, 0);
        list.set(1, Integer.valueOf(this.f121231e.nextGearCnt));
    }

    /* JADX INFO: renamed from: v */
    public void m145136v(boolean z) {
        this.f121235i = z;
    }

    /* JADX INFO: renamed from: w */
    public void m145137w(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        this.f121231e = bLiveGivenGiftBrief;
    }

    /* JADX INFO: renamed from: x */
    public void m145138x(boolean z) {
        this.f121236j = z;
    }

    /* JADX INFO: renamed from: y */
    public void m145139y(int[] iArr) {
        this.f121234h = iArr;
    }

    /* JADX INFO: renamed from: z */
    public void m145140z(int i) {
        this.f121230d = i;
    }
}
