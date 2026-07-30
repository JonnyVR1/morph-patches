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
import p149l.d4e;
import p149l.dpb0;
import p149l.hh3;
import p149l.kwb;
import p149l.m0f;
import p149l.n95;
import p149l.nul;
import p149l.qs9;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BC\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, m87232d2 = {"Lcom/clevertap/android/sdk/network/fetch/InboxFetchCall;", "Ll/m0f;", "Lorg/json/JSONObject;", "Ll/kwb;", "ctApi", "Ll/dpb0;", "queueHeaderBuilder", "Ll/qs9;", "coreMetaData", "", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "Ll/nul;", "logger", "Ll/n95;", "clock", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "<init>", "(Ll/kwb;Ll/dpb0;Ll/qs9;Ljava/lang/String;Ll/nul;Ll/n95;Lkotlinx/coroutines/CoroutineDispatcher;)V", "Lcom/clevertap/android/sdk/network/fetch/a;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ll/kwb;", "b", "Ll/dpb0;", "c", "Ll/qs9;", Constants.INAPP_DATA_TAG, "Ljava/lang/String;", "e", "Ll/nul;", "f", "Ll/n95;", "g", "Lkotlinx/coroutines/CoroutineDispatcher;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class InboxFetchCall implements m0f<JSONObject> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final kwb ctApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final dpb0 queueHeaderBuilder;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final qs9 coreMetaData;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final String packageName;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final nul logger;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final n95 clock;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final CoroutineDispatcher dispatcher;

    public InboxFetchCall(@NotNull kwb kwbVar, @NotNull dpb0 dpb0Var, @NotNull qs9 qs9Var, @NotNull String str, @NotNull nul nulVar, @NotNull n95 n95Var, @NotNull CoroutineDispatcher coroutineDispatcher) {
        kwbVar.getClass();
        dpb0Var.getClass();
        qs9Var.getClass();
        str.getClass();
        nulVar.getClass();
        n95Var.getClass();
        coroutineDispatcher.getClass();
        this.ctApi = kwbVar;
        this.queueHeaderBuilder = dpb0Var;
        this.coreMetaData = qs9Var;
        this.packageName = str;
        this.logger = nulVar;
        this.clock = n95Var;
        this.dispatcher = coroutineDispatcher;
    }

    @Override // p149l.m0f
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo6860a(@NotNull Continuation<? super AbstractC1298a<? extends JSONObject>> continuation) {
        return hh3.m130938g(this.dispatcher, new InboxFetchCall$execute$2(this, null), continuation);
    }

    public /* synthetic */ InboxFetchCall(kwb kwbVar, dpb0 dpb0Var, qs9 qs9Var, String str, nul nulVar, n95 n95Var, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(kwbVar, dpb0Var, qs9Var, str, nulVar, (i & 32) != 0 ? n95.f137721a : n95Var, (i & 64) != 0 ? d4e.m109981b() : coroutineDispatcher);
    }
}
