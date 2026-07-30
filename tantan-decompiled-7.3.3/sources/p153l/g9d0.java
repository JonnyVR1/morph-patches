package p153l;

import android.view.animation.AlphaAnimation;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.base.data.VirtualVoiceMotionType;
import com.p051p1.mobile.putong.live.livingroom.virtual.virtualmotion.creator.rightcall.VoiceMembersView;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import p153l.rwn0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u0012\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0003B#\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0018\u0010\u0017R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, m88121d2 = {"Ll/g9d0;", "Ll/rwn0;", "D", "Ll/lq2;", "Lcom/p1/mobile/putong/live/livingroom/virtual/virtualmotion/creator/rightcall/VoiceMembersView;", "Ll/usm0;", "Ll/dum;", "curInfo", "Ll/e9m0;", "manager", "<init>", "(Ll/dum;Ll/e9m0;)V", "", "g", "()I", Constants.KEY_T, "()Ll/usm0;", "Lcom/p1/mobile/putong/live/base/data/VirtualVoiceMotionType;", "type", "", "m", "(Lcom/p1/mobile/putong/live/base/data/VirtualVoiceMotionType;)V", "o", "()V", "p", "h", "Ll/e9m0;", "getManager", "()Ll/e9m0;", "Landroid/view/animation/AlphaAnimation;", RXScreenCaptureService.KEY_INDEX, "Lkotlin/Lazy;", "u", "()Landroid/view/animation/AlphaAnimation;", "alphaAnimation", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class g9d0<D extends rwn0> extends lq2<VoiceMembersView, usm0<?>> {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final e9m0<D> manager;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Lazy alphaAnimation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g9d0(@NotNull dum<D> dumVar, @NotNull e9m0<D> e9m0Var) {
        super(dumVar, VirtualVoiceMotionType.get(VirtualVoiceMotionType.rightCall));
        dumVar.getClass();
        e9m0Var.getClass();
        this.manager = e9m0Var;
        this.alphaAnimation = LazyKt__LazyJVMKt.m88117a(LazyThreadSafetyMode.NONE, new Function0() { // from class: l.f9d0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return g9d0.m129541s();
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public static AlphaAnimation m129541s() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(500L);
        alphaAnimation.setRepeatMode(1);
        alphaAnimation.setFillAfter(true);
        return alphaAnimation;
    }

    @Override // p153l.lq2
    /* JADX INFO: renamed from: g */
    public int mo129542g() {
        return yec0.f198857N9;
    }

    @Override // p153l.lq2
    /* JADX INFO: renamed from: m */
    public void mo129544m(@NotNull VirtualVoiceMotionType type) {
        type.getClass();
        super.mo129544m(type);
        if (this.manager.getCurrentMotionType() != null) {
            ((VoiceMembersView) this.f133137c).startAnimation(m129548u());
        }
    }

    @Override // p153l.lq2
    /* JADX INFO: renamed from: o */
    public void mo129545o() {
        super.mo129545o();
        if (this.manager.getCurrentMotionType() != null) {
            ((VoiceMembersView) this.f133137c).m78817y0();
        }
    }

    @Override // p153l.lq2
    /* JADX INFO: renamed from: p */
    public void mo129546p() {
        super.mo129546p();
        if (this.manager.getCurrentMotionType() != null) {
            ((VoiceMembersView) this.f133137c).m78802H0();
        }
    }

    @Override // p153l.lq2
    @NotNull
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public usm0<?> mo129543h() {
        dum<? extends rwn0> dumVar = this.f133135a;
        return dumVar.f90818d ? new d8o0(dumVar) : new d9o0(dumVar);
    }

    /* JADX INFO: renamed from: u */
    public final AlphaAnimation m129548u() {
        return (AlphaAnimation) this.alphaAnimation.getValue();
    }
}
