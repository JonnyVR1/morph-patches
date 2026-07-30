package com.clevertap.android.sdk.network;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Utils;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.eri;
import p149l.hvf0;
import p149l.jri;
import p149l.l9r;
import p149l.mt10;
import p149l.nul;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u00029!B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\fJ\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0017\u001a\u00020\u0016*\u00020\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0019\u0010\u000fJ\r\u0010\u001a\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ\r\u0010\u001d\u001a\u00020\u0013¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010+\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\r0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001d\u00104\u001a\b\u0012\u0004\u0012\u00020\r008\u0006¢\u0006\f\n\u0004\b\u000e\u00101\u001a\u0004\b2\u00103R\u0016\u00108\u001a\u0004\u0018\u0001058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b6\u00107¨\u0006:"}, m87232d2 = {"Lcom/clevertap/android/sdk/network/NetworkMonitor;", "", "Landroid/content/Context;", "context", "", "accountId", "Ll/nul;", "logger", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ll/nul;)V", "", "m", "()V", "Lcom/clevertap/android/sdk/network/NetworkMonitor$a;", "f", "()Lcom/clevertap/android/sdk/network/NetworkMonitor$a;", "p", "Landroid/net/NetworkCapabilities;", "capabilities", "Lcom/clevertap/android/sdk/network/NetworkMonitor$NetworkType;", "j", "(Landroid/net/NetworkCapabilities;)Lcom/clevertap/android/sdk/network/NetworkMonitor$NetworkType;", "", BLiveStormDanmakuGiftResourceType.f44444l, "(Landroid/net/NetworkCapabilities;)Z", "h", "n", "()Z", "o", RXScreenCaptureService.KEY_INDEX, "()Lcom/clevertap/android/sdk/network/NetworkMonitor$NetworkType;", "k", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "Ll/nul;", "c", "Landroid/content/Context;", "appContext", "Landroid/net/ConnectivityManager$NetworkCallback;", Constants.INAPP_DATA_TAG, "Landroid/net/ConnectivityManager$NetworkCallback;", "networkCallback", "Ll/mt10;", "e", "Ll/mt10;", "_stateFlow", "Ll/eri;", "Ll/eri;", "getNetworkState", "()Ll/eri;", "networkState", "Landroid/net/ConnectivityManager;", "g", "()Landroid/net/ConnectivityManager;", "connectivityManager", "NetworkType", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class NetworkMonitor {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String accountId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final nul logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Context appContext;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private volatile ConnectivityManager.NetworkCallback networkCallback;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final mt10<C1292a> _stateFlow;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final eri<C1292a> networkState;

    @Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m87232d2 = {"Lcom/clevertap/android/sdk/network/NetworkMonitor$NetworkType;", "", "<init>", "(Ljava/lang/String;I)V", "WIFI", "CELLULAR", "ETHERNET", "VPN", "UNKNOWN", "DISCONNECTED", "UNDETECTED", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public enum NetworkType {
        WIFI,
        CELLULAR,
        ETHERNET,
        VPN,
        UNKNOWN,
        DISCONNECTED,
        UNDETECTED;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m87385a(values());

        @NotNull
        public static EnumEntries<NetworkType> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.network.NetworkMonitor$b */
    @Metadata(m87233k = 3, m87234mv = {2, 0, 0}, m87236xi = 48)
    public /* synthetic */ class C1293b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f5391a;

        static {
            int[] iArr = new int[NetworkType.values().length];
            try {
                iArr[NetworkType.WIFI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NetworkType.CELLULAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NetworkType.ETHERNET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NetworkType.VPN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[NetworkType.DISCONNECTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[NetworkType.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[NetworkType.UNDETECTED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f5391a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.network.NetworkMonitor$c */
    @Metadata(m87231d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m87232d2 = {"com/clevertap/android/sdk/network/NetworkMonitor$c", "Landroid/net/ConnectivityManager$NetworkCallback;", "Landroid/net/Network;", "network", "", "onAvailable", "(Landroid/net/Network;)V", "onLost", "Landroid/net/NetworkCapabilities;", "networkCapabilities", "onCapabilitiesChanged", "(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class C1294c extends ConnectivityManager.NetworkCallback {
        public C1294c() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            network.getClass();
            NetworkMonitor.this.logger.verbose(NetworkMonitor.this.accountId, "NetworkCallback#onAvailable: network=" + network);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            network.getClass();
            networkCapabilities.getClass();
            NetworkMonitor.this.logger.verbose(NetworkMonitor.this.accountId, "NetworkCallback#onCapabilitiesChanged: network=" + network + ", capabilities=" + networkCapabilities);
            NetworkMonitor.this._stateFlow.setValue(new C1292a(NetworkMonitor.this.m6797l(networkCapabilities), NetworkMonitor.this.m6796j(networkCapabilities)));
            NetworkMonitor.this.logger.verbose(NetworkMonitor.this.accountId, "NetworkCallback#onCapabilitiesChanged: updated state=" + NetworkMonitor.this._stateFlow.getValue());
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            network.getClass();
            NetworkMonitor.this.logger.verbose(NetworkMonitor.this.accountId, "NetworkCallback#onLost: network=" + network);
            NetworkMonitor.this._stateFlow.setValue(C1292a.INSTANCE.m6810a());
            NetworkMonitor.this.logger.verbose(NetworkMonitor.this.accountId, "NetworkCallback#onLost: updated state=" + NetworkMonitor.this._stateFlow.getValue());
        }
    }

    public NetworkMonitor(@NotNull Context context, @NotNull String str, @NotNull nul nulVar) {
        context.getClass();
        str.getClass();
        nulVar.getClass();
        this.accountId = str;
        this.logger = nulVar;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.appContext = applicationContext;
        mt10<C1292a> mt10VarM133163a = hvf0.m133163a(C1292a.INSTANCE.m6811b());
        this._stateFlow = mt10VarM133163a;
        this.networkState = jri.m142943b(mt10VarM133163a);
        nulVar.debug(str, "NetworkMonitor initializing...");
        m6798m();
    }

    /* JADX INFO: renamed from: f */
    private final C1292a m6794f() {
        try {
            ConnectivityManager connectivityManagerM6795g = m6795g();
            if (connectivityManagerM6795g == null) {
                return C1292a.INSTANCE.m6811b();
            }
            Network activeNetwork = connectivityManagerM6795g.getActiveNetwork();
            if (activeNetwork == null) {
                return C1292a.INSTANCE.m6810a();
            }
            NetworkCapabilities networkCapabilities = connectivityManagerM6795g.getNetworkCapabilities(activeNetwork);
            if (networkCapabilities == null) {
                return C1292a.INSTANCE.m6811b();
            }
            return !m6797l(networkCapabilities) ? C1292a.INSTANCE.m6810a() : new C1292a(true, m6796j(networkCapabilities));
        } catch (SecurityException unused) {
            this.logger.debug(this.accountId, "Missing ACCESS_NETWORK_STATE permission. Add it to AndroidManifest.xml");
            return C1292a.INSTANCE.m6811b();
        } catch (Exception e) {
            this.logger.debug(this.accountId, "Network state calculation failed: " + e.getMessage());
            return C1292a.INSTANCE.m6811b();
        }
    }

    /* JADX INFO: renamed from: g */
    private final ConnectivityManager m6795g() {
        Object systemService = this.appContext.getSystemService("connectivity");
        if (systemService instanceof ConnectivityManager) {
            return (ConnectivityManager) systemService;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public final NetworkType m6796j(NetworkCapabilities capabilities) {
        if (capabilities.hasTransport(1)) {
            return NetworkType.WIFI;
        }
        if (capabilities.hasTransport(0)) {
            return NetworkType.CELLULAR;
        }
        if (capabilities.hasTransport(3)) {
            return NetworkType.ETHERNET;
        }
        return capabilities.hasTransport(4) ? NetworkType.VPN : NetworkType.UNKNOWN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public final boolean m6797l(NetworkCapabilities networkCapabilities) {
        return networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16);
    }

    /* JADX INFO: renamed from: m */
    private final void m6798m() {
        if (m6795g() == null) {
            this.logger.debug(this.accountId, "ConnectivityManager not available");
            this._stateFlow.setValue(C1292a.INSTANCE.m6811b());
            return;
        }
        this._stateFlow.setValue(m6794f());
        m6799p();
        this.logger.debug(this.accountId, "NetworkMonitor initialized with state: " + this._stateFlow.getValue());
    }

    /* JADX INFO: renamed from: p */
    private final void m6799p() {
        C1294c c1294c = new C1294c();
        try {
            ConnectivityManager connectivityManagerM6795g = m6795g();
            if (connectivityManagerM6795g != null) {
                connectivityManagerM6795g.registerDefaultNetworkCallback(c1294c);
            }
            this.networkCallback = c1294c;
            this.logger.verbose(this.accountId, "Network callback registered successfully");
        } catch (Exception e) {
            this.logger.debug(this.accountId, "Network callback registration failed: " + e.getMessage());
        }
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final C1292a m6800h() {
        return this._stateFlow.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final NetworkType m6801i() {
        NetworkType networkType = m6800h().getNetworkType();
        this.logger.verbose(this.accountId, "getNetworkType: result=" + networkType);
        return networkType;
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public final String m6802k() {
        String strM5915l = null;
        switch (C1293b.f5391a[m6801i().ordinal()]) {
            case 1:
                strM5915l = "WiFi";
                break;
            case 2:
                strM5915l = Utils.m5915l(this.appContext);
                break;
            case 3:
                strM5915l = "Ethernet";
                break;
            case 4:
                strM5915l = "VPN";
                break;
            case 5:
                strM5915l = "Unavailable";
                break;
            case 6:
                strM5915l = "Unknown";
                break;
            case 7:
                break;
            default:
                l9r.m149037a();
                return null;
        }
        this.logger.verbose(this.accountId, "getNetworkTypeString: result=" + strM5915l);
        return strM5915l;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m6803n() {
        C1292a c1292aM6800h = m6800h();
        boolean z = c1292aM6800h.getIsAvailable() || c1292aM6800h.getNetworkType() == NetworkType.UNDETECTED;
        this.logger.verbose(this.accountId, "isNetworkOnline: state=" + c1292aM6800h + ", result=" + z);
        return z;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m6804o() {
        boolean zM6809e = m6800h().m6809e();
        this.logger.verbose(this.accountId, "isWifiConnected: result=" + zM6809e);
        return zM6809e;
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.network.NetworkMonitor$a */
    @Metadata(m87231d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u0011B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001a\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0014¨\u0006\u001c"}, m87232d2 = {"Lcom/clevertap/android/sdk/network/NetworkMonitor$a;", "", "", "isAvailable", "Lcom/clevertap/android/sdk/network/NetworkMonitor$NetworkType;", "networkType", "<init>", "(ZLcom/clevertap/android/sdk/network/NetworkMonitor$NetworkType;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", Constants.INAPP_DATA_TAG, "()Z", "b", "Lcom/clevertap/android/sdk/network/NetworkMonitor$NetworkType;", "c", "()Lcom/clevertap/android/sdk/network/NetworkMonitor$NetworkType;", "e", "isWifiConnected", "Companion", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final /* data */ class C1292a {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: c */
        @NotNull
        private static final C1292a f5387c = new C1292a(false, NetworkType.DISCONNECTED);

        /* JADX INFO: renamed from: d */
        @NotNull
        private static final C1292a f5388d = new C1292a(false, NetworkType.UNDETECTED);

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean isAvailable;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final NetworkType networkType;

        /* JADX INFO: renamed from: com.clevertap.android.sdk.network.NetworkMonitor$a$a, reason: from kotlin metadata */
        @Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, m87232d2 = {"Lcom/clevertap/android/sdk/network/NetworkMonitor$a$a;", "", "<init>", "()V", "Lcom/clevertap/android/sdk/network/NetworkMonitor$a;", "DISCONNECTED", "Lcom/clevertap/android/sdk/network/NetworkMonitor$a;", "a", "()Lcom/clevertap/android/sdk/network/NetworkMonitor$a;", "UNDETECTED", "b", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            /* JADX INFO: renamed from: a */
            public final C1292a m6810a() {
                return C1292a.f5387c;
            }

            @NotNull
            /* JADX INFO: renamed from: b */
            public final C1292a m6811b() {
                return C1292a.f5388d;
            }

            private Companion() {
            }
        }

        public /* synthetic */ C1292a(boolean z, NetworkType networkType, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? NetworkType.UNKNOWN : networkType);
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final NetworkType getNetworkType() {
            return this.networkType;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getIsAvailable() {
            return this.isAvailable;
        }

        /* JADX INFO: renamed from: e */
        public final boolean m6809e() {
            return this.isAvailable && this.networkType == NetworkType.WIFI;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof C1292a)) {
                return false;
            }
            C1292a c1292a = (C1292a) other;
            return this.isAvailable == c1292a.isAvailable && this.networkType == c1292a.networkType;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.isAvailable) * 31) + this.networkType.hashCode();
        }

        @NotNull
        public String toString() {
            return "NetworkState(isAvailable=" + this.isAvailable + ", networkType=" + this.networkType + ')';
        }

        public C1292a(boolean z, @NotNull NetworkType networkType) {
            networkType.getClass();
            this.isAvailable = z;
            this.networkType = networkType;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C1292a() {
            this(false, null, 3, 0 == true ? 1 : 0);
        }
    }
}
