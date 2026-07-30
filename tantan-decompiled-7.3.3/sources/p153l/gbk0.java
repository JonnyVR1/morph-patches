package p153l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.data.Followship;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveAnchorLevel;
import com.p051p1.mobile.putong.live.base.data.BLiveData;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveFakeUserProfile;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftShowcaseItem;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p051p1.mobile.putong.live.base.data.BLiveUserLevel;
import com.p051p1.mobile.putong.live.base.data.BLiveUserProfileConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveUserProfileConfigHierarchy;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceUserProfileBanners;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceUserProfileConfig;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import java.util.ArrayList;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes4.dex */
public class gbk0 {
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ BLiveFakeUserProfile m129782b(BLiveEnvelope bLiveEnvelope) {
        if (bLiveEnvelope.data.fakeUserProfiles.isEmpty()) {
            return null;
        }
        return bLiveEnvelope.data.fakeUserProfiles.get(0);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m129787g(BLiveEnvelope bLiveEnvelope, ArrayList arrayList, final String str) {
        BLiveGiftShowcaseItem bLiveGiftShowcaseItem = (BLiveGiftShowcaseItem) jyb.m147529r(bLiveEnvelope.data.giftShowcaseItems, new qcj() { // from class: l.ebk0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveGiftShowcaseItem) obj).f45230id.equals(str));
            }
        });
        if (bLiveGiftShowcaseItem != null) {
            arrayList.add(bLiveGiftShowcaseItem);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final vak0 m129792l(BLiveEnvelope bLiveEnvelope, String str) {
        User userM123806g = f3t.m123806g(bLiveEnvelope, str);
        if (userM123806g == null) {
            return null;
        }
        userM123806g.localFollowship = jyb.m147479J(bLiveEnvelope.data.followships) ? Followship.new_() : bLiveEnvelope.data.followships.get(0);
        ((jfv) zrv.m221194l(htd0.f111520b)).m144714a(userM123806g);
        if (jyb.m147479J(bLiveEnvelope.data.userProfileConfig)) {
            return null;
        }
        BLiveUserProfileConfig bLiveUserProfileConfig = bLiveEnvelope.data.userProfileConfig.get(0);
        nsv<User> nsvVarM123805f = f3t.m123805f(bLiveEnvelope, str);
        htd0<hiv> htd0Var = htd0.f111521c;
        vak0 vak0Var = new vak0(nsvVarM123805f, bLiveUserProfileConfig, ((hiv) zrv.m221194l(htd0Var)).m135170v(userM123806g.hierarchy.grade), ((hiv) zrv.m221194l(htd0Var)).m135154f(userM123806g.anchorHierarchy.grade), userM123806g.fanbaseHierarchy);
        vak0Var.m200526G(bLiveEnvelope.data.weekCpInfo);
        vak0Var.m200551z(bLiveUserProfileConfig.familyCard);
        vak0Var.m200549x(bLiveEnvelope.data.guard);
        return vak0Var;
    }

    @Nullable
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final vak0 m129794n(final BLiveEnvelope bLiveEnvelope, String str, final boolean z) {
        BLiveUserLevel bLiveUserLevel;
        BLiveAnchorLevel bLiveAnchorLevel;
        BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy;
        BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy2;
        BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy3;
        User userM123806g = f3t.m123806g(bLiveEnvelope, str);
        BLiveUserLevel bLiveUserLevelM135170v = null;
        if (userM123806g == null) {
            return null;
        }
        userM123806g.localFollowship = jyb.m147479J(bLiveEnvelope.data.followships) ? Followship.new_() : bLiveEnvelope.data.followships.get(0);
        userM123806g.localRelationship = jyb.m147479J(bLiveEnvelope.data.relationships) ? Relationship.new_() : bLiveEnvelope.data.relationships.get(0);
        ((jfv) zrv.m221194l(htd0.f111520b)).m144714a(userM123806g);
        if (jyb.m147479J(bLiveEnvelope.data.voiceUserProfileConfigs)) {
            return null;
        }
        BLiveVoiceUserProfileConfig bLiveVoiceUserProfileConfig = bLiveEnvelope.data.voiceUserProfileConfigs.get(0);
        nsv<User> nsvVarM205184i = w6o0.m205184i(bLiveEnvelope, z, str);
        if (jyb.m147479J(bLiveVoiceUserProfileConfig.hierarchy)) {
            bLiveUserLevel = null;
            bLiveAnchorLevel = null;
            bLiveUserProfileConfigHierarchy = null;
            bLiveUserProfileConfigHierarchy2 = null;
            bLiveUserProfileConfigHierarchy3 = null;
        } else {
            BLiveAnchorLevel bLiveAnchorLevelM135154f = null;
            BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy4 = null;
            BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy5 = null;
            BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy6 = null;
            for (BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy7 : bLiveVoiceUserProfileConfig.hierarchy) {
                if ("user".equals(bLiveUserProfileConfigHierarchy7.type)) {
                    bLiveUserLevelM135170v = ((hiv) zrv.m221194l(htd0.f111521c)).m135170v(bLiveUserProfileConfigHierarchy7.grade);
                    bLiveUserProfileConfigHierarchy4 = bLiveUserProfileConfigHierarchy7;
                } else if ("anchor".equals(bLiveUserProfileConfigHierarchy7.type)) {
                    bLiveAnchorLevelM135154f = ((hiv) zrv.m221194l(htd0.f111521c)).m135154f(bLiveUserProfileConfigHierarchy7.grade);
                    bLiveUserProfileConfigHierarchy5 = bLiveUserProfileConfigHierarchy7;
                } else if ("starlight".equals(bLiveUserProfileConfigHierarchy7.type)) {
                    bLiveUserProfileConfigHierarchy6 = bLiveUserProfileConfigHierarchy7;
                }
            }
            bLiveUserProfileConfigHierarchy = bLiveUserProfileConfigHierarchy4;
            bLiveUserProfileConfigHierarchy2 = bLiveUserProfileConfigHierarchy5;
            bLiveUserProfileConfigHierarchy3 = bLiveUserProfileConfigHierarchy6;
            bLiveUserLevel = bLiveUserLevelM135170v;
            bLiveAnchorLevel = bLiveAnchorLevelM135154f;
        }
        jyb.m147537z(bLiveVoiceUserProfileConfig.banners, new y20() { // from class: l.abk0
            @Override // p153l.y20
            public final void call(Object obj) {
                BLiveVoiceUserProfileBanners bLiveVoiceUserProfileBanners = (BLiveVoiceUserProfileBanners) obj;
                jyb.m147537z(bLiveVoiceUserProfileBanners.userIds, new y20() { // from class: l.dbk0
                    @Override // p153l.y20
                    public final void call(Object obj2) {
                        bLiveVoiceUserProfileBanners.users.add(w6o0.m205185j(bLiveEnvelope, z, (String) obj2));
                    }
                });
            }
        });
        BLiveData bLiveData = bLiveEnvelope.data;
        vak0 vak0Var = new vak0(nsvVarM205184i, bLiveVoiceUserProfileConfig, bLiveUserLevel, bLiveAnchorLevel, bLiveData.giftShowcaseItems, bLiveData.users, bLiveData.voiceCallInvites, bLiveUserProfileConfigHierarchy, bLiveUserProfileConfigHierarchy2, bLiveVoiceUserProfileConfig.banners, bLiveUserProfileConfigHierarchy3);
        vak0Var.m200550y(bLiveEnvelope.data.voiceHouseRankUpgradeInfo);
        if (!jyb.m147479J(bLiveEnvelope.data.voiceFollowships)) {
            vak0Var.m200524E(bLiveEnvelope.data.voiceFollowships.get(0));
        }
        vak0Var.m200525F(bLiveEnvelope.data.voiceGiftWallBriefInfo);
        vak0Var.m200523D(bLiveEnvelope.data.voiceFanbase);
        if (!jyb.m147479J(bLiveVoiceUserProfileConfig.giftShowCaseItemIds) && !jyb.m147479J(bLiveEnvelope.data.giftShowcaseItems)) {
            final ArrayList arrayList = new ArrayList();
            jyb.m147537z(bLiveVoiceUserProfileConfig.giftShowCaseItemIds, new y20() { // from class: l.bbk0
                @Override // p153l.y20
                public final void call(Object obj) {
                    gbk0.m129787g(bLiveEnvelope, arrayList, (String) obj);
                }
            });
            vak0Var.m200520A(arrayList);
        }
        if (!TextUtils.isEmpty(bLiveEnvelope.data.intlMedalWall.title)) {
            vak0Var.m200522C(bLiveEnvelope.data.intlMedalWall);
        }
        vak0Var.m200551z(bLiveVoiceUserProfileConfig.familyCard);
        vak0Var.m200549x(bLiveEnvelope.data.guard);
        vak0Var.m200521B(bLiveEnvelope.data.giftWallV3Briefs);
        return vak0Var;
    }

    /* JADX INFO: renamed from: k */
    public C22421c<BLiveFakeUserProfile> m129791k(String str) {
        return LivingNormalApiProvider.m72649g7(str).map(new qcj() { // from class: l.fbk0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return gbk0.m129782b((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public C22421c<vak0> m129795o(final String str, @Nullable String str2, String str3, String str4, String str5, String str6, String str7, String str8, @Nullable BLiveMultiCall bLiveMultiCall) {
        return LivingNormalApiProvider.m72775u7(str, str2, str3, str4, str5, str6, str7, str8, bLiveMultiCall).map(new qcj() { // from class: l.yak0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f198220a.m129792l(str, (BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public C22421c<vak0> m129796p(final String str, @Nullable String str2, String str3, String str4, String str5, String str6, String str7, final boolean z) {
        return itv.m142092P(str, str2, str3, str4, str5, str6, str7, "").map(new qcj() { // from class: l.zak0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f203580a.m129793m(str, z, (BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public C22421c<vak0> m129797q(final String str, @Nullable String str2, String str3, String str4, String str5, String str6, String str7, final boolean z, String str8) {
        return itv.m142092P(str, str2, str3, str4, str5, str6, str7, str8).map(new qcj() { // from class: l.cbk0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f80829a.m129794n(str, z, (BLiveEnvelope) obj);
            }
        });
    }
}
