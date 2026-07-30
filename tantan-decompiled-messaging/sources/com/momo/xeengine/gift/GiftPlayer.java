package com.momo.xeengine.gift;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.Handler;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.util.SizeF;
import android.view.View;
import androidx.annotation.Keep;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.momo.xeengine.IXEngine;
import com.momo.xeengine.XELogger;
import com.momo.xeengine.game.XEGameViewCallback;
import com.momo.xeengine.gift.GiftPlayer;
import com.momo.xeengine.lua.XELuaEngine;
import com.momo.xeengine.script.ScriptBridge;
import com.momo.xeengine.svgaplayer.SVGADrawable;
import com.momo.xeengine.svgaplayer.SVGADynamicEntity;
import com.momo.xeengine.svgaplayer.SVGAImageView;
import com.momo.xeengine.svgaplayer.SVGAParser;
import com.momo.xeengine.svgaplayer.SVGAVideoEntity;
import com.momo.xeengine.svgaplayer.bean.BoringLayoutBean;
import com.momo.xeengine.svgaplayer.listener.SVGACallback;
import com.p046p1.mobile.putong.core.data.StickStatus;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p149l.aag0;

/* JADX INFO: loaded from: classes8.dex */
@Keep
public final class GiftPlayer implements IGiftPlayer {
    private GiftPlayerEventListener eventListener;
    private GiftPlayData giftPlayData;
    private GiftView giftView;
    private String hotfixPatch;
    private boolean isVirtualView;
    private GiftPlayerListener listener;
    private VideoGiftProgressListener progressListener;
    private SVGAParser svgaParser;
    private XEVirtualGiftView virtualGiftView;
    private final ResourceChecker resourceChecker = new ResourceChecker();
    private final Map<String, String> params = new HashMap();
    private boolean logEnable = false;
    private GiftPlayerType playerType = GiftPlayerType.Hardware;
    private boolean mute = false;
    private float volume = 1.0f;
    private float timeout = 15.0f;
    private boolean enablePlayWhenDownloadFailed = true;
    private final Handler handler = new Handler();
    private IXEngine engine = null;
    private Runnable startTimeoutRunnable = null;
    private final GameDelegate gameDelegate = new C41901();
    private final XEGameViewCallback gameViewCallback = new C41912();
    private final SVGACallback svgaCallback = new SVGACallback() { // from class: com.momo.xeengine.gift.GiftPlayer.3
        @Override // com.momo.xeengine.svgaplayer.listener.SVGACallback
        public void onFinished() {
            GiftPlayer.this.callPlayFinished(null);
        }

        @Override // com.momo.xeengine.svgaplayer.listener.SVGACallback
        public void onPause() {
        }

        @Override // com.momo.xeengine.svgaplayer.listener.SVGACallback
        public void onRepeat() {
        }

        @Override // com.momo.xeengine.svgaplayer.listener.SVGACallback
        public void onStart() {
        }

        @Override // com.momo.xeengine.svgaplayer.listener.SVGACallback
        public void onStep(int i, double d) {
        }
    };

