package p153l;

import android.widget.FrameLayout;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkVoiceSwitchLiveMode;
import com.p051p1.mobile.putong.data.Careers;
import com.p051p1.mobile.putong.live.base.data.BLiveVoice;
import com.p051p1.mobile.putong.live.base.data.VirtualVoiceMotionType;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.VoiceLiveInfoMessage;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;
import p153l.rwn0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B%\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u001c\u001a\u00020\u000b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u001e\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0007\u001a\u00020\u00068\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0016\u0010\b\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010\"R$\u0010/\u001a\u0004\u0018\u00010(8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u00060"}, m88121d2 = {"Ll/kdm0;", "Ll/rwn0;", "D", "Ll/qct;", "Ll/dum;", BaseSei.INFO, "Landroid/widget/FrameLayout;", "container", "rightCallContainer", "<init>", "(Ll/dum;Landroid/widget/FrameLayout;Landroid/widget/FrameLayout;)V", "", Constants.KEY_T, "()V", "n", "Lcom/p1/mobile/longlink/msg/liveroom/LongLinkVoiceSwitchLiveMode$VoiceLiveModeMessage;", Careers.f39580it, "R3", "(Lcom/p1/mobile/longlink/msg/liveroom/LongLinkVoiceSwitchLiveMode$VoiceLiveModeMessage;)V", "", "template", "P3", "(Ljava/lang/String;)V", "", "Ll/a9m0;", "launchData", "", "isSwitchLiveMode", "S3", "(Ljava/util/List;Z)V", "liveMode", "O3", "(Ljava/lang/String;)Ljava/util/List;", RXScreenCaptureService.KEY_INDEX, "Landroid/widget/FrameLayout;", "getContainer", "()Landroid/widget/FrameLayout;", "setContainer", "(Landroid/widget/FrameLayout;)V", "j", "Lcom/p1/mobile/putong/live/base/data/VirtualVoiceMotionType;", "k", "Lcom/p1/mobile/putong/live/base/data/VirtualVoiceMotionType;", "getMotionType", "()Lcom/p1/mobile/putong/live/base/data/VirtualVoiceMotionType;", "setMotionType", "(Lcom/p1/mobile/putong/live/base/data/VirtualVoiceMotionType;)V", "motionType", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public class kdm0<D extends rwn0> extends qct<D> {

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
    public kdm0(@NotNull dum<D> dumVar, @NotNull FrameLayout frameLayout, @NotNull FrameLayout frameLayout2) {
        super(dumVar);
        dumVar.getClass();
        frameLayout.getClass();
        frameLayout2.getClass();
        this.container = frameLayout;
        this.rightCallContainer = frameLayout2;
    }

    /* JADX INFO: renamed from: J3 */
    public static String m149241J3(Function1 function1, Object obj) {
        return (String) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: K3 */
    public static void m149242K3(kdm0 kdm0Var, String str) {
        str.getClass();
        kdm0Var.m149247P3(str);
    }

    /* JADX INFO: renamed from: L3 */
    public static void m149243L3(kdm0 kdm0Var, LongLinkVoiceSwitchLiveMode.VoiceLiveModeMessage voiceLiveModeMessage) {
        voiceLiveModeMessage.getClass();
        kdm0Var.m149248R3(voiceLiveModeMessage);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M3 */
    public static void m149244M3(kdm0 kdm0Var, LongLinkVirtualVoice.VoiceLiveTemplateMessage voiceLiveTemplateMessage) {
        String str = ((rwn0) kdm0Var.m213810E2()).mo183435j().liveMode;
        str.getClass();
        kdm0Var.m149249S3(kdm0Var.m149246O3(str), true);
    }

    /* JADX INFO: renamed from: N3 */
    public static String m149245N3(VoiceLiveInfoMessage voiceLiveInfoMessage) {
        return voiceLiveInfoMessage.template;
    }

    /* JADX INFO: renamed from: O3 */
    public final List<a9m0> m149246O3(String liveMode) {
        if (y6s.m214493a(liveMode)) {
            return CollectionsKt.listOf(new a9m0(true, this.container, VirtualVoiceMotionType.get(VirtualVoiceMotionType.nineDeputy)));
        }
        if (y6s.m214495c(liveMode)) {
            return CollectionsKt.listOf(new a9m0(true, this.container, VirtualVoiceMotionType.get(VirtualVoiceMotionType.lovePlanet)));
        }
        if (Intrinsics.m88377d(VirtualVoiceMotionType.ktv, m213810E2().mo183435j().template)) {
            return CollectionsKt.listOf(new a9m0(true, this.container, VirtualVoiceMotionType.get(VirtualVoiceMotionType.bottomCall)));
        }
        if (Intrinsics.m88377d("game", m213810E2().mo183435j().template)) {
            return CollectionsKt.listOf(new a9m0(true, this.container, VirtualVoiceMotionType.get("game")));
        }
        return CollectionsKt.listOf((Object[]) new a9m0[]{new a9m0(true, this.rightCallContainer, VirtualVoiceMotionType.get(VirtualVoiceMotionType.rightCall)), new a9m0(true, this.container, VirtualVoiceMotionType.get(VirtualVoiceMotionType.functionPanel))});
    }

    /* JADX INFO: renamed from: P3 */
    public final void m149247P3(String template) {
        BLiveVoice bLiveVoiceMo183435j = m213810E2().mo183435j();
        bLiveVoiceMo183435j.getClass();
        if (Intrinsics.m88377d(bLiveVoiceMo183435j.template, template)) {
            return;
        }
        bLiveVoiceMo183435j.template = template;
        m213810E2().mo183431g(bLiveVoiceMo183435j);
    }

    /* JADX INFO: renamed from: R3 */
    public final void m149248R3(LongLinkVoiceSwitchLiveMode.VoiceLiveModeMessage it) {
        BLiveVoice bLiveVoiceMo183435j = m213810E2().mo183435j();
        bLiveVoiceMo183435j.getClass();
        if (!jsi0.m146843b(it.getLiveMode()) && !Intrinsics.m88377d(bLiveVoiceMo183435j.liveMode, it.getLiveMode())) {
            bLiveVoiceMo183435j.liveMode = it.getLiveMode();
        }
        m213810E2().mo183431g(bLiveVoiceMo183435j);
        String str = m213810E2().mo183435j().liveMode;
        str.getClass();
        m149249S3(m149246O3(str), true);
        m213811F2().BottomZoneEvent.refreshAllButton().m199277p();
        ydn0.m215260m(this);
    }

    /* JADX INFO: renamed from: S3 */
    public final void m149249S3(List<? extends a9m0> launchData, boolean isSwitchLiveMode) {
        m213811F2().VoiceVirtualLiveEvent.motionSwitch().mo199273j(new b9m0(launchData, Boolean.valueOf(isSwitchLiveMode)));
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        this.motionType = null;
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        C22421c<T> c22421cDuringCreated = duringCreated(m213810E2().m168545q1().m98249Q0());
        final Function1 function1 = new Function1() { // from class: l.fdm0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return kdm0.m149245N3((VoiceLiveInfoMessage) obj);
            }
        };
        c22421cDuringCreated.map(new qcj() { // from class: l.gdm0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return kdm0.m149241J3(function1, obj);
            }
        }).distinctUntilChanged().subscribe(dhw.m115829h(new y20() { // from class: l.hdm0
            @Override // p153l.y20
            public final void call(Object obj) {
                kdm0.m149242K3(this.f109011a, (String) obj);
            }
        }));
        String str = m213810E2().mo183435j().liveMode;
        str.getClass();
        m149249S3(m149246O3(str), false);
        duringCreated(m213810E2().m168545q1().m98259V0()).distinctUntilChanged().subscribe(dhw.m115829h(new y20() { // from class: l.idm0
            @Override // p153l.y20
            public final void call(Object obj) {
                kdm0.m149243L3(this.f114514a, (LongLinkVoiceSwitchLiveMode.VoiceLiveModeMessage) obj);
            }
        }));
        m113231o2(m213810E2().f148282z.m170284r().m98261W0(), false).subscribe(dhw.m115829h(new y20() { // from class: l.jdm0
            @Override // p153l.y20
            public final void call(Object obj) {
                kdm0.m149244M3(this.f120278a, (LongLinkVirtualVoice.VoiceLiveTemplateMessage) obj);
            }
        }));
    }
}
