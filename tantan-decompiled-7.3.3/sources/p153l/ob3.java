package p153l;

import android.view.animation.ScaleAnimation;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.base.data.VirtualVoiceMotionType;
import com.p051p1.mobile.putong.live.livingroom.virtual.ktv.view.KtvPanelViewModel;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import p153l.rwn0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003B#\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001c8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, m88121d2 = {"Ll/ob3;", "Ll/rwn0;", "D", "Ll/lq2;", "Lcom/p1/mobile/putong/live/livingroom/virtual/ktv/view/KtvPanelViewModel;", "Ll/a5r;", "Ll/dum;", "curInfo", "Ll/e9m0;", "manager", "<init>", "(Ll/dum;Ll/e9m0;)V", "", "g", "()I", Constants.KEY_T, "()Ll/a5r;", "Lcom/p1/mobile/putong/live/base/data/VirtualVoiceMotionType;", "type", "", "m", "(Lcom/p1/mobile/putong/live/base/data/VirtualVoiceMotionType;)V", "h", "Ll/dum;", RXScreenCaptureService.KEY_INDEX, "Ll/e9m0;", "getManager", "()Ll/e9m0;", "Landroid/view/animation/ScaleAnimation;", "j", "Lkotlin/Lazy;", "u", "()Landroid/view/animation/ScaleAnimation;", "scaleAnimation", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class ob3<D extends rwn0> extends lq2<KtvPanelViewModel, a5r> {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final dum<D> curInfo;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final e9m0<D> manager;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final Lazy scaleAnimation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ob3(@NotNull dum<D> dumVar, @NotNull e9m0<D> e9m0Var) {
        super(dumVar, VirtualVoiceMotionType.get(VirtualVoiceMotionType.bottomCall));
        dumVar.getClass();
        e9m0Var.getClass();
        this.curInfo = dumVar;
        this.manager = e9m0Var;
        this.scaleAnimation = LazyKt__LazyJVMKt.m88117a(LazyThreadSafetyMode.NONE, new Function0() { // from class: l.nb3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ob3.m166916s();
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public static ScaleAnimation m166916s() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(300L);
        scaleAnimation.setRepeatMode(1);
        scaleAnimation.setFillAfter(true);
        return scaleAnimation;
    }

    @Override // p153l.lq2
    /* JADX INFO: renamed from: g */
    public int mo129542g() {
        return yec0.f199208p9;
    }

    @Override // p153l.lq2
    /* JADX INFO: renamed from: m */
    public void mo129544m(@NotNull VirtualVoiceMotionType type) {
        type.getClass();
        super.mo129544m(type);
        m155313q(this.f133136b, ((KtvPanelViewModel) this.f133137c).f53290c);
        if (this.manager.getCurrentMotionType() != null) {
            ((KtvPanelViewModel) this.f133137c).f53290c.startAnimation(m166918u());
        }
        ((KtvPanelViewModel) this.f133137c).setMemberSwallow(this.curInfo.f90820f);
    }

    @Override // p153l.lq2
    @NotNull
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public a5r mo129543h() {
        return new a5r(this.curInfo);
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final ScaleAnimation m166918u() {
        return (ScaleAnimation) this.scaleAnimation.getValue();
    }
}
