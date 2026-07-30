package com.p046p1.mobile.putong.live.livingroom.virtual.api;

import com.alibaba.fastjson.JSONObject;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveExtraResponse;
import com.p046p1.mobile.putong.live.base.data.BLiveSchema;
import com.p046p1.mobile.putong.live.base.data.BLiveType;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceChatTopic;
import com.p046p1.mobile.putong.live.base.data.BLiveVoicePlayModeItem;
import com.p046p1.mobile.putong.live.livingroom.virtual.api.VoiceVirtualApi;
import com.tencent.open.SocialConstants;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;
import p149l.cll;
import p149l.e30;
import p149l.jo0;
import p149l.soj0;
import p149l.upv;
import p149l.w9j;
import p149l.ypv;
import p149l.ytr;
import p149l.z3g0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u00072\u0006\u0010\u000e\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\rJ#\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u000f0\u00072\u0006\u0010\u000e\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0013\u0010\rJ)\u0010\u0017\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0018\u00010\u00072\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0017\u0010\nJ\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J5\u0010\u001c\u001a\u0004\u0018\u00010\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJM\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00072\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0007¢\u0006\u0004\b&\u0010'J+\u0010*\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u0004¢\u0006\u0004\b*\u0010+J\u001b\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b,\u0010\r¨\u0006-"}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/virtual/api/VoiceVirtualApi;", "", "<init>", "()V", "", "liveId", "template", "Lrx/c;", "Lcom/p1/mobile/putong/live/base/data/BLiveEnvelope;", "switchTemplate", "(Ljava/lang/String;Ljava/lang/String;)Lrx/c;", "", "changeGameMode", "(Ljava/lang/String;)Lrx/c;", "roomId", "", "Lcom/p1/mobile/putong/live/base/data/BLiveVoicePlayModeItem;", "getVoiceGamesConfigs", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceChatTopic;", "chatTopicAsset", "shareUserId", "schemaSearch", "Lcom/p1/mobile/putong/live/base/data/BLiveSchema;", "getLiveSchemaStatus", "reportVirtualAvatars", "()Lrx/c;", "source", "from", "getVirtualLikeFromJson", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/data/User;", "user", "", "likeOrDislike", "pageId", "Lcom/p1/mobile/putong/data/Relationship;", "like", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/data/User;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lrx/c;", "tag", "topic", "patchChatTopic", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lrx/c;", "getChatTopic", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class VoiceVirtualApi {

    @NotNull
    public static final VoiceVirtualApi INSTANCE = new VoiceVirtualApi();

    private VoiceVirtualApi() {
    }

    /* JADX INFO: renamed from: a */
    public static BLiveVoiceChatTopic m76792a(Function1 function1, Object obj) {
        return (BLiveVoiceChatTopic) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: b */
    public static void m76793b(Act act, User user, boolean z, String str, String str2, String str3, String str4, final z3g0 z3g0Var) {
        z3g0Var.getClass();
        ypv.f199493a.m199351i0(act, user, z, getVirtualLikeFromJson(str, "", str2, str3), new e30() { // from class: l.x2p0
            @Override // p149l.e30
            public final void call(Object obj) {
                z3g0Var.m132487l((Relationship) obj);
            }
        }, new e30() { // from class: l.b3p0
            @Override // p149l.e30
            public final void call(Object obj) {
                z3g0Var.onError((Throwable) obj);
            }
        }, str4);
    }

    @JvmStatic
    @NotNull
    public static final C22306c<Unit> changeGameMode(@NotNull String liveId) {
        liveId.getClass();
        C22306c<BLiveEnvelope> c22306cM194925m = upv.m194925m(cll.m107499l(ytr.m216073b("/voice-lives/" + liveId)).m107524p().m107536c("type", "switchTemplate").m107536c("template", "game").m107537d(), "changeGameMode game", "");
        final Function1 function1 = new Function1() { // from class: l.z2p0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VoiceVirtualApi.m76797f((BLiveEnvelope) obj);
            }
        };
        C22306c map = c22306cM194925m.map(new w9j() { // from class: l.a3p0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return VoiceVirtualApi.m76795d(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @JvmStatic
    @NotNull
    public static final C22306c<List<BLiveVoiceChatTopic>> chatTopicAsset(@NotNull String roomId) {
        roomId.getClass();
        C22306c<BLiveEnvelope> c22306cM194920h = upv.m194920h(cll.m107499l(ytr.m216076e("/voice-rooms/" + roomId + "/chatTopicAsset")).m107524p().m107537d(), "chatTopicAsset");
        final Function1 function1 = new Function1() { // from class: l.e3p0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VoiceVirtualApi.m76802k((BLiveEnvelope) obj);
            }
        };
        C22306c map = c22306cM194920h.map(new w9j() { // from class: l.f3p0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return VoiceVirtualApi.m76799h(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    /* JADX INFO: renamed from: d */
    public static Unit m76795d(Function1 function1, Object obj) {
        return (Unit) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: e */
    public static BLiveVoiceChatTopic m76796e(BLiveEnvelope bLiveEnvelope) {
        return bLiveEnvelope.data.chatTopic;
    }

    /* JADX INFO: renamed from: f */
    public static Unit m76797f(BLiveEnvelope bLiveEnvelope) {
        soj0 soj0Var = soj0.f165695a;
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g */
    public static List m76798g(Function1 function1, Object obj) {
        return (List) function1.invoke(obj);
    }

    @JvmStatic
    @Nullable
    public static final C22306c<BLiveSchema> getLiveSchemaStatus(@NotNull String shareUserId, @NotNull String schemaSearch) {
        shareUserId.getClass();
        schemaSearch.getClass();
        C22306c c22306cM194921i = upv.m194921i(cll.m107499l(ytr.m216073b("/live-schemas")).m107524p().m107536c("shareUserId", shareUserId).m107536c(FirebaseAnalytics.Event.SEARCH, schemaSearch).m107537d(), "getLiveSchemaStatus", BLiveExtraResponse.JSON_ADAPTER);
        final Function1 function1 = new Function1() { // from class: l.c3p0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VoiceVirtualApi.m76800i((BLiveExtraResponse) obj);
            }
        };
        return c22306cM194921i.map(new w9j() { // from class: l.d3p0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return VoiceVirtualApi.m76801j(function1, obj);
            }
        }).observeOn(jo0.m142408a());
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
    public static final C22306c<List<BLiveVoicePlayModeItem>> getVoiceGamesConfigs(@NotNull String roomId) {
        roomId.getClass();
        C22306c<BLiveEnvelope> c22306cM194935w = upv.m194935w(cll.m107499l(ytr.m216073b("/live/voice-rooms/" + roomId + "/gameAsset")), "getVoiceGamesConfigs");
        final Function1 function1 = new Function1() { // from class: l.j3p0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VoiceVirtualApi.m76804m((BLiveEnvelope) obj);
            }
        };
        C22306c map = c22306cM194935w.map(new w9j() { // from class: l.y2p0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return VoiceVirtualApi.m76798g(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    /* JADX INFO: renamed from: h */
    public static List m76799h(Function1 function1, Object obj) {
        return (List) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: i */
    public static BLiveSchema m76800i(BLiveExtraResponse bLiveExtraResponse) {
        List<BLiveSchema> list = bLiveExtraResponse.data.liveSchemas;
        if (list != null) {
            return list.get(0);
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public static BLiveSchema m76801j(Function1 function1, Object obj) {
        return (BLiveSchema) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: k */
    public static List m76802k(BLiveEnvelope bLiveEnvelope) {
        return bLiveEnvelope.data.chatTopicAsset.tagTopics;
    }

    @JvmStatic
    @NotNull
    public static final C22306c<Relationship> like(@NotNull final Act act, @NotNull final User user, final boolean likeOrDislike, @NotNull final String source, @NotNull final String pageId, @NotNull final String liveId, @NotNull final String roomId) {
        act.getClass();
        user.getClass();
        source.getClass();
        pageId.getClass();
        liveId.getClass();
        roomId.getClass();
        C22306c<Relationship> c22306cCreate = C22306c.create(new C22306c.a() { // from class: l.g3p0
            @Override // p149l.e30
            public final void call(Object obj) {
                VoiceVirtualApi.m76793b(act, user, likeOrDislike, source, liveId, roomId, pageId, (z3g0) obj);
            }
        });
        c22306cCreate.getClass();
        return c22306cCreate;
    }

    /* JADX INFO: renamed from: m */
    public static List m76804m(BLiveEnvelope bLiveEnvelope) {
        return bLiveEnvelope.data.gameAsset.gameConfs;
    }

    @JvmStatic
    @NotNull
    public static final C22306c<BLiveEnvelope> reportVirtualAvatars() {
        C22306c<BLiveEnvelope> c22306cM194917e = upv.m194917e(cll.m107499l(ytr.m216073b("/users/" + ypv.f199493a.m199309D0() + "/voiceLiveVirtualAvatarReport")).m107524p().m107537d(), "reportVirtualAvatars", "");
        c22306cM194917e.getClass();
        return c22306cM194917e;
    }

    @JvmStatic
    @NotNull
    public static final C22306c<BLiveEnvelope> switchTemplate(@NotNull String liveId, @NotNull String template) {
        liveId.getClass();
        template.getClass();
        C22306c<BLiveEnvelope> c22306cM194925m = upv.m194925m(cll.m107499l(ytr.m216073b("/voice-lives/" + liveId)).m107524p().m107536c("type", "switchTemplate").m107536c("template", template).m107537d(), "switchTemplate", WeJson.EMPTY_MAP);
        c22306cM194925m.getClass();
        return c22306cM194925m;
    }

    @NotNull
    public final C22306c<BLiveVoiceChatTopic> getChatTopic(@NotNull String roomId) {
        roomId.getClass();
        C22306c<BLiveEnvelope> c22306cM194920h = upv.m194920h(cll.m107499l(ytr.m216076e("/voice-rooms/" + roomId + "/chatTopic")).m107524p().m107537d(), "getChatTopic");
        final Function1 function1 = new Function1() { // from class: l.h3p0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VoiceVirtualApi.m76796e((BLiveEnvelope) obj);
            }
        };
        C22306c map = c22306cM194920h.map(new w9j() { // from class: l.i3p0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return VoiceVirtualApi.m76792a(function1, obj);
            }
        });
        map.getClass();
        return map;
    }

    @NotNull
    public final C22306c<BLiveEnvelope> patchChatTopic(@NotNull String roomId, @NotNull String tag, @NotNull String topic) {
        roomId.getClass();
        tag.getClass();
        topic.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("tag", tag);
        jSONObject.put("topic", topic);
        C22306c<BLiveEnvelope> c22306cM194925m = upv.m194925m(cll.m107499l(ytr.m216076e("/voice-rooms/" + roomId + "/chatTopic")).m107524p().m107537d(), "patchChatTopic", jSONObject.toJSONString());
        c22306cM194925m.getClass();
        return c22306cM194925m;
    }
}
