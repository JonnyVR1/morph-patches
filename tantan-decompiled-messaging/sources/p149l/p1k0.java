package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.data.LiveFansClubLevel;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveAnchorLevel;
import com.p046p1.mobile.putong.live.base.data.BLiveBoardGuard;
import com.p046p1.mobile.putong.live.base.data.BLiveFansMemberNum;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftShowcaseItem;
import com.p046p1.mobile.putong.live.base.data.BLiveIntlMedalWallInUserCard;
import com.p046p1.mobile.putong.live.base.data.BLiveUserCardGiftWall;
import com.p046p1.mobile.putong.live.base.data.BLiveUserFamilyCard;
import com.p046p1.mobile.putong.live.base.data.BLiveUserLevel;
import com.p046p1.mobile.putong.live.base.data.BLiveUserProfileConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveUserProfileConfigHierarchy;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCallInvite;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCpHouseInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceFollowship;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceGiftWallBrief;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceHouseRankUpgradeInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceUserProfileBanners;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceUserProfileConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveWeekCpInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class p1k0 {

    /* JADX INFO: renamed from: a */
    public BLiveUserProfileConfig f146686a;

    /* JADX INFO: renamed from: b */
    public BLiveVoiceUserProfileConfig f146687b;

    /* JADX INFO: renamed from: c */
    public final mqv<User> f146688c;

    /* JADX INFO: renamed from: d */
    public List<BLiveGiftShowcaseItem> f146689d;

    /* JADX INFO: renamed from: e */
    public List<User> f146690e;

    /* JADX INFO: renamed from: f */
    public List<BLiveVoiceCallInvite> f146691f;

    /* JADX INFO: renamed from: g */
    public final String f146692g;

    /* JADX INFO: renamed from: h */
    public BLiveUserLevel f146693h;

    /* JADX INFO: renamed from: i */
    public BLiveAnchorLevel f146694i;

    /* JADX INFO: renamed from: j */
    public LiveFansClubLevel f146695j;

    /* JADX INFO: renamed from: k */
    public BLiveUserProfileConfigHierarchy f146696k;

    /* JADX INFO: renamed from: l */
    public BLiveUserProfileConfigHierarchy f146697l;

    /* JADX INFO: renamed from: m */
    public List<BLiveVoiceUserProfileBanners> f146698m;

    /* JADX INFO: renamed from: n */
    public BLiveVoiceHouseRankUpgradeInfo f146699n;

    /* JADX INFO: renamed from: o */
    public BLiveVoiceGiftWallBrief f146700o;

    /* JADX INFO: renamed from: p */
    public BLiveVoiceFollowship f146701p;

    /* JADX INFO: renamed from: q */
    public List<BLiveGiftShowcaseItem> f146702q;

    /* JADX INFO: renamed from: r */
    public BLiveWeekCpInfo f146703r;

    /* JADX INFO: renamed from: s */
    public BLiveUserProfileConfigHierarchy f146704s;

    /* JADX INFO: renamed from: t */
    public BLiveIntlMedalWallInUserCard f146705t;

    /* JADX INFO: renamed from: u */
    public BLiveFansMemberNum f146706u;

    /* JADX INFO: renamed from: v */
    public BLiveUserFamilyCard f146707v;

    /* JADX INFO: renamed from: w */
    public BLiveBoardGuard f146708w;

    /* JADX INFO: renamed from: x */
    public List<BLiveUserCardGiftWall> f146709x;

    public p1k0(mqv<User> mqvVar, BLiveVoiceUserProfileConfig bLiveVoiceUserProfileConfig, BLiveUserLevel bLiveUserLevel, BLiveAnchorLevel bLiveAnchorLevel, List<BLiveGiftShowcaseItem> list, List<User> list2, List<BLiveVoiceCallInvite> list3, BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy, BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy2, List<BLiveVoiceUserProfileBanners> list4, BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy3) {
        this.f146692g = "voice";
        this.f146688c = mqvVar;
        this.f146687b = bLiveVoiceUserProfileConfig;
        this.f146693h = bLiveUserLevel;
        this.f146694i = bLiveAnchorLevel;
        this.f146689d = list;
        this.f146690e = list2;
        this.f146691f = list3;
        this.f146696k = bLiveUserProfileConfigHierarchy;
        this.f146697l = bLiveUserProfileConfigHierarchy2;
        this.f146698m = list4;
        this.f146704s = bLiveUserProfileConfigHierarchy3;
    }

    /* JADX INFO: renamed from: A */
    public void m167075A(List<BLiveGiftShowcaseItem> list) {
        this.f146702q = list;
    }

    /* JADX INFO: renamed from: B */
    public void m167076B(List<BLiveUserCardGiftWall> list) {
        this.f146709x = list;
    }

    /* JADX INFO: renamed from: C */
    public void m167077C(BLiveIntlMedalWallInUserCard bLiveIntlMedalWallInUserCard) {
        this.f146705t = bLiveIntlMedalWallInUserCard;
    }

    /* JADX INFO: renamed from: D */
    public void m167078D(BLiveFansMemberNum bLiveFansMemberNum) {
        this.f146706u = bLiveFansMemberNum;
    }

    /* JADX INFO: renamed from: E */
    public p1k0 m167079E(BLiveVoiceFollowship bLiveVoiceFollowship) {
        this.f146701p = bLiveVoiceFollowship;
        return this;
    }

    /* JADX INFO: renamed from: F */
    public void m167080F(BLiveVoiceGiftWallBrief bLiveVoiceGiftWallBrief) {
        this.f146700o = bLiveVoiceGiftWallBrief;
    }

    /* JADX INFO: renamed from: G */
    public void m167081G(BLiveWeekCpInfo bLiveWeekCpInfo) {
        this.f146703r = bLiveWeekCpInfo;
    }

    /* JADX INFO: renamed from: b */
    public void m167082b(BLiveVoiceCallInvite bLiveVoiceCallInvite) {
        if (bLiveVoiceCallInvite == null) {
            return;
        }
        if (this.f146691f == null) {
            this.f146691f = new ArrayList();
        }
        this.f146691f.add(bLiveVoiceCallInvite);
    }

    /* JADX INFO: renamed from: c */
    public boolean m167083c(final String str) {
        return vwb.m200337m(this.f146691f, new w9j() { // from class: l.o1k0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveVoiceCallInvite) obj).f44487to.equals(str));
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public BLiveUserProfileConfigHierarchy m167084d() {
        return this.f146697l;
    }

    /* JADX INFO: renamed from: e */
    public BLiveAnchorLevel m167085e() {
        return this.f146694i;
    }

    /* JADX INFO: renamed from: f */
    public BLiveBoardGuard m167086f() {
        return this.f146708w;
    }

    /* JADX INFO: renamed from: g */
    public BLiveVoiceHouseRankUpgradeInfo m167087g() {
        return this.f146699n;
    }

    /* JADX INFO: renamed from: h */
    public BLiveUserFamilyCard m167088h() {
        return this.f146707v;
    }

    /* JADX INFO: renamed from: i */
    public List<BLiveUserCardGiftWall> m167089i() {
        return this.f146709x;
    }

    /* JADX INFO: renamed from: j */
    public BLiveUserLevel m167090j() {
        return this.f146693h;
    }

    /* JADX INFO: renamed from: k */
    public LiveFansClubLevel m167091k() {
        return this.f146695j;
    }

    /* JADX INFO: renamed from: l */
    public BLiveIntlMedalWallInUserCard m167092l() {
        return this.f146705t;
    }

    /* JADX INFO: renamed from: m */
    public BLiveUserProfileConfig m167093m() {
        return this.f146686a;
    }

    /* JADX INFO: renamed from: n */
    public BLiveUserProfileConfigHierarchy m167094n() {
        return this.f146704s;
    }

    /* JADX INFO: renamed from: o */
    public mqv<User> m167095o() {
        return this.f146688c;
    }

    /* JADX INFO: renamed from: p */
    public BLiveUserProfileConfigHierarchy m167096p() {
        return this.f146696k;
    }

    /* JADX INFO: renamed from: q */
    public BLiveFansMemberNum m167097q() {
        return this.f146706u;
    }

    /* JADX INFO: renamed from: r */
    public BLiveVoiceUserProfileConfig m167098r() {
        return this.f146687b;
    }

    /* JADX INFO: renamed from: s */
    public BLiveWeekCpInfo m167099s() {
        return this.f146703r;
    }

    /* JADX INFO: renamed from: t */
    public boolean m167100t() {
        BLiveVoiceUserProfileConfig bLiveVoiceUserProfileConfig = this.f146687b;
        return (bLiveVoiceUserProfileConfig == null || vwb.m200296J(bLiveVoiceUserProfileConfig.middleCards)) ? false : true;
    }

    /* JADX INFO: renamed from: u */
    public boolean m167101u() {
        BLiveVoiceUserProfileConfig bLiveVoiceUserProfileConfig = this.f146687b;
        return (bLiveVoiceUserProfileConfig == null || TextUtils.isEmpty(bLiveVoiceUserProfileConfig.guildId)) ? false : true;
    }

    /* JADX INFO: renamed from: v */
    public boolean m167102v() {
        BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo;
        BLiveVoiceHouseRankUpgradeInfo bLiveVoiceHouseRankUpgradeInfo = this.f146699n;
        return (bLiveVoiceHouseRankUpgradeInfo == null || (bLiveVoiceCpHouseInfo = bLiveVoiceHouseRankUpgradeInfo.maxRankHouseInfo) == null || TextUtils.isEmpty(bLiveVoiceCpHouseInfo.houseId)) ? false : true;
    }

    /* JADX INFO: renamed from: w */
    public boolean m167103w() {
        BLiveIntlMedalWallInUserCard bLiveIntlMedalWallInUserCard = this.f146705t;
        return (bLiveIntlMedalWallInUserCard == null || TextUtils.isEmpty(bLiveIntlMedalWallInUserCard.title)) ? false : true;
    }

    /* JADX INFO: renamed from: x */
    public void m167104x(BLiveBoardGuard bLiveBoardGuard) {
        this.f146708w = bLiveBoardGuard;
    }

    /* JADX INFO: renamed from: y */
    public void m167105y(BLiveVoiceHouseRankUpgradeInfo bLiveVoiceHouseRankUpgradeInfo) {
        this.f146699n = bLiveVoiceHouseRankUpgradeInfo;
    }

    /* JADX INFO: renamed from: z */
    public void m167106z(BLiveUserFamilyCard bLiveUserFamilyCard) {
        this.f146707v = bLiveUserFamilyCard;
    }

    public p1k0(mqv<User> mqvVar, BLiveUserProfileConfig bLiveUserProfileConfig, BLiveUserLevel bLiveUserLevel, BLiveAnchorLevel bLiveAnchorLevel, LiveFansClubLevel liveFansClubLevel) {
        this.f146692g = "normal";
        this.f146688c = mqvVar;
        this.f146686a = bLiveUserProfileConfig;
        this.f146693h = bLiveUserLevel;
        this.f146694i = bLiveAnchorLevel;
        this.f146695j = liveFansClubLevel;
    }
}
