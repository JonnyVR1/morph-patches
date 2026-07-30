package p149l;

import android.view.animation.ScaleAnimation;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.data.VirtualVoiceMotionType;
import com.p046p1.mobile.putong.live.livingroom.virtual.ktv.view.KtvPanelViewModel;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import p149l.nnn0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003B#\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001c8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, m87232d2 = {"Ll/za3;", "Ll/nnn0;", "D", "Ll/up2;", "Lcom/p1/mobile/putong/live/livingroom/virtual/ktv/view/KtvPanelViewModel;", "Ll/z2r;", "Ll/bsm;", "curInfo", "Ll/a0m0;", "manager", "<init>", "(Ll/bsm;Ll/a0m0;)V", "", "g", "()I", Constants.KEY_T, "()Ll/z2r;", "Lcom/p1/mobile/putong/live/base/data/VirtualVoiceMotionType;", "type", "", "m", "(Lcom/p1/mobile/putong/live/base/data/VirtualVoiceMotionType;)V", "h", "Ll/bsm;", RXScreenCaptureService.KEY_INDEX, "Ll/a0m0;", "getManager", "()Ll/a0m0;", "Landroid/view/animation/ScaleAnimation;", "j", "Lkotlin/Lazy;", "u", "()Landroid/view/animation/ScaleAnimation;", "scaleAnimation", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class za3<D extends nnn0> extends up2<KtvPanelViewModel, z2r> {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final bsm<D> curInfo;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final a0m0<D> manager;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final Lazy scaleAnimation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public za3(@NotNull bsm<D> bsmVar, @NotNull a0m0<D> a0m0Var) {
        super(bsmVar, VirtualVoiceMotionType.get(VirtualVoiceMotionType.bottomCall));
        bsmVar.getClass();
        a0m0Var.getClass();
        this.curInfo = bsmVar;
        this.manager = a0m0Var;
        this.scaleAnimation = LazyKt__LazyJVMKt.m87228a(LazyThreadSafetyMode.NONE, new Function0() { // from class: l.ya3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return za3.m217718s();
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public static ScaleAnimation m217718s() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(300L);
        scaleAnimation.setRepeatMode(1);
        scaleAnimation.setFillAfter(true);
        return scaleAnimation;
    }

    @Override // p149l.up2
    /* JADX INFO: renamed from: g */
    public int mo105616g() {
        return t6c0.f168476p9;
    }

    @Override // p149l.up2
    /* JADX INFO: renamed from: m */
    public void mo109608m(@NotNull VirtualVoiceMotionType type) {
        type.getClass();
        super.mo109608m(type);
        m194595q(this.f177563b, ((KtvPanelViewModel) this.f177564c).f52442c);
        if (this.manager.getCurrentMotionType() != null) {
            ((KtvPanelViewModel) this.f177564c).f52442c.startAnimation(m217720u());
        }
        ((KtvPanelViewModel) this.f177564c).setMemberSwallow(this.curInfo.f77100f);
    }

    @Override // p149l.up2
    @NotNull
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public z2r mo105617h() {
        return new z2r(this.curInfo);
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final ScaleAnimation m217720u() {
        return (ScaleAnimation) this.scaleAnimation.getValue();
    }
}
