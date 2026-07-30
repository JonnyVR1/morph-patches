package io.agora.utils2.internal;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.AssetFileDescriptor;
import android.hardware.display.DisplayManager;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.DhcpInfo;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.net.Uri;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.telephony.CellSignalStrength;
import android.telephony.CellSignalStrengthCdma;
import android.telephony.CellSignalStrengthGsm;
import android.telephony.CellSignalStrengthLte;
import android.telephony.CellSignalStrengthNr;
import android.telephony.CellSignalStrengthWcdma;
import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.OrientationEventListener;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.messaging.Constants;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import io.agora.base.internal.CalledByNative;
import io.agora.base.internal.ContextUtils;
import io.agora.base.internal.ThreadUtils;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import org.slf4j.Marker;
import p153l.jj5;
import p153l.mn5;
import p153l.nn5;

/* JADX INFO: loaded from: classes2.dex */
@TargetApi(17)
public class CommonUtility {
    private static final int INTERNAL_UPDATE_ROTATION = 200;
    private static final String LENGTH_SEPARATOR_CHARACTER = "agora_length_&&_";
    private static final String OFFSET_SEPARATOR_CHARACTER = "agora_offset_&&_";
    public static final String PREFIX_ASSETS = "/assets/";
    public static final String PREFIX_URI = "content://";
    private static final String TAG = "CommonUtility";
    static final int UNKNOWN_BATTERY_PERCENTAGE = 255;
    private static final String URI_PROTOCOL_HEAD = "/proc/";
    private static boolean ignoreMonitor = false;
    private static Handler mProcessInfoHandler;
    private static volatile CommonUtility sInstance;
    private String lastLocalIp4;
    private String lastLocalIp6;
    private final WeakReference<Context> mContext;
    private String mExtraConnectivityFilterActionForTesting;
    private final Handler mHandler;
    private Listener mListener;
    private final ThreadUtils.ThreadChecker mThreadChecker;
    private ConnectivityManager.NetworkCallback mobileNetworkCallback = null;
    private volatile int mBatteryPercentage = 255;
    private boolean mDisposed = false;
    private volatile boolean mUpdateRotationTrigger = false;
    private volatile int lastOrientation = -1;
    private AgoraPhoneStateListener mPhoneStateListener = null;
    private ConnectionChangeBroadcastReceiver mConnectionBroadcastReceiver = null;
    private PowerChangeReceiver mPowerChangeReceiver = null;
    private ProcessLifecycleOwner mProcessLifecycleOwner = null;
    private OrientationEventListener mOrientationListener = null;
    private DisplayManager.DisplayListener mDisplayListener = null;
    private BroadcastReceiver mOrientationObserver = null;
    private int mLastOrientation = -1;
    private AtomicInteger reference = new AtomicInteger(0);
    private boolean shouldGetIp = true;
    private ArrayList<SystemEventListener> systemEventListeners = new ArrayList<>();
    private final Runnable rotationRunnable = new Runnable() { // from class: io.agora.utils2.internal.CommonUtility.10
        @Override // java.lang.Runnable
        public void run() {
            if (((Context) CommonUtility.this.mContext.get()) == null) {
                return;
            }
            CommonUtility.this.getDisplayRotation();
            CommonUtility.this.mUpdateRotationTrigger = false;
        }
    };

    public static class AgoraPhoneStateListener extends PhoneStateListener {
        private final WeakReference<CommonUtility> mCommonUtilityRef;
        private final WeakReference<Handler> mHandlerRef;
        private SignalStrength mSignalStrength;
        private volatile boolean phoneStatusNeedResume = false;

        public AgoraPhoneStateListener(CommonUtility commonUtility, Handler handler) {
            this.mCommonUtilityRef = new WeakReference<>(commonUtility);
            this.mHandlerRef = new WeakReference<>(handler);
        }

        private int invokeMethod(String str) {
            try {
                SignalStrength signalStrength = this.mSignalStrength;
                if (signalStrength != null) {
                    return ((Integer) signalStrength.getClass().getDeclaredMethod(str, null).invoke(this.mSignalStrength, null)).intValue();
                }
                return 0;
            } catch (Exception unused) {
                return 0;
            }
        }

        @RequiresApi(26)
        public void fillCellInfoByNetworkType(@NonNull List<CellSignalStrength> list, @NonNull MediaNetworkInfo mediaNetworkInfo) {
            for (CellSignalStrength cellSignalStrength : list) {
                if (cellSignalStrength instanceof CellSignalStrengthLte) {
                    CellSignalStrengthLte cellSignalStrengthLte = (CellSignalStrengthLte) cellSignalStrength;
                    mediaNetworkInfo.rssi = cellSignalStrengthLte.getDbm();
                    mediaNetworkInfo.signalLevel = cellSignalStrengthLte.getLevel();
                    mediaNetworkInfo.snr = cellSignalStrengthLte.getRssnr();
                    return;
                }
                if ((cellSignalStrength instanceof CellSignalStrengthGsm) || (cellSignalStrength instanceof CellSignalStrengthCdma) || (cellSignalStrength instanceof CellSignalStrengthWcdma)) {
                    mediaNetworkInfo.rssi = cellSignalStrength.getDbm();
                    mediaNetworkInfo.signalLevel = cellSignalStrength.getLevel();
                    return;
                } else if (Build.VERSION.SDK_INT >= 29 && mn5.m159115a(cellSignalStrength)) {
                    CellSignalStrengthNr cellSignalStrengthNrM163855a = nn5.m163855a(cellSignalStrength);
                    mediaNetworkInfo.rssi = cellSignalStrengthNrM163855a.getDbm();
                    mediaNetworkInfo.signalLevel = cellSignalStrengthNrM163855a.getLevel();
                    return;
                }
            }
        }

        @RequiresApi(26)
        public void fillCellInfoHighLevel(@NonNull MediaNetworkInfo mediaNetworkInfo) {
            SignalStrength signalStrength = this.mSignalStrength;
            if (signalStrength != null) {
                try {
                    Method declaredMethod = signalStrength.getClass().getDeclaredMethod("getCellSignalStrengths", null);
                    if (declaredMethod != null) {
                        fillCellInfoByNetworkType((List) declaredMethod.invoke(this.mSignalStrength, null), mediaNetworkInfo);
                    }
                } catch (Exception unused) {
                    Logging.m88108e(CommonUtility.TAG, "fillCellInfoHighLevel getDeclareMethod:getCellSignalStrengths failed! ");
                    fillCellInfoLowLevel(mediaNetworkInfo);
                }
            }
        }

        public void fillCellInfoIfPossible(Context context, MediaNetworkInfo mediaNetworkInfo) {
            if (Build.VERSION.SDK_INT <= 28) {
                fillCellInfoLowLevel(mediaNetworkInfo);
            } else {
                fillCellInfoHighLevel(mediaNetworkInfo);
            }
        }

        public void fillCellInfoLowLevel(@NonNull MediaNetworkInfo mediaNetworkInfo) {
            mediaNetworkInfo.rssi = getRssi();
            mediaNetworkInfo.signalLevel = getLevel();
        }

        public int getAsuLevel() {
            return invokeMethod("getAsuLevel");
        }

        public int getLevel() {
            return invokeMethod("getLevel");
        }

        public int getRssi() {
            return invokeMethod("getDbm");
        }

