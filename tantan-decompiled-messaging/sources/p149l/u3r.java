package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.VirtualVoiceMotionType;
import com.p046p1.mobile.putong.live.livingroom.virtual.api.VoiceVirtualApi;
import com.p046p1.mobile.putong.live.livingroom.virtual.room.functions.dialog.ktv.KtvView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m87232d2 = {"Ll/u3r;", "Ll/h4t;", "Ll/nnn0;", "Lcom/p1/mobile/putong/live/livingroom/virtual/room/functions/dialog/ktv/KtvView;", "Ll/bsm;", "curInfo", "announcementView", "<init>", "(Ll/bsm;Lcom/p1/mobile/putong/live/livingroom/virtual/room/functions/dialog/ktv/KtvView;)V", "", "L3", "()V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class u3r extends h4t<nnn0, KtvView> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3r(@NotNull bsm<? extends nnn0> bsmVar, @NotNull KtvView ktvView) {
        super(bsmVar);
        bsmVar.getClass();
        ktvView.getClass();
        mo51532C(ktvView);
    }

    /* JADX INFO: renamed from: J3 */
    public static void m191611J3(Throwable th) {
        th.getClass();
        r610.m178005j(th);
    }

    /* JADX INFO: renamed from: K3 */
    public static void m191612K3(u3r u3rVar, BLiveEnvelope bLiveEnvelope) {
        u3rVar.m206028F2().VoiceVirtualLiveEvent.showFunctionsDialog().mo172463j(-1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: L3 */
    public final void m191613L3() {
        if (x4s.m207014d(((nnn0) m206027E2()).mo149813j().liveMode) && Intrinsics.m87488d(VirtualVoiceMotionType.ktv, ((nnn0) m206027E2()).mo149813j().template)) {
            lsi0.m151595y("已开启此模式");
            return;
        }
        String strM149814k = ((nnn0) m206027E2()).m149814k();
        strM149814k.getClass();
        duringCreated(VoiceVirtualApi.switchTemplate(strM149814k, VirtualVoiceMotionType.ktv)).subscribe(ffw.m121194e(new e30() { // from class: l.s3r
            @Override // p149l.e30
            public final void call(Object obj) {
                u3r.m191612K3(this.f162190a, (BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.t3r
            @Override // p149l.e30
            public final void call(Object obj) {
                u3r.m191611J3((Throwable) obj);
            }
        }));
    }
}
