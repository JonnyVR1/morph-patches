package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.IntlCampingConfigEnvelope;
import com.p046p1.mobile.putong.core.data.IntlCampingQuestionsData;
import com.p046p1.mobile.putong.core.data.IntlCampingSummaryData;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\tJ\r\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\t¨\u0006\f"}, m87232d2 = {"Ll/x3n;", "Ll/jq2;", "Ll/f4n;", "Ll/mcr;", "lifecycleProvider", "<init>", "(Ll/mcr;)V", "", "destroy", "()V", "h0", "f0", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class x3n extends jq2<f4n> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3n(@NotNull mcr mcrVar) {
        super(mcrVar);
        mcrVar.getClass();
    }

    /* JADX INFO: renamed from: g0 */
    public static final Unit m206930g0(x3n x3nVar, IntlCampingConfigEnvelope intlCampingConfigEnvelope) {
        intlCampingConfigEnvelope.getClass();
        f4n f4nVar = (f4n) x3nVar.viewModel;
        IntlCampingSummaryData intlCampingSummaryData = intlCampingConfigEnvelope.data.summary;
        intlCampingSummaryData.getClass();
        List<IntlCampingQuestionsData> list = intlCampingConfigEnvelope.data.questions;
        list.getClass();
        f4nVar.m119333B(intlCampingSummaryData, list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f0 */
    public final void m206931f0() {
        Act act = act();
        if (act != null) {
            CoreModule.f17545c.f19703z1.m110036o3(act, new Function1() { // from class: l.w3n
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return x3n.m206930g0(this.f184407a, (IntlCampingConfigEnvelope) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final void m206932h0() {
        ((f4n) this.viewModel).m119340r();
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
