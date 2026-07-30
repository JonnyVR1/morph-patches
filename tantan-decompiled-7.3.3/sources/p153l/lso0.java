package p153l;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.live.base.data.BLiveExtraResponse;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceVirtualRoomSettleItem;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.virtual.api.VirtualVoiceRoomApiProvider;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p153l.rwn0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m88121d2 = {"Ll/lso0;", "Ll/rwn0;", "D", "Ll/hj2;", "Ll/hso0;", "Ll/dum;", "curInfo", "<init>", "(Ll/dum;)V", "", Constants.KEY_T, "()V", "T3", "()Ll/hso0;", "S3", "k", "Ll/dum;", "getCurInfo", "()Ll/dum;", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class lso0<D extends rwn0> extends hj2<D, hso0> {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final dum<D> curInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lso0(@NotNull dum<D> dumVar) {
        super(dumVar);
        dumVar.getClass();
        this.curInfo = dumVar;
    }

    /* JADX INFO: renamed from: O3 */
    public static void m155721O3(lso0 lso0Var, LongLinkLiveMessage.VoiceSettleGuideMessage voiceSettleGuideMessage) {
        voiceSettleGuideMessage.getClass();
        lso0Var.m135319L3();
        ((hso0) lso0Var.viewModel).m137026x(voiceSettleGuideMessage);
        lso0Var.mo135321N3();
        t3m0.m189111y(lso0Var);
    }

    /* JADX INFO: renamed from: P3 */
    public static void m155722P3(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            r1j0.m179420g(((TantanException.Client.CoreService) th).metaMessage);
        }
    }

    /* JADX INFO: renamed from: R3 */
    public static void m155723R3(lso0 lso0Var, BLiveExtraResponse bLiveExtraResponse) {
        bLiveExtraResponse.getClass();
        List<BLiveVoiceVirtualRoomSettleItem> list = bLiveExtraResponse.data.voiceSettles;
        list.getClass();
        if (list.isEmpty() || list.get(0).isSettled()) {
            r1j0.m179420g(n3d0.m161280d(R$string.f47645Kk));
        }
        ((hso0) lso0Var.viewModel).mo72910j();
    }

    /* JADX INFO: renamed from: S3 */
    public final void m155724S3() {
        String strM202194o = m213810E2().m202194o();
        strM202194o.getClass();
        String strM207631D0 = zrv.f205799a.m207631D0();
        strM207631D0.getClass();
        duringCreated(VirtualVoiceRoomApiProvider.requestToSettleRoom(strM202194o, strM207631D0)).subscribe(dhw.m115826e(new y20() { // from class: l.jso0
            @Override // p153l.y20
            public final void call(Object obj) {
                lso0.m155723R3(this.f122482a, (BLiveExtraResponse) obj);
            }
        }, new y20() { // from class: l.kso0
            @Override // p153l.y20
            public final void call(Object obj) {
                lso0.m155722P3((Throwable) obj);
            }
        }));
        t3m0.m189110x(this);
    }

    @Override // p153l.hj2
    @NotNull
    /* JADX INFO: renamed from: T3, reason: merged with bridge method [inline-methods] */
    public hso0 mo76862K3() {
        Act act = this.f196918e.f90815a;
        act.getClass();
        return new hso0(act);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213810E2().f148282z.m170284r().m98330u1()).subscribe(dhw.m115829h(new y20() { // from class: l.iso0
            @Override // p153l.y20
            public final void call(Object obj) {
                lso0.m155721O3(this.f116692a, (LongLinkLiveMessage.VoiceSettleGuideMessage) obj);
            }
        }));
    }
}
