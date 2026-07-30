package com.p006ss.bytertc.audio.device.router;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothClass;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.usb.UsbConfiguration;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbInterface;
import android.hardware.usb.UsbManager;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.bytedance.realx.base.RXLogging;
import com.p000p1.mobile.putong.data.Channel;
import com.p000p1.mobile.putong.data.Device;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import l.e16;
import l.ii5;
import p007l.vc1;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class AudioRouteDeviceManager extends BroadcastReceiver {
    private static final String ACTION_BT_A2DP_CONNECTION_STATE_CHANGED = "android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED";
    private static final String ACTION_BT_HEADSET_CONNECTION_STATE_CHANGED = "android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED";
    private static final String ACTION_BT_SCO_AUDIO_STATE_UPDATED = "android.media.ACTION_SCO_AUDIO_STATE_UPDATED";
    private static final String ACTION_BT_STATE_CHANGED = "android.bluetooth.adapter.action.STATE_CHANGED";
    private static final String ACTION_HEADSET_PLUG = "android.intent.action.HEADSET_PLUG";
    private static final String ACTION_USB_DEVICE_ATTACHED = "android.hardware.usb.action.USB_DEVICE_ATTACHED";
    private static final String ACTION_USB_DEVICE_DETACHED = "android.hardware.usb.action.USB_DEVICE_DETACHED";
    private static final int BLUETOOTH_SCO_CONNECT_CHECK_MAX_RETRY_TIMES = 3;
    private static final int BLUETOOTH_SCO_CONNECT_CHECK_TIME_GAP = 3000;
    private static final int BLUETOOTH_SCO_DISCONNECT_CHECK_TIME_GAP = 6000;
    private static final int BLUETOOTH_SCO_RESTART_MAX_TIMES = 3;
    private static final int BLUETOOTH_SCO_RESTART_TIME_GAP = 3000;
    private static final String TAG = "AudioRouteDeviceManager";
    private BluetoothAdapter mBluetoothAdapter;
    private MyBluetoothDevice mBluetoothDevice;
    private AudioDeviceCallback mBluetoothDeviceCallback;
    private IAudioRouteCallback mCallback;
    private Handler mHandler;
    private IntentFilter mIntentFilter;
    private UsbDevice mUsbHeadsetDevice;
    private String mWiredHeadsetDevice;
    private volatile boolean registered = false;
    private int mInitDeviceState = 0;
    private int mBluetoothScoConnectCheckTimes = -1;
    private int mBluetoothScoRestartTimes = 0;
    private boolean mScoHasStarted = false;
    private String mBluetoothPermissionDesp = "NULL";

    @RoutingDeviceType
    private int currentRouting = -1;
    private boolean mEnableUseAudioDeviceCallback = false;
    private boolean mUseAudioDeviceCallback = false;
    private final Object bluetoothLock = new Object();

    public class BluetoothConnectCallback extends AudioDeviceCallback {
        private BluetoothConnectCallback() {
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
            String attrsString;
            String attrsString2;
            for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                if (!audioDeviceInfo.isSource()) {
                    int type = audioDeviceInfo.getType();
                    if (type == 7 && AudioRouteDeviceManager.this.mCallback != null) {
                        String string = audioDeviceInfo.getProductName().toString();
                        RXLogging.w(AudioRouteDeviceManager.TAG, "AudioRouteDeviceManager: addedDevices: " + type + ", name: " + string);
                        synchronized (AudioRouteDeviceManager.this.bluetoothLock) {
                            try {
                                if (AudioRouteDeviceManager.this.mBluetoothDevice == null) {
                                    AudioRouteDeviceManager audioRouteDeviceManager = AudioRouteDeviceManager.this;
                                    audioRouteDeviceManager.mBluetoothDevice = audioRouteDeviceManager.new MyBluetoothDevice("bluetooth-headset");
                                }
                                AudioRouteDeviceManager.this.mBluetoothDevice.appendDeviceInfo("callback", "[device:" + string + "] ");
                                AudioRouteDeviceManager.this.mBluetoothDevice.setBluetoothConnected(1, true);
                                attrsString2 = AudioRouteDeviceManager.this.mBluetoothDevice.getAttrsString();
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        AudioRouteDeviceManager.this.mBluetoothScoRestartTimes = 0;
                        AudioRouteDeviceManager.this.mCallback.onDeviceEvent(8, true, attrsString2);
                    } else if (type == 8 && AudioRouteDeviceManager.this.mCallback != null) {
                        String string2 = audioDeviceInfo.getProductName().toString();
                        RXLogging.w(AudioRouteDeviceManager.TAG, "AudioRouteDeviceManager: addedDevices: " + type + ", name: " + string2);
                        synchronized (AudioRouteDeviceManager.this.bluetoothLock) {
                            try {
                                if (AudioRouteDeviceManager.this.mBluetoothDevice == null) {
                                    AudioRouteDeviceManager audioRouteDeviceManager2 = AudioRouteDeviceManager.this;
                                    audioRouteDeviceManager2.mBluetoothDevice = audioRouteDeviceManager2.new MyBluetoothDevice("bluetooth-headset");
                                }
                                AudioRouteDeviceManager.this.mBluetoothDevice.appendDeviceInfo("callback", "[device:" + string2 + "] ");
                                AudioRouteDeviceManager.this.mBluetoothDevice.setBluetoothConnected(2, true);
                                attrsString = AudioRouteDeviceManager.this.mBluetoothDevice.getAttrsString();
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        AudioRouteDeviceManager.this.mCallback.onDeviceEvent(16, true, attrsString);
                    }
                }
            }
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
            for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                if (!audioDeviceInfo.isSource()) {
                    int type = audioDeviceInfo.getType();
                    if (type == 7 && AudioRouteDeviceManager.this.mCallback != null) {
                        RXLogging.w(AudioRouteDeviceManager.TAG, "AudioRouteDeviceManager: removedDevices: " + type + ", name: " + ((Object) audioDeviceInfo.getProductName()));
                        String attrsString = "";
                        synchronized (AudioRouteDeviceManager.this.bluetoothLock) {
                            try {
                                if (AudioRouteDeviceManager.this.mBluetoothDevice != null) {
                                    AudioRouteDeviceManager.this.mBluetoothDevice.setBluetoothConnected(1, false);
                                    attrsString = AudioRouteDeviceManager.this.mBluetoothDevice.getAttrsString();
                                    if (!AudioRouteDeviceManager.this.mBluetoothDevice.getBluetoothConnected(1) && !AudioRouteDeviceManager.this.mBluetoothDevice.getBluetoothConnected(2)) {
                                        RXLogging.w(AudioRouteDeviceManager.TAG, "AudioRouteDeviceManager: destroy mBluetoothDevice due to headset & a2dp disconncected");
                                        AudioRouteDeviceManager.this.mBluetoothDevice = null;
                                    }
                                }
                                AudioRouteDeviceManager.this.mBluetoothDevice = null;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        AudioRouteDeviceManager.this.mCallback.onDeviceEvent(8, false, attrsString);
                        return;
                    }
                    if (type == 8 && AudioRouteDeviceManager.this.mCallback != null) {
                        RXLogging.w(AudioRouteDeviceManager.TAG, "AudioRouteDeviceManager: removedDevices: " + type + ", name: " + ((Object) audioDeviceInfo.getProductName()));
                        String attrsString2 = "";
                        synchronized (AudioRouteDeviceManager.this.bluetoothLock) {
                            try {
                                if (AudioRouteDeviceManager.this.mBluetoothDevice != null) {
                                    AudioRouteDeviceManager.this.mBluetoothDevice.setBluetoothConnected(2, false);
                                    attrsString2 = AudioRouteDeviceManager.this.mBluetoothDevice.getAttrsString();
                                    if (!AudioRouteDeviceManager.this.mBluetoothDevice.getBluetoothConnected(1) && !AudioRouteDeviceManager.this.mBluetoothDevice.getBluetoothConnected(2)) {
                                        RXLogging.w(AudioRouteDeviceManager.TAG, "AudioRouteDeviceManager: destroy mBluetoothDevice due to headset & a2dp disconncected");
                                        AudioRouteDeviceManager.this.mBluetoothDevice = null;
                                    }
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        AudioRouteDeviceManager.this.mCallback.onDeviceEvent(16, false, attrsString2);
                        return;
                    }
                }
            }
        }
    }

    public @interface RoutingDeviceType {
        public static final int BLUETOOTH_A2DP = 16;
        public static final int BLUETOOTH_HEADSET = 8;
        public static final int BLUETOOTH_SCO = 64;
        public static final int BUILT_IN_EARPIECE = 1;
        public static final int BUILT_IN_SPEAKER = 2;
        public static final int UNKNOWN = -1;
        public static final int USB_HEADSET = 32;
        public static final int WIRED_HEADSET = 4;
    }

    public AudioRouteDeviceManager(IAudioRouteCallback iAudioRouteCallback) {
        this.mCallback = iAudioRouteCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bluetoothScoConnectionCheck() {
        if (this.mCallback == null) {
            return;
        }
        Context context = AudioRouteUtil.getContext();
        if (context == null) {
            RXLogging.e(TAG, "AudioRouteDeviceManager: bluetoothScoConnectionCheck failed. Context is null.");
            return;
        }
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            RXLogging.e(TAG, "AudioRouteDeviceManager: bluetoothScoConnectionCheck failed. AudioManager is null.");
            return;
        }
        if (this.mBluetoothScoConnectCheckTimes >= 3) {
            if (this.mScoHasStarted) {
                stopSystemBluetoothSco(audioManager);
            }
            RXLogging.e(TAG, "AudioRouteDeviceManager: bluetoothScoConnectionCheck timeout, time: " + this.mBluetoothScoConnectCheckTimes);
            this.mBluetoothScoConnectCheckTimes = -1;
            this.mHandler.removeCallbacks(new vc1(this));
            this.mCallback.onError(AudioRouteController.EVENT_SCO_FAILED_FORCE_TO_MEDIA_MODE, "change to normal mode due to sco started timeout");
            return;
        }
        if (audioManager.isBluetoothScoOn()) {
            RXLogging.e(TAG, "AudioRouteDeviceManager: bluetoothScoConnectionCheck success.");
            this.mBluetoothScoConnectCheckTimes = -1;
            this.mHandler.removeCallbacks(new vc1(this));
            return;
        }
        this.mBluetoothScoConnectCheckTimes++;
        RXLogging.e(TAG, "AudioRouteDeviceManager: bluetoothScoConnectionCheck failed. retry again, time: " + this.mBluetoothScoConnectCheckTimes);
        startSystemBluetoothSco(audioManager);
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.postDelayed(new vc1(this), 3000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bluetoothScoDisconnectionForNormalMode() {
        Context context = AudioRouteUtil.getContext();
        if (context == null) {
            RXLogging.e(TAG, "AudioRouteDeviceManager: bluetoothScoDisconnectionForNormalMode failed. Context is null.");
            return;
        }
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            RXLogging.e(TAG, "AudioRouteDeviceManager: bluetoothScoDisconnectionForNormalMode failed. AudioManager is null.");
            return;
        }
        int mode = audioManager.getMode();
        boolean zIsBluetoothScoOn = audioManager.isBluetoothScoOn();
        RXLogging.e(TAG, "AudioRouteDeviceManager: bluetoothScoDisconnectionForNormalMode mode(" + mode + "), bluetoothScoOn(" + zIsBluetoothScoOn + ")");
        if (mode == 0) {
            if (zIsBluetoothScoOn || this.mScoHasStarted) {
                stopSystemBluetoothSco(audioManager);
            }
        }
    }

    private boolean bluetoothScoIsStarting() {
        return this.mHandler != null && this.mBluetoothScoConnectCheckTimes >= 0;
    }

    @SuppressLint({"WrongConstant"})
    private boolean checkPermission() {
        Context context = AudioRouteUtil.getContext();
        if (context == null) {
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        int i2 = context.getApplicationInfo().targetSdkVersion;
        if (i2 >= 23) {
            this.mUseAudioDeviceCallback = this.mEnableUseAudioDeviceCallback;
            RXLogging.w(TAG, "AudioRouteDeviceManager: mUseAudioDeviceCallback: " + this.mUseAudioDeviceCallback);
        }
        if (i >= 31 && i2 >= 31) {
            if (context.checkCallingOrSelfPermission("android.permission.BLUETOOTH_CONNECT") != 0) {
                this.mBluetoothPermissionDesp = "[permission android.permission.BLUETOOTH_CONNECT not be granted. osVersion:" + i + ", targetVersion:" + i2 + " ]";
                StringBuilder sb = new StringBuilder("AudioRouteDeviceManager: ");
                sb.append(this.mBluetoothPermissionDesp);
                RXLogging.e(TAG, sb.toString());
                return false;
            }
            this.mBluetoothPermissionDesp = "[permission android.permission.BLUETOOTH_CONNECT granted. osVersion:" + i + ", targetVersion:" + i2 + " ]";
            StringBuilder sb2 = new StringBuilder("AudioRouteDeviceManager: ");
            sb2.append(this.mBluetoothPermissionDesp);
            RXLogging.w(TAG, sb2.toString());
            return true;
        }
        if (context.checkCallingOrSelfPermission("android.permission.BLUETOOTH") == 0) {
            this.mBluetoothPermissionDesp = "[permission android.permission.BLUETOOTH granted. osVersion:" + i + ", targetVersion:" + i2 + " ]";
            StringBuilder sb3 = new StringBuilder("AudioRouteDeviceManager: ");
            sb3.append(this.mBluetoothPermissionDesp);
            RXLogging.w(TAG, sb3.toString());
            return true;
        }
        String str = "[permission android.permission.BLUETOOTH not be granted. osVersion:" + i + ", targetVersion:" + i2 + " ]";
        this.mBluetoothPermissionDesp = str;
        RXLogging.e(TAG, str);
        Log.e(TAG, TAG + this.mBluetoothPermissionDesp);
        return false;
    }

    private boolean hasAudioForUsbDevice(UsbDevice usbDevice) {
        if (usbDevice == null) {
            return false;
        }
        for (int i = 0; i < usbDevice.getConfigurationCount(); i++) {
            UsbConfiguration configuration = usbDevice.getConfiguration(i);
            if (configuration != null) {
                for (int i2 = 0; i2 < configuration.getInterfaceCount(); i2++) {
                    UsbInterface usbInterface = configuration.getInterface(i2);
                    if (usbInterface != null && usbInterface.getInterfaceClass() == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean hasValidBtDeviceMajor(int i, final String[] strArr) {
        final Context context;
        if (this.mBluetoothAdapter == null || (context = AudioRouteUtil.getContext()) == null) {
            return false;
        }
        final Object obj = new Object();
        final boolean[] zArr = {true};
        if (i == 1) {
            try {
                this.mBluetoothAdapter.getProfileProxy(context, new BluetoothProfile.ServiceListener() { // from class: com.ss.bytertc.audio.device.router.AudioRouteDeviceManager.1
                    @Override // android.bluetooth.BluetoothProfile.ServiceListener
                    public void onServiceConnected(int i2, BluetoothProfile bluetoothProfile) {
                        boolean z;
                        try {
                            List<BluetoothDevice> connectedDevices = bluetoothProfile.getConnectedDevices();
                            if (connectedDevices == null || connectedDevices.isEmpty()) {
                                z = false;
                            } else {
                                Iterator<BluetoothDevice> it = connectedDevices.iterator();
                                z = false;
                                while (it.hasNext()) {
                                    if (AudioRouteDeviceManager.this.isBtDeviceMajorValid(context, i2, it.next(), strArr)) {
                                        z = true;
                                    }
                                }
                            }
                            if (!z) {
                                zArr[0] = false;
                            }
                        } catch (Throwable th) {
                            RXLogging.e(AudioRouteDeviceManager.TAG, "AudioRouteDeviceManager: BluetoothProfile getConnectedDevices failed.", th);
                        }
                        synchronized (obj) {
                            obj.notify();
                        }
                    }

                    @Override // android.bluetooth.BluetoothProfile.ServiceListener
                    public void onServiceDisconnected(int i2) {
                    }
                }, i);
                synchronized (obj) {
                    obj.wait(300L);
                }
            } catch (Throwable th) {
                RXLogging.e(TAG, "AudioRouteDeviceManager: hasValidBtDeviceMajor failed.", th);
            }
        }
        return zArr[0];
    }

    private boolean headsetPlugActionIsFromUsbHeadset(Intent intent) {
        String stringExtra = intent.getStringExtra("address");
        String stringExtra2 = intent.getStringExtra("portName");
        RXLogging.w(TAG, "ACTION_HEADSET_PLUG info, address: " + stringExtra + ", portName: " + stringExtra2 + ", connected: " + intent.getIntExtra(Channel.state, -99) + ", hasMic: " + intent.getIntExtra("microphone", -99));
        if ("".equals(stringExtra) || "".equals(stringExtra2) || stringExtra2 == null) {
            return false;
        }
        if (!stringExtra2.startsWith("USB") && !stringExtra2.startsWith("usb")) {
            return false;
        }
        RXLogging.e(TAG, "AudioRouteDeviceManager: received ACTION_HEADSET_PLUG, may be is a usb device");
        return true;
    }

    private void initBluetooth() {
        boolean z;
        boolean z2;
        boolean z3;
        String[] strArr = {""};
        synchronized (this.bluetoothLock) {
            this.mBluetoothDevice = null;
        }
        if (checkPermission()) {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            this.mBluetoothAdapter = defaultAdapter;
            if (defaultAdapter == null) {
                Log.e(TAG, "AudioRouteDeviceManager: initBluetooth with permission failed. GetDefaultAdapter is null");
                return;
            }
            try {
                boolean z4 = 2 == ii5.d(defaultAdapter, 1) && hasValidBtDeviceMajor(1, strArr);
                try {
                    z3 = z4;
                    z2 = 2 == ii5.d(this.mBluetoothAdapter, 2);
                } catch (Throwable th) {
                    z = z4;
                    th = th;
                    RXLogging.e(TAG, "AudioRouteDeviceManager: getProfileConnectionState failed.", th);
                    z2 = false;
                    z3 = z;
                }
            } catch (Throwable th2) {
                th = th2;
                z = false;
            }
            if (!this.mUseAudioDeviceCallback) {
                this.mIntentFilter.addAction(ACTION_BT_HEADSET_CONNECTION_STATE_CHANGED);
                this.mIntentFilter.addAction(ACTION_BT_A2DP_CONNECTION_STATE_CHANGED);
            }
            this.mIntentFilter.addAction(ACTION_BT_SCO_AUDIO_STATE_UPDATED);
        } else if (this.mUseAudioDeviceCallback) {
            Context context = AudioRouteUtil.getContext();
            if (context == null) {
                Log.e(TAG, "AudioRouteDeviceManager: initBluetooth without permission failed. Context is null.");
                return;
            }
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager == null) {
                Log.e(TAG, "AudioRouteDeviceManager: initBluetooth without permission failed. AudioManager is null.");
                return;
            }
            z3 = false;
            z2 = false;
            for (AudioDeviceInfo audioDeviceInfo : audioManager.getDevices(2)) {
                if (!audioDeviceInfo.isSource()) {
                    if (7 == audioDeviceInfo.getType()) {
                        z3 = true;
                    } else if (8 == audioDeviceInfo.getType()) {
                        z2 = true;
                    }
                }
            }
        } else {
            z3 = false;
            z2 = false;
        }
        if (z3 || z2) {
            synchronized (this.bluetoothLock) {
                MyBluetoothDevice myBluetoothDevice = new MyBluetoothDevice("bluetooth-headset[init]");
                this.mBluetoothDevice = myBluetoothDevice;
                myBluetoothDevice.appendDeviceInfo("init", strArr[0]);
                this.mBluetoothDevice.setBluetoothConnected(1, z3);
                this.mBluetoothDevice.setBluetoothConnected(2, z2);
            }
        }
    }

    private void initHandler() {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null && (looperMyLooper = Looper.getMainLooper()) == null) {
            RXLogging.e(TAG, "AudioRouteDeviceManager: initHandler failed");
            return;
        }
        Handler handler = new Handler(looperMyLooper);
        this.mHandler = handler;
        handler.removeCallbacks(new vc1(this));
        RXLogging.e(TAG, "AudioRouteDeviceManager: initHandler success");
    }

    private boolean initHeadset() {
        Intent intentL;
        Context context = AudioRouteUtil.getContext();
        return (context == null || (intentL = ii5.l(context, this, new IntentFilter(ACTION_HEADSET_PLUG))) == null || headsetPlugActionIsFromUsbHeadset(intentL) || 1 != intentL.getIntExtra(Channel.state, -99)) ? false : true;
    }

    private boolean initUsbHeadset() {
        UsbManager usbManager;
        try {
            Context context = AudioRouteUtil.getContext();
            if (context == null || (usbManager = (UsbManager) context.getSystemService("usb")) == null) {
                return false;
            }
            HashMap<String, UsbDevice> deviceList = usbManager.getDeviceList();
            Iterator<String> it = deviceList.keySet().iterator();
            while (it.hasNext()) {
                UsbDevice usbDevice = deviceList.get(it.next());
                if (hasAudioForUsbDevice(usbDevice)) {
                    this.mUsbHeadsetDevice = usbDevice;
                    RXLogging.e(TAG, "AudioRouteDeviceManager: initUsbHeadset finished.");
                    return true;
                }
            }
        } catch (Throwable th) {
            RXLogging.e(TAG, "AudioRouteDeviceManager: initUsbHeadset failed.", th);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isBtDeviceMajorValid(Context context, int i, BluetoothDevice bluetoothDevice, String[] strArr) {
        if (context == null || bluetoothDevice == null) {
            return false;
        }
        int i2 = Build.VERSION.SDK_INT;
        int i3 = context.getApplicationInfo().targetSdkVersion;
        if (i2 < 31 || i3 < 31 ? context.checkCallingOrSelfPermission("android.permission.BLUETOOTH") == 0 : context.checkCallingOrSelfPermission("android.permission.BLUETOOTH_CONNECT") == 0) {
            try {
                String name = bluetoothDevice.getName();
                bluetoothDevice.getAddress();
                BluetoothClass bluetoothClass = bluetoothDevice.getBluetoothClass();
                if (bluetoothClass == null) {
                    return false;
                }
                int majorDeviceClass = bluetoothClass.getMajorDeviceClass();
                strArr[0] = strArr[0] + "[device:" + name + ", majorClass:" + majorDeviceClass + "] ";
                if (i == 1) {
                    return (majorDeviceClass == 1792 || majorDeviceClass == 7936) ? false : true;
                }
            } catch (Throwable th) {
                RXLogging.e(TAG, "AudioRouteDeviceManager: isBtDeviceMajorValid failed.", th);
            }
        }
        return true;
    }

    private int registerReceiver() {
        Context context = AudioRouteUtil.getContext();
        if (context == null) {
            return -1;
        }
        if (this.registered) {
            RXLogging.i(TAG, "registerReceiver registered");
            return 0;
        }
        this.registered = true;
        ii5.l(context, this, this.mIntentFilter);
        if (this.mUseAudioDeviceCallback) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager == null) {
                return -2;
            }
            BluetoothConnectCallback bluetoothConnectCallback = new BluetoothConnectCallback();
            this.mBluetoothDeviceCallback = bluetoothConnectCallback;
            audioManager.registerAudioDeviceCallback(bluetoothConnectCallback, null);
        }
        RXLogging.w(TAG, "AudioRouteDeviceManager: registerReceiver SkipBluetooth:" + this.mUseAudioDeviceCallback);
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void restartBluetoothScoAsynTask() {
        RXLogging.w(TAG, "restartBluetoothScoAsynTask enter.");
        if (this.mBluetoothDevice == null) {
            RXLogging.w(TAG, "AudioRouteDeviceManager: restartBluetoothScoAsynTask skip, no bluetooth device now.");
            return;
        }
        if (bluetoothScoIsStarting()) {
            RXLogging.w(TAG, "AudioRouteDeviceManager: restartBluetoothScoAsynTask skip. sco is starting.");
            return;
        }
        Context context = AudioRouteUtil.getContext();
        if (context == null) {
            RXLogging.e(TAG, "AudioRouteDeviceManager: restartBluetoothScoAsynTask failed. Context is null.");
            return;
        }
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            RXLogging.e(TAG, "AudioRouteDeviceManager: restartBluetoothScoAsynTask failed. AudioManager is null.");
        } else {
            startSystemBluetoothSco(audioManager);
            RXLogging.w(TAG, "AudioRouteDeviceManager: restartBluetoothScoAsynTask has start bluetooth.");
        }
    }

    private String routingDeviceType2Text(@RoutingDeviceType int i) {
        if (i == -1) {
            return "device-unknown";
        }
        if (i == 4) {
            return "device-wired-headset";
        }
        if (i == 8) {
            return "device-bt-headset";
        }
        if (i == 16) {
            return "device-bt-a2dp";
        }
        if (i == 32) {
            return "device-usb-headset";
        }
        if (i == 64) {
            return "device-bt-sco";
        }
        if (i != 1) {
            return i != 2 ? "device-NA" : "device-speaker";
        }
        return "device-earpiece";
    }

    private void startSystemBluetoothSco(AudioManager audioManager) {
        if (audioManager == null) {
            RXLogging.e(TAG, "AudioRouteDeviceManager: startSystemBluetoothSco skipped, audioManager is null");
            return;
        }
        try {
            audioManager.startBluetoothSco();
            this.mScoHasStarted = true;
        } catch (Exception e) {
            RXLogging.e(TAG, "AudioRouteDeviceManager: startSystemBluetoothSco failed, Exception: " + e.toString());
        }
    }

    private void stopSystemBluetoothSco(AudioManager audioManager) {
        if (audioManager == null) {
            RXLogging.e(TAG, "AudioRouteDeviceManager: stopSystemBluetoothSco skipped, audioManager is null");
            return;
        }
        try {
            audioManager.stopBluetoothSco();
            audioManager.setBluetoothScoOn(false);
            this.mScoHasStarted = false;
        } catch (Exception e) {
            RXLogging.e(TAG, "AudioRouteDeviceManager: stopSystemBluetoothSco failed, Exception: " + e.toString());
        }
    }

    private int unregisterReceiver() {
        Context context = AudioRouteUtil.getContext();
        if (context == null) {
            return -1;
        }
        if (!this.registered) {
            return 0;
        }
        this.registered = false;
        context.unregisterReceiver(this);
        clearAbortBroadcast();
        if (this.mUseAudioDeviceCallback) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager == null) {
                return -2;
            }
            audioManager.unregisterAudioDeviceCallback(this.mBluetoothDeviceCallback);
            this.mBluetoothDeviceCallback = null;
        }
        RXLogging.w(TAG, "AudioRouteDeviceManager: unregisterReceiver SkipBluetooth:" + this.mUseAudioDeviceCallback);
        return 0;
    }

    public String getCaptureDeviceName() {
        return getRenderDeviceName();
    }

    public int getDeviceState() {
        return this.mInitDeviceState;
    }

    public String getRenderDeviceName() {
        int i = this.currentRouting;
        if (i == 1) {
            return "earpiece";
        }
        if (i == 2) {
            return "built-in speaker";
        }
        if (i == 4) {
            String str = this.mWiredHeadsetDevice;
            return str != null ? str : "failed_wired-headset";
        }
        if (i == 8) {
            MyBluetoothDevice myBluetoothDevice = this.mBluetoothDevice;
            return myBluetoothDevice != null ? myBluetoothDevice.getName() : "failed_bluetooth-headset";
        }
        if (i == 16) {
            MyBluetoothDevice myBluetoothDevice2 = this.mBluetoothDevice;
            return myBluetoothDevice2 != null ? myBluetoothDevice2.getName() : "failed_bluetooth-a2dp";
        }
        if (i != 32) {
            return "failed_device_name";
        }
        UsbDevice usbDevice = this.mUsbHeadsetDevice;
        return usbDevice != null ? usbDevice.getDeviceName() : "failed_usb-headset";
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004d  */
    public String getSessionInfo() {
        Context context = AudioRouteUtil.getContext();
        if (context == null) {
            return "Context is null";
        }
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return "AudioManager is null";
        }
        if (this.mCallback == null) {
            return "mCallback is null";
        }
        boolean zHasSystemFeature = context.getPackageManager().hasSystemFeature("android.hardware.microphone");
        boolean z = true;
        boolean z2 = false;
        boolean z3 = e16.a(context, "android.permission.RECORD_AUDIO") == 0;
        int i = context.getApplicationInfo().targetSdkVersion;
        if (30 <= i && i < 34) {
            if (e16.a(context, "android.permission.FOREGROUND_SERVICE") != 0) {
                z = false;
            }
            z2 = z;
        } else if (34 <= i) {
            if (e16.a(context, "android.permission.FOREGROUND_SERVICE") != 0 || e16.a(context, "android.permission.FOREGROUND_SERVICE_MICROPHONE") != 0) {
                z = false;
            }
            z2 = z;
        }
        try {
            return "{ Audio State: audio_mode:" + AudioRouteUtil.modeString(audioManager.getMode()) + ", has_mic:" + zHasSystemFeature + ", mic_muted:" + audioManager.isMicrophoneMute() + ", speakerphone:" + audioManager.isSpeakerphoneOn() + ", headset:" + audioManager.isWiredHeadsetOn() + ", bt_sco:" + audioManager.isBluetoothScoOn() + ", permission:" + z3 + ", foregroundServiceMic:" + z2 + ", bluetoothPermission:" + this.mBluetoothPermissionDesp + " }";
        } catch (Exception e) {
            String str = "getSessionInfo failed, exception: " + e.toString();
            RXLogging.e(TAG, "AudioRouteDeviceManager: ".concat(str));
            return str;
        }
    }

    public int init() {
        IntentFilter intentFilter = new IntentFilter();
        this.mIntentFilter = intentFilter;
        intentFilter.addAction(ACTION_BT_STATE_CHANGED);
        this.mIntentFilter.addAction(ACTION_USB_DEVICE_ATTACHED);
        this.mIntentFilter.addAction(ACTION_USB_DEVICE_DETACHED);
        initHandler();
        if (initHeadset()) {
            this.mInitDeviceState += 4;
        }
        if (initUsbHeadset()) {
            this.mInitDeviceState += 32;
        }
        initBluetooth();
        MyBluetoothDevice myBluetoothDevice = this.mBluetoothDevice;
        if (myBluetoothDevice != null) {
            if (myBluetoothDevice.getBluetoothConnected(1)) {
                this.mInitDeviceState += 8;
            }
            if (this.mBluetoothDevice.getBluetoothConnected(2)) {
                this.mInitDeviceState += 16;
            }
        }
        if (registerReceiver() == 0) {
            return 0;
        }
        Log.e(TAG, "AudioRouteDeviceManager: registerReceiver failed.");
        release();
        return -2;
    }

    /* JADX WARN: Code duplicated, block: B:180:0x0365  */
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        int intExtra;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        IAudioRouteCallback iAudioRouteCallback;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            RXLogging.e(TAG, "AudioRouteDeviceManager: action is null");
            return;
        }
        String attrsString = "";
        int i = 16;
        if (!action.equals(ACTION_BT_STATE_CHANGED)) {
            if (action.equals(ACTION_BT_HEADSET_CONNECTION_STATE_CHANGED)) {
                int intExtra2 = intent.getIntExtra("android.bluetooth.profile.extra.STATE", -99);
                BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                if (intExtra2 != 0) {
                    if (intExtra2 == 1) {
                        z7 = false;
                    } else {
                        if (intExtra2 == 2) {
                            RXLogging.w(TAG, "AudioRouteDeviceManager: ACTION_BT_HEADSET_CONNECTION_STATE_CHANGED:STATE_CONNECTED:" + bluetoothDevice);
                            String[] strArr = {""};
                            if (bluetoothDevice != null && isBtDeviceMajorValid(context, 1, bluetoothDevice, strArr)) {
                                synchronized (this.bluetoothLock) {
                                    try {
                                        if (this.mBluetoothDevice == null) {
                                            this.mBluetoothDevice = new MyBluetoothDevice(bluetoothDevice);
                                        }
                                        this.mBluetoothDevice.appendDeviceInfo("broadcast", strArr[0]);
                                        this.mBluetoothDevice.setBluetoothConnected(1, true);
                                        attrsString = this.mBluetoothDevice.getAttrsString();
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                                this.mBluetoothScoRestartTimes = 0;
                                z7 = true;
                            }
                        } else if (intExtra2 != 3) {
                            RXLogging.w(TAG, "AudioRouteDeviceManager: ACTION_BT_HEADSET_CONNECTION_STATE_CHANGED, unknown state: " + intExtra2);
                        }
                        z7 = false;
                    }
                    z8 = z7;
                } else {
                    RXLogging.w(TAG, "AudioRouteDeviceManager: ACTION_BT_HEADSET_CONNECTION_STATE_CHANGED:STATE_DISCONNECTED:" + bluetoothDevice);
                    synchronized (this.bluetoothLock) {
                        try {
                            MyBluetoothDevice myBluetoothDevice = this.mBluetoothDevice;
                            if (myBluetoothDevice != null) {
                                myBluetoothDevice.setBluetoothConnected(1, false);
                                attrsString = this.mBluetoothDevice.getAttrsString();
                                if (!this.mBluetoothDevice.getBluetoothConnected(1) && !this.mBluetoothDevice.getBluetoothConnected(2)) {
                                    RXLogging.w(TAG, "AudioRouteDeviceManager: destroy mBluetoothDevice due to headset & a2dp disconncected" + bluetoothDevice);
                                    this.mBluetoothDevice = null;
                                }
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    z7 = false;
                    z8 = true;
                }
                boolean z9 = z8;
                z = z7;
                intExtra = intExtra2;
                z2 = z9;
                i = 8;
            } else if (action.equals(ACTION_BT_A2DP_CONNECTION_STATE_CHANGED)) {
                int intExtra3 = intent.getIntExtra("android.bluetooth.profile.extra.STATE", -99);
                BluetoothDevice bluetoothDevice2 = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                if (intExtra3 == 0) {
                    RXLogging.w(TAG, "AudioRouteDeviceManager: ACTION_BT_A2DP_CONNECTION_STATE_CHANGED:STATE_DISCONNECTED:" + bluetoothDevice2);
                    synchronized (this.bluetoothLock) {
                        try {
                            MyBluetoothDevice myBluetoothDevice2 = this.mBluetoothDevice;
                            if (myBluetoothDevice2 != null) {
                                myBluetoothDevice2.setBluetoothConnected(2, false);
                                attrsString = this.mBluetoothDevice.getAttrsString();
                                if (!this.mBluetoothDevice.getBluetoothConnected(1) && !this.mBluetoothDevice.getBluetoothConnected(2)) {
                                    RXLogging.w(TAG, "AudioRouteDeviceManager: destroy mBluetoothDevice due to headset & a2dp disconncected" + bluetoothDevice2);
                                    this.mBluetoothDevice = null;
                                }
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    z5 = false;
                    z6 = true;
                } else if (intExtra3 == 1) {
                    z5 = false;
                    z6 = false;
                } else if (intExtra3 != 2) {
                    if (intExtra3 != 3) {
                        RXLogging.w(TAG, "AudioRouteDeviceManager: ACTION_BT_A2DP_CONNECTION_STATE_CHANGED, unknown state: " + intExtra3);
                    }
                    z5 = false;
                    z6 = false;
                } else {
                    RXLogging.w(TAG, "AudioRouteDeviceManager: ACTION_BT_A2DP_CONNECTION_STATE_CHANGED:STATE_CONNECTED:" + bluetoothDevice2);
                    String[] strArr2 = {""};
                    synchronized (this.bluetoothLock) {
                        if (bluetoothDevice2 != null) {
                            try {
                                if (this.mBluetoothDevice == null) {
                                    this.mBluetoothDevice = new MyBluetoothDevice(bluetoothDevice2);
                                }
                                isBtDeviceMajorValid(context, 2, bluetoothDevice2, strArr2);
                                this.mBluetoothDevice.appendDeviceInfo("broadcast", strArr2[0]);
                                this.mBluetoothDevice.setBluetoothConnected(2, true);
                                attrsString = this.mBluetoothDevice.getAttrsString();
                                this.mBluetoothScoRestartTimes = 0;
                                z5 = true;
                            } catch (Throwable th4) {
                                throw th4;
                            }
                        } else {
                            z5 = false;
                        }
                        z6 = z5;
                    }
                }
                z2 = z6;
                z = z5;
                intExtra = intExtra3;
            } else if (action.equals(ACTION_BT_SCO_AUDIO_STATE_UPDATED)) {
                intExtra = intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -99);
                if (intExtra != 0) {
                    if (intExtra != 1) {
                        z = false;
                    } else {
                        RXLogging.w(TAG, "AudioRouteDeviceManager: SCO_AUDIO_STATE_CONNECTED");
                        synchronized (this.bluetoothLock) {
                            try {
                                MyBluetoothDevice myBluetoothDevice3 = this.mBluetoothDevice;
                                attrsString = myBluetoothDevice3 != null ? myBluetoothDevice3.getAttrsString() : "";
                            } catch (Throwable th5) {
                                throw th5;
                            }
                        }
                        z = true;
                    }
                    z2 = z;
                } else {
                    RXLogging.w(TAG, "AudioRouteDeviceManager: SCO_AUDIO_STATE_DISCONNECTED");
                    synchronized (this.bluetoothLock) {
                        try {
                            MyBluetoothDevice myBluetoothDevice4 = this.mBluetoothDevice;
                            attrsString = myBluetoothDevice4 != null ? myBluetoothDevice4.getAttrsString() : "";
                        } catch (Throwable th6) {
                            throw th6;
                        }
                    }
                    z = false;
                    z2 = true;
                }
                i = 64;
            } else {
                i = 32;
                if (action.equals(ACTION_USB_DEVICE_ATTACHED)) {
                    UsbDevice usbDevice = (UsbDevice) intent.getParcelableExtra(Device.TYPE);
                    RXLogging.w(TAG, "AudioRouteDeviceManager: ACTION_USB_DEVICE_ATTACHED:" + usbDevice);
                    if (hasAudioForUsbDevice(usbDevice)) {
                        this.mUsbHeadsetDevice = usbDevice;
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    intExtra = -1234;
                    z2 = z4;
                    z = true;
                } else if (action.equals(ACTION_USB_DEVICE_DETACHED)) {
                    UsbDevice usbDevice2 = (UsbDevice) intent.getParcelableExtra(Device.TYPE);
                    RXLogging.w(TAG, "AudioRouteDeviceManager: ACTION_USB_DEVICE_DETACHED:" + usbDevice2);
                    if (hasAudioForUsbDevice(usbDevice2)) {
                        this.mUsbHeadsetDevice = null;
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    intExtra = -1234;
                    z2 = z3;
                    z = false;
                } else if (!action.equals(ACTION_HEADSET_PLUG)) {
                    i = -1;
                    intExtra = -1234;
                } else {
                    if (headsetPlugActionIsFromUsbHeadset(intent)) {
                        return;
                    }
                    boolean z10 = intent.getIntExtra(Channel.state, -99) == 1;
                    RXLogging.w(TAG, "AudioRouteDeviceManager: ACTION_HEADSET_PLUG:".concat(z10 ? "connected" : "disconnected"));
                    if (z10) {
                        this.mWiredHeadsetDevice = "wired-headset";
                    } else {
                        this.mWiredHeadsetDevice = null;
                    }
                    i = 4;
                    z = z10;
                    intExtra = -1234;
                    z2 = true;
                }
            }
            StringBuilder sb = new StringBuilder("AudioRouteDeviceManager: received action:");
            sb.append(action);
            sb.append(" state:");
            sb.append(intExtra);
            sb.append(" needReport:");
            sb.append(z2);
            sb.append(", mCallback:");
            sb.append(this.mCallback != null);
            sb.append(", deviceType:");
            sb.append(i);
            sb.append(", connectedStatus:");
            sb.append(z);
            RXLogging.w(TAG, sb.toString());
            if (z2 || (iAudioRouteCallback = this.mCallback) == null) {
            }
            iAudioRouteCallback.onDeviceEvent(i, z, attrsString);
            return;
        }
        intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -99);
        BluetoothDevice bluetoothDevice3 = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        if (intExtra == 10) {
            RXLogging.w(TAG, "AudioRouteDeviceManager: ACTION_BT_STATE_CHANGED:STATE_OFF:" + this.mBluetoothDevice);
            IAudioRouteCallback iAudioRouteCallback2 = this.mCallback;
            if (iAudioRouteCallback2 != null) {
                iAudioRouteCallback2.onDeviceEvent(8, false, "");
                this.mCallback.onDeviceEvent(16, false, "");
            }
            synchronized (this.bluetoothLock) {
                try {
                    if (this.mBluetoothDevice != null) {
                        RXLogging.w(TAG, "AudioRouteDeviceManager: destroy mBluetoothDevice due to bluetooth adapter is closed: " + bluetoothDevice3);
                        this.mBluetoothDevice = null;
                    }
                } catch (Throwable th7) {
                    throw th7;
                }
            }
            return;
        }
        if (intExtra == 12) {
            RXLogging.w(TAG, "AudioRouteDeviceManager: ACTION_BT_STATE_CHANGED:STATE_ON:" + bluetoothDevice3);
        }
        i = 8;
        z = false;
        z2 = false;
        StringBuilder sb2 = new StringBuilder("AudioRouteDeviceManager: received action:");
        sb2.append(action);
        sb2.append(" state:");
        sb2.append(intExtra);
        sb2.append(" needReport:");
        sb2.append(z2);
        sb2.append(", mCallback:");
        sb2.append(this.mCallback != null);
        sb2.append(", deviceType:");
        sb2.append(i);
        sb2.append(", connectedStatus:");
        sb2.append(z);
        RXLogging.w(TAG, sb2.toString());
        if (z2) {
        }
    }

    public int release() {
        int i;
        AudioManager audioManager;
        this.mCallback = null;
        Context context = AudioRouteUtil.getContext();
        if (context != null && (audioManager = (AudioManager) context.getSystemService("audio")) != null && (audioManager.isBluetoothScoOn() || this.mScoHasStarted)) {
            stopSystemBluetoothSco(audioManager);
        }
        if (unregisterReceiver() != 0) {
            RXLogging.e(TAG, "AudioRouteDeviceManager: unregisterReceiver failed.");
            i = -1;
        } else {
            i = 0;
        }
        if (this.mHandler != null) {
            this.mHandler = null;
        }
        this.mBluetoothAdapter = null;
        this.mIntentFilter = null;
        this.mInitDeviceState = 0;
        synchronized (this.bluetoothLock) {
            this.mBluetoothDevice = null;
        }
        this.mUsbHeadsetDevice = null;
        this.mWiredHeadsetDevice = null;
        this.currentRouting = -1;
        this.mEnableUseAudioDeviceCallback = false;
        this.mUseAudioDeviceCallback = false;
        return i;
    }

    public void restartBluetoothSco() {
        Handler handler;
        RXLogging.w(TAG, "restartBluetoothSco enter.");
        if (this.mBluetoothDevice == null) {
            RXLogging.w(TAG, "restartBluetoothSco skip, no bluetooth device now.");
            this.mHandler.removeCallbacks(new Runnable() { // from class: l.uc1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f13805a.restartBluetoothScoAsynTask();
                }
            });
            return;
        }
        Context context = AudioRouteUtil.getContext();
        if (context == null) {
            RXLogging.e(TAG, "restartBluetoothSco failed. Context is null.");
            return;
        }
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            RXLogging.e(TAG, "restartBluetoothSco failed. AudioManager is null.");
            return;
        }
        if (3 != audioManager.getMode()) {
            RXLogging.e(TAG, "restartBluetoothSco failed. Not in communication mode.");
            return;
        }
        if (bluetoothScoIsStarting()) {
            RXLogging.w(TAG, "restartBluetoothSco skip. sco is starting.");
            return;
        }
        int i = this.mBluetoothScoRestartTimes + 1;
        this.mBluetoothScoRestartTimes = i;
        if (i <= 3) {
            RXLogging.w(TAG, "restartBluetoothScoAsynTask, restart time: " + this.mBluetoothScoRestartTimes);
            if (!audioManager.isBluetoothScoOn() && (handler = this.mHandler) != null) {
                handler.postDelayed(new Runnable() { // from class: l.uc1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f13805a.restartBluetoothScoAsynTask();
                    }
                }, 3000L);
            }
        } else {
            if (this.mScoHasStarted) {
                stopSystemBluetoothSco(audioManager);
            }
            IAudioRouteCallback iAudioRouteCallback = this.mCallback;
            if (iAudioRouteCallback != null) {
                iAudioRouteCallback.onError(AudioRouteController.EVENT_SCO_FAILED_FORCE_TO_MEDIA_MODE, "change to normal mode due to sco restart timeout");
            }
        }
        RXLogging.w(TAG, "restartBluetoothSco leave.");
    }

    public int setAudioRoute(@RoutingDeviceType int i, boolean z) {
        Context context = AudioRouteUtil.getContext();
        if (context == null) {
            RXLogging.e(TAG, "AudioRouteDeviceManager: setAudioRoute failed. Context is null.");
            return -1;
        }
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            RXLogging.e(TAG, "AudioRouteDeviceManager: setAudioRoute failed. AudioManager is null.");
            return -2;
        }
        if (this.mCallback == null) {
            RXLogging.e(TAG, "AudioRouteDeviceManager: setAudioRoute failed. mCallback is null.");
            return -6;
        }
        int mode = audioManager.getMode();
        int i2 = z ? 0 : 3;
        if (i2 != mode) {
            RXLogging.e(TAG, "AudioRouteDeviceManager: isMediaMode:" + z + ", cacheMode:" + i2 + ", systemMode: " + mode + " not matched with system!!!");
            audioManager.setMode(i2);
            mode = audioManager.getMode();
        }
        boolean zIsSpeakerphoneOn = audioManager.isSpeakerphoneOn();
        boolean zIsBluetoothScoOn = audioManager.isBluetoothScoOn();
        RXLogging.e(TAG, "AudioRouteDeviceManager: setAudioRoute, deviceType: " + routingDeviceType2Text(i) + ", cacheMode:" + i2 + ", systemMode: " + mode + ", speakerPhoneOn: " + zIsSpeakerphoneOn + ", bluetoothScoOn: " + zIsBluetoothScoOn);
        if (mode != 3) {
            if (mode != 0) {
                RXLogging.e(TAG, "AudioRouteDeviceManager: mode(" + mode + ") is not support to setAudioRoute");
                return -4;
            }
            if (zIsBluetoothScoOn || this.mScoHasStarted) {
                RXLogging.w(TAG, "AudioRouteDeviceManager: MODE_NORMAL,but BluetoothScoOn is true, force to close sco.");
                stopSystemBluetoothSco(audioManager);
            }
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.removeCallbacks(new vc1(this));
                this.mHandler.postDelayed(new Runnable() { // from class: l.wc1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f14502a.bluetoothScoDisconnectionForNormalMode();
                    }
                }, 6000L);
            }
            if (i == 2) {
                if (!zIsSpeakerphoneOn) {
                    audioManager.setSpeakerphoneOn(true);
                }
            } else if (i == 1 && zIsSpeakerphoneOn) {
                audioManager.setSpeakerphoneOn(false);
            }
            return 0;
        }
        if (i == 8) {
            boolean zBluetoothScoIsStarting = bluetoothScoIsStarting();
            StringBuilder sb = new StringBuilder("AudioRouteDeviceManager: need to start bluetooth sco in communication mode, sco is starting: ");
            sb.append(zBluetoothScoIsStarting);
            sb.append(zBluetoothScoIsStarting ? ", skip start sco" : ", continue start sco");
            RXLogging.w(TAG, sb.toString());
            if (!zIsBluetoothScoOn && !zBluetoothScoIsStarting) {
                RXLogging.w(TAG, "AudioRouteDeviceManager: ready to start sco");
                this.mBluetoothScoConnectCheckTimes = 0;
                startSystemBluetoothSco(audioManager);
                Handler handler2 = this.mHandler;
                if (handler2 != null) {
                    handler2.removeCallbacks(new Runnable() { // from class: l.wc1
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f14502a.bluetoothScoDisconnectionForNormalMode();
                        }
                    });
                    this.mHandler.postDelayed(new vc1(this), 3000L);
                }
            }
        } else {
            if (zIsBluetoothScoOn || this.mScoHasStarted) {
                stopSystemBluetoothSco(audioManager);
            }
            if (i == 2) {
                if (!zIsSpeakerphoneOn) {
                    audioManager.setSpeakerphoneOn(true);
                }
            } else {
                if (i != 1 && i != 4 && i != 32) {
                    if (i == 16) {
                        RXLogging.e(TAG, "AudioRouteDeviceManager: Error: setAudioRoute to a2dp in communication mode");
                        return -7;
                    }
                    RXLogging.e(TAG, "AudioRouteDeviceManager: setAudioRoute failed. deviceType(" + routingDeviceType2Text(i) + ") invalid.");
                    return -3;
                }
                if (zIsSpeakerphoneOn) {
                    audioManager.setSpeakerphoneOn(false);
                }
            }
        }
        this.currentRouting = i;
        return 0;
    }

    public void setUseAudioDeviceCallback(boolean z, IAudioRouteCallback iAudioRouteCallback) {
        this.mEnableUseAudioDeviceCallback = z;
        this.mCallback = iAudioRouteCallback;
        RXLogging.w(TAG, "AudioRouteDeviceManager: setUseAudioDeviceCallback:" + z);
    }

    public class MyBluetoothDevice {
        private BluetoothDevice bluetoothDevice;
        private String name;
        private String extraInfo = "";
        private boolean headsetConnected = false;
        private boolean a2dpConnected = false;

        public MyBluetoothDevice(String str) {
            this.name = str;
        }

        public void appendDeviceInfo(String str, String str2) {
            String str3 = " ,from:" + str + " " + str2;
            if (this.extraInfo.contains(str3)) {
                return;
            }
            this.extraInfo += str3;
        }

        public String getAttrsString() {
            String str = "name:" + getName();
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(", headset:");
            sb.append(this.headsetConnected ? "true" : "false");
            String string = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(string);
            sb2.append(", a2dp:");
            sb2.append(this.a2dpConnected ? "true" : "false");
            return sb2.toString() + this.extraInfo;
        }

        public boolean getBluetoothConnected(int i) {
            if (i == 1) {
                return this.headsetConnected;
            }
            if (i == 2) {
                return this.a2dpConnected;
            }
            return false;
        }

        public String getName() {
            return this.bluetoothDevice == null ? this.name : "bluetooth-headset";
        }

        public void setBluetoothConnected(int i, boolean z) {
            if (i == 1) {
                this.headsetConnected = z;
            } else if (i == 2) {
                this.a2dpConnected = z;
            }
        }

        public String toString() {
            return getName();
        }

        public MyBluetoothDevice(BluetoothDevice bluetoothDevice) {
            this.bluetoothDevice = bluetoothDevice;
        }
    }
}
