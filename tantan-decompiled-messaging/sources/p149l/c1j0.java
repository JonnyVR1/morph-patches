package p149l;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceChatTopic;
import com.p046p1.mobile.putong.live.base.data.VirtualVoiceMotionType;
import com.p046p1.mobile.putong.live.livingroom.virtual.api.VoiceVirtualApi;
import com.p046p1.mobile.putong.live.livingroom.virtual.room.functions.panel.topic.TopicView;
import com.p046p1.mobile.putong.live.livingroom.virtual.virtualmotion.creator.functionpanel.collapse.LiveVirtualVoicePanelCollapseView;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;
import p147v.VLinear;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0017\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\u0013J\r\u0010\u0019\u001a\u00020\u000b¢\u0006\u0004\b\u0019\u0010\u0013J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001d\u0010\u0010J\u0017\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001f\u0010\u0017R\u001f\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00058\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R$\u0010+\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u0010\u0017R\u001b\u00106\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001b\u00109\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u00103\u001a\u0004\b8\u00105¨\u0006:"}, m87232d2 = {"Ll/c1j0;", "Ll/h4t;", "Ll/nnn0;", "Lcom/p1/mobile/putong/live/livingroom/virtual/room/functions/panel/topic/TopicView;", "Ll/jzl;", "Ll/bsm;", "curInfo", "<init>", "(Ll/bsm;)V", "Landroid/view/ViewGroup;", "root", "", "u", "(Landroid/view/ViewGroup;)V", "Landroid/view/View;", "G0", "()Landroid/view/View;", BaseSei.f13930X, Constants.KEY_T, "()V", "", "isCollapse", "Y", "(Z)V", "n", "R3", "", "g1", "()I", "T1", "isManager", "b0", RXScreenCaptureService.KEY_INDEX, "Ll/bsm;", "getCurInfo", "()Ll/bsm;", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceChatTopic;", "j", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceChatTopic;", "getTopic", "()Lcom/p1/mobile/putong/live/base/data/BLiveVoiceChatTopic;", "setTopic", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceChatTopic;)V", "topic", "k", "Z", "U3", "()Z", "setCollapse", "Landroid/animation/Animator;", BLiveStormDanmakuGiftResourceType.f44444l, "Lkotlin/Lazy;", "T3", "()Landroid/animation/Animator;", "expand", "m", "S3", "collapse", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class c1j0 extends h4t<nnn0, TopicView> implements jzl {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final bsm<? extends nnn0> curInfo;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public BLiveVoiceChatTopic topic;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public boolean isCollapse;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final Lazy expand;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final Lazy collapse;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1j0(@NotNull bsm<? extends nnn0> bsmVar) {
        super(bsmVar);
        bsmVar.getClass();
        this.curInfo = bsmVar;
        this.expand = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.n0j0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return c1j0.m104845M3(this.f136562a);
            }
        });
        this.collapse = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.p0j0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return c1j0.m104843K3(this.f146603a);
            }
        });
    }

    /* JADX INFO: renamed from: J3 */
    public static void m104842J3(c1j0 c1j0Var, BLiveVoiceChatTopic bLiveVoiceChatTopic) {
        c1j0Var.topic = bLiveVoiceChatTopic;
        TopicView topicView = (TopicView) c1j0Var.viewModel;
        bLiveVoiceChatTopic.getClass();
        topicView.m77396k(bLiveVoiceChatTopic);
    }

    /* JADX INFO: renamed from: K3 */
    public static Animator m104843K3(c1j0 c1j0Var) {
        return bt0.m103741n(c1j0Var.mo104863x(), View.ALPHA, 1.0f, 0.0f).setDuration(300L);
    }

    /* JADX INFO: renamed from: L3 */
    public static BLiveVoiceChatTopic m104844L3(Function1 function1, Object obj) {
        return (BLiveVoiceChatTopic) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: M3 */
    public static Animator m104845M3(c1j0 c1j0Var) {
        return bt0.m103753z(bt0.m103744q(c1j0Var.mo104863x(), "translationY", t100.m186890d(-10.0f), 0.0f), bt0.m103741n(c1j0Var.mo104863x(), View.ALPHA, 0.0f, 1.0f)).setDuration(400L);
    }

    /* JADX INFO: renamed from: N3 */
    public static BLiveVoiceChatTopic m104846N3(LongLinkVirtualVoice.VoiceChatTopicMessage voiceChatTopicMessage) {
        BLiveVoiceChatTopic bLiveVoiceChatTopicNew_ = BLiveVoiceChatTopic.new_();
        bLiveVoiceChatTopicNew_.tag = voiceChatTopicMessage.getTag();
        bLiveVoiceChatTopicNew_.topic = voiceChatTopicMessage.getTopic();
        return bLiveVoiceChatTopicNew_;
    }

    /* JADX INFO: renamed from: O3 */
    public static void m104847O3(c1j0 c1j0Var, BLiveVoiceChatTopic bLiveVoiceChatTopic) {
        c1j0Var.topic = bLiveVoiceChatTopic;
        TopicView topicView = (TopicView) c1j0Var.viewModel;
        bLiveVoiceChatTopic.getClass();
        topicView.m77396k(bLiveVoiceChatTopic);
    }

    /* JADX INFO: renamed from: P3 */
    public static void m104848P3(Throwable th) {
        th.getClass();
        r610.m178005j(th);
    }

    @Override // p149l.jzl
    @NotNull
    /* JADX INFO: renamed from: G0 */
    public View mo104849G0() {
        LiveVirtualVoicePanelCollapseView liveVirtualVoicePanelCollapseView = ((TopicView) this.viewModel).f48172c;
        liveVirtualVoicePanelCollapseView.getClass();
        return liveVirtualVoicePanelCollapseView;
    }

    @Override // p149l.jzl
    /* JADX INFO: renamed from: P1 */
    public /* bridge */ int mo104850P1() {
        return super.mo104850P1();
    }

    /* JADX INFO: renamed from: R3 */
    public final void m104851R3() {
        if (e0o0.m114322h(this)) {
            m206028F2().VoiceVirtualLiveEvent.showFunctionsDialog().mo172463j(Integer.valueOf(jtl0.m143154c(VirtualVoiceMotionType.chatTopic)));
            return;
        }
        if (this.topic != null) {
            q2f.C19397d<wu4, C22306c<wu4>> c19397dChatInputClick = m206028F2().ChatEvent.chatInputClick();
            BLiveVoiceChatTopic bLiveVoiceChatTopic = this.topic;
            bLiveVoiceChatTopic.getClass();
            c19397dChatInputClick.mo172463j(new wu4(true, "#" + bLiveVoiceChatTopic.topic + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR));
        }
    }

    /* JADX INFO: renamed from: S3 */
    public final Animator m104852S3() {
        Object value = this.collapse.getValue();
        value.getClass();
        return (Animator) value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.jzl
    @NotNull
    /* JADX INFO: renamed from: T1 */
    public View mo104853T1() {
        V v2 = this.viewModel;
        v2.getClass();
        return (View) v2;
    }

    /* JADX INFO: renamed from: T3 */
    public final Animator m104854T3() {
        Object value = this.expand.getValue();
        value.getClass();
        return (Animator) value;
    }

    /* JADX INFO: renamed from: U3, reason: from getter */
    public final boolean getIsCollapse() {
        return this.isCollapse;
    }

    @Override // p149l.jzl
    /* JADX INFO: renamed from: Y */
    public void mo104856Y(boolean isCollapse) {
        String str;
        this.isCollapse = isCollapse;
        TopicView topicView = (TopicView) this.viewModel;
        BLiveVoiceChatTopic bLiveVoiceChatTopic = this.topic;
        if (bLiveVoiceChatTopic == null || (str = bLiveVoiceChatTopic.topic) == null) {
            str = "";
        }
        topicView.m77394i(isCollapse, str);
        dt0.m113503C(m104854T3());
        dt0.m113503C(m104852S3());
        if (isCollapse) {
            m104852S3().start();
        } else {
            m104854T3().start();
        }
    }

    @Override // p149l.jzl
    /* JADX INFO: renamed from: b0 */
    public void mo104857b0(boolean isManager) {
        ((TopicView) this.viewModel).m77395j();
    }

    @Override // p149l.jzl
    /* JADX INFO: renamed from: c2 */
    public /* bridge */ int mo104858c2() {
        return super.mo104858c2();
    }

    @Override // p149l.jzl
    /* JADX INFO: renamed from: e2 */
    public /* bridge */ boolean mo104859e2() {
        return super.mo104859e2();
    }

    @Override // p149l.jzl
    /* JADX INFO: renamed from: f1 */
    public /* bridge */ boolean mo104860f1() {
        return super.mo104860f1();
    }

    @Override // p149l.jzl
    /* JADX INFO: renamed from: g1 */
    public int mo104861g1() {
        return t6c0.f168435m7;
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        dt0.m113503C(m104854T3());
        dt0.m113503C(m104852S3());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        VoiceVirtualApi voiceVirtualApi = VoiceVirtualApi.INSTANCE;
        String strM149818o = ((nnn0) m206027E2()).m149818o();
        strM149818o.getClass();
        duringCreated(voiceVirtualApi.getChatTopic(strM149818o)).subscribe(ffw.m121194e(new e30() { // from class: l.r0j0
            @Override // p149l.e30
            public final void call(Object obj) {
                c1j0.m104842J3(this.f157177a, (BLiveVoiceChatTopic) obj);
            }
        }, new e30() { // from class: l.t0j0
            @Override // p149l.e30
            public final void call(Object obj) {
                c1j0.m104848P3((Throwable) obj);
            }
        }));
        C22306c<T> c22306cDuringCreated = duringCreated(((nnn0) m206027E2()).m132160q1().m189085Z0());
        final Function1 function1 = new Function1() { // from class: l.v0j0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return c1j0.m104846N3((LongLinkVirtualVoice.VoiceChatTopicMessage) obj);
            }
        };
        c22306cDuringCreated.map(new w9j() { // from class: l.x0j0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return c1j0.m104844L3(function1, obj);
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.z0j0
            @Override // p149l.e30
            public final void call(Object obj) {
                c1j0.m104847O3(this.f200998a, (BLiveVoiceChatTopic) obj);
            }
        }));
    }

    @Override // p149l.jzl
    /* JADX INFO: renamed from: u */
    public void mo104862u(@NotNull ViewGroup root) {
        root.getClass();
        super.mo104862u(root);
        this.isCollapse = false;
        ((TopicView) this.viewModel).m77393f(root);
    }

    @Override // p149l.jzl
    @NotNull
    /* JADX INFO: renamed from: x */
    public View mo104863x() {
        VLinear vLinear = ((TopicView) this.viewModel).f48173d;
        vLinear.getClass();
        return vLinear;
    }
}
