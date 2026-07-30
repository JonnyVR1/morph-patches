package p149l;

import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.putong.core.data.BonusThreshold;
import com.p046p1.mobile.putong.core.data.LoveBuzzData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\u00020\t8\u0010X\u0090D¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, m87232d2 = {"Ll/xkm0;", "Ll/bp2;", "Ll/mcr;", "lifecycleProvider", "<init>", "(Ll/mcr;)V", "", "x0", "()V", "", "j", "Ljava/lang/String;", "A0", "()Ljava/lang/String;", "TAG", "buzz_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class xkm0 extends bp2 {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final String TAG;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xkm0(@NotNull mcr mcrVar) {
        super("voiceBuzz", mcrVar);
        mcrVar.getClass();
        this.TAG = "VoiceBuzzCallPresenter";
    }

    @Override // p149l.bp2
    @NotNull
    /* JADX INFO: renamed from: A0, reason: from getter */
    public String getTAG() {
        return this.TAG;
    }

    @Override // p149l.bp2
    /* JADX INFO: renamed from: x0 */
    public void mo103032x0() {
        BonusThreshold bonusThreshold;
        j8w.Companion companion = j8w.INSTANCE;
        LoveBuzzData loveBuzzDataM140468v0 = companion.m140473a().m140468v0();
        if (loveBuzzDataM140468v0 != null && loveBuzzDataM140468v0.remainingVoiceBuzz == -1) {
            qa2.INSTANCE.m173681a(getTAG(), "delayVoiceBonus, no need bonus ");
            return;
        }
        hhx hhxVarM140417B0 = companion.m140473a().m140417B0();
        String strM129532d = h6w.INSTANCE.m129532d(hhxVarM140417B0.getChannelToken());
        if (!Intrinsics.m87488d(strM129532d, "bonus_unknown")) {
            qa2.INSTANCE.m173681a(getTAG(), "delayVoiceBonus, buzzBonusStatus " + strM129532d + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            return;
        }
        long jM155944o = (((long) ((loveBuzzDataM140468v0 == null || (bonusThreshold = loveBuzzDataM140468v0.bonusThreshold) == null) ? 75 : bonusThreshold.voiceBuzz)) * 1000) - (mqi0.m155944o() - hhxVarM140417B0.getStartTime());
        long j = jM155944o - 15000;
        qa2.INSTANCE.m173681a(getTAG(), "delayVoiceBonus, time " + j + " delayTime " + jM155944o + " tipTime " + j);
        if (j <= 0 && jM155944o > Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS) {
            dp2 dp2Var = (dp2) this.viewModel;
            if (dp2Var != null) {
                dp2Var.mo112861x();
            }
        } else if (j > 0) {
            e51.m114743H(act(), m103034z0(), j);
        }
        if (jM155944o <= 0) {
            m103029D0();
        } else {
            e51.m114743H(act(), m103033y0(), jM155944o);
        }
    }
}
