package io.agora.rtc2.internal;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import io.agora.utils2.internal.Logging;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import p153l.jj5;

/* JADX INFO: loaded from: classes2.dex */
public class AudioDeviceInventoryLowerThanM implements AudioRoutingController.AudioDeviceInventory {
    private static final int ANDROID_SNOW_CONE = 31;
    private static final String PERMISSION_BLUETOOTH_CONNECT = "android.permission.BLUETOOTH_CONNECT";
    private static final String TAG = "AudioRoute";
    private static AudioRoutingController.MockedBroadcaseter mockedBroadcaster;
    private AudioRoutingController.AudioDeviceChangedCallback mAudioDeviceChangedCb;
    private BluetoothAdapter mBTAdapter;
    private BluetoothHeadset mBTHeadset;
    private BluetoothProfile.ServiceListener mBTHeadsetListener;
    private final WeakReference<Context> mContext;
    private final int STATE_DISCONNECT = -1;
    private final int STATE_CONNECT = 1;
    private final String HEADSET_EXTRA_STATE = "state";
    private HeadsetBroadcastReceiver mHeadsetReceiver = null;
    private BTHeadsetBroadcastReceiver mBTHeadsetReceiver = null;
    private int mHeadsetType = -1;

    public class BTHeadsetBroadcastReceiver extends BroadcastReceiver {
        private boolean isRegistered;

        private BTHeadsetBroadcastReceiver() {
            this.isRegistered = false;
        }

        public boolean getRegistered() {
            return this.isRegistered;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            AudioDeviceInventoryLowerThanM.this.processBluetoothIntent(intent);
        }

        public void setRegistered(boolean z) {
            this.isRegistered = z;
        }
    }

    public class HeadsetBroadcastReceiver extends BroadcastReceiver {
        private boolean isRegistered;

        private HeadsetBroadcastReceiver() {
            this.isRegistered = false;
        }

        public boolean getRegistered() {
            return this.isRegistered;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equalsIgnoreCase("android.intent.action.HEADSET_PLUG") && intent.hasExtra("state")) {
                boolean zProcessHeadsetIntent = AudioDeviceInventoryLowerThanM.this.processHeadsetIntent(intent);
                AudioDeviceInventoryLowerThanM audioDeviceInventoryLowerThanM = AudioDeviceInventoryLowerThanM.this;
                audioDeviceInventoryLowerThanM.onAudioDeviceChanged(audioDeviceInventoryLowerThanM.mHeadsetType, zProcessHeadsetIntent);
            }
        }

