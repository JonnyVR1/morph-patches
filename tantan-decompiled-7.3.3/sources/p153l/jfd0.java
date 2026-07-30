package p153l;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.live.livingroom.base.room.RoomView;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p153l.dum;
import p153l.dw40;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u000e\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0005B\u001f\u0012\u0006\u0010\u0006\u001a\u00028\u0001\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m88121d2 = {"Ll/jfd0;", "Ll/dw40;", "D", "Ll/dum;", p7f.GPS_DIRECTION_TRUE, "Ll/qct;", BaseSei.INFO, "Ll/ljd0;", "roomPresenter", "Lcom/p1/mobile/putong/live/livingroom/base/room/RoomView;", "roomView", "<init>", "(Ll/dum;Ll/ljd0;Lcom/p1/mobile/putong/live/livingroom/base/room/RoomView;)V", "", Constants.KEY_T, "()V", RXScreenCaptureService.KEY_INDEX, "Ll/ljd0;", "j", "Lcom/p1/mobile/putong/live/livingroom/base/room/RoomView;", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class jfd0<D extends dw40, T extends dum<D>> extends qct<D> {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final ljd0 roomPresenter;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final RoomView roomView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jfd0(@NotNull T t, @NotNull ljd0 ljd0Var, @NotNull RoomView roomView) {
        super(t);
        t.getClass();
        ljd0Var.getClass();
        roomView.getClass();
        this.roomPresenter = ljd0Var;
        this.roomView = roomView;
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        if (Intrinsics.m88377d("friends", m213810E2().mo183435j().liveMode)) {
            return;
        }
        boolean zM206159b = wft.m206159b(2);
        ljd0 ljd0Var = this.roomPresenter;
        if (zM206159b) {
        }
        this.roomPresenter.m153103z2(new kil(this.f196918e, this.roomView.f48799u));
        this.roomPresenter.m153103z2(new gil(this.f196918e, this.roomView.f48800v));
        boolean zM203589b7 = zrv.m221193k().m203589b7();
        ljd0 ljd0Var2 = this.roomPresenter;
        if (zM203589b7) {
        }
    }
}
