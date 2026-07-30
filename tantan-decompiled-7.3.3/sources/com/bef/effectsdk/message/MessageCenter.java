package com.bef.effectsdk.message;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.amazing.annotation.EffectKeep;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@EffectKeep
public class MessageCenter {
    public static final int BEF_MSG_TYPE_RECORD_VIDEO = 72;
    public static final int MSG_CLIENT_TO_SDK_CHALLENGE_GAME = 4103;
    public static final int MSG_CLIENT_TO_SDK_PUASE_GAME = 4100;
    public static final int MSG_CLIENT_TO_SDK_RESTART_GAME = 4102;
    public static final int MSG_CLIENT_TO_SDK_RESUME_GAME = 4101;
    public static final int MSG_CLIENT_TO_SDK_START_GAME = 4097;
    public static final int MSG_CLINET_TO_SDK_FINISH_GAME = 4098;
    public static final int MSG_ERROR_TYPE_CONFIG = 4097;
    public static final int MSG_EVENT_2D_ANIMATION_CYCLE_FINISH = 5;
    public static final int MSG_EVENT_ALGORITHM_CHANGE_FACE_COUNT = 1;
    public static final int MSG_EVENT_AUDIO_FILE_WRITTEN = 2;
    public static final int MSG_EVENT_AUDIO_INIT = 1;
    public static final int MSG_EVENT_AUDIO_RECORD_FILEPATH = 2;
    public static final int MSG_EVENT_AUDIO_RECORD_START = 0;
    public static final int MSG_EVENT_AUDIO_RECORD_STOP = 1;
    public static final int MSG_EVENT_BODY_DANCE_CATEGORY_ADJUST = 1;
    public static final int MSG_EVENT_BODY_DANCE_CATEGORY_SCORE = 2;
    public static final int MSG_EVENT_CAMERA_SWITCH = 3;
    public static final int MSG_EVENT_CAMERA_TO_BACK = 2;
    public static final int MSG_EVENT_CAMERA_TO_FRONT = 1;
    public static final int MSG_EVENT_ENIGMA_COMPLETE = 1;
    public static final int MSG_EVENT_EXIT_GAME = 0;
    public static final int MSG_EVENT_GAME_END = 3;
    public static final int MSG_EVENT_GAME_READY = 2;
    public static final int MSG_EVENT_LOAD_FAIL = 4;
    public static final int MSG_EVENT_LOAD_INIT = 1;
    public static final int MSG_EVENT_LOAD_LOADING = 2;
    public static final int MSG_EVENT_LOAD_SUCCESS = 3;
    public static final int MSG_EVENT_PLAY_GAME_BGM = 1;
    public static final int MSG_EVENT_RECORD_CLIP_KEY = 2;
    public static final int MSG_EVENT_REPLAY_GAME = 1;
    public static final int MSG_EVENT_STOP_GAME_BGM = 0;
    public static final int MSG_ID_BEGIN = 16;
    public static final int MSG_SDK_TO_CLIENT_END_GAME_REQ = 4099;
    public static final int MSG_SDK_TO_CLIENT_GAME_RESOURCE_LOADED = 4104;
    public static final int MSG_TYPE_2D_ANIMATION_CYCLE = 18;
    public static final int MSG_TYPE_ALGORITHM_CHANGE = 23;
    public static final int MSG_TYPE_APP_STATUS = 22;
    public static final int MSG_TYPE_ARSCAN_STICKER = 53;
    public static final int MSG_TYPE_AUDIO_PLAYER = 21;
    public static final int MSG_TYPE_AUDIO_RECORD = 43;
    public static final int MSG_TYPE_BODY_DANCE = 19;
    public static final int MSG_TYPE_CLIENT_INTERACTION = 41;
    public static final int MSG_TYPE_EFFECT = 20;
    public static final int MSG_TYPE_FACE_ATTRIBUTIONS = 34;
    public static final int MSG_TYPE_FACE_VERIFY = 35;
    public static final int MSG_TYPE_GAME_DATA = 42;
    public static final int MSG_TYPE_GAME_MUSIC_END = 44;
    public static final int MSG_TYPE_GAME_MUSIC_REQ = 47;
    public static final int MSG_TYPE_GAME_NTF = 46;
    public static final int MSG_TYPE_GAME_REQ = 45;
    public static final int MSG_TYPE_GENERAL_AUDIO = 58;
    public static final int MSG_TYPE_HIDEINPUTMETHOD = 33;
    public static final int MSG_TYPE_LIVE_ACTIVITY_INFO = 56;
    public static final int MSG_TYPE_LIVE_GIFT_NOTIFY = 57;
    public static final int MSG_TYPE_LIVE_INTERACTION = 40;
    public static final int MSG_TYPE_LIVE_MAGIC_GESTURE_INFO = 55;
    public static final int MSG_TYPE_LIVE_OGC_INFO = 64;
    public static final int MSG_TYPE_M10N_INFO = 66;
    public static final int MSG_TYPE_RESOURCE = 17;
    public static final int MSG_TYPE_SHOWINPUTMETHOD = 32;
    public static final int MSG_TYPE_START_RECORD = 48;
    public static final int MSG_TYPE_STICKER_ASK_LOAD_CNT = 51;
    public static final int MSG_TYPE_STICKER_LOAD_CNT = 50;
    public static final int MSG_TYPE_STOP_RECORD = 49;
    public static final int MSG_TYPE_SWITCH_CAMERA_POSITION = 71;
    public static final int MSG_TYPE_SWITCH_TO_AR_MODE = 80;
    public static final int MSG_TYPE_TYPE_ENIGMA = 24;
    public static final int MSG_TYPE_VE_AUDIO = 59;
    public static final int MSG_TYPE_VRBRUSH_STICKER = 54;
    private static final String TAG = "MessageCenter";
    private static HandlerThread sMessageCenterThread;
    private static Handler sMessageHandler;
    private static final Object sMessageCenterThreadLock = new Object();
    private static final List<Listener> sListeners = new ArrayList();

