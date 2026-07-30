package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.LifecycleActivity;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.SignInConnectionListener;
import com.google.android.gms.common.api.internal.zabe;
import com.google.android.gms.common.api.internal.zada;
import com.google.android.gms.common.api.internal.zak;
import com.google.android.gms.common.api.internal.zat;
import com.google.android.gms.common.internal.AccountType;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import p153l.ccf0;
import p153l.j7r0;
import p153l.l01;
import p153l.m5j;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public abstract class GoogleApiClient {

    @NonNull
    @KeepForSdk
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    public static final int SIGN_IN_MODE_OPTIONAL = 2;
    public static final int SIGN_IN_MODE_REQUIRED = 1;
    private static final Set zaa = Collections.newSetFromMap(new WeakHashMap());

    @Deprecated
    public interface ConnectionCallbacks extends com.google.android.gms.common.api.internal.ConnectionCallbacks {
        public static final int CAUSE_NETWORK_LOST = 2;
        public static final int CAUSE_SERVICE_DISCONNECTED = 1;
    }

    @Deprecated
    public interface OnConnectionFailedListener extends com.google.android.gms.common.api.internal.OnConnectionFailedListener {
    }

    public static void dumpAll(@NonNull String str, @NonNull FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @NonNull String[] strArr) {
        Set<GoogleApiClient> set = zaa;
        synchronized (set) {
            try {
                String str2 = str + "  ";
                int i = 0;
                for (GoogleApiClient googleApiClient : set) {
                    printWriter.append((CharSequence) str).append("GoogleApiClient#").println(i);
                    googleApiClient.dump(str2, fileDescriptor, printWriter, strArr);
                    i++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @NonNull
    @KeepForSdk
    public static Set<GoogleApiClient> getAllClients() {
        Set<GoogleApiClient> set = zaa;
        synchronized (set) {
        }
        return set;
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    public abstract ConnectionResult blockingConnect();

    @NonNull
    @ResultIgnorabilityUnspecified
    public abstract ConnectionResult blockingConnect(long j, @NonNull TimeUnit timeUnit);

    @NonNull
    public abstract PendingResult<Status> clearDefaultAccountAndReconnect();

    public abstract void connect();

    public void connect(int i) {
        throw new UnsupportedOperationException();
    }

    public abstract void disconnect();

    public abstract void dump(@NonNull String str, @NonNull FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @NonNull String[] strArr);

    @NonNull
    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T enqueue(@NonNull T t) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T execute(@NonNull T t) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    @KeepForSdk
    public <C extends Api.Client> C getClient(@NonNull Api.AnyClientKey<C> anyClientKey) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public abstract ConnectionResult getConnectionResult(@NonNull Api<?> api);

    @NonNull
    @KeepForSdk
    public Context getContext() {
        throw new UnsupportedOperationException();
    }

    @NonNull
    @KeepForSdk
    public Looper getLooper() {
        throw new UnsupportedOperationException();
    }

    @KeepForSdk
    public boolean hasApi(@NonNull Api<?> api) {
        throw new UnsupportedOperationException();
    }

    public abstract boolean hasConnectedApi(@NonNull Api<?> api);

    public abstract boolean isConnected();

    public abstract boolean isConnecting();

    public abstract boolean isConnectionCallbacksRegistered(@NonNull ConnectionCallbacks connectionCallbacks);

    public abstract boolean isConnectionFailedListenerRegistered(@NonNull OnConnectionFailedListener onConnectionFailedListener);

    @KeepForSdk
    public boolean maybeSignIn(@NonNull SignInConnectionListener signInConnectionListener) {
        throw new UnsupportedOperationException();
    }

    @KeepForSdk
    public void maybeSignOut() {
        throw new UnsupportedOperationException();
    }

    public abstract void reconnect();

    public abstract void registerConnectionCallbacks(@NonNull ConnectionCallbacks connectionCallbacks);

    public abstract void registerConnectionFailedListener(@NonNull OnConnectionFailedListener onConnectionFailedListener);

    @NonNull
    @KeepForSdk
    public <L> ListenerHolder<L> registerListener(@NonNull L l2) {
        throw new UnsupportedOperationException();
    }

    public abstract void stopAutoManage(@NonNull FragmentActivity fragmentActivity);

    public abstract void unregisterConnectionCallbacks(@NonNull ConnectionCallbacks connectionCallbacks);

    public abstract void unregisterConnectionFailedListener(@NonNull OnConnectionFailedListener onConnectionFailedListener);

    public void zao(zada zadaVar) {
        throw new UnsupportedOperationException();
    }

    public void zap(zada zadaVar) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public static final class Builder {

        @Nullable
        private Account zaa;
        private final Set zab;
        private final Set zac;
        private int zad;
        private View zae;
        private String zaf;
        private String zag;
        private final Map zah;
        private final Context zai;
        private final Map zaj;
        private LifecycleActivity zak;
        private int zal;

        @Nullable
        private OnConnectionFailedListener zam;
        private Looper zan;
        private GoogleApiAvailability zao;
        private Api.AbstractClientBuilder zap;
        private final ArrayList zaq;
        private final ArrayList zar;

        public Builder(@NonNull Context context) {
            this.zab = new HashSet();
            this.zac = new HashSet();
            this.zah = new l01();
            this.zaj = new l01();
            this.zal = -1;
            this.zao = GoogleApiAvailability.getInstance();
            this.zap = j7r0.f118707c;
            this.zaq = new ArrayList();
            this.zar = new ArrayList();
            this.zai = context;
            this.zan = context.getMainLooper();
            this.zaf = context.getPackageName();
            this.zag = context.getClass().getName();
        }

        private final void zab(Api api, @Nullable Api.ApiOptions apiOptions, Scope... scopeArr) {
            HashSet hashSet = new HashSet(((Api.BaseClientBuilder) Preconditions.checkNotNull(api.zac(), "Base client builder must not be null")).getImpliedScopes(apiOptions));
            for (Scope scope : scopeArr) {
                hashSet.add(scope);
            }
            this.zah.put(api, new com.google.android.gms.common.internal.zab(hashSet));
        }

        @NonNull
        public <O extends Api.ApiOptions.HasOptions> Builder addApi(@NonNull Api<O> api, @NonNull O o) {
            Preconditions.checkNotNull(api, "Api must not be null");
            Preconditions.checkNotNull(o, "Null options are not permitted for this Api");
            this.zaj.put(api, o);
            List<Scope> impliedScopes = ((Api.BaseClientBuilder) Preconditions.checkNotNull(api.zac(), "Base client builder must not be null")).getImpliedScopes(o);
            this.zac.addAll(impliedScopes);
            this.zab.addAll(impliedScopes);
            return this;
        }

        @NonNull
        public <O extends Api.ApiOptions.HasOptions> Builder addApiIfAvailable(@NonNull Api<O> api, @NonNull O o, @NonNull Scope... scopeArr) {
            Preconditions.checkNotNull(api, "Api must not be null");
            Preconditions.checkNotNull(o, "Null options are not permitted for this Api");
            this.zaj.put(api, o);
            zab(api, o, scopeArr);
            return this;
        }

        @NonNull
        public Builder addConnectionCallbacks(@NonNull ConnectionCallbacks connectionCallbacks) {
            Preconditions.checkNotNull(connectionCallbacks, "Listener must not be null");
            this.zaq.add(connectionCallbacks);
            return this;
        }

        @NonNull
        public Builder addOnConnectionFailedListener(@NonNull OnConnectionFailedListener onConnectionFailedListener) {
            Preconditions.checkNotNull(onConnectionFailedListener, "Listener must not be null");
            this.zar.add(onConnectionFailedListener);
            return this;
        }

        @NonNull
        public Builder addScope(@NonNull Scope scope) {
            Preconditions.checkNotNull(scope, "Scope must not be null");
            this.zab.add(scope);
            return this;
        }

        @NonNull
        @ResultIgnorabilityUnspecified
        public GoogleApiClient build() {
            Preconditions.checkArgument(!this.zaj.isEmpty(), "must call addApi() to add at least one API");
            ClientSettings clientSettingsZaa = zaa();
            Map mapZad = clientSettingsZaa.zad();
            l01 l01Var = new l01();
            l01 l01Var2 = new l01();
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            Api api = null;
            for (Api api2 : this.zaj.keySet()) {
                Object obj = this.zaj.get(api2);
                boolean z2 = mapZad.get(api2) != null;
                l01Var.put(api2, Boolean.valueOf(z2));
                zat zatVar = new zat(api2, z2);
                arrayList.add(zatVar);
                Api.AbstractClientBuilder abstractClientBuilder = (Api.AbstractClientBuilder) Preconditions.checkNotNull(api2.zaa());
                Api.Client clientBuildClient = abstractClientBuilder.buildClient(this.zai, this.zan, clientSettingsZaa, obj, (ConnectionCallbacks) zatVar, (OnConnectionFailedListener) zatVar);
                l01Var2.put(api2.zab(), clientBuildClient);
                if (abstractClientBuilder.getPriority() == 1) {
                    z = obj != null;
                }
                if (clientBuildClient.providesSignIn()) {
                    if (api != null) {
                        throw new IllegalStateException(api2.zad() + " cannot be used with " + api.zad());
                    }
                    api = api2;
                }
            }
            if (api != null) {
                if (z) {
                    m5j.m157106a("With using ", api.zad(), ", GamesOptions can only be specified within GoogleSignInOptions.Builder");
                    return null;
                }
                Preconditions.checkState(this.zaa == null, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", api.zad());
                Preconditions.checkState(this.zab.equals(this.zac), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", api.zad());
            }
            zabe zabeVar = new zabe(this.zai, new ReentrantLock(), this.zan, clientSettingsZaa, this.zao, this.zap, l01Var, this.zaq, this.zar, l01Var2, this.zal, zabe.zad(l01Var2.values(), true), arrayList);
            synchronized (GoogleApiClient.zaa) {
                GoogleApiClient.zaa.add(zabeVar);
            }
            if (this.zal >= 0) {
                zak.zaa(this.zak).zad(this.zal, zabeVar, this.zam);
            }
            return zabeVar;
        }

        @NonNull
        public Builder enableAutoManage(@NonNull FragmentActivity fragmentActivity, int i, @Nullable OnConnectionFailedListener onConnectionFailedListener) {
            LifecycleActivity lifecycleActivity = new LifecycleActivity((Activity) fragmentActivity);
            Preconditions.checkArgument(i >= 0, "clientId must be non-negative");
            this.zal = i;
            this.zam = onConnectionFailedListener;
            this.zak = lifecycleActivity;
            return this;
        }

        @NonNull
        public Builder setAccountName(@NonNull String str) {
            this.zaa = str == null ? null : new Account(str, AccountType.GOOGLE);
            return this;
        }

        @NonNull
        public Builder setGravityForPopups(int i) {
            this.zad = i;
            return this;
        }

        @NonNull
        public Builder setHandler(@NonNull Handler handler) {
            Preconditions.checkNotNull(handler, "Handler must not be null");
            this.zan = handler.getLooper();
            return this;
        }

        @NonNull
        public Builder setViewForPopups(@NonNull View view) {
            Preconditions.checkNotNull(view, "View must not be null");
            this.zae = view;
            return this;
        }

        @NonNull
        public Builder useDefaultAccount() {
            setAccountName("<<default account>>");
            return this;
        }

        @NonNull
        public final ClientSettings zaa() {
            ccf0 ccf0Var = ccf0.f80958j;
            Map map = this.zaj;
            Api api = j7r0.f118711g;
            if (map.containsKey(api)) {
                ccf0Var = (ccf0) this.zaj.get(api);
            }
            return new ClientSettings(this.zaa, this.zab, this.zah, this.zad, this.zae, this.zaf, this.zag, ccf0Var, false);
        }

        @NonNull
        public <T extends Api.ApiOptions.NotRequiredOptions> Builder addApiIfAvailable(@NonNull Api<? extends Api.ApiOptions.NotRequiredOptions> api, @NonNull Scope... scopeArr) {
            Preconditions.checkNotNull(api, "Api must not be null");
            this.zaj.put(api, null);
            zab(api, null, scopeArr);
            return this;
        }

        @NonNull
        public Builder enableAutoManage(@NonNull FragmentActivity fragmentActivity, @Nullable OnConnectionFailedListener onConnectionFailedListener) {
            enableAutoManage(fragmentActivity, 0, onConnectionFailedListener);
            return this;
        }

        @NonNull
        public Builder addApi(@NonNull Api<? extends Api.ApiOptions.NotRequiredOptions> api) {
            Preconditions.checkNotNull(api, "Api must not be null");
            this.zaj.put(api, null);
            List<Scope> impliedScopes = ((Api.BaseClientBuilder) Preconditions.checkNotNull(api.zac(), "Base client builder must not be null")).getImpliedScopes(null);
            this.zac.addAll(impliedScopes);
            this.zab.addAll(impliedScopes);
            return this;
        }

        public Builder(@NonNull Context context, @NonNull ConnectionCallbacks connectionCallbacks, @NonNull OnConnectionFailedListener onConnectionFailedListener) {
            this(context);
            Preconditions.checkNotNull(connectionCallbacks, "Must provide a connected listener");
            this.zaq.add(connectionCallbacks);
            Preconditions.checkNotNull(onConnectionFailedListener, "Must provide a connection failed listener");
            this.zar.add(onConnectionFailedListener);
        }
    }
}
