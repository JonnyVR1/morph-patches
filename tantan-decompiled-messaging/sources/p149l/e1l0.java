package p149l;

import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.putong.core.data.BonusThreshold;
import com.p046p1.mobile.putong.core.data.LoveBuzzData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C15167a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\u00020\t8\u0010X\u0090D¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, m87232d2 = {"Ll/e1l0;", "Ll/bp2;", "Ll/mcr;", "lifecycleProvider", "<init>", "(Ll/mcr;)V", "", "x0", "()V", "", "j", "Ljava/lang/String;", "A0", "()Ljava/lang/String;", "TAG", "buzz_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
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
        if (loveBuzzDataM140468v0 != null && loveBuzzDataM140468v0.remainingVideoBuzz == -1) {
            qa2.INSTANCE.m173681a(getTAG(), "delayVideoBonus, no need bonus ");
            return;
        }
        String strM129532d = h6w.INSTANCE.m129532d(companion.m140473a().m140417B0().getChannelToken());
        if (!Intrinsics.m87488d(strM129532d, "bonus_unknown")) {
            qa2.INSTANCE.m173681a(getTAG(), "delayVideoBonus, buzzBonusStatus " + strM129532d + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            return;
        }
        int i = (loveBuzzDataM140468v0 == null || (bonusThreshold = loveBuzzDataM140468v0.bonusThreshold) == null) ? 60 : bonusThreshold.videoBuzz;
        e51.m114743H(act(), m103034z0(), C15167a.m87597c(((long) (i - 15)) * 1000, 0L));
        qa2.INSTANCE.m173681a(getTAG(), "delayVideoBonus, delayTime " + i + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        if (i > 0) {
            e51.m114743H(act(), m103033y0(), ((long) i) * 1000);
        }
    }
}
