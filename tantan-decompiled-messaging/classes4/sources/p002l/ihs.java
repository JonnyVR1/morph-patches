package p002l;

import android.text.TextUtils;
import com.p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import java.util.List;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ihs {

    /* JADX INFO: renamed from: a */
    public BLiveGiftItem f13248a;

    /* JADX INFO: renamed from: b */
    public final String f13249b;

    /* JADX INFO: renamed from: c */
    public boolean f13250c;

    /* JADX INFO: renamed from: e */
    public BLiveGivenGiftBrief f13252e;

    /* JADX INFO: renamed from: f */
    public final String f13253f;

    /* JADX INFO: renamed from: g */
    public final String f13254g;

    /* JADX INFO: renamed from: h */
    public int[] f13255h;

    /* JADX INFO: renamed from: i */
    public boolean f13256i;

    /* JADX INFO: renamed from: d */
    public int f13251d = 0;

    /* JADX INFO: renamed from: j */
    public boolean f13257j = true;

    public ihs(BLiveGiftItem bLiveGiftItem, String str, String str2, String str3) {
        this.f13248a = bLiveGiftItem;
        this.f13249b = str;
        this.f13253f = str2;
        this.f13254g = str3;
    }

    /* JADX INFO: renamed from: A */
    public void m15152A(boolean z) {
        this.f13250c = z;
    }

    /* JADX INFO: renamed from: a */
    public boolean m15153a() {
        BLiveGivenGiftBrief bLiveGivenGiftBrief = this.f13252e;
        return (bLiveGivenGiftBrief == null || bLiveGivenGiftBrief.canStay) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public boolean m15154b() {
        BLiveGivenGiftBrief bLiveGivenGiftBrief = this.f13252e;
        return bLiveGivenGiftBrief != null && bLiveGivenGiftBrief.canResetGearPercent;
    }

    /* JADX INFO: renamed from: c */
    public boolean m15155c() {
        BLiveGivenGiftBrief bLiveGivenGiftBrief = this.f13252e;
        return bLiveGivenGiftBrief != null && bLiveGivenGiftBrief.canShowGearPercent;
    }

    /* JADX INFO: renamed from: d */
    public boolean m15156d() {
        return TextUtils.equals("GivenGiftAndShowComboGearMenu", this.f13248a.interactRules.click.action) && !vwb.J(this.f13248a.interactRules.click.combosGears);
    }

    /* JADX INFO: renamed from: e */
    public float m15157e() {
        float f = this.f13252e.gearPercent;
        if (f <= 0.0f) {
            return 1.0f;
        }
        return f;
    }

    /* JADX INFO: renamed from: f */
    public long m15158f() {
        return Math.max(this.f13248a.combosDuration, 3000L);
    }

    /* JADX INFO: renamed from: g */
    public BLiveGivenGiftBrief m15159g() {
        return this.f13252e;
    }

    /* JADX INFO: renamed from: h */
    public BLiveGiftItem m15160h() {
        return this.f13248a;
    }

    /* JADX INFO: renamed from: i */
    public String m15161i() {
        return mmj.m18043D(this.f13249b);
    }

    /* JADX INFO: renamed from: j */
    public int[] m15162j() {
        return this.f13255h;
    }

    /* JADX INFO: renamed from: k */
    public int m15163k() {
        return this.f13251d;
    }

    /* JADX INFO: renamed from: l */
    public boolean m15164l() {
        BLiveGiftItem bLiveGiftItem = this.f13248a;
        return bLiveGiftItem != null && bLiveGiftItem.hasEffectRes();
    }

    /* JADX INFO: renamed from: m */
    public boolean m15165m() {
        BLiveGiftItem bLiveGiftItem = this.f13248a;
        return (bLiveGiftItem == null || vwb.J(bLiveGiftItem.gear.gearEffects)) ? false : true;
    }

    /* JADX INFO: renamed from: n */
    public boolean m15166n() {
        return this.f13256i;
    }

    /* JADX INFO: renamed from: o */
    public boolean m15167o() {
        return this.f13257j;
    }

    /* JADX INFO: renamed from: p */
    public boolean m15168p() {
        return this.f13250c;
    }

    /* JADX INFO: renamed from: q */
    public boolean m15169q(ihs ihsVar) {
        return ihsVar != null && this.f13248a.id == ihsVar.m15160h().id;
    }

    /* JADX INFO: renamed from: r */
    public boolean m15170r() {
        BLiveGivenGiftBrief bLiveGivenGiftBrief = this.f13252e;
        return bLiveGivenGiftBrief != null && bLiveGivenGiftBrief.isAnimationWithStarCombo;
    }

    /* JADX INFO: renamed from: s */
    public boolean m15171s() {
        return this.f13248a.combosDuration <= 0;
    }

    /* JADX INFO: renamed from: t */
    public void m15172t(BLiveGiftItem bLiveGiftItem) {
        this.f13248a = bLiveGiftItem;
    }

    /* JADX INFO: renamed from: u */
    public void m15173u() {
        List list = this.f13252e.gearPercentInfo;
        list.set(0, 0);
        list.set(1, Integer.valueOf(this.f13252e.nextGearCnt));
    }

    /* JADX INFO: renamed from: v */
    public void m15174v(boolean z) {
        this.f13256i = z;
    }

    /* JADX INFO: renamed from: w */
    public void m15175w(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        this.f13252e = bLiveGivenGiftBrief;
    }

    /* JADX INFO: renamed from: x */
    public void m15176x(boolean z) {
        this.f13257j = z;
    }

    /* JADX INFO: renamed from: y */
    public void m15177y(int[] iArr) {
        this.f13255h = iArr;
    }

    /* JADX INFO: renamed from: z */
    public void m15178z(int i) {
        this.f13251d = i;
    }
}
