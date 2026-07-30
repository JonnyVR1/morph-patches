package p149l;

import android.widget.FrameLayout;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkVoiceSwitchLiveMode;
import com.p046p1.mobile.putong.data.Careers;
import com.p046p1.mobile.putong.live.base.data.BLiveVoice;
import com.p046p1.mobile.putong.live.base.data.VirtualVoiceMotionType;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.VoiceLiveInfoMessage;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;
import p149l.nnn0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B%\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u001c\u001a\u00020\u000b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u001e\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0007\u001a\u00020\u00068\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0016\u0010\b\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010\"R$\u0010/\u001a\u0004\u0018\u00010(8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u00060"}, m87232d2 = {"Ll/g4m0;", "Ll/nnn0;", "D", "Ll/pat;", "Ll/bsm;", BaseSei.INFO, "Landroid/widget/FrameLayout;", "container", "rightCallContainer", "<init>", "(Ll/bsm;Landroid/widget/FrameLayout;Landroid/widget/FrameLayout;)V", "", Constants.KEY_T, "()V", "n", "Lcom/p1/mobile/longlink/msg/liveroom/LongLinkVoiceSwitchLiveMode$VoiceLiveModeMessage;", Careers.f38732it, "R3", "(Lcom/p1/mobile/longlink/msg/liveroom/LongLinkVoiceSwitchLiveMode$VoiceLiveModeMessage;)V", "", "template", "P3", "(Ljava/lang/String;)V", "", "Ll/wzl0;", "launchData", "", "isSwitchLiveMode", "S3", "(Ljava/util/List;Z)V", "liveMode", "O3", "(Ljava/lang/String;)Ljava/util/List;", RXScreenCaptureService.KEY_INDEX, "Landroid/widget/FrameLayout;", "getContainer", "()Landroid/widget/FrameLayout;", "setContainer", "(Landroid/widget/FrameLayout;)V", "j", "Lcom/p1/mobile/putong/live/base/data/VirtualVoiceMotionType;", "k", "Lcom/p1/mobile/putong/live/base/data/VirtualVoiceMotionType;", "getMotionType", "()Lcom/p1/mobile/putong/live/base/data/VirtualVoiceMotionType;", "setMotionType", "(Lcom/p1/mobile/putong/live/base/data/VirtualVoiceMotionType;)V", "motionType", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public class g4m0<D extends nnn0> extends pat<D> {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public FrameLayout container;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public FrameLayout rightCallContainer;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public VirtualVoiceMotionType motionType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4m0(@NotNull bsm<D> bsmVar, @NotNull FrameLayout frameLayout, @NotNull FrameLayout frameLayout2) {
        super(bsmVar);
        bsmVar.getClass();
        frameLayout.getClass();
        frameLayout2.getClass();
        this.container = frameLayout;
        this.rightCallContainer = frameLayout2;
    }

    /* JADX INFO: renamed from: J3 */
    public static String m124383J3(Function1 function1, Object obj) {
        return (String) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: K3 */
    public static void m124384K3(g4m0 g4m0Var, String str) {
        str.getClass();
        g4m0Var.m124389P3(str);
    }

    /* JADX INFO: renamed from: L3 */
    public static void m124385L3(g4m0 g4m0Var, LongLinkVoiceSwitchLiveMode.VoiceLiveModeMessage voiceLiveModeMessage) {
        voiceLiveModeMessage.getClass();
        g4m0Var.m124390R3(voiceLiveModeMessage);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M3 */
    public static void m124386M3(g4m0 g4m0Var, LongLinkVirtualVoice.VoiceLiveTemplateMessage voiceLiveTemplateMessage) {
        String str = ((nnn0) g4m0Var.m206027E2()).mo149813j().liveMode;
        str.getClass();
        g4m0Var.m124391S3(g4m0Var.m124388O3(str), true);
    }

    /* JADX INFO: renamed from: N3 */
    public static String m124387N3(VoiceLiveInfoMessage voiceLiveInfoMessage) {
        return voiceLiveInfoMessage.template;
    }

    /* JADX INFO: renamed from: O3 */
    public final List<wzl0> m124388O3(String liveMode) {
        if (x4s.m207011a(liveMode)) {
            return CollectionsKt.listOf(new wzl0(true, this.container, VirtualVoiceMotionType.get(VirtualVoiceMotionType.nineDeputy)));
        }
        if (x4s.m207013c(liveMode)) {
            return CollectionsKt.listOf(new wzl0(true, this.container, VirtualVoiceMotionType.get(VirtualVoiceMotionType.lovePlanet)));
        }
        if (Intrinsics.m87488d(VirtualVoiceMotionType.ktv, m206027E2().mo149813j().template)) {
            return CollectionsKt.listOf(new wzl0(true, this.container, VirtualVoiceMotionType.get(VirtualVoiceMotionType.bottomCall)));
        }
        if (Intrinsics.m87488d("game", m206027E2().mo149813j().template)) {
            return CollectionsKt.listOf(new wzl0(true, this.container, VirtualVoiceMotionType.get("game")));
        }
        return CollectionsKt.listOf((Object[]) new wzl0[]{new wzl0(true, this.rightCallContainer, VirtualVoiceMotionType.get(VirtualVoiceMotionType.rightCall)), new wzl0(true, this.container, VirtualVoiceMotionType.get(VirtualVoiceMotionType.functionPanel))});
    }

    /* JADX INFO: renamed from: P3 */
    public final void m124389P3(String template) {
        BLiveVoice bLiveVoiceMo149813j = m206027E2().mo149813j();
        bLiveVoiceMo149813j.getClass();
        if (Intrinsics.m87488d(bLiveVoiceMo149813j.template, template)) {
            return;
        }
        bLiveVoiceMo149813j.template = template;
        m206027E2().mo149811g(bLiveVoiceMo149813j);
    }

    /* JADX INFO: renamed from: R3 */
    public final void m124390R3(LongLinkVoiceSwitchLiveMode.VoiceLiveModeMessage it) {
        BLiveVoice bLiveVoiceMo149813j = m206027E2().mo149813j();
        bLiveVoiceMo149813j.getClass();
        if (!jji0.m141806b(it.getLiveMode()) && !Intrinsics.m87488d(bLiveVoiceMo149813j.liveMode, it.getLiveMode())) {
            bLiveVoiceMo149813j.liveMode = it.getLiveMode();
        }
        m206027E2().mo149811g(bLiveVoiceMo149813j);
        String str = m206027E2().mo149813j().liveMode;
        str.getClass();
        m124391S3(m124388O3(str), true);
        m206028F2().BottomZoneEvent.refreshAllButton().m172467p();
        u4n0.m191754m(this);
    }

    /* JADX INFO: renamed from: S3 */
    public final void m124391S3(List<? extends wzl0> launchData, boolean isSwitchLiveMode) {
        m206028F2().VoiceVirtualLiveEvent.motionSwitch().mo172463j(new xzl0(launchData, Boolean.valueOf(isSwitchLiveMode)));
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        this.motionType = null;
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        C22306c<T> c22306cDuringCreated = duringCreated(m206027E2().m132160q1().m189067Q0());
        final Function1 function1 = new Function1() { // from class: l.b4m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g4m0.m124387N3((VoiceLiveInfoMessage) obj);
            }
        };
        c22306cDuringCreated.map(new w9j() { // from class: l.c4m0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return g4m0.m124383J3(function1, obj);
            }
        }).distinctUntilChanged().subscribe(ffw.m121197h(new e30() { // from class: l.d4m0
            @Override // p149l.e30
            public final void call(Object obj) {
                g4m0.m124384K3(this.f84317a, (String) obj);
            }
        }));
        String str = m206027E2().mo149813j().liveMode;
        str.getClass();
        m124391S3(m124388O3(str), false);
        duringCreated(m206027E2().m132160q1().m189077V0()).distinctUntilChanged().subscribe(ffw.m121197h(new e30() { // from class: l.e4m0
            @Override // p149l.e30
            public final void call(Object obj) {
                g4m0.m124385L3(this.f89298a, (LongLinkVoiceSwitchLiveMode.VoiceLiveModeMessage) obj);
            }
        }));
        m104250o2(m206027E2().f108769z.m181789r().m189079W0(), false).subscribe(ffw.m121197h(new e30() { // from class: l.f4m0
            @Override // p149l.e30
            public final void call(Object obj) {
                g4m0.m124386M3(this.f94834a, (LongLinkVirtualVoice.VoiceLiveTemplateMessage) obj);
            }
        }));
    }
}
