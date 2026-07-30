package com.momo.rtcbase;

import android.content.Context;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p153l.gig0;

/* JADX INFO: loaded from: classes8.dex */
public class NetworkMonitor {
    private static final String TAG = "NetworkMonitor";
    private NetworkMonitorAutoDetect autoDetect;
    private final Object autoDetectLock;
    private volatile NetworkMonitorAutoDetect.ConnectionType currentConnectionType;
    private final ArrayList<Long> nativeNetworkObservers;
    private final ArrayList<NetworkObserver> networkObservers;
    private int numObservers;

    public static class InstanceHolder {
        static final NetworkMonitor instance = new NetworkMonitor();

        private InstanceHolder() {
        }
    }

    public interface NetworkObserver {
        void onConnectionTypeChanged(NetworkMonitorAutoDetect.ConnectionType connectionType);
    }

    private NetworkMonitor() {
        this.autoDetectLock = new Object();
        this.nativeNetworkObservers = new ArrayList<>();
        this.networkObservers = new ArrayList<>();
        this.numObservers = 0;
        this.currentConnectionType = NetworkMonitorAutoDetect.ConnectionType.CONNECTION_UNKNOWN;
    }

    @Deprecated
    public static void addNetworkObserver(NetworkObserver networkObserver) {
        getInstance().addObserver(networkObserver);
    }

    @CalledByNative
    private static int androidSdkInt() {
        return Build.VERSION.SDK_INT;
    }

    private static void assertIsTrue(boolean z) {
        if (z) {
            return;
        }
        gig0.m130323a("Expected to be true");
    }

    public static NetworkMonitorAutoDetect createAndSetAutoDetectForTest(Context context) {
        NetworkMonitor networkMonitor = getInstance();
        NetworkMonitorAutoDetect networkMonitorAutoDetectCreateAutoDetect = networkMonitor.createAutoDetect(context);
        networkMonitor.autoDetect = networkMonitorAutoDetectCreateAutoDetect;
        return networkMonitorAutoDetectCreateAutoDetect;
    }

    private NetworkMonitorAutoDetect createAutoDetect(Context context) {
        return new NetworkMonitorAutoDetect(new NetworkMonitorAutoDetect.Observer() { // from class: com.momo.rtcbase.NetworkMonitor.1
            @Override // com.momo.rtcbase.NetworkMonitorAutoDetect.Observer
            public void onConnectionTypeChanged(NetworkMonitorAutoDetect.ConnectionType connectionType) {
                NetworkMonitor.this.updateCurrentConnectionType(connectionType);
            }

            @Override // com.momo.rtcbase.NetworkMonitorAutoDetect.Observer
            public void onNetworkConnect(NetworkMonitorAutoDetect.NetworkInformation networkInformation) {
                NetworkMonitor.this.notifyObserversOfNetworkConnect(networkInformation);
            }

            @Override // com.momo.rtcbase.NetworkMonitorAutoDetect.Observer
            public void onNetworkDisconnect(long j) {
                NetworkMonitor.this.notifyObserversOfNetworkDisconnect(j);
            }
        }, context);
    }

    private NetworkMonitorAutoDetect.ConnectionType getCurrentConnectionType() {
        return this.currentConnectionType;
    }

    private long getCurrentDefaultNetId() {
        long defaultNetId;
        synchronized (this.autoDetectLock) {
            NetworkMonitorAutoDetect networkMonitorAutoDetect = this.autoDetect;
            defaultNetId = networkMonitorAutoDetect == null ? -1L : networkMonitorAutoDetect.getDefaultNetId();
        }
        return defaultNetId;
    }

    @CalledByNative
    public static NetworkMonitor getInstance() {
        return InstanceHolder.instance;
    }

    private List<Long> getNativeNetworkObserversSync() {
        ArrayList arrayList;
        synchronized (this.nativeNetworkObservers) {
            arrayList = new ArrayList(this.nativeNetworkObservers);
        }
        return arrayList;
    }

    @Deprecated
    public static void init(Context context) {
    }

    public static boolean isOnline() {
        return getInstance().getCurrentConnectionType() != NetworkMonitorAutoDetect.ConnectionType.CONNECTION_NONE;
    }

    private native void nativeNotifyConnectionTypeChanged(long j);

    private native void nativeNotifyOfActiveNetworkList(long j, NetworkMonitorAutoDetect.NetworkInformation[] networkInformationArr);

    private native void nativeNotifyOfNetworkConnect(long j, NetworkMonitorAutoDetect.NetworkInformation networkInformation);

    private native void nativeNotifyOfNetworkDisconnect(long j, long j2);

