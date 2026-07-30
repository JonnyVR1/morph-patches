package com.tencent.rtmp.sharp.jni;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Process;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import p149l.ii5;

/* JADX INFO: loaded from: classes2.dex */
public class TraeAudioSession extends BroadcastReceiver {
    static int s_nSessionIdAllocator;
    private ITraeAudioCallback mCallback;
    private Context mContext;
    private boolean mIsHostside;
    private long mSessionId;
    private String _connectedDev = TraeAudioManager.DEVICE_NONE;
    private boolean _canSwtich2Earphone = true;
    final String TRAE_ACTION_PHONE_STATE = "android.intent.action.PHONE_STATE";

    public interface ITraeAudioCallback {
        void onAudioRouteSwitchEnd(String str, long j);

        void onAudioRouteSwitchStart(String str, String str2);

        void onConnectDeviceRes(int i, String str, boolean z);

        void onDeviceChangabledUpdate(boolean z);

        void onDeviceListUpdate(String[] strArr, String str, String str2, String str3);

        void onGetConnectedDeviceRes(int i, String str);

        void onGetConnectingDeviceRes(int i, String str);

        void onGetDeviceListRes(int i, String[] strArr, String str, String str2, String str3);

        void onGetStreamTypeRes(int i, int i2);

        void onIsDeviceChangabledRes(int i, boolean z);

        void onRingCompletion(int i, String str);

        void onServiceStateUpdate(boolean z);

        void onStreamTypeUpdate(int i);

        void onVoicecallPreprocessRes(int i);
    }

