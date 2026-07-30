package p153l;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p051p1.mobile.putong.core.oms.OmsDialog;
import com.p051p1.mobile.putong.core.p058ui.match.MatchAct;
import com.p051p1.mobile.putong.data.LikeExtraData;
import com.p051p1.mobile.putong.data.LikeFrom;
import com.p051p1.mobile.putong.data.MatchFrom;
import com.p051p1.mobile.putong.data.MatchScData;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.RelationshipExtensions;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0013\u001a\u00020\r8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u000f¨\u0006\u0014"}, m88121d2 = {"Ll/ege0;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/SwipeDirection;", "swipeDirection", "Lcom/p1/mobile/putong/data/User;", "user", "", "g", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/SwipeDirection;Lcom/p1/mobile/putong/data/User;)V", "", "e", "()I", "a", "Lkotlin/Lazy;", "f", "swipeCount", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class ege0 {

    @NotNull
    public static final ege0 INSTANCE = new ege0();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Lazy swipeCount = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.age0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(ege0.m120761d());
        }
    });

    /* JADX INFO: renamed from: a */
    public static void m120758a(Throwable th) {
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0063  */
    /* JADX INFO: renamed from: b */
    public static void m120759b(User user, Act act, Relationship relationship) {
        int i;
        RelationshipExtensions relationshipExtensions;
        relationship.getClass();
        if (!TEnum.equals(relationship.state, "matched") || relationship.status.contains(MatchFrom.get(MatchFrom.xmasActivity))) {
            return;
        }
        if (relationship.status.size() == 0 || !TEnum.equals(relationship.status.get(0), "letter")) {
            if (relationship.status.size() != 0 && TEnum.equals(relationship.status.get(0), MatchFrom.superLikedEach)) {
                i = 13;
            } else if (relationship.status.size() == 0 || !TEnum.equals(relationship.status.get(0), MatchFrom.superLiked)) {
                i = (relationship.status.size() == 0 || !TEnum.equals(relationship.status.get(0), "secretcrush")) ? 0 : 1;
            } else {
                i = 11;
            }
        } else if (NullChecker.m82486a(user.localRelationship)) {
            Relationship relationship2 = user.localRelationship;
            if (NullChecker.m82486a(relationship2 != null ? relationship2.relationshipExtensions : null)) {
                Relationship relationship3 = user.localRelationship;
                if (TextUtils.isEmpty((relationship3 == null || (relationshipExtensions = relationship3.relationshipExtensions) == null) ? null : relationshipExtensions.otherLetter)) {
                    i = 38;
                } else {
                    i = 37;
                }
            } else {
                i = 38;
            }
        } else {
            i = 38;
        }
        if (d79.m114685j0()) {
            CoreModule.f18264c.f20384f0.m33653Fo();
        }
        if (!CoreModule.f18264c.f20381e0.m116600p9().isFemale()) {
            ArrayList arrayListM147507f0 = jyb.m147507f0(user.f56859id);
            List<String> list = relationship.scenarios;
            list.getClass();
            act.startActivityWithCustomTransition(MatchAct.m48747h2(act, arrayListM147507f0, i, (ArrayList) list, gra.m131625S1() ? "tmp_from_home_swipe" : null), new MatchAct.C8617b());
            return;
        }
        pci.m171661J(act, user);
        if (!IntlCountryCodeController.m29125v()) {
            toh0.m192059s();
        }
        if (i == 13 && tx0.m193439o().m193441B()) {
            if (spl0.m187354F()) {
                pk50.m172568j().m172574f().m181664b0(OmsDialog.p_appstore_rating_filter_popup_store.getIdentifier(), 0, true);
            }
            tx0.m193419I(act, false, 5.0f, "superlike");
        }
    }

    /* JADX INFO: renamed from: c */
    public static Boolean m120760c(int i) {
        return Boolean.valueOf(uqb0.f180400f0 == i);
    }

    /* JADX INFO: renamed from: d */
    public static int m120761d() {
        return INSTANCE.m120762e();
    }

    /* JADX INFO: renamed from: e */
    public final int m120762e() {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("intl_mysterybox_switch");
            strM80485F.getClass();
            JSONObject jSONObject = new JSONObject(strM80485F);
            if (!jSONObject.getBoolean("enable")) {
                return -1;
            }
            JSONArray jSONArray = jSONObject.getJSONArray("area");
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                Object obj = jSONArray.get(i);
                if ((obj instanceof JSONObject) && jyb.m147520m(JSON.parseArray(((JSONObject) obj).getString("mcc"), Integer.TYPE), new qcj() { // from class: l.dge0
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return ege0.m120760c(((Integer) obj2).intValue());
                    }
                })) {
                    return ((JSONObject) obj).getInt("swipe_count");
                }
            }
            return -1;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: f */
    public final int m120763f() {
        return ((Number) swipeCount.getValue()).intValue();
    }

    /* JADX INFO: renamed from: g */
    public final void m120764g(@NotNull final Act act, @NotNull SwipeDirection swipeDirection, @NotNull final User user) {
        act.getClass();
        swipeDirection.getClass();
        user.getClass();
        boolean z = swipeDirection == SwipeDirection.RIGHT || swipeDirection == SwipeDirection.UP;
        boolean z2 = swipeDirection == SwipeDirection.UP;
        LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
        likeExtraDataNew_.matchScData = new MatchScData.MatchBuilder().matchSource(HomeStatisticsHelper.ScActionFrom.SUGGEST.getFrom()).isLike(z).isFromButton(true).isSuperLiked(z2).user(user).pageId("p_intl_mystery_box_popup").build();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("sourcepage", b240.f74485S0);
        linkedHashMap.put("actiontype", b240.f74486T0);
        CoreModule.f18264c.f20405m0.m32076Y7(z, false, linkedHashMap, user, null, LikeFrom.get("home"), true, likeExtraDataNew_, 0, null).subscribe(psd0.m173597H(new y20() { // from class: l.bge0
            @Override // p153l.y20
            public final void call(Object obj) {
                ege0.m120759b(user, act, (Relationship) obj);
            }
        }, new y20() { // from class: l.cge0
            @Override // p153l.y20
            public final void call(Object obj) {
                ege0.m120758a((Throwable) obj);
            }
        }));
    }
}
