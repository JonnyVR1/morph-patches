package p006l;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.p001ab.IntlCountryCodeController;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p1.mobile.putong.core.oms.OmsDialog;
import com.p1.mobile.putong.core.ui.match.MatchAct;
import com.p1.mobile.putong.data.LikeExtraData;
import com.p1.mobile.putong.data.LikeFrom;
import com.p1.mobile.putong.data.MatchFrom;
import com.p1.mobile.putong.data.MatchScData;
import com.p1.mobile.putong.data.Relationship;
import com.p1.mobile.putong.data.RelationshipExtensions;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import l.abi;
import l.e30;
import l.ic50;
import l.mgh0;
import l.mkd0;
import l.nt30;
import l.vwb;
import l.w9j;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0013\u001a\u00020\r8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u000f¨\u0006\u0014"}, d2 = {"Ll/z7e0;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", "act", "Lcom/p1/mobile/putong/core/data/SwipeDirection;", "swipeDirection", "Lcom/p1/mobile/putong/data/User;", "user", "", "g", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/SwipeDirection;Lcom/p1/mobile/putong/data/User;)V", "", "e", "()I", "a", "Lkotlin/Lazy;", "f", "swipeCount", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class z7e0 {

    @NotNull
    public static final z7e0 INSTANCE = new z7e0();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Lazy swipeCount = LazyKt__LazyJVMKt.b(new Function0() { // from class: l.v7e0
        public final Object invoke() {
            return Integer.valueOf(z7e0.m28619d());
        }
    });

    /* JADX INFO: renamed from: a */
    public static void m28616a(Throwable th) {
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0063  */
    /* JADX INFO: renamed from: b */
    public static void m28617b(User user, Act act, Relationship relationship) {
        int i;
        RelationshipExtensions relationshipExtensions;
        relationship.getClass();
        if (!TEnum.equals(relationship.state, "matched") || relationship.status.contains(MatchFrom.get("xmasActivity"))) {
            return;
        }
        if (relationship.status.size() == 0 || !TEnum.equals((TEnum) relationship.status.get(0), "letter")) {
            if (relationship.status.size() != 0 && TEnum.equals((TEnum) relationship.status.get(0), "superLikedEach")) {
                i = 13;
            } else if (relationship.status.size() == 0 || !TEnum.equals((TEnum) relationship.status.get(0), "superLiked")) {
                i = (relationship.status.size() == 0 || !TEnum.equals((TEnum) relationship.status.get(0), "secretcrush")) ? 0 : 1;
            } else {
                i = 11;
            }
        } else if (NullChecker.a(user.localRelationship)) {
            Relationship relationship2 = user.localRelationship;
            if (NullChecker.a(relationship2 != null ? relationship2.relationshipExtensions : null)) {
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
        if (u59.m24998f0()) {
            CoreModule.f1534c.f3631f0.m4580Fo();
        }
        if (!CoreModule.f1534c.f3628e0.m21490p9().isFemale()) {
            ArrayList arrayListF0 = vwb.f0(new String[]{((DbObject) user).id});
            List list = relationship.scenarios;
            list.getClass();
            act.startActivityWithCustomTransition(MatchAct.g2(act, arrayListF0, i, (ArrayList) list, upa.m25392S1() ? "tmp_from_home_swipe" : null), new MatchAct.b());
            return;
        }
        abi.J(act, user);
        if (!IntlCountryCodeController.m21v()) {
            mgh0.s();
        }
        if (i == 13 && mx0.m19548o().m19550B()) {
            if (ogl0.m20617F()) {
                ic50.j().f().b0(OmsDialog.p_appstore_rating_filter_popup_store.getIdentifier(), 0, true);
            }
            mx0.m19528I(act, false, 5.0f, "superlike");
        }
    }

    /* JADX INFO: renamed from: c */
    public static Boolean m28618c(int i) {
        return Boolean.valueOf(qib0.f19808f0 == i);
    }

    /* JADX INFO: renamed from: d */
    public static int m28619d() {
        return INSTANCE.m28620e();
    }

    /* JADX INFO: renamed from: e */
    public final int m28620e() {
        try {
            String strF = RemoteConfig.x().F("intl_mysterybox_switch");
            strF.getClass();
            JSONObject jSONObject = new JSONObject(strF);
            if (!jSONObject.getBoolean("enable")) {
                return -1;
            }
            JSONArray jSONArray = jSONObject.getJSONArray("area");
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                Object obj = jSONArray.get(i);
                if ((obj instanceof JSONObject) && vwb.m(JSON.parseArray(((JSONObject) obj).getString("mcc"), Integer.TYPE), new w9j() { // from class: l.y7e0
                    public final Object call(Object obj2) {
                        return z7e0.m28618c(((Integer) obj2).intValue());
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
    public final int m28621f() {
        return ((Number) swipeCount.getValue()).intValue();
    }

    /* JADX INFO: renamed from: g */
    public final void m28622g(@NotNull final Act act, @NotNull SwipeDirection swipeDirection, @NotNull final User user) {
        act.getClass();
        swipeDirection.getClass();
        user.getClass();
        boolean z = swipeDirection == SwipeDirection.RIGHT || swipeDirection == SwipeDirection.UP;
        boolean z2 = swipeDirection == SwipeDirection.UP;
        LikeExtraData likeExtraDataNew_ = LikeExtraData.new_();
        likeExtraDataNew_.matchScData = new MatchScData.MatchBuilder().matchSource(HomeStatisticsHelper.ScActionFrom.SUGGEST.getFrom()).isLike(z).isFromButton(true).isSuperLiked(z2).user(user).pageId("p_intl_mystery_box_popup").build();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("sourcepage", nt30.S0);
        linkedHashMap.put("actiontype", nt30.T0);
        CoreModule.f1534c.f3652m0.m3003Y7(z, false, linkedHashMap, user, null, LikeFrom.get("home"), true, likeExtraDataNew_, 0, null).subscribe(mkd0.H(new e30() { // from class: l.w7e0
            public final void call(Object obj) {
                z7e0.m28617b(user, act, (Relationship) obj);
            }
        }, new e30() { // from class: l.x7e0
            public final void call(Object obj) {
                z7e0.m28616a((Throwable) obj);
            }
        }));
    }
}
