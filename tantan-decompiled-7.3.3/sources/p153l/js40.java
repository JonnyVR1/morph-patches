package p153l;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.data.VirtualVoiceMotionType;
import com.p051p1.mobile.putong.live.livingroom.virtual.call.view.VoiceVirtualNineDeputyWidgetView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p153l.rwn0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u0012\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0003B#\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001c\u0010\u001bR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, m88121d2 = {"Ll/js40;", "Ll/rwn0;", "D", "Ll/lq2;", "Lcom/p1/mobile/putong/live/livingroom/virtual/call/view/VoiceVirtualNineDeputyWidgetView;", "Ll/scp0;", "Ll/dum;", "curInfo", "Ll/e9m0;", "manager", "<init>", "(Ll/dum;Ll/e9m0;)V", "", "g", "()I", BLiveStormDanmakuGiftResourceType.f45294s, "()Ll/scp0;", "Lcom/p1/mobile/putong/live/base/data/VirtualVoiceMotionType;", "type", "", "m", "(Lcom/p1/mobile/putong/live/base/data/VirtualVoiceMotionType;)V", "Landroid/view/ViewGroup;", "viewGroup", "r", "(Landroid/view/ViewGroup;)V", "o", "()V", "p", "h", "Ll/e9m0;", "getManager", "()Ll/e9m0;", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class js40<D extends rwn0> extends lq2<VoiceVirtualNineDeputyWidgetView, scp0<?>> {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final e9m0<D> manager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public js40(@NotNull dum<D> dumVar, @NotNull e9m0<D> e9m0Var) {
        super(dumVar, VirtualVoiceMotionType.get(VirtualVoiceMotionType.nineDeputy));
        dumVar.getClass();
        e9m0Var.getClass();
        this.manager = e9m0Var;
    }

    @Override // p153l.lq2
    /* JADX INFO: renamed from: g */
    public int mo129542g() {
        return yec0.f198954Va;
    }

    @Override // p153l.lq2
    /* JADX INFO: renamed from: m */
    public void mo129544m(@NotNull VirtualVoiceMotionType type) {
        type.getClass();
        super.mo129544m(type);
    }

    @Override // p153l.lq2
    /* JADX INFO: renamed from: o */
    public void mo129545o() {
        super.mo129545o();
        if (this.manager.getCurrentMotionType() != null) {
            ((VoiceVirtualNineDeputyWidgetView) this.f133137c).m78099t0();
        }
    }

    @Override // p153l.lq2
    /* JADX INFO: renamed from: p */
    public void mo129546p() {
        super.mo129546p();
        if (this.manager.getCurrentMotionType() != null) {
            ((VoiceVirtualNineDeputyWidgetView) this.f133137c).m78100v0();
        }
    }

    @Override // p153l.lq2
    /* JADX INFO: renamed from: r */
    public void mo146834r(@NotNull ViewGroup viewGroup) {
        viewGroup.getClass();
        super.mo146834r(viewGroup);
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.C0221a) {
            ConstraintLayout.C0221a c0221a = (ConstraintLayout.C0221a) layoutParams;
            ((ViewGroup.MarginLayoutParams) c0221a).rightMargin = qa00.m175859d(12.0f);
            ((ViewGroup.MarginLayoutParams) c0221a).topMargin = qa00.m175859d(10.0f);
        }
    }

    @Override // p153l.lq2
    @NotNull
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public scp0<D> mo129543h() {
        dum<? extends rwn0> dumVar = this.f133135a;
        return dumVar.f90818d ? new odp0(dumVar) : new sdp0(dumVar);
    }
}