    public TraeAudioSession(Context context, ITraeAudioCallback iTraeAudioCallback) {
        this.mIsHostside = false;
        this.mSessionId = Long.MIN_VALUE;
        this.mIsHostside = Process.myPid() == TraeAudioManager._gHostProcessId;
        this.mSessionId = requestSessionId();
        this.mCallback = iTraeAudioCallback;
        this.mContext = context;
        if (context == null && QLog.isColorLevel()) {
            StringBuilder sb = new StringBuilder("AudioSession | Invalid parameters: ctx = ");
            sb.append(context == null ? "null" : "{object}");
            sb.append("; cb = ");
            sb.append(iTraeAudioCallback == null ? "null" : "{object}");
            QLog.m84595w("TRAE", 2, sb.toString());
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(TraeAudioManager.ACTION_TRAEAUDIOMANAGER_RES);
        intentFilter.addAction(TraeAudioManager.ACTION_TRAEAUDIOMANAGER_NOTIFY);
        if (context != null) {
            try {
                ii5.m136342l(context, this, intentFilter);
            } catch (Exception e) {
                if (QLog.isColorLevel()) {
                    QLog.m84590e("TRAE", 2, "registerReceiver Exception: " + e.getMessage());
                }
            }
        }
        registerAudioSession(this, true);
        if (QLog.isColorLevel()) {
            QLog.m84595w("TRAE", 2, "TraeAudioSession create, mSessionId: " + this.mSessionId);
        }
    }

    public static void ExConnectDevice(Context context, String str) {
        if (context == null || str == null || str.length() <= 0) {
            return;
        }
        Intent intent = new Intent();
        intent.setAction(TraeAudioManager.ACTION_TRAEAUDIOMANAGER_REQUEST);
        intent.putExtra(TraeAudioManager.PARAM_SESSIONID, Long.MIN_VALUE);
        intent.putExtra(TraeAudioManager.PARAM_OPERATION, TraeAudioManager.OPERATION_CONNECTDEVICE);
        intent.putExtra(TraeAudioManager.CONNECTDEVICE_DEVICENAME, str);
        context.sendBroadcast(intent);
    }

    private int registerAudioSession(TraeAudioSession traeAudioSession, boolean z) {
        Context context = this.mContext;
        if (context == null) {
            return -1;
        }
        return TraeAudioManager.registerAudioSession(traeAudioSession, z, this.mSessionId, context);
    }

    public static long requestSessionId() {
        long jMyPid = ((long) Process.myPid()) << 32;
        int i = s_nSessionIdAllocator + 1;
        s_nSessionIdAllocator = i;
        return jMyPid + ((long) i);
    }

    public int EarAction(int i) {
        boolean z = this.mIsHostside;
        if (z) {
            return TraeAudioManager.earAction(TraeAudioManager.OPERATION_EARACTION, this.mSessionId, z, i);
        }
        if (this.mContext == null) {
            return -1;
        }
        if (i != 0 && i != 1) {
            return -1;
        }
        Intent intent = new Intent();
        intent.setAction(TraeAudioManager.ACTION_TRAEAUDIOMANAGER_REQUEST);
        intent.putExtra(TraeAudioManager.PARAM_SESSIONID, this.mSessionId);
        intent.putExtra(TraeAudioManager.PARAM_OPERATION, TraeAudioManager.OPERATION_EARACTION);
        intent.putExtra(TraeAudioManager.EXTRA_EARACTION, i);
        this.mContext.sendBroadcast(intent);
        return 0;
    }

    public int connectDevice(String str) {
        boolean z = this.mIsHostside;
        if (z) {
            return TraeAudioManager.connectDevice(TraeAudioManager.OPERATION_CONNECTDEVICE, this.mSessionId, z, str);
        }
        if (this.mContext == null || str == null || str.length() <= 0) {
            return -1;
        }
        Intent intent = new Intent();
        intent.setAction(TraeAudioManager.ACTION_TRAEAUDIOMANAGER_REQUEST);
        intent.putExtra(TraeAudioManager.PARAM_SESSIONID, this.mSessionId);
        intent.putExtra(TraeAudioManager.PARAM_OPERATION, TraeAudioManager.OPERATION_CONNECTDEVICE);
        intent.putExtra(TraeAudioManager.CONNECTDEVICE_DEVICENAME, str);
        this.mContext.sendBroadcast(intent);
        return 0;
    }

    public int connectHighestPriorityDevice() {
        boolean z = this.mIsHostside;
        if (z) {
            return TraeAudioManager.connectHighestPriorityDevice(TraeAudioManager.OPERATION_CONNECT_HIGHEST_PRIORITY_DEVICE, this.mSessionId, z);
        }
        if (this.mContext == null) {
            return -1;
        }
        Intent intent = new Intent();
        intent.setAction(TraeAudioManager.ACTION_TRAEAUDIOMANAGER_REQUEST);
        intent.putExtra(TraeAudioManager.PARAM_SESSIONID, this.mSessionId);
        intent.putExtra(TraeAudioManager.PARAM_OPERATION, TraeAudioManager.OPERATION_CONNECT_HIGHEST_PRIORITY_DEVICE);
        this.mContext.sendBroadcast(intent);
        return 0;
    }

    public int disableDeviceSwitch() {
        return TraeAudioManager.disableDeviceSwitch();
    }

    public int getConnectedDevice() {
        boolean z = this.mIsHostside;
        if (z) {
            return TraeAudioManager.getConnectedDevice(TraeAudioManager.OPERATION_GETCONNECTEDDEVICE, this.mSessionId, z);
        }
        if (this.mContext == null) {
            return -1;
        }
        Intent intent = new Intent();
        intent.setAction(TraeAudioManager.ACTION_TRAEAUDIOMANAGER_REQUEST);
        intent.putExtra(TraeAudioManager.PARAM_SESSIONID, this.mSessionId);
        intent.putExtra(TraeAudioManager.PARAM_OPERATION, TraeAudioManager.OPERATION_GETCONNECTEDDEVICE);
        this.mContext.sendBroadcast(intent);
        return 0;
    }

    public int getConnectingDevice() {
        boolean z = this.mIsHostside;
        if (z) {
            return TraeAudioManager.getConnectingDevice(TraeAudioManager.OPERATION_GETCONNECTINGDEVICE, this.mSessionId, z);
        }
        if (this.mContext == null) {
            return -1;
        }
        Intent intent = new Intent();
        intent.setAction(TraeAudioManager.ACTION_TRAEAUDIOMANAGER_REQUEST);
        intent.putExtra(TraeAudioManager.PARAM_SESSIONID, this.mSessionId);
        intent.putExtra(TraeAudioManager.PARAM_OPERATION, TraeAudioManager.OPERATION_GETCONNECTINGDEVICE);
        this.mContext.sendBroadcast(intent);
        return 0;
    }

    public int getDeviceList() {
        boolean z = this.mIsHostside;
        if (z) {
            return TraeAudioManager.getDeviceList(TraeAudioManager.OPERATION_GETDEVICELIST, this.mSessionId, z);
        }
        if (this.mContext == null) {
            return -1;
        }
        Intent intent = new Intent();
        intent.setAction(TraeAudioManager.ACTION_TRAEAUDIOMANAGER_REQUEST);
        intent.putExtra(TraeAudioManager.PARAM_SESSIONID, this.mSessionId);
        intent.putExtra(TraeAudioManager.PARAM_OPERATION, TraeAudioManager.OPERATION_GETDEVICELIST);
        this.mContext.sendBroadcast(intent);
        return 0;
    }

    public int getStreamType() {
        boolean z = this.mIsHostside;
        if (z) {
            return TraeAudioManager.getStreamType(TraeAudioManager.OPERATION_GETSTREAMTYPE, this.mSessionId, z);
        }
        if (this.mContext == null) {
            return -1;
        }
        Intent intent = new Intent();
        intent.setAction(TraeAudioManager.ACTION_TRAEAUDIOMANAGER_REQUEST);
        intent.putExtra(TraeAudioManager.PARAM_SESSIONID, this.mSessionId);
        intent.putExtra(TraeAudioManager.PARAM_OPERATION, TraeAudioManager.OPERATION_GETSTREAMTYPE);
        this.mContext.sendBroadcast(intent);
        return 0;
    }

    public int isDeviceChangabled() {
        boolean z = this.mIsHostside;
        if (z) {
            return TraeAudioManager.isDeviceChangabled(TraeAudioManager.OPERATION_ISDEVICECHANGABLED, this.mSessionId, z);
        }
        if (this.mContext == null) {
            return -1;
        }
        Intent intent = new Intent();
        intent.setAction(TraeAudioManager.ACTION_TRAEAUDIOMANAGER_REQUEST);
        intent.putExtra(TraeAudioManager.PARAM_SESSIONID, this.mSessionId);
        intent.putExtra(TraeAudioManager.PARAM_OPERATION, TraeAudioManager.OPERATION_ISDEVICECHANGABLED);
        this.mContext.sendBroadcast(intent);
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:197:0x049c  */
    /* JADX WARN: Code duplicated, block: B:234:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:197:0x049c, please report this as an issue */
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        int i;
        Intent intent2 = intent;
        try {
            if (intent2 == null) {
                if (QLog.isColorLevel()) {
                    QLog.m84595w("TRAE", 2, "[ERROR] intent = null!!");
                    return;
                }
                return;
            }
            long longExtra = intent2.getLongExtra(TraeAudioManager.PARAM_SESSIONID, Long.MIN_VALUE);
            String stringExtra = intent2.getStringExtra(TraeAudioManager.PARAM_OPERATION);
            int intExtra = intent2.getIntExtra(TraeAudioManager.PARAM_RES_ERRCODE, 0);
            boolean zEquals = TraeAudioManager.ACTION_TRAEAUDIOMANAGER_NOTIFY.equals(intent2.getAction());
            String str = MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
            if (zEquals) {
                if (TraeAudioManager.NOTIFY_SERVICE_STATE.equals(stringExtra)) {
                    boolean booleanExtra = intent2.getBooleanExtra(TraeAudioManager.NOTIFY_SERVICE_STATE_DATE, false);
                    if (QLog.isColorLevel()) {
                        QLog.m84595w("TRAE", 2, "AudioSession|[onServiceStateUpdate]".concat(booleanExtra ? "on" : BLiveOperationTitleShowType.off));
                    }
                    ITraeAudioCallback iTraeAudioCallback = this.mCallback;
                    if (iTraeAudioCallback != null) {
                        iTraeAudioCallback.onServiceStateUpdate(booleanExtra);
                        return;
                    }
                    return;
                }
                try {
                    if (TraeAudioManager.NOTIFY_DEVICELIST_UPDATE.equals(stringExtra)) {
                        String[] stringArrayExtra = intent2.getStringArrayExtra(TraeAudioManager.EXTRA_DATA_AVAILABLEDEVICE_LIST);
                        String stringExtra2 = intent2.getStringExtra(TraeAudioManager.EXTRA_DATA_CONNECTEDDEVICE);
                        String stringExtra3 = intent2.getStringExtra(TraeAudioManager.EXTRA_DATA_PREV_CONNECTEDDEVICE);
                        String stringExtra4 = intent2.getStringExtra(TraeAudioManager.EXTRA_DATA_IF_HAS_BLUETOOTH_THIS_IS_NAME);
                        String str2 = SignParameters.NEW_LINE;
                        boolean z = true;
                        for (int i2 = 0; i2 < stringArrayExtra.length; i2++) {
                            str2 = str2 + "AudioSession|    " + i2 + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + stringArrayExtra[i2] + SignParameters.NEW_LINE;
                            if (stringArrayExtra[i2].equals(TraeAudioManager.DEVICE_WIREDHEADSET) || stringArrayExtra[i2].equals(TraeAudioManager.DEVICE_BLUETOOTHHEADSET)) {
                                z = false;
                            }
                        }
                        String str3 = str2 + SignParameters.NEW_LINE;
                        if (QLog.isColorLevel()) {
                            QLog.m84595w("TRAE", 2, "AudioSession|[onDeviceListUpdate]  connected:" + stringExtra2 + " prevConnected:" + stringExtra3 + " bt:" + stringExtra4 + " Num:" + stringArrayExtra.length + str3);
                        }
                        this._canSwtich2Earphone = z;
                        this._connectedDev = stringExtra2;
                        ITraeAudioCallback iTraeAudioCallback2 = this.mCallback;
                        if (iTraeAudioCallback2 != null) {
                            iTraeAudioCallback2.onDeviceListUpdate(stringArrayExtra, stringExtra2, stringExtra3, stringExtra4);
                            return;
                        }
                        return;
                    }
                    if (TraeAudioManager.NOTIFY_DEVICECHANGABLE_UPDATE.equals(stringExtra)) {
                        boolean booleanExtra2 = intent.getBooleanExtra(TraeAudioManager.NOTIFY_DEVICECHANGABLE_UPDATE_DATE, true);
                        if (QLog.isColorLevel()) {
                            QLog.m84595w("TRAE", 2, "AudioSession|[onDeviceChangabledUpdate]" + booleanExtra2);
                        }
                        ITraeAudioCallback iTraeAudioCallback3 = this.mCallback;
                        if (iTraeAudioCallback3 != null) {
                            iTraeAudioCallback3.onDeviceChangabledUpdate(booleanExtra2);
                            return;
                        }
                        return;
                    }
                    if (TraeAudioManager.NOTIFY_STREAMTYPE_UPDATE.equals(stringExtra)) {
                        int intExtra2 = intent.getIntExtra(TraeAudioManager.EXTRA_DATA_STREAMTYPE, -1);
                        if (intExtra != 0 && QLog.isColorLevel()) {
                            QLog.m84595w("TRAE", 2, "AudioSession|[onStreamTypeUpdate] err:" + intExtra + " st:" + intExtra2);
                        }
                        ITraeAudioCallback iTraeAudioCallback4 = this.mCallback;
                        if (iTraeAudioCallback4 != null) {
                            iTraeAudioCallback4.onStreamTypeUpdate(intExtra2);
                            return;
                        }
                        return;
                    }
                    if (TraeAudioManager.NOTIFY_ROUTESWITCHSTART.equals(stringExtra)) {
                        String stringExtra5 = intent.getStringExtra(TraeAudioManager.EXTRA_DATA_ROUTESWITCHSTART_FROM);
                        String stringExtra6 = intent.getStringExtra(TraeAudioManager.EXTRA_DATA_ROUTESWITCHSTART_TO);
                        ITraeAudioCallback iTraeAudioCallback5 = this.mCallback;
                        if (iTraeAudioCallback5 == null || stringExtra5 == null || stringExtra6 == null) {
                            return;
                        }
                        iTraeAudioCallback5.onAudioRouteSwitchStart(stringExtra5, stringExtra6);
                        return;
                    }
                    if (TraeAudioManager.NOTIFY_ROUTESWITCHEND.equals(stringExtra)) {
                        String stringExtra7 = intent.getStringExtra(TraeAudioManager.EXTRA_DATA_ROUTESWITCHEND_DEV);
                        long longExtra2 = intent.getLongExtra(TraeAudioManager.EXTRA_DATA_ROUTESWITCHEND_TIME, -1L);
                        ITraeAudioCallback iTraeAudioCallback6 = this.mCallback;
                        if (iTraeAudioCallback6 == null || stringExtra7 == null || longExtra2 == -1) {
                            return;
                        }
                        iTraeAudioCallback6.onAudioRouteSwitchEnd(stringExtra7, longExtra2);
                        return;
                    }
                    return;
                } catch (Exception e) {
                    e = e;
                    intent2 = intent;
                    str = "TRAE";
                    if (QLog.isColorLevel()) {
                        QLog.m84590e(str, 2, "AudioSession| nSessinId = " + this.mSessionId + " onReceive::intent:" + intent2.toString() + " intent.getAction():" + intent2.getAction() + " Exception:" + e.getMessage());
                    }
                }
            }
            try {
                if (TraeAudioManager.ACTION_TRAEAUDIOMANAGER_RES.equals(intent2.getAction()) && this.mSessionId == longExtra) {
                    try {
                        if (TraeAudioManager.OPERATION_GETDEVICELIST.equals(stringExtra)) {
                            String[] stringArrayExtra2 = intent2.getStringArrayExtra(TraeAudioManager.EXTRA_DATA_AVAILABLEDEVICE_LIST);
                            String stringExtra8 = intent2.getStringExtra(TraeAudioManager.EXTRA_DATA_CONNECTEDDEVICE);
                            String stringExtra9 = intent2.getStringExtra(TraeAudioManager.EXTRA_DATA_PREV_CONNECTEDDEVICE);
                            String stringExtra10 = intent2.getStringExtra(TraeAudioManager.EXTRA_DATA_IF_HAS_BLUETOOTH_THIS_IS_NAME);
                            String str4 = SignParameters.NEW_LINE;
                            boolean z2 = true;
                            for (int i3 = 0; i3 < stringArrayExtra2.length; i3++) {
                                str4 = str4 + "AudioSession|    " + i3 + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + stringArrayExtra2[i3] + SignParameters.NEW_LINE;
                                if (stringArrayExtra2[i3].equals(TraeAudioManager.DEVICE_WIREDHEADSET) || stringArrayExtra2[i3].equals(TraeAudioManager.DEVICE_BLUETOOTHHEADSET)) {
                                    z2 = false;
                                }
                            }
                            String str5 = str4 + SignParameters.NEW_LINE;
                            this._canSwtich2Earphone = z2;
                            this._connectedDev = stringExtra8;
                            if (QLog.isColorLevel()) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("AudioSession|[onGetDeviceListRes] err:");
                                i = intExtra;
                                sb.append(i);
                                sb.append(" connected:");
                                sb.append(stringExtra8);
                                sb.append(" prevConnected:");
                                sb.append(stringExtra9);
                                sb.append(" bt:");
                                sb.append(stringExtra10);
                                sb.append(" Num:");
                                sb.append(stringArrayExtra2.length);
                                sb.append(str5);
                                QLog.m84595w("TRAE", 2, sb.toString());
                            } else {
                                i = intExtra;
                            }
                            ITraeAudioCallback iTraeAudioCallback7 = this.mCallback;
                            if (iTraeAudioCallback7 != null) {
                                iTraeAudioCallback7.onGetDeviceListRes(i, stringArrayExtra2, stringExtra8, stringExtra9, stringExtra10);
                                return;
                            }
                            return;
                        }
                        if (TraeAudioManager.OPERATION_CONNECTDEVICE.equals(stringExtra)) {
                            String stringExtra11 = intent2.getStringExtra(TraeAudioManager.CONNECTDEVICE_RESULT_DEVICENAME);
                            if (QLog.isColorLevel()) {
                                QLog.m84595w("TRAE", 2, "AudioSession|[onConnectDeviceRes] err:" + intExtra + " dev:" + stringExtra11);
                            }
                            ITraeAudioCallback iTraeAudioCallback8 = this.mCallback;
                            if (iTraeAudioCallback8 != null) {
                                iTraeAudioCallback8.onConnectDeviceRes(intExtra, stringExtra11, intExtra == 0);
                                return;
                            }
                            return;
                        }
                        if (TraeAudioManager.OPERATION_EARACTION.equals(stringExtra)) {
                            int intExtra3 = intent2.getIntExtra(TraeAudioManager.EXTRA_EARACTION, -1);
                            if (QLog.isColorLevel()) {
                                QLog.m84595w("TRAE", 2, "AudioSession|[onConnectDeviceRes] err:" + intExtra + " earAction:" + intExtra3);
                                return;
                            }
                            return;
                        }
                        if (TraeAudioManager.OPERATION_ISDEVICECHANGABLED.equals(stringExtra)) {
                            boolean booleanExtra3 = intent2.getBooleanExtra(TraeAudioManager.ISDEVICECHANGABLED_RESULT_ISCHANGABLED, false);
                            if (QLog.isColorLevel()) {
                                StringBuilder sb2 = new StringBuilder("AudioSession|[onIsDeviceChangabledRes] err:");
                                sb2.append(intExtra);
                                sb2.append(" Changabled:");
                                sb2.append(booleanExtra3 ? "Y" : "N");
                                QLog.m84595w("TRAE", 2, sb2.toString());
                            }
                            ITraeAudioCallback iTraeAudioCallback9 = this.mCallback;
                            if (iTraeAudioCallback9 != null) {
                                iTraeAudioCallback9.onIsDeviceChangabledRes(intExtra, booleanExtra3);
                                return;
                            }
                            return;
                        }
                        if (TraeAudioManager.OPERATION_GETCONNECTEDDEVICE.equals(stringExtra)) {
                            String stringExtra12 = intent2.getStringExtra(TraeAudioManager.GETCONNECTEDDEVICE_RESULT_LIST);
                            if (QLog.isColorLevel()) {
                                QLog.m84595w("TRAE", 2, "AudioSession|[onGetConnectedDeviceRes] err:" + intExtra + " dev:" + stringExtra12);
                            }
                            ITraeAudioCallback iTraeAudioCallback10 = this.mCallback;
                            if (iTraeAudioCallback10 != null) {
                                iTraeAudioCallback10.onGetConnectedDeviceRes(intExtra, stringExtra12);
                                return;
                            }
                            return;
                        }
                        if (TraeAudioManager.OPERATION_GETCONNECTINGDEVICE.equals(stringExtra)) {
                            String stringExtra13 = intent2.getStringExtra(TraeAudioManager.GETCONNECTINGDEVICE_RESULT_LIST);
                            if (QLog.isColorLevel()) {
                                QLog.m84595w("TRAE", 2, "AudioSession|[onGetConnectingDeviceRes] err:" + intExtra + " dev:" + stringExtra13);
                            }
                            ITraeAudioCallback iTraeAudioCallback11 = this.mCallback;
                            if (iTraeAudioCallback11 != null) {
                                iTraeAudioCallback11.onGetConnectingDeviceRes(intExtra, stringExtra13);
                                return;
                            }
                            return;
                        }
                        if (TraeAudioManager.OPERATION_GETSTREAMTYPE.equals(stringExtra)) {
                            int intExtra4 = intent2.getIntExtra(TraeAudioManager.EXTRA_DATA_STREAMTYPE, -1);
                            if (QLog.isColorLevel()) {
                                QLog.m84595w("TRAE", 2, "AudioSession|[onGetStreamTypeRes] err:" + intExtra + " st:" + intExtra4);
                            }
                            ITraeAudioCallback iTraeAudioCallback12 = this.mCallback;
                            if (iTraeAudioCallback12 != null) {
                                iTraeAudioCallback12.onGetStreamTypeRes(intExtra, intExtra4);
                                return;
                            }
                            return;
                        }
                        if (!TraeAudioManager.NOTIFY_RING_COMPLETION.equals(stringExtra)) {
                            if (TraeAudioManager.OPERATION_VOICECALL_PREPROCESS.equals(stringExtra)) {
                                if (QLog.isColorLevel()) {
                                    QLog.m84595w("TRAE", 2, "AudioSession|[onVoicecallPreprocess] err:" + intExtra);
                                }
                                ITraeAudioCallback iTraeAudioCallback13 = this.mCallback;
                                if (iTraeAudioCallback13 != null) {
                                    iTraeAudioCallback13.onVoicecallPreprocessRes(intExtra);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        String stringExtra14 = intent2.getStringExtra(TraeAudioManager.PARAM_RING_USERDATA_STRING);
                        if (QLog.isColorLevel()) {
                            QLog.m84595w("TRAE", 2, "AudioSession|[onRingCompletion] err:" + intExtra + " userData:" + stringExtra14);
                        }
                        ITraeAudioCallback iTraeAudioCallback14 = this.mCallback;
                        if (iTraeAudioCallback14 != null) {
                            iTraeAudioCallback14.onRingCompletion(intExtra, stringExtra14);
                            return;
                        }
                        return;
                    } catch (Exception e2) {
                        e = e2;
                    }
                    if (QLog.isColorLevel()) {
                        QLog.m84590e(str, 2, "AudioSession| nSessinId = " + this.mSessionId + " onReceive::intent:" + intent2.toString() + " intent.getAction():" + intent2.getAction() + " Exception:" + e.getMessage());
                    }
                }
            } catch (Exception e3) {
                e = e3;
                str = "TRAE";
            }
        } catch (Exception e4) {
            e = e4;
        }
    }

    public void onReceiveCallback(Intent intent) {
        try {
            if (intent == null) {
                if (QLog.isColorLevel()) {
                    QLog.m84595w("TRAE", 2, "[ERROR] intent = null!!");
                    return;
                }
                return;
            }
            long longExtra = intent.getLongExtra(TraeAudioManager.PARAM_SESSIONID, Long.MIN_VALUE);
            String stringExtra = intent.getStringExtra(TraeAudioManager.PARAM_OPERATION);
            int intExtra = intent.getIntExtra(TraeAudioManager.PARAM_RES_ERRCODE, 0);
            if (TraeAudioManager.ACTION_TRAEAUDIOMANAGER_RES.equals(intent.getAction()) && this.mSessionId == longExtra && TraeAudioManager.OPERATION_VOICECALL_PREPROCESS.equals(stringExtra)) {
                if (QLog.isColorLevel()) {
                    QLog.m84595w("TRAE", 2, "AudioSession|[onReceiveCallback onVoicecallPreprocess] err:" + intExtra);
                }
                ITraeAudioCallback iTraeAudioCallback = this.mCallback;
                if (iTraeAudioCallback != null) {
                    iTraeAudioCallback.onVoicecallPreprocessRes(intExtra);
                }
            }
        } catch (Exception e) {
            if (QLog.isColorLevel()) {
                QLog.m84590e("TRAE", 2, "AudioSession| nSessinId = " + this.mSessionId + " onReceive::intent:" + intent.toString() + " intent.getAction():" + intent.getAction() + " Exception:" + e.getMessage());
            }
        }
    }

    public int recoverAudioFocus() {
        boolean z = this.mIsHostside;
        if (z) {
            return TraeAudioManager.recoverAudioFocus(TraeAudioManager.OPERATION_RECOVER_AUDIO_FOCUS, this.mSessionId, z);
        }
        if (this.mContext == null) {
            return -1;
        }
        Intent intent = new Intent();
        intent.setAction(TraeAudioManager.ACTION_TRAEAUDIOMANAGER_REQUEST);
        intent.putExtra(TraeAudioManager.PARAM_SESSIONID, this.mSessionId);
        intent.putExtra(TraeAudioManager.PARAM_OPERATION, TraeAudioManager.OPERATION_RECOVER_AUDIO_FOCUS);
        this.mContext.sendBroadcast(intent);
        return 0;
    }

    public void release() {
        if (QLog.isColorLevel()) {
            QLog.m84595w("TRAE", 2, "TraeAudioSession release, mSessionId: " + this.mSessionId);
        }
        Context context = this.mContext;
        if (context != null) {
            try {
                context.unregisterReceiver(this);
            } catch (Exception e) {
                if (QLog.isColorLevel()) {
                    QLog.m84590e("TRAE", 2, "unregisterReceiver failed." + e.getMessage());
                }
            }
        }
        registerAudioSession(this, false);
        this.mContext = null;
        this.mCallback = null;
    }

    public int requestReleaseAudioFocus() {
        boolean z = this.mIsHostside;
        if (z) {
            return TraeAudioManager.requestReleaseAudioFocus(TraeAudioManager.OPERATION_REQUEST_RELEASE_AUDIO_FOCUS, this.mSessionId, z);
        }
        if (this.mContext == null) {
            return -1;
        }
        Intent intent = new Intent();
        intent.setAction(TraeAudioManager.ACTION_TRAEAUDIOMANAGER_REQUEST);
        intent.putExtra(TraeAudioManager.PARAM_SESSIONID, this.mSessionId);
        intent.putExtra(TraeAudioManager.PARAM_OPERATION, TraeAudioManager.OPERATION_REQUEST_RELEASE_AUDIO_FOCUS);
        this.mContext.sendBroadcast(intent);
        return 0;
    }

    public void setCallback(ITraeAudioCallback iTraeAudioCallback) {
        this.mCallback = iTraeAudioCallback;
    }

    public int startRing(int i, int i2, Uri uri, String str, boolean z, int i3, String str2, boolean z2) {
        boolean z3 = this.mIsHostside;
        if (z3) {
            return TraeAudioManager.startRing(TraeAudioManager.OPERATION_STARTRING, this.mSessionId, z3, i, i2, uri, str, z, i3, str2, z2);
        }
        if (this.mContext == null) {
            return -1;
        }
        Intent intent = new Intent();
        intent.setAction(TraeAudioManager.ACTION_TRAEAUDIOMANAGER_REQUEST);
        intent.putExtra(TraeAudioManager.PARAM_SESSIONID, this.mSessionId);
        intent.putExtra(TraeAudioManager.PARAM_RING_DATASOURCE, i);
        intent.putExtra(TraeAudioManager.PARAM_RING_RSID, i2);
        intent.putExtra(TraeAudioManager.PARAM_RING_URI, uri);
        intent.putExtra(TraeAudioManager.PARAM_RING_FILEPATH, str);
        intent.putExtra(TraeAudioManager.PARAM_RING_LOOP, z);
        intent.putExtra(TraeAudioManager.PARAM_RING_LOOPCOUNT, i3);
        intent.putExtra(TraeAudioManager.PARAM_RING_MODE, z2);
        intent.putExtra(TraeAudioManager.PARAM_RING_USERDATA_STRING, str2);
        intent.putExtra(TraeAudioManager.PARAM_OPERATION, TraeAudioManager.OPERATION_STARTRING);
        this.mContext.sendBroadcast(intent);
        return 0;
    }

    public int startService(String str) {
        if (str == null || str.length() <= 0) {
            str = "internal_disable_dev_switch";
        }
        boolean z = this.mIsHostside;
        if (z) {
            return TraeAudioManager.startService(TraeAudioManager.OPERATION_STARTSERVICE, this.mSessionId, z, str);
        }
        if (this.mContext == null) {
            return -1;
        }
        Intent intent = new Intent();
        intent.setAction(TraeAudioManager.ACTION_TRAEAUDIOMANAGER_REQUEST);
        intent.putExtra(TraeAudioManager.PARAM_SESSIONID, this.mSessionId);
        intent.putExtra(TraeAudioManager.PARAM_OPERATION, TraeAudioManager.OPERATION_STARTSERVICE);
        intent.putExtra(TraeAudioManager.EXTRA_DATA_DEVICECONFIG, str);
        this.mContext.sendBroadcast(intent);
        return 0;
    }

    public int stopRing() {
        boolean z = this.mIsHostside;
        if (z) {
            return TraeAudioManager.stopRing(TraeAudioManager.OPERATION_STOPRING, this.mSessionId, z);
        }
        if (this.mContext == null) {
            return -1;
        }
        Intent intent = new Intent();
        intent.setAction(TraeAudioManager.ACTION_TRAEAUDIOMANAGER_REQUEST);
        intent.putExtra(TraeAudioManager.PARAM_SESSIONID, this.mSessionId);
        intent.putExtra(TraeAudioManager.PARAM_OPERATION, TraeAudioManager.OPERATION_STOPRING);
        this.mContext.sendBroadcast(intent);
        return 0;
    }

    public int stopService() {
        boolean z = this.mIsHostside;
        if (z) {
            return TraeAudioManager.stopService(TraeAudioManager.OPERATION_STOPSERVICE, this.mSessionId, z);
        }
        if (this.mContext == null) {
            return -1;
        }
        Intent intent = new Intent();
        intent.setAction(TraeAudioManager.ACTION_TRAEAUDIOMANAGER_REQUEST);
        intent.putExtra(TraeAudioManager.PARAM_SESSIONID, this.mSessionId);
        intent.putExtra(TraeAudioManager.PARAM_OPERATION, TraeAudioManager.OPERATION_STOPSERVICE);
        this.mContext.sendBroadcast(intent);
        return 0;
    }

    public int voiceCallAudioParamChanged(int i, int i2) {
        boolean z = this.mIsHostside;
        if (z) {
            return TraeAudioManager.voiceCallAudioParamChanged(TraeAudioManager.ACTION_TRAEAUDIOMANAGER_REQUEST, this.mSessionId, z, i, i2);
        }
        if (this.mContext == null) {
            return -1;
        }
        Intent intent = new Intent();
        intent.setAction(TraeAudioManager.ACTION_TRAEAUDIOMANAGER_REQUEST);
        intent.putExtra(TraeAudioManager.PARAM_SESSIONID, this.mSessionId);
        intent.putExtra(TraeAudioManager.PARAM_MODEPOLICY, i);
        intent.putExtra(TraeAudioManager.PARAM_STREAMTYPE, i2);
        intent.putExtra(TraeAudioManager.PARAM_OPERATION, TraeAudioManager.OPERATION_VOICECALL_AUDIOPARAM_CHANGED);
        this.mContext.sendBroadcast(intent);
        return 0;
    }

    public int voiceCallPostprocess() {
        boolean z = this.mIsHostside;
        if (z) {
            return TraeAudioManager.voicecallPostprocess(TraeAudioManager.OPERATION_VOICECALL_POSTPROCESS, this.mSessionId, z);
        }
        if (this.mContext == null) {
            return -1;
        }
        Intent intent = new Intent();
        intent.setAction(TraeAudioManager.ACTION_TRAEAUDIOMANAGER_REQUEST);
        intent.putExtra(TraeAudioManager.PARAM_SESSIONID, this.mSessionId);
        intent.putExtra(TraeAudioManager.PARAM_OPERATION, TraeAudioManager.OPERATION_VOICECALL_POSTPROCESS);
        this.mContext.sendBroadcast(intent);
        return 0;
    }

    public int voiceCallPreprocess(int i, int i2) {
        boolean z = this.mIsHostside;
        if (z) {
            return TraeAudioManager.voicecallPreprocess(TraeAudioManager.OPERATION_VOICECALL_PREPROCESS, this.mSessionId, z, i, i2);
        }
        if (this.mContext == null) {
            return -1;
        }
        Intent intent = new Intent();
        intent.setAction(TraeAudioManager.ACTION_TRAEAUDIOMANAGER_REQUEST);
        intent.putExtra(TraeAudioManager.PARAM_SESSIONID, this.mSessionId);
        intent.putExtra(TraeAudioManager.PARAM_MODEPOLICY, i);
        intent.putExtra(TraeAudioManager.PARAM_STREAMTYPE, i2);
        intent.putExtra(TraeAudioManager.PARAM_OPERATION, TraeAudioManager.OPERATION_VOICECALL_PREPROCESS);
        this.mContext.sendBroadcast(intent);
        return 0;
    }

    public int startRing(int i, int i2, Uri uri, String str, boolean z, int i3, String str2) {
        boolean z2 = this.mIsHostside;
        if (z2) {
            return TraeAudioManager.startRing(TraeAudioManager.OPERATION_STARTRING, this.mSessionId, z2, i, i2, uri, str, z, i3, str2, false);
        }
        if (this.mContext == null) {
            return -1;
        }
        Intent intent = new Intent();
        intent.setAction(TraeAudioManager.ACTION_TRAEAUDIOMANAGER_REQUEST);
        intent.putExtra(TraeAudioManager.PARAM_SESSIONID, this.mSessionId);
        intent.putExtra(TraeAudioManager.PARAM_RING_DATASOURCE, i);
        intent.putExtra(TraeAudioManager.PARAM_RING_RSID, i2);
        intent.putExtra(TraeAudioManager.PARAM_RING_URI, uri);
        intent.putExtra(TraeAudioManager.PARAM_RING_FILEPATH, str);
        intent.putExtra(TraeAudioManager.PARAM_RING_LOOP, z);
        intent.putExtra(TraeAudioManager.PARAM_RING_LOOPCOUNT, i3);
        intent.putExtra(TraeAudioManager.PARAM_RING_MODE, false);
        intent.putExtra(TraeAudioManager.PARAM_RING_USERDATA_STRING, str2);
        intent.putExtra(TraeAudioManager.PARAM_OPERATION, TraeAudioManager.OPERATION_STARTRING);
        this.mContext.sendBroadcast(intent);
        return 0;
    }

    public int startRing(int i, int i2, Uri uri, String str, boolean z) {
        boolean z2 = this.mIsHostside;
        if (z2) {
            return TraeAudioManager.startRing(TraeAudioManager.OPERATION_STARTRING, this.mSessionId, z2, i, i2, uri, str, z, 1, "normal-ring", false);
        }
        if (this.mContext == null) {
            return -1;
        }
        Intent intent = new Intent();
        intent.setAction(TraeAudioManager.ACTION_TRAEAUDIOMANAGER_REQUEST);
        intent.putExtra(TraeAudioManager.PARAM_SESSIONID, this.mSessionId);
        intent.putExtra(TraeAudioManager.PARAM_RING_DATASOURCE, i);
        intent.putExtra(TraeAudioManager.PARAM_RING_RSID, i2);
        intent.putExtra(TraeAudioManager.PARAM_RING_URI, uri);
        intent.putExtra(TraeAudioManager.PARAM_RING_FILEPATH, str);
        intent.putExtra(TraeAudioManager.PARAM_RING_LOOP, z);
        intent.putExtra(TraeAudioManager.PARAM_RING_MODE, false);
        intent.putExtra(TraeAudioManager.PARAM_RING_USERDATA_STRING, "normal-ring");
        intent.putExtra(TraeAudioManager.PARAM_OPERATION, TraeAudioManager.OPERATION_STARTRING);
        this.mContext.sendBroadcast(intent);
        return 0;
    }
}
