package com.clevertap.android.sdk.network.fetch;

import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p153l.axl;
import p153l.bu9;
import p153l.hxb0;
import p153l.oa5;
import p153l.q1f;
import p153l.r5e;
import p153l.vh3;
import p153l.yxb;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BC\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, m88121d2 = {"Lcom/clevertap/android/sdk/network/fetch/InboxFetchCall;", "Ll/q1f;", "Lorg/json/JSONObject;", "Ll/yxb;", "ctApi", "Ll/hxb0;", "queueHeaderBuilder", "Ll/bu9;", "coreMetaData", "", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "Ll/axl;", "logger", "Ll/oa5;", "clock", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "<init>", "(Ll/yxb;Ll/hxb0;Ll/bu9;Ljava/lang/String;Ll/axl;Ll/oa5;Lkotlinx/coroutines/CoroutineDispatcher;)V", "Lcom/clevertap/android/sdk/network/fetch/a;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ll/yxb;", "b", "Ll/hxb0;", "c", "Ll/bu9;", Constants.INAPP_DATA_TAG, "Ljava/lang/String;", "e", "Ll/axl;", "f", "Ll/oa5;", "g", "Lkotlinx/coroutines/CoroutineDispatcher;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class InboxFetchCall implements q1f<JSONObject> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final yxb ctApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final hxb0 queueHeaderBuilder;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final bu9 coreMetaData;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final String packageName;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final axl logger;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final oa5 clock;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final CoroutineDispatcher dispatcher;

    public InboxFetchCall(@NotNull yxb yxbVar, @NotNull hxb0 hxb0Var, @NotNull bu9 bu9Var, @NotNull String str, @NotNull axl axlVar, @NotNull oa5 oa5Var, @NotNull CoroutineDispatcher coroutineDispatcher) {
        yxbVar.getClass();
        hxb0Var.getClass();
        bu9Var.getClass();
        str.getClass();
        axlVar.getClass();
        oa5Var.getClass();
        coroutineDispatcher.getClass();
        this.ctApi = yxbVar;
        this.queueHeaderBuilder = hxb0Var;
        this.coreMetaData = bu9Var;
        this.packageName = str;
        this.logger = axlVar;
        this.clock = oa5Var;
        this.dispatcher = coroutineDispatcher;
    }

    @Override // p153l.q1f
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo6914a(@NotNull Continuation<? super AbstractC1321a<? extends JSONObject>> continuation) {
        return vh3.m201255g(this.dispatcher, new InboxFetchCall$execute$2(this, null), continuation);
    }

    public /* synthetic */ InboxFetchCall(yxb yxbVar, hxb0 hxb0Var, bu9 bu9Var, String str, axl axlVar, oa5 oa5Var, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(yxbVar, hxb0Var, bu9Var, str, axlVar, (i & 32) != 0 ? oa5.f145660a : oa5Var, (i & 64) != 0 ? r5e.m179861b() : coroutineDispatcher);
    }
}
