package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceChatTopic;
import com.p051p1.mobile.putong.live.base.data.VirtualVoiceMotionType;
import com.p051p1.mobile.putong.live.livingroom.virtual.api.VoiceVirtualApi;
import com.p051p1.mobile.putong.live.livingroom.virtual.room.functions.dialog.topic.TopicView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m88121d2 = {"Ll/haj0;", "Ll/i6t;", "Ll/rwn0;", "Lcom/p1/mobile/putong/live/livingroom/virtual/room/functions/dialog/topic/TopicView;", "Ll/dum;", "curInfo", "topicView", "<init>", "(Ll/dum;Lcom/p1/mobile/putong/live/livingroom/virtual/room/functions/dialog/topic/TopicView;)V", "", "T3", "()V", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceChatTopic;", VirtualVoiceMotionType.chatTopic, "S3", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceChatTopic;)V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class haj0 extends i6t<rwn0, TopicView> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public haj0(@NotNull dum<? extends rwn0> dumVar, @NotNull TopicView topicView) {
        super(dumVar);
        dumVar.getClass();
        topicView.getClass();
        mo52715C(topicView);
    }

    /* JADX INFO: renamed from: J3 */
    public static void m134164J3(haj0 haj0Var, BLiveEnvelope bLiveEnvelope) {
        haj0Var.m213811F2().VoiceVirtualLiveEvent.showFunctionsDialog().mo199273j(-1);
    }

    /* JADX INFO: renamed from: K3 */
    public static Pair m134165K3(Function2 function2, Object obj, Object obj2) {
        return (Pair) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: L3 */
    public static void m134166L3(haj0 haj0Var, Pair pair) {
        TopicView topicView = (TopicView) haj0Var.viewModel;
        Object first = pair.getFirst();
        first.getClass();
        Object second = pair.getSecond();
        second.getClass();
        topicView.m78545B((List) first, (BLiveVoiceChatTopic) second);
    }

    /* JADX INFO: renamed from: M3 */
    public static Pair m134167M3(List list, BLiveVoiceChatTopic bLiveVoiceChatTopic) {
        return new Pair(list, bLiveVoiceChatTopic);
    }

    /* JADX INFO: renamed from: N3 */
    public static void m134168N3(Throwable th) {
        th.getClass();
        bf10.m103834j(th);
    }

    /* JADX INFO: renamed from: O3 */
    public static C22421c m134169O3(Function1 function1, Object obj) {
        return (C22421c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: P3 */
    public static void m134170P3(Throwable th) {
        th.getClass();
        bf10.m103834j(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R3 */
    public static C22421c m134171R3(haj0 haj0Var, BLiveEnvelope bLiveEnvelope) {
        String strM202191k = ((rwn0) haj0Var.m213810E2()).m202191k();
        strM202191k.getClass();
        return VoiceVirtualApi.switchTemplate(strM202191k, VirtualVoiceMotionType.chatTopic);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S3 */
    public final void m134172S3(@NotNull BLiveVoiceChatTopic chatTopic) {
        chatTopic.getClass();
        if (bhn0.m104351b(this)) {
            o1j0.m165651y("正在拍拍中，暂无法切换玩法");
            return;
        }
        VoiceVirtualApi voiceVirtualApi = VoiceVirtualApi.INSTANCE;
        String strM202194o = ((rwn0) m213810E2()).m202194o();
        strM202194o.getClass();
        String str = chatTopic.tag;
        str.getClass();
        String str2 = chatTopic.topic;
        str2.getClass();
        C22421c<T> c22421cDuringCreated = duringCreated(voiceVirtualApi.patchChatTopic(strM202194o, str, str2));
        final Function1 function1 = new Function1() { // from class: l.s9j0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return haj0.m134171R3(this.f166938a, (BLiveEnvelope) obj);
            }
        };
        c22421cDuringCreated.flatMap(new qcj() { // from class: l.u9j0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return haj0.m134169O3(function1, obj);
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.w9j0
            @Override // p153l.y20
            public final void call(Object obj) {
                haj0.m134164J3(this.f188017a, (BLiveEnvelope) obj);
            }
        }, new y20() { // from class: l.y9j0
            @Override // p153l.y20
            public final void call(Object obj) {
                haj0.m134168N3((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T3 */
    public final void m134173T3() {
        String strM202194o = ((rwn0) m213810E2()).m202194o();
        strM202194o.getClass();
        C22421c<List<BLiveVoiceChatTopic>> c22421cChatTopicAsset = VoiceVirtualApi.chatTopicAsset(strM202194o);
        VoiceVirtualApi voiceVirtualApi = VoiceVirtualApi.INSTANCE;
        String strM202194o2 = ((rwn0) m213810E2()).m202194o();
        strM202194o2.getClass();
        C22421c<BLiveVoiceChatTopic> chatTopic = voiceVirtualApi.getChatTopic(strM202194o2);
        final Function2 function2 = new Function2() { // from class: l.aaj0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return haj0.m134167M3((List) obj, (BLiveVoiceChatTopic) obj2);
            }
        };
        duringCreated(C22421c.zip(c22421cChatTopicAsset, chatTopic, new rcj() { // from class: l.caj0
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return haj0.m134165K3(function2, obj, obj2);
            }
        })).subscribe(dhw.m115826e(new y20() { // from class: l.eaj0
            @Override // p153l.y20
            public final void call(Object obj) {
                haj0.m134166L3(this.f92788a, (Pair) obj);
            }
        }, new y20() { // from class: l.faj0
            @Override // p153l.y20
            public final void call(Object obj) {
                haj0.m134170P3((Throwable) obj);
            }
        }));
    }
}
