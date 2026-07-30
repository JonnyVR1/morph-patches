package com.momo.momortc;

import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import com.heytap.mcssdk.mode.Message;
import com.momo.momortc.MMRtcHttpUtils;
import com.p051p1.mobile.putong.live.base.data.BLivePkCategory;
import com.p074ss.bytertc.audio.device.webrtc.WebRtcAudioTrack;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
import p153l.b2d0;
import p153l.e7y;
import p153l.fvx;
import p153l.i5d0;
import p153l.l1j;
import p153l.pof0;
import p153l.rg50;
import p153l.x1d0;
import p153l.z1d0;
import p153l.ze2;

/* JADX INFO: loaded from: classes8.dex */
public class MMRtcHttpUtils {
    private Handler mHandler;
    private static final MMRtcHttpUtils ourInstance = new MMRtcHttpUtils();
    private static final e7y JSON = e7y.m119773d("application/json; charset=utf-8");
    private static rg50 client = new rg50();
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
    public static /* synthetic */ void m20642a(MMRtcHttpUtils mMRtcHttpUtils, String str, String str2, String str3, MMRtcHttpCallback mMRtcHttpCallback) {
        i5d0 i5d0VarPost;
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
            i5d0VarPost = mMRtcHttpUtils.post("https://live-api.immomo.com/open/httpdns/signalDispatch", jSONObject.toString());
        } catch (IOException e2) {
            if (mMRtcHttpCallback != null) {
                mMRtcHttpCallback.onError(WebRtcAudioTrack.AudioTrackErrorCode.AUDIO_TRACK_INIT_MINBUFFER_ERROR, "http post");
            }
            e2.printStackTrace();
            i5d0VarPost = null;
        }
        if (mMRtcHttpCallback == null || i5d0VarPost == null) {
            return;
        }
        String strString = "";
        try {
            if (i5d0VarPost.m138670k() != null) {
                strString = i5d0VarPost.m138670k().string();
            }
        } catch (IOException e3) {
            mMRtcHttpCallback.onError(i5d0VarPost.m138673q(), "response string");
            e3.printStackTrace();
        }
        if (i5d0VarPost.m138673q() == 200) {
            mMRtcHttpCallback.onSuccess(i5d0VarPost.m138673q(), strString);
        } else {
            mMRtcHttpCallback.onError(i5d0VarPost.m138673q(), strString);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m20643b(MMRtcHttpUtils mMRtcHttpUtils, String str, MMRtcHttpCallback mMRtcHttpCallback) {
        i5d0 i5d0Var;
        mMRtcHttpUtils.getClass();
        try {
            i5d0Var = mMRtcHttpUtils.get("https://liverc-cluster-moniter.immomo.com/work/service/httpdns?channelID=" + str);
        } catch (IOException e) {
            if (mMRtcHttpCallback != null) {
                mMRtcHttpCallback.onError(WebRtcAudioTrack.AudioTrackErrorCode.AUDIO_TRACK_INIT_MINBUFFER_ERROR, "http post");
            }
            e.printStackTrace();
            i5d0Var = null;
        }
        if (mMRtcHttpCallback == null || i5d0Var == null) {
            return;
        }
        String strString = "";
        try {
            if (i5d0Var.m138670k() != null) {
                strString = i5d0Var.m138670k().string();
            }
        } catch (IOException e2) {
            mMRtcHttpCallback.onError(i5d0Var.m138673q(), "response string");
            e2.printStackTrace();
        }
        if (i5d0Var.m138673q() == 200) {
            mMRtcHttpCallback.onSuccess(i5d0Var.m138673q(), strString);
        } else {
            mMRtcHttpCallback.onError(i5d0Var.m138673q(), strString);
        }
    }

    public static MMRtcHttpUtils getInstance() {
        return ourInstance;
    }

    public i5d0 get(String str) throws IOException {
        return client.mo181341a(new x1d0.C21228a().m209043q(str).m209028b()).execute();
    }

    public void getDemoSignalServer(final String str, final MMRtcHttpCallback mMRtcHttpCallback) {
        this.mHandler.post(new Runnable() { // from class: l.pnw
            @Override // java.lang.Runnable
            public final void run() {
                MMRtcHttpUtils.m20643b(this.f153336a, str, mMRtcHttpCallback);
            }
        });
    }

    public i5d0 post(String str, String str2) throws IOException {
        return client.mo181341a(new x1d0.C21228a().m209043q(str).m209038l(z1d0.create(JSON, str2)).m209028b()).execute();
    }

    public void postSignalDispatch(final String str, final String str2, final String str3, final MMRtcHttpCallback mMRtcHttpCallback) {
        this.mHandler.post(new Runnable() { // from class: l.onw
            @Override // java.lang.Runnable
            public final void run() {
                MMRtcHttpUtils.m20642a(this.f148229a, str2, str3, str, mMRtcHttpCallback);
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
                this.mmrtcSerParamsMap.put(BLivePkCategory.random, String.valueOf(fvx.m127733s()));
                this.mmrtcSerParamsMap.put("time", String.valueOf(System.currentTimeMillis() / 1000));
                this.mmrtcSerParamsMap.put("appid", str3);
                this.mmrtcSerParamsMap.put("secret", str4);
                StringBuilder sb = new StringBuilder();
                l1j.C18332a c18332a = new l1j.C18332a();
                for (String str7 : this.mmrtcSerConfig) {
                    String str8 = this.mmrtcSerParamsMap.get(str7);
                    sb.append(str8);
                    if (!"secret".equals(str7)) {
                        c18332a.m152497a(str7, str8);
                    }
                }
                this.mmrtcSerParamsMap.put("sign", fvx.m127740z(sb.toString()));
                Objects.toString(c18332a.m152498b());
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
        new pof0(str6, this.mmrtcSerParamsMap, null).m141755g(new b2d0<ze2>() { // from class: com.momo.momortc.MMRtcHttpUtils.1
            @Override // p153l.b2d0
            public void onCancel() {
                Log.e("MMRtcHttpUtils", "onCancel");
            }

            @Override // p153l.b2d0
            public void onError(int i, String str9, String str10) {
                Log.e("MMRtcHttpUtils", "onError ec=" + i + ";em=" + str9 + ";body = " + str10);
                mMRtcHttpCallback.onError(i, str10);
            }

            @Override // p153l.b2d0
            public void onFinish() {
                Log.e("MMRtcHttpUtils", "onFinish");
            }

            @Override // p153l.b2d0
            public void onSuccess(int i, ze2 ze2Var, String str9) {
                mMRtcHttpCallback.onSuccess(i, str9);
            }
        });
    }

    public i5d0 post(String str, l1j l1jVar) throws IOException {
        return client.mo181341a(new x1d0.C21228a().m209043q(str).m209038l(l1jVar).m209028b()).execute();
    }
}
