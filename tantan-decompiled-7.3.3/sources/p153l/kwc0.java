package p153l;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.IntlMarketConfigEnvelope;
import com.p051p1.mobile.putong.core.data.IntlMarketResponseEnvelope;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0003J\r\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0003J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0003J\r\u0010\u0015\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0003R\u0017\u0010\u001b\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m88121d2 = {"Ll/kwc0;", "", "<init>", "()V", "Ll/jxd0;", "c", "()Ll/jxd0;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "source", "Lcom/p1/mobile/putong/core/data/IntlMarketResponseEnvelope;", "data", "", "isUpdateShowNum", "", "f", "(Lcom/p1/mobile/android/app/Act;ILcom/p1/mobile/putong/core/data/IntlMarketResponseEnvelope;Z)V", Constants.INAPP_DATA_TAG, "e", "h", "g", "Ll/wyd0;", "a", "Ll/wyd0;", "b", "()Ll/wyd0;", "regularStickerReminderNum", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class kwc0 {

    @NotNull
    public static final kwc0 INSTANCE = new kwc0();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final wyd0 regularStickerReminderNum = new wyd0("regular_sticker_reminder_num_" + CoreModule.m30929H().userId(), "0_0_0");

    /* JADX INFO: renamed from: a */
    public static Unit m151682a(Act act, IntlMarketResponseEnvelope intlMarketResponseEnvelope, int i, IntlMarketConfigEnvelope intlMarketConfigEnvelope) {
        intlMarketConfigEnvelope.getClass();
        new gwc0(act).m132668A(intlMarketConfigEnvelope.data, intlMarketResponseEnvelope.data.regular_option, i);
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final wyd0 m151683b() {
        return regularStickerReminderNum;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final jxd0 m151684c() {
        return new jxd0("IntlRegularSticker" + CoreModule.m30929H().userId(), Boolean.FALSE);
    }

    /* JADX INFO: renamed from: d */
    public final void m151685d() {
        i4g0.m138520r("e_intl_mkt_feature_regular_options", "p_intl_mkt_feature_regular_popup");
    }

    /* JADX INFO: renamed from: e */
    public final void m151686e() {
        i4g0.m138526x("e_intl_mkt_feature_regular_options", "p_intl_mkt_feature_regular_popup");
    }

    /* JADX INFO: renamed from: f */
    public final void m151687f(@NotNull final Act act, final int source, @NotNull final IntlMarketResponseEnvelope data, boolean isUpdateShowNum) {
        act.getClass();
        data.getClass();
        if (isUpdateShowNum) {
            udo.INSTANCE.m195519s(regularStickerReminderNum);
        }
        CoreModule.f18264c.f20292A1.m102932m3(act, new Function1() { // from class: l.jwc0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return kwc0.m151682a(act, data, source, (IntlMarketConfigEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public final void m151688g() {
        i4g0.m138520r("e_intl_mkt_regular_popup_button", "p_intl_mkt_feature_regular_popup");
    }

    /* JADX INFO: renamed from: h */
    public final void m151689h() {
        i4g0.m138526x("e_intl_mkt_regular_popup_button", "p_intl_mkt_feature_regular_popup");
    }
}