    /* JADX INFO: renamed from: com.momo.xeengine.gift.GiftPlayer$1 */
    public class C41901 implements GameDelegate {
        public C41901() {
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m20249a(C41901 c41901, String str) {
            GiftPlayer.this.giftView.stop();
            GiftPlayer.this.callPlayFinished(str);
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m20250b(C41901 c41901) {
            if (GiftPlayer.this.progressListener == null || GiftPlayer.this.giftPlayData == null) {
                return;
            }
            VideoGiftProgressListener videoGiftProgressListener = GiftPlayer.this.progressListener;
            GiftPlayer giftPlayer = GiftPlayer.this;
            videoGiftProgressListener.onVideoGiftStopPlaying(giftPlayer, giftPlayer.giftPlayData.getGiftEntity());
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ void m20251c(C41901 c41901, String str, GiftPlayerEventListener giftPlayerEventListener) {
            c41901.getClass();
            giftPlayerEventListener.onReceiveEvent(GiftPlayer.this, new GiftPlayerEvent(GiftPlayerEvent.EventType.Goto, str));
        }

        /* JADX INFO: renamed from: d */
        public static /* synthetic */ void m20252d(C41901 c41901, int i, String str) {
            c41901.getClass();
            GiftPlayer.this.eventListener.onReceiveEvent(GiftPlayer.this, new GiftPlayerEvent(GiftPlayerEvent.EventType.fromValue(i), str));
        }

        /* JADX INFO: renamed from: e */
        public static /* synthetic */ void m20253e(C41901 c41901, GiftProgress giftProgress) {
            if (GiftPlayer.this.progressListener == null || GiftPlayer.this.giftPlayData == null) {
                return;
            }
            VideoGiftProgressListener videoGiftProgressListener = GiftPlayer.this.progressListener;
            GiftPlayer giftPlayer = GiftPlayer.this;
            videoGiftProgressListener.onVideoGiftProgressUpdate(giftPlayer, giftPlayer.giftPlayData.getGiftEntity(), giftProgress.getCurrentTime(), giftProgress.getTotalTime());
        }

        /* JADX INFO: renamed from: f */
        public static /* synthetic */ void m20254f(C41901 c41901, String str) {
            String string;
            boolean z = GiftPlayer.this.isVirtualView;
            GiftPlayer giftPlayer = GiftPlayer.this;
            if (z) {
                giftPlayer.virtualGiftView.stop();
            } else {
                giftPlayer.giftView.stop();
            }
            int i = 400;
            try {
                JSONObject jSONObject = new JSONObject(str);
                i = jSONObject.getInt("ec");
                string = jSONObject.getString("em");
            } catch (JSONException unused) {
                string = XEGiftErrorCode.ERROR_MSG_UNKNOWN;
            }
            GiftPlayer.this.callDelegatePlayFailed(i, string);
        }

        /* JADX INFO: renamed from: g */
        public static /* synthetic */ void m20255g(C41901 c41901, String str) {
            if (GiftPlayer.this.isVirtualView || GiftPlayer.this.giftView == null) {
                return;
            }
            GiftPlayer.this.giftView.clearValidTouchAreas();
            try {
                JSONArray jSONArrayOptJSONArray = new JSONObject(str).optJSONArray("areas");
                if (jSONArrayOptJSONArray != null) {
                    for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                        JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i);
                        GiftPlayer.this.giftView.addValidTouchArea(new RectF((float) jSONObject.optDouble(BLiveGiftBubblePopupTitlePosition.left, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE), (float) jSONObject.optDouble(StickStatus.top, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE), (float) jSONObject.optDouble("right", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE), (float) jSONObject.optDouble("bottom", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE)));
                    }
                }
                boolean unused = GiftPlayer.this.logEnable;
            } catch (JSONException e) {
                if (GiftPlayer.this.logEnable) {
                    Log.e(XELogger.ENGINE_TAG, "setValidTouchAreas parse error: " + e.getMessage());
                }
            }
        }

        /* JADX INFO: renamed from: h */
        public static /* synthetic */ void m20256h(C41901 c41901, String str) {
            GiftPlayer.this.virtualGiftView.stop();
            GiftPlayer.this.callPlayFinished(str);
        }

        /* JADX INFO: renamed from: i */
        public static /* synthetic */ void m20257i(C41901 c41901) {
            if (GiftPlayer.this.progressListener == null || GiftPlayer.this.giftPlayData == null) {
                return;
            }
            VideoGiftProgressListener videoGiftProgressListener = GiftPlayer.this.progressListener;
            GiftPlayer giftPlayer = GiftPlayer.this;
            videoGiftProgressListener.onVideoGiftStartPlaying(giftPlayer, giftPlayer.giftPlayData.getGiftEntity());
        }

        @Override // com.momo.xeengine.gift.GameDelegate
        public String getGameExtendParams(String str) {
            try {
                JSONObject jSONObject = new JSONObject(GiftPlayer.this.params);
                jSONObject.put("sys_mute", GiftPlayer.this.mute);
                jSONObject.put("sys_volume", GiftPlayer.this.volume);
                return jSONObject.toString(4);
            } catch (Exception e) {
                if (!GiftPlayer.this.logEnable) {
                    return null;
                }
                e.toString();
                return null;
            }
        }

        @Override // com.momo.xeengine.gift.GameDelegate
        public void onGameError(final String str) {
            GiftPlayer.this.handler.post(new Runnable() { // from class: com.momo.xeengine.gift.k
                @Override // java.lang.Runnable
                public final void run() {
                    GiftPlayer.C41901.m20254f(this.f14613a, str);
                }
            });
        }

        @Override // com.momo.xeengine.gift.GameDelegate
        public void onGameFinished(final String str) {
            boolean z = GiftPlayer.this.isVirtualView;
            GiftPlayer giftPlayer = GiftPlayer.this;
            if (z) {
                giftPlayer.handler.post(new Runnable() { // from class: com.momo.xeengine.gift.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        GiftPlayer.C41901.m20256h(this.f14607a, str);
                    }
                });
            } else {
                giftPlayer.handler.post(new Runnable() { // from class: com.momo.xeengine.gift.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        GiftPlayer.C41901.m20249a(this.f14609a, str);
                    }
                });
            }
        }

