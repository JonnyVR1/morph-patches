package com.clevertap.android.sdk.network.fetch;

import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.inbox.CTInboxMessage;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p153l.axl;
import p153l.bu9;
import p153l.dtm;
import p153l.hxb0;
import p153l.oa5;
import p153l.q1f;
import p153l.vh3;
import p153l.yxb;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0001\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aBQ\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0017\u001a\u00020\u00162\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u0019H\u0096@¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001cR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010'R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, m88121d2 = {"Lcom/clevertap/android/sdk/network/fetch/InboxDeleteCall;", "Ll/q1f;", "", "Ll/yxb;", "ctApi", "Ll/hxb0;", "queueHeaderBuilder", "", "Lcom/clevertap/android/sdk/inbox/CTInboxMessage;", "messages", "Ll/bu9;", "coreMetaData", "", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "Ll/axl;", "logger", "Ll/oa5;", "clock", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "<init>", "(Ll/yxb;Ll/hxb0;Ljava/util/List;Ll/bu9;Ljava/lang/String;Ll/axl;Ll/oa5;Lkotlinx/coroutines/CoroutineDispatcher;)V", "Lorg/json/JSONObject;", "g", "(Ljava/util/List;)Lorg/json/JSONObject;", "Lcom/clevertap/android/sdk/network/fetch/a;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ll/yxb;", "b", "Ll/hxb0;", "c", "Ljava/util/List;", Constants.INAPP_DATA_TAG, "Ll/bu9;", "e", "Ljava/lang/String;", "f", "Ll/axl;", "Ll/oa5;", "h", "Lkotlinx/coroutines/CoroutineDispatcher;", "Companion", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY})
@SourceDebugExtension
public final class InboxDeleteCall implements q1f<Unit> {

    @NotNull
    private static final C1320a Companion = new C1320a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final yxb ctApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final hxb0 queueHeaderBuilder;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final List<CTInboxMessage> messages;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final bu9 coreMetaData;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final String packageName;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final axl logger;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final oa5 clock;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final CoroutineDispatcher dispatcher;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.network.fetch.InboxDeleteCall$a */
    @Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m88121d2 = {"Lcom/clevertap/android/sdk/network/fetch/InboxDeleteCall$a;", "", "<init>", "()V", "", "TYPE_DELETE_MESSAGES", "Ljava/lang/String;", "KEY_MESSAGES", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class C1320a {
        public /* synthetic */ C1320a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1320a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InboxDeleteCall(@NotNull yxb yxbVar, @NotNull hxb0 hxb0Var, @NotNull List<? extends CTInboxMessage> list, @NotNull bu9 bu9Var, @NotNull String str, @NotNull axl axlVar, @NotNull oa5 oa5Var, @NotNull CoroutineDispatcher coroutineDispatcher) {
        yxbVar.getClass();
        hxb0Var.getClass();
        list.getClass();
        bu9Var.getClass();
        str.getClass();
        axlVar.getClass();
        oa5Var.getClass();
        coroutineDispatcher.getClass();
        this.ctApi = yxbVar;
        this.queueHeaderBuilder = hxb0Var;
        this.messages = list;
        this.coreMetaData = bu9Var;
        this.packageName = str;
        this.logger = axlVar;
        this.clock = oa5Var;
        this.dispatcher = coroutineDispatcher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public final JSONObject m6913g(List<? extends CTInboxMessage> messages) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (CTInboxMessage cTInboxMessage : messages) {
            JSONObject jSONObjectPut = new JSONObject().put(Constants.WZRK_MID, cTInboxMessage.m6737e());
            JSONObject jSONObjectM6741i = cTInboxMessage.m6741i();
            if (jSONObjectM6741i != null) {
                Iterator<String> itKeys = jSONObjectM6741i.keys();
                itKeys.getClass();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObjectPut.put(next, jSONObjectM6741i.get(next));
                }
            }
            jSONArray.put(jSONObjectPut);
        }
        JSONObject jSONObjectPut2 = new JSONObject().put("type", "deleteMessages").put("messages", jSONArray);
        jSONObjectPut2.getClass();
        dtm.m117884b(jSONObjectPut2, this.coreMetaData, this.clock, this.packageName);
        return jSONObjectPut2;
    }

    @Override // p153l.q1f
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo6914a(@NotNull Continuation<? super AbstractC1321a<? extends Unit>> continuation) {
        return vh3.m201255g(this.dispatcher, new InboxDeleteCall$execute$2(this, null), continuation);
    }
}
