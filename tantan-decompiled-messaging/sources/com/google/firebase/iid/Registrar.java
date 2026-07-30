package com.google.firebase.iid;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.iid.internal.FirebaseInstanceIdInternal;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import p149l.tfi0;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@KeepForSdk
public final class Registrar implements ComponentRegistrar {

    public static class FIIDInternalAdapter implements FirebaseInstanceIdInternal {
        final FirebaseInstanceId fiid;

        public FIIDInternalAdapter(FirebaseInstanceId firebaseInstanceId) {
            this.fiid = firebaseInstanceId;
        }

        @Override // com.google.firebase.iid.internal.FirebaseInstanceIdInternal
        public void addNewTokenListener(FirebaseInstanceIdInternal.NewTokenListener newTokenListener) {
            this.fiid.addNewTokenListener(newTokenListener);
        }

        @Override // com.google.firebase.iid.internal.FirebaseInstanceIdInternal
        public void deleteToken(@NonNull String str, @NonNull String str2) throws IOException {
            this.fiid.deleteToken(str, str2);
        }

        @Override // com.google.firebase.iid.internal.FirebaseInstanceIdInternal
        public String getId() {
            return this.fiid.getId();
        }

        @Override // com.google.firebase.iid.internal.FirebaseInstanceIdInternal
        public String getToken() {
            return this.fiid.getToken();
        }

        @Override // com.google.firebase.iid.internal.FirebaseInstanceIdInternal
        public Task<String> getTokenTask() {
            String token = this.fiid.getToken();
            return token != null ? tfi0.m188734f(token) : this.fiid.getInstanceId().mo15369h(Registrar$FIIDInternalAdapter$$Lambda$0.$instance);
        }
    }

    public static final /* synthetic */ FirebaseInstanceId lambda$getComponents$0$Registrar(ComponentContainer componentContainer) {
        return new FirebaseInstanceId((FirebaseApp) componentContainer.get(FirebaseApp.class), componentContainer.getProvider(UserAgentPublisher.class), componentContainer.getProvider(HeartBeatInfo.class), (FirebaseInstallationsApi) componentContainer.get(FirebaseInstallationsApi.class));
    }

    public static final /* synthetic */ FirebaseInstanceIdInternal lambda$getComponents$1$Registrar(ComponentContainer componentContainer) {
        return new FIIDInternalAdapter((FirebaseInstanceId) componentContainer.get(FirebaseInstanceId.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<Component<?>> getComponents() {
        return Arrays.asList(Component.builder(FirebaseInstanceId.class).add(Dependency.required((Class<?>) FirebaseApp.class)).add(Dependency.optionalProvider((Class<?>) UserAgentPublisher.class)).add(Dependency.optionalProvider((Class<?>) HeartBeatInfo.class)).add(Dependency.required((Class<?>) FirebaseInstallationsApi.class)).factory(Registrar$$Lambda$0.$instance).alwaysEager().build(), Component.builder(FirebaseInstanceIdInternal.class).add(Dependency.required((Class<?>) FirebaseInstanceId.class)).factory(Registrar$$Lambda$1.$instance).build(), LibraryVersionComponent.create("fire-iid", BuildConfig.VERSION_NAME));
    }
}
