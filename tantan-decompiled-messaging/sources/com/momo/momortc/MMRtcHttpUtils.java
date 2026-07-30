package com.momo.momortc;

import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import com.heytap.mcssdk.mode.Message;
import com.momo.momortc.MMRtcHttpUtils;
import com.p046p1.mobile.putong.live.base.data.BLivePkCategory;
import com.p069ss.bytertc.audio.device.webrtc.WebRtcAudioTrack;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
import p149l.exc0;
import p149l.hyx;
import p149l.igf0;
import p149l.imx;
import p149l.k850;
import p149l.qyi;
import p149l.se2;
import p149l.stc0;
import p149l.utc0;
import p149l.wtc0;

/* JADX INFO: loaded from: classes6.dex */
public class MMRtcHttpUtils {
    private Handler mHandler;
    private static final MMRtcHttpUtils ourInstance = new MMRtcHttpUtils();
    private static final hyx JSON = hyx.m133628d("application/json; charset=utf-8");
    private static k850 client = new k850();
    private ConcurrentHashMap<String, String> configParamsMap = new ConcurrentHashMap<>();
    List<String> mmrtcSerConfig = new ArrayList();
    ConcurrentHashMap<String, String> mmrtcSerParamsMap = new ConcurrentHashMap<>();

    public interface MMRtcHttpCallback {
        void onError(int i, String str);

        void onSuccess(int i, String str);
    }

