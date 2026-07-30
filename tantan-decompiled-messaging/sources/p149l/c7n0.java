package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.base.data.VirtualVoiceMotionType;
import com.p046p1.mobile.putong.live.livingroom.virtual.virtualmotion.creator.functionpanel.LiveVirtualVoiceFunctionPanelView;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p149l.nnn0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0003B#\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0013R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m87232d2 = {"Ll/c7n0;", "Ll/nnn0;", "D", "Ll/up2;", "Lcom/p1/mobile/putong/live/livingroom/virtual/virtualmotion/creator/functionpanel/LiveVirtualVoiceFunctionPanelView;", "Ll/xxu;", "Ll/bsm;", "curInfo", "Ll/a0m0;", "manager", "<init>", "(Ll/bsm;Ll/a0m0;)V", "", "g", "()I", BLiveStormDanmakuGiftResourceType.f44446s, "()Ll/xxu;", "", "o", "()V", "p", "h", "Ll/bsm;", RXScreenCaptureService.KEY_INDEX, "Ll/a0m0;", "getManager", "()Ll/a0m0;", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class c7n0<D extends nnn0> extends up2<LiveVirtualVoiceFunctionPanelView<D>, xxu<D>> {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final bsm<D> curInfo;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final a0m0<D> manager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c7n0(@NotNull bsm<D> bsmVar, @NotNull a0m0<D> a0m0Var) {
        super(bsmVar, VirtualVoiceMotionType.get(VirtualVoiceMotionType.functionPanel));
        bsmVar.getClass();
        a0m0Var.getClass();
        this.curInfo = bsmVar;
        this.manager = a0m0Var;
    }

    @Override // p149l.up2
    /* JADX INFO: renamed from: g */
    public int mo105616g() {
        return t6c0.f168279a7;
    }

    @Override // p149l.up2
    /* JADX INFO: renamed from: o */
    public void mo105618o() {
        super.mo105618o();
        if (this.manager.getCurrentMotionType() != null) {
            ((LiveVirtualVoiceFunctionPanelView) this.f177564c).m77584r0();
        }
    }

    @Override // p149l.up2
    /* JADX INFO: renamed from: p */
    public void mo105619p() {
        super.mo105619p();
        if (this.manager.getCurrentMotionType() != null) {
            ((LiveVirtualVoiceFunctionPanelView) this.f177564c).m77587u0();
        }
    }

    @Override // p149l.up2
    @NotNull
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public xxu<D> mo105617h() {
        return new xxu<>(this.curInfo);
    }
}
