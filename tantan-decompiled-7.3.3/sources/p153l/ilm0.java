package p153l;

import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceAdminPanelCounter;
import com.p051p1.mobile.putong.live.livingroom.virtual.api.VirtualVoiceRoomApiProvider;
import com.tantan.live.eventbus.LiveEventBus;
import com.tantan.live.eventbus.LiveEventBus.VoiceVirtualLiveEvent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, m88121d2 = {"Ll/ilm0;", "Ll/qct;", "Ll/oo2;", "Ll/dum;", BaseSei.INFO, "<init>", "(Ll/dum;)V", "", Constants.KEY_T, "()V", "N3", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class ilm0 extends qct<oo2> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ilm0(@NotNull dum<?> dumVar) {
        super(dumVar);
        dumVar.getClass();
    }

    /* JADX INFO: renamed from: J3 */
    public static void m140633J3(ilm0 ilm0Var, LongLinkVirtualVoice.VoiceAdminPanelCounterMessage voiceAdminPanelCounterMessage) {
        ilm0Var.m140637N3();
    }

    /* JADX INFO: renamed from: K3 */
    public static Boolean m140634K3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: L3 */
    public static void m140635L3(ilm0 ilm0Var, BLiveVoiceAdminPanelCounter bLiveVoiceAdminPanelCounter) {
        LiveEventBus liveEventBusM213811F2 = ilm0Var.m213811F2();
        liveEventBusM213811F2.getClass();
        liveEventBusM213811F2.new VoiceVirtualLiveEvent().updateCountEvent().mo199274m(Integer.valueOf(bLiveVoiceAdminPanelCounter.adminPanelRedDot));
    }

    /* JADX INFO: renamed from: M3 */
    public static Boolean m140636M3(LongLinkVirtualVoice.VoiceAdminPanelCounterMessage voiceAdminPanelCounterMessage) {
        return Boolean.valueOf(voiceAdminPanelCounterMessage.isInitialized() && voiceAdminPanelCounterMessage.getMsgType() == LongLinkVirtualVoice.VoiceAdminPanelCounterMessage.MsgType.refresh);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: N3 */
    public final void m140637N3() {
        String strM202191k = m213810E2().m202191k();
        strM202191k.getClass();
        duringCreated(VirtualVoiceRoomApiProvider.adminCounter(strM202191k)).subscribe(dhw.m115829h(new y20() { // from class: l.hlm0
            @Override // p153l.y20
            public final void call(Object obj) {
                ilm0.m140635L3(this.f110517a, (BLiveVoiceAdminPanelCounter) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        m140637N3();
        C22421c<T> c22421cDuringCreated = duringCreated(m213810E2().m168545q1().m98225E0());
        final Function1 function1 = new Function1() { // from class: l.elm0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ilm0.m140636M3((LongLinkVirtualVoice.VoiceAdminPanelCounterMessage) obj);
            }
        };
        c22421cDuringCreated.filter(new qcj() { // from class: l.flm0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ilm0.m140634K3(function1, obj);
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.glm0
            @Override // p153l.y20
            public final void call(Object obj) {
                ilm0.m140633J3(this.f104873a, (LongLinkVirtualVoice.VoiceAdminPanelCounterMessage) obj);
            }
        }));
    }
}
