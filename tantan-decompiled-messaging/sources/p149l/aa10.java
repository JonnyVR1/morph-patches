package p149l;

import com.google.android.exoplayer2.PlaybackException;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallApplyView;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallInviteView;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallMainView;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallSettingsView;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002B%\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0010\u001a\u00020\u000f2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m87232d2 = {"Ll/aa10;", "Ll/qxl;", "Ll/h4t;", "Ll/ho2;", "Lcom/p1/mobile/putong/live/livingroom/recreation/multiCall/dialog/view/MultiCallMainView;", "Ll/bsm;", "Ll/yl40;", "infoPackage", "mainView", "", "tabType", "<init>", "(Ll/bsm;Lcom/p1/mobile/putong/live/livingroom/recreation/multiCall/dialog/view/MultiCallMainView;I)V", "Ll/s7m;", "model", "", "z1", "(Ll/s7m;)V", "J3", "()I", RXScreenCaptureService.KEY_INDEX, "Ll/bsm;", "j", "I", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class aa10 extends h4t<ho2, MultiCallMainView> implements qxl {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final bsm<yl40> infoPackage;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public final int tabType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa10(@NotNull bsm<yl40> bsmVar, @NotNull MultiCallMainView multiCallMainView, int i) {
        super(bsmVar);
        bsmVar.getClass();
        multiCallMainView.getClass();
        this.infoPackage = bsmVar;
        this.tabType = i;
        mo51532C(multiCallMainView);
    }

    /* JADX INFO: renamed from: J3 */
    public final int m95515J3() {
        int i = this.tabType;
        if (i == 3 || i == 4) {
            return 1;
        }
        if (i == -1) {
            return ((List) m129297F3(new j110(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED))).size() > 0 ? 0 : 1;
        }
        return i;
    }

    @Override // p149l.qxl
    /* JADX INFO: renamed from: z1 */
    public void mo95516z1(@NotNull s7m<?> model) {
        model.getClass();
        if (model instanceof MultiCallInviteView) {
            m144512z2(new f810(this.infoPackage, (MultiCallInviteView) model, this.tabType));
        } else if (model instanceof MultiCallSettingsView) {
            m144512z2(new mg10(this.infoPackage, (MultiCallSettingsView) model));
        } else if (model instanceof MultiCallApplyView) {
            m144512z2(new k210(this.infoPackage, (MultiCallApplyView) model));
        }
    }
}
