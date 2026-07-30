package p149l;

import com.clevertap.android.sdk.Constants;
import com.google.android.exoplayer2.PlaybackException;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationClickAction;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p149l.ho2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m87232d2 = {"Ll/td10;", "Ll/ho2;", "D", "Ll/zi2;", "Ll/rd10;", "Ll/bsm;", BaseSei.INFO, "<init>", "(Ll/bsm;)V", "", Constants.KEY_T, "()V", "", BLiveOperationClickAction.scheme, "R3", "(Ljava/lang/String;)V", "P3", "()Ll/rd10;", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class td10<D extends ho2> extends zi2<D, rd10> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public td10(@NotNull bsm<D> bsmVar) {
        super(bsmVar);
        bsmVar.getClass();
    }

    /* JADX INFO: renamed from: O3 */
    public static void m188062O3(td10 td10Var, LongLinkMultiCallMessage.MultiCallTurnOnGuide multiCallTurnOnGuide) {
        td10Var.m218910L3();
        rd10 rd10Var = (rd10) td10Var.viewModel;
        multiCallTurnOnGuide.getClass();
        rd10Var.m178857z(multiCallTurnOnGuide);
        String reason = multiCallTurnOnGuide.getReason();
        reason.getClass();
        zi10.m218901q(reason);
        td10Var.mo168244N3();
    }

    @Override // p149l.zi2
    @NotNull
    /* JADX INFO: renamed from: P3, reason: merged with bridge method [inline-methods] */
    public rd10 mo75679K3() {
        Act act = this.f188512e.f77095a;
        act.getClass();
        return new rd10(act);
    }

    /* JADX INFO: renamed from: R3 */
    public final void m188064R3(@NotNull String scheme) {
        scheme.getClass();
        m206028F2().SchemeHandleEvent.handleScheme().mo172463j(new x1e0.C21018a(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED).m206701e(scheme).m206699c());
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206027E2().m132160q1().m189062O()).subscribe(ffw.m121197h(new e30() { // from class: l.sd10
            @Override // p149l.e30
            public final void call(Object obj) {
                td10.m188062O3(this.f163798a, (LongLinkMultiCallMessage.MultiCallTurnOnGuide) obj);
            }
        }));
    }
}
