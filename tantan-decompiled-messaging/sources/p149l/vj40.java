package p149l;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.base.data.VirtualVoiceMotionType;
import com.p046p1.mobile.putong.live.livingroom.virtual.call.view.VoiceVirtualNineDeputyWidgetView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p149l.nnn0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u0012\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0003B#\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001c\u0010\u001bR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, m87232d2 = {"Ll/vj40;", "Ll/nnn0;", "D", "Ll/up2;", "Lcom/p1/mobile/putong/live/livingroom/virtual/call/view/VoiceVirtualNineDeputyWidgetView;", "Ll/o3p0;", "Ll/bsm;", "curInfo", "Ll/a0m0;", "manager", "<init>", "(Ll/bsm;Ll/a0m0;)V", "", "g", "()I", BLiveStormDanmakuGiftResourceType.f44446s, "()Ll/o3p0;", "Lcom/p1/mobile/putong/live/base/data/VirtualVoiceMotionType;", "type", "", "m", "(Lcom/p1/mobile/putong/live/base/data/VirtualVoiceMotionType;)V", "Landroid/view/ViewGroup;", "viewGroup", "r", "(Landroid/view/ViewGroup;)V", "o", "()V", "p", "h", "Ll/a0m0;", "getManager", "()Ll/a0m0;", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class vj40<D extends nnn0> extends up2<VoiceVirtualNineDeputyWidgetView, o3p0<?>> {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final a0m0<D> manager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vj40(@NotNull bsm<D> bsmVar, @NotNull a0m0<D> a0m0Var) {
        super(bsmVar, VirtualVoiceMotionType.get(VirtualVoiceMotionType.nineDeputy));
        bsmVar.getClass();
        a0m0Var.getClass();
        this.manager = a0m0Var;
    }

    @Override // p149l.up2
    /* JADX INFO: renamed from: g */
    public int mo105616g() {
        return t6c0.f168222Va;
    }

    @Override // p149l.up2
    /* JADX INFO: renamed from: m */
    public void mo109608m(@NotNull VirtualVoiceMotionType type) {
        type.getClass();
        super.mo109608m(type);
    }

    @Override // p149l.up2
    /* JADX INFO: renamed from: o */
    public void mo105618o() {
        super.mo105618o();
        if (this.manager.getCurrentMotionType() != null) {
            ((VoiceVirtualNineDeputyWidgetView) this.f177564c).m76916t0();
        }
    }

    @Override // p149l.up2
    /* JADX INFO: renamed from: p */
    public void mo105619p() {
        super.mo105619p();
        if (this.manager.getCurrentMotionType() != null) {
            ((VoiceVirtualNineDeputyWidgetView) this.f177564c).m76917v0();
        }
    }

    @Override // p149l.up2
    /* JADX INFO: renamed from: r */
    public void mo194596r(@NotNull ViewGroup viewGroup) {
        viewGroup.getClass();
        super.mo194596r(viewGroup);
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.C0220a) {
            ConstraintLayout.C0220a c0220a = (ConstraintLayout.C0220a) layoutParams;
            ((ViewGroup.MarginLayoutParams) c0220a).rightMargin = t100.m186890d(12.0f);
            ((ViewGroup.MarginLayoutParams) c0220a).topMargin = t100.m186890d(10.0f);
        }
    }

    @Override // p149l.up2
    @NotNull
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public o3p0<D> mo105617h() {
        bsm<? extends nnn0> bsmVar = this.f177562a;
        return bsmVar.f77098d ? new k4p0(bsmVar) : new o4p0(bsmVar);
    }
}
