package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.VirtualVoiceMotionType;
import com.p051p1.mobile.putong.live.livingroom.virtual.api.VoiceVirtualApi;
import com.p051p1.mobile.putong.live.livingroom.virtual.room.functions.dialog.ktv.KtvView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m88121d2 = {"Ll/v5r;", "Ll/i6t;", "Ll/rwn0;", "Lcom/p1/mobile/putong/live/livingroom/virtual/room/functions/dialog/ktv/KtvView;", "Ll/dum;", "curInfo", "announcementView", "<init>", "(Ll/dum;Lcom/p1/mobile/putong/live/livingroom/virtual/room/functions/dialog/ktv/KtvView;)V", "", "L3", "()V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class v5r extends i6t<rwn0, KtvView> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5r(@NotNull dum<? extends rwn0> dumVar, @NotNull KtvView ktvView) {
        super(dumVar);
        dumVar.getClass();
        ktvView.getClass();
        mo52715C(ktvView);
    }

    /* JADX INFO: renamed from: J3 */
    public static void m199914J3(Throwable th) {
        th.getClass();
        bf10.m103834j(th);
    }

    /* JADX INFO: renamed from: K3 */
    public static void m199915K3(v5r v5rVar, BLiveEnvelope bLiveEnvelope) {
        v5rVar.m213811F2().VoiceVirtualLiveEvent.showFunctionsDialog().mo199273j(-1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: L3 */
    public final void m199916L3() {
        if (y6s.m214496d(((rwn0) m213810E2()).mo183435j().liveMode) && Intrinsics.m88377d(VirtualVoiceMotionType.ktv, ((rwn0) m213810E2()).mo183435j().template)) {
            o1j0.m165651y("已开启此模式");
            return;
        }
        String strM202191k = ((rwn0) m213810E2()).m202191k();
        strM202191k.getClass();
        duringCreated(VoiceVirtualApi.switchTemplate(strM202191k, VirtualVoiceMotionType.ktv)).subscribe(dhw.m115826e(new y20() { // from class: l.t5r
            @Override // p153l.y20
            public final void call(Object obj) {
                v5r.m199915K3(this.f172224a, (BLiveEnvelope) obj);
            }
        }, new y20() { // from class: l.u5r
            @Override // p153l.y20
            public final void call(Object obj) {
                v5r.m199914J3((Throwable) obj);
            }
        }));
    }
}
