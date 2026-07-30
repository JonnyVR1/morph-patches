package p149l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.data.Followship;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveAnchorLevel;
import com.p046p1.mobile.putong.live.base.data.BLiveData;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveFakeUserProfile;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftShowcaseItem;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p046p1.mobile.putong.live.base.data.BLiveUserLevel;
import com.p046p1.mobile.putong.live.base.data.BLiveUserProfileConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveUserProfileConfigHierarchy;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceUserProfileBanners;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceUserProfileConfig;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import java.util.ArrayList;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes4.dex */
public class a2k0 {
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ BLiveFakeUserProfile m94604b(BLiveEnvelope bLiveEnvelope) {
        if (bLiveEnvelope.data.fakeUserProfiles.isEmpty()) {
            return null;
        }
        return bLiveEnvelope.data.fakeUserProfiles.get(0);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m94609g(BLiveEnvelope bLiveEnvelope, ArrayList arrayList, final String str) {
        BLiveGiftShowcaseItem bLiveGiftShowcaseItem = (BLiveGiftShowcaseItem) vwb.m200346r(bLiveEnvelope.data.giftShowcaseItems, new w9j() { // from class: l.y1k0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveGiftShowcaseItem) obj).f44382id.equals(str));
            }
        });
        if (bLiveGiftShowcaseItem != null) {
            arrayList.add(bLiveGiftShowcaseItem);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final p1k0 m94614l(BLiveEnvelope bLiveEnvelope, String str) {
        User userM114445g = e1t.m114445g(bLiveEnvelope, str);
        if (userM114445g == null) {
            return null;
        }
        userM114445g.localFollowship = vwb.m200296J(bLiveEnvelope.data.followships) ? Followship.new_() : bLiveEnvelope.data.followships.get(0);
        ((idv) ypv.m215673l(fld0.f98147b)).m135629a(userM114445g);
        if (vwb.m200296J(bLiveEnvelope.data.userProfileConfig)) {
            return null;
        }
        BLiveUserProfileConfig bLiveUserProfileConfig = bLiveEnvelope.data.userProfileConfig.get(0);
        mqv<User> mqvVarM114444f = e1t.m114444f(bLiveEnvelope, str);
        fld0<ggv> fld0Var = fld0.f98148c;
        p1k0 p1k0Var = new p1k0(mqvVarM114444f, bLiveUserProfileConfig, ((ggv) ypv.m215673l(fld0Var)).m126036v(userM114445g.hierarchy.grade), ((ggv) ypv.m215673l(fld0Var)).m126020f(userM114445g.anchorHierarchy.grade), userM114445g.fanbaseHierarchy);
        p1k0Var.m167081G(bLiveEnvelope.data.weekCpInfo);
        p1k0Var.m167106z(bLiveUserProfileConfig.familyCard);
        p1k0Var.m167104x(bLiveEnvelope.data.guard);
        return p1k0Var;
    }

    @Nullable
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final p1k0 m94616n(final BLiveEnvelope bLiveEnvelope, String str, final boolean z) {
        BLiveUserLevel bLiveUserLevel;
        BLiveAnchorLevel bLiveAnchorLevel;
        BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy;
        BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy2;
        BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy3;
        User userM114445g = e1t.m114445g(bLiveEnvelope, str);
        BLiveUserLevel bLiveUserLevelM126036v = null;
        if (userM114445g == null) {
            return null;
        }
        userM114445g.localFollowship = vwb.m200296J(bLiveEnvelope.data.followships) ? Followship.new_() : bLiveEnvelope.data.followships.get(0);
        userM114445g.localRelationship = vwb.m200296J(bLiveEnvelope.data.relationships) ? Relationship.new_() : bLiveEnvelope.data.relationships.get(0);
        ((idv) ypv.m215673l(fld0.f98147b)).m135629a(userM114445g);
        if (vwb.m200296J(bLiveEnvelope.data.voiceUserProfileConfigs)) {
            return null;
        }
        BLiveVoiceUserProfileConfig bLiveVoiceUserProfileConfig = bLiveEnvelope.data.voiceUserProfileConfigs.get(0);
        mqv<User> mqvVarM186522i = sxn0.m186522i(bLiveEnvelope, z, str);
        if (vwb.m200296J(bLiveVoiceUserProfileConfig.hierarchy)) {
            bLiveUserLevel = null;
            bLiveAnchorLevel = null;
            bLiveUserProfileConfigHierarchy = null;
            bLiveUserProfileConfigHierarchy2 = null;
            bLiveUserProfileConfigHierarchy3 = null;
        } else {
            BLiveAnchorLevel bLiveAnchorLevelM126020f = null;
            BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy4 = null;
            BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy5 = null;
            BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy6 = null;
            for (BLiveUserProfileConfigHierarchy bLiveUserProfileConfigHierarchy7 : bLiveVoiceUserProfileConfig.hierarchy) {
                if ("user".equals(bLiveUserProfileConfigHierarchy7.type)) {
                    bLiveUserLevelM126036v = ((ggv) ypv.m215673l(fld0.f98148c)).m126036v(bLiveUserProfileConfigHierarchy7.grade);
                    bLiveUserProfileConfigHierarchy4 = bLiveUserProfileConfigHierarchy7;
                } else if ("anchor".equals(bLiveUserProfileConfigHierarchy7.type)) {
                    bLiveAnchorLevelM126020f = ((ggv) ypv.m215673l(fld0.f98148c)).m126020f(bLiveUserProfileConfigHierarchy7.grade);
                    bLiveUserProfileConfigHierarchy5 = bLiveUserProfileConfigHierarchy7;
                } else if ("starlight".equals(bLiveUserProfileConfigHierarchy7.type)) {
                    bLiveUserProfileConfigHierarchy6 = bLiveUserProfileConfigHierarchy7;
                }
            }
            bLiveUserProfileConfigHierarchy = bLiveUserProfileConfigHierarchy4;
            bLiveUserProfileConfigHierarchy2 = bLiveUserProfileConfigHierarchy5;
            bLiveUserProfileConfigHierarchy3 = bLiveUserProfileConfigHierarchy6;
            bLiveUserLevel = bLiveUserLevelM126036v;
            bLiveAnchorLevel = bLiveAnchorLevelM126020f;
        }
        vwb.m200354z(bLiveVoiceUserProfileConfig.banners, new e30() { // from class: l.u1k0
            @Override // p149l.e30
            public final void call(Object obj) {
                BLiveVoiceUserProfileBanners bLiveVoiceUserProfileBanners = (BLiveVoiceUserProfileBanners) obj;
                vwb.m200354z(bLiveVoiceUserProfileBanners.userIds, new e30() { // from class: l.x1k0
                    @Override // p149l.e30
                    public final void call(Object obj2) {
                        bLiveVoiceUserProfileBanners.users.add(sxn0.m186523j(bLiveEnvelope, z, (String) obj2));
                    }
                });
            }
        });
        BLiveData bLiveData = bLiveEnvelope.data;
        p1k0 p1k0Var = new p1k0(mqvVarM186522i, bLiveVoiceUserProfileConfig, bLiveUserLevel, bLiveAnchorLevel, bLiveData.giftShowcaseItems, bLiveData.users, bLiveData.voiceCallInvites, bLiveUserProfileConfigHierarchy, bLiveUserProfileConfigHierarchy2, bLiveVoiceUserProfileConfig.banners, bLiveUserProfileConfigHierarchy3);
        p1k0Var.m167105y(bLiveEnvelope.data.voiceHouseRankUpgradeInfo);
        if (!vwb.m200296J(bLiveEnvelope.data.voiceFollowships)) {
            p1k0Var.m167079E(bLiveEnvelope.data.voiceFollowships.get(0));
        }
        p1k0Var.m167080F(bLiveEnvelope.data.voiceGiftWallBriefInfo);
        p1k0Var.m167078D(bLiveEnvelope.data.voiceFanbase);
        if (!vwb.m200296J(bLiveVoiceUserProfileConfig.giftShowCaseItemIds) && !vwb.m200296J(bLiveEnvelope.data.giftShowcaseItems)) {
            final ArrayList arrayList = new ArrayList();
            vwb.m200354z(bLiveVoiceUserProfileConfig.giftShowCaseItemIds, new e30() { // from class: l.v1k0
                @Override // p149l.e30
                public final void call(Object obj) {
                    a2k0.m94609g(bLiveEnvelope, arrayList, (String) obj);
                }
            });
            p1k0Var.m167075A(arrayList);
        }
        if (!TextUtils.isEmpty(bLiveEnvelope.data.intlMedalWall.title)) {
            p1k0Var.m167077C(bLiveEnvelope.data.intlMedalWall);
        }
        p1k0Var.m167106z(bLiveVoiceUserProfileConfig.familyCard);
        p1k0Var.m167104x(bLiveEnvelope.data.guard);
        p1k0Var.m167076B(bLiveEnvelope.data.giftWallV3Briefs);
        return p1k0Var;
    }

    /* JADX INFO: renamed from: k */
    public C22306c<BLiveFakeUserProfile> m94613k(String str) {
        return LivingNormalApiProvider.m71466g7(str).map(new w9j() { // from class: l.z1k0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return a2k0.m94604b((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public C22306c<p1k0> m94617o(final String str, @Nullable String str2, String str3, String str4, String str5, String str6, String str7, String str8, @Nullable BLiveMultiCall bLiveMultiCall) {
        return LivingNormalApiProvider.m71592u7(str, str2, str3, str4, str5, str6, str7, str8, bLiveMultiCall).map(new w9j() { // from class: l.s1k0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f161903a.m94614l(str, (BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public C22306c<p1k0> m94618p(final String str, @Nullable String str2, String str3, String str4, String str5, String str6, String str7, final boolean z) {
        return hrv.m132733P(str, str2, str3, str4, str5, str6, str7, "").map(new w9j() { // from class: l.t1k0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f167353a.m94615m(str, z, (BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public C22306c<p1k0> m94619q(final String str, @Nullable String str2, String str3, String str4, String str5, String str6, String str7, final boolean z, String str8) {
        return hrv.m132733P(str, str2, str3, str4, str5, str6, str7, str8).map(new w9j() { // from class: l.w1k0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f184018a.m94616n(str, z, (BLiveEnvelope) obj);
            }
        });
    }
}
