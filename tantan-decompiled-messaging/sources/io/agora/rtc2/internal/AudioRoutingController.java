package io.agora.rtc2.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.putong.live.livingroom.virtual.ktv.bean.LrcWrapperBean;
import io.agora.base.internal.CalledByNative;
import io.agora.base.internal.ThreadUtils;
import io.agora.base.internal.voiceengine.WebRtcAudioRecord;
import io.agora.base.internal.voiceengine.WebRtcAudioTrack;
import io.agora.utils2.internal.Logging;
import java.lang.ref.WeakReference;
import p149l.ii5;

/* JADX INFO: loaded from: classes2.dex */
public class AudioRoutingController {
    public static final int AUDIO_DEVICE_EVENT_FALLBACK_TO_A2DP = 4;
    private static final int BLUETOOTH_SCO_TIMEOUT_MS = 3000;
    private static final int BT_SCO_STATE_CONNECTED = 1;
    private static final int BT_SCO_STATE_CONNECTING = 0;
    private static final int BT_SCO_STATE_DISCONNECTED = 3;
    private static final int BT_SCO_STATE_DISCONNECTING = 2;
    public static final int CMD_FORCE_TO_A2DP = 16;
    public static final int CMD_FORCE_TO_SPEAKER = 11;
    public static final int CMD_SET_DEFAULT_ROUTING = 10;
    private static final int CMD_SET_PREFER_ROUTING = 25;
    private static final int CMD_SET_ROUTING_FREEZE = 26;
    public static final int CMD_START_BT_SCO = 15;
    public static final int DEVICE_EVT_BT_OFF = 0;
    public static final int DEVICE_EVT_BT_RECONNECT = 1;
    public static final int DEVICE_OUTPUT_OUT_IP = 8388608;
    public static final int DEVICE_OUT_AUX_DIGITAL = 1024;
    public static final int DEVICE_OUT_BLUETOOTH_A2DP = 128;
    public static final int DEVICE_OUT_BLUETOOTH_A2DP_HEADPHONES = 256;
    public static final int DEVICE_OUT_BLUETOOTH_A2DP_SPEAKER = 512;
    public static final int DEVICE_OUT_EARPIECE = 1;
    public static final int DEVICE_OUT_SPEAKER = 2;
    public static final int DEVICE_OUT_USB_DEVICE = 16384;
    public static final int DEVICE_OUT_USB_HEADSET = 67108864;
    public static final int DEVICE_OUT_WIRED_HEADPHONE = 8;
    public static final int DEVICE_OUT_WIRED_HEADSET = 4;
    private static final int ERROR = 4;
    private static final int EVT_BT_HEADSET = 2;
    private static final int EVT_BT_HEADSET_RECONNECT = 23;
    private static final int EVT_BT_SCO = 3;
    public static final int EVT_CHANNEL_PROFILE = 20;
    public static final int EVT_ENGINE_ROLE_CHANGED = 21;
    private static final int EVT_HDMI = 6;
    private static final int EVT_HEADSET = 1;
    public static final int EVT_PHONE_STATE_CHANGED = 22;
    private static final int EVT_USB = 4;
    private static final int EVT_USB_HEADSET = 5;
    private static final int MAX_SCO_CONNECT_ATTEMPS = 2;
    public static final int OFF = 0;

    /* JADX INFO: renamed from: ON */
    public static final int f63353ON = 1;
    private static final int PHONE_STATE_MONITOR_TIMEOUT_MS = 2000;
    private static final SparseIntArray ROUTE_TYPE_TO_EVT;
    public static final int SDK_INT_FOR_DEVICE_INVENTORY = 23;
    private static final int START = 1;
    private static final int STOP = 2;
    private static final String TAG = "AudioRoute";
    private static final int UNINIT = 0;
    public static final int UNSET = -1;

