package p153l;

import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.putong.core.data.BonusThreshold;
import com.p051p1.mobile.putong.core.data.LoveBuzzData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C15274a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\u00020\t8\u0010X\u0090D¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, m88121d2 = {"Ll/jal0;", "Ll/sp2;", "Ll/ner;", "lifecycleProvider", "<init>", "(Ll/ner;)V", "", "x0", "()V", "", "j", "Ljava/lang/String;", "A0", "()Ljava/lang/String;", "TAG", "buzz_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class jal0 extends sp2 {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final String TAG;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jal0(@NotNull ner nerVar) {
        super("videoBuzz", nerVar);
        nerVar.getClass();
        this.TAG = "VideoBuzzCallPresenter";
    }

    @Override // p153l.sp2
    @NotNull
    /* JADX INFO: renamed from: A0, reason: from getter */
    public String getTAG() {
        return this.TAG;
    }

    @Override // p153l.sp2
    /* JADX INFO: renamed from: x0 */
    public void mo106535x0() {
        BonusThreshold bonusThreshold;
        haw.Companion companion = haw.INSTANCE;
        LoveBuzzData loveBuzzDataM134315v0 = companion.m134320a().m134315v0();
        if (loveBuzzDataM134315v0 != null && loveBuzzDataM134315v0.remainingVideoBuzz == -1) {
            xa2.INSTANCE.m209830a(getTAG(), "delayVideoBonus, no need bonus ");
            return;
        }
        String strM124568d = f8w.INSTANCE.m124568d(companion.m134320a().m134264B0().getChannelToken());
        if (!Intrinsics.m88377d(strM124568d, "bonus_unknown")) {
            xa2.INSTANCE.m209830a(getTAG(), "delayVideoBonus, buzzBonusStatus " + strM124568d + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            return;
        }
        int i = (loveBuzzDataM134315v0 == null || (bonusThreshold = loveBuzzDataM134315v0.bonusThreshold) == null) ? 60 : bonusThreshold.videoBuzz;
        l51.m152888H(act(), m187323z0(), C15274a.m88487c(((long) (i - 15)) * 1000, 0L));
        xa2.INSTANCE.m209830a(getTAG(), "delayVideoBonus, delayTime " + i + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        if (i > 0) {
            l51.m152888H(act(), m187322y0(), ((long) i) * 1000);
        }
    }
}
