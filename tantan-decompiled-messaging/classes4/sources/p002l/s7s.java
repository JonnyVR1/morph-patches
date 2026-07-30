package p002l;

import com.p000p1.mobile.putong.live.livingroom.base.live.LiveView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l.vdt;
import l.ypv;
import org.jetbrains.annotations.NotNull;
import p002l.bsm;
import p002l.pn40;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u000e\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0005B\u001f\u0012\u0006\u0010\u0006\u001a\u00028\u0001\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Ll/s7s;", "Ll/pn40;", "D", "Ll/bsm;", "T", "Ll/pat;", "info", "Ll/wat;", "livePresenter", "Lcom/p1/mobile/putong/live/livingroom/base/live/LiveView;", "liveView", "<init>", "(Ll/bsm;Ll/wat;Lcom/p1/mobile/putong/live/livingroom/base/live/LiveView;)V", "", "t", "()V", "i", "Ll/wat;", "j", "Lcom/p1/mobile/putong/live/livingroom/base/live/LiveView;", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class s7s<D extends pn40, T extends bsm<D>> extends pat<D> {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final wat livePresenter;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final LiveView liveView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7s(@NotNull T t, @NotNull wat watVar, @NotNull LiveView liveView) {
        super(t);
        t.getClass();
        watVar.getClass();
        liveView.getClass();
        this.livePresenter = watVar;
        this.liveView = liveView;
    }

    /* JADX INFO: renamed from: t */
    public void m22226t() {
        super.t();
        if (Intrinsics.d("friends", m25547E2().m17234j().liveMode)) {
            return;
        }
        boolean zB = vdt.b(2);
        wat watVar = this.livePresenter;
        if (zB) {
        }
        this.livePresenter.z2(new pfl(this.f22036e, this.liveView.f3882q));
        this.livePresenter.z2(new tfl(this.f22036e, this.liveView.f3881p));
        boolean zB7 = ypv.k().b7();
        wat watVar2 = this.livePresenter;
        if (zB7) {
        }
    }
}