    @Nullable
    private static AudioDeviceChangedSpecialMonitor deviceSpecialMonitor = null;
    private static boolean mockBlueToothEnable = false;
    private static AudioManager mockedAudioManager;
    private static MockedBroadcaseter mockedBroadcaster;
    private AudioDeviceInventory mAudioDeviceInventory;
    private final WeakReference<Context> mContext;
    private EventHandler mEventHandler;
    private long mNativeHandle;
    private int mScoConnectionAttemps;
    private ControllerState mState;
    private boolean mIsWiredHeadsetPlugged = false;
    private int mHeadsetType = -1;
    private boolean mIsBTHeadsetPlugged = false;
    private int ROUTING_ATTR_SPEAKER_SWITCH_SUPPORT = 1;
    private int mCurrentRouting = -1;
    private int mDefaultRouting = 3;
    private int mForcedRouting = -1;
    private int mChannelProfile = -1;
    private int mEngineRole = -1;
    private boolean mPhoneInCall = false;
    private int mSpeakerCommVolume = -1;
    private int mForceUseA2dp = -1;
    private int mBtScoState = 3;
    private boolean mIsBTScoStarted = false;
    private int dynamic_timeout = 3000;
    private boolean mIsFreezed = false;
    private ControllerStopState mStopState = null;
    private ControllerStartState mStartState = null;
    private ControllerErrorState mErrorState = null;
    private final Runnable bluetoothTimeoutRunnable = new Runnable() { // from class: io.agora.rtc2.internal.AudioRoutingController.1
        @Override // java.lang.Runnable
        public void run() {
            try {
                AudioRoutingController.this.bluetoothTimeout();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    };
    private final Runnable scoMonitorInPhoneCallRunnable = new Runnable() { // from class: io.agora.rtc2.internal.AudioRoutingController.2
        @Override // java.lang.Runnable
        public void run() {
            try {
                AudioRoutingController.this.scoMonitorTimeout();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    };

    @Nullable
    private ControllerAudioDeviceChangeCallback ctrlAudioDeviceCb = null;
    private boolean mDisposed = false;
    AudioManagerScoStateReceiver mScoStateReceiver = null;

    @NonNull
    private final ThreadUtils.ThreadChecker mThreadChecker = new ThreadUtils.ThreadChecker();
    private int mVersionInUsed = 1;

    public interface AudioDeviceChangedCallback {
        void onAudioDeviceChanged(boolean z, int i);

        void onAudioDeviceEvent(int i);
    }

    public class AudioDeviceChangedCallbackImpl implements AudioDeviceChangedCallback {
        private AudioDeviceChangedCallbackImpl() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v1, types: [int] */
        /* JADX WARN: Type inference failed for: r4v2 */
        /* JADX WARN: Type inference failed for: r4v3 */
        /* JADX WARN: Type inference failed for: r4v5 */
        /* JADX WARN: Type inference failed for: r5v1, types: [io.agora.rtc2.internal.AudioRoutingController] */
        /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.StringBuilder] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // io.agora.rtc2.internal.AudioRoutingController.AudioDeviceChangedCallback
        public void onAudioDeviceChanged(boolean z, int i) {
            ?? r4;
            String str;
            int i2 = AudioRoutingController.ROUTE_TYPE_TO_EVT.get(i);
            if (i2 == 0) {
                str = "Not handle " + AudioRoutingController.this.getAudioRouteDesc(i) + " device event yet!";
            } else {
                if (i != 5) {
                    r4 = z ? i : -1;
                }
                r4 = z;
                AudioRoutingController.this.sendEvent(i2, r4);
                str = "Device event: " + AudioRoutingController.this.evtAsString(i2) + ", arg: " + r4;
            }
            Logging.m87222i(AudioRoutingController.TAG, str);
        }

        @Override // io.agora.rtc2.internal.AudioRoutingController.AudioDeviceChangedCallback
        public void onAudioDeviceEvent(int i) {
            if (i == 0) {
                AudioRoutingController.this.cancelTimer();
                AudioRoutingController.this.cancelScoPhonestateMonitorTimer();
            } else if (i == 1) {
                AudioRoutingController.this.sendEvent(23, 0);
            }
        }
    }

    public interface AudioDeviceChangedSpecialMonitor {
        void AudioDeviceChangeCallback(boolean z, AudioDeviceInfo audioDeviceInfo);

        String GetUSBDevicePID(int i);

        String GetUSBDeviceVID(int i);

        int GetUSBRouteType();
    }

    public interface AudioDeviceInventory {
        void dispose();

        void initialize();

        boolean isDeviceAvaliable(int i);

        void setAudioDeviceChangeCallback(AudioDeviceChangedCallback audioDeviceChangedCallback);
    }

    public class AudioManagerScoStateReceiver extends BroadcastReceiver {
        private boolean isRegistered;

        private AudioManagerScoStateReceiver() {
            this.isRegistered = false;
        }

        public boolean getRegistered() {
            return this.isRegistered;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("android.media.ACTION_SCO_AUDIO_STATE_UPDATED")) {
                int intExtra = intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -99);
                Logging.m87222i(AudioRoutingController.TAG, "Receive SCO state event, prev: " + intent.getIntExtra("android.media.extra.SCO_AUDIO_PREVIOUS_STATE", -99) + ", curr: " + intExtra);
                if (intExtra == 0) {
                    Logging.m87222i(AudioRoutingController.TAG, "SCO state disconnected");
                    AudioRoutingController.this.sendEvent(3, 0);
                } else if (intExtra == 1) {
                    Logging.m87222i(AudioRoutingController.TAG, "SCO state connected");
                    AudioRoutingController.this.sendEvent(3, 1);
                } else {
                    Logging.m87222i(AudioRoutingController.TAG, "SCO device unknown event, state=" + intExtra);
                }
            }
        }

        public void setRegistered(boolean z) {
            this.isRegistered = z;
        }
    }

    public class ControllerAudioDeviceChangeCallback implements WebRtcAudioRecord.AudioRecordRouteCallback, WebRtcAudioTrack.AudioTrackRouteCallback {
        private ControllerAudioDeviceChangeCallback() {
        }

        @Override // io.agora.base.internal.voiceengine.WebRtcAudioRecord.AudioRecordRouteCallback
        public void onAudioRecordRouteNotify(int i, AudioDeviceInfo audioDeviceInfo) {
            Logging.m87222i(AudioRoutingController.TAG, "[ADM] Enter ControllerAudioDeviceChangeCallback.onAudioRecordRouteNotify");
            if (AudioRoutingController.deviceSpecialMonitor != null) {
                AudioRoutingController.deviceSpecialMonitor.AudioDeviceChangeCallback(true, audioDeviceInfo);
                AudioRoutingController.this.nativeAudioDeviceStateChanged(Integer.toString(audioDeviceInfo.getId()), audioDeviceInfo.getProductName().toString(), 1, 1);
            }
        }

        @Override // io.agora.base.internal.voiceengine.WebRtcAudioTrack.AudioTrackRouteCallback
        public void onAudioTrackRouteNotify(int i, AudioDeviceInfo audioDeviceInfo) {
            Logging.m87222i(AudioRoutingController.TAG, "[ADM] Enter ControllerAudioDeviceChangeCallback.onAudioTrackRouteNotify");
            if (AudioRoutingController.deviceSpecialMonitor != null) {
                AudioRoutingController.deviceSpecialMonitor.AudioDeviceChangeCallback(false, audioDeviceInfo);
                AudioRoutingController.this.sendEvent(4, AudioRoutingController.deviceSpecialMonitor.GetUSBRouteType());
            }
        }
    }

    public abstract class ControllerBaseState implements ControllerState {
        private ControllerBaseState() {
        }

        @Override // io.agora.rtc2.internal.AudioRoutingController.ControllerState
        public int getState() {
            return 0;
        }

        @Override // io.agora.rtc2.internal.AudioRoutingController.ControllerState
        public void onEvent(int i, int i2) {
            if (i == 1) {
                int iHandleHeadsetEvent = AudioRoutingController.this.handleHeadsetEvent(i2);
                if (iHandleHeadsetEvent == -1) {
                    return;
                }
                AudioRoutingController.this.notifyAudioRoutingChanged(iHandleHeadsetEvent);
                return;
            }
            if (i == 2) {
                AudioRoutingController.this.notifyAudioRoutingChanged(AudioRoutingController.this.handleBluetoothHeadsetEvent(i2));
                return;
            }
            if (i == 4 || i == 5 || i == 6) {
                if (i2 != 6 && i2 != 7) {
                    i2 = AudioRoutingController.this.queryCurrentAudioRouting();
                }
                AudioRoutingController.this.notifyAudioRoutingChanged(i2);
                return;
            }
            if (i == 10) {
                AudioRoutingController.this.mDefaultRouting = i2;
                StringBuilder sb = new StringBuilder("User set default routing to: ");
                AudioRoutingController audioRoutingController = AudioRoutingController.this;
                sb.append(audioRoutingController.getAudioRouteDesc(audioRoutingController.mDefaultRouting));
                Logging.m87222i(AudioRoutingController.TAG, sb.toString());
                return;
            }
            if (i != 16) {
                if (i == 20) {
                    AudioRoutingController.this.mChannelProfile = i2;
                    return;
                } else if (i == 22) {
                    AudioRoutingController.this.mPhoneInCall = i2 > 0;
                    return;
                } else {
                    if (i != 26) {
                        return;
                    }
                    AudioRoutingController.this.mIsFreezed = i2 > 0;
                    return;
                }
            }
            int i3 = AudioRoutingController.this.mForceUseA2dp;
            AudioRoutingController.this.mForceUseA2dp = i2 == 1 ? 1 : 0;
            Logging.m87224w(AudioRoutingController.TAG, "bluetooth protocol to: ".concat(AudioRoutingController.this.mForceUseA2dp == 1 ? "a2dp" : "hfp"));
            AudioRoutingController audioRoutingController2 = AudioRoutingController.this;
            audioRoutingController2.updateBluetoothSco(audioRoutingController2.mCurrentRouting);
            if (AudioRoutingController.this.mForceUseA2dp == i3 || AudioRoutingController.this.mCurrentRouting != 5) {
                return;
            }
            AudioRoutingController audioRoutingController3 = AudioRoutingController.this;
            audioRoutingController3.notifyAudioRoutingChanged(audioRoutingController3.mCurrentRouting);
        }

        @Override // io.agora.rtc2.internal.AudioRoutingController.ControllerState
        public void reset() {
            AudioRoutingController.this.resetAudioRouting();
        }

        @Override // io.agora.rtc2.internal.AudioRoutingController.ControllerState
        public void setState(int i) {
            if (i == getState()) {
                Logging.m87222i(AudioRoutingController.TAG, "setState: state not changed!");
            } else {
                AudioRoutingController audioRoutingController = AudioRoutingController.this;
                audioRoutingController.mState = audioRoutingController.changeState(i);
            }
        }
    }

    public class ControllerErrorState extends ControllerBaseState {
        private ControllerErrorState() {
            super();
        }

        @Override // io.agora.rtc2.internal.AudioRoutingController.ControllerBaseState, io.agora.rtc2.internal.AudioRoutingController.ControllerState
        public int getState() {
            return 4;
        }
    }

    public class ControllerStartState extends ControllerBaseState {
        public ControllerStartState() {
            super();
            resetImpl();
            Logging.m87222i(AudioRoutingController.TAG, "ControllerStartState ctor, default routing: " + AudioRoutingController.this.getAudioRouteDesc(AudioRoutingController.this.mDefaultRouting) + ", current routing: " + AudioRoutingController.this.getAudioRouteDesc(AudioRoutingController.this.mCurrentRouting));
        }

        private void resetImpl() {
            if (AudioRoutingController.this.mDefaultRouting == -1) {
                int i = AudioRoutingController.this.mChannelProfile;
                AudioRoutingController audioRoutingController = AudioRoutingController.this;
                if (i == 1) {
                    audioRoutingController.mDefaultRouting = 3;
                } else {
                    audioRoutingController.mDefaultRouting = 1;
                }
            }
            AudioRoutingController.this.mCurrentRouting = -1;
            AudioRoutingController.this.mForcedRouting = -1;
            AudioRoutingController.this.resetAudioRouting();
        }

        @Override // io.agora.rtc2.internal.AudioRoutingController.ControllerBaseState, io.agora.rtc2.internal.AudioRoutingController.ControllerState
        public int getState() {
            return 1;
        }

        @Override // io.agora.rtc2.internal.AudioRoutingController.ControllerBaseState, io.agora.rtc2.internal.AudioRoutingController.ControllerState
        public void onEvent(int i, int i2) {
            Logging.m87216d(AudioRoutingController.TAG, "StartState: onEvent: " + AudioRoutingController.this.evtAsString(i) + ", info: " + i2);
            AudioManager audioManager = AudioRoutingController.this.getAudioManager();
            if (i == 10) {
                AudioRoutingController.this.mDefaultRouting = i2;
                StringBuilder sb = new StringBuilder("User set default routing to: ");
                AudioRoutingController audioRoutingController = AudioRoutingController.this;
                sb.append(audioRoutingController.getAudioRouteDesc(audioRoutingController.mDefaultRouting));
                Logging.m87222i(AudioRoutingController.TAG, sb.toString());
                return;
            }
            boolean z = true;
            if (i == 11) {
                if (AudioRoutingController.this.mCurrentRouting == 2 || AudioRoutingController.this.mCurrentRouting == 0 || AudioRoutingController.this.mCurrentRouting == 6 || AudioRoutingController.this.mCurrentRouting == 8 || AudioRoutingController.this.mCurrentRouting == 5) {
                    Logging.m87222i(AudioRoutingController.TAG, "StartState: not proceed with force speaker event for BT/HS");
                    return;
                }
                AudioRoutingController.this.mForcedRouting = i2 == 1 ? 3 : 1;
                if (AudioRoutingController.this.mPhoneInCall) {
                    return;
                }
                AudioRoutingController audioRoutingController2 = AudioRoutingController.this;
                if (i2 == 1) {
                    audioRoutingController2.doSetAudioOutputRouting(3);
                    return;
                } else {
                    audioRoutingController2.resetAudioRouting();
                    return;
                }
            }
            if (i == 22) {
                Logging.m87222i(AudioRoutingController.TAG, "Phone state changed: " + i2);
                AudioRoutingController.this.mPhoneInCall = i2 > 0;
                AudioRoutingController audioRoutingController3 = AudioRoutingController.this;
                if (i2 == 0) {
                    audioRoutingController3.resetAudioRouting();
                    return;
                } else {
                    audioRoutingController3.mCurrentRouting = -1;
                    return;
                }
            }
            if (i == 23) {
                Logging.m87222i(AudioRoutingController.TAG, "Try reconnect bt: ");
                if (AudioRoutingController.this.mCurrentRouting == 5) {
                    AudioRoutingController audioRoutingController4 = AudioRoutingController.this;
                    audioRoutingController4.doSetAudioOutputRouting(audioRoutingController4.mCurrentRouting);
                    return;
                }
                return;
            }
            if (i == 25) {
                AudioRoutingController.this.selectRoutingForCommunication(i2);
                return;
            }
            if (i == 26) {
                Logging.m87222i(AudioRoutingController.TAG, "set routing freeze " + i2);
                AudioRoutingController audioRoutingController5 = AudioRoutingController.this;
                if (i2 != 0) {
                    audioRoutingController5.mIsFreezed = true;
                    return;
                } else {
                    audioRoutingController5.mIsFreezed = false;
                    AudioRoutingController.this.resetAudioRouting();
                    return;
                }
            }
            switch (i) {
                case 1:
                    if (i2 >= 0) {
                        AudioRoutingController.this.mHeadsetType = i2;
                        AudioRoutingController.this.mIsWiredHeadsetPlugged = true;
                    } else if (audioManager == null || !audioManager.isWiredHeadsetOn()) {
                        AudioRoutingController.this.mHeadsetType = i2;
                        AudioRoutingController.this.mIsWiredHeadsetPlugged = false;
                    }
                    if (!AudioRoutingController.this.mPhoneInCall) {
                        if (AudioRoutingController.this.mIsWiredHeadsetPlugged && AudioRoutingController.this.mCurrentRouting != i2) {
                            AudioRoutingController.this.doSetAudioOutputRouting(i2);
                        } else {
                            AudioRoutingController.this.resetAudioRouting();
                        }
                        break;
                    }
                    break;
                case 2:
                    if (i2 != 0 || AudioRoutingController.this.mIsBTHeadsetPlugged) {
                        AudioRoutingController audioRoutingController6 = AudioRoutingController.this;
                        if (!audioRoutingController6.mAudioDeviceInventory.isDeviceAvaliable(5) && i2 != 1) {
                            z = false;
                        }
                        audioRoutingController6.mIsBTHeadsetPlugged = z;
                        Logging.m87222i(AudioRoutingController.TAG, "Process BT event, final state: " + AudioRoutingController.this.mIsBTHeadsetPlugged + "(" + i2 + ")");
                        if (!AudioRoutingController.this.mPhoneInCall) {
                            boolean z2 = AudioRoutingController.this.mIsBTHeadsetPlugged;
                            AudioRoutingController audioRoutingController7 = AudioRoutingController.this;
                            if (!z2) {
                                audioRoutingController7.resetAudioRouting();
                            } else {
                                audioRoutingController7.doSetAudioOutputRouting(5);
                            }
                            break;
                        }
                    }
                    break;
                case 3:
                    if (AudioRoutingController.mockBlueToothEnable && audioManager != null) {
                        audioManager.setBluetoothScoOn(false);
                    }
                    AudioRoutingController.this.mBtScoState = i2 == 1 ? 1 : 2;
                    if (!AudioRoutingController.this.mPhoneInCall) {
                        if (i2 == 1) {
                            AudioRoutingController.this.mScoConnectionAttemps = 0;
                            break;
                        } else if (i2 == 0 && AudioRoutingController.this.mCurrentRouting == 5) {
                            Logging.m87224w(AudioRoutingController.TAG, "Sco disconnect when using Bluetooth device, use a2dp: " + AudioRoutingController.this.mForceUseA2dp);
                            if (AudioRoutingController.this.mForceUseA2dp != 1 && audioManager != null) {
                                int mode = audioManager.getMode();
                                if (mode == 1 || mode == 2) {
                                    AudioRoutingController.this.startScoPhonestateMonitorTimer();
                                } else if (mode == 3) {
                                    Logging.m87224w(AudioRoutingController.TAG, "Sco try reconnect");
                                    audioManager.stopBluetoothSco();
                                    AudioRoutingController.this.doStartBTSco(audioManager);
                                    AudioRoutingController.this.startTimer();
                                }
                                break;
                            }
                        }
                    }
                    break;
                case 4:
                case 5:
                case 6:
                    if (i2 == 6 || i2 == 7) {
                        AudioRoutingController.this.doSetAudioOutputRouting(i2);
                    } else {
                        AudioRoutingController.this.resetAudioRouting();
                    }
                    break;
                default:
                    super.onEvent(i, i2);
                    break;
            }
        }

        @Override // io.agora.rtc2.internal.AudioRoutingController.ControllerBaseState, io.agora.rtc2.internal.AudioRoutingController.ControllerState
        public void reset() {
            resetImpl();
            StringBuilder sb = new StringBuilder("Monitor reset: default routing: ");
            AudioRoutingController audioRoutingController = AudioRoutingController.this;
            sb.append(audioRoutingController.getAudioRouteDesc(audioRoutingController.mDefaultRouting));
            sb.append(", current routing: ");
            AudioRoutingController audioRoutingController2 = AudioRoutingController.this;
            sb.append(audioRoutingController2.getAudioRouteDesc(audioRoutingController2.mCurrentRouting));
            Logging.m87222i(AudioRoutingController.TAG, sb.toString());
        }
    }

    public interface ControllerState {
        int getState();

        void onEvent(int i, int i2);

        void reset();

        void setState(int i);
    }

    public class ControllerStopState extends ControllerBaseState {
        public ControllerStopState() {
            super();
            Logging.m87222i(AudioRoutingController.TAG, "ControllerStopState ctor");
            AudioRoutingController.this.mIsBTScoStarted = false;
            AudioRoutingController.this.mCurrentRouting = -1;
        }

        private void resetImpl() {
            AudioRoutingController.this.cancelTimer();
            AudioRoutingController.this.cancelScoPhonestateMonitorTimer();
            AudioManager audioManager = AudioRoutingController.this.getAudioManager();
            if (AudioRoutingController.this.mIsBTScoStarted || (audioManager != null && audioManager.isBluetoothScoOn())) {
                AudioRoutingController.this.mIsBTScoStarted = false;
                AudioRoutingController.this.stopBtSco();
            }
            AudioRoutingController.this.mCurrentRouting = -1;
        }

        @Override // io.agora.rtc2.internal.AudioRoutingController.ControllerBaseState, io.agora.rtc2.internal.AudioRoutingController.ControllerState
        public int getState() {
            return 2;
        }

        @Override // io.agora.rtc2.internal.AudioRoutingController.ControllerBaseState, io.agora.rtc2.internal.AudioRoutingController.ControllerState
        public void onEvent(int i, int i2) {
            Logging.m87216d(AudioRoutingController.TAG, "StopState: onEvent: " + AudioRoutingController.this.evtAsString(i) + ", info: " + i2);
            try {
                AudioManager audioManager = AudioRoutingController.this.getAudioManager();
                if (i != 11) {
                    super.onEvent(i, i2);
                    return;
                }
                audioManager.setSpeakerphoneOn(i2 == 1);
                AudioRoutingController.this.mCurrentRouting = i2 == 1 ? 3 : -1;
                AudioRoutingController audioRoutingController = AudioRoutingController.this;
                audioRoutingController.notifyAudioRoutingChanged(audioRoutingController.queryCurrentAudioRouting());
            } catch (Exception e) {
                Logging.m87220e(AudioRoutingController.TAG, "onEvent: Exception ", e);
            }
        }

        @Override // io.agora.rtc2.internal.AudioRoutingController.ControllerBaseState, io.agora.rtc2.internal.AudioRoutingController.ControllerState
        public void reset() {
            Logging.m87222i(AudioRoutingController.TAG, "Monitor stop state, reset");
            resetImpl();
        }
    }

    public class EventHandler extends Handler {
        public EventHandler(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (AudioRoutingController.this.mState != null) {
                AudioRoutingController.this.mState.onEvent(message.what, message.arg1);
            }
        }
    }

    public interface MockedBroadcaseter {
        void registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter);

        void unRegisterReceiver(BroadcastReceiver broadcastReceiver);
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        ROUTE_TYPE_TO_EVT = sparseIntArray;
        sparseIntArray.put(0, 1);
        sparseIntArray.put(2, 1);
        sparseIntArray.put(5, 2);
        sparseIntArray.put(6, 4);
        sparseIntArray.put(7, 6);
    }

