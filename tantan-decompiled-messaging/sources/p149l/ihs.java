package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p046p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ihs {

    /* JADX INFO: renamed from: a */
    public BLiveGiftItem f113326a;

    /* JADX INFO: renamed from: b */
    public final String f113327b;

    /* JADX INFO: renamed from: c */
    public boolean f113328c;

    /* JADX INFO: renamed from: e */
    public BLiveGivenGiftBrief f113330e;

    /* JADX INFO: renamed from: f */
    public final String f113331f;

    /* JADX INFO: renamed from: g */
    public final String f113332g;

    /* JADX INFO: renamed from: h */
    public int[] f113333h;

    /* JADX INFO: renamed from: i */
    public boolean f113334i;

    /* JADX INFO: renamed from: d */
    public int f113329d = 0;

    /* JADX INFO: renamed from: j */
    public boolean f113335j = true;

    public ihs(BLiveGiftItem bLiveGiftItem, String str, String str2, String str3) {
        this.f113326a = bLiveGiftItem;
        this.f113327b = str;
        this.f113331f = str2;
        this.f113332g = str3;
    }

    /* JADX INFO: renamed from: A */
    public void m136275A(boolean z) {
        this.f113328c = z;
    }

    /* JADX INFO: renamed from: a */
    public boolean m136276a() {
        BLiveGivenGiftBrief bLiveGivenGiftBrief = this.f113330e;
        return (bLiveGivenGiftBrief == null || bLiveGivenGiftBrief.canStay) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public boolean m136277b() {
        BLiveGivenGiftBrief bLiveGivenGiftBrief = this.f113330e;
        return bLiveGivenGiftBrief != null && bLiveGivenGiftBrief.canResetGearPercent;
    }

    /* JADX INFO: renamed from: c */
    public boolean m136278c() {
        BLiveGivenGiftBrief bLiveGivenGiftBrief = this.f113330e;
        return bLiveGivenGiftBrief != null && bLiveGivenGiftBrief.canShowGearPercent;
    }

    /* JADX INFO: renamed from: d */
    public boolean m136279d() {
        return TextUtils.equals("GivenGiftAndShowComboGearMenu", this.f113326a.interactRules.click.action) && !vwb.m200296J(this.f113326a.interactRules.click.combosGears);
    }

    /* JADX INFO: renamed from: e */
    public float m136280e() {
        float f = this.f113330e.gearPercent;
        if (f <= 0.0f) {
            return 1.0f;
        }
        return f;
    }

    /* JADX INFO: renamed from: f */
    public long m136281f() {
        return Math.max(this.f113326a.combosDuration, 3000L);
    }

    /* JADX INFO: renamed from: g */
    public BLiveGivenGiftBrief m136282g() {
        return this.f113330e;
    }

    /* JADX INFO: renamed from: h */
    public BLiveGiftItem m136283h() {
        return this.f113326a;
    }

    /* JADX INFO: renamed from: i */
    public String m136284i() {
        return mmj.m155401D(this.f113327b);
    }

    /* JADX INFO: renamed from: j */
    public int[] m136285j() {
        return this.f113333h;
    }

    /* JADX INFO: renamed from: k */
    public int m136286k() {
        return this.f113329d;
    }

    /* JADX INFO: renamed from: l */
    public boolean m136287l() {
        BLiveGiftItem bLiveGiftItem = this.f113326a;
        return bLiveGiftItem != null && bLiveGiftItem.hasEffectRes();
    }

    /* JADX INFO: renamed from: m */
    public boolean m136288m() {
        BLiveGiftItem bLiveGiftItem = this.f113326a;
        return (bLiveGiftItem == null || vwb.m200296J(bLiveGiftItem.gear.gearEffects)) ? false : true;
    }

    /* JADX INFO: renamed from: n */
    public boolean m136289n() {
        return this.f113334i;
    }

    /* JADX INFO: renamed from: o */
    public boolean m136290o() {
        return this.f113335j;
    }

    /* JADX INFO: renamed from: p */
    public boolean m136291p() {
        return this.f113328c;
    }

    /* JADX INFO: renamed from: q */
    public boolean m136292q(ihs ihsVar) {
        return ihsVar != null && this.f113326a.f44377id == ihsVar.m136283h().f44377id;
    }

    /* JADX INFO: renamed from: r */
    public boolean m136293r() {
        BLiveGivenGiftBrief bLiveGivenGiftBrief = this.f113330e;
        return bLiveGivenGiftBrief != null && bLiveGivenGiftBrief.isAnimationWithStarCombo;
    }

    /* JADX INFO: renamed from: s */
    public boolean m136294s() {
        return this.f113326a.combosDuration <= 0;
    }

    /* JADX INFO: renamed from: t */
    public void m136295t(BLiveGiftItem bLiveGiftItem) {
        this.f113326a = bLiveGiftItem;
    }

    /* JADX INFO: renamed from: u */
    public void m136296u() {
        List<Integer> list = this.f113330e.gearPercentInfo;
        list.set(0, 0);
        list.set(1, Integer.valueOf(this.f113330e.nextGearCnt));
    }

    /* JADX INFO: renamed from: v */
    public void m136297v(boolean z) {
        this.f113334i = z;
    }

    /* JADX INFO: renamed from: w */
    public void m136298w(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        this.f113330e = bLiveGivenGiftBrief;
    }

    /* JADX INFO: renamed from: x */
    public void m136299x(boolean z) {
        this.f113335j = z;
    }

    /* JADX INFO: renamed from: y */
    public void m136300y(int[] iArr) {
        this.f113333h = iArr;
    }

    /* JADX INFO: renamed from: z */
    public void m136301z(int i) {
        this.f113329d = i;
    }
}