        @Override // com.momo.xeengine.gift.GameDelegate
        public String onGotoEvent(final String str) {
            final GiftPlayerEventListener giftPlayerEventListener = GiftPlayer.this.eventListener;
            if (giftPlayerEventListener != null && !TextUtils.isEmpty(str)) {
                GiftPlayer.this.handler.post(new Runnable() { // from class: com.momo.xeengine.gift.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        GiftPlayer.C41901.m20251c(this.f14617a, str, giftPlayerEventListener);
                    }
                });
            }
            return null;
        }

        @Override // com.momo.xeengine.gift.GameDelegate
        public void onReceivedEvent(String str) {
            GiftEntity giftEntity = GiftPlayer.this.giftPlayData != null ? GiftPlayer.this.giftPlayData.getGiftEntity() : null;
            try {
                JSONObject jSONObject = new JSONObject(str);
                final int iOptInt = jSONObject.optInt("ec", 0);
                final String strOptString = jSONObject.optString("em", "");
                if (iOptInt == GiftPlayerEvent.EventType.Downgrade.getValue()) {
                    GiftLogUploader.getInstance().addEvent(GiftLogEvent.createEvent(giftEntity, "3", 0, strOptString));
                }
                if (GiftPlayer.this.eventListener != null) {
                    GiftPlayer.this.handler.post(new Runnable() { // from class: com.momo.xeengine.gift.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            GiftPlayer.C41901.m20252d(this.f14604a, iOptInt, strOptString);
                        }
                    });
                }
            } catch (JSONException unused) {
            }
        }

        @Override // com.momo.xeengine.gift.GameDelegate
        public String onVideoProgress(String str) {
            final GiftProgress giftProgressFromJson = GiftProgress.fromJson(str);
            GiftPlayer.this.handler.post(new Runnable() { // from class: com.momo.xeengine.gift.l
                @Override // java.lang.Runnable
                public final void run() {
                    GiftPlayer.C41901.m20253e(this.f14615a, giftProgressFromJson);
                }
            });
            return null;
        }

        @Override // com.momo.xeengine.gift.GameDelegate
        public String onVideoStart(String str) {
            GiftPlayer.this.handler.post(new Runnable() { // from class: com.momo.xeengine.gift.j
                @Override // java.lang.Runnable
                public final void run() {
                    GiftPlayer.C41901.m20257i(this.f14612a);
                }
            });
            return null;
        }

        @Override // com.momo.xeengine.gift.GameDelegate
        public String onVideoStop(String str) {
            GiftPlayer.this.handler.post(new Runnable() { // from class: com.momo.xeengine.gift.i
                @Override // java.lang.Runnable
                public final void run() {
                    GiftPlayer.C41901.m20250b(this.f14611a);
                }
            });
            return null;
        }

        @Override // com.momo.xeengine.gift.GameDelegate
        public String setValidTouchAreas(final String str) {
            GiftPlayer.this.handler.post(new Runnable() { // from class: com.momo.xeengine.gift.e
                @Override // java.lang.Runnable
                public final void run() {
                    GiftPlayer.C41901.m20255g(this.f14602a, str);
                }
            });
            return null;
        }
    }

    /* JADX INFO: renamed from: com.momo.xeengine.gift.GiftPlayer$2 */
    public class C41912 implements XEGameViewCallback {
        public C41912() {
        }

        @Override // com.momo.xeengine.game.XEGameViewCallback
        public void onEngineDynamicLinkLibraryDownloadProcess(int i, double d) {
        }

        @Override // com.momo.xeengine.game.XEGameViewCallback
        public void onRenderSizeChanged(int i, int i2) {
        }

        @Override // com.momo.xeengine.game.XEGameViewCallback
        public void onRenderViewCreate(View view) {
        }

        @Override // com.momo.xeengine.game.XEGameViewCallback
        public void onStart(IXEngine iXEngine) {
            Handler handler = GiftPlayer.this.handler;
            final GiftPlayer giftPlayer = GiftPlayer.this;
            handler.post(new Runnable() { // from class: com.momo.xeengine.gift.o
                @Override // java.lang.Runnable
                public final void run() {
                    giftPlayer.cancelTimeoutRunnable();
                }
            });
            GiftPlayData giftPlayData = GiftPlayer.this.giftPlayData;
            if (giftPlayData != null) {
                GiftPlayer.this.engine = iXEngine;
                iXEngine.getLogger().setLogEnable(GiftPlayer.this.logEnable);
                iXEngine.getScriptEngine().getScriptBridge().add(GiftPlayer.this.gameDelegate, GameDelegate.BRIDGE_NAME);
                iXEngine.addLibraryPath(GiftUtils.getCacheDir());
                iXEngine.addLibraryPath(giftPlayData.getGiftEntity().getPath());
                if (GiftPlayerType.Software == GiftPlayer.this.playerType || GiftPlayerType.Auto == GiftPlayer.this.playerType) {
                    SOLoader.load();
                    iXEngine.getScriptEngine().executeScriptString(String.format("_G_UIManager:SetVideoPlayerType('%s')", GiftPlayer.this.playerType.getValue()));
                }
                GiftType type = giftPlayData.getType();
                if (type == GiftType.ENGINE) {
                    iXEngine.getScriptEngine().executeScriptFile("app");
                } else if (type == GiftType.VIDEO) {
                    String str = GiftPlayer.this.hotfixPatch;
                    if (TextUtils.isEmpty(str)) {
                        GiftPlayer.this.nativeExecuteInternalVideoPlayerScript(((XELuaEngine) iXEngine.getScriptEngine()).getNative());
                    } else {
                        iXEngine.getScriptEngine().executeScriptString(str);
                    }
                }
                if (GiftPlayer.this.listener != null) {
                    GiftPlayer.this.listener.onGiftPrepared(GiftPlayer.this, giftPlayData.getGiftEntity());
                }
            }
        }

        @Override // com.momo.xeengine.game.XEGameViewCallback
        public void onStartFailed(String str) {
            Handler handler = GiftPlayer.this.handler;
            final GiftPlayer giftPlayer = GiftPlayer.this;
            handler.post(new Runnable() { // from class: com.momo.xeengine.gift.n
                @Override // java.lang.Runnable
                public final void run() {
                    giftPlayer.cancelTimeoutRunnable();
                }
            });
            GiftPlayer.this.callDelegatePlayFailed(107, str);
        }
    }

    public class ParseCompletion implements SVGAParser.ParseCompletion {
        private final SVGAGiftDescriptor svgaGiftDescriptor;

        public ParseCompletion(SVGAGiftDescriptor sVGAGiftDescriptor) {
            this.svgaGiftDescriptor = sVGAGiftDescriptor;
        }

        private SVGADynamicEntity getSvgaDynamicEntity(SVGAGiftDescriptor sVGAGiftDescriptor) {
            Bitmap bitmapLoadBitmapFromFile;
            SVGADynamicEntity sVGADynamicEntity = new SVGADynamicEntity();
            List<SVGAGiftDescriptor.Item> itemsList = sVGAGiftDescriptor.getSvgaInfo().getItemsList();
            if (itemsList != null) {
                for (SVGAGiftDescriptor.Item item : itemsList) {
                    String key = item.getKey();
                    String str = (String) GiftPlayer.this.params.get(key);
                    if (item.getType() == 1) {
                        TextPaint textPaint = new TextPaint();
                        textPaint.setColor(item.getTextColor());
                        textPaint.setTextSize(item.getTextSize());
                        if (str == null) {
                            str = "";
                        }
                        sVGADynamicEntity.setDynamicText(key, new BoringLayoutBean(str, textPaint, Layout.Alignment.ALIGN_CENTER, TextUtils.TruncateAt.END));
                    } else if (item.getType() == 2 && (bitmapLoadBitmapFromFile = GiftUtils.loadBitmapFromFile(str)) != null) {
                        if (item.isCircle()) {
                            sVGADynamicEntity.setDynamicCircleImage(key, bitmapLoadBitmapFromFile);
                        } else {
                            sVGADynamicEntity.setDynamicImage(key, bitmapLoadBitmapFromFile);
                        }
                    }
                }
            }
            return sVGADynamicEntity;
        }

        private SizeF getVideoSize(SVGAVideoEntity sVGAVideoEntity) {
            return new SizeF((float) sVGAVideoEntity.getVideoSize().getWidth(), (float) sVGAVideoEntity.getVideoSize().getHeight());
        }

        @Override // com.momo.xeengine.svgaplayer.SVGAParser.ParseCompletion
        public void onComplete(@NotNull SVGAVideoEntity sVGAVideoEntity) {
            SVGAImageView sVGAView = GiftPlayer.this.giftView.getSVGAView();
            sVGAView.setCallback(GiftPlayer.this.svgaCallback);
            SizeF videoSize = getVideoSize(sVGAVideoEntity);
            SVGAScaleType scaleType = this.svgaGiftDescriptor.getSvgaInfo().getScaleType();
            GiftPlayer.this.giftView.setupSVGAViewLayout(videoSize, this.svgaGiftDescriptor.getSvgaInfo().getPositionType(), scaleType);
            sVGAView.setImageDrawable(new SVGADrawable(sVGAVideoEntity, getSvgaDynamicEntity(this.svgaGiftDescriptor)));
            sVGAView.setLoops(this.svgaGiftDescriptor.getLoops());
            sVGAView.startAnimation();
            this.svgaGiftDescriptor.getVideo();
        }

        @Override // com.momo.xeengine.svgaplayer.SVGAParser.ParseCompletion
        public void onError(@NotNull String str) {
            GiftPlayer.this.callDelegatePlayFailed(109, "SVGA parse failed: " + str);
        }
    }

    public GiftPlayer(GiftView giftView) {
        this.isVirtualView = false;
        this.giftView = giftView;
        this.isVirtualView = false;
        this.svgaParser = new SVGAParser(giftView);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m20245a(GiftPlayer giftPlayer, Set set, Map map, boolean z, GiftPlayData giftPlayData, boolean z2) {
        if (!giftPlayer.enablePlayWhenDownloadFailed && !z2) {
            giftPlayer.callDelegatePlayFailed(103, XEGiftErrorCode.ERROR_MSG_DOWNLOAD_FAILED);
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            for (String str2 : map.keySet()) {
                if (str.equals(map.get(str2))) {
                    String resourceNameWithURL = GiftUtils.getResourceNameWithURL(str);
                    if (GiftUtils.fileExitsAtCacheDir(resourceNameWithURL)) {
                        giftPlayer.params.put(str2, resourceNameWithURL);
                    }
                }
            }
        }
        if (z) {
            giftPlayer.playIMPL(giftPlayData);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m20246b(GiftPlayer giftPlayer, GiftPlayerListener giftPlayerListener, GiftPlayData giftPlayData, int i, String str) {
        giftPlayer.getClass();
        giftPlayerListener.onGiftPlayFailed(giftPlayer, giftPlayData.getGiftEntity(), i, str);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m20247c(String str, JSONObject jSONObject, String str2, ScriptBridge scriptBridge, boolean z) {
        if (z) {
            try {
                jSONObject.put(str2, GiftUtils.getResourceNameWithURL(str));
                callGameContext(jSONObject, scriptBridge);
            } catch (JSONException unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callDelegatePlayFailed(final int i, final String str) {
        final GiftPlayData giftPlayData = this.giftPlayData;
        this.giftPlayData = null;
        if (giftPlayData == null) {
            return;
        }
        if (i != 110) {
            GiftLogUploader.getInstance().addEvent(GiftLogEvent.createPlayFailedEvent(giftPlayData.getGiftEntity(), i, str));
        } else {
            GiftLogUploader.getInstance().addEvent(GiftLogEvent.createEvent(giftPlayData.getGiftEntity(), "4", 0, "timeout"));
        }
        final GiftPlayerListener giftPlayerListener = this.listener;
        if (giftPlayerListener != null) {
            this.handler.post(new Runnable() { // from class: com.momo.xeengine.gift.c
                @Override // java.lang.Runnable
                public final void run() {
                    GiftPlayer.m20246b(this.f14592a, giftPlayerListener, giftPlayData, i, str);
                }
            });
        }
    }

    private static void callGameContext(JSONObject jSONObject, ScriptBridge scriptBridge) {
        String string = jSONObject.toString();
        if (TextUtils.isEmpty(string)) {
            return;
        }
        scriptBridge.call("GameContext", "updateExtendValue", string);
    }

    private void callPlayCanceled() {
        GiftPlayData giftPlayData = this.giftPlayData;
        this.giftPlayData = null;
        GiftPlayerListener giftPlayerListener = this.listener;
        if (giftPlayerListener == null || giftPlayData == null) {
            return;
        }
        giftPlayerListener.onGiftPlayCanceled(this, giftPlayData.getGiftEntity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callPlayFinished(String str) {
        GiftPlayData giftPlayData = this.giftPlayData;
        this.giftPlayData = null;
        if (giftPlayData == null) {
            return;
        }
        GiftLogUploader.getInstance().addEvent(GiftLogEvent.createPlaySuccessEvent(giftPlayData.getGiftEntity(), str));
        GiftPlayerListener giftPlayerListener = this.listener;
        if (giftPlayerListener != null) {
            giftPlayerListener.onGiftPlayFinished(this, giftPlayData.getGiftEntity(), str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cancelTimeoutRunnable() {
        Runnable runnable = this.startTimeoutRunnable;
        if (runnable != null) {
            this.handler.removeCallbacks(runnable);
            this.startTimeoutRunnable = null;
        }
    }

    private void checkExtendResource(final Map<String, String> map, final GiftPlayData giftPlayData, final boolean z) {
        final HashSet hashSet = new HashSet();
        for (String str : map.keySet()) {
            String str2 = map.get(str);
            if (!TextUtils.isEmpty(str2)) {
                if (str2.startsWith("http")) {
                    if (new File(GiftUtils.getResourcePathWithURL(str2)).exists()) {
                        if (this.logEnable) {
                            String.format("检查到需要下载的资源[%s]:%s ", str, str2);
                        }
                        this.params.put(str, GiftUtils.getResourceNameWithURL(str2));
                    } else {
                        hashSet.add(str2);
                    }
                    this.params.put(str + "_origin_url", str2);
                } else {
                    this.params.put(str, map.get(str));
                }
            }
        }
        if (!hashSet.isEmpty()) {
            this.resourceChecker.downloadResources(new ArrayList(hashSet), new ResourceChecker.ResourceDownloadCompletion() { // from class: com.momo.xeengine.gift.d
                @Override // com.momo.xeengine.gift.ResourceChecker.ResourceDownloadCompletion
                public final void onComplete(boolean z2) {
                    GiftPlayer.m20245a(this.f14597a, hashSet, map, z, giftPlayData, z2);
                }
            });
        } else if (z) {
            playIMPL(giftPlayData);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeExecuteInternalVideoPlayerScript(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public void onEngineStartTimeout() {
        cancelTimeoutRunnable();
        if (this.isVirtualView) {
            XEVirtualGiftView xEVirtualGiftView = this.virtualGiftView;
            if (xEVirtualGiftView != null) {
                xEVirtualGiftView.stop();
            }
        } else {
            GiftView giftView = this.giftView;
            if (giftView != null) {
                giftView.stop();
            }
        }
        callDelegatePlayFailed(110, "引擎启动超时");
    }

    private void playEngineGift() {
        if (this.logEnable) {
            this.giftPlayData.toString();
        }
        Runnable runnable = new Runnable() { // from class: l.buj
            @Override // java.lang.Runnable
            public final void run() {
                this.f77327a.onEngineStartTimeout();
            }
        };
        this.startTimeoutRunnable = runnable;
        this.handler.postDelayed(runnable, (long) (this.timeout * 1000.0f));
        if (this.isVirtualView) {
            this.virtualGiftView.setCallback(this.gameViewCallback);
            this.virtualGiftView.start();
        } else {
            this.giftView.setCallback(this.gameViewCallback);
            this.giftView.start();
        }
    }

    private void playIMPL(GiftPlayData giftPlayData) {
        GiftPlayData giftPlayData2 = this.giftPlayData;
        if (giftPlayData2 != null && giftPlayData2 == giftPlayData) {
            if (giftPlayData2.getType() == GiftType.ENGINE || giftPlayData2.getType() == GiftType.VIDEO) {
                playEngineGift();
                return;
            }
            if (giftPlayData2.getType() != GiftType.SVGA) {
                callDelegatePlayFailed(112, XEGiftErrorCode.ERROR_MSG_INVALID_GIFT_TYPE);
            } else if (this.isVirtualView) {
                callDelegatePlayFailed(113, XEGiftErrorCode.ERROR_MSG_VIRTUAL_VIEW_SVGA_ERROR);
            } else {
                playSVGAGift(giftPlayData2.getSvgaGiftData());
            }
        }
    }

    private void playSVGAGift(SVGAGiftDescriptor sVGAGiftDescriptor) {
        this.svgaParser.parseFile(sVGAGiftDescriptor.getSvgaInfo().getSvgaPath(), new ParseCompletion(sVGAGiftDescriptor));
    }

    public GiftPlayerType getPlayerType() {
        return this.playerType;
    }

    public boolean isEnablePlayWhenDownloadFailed() {
        return this.enablePlayWhenDownloadFailed;
    }

    public boolean isPlaying() {
        return this.giftPlayData != null;
    }

    @Override // com.momo.xeengine.gift.IGiftPlayer
    public void play(@NotNull GiftEntity giftEntity) {
        if (giftEntity != null && this.giftPlayData == null) {
            this.giftPlayData = new GiftPlayData(giftEntity);
            this.params.clear();
            Map<String, String> extendValues = giftEntity.getExtendValues();
            if (extendValues == null) {
                playIMPL(this.giftPlayData);
                return;
            }
            boolean zIsSyncDownloadResource = giftEntity.isSyncDownloadResource();
            checkExtendResource(extendValues, this.giftPlayData, zIsSyncDownloadResource);
            if (zIsSyncDownloadResource) {
                return;
            }
            playIMPL(this.giftPlayData);
        }
    }

    public void setEnablePlayWhenDownloadFailed(boolean z) {
        this.enablePlayWhenDownloadFailed = z;
    }

    public void setEngineStartTimeout(float f) {
        this.timeout = f;
    }

    public void setEventListener(GiftPlayerEventListener giftPlayerEventListener) {
        this.eventListener = giftPlayerEventListener;
    }

    public void setHotfixPatch(String str) {
        this.hotfixPatch = str;
    }

    public void setListener(GiftPlayerListener giftPlayerListener) {
        this.listener = giftPlayerListener;
    }

    public void setLogEnable(boolean z) {
        this.logEnable = z;
    }

    public void setMute(boolean z) {
        this.mute = z;
    }

    public void setPlayerType(String str) {
        this.playerType = GiftPlayerType.fromString(str);
    }

    public void setProgressListener(VideoGiftProgressListener videoGiftProgressListener) {
        this.progressListener = videoGiftProgressListener;
    }

    public void setVolume(float f) {
        this.volume = f;
    }

    @Override // com.momo.xeengine.gift.IGiftPlayer
    public void stop() {
        cancelTimeoutRunnable();
        if (this.isVirtualView) {
            XEVirtualGiftView xEVirtualGiftView = this.virtualGiftView;
            if (xEVirtualGiftView != null) {
                xEVirtualGiftView.stop();
            }
        } else {
            GiftView giftView = this.giftView;
            if (giftView != null) {
                giftView.stop();
            }
        }
        callPlayCanceled();
        this.giftPlayData = null;
    }

    public void updateExtendValue(final String str, final String str2) {
        final ScriptBridge scriptBridge;
        final JSONObject jSONObject = new JSONObject();
        IXEngine iXEngine = this.engine;
        if (iXEngine == null || (scriptBridge = iXEngine.getScriptBridge()) == null) {
            return;
        }
        if (!str2.startsWith("http")) {
            try {
                jSONObject.put(str, str2);
                callGameContext(jSONObject, scriptBridge);
                return;
            } catch (JSONException e) {
                aag0.m95543a(e);
                return;
            }
        }
        if (new File(GiftUtils.getResourcePathWithURL(str2)).exists()) {
            try {
                jSONObject.put(str, GiftUtils.getResourceNameWithURL(str2));
            } catch (JSONException unused) {
            }
            callGameContext(jSONObject, scriptBridge);
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str2);
            this.resourceChecker.downloadResources(arrayList, new ResourceChecker.ResourceDownloadCompletion() { // from class: l.auj
                @Override // com.momo.xeengine.gift.ResourceChecker.ResourceDownloadCompletion
                public final void onComplete(boolean z) {
                    GiftPlayer.m20247c(str2, jSONObject, str, scriptBridge, z);
                }
            });
        }
    }

    public void updateExtendValues(@NotNull String str, @NotNull List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            String str2 = list.get(i);
            if (!TextUtils.isEmpty(str2)) {
                updateExtendValue(str + "_" + i, str2);
            }
        }
    }

    @Override // com.momo.xeengine.gift.IGiftPlayer
    public void setPlayerType(GiftPlayerType giftPlayerType) {
        this.playerType = giftPlayerType;
    }

    public GiftPlayer(XEVirtualGiftView xEVirtualGiftView) {
        this.isVirtualView = false;
        this.virtualGiftView = xEVirtualGiftView;
        this.isVirtualView = true;
    }
}
