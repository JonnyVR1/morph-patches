package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.data.VirtualVoiceMotionType;
import com.p051p1.mobile.putong.live.livingroom.virtual.virtualmotion.creator.functionpanel.LiveVirtualVoiceFunctionPanelView;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p153l.rwn0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0003B#\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0013R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m88121d2 = {"Ll/ggn0;", "Ll/rwn0;", "D", "Ll/lq2;", "Lcom/p1/mobile/putong/live/livingroom/virtual/virtualmotion/creator/functionpanel/LiveVirtualVoiceFunctionPanelView;", "Ll/yzu;", "Ll/dum;", "curInfo", "Ll/e9m0;", "manager", "<init>", "(Ll/dum;Ll/e9m0;)V", "", "g", "()I", BLiveStormDanmakuGiftResourceType.f45294s, "()Ll/yzu;", "", "o", "()V", "p", "h", "Ll/dum;", RXScreenCaptureService.KEY_INDEX, "Ll/e9m0;", "getManager", "()Ll/e9m0;", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class ggn0<D extends rwn0> extends lq2<LiveVirtualVoiceFunctionPanelView<D>, yzu<D>> {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final dum<D> curInfo;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final e9m0<D> manager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ggn0(@NotNull dum<D> dumVar, @NotNull e9m0<D> e9m0Var) {
        super(dumVar, VirtualVoiceMotionType.get(VirtualVoiceMotionType.functionPanel));
        dumVar.getClass();
        e9m0Var.getClass();
        this.curInfo = dumVar;
        this.manager = e9m0Var;
    }

    @Override // p153l.lq2
    /* JADX INFO: renamed from: g */
    public int mo129542g() {
        return yec0.f199011a7;
    }

    @Override // p153l.lq2
    /* JADX INFO: renamed from: o */
    public void mo129545o() {
        super.mo129545o();
        if (this.manager.getCurrentMotionType() != null) {
            ((LiveVirtualVoiceFunctionPanelView) this.f133137c).m78767r0();
        }
    }

    @Override // p153l.lq2
    /* JADX INFO: renamed from: p */
    public void mo129546p() {
        super.mo129546p();
        if (this.manager.getCurrentMotionType() != null) {
            ((LiveVirtualVoiceFunctionPanelView) this.f133137c).m78770u0();
        }
    }

    @Override // p153l.lq2
    @NotNull
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public yzu<D> mo129543h() {
        return new yzu<>(this.curInfo);
    }
}