        public void setRegistered(boolean z) {
            this.isRegistered = z;
        }
    }

    public AudioDeviceInventoryLowerThanM(Context context) {
        this.mContext = new WeakReference<>(context);
        Logging.m88111i(TAG, "AudioDeviceInventoryLowerThanM ctor!");
    }

    private void clearBTResource() {
        BluetoothAdapter bluetoothAdapter = this.mBTAdapter;
        if (bluetoothAdapter != null) {
            bluetoothAdapter.closeProfileProxy(1, this.mBTHeadset);
            this.mBTAdapter = null;
        }
        if (this.mBTHeadsetListener != null) {
            this.mBTHeadsetListener = null;
        }
    }

    private int getBtConnectedDevicesSize() {
        BluetoothHeadset bluetoothHeadset = this.mBTHeadset;
        if (bluetoothHeadset == null) {
            return 0;
        }
        try {
            List<BluetoothDevice> connectedDevices = bluetoothHeadset.getConnectedDevices();
            Iterator<BluetoothDevice> it = connectedDevices.iterator();
            while (it.hasNext()) {
                Logging.m88111i(TAG, "connected device name: " + it.next().getName());
            }
            return connectedDevices.size();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    private void initBluetoothProfileListener() {
        try {
            this.mBTHeadsetListener = new BluetoothProfile.ServiceListener() { // from class: io.agora.rtc2.internal.AudioDeviceInventoryLowerThanM.1
                @Override // android.bluetooth.BluetoothProfile.ServiceListener
                public void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
                    Logging.m88111i(AudioDeviceInventoryLowerThanM.TAG, "onServiceConnected " + i + " =? headset(1)");
                    if (i == 1) {
                        Logging.m88111i(AudioDeviceInventoryLowerThanM.TAG, "on BT service connected: " + i + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + bluetoothProfile);
                        AudioDeviceInventoryLowerThanM.this.mBTHeadset = (BluetoothHeadset) bluetoothProfile;
                    }
                }

                @Override // android.bluetooth.BluetoothProfile.ServiceListener
                public void onServiceDisconnected(int i) {
                    Logging.m88111i(AudioDeviceInventoryLowerThanM.TAG, "onServiceDisconnected " + i + " =? headset(1)");
                    if (i == 1) {
                        Logging.m88111i(AudioDeviceInventoryLowerThanM.TAG, "on BT service disconnected: " + i);
                        AudioDeviceInventoryLowerThanM.this.onAudioDeviceEvent(0);
                        AudioDeviceInventoryLowerThanM.this.mBTHeadset = null;
                    }
                }
            };
        } catch (Exception e) {
            Logging.m88108e(TAG, "initialize failed: unable to create BluetoothProfile.ServiceListener, err=" + e.getMessage());
        }
    }

    private void initBtBroadcastReceiver(Context context) {
        int i = Build.VERSION.SDK_INT;
        if ((i >= 31 && !hasPermission(context, PERMISSION_BLUETOOTH_CONNECT)) || (i < 31 && !hasPermission(context, "android.permission.BLUETOOTH"))) {
            Logging.m88113w(TAG, "do not support BT monitoring on this device");
            return;
        }
        initBluetoothProfileListener();
        try {
            if (this.mBTHeadsetReceiver == null) {
                this.mBTHeadsetReceiver = new BTHeadsetBroadcastReceiver();
            }
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            this.mBTAdapter = defaultAdapter;
            if (defaultAdapter == null) {
                Logging.m88108e(TAG, "initialize: failed to get bluetooth adapter!!");
                return;
            }
            defaultAdapter.getProfileProxy(context, this.mBTHeadsetListener, 1);
            IntentFilter intentFilter = new IntentFilter("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
            intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
            if (this.mBTHeadsetReceiver.getRegistered()) {
                return;
            }
            jj5.m145018l(context, this.mBTHeadsetReceiver, intentFilter);
            AudioRoutingController.MockedBroadcaseter mockedBroadcaseter = mockedBroadcaster;
            if (mockedBroadcaseter != null) {
                mockedBroadcaseter.registerReceiver(this.mBTHeadsetReceiver, intentFilter);
            }
            this.mBTHeadsetReceiver.setRegistered(true);
        } catch (Exception e) {
            Logging.m88108e(TAG, "unable to create BluetoothHeadsetBroadcastReceiver, err:" + e.getMessage());
        }
    }

    private void initHeadsetBroadcastReceiver(Context context) {
        if (this.mHeadsetReceiver == null) {
            this.mHeadsetReceiver = new HeadsetBroadcastReceiver();
        }
        if (this.mHeadsetReceiver.getRegistered()) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter("android.intent.action.HEADSET_PLUG");
        Intent intentM145018l = jj5.m145018l(context, this.mHeadsetReceiver, intentFilter);
        if (intentM145018l != null && TextUtils.equals(intentM145018l.getAction(), "android.intent.action.HEADSET_PLUG")) {
            processHeadsetIntent(intentM145018l);
        }
        AudioRoutingController.MockedBroadcaseter mockedBroadcaseter = mockedBroadcaster;
        if (mockedBroadcaseter != null) {
            mockedBroadcaseter.registerReceiver(this.mHeadsetReceiver, intentFilter);
        }
        this.mHeadsetReceiver.setRegistered(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onAudioDeviceChanged(int i, boolean z) {
        StringBuilder sb = new StringBuilder("onAudioDeviceChanged route :");
        sb.append(i);
        sb.append(" status: ");
        sb.append(z ? "connect" : "disconnect");
        Logging.m88111i(TAG, sb.toString());
        AudioRoutingController.AudioDeviceChangedCallback audioDeviceChangedCallback = this.mAudioDeviceChangedCb;
        if (audioDeviceChangedCallback != null) {
            audioDeviceChangedCallback.onAudioDeviceChanged(z, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onAudioDeviceEvent(int i) {
        AudioRoutingController.AudioDeviceChangedCallback audioDeviceChangedCallback = this.mAudioDeviceChangedCb;
        if (audioDeviceChangedCallback != null) {
            audioDeviceChangedCallback.onAudioDeviceEvent(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processBluetoothIntent(Intent intent) {
        String action = intent.getAction();
        try {
            if (action.equals("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED")) {
                int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", -99);
                int intExtra2 = intent.getIntExtra("android.bluetooth.profile.extra.PREVIOUS_STATE", -99);
                BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                Logging.m88105d(TAG, "BT " + (bluetoothDevice != null ? bluetoothDevice.getName() : "null name") + " hfp connect state : " + intExtra2 + ", " + intExtra);
                if (intExtra != 0) {
                    if (intExtra != 2) {
                        Logging.m88111i(TAG, bluetoothDevice + " unknown event, state=" + intExtra);
                        return;
                    }
                    Logging.m88111i(TAG, "Bluetooth device " + bluetoothDevice + " connected");
                    onAudioDeviceChanged(5, true);
                    return;
                }
                Logging.m88111i(TAG, "Bluetooth device " + bluetoothDevice + " disconnected");
                if (getBtConnectedDevicesSize() != 0) {
                    onAudioDeviceEvent(1);
                    return;
                }
            } else {
                if (!action.equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
                    return;
                }
                int intExtra3 = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -99);
                Logging.m88105d(TAG, "BluetoothAdapter.ACTION_STATE_CHANGED prev " + intent.getIntExtra("android.bluetooth.adapter.extra.PREVIOUS_STATE", -99) + ", " + intExtra3);
                if (intExtra3 != 10) {
                    return;
                }
            }
            onAudioDeviceChanged(5, false);
        } catch (Exception e) {
            Logging.m88109e(TAG, "BT broadcast receiver onReceive fail ", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean processHeadsetIntent(Intent intent) {
        int intExtra = intent.getIntExtra("state", -1);
        int intExtra2 = intent.getIntExtra("microphone", -1);
        if (intExtra == 1) {
            this.mHeadsetType = intExtra2 == 1 ? 0 : 2;
        }
        return intExtra == 1;
    }

    @VisibleForTesting
    public static void setMockedBroadcaster(AudioRoutingController.MockedBroadcaseter mockedBroadcaseter) {
        mockedBroadcaster = mockedBroadcaseter;
    }

    @Override // io.agora.rtc2.internal.AudioRoutingController.AudioDeviceInventory
    public void dispose() {
        try {
            clearBTResource();
            Context context = this.mContext.get();
            if (context != null) {
                HeadsetBroadcastReceiver headsetBroadcastReceiver = this.mHeadsetReceiver;
                if (headsetBroadcastReceiver != null && headsetBroadcastReceiver.getRegistered()) {
                    context.unregisterReceiver(this.mHeadsetReceiver);
                    AudioRoutingController.MockedBroadcaseter mockedBroadcaseter = mockedBroadcaster;
                    if (mockedBroadcaseter != null) {
                        mockedBroadcaseter.unRegisterReceiver(this.mHeadsetReceiver);
                    }
                    this.mHeadsetReceiver.setRegistered(false);
                }
                BTHeadsetBroadcastReceiver bTHeadsetBroadcastReceiver = this.mBTHeadsetReceiver;
                if (bTHeadsetBroadcastReceiver != null && bTHeadsetBroadcastReceiver.getRegistered()) {
                    context.unregisterReceiver(this.mBTHeadsetReceiver);
                    AudioRoutingController.MockedBroadcaseter mockedBroadcaseter2 = mockedBroadcaster;
                    if (mockedBroadcaseter2 != null) {
                        mockedBroadcaseter2.unRegisterReceiver(this.mBTHeadsetReceiver);
                    }
                    this.mBTHeadsetReceiver.setRegistered(false);
                }
            }
            this.mHeadsetReceiver = null;
            this.mBTHeadsetReceiver = null;
        } catch (Exception e) {
            Logging.m88109e(TAG, "AudioDeviceInventoryLowerThanM dispose fail: ", e);
        }
    }

    public boolean hasPermission(Context context, String str) {
        return context.checkPermission(str, Process.myPid(), Process.myUid()) == 0;
    }

    @Override // io.agora.rtc2.internal.AudioRoutingController.AudioDeviceInventory
    public void initialize() {
        Context context = this.mContext.get();
        Logging.m88111i(TAG, "AudioDeviceInventoryLowerThanM initialize +");
        initHeadsetBroadcastReceiver(context);
        initBtBroadcastReceiver(context);
    }

    @Override // io.agora.rtc2.internal.AudioRoutingController.AudioDeviceInventory
    public boolean isDeviceAvaliable(int i) {
        if (i != 5) {
            return (i == 0 || i == 2) && this.mHeadsetType == i;
        }
        BluetoothAdapter bluetoothAdapter = this.mBTAdapter;
        if (bluetoothAdapter != null && 2 == jj5.m145010d(bluetoothAdapter, 1)) {
            return true;
        }
        return false;
    }

    @Override // io.agora.rtc2.internal.AudioRoutingController.AudioDeviceInventory
    public void setAudioDeviceChangeCallback(AudioRoutingController.AudioDeviceChangedCallback audioDeviceChangedCallback) {
        this.mAudioDeviceChangedCb = audioDeviceChangedCallback;
    }
}
