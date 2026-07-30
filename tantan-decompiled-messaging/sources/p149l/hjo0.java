package p149l;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.live.base.data.BLiveExtraResponse;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceVirtualRoomSettleItem;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.virtual.api.VirtualVoiceRoomApiProvider;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p149l.nnn0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m87232d2 = {"Ll/hjo0;", "Ll/nnn0;", "D", "Ll/zi2;", "Ll/djo0;", "Ll/bsm;", "curInfo", "<init>", "(Ll/bsm;)V", "", Constants.KEY_T, "()V", "T3", "()Ll/djo0;", "S3", "k", "Ll/bsm;", "getCurInfo", "()Ll/bsm;", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class hjo0<D extends nnn0> extends zi2<D, djo0> {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final bsm<D> curInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hjo0(@NotNull bsm<D> bsmVar) {
        super(bsmVar);
        bsmVar.getClass();
        this.curInfo = bsmVar;
    }

    /* JADX INFO: renamed from: O3 */
    public static void m131387O3(hjo0 hjo0Var, LongLinkLiveMessage.VoiceSettleGuideMessage voiceSettleGuideMessage) {
        voiceSettleGuideMessage.getClass();
        hjo0Var.m218910L3();
        ((djo0) hjo0Var.viewModel).m112091x(voiceSettleGuideMessage);
        hjo0Var.mo168244N3();
        pul0.m171467y(hjo0Var);
    }

    /* JADX INFO: renamed from: P3 */
    public static void m131388P3(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            osi0.m165783g(((TantanException.Client.CoreService) th).metaMessage);
        }
    }

    /* JADX INFO: renamed from: R3 */
    public static void m131389R3(hjo0 hjo0Var, BLiveExtraResponse bLiveExtraResponse) {
        bLiveExtraResponse.getClass();
        List<BLiveVoiceVirtualRoomSettleItem> list = bLiveExtraResponse.data.voiceSettles;
        list.getClass();
        if (list.isEmpty() || list.get(0).isSettled()) {
            osi0.m165783g(kvc0.m147355d(R$string.f46797Kk));
        }
        ((djo0) hjo0Var.viewModel).mo71727j();
    }

    /* JADX INFO: renamed from: S3 */
    public final void m131390S3() {
        String strM149818o = m206027E2().m149818o();
        strM149818o.getClass();
        String strM199309D0 = ypv.f199493a.m199309D0();
        strM199309D0.getClass();
        duringCreated(VirtualVoiceRoomApiProvider.requestToSettleRoom(strM149818o, strM199309D0)).subscribe(ffw.m121194e(new e30() { // from class: l.fjo0
            @Override // p149l.e30
            public final void call(Object obj) {
                hjo0.m131389R3(this.f97803a, (BLiveExtraResponse) obj);
            }
        }, new e30() { // from class: l.gjo0
            @Override // p149l.e30
            public final void call(Object obj) {
                hjo0.m131388P3((Throwable) obj);
            }
        }));
        pul0.m171466x(this);
    }

    @Override // p149l.zi2
    @NotNull
    /* JADX INFO: renamed from: T3, reason: merged with bridge method [inline-methods] */
    public djo0 mo75679K3() {
        Act act = this.f188512e.f77095a;
        act.getClass();
        return new djo0(act);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206027E2().f108769z.m181789r().m189148u1()).subscribe(ffw.m121197h(new e30() { // from class: l.ejo0
            @Override // p149l.e30
            public final void call(Object obj) {
                hjo0.m131387O3(this.f91773a, (LongLinkLiveMessage.VoiceSettleGuideMessage) obj);
            }
        }));
    }
}
