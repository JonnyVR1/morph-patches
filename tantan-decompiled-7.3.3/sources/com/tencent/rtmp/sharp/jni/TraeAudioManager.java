package com.tencent.rtmp.sharp.jni;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.cosmos.photon.push.thirdparty.ThirdPushManager;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.meituan.robust.Constants;
import com.p051p1.mobile.putong.core.data.CardButtonsShowAndHideType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.locks.ReentrantLock;
import p153l.jj5;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"NewApi"})
public class TraeAudioManager extends BroadcastReceiver {
    public static final String ACTION_TRAEAUDIOMANAGER_NOTIFY = "com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_NOTIFY";
    public static final String ACTION_TRAEAUDIOMANAGER_REQUEST = "com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_REQUEST";
    public static final String ACTION_TRAEAUDIOMANAGER_RES = "com.tencent.sharp.ACTION_TRAEAUDIOMANAGER_RES";
    static final int AUDIO_DEVICE_OUT_BLUETOOTH_A2DP = 128;
    static final int AUDIO_DEVICE_OUT_BLUETOOTH_A2DP_HEADPHONES = 256;
    static final int AUDIO_DEVICE_OUT_BLUETOOTH_A2DP_SPEAKER = 512;
    static final int AUDIO_DEVICE_OUT_BLUETOOTH_SCO = 16;
    static final int AUDIO_DEVICE_OUT_BLUETOOTH_SCO_CARKIT = 64;
    static final int AUDIO_DEVICE_OUT_BLUETOOTH_SCO_HEADSET = 32;
    static final int AUDIO_DEVICE_OUT_EARPIECE = 1;
    static final int AUDIO_DEVICE_OUT_SPEAKER = 2;
    static final int AUDIO_DEVICE_OUT_WIRED_HEADPHONE = 8;
    static final int AUDIO_DEVICE_OUT_WIRED_HEADSET = 4;
    public static final int AUDIO_MANAGER_ACTIVE_NONE = 0;
    public static final int AUDIO_MANAGER_ACTIVE_RING = 2;
    public static final int AUDIO_MANAGER_ACTIVE_VOICECALL = 1;
    static final String AUDIO_PARAMETER_STREAM_ROUTING = "routing";
    public static final String CONNECTDEVICE_DEVICENAME = "CONNECTDEVICE_DEVICENAME";
    public static final String CONNECTDEVICE_RESULT_DEVICENAME = "CONNECTDEVICE_RESULT_DEVICENAME";
    public static final String DEVICE_BLUETOOTHHEADSET = "DEVICE_BLUETOOTHHEADSET";
    public static final String DEVICE_EARPHONE = "DEVICE_EARPHONE";
    public static final String DEVICE_NONE = "DEVICE_NONE";
    public static final String DEVICE_SPEAKERPHONE = "DEVICE_SPEAKERPHONE";
    public static final int DEVICE_STATUS_CONNECTED = 2;
    public static final int DEVICE_STATUS_CONNECTING = 1;
    public static final int DEVICE_STATUS_DISCONNECTED = 0;
    public static final int DEVICE_STATUS_DISCONNECTING = 3;
    public static final int DEVICE_STATUS_ERROR = -1;
    public static final int DEVICE_STATUS_UNCHANGEABLE = 4;
    public static final String DEVICE_WIREDHEADSET = "DEVICE_WIREDHEADSET";
    public static final int EARACTION_AWAY = 0;
    public static final int EARACTION_CLOSE = 1;
    public static final String EXTRA_DATA_AVAILABLEDEVICE_LIST = "EXTRA_DATA_AVAILABLEDEVICE_LIST";
    public static final String EXTRA_DATA_CONNECTEDDEVICE = "EXTRA_DATA_CONNECTEDDEVICE";
    public static final String EXTRA_DATA_DEVICECONFIG = "EXTRA_DATA_DEVICECONFIG";
    public static final String EXTRA_DATA_IF_HAS_BLUETOOTH_THIS_IS_NAME = "EXTRA_DATA_IF_HAS_BLUETOOTH_THIS_IS_NAME";
    public static final String EXTRA_DATA_PREV_CONNECTEDDEVICE = "EXTRA_DATA_PREV_CONNECTEDDEVICE";
    public static final String EXTRA_DATA_ROUTESWITCHEND_DEV = "EXTRA_DATA_ROUTESWITCHEND_DEV";
    public static final String EXTRA_DATA_ROUTESWITCHEND_TIME = "EXTRA_DATA_ROUTESWITCHEND_TIME";
    public static final String EXTRA_DATA_ROUTESWITCHSTART_FROM = "EXTRA_DATA_ROUTESWITCHSTART_FROM";
    public static final String EXTRA_DATA_ROUTESWITCHSTART_TO = "EXTRA_DATA_ROUTESWITCHSTART_TO";
    public static final String EXTRA_DATA_STREAMTYPE = "EXTRA_DATA_STREAMTYPE";
    public static final String EXTRA_EARACTION = "EXTRA_EARACTION";
    public static final int FORCE_ANALOG_DOCK = 8;
    public static final int FORCE_BT_A2DP = 4;
    public static final int FORCE_BT_CAR_DOCK = 6;
    public static final int FORCE_BT_DESK_DOCK = 7;
    public static final int FORCE_BT_SCO = 3;
    public static final int FORCE_DEFAULT = 0;
    public static final int FORCE_DIGITAL_DOCK = 9;
    public static final int FORCE_HEADPHONES = 2;
    public static final int FORCE_NONE = 0;
    public static final int FORCE_NO_BT_A2DP = 10;
    public static final int FORCE_SPEAKER = 1;
    public static final int FORCE_WIRED_ACCESSORY = 5;
    public static final int FOR_COMMUNICATION = 0;
    public static final int FOR_DOCK = 3;
    public static final int FOR_MEDIA = 1;
    public static final int FOR_RECORD = 2;
    public static final String GETCONNECTEDDEVICE_RESULT_LIST = "GETCONNECTEDDEVICE_REULT_LIST";
    public static final String GETCONNECTINGDEVICE_RESULT_LIST = "GETCONNECTINGDEVICE_REULT_LIST";
    public static final String ISDEVICECHANGABLED_RESULT_ISCHANGABLED = "ISDEVICECHANGABLED_REULT_ISCHANGABLED";
    public static boolean IsEarPhoneSupported = false;
    public static boolean IsMusicScene = false;
    public static boolean IsUpdateSceneFlag = false;
    public static final int MODE_MUSIC_PLAYBACK = 2;
    public static final int MODE_MUSIC_PLAY_RECORD = 1;
    public static final int MODE_MUSIC_PLAY_RECORD_HIGH_QUALITY = 3;
    public static final int MODE_MUSIC_PLAY_RECORD_LOW_QUALITY = 5;
    public static final int MODE_VOICE_CHAT = 0;
    public static final int MODE_VOICE_PLAYBACK = 4;
    public static final String MUSIC_CONFIG = "DEVICE_SPEAKERPHONE;DEVICE_WIREDHEADSET;DEVICE_BLUETOOTHHEADSET;";
    public static final String NOTIFY_DEVICECHANGABLE_UPDATE = "NOTIFY_DEVICECHANGABLE_UPDATE";
    public static final String NOTIFY_DEVICECHANGABLE_UPDATE_DATE = "NOTIFY_DEVICECHANGABLE_UPDATE_DATE";
    public static final String NOTIFY_DEVICELIST_UPDATE = "NOTIFY_DEVICELISTUPDATE";
    public static final String NOTIFY_RING_COMPLETION = "NOTIFY_RING_COMPLETION";
    public static final String NOTIFY_ROUTESWITCHEND = "NOTIFY_ROUTESWITCHEND";
    public static final String NOTIFY_ROUTESWITCHSTART = "NOTIFY_ROUTESWITCHSTART";
    public static final String NOTIFY_SERVICE_STATE = "NOTIFY_SERVICE_STATE";
    public static final String NOTIFY_SERVICE_STATE_DATE = "NOTIFY_SERVICE_STATE_DATE";
    public static final String NOTIFY_STREAMTYPE_UPDATE = "NOTIFY_STREAMTYPE_UPDATE";
    private static final int NUM_FORCE_CONFIG = 11;
    private static final int NUM_FORCE_USE = 4;
    public static final String OPERATION_CONNECTDEVICE = "OPERATION_CONNECTDEVICE";
    public static final String OPERATION_CONNECT_HIGHEST_PRIORITY_DEVICE = "OPERATION_CONNECT_HIGHEST_PRIORITY_DEVICE";
    public static final String OPERATION_EARACTION = "OPERATION_EARACTION";
    public static final String OPERATION_GETCONNECTEDDEVICE = "OPERATION_GETCONNECTEDDEVICE";
    public static final String OPERATION_GETCONNECTINGDEVICE = "OPERATION_GETCONNECTINGDEVICE";
    public static final String OPERATION_GETDEVICELIST = "OPERATION_GETDEVICELIST";
    public static final String OPERATION_GETSTREAMTYPE = "OPERATION_GETSTREAMTYPE";
    public static final String OPERATION_ISDEVICECHANGABLED = "OPERATION_ISDEVICECHANGABLED";
    public static final String OPERATION_RECOVER_AUDIO_FOCUS = "OPERATION_RECOVER_AUDIO_FOCUS";
    public static final String OPERATION_REGISTERAUDIOSESSION = "OPERATION_REGISTERAUDIOSESSION";
    public static final String OPERATION_REQUEST_RELEASE_AUDIO_FOCUS = "OPERATION_REQUEST_RELEASE_AUDIO_FOCUS";
    public static final String OPERATION_STARTRING = "OPERATION_STARTRING";
    public static final String OPERATION_STARTSERVICE = "OPERATION_STARTSERVICE";
    public static final String OPERATION_STOPRING = "OPERATION_STOPRING";
    public static final String OPERATION_STOPSERVICE = "OPERATION_STOPSERVICE";
    public static final String OPERATION_VOICECALL_AUDIOPARAM_CHANGED = "OPERATION_VOICECALL_AUDIOPARAM_CHANGED";
    public static final String OPERATION_VOICECALL_POSTPROCESS = "OPERATION_VOICECALL_POSTROCESS";
    public static final String OPERATION_VOICECALL_PREPROCESS = "OPERATION_VOICECALL_PREPROCESS";
    public static final String PARAM_DEVICE = "PARAM_DEVICE";
    public static final String PARAM_ERROR = "PARAM_ERROR";
    public static final String PARAM_ISHOSTSIDE = "PARAM_ISHOSTSIDE";
    public static final String PARAM_MODEPOLICY = "PARAM_MODEPOLICY";
    public static final String PARAM_OPERATION = "PARAM_OPERATION";
    public static final String PARAM_RES_ERRCODE = "PARAM_RES_ERRCODE";
    public static final String PARAM_RING_DATASOURCE = "PARAM_RING_DATASOURCE";
    public static final String PARAM_RING_FILEPATH = "PARAM_RING_FILEPATH";
    public static final String PARAM_RING_LOOP = "PARAM_RING_LOOP";
    public static final String PARAM_RING_LOOPCOUNT = "PARAM_RING_LOOPCOUNT";
    public static final String PARAM_RING_MODE = "PARAM_RING_MODE";
    public static final String PARAM_RING_RSID = "PARAM_RING_RSID";
    public static final String PARAM_RING_URI = "PARAM_RING_URI";
    public static final String PARAM_RING_USERDATA_STRING = "PARAM_RING_USERDATA_STRING";
    public static final String PARAM_SESSIONID = "PARAM_SESSIONID";
    public static final String PARAM_STATUS = "PARAM_STATUS";
    public static final String PARAM_STREAMTYPE = "PARAM_STREAMTYPE";
    public static final String REGISTERAUDIOSESSION_ISREGISTER = "REGISTERAUDIOSESSION_ISREGISTER";
    public static final int RES_ERRCODE_DEVICE_BTCONNCECTED_TIMEOUT = 10;
    public static final int RES_ERRCODE_DEVICE_NOT_VISIABLE = 8;
    public static final int RES_ERRCODE_DEVICE_UNCHANGEABLE = 9;
    public static final int RES_ERRCODE_DEVICE_UNKOWN = 7;
    public static final int RES_ERRCODE_NONE = 0;
    public static final int RES_ERRCODE_RING_NOT_EXIST = 5;
    public static final int RES_ERRCODE_SERVICE_OFF = 1;
    public static final int RES_ERRCODE_STOPRING_INTERRUPT = 4;
    public static final int RES_ERRCODE_VOICECALLPOST_INTERRUPT = 6;
    public static final int RES_ERRCODE_VOICECALL_EXIST = 2;
    public static final int RES_ERRCODE_VOICECALL_NOT_EXIST = 3;
    public static final String VIDEO_CONFIG = "DEVICE_EARPHONE;DEVICE_SPEAKERPHONE;DEVICE_BLUETOOTHHEADSET;DEVICE_WIREDHEADSET;";
    public static final String VOICECALL_CONFIG = "DEVICE_SPEAKERPHONE;DEVICE_EARPHONE;DEVICE_BLUETOOTHHEADSET;DEVICE_WIREDHEADSET;";
    public static boolean enableDeviceSwitchFlag = true;
    Context _context;
    TraeAudioManagerLooper mTraeAudioManagerLooper;
    static ReentrantLock _glock = new ReentrantLock();
    static TraeAudioManager _ginstance = null;
    static int _gHostProcessId = -1;
    static final String[] forceName = {"FORCE_NONE", "FORCE_SPEAKER", "FORCE_HEADPHONES", "FORCE_BT_SCO", "FORCE_BT_A2DP", "FORCE_WIRED_ACCESSORY", "FORCE_BT_CAR_DOCK", "FORCE_BT_DESK_DOCK", "FORCE_ANALOG_DOCK", "FORCE_NO_BT_A2DP", "FORCE_DIGITAL_DOCK"};
    AudioManager _am = null;
    int _activeMode = 0;
    int _prevMode = 0;
    int _streamType = 0;
    int _modePolicy = -1;
    boolean IsBluetoothA2dpExisted = true;
    TraeAudioSessionHost _audioSessionHost = null;
    DeviceConfigManager _deviceConfigManager = null;
    BluetoohHeadsetCheckInterface _bluetoothCheck = null;
    String sessionConnectedDev = DEVICE_NONE;
    ReentrantLock _lock = new ReentrantLock();
    switchThread _switchThread = null;

    @TargetApi(11)
    public class BluetoohHeadsetCheck extends BluetoohHeadsetCheckInterface implements BluetoothProfile.ServiceListener {
        BluetoothAdapter _adapter;
        Context _ctx;
        DeviceConfigManager _devCfg;
        BluetoothProfile _profile;
        private final ReentrantLock _profileLock;

        public BluetoohHeadsetCheck() {
            super();
            this._ctx = null;
            this._devCfg = null;
            this._adapter = null;
            this._profile = null;
            this._profileLock = new ReentrantLock();
        }

        @Override // com.tencent.rtmp.sharp.jni.TraeAudioManager.BluetoohHeadsetCheckInterface
        public void _addAction(IntentFilter intentFilter) {
            if (QLog.isColorLevel()) {
                QLog.m85778w("TRAE", 2, MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + interfaceDesc() + " _addAction");
            }
            intentFilter.addAction("android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED");
            intentFilter.addAction("android.media.ACTION_SCO_AUDIO_STATE_UPDATED");
            intentFilter.addAction("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED");
        }

        @Override // com.tencent.rtmp.sharp.jni.TraeAudioManager.BluetoohHeadsetCheckInterface
        public void _onReceive(Context context, Intent intent) {
            if ("android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
                int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.CONNECTION_STATE", -1);
                int intExtra2 = intent.getIntExtra("android.bluetooth.adapter.extra.PREVIOUS_CONNECTION_STATE", -1);
                BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                if (QLog.isColorLevel()) {
                    QLog.m85778w("TRAE", 2, "BT ACTION_CONNECTION_STATE_CHANGED|   EXTRA_CONNECTION_STATE " + getBTAdapterConnectionState(intExtra));
                }
                if (QLog.isColorLevel()) {
                    QLog.m85778w("TRAE", 2, "    EXTRA_PREVIOUS_CONNECTION_STATE " + getBTAdapterConnectionState(intExtra2));
                }
                if (QLog.isColorLevel()) {
                    StringBuilder sb = new StringBuilder("    EXTRA_DEVICE ");
                    sb.append(bluetoothDevice);
                    String name = MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
                    sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                    if (bluetoothDevice != null) {
                        name = bluetoothDevice.getName();
                    }
                    sb.append(name);
                    QLog.m85778w("TRAE", 2, sb.toString());
                }
                if (intExtra != 2) {
                    if (intExtra == 0) {
                        this._devCfg.setVisible(TraeAudioManager.DEVICE_BLUETOOTHHEADSET, false);
                        return;
                    }
                    return;
                }
                if (QLog.isColorLevel()) {
                    QLog.m85778w("TRAE", 2, "   dev:" + bluetoothDevice.getName() + " connected,start sco...");
                }
                this._devCfg.setVisible(TraeAudioManager.DEVICE_BLUETOOTHHEADSET, true);
                this._devCfg.setBluetoothName(bluetoothDevice != null ? bluetoothDevice.getName() : "unkown");
                return;
            }
            if (!"android.media.ACTION_SCO_AUDIO_STATE_UPDATED".equals(intent.getAction())) {
                if ("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
                    BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
                    int iM145010d = jj5.m145010d(defaultAdapter, 2);
                    if (iM145010d == 0) {
                        QLog.m85778w("TRAE", 2, "BluetoothA2dp STATE_DISCONNECTED");
                        TraeAudioManager.this.IsBluetoothA2dpExisted = false;
                        return;
                    } else if (iM145010d == 2) {
                        QLog.m85778w("TRAE", 2, "BluetoothA2dp STATE_CONNECTED");
                        TraeAudioManager.this.IsBluetoothA2dpExisted = true;
                        return;
                    } else {
                        QLog.m85778w("TRAE", 2, "BluetoothA2dp" + jj5.m145010d(defaultAdapter, 2));
                        return;
                    }
                }
                return;
            }
            int intExtra3 = intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1);
            int intExtra4 = intent.getIntExtra("android.media.extra.SCO_AUDIO_PREVIOUS_STATE", -1);
            BluetoothDevice bluetoothDevice2 = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            if (QLog.isColorLevel()) {
                QLog.m85778w("TRAE", 2, "BT ACTION_SCO_AUDIO_STATE_UPDATED|   EXTRA_CONNECTION_STATE  dev:" + bluetoothDevice2);
            }
            if (QLog.isColorLevel()) {
                QLog.m85778w("TRAE", 2, "   EXTRA_SCO_AUDIO_STATE " + getSCOAudioStateExtraString(intExtra3));
            }
            if (QLog.isColorLevel()) {
                QLog.m85778w("TRAE", 2, "   EXTRA_SCO_AUDIO_PREVIOUS_STATE " + getSCOAudioStateExtraString(intExtra4));
            }
        }

