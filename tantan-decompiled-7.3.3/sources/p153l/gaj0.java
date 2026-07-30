package p153l;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceChatTopic;
import com.p051p1.mobile.putong.live.base.data.VirtualVoiceMotionType;
import com.p051p1.mobile.putong.live.livingroom.virtual.api.VoiceVirtualApi;
import com.p051p1.mobile.putong.live.livingroom.virtual.room.functions.panel.topic.TopicView;
import com.p051p1.mobile.putong.live.livingroom.virtual.virtualmotion.creator.functionpanel.collapse.LiveVirtualVoicePanelCollapseView;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;
import p151v.VLinear;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0017\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\u0013J\r\u0010\u0019\u001a\u00020\u000b¢\u0006\u0004\b\u0019\u0010\u0013J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001d\u0010\u0010J\u0017\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001f\u0010\u0017R\u001f\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00058\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R$\u0010+\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u0010\u0017R\u001b\u00106\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001b\u00109\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u00103\u001a\u0004\b8\u00105¨\u0006:"}, m88121d2 = {"Ll/gaj0;", "Ll/i6t;", "Ll/rwn0;", "Lcom/p1/mobile/putong/live/livingroom/virtual/room/functions/panel/topic/TopicView;", "Ll/d2m;", "Ll/dum;", "curInfo", "<init>", "(Ll/dum;)V", "Landroid/view/ViewGroup;", "root", "", "u", "(Landroid/view/ViewGroup;)V", "Landroid/view/View;", "G0", "()Landroid/view/View;", BaseSei.f14624X, Constants.KEY_T, "()V", "", "isCollapse", "Y", "(Z)V", "n", "R3", "", "g1", "()I", "T1", "isManager", "b0", RXScreenCaptureService.KEY_INDEX, "Ll/dum;", "getCurInfo", "()Ll/dum;", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceChatTopic;", "j", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceChatTopic;", "getTopic", "()Lcom/p1/mobile/putong/live/base/data/BLiveVoiceChatTopic;", "setTopic", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceChatTopic;)V", "topic", "k", "Z", "U3", "()Z", "setCollapse", "Landroid/animation/Animator;", BLiveStormDanmakuGiftResourceType.f45292l, "Lkotlin/Lazy;", "T3", "()Landroid/animation/Animator;", "expand", "m", "S3", "collapse", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class gaj0 extends i6t<rwn0, TopicView> implements d2m {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final dum<? extends rwn0> curInfo;

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
    public gaj0(@NotNull dum<? extends rwn0> dumVar) {
        super(dumVar);
        dumVar.getClass();
        this.curInfo = dumVar;
        this.expand = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.r9j0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return gaj0.m129734M3(this.f161831a);
            }
        });
        this.collapse = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.t9j0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return gaj0.m129732K3(this.f172644a);
            }
        });
    }

    /* JADX INFO: renamed from: J3 */
    public static void m129731J3(gaj0 gaj0Var, BLiveVoiceChatTopic bLiveVoiceChatTopic) {
        gaj0Var.topic = bLiveVoiceChatTopic;
        TopicView topicView = (TopicView) gaj0Var.viewModel;
        bLiveVoiceChatTopic.getClass();
        topicView.m78579k(bLiveVoiceChatTopic);
    }

    /* JADX INFO: renamed from: K3 */
    public static Animator m129732K3(gaj0 gaj0Var) {
        return gt0.m132168n(gaj0Var.mo113717x(), View.ALPHA, 1.0f, 0.0f).setDuration(300L);
    }

    /* JADX INFO: renamed from: L3 */
    public static BLiveVoiceChatTopic m129733L3(Function1 function1, Object obj) {
        return (BLiveVoiceChatTopic) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: M3 */
    public static Animator m129734M3(gaj0 gaj0Var) {
        return gt0.m132180z(gt0.m132171q(gaj0Var.mo113717x(), "translationY", qa00.m175859d(-10.0f), 0.0f), gt0.m132168n(gaj0Var.mo113717x(), View.ALPHA, 0.0f, 1.0f)).setDuration(400L);
    }

    /* JADX INFO: renamed from: N3 */
    public static BLiveVoiceChatTopic m129735N3(LongLinkVirtualVoice.VoiceChatTopicMessage voiceChatTopicMessage) {
        BLiveVoiceChatTopic bLiveVoiceChatTopicNew_ = BLiveVoiceChatTopic.new_();
        bLiveVoiceChatTopicNew_.tag = voiceChatTopicMessage.getTag();
        bLiveVoiceChatTopicNew_.topic = voiceChatTopicMessage.getTopic();
        return bLiveVoiceChatTopicNew_;
    }

    /* JADX INFO: renamed from: O3 */
    public static void m129736O3(gaj0 gaj0Var, BLiveVoiceChatTopic bLiveVoiceChatTopic) {
        gaj0Var.topic = bLiveVoiceChatTopic;
        TopicView topicView = (TopicView) gaj0Var.viewModel;
        bLiveVoiceChatTopic.getClass();
        topicView.m78579k(bLiveVoiceChatTopic);
    }

    /* JADX INFO: renamed from: P3 */
    public static void m129737P3(Throwable th) {
        th.getClass();
        bf10.m103834j(th);
    }

    @Override // p153l.d2m
    @NotNull
    /* JADX INFO: renamed from: G0 */
    public View mo113707G0() {
        LiveVirtualVoicePanelCollapseView liveVirtualVoicePanelCollapseView = ((TopicView) this.viewModel).f49020c;
        liveVirtualVoicePanelCollapseView.getClass();
        return liveVirtualVoicePanelCollapseView;
    }

    @Override // p153l.d2m
    /* JADX INFO: renamed from: P1 */
    public /* bridge */ int mo113708P1() {
        return super.mo113708P1();
    }

    /* JADX INFO: renamed from: R3 */
    public final void m129738R3() {
        if (i9o0.m139137h(this)) {
            m213811F2().VoiceVirtualLiveEvent.showFunctionsDialog().mo199273j(Integer.valueOf(n2m0.m161244c(VirtualVoiceMotionType.chatTopic)));
            return;
        }
        if (this.topic != null) {
            v3f.C20736d<vv4, C22421c<vv4>> c20736dChatInputClick = m213811F2().ChatEvent.chatInputClick();
            BLiveVoiceChatTopic bLiveVoiceChatTopic = this.topic;
            bLiveVoiceChatTopic.getClass();
            c20736dChatInputClick.mo199273j(new vv4(true, "#" + bLiveVoiceChatTopic.topic + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR));
        }
    }

    /* JADX INFO: renamed from: S3 */
    public final Animator m129739S3() {
        Object value = this.collapse.getValue();
        value.getClass();
        return (Animator) value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.d2m
    @NotNull
    /* JADX INFO: renamed from: T1 */
    public View mo113709T1() {
        V v2 = this.viewModel;
        v2.getClass();
        return (View) v2;
    }

    /* JADX INFO: renamed from: T3 */
    public final Animator m129740T3() {
        Object value = this.expand.getValue();
        value.getClass();
        return (Animator) value;
    }

    /* JADX INFO: renamed from: U3, reason: from getter */
    public final boolean getIsCollapse() {
        return this.isCollapse;
    }

    @Override // p153l.d2m
    /* JADX INFO: renamed from: Y */
    public void mo113710Y(boolean isCollapse) {
        String str;
        this.isCollapse = isCollapse;
        TopicView topicView = (TopicView) this.viewModel;
        BLiveVoiceChatTopic bLiveVoiceChatTopic = this.topic;
        if (bLiveVoiceChatTopic == null || (str = bLiveVoiceChatTopic.topic) == null) {
            str = "";
        }
        topicView.m78577i(isCollapse, str);
        it0.m142009C(m129740T3());
        it0.m142009C(m129739S3());
        if (isCollapse) {
            m129739S3().start();
        } else {
            m129740T3().start();
        }
    }

    @Override // p153l.d2m
    /* JADX INFO: renamed from: b0 */
    public void mo113711b0(boolean isManager) {
        ((TopicView) this.viewModel).m78578j();
    }

    @Override // p153l.d2m
    /* JADX INFO: renamed from: c2 */
    public /* bridge */ int mo113712c2() {
        return super.mo113712c2();
    }

    @Override // p153l.d2m
    /* JADX INFO: renamed from: e2 */
    public /* bridge */ boolean mo113713e2() {
        return super.mo113713e2();
    }

    @Override // p153l.d2m
    /* JADX INFO: renamed from: f1 */
    public /* bridge */ boolean mo113714f1() {
        return super.mo113714f1();
    }

    @Override // p153l.d2m
    /* JADX INFO: renamed from: g1 */
    public int mo113715g1() {
        return yec0.f199167m7;
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        it0.m142009C(m129740T3());
        it0.m142009C(m129739S3());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        VoiceVirtualApi voiceVirtualApi = VoiceVirtualApi.INSTANCE;
        String strM202194o = ((rwn0) m213810E2()).m202194o();
        strM202194o.getClass();
        duringCreated(voiceVirtualApi.getChatTopic(strM202194o)).subscribe(dhw.m115826e(new y20() { // from class: l.v9j0
            @Override // p153l.y20
            public final void call(Object obj) {
                gaj0.m129731J3(this.f183005a, (BLiveVoiceChatTopic) obj);
            }
        }, new y20() { // from class: l.x9j0
            @Override // p153l.y20
            public final void call(Object obj) {
                gaj0.m129737P3((Throwable) obj);
            }
        }));
        C22421c<T> c22421cDuringCreated = duringCreated(((rwn0) m213810E2()).m168545q1().m98267Z0());
        final Function1 function1 = new Function1() { // from class: l.z9j0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return gaj0.m129735N3((LongLinkVirtualVoice.VoiceChatTopicMessage) obj);
            }
        };
        c22421cDuringCreated.map(new qcj() { // from class: l.baj0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return gaj0.m129733L3(function1, obj);
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.daj0
            @Override // p153l.y20
            public final void call(Object obj) {
                gaj0.m129736O3(this.f85893a, (BLiveVoiceChatTopic) obj);
            }
        }));
    }

    @Override // p153l.d2m
    /* JADX INFO: renamed from: u */
    public void mo113716u(@NotNull ViewGroup root) {
        root.getClass();
        super.mo113716u(root);
        this.isCollapse = false;
        ((TopicView) this.viewModel).m78576f(root);
    }

    @Override // p153l.d2m
    @NotNull
    /* JADX INFO: renamed from: x */
    public View mo113717x() {
        VLinear vLinear = ((TopicView) this.viewModel).f49021d;
        vLinear.getClass();
        return vLinear;
    }
}
