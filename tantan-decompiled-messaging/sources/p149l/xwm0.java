package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceChatGroup;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceChatGroupApply;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.chatgroup.bean.VoiceChatGroupInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\tJ\u001b\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\tJ+\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\tJ\u001b\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\t¨\u0006\u0014"}, m87232d2 = {"Ll/xwm0;", "", "<init>", "()V", "", "liveId", "Lrx/c;", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceChatGroup;", "m", "(Ljava/lang/String;)Lrx/c;", "o", "Lcom/p1/mobile/putong/live/livingroom/voice/intl/chatgroup/bean/VoiceChatGroupInfo;", "p", "applyId", "action", "r", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lrx/c;", "q", "Lcom/p1/mobile/putong/live/base/data/BLiveEnvelope;", "n", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class xwm0 {

    @NotNull
    public static final xwm0 INSTANCE = new xwm0();

    /* JADX INFO: renamed from: a */
    public static BLiveVoiceChatGroup m211340a(BLiveEnvelope bLiveEnvelope) {
        return bLiveEnvelope.data.voiceChatGroup;
    }

    /* JADX INFO: renamed from: b */
    public static BLiveVoiceChatGroup m211341b(BLiveEnvelope bLiveEnvelope) {
        return bLiveEnvelope.data.voiceChatGroup;
    }

    /* JADX INFO: renamed from: c */
    public static VoiceChatGroupInfo m211342c(BLiveEnvelope bLiveEnvelope) {
        BLiveVoiceChatGroup bLiveVoiceChatGroup = bLiveEnvelope.data.voiceChatGroup;
        bLiveVoiceChatGroup.getClass();
        List<BLiveVoiceChatGroupApply> list = bLiveEnvelope.data.voiceChatGroupApplies;
        list.getClass();
        return new VoiceChatGroupInfo(bLiveVoiceChatGroup, list);
    }

    /* JADX INFO: renamed from: d */
    public static BLiveEnvelope m211343d(BLiveEnvelope bLiveEnvelope) {
        return bLiveEnvelope;
    }

    /* JADX INFO: renamed from: e */
    public static BLiveEnvelope m211344e(Function1 function1, Object obj) {
        return (BLiveEnvelope) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: f */
    public static BLiveVoiceChatGroup m211345f(Function1 function1, Object obj) {
        return (BLiveVoiceChatGroup) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: g */
    public static BLiveVoiceChatGroup m211346g(Function1 function1, Object obj) {
        return (BLiveVoiceChatGroup) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: h */
    public static BLiveVoiceChatGroup m211347h(BLiveEnvelope bLiveEnvelope) {
        return bLiveEnvelope.data.voiceChatGroup;
    }

    /* JADX INFO: renamed from: i */
    public static BLiveVoiceChatGroup m211348i(Function1 function1, Object obj) {
        return (BLiveVoiceChatGroup) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: j */
    public static VoiceChatGroupInfo m211349j(BLiveEnvelope bLiveEnvelope) {
        BLiveVoiceChatGroup bLiveVoiceChatGroup = bLiveEnvelope.data.voiceChatGroup;
        bLiveVoiceChatGroup.getClass();
        List<BLiveVoiceChatGroupApply> list = bLiveEnvelope.data.voiceChatGroupApplies;
        list.getClass();
        return new VoiceChatGroupInfo(bLiveVoiceChatGroup, list);
    }

    /* JADX INFO: renamed from: k */
    public static VoiceChatGroupInfo m211350k(Function1 function1, Object obj) {
        return (VoiceChatGroupInfo) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: l */
    public static VoiceChatGroupInfo m211351l(Function1 function1, Object obj) {
        return (VoiceChatGroupInfo) function1.invoke(obj);
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final C22306c<BLiveVoiceChatGroup> m211352m(@NotNull String liveId) {
        liveId.getClass();
        C22306c<BLiveEnvelope> c22306cM194917e = upv.m194917e(cll.m107499l(ytr.m216073b("/voice-lives/" + liveId + "/chat-group")).m107524p().m107537d(), "createVoiceChatGroup", "");
        final Function1 function1 = new Function1() { // from class: l.twm0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return xwm0.m211340a((BLiveEnvelope) obj);
            }
        };
        C22306c map = c22306cM194917e.map(new w9j() { // from class: l.uwm0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return xwm0.m211348i(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final C22306c<BLiveEnvelope> m211353n(@NotNull String liveId) {
        liveId.getClass();
        cll cllVarM107537d = cll.m107499l(ytr.m216073b("/voice-lives/" + liveId + "/chat-group-create-invite")).m107524p().m107537d();
        StringBuilder sb = new StringBuilder("requestVoiceChatGroupApply");
        sb.append(liveId);
        C22306c<BLiveEnvelope> c22306cM194917e = upv.m194917e(cllVarM107537d, sb.toString(), "");
        final Function1 function1 = new Function1() { // from class: l.vwm0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return xwm0.m211343d((BLiveEnvelope) obj);
            }
        };
        C22306c map = c22306cM194917e.map(new w9j() { // from class: l.wwm0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return xwm0.m211344e(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final C22306c<BLiveVoiceChatGroup> m211354o(@NotNull String liveId) {
        liveId.getClass();
        C22306c<BLiveEnvelope> c22306cM194920h = upv.m194920h(cll.m107499l(ytr.m216073b("/voice-lives/" + liveId + "/chat-group")).m107524p().m107537d(), "createVoiceChatGroup");
        final Function1 function1 = new Function1() { // from class: l.lwm0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return xwm0.m211341b((BLiveEnvelope) obj);
            }
        };
        C22306c map = c22306cM194920h.map(new w9j() { // from class: l.owm0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return xwm0.m211346g(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final C22306c<VoiceChatGroupInfo> m211355p(@NotNull String liveId) {
        liveId.getClass();
        C22306c<BLiveEnvelope> c22306cM194920h = upv.m194920h(cll.m107499l(ytr.m216073b("/voice-lives/" + liveId + "/chat-group/applies")).m107524p().m107537d(), "requestVoiceChatGroupApplies");
        final Function1 function1 = new Function1() { // from class: l.rwm0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return xwm0.m211349j((BLiveEnvelope) obj);
            }
        };
        C22306c map = c22306cM194920h.map(new w9j() { // from class: l.swm0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return xwm0.m211350k(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final C22306c<VoiceChatGroupInfo> m211356q(@NotNull String liveId) {
        liveId.getClass();
        cll cllVarM107537d = cll.m107499l(ytr.m216073b("/voice-lives/" + liveId + "/chat-group/applies")).m107524p().m107537d();
        StringBuilder sb = new StringBuilder("requestVoiceChatGroupApply");
        sb.append(liveId);
        C22306c<BLiveEnvelope> c22306cM194917e = upv.m194917e(cllVarM107537d, sb.toString(), "");
        final Function1 function1 = new Function1() { // from class: l.mwm0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return xwm0.m211342c((BLiveEnvelope) obj);
            }
        };
        C22306c map = c22306cM194917e.map(new w9j() { // from class: l.nwm0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return xwm0.m211351l(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public final C22306c<BLiveVoiceChatGroup> m211357r(@NotNull String liveId, @NotNull String applyId, @NotNull String action) {
        liveId.getClass();
        applyId.getClass();
        action.getClass();
        C22306c<BLiveEnvelope> c22306cM194914b = upv.m194914b(cll.m107499l(ytr.m216073b("/voice-lives/" + liveId + "/chat-group/applies/" + applyId)).m107524p().m107536c("action", action).m107537d(), "requestVoiceChatGroupApprove", "");
        final Function1 function1 = new Function1() { // from class: l.pwm0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return xwm0.m211347h((BLiveEnvelope) obj);
            }
        };
        C22306c map = c22306cM194914b.map(new w9j() { // from class: l.qwm0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return xwm0.m211345f(function1, obj);
            }
        });
        map.getClass();
        return map;
    }
}
