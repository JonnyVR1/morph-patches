package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.IntlCampingConfigEnvelope;
import com.p051p1.mobile.putong.core.data.IntlCampingQuestionsData;
import com.p051p1.mobile.putong.core.data.IntlCampingSummaryData;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\tJ\r\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\t¨\u0006\f"}, m88121d2 = {"Ll/x5n;", "Ll/ar2;", "Ll/f6n;", "Ll/ner;", "lifecycleProvider", "<init>", "(Ll/ner;)V", "", "destroy", "()V", "h0", "f0", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class x5n extends ar2<f6n> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5n(@NotNull ner nerVar) {
        super(nerVar);
        nerVar.getClass();
    }

    /* JADX INFO: renamed from: g0 */
    public static final Unit m209402g0(x5n x5nVar, IntlCampingConfigEnvelope intlCampingConfigEnvelope) {
        intlCampingConfigEnvelope.getClass();
        f6n f6nVar = (f6n) x5nVar.viewModel;
        IntlCampingSummaryData intlCampingSummaryData = intlCampingConfigEnvelope.data.summary;
        intlCampingSummaryData.getClass();
        List<IntlCampingQuestionsData> list = intlCampingConfigEnvelope.data.questions;
        list.getClass();
        f6nVar.m124298B(intlCampingSummaryData, list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f0 */
    public final void m209403f0() {
        Act act = act();
        if (act != null) {
            CoreModule.f18264c.f20445z1.m157206o3(act, new Function1() { // from class: l.w5n
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return x5n.m209402g0(this.f187536a, (IntlCampingConfigEnvelope) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final void m209404h0() {
        ((f6n) this.viewModel).m124305r();
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