    @CalledByNative
    public AudioRoutingController(Context context, long j) {
        this.mContext = new WeakReference<>(context);
        this.mNativeHandle = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bluetoothTimeout() {
        AudioManager audioManager = getAudioManager();
        boolean zIsBluetoothScoOn = audioManager != null ? audioManager.isBluetoothScoOn() : false;
        if (this.mScoConnectionAttemps >= 2) {
            Logging.m87219e(TAG, "Start bluetooth sco timeout, actual routing: " + queryCurrentAudioRouting());
            cancelTimer();
            nativeAudioRoutingError(1030);
            checkFallbackA2dpIfNeed();
            return;
        }
        Logging.m87222i(TAG, "Attemps trying, bt sco started: " + this.mIsBTScoStarted + " sco connected: " + zIsBluetoothScoOn + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this.mScoConnectionAttemps + " times " + this.mBtScoState + "[" + btStateAsString(this.mBtScoState) + Constants.AES_SUFFIX);
        if (zIsBluetoothScoOn) {
            Logging.m87216d(TAG, "Sco connected success.");
            cancelTimer();
            return;
        }
        startTimer();
        this.mScoConnectionAttemps++;
        stopBtSco();
        audioManager.stopBluetoothSco();
        doStartBTSco(audioManager);
    }

    private String btStateAsString(int i) {
        if (i == 0) {
            return "SCO_CONNECTING";
        }
        if (i == 1) {
            return "SCO_CONNECTED";
        }
        if (i == 2) {
            return "SCO_DISCONNECTING";
        }
        if (i == 3) {
            return "SCO_DISCONNECTED";
        }
        return "Unknown " + i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cancelScoPhonestateMonitorTimer() {
        Logging.m87216d(TAG, "cancel sco monitor timer");
        this.mEventHandler.removeCallbacks(this.scoMonitorInPhoneCallRunnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cancelTimer() {
        this.mScoConnectionAttemps = 0;
        Logging.m87216d(TAG, "cancel bluetooth timer");
        this.mEventHandler.removeCallbacks(this.bluetoothTimeoutRunnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ControllerState changeState(int i) {
        if (i == 2) {
            ControllerStopState controllerStopState = this.mStopState;
            if (controllerStopState == null) {
                this.mStopState = new ControllerStopState();
            } else {
                controllerStopState.reset();
            }
            return this.mStopState;
        }
        if (i == 1) {
            ControllerStartState controllerStartState = this.mStartState;
            if (controllerStartState == null) {
                this.mStartState = new ControllerStartState();
            } else {
                controllerStartState.reset();
            }
            return this.mStartState;
        }
        ControllerErrorState controllerErrorState = this.mErrorState;
        if (controllerErrorState == null) {
            this.mErrorState = new ControllerErrorState();
        } else {
            controllerErrorState.reset();
        }
        return this.mErrorState;
    }

    private void checkFallbackA2dpIfNeed() {
        AudioManager audioManager = getAudioManager();
        if (audioManager != null && this.mIsBTHeadsetPlugged && audioManager.isBluetoothA2dpOn()) {
            nativeAudioRoutingCallbackEvent(4);
            return;
        }
        Logging.m87222i(TAG, "could not use a2dp also..");
        this.mIsBTHeadsetPlugged = false;
        resetAudioRouting();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int doSetAudioOutputRouting(int i) {
        Logging.m87222i(TAG, "Set audio output routing from " + getAudioRouteDesc(this.mCurrentRouting) + " to " + getAudioRouteDesc(i));
        if (this.mIsFreezed) {
            Logging.m87222i(TAG, "Ignore set routing for freezed");
            return 0;
        }
        try {
            AudioManager audioManager = getAudioManager();
            boolean z = true;
            if (audioManager != null) {
                audioManager.setSpeakerphoneOn(i == 3);
            }
            if (queryCurrentAudioRouting() != i) {
                int iQueryCurrentAudioRouting = queryCurrentAudioRouting();
                Logging.m87222i(TAG, "Different audio routing from target " + i + ", actual routing: " + iQueryCurrentAudioRouting + "[" + getAudioRouteDesc(iQueryCurrentAudioRouting) + Constants.AES_SUFFIX);
                if (((i == 3 && iQueryCurrentAudioRouting != 3) || (i == 1 && iQueryCurrentAudioRouting != 1)) && audioManager != null && audioManager.getMode() == 3) {
                    Logging.m87216d(TAG, "In communication mode try recover routing! ");
                    audioManager.setMode(0);
                    audioManager.setMode(3);
                    Logging.m87222i(TAG, "Recover mode to : " + audioManager.getMode());
                    if (i != 3) {
                        z = false;
                    }
                    audioManager.setSpeakerphoneOn(z);
                    Logging.m87222i(TAG, "Final speaker is on : " + audioManager.isSpeakerphoneOn());
                }
            }
            updateBluetoothSco(i);
            if (i != this.mCurrentRouting) {
                this.mCurrentRouting = i;
                notifyAudioRoutingChanged(i);
                return 0;
            }
            Logging.m87222i(TAG, "Audio routing not changed, ignore: " + i);
            return 0;
        } catch (Exception e) {
            Logging.m87220e(TAG, "Set audio output routing failed:", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doStartBTSco(AudioManager audioManager) {
        try {
            int mode = audioManager.getMode();
            Logging.m87222i(TAG, "doStartBTSco " + Build.VERSION.SDK_INT + " sco on: " + audioManager.isBluetoothScoOn() + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + mode + "[" + modeAsString(mode) + Constants.AES_SUFFIX);
            if (audioManager.isBluetoothScoOn()) {
                audioManager.stopBluetoothSco();
                Thread.sleep(600L);
                Logging.m87222i(TAG, "doStartBTSco in sco already on, try stop old connect firstly!");
            }
            audioManager.startBluetoothSco();
        } catch (Exception e) {
            Logging.m87220e(TAG, "doStartBTSco fail ", e);
        }
    }

    private void doStopBTSco(AudioManager audioManager) {
        Logging.m87222i(TAG, "doStopBTSco " + Build.VERSION.SDK_INT + " sco on: " + audioManager.isBluetoothScoOn());
        try {
            audioManager.stopBluetoothSco();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String evtAsString(int i) {
        if (i == 1) {
            return "EVT_HEADSET";
        }
        if (i == 2) {
            return "EVT_BT_HEADSET";
        }
        if (i == 3) {
            return "EVT_BT_SCO";
        }
        if (i == 4) {
            return "EVT_USB";
        }
        if (i == 10) {
            return "CMD_SET_DEFAULT_ROUTING";
        }
        if (i == 11) {
            return "CMD_FORCE_TO_SPEAKER";
        }
        if (i == 16) {
            return "CMD_FORCE_TO_A2DP";
        }
        if (i == 20) {
            return "EVT_CHANNEL_PROFILE";
        }
        if (i == 22) {
            return "EVT_PHONE_STATE_CHANGED";
        }
        if (i == 26) {
            return "CMD_SET_ROUTING_FREEZE";
        }
        return "evt " + i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AudioManager getAudioManager() {
        AudioManager audioManager = mockedAudioManager;
        if (audioManager != null) {
            return audioManager;
        }
        Context context = this.mContext.get();
        if (context == null) {
            return null;
        }
        return (AudioManager) context.getSystemService("audio");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getAudioRouteDesc(int i) {
        switch (i) {
            case -1:
                return LrcWrapperBean.LrcWrapperType.LrcWrapperType_Default;
            case 0:
                return "Headset";
            case 1:
                return "Earpiece";
            case 2:
                return "HeadsetOnly";
            case 3:
                return "Speakerphone";
            case 4:
                return "Loudspeaker";
            case 5:
                return "HeadsetBluetooth";
            case 6:
                return "USBDevice";
            case 7:
            default:
                return "Unknown";
            case 8:
                return "USB_HEADSET";
        }
    }

    private int getOutputDevicesByStream(int i) {
        try {
            return ((Integer) AudioManager.class.getMethod("getDevicesForStream", Integer.TYPE).invoke(getAudioManager(), Integer.valueOf(i))).intValue();
        } catch (Exception e) {
            Logging.m87220e(TAG, "Error while getDevicesForStream! ", e);
            return 0;
        }
    }

    private int getSdkDeviceByAndroidType(int i) {
        if (i == 2) {
            return 3;
        }
        if (i == 4) {
            return 0;
        }
        if (i == 8) {
            return 2;
        }
        if (i == 128 || i == 256 || i == 512) {
            return 5;
        }
        if (i != 1024) {
            return (i == 16384 || i == 67108864 || (i & 8388608) != 0) ? 6 : 3;
        }
        return 7;
    }

    private String modeAsString(int i) {
        if (i == 0) {
            return "MODE_NORMAL";
        }
        if (i == 1) {
            return "MODE_RINGTONE";
        }
        if (i == 2) {
            return "MODE_IN_CALL";
        }
        if (i == 3) {
            return "MODE_IN_COMMUNICATION";
        }
        return "Unknown " + i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeAudioDeviceStateChanged(String str, String str2, int i, int i2);

    private native void nativeAudioRoutingCallbackEvent(int i);

    private native void nativeAudioRoutingChanged(int i);

    private native void nativeAudioRoutingError(int i);

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyAudioRoutingChanged(int i) {
        Logging.m87222i(TAG, "Enter notifyAudioRoutingChanged: " + i + ", force a2dp: " + this.mForceUseA2dp);
        if (this.mDisposed) {
            Logging.m87224w(TAG, "notifyAudioRoutingChanged returned cause of disposed");
            return;
        }
        if (i == 5 && this.mForceUseA2dp == 1 && mockedBroadcaster == null) {
            AudioManager audioManager = getAudioManager();
            if (audioManager != null && !audioManager.isBluetoothA2dpOn()) {
                Logging.m87224w(TAG, "callback A2DP but its not stable yet");
            }
            i = 10;
        }
        nativeAudioRoutingChanged(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetAudioRouting() {
        boolean z = this.mIsBTHeadsetPlugged;
        int i = 5;
        if (z && this.mIsWiredHeadsetPlugged) {
            AudioManager audioManager = getAudioManager();
            int outputDevicesByStream = getOutputDevicesByStream((audioManager == null ? 0 : audioManager.getMode()) == 0 ? 3 : 0);
            int sdkDeviceByAndroidType = getSdkDeviceByAndroidType(outputDevicesByStream);
            Logging.m87222i(TAG, "In multidevice connect, query target: " + sdkDeviceByAndroidType + ", " + outputDevicesByStream);
            if (sdkDeviceByAndroidType == 5 || sdkDeviceByAndroidType == this.mHeadsetType) {
                i = sdkDeviceByAndroidType;
            }
        } else if (!z) {
            if (this.mIsWiredHeadsetPlugged) {
                i = this.mHeadsetType;
            } else {
                i = this.mForcedRouting;
                if (i == -1) {
                    i = this.mDefaultRouting;
                }
            }
        }
        Logging.m87222i(TAG, "Reset audio routing, default routing: " + getAudioRouteDesc(this.mDefaultRouting) + ", current routing: " + getAudioRouteDesc(this.mCurrentRouting) + ", target routing: " + getAudioRouteDesc(i) + ", actual system routing: " + getAudioRouteDesc(queryCurrentAudioRouting()));
        if (this.mCurrentRouting == i && queryCurrentAudioRouting() == this.mCurrentRouting) {
            return;
        }
        doSetAudioOutputRouting(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void scoMonitorTimeout() {
        AudioManager audioManager = getAudioManager();
        if (audioManager == null || this.mCurrentRouting != 5 || this.mForceUseA2dp == 1) {
            return;
        }
        int mode = audioManager.getMode();
        if (mode == 1 || mode == 2) {
            startScoPhonestateMonitorTimer();
            return;
        }
        Logging.m87216d(TAG, "detect phone state exit, mode=" + mode + ", mForceUseA2dp=" + this.mForceUseA2dp);
        if (mode == 3) {
            audioManager.stopBluetoothSco();
            startTimer();
            startBtSco();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:25:0x0041  */
    /* JADX WARN: Code duplicated, block: B:27:0x0049  */
    public void selectRoutingForCommunication(int i) {
        AudioManager audioManager = getAudioManager();
        if (audioManager == null || audioManager.getMode() != 3) {
            return;
        }
        if (i == 1 && audioManager.isWiredHeadsetOn()) {
            return;
        }
        Logging.m87222i(TAG, "Api select prefer communication route: " + i);
        if (i == 0) {
            if (!this.mAudioDeviceInventory.isDeviceAvaliable(i)) {
                Logging.m87224w(TAG, "Selected route is not connected");
                return;
            }
        } else if (i != 1) {
            if (i == 2) {
                if (!this.mAudioDeviceInventory.isDeviceAvaliable(i)) {
                    Logging.m87224w(TAG, "Selected route is not connected");
                    return;
                }
            } else if (i != 3) {
                if (i != 5 && i != 6 && i != 8) {
                    i = -1;
                } else if (!this.mAudioDeviceInventory.isDeviceAvaliable(i)) {
                    Logging.m87224w(TAG, "Selected route is not connected");
                    return;
                }
            }
        }
        if (i != -1) {
            doSetAudioOutputRouting(i);
        }
    }

    public static void setAudioDeviceChangedSpecialMonitor(AudioDeviceChangedSpecialMonitor audioDeviceChangedSpecialMonitor) {
        Logging.m87222i(TAG, "setAudioDeviceChangedSpecialMonitor");
        deviceSpecialMonitor = audioDeviceChangedSpecialMonitor;
    }

    @VisibleForTesting
    public static void setMockBlueToothEnable(boolean z) {
        mockBlueToothEnable = z;
    }

    @VisibleForTesting
    public static void setMockedAudioManager(AudioManager audioManager) {
        mockedAudioManager = audioManager;
    }

    @VisibleForTesting
    public static void setMockedBroadcaster(MockedBroadcaseter mockedBroadcaseter) {
        mockedBroadcaster = mockedBroadcaseter;
        AudioDeviceInventoryMocker.setMockedBroadcaster(mockedBroadcaseter);
    }

    private void setupHotPlugDeviceInitValue() {
        int i;
        if (this.mIsBTHeadsetPlugged) {
            i = 5;
        } else if (this.mIsWiredHeadsetPlugged) {
            i = this.mHeadsetType;
        } else {
            i = this.mAudioDeviceInventory.isDeviceAvaliable(6) ? 6 : -1;
        }
        if (i != -1) {
            notifyAudioRoutingChanged(i);
        }
    }

    private void startBtSco() {
        AudioManager audioManager = getAudioManager();
        if (audioManager != null) {
            int mode = audioManager.getMode();
            Logging.m87222i(TAG, "Start opening bt sco " + this.mScoConnectionAttemps + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + mode + "[" + modeAsString(mode) + "] " + this.mBtScoState + "[" + btStateAsString(this.mBtScoState) + "] sco on: " + audioManager.isBluetoothScoOn());
            this.mBtScoState = 0;
            doStartBTSco(audioManager);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startScoPhonestateMonitorTimer() {
        Logging.m87216d(TAG, "start sco monitor timer for phone state");
        this.mEventHandler.postDelayed(this.scoMonitorInPhoneCallRunnable, 2000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startTimer() {
        this.dynamic_timeout += this.mScoConnectionAttemps * 3000;
        Logging.m87224w(TAG, "start bluetooth timer " + this.dynamic_timeout);
        this.mEventHandler.postDelayed(this.bluetoothTimeoutRunnable, 3000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopBtSco() {
        if (this.mIsFreezed) {
            Logging.m87222i(TAG, "stop sco ignored for freezed");
            return;
        }
        AudioManager audioManager = getAudioManager();
        if (audioManager != null) {
            int mode = audioManager.getMode();
            Logging.m87222i(TAG, "try to stopping bt sco " + mode + "[" + modeAsString(mode) + "] " + this.mBtScoState + "[" + btStateAsString(this.mBtScoState) + "] sco on: " + audioManager.isBluetoothScoOn());
            this.mBtScoState = !audioManager.isBluetoothScoOn() ? 3 : 2;
            doStopBTSco(audioManager);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int updateBluetoothSco(int i) {
        if (this.mPhoneInCall) {
            Logging.m87216d(TAG, "Not process updateBluetoothSco in call");
            return 0;
        }
        if (this.mIsFreezed) {
            Logging.m87222i(TAG, "update bluetoosh sco ignore for freezed");
            return 0;
        }
        Logging.m87216d(TAG, "Update sco control, current sco : " + this.mIsBTScoStarted + ", audio route target: " + i + "[" + getAudioRouteDesc(i) + "] current: " + this.mCurrentRouting + "[" + getAudioRouteDesc(this.mCurrentRouting) + Constants.AES_SUFFIX);
        if (i == 5) {
            if (this.mForceUseA2dp == 0) {
                Logging.m87222i(TAG, "Enable hfp");
                this.mIsBTScoStarted = true;
                startTimer();
                startBtSco();
            } else if (this.mIsBTScoStarted) {
                Logging.m87222i(TAG, "Enable a2dp");
                this.mIsBTScoStarted = false;
                cancelTimer();
                stopBtSco();
            }
        } else if (this.mCurrentRouting == 5 && this.mIsBTScoStarted) {
            this.mIsBTScoStarted = false;
            cancelTimer();
            stopBtSco();
        }
        return 0;
    }

    @CalledByNative
    public boolean checkVersion(int i) {
        int i2 = this.mVersionInUsed;
        boolean z = true;
        if ((i2 == 0 && i == 1) || (i2 == 1 && i == 0)) {
            this.mVersionInUsed = i;
        } else {
            z = false;
        }
        if (z) {
            dispose();
            initialize();
        }
        return z;
    }

    @CalledByNative
    public void dispose() {
        this.mThreadChecker.checkIsOnValidThread();
        if (this.mDisposed) {
            return;
        }
        this.mDisposed = true;
        this.mNativeHandle = 0L;
        AudioDeviceInventory audioDeviceInventory = this.mAudioDeviceInventory;
        if (audioDeviceInventory != null) {
            audioDeviceInventory.dispose();
        }
        try {
            AudioManagerScoStateReceiver audioManagerScoStateReceiver = this.mScoStateReceiver;
            if (audioManagerScoStateReceiver != null && audioManagerScoStateReceiver.getRegistered()) {
                MockedBroadcaseter mockedBroadcaseter = mockedBroadcaster;
                if (mockedBroadcaseter != null) {
                    mockedBroadcaseter.unRegisterReceiver(this.mScoStateReceiver);
                }
                Context context = this.mContext.get();
                if (context != null) {
                    context.unregisterReceiver(this.mScoStateReceiver);
                }
                this.mScoStateReceiver.setRegistered(false);
            }
            this.mEventHandler.getLooper().quit();
        } catch (Exception e) {
            Logging.m87220e(TAG, "AudioRoutingController dispose fail: ", e);
        }
        Logging.m87216d(TAG, "dispose");
    }

    @CalledByNative
    public String getCurrentUsbAudioDevicePID(int i) {
        AudioDeviceChangedSpecialMonitor audioDeviceChangedSpecialMonitor = deviceSpecialMonitor;
        String strGetUSBDevicePID = audioDeviceChangedSpecialMonitor != null ? audioDeviceChangedSpecialMonitor.GetUSBDevicePID(i) : null;
        Logging.m87216d(TAG, String.format("getPIDFromNative: mic_or_spk=%d, pid=%s", Integer.valueOf(i), strGetUSBDevicePID == null ? "null" : strGetUSBDevicePID));
        return strGetUSBDevicePID;
    }

    @CalledByNative
    public String getCurrentUsbAudioDeviceVID(int i) {
        AudioDeviceChangedSpecialMonitor audioDeviceChangedSpecialMonitor = deviceSpecialMonitor;
        String strGetUSBDeviceVID = audioDeviceChangedSpecialMonitor != null ? audioDeviceChangedSpecialMonitor.GetUSBDeviceVID(i) : null;
        Logging.m87216d(TAG, String.format("getVIDFromNative: mic_or_spk=%d, vid=%s", Integer.valueOf(i), strGetUSBDeviceVID == null ? "null" : strGetUSBDeviceVID));
        return strGetUSBDeviceVID;
    }

    @CalledByNative
    public long getNativeHandle() {
        this.mThreadChecker.checkIsOnValidThread();
        return this.mNativeHandle;
    }

    public int handleBluetoothHeadsetEvent(int i) {
        boolean z = i == 1;
        this.mIsBTHeadsetPlugged = z;
        if (z) {
            return 5;
        }
        return queryCurrentAudioRouting();
    }

    public int handleHeadsetEvent(int i) {
        AudioManager audioManager = getAudioManager();
        if (audioManager != null && audioManager.isWiredHeadsetOn() && this.mIsWiredHeadsetPlugged && i < 0) {
            Logging.m87222i(TAG, "not handle extra headset event, as headset still connect");
            return -1;
        }
        this.mHeadsetType = i;
        boolean z = i >= 0;
        this.mIsWiredHeadsetPlugged = z;
        return z ? i : queryCurrentAudioRouting();
    }

    @CalledByNative
    public int initialize() {
        AudioDeviceInventory audioDeviceInventoryMorHigher;
        String str;
        Logging.m87222i(TAG, "AudioRoutingController initialize+ (Android: " + Build.VERSION.SDK_INT + ")");
        Context context = this.mContext.get();
        if (context == null) {
            str = "context has been GCed";
        } else {
            AudioManager audioManager = getAudioManager();
            if (audioManager != null) {
                ControllerAudioDeviceChangeCallback controllerAudioDeviceChangeCallback = new ControllerAudioDeviceChangeCallback();
                this.ctrlAudioDeviceCb = controllerAudioDeviceChangeCallback;
                WebRtcAudioRecord.setRecordRouteCallback(controllerAudioDeviceChangeCallback);
                WebRtcAudioTrack.setTrackRouteCallback(this.ctrlAudioDeviceCb);
                HandlerThread handlerThread = new HandlerThread(TAG);
                handlerThread.start();
                this.mEventHandler = new EventHandler(handlerThread.getLooper());
                if (mockedBroadcaster != null) {
                    audioDeviceInventoryMorHigher = new AudioDeviceInventoryMocker();
                } else {
                    audioDeviceInventoryMorHigher = this.mVersionInUsed == 1 ? new AudioDeviceInventoryMorHigher(context) : new AudioDeviceInventoryLowerThanM(context);
                }
                this.mAudioDeviceInventory = audioDeviceInventoryMorHigher;
                this.mAudioDeviceInventory.setAudioDeviceChangeCallback(new AudioDeviceChangedCallbackImpl());
                this.mAudioDeviceInventory.initialize();
                if (this.mAudioDeviceInventory.isDeviceAvaliable(0)) {
                    this.mIsWiredHeadsetPlugged = true;
                    this.mHeadsetType = 0;
                } else if (this.mAudioDeviceInventory.isDeviceAvaliable(2)) {
                    this.mIsWiredHeadsetPlugged = true;
                    this.mHeadsetType = 2;
                }
                this.mIsBTHeadsetPlugged = this.mAudioDeviceInventory.isDeviceAvaliable(5);
                this.mBtScoState = audioManager.isBluetoothScoOn() ? 1 : 3;
                StringBuilder sb = new StringBuilder("Headset state: ");
                sb.append(this.mIsWiredHeadsetPlugged);
                sb.append("(type:");
                sb.append(this.mHeadsetType);
                sb.append("), BT state:");
                sb.append(this.mIsBTHeadsetPlugged);
                sb.append("(sco: ");
                sb.append(this.mBtScoState == 1 ? " enable " : " disable");
                sb.append(")");
                Logging.m87222i(TAG, sb.toString());
                this.mScoStateReceiver = new AudioManagerScoStateReceiver();
                IntentFilter intentFilter = new IntentFilter("android.media.ACTION_SCO_AUDIO_STATE_UPDATED");
                ii5.m136342l(context, this.mScoStateReceiver, intentFilter);
                MockedBroadcaseter mockedBroadcaseter = mockedBroadcaster;
                if (mockedBroadcaseter != null) {
                    mockedBroadcaseter.registerReceiver(this.mScoStateReceiver, intentFilter);
                }
                this.mScoStateReceiver.setRegistered(true);
                this.mDisposed = false;
                this.mState = changeState(2);
                setupHotPlugDeviceInitValue();
                Logging.m87222i(TAG, "AudioRoutingController initialize-");
                return 0;
            }
            str = "invalid context: can't get AudioManager";
        }
        Logging.m87219e(TAG, str);
        return -1;
    }

    @CalledByNative
    public int queryCurrentAudioRouting() {
        int i;
        AudioManager audioManager = getAudioManager();
        try {
            int i2 = 3;
            if (audioManager.isSpeakerphoneOn()) {
                return 3;
            }
            if (!audioManager.isBluetoothScoOn() && !audioManager.isBluetoothA2dpOn()) {
                if (audioManager.isWiredHeadsetOn()) {
                    return 0;
                }
                if (audioManager.getMode() == 0) {
                    i = 3;
                } else {
                    i = 1;
                    i2 = 0;
                }
                int sdkDeviceByAndroidType = getSdkDeviceByAndroidType(getOutputDevicesByStream(i2));
                return (sdkDeviceByAndroidType == 7 || sdkDeviceByAndroidType == 6) ? sdkDeviceByAndroidType : i;
            }
            return 5;
        } catch (Exception e) {
            Logging.m87220e(TAG, "fatal error @queryCurrentAudioRouting", e);
            return -1;
        }
    }

    @CalledByNative
    public void sendEvent(int i, int i2) {
        Logging.m87216d(TAG, "sendEvent: [" + i + "], extra arg: " + i2 + "... " + this.mEventHandler);
        EventHandler eventHandler = this.mEventHandler;
        if (eventHandler != null) {
            this.mEventHandler.sendMessage(eventHandler.obtainMessage(i, i2, 0));
        }
    }

    @CalledByNative
    public int startMonitoring() {
        Logging.m87216d(TAG, "startMonitoring()");
        this.mEventHandler.post(new Runnable() { // from class: io.agora.rtc2.internal.AudioRoutingController.3
            @Override // java.lang.Runnable
            public void run() {
                if (AudioRoutingController.this.mState != null) {
                    AudioRoutingController.this.mState.setState(1);
                }
            }
        });
        if (this.mIsBTHeadsetPlugged) {
            return 5;
        }
        if (this.mIsWiredHeadsetPlugged) {
            return this.mHeadsetType;
        }
        if (this.mAudioDeviceInventory.isDeviceAvaliable(6)) {
            return 6;
        }
        return this.mDefaultRouting;
    }

    @CalledByNative
    public void stopMonitoring() {
        Logging.m87216d(TAG, "stopMonitoring()");
        this.mEventHandler.post(new Runnable() { // from class: io.agora.rtc2.internal.AudioRoutingController.4
            @Override // java.lang.Runnable
            public void run() {
                if (AudioRoutingController.this.mState != null) {
                    AudioRoutingController.this.mState.setState(2);
                }
            }
        });
    }
}