    public interface Listener {
        void onMessageReceived(int i, int i2, int i3, String str);
    }

    public static class MessageHandler extends Handler {
        public MessageHandler(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            MessageCenter.handleMessage(message);
        }
    }

    public static void addListener(Listener listener) {
        List<Listener> list = sListeners;
        synchronized (list) {
            try {
                if (list.isEmpty()) {
                    init();
                }
                list.add(listener);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void destroy() {
        List<Listener> list = sListeners;
        synchronized (list) {
            try {
                if (list.isEmpty()) {
                    synchronized (sMessageCenterThreadLock) {
                        try {
                            Handler handler = sMessageHandler;
                            if (handler != null) {
                                handler.removeCallbacksAndMessages(null);
                                sMessageHandler = null;
                            }
                            HandlerThread handlerThread = sMessageCenterThread;
                            if (handlerThread != null) {
                                handlerThread.quit();
                                sMessageCenterThread = null;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    list.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void handleMessage(Message message) {
        int size;
        Listener[] listenerArr;
        List<Listener> list = sListeners;
        synchronized (list) {
            size = list.size();
            listenerArr = new Listener[size];
            list.toArray(listenerArr);
        }
        if (size <= 0) {
            return;
        }
        for (int i = 0; i < size; i++) {
            listenerArr[i].onMessageReceived(message.what, message.arg1, message.arg2, (String) message.obj);
        }
    }

    public static void init() {
        synchronized (sMessageCenterThreadLock) {
            try {
                HandlerThread handlerThread = sMessageCenterThread;
                if (handlerThread == null || !handlerThread.isAlive() || sMessageCenterThread.getLooper() == null) {
                    HandlerThread handlerThread2 = new HandlerThread(TAG);
                    sMessageCenterThread = handlerThread2;
                    handlerThread2.start();
                    sMessageHandler = new MessageHandler(sMessageCenterThread.getLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @EffectKeep
    private static void postMessage(int i, int i2, int i3, String str) {
        synchronized (sMessageCenterThreadLock) {
            try {
                Handler handler = sMessageHandler;
                if (handler == null) {
                    return;
                }
                Message.obtain(handler, i, i2, i3, str).sendToTarget();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void removeAllListener() {
        List<Listener> list = sListeners;
        synchronized (list) {
            list.clear();
            destroy();
        }
    }

    public static void removeListener(Listener listener) {
        List<Listener> list = sListeners;
        synchronized (list) {
            try {
                list.remove(listener);
                if (list.isEmpty()) {
                    destroy();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void setListener(Listener listener) {
        synchronized (sListeners) {
            addListener(listener);
        }
    }
}
