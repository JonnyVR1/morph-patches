package p002l;

import android.text.TextUtils;
import com.p1.mobile.putong.data.LiveFansClubLevel;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.base.data.BLiveAnchorLevel;
import com.p1.mobile.putong.live.base.data.BLiveBoardGuard;
import com.p1.mobile.putong.live.base.data.BLiveFansMemberNum;
import com.p1.mobile.putong.live.base.data.BLiveGiftShowcaseItem;
import com.p1.mobile.putong.live.base.data.BLiveIntlMedalWallInUserCard;
import com.p1.mobile.putong.live.base.data.BLiveUserCardGiftWall;
import com.p1.mobile.putong.live.base.data.BLiveUserFamilyCard;
import com.p1.mobile.putong.live.base.data.BLiveUserLevel;
import com.p1.mobile.putong.live.base.data.BLiveUserProfileConfig;
import com.p1.mobile.putong.live.base.data.BLiveUserProfileConfigHierarchy;
import com.p1.mobile.putong.live.base.data.BLiveVoiceCallInvite;
import com.p1.mobile.putong.live.base.data.BLiveVoiceCpHouseInfo;
import com.p1.mobile.putong.live.base.data.BLiveVoiceFollowship;
import com.p1.mobile.putong.live.base.data.BLiveVoiceGiftWallBrief;
import com.p1.mobile.putong.live.base.data.BLiveVoiceHouseRankUpgradeInfo;
import com.p1.mobile.putong.live.base.data.BLiveVoiceUserProfileBanners;
import com.p1.mobile.putong.live.base.data.BLiveVoiceUserProfileConfig;
import com.p1.mobile.putong.live.base.data.BLiveWeekCpInfo;
import java.util.ArrayList;
import java.util.List;
import l.mqv;
import l.vwb;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class p1k0 {

    /* JADX INFO: renamed from: a */
    public BLiveUserProfileConfig f16957a;

    /* JADX INFO: renamed from: b */
    public BLiveVoiceUserProfileConfig f16958b;

    /* JADX INFO: renamed from: c */
    public final mqv<User> f16959c;

    /* JADX INFO: renamed from: d */
    public List<BLiveGiftShowcaseItem> f16960d;

    /* JADX INFO: renamed from: e */
    public List<User> f16961e;

    /* JADX INFO: renamed from: f */
    public List<BLiveVoiceCallInvite> f16962f;

    /* JADX INFO: renamed from: g */
    public final String f16963g;

    /* JADX INFO: renamed from: h */
    public BLiveUserLevel f16964h;

    /* JADX INFO: renamed from: i */
    public BLiveAnchorLevel f16965i;

    /* JADX INFO: renamed from: j */
    public LiveFansClubLevel f16966j;

    /* JADX INFO: renamed from: k */
    public BLiveUserProfileConfigHierarchy f16967k;

    /* JADX INFO: renamed from: l */
    public BLiveUserProfileConfigHierarchy f16968l;

    /* JADX INFO: renamed from: m */
    public List<BLiveVoiceUserProfileBanners> f16969m;

    /* JADX INFO: renamed from: n */
    public BLiveVoiceHouseRankUpgradeInfo f16970n;

    /* JADX INFO: renamed from: o */
    public BLiveVoiceGiftWallBrief f16971o;

    /* JADX INFO: renamed from: p */
    public BLiveVoiceFollowship f16972p;

    /* JADX INFO: renamed from: q */
    public List<BLiveGiftShowcaseItem> f16973q;

    /* JADX INFO: renamed from: r */
    public BLiveWeekCpInfo f16974r;

    /* JADX INFO: renamed from: s */
    public BLiveUserProfileConfigHierarchy f16975s;

    /* JADX INFO: renamed from: t */
    public BLiveIntlMedalWallInUserCard f16976t;

    /* JADX INFO: renamed from: u */
    public BLiveFansMemberNum f16977u;

    /* JADX INFO: renamed from: v */
    public BLiveUserFamilyCard f16978v;

    /* JADX INFO: renamed from: w */
    public BLiveBoardGuard f16979w;

    /* JADX INFO: renamed from: x */
    public List<BLiveUserCardGiftWall> f16980x;

    public p1k0(mqv<User> mqvVar, BLiveVoiceUserProfileConfig bLiveVoiceUserProfileConfig, BLiveUserLevel bLiveUserLevel, BLiveAnchorLevel bLiveAnchorLevel, List<BLiveGiftShowcaseItem> list, List<User> list2, List<BLiveVoiceCallInvite> list3, BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy, BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy2, List<BLiveVoiceUserProfileBanners> list4, BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy3) {
        this.f16963g = "voice";
        this.f16959c = mqvVar;
        this.f16958b = bLiveVoiceUserProfileConfig;
        this.f16964h = bLiveUserLevel;
        this.f16965i = bLiveAnchorLevel;
        this.f16960d = list;
        this.f16961e = list2;
        this.f16962f = list3;
        this.f16967k = bLiveUserProfileConfigHierarchy;
        this.f16968l = bLiveUserProfileConfigHierarchy2;
        this.f16969m = list4;
        this.f16975s = bLiveUserProfileConfigHierarchy3;
    }

    /* JADX INFO: renamed from: A */
    public void m19955A(List<BLiveGiftShowcaseItem> list) {
        this.f16973q = list;
    }

    /* JADX INFO: renamed from: B */
    public void m19956B(List<BLiveUserCardGiftWall> list) {
        this.f16980x = list;
    }

    /* JADX INFO: renamed from: C */
    public void m19957C(BLiveIntlMedalWallInUserCard bLiveIntlMedalWallInUserCard) {
        this.f16976t = bLiveIntlMedalWallInUserCard;
    }

    /* JADX INFO: renamed from: D */
    public void m19958D(BLiveFansMemberNum bLiveFansMemberNum) {
        this.f16977u = bLiveFansMemberNum;
    }

    /* JADX INFO: renamed from: E */
    public p1k0 m19959E(BLiveVoiceFollowship bLiveVoiceFollowship) {
        this.f16972p = bLiveVoiceFollowship;
        return this;
    }

    /* JADX INFO: renamed from: F */
    public void m19960F(BLiveVoiceGiftWallBrief bLiveVoiceGiftWallBrief) {
        this.f16971o = bLiveVoiceGiftWallBrief;
    }

    /* JADX INFO: renamed from: G */
    public void m19961G(BLiveWeekCpInfo bLiveWeekCpInfo) {
        this.f16974r = bLiveWeekCpInfo;
    }

    /* JADX INFO: renamed from: b */
    public void m19962b(BLiveVoiceCallInvite bLiveVoiceCallInvite) {
        if (bLiveVoiceCallInvite == null) {
            return;
        }
        if (this.f16962f == null) {
            this.f16962f = new ArrayList();
        }
        this.f16962f.add(bLiveVoiceCallInvite);
    }

    /* JADX INFO: renamed from: c */
    public boolean m19963c(final String str) {
        return vwb.m(this.f16962f, new w9j() { // from class: l.o1k0
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveVoiceCallInvite) obj).to.equals(str));
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public BLiveUserProfileConfigHierarchy m19964d() {
        return this.f16968l;
    }

    /* JADX INFO: renamed from: e */
    public BLiveAnchorLevel m19965e() {
        return this.f16965i;
    }

    /* JADX INFO: renamed from: f */
    public BLiveBoardGuard m19966f() {
        return this.f16979w;
    }

    /* JADX INFO: renamed from: g */
    public BLiveVoiceHouseRankUpgradeInfo m19967g() {
        return this.f16970n;
    }

    /* JADX INFO: renamed from: h */
    public BLiveUserFamilyCard m19968h() {
        return this.f16978v;
    }

    /* JADX INFO: renamed from: i */
    public List<BLiveUserCardGiftWall> m19969i() {
        return this.f16980x;
    }

    /* JADX INFO: renamed from: j */
    public BLiveUserLevel m19970j() {
        return this.f16964h;
    }

    /* JADX INFO: renamed from: k */
    public LiveFansClubLevel m19971k() {
        return this.f16966j;
    }

    /* JADX INFO: renamed from: l */
    public BLiveIntlMedalWallInUserCard m19972l() {
        return this.f16976t;
    }

    /* JADX INFO: renamed from: m */
    public BLiveUserProfileConfig m19973m() {
        return this.f16957a;
    }

    /* JADX INFO: renamed from: n */
    public BLiveUserProfileConfigHierarchy m19974n() {
        return this.f16975s;
    }

    /* JADX INFO: renamed from: o */
    public mqv<User> m19975o() {
        return this.f16959c;
    }

    /* JADX INFO: renamed from: p */
    public BLiveUserProfileConfigHierarchy m19976p() {
        return this.f16967k;
    }

    /* JADX INFO: renamed from: q */
    public BLiveFansMemberNum m19977q() {
        return this.f16977u;
    }

    /* JADX INFO: renamed from: r */
    public BLiveVoiceUserProfileConfig m19978r() {
        return this.f16958b;
    }

    /* JADX INFO: renamed from: s */
    public BLiveWeekCpInfo m19979s() {
        return this.f16974r;
    }

    /* JADX INFO: renamed from: t */
    public boolean m19980t() {
        BLiveVoiceUserProfileConfig bLiveVoiceUserProfileConfig = this.f16958b;
        return (bLiveVoiceUserProfileConfig == null || vwb.J(bLiveVoiceUserProfileConfig.middleCards)) ? false : true;
    }

    /* JADX INFO: renamed from: u */
    public boolean m19981u() {
        BLiveVoiceUserProfileConfig bLiveVoiceUserProfileConfig = this.f16958b;
        return (bLiveVoiceUserProfileConfig == null || TextUtils.isEmpty(bLiveVoiceUserProfileConfig.guildId)) ? false : true;
    }

    /* JADX INFO: renamed from: v */
    public boolean m19982v() {
        BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo;
        BLiveVoiceHouseRankUpgradeInfo bLiveVoiceHouseRankUpgradeInfo = this.f16970n;
        return (bLiveVoiceHouseRankUpgradeInfo == null || (bLiveVoiceCpHouseInfo = bLiveVoiceHouseRankUpgradeInfo.maxRankHouseInfo) == null || TextUtils.isEmpty(bLiveVoiceCpHouseInfo.houseId)) ? false : true;
    }

    /* JADX INFO: renamed from: w */
    public boolean m19983w() {
        BLiveIntlMedalWallInUserCard bLiveIntlMedalWallInUserCard = this.f16976t;
        return (bLiveIntlMedalWallInUserCard == null || TextUtils.isEmpty(bLiveIntlMedalWallInUserCard.title)) ? false : true;
    }

    /* JADX INFO: renamed from: x */
    public void m19984x(BLiveBoardGuard bLiveBoardGuard) {
        this.f16979w = bLiveBoardGuard;
    }

    /* JADX INFO: renamed from: y */
    public void m19985y(BLiveVoiceHouseRankUpgradeInfo bLiveVoiceHouseRankUpgradeInfo) {
        this.f16970n = bLiveVoiceHouseRankUpgradeInfo;
    }

    /* JADX INFO: renamed from: z */
    public void m19986z(BLiveUserFamilyCard bLiveUserFamilyCard) {
        this.f16978v = bLiveUserFamilyCard;
    }

    public p1k0(mqv<User> mqvVar, BLiveUserProfileConfig bLiveUserProfileConfig, BLiveUserLevel bLiveUserLevel, BLiveAnchorLevel bLiveAnchorLevel, LiveFansClubLevel liveFansClubLevel) {
        this.f16963g = "normal";
        this.f16959c = mqvVar;
        this.f16957a = bLiveUserProfileConfig;
        this.f16964h = bLiveUserLevel;
        this.f16965i = bLiveAnchorLevel;
        this.f16966j = liveFansClubLevel;
    }
}
