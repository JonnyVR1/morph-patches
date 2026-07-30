package com.google.firebase.heartbeatinfo;

import android.content.Context;
import android.util.Base64OutputStream;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;
import com.google.firebase.inject.Provider;
import com.google.firebase.platforminfo.UserAgentPublisher;
import com.sina.weibo.sdk.constant.WBConstants;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;
import p153l.nfk0;
import p153l.toi0;

/* JADX INFO: loaded from: classes7.dex */
public class DefaultHeartBeatController implements HeartBeatController, HeartBeatInfo {
    private final Context applicationContext;
    private final Executor backgroundExecutor;
    private final Set<HeartBeatConsumer> consumers;
    private final Provider<HeartBeatInfoStorage> storageProvider;
    private final Provider<UserAgentPublisher> userAgentProvider;

    @VisibleForTesting
    public DefaultHeartBeatController(Provider<HeartBeatInfoStorage> provider, Set<HeartBeatConsumer> set, Executor executor, Provider<UserAgentPublisher> provider2, Context context) {
        this.storageProvider = provider;
        this.consumers = set;
        this.backgroundExecutor = executor;
        this.userAgentProvider = provider2;
        this.applicationContext = context;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m16845a(DefaultHeartBeatController defaultHeartBeatController) {
        String string;
        synchronized (defaultHeartBeatController) {
            try {
                HeartBeatInfoStorage heartBeatInfoStorage = defaultHeartBeatController.storageProvider.get();
                List<HeartBeatResult> allHeartBeats = heartBeatInfoStorage.getAllHeartBeats();
                heartBeatInfoStorage.deleteAllHeartBeats();
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < allHeartBeats.size(); i++) {
                    HeartBeatResult heartBeatResult = allHeartBeats.get(i);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", heartBeatResult.getUserAgent());
                    jSONObject.put("dates", new JSONArray((Collection) heartBeatResult.getUsedDates()));
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("heartbeats", jSONArray);
                jSONObject2.put(WBConstants.AUTH_PARAMS_VERSION, "2");
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                    try {
                        gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                        gZIPOutputStream.close();
                        base64OutputStream.close();
                        string = byteArrayOutputStream.toString("UTF-8");
                    } catch (Throwable th) {
                        try {
                            gZIPOutputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        base64OutputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
        return string;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ HeartBeatInfoStorage m16846b(Context context, String str) {
        return new HeartBeatInfoStorage(context, str);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ DefaultHeartBeatController m16847c(Qualified qualified, ComponentContainer componentContainer) {
        return new DefaultHeartBeatController((Context) componentContainer.get(Context.class), ((FirebaseApp) componentContainer.get(FirebaseApp.class)).getPersistenceKey(), (Set<HeartBeatConsumer>) componentContainer.setOf(HeartBeatConsumer.class), (Provider<UserAgentPublisher>) componentContainer.getProvider(UserAgentPublisher.class), (Executor) componentContainer.get(qualified));
    }

    @NonNull
    public static Component<DefaultHeartBeatController> component() {
        final Qualified qualified = Qualified.qualified(Background.class, Executor.class);
        return Component.builder(DefaultHeartBeatController.class, HeartBeatController.class, HeartBeatInfo.class).add(Dependency.required((Class<?>) Context.class)).add(Dependency.required((Class<?>) FirebaseApp.class)).add(Dependency.setOf((Class<?>) HeartBeatConsumer.class)).add(Dependency.requiredProvider((Class<?>) UserAgentPublisher.class)).add(Dependency.required((Qualified<?>) qualified)).factory(new ComponentFactory() { // from class: l.cpd
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return DefaultHeartBeatController.m16847c(qualified, componentContainer);
            }
        }).build();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Void m16848d(DefaultHeartBeatController defaultHeartBeatController) {
        synchronized (defaultHeartBeatController) {
            defaultHeartBeatController.storageProvider.get().storeHeartBeat(System.currentTimeMillis(), defaultHeartBeatController.userAgentProvider.get().getUserAgent());
        }
        return null;
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatInfo
    @NonNull
    public synchronized HeartBeatInfo.HeartBeat getHeartBeatCode(@NonNull String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        HeartBeatInfoStorage heartBeatInfoStorage = this.storageProvider.get();
        if (!heartBeatInfoStorage.shouldSendGlobalHeartBeat(jCurrentTimeMillis)) {
            return HeartBeatInfo.HeartBeat.NONE;
        }
        heartBeatInfoStorage.postHeartBeatCleanUp();
        return HeartBeatInfo.HeartBeat.GLOBAL;
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatController
    public Task<String> getHeartBeatsHeader() {
        return !nfk0.m162929a(this.applicationContext) ? toi0.m192068f("") : toi0.m192065c(this.backgroundExecutor, new Callable() { // from class: l.bpd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return DefaultHeartBeatController.m16845a(this.f77751a);
            }
        });
    }

    public Task<Void> registerHeartBeat() {
        if (this.consumers.size() <= 0) {
            return toi0.m192068f(null);
        }
        return !nfk0.m162929a(this.applicationContext) ? toi0.m192068f(null) : toi0.m192065c(this.backgroundExecutor, new Callable() { // from class: l.dpd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return DefaultHeartBeatController.m16848d(this.f90043a);
            }
        });
    }

    private DefaultHeartBeatController(final Context context, final String str, Set<HeartBeatConsumer> set, Provider<UserAgentPublisher> provider, Executor executor) {
        this((Provider<HeartBeatInfoStorage>) new Provider() { // from class: l.apd
            @Override // com.google.firebase.inject.Provider
            public final Object get() {
                return DefaultHeartBeatController.m16846b(context, str);
            }
        }, set, executor, provider, context);
    }
}