    private MMRtcHttpUtils() {
        HandlerThread handlerThread = new HandlerThread("rtc_HttpPost");
        handlerThread.start();
        this.mHandler = new Handler(handlerThread.getLooper());
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m19643a(MMRtcHttpUtils mMRtcHttpUtils, String str, String str2, String str3, MMRtcHttpCallback mMRtcHttpCallback) {
        exc0 exc0VarPost;
        mMRtcHttpUtils.getClass();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("dynamicKey", str);
            jSONObject.put("channelID", str2);
            jSONObject.put(Message.APP_ID, str3);
        } catch (JSONException e) {
            e.printStackTrace();
            if (mMRtcHttpCallback != null) {
                mMRtcHttpCallback.onError(-100, "json create");
            }
        }
        try {
            exc0VarPost = mMRtcHttpUtils.post("https://live-api.immomo.com/open/httpdns/signalDispatch", jSONObject.toString());
        } catch (IOException e2) {
            if (mMRtcHttpCallback != null) {
                mMRtcHttpCallback.onError(WebRtcAudioTrack.AudioTrackErrorCode.AUDIO_TRACK_INIT_MINBUFFER_ERROR, "http post");
            }
            e2.printStackTrace();
            exc0VarPost = null;
        }
        if (mMRtcHttpCallback == null || exc0VarPost == null) {
            return;
        }
        String strString = "";
        try {
            if (exc0VarPost.m118606k() != null) {
                strString = exc0VarPost.m118606k().string();
            }
        } catch (IOException e3) {
            mMRtcHttpCallback.onError(exc0VarPost.m118609q(), "response string");
            e3.printStackTrace();
        }
        if (exc0VarPost.m118609q() == 200) {
            mMRtcHttpCallback.onSuccess(exc0VarPost.m118609q(), strString);
        } else {
            mMRtcHttpCallback.onError(exc0VarPost.m118609q(), strString);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m19644b(MMRtcHttpUtils mMRtcHttpUtils, String str, MMRtcHttpCallback mMRtcHttpCallback) {
        exc0 exc0Var;
        mMRtcHttpUtils.getClass();
        try {
            exc0Var = mMRtcHttpUtils.get("https://liverc-cluster-moniter.immomo.com/work/service/httpdns?channelID=" + str);
        } catch (IOException e) {
            if (mMRtcHttpCallback != null) {
                mMRtcHttpCallback.onError(WebRtcAudioTrack.AudioTrackErrorCode.AUDIO_TRACK_INIT_MINBUFFER_ERROR, "http post");
            }
            e.printStackTrace();
            exc0Var = null;
        }
        if (mMRtcHttpCallback == null || exc0Var == null) {
            return;
        }
        String strString = "";
        try {
            if (exc0Var.m118606k() != null) {
                strString = exc0Var.m118606k().string();
            }
        } catch (IOException e2) {
            mMRtcHttpCallback.onError(exc0Var.m118609q(), "response string");
            e2.printStackTrace();
        }
        if (exc0Var.m118609q() == 200) {
            mMRtcHttpCallback.onSuccess(exc0Var.m118609q(), strString);
        } else {
            mMRtcHttpCallback.onError(exc0Var.m118609q(), strString);
        }
    }

    public static MMRtcHttpUtils getInstance() {
        return ourInstance;
    }

    public exc0 get(String str) throws IOException {
        return client.mo144849a(new stc0.C20027a().m185898q(str).m185883b()).execute();
    }

    public void getDemoSignalServer(final String str, final MMRtcHttpCallback mMRtcHttpCallback) {
        this.mHandler.post(new Runnable() { // from class: l.qkw
            @Override // java.lang.Runnable
            public final void run() {
                MMRtcHttpUtils.m19644b(this.f155175a, str, mMRtcHttpCallback);
            }
        });
    }

    public exc0 post(String str, String str2) throws IOException {
        return client.mo144849a(new stc0.C20027a().m185898q(str).m185893l(utc0.create(JSON, str2)).m185883b()).execute();
    }

    public void postSignalDispatch(final String str, final String str2, final String str3, final MMRtcHttpCallback mMRtcHttpCallback) {
        this.mHandler.post(new Runnable() { // from class: l.pkw
            @Override // java.lang.Runnable
            public final void run() {
                MMRtcHttpUtils.m19643a(this.f150039a, str2, str3, str, mMRtcHttpCallback);
            }
        });
    }

    public void postSignalDispatchEx(String str, String str2, String str3, String str4, String str5, final MMRtcHttpCallback mMRtcHttpCallback, boolean z) {
        String str6;
        if (z) {
            try {
                this.mmrtcSerConfig.clear();
                this.mmrtcSerConfig.add("appid");
                this.mmrtcSerConfig.add("secret");
                this.mmrtcSerConfig.add(BLivePkCategory.random);
                this.mmrtcSerConfig.add("time");
                this.mmrtcSerConfig.add("dynamicKey");
                this.mmrtcSerConfig.add("channelID");
                this.mmrtcSerConfig.add(Message.APP_ID);
                Collections.sort(this.mmrtcSerConfig);
                this.mmrtcSerParamsMap.clear();
                this.mmrtcSerParamsMap.clear();
                this.mmrtcSerParamsMap.put("dynamicKey", str2);
                this.mmrtcSerParamsMap.put("channelID", str5);
                this.mmrtcSerParamsMap.put(Message.APP_ID, str);
                this.mmrtcSerParamsMap.put(BLivePkCategory.random, String.valueOf(imx.m137112s()));
                this.mmrtcSerParamsMap.put("time", String.valueOf(System.currentTimeMillis() / 1000));
                this.mmrtcSerParamsMap.put("appid", str3);
                this.mmrtcSerParamsMap.put("secret", str4);
                StringBuilder sb = new StringBuilder();
                qyi.C19606a c19606a = new qyi.C19606a();
                for (String str7 : this.mmrtcSerConfig) {
                    String str8 = this.mmrtcSerParamsMap.get(str7);
                    sb.append(str8);
                    if (!"secret".equals(str7)) {
                        c19606a.m177040a(str7, str8);
                    }
                }
                this.mmrtcSerParamsMap.put("sign", imx.m137119z(sb.toString()));
                Objects.toString(c19606a.m177041b());
            } catch (Exception e) {
                e.printStackTrace();
                if (mMRtcHttpCallback != null) {
                    mMRtcHttpCallback.onError(-100, "json create 114");
                }
            }
            str6 = "https://schedule-media.immomo.com/api/media/signalDispatch";
        } else {
            try {
                this.mmrtcSerParamsMap.clear();
                this.mmrtcSerParamsMap.put("dynamicKey", str2);
                this.mmrtcSerParamsMap.put("channelID", str5);
                this.mmrtcSerParamsMap.put(Message.APP_ID, str);
            } catch (Exception e2) {
                e2.printStackTrace();
                if (mMRtcHttpCallback != null) {
                    mMRtcHttpCallback.onError(-100, "json create 70");
                }
            }
            str6 = "https://live-api.immomo.com/open/httpdns/signalDispatch";
        }
        new igf0(str6, this.mmrtcSerParamsMap, null).m185438g(new wtc0<se2>() { // from class: com.momo.momortc.MMRtcHttpUtils.1
            @Override // p149l.wtc0
            public void onCancel() {
                Log.e("MMRtcHttpUtils", "onCancel");
            }

            @Override // p149l.wtc0
            public void onError(int i, String str9, String str10) {
                Log.e("MMRtcHttpUtils", "onError ec=" + i + ";em=" + str9 + ";body = " + str10);
                mMRtcHttpCallback.onError(i, str10);
            }

            @Override // p149l.wtc0
            public void onFinish() {
                Log.e("MMRtcHttpUtils", "onFinish");
            }

            @Override // p149l.wtc0
            public void onSuccess(int i, se2 se2Var, String str9) {
                mMRtcHttpCallback.onSuccess(i, str9);
            }
        });
    }

    public exc0 post(String str, qyi qyiVar) throws IOException {
        return client.mo144849a(new stc0.C20027a().m185898q(str).m185893l(qyiVar).m185883b()).execute();
    }
}
