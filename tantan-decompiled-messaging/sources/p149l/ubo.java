package p149l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.api.Api;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.IntlFlashStickerOptionData;
import com.p046p1.mobile.putong.core.data.IntlMarketConfigData;
import com.p046p1.mobile.putong.core.data.IntlMarketConfigDataMeta;
import com.p046p1.mobile.putong.core.data.IntlMarketConfigEntrypoint;
import com.p046p1.mobile.putong.core.data.IntlMarketConfigEnvelope;
import com.p046p1.mobile.putong.core.data.IntlMarketRequestParams;
import com.p046p1.mobile.putong.core.data.IntlMarketResponseEnvelope;
import com.p046p1.mobile.putong.core.data.IntlMarketToken;
import com.p046p1.mobile.putong.core.p053ui.intloperation.flash.C8384a;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserStatus;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\fJ\r\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u0006J\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0014J\r\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\fJ\u0015\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0012¢\u0006\u0004\b\u001f\u0010\u0003J\r\u0010 \u001a\u00020\u0012¢\u0006\u0004\b \u0010\u0003J\r\u0010!\u001a\u00020\u0012¢\u0006\u0004\b!\u0010\u0003J\u000f\u0010\"\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\"\u0010\u0006J!\u0010%\u001a\u0014\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070#H\u0002¢\u0006\u0004\b%\u0010&J)\u0010(\u001a\u0014\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070#2\u0006\u0010'\u001a\u00020\u0004H\u0002¢\u0006\u0004\b(\u0010)J\u0011\u0010+\u001a\u0004\u0018\u00010*H\u0002¢\u0006\u0004\b+\u0010,¨\u0006-"}, m87232d2 = {"Ll/ubo;", "", "<init>", "()V", "", "h", "()Ljava/lang/String;", "", "q", "()I", "", "k", "()Z", BLiveStormDanmakuGiftResourceType.f44444l, "g", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "source", "", "m", "(Lcom/p1/mobile/android/app/Act;I)V", "n", "p", "Ll/uqd0;", "savedString", BLiveStormDanmakuGiftResourceType.f44446s, "(Ll/uqd0;)V", "Lcom/p1/mobile/putong/data/User;", "user", "j", "(Lcom/p1/mobile/putong/data/User;)Z", "e", Constants.INAPP_DATA_TAG, "c", "f", "Ll/xaj0;", "", "r", "()Ll/xaj0;", "str", "o", "(Ljava/lang/String;)Ll/xaj0;", "Lcom/p1/mobile/putong/core/data/IntlMarketConfigData;", RXScreenCaptureService.KEY_INDEX, "()Lcom/p1/mobile/putong/core/data/IntlMarketConfigData;", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class ubo {

    @NotNull
    public static final ubo INSTANCE = new ubo();

    /* JADX INFO: renamed from: a */
    public static Unit m192880a(int i, Ref.BooleanRef booleanRef, Act act, IntlMarketResponseEnvelope intlMarketResponseEnvelope) {
        IntlMarketConfigDataMeta intlMarketConfigDataMeta;
        IntlFlashStickerOptionData intlFlashStickerOptionData;
        intlMarketResponseEnvelope.getClass();
        if (1 == i) {
            if (intlMarketResponseEnvelope.data.regular_option > 0 || !INSTANCE.m192895p() || ((intlFlashStickerOptionData = intlMarketResponseEnvelope.data.flash_option) != null && intlFlashStickerOptionData.active)) {
                return Unit.INSTANCE;
            }
            booleanRef.element = true;
        }
        IntlMarketConfigData intlMarketConfigDataM192888i = INSTANCE.m192888i();
        String str = (intlMarketConfigDataM192888i == null || (intlMarketConfigDataMeta = intlMarketConfigDataM192888i.meta) == null) ? null : intlMarketConfigDataMeta.template;
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != 3482197) {
                if (iHashCode != 97513456) {
                    if (iHashCode == 1086463900 && str.equals(IntlMarketToken.regular)) {
                        foc0.INSTANCE.m122434f(act, i, intlMarketResponseEnvelope, booleanRef.element);
                    }
                } else if (str.equals(IntlMarketToken.flash)) {
                    C8384a.INSTANCE.m46308f(act, i, intlMarketResponseEnvelope, booleanRef.element);
                }
            } else if (str.equals(IntlMarketToken.quiz)) {
                b8p.INSTANCE.m100780d(act, i, intlMarketResponseEnvelope, booleanRef.element);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public static Unit m192881b(Act act, int i, IntlMarketConfigEnvelope intlMarketConfigEnvelope) {
        intlMarketConfigEnvelope.getClass();
        INSTANCE.m192893n(act, i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public final void m192882c() {
        C8384a.INSTANCE.m46309g();
    }

    /* JADX INFO: renamed from: d */
    public final void m192883d() {
        if (TextUtils.isEmpty(m192885f())) {
            return;
        }
        zvf0.m220399u("e_intl_mkt_feature_entry", "p_suggest_users_home_view", vwb.m200311Y("intl_mkt_feature_type", m192885f()));
    }

    /* JADX INFO: renamed from: e */
    public final void m192884e() {
        if (TextUtils.isEmpty(m192885f())) {
            return;
        }
        zvf0.m220368A("e_intl_mkt_feature_entry", "p_suggest_users_home_view", vwb.m200311Y("intl_mkt_feature_type", m192885f()));
    }

    /* JADX INFO: renamed from: f */
    public final String m192885f() {
        IntlMarketConfigDataMeta intlMarketConfigDataMeta;
        String str;
        IntlMarketConfigData intlMarketConfigDataM192888i = m192888i();
        return (intlMarketConfigDataM192888i == null || (intlMarketConfigDataMeta = intlMarketConfigDataM192888i.meta) == null || (str = intlMarketConfigDataMeta.template) == null) ? "" : str;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final String m192886g() {
        IntlMarketConfigEntrypoint intlMarketConfigEntrypoint;
        String str;
        IntlMarketConfigData intlMarketConfigDataM192888i = m192888i();
        return (intlMarketConfigDataM192888i == null || (intlMarketConfigEntrypoint = intlMarketConfigDataM192888i.entrypoint) == null || (str = intlMarketConfigEntrypoint.icon_url) == null) ? "" : str;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final String m192887h() {
        IntlMarketConfigDataMeta intlMarketConfigDataMeta;
        IntlMarketConfigData intlMarketConfigDataM192888i = m192888i();
        String str = (intlMarketConfigDataM192888i == null || (intlMarketConfigDataMeta = intlMarketConfigDataM192888i.meta) == null) ? null : intlMarketConfigDataMeta.template;
        if (str == null) {
            return "";
        }
        int iHashCode = str.hashCode();
        if (iHashCode != 3482197) {
            return (iHashCode == 1086463900 && str.equals(IntlMarketToken.regular)) ? "p_intl_mkt_feature_regular_popup" : "";
        }
        return !str.equals(IntlMarketToken.quiz) ? "" : "p_intl_mkt_quiz_intro";
    }

    /* JADX INFO: renamed from: i */
    public final IntlMarketConfigData m192888i() {
        IntlMarketConfigEnvelope marketConfig = CoreModule.f17545c.f19550A1.getMarketConfig();
        if (marketConfig != null) {
            return marketConfig.data;
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m192889j(@NotNull User user) {
        user.getClass();
        return (user.status.contains(UserStatus.get("hidden")) || user.veryUgly() || user.isJailed()) ? false : true;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m192890k() {
        IntlMarketConfigDataMeta intlMarketConfigDataMeta;
        IntlMarketConfigData intlMarketConfigDataM192888i = m192888i();
        return ((intlMarketConfigDataM192888i == null || (intlMarketConfigDataMeta = intlMarketConfigDataM192888i.meta) == null) ? -1 : intlMarketConfigDataMeta.f20425id) != -1;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m192891l() {
        IntlMarketConfigDataMeta intlMarketConfigDataMeta;
        IntlMarketConfigData intlMarketConfigDataM192888i = m192888i();
        String str = (intlMarketConfigDataM192888i == null || (intlMarketConfigDataMeta = intlMarketConfigDataM192888i.meta) == null) ? null : intlMarketConfigDataMeta.template;
        if (str == null) {
            return false;
        }
        int iHashCode = str.hashCode();
        if (iHashCode == 3482197) {
            if (!str.equals(IntlMarketToken.quiz)) {
                return false;
            }
            Boolean bool = b8p.INSTANCE.m100779c().get();
            bool.getClass();
            return bool.booleanValue();
        }
        if (iHashCode == 97513456) {
            if (!str.equals(IntlMarketToken.flash)) {
                return false;
            }
            Boolean bool2 = C8384a.INSTANCE.m46306d().get();
            bool2.getClass();
            return bool2.booleanValue();
        }
        if (iHashCode != 1086463900 || !str.equals(IntlMarketToken.regular)) {
            return false;
        }
        Boolean bool3 = foc0.INSTANCE.m122431c().get();
        bool3.getClass();
        return bool3.booleanValue();
    }

    /* JADX INFO: renamed from: m */
    public final void m192892m(@NotNull final Act act, final int source) {
        IntlMarketConfigDataMeta intlMarketConfigDataMeta;
        act.getClass();
        IntlMarketConfigData intlMarketConfigDataM192888i = m192888i();
        if (TextUtils.isEmpty((intlMarketConfigDataM192888i == null || (intlMarketConfigDataMeta = intlMarketConfigDataM192888i.meta) == null) ? null : intlMarketConfigDataMeta.template)) {
            CoreModule.f17545c.f19550A1.m182440t3(act, new Function1() { // from class: l.tbo
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ubo.m192881b(act, source, (IntlMarketConfigEnvelope) obj);
                }
            });
        } else {
            m192893n(act, source);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m192893n(@NotNull final Act act, final int source) {
        IntlMarketConfigDataMeta intlMarketConfigDataMeta;
        act.getClass();
        IntlMarketConfigData intlMarketConfigDataM192888i = m192888i();
        if (TextUtils.isEmpty((intlMarketConfigDataM192888i == null || (intlMarketConfigDataMeta = intlMarketConfigDataM192888i.meta) == null) ? null : intlMarketConfigDataMeta.template)) {
            return;
        }
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        IntlMarketRequestParams intlMarketRequestParams = new IntlMarketRequestParams();
        intlMarketRequestParams.regular_option = 0;
        intlMarketRequestParams.mcc = String.valueOf(qib0.f154717f0);
        if (1 == source) {
            Long l2 = CoreModule.f17545c.f19639e0.f149238P0.get();
            long jM192896q = m192896q();
            if (l2 == null || l2.longValue() != jM192896q) {
                return;
            }
        }
        s69 s69Var = CoreModule.f17545c.f19550A1;
        s69Var.getClass();
        s69.m182432s3(s69Var, act, intlMarketRequestParams, null, new Function1() { // from class: l.sbo
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ubo.m192880a(source, booleanRef, act, (IntlMarketResponseEnvelope) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: renamed from: o */
    public final xaj0<Long, Integer, Integer> m192894o(String str) {
        String[] strArr = (String[]) StringsKt.split$default(str, new String[]{"_"}, false, 0, 6, null).toArray(new String[0]);
        if (!NullChecker.m81303a(strArr) || strArr.length <= 2) {
            xaj0<Long, Integer, Integer> xaj0VarM207578a = xaj0.m207578a(0L, 0, 0);
            xaj0VarM207578a.getClass();
            return xaj0VarM207578a;
        }
        xaj0<Long, Integer, Integer> xaj0VarM207578a2 = xaj0.m207578a(Long.valueOf(strArr[0]), Integer.valueOf(strArr[1]), Integer.valueOf(strArr[2]));
        xaj0VarM207578a2.getClass();
        return xaj0VarM207578a2;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m192895p() {
        IntlMarketConfigDataMeta intlMarketConfigDataMeta;
        IntlMarketConfigData intlMarketConfigDataM192888i = m192888i();
        if (TextUtils.isEmpty((intlMarketConfigDataM192888i == null || (intlMarketConfigDataMeta = intlMarketConfigDataM192888i.meta) == null) ? null : intlMarketConfigDataMeta.template)) {
            return false;
        }
        xaj0<Long, Integer, Integer> xaj0VarM192897r = m192897r();
        Integer num = xaj0VarM192897r.f191752b;
        num.getClass();
        int iM208123d = xck0.m208123d(num.intValue(), Api.BaseClientBuilder.API_PRIORITY_OTHER);
        long jM155944o = mqi0.m155944o();
        Long l2 = xaj0VarM192897r.f191751a;
        l2.getClass();
        if (qqi0.m175940h(jM155944o, l2.longValue(), iM208123d)) {
            return true;
        }
        Long l3 = xaj0VarM192897r.f191751a;
        l3.getClass();
        return mqi0.m155929D(l3.longValue()) && xaj0VarM192897r.f191753c.intValue() < 1;
    }

    /* JADX INFO: renamed from: q */
    public final int m192896q() {
        IntlMarketConfigDataMeta intlMarketConfigDataMeta;
        IntlMarketConfigData intlMarketConfigDataM192888i = m192888i();
        if (intlMarketConfigDataM192888i == null || (intlMarketConfigDataMeta = intlMarketConfigDataM192888i.meta) == null) {
            return -1;
        }
        return intlMarketConfigDataMeta.popups;
    }

    /* JADX INFO: renamed from: r */
    public final xaj0<Long, Integer, Integer> m192897r() {
        IntlMarketConfigDataMeta intlMarketConfigDataMeta;
        IntlMarketConfigData intlMarketConfigDataM192888i = m192888i();
        String str = (intlMarketConfigDataM192888i == null || (intlMarketConfigDataMeta = intlMarketConfigDataM192888i.meta) == null) ? null : intlMarketConfigDataMeta.template;
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != 97513456) {
                if (iHashCode == 1086463900 && str.equals(IntlMarketToken.regular)) {
                    String str2 = foc0.INSTANCE.m122430b().get();
                    str2.getClass();
                    return m192894o(str2);
                }
            } else if (str.equals(IntlMarketToken.flash)) {
                String str3 = C8384a.INSTANCE.m46305c().get();
                str3.getClass();
                return m192894o(str3);
            }
        }
        xaj0<Long, Integer, Integer> xaj0VarM207578a = xaj0.m207578a(0L, 0, 0);
        xaj0VarM207578a.getClass();
        return xaj0VarM207578a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [B, java.lang.Integer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [C, java.lang.Integer, java.lang.Object] */
    /* JADX INFO: renamed from: s */
    public final void m192898s(@NotNull uqd0 savedString) {
        String str;
        IntlMarketConfigDataMeta intlMarketConfigDataMeta;
        savedString.getClass();
        IntlMarketConfigData intlMarketConfigDataM192888i = m192888i();
        if (TextUtils.isEmpty((intlMarketConfigDataM192888i == null || (intlMarketConfigDataMeta = intlMarketConfigDataM192888i.meta) == null) ? null : intlMarketConfigDataMeta.template)) {
            return;
        }
        xaj0<Long, Integer, Integer> xaj0VarM192897r = m192897r();
        Long l2 = xaj0VarM192897r.f191751a;
        l2.getClass();
        if (mqi0.m155929D(l2.longValue())) {
            Long l3 = xaj0VarM192897r.f191751a;
            Integer num = xaj0VarM192897r.f191752b;
            ?? ValueOf = Integer.valueOf(xaj0VarM192897r.f191753c.intValue() + 1);
            xaj0VarM192897r.f191753c = ValueOf;
            str = l3 + "_" + num + "_" + ((Object) ValueOf);
        } else {
            long jM155944o = mqi0.m155944o();
            ?? ValueOf2 = Integer.valueOf(xaj0VarM192897r.f191752b.intValue() + 1);
            xaj0VarM192897r.f191752b = ValueOf2;
            str = jM155944o + "_" + ((Object) ValueOf2) + "_1";
        }
        savedString.put(str);
    }
}