        @Override // com.tencent.rtmp.sharp.jni.TraeAudioManager.BluetoohHeadsetCheckInterface
        @TargetApi(11)
        public boolean init(Context context, DeviceConfigManager deviceConfigManager) {
            AudioDeviceInterface.LogTraceEntry("");
            if (context == null || deviceConfigManager == null) {
                if (QLog.isColorLevel()) {
                    QLog.m85773e("TRAE", 2, " err ctx==null||_devCfg==null");
                }
                return false;
            }
            this._ctx = context;
            this._devCfg = deviceConfigManager;
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            this._adapter = defaultAdapter;
            if (defaultAdapter == null) {
                if (QLog.isColorLevel()) {
                    QLog.m85773e("TRAE", 2, " err getDefaultAdapter fail!");
                }
                return false;
            }
            this._profileLock.lock();
            try {
                if (!this._adapter.isEnabled() || this._profile != null || this._adapter.getProfileProxy(this._ctx, this, 1)) {
                    this._profileLock.unlock();
                    AudioDeviceInterface.LogTraceExit();
                    return true;
                }
                if (QLog.isColorLevel()) {
                    QLog.m85773e("TRAE", 2, "BluetoohHeadsetCheck: getProfileProxy HEADSET fail!");
                }
                this._profileLock.unlock();
                return false;
            } catch (Throwable th) {
                this._profileLock.unlock();
                throw th;
            }
        }

        @Override // com.tencent.rtmp.sharp.jni.TraeAudioManager.BluetoohHeadsetCheckInterface
        public String interfaceDesc() {
            return "BluetoohHeadsetCheck";
        }

