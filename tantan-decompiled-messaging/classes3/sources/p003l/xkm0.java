package p003l;

import com.p1.mobile.putong.core.data.BonusThreshold;
import com.p1.mobile.putong.core.data.LoveBuzzData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l.bp2;
import l.dp2;
import l.e51;
import l.h6w;
import l.hhx;
import l.j8w;
import l.jq2;
import l.mcr;
import l.mqi0;
import l.qa2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\u00020\t8\u0010X\u0090D¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Ll/xkm0;", "Ll/bp2;", "Ll/mcr;", "lifecycleProvider", "<init>", "(Ll/mcr;)V", "", "x0", "()V", "", "j", "Ljava/lang/String;", "A0", "()Ljava/lang/String;", "TAG", "buzz_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

    @NotNull
    /* JADX INFO: renamed from: A0, reason: from getter */
    public String getTAG() {
        return this.TAG;
    }

    /* JADX INFO: renamed from: x0 */
    public void m8729x0() {
        BonusThreshold bonusThreshold;
        j8w.a aVar = j8w.Companion;
        LoveBuzzData loveBuzzDataV0 = aVar.a().v0();
        if (loveBuzzDataV0 != null && loveBuzzDataV0.remainingVoiceBuzz == -1) {
            qa2.INSTANCE.a(getTAG(), "delayVoiceBonus, no need bonus ");
            return;
        }
        hhx hhxVarB0 = aVar.a().B0();
        String strD = h6w.INSTANCE.d(hhxVarB0.b());
        if (!Intrinsics.d(strD, "bonus_unknown")) {
            qa2.INSTANCE.a(getTAG(), "delayVoiceBonus, buzzBonusStatus " + strD + " ");
            return;
        }
        long jO = (((long) ((loveBuzzDataV0 == null || (bonusThreshold = loveBuzzDataV0.bonusThreshold) == null) ? 75 : bonusThreshold.voiceBuzz)) * 1000) - (mqi0.o() - hhxVarB0.j());
        long j = jO - 15000;
        qa2.INSTANCE.a(getTAG(), "delayVoiceBonus, time " + j + " delayTime " + jO + " tipTime " + j);
        if (j <= 0 && jO > 5000) {
            dp2 dp2Var = ((jq2) this).viewModel;
            if (dp2Var != null) {
                dp2Var.x();
            }
        } else if (j > 0) {
            e51.H(act(), z0(), j);
        }
        if (jO <= 0) {
            D0();
        } else {
            e51.H(act(), y0(), jO);
        }
    }
}
