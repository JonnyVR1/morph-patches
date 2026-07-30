package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceChatTopic;
import com.p046p1.mobile.putong.live.base.data.VirtualVoiceMotionType;
import com.p046p1.mobile.putong.live.livingroom.virtual.api.VoiceVirtualApi;
import com.p046p1.mobile.putong.live.livingroom.virtual.room.functions.dialog.topic.TopicView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m87232d2 = {"Ll/d1j0;", "Ll/h4t;", "Ll/nnn0;", "Lcom/p1/mobile/putong/live/livingroom/virtual/room/functions/dialog/topic/TopicView;", "Ll/bsm;", "curInfo", "topicView", "<init>", "(Ll/bsm;Lcom/p1/mobile/putong/live/livingroom/virtual/room/functions/dialog/topic/TopicView;)V", "", "T3", "()V", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceChatTopic;", VirtualVoiceMotionType.chatTopic, "S3", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceChatTopic;)V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class d1j0 extends h4t<nnn0, TopicView> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1j0(@NotNull bsm<? extends nnn0> bsmVar, @NotNull TopicView topicView) {
        super(bsmVar);
        bsmVar.getClass();
        topicView.getClass();
        mo51532C(topicView);
    }

    /* JADX INFO: renamed from: J3 */
    public static void m109619J3(d1j0 d1j0Var, BLiveEnvelope bLiveEnvelope) {
        d1j0Var.m206028F2().VoiceVirtualLiveEvent.showFunctionsDialog().mo172463j(-1);
    }

    /* JADX INFO: renamed from: K3 */
    public static Pair m109620K3(Function2 function2, Object obj, Object obj2) {
        return (Pair) function2.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: L3 */
    public static void m109621L3(d1j0 d1j0Var, Pair pair) {
        TopicView topicView = (TopicView) d1j0Var.viewModel;
        Object first = pair.getFirst();
        first.getClass();
        Object second = pair.getSecond();
        second.getClass();
        topicView.m77362B((List) first, (BLiveVoiceChatTopic) second);
    }

    /* JADX INFO: renamed from: M3 */
    public static Pair m109622M3(List list, BLiveVoiceChatTopic bLiveVoiceChatTopic) {
        return new Pair(list, bLiveVoiceChatTopic);
    }

    /* JADX INFO: renamed from: N3 */
    public static void m109623N3(Throwable th) {
        th.getClass();
        r610.m178005j(th);
    }

    /* JADX INFO: renamed from: O3 */
    public static C22306c m109624O3(Function1 function1, Object obj) {
        return (C22306c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: P3 */
    public static void m109625P3(Throwable th) {
        th.getClass();
        r610.m178005j(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R3 */
    public static C22306c m109626R3(d1j0 d1j0Var, BLiveEnvelope bLiveEnvelope) {
        String strM149814k = ((nnn0) d1j0Var.m206027E2()).m149814k();
        strM149814k.getClass();
        return VoiceVirtualApi.switchTemplate(strM149814k, VirtualVoiceMotionType.chatTopic);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S3 */
    public final void m109627S3(@NotNull BLiveVoiceChatTopic chatTopic) {
        chatTopic.getClass();
        if (x7n0.m207302b(this)) {
            lsi0.m151595y("正在拍拍中，暂无法切换玩法");
            return;
        }
        VoiceVirtualApi voiceVirtualApi = VoiceVirtualApi.INSTANCE;
        String strM149818o = ((nnn0) m206027E2()).m149818o();
        strM149818o.getClass();
        String str = chatTopic.tag;
        str.getClass();
        String str2 = chatTopic.topic;
        str2.getClass();
        C22306c<T> c22306cDuringCreated = duringCreated(voiceVirtualApi.patchChatTopic(strM149818o, str, str2));
        final Function1 function1 = new Function1() { // from class: l.o0j0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return d1j0.m109626R3(this.f141340a, (BLiveEnvelope) obj);
            }
        };
        c22306cDuringCreated.flatMap(new w9j() { // from class: l.q0j0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return d1j0.m109624O3(function1, obj);
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.s0j0
            @Override // p149l.e30
            public final void call(Object obj) {
                d1j0.m109619J3(this.f161774a, (BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.u0j0
            @Override // p149l.e30
            public final void call(Object obj) {
                d1j0.m109623N3((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T3 */
    public final void m109628T3() {
        String strM149818o = ((nnn0) m206027E2()).m149818o();
        strM149818o.getClass();
        C22306c<List<BLiveVoiceChatTopic>> c22306cChatTopicAsset = VoiceVirtualApi.chatTopicAsset(strM149818o);
        VoiceVirtualApi voiceVirtualApi = VoiceVirtualApi.INSTANCE;
        String strM149818o2 = ((nnn0) m206027E2()).m149818o();
        strM149818o2.getClass();
        C22306c<BLiveVoiceChatTopic> chatTopic = voiceVirtualApi.getChatTopic(strM149818o2);
        final Function2 function2 = new Function2() { // from class: l.w0j0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return d1j0.m109622M3((List) obj, (BLiveVoiceChatTopic) obj2);
            }
        };
        duringCreated(C22306c.zip(c22306cChatTopicAsset, chatTopic, new x9j() { // from class: l.y0j0
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return d1j0.m109620K3(function2, obj, obj2);
            }
        })).subscribe(ffw.m121194e(new e30() { // from class: l.a1j0
            @Override // p149l.e30
            public final void call(Object obj) {
                d1j0.m109621L3(this.f67183a, (Pair) obj);
            }
        }, new e30() { // from class: l.b1j0
            @Override // p149l.e30
            public final void call(Object obj) {
                d1j0.m109625P3((Throwable) obj);
            }
        }));
    }
}
