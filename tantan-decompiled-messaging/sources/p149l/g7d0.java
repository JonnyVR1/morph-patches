package p149l;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.live.livingroom.base.room.RoomView;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p149l.bsm;
import p149l.pn40;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u000e\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0005B\u001f\u0012\u0006\u0010\u0006\u001a\u00028\u0001\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m87232d2 = {"Ll/g7d0;", "Ll/pn40;", "D", "Ll/bsm;", j6f.GPS_DIRECTION_TRUE, "Ll/pat;", BaseSei.INFO, "Ll/jbd0;", "roomPresenter", "Lcom/p1/mobile/putong/live/livingroom/base/room/RoomView;", "roomView", "<init>", "(Ll/bsm;Ll/jbd0;Lcom/p1/mobile/putong/live/livingroom/base/room/RoomView;)V", "", Constants.KEY_T, "()V", RXScreenCaptureService.KEY_INDEX, "Ll/jbd0;", "j", "Lcom/p1/mobile/putong/live/livingroom/base/room/RoomView;", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class g7d0<D extends pn40, T extends bsm<D>> extends pat<D> {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final jbd0 roomPresenter;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final RoomView roomView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g7d0(@NotNull T t, @NotNull jbd0 jbd0Var, @NotNull RoomView roomView) {
        super(t);
        t.getClass();
        jbd0Var.getClass();
        roomView.getClass();
        this.roomPresenter = jbd0Var;
        this.roomView = roomView;
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        if (Intrinsics.m87488d("friends", m206027E2().mo149813j().liveMode)) {
            return;
        }
        boolean zM198092b = vdt.m198092b(2);
        jbd0 jbd0Var = this.roomPresenter;
        if (zM198092b) {
        }
        this.roomPresenter.m144512z2(new tfl(this.f188512e, this.roomView.f47951u));
        this.roomPresenter.m144512z2(new pfl(this.f188512e, this.roomView.f47952v));
        boolean zM195802b7 = ypv.m215672k().m195802b7();
        jbd0 jbd0Var2 = this.roomPresenter;
        if (zM195802b7) {
        }
    }
}
