package p153l;

import android.net.NetworkInfo;
import com.p051p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage;
import com.p051p1.mobile.putong.live.base.data.BLiveOperation;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationItem;
import com.p051p1.mobile.putong.live.livingroom.virtual.api.VirtualVoiceRoomApiProvider;
import com.p051p1.mobile.putong.live.livingroom.virtual.redpacket.VoiceRedPacketView;
import com.tantanapp.common.utils.ConnectivityReceiver;

/* JADX INFO: loaded from: classes5.dex */
public class jjo0 extends i6t<rwn0, VoiceRedPacketView> {

    /* JADX INFO: renamed from: i */
    public static String f121213i = "voiceRedPacket";

    /* JADX WARN: Multi-variable type inference failed */
    public jjo0(dum dumVar, VoiceRedPacketView voiceRedPacketView) {
        super(dumVar);
        mo52715C(voiceRedPacketView);
        ((VoiceRedPacketView) this.viewModel).setCurrentPackId(((rwn0) m213810E2()).f165203Z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S3 */
    public /* synthetic */ void m145091S3(NetworkInfo networkInfo) {
        m145094T3();
    }

    /* JADX INFO: renamed from: P3 */
    public final void m145092P3(BLiveOperation bLiveOperation) {
        if (bLiveOperation == null || jyb.m147479J(bLiveOperation.operations)) {
            ((VoiceRedPacketView) this.viewModel).m78479E();
            return;
        }
        BLiveOperationItem bLiveOperationItem = (BLiveOperationItem) jyb.m147529r(bLiveOperation.operations, new qcj() { // from class: l.ijo0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(jjo0.f121213i.equals(((BLiveOperationItem) obj).type));
            }
        });
        V v2 = this.viewModel;
        if (bLiveOperationItem == null) {
            ((VoiceRedPacketView) v2).m78479E();
        } else {
            ((VoiceRedPacketView) v2).m78490S(bLiveOperationItem);
        }
    }

    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ void m145093R3(LongLinkSocketMessage.OperationUpdateNotice operationUpdateNotice) {
        m145094T3();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T3 */
    public void m145094T3() {
        m113231o2(VirtualVoiceRoomApiProvider.getVoiceRedPacketData(((rwn0) m213810E2()).m202194o(), ((rwn0) m213810E2()).m168526j0()), false).subscribe(dhw.m115829h(new y20() { // from class: l.hjo0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f110253a.m145092P3((BLiveOperation) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        m113231o2(((rwn0) m213810E2()).m168545q1().m98226F(), false).filter(new qcj() { // from class: l.djo0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(jjo0.f121213i.equals(((LongLinkSocketMessage.OperationUpdateNotice) obj).getOperationType()));
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.ejo0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f94314a.m145093R3((LongLinkSocketMessage.OperationUpdateNotice) obj);
            }
        }));
        m113231o2(ConnectivityReceiver.m82473m(), false).skip(1).filter(new qcj() { // from class: l.fjo0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m82467g());
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.gjo0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f104639a.m145091S3((NetworkInfo) obj);
            }
        }));
        m145094T3();
    }
}
