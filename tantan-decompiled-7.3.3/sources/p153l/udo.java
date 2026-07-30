package p153l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.api.Api;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.IntlFlashStickerOptionData;
import com.p051p1.mobile.putong.core.data.IntlMarketConfigData;
import com.p051p1.mobile.putong.core.data.IntlMarketConfigDataMeta;
import com.p051p1.mobile.putong.core.data.IntlMarketConfigEntrypoint;
import com.p051p1.mobile.putong.core.data.IntlMarketConfigEnvelope;
import com.p051p1.mobile.putong.core.data.IntlMarketRequestParams;
import com.p051p1.mobile.putong.core.data.IntlMarketResponseEnvelope;
import com.p051p1.mobile.putong.core.data.IntlMarketToken;
import com.p051p1.mobile.putong.core.p058ui.intloperation.flash.C8547a;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserStatus;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\fJ\r\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u0006J\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0014J\r\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\fJ\u0015\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0012¢\u0006\u0004\b\u001f\u0010\u0003J\r\u0010 \u001a\u00020\u0012¢\u0006\u0004\b \u0010\u0003J\r\u0010!\u001a\u00020\u0012¢\u0006\u0004\b!\u0010\u0003J\u000f\u0010\"\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\"\u0010\u0006J!\u0010%\u001a\u0014\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070#H\u0002¢\u0006\u0004\b%\u0010&J)\u0010(\u001a\u0014\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070#2\u0006\u0010'\u001a\u00020\u0004H\u0002¢\u0006\u0004\b(\u0010)J\u0011\u0010+\u001a\u0004\u0018\u00010*H\u0002¢\u0006\u0004\b+\u0010,¨\u0006-"}, m88121d2 = {"Ll/udo;", "", "<init>", "()V", "", "h", "()Ljava/lang/String;", "", "q", "()I", "", "k", "()Z", BLiveStormDanmakuGiftResourceType.f45292l, "g", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "source", "", "m", "(Lcom/p1/mobile/android/app/Act;I)V", "n", "p", "Ll/wyd0;", "savedString", BLiveStormDanmakuGiftResourceType.f45294s, "(Ll/wyd0;)V", "Lcom/p1/mobile/putong/data/User;", "user", "j", "(Lcom/p1/mobile/putong/data/User;)Z", "e", Constants.INAPP_DATA_TAG, "c", "f", "Ll/bkj0;", "", "r", "()Ll/bkj0;", "str", "o", "(Ljava/lang/String;)Ll/bkj0;", "Lcom/p1/mobile/putong/core/data/IntlMarketConfigData;", RXScreenCaptureService.KEY_INDEX, "()Lcom/p1/mobile/putong/core/data/IntlMarketConfigData;", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class udo {

    @NotNull
    public static final udo INSTANCE = new udo();

    /* JADX INFO: renamed from: a */
    public static Unit m195501a(int i, Ref.BooleanRef booleanRef, Act act, IntlMarketResponseEnvelope intlMarketResponseEnvelope) {
        IntlMarketConfigDataMeta intlMarketConfigDataMeta;
        IntlFlashStickerOptionData intlFlashStickerOptionData;
        intlMarketResponseEnvelope.getClass();
        if (1 == i) {
            if (intlMarketResponseEnvelope.data.regular_option > 0 || !INSTANCE.m195516p() || ((intlFlashStickerOptionData = intlMarketResponseEnvelope.data.flash_option) != null && intlFlashStickerOptionData.active)) {
                return Unit.INSTANCE;
            }
            booleanRef.element = true;
        }
        IntlMarketConfigData intlMarketConfigDataM195509i = INSTANCE.m195509i();
        String str = (intlMarketConfigDataM195509i == null || (intlMarketConfigDataMeta = intlMarketConfigDataM195509i.meta) == null) ? null : intlMarketConfigDataMeta.template;
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != 3482197) {
                if (iHashCode != 97513456) {
                    if (iHashCode == 1086463900 && str.equals(IntlMarketToken.regular)) {
                        kwc0.INSTANCE.m151687f(act, i, intlMarketResponseEnvelope, booleanRef.element);
                    }
                } else if (str.equals(IntlMarketToken.flash)) {
                    C8547a.INSTANCE.m47491f(act, i, intlMarketResponseEnvelope, booleanRef.element);
                }
            } else if (str.equals(IntlMarketToken.quiz)) {
                bap.INSTANCE.m103225d(act, i, intlMarketResponseEnvelope, booleanRef.element);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public static Unit m195502b(Act act, int i, IntlMarketConfigEnvelope intlMarketConfigEnvelope) {
        intlMarketConfigEnvelope.getClass();
        INSTANCE.m195514n(act, i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public final void m195503c() {
        C8547a.INSTANCE.m47492g();
    }

    /* JADX INFO: renamed from: d */
    public final void m195504d() {
        if (TextUtils.isEmpty(m195506f())) {
            return;
        }
        i4g0.m138523u("e_intl_mkt_feature_entry", "p_suggest_users_home_view", jyb.m147494Y("intl_mkt_feature_type", m195506f()));
    }

    /* JADX INFO: renamed from: e */
    public final void m195505e() {
        if (TextUtils.isEmpty(m195506f())) {
            return;
        }
        i4g0.m138492A("e_intl_mkt_feature_entry", "p_suggest_users_home_view", jyb.m147494Y("intl_mkt_feature_type", m195506f()));
    }

    /* JADX INFO: renamed from: f */
    public final String m195506f() {
        IntlMarketConfigDataMeta intlMarketConfigDataMeta;
        String str;
        IntlMarketConfigData intlMarketConfigDataM195509i = m195509i();
        return (intlMarketConfigDataM195509i == null || (intlMarketConfigDataMeta = intlMarketConfigDataM195509i.meta) == null || (str = intlMarketConfigDataMeta.template) == null) ? "" : str;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final String m195507g() {
        IntlMarketConfigEntrypoint intlMarketConfigEntrypoint;
        String str;
        IntlMarketConfigData intlMarketConfigDataM195509i = m195509i();
        return (intlMarketConfigDataM195509i == null || (intlMarketConfigEntrypoint = intlMarketConfigDataM195509i.entrypoint) == null || (str = intlMarketConfigEntrypoint.icon_url) == null) ? "" : str;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final String m195508h() {
        IntlMarketConfigDataMeta intlMarketConfigDataMeta;
        IntlMarketConfigData intlMarketConfigDataM195509i = m195509i();
        String str = (intlMarketConfigDataM195509i == null || (intlMarketConfigDataMeta = intlMarketConfigDataM195509i.meta) == null) ? null : intlMarketConfigDataMeta.template;
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
    public final IntlMarketConfigData m195509i() {
        IntlMarketConfigEnvelope marketConfig = CoreModule.f18264c.f20292A1.getMarketConfig();
        if (marketConfig != null) {
            return marketConfig.data;
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m195510j(@NotNull User user) {
        user.getClass();
        return (user.status.contains(UserStatus.get("hidden")) || user.veryUgly() || user.isJailed()) ? false : true;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m195511k() {
        IntlMarketConfigDataMeta intlMarketConfigDataMeta;
        IntlMarketConfigData intlMarketConfigDataM195509i = m195509i();
        return ((intlMarketConfigDataM195509i == null || (intlMarketConfigDataMeta = intlMarketConfigDataM195509i.meta) == null) ? -1 : intlMarketConfigDataMeta.f21167id) != -1;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m195512l() {
        IntlMarketConfigDataMeta intlMarketConfigDataMeta;
        IntlMarketConfigData intlMarketConfigDataM195509i = m195509i();
        String str = (intlMarketConfigDataM195509i == null || (intlMarketConfigDataMeta = intlMarketConfigDataM195509i.meta) == null) ? null : intlMarketConfigDataMeta.template;
        if (str == null) {
            return false;
        }
        int iHashCode = str.hashCode();
        if (iHashCode == 3482197) {
            if (!str.equals(IntlMarketToken.quiz)) {
                return false;
            }
            Boolean bool = bap.INSTANCE.m103224c().get();
            bool.getClass();
            return bool.booleanValue();
        }
        if (iHashCode == 97513456) {
            if (!str.equals(IntlMarketToken.flash)) {
                return false;
            }
            Boolean bool2 = C8547a.INSTANCE.m47489d().get();
            bool2.getClass();
            return bool2.booleanValue();
        }
        if (iHashCode != 1086463900 || !str.equals(IntlMarketToken.regular)) {
            return false;
        }
        Boolean bool3 = kwc0.INSTANCE.m151684c().get();
        bool3.getClass();
        return bool3.booleanValue();
    }

    /* JADX INFO: renamed from: m */
    public final void m195513m(@NotNull final Act act, final int source) {
        IntlMarketConfigDataMeta intlMarketConfigDataMeta;
        act.getClass();
        IntlMarketConfigData intlMarketConfigDataM195509i = m195509i();
        if (TextUtils.isEmpty((intlMarketConfigDataM195509i == null || (intlMarketConfigDataMeta = intlMarketConfigDataM195509i.meta) == null) ? null : intlMarketConfigDataMeta.template)) {
            CoreModule.f18264c.f20292A1.m102936t3(act, new Function1() { // from class: l.tdo
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return udo.m195502b(act, source, (IntlMarketConfigEnvelope) obj);
                }
            });
        } else {
            m195514n(act, source);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m195514n(@NotNull final Act act, final int source) {
        IntlMarketConfigDataMeta intlMarketConfigDataMeta;
        act.getClass();
        IntlMarketConfigData intlMarketConfigDataM195509i = m195509i();
        if (TextUtils.isEmpty((intlMarketConfigDataM195509i == null || (intlMarketConfigDataMeta = intlMarketConfigDataM195509i.meta) == null) ? null : intlMarketConfigDataMeta.template)) {
            return;
        }
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        IntlMarketRequestParams intlMarketRequestParams = new IntlMarketRequestParams();
        intlMarketRequestParams.regular_option = 0;
        intlMarketRequestParams.mcc = String.valueOf(uqb0.f180400f0);
        if (1 == source) {
            Long l2 = CoreModule.f18264c.f20381e0.f89095P0.get();
            long jM195517q = m195517q();
            if (l2 == null || l2.longValue() != jM195517q) {
                return;
            }
        }
        b89 b89Var = CoreModule.f18264c.f20292A1;
        b89Var.getClass();
        b89.m102928s3(b89Var, act, intlMarketRequestParams, null, new Function1() { // from class: l.sdo
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return udo.m195501a(source, booleanRef, act, (IntlMarketResponseEnvelope) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: renamed from: o */
    public final bkj0<Long, Integer, Integer> m195515o(String str) {
        String[] strArr = (String[]) StringsKt.split$default(str, new String[]{"_"}, false, 0, 6, null).toArray(new String[0]);
        if (!NullChecker.m82486a(strArr) || strArr.length <= 2) {
            bkj0<Long, Integer, Integer> bkj0VarM104818a = bkj0.m104818a(0L, 0, 0);
            bkj0VarM104818a.getClass();
            return bkj0VarM104818a;
        }
        bkj0<Long, Integer, Integer> bkj0VarM104818a2 = bkj0.m104818a(Long.valueOf(strArr[0]), Integer.valueOf(strArr[1]), Integer.valueOf(strArr[2]));
        bkj0VarM104818a2.getClass();
        return bkj0VarM104818a2;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m195516p() {
        IntlMarketConfigDataMeta intlMarketConfigDataMeta;
        IntlMarketConfigData intlMarketConfigDataM195509i = m195509i();
        if (TextUtils.isEmpty((intlMarketConfigDataM195509i == null || (intlMarketConfigDataMeta = intlMarketConfigDataM195509i.meta) == null) ? null : intlMarketConfigDataMeta.template)) {
            return false;
        }
        bkj0<Long, Integer, Integer> bkj0VarM195518r = m195518r();
        Integer num = bkj0VarM195518r.f77082b;
        num.getClass();
        int iM116965d = dmk0.m116965d(num.intValue(), Api.BaseClientBuilder.API_PRIORITY_OTHER);
        long jM174454o = pzi0.m174454o();
        Long l2 = bkj0VarM195518r.f77081a;
        l2.getClass();
        if (tzi0.m193670h(jM174454o, l2.longValue(), iM116965d)) {
            return true;
        }
        Long l3 = bkj0VarM195518r.f77081a;
        l3.getClass();
        return pzi0.m174439D(l3.longValue()) && bkj0VarM195518r.f77083c.intValue() < 1;
    }

    /* JADX INFO: renamed from: q */
    public final int m195517q() {
        IntlMarketConfigDataMeta intlMarketConfigDataMeta;
        IntlMarketConfigData intlMarketConfigDataM195509i = m195509i();
        if (intlMarketConfigDataM195509i == null || (intlMarketConfigDataMeta = intlMarketConfigDataM195509i.meta) == null) {
            return -1;
        }
        return intlMarketConfigDataMeta.popups;
    }

    /* JADX INFO: renamed from: r */
    public final bkj0<Long, Integer, Integer> m195518r() {
        IntlMarketConfigDataMeta intlMarketConfigDataMeta;
        IntlMarketConfigData intlMarketConfigDataM195509i = m195509i();
        String str = (intlMarketConfigDataM195509i == null || (intlMarketConfigDataMeta = intlMarketConfigDataM195509i.meta) == null) ? null : intlMarketConfigDataMeta.template;
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != 97513456) {
                if (iHashCode == 1086463900 && str.equals(IntlMarketToken.regular)) {
                    String str2 = kwc0.INSTANCE.m151683b().get();
                    str2.getClass();
                    return m195515o(str2);
                }
            } else if (str.equals(IntlMarketToken.flash)) {
                String str3 = C8547a.INSTANCE.m47488c().get();
                str3.getClass();
                return m195515o(str3);
            }
        }
        bkj0<Long, Integer, Integer> bkj0VarM104818a = bkj0.m104818a(0L, 0, 0);
        bkj0VarM104818a.getClass();
        return bkj0VarM104818a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [B, java.lang.Integer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [C, java.lang.Integer, java.lang.Object] */
    /* JADX INFO: renamed from: s */
    public final void m195519s(@NotNull wyd0 savedString) {
        String str;
        IntlMarketConfigDataMeta intlMarketConfigDataMeta;
        savedString.getClass();
        IntlMarketConfigData intlMarketConfigDataM195509i = m195509i();
        if (TextUtils.isEmpty((intlMarketConfigDataM195509i == null || (intlMarketConfigDataMeta = intlMarketConfigDataM195509i.meta) == null) ? null : intlMarketConfigDataMeta.template)) {
            return;
        }
        bkj0<Long, Integer, Integer> bkj0VarM195518r = m195518r();
        Long l2 = bkj0VarM195518r.f77081a;
        l2.getClass();
        if (pzi0.m174439D(l2.longValue())) {
            Long l3 = bkj0VarM195518r.f77081a;
            Integer num = bkj0VarM195518r.f77082b;
            ?? ValueOf = Integer.valueOf(bkj0VarM195518r.f77083c.intValue() + 1);
            bkj0VarM195518r.f77083c = ValueOf;
            str = l3 + "_" + num + "_" + ((Object) ValueOf);
        } else {
            long jM174454o = pzi0.m174454o();
            ?? ValueOf2 = Integer.valueOf(bkj0VarM195518r.f77082b.intValue() + 1);
            bkj0VarM195518r.f77082b = ValueOf2;
            str = jM174454o + "_" + ((Object) ValueOf2) + "_1";
        }
        savedString.put(str);
    }
}
