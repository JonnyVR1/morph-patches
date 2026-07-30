package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.data.LiveFansClubLevel;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveAnchorLevel;
import com.p051p1.mobile.putong.live.base.data.BLiveBoardGuard;
import com.p051p1.mobile.putong.live.base.data.BLiveFansMemberNum;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftShowcaseItem;
import com.p051p1.mobile.putong.live.base.data.BLiveIntlMedalWallInUserCard;
import com.p051p1.mobile.putong.live.base.data.BLiveUserCardGiftWall;
import com.p051p1.mobile.putong.live.base.data.BLiveUserFamilyCard;
import com.p051p1.mobile.putong.live.base.data.BLiveUserLevel;
import com.p051p1.mobile.putong.live.base.data.BLiveUserProfileConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveUserProfileConfigHierarchy;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCallInvite;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCpHouseInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceFollowship;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceGiftWallBrief;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceHouseRankUpgradeInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceUserProfileBanners;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceUserProfileConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveWeekCpInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class vak0 {

    /* JADX INFO: renamed from: a */
    public BLiveUserProfileConfig f183106a;

    /* JADX INFO: renamed from: b */
    public BLiveVoiceUserProfileConfig f183107b;

    /* JADX INFO: renamed from: c */
    public final nsv<User> f183108c;

    /* JADX INFO: renamed from: d */
    public List<BLiveGiftShowcaseItem> f183109d;

    /* JADX INFO: renamed from: e */
    public List<User> f183110e;

    /* JADX INFO: renamed from: f */
    public List<BLiveVoiceCallInvite> f183111f;

    /* JADX INFO: renamed from: g */
    public final String f183112g;

    /* JADX INFO: renamed from: h */
    public BLiveUserLevel f183113h;

    /* JADX INFO: renamed from: i */
    public BLiveAnchorLevel f183114i;

    /* JADX INFO: renamed from: j */
    public LiveFansClubLevel f183115j;

    /* JADX INFO: renamed from: k */
    public BLiveUserProfileConfigHierarchy f183116k;

    /* JADX INFO: renamed from: l */
    public BLiveUserProfileConfigHierarchy f183117l;

    /* JADX INFO: renamed from: m */
    public List<BLiveVoiceUserProfileBanners> f183118m;

    /* JADX INFO: renamed from: n */
    public BLiveVoiceHouseRankUpgradeInfo f183119n;

    /* JADX INFO: renamed from: o */
    public BLiveVoiceGiftWallBrief f183120o;

    /* JADX INFO: renamed from: p */
    public BLiveVoiceFollowship f183121p;

    /* JADX INFO: renamed from: q */
    public List<BLiveGiftShowcaseItem> f183122q;

    /* JADX INFO: renamed from: r */
    public BLiveWeekCpInfo f183123r;

    /* JADX INFO: renamed from: s */
    public BLiveUserProfileConfigHierarchy f183124s;

    /* JADX INFO: renamed from: t */
    public BLiveIntlMedalWallInUserCard f183125t;

    /* JADX INFO: renamed from: u */
    public BLiveFansMemberNum f183126u;

    /* JADX INFO: renamed from: v */
    public BLiveUserFamilyCard f183127v;

    /* JADX INFO: renamed from: w */
    public BLiveBoardGuard f183128w;

    /* JADX INFO: renamed from: x */
    public List<BLiveUserCardGiftWall> f183129x;

    public vak0(nsv<User> nsvVar, BLiveVoiceUserProfileConfig bLiveVoiceUserProfileConfig, BLiveUserLevel bLiveUserLevel, BLiveAnchorLevel bLiveAnchorLevel, List<BLiveGiftShowcaseItem> list, List<User> list2, List<BLiveVoiceCallInvite> list3, BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy, BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy2, List<BLiveVoiceUserProfileBanners> list4, BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy3) {
        this.f183112g = "voice";
        this.f183108c = nsvVar;
        this.f183107b = bLiveVoiceUserProfileConfig;
        this.f183113h = bLiveUserLevel;
        this.f183114i = bLiveAnchorLevel;
        this.f183109d = list;
        this.f183110e = list2;
        this.f183111f = list3;
        this.f183116k = bLiveUserProfileConfigHierarchy;
        this.f183117l = bLiveUserProfileConfigHierarchy2;
        this.f183118m = list4;
        this.f183124s = bLiveUserProfileConfigHierarchy3;
    }

    /* JADX INFO: renamed from: A */
    public void m200520A(List<BLiveGiftShowcaseItem> list) {
        this.f183122q = list;
    }

    /* JADX INFO: renamed from: B */
    public void m200521B(List<BLiveUserCardGiftWall> list) {
        this.f183129x = list;
    }

    /* JADX INFO: renamed from: C */
    public void m200522C(BLiveIntlMedalWallInUserCard bLiveIntlMedalWallInUserCard) {
        this.f183125t = bLiveIntlMedalWallInUserCard;
    }

    /* JADX INFO: renamed from: D */
    public void m200523D(BLiveFansMemberNum bLiveFansMemberNum) {
        this.f183126u = bLiveFansMemberNum;
    }

    /* JADX INFO: renamed from: E */
    public vak0 m200524E(BLiveVoiceFollowship bLiveVoiceFollowship) {
        this.f183121p = bLiveVoiceFollowship;
        return this;
    }

    /* JADX INFO: renamed from: F */
    public void m200525F(BLiveVoiceGiftWallBrief bLiveVoiceGiftWallBrief) {
        this.f183120o = bLiveVoiceGiftWallBrief;
    }

    /* JADX INFO: renamed from: G */
    public void m200526G(BLiveWeekCpInfo bLiveWeekCpInfo) {
        this.f183123r = bLiveWeekCpInfo;
    }

    /* JADX INFO: renamed from: b */
    public void m200527b(BLiveVoiceCallInvite bLiveVoiceCallInvite) {
        if (bLiveVoiceCallInvite == null) {
            return;
        }
        if (this.f183111f == null) {
            this.f183111f = new ArrayList();
        }
        this.f183111f.add(bLiveVoiceCallInvite);
    }

    /* JADX INFO: renamed from: c */
    public boolean m200528c(final String str) {
        return jyb.m147520m(this.f183111f, new qcj() { // from class: l.uak0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveVoiceCallInvite) obj).f45335to.equals(str));
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public BLiveUserProfileConfigHierarchy m200529d() {
        return this.f183117l;
    }

    /* JADX INFO: renamed from: e */
    public BLiveAnchorLevel m200530e() {
        return this.f183114i;
    }

    /* JADX INFO: renamed from: f */
    public BLiveBoardGuard m200531f() {
        return this.f183128w;
    }

    /* JADX INFO: renamed from: g */
    public BLiveVoiceHouseRankUpgradeInfo m200532g() {
        return this.f183119n;
    }

    /* JADX INFO: renamed from: h */
    public BLiveUserFamilyCard m200533h() {
        return this.f183127v;
    }

    /* JADX INFO: renamed from: i */
    public List<BLiveUserCardGiftWall> m200534i() {
        return this.f183129x;
    }

    /* JADX INFO: renamed from: j */
    public BLiveUserLevel m200535j() {
        return this.f183113h;
    }

    /* JADX INFO: renamed from: k */
    public LiveFansClubLevel m200536k() {
        return this.f183115j;
    }

    /* JADX INFO: renamed from: l */
    public BLiveIntlMedalWallInUserCard m200537l() {
        return this.f183125t;
    }

    /* JADX INFO: renamed from: m */
    public BLiveUserProfileConfig m200538m() {
        return this.f183106a;
    }

    /* JADX INFO: renamed from: n */
    public BLiveUserProfileConfigHierarchy m200539n() {
        return this.f183124s;
    }

    /* JADX INFO: renamed from: o */
    public nsv<User> m200540o() {
        return this.f183108c;
    }

    /* JADX INFO: renamed from: p */
    public BLiveUserProfileConfigHierarchy m200541p() {
        return this.f183116k;
    }

    /* JADX INFO: renamed from: q */
    public BLiveFansMemberNum m200542q() {
        return this.f183126u;
    }

    /* JADX INFO: renamed from: r */
    public BLiveVoiceUserProfileConfig m200543r() {
        return this.f183107b;
    }

    /* JADX INFO: renamed from: s */
    public BLiveWeekCpInfo m200544s() {
        return this.f183123r;
    }

    /* JADX INFO: renamed from: t */
    public boolean m200545t() {
        BLiveVoiceUserProfileConfig bLiveVoiceUserProfileConfig = this.f183107b;
        return (bLiveVoiceUserProfileConfig == null || jyb.m147479J(bLiveVoiceUserProfileConfig.middleCards)) ? false : true;
    }

    /* JADX INFO: renamed from: u */
    public boolean m200546u() {
        BLiveVoiceUserProfileConfig bLiveVoiceUserProfileConfig = this.f183107b;
        return (bLiveVoiceUserProfileConfig == null || TextUtils.isEmpty(bLiveVoiceUserProfileConfig.guildId)) ? false : true;
    }

    /* JADX INFO: renamed from: v */
    public boolean m200547v() {
        BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo;
        BLiveVoiceHouseRankUpgradeInfo bLiveVoiceHouseRankUpgradeInfo = this.f183119n;
        return (bLiveVoiceHouseRankUpgradeInfo == null || (bLiveVoiceCpHouseInfo = bLiveVoiceHouseRankUpgradeInfo.maxRankHouseInfo) == null || TextUtils.isEmpty(bLiveVoiceCpHouseInfo.houseId)) ? false : true;
    }

    /* JADX INFO: renamed from: w */
    public boolean m200548w() {
        BLiveIntlMedalWallInUserCard bLiveIntlMedalWallInUserCard = this.f183125t;
        return (bLiveIntlMedalWallInUserCard == null || TextUtils.isEmpty(bLiveIntlMedalWallInUserCard.title)) ? false : true;
    }

    /* JADX INFO: renamed from: x */
    public void m200549x(BLiveBoardGuard bLiveBoardGuard) {
        this.f183128w = bLiveBoardGuard;
    }

    /* JADX INFO: renamed from: y */
    public void m200550y(BLiveVoiceHouseRankUpgradeInfo bLiveVoiceHouseRankUpgradeInfo) {
        this.f183119n = bLiveVoiceHouseRankUpgradeInfo;
    }

    /* JADX INFO: renamed from: z */
    public void m200551z(BLiveUserFamilyCard bLiveUserFamilyCard) {
        this.f183127v = bLiveUserFamilyCard;
    }

    public vak0(nsv<User> nsvVar, BLiveUserProfileConfig bLiveUserProfileConfig, BLiveUserLevel bLiveUserLevel, BLiveAnchorLevel bLiveAnchorLevel, LiveFansClubLevel liveFansClubLevel) {
        this.f183112g = "normal";
        this.f183108c = nsvVar;
        this.f183106a = bLiveUserProfileConfig;
        this.f183113h = bLiveUserLevel;
        this.f183114i = bLiveAnchorLevel;
        this.f183115j = liveFansClubLevel;
    }
}
