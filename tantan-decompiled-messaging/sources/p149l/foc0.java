package p149l;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.IntlMarketConfigEnvelope;
import com.p046p1.mobile.putong.core.data.IntlMarketResponseEnvelope;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m87231d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0003J\r\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0003J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0003J\r\u0010\u0015\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0003R\u0017\u0010\u001b\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m87232d2 = {"Ll/foc0;", "", "<init>", "()V", "Ll/hpd0;", "c", "()Ll/hpd0;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "source", "Lcom/p1/mobile/putong/core/data/IntlMarketResponseEnvelope;", "data", "", "isUpdateShowNum", "", "f", "(Lcom/p1/mobile/android/app/Act;ILcom/p1/mobile/putong/core/data/IntlMarketResponseEnvelope;Z)V", Constants.INAPP_DATA_TAG, "e", "h", "g", "Ll/uqd0;", "a", "Ll/uqd0;", "b", "()Ll/uqd0;", "regularStickerReminderNum", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class foc0 {

    @NotNull
    public static final foc0 INSTANCE = new foc0();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final uqd0 regularStickerReminderNum = new uqd0("regular_sticker_reminder_num_" + CoreModule.m29931H().userId(), "0_0_0");

    /* JADX INFO: renamed from: a */
    public static Unit m122429a(Act act, IntlMarketResponseEnvelope intlMarketResponseEnvelope, int i, IntlMarketConfigEnvelope intlMarketConfigEnvelope) {
        intlMarketConfigEnvelope.getClass();
        new boc0(act).m102925A(intlMarketConfigEnvelope.data, intlMarketResponseEnvelope.data.regular_option, i);
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final uqd0 m122430b() {
        return regularStickerReminderNum;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final hpd0 m122431c() {
        return new hpd0("IntlRegularSticker" + CoreModule.m29931H().userId(), Boolean.FALSE);
    }

    /* JADX INFO: renamed from: d */
    public final void m122432d() {
        zvf0.m220396r("e_intl_mkt_feature_regular_options", "p_intl_mkt_feature_regular_popup");
    }

    /* JADX INFO: renamed from: e */
    public final void m122433e() {
        zvf0.m220402x("e_intl_mkt_feature_regular_options", "p_intl_mkt_feature_regular_popup");
    }

    /* JADX INFO: renamed from: f */
    public final void m122434f(@NotNull final Act act, final int source, @NotNull final IntlMarketResponseEnvelope data, boolean isUpdateShowNum) {
        act.getClass();
        data.getClass();
        if (isUpdateShowNum) {
            ubo.INSTANCE.m192898s(regularStickerReminderNum);
        }
        CoreModule.f17545c.f19550A1.m182436m3(act, new Function1() { // from class: l.eoc0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return foc0.m122429a(act, data, source, (IntlMarketConfigEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public final void m122435g() {
        zvf0.m220396r("e_intl_mkt_regular_popup_button", "p_intl_mkt_feature_regular_popup");
    }

    /* JADX INFO: renamed from: h */
    public final void m122436h() {
        zvf0.m220402x("e_intl_mkt_regular_popup_button", "p_intl_mkt_feature_regular_popup");
    }
}
