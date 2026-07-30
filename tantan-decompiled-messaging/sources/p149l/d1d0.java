package p149l;

import android.view.animation.AlphaAnimation;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.data.VirtualVoiceMotionType;
import com.p046p1.mobile.putong.live.livingroom.virtual.virtualmotion.creator.rightcall.VoiceMembersView;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import p149l.nnn0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u0012\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0003B#\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0018\u0010\u0017R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, m87232d2 = {"Ll/d1d0;", "Ll/nnn0;", "D", "Ll/up2;", "Lcom/p1/mobile/putong/live/livingroom/virtual/virtualmotion/creator/rightcall/VoiceMembersView;", "Ll/qjm0;", "Ll/bsm;", "curInfo", "Ll/a0m0;", "manager", "<init>", "(Ll/bsm;Ll/a0m0;)V", "", "g", "()I", Constants.KEY_T, "()Ll/qjm0;", "Lcom/p1/mobile/putong/live/base/data/VirtualVoiceMotionType;", "type", "", "m", "(Lcom/p1/mobile/putong/live/base/data/VirtualVoiceMotionType;)V", "o", "()V", "p", "h", "Ll/a0m0;", "getManager", "()Ll/a0m0;", "Landroid/view/animation/AlphaAnimation;", RXScreenCaptureService.KEY_INDEX, "Lkotlin/Lazy;", "u", "()Landroid/view/animation/AlphaAnimation;", "alphaAnimation", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class d1d0<D extends nnn0> extends up2<VoiceMembersView, qjm0<?>> {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final a0m0<D> manager;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Lazy alphaAnimation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1d0(@NotNull bsm<D> bsmVar, @NotNull a0m0<D> a0m0Var) {
        super(bsmVar, VirtualVoiceMotionType.get(VirtualVoiceMotionType.rightCall));
        bsmVar.getClass();
        a0m0Var.getClass();
        this.manager = a0m0Var;
        this.alphaAnimation = LazyKt__LazyJVMKt.m87228a(LazyThreadSafetyMode.NONE, new Function0() { // from class: l.c1d0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return d1d0.m109607s();
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public static AlphaAnimation m109607s() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(500L);
        alphaAnimation.setRepeatMode(1);
        alphaAnimation.setFillAfter(true);
        return alphaAnimation;
    }

    @Override // p149l.up2
    /* JADX INFO: renamed from: g */
    public int mo105616g() {
        return t6c0.f168125N9;
    }

    @Override // p149l.up2
    /* JADX INFO: renamed from: m */
    public void mo109608m(@NotNull VirtualVoiceMotionType type) {
        type.getClass();
        super.mo109608m(type);
        if (this.manager.getCurrentMotionType() != null) {
            ((VoiceMembersView) this.f177564c).startAnimation(m109610u());
        }
    }

    @Override // p149l.up2
    /* JADX INFO: renamed from: o */
    public void mo105618o() {
        super.mo105618o();
        if (this.manager.getCurrentMotionType() != null) {
            ((VoiceMembersView) this.f177564c).m77634y0();
        }
    }

    @Override // p149l.up2
    /* JADX INFO: renamed from: p */
    public void mo105619p() {
        super.mo105619p();
        if (this.manager.getCurrentMotionType() != null) {
            ((VoiceMembersView) this.f177564c).m77619H0();
        }
    }

    @Override // p149l.up2
    @NotNull
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public qjm0<?> mo105617h() {
        bsm<? extends nnn0> bsmVar = this.f177562a;
        return bsmVar.f77098d ? new zyn0(bsmVar) : new zzn0(bsmVar);
    }

    /* JADX INFO: renamed from: u */
    public final AlphaAnimation m109610u() {
        return (AlphaAnimation) this.alphaAnimation.getValue();
    }
}