    @CalledByNative
    private boolean networkBindingSupported() {
        boolean z;
        synchronized (this.autoDetectLock) {
            try {
                NetworkMonitorAutoDetect networkMonitorAutoDetect = this.autoDetect;
                z = networkMonitorAutoDetect != null && networkMonitorAutoDetect.supportNetworkCallback();
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    private void notifyObserversOfConnectionTypeChange(NetworkMonitorAutoDetect.ConnectionType connectionType) {
        ArrayList arrayList;
        Iterator<Long> it = getNativeNetworkObserversSync().iterator();
        while (it.hasNext()) {
            nativeNotifyConnectionTypeChanged(it.next().longValue());
        }
        synchronized (this.networkObservers) {
            arrayList = new ArrayList(this.networkObservers);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((NetworkObserver) it2.next()).onConnectionTypeChanged(connectionType);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyObserversOfNetworkConnect(NetworkMonitorAutoDetect.NetworkInformation networkInformation) {
        Iterator<Long> it = getNativeNetworkObserversSync().iterator();
        while (it.hasNext()) {
            nativeNotifyOfNetworkConnect(it.next().longValue(), networkInformation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyObserversOfNetworkDisconnect(long j) {
        Iterator<Long> it = getNativeNetworkObserversSync().iterator();
        while (it.hasNext()) {
            nativeNotifyOfNetworkDisconnect(it.next().longValue(), j);
        }
    }

    @Deprecated
    public static void removeNetworkObserver(NetworkObserver networkObserver) {
        getInstance().removeObserver(networkObserver);
    }

    @CalledByNative
    private void startMonitoring(Context context, long j) {
        Logging.m21196d(TAG, "Start monitoring with native observer " + j);
        if (context == null) {
            context = ContextUtils.getApplicationContext();
        }
        startMonitoring(context);
        synchronized (this.nativeNetworkObservers) {
            this.nativeNetworkObservers.add(Long.valueOf(j));
        }
        updateObserverActiveNetworkList(j);
        notifyObserversOfConnectionTypeChange(this.currentConnectionType);
    }

    @CalledByNative
    private void stopMonitoring(long j) {
        Logging.m21196d(TAG, "Stop monitoring with native observer " + j);
        stopMonitoring();
        synchronized (this.nativeNetworkObservers) {
            this.nativeNetworkObservers.remove(Long.valueOf(j));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateCurrentConnectionType(NetworkMonitorAutoDetect.ConnectionType connectionType) {
        this.currentConnectionType = connectionType;
        notifyObserversOfConnectionTypeChange(connectionType);
    }

    private void updateObserverActiveNetworkList(long j) {
        List<NetworkMonitorAutoDetect.NetworkInformation> activeNetworkList;
        synchronized (this.autoDetectLock) {
            NetworkMonitorAutoDetect networkMonitorAutoDetect = this.autoDetect;
            activeNetworkList = networkMonitorAutoDetect == null ? null : networkMonitorAutoDetect.getActiveNetworkList();
        }
        if (activeNetworkList == null || activeNetworkList.size() == 0) {
            return;
        }
        nativeNotifyOfActiveNetworkList(j, (NetworkMonitorAutoDetect.NetworkInformation[]) activeNetworkList.toArray(new NetworkMonitorAutoDetect.NetworkInformation[activeNetworkList.size()]));
    }

    public void addObserver(NetworkObserver networkObserver) {
        synchronized (this.networkObservers) {
            this.networkObservers.add(networkObserver);
        }
    }

    public NetworkMonitorAutoDetect getNetworkMonitorAutoDetect() {
        NetworkMonitorAutoDetect networkMonitorAutoDetect;
        synchronized (this.autoDetectLock) {
            networkMonitorAutoDetect = this.autoDetect;
        }
        return networkMonitorAutoDetect;
    }

    public int getNumObservers() {
        int i;
        synchronized (this.autoDetectLock) {
            i = this.numObservers;
        }
        return i;
    }

    public void removeObserver(NetworkObserver networkObserver) {
        synchronized (this.networkObservers) {
            this.networkObservers.remove(networkObserver);
        }
    }

    public void stopMonitoring() {
        synchronized (this.autoDetectLock) {
            try {
                int i = this.numObservers - 1;
                this.numObservers = i;
                if (i == 0) {
                    this.autoDetect.destroy();
                    this.autoDetect = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Deprecated
    public void startMonitoring() {
        startMonitoring(ContextUtils.getApplicationContext());
    }

    public void startMonitoring(Context context) {
        synchronized (this.autoDetectLock) {
            try {
                this.numObservers++;
                if (this.autoDetect == null) {
                    this.autoDetect = createAutoDetect(context);
                }
                this.currentConnectionType = NetworkMonitorAutoDetect.getConnectionType(this.autoDetect.getCurrentNetworkState());
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