        @Override // com.tencent.rtmp.sharp.jni.TraeAudioManager.BluetoohHeadsetCheckInterface
        public boolean isConnected() {
            List<BluetoothDevice> connectedDevices;
            this._profileLock.lock();
            try {
                BluetoothProfile bluetoothProfile = this._profile;
                boolean z = false;
                if (bluetoothProfile != null && (connectedDevices = bluetoothProfile.getConnectedDevices()) != null && connectedDevices.size() > 0) {
                    z = true;
                }
                return z;
            } finally {
                this._profileLock.unlock();
            }
        }

        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        @TargetApi(11)
        public void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
            int connectionState;
            AudioDeviceInterface.LogTraceEntry("_profile:" + this._profile + " profile:" + i + " proxy:" + bluetoothProfile);
            if (i == 1) {
                this._profileLock.lock();
                try {
                    BluetoothProfile bluetoothProfile2 = this._profile;
                    if (bluetoothProfile2 != null && bluetoothProfile2 != bluetoothProfile) {
                        if (QLog.isColorLevel()) {
                            QLog.m85778w("TRAE", 2, "BluetoohHeadsetCheck: HEADSET Connected proxy:" + bluetoothProfile + " _profile:" + this._profile);
                        }
                        this._adapter.closeProfileProxy(1, this._profile);
                        this._profile = null;
                    }
                    this._profile = bluetoothProfile;
                    List<BluetoothDevice> connectedDevices = bluetoothProfile != null ? bluetoothProfile.getConnectedDevices() : null;
                    if (connectedDevices != null && this._profile != null) {
                        if (QLog.isColorLevel()) {
                            QLog.m85778w("TRAE", 2, "TRAEBluetoohProxy: HEADSET Connected devs:" + connectedDevices.size() + " _profile:" + this._profile);
                        }
                        for (int i2 = 0; i2 < connectedDevices.size(); i2++) {
                            BluetoothDevice bluetoothDevice = connectedDevices.get(i2);
                            try {
                                BluetoothProfile bluetoothProfile3 = this._profile;
                                connectionState = bluetoothProfile3 != null ? bluetoothProfile3.getConnectionState(bluetoothDevice) : 0;
                            } catch (Exception e) {
                                if (QLog.isColorLevel()) {
                                    QLog.m85773e("TRAE", 2, "get bluetooth connection state failed." + e.getMessage());
                                }
                            }
                            if (connectionState == 2) {
                                this._devCfg.setBluetoothName(bluetoothDevice.getName());
                            }
                            if (QLog.isColorLevel()) {
                                QLog.m85778w("TRAE", 2, "   " + i2 + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + bluetoothDevice.getName() + " ConnectionState:" + connectionState);
                            }
                        }
                    }
                    this._profileLock.unlock();
                    if (this._devCfg != null) {
                        DeviceConfigManager deviceConfigManager = TraeAudioManager.this._deviceConfigManager;
                        if (TextUtils.isEmpty(deviceConfigManager != null ? deviceConfigManager.getBluetoothName() : null)) {
                            this._devCfg.setVisible(TraeAudioManager.DEVICE_BLUETOOTHHEADSET, false);
                        } else {
                            boolean zIsConnected = isConnected();
                            DeviceConfigManager deviceConfigManager2 = this._devCfg;
                            if (zIsConnected) {
                                deviceConfigManager2.setVisible(TraeAudioManager.DEVICE_BLUETOOTHHEADSET, true);
                                TraeAudioManager.this.checkDevicePlug(TraeAudioManager.DEVICE_BLUETOOTHHEADSET, true);
                            } else {
                                deviceConfigManager2.setVisible(TraeAudioManager.DEVICE_BLUETOOTHHEADSET, false);
                            }
                        }
                    }
                } catch (Throwable th) {
                    this._profileLock.unlock();
                    throw th;
                }
            }
            AudioDeviceInterface.LogTraceExit();
        }

        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        @TargetApi(11)
        public void onServiceDisconnected(int i) {
            AudioDeviceInterface.LogTraceEntry("_profile:" + this._profile + " profile:" + i);
            if (i == 1) {
                if (QLog.isColorLevel()) {
                    QLog.m85778w("TRAE", 2, "TRAEBluetoohProxy: HEADSET Disconnected");
                }
                if (isConnected()) {
                    TraeAudioManager.this.checkDevicePlug(TraeAudioManager.DEVICE_BLUETOOTHHEADSET, false);
                }
                this._profileLock.lock();
                try {
                    BluetoothProfile bluetoothProfile = this._profile;
                    if (bluetoothProfile != null) {
                        this._adapter.closeProfileProxy(1, bluetoothProfile);
                        this._profile = null;
                    }
                    this._profileLock.unlock();
                } catch (Throwable th) {
                    this._profileLock.unlock();
                    throw th;
                }
            }
            AudioDeviceInterface.LogTraceExit();
        }

        @Override // com.tencent.rtmp.sharp.jni.TraeAudioManager.BluetoohHeadsetCheckInterface
        public void release() {
            AudioDeviceInterface.LogTraceEntry("_profile:" + this._profile);
            this._profileLock.lock();
            try {
                try {
                    BluetoothAdapter bluetoothAdapter = this._adapter;
                    if (bluetoothAdapter != null) {
                        BluetoothProfile bluetoothProfile = this._profile;
                        if (bluetoothProfile != null) {
                            bluetoothAdapter.closeProfileProxy(1, bluetoothProfile);
                        }
                        this._profile = null;
                    }
                } catch (Exception e) {
                    if (QLog.isColorLevel()) {
                        QLog.m85778w("TRAE", 2, " closeProfileProxy:e:" + e.getMessage());
                    }
                }
                this._profileLock.unlock();
                AudioDeviceInterface.LogTraceExit();
            } catch (Throwable th) {
                this._profileLock.unlock();
                throw th;
            }
        }
    }

    public class BluetoohHeadsetCheckFake extends BluetoohHeadsetCheckInterface {
        public BluetoohHeadsetCheckFake() {
            super();
        }

        @Override // com.tencent.rtmp.sharp.jni.TraeAudioManager.BluetoohHeadsetCheckInterface
        public void _addAction(IntentFilter intentFilter) {
        }

        @Override // com.tencent.rtmp.sharp.jni.TraeAudioManager.BluetoohHeadsetCheckInterface
        public void _onReceive(Context context, Intent intent) {
        }

        @Override // com.tencent.rtmp.sharp.jni.TraeAudioManager.BluetoohHeadsetCheckInterface
        public boolean init(Context context, DeviceConfigManager deviceConfigManager) {
            return true;
        }

        @Override // com.tencent.rtmp.sharp.jni.TraeAudioManager.BluetoohHeadsetCheckInterface
        public String interfaceDesc() {
            return "BluetoohHeadsetCheckFake";
        }

        @Override // com.tencent.rtmp.sharp.jni.TraeAudioManager.BluetoohHeadsetCheckInterface
        public boolean isConnected() {
            return false;
        }

        @Override // com.tencent.rtmp.sharp.jni.TraeAudioManager.BluetoohHeadsetCheckInterface
        public void release() {
        }
    }

    public class BluetoohHeadsetCheckFor2x extends BluetoohHeadsetCheckInterface {
        public static final String ACTION_BLUETOOTHHEADSET_AUDIO_STATE_CHANGED = "android.bluetooth.headset.action.AUDIO_STATE_CHANGED";
        public static final String ACTION_BLUETOOTHHEADSET_STATE_CHANGED = "android.bluetooth.headset.action.STATE_CHANGED";
        public static final int AUDIO_STATE_CONNECTED = 1;
        public static final int AUDIO_STATE_DISCONNECTED = 0;
        static final int STATE_CONNECTED = 2;
        static final int STATE_DISCONNECTED = 0;
        Class<?> BluetoothHeadsetClass;
        Object BluetoothHeadsetObj;
        Class<?> ListenerClass;
        Context _ctx;
        DeviceConfigManager _devCfg;
        Method getCurrentHeadsetMethod;

        public BluetoohHeadsetCheckFor2x() {
            super();
            this.BluetoothHeadsetClass = null;
            this.ListenerClass = null;
            this.BluetoothHeadsetObj = null;
            this.getCurrentHeadsetMethod = null;
            this._ctx = null;
            this._devCfg = null;
        }

        @Override // com.tencent.rtmp.sharp.jni.TraeAudioManager.BluetoohHeadsetCheckInterface
        public void _addAction(IntentFilter intentFilter) {
            if (QLog.isColorLevel()) {
                QLog.m85778w("TRAE", 2, MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + interfaceDesc() + " _addAction");
            }
            intentFilter.addAction(ACTION_BLUETOOTHHEADSET_AUDIO_STATE_CHANGED);
            intentFilter.addAction(ACTION_BLUETOOTHHEADSET_STATE_CHANGED);
        }

        @Override // com.tencent.rtmp.sharp.jni.TraeAudioManager.BluetoohHeadsetCheckInterface
        public void _onReceive(Context context, Intent intent) {
            if (ACTION_BLUETOOTHHEADSET_AUDIO_STATE_CHANGED.equals(intent.getAction())) {
                int intExtra = intent.getIntExtra("android.bluetooth.headset.extra.STATE", -2);
                int intExtra2 = intent.getIntExtra("android.bluetooth.headset.extra.PREVIOUS_STATE", -2);
                int intExtra3 = intent.getIntExtra("android.bluetooth.headset.extra.AUDIO_STATE", -2);
                if (QLog.isColorLevel()) {
                    QLog.m85778w("TRAE", 2, "++ AUDIO_STATE_CHANGED|  STATE " + intExtra);
                }
                if (QLog.isColorLevel()) {
                    QLog.m85778w("TRAE", 2, "       PREVIOUS_STATE " + intExtra2);
                }
                if (QLog.isColorLevel()) {
                    QLog.m85778w("TRAE", 2, "       AUDIO_STATE " + intExtra3);
                }
                if (intExtra3 == 2) {
                    this._devCfg.setVisible(TraeAudioManager.DEVICE_BLUETOOTHHEADSET, true);
                    return;
                } else {
                    if (intExtra3 == 0) {
                        this._devCfg.setVisible(TraeAudioManager.DEVICE_BLUETOOTHHEADSET, false);
                        return;
                    }
                    return;
                }
            }
            if (ACTION_BLUETOOTHHEADSET_STATE_CHANGED.equals(intent.getAction())) {
                int intExtra4 = intent.getIntExtra("android.bluetooth.headset.extra.STATE", -2);
                int intExtra5 = intent.getIntExtra("android.bluetooth.headset.extra.PREVIOUS_STATE", -2);
                int intExtra6 = intent.getIntExtra("android.bluetooth.headset.extra.AUDIO_STATE", -2);
                if (QLog.isColorLevel()) {
                    QLog.m85778w("TRAE", 2, "++ STATE_CHANGED|  STATE " + intExtra4);
                }
                if (QLog.isColorLevel()) {
                    QLog.m85778w("TRAE", 2, "       PREVIOUS_STATE " + intExtra5);
                }
                if (QLog.isColorLevel()) {
                    QLog.m85778w("TRAE", 2, "       AUDIO_STATE " + intExtra6);
                }
                if (intExtra6 == 2) {
                    this._devCfg.setVisible(TraeAudioManager.DEVICE_BLUETOOTHHEADSET, true);
                } else if (intExtra6 == 0) {
                    this._devCfg.setVisible(TraeAudioManager.DEVICE_BLUETOOTHHEADSET, false);
                }
            }
        }

        @Override // com.tencent.rtmp.sharp.jni.TraeAudioManager.BluetoohHeadsetCheckInterface
        public boolean init(Context context, DeviceConfigManager deviceConfigManager) {
            AudioDeviceInterface.LogTraceEntry("");
            this._ctx = context;
            this._devCfg = deviceConfigManager;
            if (context == null || deviceConfigManager == null) {
                return false;
            }
            try {
                this.BluetoothHeadsetClass = Class.forName("android.bluetooth.BluetoothHeadset");
            } catch (Exception unused) {
                if (QLog.isColorLevel()) {
                    QLog.m85773e("TRAE", 2, "BTLooperThread BluetoothHeadset class not found");
                }
            }
            if (this.BluetoothHeadsetClass == null) {
                return false;
            }
            try {
                this.ListenerClass = Class.forName("android.bluetooth.BluetoothHeadset$ServiceListener");
            } catch (Exception e) {
                if (QLog.isColorLevel()) {
                    QLog.m85773e("TRAE", 2, "BTLooperThread BluetoothHeadset.ServiceListener class not found:" + e);
                }
            }
            try {
                this.getCurrentHeadsetMethod = this.BluetoothHeadsetClass.getDeclaredMethod("getCurrentHeadset", null);
            } catch (NoSuchMethodException unused2) {
                if (QLog.isColorLevel()) {
                    QLog.m85773e("TRAE", 2, "BTLooperThread BluetoothHeadset method getCurrentHeadset NoSuchMethodException");
                }
            }
            if (this.getCurrentHeadsetMethod == null) {
                return false;
            }
            try {
                this.BluetoothHeadsetObj = this.BluetoothHeadsetClass.getConstructor(Context.class, this.ListenerClass).newInstance(context, null);
            } catch (IllegalAccessException unused3) {
                if (QLog.isColorLevel()) {
                    QLog.m85773e("TRAE", 2, "BTLooperThread BluetoothHeadset getConstructor IllegalAccessException");
                }
            } catch (IllegalArgumentException unused4) {
                if (QLog.isColorLevel()) {
                    QLog.m85773e("TRAE", 2, "BTLooperThread BluetoothHeadset getConstructor IllegalArgumentException");
                }
            } catch (InstantiationException unused5) {
                if (QLog.isColorLevel()) {
                    QLog.m85773e("TRAE", 2, "BTLooperThread BluetoothHeadset getConstructor InstantiationException");
                }
            } catch (NoSuchMethodException unused6) {
                if (QLog.isColorLevel()) {
                    QLog.m85773e("TRAE", 2, "BTLooperThread BluetoothHeadset getConstructor NoSuchMethodException");
                }
            } catch (InvocationTargetException unused7) {
                if (QLog.isColorLevel()) {
                    QLog.m85773e("TRAE", 2, "BTLooperThread BluetoothHeadset getConstructor InvocationTargetException");
                }
            }
            if (this.BluetoothHeadsetObj == null) {
                return false;
            }
            this._devCfg.setVisible(TraeAudioManager.DEVICE_BLUETOOTHHEADSET, isConnected());
            boolean zIsConnected = isConnected();
            DeviceConfigManager deviceConfigManager2 = this._devCfg;
            if (zIsConnected) {
                deviceConfigManager2.setVisible(TraeAudioManager.DEVICE_BLUETOOTHHEADSET, true);
                TraeAudioManager.this.checkDevicePlug(TraeAudioManager.DEVICE_BLUETOOTHHEADSET, true);
            } else {
                deviceConfigManager2.setVisible(TraeAudioManager.DEVICE_BLUETOOTHHEADSET, false);
            }
            AudioDeviceInterface.LogTraceExit();
            return true;
        }

        @Override // com.tencent.rtmp.sharp.jni.TraeAudioManager.BluetoohHeadsetCheckInterface
        public String interfaceDesc() {
            return "BluetoohHeadsetCheckFor2x";
        }

        @Override // com.tencent.rtmp.sharp.jni.TraeAudioManager.BluetoohHeadsetCheckInterface
        public boolean isConnected() {
            Method method = this.getCurrentHeadsetMethod;
            if (method == null || method == null) {
                return false;
            }
            Object objInvoke = null;
            try {
                objInvoke = method.invoke(this.BluetoothHeadsetObj, null);
            } catch (IllegalAccessException unused) {
                if (QLog.isColorLevel()) {
                    QLog.m85778w("TRAE", 2, "BTLooperThread BluetoothHeadset method getCurrentHeadset IllegalAccessException");
                }
            } catch (IllegalArgumentException unused2) {
                if (QLog.isColorLevel()) {
                    QLog.m85778w("TRAE", 2, "BTLooperThread BluetoothHeadset method getCurrentHeadset IllegalArgumentException");
                }
            } catch (InvocationTargetException unused3) {
                if (QLog.isColorLevel()) {
                    QLog.m85778w("TRAE", 2, "BTLooperThread BluetoothHeadset method getCurrentHeadset InvocationTargetException");
                }
            }
            if (QLog.isColorLevel()) {
                QLog.m85778w("TRAE", 2, "BTLooperThread BluetoothHeadset method getCurrentHeadset res:".concat(objInvoke != null ? " Y" : "N"));
            }
            return objInvoke != null;
        }

        @Override // com.tencent.rtmp.sharp.jni.TraeAudioManager.BluetoohHeadsetCheckInterface
        public void release() {
            Method declaredMethod;
            AudioDeviceInterface.LogTraceEntry("");
            if (this.BluetoothHeadsetObj == null) {
                return;
            }
            try {
                declaredMethod = this.BluetoothHeadsetClass.getDeclaredMethod("close", null);
            } catch (NoSuchMethodException unused) {
                if (QLog.isColorLevel()) {
                    QLog.m85773e("TRAE", 2, "BTLooperThread _uninitHeadsetfor2x method close NoSuchMethodException");
                }
                declaredMethod = null;
            }
            if (declaredMethod == null) {
                return;
            }
            try {
                declaredMethod.invoke(this.BluetoothHeadsetObj, null);
            } catch (Exception e) {
                if (QLog.isColorLevel()) {
                    QLog.m85773e("TRAE", 2, "close bluetooth headset failed." + e.getMessage());
                }
            }
            this.BluetoothHeadsetClass = null;
            this.ListenerClass = null;
            this.BluetoothHeadsetObj = null;
            this.getCurrentHeadsetMethod = null;
            AudioDeviceInterface.LogTraceExit();
        }
    }

    public abstract class BluetoohHeadsetCheckInterface {
        public BluetoohHeadsetCheckInterface() {
        }

        public abstract void _addAction(IntentFilter intentFilter);

        public abstract void _onReceive(Context context, Intent intent);

        public void addAction(IntentFilter intentFilter) {
            intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
            intentFilter.addAction("android.bluetooth.device.action.ACL_CONNECTED");
            intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
            _addAction(intentFilter);
        }

        public String getBTActionStateChangedExtraString(int i) {
            String str;
            switch (i) {
                case 10:
                    str = "STATE_OFF";
                    break;
                case 11:
                    str = "STATE_TURNING_ON";
                    break;
                case 12:
                    str = "STATE_ON";
                    break;
                case 13:
                    str = "STATE_TURNING_OFF";
                    break;
                default:
                    str = CardButtonsShowAndHideType.unknow;
                    break;
            }
            return str + ":" + i;
        }

        public String getBTAdapterConnectionState(int i) {
            String str;
            if (i == 0) {
                str = "STATE_DISCONNECTED";
            } else if (i == 1) {
                str = "STATE_CONNECTING";
            } else if (i != 2) {
                str = i != 3 ? CardButtonsShowAndHideType.unknow : "STATE_DISCONNECTING";
            } else {
                str = "STATE_CONNECTED";
            }
            return str + ":" + i;
        }

        public String getBTHeadsetAudioState(int i) {
            String str;
            if (i == 10) {
                str = "STATE_AUDIO_DISCONNECTED";
            } else if (i != 12) {
                str = "unknow:" + i;
            } else {
                str = "STATE_AUDIO_CONNECTED";
            }
            return str + ":" + i;
        }

        public String getBTHeadsetConnectionState(int i) {
            String str;
            if (i == 0) {
                str = "STATE_DISCONNECTED";
            } else if (i == 1) {
                str = "STATE_CONNECTING";
            } else if (i != 2) {
                str = i != 3 ? CardButtonsShowAndHideType.unknow : "STATE_DISCONNECTING";
            } else {
                str = "STATE_CONNECTED";
            }
            return str + ":" + i;
        }

        public String getSCOAudioStateExtraString(int i) {
            String str;
            if (i == -1) {
                str = "SCO_AUDIO_STATE_ERROR";
            } else if (i == 0) {
                str = "SCO_AUDIO_STATE_DISCONNECTED";
            } else if (i != 1) {
                str = i != 2 ? CardButtonsShowAndHideType.unknow : "SCO_AUDIO_STATE_CONNECTING";
            } else {
                str = "SCO_AUDIO_STATE_CONNECTED";
            }
            return str + ":" + i;
        }

        public abstract boolean init(Context context, DeviceConfigManager deviceConfigManager);

        public abstract String interfaceDesc();

        public abstract boolean isConnected();

        public void onReceive(Context context, Intent intent, DeviceConfigManager deviceConfigManager) {
            if (!"android.bluetooth.adapter.action.STATE_CHANGED".equals(intent.getAction())) {
                "android.bluetooth.device.action.ACL_CONNECTED".equals(intent.getAction());
                "android.bluetooth.device.action.ACL_DISCONNECTED".equals(intent.getAction());
                _onReceive(context, intent);
                return;
            }
            int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -1);
            int intExtra2 = intent.getIntExtra("android.bluetooth.adapter.extra.PREVIOUS_STATE", -1);
            if (QLog.isColorLevel()) {
                QLog.m85778w("TRAE", 2, "BT ACTION_STATE_CHANGED|   EXTRA_STATE " + getBTActionStateChangedExtraString(intExtra));
            }
            if (QLog.isColorLevel()) {
                QLog.m85778w("TRAE", 2, "BT ACTION_STATE_CHANGED|   EXTRA_PREVIOUS_STATE " + getBTActionStateChangedExtraString(intExtra2));
            }
            if (intExtra == 10) {
                if (QLog.isColorLevel()) {
                    QLog.m85778w("TRAE", 2, "    BT off");
                }
                deviceConfigManager.setVisible(TraeAudioManager.DEVICE_BLUETOOTHHEADSET, false);
            } else if (intExtra == 12 && QLog.isColorLevel()) {
                QLog.m85778w("TRAE", 2, "BT OFF-->ON,Visiable it...");
            }
        }

        public abstract void release();
    }

    public class Parameters {
        public static final String BLUETOOTHPOLICY = "com.tencent.sharp.TraeAudioManager.Parameters.BLUETOOTHPOLICY";
        public static final String CONTEXT = "com.tencent.sharp.TraeAudioManager.Parameters.CONTEXT";
        public static final String DEVICECONFIG = "com.tencent.sharp.TraeAudioManager.Parameters.DEVICECONFIG";
        public static final String MODEPOLICY = "com.tencent.sharp.TraeAudioManager.Parameters.MODEPOLICY";

        public Parameters() {
        }
    }

    public class TraeAudioManagerLooper extends Thread {
        public static final int MESSAGE_AUTO_DEVICELIST_PLUGIN_UPDATE = 32786;
        public static final int MESSAGE_AUTO_DEVICELIST_PLUGOUT_UPDATE = 32787;
        public static final int MESSAGE_AUTO_DEVICELIST_UPDATE = 32785;
        public static final int MESSAGE_BEGIN = 32768;
        public static final int MESSAGE_CONNECTDEVICE = 32775;
        public static final int MESSAGE_CONNECT_HIGHEST_PRIORITY_DEVICE = 32789;
        public static final int MESSAGE_DISABLE = 32773;
        public static final int MESSAGE_EARACTION = 32776;
        public static final int MESSAGE_ENABLE = 32772;
        public static final int MESSAGE_GETCONNECTEDDEVICE = 32778;
        public static final int MESSAGE_GETCONNECTINGDEVICE = 32779;
        public static final int MESSAGE_GETDEVICELIST = 32774;
        public static final int MESSAGE_GETSTREAMTYPE = 32784;
        public static final int MESSAGE_ISDEVICECHANGABLED = 32777;
        public static final int MESSAGE_RECOVER_AUDIO_FOCUS = 32791;
        public static final int MESSAGE_REQUEST_RELEASE_AUDIO_FOCUS = 32790;
        public static final int MESSAGE_STARTRING = 32782;
        public static final int MESSAGE_STOPRING = 32783;
        public static final int MESSAGE_VOICECALLPOSTPROCESS = 32781;
        public static final int MESSAGE_VOICECALLPREPROCESS = 32780;
        public static final int MESSAGE_VOICECALL_AUIDOPARAM_CHANGED = 32788;
        TraeAudioManager _parent;
        final boolean[] _started;
        Handler mMsgHandler = null;
        TraeMediaPlayer _ringPlayer = null;
        long _ringSessionID = -1;
        String _ringOperation = "";
        String _ringUserdata = "";
        boolean _enabled = false;
        String _lastCfg = "";
        int _preServiceMode = 0;
        int _preRingMode = 0;
        long _voiceCallSessionID = -1;
        String _voiceCallOperation = "";
        AudioManager.OnAudioFocusChangeListener mAudioFocusChangeListener = null;
        int _focusSteamType = 0;

        public TraeAudioManagerLooper(TraeAudioManager traeAudioManager) {
            boolean[] zArr = {false};
            this._started = zArr;
            this._parent = traeAudioManager;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (QLog.isColorLevel()) {
                QLog.m85773e("TRAE", 2, "TraeAudioManagerLooper start...");
            }
            start();
            synchronized (zArr) {
                if (!zArr[0]) {
                    try {
                        zArr.wait(3000L);
                    } catch (InterruptedException unused) {
                    }
                }
            }
            if (QLog.isColorLevel()) {
                QLog.m85773e("TRAE", 2, "  start used:" + (SystemClock.elapsedRealtime() - jElapsedRealtime) + "ms");
            }
        }

        public int InternalGetStreamType(HashMap<String, Object> map) {
            AudioDeviceInterface.LogTraceEntry(" activeMode:" + TraeAudioManager.this._activeMode + " _preRingMode:" + this._preRingMode);
            TraeAudioManager traeAudioManager = TraeAudioManager.this;
            if (traeAudioManager._am == null) {
                if (!QLog.isColorLevel()) {
                    return -1;
                }
                QLog.m85773e("TRAE", 2, " InternalStopRing am==null!!");
                return -1;
            }
            int streamType = traeAudioManager._activeMode == 2 ? this._ringPlayer.getStreamType() : traeAudioManager._streamType;
            Intent intent = new Intent();
            intent.putExtra(TraeAudioManager.EXTRA_DATA_STREAMTYPE, streamType);
            TraeAudioManager.this.sendResBroadcast(intent, map, 0);
            AudioDeviceInterface.LogTraceExit();
            return 0;
        }

        public int InternalNotifyStreamTypeUpdate(final int i) {
            if (TraeAudioManager.this._context == null) {
                return -1;
            }
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tencent.rtmp.sharp.jni.TraeAudioManager.TraeAudioManagerLooper.3
                @Override // java.lang.Runnable
                public void run() {
                    Intent intent = new Intent();
                    intent.setAction(TraeAudioManager.ACTION_TRAEAUDIOMANAGER_NOTIFY);
                    intent.putExtra(TraeAudioManager.PARAM_OPERATION, TraeAudioManager.NOTIFY_STREAMTYPE_UPDATE);
                    intent.putExtra(TraeAudioManager.EXTRA_DATA_STREAMTYPE, i);
                    Context context = TraeAudioManager.this._context;
                    if (context != null) {
                        context.sendBroadcast(intent);
                    }
                }
            });
            return 0;
        }

        public int InternalSessionGetDeviceList(HashMap<String, Object> map) {
            Intent intent = new Intent();
            HashMap<String, Object> snapParams = TraeAudioManager.this._deviceConfigManager.getSnapParams();
            ArrayList arrayList = (ArrayList) snapParams.get(TraeAudioManager.EXTRA_DATA_AVAILABLEDEVICE_LIST);
            String str = (String) snapParams.get(TraeAudioManager.EXTRA_DATA_CONNECTEDDEVICE);
            String str2 = (String) snapParams.get(TraeAudioManager.EXTRA_DATA_PREV_CONNECTEDDEVICE);
            intent.putExtra(TraeAudioManager.EXTRA_DATA_AVAILABLEDEVICE_LIST, (String[]) arrayList.toArray(new String[0]));
            intent.putExtra(TraeAudioManager.EXTRA_DATA_CONNECTEDDEVICE, str);
            intent.putExtra(TraeAudioManager.EXTRA_DATA_PREV_CONNECTEDDEVICE, str2);
            intent.putExtra(TraeAudioManager.EXTRA_DATA_IF_HAS_BLUETOOTH_THIS_IS_NAME, TraeAudioManager.this._deviceConfigManager.getBluetoothName());
            TraeAudioManager.this.sendResBroadcast(intent, map, 0);
            return 0;
        }

        public int InternalStartRing(HashMap<String, Object> map) {
            AudioDeviceInterface.LogTraceEntry(" activeMode:" + TraeAudioManager.this._activeMode);
            TraeAudioManager traeAudioManager = TraeAudioManager.this;
            if (traeAudioManager._am == null) {
                if (QLog.isColorLevel()) {
                    QLog.m85773e("TRAE", 2, " InternalStartRing am==null!!");
                }
                return -1;
            }
            if (traeAudioManager._activeMode == 2) {
                interruptRing();
            }
            try {
                this._ringSessionID = ((Long) map.get(TraeAudioManager.PARAM_SESSIONID)).longValue();
                this._ringOperation = (String) map.get(TraeAudioManager.PARAM_OPERATION);
                this._ringUserdata = (String) map.get(TraeAudioManager.PARAM_RING_USERDATA_STRING);
                int iIntValue = ((Integer) map.get(TraeAudioManager.PARAM_RING_DATASOURCE)).intValue();
                if (QLog.isColorLevel()) {
                    QLog.m85778w("TRAE", 2, "  dataSource:" + iIntValue);
                }
                int iIntValue2 = ((Integer) map.get(TraeAudioManager.PARAM_RING_RSID)).intValue();
                Uri uri = (Uri) map.get(TraeAudioManager.PARAM_RING_URI);
                String str = (String) map.get(TraeAudioManager.PARAM_RING_FILEPATH);
                boolean zBooleanValue = ((Boolean) map.get(TraeAudioManager.PARAM_RING_LOOP)).booleanValue();
                int iIntValue3 = ((Integer) map.get(TraeAudioManager.PARAM_RING_LOOPCOUNT)).intValue();
                boolean zBooleanValue2 = ((Boolean) map.get(TraeAudioManager.PARAM_RING_MODE)).booleanValue();
                TraeAudioManager traeAudioManager2 = TraeAudioManager.this;
                if (traeAudioManager2._activeMode != 1) {
                    traeAudioManager2._activeMode = 2;
                }
                Intent intent = new Intent();
                intent.putExtra(TraeAudioManager.PARAM_RING_USERDATA_STRING, this._ringUserdata);
                TraeAudioManager.this.sendResBroadcast(intent, map, 0);
                this._preRingMode = TraeAudioManager.this._am.getMode();
                TraeMediaPlayer traeMediaPlayer = this._ringPlayer;
                TraeAudioManager traeAudioManager3 = TraeAudioManager.this;
                traeMediaPlayer.playRing(iIntValue, iIntValue2, uri, str, zBooleanValue, iIntValue3, zBooleanValue2, traeAudioManager3._activeMode == 1, traeAudioManager3._streamType);
                if (QLog.isColorLevel()) {
                    QLog.m85778w("TRAE", 2, " _ringUserdata:" + this._ringUserdata + " DurationMS:" + this._ringPlayer.getDuration());
                }
                InternalNotifyStreamTypeUpdate(this._ringPlayer.getStreamType());
                AudioDeviceInterface.LogTraceExit();
                return 0;
            } catch (Exception unused) {
                if (QLog.isColorLevel()) {
                    QLog.m85773e("TRAE", 2, " startRing err params");
                }
                return -1;
            }
        }

        public int InternalStopRing(HashMap<String, Object> map) {
            TraeMediaPlayer traeMediaPlayer;
            AudioDeviceInterface.LogTraceEntry(" activeMode:" + TraeAudioManager.this._activeMode + " _preRingMode:" + this._preRingMode);
            if (TraeAudioManager.this._am == null || (traeMediaPlayer = this._ringPlayer) == null) {
                if (!QLog.isColorLevel()) {
                    return -1;
                }
                QLog.m85773e("TRAE", 2, " InternalStopRing am==null!!");
                return -1;
            }
            traeMediaPlayer.stopRing();
            if (!this._ringPlayer.hasCall() && TraeAudioManager.this._activeMode == 2) {
                abandonAudioFocus();
                TraeAudioManager.this._activeMode = 0;
            }
            Intent intent = new Intent();
            intent.putExtra(TraeAudioManager.PARAM_RING_USERDATA_STRING, this._ringUserdata);
            TraeAudioManager.this.sendResBroadcast(intent, map, 0);
            AudioDeviceInterface.LogTraceExit();
            return 0;
        }

        public int InternalVoicecallPostprocess(HashMap<String, Object> map) {
            AudioDeviceInterface.LogTraceEntry(" activeMode:" + TraeAudioManager.this._activeMode);
            TraeAudioManager traeAudioManager = TraeAudioManager.this;
            if (traeAudioManager._am == null) {
                if (QLog.isColorLevel()) {
                    QLog.m85773e("TRAE", 2, " InternalVoicecallPostprocess am==null!!");
                }
                return -1;
            }
            if (traeAudioManager._activeMode == 1) {
                traeAudioManager._activeMode = 0;
                abandonAudioFocus();
                AudioDeviceInterface.LogTraceExit();
                return 0;
            }
            if (QLog.isColorLevel()) {
                QLog.m85773e("TRAE", 2, " not ACTIVE_VOICECALL!!");
            }
            TraeAudioManager.this.sendResBroadcast(new Intent(), map, 3);
            return -1;
        }

        /* JADX WARN: Code duplicated, block: B:42:0x00ed  */
        public int InternalVoicecallPreprocess(HashMap<String, Object> map) {
            DeviceConfigManager deviceConfigManager;
            AudioDeviceInterface.LogTraceEntry(" activeMode:" + TraeAudioManager.this._activeMode);
            if (map == null) {
                return -1;
            }
            TraeAudioManager traeAudioManager = TraeAudioManager.this;
            if (traeAudioManager._am == null) {
                if (QLog.isColorLevel()) {
                    QLog.m85773e("TRAE", 2, " InternalVoicecallPreprocess am==null!!");
                }
                return -1;
            }
            if (traeAudioManager._activeMode == 1) {
                TraeAudioManager.this.sendResBroadcast(new Intent(), map, 2);
                return -1;
            }
            this._voiceCallSessionID = ((Long) map.get(TraeAudioManager.PARAM_SESSIONID)).longValue();
            this._voiceCallOperation = (String) map.get(TraeAudioManager.PARAM_OPERATION);
            TraeAudioManager traeAudioManager2 = TraeAudioManager.this;
            traeAudioManager2._activeMode = 1;
            traeAudioManager2._prevMode = traeAudioManager2._am.getMode();
            Integer num = (Integer) map.get(TraeAudioManager.PARAM_MODEPOLICY);
            if (num == null) {
                if (QLog.isColorLevel()) {
                    QLog.m85773e("TRAE", 2, " params.get(PARAM_MODEPOLICY)==null!!");
                }
                TraeAudioManager.this._modePolicy = -1;
            } else {
                TraeAudioManager.this._modePolicy = num.intValue();
            }
            if (QLog.isColorLevel()) {
                QLog.m85773e("TRAE", 2, "  _modePolicy:" + TraeAudioManager.this._modePolicy);
            }
            Integer num2 = (Integer) map.get(TraeAudioManager.PARAM_STREAMTYPE);
            if (num2 == null) {
                if (QLog.isColorLevel()) {
                    QLog.m85773e("TRAE", 2, " params.get(PARAM_STREAMTYPE)==null!!");
                }
                TraeAudioManager.this._streamType = 0;
            } else {
                TraeAudioManager.this._streamType = num2.intValue();
            }
            if (TraeAudioManager.isCloseSystemAPM(TraeAudioManager.this._modePolicy)) {
                TraeAudioManager traeAudioManager3 = TraeAudioManager.this;
                if (traeAudioManager3._activeMode == 2 || (deviceConfigManager = traeAudioManager3._deviceConfigManager) == null) {
                    TraeAudioManager traeAudioManager4 = TraeAudioManager.this;
                    traeAudioManager4.InternalSetMode(TraeAudioManager.getCallAudioMode(traeAudioManager4._modePolicy));
                } else {
                    boolean zEquals = deviceConfigManager.getConnectedDevice().equals(TraeAudioManager.DEVICE_SPEAKERPHONE);
                    TraeAudioManager traeAudioManager5 = TraeAudioManager.this;
                    if (zEquals) {
                        traeAudioManager5.InternalSetMode(0);
                    } else {
                        traeAudioManager5.InternalSetMode(3);
                    }
                }
            } else {
                TraeAudioManager traeAudioManager6 = TraeAudioManager.this;
                traeAudioManager6.InternalSetMode(TraeAudioManager.getCallAudioMode(traeAudioManager6._modePolicy));
            }
            TraeAudioManager.this.sendResBroadcast(new Intent(), map, 0);
            AudioDeviceInterface.LogTraceExit();
            return 0;
        }

        public void _init() {
            AudioDeviceInterface.LogTraceEntry("");
            try {
                TraeAudioManager.this._audioSessionHost = new TraeAudioSessionHost();
                TraeAudioManager traeAudioManager = TraeAudioManager.this;
                traeAudioManager._deviceConfigManager = traeAudioManager.new DeviceConfigManager();
                TraeAudioManager._gHostProcessId = Process.myPid();
                TraeAudioManager traeAudioManager2 = TraeAudioManager.this;
                traeAudioManager2._am = (AudioManager) traeAudioManager2._context.getSystemService("audio");
                TraeAudioManager traeAudioManager3 = TraeAudioManager.this;
                traeAudioManager3._bluetoothCheck = traeAudioManager3.CreateBluetoothCheck(traeAudioManager3._context, traeAudioManager3._deviceConfigManager);
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.HEADSET_PLUG");
                intentFilter.addAction("android.media.AUDIO_BECOMING_NOISY");
                TraeAudioManager.this._bluetoothCheck.addAction(intentFilter);
                intentFilter.addAction(TraeAudioManager.ACTION_TRAEAUDIOMANAGER_REQUEST);
                jj5.m145018l(TraeAudioManager.this._context, this._parent, intentFilter);
            } catch (Exception unused) {
                if (QLog.isColorLevel()) {
                    QLog.m85773e("TRAE", 2, "======7");
                }
            }
            AudioDeviceInterface.LogTraceExit();
        }

        public void _post_stopService() {
            try {
                BluetoohHeadsetCheckInterface bluetoohHeadsetCheckInterface = TraeAudioManager.this._bluetoothCheck;
                if (bluetoohHeadsetCheckInterface != null) {
                    bluetoohHeadsetCheckInterface.release();
                }
                TraeAudioManager traeAudioManager = TraeAudioManager.this;
                traeAudioManager._bluetoothCheck = null;
                Context context = traeAudioManager._context;
                if (context != null) {
                    context.unregisterReceiver(this._parent);
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction(TraeAudioManager.ACTION_TRAEAUDIOMANAGER_REQUEST);
                    jj5.m145018l(TraeAudioManager.this._context, this._parent, intentFilter);
                }
            } catch (Exception e) {
                if (QLog.isColorLevel()) {
                    QLog.m85773e("TRAE", 2, "stop service failed." + e.getMessage());
                }
            }
        }

        public void _prev_startService() {
            try {
                TraeAudioManager traeAudioManager = TraeAudioManager.this;
                traeAudioManager._am = (AudioManager) traeAudioManager._context.getSystemService("audio");
                TraeAudioManager traeAudioManager2 = TraeAudioManager.this;
                if (traeAudioManager2._bluetoothCheck == null) {
                    traeAudioManager2._bluetoothCheck = traeAudioManager2.CreateBluetoothCheck(traeAudioManager2._context, traeAudioManager2._deviceConfigManager);
                }
                TraeAudioManager.this._context.unregisterReceiver(this._parent);
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.HEADSET_PLUG");
                intentFilter.addAction("android.media.AUDIO_BECOMING_NOISY");
                TraeAudioManager.this._bluetoothCheck.addAction(intentFilter);
                intentFilter.addAction(TraeAudioManager.ACTION_TRAEAUDIOMANAGER_REQUEST);
                jj5.m145018l(TraeAudioManager.this._context, this._parent, intentFilter);
            } catch (Exception unused) {
                if (QLog.isColorLevel()) {
                    QLog.m85778w("TRAE", 2, "======7");
                }
            }
        }

        public void _uninit() {
            AudioDeviceInterface.LogTraceEntry("");
            try {
                stopService();
                BluetoohHeadsetCheckInterface bluetoohHeadsetCheckInterface = TraeAudioManager.this._bluetoothCheck;
                if (bluetoohHeadsetCheckInterface != null) {
                    bluetoohHeadsetCheckInterface.release();
                }
                TraeAudioManager traeAudioManager = TraeAudioManager.this;
                traeAudioManager._bluetoothCheck = null;
                Context context = traeAudioManager._context;
                if (context != null) {
                    context.unregisterReceiver(this._parent);
                    TraeAudioManager.this._context = null;
                }
                DeviceConfigManager deviceConfigManager = TraeAudioManager.this._deviceConfigManager;
                if (deviceConfigManager != null) {
                    deviceConfigManager.clearConfig();
                }
                TraeAudioManager.this._deviceConfigManager = null;
            } catch (Exception e) {
                if (QLog.isColorLevel()) {
                    QLog.m85773e("TRAE", 2, "uninit failed." + e.getMessage());
                }
            }
            AudioDeviceInterface.LogTraceExit();
        }

        @TargetApi(8)
        public void abandonAudioFocus() {
        }

        public int interruptRing() {
            AudioDeviceInterface.LogTraceEntry(" activeMode:" + TraeAudioManager.this._activeMode + " _preRingMode:" + this._preRingMode);
            TraeAudioManager traeAudioManager = TraeAudioManager.this;
            if (traeAudioManager._am == null) {
                if (QLog.isColorLevel()) {
                    QLog.m85773e("TRAE", 2, " interruptRing am==null!!");
                }
                return -1;
            }
            if (traeAudioManager._activeMode != 2) {
                if (QLog.isColorLevel()) {
                    QLog.m85773e("TRAE", 2, " not ACTIVE_RING!!");
                }
                return -1;
            }
            this._ringPlayer.stopRing();
            abandonAudioFocus();
            TraeAudioManager.this._activeMode = 0;
            HashMap<String, Object> map = new HashMap<>();
            map.put(TraeAudioManager.PARAM_SESSIONID, Long.valueOf(this._ringSessionID));
            map.put(TraeAudioManager.PARAM_OPERATION, this._ringOperation);
            Intent intent = new Intent();
            intent.putExtra(TraeAudioManager.PARAM_RING_USERDATA_STRING, this._ringUserdata);
            TraeAudioManager.this.sendResBroadcast(intent, map, 4);
            AudioDeviceInterface.LogTraceExit();
            return 0;
        }

        public int interruptVoicecallPostprocess() {
            AudioDeviceInterface.LogTraceEntry(" activeMode:" + TraeAudioManager.this._activeMode);
            TraeAudioManager traeAudioManager = TraeAudioManager.this;
            if (traeAudioManager._am == null) {
                if (QLog.isColorLevel()) {
                    QLog.m85773e("TRAE", 2, " am==null!!");
                }
                return -1;
            }
            if (traeAudioManager._activeMode != 1) {
                if (QLog.isColorLevel()) {
                    QLog.m85773e("TRAE", 2, " not ACTIVE_RING!!");
                }
                return -1;
            }
            traeAudioManager._activeMode = 0;
            int i = traeAudioManager._prevMode;
            if (i != -1) {
                traeAudioManager.InternalSetMode(i);
            }
            HashMap<String, Object> map = new HashMap<>();
            map.put(TraeAudioManager.PARAM_SESSIONID, Long.valueOf(this._voiceCallSessionID));
            map.put(TraeAudioManager.PARAM_OPERATION, this._voiceCallOperation);
            TraeAudioManager.this.sendResBroadcast(new Intent(), map, 6);
            AudioDeviceInterface.LogTraceExit();
            return 0;
        }

        public boolean isNeedForceVolumeType() {
            if (!Build.MANUFACTURER.equals(ThirdPushManager.VENDOR_TYPE_XIAOMI)) {
                return false;
            }
            String str = Build.MODEL;
            return str.equals("MI 5") || str.equals("MI 5s") || str.equals("MI 5s Plus");
        }

        public void notifyRingCompletion() {
            HashMap<String, Object> map = new HashMap<>();
            map.put(TraeAudioManager.PARAM_SESSIONID, Long.valueOf(this._ringSessionID));
            map.put(TraeAudioManager.PARAM_OPERATION, TraeAudioManager.NOTIFY_RING_COMPLETION);
            Intent intent = new Intent();
            intent.putExtra(TraeAudioManager.PARAM_RING_USERDATA_STRING, this._ringUserdata);
            TraeAudioManager.this.sendResBroadcast(intent, map, 0);
        }

        public int notifyServiceState(boolean z) {
            if (TraeAudioManager.this._context == null) {
                return -1;
            }
            Intent intent = new Intent();
            intent.setAction(TraeAudioManager.ACTION_TRAEAUDIOMANAGER_NOTIFY);
            intent.putExtra(TraeAudioManager.PARAM_OPERATION, TraeAudioManager.NOTIFY_SERVICE_STATE);
            intent.putExtra(TraeAudioManager.NOTIFY_SERVICE_STATE_DATE, z);
            Context context = TraeAudioManager.this._context;
            if (context == null) {
                return 0;
            }
            context.sendBroadcast(intent);
            return 0;
        }

        public void quit() {
            AudioDeviceInterface.LogTraceEntry("");
            if (this.mMsgHandler == null) {
                return;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.mMsgHandler.getLooper().quit();
            synchronized (this._started) {
                boolean[] zArr = this._started;
                if (zArr[0]) {
                    try {
                        zArr.wait(10000L);
                    } catch (InterruptedException unused) {
                    }
                }
            }
            if (QLog.isColorLevel()) {
                QLog.m85773e("TRAE", 2, "  quit used:" + (SystemClock.elapsedRealtime() - jElapsedRealtime) + "ms");
            }
            this.mMsgHandler = null;
            AudioDeviceInterface.LogTraceExit();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            AudioDeviceInterface.LogTraceEntry("");
            Looper.prepare();
            this.mMsgHandler = new Handler() { // from class: com.tencent.rtmp.sharp.jni.TraeAudioManager.TraeAudioManagerLooper.2
                @Override // android.os.Handler
                public void handleMessage(Message message) {
                    HashMap<String, Object> map;
                    try {
                        map = (HashMap) message.obj;
                    } catch (Exception unused) {
                        map = null;
                    }
                    if (QLog.isColorLevel()) {
                        StringBuilder sb = new StringBuilder("TraeAudioManagerLooper msg:");
                        sb.append(message.what);
                        sb.append(" _enabled:");
                        sb.append(TraeAudioManagerLooper.this._enabled ? "Y" : "N");
                        QLog.m85778w("TRAE", 2, sb.toString());
                    }
                    int i = message.what;
                    TraeAudioManagerLooper traeAudioManagerLooper = TraeAudioManagerLooper.this;
                    if (i == 32772) {
                        traeAudioManagerLooper.startService(map);
                        return;
                    }
                    if (!traeAudioManagerLooper._enabled) {
                        if (QLog.isColorLevel()) {
                            QLog.m85778w("TRAE", 2, "******* disabled ,skip msg******");
                        }
                        TraeAudioManager.this.sendResBroadcast(new Intent(), map, 1);
                        return;
                    }
                    switch (i) {
                        case 32773:
                            traeAudioManagerLooper.stopService();
                            break;
                        case TraeAudioManagerLooper.MESSAGE_GETDEVICELIST /* 32774 */:
                            traeAudioManagerLooper.InternalSessionGetDeviceList(map);
                            break;
                        case TraeAudioManagerLooper.MESSAGE_CONNECTDEVICE /* 32775 */:
                            TraeAudioManager.this.InternalSessionConnectDevice(map);
                            break;
                        case TraeAudioManagerLooper.MESSAGE_EARACTION /* 32776 */:
                            TraeAudioManager.this.InternalSessionEarAction(map);
                            break;
                        case TraeAudioManagerLooper.MESSAGE_ISDEVICECHANGABLED /* 32777 */:
                            TraeAudioManager.this.InternalSessionIsDeviceChangabled(map);
                            break;
                        case TraeAudioManagerLooper.MESSAGE_GETCONNECTEDDEVICE /* 32778 */:
                            TraeAudioManager.this.InternalSessionGetConnectedDevice(map);
                            break;
                        case TraeAudioManagerLooper.MESSAGE_GETCONNECTINGDEVICE /* 32779 */:
                            TraeAudioManager.this.InternalSessionGetConnectingDevice(map);
                            break;
                        case TraeAudioManagerLooper.MESSAGE_VOICECALLPREPROCESS /* 32780 */:
                            traeAudioManagerLooper.InternalVoicecallPreprocess(map);
                            break;
                        case TraeAudioManagerLooper.MESSAGE_VOICECALLPOSTPROCESS /* 32781 */:
                            traeAudioManagerLooper.InternalVoicecallPostprocess(map);
                            break;
                        case TraeAudioManagerLooper.MESSAGE_STARTRING /* 32782 */:
                            traeAudioManagerLooper.InternalStartRing(map);
                            break;
                        case TraeAudioManagerLooper.MESSAGE_STOPRING /* 32783 */:
                            traeAudioManagerLooper.InternalStopRing(map);
                            break;
                        case TraeAudioManagerLooper.MESSAGE_GETSTREAMTYPE /* 32784 */:
                            traeAudioManagerLooper.InternalGetStreamType(map);
                            break;
                        case TraeAudioManagerLooper.MESSAGE_AUTO_DEVICELIST_UPDATE /* 32785 */:
                        case TraeAudioManagerLooper.MESSAGE_CONNECT_HIGHEST_PRIORITY_DEVICE /* 32789 */:
                            String availabledHighestPriorityDevice = TraeAudioManager.this._deviceConfigManager.getAvailabledHighestPriorityDevice();
                            String connectedDevice = TraeAudioManager.this._deviceConfigManager.getConnectedDevice();
                            if (QLog.isColorLevel()) {
                                QLog.m85778w("TRAE", 2, "MESSAGE_AUTO_DEVICELIST_UPDATE  connectedDev:" + connectedDevice + " highestDev" + availabledHighestPriorityDevice);
                            }
                            if (!TraeAudioManager.IsUpdateSceneFlag) {
                                boolean zEquals = availabledHighestPriorityDevice.equals(connectedDevice);
                                TraeAudioManagerLooper traeAudioManagerLooper2 = TraeAudioManagerLooper.this;
                                if (!zEquals) {
                                    TraeAudioManager.this.InternalConnectDevice(availabledHighestPriorityDevice, null, false);
                                } else {
                                    TraeAudioManager.this.InternalNotifyDeviceListUpdate();
                                }
                            } else {
                                if (TraeAudioManager.IsMusicScene) {
                                    TraeAudioManager traeAudioManager = TraeAudioManager.this;
                                    if (!traeAudioManager.IsBluetoothA2dpExisted) {
                                        traeAudioManager.InternalConnectDevice(traeAudioManager._deviceConfigManager.getAvailabledHighestPriorityDevice(TraeAudioManager.DEVICE_BLUETOOTHHEADSET), null, true);
                                    }
                                }
                                TraeAudioManager.this.InternalConnectDevice(availabledHighestPriorityDevice, null, true);
                            }
                            break;
                        case TraeAudioManagerLooper.MESSAGE_AUTO_DEVICELIST_PLUGIN_UPDATE /* 32786 */:
                            String str = (String) map.get(TraeAudioManager.PARAM_DEVICE);
                            if (TraeAudioManager.this.InternalConnectDevice(str, null, false) != 0) {
                                if (QLog.isColorLevel()) {
                                    QLog.m85778w("TRAE", 2, " plugin dev:" + str + " sessionConnectedDev:" + TraeAudioManager.this.sessionConnectedDev + " connected fail,auto switch!");
                                }
                                TraeAudioManager traeAudioManager2 = TraeAudioManager.this;
                                traeAudioManager2.InternalConnectDevice(traeAudioManager2._deviceConfigManager.getAvailabledHighestPriorityDevice(), null, false);
                            }
                            break;
                        case TraeAudioManagerLooper.MESSAGE_AUTO_DEVICELIST_PLUGOUT_UPDATE /* 32787 */:
                            TraeAudioManager traeAudioManager3 = TraeAudioManager.this;
                            if (traeAudioManager3.InternalConnectDevice(traeAudioManager3.sessionConnectedDev, null, false) != 0) {
                                String str2 = (String) map.get(TraeAudioManager.PARAM_DEVICE);
                                if (QLog.isColorLevel()) {
                                    QLog.m85778w("TRAE", 2, " plugout dev:" + str2 + " sessionConnectedDev:" + TraeAudioManager.this.sessionConnectedDev + " connected fail,auto switch!");
                                }
                                TraeAudioManager traeAudioManager4 = TraeAudioManager.this;
                                traeAudioManager4.InternalConnectDevice(traeAudioManager4._deviceConfigManager.getAvailabledHighestPriorityDevice(), null, false);
                            }
                            break;
                        case TraeAudioManagerLooper.MESSAGE_VOICECALL_AUIDOPARAM_CHANGED /* 32788 */:
                            Integer num = (Integer) map.get(TraeAudioManager.PARAM_STREAMTYPE);
                            if (num != null) {
                                TraeAudioManager.this._streamType = num.intValue();
                                TraeAudioManagerLooper.this.InternalNotifyStreamTypeUpdate(num.intValue());
                            } else if (QLog.isColorLevel()) {
                                QLog.m85773e("TRAE", 2, " MESSAGE_VOICECALL_AUIDOPARAM_CHANGED params.get(PARAM_STREAMTYPE)==null!!");
                            }
                            break;
                        case TraeAudioManagerLooper.MESSAGE_REQUEST_RELEASE_AUDIO_FOCUS /* 32790 */:
                            traeAudioManagerLooper.abandonAudioFocus();
                            break;
                    }
                }
            };
            _init();
            synchronized (this._started) {
                boolean[] zArr = this._started;
                zArr[0] = true;
                zArr.notifyAll();
            }
            Looper.loop();
            _uninit();
            synchronized (this._started) {
                boolean[] zArr2 = this._started;
                zArr2[0] = false;
                zArr2.notifyAll();
            }
            AudioDeviceInterface.LogTraceExit();
        }

        public int sendMessage(int i, HashMap<String, Object> map) {
            Handler handler = this.mMsgHandler;
            if (handler != null) {
                return this.mMsgHandler.sendMessage(Message.obtain(handler, i, map)) ? 0 : -1;
            }
            StringBuilder sb = new StringBuilder(" fail mMsgHandler==null _enabled:");
            sb.append(this._enabled ? "Y" : "N");
            sb.append(" activeMode:");
            sb.append(TraeAudioManager.this._activeMode);
            sb.append(" msg:");
            sb.append(i);
            AudioDeviceInterface.LogTraceEntry(sb.toString());
            return -1;
        }

        public void startService(HashMap<String, Object> map) {
            String str = (String) map.get(TraeAudioManager.EXTRA_DATA_DEVICECONFIG);
            StringBuilder sb = new StringBuilder(" _enabled:");
            sb.append(this._enabled ? "Y" : "N");
            sb.append(" activeMode:");
            sb.append(TraeAudioManager.this._activeMode);
            sb.append(" cfg:");
            sb.append(str);
            AudioDeviceInterface.LogTraceEntry(sb.toString());
            if (TraeAudioManager.this._context == null) {
                return;
            }
            QLog.m85778w("TRAE", 2, "   startService:" + str);
            if (!(this._enabled && this._lastCfg.equals(str)) && TraeAudioManager.this._activeMode == 0) {
                if (this._enabled) {
                    stopService();
                }
                _prev_startService();
                TraeAudioManager.this._deviceConfigManager.clearConfig();
                TraeAudioManager.this._deviceConfigManager.init(str);
                this._lastCfg = str;
                AudioManager audioManager = TraeAudioManager.this._am;
                if (audioManager != null) {
                    this._preServiceMode = audioManager.getMode();
                }
                this._enabled = true;
                if (this._ringPlayer == null) {
                    this._ringPlayer = new TraeMediaPlayer(TraeAudioManager.this._context, new TraeMediaPlayer.OnCompletionListener() { // from class: com.tencent.rtmp.sharp.jni.TraeAudioManager.TraeAudioManagerLooper.1
                        @Override // com.tencent.rtmp.sharp.jni.TraeMediaPlayer.OnCompletionListener
                        public void onCompletion() {
                            if (QLog.isColorLevel()) {
                                QLog.m85778w("TRAE", 2, "_ringPlayer onCompletion _activeMode:" + TraeAudioManager.this._activeMode + " _preRingMode:" + TraeAudioManagerLooper.this._preRingMode);
                            }
                            HashMap<String, Object> map2 = new HashMap<>();
                            map2.put(TraeAudioManager.PARAM_ISHOSTSIDE, Boolean.TRUE);
                            TraeAudioManagerLooper.this.sendMessage(TraeAudioManagerLooper.MESSAGE_STOPRING, map2);
                            TraeAudioManagerLooper.this.notifyRingCompletion();
                        }
                    });
                }
                notifyServiceState(this._enabled);
                TraeAudioManager.this.updateDeviceStatus();
                AudioDeviceInterface.LogTraceExit();
            }
        }

        public void stopService() {
            StringBuilder sb = new StringBuilder(" _enabled:");
            sb.append(this._enabled ? "Y" : "N");
            sb.append(" activeMode:");
            sb.append(TraeAudioManager.this._activeMode);
            AudioDeviceInterface.LogTraceEntry(sb.toString());
            if (this._enabled) {
                int i = TraeAudioManager.this._activeMode;
                if (i == 1) {
                    interruptVoicecallPostprocess();
                } else if (i == 2) {
                    interruptRing();
                }
                if (TraeAudioManager.this._switchThread != null) {
                    if (QLog.isColorLevel()) {
                        QLog.m85778w("TRAE", 2, "_switchThread:" + TraeAudioManager.this._switchThread.getDeviceName());
                    }
                    TraeAudioManager.this._switchThread.quit();
                    TraeAudioManager.this._switchThread = null;
                }
                TraeMediaPlayer traeMediaPlayer = this._ringPlayer;
                if (traeMediaPlayer != null) {
                    traeMediaPlayer.stopRing();
                }
                this._ringPlayer = null;
                this._enabled = false;
                notifyServiceState(false);
                TraeAudioManager traeAudioManager = TraeAudioManager.this;
                if (traeAudioManager._am != null && traeAudioManager._context != null) {
                    try {
                        traeAudioManager.InternalSetMode(0);
                        if (isNeedForceVolumeType()) {
                            QLog.m85778w("TRAE", 2, "NeedForceVolumeType: AudioManager.STREAM_MUSIC");
                            TraeAudioManager.forceVolumeControlStream(TraeAudioManager.this._am, 3);
                        }
                    } catch (Exception e) {
                        if (QLog.isColorLevel()) {
                            QLog.m85773e("TRAE", 2, "set mode failed." + e.getMessage());
                        }
                    }
                }
                _post_stopService();
                AudioDeviceInterface.LogTraceExit();
            }
        }
    }

    public class bluetoothHeadsetSwitchThread extends switchThread {
        public bluetoothHeadsetSwitchThread() {
            super();
        }

        @Override // com.tencent.rtmp.sharp.jni.TraeAudioManager.switchThread
        @TargetApi(8)
        public void _quit() {
            if (TraeAudioManager.this._am == null) {
                return;
            }
            _stopBluetoothSco();
        }

        @Override // com.tencent.rtmp.sharp.jni.TraeAudioManager.switchThread
        public void _run() {
            if (TraeAudioManager.IsMusicScene || !TraeAudioManager.IsUpdateSceneFlag) {
                if (QLog.isColorLevel()) {
                    QLog.m85778w("TRAE", 2, "connect bluetoothHeadset: do nothing, IsMusicScene:" + TraeAudioManager.IsMusicScene + " ,IsUpdateSceneFlag:" + TraeAudioManager.IsUpdateSceneFlag);
                }
                updateStatus();
                return;
            }
            if (!TraeAudioManager.enableDeviceSwitchFlag) {
                if (QLog.isColorLevel()) {
                    QLog.m85778w("TRAE", 2, "connect bluetoothHeadset: disableDeviceSwitchFlag");
                    return;
                }
                return;
            }
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException unused) {
            }
            _startBluetoothSco();
            int i = 0;
            while (this._running) {
                int i2 = i + 1;
                if (i >= 10) {
                    break;
                }
                if (QLog.isColorLevel()) {
                    StringBuilder sb = new StringBuilder("bluetoothHeadsetSwitchThread i:");
                    sb.append(i2);
                    sb.append(" sco:");
                    sb.append(TraeAudioManager.this._am.isBluetoothScoOn() ? "Y" : "N");
                    sb.append(" :");
                    sb.append(TraeAudioManager.this._deviceConfigManager.getBluetoothName());
                    QLog.m85778w("TRAE", 2, sb.toString());
                }
                if (TraeAudioManager.this._am.isBluetoothScoOn()) {
                    updateStatus();
                    break;
                } else {
                    try {
                        Thread.sleep(1000L);
                    } catch (InterruptedException unused2) {
                    }
                    i = i2;
                }
            }
            if (TraeAudioManager.this._am.isBluetoothScoOn()) {
                return;
            }
            if (QLog.isColorLevel()) {
                QLog.m85773e("TRAE", 2, "bluetoothHeadsetSwitchThread sco fail,remove btheadset");
            }
            TraeAudioManager.this._deviceConfigManager.setVisible(getDeviceName(), false);
            processDeviceConnectRes(10);
            TraeAudioManager.this.checkAutoDeviceListUpdate();
        }

        @TargetApi(8)
        public void _startBluetoothSco() {
            TraeAudioManager.this._am.setBluetoothScoOn(true);
            TraeAudioManager.this._am.startBluetoothSco();
        }

        @TargetApi(8)
        public void _stopBluetoothSco() {
            TraeAudioManager.this._am.stopBluetoothSco();
            TraeAudioManager.this._am.setBluetoothScoOn(false);
        }

        @Override // com.tencent.rtmp.sharp.jni.TraeAudioManager.switchThread
        public String getDeviceName() {
            return TraeAudioManager.DEVICE_BLUETOOTHHEADSET;
        }
    }

    public class earphoneSwitchThread extends switchThread {
        public earphoneSwitchThread() {
            super();
        }

        @Override // com.tencent.rtmp.sharp.jni.TraeAudioManager.switchThread
        public void _quit() {
        }

        @Override // com.tencent.rtmp.sharp.jni.TraeAudioManager.switchThread
        public void _run() {
            if (TraeAudioManager.IsUpdateSceneFlag && TraeAudioManager.enableDeviceSwitchFlag) {
                TraeAudioManager traeAudioManager = TraeAudioManager.this;
                traeAudioManager.InternalSetSpeaker(traeAudioManager._context, false);
            }
            updateStatus();
            if (!TraeAudioManager.IsUpdateSceneFlag) {
                if (QLog.isColorLevel()) {
                    QLog.m85778w("TRAE", 2, "connect earphone: do nothing");
                }
            } else {
                if (!TraeAudioManager.enableDeviceSwitchFlag) {
                    if (QLog.isColorLevel()) {
                        QLog.m85778w("TRAE", 2, "connect earphone: disableDeviceSwitchFlag");
                        return;
                    }
                    return;
                }
                int i = 0;
                while (this._running) {
                    if (TraeAudioManager.this._am.isSpeakerphoneOn()) {
                        TraeAudioManager traeAudioManager2 = TraeAudioManager.this;
                        traeAudioManager2.InternalSetSpeaker(traeAudioManager2._context, false);
                    }
                    try {
                        Thread.sleep(i < 5 ? 1000L : 4000L);
                    } catch (InterruptedException unused) {
                    }
                    i++;
                }
            }
        }

        @Override // com.tencent.rtmp.sharp.jni.TraeAudioManager.switchThread
        public String getDeviceName() {
            return TraeAudioManager.DEVICE_EARPHONE;
        }
    }

    public class headsetSwitchThread extends switchThread {
        public headsetSwitchThread() {
            super();
        }

        @Override // com.tencent.rtmp.sharp.jni.TraeAudioManager.switchThread
        public void _quit() {
        }

        @Override // com.tencent.rtmp.sharp.jni.TraeAudioManager.switchThread
        public void _run() {
            if (!TraeAudioManager.IsMusicScene && TraeAudioManager.IsUpdateSceneFlag && TraeAudioManager.enableDeviceSwitchFlag) {
                TraeAudioManager traeAudioManager = TraeAudioManager.this;
                traeAudioManager.InternalSetSpeaker(traeAudioManager._context, false);
                TraeAudioManager.this._am.setWiredHeadsetOn(true);
            }
            updateStatus();
            if (TraeAudioManager.IsMusicScene || !TraeAudioManager.IsUpdateSceneFlag) {
                if (QLog.isColorLevel()) {
                    QLog.m85778w("TRAE", 2, "connect headset: do nothing");
                }
            } else {
                if (!TraeAudioManager.enableDeviceSwitchFlag) {
                    if (QLog.isColorLevel()) {
                        QLog.m85778w("TRAE", 2, "connect headset: disableDeviceSwitchFlag");
                        return;
                    }
                    return;
                }
                int i = 0;
                while (this._running) {
                    if (TraeAudioManager.this._am.isSpeakerphoneOn()) {
                        TraeAudioManager traeAudioManager2 = TraeAudioManager.this;
                        traeAudioManager2.InternalSetSpeaker(traeAudioManager2._context, false);
                    }
                    try {
                        Thread.sleep(i < 5 ? 1000L : 4000L);
                    } catch (InterruptedException unused) {
                    }
                    i++;
                }
            }
        }

        @Override // com.tencent.rtmp.sharp.jni.TraeAudioManager.switchThread
        public String getDeviceName() {
            return TraeAudioManager.DEVICE_WIREDHEADSET;
        }
    }

    public class speakerSwitchThread extends switchThread {
        public speakerSwitchThread() {
            super();
        }

        @Override // com.tencent.rtmp.sharp.jni.TraeAudioManager.switchThread
        public void _quit() {
        }

        @Override // com.tencent.rtmp.sharp.jni.TraeAudioManager.switchThread
        public void _run() {
            if (!TraeAudioManager.IsMusicScene && TraeAudioManager.IsUpdateSceneFlag && TraeAudioManager.enableDeviceSwitchFlag) {
                TraeAudioManager traeAudioManager = TraeAudioManager.this;
                traeAudioManager.InternalSetSpeaker(traeAudioManager._context, true);
            }
            updateStatus();
            if (TraeAudioManager.IsMusicScene || !TraeAudioManager.IsUpdateSceneFlag) {
                if (QLog.isColorLevel()) {
                    QLog.m85778w("TRAE", 2, "connect speakerPhone: do nothing");
                    return;
                }
                return;
            }
            if (!TraeAudioManager.enableDeviceSwitchFlag) {
                if (QLog.isColorLevel()) {
                    QLog.m85778w("TRAE", 2, "connect speakerPhone: disableDeviceSwitchFlag");
                    return;
                }
                return;
            }
            if (QLog.isColorLevel()) {
                QLog.m85778w("TRAE", 2, " _run:" + getDeviceName() + " _running:" + this._running);
            }
            int i = 0;
            while (this._running) {
                if (!TraeAudioManager.this._am.isSpeakerphoneOn()) {
                    TraeAudioManager traeAudioManager2 = TraeAudioManager.this;
                    traeAudioManager2.InternalSetSpeaker(traeAudioManager2._context, true);
                }
                try {
                    Thread.sleep(i < 5 ? 1000L : 4000L);
                } catch (InterruptedException unused) {
                }
                i++;
            }
        }

        @Override // com.tencent.rtmp.sharp.jni.TraeAudioManager.switchThread
        public String getDeviceName() {
            return TraeAudioManager.DEVICE_SPEAKERPHONE;
        }
    }

    public abstract class switchThread extends Thread {
        boolean _running = true;
        boolean[] _exited = {false};
        HashMap<String, Object> _params = null;
        long _usingtime = 0;

        public switchThread() {
            if (QLog.isColorLevel()) {
                QLog.m85778w("TRAE", 2, " ++switchThread:" + getDeviceName());
            }
        }

        public abstract void _quit();

        public abstract void _run();

        public abstract String getDeviceName();

        public void processDeviceConnectRes(int i) {
            TraeAudioManager.this.InternalNotifyDeviceChangableUpdate();
            AudioDeviceInterface.LogTraceEntry(getDeviceName() + " err:" + i);
            HashMap<String, Object> map = this._params;
            TraeAudioManager traeAudioManager = TraeAudioManager.this;
            if (map == null) {
                traeAudioManager.InternalNotifyDeviceListUpdate();
                return;
            }
            traeAudioManager.sessionConnectedDev = traeAudioManager._deviceConfigManager.getConnectedDevice();
            Long l2 = (Long) this._params.get(TraeAudioManager.PARAM_SESSIONID);
            if (QLog.isColorLevel()) {
                QLog.m85778w("TRAE", 2, " sessonID:" + l2);
            }
            if (l2 == null || l2.longValue() == Long.MIN_VALUE) {
                TraeAudioManager.this.InternalNotifyDeviceListUpdate();
                if (QLog.isColorLevel()) {
                    QLog.m85778w("TRAE", 2, "processDeviceConnectRes sid null,don't send res");
                    return;
                }
                return;
            }
            Intent intent = new Intent();
            intent.putExtra(TraeAudioManager.CONNECTDEVICE_RESULT_DEVICENAME, (String) this._params.get(TraeAudioManager.PARAM_DEVICE));
            if (TraeAudioManager.this.sendResBroadcast(intent, this._params, i) == 0) {
                TraeAudioManager.this.InternalNotifyDeviceListUpdate();
            }
            AudioDeviceInterface.LogTraceExit();
        }

        public void quit() {
            AudioDeviceInterface.LogTraceEntry(getDeviceName());
            this._running = false;
            if (QLog.isColorLevel()) {
                QLog.m85778w("TRAE", 2, " quit:" + getDeviceName() + " _running:" + this._running);
            }
            interrupt();
            _quit();
            synchronized (this._exited) {
                boolean[] zArr = this._exited;
                if (!zArr[0]) {
                    try {
                        zArr.wait(10000L);
                    } catch (InterruptedException unused) {
                    }
                }
            }
            AudioDeviceInterface.LogTraceExit();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            AudioDeviceInterface.LogTraceEntry(getDeviceName());
            TraeAudioManager.this._deviceConfigManager.setConnecting(getDeviceName());
            TraeAudioManager.this.InternalNotifyDeviceChangableUpdate();
            _run();
            synchronized (this._exited) {
                boolean[] zArr = this._exited;
                zArr[0] = true;
                zArr.notifyAll();
            }
            AudioDeviceInterface.LogTraceExit();
        }

        public void setDeviceConnectParam(HashMap<String, Object> map) {
            this._params = map;
        }

        public void updateStatus() {
            TraeAudioManager.this._deviceConfigManager.setConnected(getDeviceName());
            processDeviceConnectRes(0);
        }
    }

    public TraeAudioManager(Context context) {
        this._context = null;
        this.mTraeAudioManagerLooper = null;
        AudioDeviceInterface.LogTraceEntry(" context:" + context);
        if (context == null) {
            return;
        }
        this._context = context;
        this.mTraeAudioManagerLooper = new TraeAudioManagerLooper(this);
        AudioDeviceInterface.LogTraceExit();
    }

    public static boolean IsEabiLowVersion() {
        String str = Build.CPU_ABI;
        try {
            String str2 = (String) Build.class.getDeclaredField("CPU_ABI2").get(null);
            if (QLog.isColorLevel()) {
                QLog.m85778w("TRAE", 2, "IsEabiVersion CPU_ABI:" + str + " CPU_ABI2:" + str2);
            }
            return IsEabiLowVersionByAbi(str) && IsEabiLowVersionByAbi(str2);
        } catch (Exception unused) {
            return IsEabiLowVersionByAbi(str);
        }
    }

    public static boolean IsEabiLowVersionByAbi(String str) {
        if (str == null) {
            return true;
        }
        if (str.contains("x86") || str.contains("mips")) {
            return false;
        }
        if (str.equalsIgnoreCase("armeabi")) {
            return true;
        }
        return (str.equalsIgnoreCase("armeabi-v7a") || str.equalsIgnoreCase("arm64-v8a")) ? false : true;
    }

    public static int SetSpeakerForTest(Context context, boolean z) {
        int iInternalSetSpeaker;
        _glock.lock();
        TraeAudioManager traeAudioManager = _ginstance;
        if (traeAudioManager != null) {
            iInternalSetSpeaker = traeAudioManager.InternalSetSpeaker(context, z);
        } else {
            if (QLog.isColorLevel()) {
                QLog.m85778w("TRAE", 2, "TraeAudioManager|static SetSpeakerForTest|null == _ginstance");
            }
            iInternalSetSpeaker = -1;
        }
        _glock.unlock();
        return iInternalSetSpeaker;
    }

    public static boolean checkDevName(String str) {
        if (str == null) {
            return false;
        }
        return DEVICE_SPEAKERPHONE.equals(str) || DEVICE_EARPHONE.equals(str) || DEVICE_WIREDHEADSET.equals(str) || DEVICE_BLUETOOTHHEADSET.equals(str);
    }

    public static int connectDevice(String str, long j, boolean z, String str2) {
        if (str2 == null) {
            return -1;
        }
        HashMap map = new HashMap();
        map.put(PARAM_SESSIONID, Long.valueOf(j));
        map.put(PARAM_OPERATION, str);
        map.put(PARAM_ISHOSTSIDE, Boolean.valueOf(z));
        map.put(CONNECTDEVICE_DEVICENAME, str2);
        map.put(PARAM_DEVICE, str2);
        return sendMessage(TraeAudioManagerLooper.MESSAGE_CONNECTDEVICE, map);
    }

    public static int connectHighestPriorityDevice(String str, long j, boolean z) {
        HashMap map = new HashMap();
        map.put(PARAM_SESSIONID, Long.valueOf(j));
        map.put(PARAM_OPERATION, str);
        map.put(PARAM_ISHOSTSIDE, Boolean.valueOf(z));
        return sendMessage(TraeAudioManagerLooper.MESSAGE_CONNECT_HIGHEST_PRIORITY_DEVICE, map);
    }

    public static int disableDeviceSwitch() {
        enableDeviceSwitchFlag = false;
        return 0;
    }

    public static int earAction(String str, long j, boolean z, int i) {
        if (i != 0 && i != 1) {
            return -1;
        }
        HashMap map = new HashMap();
        map.put(PARAM_SESSIONID, Long.valueOf(j));
        map.put(PARAM_OPERATION, str);
        map.put(PARAM_ISHOSTSIDE, Boolean.valueOf(z));
        map.put(EXTRA_EARACTION, Integer.valueOf(i));
        return sendMessage(TraeAudioManagerLooper.MESSAGE_EARACTION, map);
    }

    public static void forceVolumeControlStream(AudioManager audioManager, int i) {
        if (Build.MANUFACTURER.equals(ThirdPushManager.VENDOR_TYPE_FCM)) {
            if (QLog.isColorLevel()) {
                QLog.m85778w("TRAE", 2, "forceVolumeControlStream, Google phone nothing to do");
                return;
            }
            return;
        }
        Object objInvokeMethod = invokeMethod(audioManager, "forceVolumeControlStream", new Object[]{Integer.valueOf(i)}, new Class[]{Integer.TYPE});
        if (QLog.isColorLevel()) {
            QLog.m85778w("TRAE", 2, "forceVolumeControlStream  streamType:" + i + " res:" + objInvokeMethod);
        }
    }

    public static int getAudioSource(int i) {
        if (!IsMusicScene) {
            if (!IsEabiLowVersion()) {
                if (i < 0) {
                    if (QLog.isColorLevel()) {
                        QLog.m85778w("TRAE", 2, "[Config] getAudioSource _audioSourcePolicy:" + i + " source:7");
                    }
                    return 7;
                }
                if (QLog.isColorLevel()) {
                    QLog.m85778w("TRAE", 2, "[Config] getAudioSource _audioSourcePolicy:" + i + " source:" + i);
                }
                return i;
            }
            if (QLog.isColorLevel()) {
                QLog.m85778w("TRAE", 2, "[Config] armeabi low Version, getAudioSource _audioSourcePolicy:" + i + " source:0");
            }
        }
        return 0;
    }

    public static int getAudioStreamType(int i) {
        if (!IsMusicScene) {
            if (!IsEabiLowVersion()) {
                int i2 = i >= 0 ? i : 0;
                if (QLog.isColorLevel()) {
                    QLog.m85778w("TRAE", 2, "[Config] getAudioStreamType audioStreamTypePolicy:" + i + " streamType:" + i2);
                }
                return i2;
            }
            if (QLog.isColorLevel()) {
                QLog.m85778w("TRAE", 2, "[Config] armeabi low Version, getAudioStreamType audioStreamTypePolicy:" + i + " streamType:3");
            }
        }
        return 3;
    }

    public static int getCallAudioMode(int i) {
        if (!IsMusicScene) {
            if (!IsEabiLowVersion()) {
                if (i >= 0) {
                    if (QLog.isColorLevel()) {
                        QLog.m85778w("TRAE", 2, "[Config] getCallAudioMode modePolicy:" + i + " mode:" + i);
                    }
                    return i;
                }
                if (QLog.isColorLevel()) {
                    QLog.m85778w("TRAE", 2, "[Config] getCallAudioMode _modePolicy:" + i + " mode:3facturer:" + Build.MANUFACTURER + " model:" + Build.MODEL);
                }
                return 3;
            }
            if (QLog.isColorLevel()) {
                QLog.m85778w("TRAE", 2, "[Config] armeabi low Version, getCallAudioMode modePolicy:" + i + " mode:0");
            }
        }
        return 0;
    }

    public static int getConnectedDevice(String str, long j, boolean z) {
        HashMap map = new HashMap();
        map.put(PARAM_SESSIONID, Long.valueOf(j));
        map.put(PARAM_OPERATION, str);
        map.put(PARAM_ISHOSTSIDE, Boolean.valueOf(z));
        return sendMessage(TraeAudioManagerLooper.MESSAGE_GETCONNECTEDDEVICE, map);
    }

    public static int getConnectingDevice(String str, long j, boolean z) {
        HashMap map = new HashMap();
        map.put(PARAM_SESSIONID, Long.valueOf(j));
        map.put(PARAM_OPERATION, str);
        map.put(PARAM_ISHOSTSIDE, Boolean.valueOf(z));
        return sendMessage(TraeAudioManagerLooper.MESSAGE_GETCONNECTINGDEVICE, map);
    }

    public static int getDeviceList(String str, long j, boolean z) {
        HashMap map = new HashMap();
        map.put(PARAM_SESSIONID, Long.valueOf(j));
        map.put(PARAM_OPERATION, str);
        map.put(PARAM_ISHOSTSIDE, Boolean.valueOf(z));
        return sendMessage(TraeAudioManagerLooper.MESSAGE_GETDEVICELIST, map);
    }

    public static String getForceConfigName(int i) {
        if (i < 0) {
            return CardButtonsShowAndHideType.unknow;
        }
        String[] strArr = forceName;
        return i < strArr.length ? strArr[i] : CardButtonsShowAndHideType.unknow;
    }

    public static int getForceUse(int i) {
        Object objInvokeStaticMethod = invokeStaticMethod("android.media.AudioSystem", "getForceUse", new Object[]{Integer.valueOf(i)}, new Class[]{Integer.TYPE});
        Integer num = objInvokeStaticMethod != null ? (Integer) objInvokeStaticMethod : 0;
        if (QLog.isColorLevel()) {
            QLog.m85778w("TRAE", 2, "getForceUse  usage:" + i + " config:" + num + " ->" + getForceConfigName(num.intValue()));
        }
        return num.intValue();
    }

    public static int getStreamType(String str, long j, boolean z) {
        HashMap map = new HashMap();
        map.put(PARAM_SESSIONID, Long.valueOf(j));
        map.put(PARAM_OPERATION, str);
        map.put(PARAM_ISHOSTSIDE, Boolean.valueOf(z));
        return sendMessage(TraeAudioManagerLooper.MESSAGE_GETSTREAMTYPE, map);
    }

    public static int init(Context context) {
        Objects.toString(_ginstance);
        AudioDeviceInterface.LogTraceEntry(" _ginstance:" + _ginstance);
        _glock.lock();
        if (_ginstance == null) {
            _ginstance = new TraeAudioManager(context);
        }
        _glock.unlock();
        AudioDeviceInterface.LogTraceExit();
        return 0;
    }

    public static Object invokeMethod(Object obj, String str, Object[] objArr, Class[] clsArr) {
        try {
            return obj.getClass().getMethod(str, clsArr).invoke(obj, objArr);
        } catch (Exception e) {
            if (!QLog.isColorLevel()) {
                return null;
            }
            QLog.m85778w("TRAE", 2, "invokeMethod Exception:" + e.getMessage());
            return null;
        }
    }

    public static Object invokeStaticMethod(String str, String str2, Object[] objArr, Class[] clsArr) {
        try {
            return Class.forName(str).getMethod(str2, clsArr).invoke(null, objArr);
        } catch (ClassNotFoundException unused) {
            if (QLog.isColorLevel()) {
                QLog.m85778w("TRAE", 2, "ClassNotFound:" + str);
            }
            return null;
        } catch (IllegalAccessException unused2) {
            if (QLog.isColorLevel()) {
                QLog.m85778w("TRAE", 2, "IllegalAccess:" + str2);
            }
            return null;
        } catch (IllegalArgumentException unused3) {
            if (QLog.isColorLevel()) {
                QLog.m85778w("TRAE", 2, "IllegalArgument:" + str2);
            }
            return null;
        } catch (NoSuchMethodException unused4) {
            if (QLog.isColorLevel()) {
                QLog.m85778w("TRAE", 2, "NoSuchMethod:" + str2);
            }
            return null;
        } catch (InvocationTargetException unused5) {
            if (QLog.isColorLevel()) {
                QLog.m85778w("TRAE", 2, "InvocationTarget:" + str2);
            }
            return null;
        } catch (Exception e) {
            if (QLog.isColorLevel()) {
                QLog.m85778w("TRAE", 2, "invokeStaticMethod Exception:" + e.getMessage());
            }
            return null;
        }
    }

    public static boolean isCloseSystemAPM(int i) {
        if (i != -1) {
            return false;
        }
        String str = Build.MANUFACTURER;
        if (str.equals(ThirdPushManager.VENDOR_TYPE_XIAOMI)) {
            String str2 = Build.MODEL;
            if (str2.equals("MI 2") || str2.equals("MI 2A") || str2.equals("MI 2S") || str2.equals("MI 2SC")) {
                return true;
            }
        } else if (str.equals("samsung") && Build.MODEL.equals("SCH-I959")) {
            return true;
        }
        return false;
    }

    public static int isDeviceChangabled(String str, long j, boolean z) {
        HashMap map = new HashMap();
        map.put(PARAM_SESSIONID, Long.valueOf(j));
        map.put(PARAM_OPERATION, str);
        map.put(PARAM_ISHOSTSIDE, Boolean.valueOf(z));
        return sendMessage(TraeAudioManagerLooper.MESSAGE_ISDEVICECHANGABLED, map);
    }

    public static boolean isHandfree(String str) {
        return checkDevName(str) && DEVICE_SPEAKERPHONE.equals(str);
    }

    public static int recoverAudioFocus(String str, long j, boolean z) {
        HashMap map = new HashMap();
        map.put(PARAM_SESSIONID, Long.valueOf(j));
        map.put(PARAM_OPERATION, str);
        map.put(PARAM_ISHOSTSIDE, Boolean.valueOf(z));
        return sendMessage(TraeAudioManagerLooper.MESSAGE_RECOVER_AUDIO_FOCUS, map);
    }

    public static int registerAudioSession(TraeAudioSession traeAudioSession, boolean z, long j, Context context) {
        int i;
        _glock.lock();
        TraeAudioManager traeAudioManager = _ginstance;
        if (traeAudioManager != null) {
            if (z) {
                traeAudioManager._audioSessionHost.add(traeAudioSession, j, context);
            } else {
                traeAudioManager._audioSessionHost.remove(j);
            }
            i = 0;
        } else {
            i = -1;
        }
        _glock.unlock();
        return i;
    }

    public static int requestReleaseAudioFocus(String str, long j, boolean z) {
        HashMap map = new HashMap();
        map.put(PARAM_SESSIONID, Long.valueOf(j));
        map.put(PARAM_OPERATION, str);
        map.put(PARAM_ISHOSTSIDE, Boolean.valueOf(z));
        return sendMessage(TraeAudioManagerLooper.MESSAGE_REQUEST_RELEASE_AUDIO_FOCUS, map);
    }

    public static int sendMessage(int i, HashMap<String, Object> map) {
        _glock.lock();
        TraeAudioManager traeAudioManager = _ginstance;
        int iInternalSendMessage = traeAudioManager != null ? traeAudioManager.internalSendMessage(i, map) : -1;
        _glock.unlock();
        return iInternalSendMessage;
    }

    public static void setForceUse(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        Class cls = Integer.TYPE;
        Object objInvokeStaticMethod = invokeStaticMethod("android.media.AudioSystem", "setForceUse", objArr, new Class[]{cls, cls});
        if (QLog.isColorLevel()) {
            QLog.m85778w("TRAE", 2, "setForceUse  usage:" + i + " config:" + i2 + " ->" + getForceConfigName(i2) + " res:" + objInvokeStaticMethod);
        }
    }

    public static void setParameters(String str) {
        Object[] objArr = {str};
        Class[] clsArr = {String.class};
        if (QLog.isColorLevel()) {
            QLog.m85778w("TRAE", 2, "setParameters  :" + str);
        }
        invokeStaticMethod("android.media.AudioSystem", "setParameters", objArr, clsArr);
    }

    public static void setPhoneState(int i) {
        invokeStaticMethod("android.media.AudioSystem", "setPhoneState", new Object[]{Integer.valueOf(i)}, new Class[]{Integer.TYPE});
    }

    public static int startRing(String str, long j, boolean z, int i, int i2, Uri uri, String str2, boolean z2, int i3, String str3, boolean z3) {
        HashMap map = new HashMap();
        map.put(PARAM_SESSIONID, Long.valueOf(j));
        map.put(PARAM_OPERATION, str);
        map.put(PARAM_ISHOSTSIDE, Boolean.valueOf(z));
        map.put(PARAM_RING_DATASOURCE, Integer.valueOf(i));
        map.put(PARAM_RING_RSID, Integer.valueOf(i2));
        map.put(PARAM_RING_URI, uri);
        map.put(PARAM_RING_FILEPATH, str2);
        map.put(PARAM_RING_LOOP, Boolean.valueOf(z2));
        map.put(PARAM_RING_LOOPCOUNT, Integer.valueOf(i3));
        map.put(PARAM_RING_MODE, Boolean.valueOf(z3));
        map.put(PARAM_RING_USERDATA_STRING, str3);
        return sendMessage(TraeAudioManagerLooper.MESSAGE_STARTRING, map);
    }

    public static int startService(String str, long j, boolean z, String str2) {
        if (str2.length() <= 0) {
            return -1;
        }
        HashMap map = new HashMap();
        map.put(PARAM_SESSIONID, Long.valueOf(j));
        map.put(PARAM_OPERATION, str);
        map.put(PARAM_ISHOSTSIDE, Boolean.valueOf(z));
        map.put(EXTRA_DATA_DEVICECONFIG, str2);
        return sendMessage(TraeAudioManagerLooper.MESSAGE_ENABLE, map);
    }

    public static int stopRing(String str, long j, boolean z) {
        HashMap map = new HashMap();
        map.put(PARAM_SESSIONID, Long.valueOf(j));
        map.put(PARAM_OPERATION, str);
        map.put(PARAM_ISHOSTSIDE, Boolean.valueOf(z));
        return sendMessage(TraeAudioManagerLooper.MESSAGE_STOPRING, map);
    }

    public static int stopService(String str, long j, boolean z) {
        HashMap map = new HashMap();
        map.put(PARAM_SESSIONID, Long.valueOf(j));
        map.put(PARAM_OPERATION, str);
        map.put(PARAM_ISHOSTSIDE, Boolean.valueOf(z));
        return sendMessage(32773, map);
    }

    public static void uninit() {
        Objects.toString(_ginstance);
        AudioDeviceInterface.LogTraceEntry(" _ginstance:" + _ginstance);
        _glock.lock();
        TraeAudioManager traeAudioManager = _ginstance;
        if (traeAudioManager != null) {
            traeAudioManager.release();
            _ginstance = null;
        }
        _glock.unlock();
        AudioDeviceInterface.LogTraceExit();
    }

    public static int voiceCallAudioParamChanged(String str, long j, boolean z, int i, int i2) {
        HashMap map = new HashMap();
        map.put(PARAM_SESSIONID, Long.valueOf(j));
        map.put(PARAM_OPERATION, str);
        map.put(PARAM_ISHOSTSIDE, Boolean.valueOf(z));
        map.put(PARAM_MODEPOLICY, Integer.valueOf(i));
        map.put(PARAM_STREAMTYPE, Integer.valueOf(i2));
        return sendMessage(TraeAudioManagerLooper.MESSAGE_VOICECALL_AUIDOPARAM_CHANGED, map);
    }

    public static int voicecallPostprocess(String str, long j, boolean z) {
        HashMap map = new HashMap();
        map.put(PARAM_SESSIONID, Long.valueOf(j));
        map.put(PARAM_OPERATION, str);
        map.put(PARAM_ISHOSTSIDE, Boolean.valueOf(z));
        return sendMessage(TraeAudioManagerLooper.MESSAGE_VOICECALLPOSTPROCESS, map);
    }

    public static int voicecallPreprocess(String str, long j, boolean z, int i, int i2) {
        HashMap map = new HashMap();
        map.put(PARAM_SESSIONID, Long.valueOf(j));
        map.put(PARAM_OPERATION, str);
        map.put(PARAM_ISHOSTSIDE, Boolean.valueOf(z));
        map.put(PARAM_MODEPOLICY, Integer.valueOf(i));
        map.put(PARAM_STREAMTYPE, Integer.valueOf(i2));
        return sendMessage(TraeAudioManagerLooper.MESSAGE_VOICECALLPREPROCESS, map);
    }

    public BluetoohHeadsetCheckInterface CreateBluetoothCheck(Context context, DeviceConfigManager deviceConfigManager) {
        BluetoohHeadsetCheckInterface bluetoohHeadsetCheck = new BluetoohHeadsetCheck();
        if (!bluetoohHeadsetCheck.init(context, deviceConfigManager)) {
            bluetoohHeadsetCheck = new BluetoohHeadsetCheckFake();
        }
        if (QLog.isColorLevel()) {
            QLog.m85778w("TRAE", 2, "CreateBluetoothCheck:" + bluetoohHeadsetCheck.interfaceDesc() + " skip android4.3:N");
        }
        return bluetoohHeadsetCheck;
    }

    public int InternalConnectDevice(String str, HashMap<String, Object> map, boolean z) {
        AudioDeviceInterface.LogTraceEntry(" devName:" + str);
        if (str == null) {
            return -1;
        }
        if (IsMusicScene && str.equals(DEVICE_EARPHONE)) {
            if (QLog.isColorLevel()) {
                QLog.m85773e("TRAE", 2, "MusicScene, Connect device:" + str + " failed");
            }
            return -1;
        }
        if (!IsEarPhoneSupported && str.equals(DEVICE_EARPHONE)) {
            if (QLog.isColorLevel()) {
                QLog.m85773e("TRAE", 2, "IsEarPhoneSupported = false, Connect device:" + str + " failed");
            }
            return -1;
        }
        if (!z && !this._deviceConfigManager.getConnectedDevice().equals(DEVICE_NONE) && str.equals(this._deviceConfigManager.getConnectedDevice())) {
            return 0;
        }
        if (!checkDevName(str) || !this._deviceConfigManager.getVisible(str)) {
            if (QLog.isColorLevel()) {
                QLog.m85773e("TRAE", 2, " checkDevName fail");
            }
            return -1;
        }
        if (!InternalIsDeviceChangeable()) {
            if (QLog.isColorLevel()) {
                QLog.m85773e("TRAE", 2, " InternalIsDeviceChangeable fail");
            }
            return -1;
        }
        if (this._switchThread != null) {
            if (QLog.isColorLevel()) {
                QLog.m85778w("TRAE", 2, "_switchThread:" + this._switchThread.getDeviceName());
            }
            this._switchThread.quit();
            this._switchThread = null;
        }
        if (str.equals(DEVICE_EARPHONE)) {
            this._switchThread = new earphoneSwitchThread();
        } else if (str.equals(DEVICE_SPEAKERPHONE)) {
            this._switchThread = new speakerSwitchThread();
        } else if (str.equals(DEVICE_WIREDHEADSET)) {
            this._switchThread = new headsetSwitchThread();
        } else if (str.equals(DEVICE_BLUETOOTHHEADSET)) {
            this._switchThread = new bluetoothHeadsetSwitchThread();
        }
        switchThread switchthread = this._switchThread;
        if (switchthread != null) {
            switchthread.setDeviceConnectParam(map);
            this._switchThread.start();
        }
        AudioDeviceInterface.LogTraceExit();
        return 0;
    }

    public boolean InternalIsDeviceChangeable() {
        String connectingDevice = this._deviceConfigManager.getConnectingDevice();
        return connectingDevice == null || connectingDevice.equals(DEVICE_NONE) || connectingDevice.equals("");
    }

    public int InternalNotifyDeviceChangableUpdate() {
        if (this._context == null) {
            return -1;
        }
        final boolean zInternalIsDeviceChangeable = InternalIsDeviceChangeable();
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tencent.rtmp.sharp.jni.TraeAudioManager.3
            @Override // java.lang.Runnable
            public void run() {
                Intent intent = new Intent();
                intent.setAction(TraeAudioManager.ACTION_TRAEAUDIOMANAGER_NOTIFY);
                intent.putExtra(TraeAudioManager.PARAM_OPERATION, TraeAudioManager.NOTIFY_DEVICECHANGABLE_UPDATE);
                intent.putExtra(TraeAudioManager.NOTIFY_DEVICECHANGABLE_UPDATE_DATE, zInternalIsDeviceChangeable);
                Context context = TraeAudioManager.this._context;
                if (context != null) {
                    context.sendBroadcast(intent);
                }
            }
        });
        return 0;
    }

    public int InternalNotifyDeviceListUpdate() {
        AudioDeviceInterface.LogTraceEntry("");
        if (this._context == null) {
            return -1;
        }
        HashMap<String, Object> snapParams = this._deviceConfigManager.getSnapParams();
        final ArrayList arrayList = (ArrayList) snapParams.get(EXTRA_DATA_AVAILABLEDEVICE_LIST);
        final String str = (String) snapParams.get(EXTRA_DATA_CONNECTEDDEVICE);
        final String str2 = (String) snapParams.get(EXTRA_DATA_PREV_CONNECTEDDEVICE);
        final String bluetoothName = this._deviceConfigManager.getBluetoothName();
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tencent.rtmp.sharp.jni.TraeAudioManager.2
            @Override // java.lang.Runnable
            public void run() {
                Intent intent = new Intent();
                intent.setAction(TraeAudioManager.ACTION_TRAEAUDIOMANAGER_NOTIFY);
                intent.putExtra(TraeAudioManager.PARAM_OPERATION, TraeAudioManager.NOTIFY_DEVICELIST_UPDATE);
                intent.putExtra(TraeAudioManager.EXTRA_DATA_AVAILABLEDEVICE_LIST, (String[]) arrayList.toArray(new String[0]));
                intent.putExtra(TraeAudioManager.EXTRA_DATA_CONNECTEDDEVICE, str);
                intent.putExtra(TraeAudioManager.EXTRA_DATA_PREV_CONNECTEDDEVICE, str2);
                intent.putExtra(TraeAudioManager.EXTRA_DATA_IF_HAS_BLUETOOTH_THIS_IS_NAME, bluetoothName);
                Context context = TraeAudioManager.this._context;
                if (context != null) {
                    context.sendBroadcast(intent);
                }
            }
        });
        AudioDeviceInterface.LogTraceExit();
        return 0;
    }

    public int InternalSessionConnectDevice(HashMap<String, Object> map) {
        int i;
        AudioDeviceInterface.LogTraceEntry("");
        if (map == null || this._context == null) {
            return -1;
        }
        if (IsMusicScene) {
            if (QLog.isColorLevel()) {
                QLog.m85778w("TRAE", 2, "MusicScene: InternalSessionConnectDevice failed");
            }
            return -1;
        }
        String str = (String) map.get(PARAM_DEVICE);
        if (!IsEarPhoneSupported && str.equals(DEVICE_EARPHONE)) {
            if (QLog.isColorLevel()) {
                QLog.m85773e("TRAE", 2, "InternalSessionConnectDevice IsEarPhoneSupported = false, Connect device:" + str + " failed");
            }
            return -1;
        }
        boolean zInternalIsDeviceChangeable = InternalIsDeviceChangeable();
        if (!checkDevName(str)) {
            i = 7;
        } else if (this._deviceConfigManager.getVisible(str)) {
            i = !zInternalIsDeviceChangeable ? 9 : 0;
        } else {
            i = 8;
        }
        if (QLog.isColorLevel()) {
            StringBuilder sb = new StringBuilder("sessonID:");
            sb.append((Long) map.get(PARAM_SESSIONID));
            sb.append(" devName:");
            sb.append(str);
            sb.append(" bChangabled:");
            sb.append(zInternalIsDeviceChangeable ? "Y" : "N");
            sb.append(" err:");
            sb.append(i);
            QLog.m85778w("TRAE", 2, sb.toString());
        }
        if (i != 0) {
            Intent intent = new Intent();
            intent.putExtra(CONNECTDEVICE_RESULT_DEVICENAME, (String) map.get(PARAM_DEVICE));
            sendResBroadcast(intent, map, i);
            return -1;
        }
        if (!str.equals(this._deviceConfigManager.getConnectedDevice())) {
            if (QLog.isColorLevel()) {
                QLog.m85778w("TRAE", 2, " --connecting...");
            }
            InternalConnectDevice(str, map, false);
            AudioDeviceInterface.LogTraceExit();
            return 0;
        }
        if (QLog.isColorLevel()) {
            QLog.m85773e("TRAE", 2, " --has connected!");
        }
        Intent intent2 = new Intent();
        intent2.putExtra(CONNECTDEVICE_RESULT_DEVICENAME, (String) map.get(PARAM_DEVICE));
        sendResBroadcast(intent2, map, i);
        return 0;
    }

    public int InternalSessionEarAction(HashMap<String, Object> map) {
        return 0;
    }

    public int InternalSessionGetConnectedDevice(HashMap<String, Object> map) {
        Intent intent = new Intent();
        intent.putExtra(GETCONNECTEDDEVICE_RESULT_LIST, this._deviceConfigManager.getConnectedDevice());
        sendResBroadcast(intent, map, 0);
        return 0;
    }

    public int InternalSessionGetConnectingDevice(HashMap<String, Object> map) {
        Intent intent = new Intent();
        intent.putExtra(GETCONNECTINGDEVICE_RESULT_LIST, this._deviceConfigManager.getConnectingDevice());
        sendResBroadcast(intent, map, 0);
        return 0;
    }

    public int InternalSessionIsDeviceChangabled(HashMap<String, Object> map) {
        Intent intent = new Intent();
        intent.putExtra(ISDEVICECHANGABLED_RESULT_ISCHANGABLED, InternalIsDeviceChangeable());
        sendResBroadcast(intent, map, 0);
        return 0;
    }

    public void InternalSetMode(int i) {
        if (QLog.isColorLevel()) {
            QLog.m85778w("TRAE", 2, "SetMode entry:" + i);
        }
        AudioManager audioManager = this._am;
        if (audioManager == null) {
            if (QLog.isColorLevel()) {
                QLog.m85778w("TRAE", 2, "setMode:" + i + " fail am=null");
                return;
            }
            return;
        }
        audioManager.setMode(i);
        if (QLog.isColorLevel()) {
            StringBuilder sb = new StringBuilder("setMode:");
            sb.append(i);
            sb.append(this._am.getMode() != i ? "fail" : "success");
            QLog.m85778w("TRAE", 2, sb.toString());
        }
    }

    public int InternalSetSpeaker(Context context, boolean z) {
        if (context == null) {
            if (QLog.isColorLevel()) {
                QLog.m85773e("TRAE", 2, "Could not InternalSetSpeaker - no context");
            }
            return -1;
        }
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            if (QLog.isColorLevel()) {
                QLog.m85773e("TRAE", 2, "Could not InternalSetSpeaker - no audio manager");
            }
            return -1;
        }
        if (QLog.isColorLevel()) {
            StringBuilder sb = new StringBuilder("InternalSetSpeaker entry:speaker:");
            sb.append(audioManager.isSpeakerphoneOn() ? "Y" : "N");
            sb.append("-->:");
            sb.append(z ? "Y" : "N");
            QLog.m85778w("TRAE", 2, sb.toString());
        }
        if (isCloseSystemAPM(this._modePolicy) && this._activeMode != 2) {
            return InternalSetSpeakerSpe(audioManager, z);
        }
        if (audioManager.isSpeakerphoneOn() != z) {
            audioManager.setSpeakerphoneOn(z);
        }
        int i = audioManager.isSpeakerphoneOn() == z ? 0 : -1;
        if (QLog.isColorLevel()) {
            QLog.m85778w("TRAE", 2, "InternalSetSpeaker exit:" + z + " res:" + i + " mode:" + audioManager.getMode());
        }
        return i;
    }

    public int InternalSetSpeakerSpe(AudioManager audioManager, boolean z) {
        if (QLog.isColorLevel()) {
            QLog.m85778w("TRAE", 2, "InternalSetSpeakerSpe fac:" + Build.MANUFACTURER + " model:" + Build.MODEL + " st:" + this._streamType + " media_force_use:" + getForceUse(1));
        }
        if (z) {
            InternalSetMode(0);
            audioManager.setSpeakerphoneOn(true);
            setForceUse(1, 1);
        } else {
            InternalSetMode(3);
            audioManager.setSpeakerphoneOn(false);
            setForceUse(1, 0);
        }
        int i = audioManager.isSpeakerphoneOn() != z ? -1 : 0;
        if (QLog.isColorLevel()) {
            QLog.m85778w("TRAE", 2, "InternalSetSpeakerSpe exit:" + z + " res:" + i + " mode:" + audioManager.getMode());
        }
        return i;
    }

    public void _updateEarphoneVisable() {
        if (this._deviceConfigManager.getVisible(DEVICE_WIREDHEADSET)) {
            if (QLog.isColorLevel()) {
                QLog.m85778w("TRAE", 2, " detected headset plugin,so disable earphone");
            }
            this._deviceConfigManager.setVisible(DEVICE_EARPHONE, false);
        } else {
            if (QLog.isColorLevel()) {
                QLog.m85778w("TRAE", 2, " detected headset plugout,so enable earphone");
            }
            this._deviceConfigManager.setVisible(DEVICE_EARPHONE, true);
        }
    }

    public void checkAutoDeviceListUpdate() {
        if (this._deviceConfigManager.getVisiableUpdateFlag()) {
            if (QLog.isColorLevel()) {
                QLog.m85778w("TRAE", 2, "checkAutoDeviceListUpdate got update!");
            }
            _updateEarphoneVisable();
            this._deviceConfigManager.resetVisiableUpdateFlag();
            internalSendMessage(TraeAudioManagerLooper.MESSAGE_AUTO_DEVICELIST_UPDATE, new HashMap<>());
        }
    }

    public void checkDevicePlug(String str, boolean z) {
        if (this._deviceConfigManager.getVisiableUpdateFlag()) {
            if (QLog.isColorLevel()) {
                StringBuilder sb = new StringBuilder("checkDevicePlug got update dev:");
                sb.append(str);
                sb.append(z ? " piugin" : " plugout");
                sb.append(" connectedDev:");
                sb.append(this._deviceConfigManager.getConnectedDevice());
                QLog.m85778w("TRAE", 2, sb.toString());
            }
            _updateEarphoneVisable();
            this._deviceConfigManager.resetVisiableUpdateFlag();
            if (z) {
                HashMap<String, Object> map = new HashMap<>();
                map.put(PARAM_DEVICE, str);
                internalSendMessage(TraeAudioManagerLooper.MESSAGE_AUTO_DEVICELIST_PLUGIN_UPDATE, map);
                return;
            }
            String connectedDevice = this._deviceConfigManager.getConnectedDevice();
            if (connectedDevice.equals(str) || connectedDevice.equals(DEVICE_NONE)) {
                HashMap<String, Object> map2 = new HashMap<>();
                map2.put(PARAM_DEVICE, str);
                internalSendMessage(TraeAudioManagerLooper.MESSAGE_AUTO_DEVICELIST_PLUGOUT_UPDATE, map2);
                return;
            }
            if (QLog.isColorLevel()) {
                QLog.m85778w("TRAE", 2, " ---No switch,plugout:" + str + " connectedDev:" + connectedDevice);
            }
            internalSendMessage(TraeAudioManagerLooper.MESSAGE_AUTO_DEVICELIST_UPDATE, new HashMap<>());
        }
    }

    public int internalSendMessage(int i, HashMap<String, Object> map) {
        TraeAudioManagerLooper traeAudioManagerLooper = this.mTraeAudioManagerLooper;
        if (traeAudioManagerLooper != null) {
            return traeAudioManagerLooper.sendMessage(i, map);
        }
        return -1;
    }

    public void onHeadsetPlug(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra(AuthenticationTokenClaims.JSON_KEY_NAME);
        if (stringExtra == null) {
            stringExtra = "unkonw";
        }
        String strConcat = " [" + stringExtra + "] ";
        int intExtra = intent.getIntExtra("state", -1);
        if (intExtra != -1) {
            strConcat = strConcat.concat(intExtra == 0 ? "unplugged" : "plugged");
        }
        String strConcat2 = strConcat.concat(" mic:");
        int intExtra2 = intent.getIntExtra("microphone", -1);
        if (intExtra2 != -1) {
            strConcat2 = strConcat2.concat(intExtra2 == 1 ? "Y" : "unkown");
        }
        if (QLog.isColorLevel()) {
            QLog.m85778w("TRAE", 2, "onHeadsetPlug:: ".concat(strConcat2));
        }
        this._deviceConfigManager.setVisible(DEVICE_WIREDHEADSET, 1 == intExtra);
        if (QLog.isColorLevel()) {
            QLog.m85778w("TRAE", 2, "onHeadsetPlug exit");
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || context == null) {
            if (QLog.isColorLevel()) {
                QLog.m85771d("TRAE", 2, "onReceive intent or context is null!");
                return;
            }
            return;
        }
        try {
            String action = intent.getAction();
            String stringExtra = intent.getStringExtra(PARAM_OPERATION);
            if (QLog.isColorLevel()) {
                QLog.m85778w("TRAE", 2, "TraeAudioManager|onReceive::Action:" + intent.getAction());
            }
            DeviceConfigManager deviceConfigManager = this._deviceConfigManager;
            if (deviceConfigManager == null) {
                if (QLog.isColorLevel()) {
                    QLog.m85771d("TRAE", 2, "_deviceConfigManager null!");
                    return;
                }
                return;
            }
            boolean visible = deviceConfigManager.getVisible(DEVICE_WIREDHEADSET);
            boolean visible2 = this._deviceConfigManager.getVisible(DEVICE_BLUETOOTHHEADSET);
            if ("android.intent.action.HEADSET_PLUG".equals(intent.getAction())) {
                onHeadsetPlug(context, intent);
                if (!visible && this._deviceConfigManager.getVisible(DEVICE_WIREDHEADSET)) {
                    checkDevicePlug(DEVICE_WIREDHEADSET, true);
                }
                if (!visible || this._deviceConfigManager.getVisible(DEVICE_WIREDHEADSET)) {
                    return;
                }
                checkDevicePlug(DEVICE_WIREDHEADSET, false);
                return;
            }
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                return;
            }
            if (!ACTION_TRAEAUDIOMANAGER_REQUEST.equals(action)) {
                DeviceConfigManager deviceConfigManager2 = this._deviceConfigManager;
                if (deviceConfigManager2 != null) {
                    BluetoohHeadsetCheckInterface bluetoohHeadsetCheckInterface = this._bluetoothCheck;
                    if (bluetoohHeadsetCheckInterface != null) {
                        bluetoohHeadsetCheckInterface.onReceive(context, intent, deviceConfigManager2);
                    }
                    if (!visible2 && this._deviceConfigManager.getVisible(DEVICE_BLUETOOTHHEADSET)) {
                        checkDevicePlug(DEVICE_BLUETOOTHHEADSET, true);
                    }
                    if (!visible2 || this._deviceConfigManager.getVisible(DEVICE_BLUETOOTHHEADSET)) {
                        return;
                    }
                    checkDevicePlug(DEVICE_BLUETOOTHHEADSET, false);
                    return;
                }
                return;
            }
            if (QLog.isColorLevel()) {
                QLog.m85778w("TRAE", 2, "   OPERATION:" + stringExtra);
            }
            if (OPERATION_STARTSERVICE.equals(stringExtra)) {
                startService(stringExtra, intent.getLongExtra(PARAM_SESSIONID, Long.MIN_VALUE), false, intent.getStringExtra(EXTRA_DATA_DEVICECONFIG));
                return;
            }
            if (OPERATION_STOPSERVICE.equals(stringExtra)) {
                stopService(stringExtra, intent.getLongExtra(PARAM_SESSIONID, Long.MIN_VALUE), false);
                return;
            }
            if (OPERATION_GETDEVICELIST.equals(stringExtra)) {
                getDeviceList(stringExtra, intent.getLongExtra(PARAM_SESSIONID, Long.MIN_VALUE), false);
                return;
            }
            if (OPERATION_GETSTREAMTYPE.equals(stringExtra)) {
                getStreamType(stringExtra, intent.getLongExtra(PARAM_SESSIONID, Long.MIN_VALUE), false);
                return;
            }
            if (OPERATION_CONNECTDEVICE.equals(stringExtra)) {
                connectDevice(stringExtra, intent.getLongExtra(PARAM_SESSIONID, Long.MIN_VALUE), false, intent.getStringExtra(CONNECTDEVICE_DEVICENAME));
                return;
            }
            if (OPERATION_CONNECT_HIGHEST_PRIORITY_DEVICE.equals(stringExtra)) {
                connectHighestPriorityDevice(stringExtra, intent.getLongExtra(PARAM_SESSIONID, Long.MIN_VALUE), false);
                return;
            }
            if (OPERATION_EARACTION.equals(stringExtra)) {
                earAction(stringExtra, intent.getLongExtra(PARAM_SESSIONID, Long.MIN_VALUE), false, intent.getIntExtra(EXTRA_EARACTION, -1));
                return;
            }
            if (OPERATION_ISDEVICECHANGABLED.equals(stringExtra)) {
                isDeviceChangabled(stringExtra, intent.getLongExtra(PARAM_SESSIONID, Long.MIN_VALUE), false);
                return;
            }
            if (OPERATION_GETCONNECTEDDEVICE.equals(stringExtra)) {
                getConnectedDevice(stringExtra, intent.getLongExtra(PARAM_SESSIONID, Long.MIN_VALUE), false);
                return;
            }
            if (OPERATION_GETCONNECTINGDEVICE.equals(stringExtra)) {
                getConnectingDevice(stringExtra, intent.getLongExtra(PARAM_SESSIONID, Long.MIN_VALUE), false);
                return;
            }
            if (OPERATION_VOICECALL_PREPROCESS.equals(stringExtra)) {
                voicecallPreprocess(stringExtra, intent.getLongExtra(PARAM_SESSIONID, Long.MIN_VALUE), false, intent.getIntExtra(PARAM_MODEPOLICY, -1), intent.getIntExtra(PARAM_STREAMTYPE, -1));
                return;
            }
            if (OPERATION_VOICECALL_POSTPROCESS.equals(stringExtra)) {
                voicecallPostprocess(stringExtra, intent.getLongExtra(PARAM_SESSIONID, Long.MIN_VALUE), false);
                return;
            }
            if (OPERATION_VOICECALL_AUDIOPARAM_CHANGED.equals(stringExtra)) {
                voiceCallAudioParamChanged(stringExtra, intent.getLongExtra(PARAM_SESSIONID, Long.MIN_VALUE), false, intent.getIntExtra(PARAM_MODEPOLICY, -1), intent.getIntExtra(PARAM_STREAMTYPE, -1));
            } else {
                if (!OPERATION_STARTRING.equals(stringExtra)) {
                    if (OPERATION_STOPRING.equals(stringExtra)) {
                        stopRing(stringExtra, intent.getLongExtra(PARAM_SESSIONID, Long.MIN_VALUE), false);
                        return;
                    }
                    return;
                }
                startRing(stringExtra, intent.getLongExtra(PARAM_SESSIONID, Long.MIN_VALUE), false, intent.getIntExtra(PARAM_RING_DATASOURCE, -1), intent.getIntExtra(PARAM_RING_RSID, -1), (Uri) intent.getParcelableExtra(PARAM_RING_URI), intent.getStringExtra(PARAM_RING_FILEPATH), intent.getBooleanExtra(PARAM_RING_LOOP, false), intent.getIntExtra(PARAM_RING_LOOPCOUNT, 1), intent.getStringExtra(PARAM_RING_USERDATA_STRING), intent.getBooleanExtra(PARAM_RING_MODE, false));
            }
        } catch (Exception e) {
            if (QLog.isColorLevel()) {
                QLog.m85773e("TRAE", 2, "deal with receiver failed." + e.getMessage());
            }
        }
    }

    public void printDevices() {
        DeviceConfigManager deviceConfigManager;
        AudioDeviceInterface.LogTraceEntry("");
        int deviceNumber = this._deviceConfigManager.getDeviceNumber();
        if (QLog.isColorLevel()) {
            QLog.m85778w("TRAE", 2, "   ConnectedDevice:" + this._deviceConfigManager.getConnectedDevice());
        }
        if (QLog.isColorLevel()) {
            QLog.m85778w("TRAE", 2, "   ConnectingDevice:" + this._deviceConfigManager.getConnectingDevice());
        }
        if (QLog.isColorLevel()) {
            QLog.m85778w("TRAE", 2, "   prevConnectedDevice:" + this._deviceConfigManager.getPrevConnectedDevice());
        }
        if (QLog.isColorLevel()) {
            QLog.m85778w("TRAE", 2, "   AHPDevice:" + this._deviceConfigManager.getAvailabledHighestPriorityDevice());
        }
        if (QLog.isColorLevel()) {
            QLog.m85778w("TRAE", 2, "   deviceNamber:" + deviceNumber);
        }
        int i = 0;
        while (true) {
            deviceConfigManager = this._deviceConfigManager;
            if (i >= deviceNumber) {
                break;
            }
            String deviceName = deviceConfigManager.getDeviceName(i);
            if (QLog.isColorLevel()) {
                QLog.m85778w("TRAE", 2, "      " + i + " devName:" + deviceName + " Visible:" + this._deviceConfigManager.getVisible(deviceName) + " Priority:" + this._deviceConfigManager.getPriority(deviceName));
            }
            i++;
        }
        String[] strArr = (String[]) deviceConfigManager.getAvailableDeviceList().toArray(new String[0]);
        if (QLog.isColorLevel()) {
            QLog.m85778w("TRAE", 2, "   AvailableNamber:" + strArr.length);
        }
        for (int i2 = 0; i2 < strArr.length; i2++) {
            String str = strArr[i2];
            if (QLog.isColorLevel()) {
                QLog.m85778w("TRAE", 2, "      " + i2 + " devName:" + str + " Visible:" + this._deviceConfigManager.getVisible(str) + " Priority:" + this._deviceConfigManager.getPriority(str));
            }
        }
        AudioDeviceInterface.LogTraceExit();
    }

    public void release() {
        AudioDeviceInterface.LogTraceEntry("");
        TraeAudioManagerLooper traeAudioManagerLooper = this.mTraeAudioManagerLooper;
        if (traeAudioManagerLooper != null) {
            traeAudioManagerLooper.quit();
            this.mTraeAudioManagerLooper = null;
        }
        AudioDeviceInterface.LogTraceExit();
    }

    public int sendResBroadcast(final Intent intent, HashMap<String, Object> map, final int i) {
        if (this._context == null) {
            return -1;
        }
        Long l2 = (Long) map.get(PARAM_SESSIONID);
        if (QLog.isColorLevel()) {
            QLog.m85778w("TRAE", 2, " sessonID:" + l2 + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + ((String) map.get(PARAM_OPERATION)));
        }
        if (l2 == null || l2.longValue() == Long.MIN_VALUE) {
            InternalNotifyDeviceListUpdate();
            if (QLog.isColorLevel()) {
                QLog.m85773e("TRAE", 2, "sendResBroadcast sid null,don't send res");
            }
            return -1;
        }
        final Long l3 = (Long) map.get(PARAM_SESSIONID);
        final String str = (String) map.get(PARAM_OPERATION);
        if (!OPERATION_VOICECALL_PREPROCESS.equals(str)) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tencent.rtmp.sharp.jni.TraeAudioManager.1
                @Override // java.lang.Runnable
                public void run() {
                    intent.setAction(TraeAudioManager.ACTION_TRAEAUDIOMANAGER_RES);
                    intent.putExtra(TraeAudioManager.PARAM_SESSIONID, l3);
                    intent.putExtra(TraeAudioManager.PARAM_OPERATION, str);
                    intent.putExtra(TraeAudioManager.PARAM_RES_ERRCODE, i);
                    Context context = TraeAudioManager.this._context;
                    if (context != null) {
                        context.sendBroadcast(intent);
                    }
                }
            });
            return 0;
        }
        intent.setAction(ACTION_TRAEAUDIOMANAGER_RES);
        intent.putExtra(PARAM_SESSIONID, l3);
        intent.putExtra(PARAM_OPERATION, str);
        intent.putExtra(PARAM_RES_ERRCODE, i);
        TraeAudioSessionHost traeAudioSessionHost = this._audioSessionHost;
        if (traeAudioSessionHost == null) {
            return 0;
        }
        traeAudioSessionHost.sendToAudioSessionMessage(intent);
        return 0;
    }

    public void updateDeviceStatus() {
        boolean visible;
        int deviceNumber = this._deviceConfigManager.getDeviceNumber();
        for (int i = 0; i < deviceNumber; i++) {
            String deviceName = this._deviceConfigManager.getDeviceName(i);
            if (deviceName == null) {
                visible = false;
            } else if (deviceName.equals(DEVICE_BLUETOOTHHEADSET)) {
                BluetoohHeadsetCheckInterface bluetoohHeadsetCheckInterface = this._bluetoothCheck;
                DeviceConfigManager deviceConfigManager = this._deviceConfigManager;
                visible = bluetoohHeadsetCheckInterface == null ? deviceConfigManager.setVisible(deviceName, false) : deviceConfigManager.setVisible(deviceName, bluetoohHeadsetCheckInterface.isConnected());
            } else if (deviceName.equals(DEVICE_WIREDHEADSET)) {
                visible = this._deviceConfigManager.setVisible(deviceName, this._am.isWiredHeadsetOn());
            } else {
                if (deviceName.equals(DEVICE_SPEAKERPHONE)) {
                    this._deviceConfigManager.setVisible(deviceName, true);
                }
                visible = false;
            }
            if (visible && QLog.isColorLevel()) {
                QLog.m85778w("TRAE", 2, "pollUpdateDevice dev:" + deviceName + " Visible:" + this._deviceConfigManager.getVisible(deviceName));
            }
        }
        checkAutoDeviceListUpdate();
    }

    public class DeviceConfigManager {
        HashMap<String, DeviceConfig> deviceConfigs = new HashMap<>();
        String prevConnectedDevice = TraeAudioManager.DEVICE_NONE;
        String connectedDevice = TraeAudioManager.DEVICE_NONE;
        String connectingDevice = TraeAudioManager.DEVICE_NONE;
        ReentrantLock mLock = new ReentrantLock();
        boolean visiableUpdate = false;
        String _bluetoothDevName = CardButtonsShowAndHideType.unknow;

        public class DeviceConfig {
            String deviceName = TraeAudioManager.DEVICE_NONE;
            boolean visible = false;
            int priority = 0;

            public DeviceConfig() {
            }

            public String getDeviceName() {
                return this.deviceName;
            }

            public int getPriority() {
                return this.priority;
            }

            public boolean getVisible() {
                return this.visible;
            }

            public boolean init(String str, int i) {
                if (str == null || str.length() <= 0 || !TraeAudioManager.checkDevName(str)) {
                    return false;
                }
                this.deviceName = str;
                this.priority = i;
                return true;
            }

            public void setVisible(boolean z) {
                this.visible = z;
            }
        }

        public DeviceConfigManager() {
        }

        public boolean _addConfig(String str, int i) {
            AudioDeviceInterface.LogTraceEntry(" devName:" + str + " priority:" + i);
            DeviceConfig deviceConfig = new DeviceConfig();
            if (!deviceConfig.init(str, i)) {
                if (QLog.isColorLevel()) {
                    QLog.m85773e("TRAE", 2, " err dev init!");
                }
                return false;
            }
            if (this.deviceConfigs.containsKey(str)) {
                if (QLog.isColorLevel()) {
                    QLog.m85773e("TRAE", 2, "err dev exist!");
                }
                return false;
            }
            this.deviceConfigs.put(str, deviceConfig);
            this.visiableUpdate = true;
            if (QLog.isColorLevel()) {
                QLog.m85778w("TRAE", 2, " n" + getDeviceNumber() + " 0:" + getDeviceName(0));
            }
            AudioDeviceInterface.LogTraceExit();
            return true;
        }

        public ArrayList<String> _getAvailableDeviceList() {
            ArrayList<String> arrayList = new ArrayList<>();
            Iterator<Map.Entry<String, DeviceConfig>> it = this.deviceConfigs.entrySet().iterator();
            while (it.hasNext()) {
                DeviceConfig value = it.next().getValue();
                if (value != null && value.getVisible()) {
                    arrayList.add(value.getDeviceName());
                }
            }
            return arrayList;
        }

        public String _getConnectedDevice() {
            DeviceConfig deviceConfig = this.deviceConfigs.get(this.connectedDevice);
            return (deviceConfig == null || !deviceConfig.getVisible()) ? TraeAudioManager.DEVICE_NONE : this.connectedDevice;
        }

        public String _getPrevConnectedDevice() {
            DeviceConfig deviceConfig = this.deviceConfigs.get(this.prevConnectedDevice);
            return (deviceConfig == null || !deviceConfig.getVisible()) ? TraeAudioManager.DEVICE_NONE : this.prevConnectedDevice;
        }

        public void clearConfig() {
            this.mLock.lock();
            this.deviceConfigs.clear();
            this.prevConnectedDevice = TraeAudioManager.DEVICE_NONE;
            this.connectedDevice = TraeAudioManager.DEVICE_NONE;
            this.connectingDevice = TraeAudioManager.DEVICE_NONE;
            this.mLock.unlock();
        }

        public ArrayList<String> getAvailableDeviceList() {
            new ArrayList();
            this.mLock.lock();
            ArrayList<String> arrayList_getAvailableDeviceList = _getAvailableDeviceList();
            this.mLock.unlock();
            return arrayList_getAvailableDeviceList;
        }

        public String getAvailabledHighestPriorityDevice(String str) {
            this.mLock.lock();
            DeviceConfig deviceConfig = null;
            for (Map.Entry<String, DeviceConfig> entry : this.deviceConfigs.entrySet()) {
                entry.getKey();
                entry.getValue();
                DeviceConfig value = entry.getValue();
                if (value != null && value.getVisible() && !value.getDeviceName().equals(str) && (deviceConfig == null || value.getPriority() >= deviceConfig.getPriority())) {
                    deviceConfig = value;
                }
            }
            this.mLock.unlock();
            return deviceConfig != null ? deviceConfig.getDeviceName() : TraeAudioManager.DEVICE_SPEAKERPHONE;
        }

        public String getBluetoothName() {
            return this._bluetoothDevName;
        }

        public String getConnectedDevice() {
            this.mLock.lock();
            String str_getConnectedDevice = _getConnectedDevice();
            this.mLock.unlock();
            return str_getConnectedDevice;
        }

        public String getConnectingDevice() {
            this.mLock.lock();
            DeviceConfig deviceConfig = this.deviceConfigs.get(this.connectingDevice);
            String str = (deviceConfig == null || !deviceConfig.getVisible()) ? null : this.connectingDevice;
            this.mLock.unlock();
            return str;
        }

        public String getDeviceName(int i) {
            DeviceConfig value;
            this.mLock.lock();
            Iterator<Map.Entry<String, DeviceConfig>> it = this.deviceConfigs.entrySet().iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    value = null;
                    break;
                }
                Map.Entry<String, DeviceConfig> next = it.next();
                if (i2 == i) {
                    value = next.getValue();
                    break;
                }
                i2++;
            }
            String deviceName = value != null ? value.getDeviceName() : TraeAudioManager.DEVICE_NONE;
            this.mLock.unlock();
            return deviceName;
        }

        public int getDeviceNumber() {
            this.mLock.lock();
            int size = this.deviceConfigs.size();
            this.mLock.unlock();
            return size;
        }

        public String getPrevConnectedDevice() {
            this.mLock.lock();
            String str_getPrevConnectedDevice = _getPrevConnectedDevice();
            this.mLock.unlock();
            return str_getPrevConnectedDevice;
        }

        public int getPriority(String str) {
            this.mLock.lock();
            DeviceConfig deviceConfig = this.deviceConfigs.get(str);
            int priority = deviceConfig != null ? deviceConfig.getPriority() : -1;
            this.mLock.unlock();
            return priority;
        }

        public HashMap<String, Object> getSnapParams() {
            HashMap<String, Object> map = new HashMap<>();
            this.mLock.lock();
            map.put(TraeAudioManager.EXTRA_DATA_AVAILABLEDEVICE_LIST, _getAvailableDeviceList());
            map.put(TraeAudioManager.EXTRA_DATA_CONNECTEDDEVICE, _getConnectedDevice());
            map.put(TraeAudioManager.EXTRA_DATA_PREV_CONNECTEDDEVICE, _getPrevConnectedDevice());
            this.mLock.unlock();
            return map;
        }

        public boolean getVisiableUpdateFlag() {
            this.mLock.lock();
            boolean z = this.visiableUpdate;
            this.mLock.unlock();
            return z;
        }

        public boolean getVisible(String str) {
            this.mLock.lock();
            DeviceConfig deviceConfig = this.deviceConfigs.get(str);
            boolean visible = deviceConfig != null ? deviceConfig.getVisible() : false;
            this.mLock.unlock();
            return visible;
        }

        public boolean init(String str) {
            String strReplace;
            AudioDeviceInterface.LogTraceEntry(" strConfigs:" + str);
            if (str != null && str.length() > 0 && (strReplace = str.replace(SignParameters.NEW_LINE, "").replace("\r", "")) != null && strReplace.length() > 0) {
                if (strReplace.indexOf(Constants.PACKNAME_END) < 0) {
                    strReplace = strReplace.concat(Constants.PACKNAME_END);
                }
                String[] strArrSplit = strReplace.split(Constants.PACKNAME_END);
                if (strArrSplit != null && 1 <= strArrSplit.length) {
                    this.mLock.lock();
                    for (int i = 0; i < strArrSplit.length; i++) {
                        _addConfig(strArrSplit[i], i);
                    }
                    this.mLock.unlock();
                    TraeAudioManager.this.printDevices();
                    return true;
                }
            }
            return false;
        }

        public boolean isConnected(String str) {
            this.mLock.lock();
            DeviceConfig deviceConfig = this.deviceConfigs.get(str);
            boolean zEquals = (deviceConfig == null || !deviceConfig.getVisible()) ? false : this.connectedDevice.equals(str);
            this.mLock.unlock();
            return zEquals;
        }

        public void resetVisiableUpdateFlag() {
            this.mLock.lock();
            this.visiableUpdate = false;
            this.mLock.unlock();
        }

        public void setBluetoothName(String str) {
            if (str == null) {
                this._bluetoothDevName = CardButtonsShowAndHideType.unknow;
            } else if (str.isEmpty()) {
                this._bluetoothDevName = CardButtonsShowAndHideType.unknow;
            } else {
                this._bluetoothDevName = str;
            }
        }

        public boolean setConnected(String str) {
            boolean z;
            this.mLock.lock();
            DeviceConfig deviceConfig = this.deviceConfigs.get(str);
            if (deviceConfig == null || !deviceConfig.getVisible()) {
                z = false;
            } else {
                String str2 = this.connectedDevice;
                if (str2 != null && !str2.equals(str)) {
                    this.prevConnectedDevice = this.connectedDevice;
                }
                this.connectedDevice = str;
                this.connectingDevice = "";
                z = true;
            }
            this.mLock.unlock();
            return z;
        }

        public boolean setConnecting(String str) {
            boolean z;
            this.mLock.lock();
            DeviceConfig deviceConfig = this.deviceConfigs.get(str);
            if (deviceConfig == null || !deviceConfig.getVisible()) {
                z = false;
            } else {
                this.connectingDevice = str;
                z = true;
            }
            this.mLock.unlock();
            return z;
        }

        public boolean setVisible(String str, boolean z) {
            boolean z2;
            this.mLock.lock();
            DeviceConfig deviceConfig = this.deviceConfigs.get(str);
            if (deviceConfig == null || deviceConfig.getVisible() == z) {
                z2 = false;
            } else {
                deviceConfig.setVisible(z);
                z2 = true;
                this.visiableUpdate = true;
                if (QLog.isColorLevel()) {
                    StringBuilder sb = new StringBuilder(" ++setVisible:");
                    sb.append(str);
                    sb.append(z ? " Y" : " N");
                    QLog.m85778w("TRAE", 2, sb.toString());
                }
            }
            this.mLock.unlock();
            return z2;
        }

        public String getAvailabledHighestPriorityDevice() {
            this.mLock.lock();
            DeviceConfig deviceConfig = null;
            for (Map.Entry<String, DeviceConfig> entry : this.deviceConfigs.entrySet()) {
                entry.getKey();
                entry.getValue();
                DeviceConfig value = entry.getValue();
                if (value != null && value.getVisible() && (deviceConfig == null || value.getPriority() >= deviceConfig.getPriority())) {
                    deviceConfig = value;
                }
            }
            this.mLock.unlock();
            return deviceConfig != null ? deviceConfig.getDeviceName() : TraeAudioManager.DEVICE_SPEAKERPHONE;
        }
    }
}