        @Override // android.telephony.PhoneStateListener
        public void onCallStateChanged(int i, String str) {
            super.onCallStateChanged(i, str);
            final CommonUtility commonUtility = this.mCommonUtilityRef.get();
            Handler handler = this.mHandlerRef.get();
            if (commonUtility == null || handler == null) {
                return;
            }
            if (i == 0) {
                if (this.phoneStatusNeedResume) {
                    this.phoneStatusNeedResume = false;
                    Logging.m88105d(CommonUtility.TAG, "system phone call end delay 1000ms");
                    handler.postDelayed(new Runnable() { // from class: io.agora.utils2.internal.CommonUtility.AgoraPhoneStateListener.1
                        @Override // java.lang.Runnable
                        public void run() {
                            commonUtility.onAudioRoutingPhoneChanged(true, 22, 0);
                        }
                    }, 1000L);
                    return;
                }
                return;
            }
            if (i == 1) {
                Logging.m88105d(CommonUtility.TAG, "system phone call ring");
                this.phoneStatusNeedResume = true;
                commonUtility.onAudioRoutingPhoneChanged(false, 22, 1);
            } else if (i == 2) {
                Logging.m88105d(CommonUtility.TAG, "system phone call start");
                this.phoneStatusNeedResume = true;
                commonUtility.onAudioRoutingPhoneChanged(false, 22, 2);
            }
        }

        @Override // android.telephony.PhoneStateListener
        public void onSignalStrengthsChanged(SignalStrength signalStrength) {
            super.onSignalStrengthsChanged(signalStrength);
            this.mSignalStrength = signalStrength;
        }
    }

    public static class AndroidContextInfo {
        public String configDir;
        public String dataDir;
        public String device;
        public String deviceInfo;
        public String manufacturer;
        public String pkgName;
        public String pluginDir;
        public String systemInfo;

        @CalledByNative("AndroidContextInfo")
        public String getConfigDir() {
            return this.configDir;
        }

        @CalledByNative("AndroidContextInfo")
        public String getDataDir() {
            return this.dataDir;
        }

        @CalledByNative("AndroidContextInfo")
        public String getDevice() {
            return this.device;
        }

        @CalledByNative("AndroidContextInfo")
        public String getDeviceInfo() {
            return this.deviceInfo;
        }

        @CalledByNative("AndroidContextInfo")
        public String getManufacturer() {
            return this.manufacturer;
        }

        @CalledByNative("AndroidContextInfo")
        public String getPkgName() {
            return this.pkgName;
        }

        @CalledByNative("AndroidContextInfo")
        public String getPluginDir() {
            return this.pluginDir;
        }

        @CalledByNative("AndroidContextInfo")
        public String getSystemInfo() {
            return this.systemInfo;
        }
    }

    public interface Listener {
        void onAudioRoutingPhoneChanged(boolean z, int i, int i2);

        void onDispose();

        void onForegroundChanged(boolean z);

        void onNetworkChange(MediaNetworkInfo mediaNetworkInfo);
    }

    public static class MediaNetworkInfo {
        String localIp4 = "";
        String gatewayIp4 = "";
        String localIp6 = "";
        String gatewayIp6 = "";
        int networkType = -1;
        int networkSubtype = -1;
        int signalLevel = 0;
        int rssi = 0;
        int snr = -100;
        ArrayList<String> dnsList = null;
        int linkspeed = 0;
        int frequency = 0;
        ArrayList<String> ifconfigs = null;

        @CalledByNative("MediaNetworkInfo")
        public int getAsu() {
            return this.snr;
        }

        @CalledByNative("MediaNetworkInfo")
        public ArrayList<String> getDnsList() {
            return this.dnsList;
        }

        @CalledByNative("MediaNetworkInfo")
        public int getFrequency() {
            return this.frequency;
        }

        @CalledByNative("MediaNetworkInfo")
        public String getGatewayIp4() {
            return this.gatewayIp4;
        }

        @CalledByNative("MediaNetworkInfo")
        public String getGatewayIp6() {
            return this.gatewayIp6;
        }

        @CalledByNative("MediaNetworkInfo")
        public int getLinkspeed() {
            return this.linkspeed;
        }

        @CalledByNative("MediaNetworkInfo")
        public String getLocalIp4() {
            return this.localIp4;
        }

        @CalledByNative("MediaNetworkInfo")
        public String getLocalIp6() {
            return this.localIp6;
        }

        @CalledByNative("MediaNetworkInfo")
        public int getNetworkSubtype() {
            return this.networkSubtype;
        }

        @CalledByNative("MediaNetworkInfo")
        public int getNetworkType() {
            return this.networkType;
        }

        @CalledByNative("MediaNetworkInfo")
        public int getRssi() {
            return this.rssi;
        }

        @CalledByNative("MediaNetworkInfo")
        public int getSignalLevel() {
            return this.signalLevel;
        }

        @CalledByNative("MediaNetworkInfo")
        public ArrayList<String> getVpnIfconfigs() {
            return this.ifconfigs;
        }
    }

    public interface SystemEventListener {
        void onAddressBound(String str);

        void onAudioRoutingPhoneChanged(boolean z, int i, int i2);

        void onForegroundChanged(boolean z);

        void onGravityOriChange(int i);

        void onNetworkChange(MediaNetworkInfo mediaNetworkInfo);
    }

    private CommonUtility(Context context) {
        Logging.m88105d(TAG, "constructor()");
        this.mContext = new WeakReference<>(context);
        this.mThreadChecker = new ThreadUtils.ThreadChecker();
        HandlerThread handlerThread = new HandlerThread("UtilityThread");
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.mHandler = handler;
        handler.post(new Runnable() { // from class: io.agora.utils2.internal.CommonUtility.1
            @Override // java.lang.Runnable
            public void run() {
                CommonUtility.this.startMonitor();
            }
        });
    }

