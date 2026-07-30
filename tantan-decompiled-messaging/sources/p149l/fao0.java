package p149l;

import android.net.NetworkInfo;
import com.p046p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage;
import com.p046p1.mobile.putong.live.base.data.BLiveOperation;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationItem;
import com.p046p1.mobile.putong.live.livingroom.virtual.api.VirtualVoiceRoomApiProvider;
import com.p046p1.mobile.putong.live.livingroom.virtual.redpacket.VoiceRedPacketView;
import com.tantanapp.common.utils.ConnectivityReceiver;

/* JADX INFO: loaded from: classes5.dex */
public class fao0 extends h4t<nnn0, VoiceRedPacketView> {

    /* JADX INFO: renamed from: i */
    public static String f96632i = "voiceRedPacket";

    /* JADX WARN: Multi-variable type inference failed */
    public fao0(bsm bsmVar, VoiceRedPacketView voiceRedPacketView) {
        super(bsmVar);
        mo51532C(voiceRedPacketView);
        ((VoiceRedPacketView) this.viewModel).setCurrentPackId(((nnn0) m206027E2()).f139756Z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S3 */
    public /* synthetic */ void m120246S3(NetworkInfo networkInfo) {
        m120249T3();
    }

    /* JADX INFO: renamed from: P3 */
    public final void m120247P3(BLiveOperation bLiveOperation) {
        if (bLiveOperation == null || vwb.m200296J(bLiveOperation.operations)) {
            ((VoiceRedPacketView) this.viewModel).m77296E();
            return;
        }
        BLiveOperationItem bLiveOperationItem = (BLiveOperationItem) vwb.m200346r(bLiveOperation.operations, new w9j() { // from class: l.eao0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(fao0.f96632i.equals(((BLiveOperationItem) obj).type));
            }
        });
        V v2 = this.viewModel;
        if (bLiveOperationItem == null) {
            ((VoiceRedPacketView) v2).m77296E();
        } else {
            ((VoiceRedPacketView) v2).m77307S(bLiveOperationItem);
        }
    }

    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ void m120248R3(LongLinkSocketMessage.OperationUpdateNotice operationUpdateNotice) {
        m120249T3();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T3 */
    public void m120249T3() {
        m104250o2(VirtualVoiceRoomApiProvider.getVoiceRedPacketData(((nnn0) m206027E2()).m149818o(), ((nnn0) m206027E2()).m132140j0()), false).subscribe(ffw.m121197h(new e30() { // from class: l.dao0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f85250a.m120247P3((BLiveOperation) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        m104250o2(((nnn0) m206027E2()).m132160q1().m189044F(), false).filter(new w9j() { // from class: l.z9o0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(fao0.f96632i.equals(((LongLinkSocketMessage.OperationUpdateNotice) obj).getOperationType()));
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.aao0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f68585a.m120248R3((LongLinkSocketMessage.OperationUpdateNotice) obj);
            }
        }));
        m104250o2(ConnectivityReceiver.m81290m(), false).skip(1).filter(new w9j() { // from class: l.bao0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m81284g());
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.cao0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f80041a.m120246S3((NetworkInfo) obj);
            }
        }));
        m120249T3();
    }
}
