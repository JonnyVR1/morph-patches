package p149l;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceAdminPanelCounter;
import com.p046p1.mobile.putong.live.livingroom.virtual.api.VirtualVoiceRoomApiProvider;
import com.tantan.live.eventbus.LiveEventBus;
import com.tantan.live.eventbus.LiveEventBus.VoiceVirtualLiveEvent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, m87232d2 = {"Ll/ecm0;", "Ll/pat;", "Ll/ho2;", "Ll/bsm;", BaseSei.INFO, "<init>", "(Ll/bsm;)V", "", Constants.KEY_T, "()V", "N3", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class ecm0 extends pat<ho2> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ecm0(@NotNull bsm<?> bsmVar) {
        super(bsmVar);
        bsmVar.getClass();
    }

    /* JADX INFO: renamed from: J3 */
    public static void m115735J3(ecm0 ecm0Var, LongLinkVirtualVoice.VoiceAdminPanelCounterMessage voiceAdminPanelCounterMessage) {
        ecm0Var.m115739N3();
    }

    /* JADX INFO: renamed from: K3 */
    public static Boolean m115736K3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: L3 */
    public static void m115737L3(ecm0 ecm0Var, BLiveVoiceAdminPanelCounter bLiveVoiceAdminPanelCounter) {
        LiveEventBus liveEventBusM206028F2 = ecm0Var.m206028F2();
        liveEventBusM206028F2.getClass();
        liveEventBusM206028F2.new VoiceVirtualLiveEvent().updateCountEvent().mo172464m(Integer.valueOf(bLiveVoiceAdminPanelCounter.adminPanelRedDot));
    }

    /* JADX INFO: renamed from: M3 */
    public static Boolean m115738M3(LongLinkVirtualVoice.VoiceAdminPanelCounterMessage voiceAdminPanelCounterMessage) {
        return Boolean.valueOf(voiceAdminPanelCounterMessage.isInitialized() && voiceAdminPanelCounterMessage.getMsgType() == LongLinkVirtualVoice.VoiceAdminPanelCounterMessage.MsgType.refresh);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: N3 */
    public final void m115739N3() {
        String strM149814k = m206027E2().m149814k();
        strM149814k.getClass();
        duringCreated(VirtualVoiceRoomApiProvider.adminCounter(strM149814k)).subscribe(ffw.m121197h(new e30() { // from class: l.dcm0
            @Override // p149l.e30
            public final void call(Object obj) {
                ecm0.m115737L3(this.f85479a, (BLiveVoiceAdminPanelCounter) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        m115739N3();
        C22306c<T> c22306cDuringCreated = duringCreated(m206027E2().m132160q1().m189043E0());
        final Function1 function1 = new Function1() { // from class: l.acm0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ecm0.m115738M3((LongLinkVirtualVoice.VoiceAdminPanelCounterMessage) obj);
            }
        };
        c22306cDuringCreated.filter(new w9j() { // from class: l.bcm0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ecm0.m115736K3(function1, obj);
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.ccm0
            @Override // p149l.e30
            public final void call(Object obj) {
                ecm0.m115735J3(this.f80262a, (LongLinkVirtualVoice.VoiceAdminPanelCounterMessage) obj);
            }
        }));
    }
}