    public static boolean checkAccessNetworkState(Context context) {
        return context != null && context.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) == 0;
    }

    public static boolean checkAccessWifiState(Context context) {
        return context != null && context.checkPermission("android.permission.ACCESS_WIFI_STATE", Process.myPid(), Process.myUid()) == 0;
    }

    private void disableDisplayListener() {
        Context context = this.mContext.get();
        if (context == null) {
            return;
        }
        DisplayManager displayManager = (DisplayManager) context.getSystemService(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
        if (displayManager != null) {
            displayManager.unregisterDisplayListener(this.mDisplayListener);
            this.mDisplayListener = null;
        }
        Logging.m88105d(TAG, "[disableDisplayListener] done!");
    }

    private void enableDisplayListener(Context context) {
        DisplayManager displayManager;
        if (context == null || this.mDisplayListener != null || (displayManager = (DisplayManager) context.getSystemService(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION)) == null) {
            return;
        }
        DisplayManager.DisplayListener displayListener = new DisplayManager.DisplayListener() { // from class: io.agora.utils2.internal.CommonUtility.9
            @Override // android.hardware.display.DisplayManager.DisplayListener
            public void onDisplayAdded(int i) {
            }

            @Override // android.hardware.display.DisplayManager.DisplayListener
            public void onDisplayChanged(int i) {
                CommonUtility.this.updateOrientationManual();
            }

            @Override // android.hardware.display.DisplayManager.DisplayListener
            public void onDisplayRemoved(int i) {
            }
        };
        this.mDisplayListener = displayListener;
        displayManager.registerDisplayListener(displayListener, this.mHandler);
        Logging.m88105d(TAG, "[enableDisplayListener] done!");
    }

    private static void fillWifiInfoIfPossible(Context context, MediaNetworkInfo mediaNetworkInfo) {
        DhcpInfo dhcpInfo;
        int i;
        InetAddress inetAddressIntToInetAddress;
        if (!checkAccessWifiState(context)) {
            Logging.m88113w(TAG, "fail to fillWifiInfo, permission ACCESS_WIFI_STATE not granted");
            return;
        }
        WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
        WifiInfo connectionInfo = null;
        try {
            dhcpInfo = wifiManager.getDhcpInfo();
        } catch (Exception e) {
            Logging.m88108e(TAG, "exception occured when getDhcpInfo: " + e);
            dhcpInfo = null;
        }
        if (dhcpInfo != null && (inetAddressIntToInetAddress = intToInetAddress(dhcpInfo.gateway)) != null) {
            mediaNetworkInfo.gatewayIp4 = inetAddressIntToInetAddress.getHostAddress();
        }
        try {
            connectionInfo = wifiManager.getConnectionInfo();
        } catch (Exception e2) {
            Logging.m88108e(TAG, "exception occured when getConnectionInfo: " + e2);
        }
        if (connectionInfo == null) {
            Logging.m88113w(TAG, "fail to fillWifiInfo, wifiInfo null");
            return;
        }
        int rssi = connectionInfo.getRssi();
        mediaNetworkInfo.rssi = rssi;
        mediaNetworkInfo.signalLevel = WifiManager.calculateSignalLevel(rssi, 5);
        mediaNetworkInfo.linkspeed = connectionInfo.getLinkSpeed();
        int frequency = connectionInfo.getFrequency();
        mediaNetworkInfo.frequency = frequency;
        if (frequency >= 5000) {
            i = 101;
        } else if (frequency < 2400) {
            return;
        } else {
            i = 100;
        }
        mediaNetworkInfo.networkSubtype = i;
    }

    @CalledByNative
    public static int getAndroidVersion() {
        return Build.VERSION.SDK_INT;
    }

    private static String getAppPrivateStorageDir(Context context) {
        File externalFilesDir;
        return (!"mounted".equals(Environment.getExternalStorageState()) || (externalFilesDir = context.getExternalFilesDir(null)) == null) ? context.getFilesDir().getAbsolutePath() : externalFilesDir.getAbsolutePath();
    }

    public static String getAssetsFilePath(Context context, String str) throws Throwable {
        String str2;
        AssetFileDescriptor assetFileDescriptor = null;
        String str3 = null;
        assetFileDescriptor = null;
        if (context == null || TextUtils.isEmpty(str)) {
            Logging.m88108e(TAG, "getAssetsFilePath failed for init error");
            return null;
        }
        try {
            try {
                AssetFileDescriptor assetFileDescriptorOpenFd = context.getAssets().openFd(str.substring(str.indexOf("/assets/") + 8));
                try {
                    int fd = ParcelFileDescriptor.dup(assetFileDescriptorOpenFd.getFileDescriptor()).getFd();
                    if (fd < 0) {
                        try {
                            assetFileDescriptorOpenFd.close();
                            return null;
                        } catch (IOException e) {
                            e.printStackTrace();
                            return null;
                        }
                    }
                    str3 = "/assets/" + fd + OFFSET_SEPARATOR_CHARACTER + assetFileDescriptorOpenFd.getStartOffset() + LENGTH_SEPARATOR_CHARACTER + assetFileDescriptorOpenFd.getDeclaredLength();
                    Logging.m88105d(TAG, "getAssetsFilePath for init offset:" + assetFileDescriptorOpenFd.getStartOffset() + com.clevertap.android.sdk.Constants.SEPARATOR_COMMA + assetFileDescriptorOpenFd.getDeclaredLength());
                    try {
                        assetFileDescriptorOpenFd.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                } catch (Exception e3) {
                    e = e3;
                    String str4 = str3;
                    assetFileDescriptor = assetFileDescriptorOpenFd;
                    str2 = str4;
                    e.printStackTrace();
                    if (assetFileDescriptor != null) {
                        try {
                            assetFileDescriptor.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                    str3 = str2;
                } catch (Throwable th) {
                    th = th;
                    assetFileDescriptor = assetFileDescriptorOpenFd;
                    if (assetFileDescriptor != null) {
                        try {
                            assetFileDescriptor.close();
                        } catch (IOException e5) {
                            e5.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (Exception e6) {
                e = e6;
                str2 = null;
            }
            Logging.m88105d(TAG, "getAssetsFilePath is: " + str3);
            return str3;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0068 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static String getContentFilePath(Context context, Uri uri) throws Throwable {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        int fd;
        AssetFileDescriptor assetFileDescriptor = null;
        if (context == null || uri == null) {
            Logging.m88108e(TAG, "getContentFilePath failed for init error");
            return null;
        }
        try {
            assetFileDescriptorOpenAssetFileDescriptor = context.getContentResolver().openAssetFileDescriptor(uri, "r");
            try {
                try {
                    fd = ParcelFileDescriptor.dup(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor()).getFd();
                    try {
                        assetFileDescriptorOpenAssetFileDescriptor.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } catch (Exception e2) {
                    e = e2;
                    e.printStackTrace();
                    if (assetFileDescriptorOpenAssetFileDescriptor != null) {
                        try {
                            assetFileDescriptorOpenAssetFileDescriptor.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                    fd = -1;
                }
            } catch (Throwable th) {
                th = th;
                assetFileDescriptor = assetFileDescriptorOpenAssetFileDescriptor;
                if (assetFileDescriptor != null) {
                    try {
                        assetFileDescriptor.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Exception e5) {
            e = e5;
            assetFileDescriptorOpenAssetFileDescriptor = null;
        } catch (Throwable th2) {
            th = th2;
            if (assetFileDescriptor != null) {
                assetFileDescriptor.close();
            }
            throw th;
        }
        if (fd < 0) {
            return null;
        }
        String str = URI_PROTOCOL_HEAD + Process.myPid() + "/fd/" + fd;
        Logging.m88105d(TAG, "getContentFilePath is: ".concat(str));
        return str;
    }

    @CalledByNative
    public static AndroidContextInfo getContextInfo(Context context) {
        if (context == null) {
            Logging.m88113w(TAG, "fail to getContextInfo, context null");
            return null;
        }
        AndroidContextInfo androidContextInfo = new AndroidContextInfo();
        androidContextInfo.device = DeviceUtils.getDeviceId();
        androidContextInfo.configDir = getAppPrivateStorageDir(context);
        androidContextInfo.dataDir = context.getCacheDir().getAbsolutePath();
        androidContextInfo.pluginDir = context.getApplicationInfo().nativeLibraryDir;
        androidContextInfo.deviceInfo = DeviceUtils.getDeviceInfo();
        androidContextInfo.systemInfo = DeviceUtils.getSystemInfo();
        androidContextInfo.manufacturer = DeviceUtils.getManufacturer();
        androidContextInfo.pkgName = context.getPackageName();
        return androidContextInfo;
    }

    @CalledByNative
    public static int getCpuTemperature() {
        return DeviceUtils.getCpuTemperature();
    }

    @CalledByNative
    public static int[] getDisplayMetrics() {
        Display defaultDisplay;
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext == null) {
            return new int[]{0, 0};
        }
        WindowManager windowManager = (WindowManager) applicationContext.getSystemService(BLiveBottomPopupStyleTypeEnum.window);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (windowManager != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
            defaultDisplay.getRealMetrics(displayMetrics);
            Logging.m88105d(TAG, "getDisplayMetrics widthPixel: " + displayMetrics.heightPixels + " , heightPixel: " + displayMetrics.widthPixels);
            return new int[]{displayMetrics.widthPixels, displayMetrics.heightPixels};
        }
        return new int[]{0, 0};
    }

    @CalledByNative
    public static float[] getDisplayXYDpi() {
        Display defaultDisplay;
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext != null) {
            WindowManager windowManager = (WindowManager) applicationContext.getSystemService(BLiveBottomPopupStyleTypeEnum.window);
            DisplayMetrics displayMetrics = new DisplayMetrics();
            if (windowManager != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
                defaultDisplay.getRealMetrics(displayMetrics);
                Logging.m88105d(TAG, "getDisplayXYDpi xdpi: " + displayMetrics.xdpi + " , ydpi: " + displayMetrics.ydpi);
                return new float[]{displayMetrics.xdpi, displayMetrics.ydpi};
            }
        }
        return new float[]{0.0f, 0.0f};
    }

    @CalledByNative
    public static CommonUtility getInstance(Context context) {
        if (sInstance == null) {
            synchronized (CommonUtility.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new CommonUtility(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        sInstance.reference.getAndIncrement();
        return sInstance;
    }

    private static String getIpAddressByType(InetAddress inetAddress, boolean z, StringBuilder sb) {
        if (z && (inetAddress instanceof Inet4Address)) {
            String publicIpAddress = getPublicIpAddress(inetAddress);
            if (!TextUtils.isEmpty(publicIpAddress) && sb.length() == 0) {
                sb.append(publicIpAddress);
            }
            return publicIpAddress;
        }
        if (z || !(inetAddress instanceof Inet6Address)) {
            return null;
        }
        String publicIpAddress2 = getPublicIpAddress(inetAddress);
        if (!TextUtils.isEmpty(publicIpAddress2) && sb.length() == 0) {
            sb.append(publicIpAddress2);
        }
        return publicIpAddress2;
    }

    @CalledByNative
    public static String getLocalHost(boolean z) {
        try {
            ArrayList<NetworkInterface> list = Collections.list(NetworkInterface.getNetworkInterfaces());
            StringBuilder sb = new StringBuilder();
            for (NetworkInterface networkInterface : list) {
                if (!networkInterface.getName().startsWith("usb")) {
                    Iterator it = Collections.list(networkInterface.getInetAddresses()).iterator();
                    while (it.hasNext()) {
                        String ipAddressByType = getIpAddressByType((InetAddress) it.next(), z, sb);
                        if (!TextUtils.isEmpty(ipAddressByType)) {
                            return ipAddressByType;
                        }
                    }
                }
            }
            if (sb.length() > 0) {
                return sb.toString();
            }
            return null;
        } catch (Exception e) {
            Logging.m88114w(TAG, "fail to getLocalHost", e);
            return null;
        }
    }

    @CalledByNative
    public static String[] getLocalHostList() {
        try {
            ArrayList<NetworkInterface> list = Collections.list(NetworkInterface.getNetworkInterfaces());
            ArrayList arrayList = new ArrayList();
            for (NetworkInterface networkInterface : list) {
                String name = networkInterface.getName();
                if (!name.startsWith("usb")) {
                    Iterator it = Collections.list(networkInterface.getInetAddresses()).iterator();
                    while (it.hasNext()) {
                        String strInetAddressToIpAddress = inetAddressToIpAddress((InetAddress) it.next());
                        if (!TextUtils.isEmpty(strInetAddressToIpAddress)) {
                            arrayList.add(strInetAddressToIpAddress + Marker.ANY_NON_NULL_MARKER + name);
                        }
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            String[] strArr = new String[arrayList.size()];
            Iterator it2 = arrayList.iterator();
            int i = 0;
            while (it2.hasNext()) {
                strArr[i] = (String) it2.next();
                i++;
            }
            return strArr;
        } catch (Exception e) {
            Logging.m88114w(TAG, "fail to getLocalHostList", e);
            return null;
        }
    }

    private MediaNetworkInfo getNetworkInfo(Context context) {
        StringBuilder sb;
        MediaNetworkInfo mediaNetworkInfo = new MediaNetworkInfo();
        if (!checkAccessNetworkState(context)) {
            Logging.m88113w(TAG, "fail to getNetworkInfo, permission ACCESS_NETWORK_STATE not granted");
            return mediaNetworkInfo;
        }
        if (this.shouldGetIp) {
            this.lastLocalIp4 = getLocalHost(true);
            this.lastLocalIp6 = getLocalHost(false);
            this.shouldGetIp = false;
        }
        if (!TextUtils.isEmpty(this.lastLocalIp4)) {
            mediaNetworkInfo.localIp4 = this.lastLocalIp4;
        }
        if (!TextUtils.isEmpty(this.lastLocalIp6)) {
            mediaNetworkInfo.localIp6 = this.lastLocalIp6;
        }
        NetworkInfo networkInfo = Connectivity.getNetworkInfo(context);
        mediaNetworkInfo.networkType = Connectivity.getNetworkType(networkInfo);
        if (networkInfo != null) {
            mediaNetworkInfo.networkSubtype = networkInfo.getSubtype();
        }
        mediaNetworkInfo.dnsList = Connectivity.getDnsList();
        if (mediaNetworkInfo.networkType != 2) {
            AgoraPhoneStateListener agoraPhoneStateListener = this.mPhoneStateListener;
            if (agoraPhoneStateListener != null) {
                agoraPhoneStateListener.fillCellInfoIfPossible(context, mediaNetworkInfo);
                sb = new StringBuilder("networkType from Phone State Listener， rssi = ");
            }
            mediaNetworkInfo.ifconfigs = getVpnIfconfigs();
            return mediaNetworkInfo;
        }
        fillWifiInfoIfPossible(context, mediaNetworkInfo);
        sb = new StringBuilder("networkType from WIFI, rssi = ");
        sb.append(mediaNetworkInfo.rssi);
        sb.append(" level = ");
        sb.append(mediaNetworkInfo.signalLevel);
        Logging.m88105d(TAG, sb.toString());
        mediaNetworkInfo.ifconfigs = getVpnIfconfigs();
        return mediaNetworkInfo;
    }

    private static String getPublicIpAddress(InetAddress inetAddress) {
        if (inetAddress.isLoopbackAddress() || inetAddress.isLinkLocalAddress() || inetAddress.isAnyLocalAddress()) {
            return null;
        }
        return inetAddress.getHostAddress();
    }

    private int getRotationByDM() {
        Display display;
        DisplayManager displayManager = ContextUtils.getApplicationContext() != null ? (DisplayManager) ContextUtils.getApplicationContext().getSystemService(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION) : null;
        if (displayManager == null || (display = displayManager.getDisplay(0)) == null) {
            return -1;
        }
        return display.getRotation();
    }

    private int getRotationByWM() {
        Display defaultDisplay;
        WindowManager windowManager = ContextUtils.getApplicationContext() != null ? (WindowManager) ContextUtils.getApplicationContext().getSystemService(BLiveBottomPopupStyleTypeEnum.window) : null;
        if (windowManager == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) {
            return 0;
        }
        return defaultDisplay.getRotation();
    }

    private static String getSystemProperty(String str) throws Exception {
        Class<?> cls = Class.forName("android.os.SystemProperties");
        return (String) cls.getMethod("get", String.class).invoke(cls, str);
    }

    @CalledByNative
    public static Object getSystemService(Context context, String str) {
        return context.getSystemService(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String inetAddressToIpAddress(InetAddress inetAddress) {
        if (inetAddress.isLoopbackAddress() || !(inetAddress instanceof Inet4Address)) {
            return null;
        }
        return ((Inet4Address) inetAddress).getHostAddress();
    }

    private static InetAddress intToInetAddress(int i) {
        try {
            return InetAddress.getByAddress(new byte[]{(byte) (i & 255), (byte) ((i >> 8) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 24) & 255)});
        } catch (UnknownHostException unused) {
            return null;
        }
    }

    @CalledByNative
    public static boolean isAppInForeground() {
        final ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        Runnable runnable = new Runnable() { // from class: io.agora.utils2.internal.CommonUtility.8
            @Override // java.lang.Runnable
            public void run() {
                try {
                    ActivityManager.getMyMemoryState(runningAppProcessInfo);
                } catch (Exception e) {
                    Logging.m88109e(CommonUtility.TAG, "get App InForeground state failed.", e);
                }
                countDownLatch.countDown();
            }
        };
        if (mProcessInfoHandler == null) {
            HandlerThread handlerThread = new HandlerThread("processInfo");
            handlerThread.start();
            mProcessInfoHandler = new Handler(handlerThread.getLooper());
        }
        mProcessInfoHandler.post(runnable);
        if (ThreadUtils.awaitUninterruptibly(countDownLatch, 100L)) {
            int i = runningAppProcessInfo.importance;
            return i == 100 || i == 200;
        }
        Logging.m88108e(TAG, "get App InForeground state timeout.");
        mProcessInfoHandler.removeCallbacksAndMessages(null);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002a  */
    /* JADX WARN: Code duplicated, block: B:15:0x0035  */
    /* JADX WARN: Code duplicated, block: B:26:0x005f  */
    /* JADX WARN: Multi-variable type inference failed */
    @CalledByNative
    public static boolean isSimulator() {
        String str;
        boolean zContains;
        int i;
        int i2;
        try {
            str = Build.MANUFACTURER;
            try {
                zContains = str.toLowerCase().contains("netease");
                try {
                    Logging.m88105d(TAG, "manufacturer = ".concat(str));
                    i = zContains;
                } catch (Exception unused) {
                    Logging.m88108e(TAG, "get manufacturer info fail.");
                    i = zContains;
                }
            } catch (Exception unused2) {
                zContains = false;
                Logging.m88108e(TAG, "get manufacturer info fail.");
                i = zContains;
                i2 = i;
                if (isSimulatorProperty()) {
                    i2 = i + 1;
                }
                if (Build.VERSION.SDK_INT <= 28) {
                    return !"".toLowerCase().equals("unknown") ? true : true;
                }
                if ("nokia".equalsIgnoreCase(str)) {
                }
                return true;
                return false;
            }
        } catch (Exception unused3) {
            str = "";
        }
        i2 = i;
        if (isSimulatorProperty()) {
            i2 = i + 1;
        }
        if (Build.VERSION.SDK_INT <= 28) {
            if (("nokia".equalsIgnoreCase(str) || (!"Nokia_N1".equalsIgnoreCase(Build.DEVICE) && !"N1".equalsIgnoreCase(Build.MODEL))) && i2 > 0 && !str.toLowerCase().contains("welldo")) {
                return true;
            }
        } else if ((!"".toLowerCase().equals("unknown") || i2 > 0) && !str.toLowerCase().contains("welldo")) {
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0047  */
    /* JADX WARN: Code duplicated, block: B:22:0x0056  */
    /* JADX WARN: Code duplicated, block: B:27:0x0070  */
    /* JADX WARN: Code duplicated, block: B:34:0x008a  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:53:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:57:0x0111  */
    /* JADX WARN: Code duplicated, block: B:65:0x007a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x009b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x002f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    private static boolean isSimulatorProperty() {
        String systemProperty;
        int i;
        String property;
        String str;
        String systemProperty2;
        String systemProperty3;
        String systemProperty4 = "";
        String str2 = Build.MANUFACTURER;
        try {
            systemProperty = getSystemProperty("ro.hardware");
            try {
                if (systemProperty != null) {
                    try {
                        if (!systemProperty.toLowerCase().equals("intel")) {
                            i = 0;
                        }
                    } catch (Exception unused) {
                        Logging.m88108e(TAG, "get property hardware fail.");
                    }
                    property = System.getProperty("os.arch");
                    if (property == null) {
                        try {
                            if (property.toLowerCase().equals("i686") && !str2.toLowerCase().contains("asus")) {
                                i++;
                            }
                        } catch (Exception unused2) {
                            Logging.m88108e(TAG, "get property arch fail.");
                        }
                    } else {
                        i++;
                    }
                    if (Build.VERSION.SDK_INT > 28) {
                        if (systemProperty != null || systemProperty.toLowerCase().contains("ttvm") || systemProperty.toLowerCase().contains("nox")) {
                            i++;
                        }
                        try {
                            systemProperty3 = getSystemProperty("ro.build.flavor");
                            if (systemProperty3 == null) {
                                try {
                                    if (systemProperty3.contains("vbox") || systemProperty3.contains("sdk_gphone")) {
                                        i++;
                                    }
                                } catch (Exception unused3) {
                                    Logging.m88108e(TAG, "get property buildFlavor fail.");
                                }
                            } else {
                                i++;
                            }
                        } catch (Exception unused4) {
                            systemProperty3 = "";
                        }
                        try {
                            systemProperty2 = getSystemProperty("ro.product.board");
                            if (systemProperty2 == null) {
                                try {
                                    if (systemProperty2.contains("android") || systemProperty2.contains("goldfish")) {
                                        i++;
                                    }
                                } catch (Exception unused5) {
                                    Logging.m88108e(TAG, "get property productBoard fail.");
                                }
                            } else {
                                i++;
                            }
                        } catch (Exception unused6) {
                            systemProperty2 = "";
                        }
                        try {
                            systemProperty4 = getSystemProperty("ro.board.platform");
                            if (systemProperty4 != null || systemProperty4.contains("android")) {
                                i++;
                            }
                        } catch (Exception unused7) {
                            Logging.m88108e(TAG, "get property boardPlatform fail.");
                        }
                        str = systemProperty4;
                        systemProperty4 = systemProperty3;
                    } else {
                        str = "";
                        systemProperty2 = str;
                    }
                    Logging.m88105d(TAG, "suspectCount = " + i + ", hardware = " + systemProperty + ", arch = " + property + ", baseBandVersion = , buildFlavor = " + systemProperty4 + ", productBoard = " + systemProperty2 + ", boardPlatform = " + str + ", manufacturer = " + str2);
                    if (i > 0) {
                        return true;
                    }
                    return false;
                }
                property = System.getProperty("os.arch");
                if (property == null) {
                    i++;
                } else if (property.toLowerCase().equals("i686")) {
                    i++;
                }
            } catch (Exception unused8) {
                property = "";
            }
            i = 1;
        } catch (Exception unused9) {
            systemProperty = "";
        }
        if (Build.VERSION.SDK_INT > 28) {
            if (systemProperty != null) {
                i++;
            } else {
                i++;
            }
            systemProperty3 = getSystemProperty("ro.build.flavor");
            if (systemProperty3 == null) {
                i++;
            } else if (systemProperty3.contains("vbox")) {
                i++;
            } else {
                i++;
            }
            systemProperty2 = getSystemProperty("ro.product.board");
            if (systemProperty2 == null) {
                i++;
            } else if (systemProperty2.contains("android")) {
                i++;
            } else {
                i++;
            }
            systemProperty4 = getSystemProperty("ro.board.platform");
            if (systemProperty4 != null) {
                i++;
            } else {
                i++;
            }
            str = systemProperty4;
            systemProperty4 = systemProperty3;
        } else {
            str = "";
            systemProperty2 = str;
        }
        Logging.m88105d(TAG, "suspectCount = " + i + ", hardware = " + systemProperty + ", arch = " + property + ", baseBandVersion = , buildFlavor = " + systemProperty4 + ", productBoard = " + systemProperty2 + ", boardPlatform = " + str + ", manufacturer = " + str2);
        if (i > 0) {
            return true;
        }
        return false;
    }

    @CalledByNative
    public static int isSpeakerphoneEnabled(Context context) {
        if (context != null) {
            return ((AudioManager) context.getSystemService("audio")).isSpeakerphoneOn() ? 1 : 0;
        }
        Logging.m88113w(TAG, "fail to isSpeakerphoneEnabled, context null");
        return -1;
    }

    private void monitorOrientationChange(Context context, boolean z) {
        if (z) {
            enableDisplayListener(context);
            regiseterBroadcaster(context);
        } else {
            disableDisplayListener();
            unregisterBroadcaster(context);
        }
    }

    private void regiseterBroadcaster(Context context) {
        if (context != null && this.mOrientationObserver == null) {
            this.mOrientationObserver = new BroadcastReceiver() { // from class: io.agora.utils2.internal.CommonUtility.11
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context2, Intent intent) {
                    if (intent.getAction().equals("android.intent.action.CONFIGURATION_CHANGED")) {
                        CommonUtility.this.updateOrientationManual();
                    }
                }
            };
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.CONFIGURATION_CHANGED");
            jj5.m145018l(context, this.mOrientationObserver, intentFilter);
            Logging.m88105d(TAG, "[regiseterBroadcaster] done!");
        }
    }

    @CalledByNative
    public static int safeLoadLibrary(String str) {
        if (TextUtils.isEmpty(str)) {
            return -2;
        }
        try {
            System.loadLibrary(str);
            return 0;
        } catch (NullPointerException | SecurityException | Exception | UnsatisfiedLinkError unused) {
            return -1;
        }
    }

    public static void setIgnoreMonitor(boolean z) {
        ignoreMonitor = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopMonitor() {
        Logging.m88105d(TAG, "stopMonitor()");
        Context context = this.mContext.get();
        if (context == null) {
            return;
        }
        try {
            if (this.mPhoneStateListener != null) {
                ((TelephonyManager) context.getSystemService("phone")).listen(this.mPhoneStateListener, 0);
                this.mPhoneStateListener = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            if (this.mobileNetworkCallback != null) {
                ((ConnectivityManager) context.getSystemService("connectivity")).unregisterNetworkCallback(this.mobileNetworkCallback);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        try {
            ConnectionChangeBroadcastReceiver connectionChangeBroadcastReceiver = this.mConnectionBroadcastReceiver;
            if (connectionChangeBroadcastReceiver != null) {
                context.unregisterReceiver(connectionChangeBroadcastReceiver);
                this.mConnectionBroadcastReceiver = null;
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        try {
            PowerChangeReceiver powerChangeReceiver = this.mPowerChangeReceiver;
            if (powerChangeReceiver != null) {
                context.unregisterReceiver(powerChangeReceiver);
                this.mPowerChangeReceiver = null;
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        try {
            if (this.mProcessLifecycleOwner != null) {
                ((Application) context.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.mProcessLifecycleOwner);
                this.mProcessLifecycleOwner = null;
            }
        } catch (Exception e5) {
            Logging.m88109e(TAG, "unregister ProcessLifecycleOwner failed ", e5);
        }
        try {
            monitorOrientationChange(context, false);
        } catch (Exception e6) {
            Logging.m88109e(TAG, "Unable to monitorOrientationChange, ", e6);
        }
        closeGravityMonitor();
    }

    private void unregisterBroadcaster(Context context) {
        BroadcastReceiver broadcastReceiver;
        if (context == null || (broadcastReceiver = this.mOrientationObserver) == null) {
            return;
        }
        context.unregisterReceiver(broadcastReceiver);
        Logging.m88105d(TAG, "[unregisterBroadcaster] done!");
    }

    @CalledByNative
    public int VPNBehindAddress() {
        Context context = this.mContext.get();
        if (context == null) {
            return 1;
        }
        return Connectivity.VPNBehindAddress(context);
    }

    @CalledByNative
    public void bindSocket2Network(final int i, String str) {
        final ConnectivityManager connectivityManager = (ConnectivityManager) this.mContext.get().getSystemService("connectivity");
        NetworkRequest networkRequestBuild = new NetworkRequest.Builder().addTransportType(0).build();
        final String string = str.toString();
        ConnectivityManager.NetworkCallback networkCallback = this.mobileNetworkCallback;
        if (networkCallback != null) {
            connectivityManager.unregisterNetworkCallback(networkCallback);
        }
        ConnectivityManager.NetworkCallback networkCallback2 = new ConnectivityManager.NetworkCallback() { // from class: io.agora.utils2.internal.CommonUtility.6
            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                LinkProperties linkProperties = connectivityManager.getLinkProperties(network);
                if (linkProperties == null || linkProperties.getLinkAddresses().isEmpty()) {
                    Logging.m88108e(CommonUtility.TAG, "onAvailable: prop is null or empty!");
                    return;
                }
                String strInetAddressToIpAddress = CommonUtility.inetAddressToIpAddress(linkProperties.getLinkAddresses().get(0).getAddress());
                if (strInetAddressToIpAddress == null || !strInetAddressToIpAddress.equals(string)) {
                    return;
                }
                Logging.m88105d(CommonUtility.TAG, "start bindSocket2Network");
                Logging.m88105d(CommonUtility.TAG, "addressInner" + string);
                FileDescriptor fileDescriptor = new FileDescriptor();
                try {
                    Field declaredField = FileDescriptor.class.getDeclaredField("descriptor");
                    declaredField.setAccessible(true);
                    declaredField.setInt(fileDescriptor, i);
                    network.bindSocket(fileDescriptor);
                    this.notifyAddressBound(string);
                    Logging.m88105d(CommonUtility.TAG, "bindSocket2Network success: network" + network + "+socketfd" + i);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        this.mobileNetworkCallback = networkCallback2;
        try {
            connectivityManager.requestNetwork(networkRequestBuild, networkCallback2);
        } catch (Exception e) {
            this.mobileNetworkCallback = null;
            Logging.m88108e(TAG, "requestNetwork failed " + e.toString());
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0012 A[PHI: r1
      0x0012: PHI (r1v2 int) = (r1v0 int), (r1v3 int), (r1v4 int) binds: [B:10:0x0010, B:24:0x0030, B:17:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x0015  */
    /* JADX WARN: Code duplicated, block: B:19:0x0024  */
    /* JADX WARN: Code duplicated, block: B:21:0x0028  */
    /* JADX WARN: Code duplicated, block: B:28:0x0037  */
    public int checkOrientation(int i) {
        int i2;
        if (i == -1) {
            return -1;
        }
        if (i > 340 || i < 20) {
            i2 = 270;
            if (this.mLastOrientation != 270) {
                this.mLastOrientation = i2;
            } else if (i > 70 || i >= 110) {
                if (i > 160 && i < 200) {
                    i2 = 90;
                    if (this.mLastOrientation != 90) {
                        this.mLastOrientation = i2;
                    }
                }
                if (i > 250 && i < 290 && this.mLastOrientation != 0) {
                    this.mLastOrientation = 0;
                }
            } else {
                i2 = 180;
                if (this.mLastOrientation != 180) {
                    this.mLastOrientation = i2;
                } else {
                    if (i > 160) {
                        i2 = 90;
                        if (this.mLastOrientation != 90) {
                            this.mLastOrientation = i2;
                        }
                    }
                    if (i > 250) {
                        this.mLastOrientation = 0;
                    }
                }
            }
        } else if (i > 70) {
            if (i > 160) {
                i2 = 90;
                if (this.mLastOrientation != 90) {
                    this.mLastOrientation = i2;
                }
            }
            if (i > 250) {
                this.mLastOrientation = 0;
            }
        } else {
            if (i > 160) {
                i2 = 90;
                if (this.mLastOrientation != 90) {
                    this.mLastOrientation = i2;
                }
            }
            if (i > 250) {
                this.mLastOrientation = 0;
            }
        }
        synchronized (this) {
            try {
                Iterator<SystemEventListener> it = this.systemEventListeners.iterator();
                while (it.hasNext()) {
                    it.next().onGravityOriChange(this.mLastOrientation);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.mLastOrientation;
    }

    @CalledByNative
    public int closeGravityMonitor() {
        if (this.mContext.get() == null) {
            return -1;
        }
        try {
            OrientationEventListener orientationEventListener = this.mOrientationListener;
            if (orientationEventListener == null) {
                Logging.m88108e(TAG, "[closeGravityMonitor] mOrientationListener is null!");
                return -1;
            }
            orientationEventListener.disable();
            this.mOrientationListener = null;
            Logging.m88105d(TAG, "[closeGravityMonitor] done!");
            return 0;
        } catch (Exception e) {
            Logging.m88109e(TAG, "Unable to close OrientationEventListener, ", e);
        }
    }

    @CalledByNative
    public void dispose() {
        if (sInstance == null || sInstance.reference.decrementAndGet() > 0) {
            return;
        }
        this.mThreadChecker.checkIsOnValidThread();
        if (this.mDisposed) {
            return;
        }
        this.mDisposed = true;
        Logging.m88105d(TAG, "dispose()");
        this.mHandler.post(new Runnable() { // from class: io.agora.utils2.internal.CommonUtility.3
            @Override // java.lang.Runnable
            public void run() {
                CommonUtility.this.stopMonitor();
            }
        });
        Handler handler = mProcessInfoHandler;
        if (handler != null) {
            handler.post(new Runnable() { // from class: io.agora.utils2.internal.CommonUtility.4
                @Override // java.lang.Runnable
                public void run() {
                    CommonUtility.mProcessInfoHandler.getLooper().quit();
                    Handler unused = CommonUtility.mProcessInfoHandler = null;
                }
            });
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        this.mHandler.post(new Runnable() { // from class: io.agora.utils2.internal.CommonUtility.5
            @Override // java.lang.Runnable
            public void run() {
                countDownLatch.countDown();
                CommonUtility.this.mHandler.getLooper().quit();
            }
        });
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Listener listener = this.mListener;
        if (listener != null) {
            listener.onDispose();
        }
        synchronized (this) {
            this.systemEventListeners.clear();
        }
        synchronized (CommonUtility.class) {
            sInstance = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00b4 A[Catch: IOException -> 0x00b0, TRY_LEAVE, TryCatch #4 {IOException -> 0x00b0, blocks: (B:45:0x00ac, B:49:0x00b4), top: B:76:0x00ac }] */
    /* JADX WARN: Code duplicated, block: B:61:0x00cd A[Catch: IOException -> 0x00c9, TRY_LEAVE, TryCatch #6 {IOException -> 0x00c9, blocks: (B:57:0x00c5, B:61:0x00cd), top: B:80:0x00c5 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x00df A[Catch: IOException -> 0x00db, TRY_LEAVE, TryCatch #14 {IOException -> 0x00db, blocks: (B:66:0x00d7, B:70:0x00df), top: B:85:0x00d7 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.io.FileOutputStream] */
    @CalledByNative
    public String getAssetsCacheFile(Context context, String str, String str2) throws Throwable {
        ?? r5;
        InputStream inputStream;
        FileOutputStream fileOutputStream;
        InputStream inputStream2;
        FileOutputStream fileOutputStream2;
        Logging.m88105d(TAG, "getAssetsCacheFile filePath: " + str);
        boolean zStartsWith = str.startsWith(PREFIX_URI);
        File file = new File(context.getCacheDir(), str2);
        InputStream inputStream3 = null;
        try {
            if (file.exists()) {
                file.delete();
            }
            try {
                try {
                    InputStream fileInputStream = zStartsWith ? new FileInputStream(context.getContentResolver().openFileDescriptor(Uri.parse(str), "r").getFileDescriptor()) : context.getAssets().open(str);
                    try {
                        FileOutputStream fileOutputStream3 = new FileOutputStream(file);
                        try {
                            byte[] bArr = new byte[1024];
                            while (true) {
                                int i = fileInputStream.read(bArr);
                                if (i > 0) {
                                    fileOutputStream3.write(bArr, 0, i);
                                } else {
                                    try {
                                        break;
                                    } catch (IOException e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                            fileInputStream.close();
                            fileOutputStream3.close();
                            return file.getAbsolutePath();
                        } catch (IOException e2) {
                            inputStream2 = fileInputStream;
                            e = e2;
                            fileOutputStream2 = fileOutputStream3;
                            e.printStackTrace();
                            if (inputStream2 != null) {
                                try {
                                    inputStream2.close();
                                    if (fileOutputStream2 != null) {
                                        fileOutputStream2.close();
                                    }
                                } catch (IOException e3) {
                                    e3.printStackTrace();
                                    return null;
                                }
                            } else if (fileOutputStream2 != null) {
                                fileOutputStream2.close();
                            }
                            return null;
                        } catch (SecurityException e4) {
                            inputStream = fileInputStream;
                            e = e4;
                            fileOutputStream = fileOutputStream3;
                            e.printStackTrace();
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                    if (fileOutputStream != null) {
                                        fileOutputStream.close();
                                    }
                                } catch (IOException e5) {
                                    e5.printStackTrace();
                                    return null;
                                }
                            } else if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            return null;
                        } catch (Throwable th) {
                            inputStream3 = fileInputStream;
                            th = th;
                            r5 = fileOutputStream3;
                            if (inputStream3 != null) {
                                try {
                                    inputStream3.close();
                                    if (r5 != 0) {
                                        r5.close();
                                    }
                                } catch (IOException e6) {
                                    e6.printStackTrace();
                                    throw th;
                                }
                            } else if (r5 != 0) {
                                r5.close();
                            }
                            throw th;
                        }
                    } catch (IOException e7) {
                        inputStream2 = fileInputStream;
                        e = e7;
                        fileOutputStream2 = null;
                    } catch (SecurityException e8) {
                        inputStream = fileInputStream;
                        e = e8;
                        fileOutputStream = null;
                    } catch (Throwable th2) {
                        inputStream3 = fileInputStream;
                        th = th2;
                        r5 = 0;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    inputStream3 = context;
                    r5 = str;
                }
            } catch (IOException e9) {
                e = e9;
                inputStream2 = null;
                fileOutputStream2 = null;
            } catch (SecurityException e10) {
                e = e10;
                inputStream = null;
                fileOutputStream = null;
            } catch (Throwable th4) {
                th = th4;
                r5 = 0;
            }
        } catch (SecurityException e11) {
            e11.printStackTrace();
            return null;
        }
    }

    @CalledByNative
    public int getBatteryLifePercent() {
        if (this.mContext.get() != null) {
            return this.mBatteryPercentage;
        }
        return 255;
    }

    @CalledByNative
    public int getDisplayRotation() {
        if (!this.mUpdateRotationTrigger && this.lastOrientation != -1) {
            return this.lastOrientation;
        }
        int rotationByDM = getRotationByDM();
        if (rotationByDM < 0) {
            rotationByDM = getRotationByWM();
        }
        this.lastOrientation = rotationByDM;
        return rotationByDM;
    }

    @VisibleForTesting
    public Handler getHandler() {
        return this.mHandler;
    }

    @CalledByNative
    public int getNetworkType() {
        Context context = this.mContext.get();
        if (context == null) {
            return -1;
        }
        if (checkAccessNetworkState(context)) {
            return Connectivity.getNetworkType(context);
        }
        Logging.m88113w(TAG, "fail to getNetworkType, permission ACCESS_NETWORK_STATE not granted");
        return -1;
    }

    @VisibleForTesting
    public ProcessLifecycleOwner getProcessLifecycleOwner() {
        return this.mProcessLifecycleOwner;
    }

    @CalledByNative
    public String getRealFilePath(Context context, String str) throws Throwable {
        String contentFilePath;
        if (context == null || TextUtils.isEmpty(str)) {
            Logging.m88108e(TAG, "getRealFilePath failed for init error");
            return "";
        }
        if (str.startsWith("/assets/")) {
            contentFilePath = getAssetsFilePath(context, str);
        } else {
            contentFilePath = str.startsWith(PREFIX_URI) ? getContentFilePath(context, Uri.parse(str)) : null;
        }
        return contentFilePath != null ? contentFilePath : "";
    }

    public ArrayList<String> getVpnIfconfigs() {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            Iterator it = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
            while (it.hasNext()) {
                String name = ((NetworkInterface) it.next()).getName();
                if (name.contains("tun") || name.contains("ppp") || name.contains("ipsec") || name.contains("tap")) {
                    arrayList.add(name);
                }
            }
            return arrayList;
        } catch (Exception e) {
            Logging.m88109e(TAG, "Fail to get network interfaces array list. ", e);
            return arrayList;
        }
    }

    public void notifyAddressBound(String str) {
        synchronized (this) {
            try {
                Iterator<SystemEventListener> it = this.systemEventListeners.iterator();
                while (it.hasNext()) {
                    it.next().onAddressBound(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void onAudioRoutingPhoneChanged(boolean z, int i, int i2) {
        if (this.mDisposed) {
            return;
        }
        Logging.m88105d(TAG, "onAudioRoutingPhoneChanged() enableAudio:" + z + ", event:" + i + ", arg: " + i2);
        synchronized (this) {
            try {
                for (SystemEventListener systemEventListener : this.systemEventListeners) {
                    systemEventListener.getClass();
                    systemEventListener.onAudioRoutingPhoneChanged(z, i, i2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Listener listener = this.mListener;
        if (listener != null) {
            listener.onAudioRoutingPhoneChanged(z, i, i2);
        }
    }

    public void onForegroundChanged(boolean z) {
        if (this.mDisposed) {
            return;
        }
        Listener listener = this.mListener;
        if (listener != null) {
            listener.onForegroundChanged(z);
        }
        synchronized (this) {
            try {
                Iterator<SystemEventListener> it = this.systemEventListeners.iterator();
                while (it.hasNext()) {
                    it.next().onForegroundChanged(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void onNetworkChange() {
        if (this.mDisposed) {
            return;
        }
        this.shouldGetIp = true;
        Logging.m88105d(TAG, "onNetworkChange()");
        MediaNetworkInfo networkInfo = getNetworkInfo(this.mContext.get());
        synchronized (this) {
            try {
                for (SystemEventListener systemEventListener : this.systemEventListeners) {
                    systemEventListener.getClass();
                    systemEventListener.onNetworkChange(networkInfo);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Listener listener = this.mListener;
        if (listener != null) {
            listener.onNetworkChange(networkInfo);
        }
    }

    public void onPowerChange(int i) {
        Logging.m88105d(TAG, "onPowerChange() " + i);
        this.mBatteryPercentage = i;
    }

    @CalledByNative
    public void registerSystemEventListener(SystemEventListener systemEventListener) {
        systemEventListener.getClass();
        synchronized (this) {
            try {
                if (!this.systemEventListeners.contains(systemEventListener)) {
                    this.systemEventListeners.add(systemEventListener);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @VisibleForTesting
    public void setExtraConnectionActionForTesting(String str) {
        this.mExtraConnectivityFilterActionForTesting = str;
    }

    @VisibleForTesting
    public void setListener(Listener listener) {
        this.mListener = listener;
    }

    @CalledByNative
    public int setupGravityMonitor() {
        Context context = this.mContext.get();
        if (context == null) {
            return -1;
        }
        try {
            if (this.mOrientationListener == null) {
                this.mOrientationListener = new OrientationEventListener(context, 2) { // from class: io.agora.utils2.internal.CommonUtility.7
                    @Override // android.view.OrientationEventListener
                    public void onOrientationChanged(int i) {
                        if (i == -1) {
                            return;
                        }
                        CommonUtility.this.checkOrientation(i);
                    }
                };
            }
            this.mOrientationListener.enable();
            Logging.m88105d(TAG, "[setupGravityMonitor] done!");
        } catch (Exception e) {
            Logging.m88109e(TAG, "Unable to create OrientationEventListener, ", e);
        }
        return -1;
    }

    public void startMonitor() {
        Logging.m88105d(TAG, "startMonitor()");
        if (ignoreMonitor) {
            Logging.m88108e(TAG, "ignoreMonitor in simulator, just for ut");
            return;
        }
        Context context = this.mContext.get();
        if (context == null) {
            return;
        }
        try {
            this.mPhoneStateListener = new AgoraPhoneStateListener(this, this.mHandler);
            ((TelephonyManager) context.getSystemService("phone")).listen(this.mPhoneStateListener, 288);
        } catch (Exception e) {
            Logging.m88109e(TAG, "Unable to create PhoneStateListener, ", e);
        }
        try {
            ConnectionChangeBroadcastReceiver connectionChangeBroadcastReceiver = new ConnectionChangeBroadcastReceiver(this);
            this.mConnectionBroadcastReceiver = connectionChangeBroadcastReceiver;
            jj5.m145018l(context, connectionChangeBroadcastReceiver, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            if (!TextUtils.isEmpty(this.mExtraConnectivityFilterActionForTesting)) {
                jj5.m145018l(context, this.mConnectionBroadcastReceiver, new IntentFilter(this.mExtraConnectivityFilterActionForTesting));
            }
        } catch (Exception e2) {
            Logging.m88109e(TAG, "Unable to create ConnectionChangeBroadcastReceiver, ", e2);
        }
        try {
            this.mPowerChangeReceiver = new PowerChangeReceiver(this);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
            jj5.m145018l(context, this.mPowerChangeReceiver, intentFilter);
        } catch (Exception e3) {
            Logging.m88109e(TAG, "Unable to create PowerChangeReceiver, ", e3);
        }
        try {
            this.mProcessLifecycleOwner = new ProcessLifecycleOwner(isAppInForeground(), this);
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(this.mProcessLifecycleOwner);
        } catch (Exception e4) {
            Logging.m88109e(TAG, "Unable to registerActivityLifecycleCallbacks, ", e4);
        }
        try {
            monitorOrientationChange(context, true);
        } catch (Exception e5) {
            Logging.m88109e(TAG, "Unable to monitorOrientationChange, ", e5);
        }
    }

    @CalledByNative
    public void unregisterSystemEventListener(SystemEventListener systemEventListener) {
        if (systemEventListener == null) {
            return;
        }
        synchronized (this) {
            try {
                if (this.systemEventListeners.contains(systemEventListener)) {
                    this.systemEventListeners.remove(systemEventListener);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void updateOrientationManual() {
        if (this.mHandler == null || this.mDisposed) {
            return;
        }
        this.mUpdateRotationTrigger = true;
        this.mHandler.postDelayed(this.rotationRunnable, 200L);
    }

    private CommonUtility(Context context, long j) {
        Logging.m88105d(TAG, "constructor()");
        this.mContext = new WeakReference<>(context);
        this.mThreadChecker = new ThreadUtils.ThreadChecker();
        HandlerThread handlerThread = new HandlerThread("UtilityThread");
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.mHandler = handler;
        handler.post(new Runnable() { // from class: io.agora.utils2.internal.CommonUtility.2
            @Override // java.lang.Runnable
            public void run() {
                CommonUtility.this.startMonitor();
            }
        });
    }

    @CalledByNative
    public MediaNetworkInfo getNetworkInfo() {
        Context context = this.mContext.get();
        if (context != null) {
            return getNetworkInfo(context);
        }
        return null;
    }
}
