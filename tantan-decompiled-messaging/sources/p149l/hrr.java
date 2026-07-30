package p149l;

import com.p046p1.mobile.putong.live.external.view.widgets.LiveActivitiesInfiltrationView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R$\u0010\u0019\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m87232d2 = {"Ll/hrr;", "Ll/d1q;", "Lcom/p1/mobile/putong/live/external/view/widgets/LiveActivitiesInfiltrationView;", "Ll/dsr;", "presenter", "<init>", "(Ll/dsr;)V", "", "o", "()I", "itemView", "", "H", "(Lcom/p1/mobile/putong/live/external/view/widgets/LiveActivitiesInfiltrationView;)V", "a", "Ll/dsr;", "getPresenter", "()Ll/dsr;", "Ll/qrr;", "b", "Ll/qrr;", "getLiveActivitiesInfo", "()Ll/qrr;", "I", "(Ll/qrr;)V", "liveActivitiesInfo", "external_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class hrr extends d1q<LiveActivitiesInfiltrationView> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final dsr presenter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public qrr liveActivitiesInfo;

    public hrr(@NotNull dsr dsrVar) {
        dsrVar.getClass();
        this.presenter = dsrVar;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo70566u(@NotNull LiveActivitiesInfiltrationView itemView) {
        itemView.getClass();
        super.mo70566u(itemView);
        dsr dsrVar = this.presenter;
        qrr qrrVar = this.liveActivitiesInfo;
        qrrVar.getClass();
        itemView.m70896d(dsrVar, qrrVar);
    }

    /* JADX INFO: renamed from: I */
    public final void m132715I(@Nullable qrr qrrVar) {
        this.liveActivitiesInfo = qrrVar;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return s6c0.f162731b;
    }
}
