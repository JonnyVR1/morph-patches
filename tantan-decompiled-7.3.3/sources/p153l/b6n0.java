package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceChatGroup;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceChatGroupApply;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.chatgroup.bean.VoiceChatGroupInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\tJ\u001b\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\tJ+\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\tJ\u001b\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\t¨\u0006\u0014"}, m88121d2 = {"Ll/b6n0;", "", "<init>", "()V", "", "liveId", "Lrx/c;", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceChatGroup;", "m", "(Ljava/lang/String;)Lrx/c;", "o", "Lcom/p1/mobile/putong/live/livingroom/voice/intl/chatgroup/bean/VoiceChatGroupInfo;", "p", "applyId", "action", "r", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lrx/c;", "q", "Lcom/p1/mobile/putong/live/base/data/BLiveEnvelope;", "n", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class b6n0 {

    @NotNull
    public static final b6n0 INSTANCE = new b6n0();

    /* JADX INFO: renamed from: a */
    public static BLiveVoiceChatGroup m102773a(BLiveEnvelope bLiveEnvelope) {
        return bLiveEnvelope.data.voiceChatGroup;
    }

    /* JADX INFO: renamed from: b */
    public static BLiveVoiceChatGroup m102774b(BLiveEnvelope bLiveEnvelope) {
        return bLiveEnvelope.data.voiceChatGroup;
    }

    /* JADX INFO: renamed from: c */
    public static VoiceChatGroupInfo m102775c(BLiveEnvelope bLiveEnvelope) {
        BLiveVoiceChatGroup bLiveVoiceChatGroup = bLiveEnvelope.data.voiceChatGroup;
        bLiveVoiceChatGroup.getClass();
        List<BLiveVoiceChatGroupApply> list = bLiveEnvelope.data.voiceChatGroupApplies;
        list.getClass();
        return new VoiceChatGroupInfo(bLiveVoiceChatGroup, list);
    }

    /* JADX INFO: renamed from: d */
    public static BLiveEnvelope m102776d(BLiveEnvelope bLiveEnvelope) {
        return bLiveEnvelope;
    }

    /* JADX INFO: renamed from: e */
    public static BLiveEnvelope m102777e(Function1 function1, Object obj) {
        return (BLiveEnvelope) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: f */
    public static BLiveVoiceChatGroup m102778f(Function1 function1, Object obj) {
        return (BLiveVoiceChatGroup) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: g */
    public static BLiveVoiceChatGroup m102779g(Function1 function1, Object obj) {
        return (BLiveVoiceChatGroup) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: h */
    public static BLiveVoiceChatGroup m102780h(BLiveEnvelope bLiveEnvelope) {
        return bLiveEnvelope.data.voiceChatGroup;
    }

    /* JADX INFO: renamed from: i */
    public static BLiveVoiceChatGroup m102781i(Function1 function1, Object obj) {
        return (BLiveVoiceChatGroup) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: j */
    public static VoiceChatGroupInfo m102782j(BLiveEnvelope bLiveEnvelope) {
        BLiveVoiceChatGroup bLiveVoiceChatGroup = bLiveEnvelope.data.voiceChatGroup;
        bLiveVoiceChatGroup.getClass();
        List<BLiveVoiceChatGroupApply> list = bLiveEnvelope.data.voiceChatGroupApplies;
        list.getClass();
        return new VoiceChatGroupInfo(bLiveVoiceChatGroup, list);
    }

    /* JADX INFO: renamed from: k */
    public static VoiceChatGroupInfo m102783k(Function1 function1, Object obj) {
        return (VoiceChatGroupInfo) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: l */
    public static VoiceChatGroupInfo m102784l(Function1 function1, Object obj) {
        return (VoiceChatGroupInfo) function1.invoke(obj);
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final C22421c<BLiveVoiceChatGroup> m102785m(@NotNull String liveId) {
        liveId.getClass();
        C22421c<BLiveEnvelope> c22421cM202544e = vrv.m202544e(rnl.m182263l(zvr.m221802b("/voice-lives/" + liveId + "/chat-group")).m182288p().m182301d(), "createVoiceChatGroup", "");
        final Function1 function1 = new Function1() { // from class: l.x5n0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b6n0.m102773a((BLiveEnvelope) obj);
            }
        };
        C22421c map = c22421cM202544e.map(new qcj() { // from class: l.y5n0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return b6n0.m102781i(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final C22421c<BLiveEnvelope> m102786n(@NotNull String liveId) {
        liveId.getClass();
        rnl rnlVarM182301d = rnl.m182263l(zvr.m221802b("/voice-lives/" + liveId + "/chat-group-create-invite")).m182288p().m182301d();
        StringBuilder sb = new StringBuilder("requestVoiceChatGroupApply");
        sb.append(liveId);
        C22421c<BLiveEnvelope> c22421cM202544e = vrv.m202544e(rnlVarM182301d, sb.toString(), "");
        final Function1 function1 = new Function1() { // from class: l.z5n0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b6n0.m102776d((BLiveEnvelope) obj);
            }
        };
        C22421c map = c22421cM202544e.map(new qcj() { // from class: l.a6n0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return b6n0.m102777e(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final C22421c<BLiveVoiceChatGroup> m102787o(@NotNull String liveId) {
        liveId.getClass();
        C22421c<BLiveEnvelope> c22421cM202547h = vrv.m202547h(rnl.m182263l(zvr.m221802b("/voice-lives/" + liveId + "/chat-group")).m182288p().m182301d(), "createVoiceChatGroup");
        final Function1 function1 = new Function1() { // from class: l.p5n0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b6n0.m102774b((BLiveEnvelope) obj);
            }
        };
        C22421c map = c22421cM202547h.map(new qcj() { // from class: l.s5n0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return b6n0.m102779g(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final C22421c<VoiceChatGroupInfo> m102788p(@NotNull String liveId) {
        liveId.getClass();
        C22421c<BLiveEnvelope> c22421cM202547h = vrv.m202547h(rnl.m182263l(zvr.m221802b("/voice-lives/" + liveId + "/chat-group/applies")).m182288p().m182301d(), "requestVoiceChatGroupApplies");
        final Function1 function1 = new Function1() { // from class: l.v5n0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b6n0.m102782j((BLiveEnvelope) obj);
            }
        };
        C22421c map = c22421cM202547h.map(new qcj() { // from class: l.w5n0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return b6n0.m102783k(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final C22421c<VoiceChatGroupInfo> m102789q(@NotNull String liveId) {
        liveId.getClass();
        rnl rnlVarM182301d = rnl.m182263l(zvr.m221802b("/voice-lives/" + liveId + "/chat-group/applies")).m182288p().m182301d();
        StringBuilder sb = new StringBuilder("requestVoiceChatGroupApply");
        sb.append(liveId);
        C22421c<BLiveEnvelope> c22421cM202544e = vrv.m202544e(rnlVarM182301d, sb.toString(), "");
        final Function1 function1 = new Function1() { // from class: l.q5n0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b6n0.m102775c((BLiveEnvelope) obj);
            }
        };
        C22421c map = c22421cM202544e.map(new qcj() { // from class: l.r5n0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return b6n0.m102784l(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public final C22421c<BLiveVoiceChatGroup> m102790r(@NotNull String liveId, @NotNull String applyId, @NotNull String action) {
        liveId.getClass();
        applyId.getClass();
        action.getClass();
        C22421c<BLiveEnvelope> c22421cM202541b = vrv.m202541b(rnl.m182263l(zvr.m221802b("/voice-lives/" + liveId + "/chat-group/applies/" + applyId)).m182288p().m182300c("action", action).m182301d(), "requestVoiceChatGroupApprove", "");
        final Function1 function1 = new Function1() { // from class: l.t5n0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b6n0.m102780h((BLiveEnvelope) obj);
            }
        };
        C22421c map = c22421cM202541b.map(new qcj() { // from class: l.u5n0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return b6n0.m102778f(function1, obj);
            }
        });
        map.getClass();
        return map;
    }
}
