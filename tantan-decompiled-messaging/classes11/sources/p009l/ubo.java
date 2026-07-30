package p009l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.core.p002ui.intloperation.flash.C0428a;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.IntlFlashStickerOptionData;
import com.p1.mobile.putong.core.data.IntlMarketConfigData;
import com.p1.mobile.putong.core.data.IntlMarketConfigDataMeta;
import com.p1.mobile.putong.core.data.IntlMarketConfigEntrypoint;
import com.p1.mobile.putong.core.data.IntlMarketConfigEnvelope;
import com.p1.mobile.putong.core.data.IntlMarketRequestParams;
import com.p1.mobile.putong.core.data.IntlMarketResponseEnvelope;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserStatus;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import l.b8p;
import l.foc0;
import l.j760;
import l.qib0;
import l.qqi0;
import l.s69;
import l.uqd0;
import l.vwb;
import l.xaj0;
import l.xck0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\fJ\r\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u0006J\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0014J\r\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\fJ\u0015\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0012¢\u0006\u0004\b\u001f\u0010\u0003J\r\u0010 \u001a\u00020\u0012¢\u0006\u0004\b \u0010\u0003J\r\u0010!\u001a\u00020\u0012¢\u0006\u0004\b!\u0010\u0003J\u000f\u0010\"\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\"\u0010\u0006J!\u0010%\u001a\u0014\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070#H\u0002¢\u0006\u0004\b%\u0010&J)\u0010(\u001a\u0014\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070#2\u0006\u0010'\u001a\u00020\u0004H\u0002¢\u0006\u0004\b(\u0010)J\u0011\u0010+\u001a\u0004\u0018\u00010*H\u0002¢\u0006\u0004\b+\u0010,¨\u0006-"}, d2 = {"Ll/ubo;", "", "<init>", "()V", "", "h", "()Ljava/lang/String;", "", "q", "()I", "", "k", "()Z", "l", "g", "Lcom/p1/mobile/android/app/Act;", "act", "source", "", "m", "(Lcom/p1/mobile/android/app/Act;I)V", "n", "p", "Ll/uqd0;", "savedString", "s", "(Ll/uqd0;)V", "Lcom/p1/mobile/putong/data/User;", "user", "j", "(Lcom/p1/mobile/putong/data/User;)Z", "e", "d", "c", "f", "Ll/xaj0;", "", "r", "()Ll/xaj0;", "str", "o", "(Ljava/lang/String;)Ll/xaj0;", "Lcom/p1/mobile/putong/core/data/IntlMarketConfigData;", "i", "()Lcom/p1/mobile/putong/core/data/IntlMarketConfigData;", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class ubo {

    @NotNull
    public static final ubo INSTANCE = new ubo();

    /* JADX INFO: renamed from: a */
    public static Unit m22771a(int i, Ref.BooleanRef booleanRef, Act act, IntlMarketResponseEnvelope intlMarketResponseEnvelope) {
        IntlMarketConfigDataMeta intlMarketConfigDataMeta;
        IntlFlashStickerOptionData intlFlashStickerOptionData;
        intlMarketResponseEnvelope.getClass();
        if (1 == i) {
            if (intlMarketResponseEnvelope.data.regular_option > 0 || !INSTANCE.m22786p() || ((intlFlashStickerOptionData = intlMarketResponseEnvelope.data.flash_option) != null && intlFlashStickerOptionData.active)) {
                return Unit.INSTANCE;
            }
            booleanRef.element = true;
        }
        IntlMarketConfigData intlMarketConfigDataM22779i = INSTANCE.m22779i();
        String str = (intlMarketConfigDataM22779i == null || (intlMarketConfigDataMeta = intlMarketConfigDataM22779i.meta) == null) ? null : intlMarketConfigDataMeta.template;
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != 3482197) {
                if (iHashCode != 97513456) {
                    if (iHashCode == 1086463900 && str.equals("regular")) {
                        foc0.INSTANCE.f(act, i, intlMarketResponseEnvelope, booleanRef.element);
                    }
                } else if (str.equals("flash")) {
                    C0428a.INSTANCE.m8396f(act, i, intlMarketResponseEnvelope, booleanRef.element);
                }
            } else if (str.equals("quiz")) {
                b8p.INSTANCE.d(act, i, intlMarketResponseEnvelope, booleanRef.element);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public static Unit m22772b(Act act, int i, IntlMarketConfigEnvelope intlMarketConfigEnvelope) {
        intlMarketConfigEnvelope.getClass();
        INSTANCE.m22784n(act, i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public final void m22773c() {
        C0428a.INSTANCE.m8397g();
    }

    /* JADX INFO: renamed from: d */
    public final void m22774d() {
        if (TextUtils.isEmpty(m22776f())) {
            return;
        }
        zvf0.u("e_intl_mkt_feature_entry", "p_suggest_users_home_view", new j760[]{vwb.Y("intl_mkt_feature_type", m22776f())});
    }

    /* JADX INFO: renamed from: e */
    public final void m22775e() {
        if (TextUtils.isEmpty(m22776f())) {
            return;
        }
        zvf0.A("e_intl_mkt_feature_entry", "p_suggest_users_home_view", new j760[]{vwb.Y("intl_mkt_feature_type", m22776f())});
    }

    /* JADX INFO: renamed from: f */
    public final String m22776f() {
        IntlMarketConfigDataMeta intlMarketConfigDataMeta;
        String str;
        IntlMarketConfigData intlMarketConfigDataM22779i = m22779i();
        return (intlMarketConfigDataM22779i == null || (intlMarketConfigDataMeta = intlMarketConfigDataM22779i.meta) == null || (str = intlMarketConfigDataMeta.template) == null) ? "" : str;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final String m22777g() {
        IntlMarketConfigEntrypoint intlMarketConfigEntrypoint;
        String str;
        IntlMarketConfigData intlMarketConfigDataM22779i = m22779i();
        return (intlMarketConfigDataM22779i == null || (intlMarketConfigEntrypoint = intlMarketConfigDataM22779i.entrypoint) == null || (str = intlMarketConfigEntrypoint.icon_url) == null) ? "" : str;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final String m22778h() {
        IntlMarketConfigDataMeta intlMarketConfigDataMeta;
        IntlMarketConfigData intlMarketConfigDataM22779i = m22779i();
        String str = (intlMarketConfigDataM22779i == null || (intlMarketConfigDataMeta = intlMarketConfigDataM22779i.meta) == null) ? null : intlMarketConfigDataMeta.template;
        if (str == null) {
            return "";
        }
        int iHashCode = str.hashCode();
        if (iHashCode != 3482197) {
            return (iHashCode == 1086463900 && str.equals("regular")) ? "p_intl_mkt_feature_regular_popup" : "";
        }
        return !str.equals("quiz") ? "" : "p_intl_mkt_quiz_intro";
    }

    /* JADX INFO: renamed from: i */
    public final IntlMarketConfigData m22779i() {
        IntlMarketConfigEnvelope intlMarketConfigEnvelopeK3 = CoreModule.c.A1.k3();
        if (intlMarketConfigEnvelopeK3 != null) {
            return intlMarketConfigEnvelopeK3.data;
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m22780j(@NotNull User user) {
        user.getClass();
        return (user.status.contains(UserStatus.get("hidden")) || user.veryUgly() || user.isJailed()) ? false : true;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m22781k() {
        IntlMarketConfigDataMeta intlMarketConfigDataMeta;
        IntlMarketConfigData intlMarketConfigDataM22779i = m22779i();
        return ((intlMarketConfigDataM22779i == null || (intlMarketConfigDataMeta = intlMarketConfigDataM22779i.meta) == null) ? -1 : intlMarketConfigDataMeta.id) != -1;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m22782l() {
        IntlMarketConfigDataMeta intlMarketConfigDataMeta;
        IntlMarketConfigData intlMarketConfigDataM22779i = m22779i();
        String str = (intlMarketConfigDataM22779i == null || (intlMarketConfigDataMeta = intlMarketConfigDataM22779i.meta) == null) ? null : intlMarketConfigDataMeta.template;
        if (str == null) {
            return false;
        }
        int iHashCode = str.hashCode();
        if (iHashCode == 3482197) {
            if (!str.equals("quiz")) {
                return false;
            }
            Object obj = b8p.INSTANCE.c().get();
            obj.getClass();
            return ((Boolean) obj).booleanValue();
        }
        if (iHashCode == 97513456) {
            if (!str.equals("flash")) {
                return false;
            }
            Object obj2 = C0428a.INSTANCE.m8394d().get();
            obj2.getClass();
            return ((Boolean) obj2).booleanValue();
        }
        if (iHashCode != 1086463900 || !str.equals("regular")) {
            return false;
        }
        Object obj3 = foc0.INSTANCE.c().get();
        obj3.getClass();
        return ((Boolean) obj3).booleanValue();
    }

    /* JADX INFO: renamed from: m */
    public final void m22783m(@NotNull final Act act, final int source) {
        IntlMarketConfigDataMeta intlMarketConfigDataMeta;
        act.getClass();
        IntlMarketConfigData intlMarketConfigDataM22779i = m22779i();
        if (TextUtils.isEmpty((intlMarketConfigDataM22779i == null || (intlMarketConfigDataMeta = intlMarketConfigDataM22779i.meta) == null) ? null : intlMarketConfigDataMeta.template)) {
            CoreModule.c.A1.t3(act, new Function1() { // from class: l.tbo
                public final Object invoke(Object obj) {
                    return ubo.m22772b(act, source, (IntlMarketConfigEnvelope) obj);
                }
            });
        } else {
            m22784n(act, source);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m22784n(@NotNull final Act act, final int source) {
        IntlMarketConfigDataMeta intlMarketConfigDataMeta;
        act.getClass();
        IntlMarketConfigData intlMarketConfigDataM22779i = m22779i();
        if (TextUtils.isEmpty((intlMarketConfigDataM22779i == null || (intlMarketConfigDataMeta = intlMarketConfigDataM22779i.meta) == null) ? null : intlMarketConfigDataMeta.template)) {
            return;
        }
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        IntlMarketRequestParams intlMarketRequestParams = new IntlMarketRequestParams();
        intlMarketRequestParams.regular_option = 0;
        intlMarketRequestParams.mcc = String.valueOf(qib0.f0);
        if (1 == source) {
            Long l2 = (Long) CoreModule.c.e0.P0.get();
            long jM22787q = m22787q();
            if (l2 == null || l2.longValue() != jM22787q) {
                return;
            }
        }
        s69 s69Var = CoreModule.c.A1;
        s69Var.getClass();
        s69.s3(s69Var, act, intlMarketRequestParams, (Function0) null, new Function1() { // from class: l.sbo
            public final Object invoke(Object obj) {
                return ubo.m22771a(source, booleanRef, act, (IntlMarketResponseEnvelope) obj);
            }
        }, 4, (Object) null);
    }

    /* JADX INFO: renamed from: o */
    public final xaj0<Long, Integer, Integer> m22785o(String str) {
        String[] strArr = (String[]) StringsKt.split$default(str, new String[]{"_"}, false, 0, 6, (Object) null).toArray(new String[0]);
        if (!NullChecker.a(strArr) || strArr.length <= 2) {
            xaj0<Long, Integer, Integer> xaj0VarA = xaj0.a(0L, 0, 0);
            xaj0VarA.getClass();
            return xaj0VarA;
        }
        xaj0<Long, Integer, Integer> xaj0VarA2 = xaj0.a(Long.valueOf(strArr[0]), Integer.valueOf(strArr[1]), Integer.valueOf(strArr[2]));
        xaj0VarA2.getClass();
        return xaj0VarA2;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m22786p() {
        IntlMarketConfigDataMeta intlMarketConfigDataMeta;
        IntlMarketConfigData intlMarketConfigDataM22779i = m22779i();
        if (TextUtils.isEmpty((intlMarketConfigDataM22779i == null || (intlMarketConfigDataMeta = intlMarketConfigDataM22779i.meta) == null) ? null : intlMarketConfigDataMeta.template)) {
            return false;
        }
        xaj0<Long, Integer, Integer> xaj0VarM22788r = m22788r();
        Object obj = xaj0VarM22788r.b;
        obj.getClass();
        int iD = xck0.d(((Number) obj).intValue(), Integer.MAX_VALUE);
        long jM18550o = mqi0.m18550o();
        Object obj2 = xaj0VarM22788r.a;
        obj2.getClass();
        if (qqi0.h(jM18550o, ((Number) obj2).longValue(), iD)) {
            return true;
        }
        Object obj3 = xaj0VarM22788r.a;
        obj3.getClass();
        return mqi0.m18535D(((Number) obj3).longValue()) && ((Number) xaj0VarM22788r.c).intValue() < 1;
    }

    /* JADX INFO: renamed from: q */
    public final int m22787q() {
        IntlMarketConfigDataMeta intlMarketConfigDataMeta;
        IntlMarketConfigData intlMarketConfigDataM22779i = m22779i();
        if (intlMarketConfigDataM22779i == null || (intlMarketConfigDataMeta = intlMarketConfigDataM22779i.meta) == null) {
            return -1;
        }
        return intlMarketConfigDataMeta.popups;
    }

    /* JADX INFO: renamed from: r */
    public final xaj0<Long, Integer, Integer> m22788r() {
        IntlMarketConfigDataMeta intlMarketConfigDataMeta;
        IntlMarketConfigData intlMarketConfigDataM22779i = m22779i();
        String str = (intlMarketConfigDataM22779i == null || (intlMarketConfigDataMeta = intlMarketConfigDataM22779i.meta) == null) ? null : intlMarketConfigDataMeta.template;
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != 97513456) {
                if (iHashCode == 1086463900 && str.equals("regular")) {
                    Object obj = foc0.INSTANCE.b().get();
                    obj.getClass();
                    return m22785o((String) obj);
                }
            } else if (str.equals("flash")) {
                Object obj2 = C0428a.INSTANCE.m8393c().get();
                obj2.getClass();
                return m22785o((String) obj2);
            }
        }
        xaj0<Long, Integer, Integer> xaj0VarA = xaj0.a(0L, 0, 0);
        xaj0VarA.getClass();
        return xaj0VarA;
    }

    /* JADX INFO: renamed from: s */
    public final void m22789s(@NotNull uqd0 savedString) {
        String str;
        IntlMarketConfigDataMeta intlMarketConfigDataMeta;
        savedString.getClass();
        IntlMarketConfigData intlMarketConfigDataM22779i = m22779i();
        if (TextUtils.isEmpty((intlMarketConfigDataM22779i == null || (intlMarketConfigDataMeta = intlMarketConfigDataM22779i.meta) == null) ? null : intlMarketConfigDataMeta.template)) {
            return;
        }
        xaj0<Long, Integer, Integer> xaj0VarM22788r = m22788r();
        Object obj = xaj0VarM22788r.a;
        obj.getClass();
        if (mqi0.m18535D(((Number) obj).longValue())) {
            Object obj2 = xaj0VarM22788r.a;
            Object obj3 = xaj0VarM22788r.b;
            Integer numValueOf = Integer.valueOf(((Number) xaj0VarM22788r.c).intValue() + 1);
            xaj0VarM22788r.c = numValueOf;
            str = obj2 + "_" + obj3 + "_" + numValueOf;
        } else {
            long jM18550o = mqi0.m18550o();
            Integer numValueOf2 = Integer.valueOf(((Number) xaj0VarM22788r.b).intValue() + 1);
            xaj0VarM22788r.b = numValueOf2;
            str = jM18550o + "_" + numValueOf2 + "_1";
        }
        savedString.put(str);
    }
}
