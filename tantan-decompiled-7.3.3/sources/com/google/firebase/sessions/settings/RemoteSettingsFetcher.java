package com.google.firebase.sessions.settings;

import android.net.Uri;
import com.google.firebase.sessions.ApplicationInfo;
import com.p051p1.mobile.putong.data.Settings;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.eclipse.jetty.http.HttpHeaders;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import org.spongycastle.asn1.eac.EACTags;
import p153l.drb;
import p153l.uyp;
import p153l.vh3;
import p153l.wtq0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJm\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\f2\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000e2\"\u0010\u0012\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000eH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0015H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, m88121d2 = {"Lcom/google/firebase/sessions/settings/RemoteSettingsFetcher;", "Lcom/google/firebase/sessions/settings/CrashlyticsSettingsFetcher;", "appInfo", "Lcom/google/firebase/sessions/ApplicationInfo;", "blockingDispatcher", "Lkotlin/coroutines/CoroutineContext;", "baseUrl", "", "(Lcom/google/firebase/sessions/ApplicationInfo;Lkotlin/coroutines/CoroutineContext;Ljava/lang/String;)V", "doConfigFetch", "", "headerOptions", "", "onSuccess", "Lkotlin/Function2;", "Lorg/json/JSONObject;", "Lkotlin/coroutines/Continuation;", "", "onFailure", "(Ljava/util/Map;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "settingsUrl", "Ljava/net/URL;", "Companion", "com.google.firebase-firebase-sessions"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class RemoteSettingsFetcher implements CrashlyticsSettingsFetcher {

    @NotNull
    private static final String FIREBASE_PLATFORM = "android";

    @NotNull
    private static final String FIREBASE_SESSIONS_BASE_URL_STRING = "firebase-settings.crashlytics.com";

    @NotNull
    private final ApplicationInfo appInfo;

    @NotNull
    private final String baseUrl;

    @NotNull
    private final CoroutineContext blockingDispatcher;

    /* JADX INFO: renamed from: com.google.firebase.sessions.settings.RemoteSettingsFetcher$doConfigFetch$2 */
    @Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m88121d2 = {"Ll/drb;", "", "<anonymous>", "(Ll/drb;)V"}, m88122k = 3, m88123mv = {1, 8, 0})
    @DebugMetadata(m88262c = "com.google.firebase.sessions.settings.RemoteSettingsFetcher$doConfigFetch$2", m88263f = "RemoteSettingsFetcher.kt", m88264l = {68, 70, EACTags.CARDHOLDER_PUBLIC_KEY_TEMPLATE}, m88265m = "invokeSuspend")
    @SourceDebugExtension
    public static final class C32852 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
        final /* synthetic */ Map<String, String> $headerOptions;
        final /* synthetic */ Function2<String, Continuation<? super Unit>, Object> $onFailure;
        final /* synthetic */ Function2<JSONObject, Continuation<? super Unit>, Object> $onSuccess;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C32852(Map<String, String> map, Function2<? super JSONObject, ? super Continuation<? super Unit>, ? extends Object> function2, Function2<? super String, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super C32852> continuation) {
            super(2, continuation);
            this.$headerOptions = map;
            this.$onSuccess = function2;
            this.$onFailure = function3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return RemoteSettingsFetcher.this.new C32852(this.$headerOptions, this.$onSuccess, this.$onFailure, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull drb drbVar, @Nullable Continuation<? super Unit> continuation) {
            return ((C32852) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x00c8, code lost:
        
            if (r8.invoke(r1, r7) == r0) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00dd, code lost:
        
            if (r1.invoke(r3, r7) == r0) goto L36;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v0, types: [T, java.lang.String] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objM198688e = uyp.m198688e();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.m88128b(obj);
                    URLConnection uRLConnectionOpenConnection = RemoteSettingsFetcher.this.settingsUrl().openConnection();
                    uRLConnectionOpenConnection.getClass();
                    HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnectionOpenConnection;
                    httpsURLConnection.setRequestMethod("GET");
                    httpsURLConnection.setRequestProperty(HttpHeaders.ACCEPT, "application/json");
                    for (Map.Entry<String, String> entry : this.$headerOptions.entrySet()) {
                        httpsURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                    }
                    int responseCode = httpsURLConnection.getResponseCode();
                    if (responseCode == 200) {
                        InputStream inputStream = httpsURLConnection.getInputStream();
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                        StringBuilder sb = new StringBuilder();
                        Ref.ObjectRef objectRef = new Ref.ObjectRef();
                        while (true) {
                            ?? line = bufferedReader.readLine();
                            objectRef.element = line;
                            if (line == 0) {
                                break;
                            }
                            sb.append((String) line);
                        }
                        bufferedReader.close();
                        inputStream.close();
                        JSONObject jSONObject = new JSONObject(sb.toString());
                        Function2<JSONObject, Continuation<? super Unit>, Object> function2 = this.$onSuccess;
                        this.label = 1;
                        if (function2.invoke(jSONObject, this) == objM198688e) {
                            return objM198688e;
                        }
                    } else {
                        Function2<String, Continuation<? super Unit>, Object> function3 = this.$onFailure;
                        String str = "Bad response code: " + responseCode;
                        this.label = 2;
                    }
                } else {
                    if (i != 1 && i != 2 && i != 3) {
                        wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ResultKt.m88128b(obj);
                }
            } catch (Exception e) {
                Function2<String, Continuation<? super Unit>, Object> function4 = this.$onFailure;
                String message = e.getMessage();
                if (message == null) {
                    message = e.toString();
                }
                this.label = 3;
            }
            return Unit.INSTANCE;
        }
    }

    public RemoteSettingsFetcher(@NotNull ApplicationInfo applicationInfo, @NotNull CoroutineContext coroutineContext, @NotNull String str) {
        applicationInfo.getClass();
        coroutineContext.getClass();
        str.getClass();
        this.appInfo = applicationInfo;
        this.blockingDispatcher = coroutineContext;
        this.baseUrl = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final URL settingsUrl() {
        return new URL(new Uri.Builder().scheme("https").authority(this.baseUrl).appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp").appendPath(this.appInfo.getAppId()).appendPath(Settings.TYPE).appendQueryParameter("build_version", this.appInfo.getAndroidAppInfo().getAppBuildVersion()).appendQueryParameter("display_version", this.appInfo.getAndroidAppInfo().getVersionName()).build().toString());
    }

    @Override // com.google.firebase.sessions.settings.CrashlyticsSettingsFetcher
    @Nullable
    public Object doConfigFetch(@NotNull Map<String, String> map, @NotNull Function2<? super JSONObject, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Function2<? super String, ? super Continuation<? super Unit>, ? extends Object> function3, @NotNull Continuation<? super Unit> continuation) {
        Object objM201255g = vh3.m201255g(this.blockingDispatcher, new C32852(map, function2, function3, null), continuation);
        return objM201255g == uyp.m198688e() ? objM201255g : Unit.INSTANCE;
    }

    public /* synthetic */ RemoteSettingsFetcher(ApplicationInfo applicationInfo, CoroutineContext coroutineContext, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(applicationInfo, coroutineContext, (i & 4) != 0 ? FIREBASE_SESSIONS_BASE_URL_STRING : str);
    }
}
