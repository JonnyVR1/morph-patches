package p153l;

import com.clevertap.android.sdk.Constants;
import com.google.android.exoplayer2.PlaybackException;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkMultiCallMessage;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationClickAction;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p153l.oo2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m88121d2 = {"Ll/dm10;", "Ll/oo2;", "D", "Ll/hj2;", "Ll/bm10;", "Ll/dum;", BaseSei.INFO, "<init>", "(Ll/dum;)V", "", Constants.KEY_T, "()V", "", BLiveOperationClickAction.scheme, "R3", "(Ljava/lang/String;)V", "P3", "()Ll/bm10;", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class dm10<D extends oo2> extends hj2<D, bm10> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dm10(@NotNull dum<D> dumVar) {
        super(dumVar);
        dumVar.getClass();
    }

    /* JADX INFO: renamed from: O3 */
    public static void m116937O3(dm10 dm10Var, LongLinkMultiCallMessage.MultiCallTurnOnGuide multiCallTurnOnGuide) {
        dm10Var.m135319L3();
        bm10 bm10Var = (bm10) dm10Var.viewModel;
        multiCallTurnOnGuide.getClass();
        bm10Var.m104962z(multiCallTurnOnGuide);
        String reason = multiCallTurnOnGuide.getReason();
        reason.getClass();
        jr10.m146665q(reason);
        dm10Var.mo135321N3();
    }

    @Override // p153l.hj2
    @NotNull
    /* JADX INFO: renamed from: P3, reason: merged with bridge method [inline-methods] */
    public bm10 mo76862K3() {
        Act act = this.f196918e.f90815a;
        act.getClass();
        return new bm10(act);
    }

    /* JADX INFO: renamed from: R3 */
    public final void m116939R3(@NotNull String scheme) {
        scheme.getClass();
        m213811F2().SchemeHandleEvent.handleScheme().mo199273j(new bae0.C15953a(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED).m103154e(scheme).m103152c());
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213810E2().m168545q1().m98244O()).subscribe(dhw.m115829h(new y20() { // from class: l.cm10
            @Override // p153l.y20
            public final void call(Object obj) {
                dm10.m116937O3(this.f82505a, (LongLinkMultiCallMessage.MultiCallTurnOnGuide) obj);
            }
        }));
    }
}
