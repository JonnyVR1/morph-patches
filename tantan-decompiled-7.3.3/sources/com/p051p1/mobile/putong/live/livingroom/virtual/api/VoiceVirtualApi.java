package com.p051p1.mobile.putong.live.livingroom.virtual.api;

import com.alibaba.fastjson.JSONObject;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveExtraResponse;
import com.p051p1.mobile.putong.live.base.data.BLiveSchema;
import com.p051p1.mobile.putong.live.base.data.BLiveType;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceChatTopic;
import com.p051p1.mobile.putong.live.base.data.BLiveVoicePlayModeItem;
import com.p051p1.mobile.putong.live.livingroom.virtual.api.VoiceVirtualApi;
import com.tencent.open.SocialConstants;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;
import p153l.fo0;
import p153l.gcg0;
import p153l.qcj;
import p153l.rnl;
import p153l.vrv;
import p153l.vxj0;
import p153l.y20;
import p153l.zrv;
import p153l.zvr;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u00072\u0006\u0010\u000e\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\rJ#\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u000f0\u00072\u0006\u0010\u000e\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0013\u0010\rJ)\u0010\u0017\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0018\u00010\u00072\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0017\u0010\nJ\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J5\u0010\u001c\u001a\u0004\u0018\u00010\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJM\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00072\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0007¢\u0006\u0004\b&\u0010'J+\u0010*\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u0004¢\u0006\u0004\b*\u0010+J\u001b\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b,\u0010\r¨\u0006-"}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/virtual/api/VoiceVirtualApi;", "", "<init>", "()V", "", "liveId", "template", "Lrx/c;", "Lcom/p1/mobile/putong/live/base/data/BLiveEnvelope;", "switchTemplate", "(Ljava/lang/String;Ljava/lang/String;)Lrx/c;", "", "changeGameMode", "(Ljava/lang/String;)Lrx/c;", "roomId", "", "Lcom/p1/mobile/putong/live/base/data/BLiveVoicePlayModeItem;", "getVoiceGamesConfigs", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceChatTopic;", "chatTopicAsset", "shareUserId", "schemaSearch", "Lcom/p1/mobile/putong/live/base/data/BLiveSchema;", "getLiveSchemaStatus", "reportVirtualAvatars", "()Lrx/c;", "source", "from", "getVirtualLikeFromJson", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/data/User;", "user", "", "likeOrDislike", "pageId", "Lcom/p1/mobile/putong/data/Relationship;", "like", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/data/User;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lrx/c;", "tag", "topic", "patchChatTopic", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lrx/c;", "getChatTopic", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class VoiceVirtualApi {

    @NotNull
    public static final VoiceVirtualApi INSTANCE = new VoiceVirtualApi();

    private VoiceVirtualApi() {
    }

    /* JADX INFO: renamed from: a */
    public static BLiveVoiceChatTopic m77975a(Function1 function1, Object obj) {
        return (BLiveVoiceChatTopic) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: b */
    public static void m77976b(Act act, User user, boolean z, String str, String str2, String str3, String str4, final gcg0 gcg0Var) {
        gcg0Var.getClass();
        zrv.f205799a.m207673i0(act, user, z, getVirtualLikeFromJson(str, "", str2, str3), new y20() { // from class: l.bcp0
            @Override // p153l.y20
            public final void call(Object obj) {
                gcg0Var.m137019l((Relationship) obj);
            }
        }, new y20() { // from class: l.fcp0
            @Override // p153l.y20
            public final void call(Object obj) {
                gcg0Var.onError((Throwable) obj);
            }
        }, str4);
    }

    @JvmStatic
    @NotNull
    public static final C22421c<Unit> changeGameMode(@NotNull String liveId) {
        liveId.getClass();
        C22421c<BLiveEnvelope> c22421cM202552m = vrv.m202552m(rnl.m182263l(zvr.m221802b("/voice-lives/" + liveId)).m182288p().m182300c("type", "switchTemplate").m182300c("template", "game").m182301d(), "changeGameMode game", "");
        final Function1 function1 = new Function1() { // from class: l.dcp0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VoiceVirtualApi.m77980f((BLiveEnvelope) obj);
            }
        };
        C22421c map = c22421cM202552m.map(new qcj() { // from class: l.ecp0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return VoiceVirtualApi.m77978d(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @JvmStatic
    @NotNull
    public static final C22421c<List<BLiveVoiceChatTopic>> chatTopicAsset(@NotNull String roomId) {
        roomId.getClass();
        C22421c<BLiveEnvelope> c22421cM202547h = vrv.m202547h(rnl.m182263l(zvr.m221805e("/voice-rooms/" + roomId + "/chatTopicAsset")).m182288p().m182301d(), "chatTopicAsset");
        final Function1 function1 = new Function1() { // from class: l.icp0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VoiceVirtualApi.m77985k((BLiveEnvelope) obj);
            }
        };
        C22421c map = c22421cM202547h.map(new qcj() { // from class: l.jcp0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return VoiceVirtualApi.m77982h(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    /* JADX INFO: renamed from: d */
    public static Unit m77978d(Function1 function1, Object obj) {
        return (Unit) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: e */
    public static BLiveVoiceChatTopic m77979e(BLiveEnvelope bLiveEnvelope) {
        return bLiveEnvelope.data.chatTopic;
    }

    /* JADX INFO: renamed from: f */
    public static Unit m77980f(BLiveEnvelope bLiveEnvelope) {
        vxj0 vxj0Var = vxj0.f186265a;
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g */
    public static List m77981g(Function1 function1, Object obj) {
        return (List) function1.invoke(obj);
    }

    @JvmStatic
    @Nullable
    public static final C22421c<BLiveSchema> getLiveSchemaStatus(@NotNull String shareUserId, @NotNull String schemaSearch) {
        shareUserId.getClass();
        schemaSearch.getClass();
        C22421c c22421cM202548i = vrv.m202548i(rnl.m182263l(zvr.m221802b("/live-schemas")).m182288p().m182300c("shareUserId", shareUserId).m182300c(FirebaseAnalytics.Event.SEARCH, schemaSearch).m182301d(), "getLiveSchemaStatus", BLiveExtraResponse.JSON_ADAPTER);
        final Function1 function1 = new Function1() { // from class: l.gcp0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VoiceVirtualApi.m77983i((BLiveExtraResponse) obj);
            }
        };
        return c22421cM202548i.map(new qcj() { // from class: l.hcp0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return VoiceVirtualApi.m77984j(function1, obj);
            }
        }).observeOn(fo0.m126432a());
    }

    @JvmStatic
    @Nullable
    public static final String getVirtualLikeFromJson(@Nullable String source, @Nullable String from, @NotNull String liveId, @NotNull String roomId) {
        liveId.getClass();
        roomId.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("voiceLiveId", liveId);
        jSONObject.put("voiceRoomId", roomId);
        jSONObject.put("businessType", BLiveType.voiceLive);
        jSONObject.put("liveLikeSource", source);
        jSONObject.put("from", from);
        return jSONObject.toJSONString();
    }

    @JvmStatic
    @NotNull
    public static final C22421c<List<BLiveVoicePlayModeItem>> getVoiceGamesConfigs(@NotNull String roomId) {
        roomId.getClass();
        C22421c<BLiveEnvelope> c22421cM202562w = vrv.m202562w(rnl.m182263l(zvr.m221802b("/live/voice-rooms/" + roomId + "/gameAsset")), "getVoiceGamesConfigs");
        final Function1 function1 = new Function1() { // from class: l.ncp0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VoiceVirtualApi.m77987m((BLiveEnvelope) obj);
            }
        };
        C22421c map = c22421cM202562w.map(new qcj() { // from class: l.ccp0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return VoiceVirtualApi.m77981g(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    /* JADX INFO: renamed from: h */
    public static List m77982h(Function1 function1, Object obj) {
        return (List) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: i */
    public static BLiveSchema m77983i(BLiveExtraResponse bLiveExtraResponse) {
        List<BLiveSchema> list = bLiveExtraResponse.data.liveSchemas;
        if (list != null) {
            return list.get(0);
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public static BLiveSchema m77984j(Function1 function1, Object obj) {
        return (BLiveSchema) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: k */
    public static List m77985k(BLiveEnvelope bLiveEnvelope) {
        return bLiveEnvelope.data.chatTopicAsset.tagTopics;
    }

    @JvmStatic
    @NotNull
    public static final C22421c<Relationship> like(@NotNull final Act act, @NotNull final User user, final boolean likeOrDislike, @NotNull final String source, @NotNull final String pageId, @NotNull final String liveId, @NotNull final String roomId) {
        act.getClass();
        user.getClass();
        source.getClass();
        pageId.getClass();
        liveId.getClass();
        roomId.getClass();
        C22421c<Relationship> c22421cCreate = C22421c.create(new C22421c.a() { // from class: l.kcp0
            @Override // p153l.y20
            public final void call(Object obj) {
                VoiceVirtualApi.m77976b(act, user, likeOrDislike, source, liveId, roomId, pageId, (gcg0) obj);
            }
        });
        c22421cCreate.getClass();
        return c22421cCreate;
    }

    /* JADX INFO: renamed from: m */
    public static List m77987m(BLiveEnvelope bLiveEnvelope) {
        return bLiveEnvelope.data.gameAsset.gameConfs;
    }

    @JvmStatic
    @NotNull
    public static final C22421c<BLiveEnvelope> reportVirtualAvatars() {
        C22421c<BLiveEnvelope> c22421cM202544e = vrv.m202544e(rnl.m182263l(zvr.m221802b("/users/" + zrv.f205799a.m207631D0() + "/voiceLiveVirtualAvatarReport")).m182288p().m182301d(), "reportVirtualAvatars", "");
        c22421cM202544e.getClass();
        return c22421cM202544e;
    }

    @JvmStatic
    @NotNull
    public static final C22421c<BLiveEnvelope> switchTemplate(@NotNull String liveId, @NotNull String template) {
        liveId.getClass();
        template.getClass();
        C22421c<BLiveEnvelope> c22421cM202552m = vrv.m202552m(rnl.m182263l(zvr.m221802b("/voice-lives/" + liveId)).m182288p().m182300c("type", "switchTemplate").m182300c("template", template).m182301d(), "switchTemplate", WeJson.EMPTY_MAP);
        c22421cM202552m.getClass();
        return c22421cM202552m;
    }

    @NotNull
    public final C22421c<BLiveVoiceChatTopic> getChatTopic(@NotNull String roomId) {
        roomId.getClass();
        C22421c<BLiveEnvelope> c22421cM202547h = vrv.m202547h(rnl.m182263l(zvr.m221805e("/voice-rooms/" + roomId + "/chatTopic")).m182288p().m182301d(), "getChatTopic");
        final Function1 function1 = new Function1() { // from class: l.lcp0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VoiceVirtualApi.m77979e((BLiveEnvelope) obj);
            }
        };
        C22421c map = c22421cM202547h.map(new qcj() { // from class: l.mcp0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return VoiceVirtualApi.m77975a(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @NotNull
    public final C22421c<BLiveEnvelope> patchChatTopic(@NotNull String roomId, @NotNull String tag, @NotNull String topic) {
        roomId.getClass();
        tag.getClass();
        topic.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("tag", tag);
        jSONObject.put("topic", topic);
        C22421c<BLiveEnvelope> c22421cM202552m = vrv.m202552m(rnl.m182263l(zvr.m221805e("/voice-rooms/" + roomId + "/chatTopic")).m182288p().m182301d(), "patchChatTopic", jSONObject.toJSONString());
        c22421cM202552m.getClass();
        return c22421cM202552m;
    }
}
