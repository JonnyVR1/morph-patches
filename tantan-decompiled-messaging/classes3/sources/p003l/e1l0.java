package p003l;

import com.p1.mobile.putong.core.data.BonusThreshold;
import com.p1.mobile.putong.core.data.LoveBuzzData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.a;
import l.bp2;
import l.e51;
import l.h6w;
import l.j8w;
import l.mcr;
import l.qa2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\u00020\t8\u0010X\u0090D¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Ll/e1l0;", "Ll/bp2;", "Ll/mcr;", "lifecycleProvider", "<init>", "(Ll/mcr;)V", "", "x0", "()V", "", "j", "Ljava/lang/String;", "A0", "()Ljava/lang/String;", "TAG", "buzz_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e1l0 extends bp2 {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final String TAG;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1l0(@NotNull mcr mcrVar) {
        super("videoBuzz", mcrVar);
        mcrVar.getClass();
        this.TAG = "VideoBuzzCallPresenter";
    }

    @NotNull
    /* JADX INFO: renamed from: A0, reason: from getter */
    public String getTAG() {
        return this.TAG;
    }

    /* JADX INFO: renamed from: x0 */
    public void m3777x0() {
        BonusThreshold bonusThreshold;
        j8w.a aVar = j8w.Companion;
        LoveBuzzData loveBuzzDataV0 = aVar.a().v0();
        if (loveBuzzDataV0 != null && loveBuzzDataV0.remainingVideoBuzz == -1) {
            qa2.INSTANCE.a(getTAG(), "delayVideoBonus, no need bonus ");
            return;
        }
        String strD = h6w.INSTANCE.d(aVar.a().B0().b());
        if (!Intrinsics.d(strD, "bonus_unknown")) {
            qa2.INSTANCE.a(getTAG(), "delayVideoBonus, buzzBonusStatus " + strD + " ");
            return;
        }
        int i = (loveBuzzDataV0 == null || (bonusThreshold = loveBuzzDataV0.bonusThreshold) == null) ? 60 : bonusThreshold.videoBuzz;
        e51.H(act(), z0(), a.c(((long) (i - 15)) * 1000, 0L));
        qa2.INSTANCE.a(getTAG(), "delayVideoBonus, delayTime " + i + " ");
        if (i > 0) {
            e51.H(act(), y0(), ((long) i) * 1000);
        }
    }
}
