package p002l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p1.mobile.putong.data.Followship;
import com.p1.mobile.putong.data.Relationship;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.base.data.BLiveAnchorLevel;
import com.p1.mobile.putong.live.base.data.BLiveData;
import com.p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p1.mobile.putong.live.base.data.BLiveFakeUserProfile;
import com.p1.mobile.putong.live.base.data.BLiveGiftShowcaseItem;
import com.p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p1.mobile.putong.live.base.data.BLiveUserLevel;
import com.p1.mobile.putong.live.base.data.BLiveUserProfileConfig;
import com.p1.mobile.putong.live.base.data.BLiveUserProfileConfigHierarchy;
import com.p1.mobile.putong.live.base.data.BLiveVoiceFollowship;
import com.p1.mobile.putong.live.base.data.BLiveVoiceUserProfileBanners;
import com.p1.mobile.putong.live.base.data.BLiveVoiceUserProfileConfig;
import java.util.ArrayList;
import l.e30;
import l.fld0;
import l.ggv;
import l.idv;
import l.mqv;
import l.sxn0;
import l.vwb;
import l.w9j;
import l.ypv;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class a2k0 {
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ BLiveFakeUserProfile m9285b(BLiveEnvelope bLiveEnvelope) {
        if (bLiveEnvelope.data.fakeUserProfiles.isEmpty()) {
            return null;
        }
        return (BLiveFakeUserProfile) bLiveEnvelope.data.fakeUserProfiles.get(0);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m9290g(BLiveEnvelope bLiveEnvelope, ArrayList arrayList, final String str) {
        BLiveGiftShowcaseItem bLiveGiftShowcaseItem = (BLiveGiftShowcaseItem) vwb.r(bLiveEnvelope.data.giftShowcaseItems, new w9j() { // from class: l.y1k0
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveGiftShowcaseItem) obj).id.equals(str));
            }
        });
        if (bLiveGiftShowcaseItem != null) {
            arrayList.add(bLiveGiftShowcaseItem);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final p1k0 m9295l(BLiveEnvelope bLiveEnvelope, String str) {
        User userM12113g = e1t.m12113g(bLiveEnvelope, str);
        if (userM12113g == null) {
            return null;
        }
        userM12113g.localFollowship = vwb.J(bLiveEnvelope.data.followships) ? Followship.new_() : (Followship) bLiveEnvelope.data.followships.get(0);
        ((idv) ypv.l(fld0.b)).a(userM12113g);
        if (vwb.J(bLiveEnvelope.data.userProfileConfig)) {
            return null;
        }
        BLiveUserProfileConfig bLiveUserProfileConfig = (BLiveUserProfileConfig) bLiveEnvelope.data.userProfileConfig.get(0);
        mqv<User> mqvVarM12112f = e1t.m12112f(bLiveEnvelope, str);
        fld0 fld0Var = fld0.c;
        p1k0 p1k0Var = new p1k0(mqvVarM12112f, bLiveUserProfileConfig, ((ggv) ypv.l(fld0Var)).v(userM12113g.hierarchy.grade), ((ggv) ypv.l(fld0Var)).f(userM12113g.anchorHierarchy.grade), userM12113g.fanbaseHierarchy);
        p1k0Var.m19961G(bLiveEnvelope.data.weekCpInfo);
        p1k0Var.m19986z(bLiveUserProfileConfig.familyCard);
        p1k0Var.m19984x(bLiveEnvelope.data.guard);
        return p1k0Var;
    }

    @Nullable
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final p1k0 m9297n(final BLiveEnvelope bLiveEnvelope, String str, final boolean z) {
        BLiveUserLevel bLiveUserLevel;
        BLiveAnchorLevel bLiveAnchorLevel;
        BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy;
        BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy2;
        BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy3;
        User userM12113g = e1t.m12113g(bLiveEnvelope, str);
        BLiveUserLevel bLiveUserLevelV = null;
        if (userM12113g == null) {
            return null;
        }
        userM12113g.localFollowship = vwb.J(bLiveEnvelope.data.followships) ? Followship.new_() : (Followship) bLiveEnvelope.data.followships.get(0);
        userM12113g.localRelationship = vwb.J(bLiveEnvelope.data.relationships) ? Relationship.new_() : (Relationship) bLiveEnvelope.data.relationships.get(0);
        ((idv) ypv.l(fld0.b)).a(userM12113g);
        if (vwb.J(bLiveEnvelope.data.voiceUserProfileConfigs)) {
            return null;
        }
        BLiveVoiceUserProfileConfig bLiveVoiceUserProfileConfig = (BLiveVoiceUserProfileConfig) bLiveEnvelope.data.voiceUserProfileConfigs.get(0);
        mqv mqvVarI = sxn0.i(bLiveEnvelope, z, str);
        if (vwb.J(bLiveVoiceUserProfileConfig.hierarchy)) {
            bLiveUserLevel = null;
            bLiveAnchorLevel = null;
            bLiveUserProfileConfigHierarchy = null;
            bLiveUserProfileConfigHierarchy2 = null;
            bLiveUserProfileConfigHierarchy3 = null;
        } else {
            BLiveAnchorLevel bLiveAnchorLevelF = null;
            BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy4 = null;
            BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy5 = null;
            BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy6 = null;
            for (BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy7 : bLiveVoiceUserProfileConfig.hierarchy) {
                if ("user".equals(bLiveUserProfileConfigHierarchy7.type)) {
                    bLiveUserLevelV = ((ggv) ypv.l(fld0.c)).v(bLiveUserProfileConfigHierarchy7.grade);
                    bLiveUserProfileConfigHierarchy4 = bLiveUserProfileConfigHierarchy7;
                } else if ("anchor".equals(bLiveUserProfileConfigHierarchy7.type)) {
                    bLiveAnchorLevelF = ((ggv) ypv.l(fld0.c)).f(bLiveUserProfileConfigHierarchy7.grade);
                    bLiveUserProfileConfigHierarchy5 = bLiveUserProfileConfigHierarchy7;
                } else if ("starlight".equals(bLiveUserProfileConfigHierarchy7.type)) {
                    bLiveUserProfileConfigHierarchy6 = bLiveUserProfileConfigHierarchy7;
                }
            }
            bLiveUserProfileConfigHierarchy = bLiveUserProfileConfigHierarchy4;
            bLiveUserProfileConfigHierarchy2 = bLiveUserProfileConfigHierarchy5;
            bLiveUserProfileConfigHierarchy3 = bLiveUserProfileConfigHierarchy6;
            bLiveUserLevel = bLiveUserLevelV;
            bLiveAnchorLevel = bLiveAnchorLevelF;
        }
        vwb.z(bLiveVoiceUserProfileConfig.banners, new e30() { // from class: l.u1k0
            public final void call(Object obj) {
                BLiveVoiceUserProfileBanners bLiveVoiceUserProfileBanners = (BLiveVoiceUserProfileBanners) obj;
                vwb.z(bLiveVoiceUserProfileBanners.userIds, new e30() { // from class: l.x1k0
                    public final void call(Object obj2) {
                        bLiveVoiceUserProfileBanners.users.add(sxn0.j(bLiveEnvelope, z, (String) obj2));
                    }
                });
            }
        });
        BLiveData bLiveData = bLiveEnvelope.data;
        p1k0 p1k0Var = new p1k0(mqvVarI, bLiveVoiceUserProfileConfig, bLiveUserLevel, bLiveAnchorLevel, bLiveData.giftShowcaseItems, bLiveData.users, bLiveData.voiceCallInvites, bLiveUserProfileConfigHierarchy, bLiveUserProfileConfigHierarchy2, bLiveVoiceUserProfileConfig.banners, bLiveUserProfileConfigHierarchy3);
        p1k0Var.m19985y(bLiveEnvelope.data.voiceHouseRankUpgradeInfo);
        if (!vwb.J(bLiveEnvelope.data.voiceFollowships)) {
            p1k0Var.m19959E((BLiveVoiceFollowship) bLiveEnvelope.data.voiceFollowships.get(0));
        }
        p1k0Var.m19960F(bLiveEnvelope.data.voiceGiftWallBriefInfo);
        p1k0Var.m19958D(bLiveEnvelope.data.voiceFanbase);
        if (!vwb.J(bLiveVoiceUserProfileConfig.giftShowCaseItemIds) && !vwb.J(bLiveEnvelope.data.giftShowcaseItems)) {
            final ArrayList arrayList = new ArrayList();
            vwb.z(bLiveVoiceUserProfileConfig.giftShowCaseItemIds, new e30() { // from class: l.v1k0
                public final void call(Object obj) {
                    a2k0.m9290g(bLiveEnvelope, arrayList, (String) obj);
                }
            });
            p1k0Var.m19955A(arrayList);
        }
        if (!TextUtils.isEmpty(bLiveEnvelope.data.intlMedalWall.title)) {
            p1k0Var.m19957C(bLiveEnvelope.data.intlMedalWall);
        }
        p1k0Var.m19986z(bLiveVoiceUserProfileConfig.familyCard);
        p1k0Var.m19984x(bLiveEnvelope.data.guard);
        p1k0Var.m19956B(bLiveEnvelope.data.giftWallV3Briefs);
        return p1k0Var;
    }

    /* JADX INFO: renamed from: k */
    public c<BLiveFakeUserProfile> m9294k(String str) {
        return LivingNormalApiProvider.m4832g7(str).map(new w9j() { // from class: l.z1k0
            public final Object call(Object obj) {
                return a2k0.m9285b((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public c<p1k0> m9298o(final String str, @Nullable String str2, String str3, String str4, String str5, String str6, String str7, String str8, @Nullable BLiveMultiCall bLiveMultiCall) {
        return LivingNormalApiProvider.m4958u7(str, str2, str3, str4, str5, str6, str7, str8, bLiveMultiCall).map(new w9j() { // from class: l.s1k0
            public final Object call(Object obj) {
                return this.f18758a.m9295l(str, (BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public c<p1k0> m9299p(final String str, @Nullable String str2, String str3, String str4, String str5, String str6, String str7, final boolean z) {
        return hrv.m14769P(str, str2, str3, str4, str5, str6, str7, "").map(new w9j() { // from class: l.t1k0
            public final Object call(Object obj) {
                return this.f19362a.m9296m(str, z, (BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public c<p1k0> m9300q(final String str, @Nullable String str2, String str3, String str4, String str5, String str6, String str7, final boolean z, String str8) {
        return hrv.m14769P(str, str2, str3, str4, str5, str6, str7, str8).map(new w9j() { // from class: l.w1k0
            public final Object call(Object obj) {
                return this.f21414a.m9297n(str, z, (BLiveEnvelope) obj);
            }
        });
    }
}
