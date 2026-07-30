package com.tencent.trtc;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.text.TextUtils;
import android.view.SurfaceHolder;
import com.heytap.mcssdk.mode.CommandMessage;
import com.tencent.liteav.TXCRenderAndDec;
import com.tencent.liteav.TXLiteAVCode;
import com.tencent.liteav.audio.C13980a;
import com.tencent.liteav.audio.TXCAudioEngine;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.module.Monitor;
import com.tencent.liteav.basic.module.TXCEventRecorderProxy;
import com.tencent.liteav.basic.p086a.EnumC14004b;
import com.tencent.liteav.basic.p088c.InterfaceC14022o;
import com.tencent.liteav.basic.util.C14052f;
import com.tencent.liteav.basic.util.HandlerC14051e;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import com.tencent.liteav.beauty.TXBeautyManager;
import com.tencent.liteav.renderer.TextureViewSurfaceTextureListenerC14185e;
import com.tencent.liteav.trtc.impl.TRTCCloudImpl;
import com.tencent.liteav.trtc.impl.TRTCRoomInfo;
import com.tencent.rtmp.p109ui.TXCloudVideoView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class TRTCSubCloud extends TRTCCloudImpl {
    private static final String TAG = "com.tencent.trtc.TRTCSubCloud";
    protected WeakReference<TRTCCloudImpl> mMainCloud;
    private RunnableC14434a mVolumeLevelCalTask;

    /* JADX INFO: renamed from: com.tencent.trtc.TRTCSubCloud$5 */
    public class RunnableC144305 implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f60477a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f60478b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ TRTCCloudListener.TRTCSnapshotListener f60479c;

        public RunnableC144305(String str, int i, TRTCCloudListener.TRTCSnapshotListener tRTCSnapshotListener) {
            this.f60477a = str;
            this.f60478b = i;
            this.f60479c = tRTCSnapshotListener;
        }

        /* JADX WARN: Code duplicated, block: B:18:0x0065  */
        @Override // java.lang.Runnable
        public void run() {
            TRTCRoomInfo.RenderInfo renderInfo;
            TextureViewSurfaceTextureListenerC14185e videoRender;
            TRTCRoomInfo.RenderInfo renderInfo2;
            if (this.f60477a != null) {
                TRTCRoomInfo.UserInfo user = ((TRTCCloudImpl) TRTCSubCloud.this).mRoomInfo.getUser(this.f60477a);
                if (this.f60478b == 2) {
                    if (user == null || (renderInfo2 = user.mainRender) == null || renderInfo2.render == null) {
                        videoRender = null;
                    } else {
                        TRTCSubCloud.this.apiLog("snapshotRemoteSubStreamView->userId: " + this.f60477a);
                        videoRender = user.subRender.render.getVideoRender();
                    }
                } else if (user == null || (renderInfo = user.mainRender) == null || renderInfo.render == null) {
                    videoRender = null;
                } else {
                    TRTCSubCloud.this.apiLog("snapshotRemoteView->userId: " + this.f60477a);
                    videoRender = user.mainRender.render.getVideoRender();
                }
                if (videoRender != null) {
                    videoRender.m83918a(new InterfaceC14022o() { // from class: com.tencent.trtc.TRTCSubCloud.5.1
                        @Override // com.tencent.liteav.basic.p088c.InterfaceC14022o
                        public void onTakePhotoComplete(final Bitmap bitmap) {
                            TRTCSubCloud.this.runOnListenerThread(new Runnable() { // from class: com.tencent.trtc.TRTCSubCloud.5.1.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    TRTCCloudListener.TRTCSnapshotListener tRTCSnapshotListener = RunnableC144305.this.f60479c;
                                    if (tRTCSnapshotListener != null) {
                                        tRTCSnapshotListener.onSnapshotComplete(bitmap);
                                    }
                                }
                            });
                        }
                    });
                } else {
                    TRTCSubCloud.this.runOnListenerThread(new Runnable() { // from class: com.tencent.trtc.TRTCSubCloud.5.2
                        @Override // java.lang.Runnable
                        public void run() {
                            TRTCCloudListener.TRTCSnapshotListener tRTCSnapshotListener = RunnableC144305.this.f60479c;
                            if (tRTCSnapshotListener != null) {
                                tRTCSnapshotListener.onSnapshotComplete(null);
                            }
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.trtc.TRTCSubCloud$a */
    public static class RunnableC14434a implements Runnable {

        /* JADX INFO: renamed from: a */
        private WeakReference<TRTCSubCloud> f60493a;

        public RunnableC14434a(TRTCSubCloud tRTCSubCloud) {
            this.f60493a = new WeakReference<>(tRTCSubCloud);
        }

        @Override // java.lang.Runnable
        public void run() {
            WeakReference<TRTCSubCloud> weakReference = this.f60493a;
            TRTCSubCloud tRTCSubCloud = weakReference != null ? weakReference.get() : null;
            if (tRTCSubCloud != null) {
                final ArrayList arrayList = new ArrayList();
                ((TRTCCloudImpl) tRTCSubCloud).mRoomInfo.forEachUser(new TRTCRoomInfo.UserAction() { // from class: com.tencent.trtc.TRTCSubCloud.a.1
                    @Override // com.tencent.liteav.trtc.impl.TRTCRoomInfo.UserAction
                    public void accept(String str, TRTCRoomInfo.UserInfo userInfo) {
                        int remotePlayoutVolumeLevel = TXCAudioEngine.getInstance().getRemotePlayoutVolumeLevel(String.valueOf(userInfo.tinyID));
                        if (remotePlayoutVolumeLevel > 0) {
                            TRTCCloudDef.TRTCVolumeInfo tRTCVolumeInfo = new TRTCCloudDef.TRTCVolumeInfo();
                            tRTCVolumeInfo.userId = userInfo.userID;
                            tRTCVolumeInfo.volume = remotePlayoutVolumeLevel;
                            arrayList.add(tRTCVolumeInfo);
                        }
                    }
                });
                final TRTCCloudListener tRTCCloudListener = ((TRTCCloudImpl) tRTCSubCloud).mTRTCListener;
                tRTCSubCloud.runOnListenerThread(new Runnable() { // from class: com.tencent.trtc.TRTCSubCloud.a.2
                    @Override // java.lang.Runnable
                    public void run() {
                        TRTCCloudListener tRTCCloudListener2 = tRTCCloudListener;
                        if (tRTCCloudListener2 != null) {
                            tRTCCloudListener2.onUserVoiceVolume(arrayList, 0);
                        }
                    }
                });
                if (((TRTCCloudImpl) tRTCSubCloud).mAudioVolumeEvalInterval > 0) {
                    ((TRTCCloudImpl) tRTCSubCloud).mSDKHandler.postDelayed(tRTCSubCloud.mVolumeLevelCalTask, ((TRTCCloudImpl) tRTCSubCloud).mAudioVolumeEvalInterval);
                }
            }
        }
    }

    public TRTCSubCloud(Context context, WeakReference<TRTCCloudImpl> weakReference, HandlerC14051e handlerC14051e) {
        super(context, handlerC14051e);
        this.mMainCloud = null;
        this.mVolumeLevelCalTask = null;
        TRTCRoomInfo tRTCRoomInfo = this.mRoomInfo;
        tRTCRoomInfo.muteLocalAudio = true;
        tRTCRoomInfo.muteLocalVideo = true;
        this.mMainCloud = weakReference;
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void ConnectOtherRoom(String str) {
        super.ConnectOtherRoom(str);
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void DisconnectOtherRoom() {
        super.DisconnectOtherRoom();
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void callExperimentalAPI(final String str) {
        final JSONObject jSONObject;
        final String string = "";
        if (str != null) {
            StringBuilder sb = new StringBuilder("callExperimentalAPI  ");
            sb.append(str);
            sb.append(", roomid = ");
            TRTCRoomInfo tRTCRoomInfo = this.mRoomInfo;
            long j = tRTCRoomInfo.roomId;
            sb.append(j != -1 ? Long.valueOf(j) : tRTCRoomInfo.strRoomId);
            apiLog(sb.toString());
            Monitor.m82978a(1, String.format("callExperimentalAPI:%s", str) + " self:" + hashCode(), "", 0);
        }
        try {
            JSONObject jSONObject2 = new JSONObject(str);
            if (!jSONObject2.has("api")) {
                apiLog("callExperimentalAPI[lack api or illegal type]: " + str);
                return;
            }
            string = jSONObject2.getString("api");
            if (jSONObject2.has(CommandMessage.PARAMS)) {
                jSONObject = jSONObject2.getJSONObject(CommandMessage.PARAMS);
                if (string.equals("setEncodedDataProcessingListener")) {
                    setEncodedDataProcessingListener(jSONObject);
                } else {
                    runOnSDKThread(new Runnable() { // from class: com.tencent.trtc.TRTCSubCloud.8
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                if (string.equals("setSEIPayloadType")) {
                                    TRTCSubCloud.this.setSEIPayloadType(jSONObject);
                                    return;
                                }
                                if (!string.equals("setLocalAudioMuteMode") && !string.equals("setVideoEncodeParamEx") && !string.equals("setAudioSampleRate")) {
                                    if (string.equals("muteRemoteAudioInSpeaker")) {
                                        TRTCSubCloud.this.muteRemoteAudioInSpeaker(jSONObject);
                                        return;
                                    }
                                    if (!string.equals("enableAudioAGC") && !string.equals("enableAudioAEC") && !string.equals("enableAudioANS")) {
                                        if (string.equals("setPerformanceMode")) {
                                            TRTCSubCloud.this.setPerformanceMode(jSONObject);
                                            return;
                                        }
                                        if (string.equals("setCustomRenderMode") || string.equals("setMediaCodecConfig")) {
                                            return;
                                        }
                                        if (string.equals("sendJsonCMD")) {
                                            TRTCSubCloud.this.sendJsonCmd(jSONObject, str);
                                            return;
                                        }
                                        boolean zEquals = string.equals("updatePrivateMapKey");
                                        TRTCSubCloud tRTCSubCloud = TRTCSubCloud.this;
                                        if (zEquals) {
                                            tRTCSubCloud.updatePrivateMapKey(jSONObject);
                                            return;
                                        }
                                        tRTCSubCloud.apiLog("callExperimentalAPI[illegal api]: " + string);
                                    }
                                }
                            } catch (Exception unused) {
                                TRTCSubCloud.this.apiLog("callExperimentalAPI[failed]: " + str);
                            }
                        }
                    });
                }
            }
        } catch (Exception unused) {
            apiLog("callExperimentalAPI[failed]: " + str);
            jSONObject = null;
        }
    }

    public void collectCustomCaptureFps() {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public TRTCCloud createSubCloud() {
        return null;
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.iliveroom.IOneSecAdapter
    public void destroy() {
        runOnSDKThread(new Runnable() { // from class: com.tencent.trtc.TRTCSubCloud.1
            @Override // java.lang.Runnable
            public void run() {
                synchronized (((TRTCCloudImpl) TRTCSubCloud.this).mNativeLock) {
                    try {
                        if (((TRTCCloudImpl) TRTCSubCloud.this).mNativeRtcContext != 0) {
                            TRTCSubCloud.this.apiLog("destroy context");
                            TRTCSubCloud tRTCSubCloud = TRTCSubCloud.this;
                            tRTCSubCloud.nativeDestroyContext(((TRTCCloudImpl) tRTCSubCloud).mNativeRtcContext);
                        }
                        ((TRTCCloudImpl) TRTCSubCloud.this).mNativeRtcContext = 0L;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                ((TRTCCloudImpl) TRTCSubCloud.this).mTRTCListener = null;
                ((TRTCCloudImpl) TRTCSubCloud.this).mAudioFrameListener = null;
                ((TRTCCloudImpl) TRTCSubCloud.this).mCurrentPublishClouds.clear();
                ((TRTCCloudImpl) TRTCSubCloud.this).mSubClouds.clear();
                C13980a.m82665a().m82666a(TRTCSubCloud.this.hashCode());
            }
        });
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void enableAudioEarMonitoring(boolean z) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void enableAudioVolumeEvaluation(int i) {
        super.enableAudioVolumeEvaluation(i);
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void enableCustomAudioCapture(boolean z) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void enableCustomVideoCapture(boolean z) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public int enableEncSmallVideoStream(boolean z, TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam) {
        return -1;
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public boolean enableTorch(boolean z) {
        return false;
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void enterRoom(TRTCCloudDef.TRTCParams tRTCParams, final int i) {
        if (tRTCParams == null) {
            apiLog("enter room, param nil!");
            onEnterRoom(TXLiteAVCode.ERR_ENTER_ROOM_PARAM_NULL, "enter room param null");
            return;
        }
        final TRTCCloudDef.TRTCParams tRTCParams2 = new TRTCCloudDef.TRTCParams(tRTCParams);
        if (tRTCParams2.sdkAppId == 0 || TextUtils.isEmpty(tRTCParams2.userId) || TextUtils.isEmpty(tRTCParams2.userSig)) {
            apiLog("enterRoom param invalid:" + tRTCParams2);
            if (tRTCParams2.sdkAppId == 0) {
                onEnterRoom(TXLiteAVCode.ERR_SDK_APPID_INVALID, "enter room sdkAppId invalid.");
            }
            if (TextUtils.isEmpty(tRTCParams2.userSig)) {
                onEnterRoom(TXLiteAVCode.ERR_USER_SIG_INVALID, "enter room userSig invalid.");
            }
            if (TextUtils.isEmpty(tRTCParams2.userId)) {
                onEnterRoom(TXLiteAVCode.ERR_USER_ID_INVALID, "enter room userId invalid.");
                return;
            }
            return;
        }
        int i2 = tRTCParams2.roomId;
        final long j = 4294967295L & ((long) i2);
        if (j == 0) {
            apiLog("enter room, room id " + j + " error");
            onEnterRoom(TXLiteAVCode.ERR_ROOM_ID_INVALID, "room id invalid.");
            return;
        }
        String string = tRTCParams2.businessInfo;
        String str = "";
        if (i2 == -1 && !TextUtils.isEmpty(string)) {
            try {
                JSONObject jSONObject = new JSONObject(tRTCParams2.businessInfo);
                String strOptString = jSONObject.optString("strGroupId");
                jSONObject.remove("strGroupId");
                jSONObject.remove("Role");
                str = strOptString;
                string = jSONObject.length() != 0 ? jSONObject.toString() : "";
            } catch (Exception unused) {
                apiLog("enter room, room id error, busInfo " + tRTCParams2.businessInfo);
                string = "";
            }
            if (TextUtils.isEmpty(str)) {
                onEnterRoom(TXLiteAVCode.ERR_ROOM_ID_INVALID, "room id invalid.");
                return;
            }
        }
        final String str2 = string;
        final String str3 = str;
        final int i3 = tRTCParams2.role;
        final long jCurrentTimeMillis = System.currentTimeMillis();
        runOnSDKThread(new Runnable() { // from class: com.tencent.trtc.TRTCSubCloud.2
            @Override // java.lang.Runnable
            public void run() {
                if (((TRTCCloudImpl) TRTCSubCloud.this).mRoomState != 0) {
                    if (TextUtils.isEmpty(str3) || !str3.equalsIgnoreCase(((TRTCCloudImpl) TRTCSubCloud.this).mRoomInfo.strRoomId)) {
                        long j2 = ((TRTCCloudImpl) TRTCSubCloud.this).mRoomInfo.roomId;
                        long j3 = j;
                        if (j2 != j3) {
                            TRTCSubCloud.this.apiLog(String.format("enter another room[%d] when in room[%d], exit the old room!!!", Long.valueOf(j3), Long.valueOf(((TRTCCloudImpl) TRTCSubCloud.this).mRoomInfo.roomId)));
                            ((TRTCCloudImpl) TRTCSubCloud.this).mIsExitOldRoom = true;
                            TRTCSubCloud.this.exitRoom();
                        }
                    }
                    TRTCSubCloud.this.apiLog(String.format("enter the same room[%d] again, ignore!!!", Long.valueOf(j)));
                    return;
                }
                TRTCSubCloud.this.apiLog("========================================================================================================");
                TRTCSubCloud.this.apiLog("========================================================================================================");
                TRTCSubCloud.this.apiLog(String.format("============= SDK Version:%s Device Name:%s System Version:%s =============", TXCCommonUtil.getSDKVersionStr(), C14052f.m83049c(), C14052f.m83051d()));
                TRTCSubCloud.this.apiLog("========================================================================================================");
                TRTCSubCloud.this.apiLog("========================================================================================================");
                TRTCSubCloud tRTCSubCloud = TRTCSubCloud.this;
                Long lValueOf = Long.valueOf(j);
                String str4 = str3;
                TRTCCloudDef.TRTCParams tRTCParams3 = tRTCParams2;
                tRTCSubCloud.apiLog(String.format("enterRoom roomId:%d(%s)  userId:%s sdkAppId:%d scene:%d", lValueOf, str4, tRTCParams3.userId, Integer.valueOf(tRTCParams3.sdkAppId), Integer.valueOf(i)));
                StringBuilder sb = new StringBuilder("enterRoom self:");
                sb.append(TRTCSubCloud.this.hashCode());
                sb.append(", roomId:");
                int i4 = tRTCParams2.roomId;
                sb.append(i4 == -1 ? str3 : Integer.valueOf(i4));
                String string2 = sb.toString();
                int i5 = i;
                String str5 = "VideoCall";
                if (i5 != 0) {
                    if (i5 != 1) {
                        if (i5 == 2) {
                            str5 = "AudioCall";
                        } else if (i5 != 3) {
                            TXCLog.m82973w(TRTCSubCloud.TAG, "enter room scene:%u error! default to VideoCall! " + i + " self:" + TRTCSubCloud.this.hashCode());
                        } else {
                            str5 = "VoiceChatRoom";
                            i5 = 1;
                        }
                        i5 = 0;
                    } else {
                        str5 = "Live";
                    }
                }
                Monitor.m82978a(1, string2, String.format("bussInfo:%s, appScene:%s, role:%s, streamid:%s", str2, str5, i3 == 20 ? "Anchor" : "Audience", tRTCParams2.streamId), 0);
                TXCEventRecorderProxy.m82980a("18446744073709551615", 5001, j, -1L, "", 0);
                ((TRTCCloudImpl) TRTCSubCloud.this).mRoomState = 1;
                if (((TRTCCloudImpl) TRTCSubCloud.this).mNativeRtcContext == 0) {
                    int[] sDKVersion = TXCCommonUtil.getSDKVersion();
                    int i6 = sDKVersion.length >= 1 ? sDKVersion[0] : 0;
                    int i7 = sDKVersion.length >= 2 ? sDKVersion[1] : 0;
                    int i8 = sDKVersion.length >= 3 ? sDKVersion[2] : 0;
                    TRTCSubCloud tRTCSubCloud2 = TRTCSubCloud.this;
                    ((TRTCCloudImpl) tRTCSubCloud2).mNativeRtcContext = tRTCSubCloud2.nativeCreateContext(i6, i7, i8);
                }
                TRTCSubCloud.this.updateAppScene(i5);
                TRTCSubCloud tRTCSubCloud3 = TRTCSubCloud.this;
                tRTCSubCloud3.nativeSetPriorRemoteVideoStreamType(((TRTCCloudImpl) tRTCSubCloud3).mNativeRtcContext, ((TRTCCloudImpl) TRTCSubCloud.this).mPriorStreamType);
                byte[] token = ((TRTCCloudImpl) TRTCSubCloud.this).mRoomInfo.getToken(((TRTCCloudImpl) TRTCSubCloud.this).mContext);
                TRTCSubCloud tRTCSubCloud4 = TRTCSubCloud.this;
                long j4 = ((TRTCCloudImpl) tRTCSubCloud4).mNativeRtcContext;
                TRTCCloudDef.TRTCParams tRTCParams4 = tRTCParams2;
                tRTCSubCloud4.nativeInit(j4, tRTCParams4.sdkAppId, tRTCParams4.userId, tRTCParams4.userSig, token);
                TRTCCloudDef.TRTCParams tRTCParams5 = tRTCParams2;
                String str6 = tRTCParams5.privateMapKey;
                String str7 = str6 != null ? str6 : "";
                String str8 = str3;
                String str9 = str8 != null ? str8 : "";
                String str10 = str2;
                String str11 = str10 != null ? str10 : "";
                String str12 = tRTCParams5.userDefineRecordId;
                String str13 = str12 != null ? str12 : "";
                String str14 = tRTCParams5.streamId;
                String str15 = str14 != null ? str14 : "";
                TRTCSubCloud tRTCSubCloud5 = TRTCSubCloud.this;
                tRTCSubCloud5.nativeEnterRoom(((TRTCCloudImpl) tRTCSubCloud5).mNativeRtcContext, j, str11, str7, str9, i3, 255, 0, i, ((TRTCCloudImpl) TRTCSubCloud.this).mPerformanceMode, C14052f.m83049c(), C14052f.m83051d(), ((TRTCCloudImpl) TRTCSubCloud.this).mRecvMode, str13, str15);
                ((TRTCCloudImpl) TRTCSubCloud.this).mCurrentRole = i3;
                ((TRTCCloudImpl) TRTCSubCloud.this).mTargetRole = i3;
                TRTCSubCloud.this.startCollectStatus();
                ((TRTCCloudImpl) TRTCSubCloud.this).mLastStateTimeMs = 0L;
                ((TRTCCloudImpl) TRTCSubCloud.this).mRoomInfo.init(j, tRTCParams2.userId);
                ((TRTCCloudImpl) TRTCSubCloud.this).mRoomInfo.strRoomId = str9;
                ((TRTCCloudImpl) TRTCSubCloud.this).mRoomInfo.sdkAppId = tRTCParams2.sdkAppId;
                ((TRTCCloudImpl) TRTCSubCloud.this).mRoomInfo.userSig = tRTCParams2.userSig;
                ((TRTCCloudImpl) TRTCSubCloud.this).mRoomInfo.privateMapKey = str7;
                ((TRTCCloudImpl) TRTCSubCloud.this).mRoomInfo.enterTime = jCurrentTimeMillis;
            }
        });
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void exitRoom() {
        runOnSDKThread(new Runnable() { // from class: com.tencent.trtc.TRTCSubCloud.3
            @Override // java.lang.Runnable
            public void run() {
                String str = "exitRoom " + ((TRTCCloudImpl) TRTCSubCloud.this).mRoomInfo.getRoomId() + ", " + TRTCSubCloud.this.hashCode();
                TRTCSubCloud.this.apiLog(str);
                Monitor.m82978a(1, str, "", 0);
                TRTCSubCloud.this.exitRoomInternal(true, "call from api");
            }
        });
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl
    public void exitRoomInternal(boolean z, String str) {
        apiLog("exitRoomInternal reqExit: " + z + ", reason: " + str + ", mRoomState: " + this.mRoomState);
        if (this.mRoomState == 0) {
            apiLog("exitRoom ignore when no in room");
            return;
        }
        this.mRoomState = 0;
        stopCollectStatus();
        this.mRoomInfo.forEachUser(new TRTCRoomInfo.UserAction() { // from class: com.tencent.trtc.TRTCSubCloud.4
            @Override // com.tencent.liteav.trtc.impl.TRTCRoomInfo.UserAction
            public void accept(String str2, TRTCRoomInfo.UserInfo userInfo) {
                TRTCSubCloud.this.stopRemoteRender(userInfo);
                C13980a.m82665a().m82667a(String.valueOf(userInfo.tinyID), TRTCSubCloud.this.hashCode());
                TXCRenderAndDec tXCRenderAndDec = userInfo.mainRender.render;
                if (tXCRenderAndDec != null) {
                    tXCRenderAndDec.setVideoFrameListener(null, EnumC14004b.UNKNOWN);
                }
                TXCRenderAndDec tXCRenderAndDec2 = userInfo.subRender.render;
                if (tXCRenderAndDec2 != null) {
                    tXCRenderAndDec2.setVideoFrameListener(null, EnumC14004b.UNKNOWN);
                }
            }
        });
        if (z) {
            nativeExitRoom(this.mNativeRtcContext);
        }
        this.mRoomInfo.clear();
        this.mRenderListenerMap.clear();
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl
    public void finalize() throws Throwable {
        this.mSDKHandler = null;
        super.finalize();
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public int getAudioCaptureVolume() {
        return 0;
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public int getAudioPlayoutVolume() {
        return 0;
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public int getBGMDuration(String str) {
        return 0;
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public TXBeautyManager getBeautyManager() {
        return null;
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public boolean isCameraAutoFocusFaceModeSupported() {
        return false;
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public boolean isCameraFocusPositionInPreviewSupported() {
        return false;
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public boolean isCameraTorchSupported() {
        return false;
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public boolean isCameraZoomSupported() {
        return false;
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud, com.tencent.iliveroom.IOneSecAdapter
    public void muteAllRemoteAudio(boolean z) {
        super.muteAllRemoteAudio(z);
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void muteAllRemoteVideoStreams(boolean z) {
        super.muteAllRemoteVideoStreams(z);
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud, com.tencent.iliveroom.IOneSecAdapter
    public void muteLocalAudio(final boolean z) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.trtc.TRTCSubCloud.7
            @Override // java.lang.Runnable
            public void run() {
                TRTCSubCloud.this.apiLog("muteLocalAudio " + z + ", roomId=" + ((TRTCCloudImpl) TRTCSubCloud.this).mRoomInfo.getRoomId());
                Monitor.m82978a(1, String.format("muteLocalAudio mute:%b", Boolean.valueOf(z)) + " self:" + TRTCSubCloud.this.hashCode(), "", 0);
                TRTCCloudImpl tRTCCloudImpl = TRTCSubCloud.this.mMainCloud.get();
                if (tRTCCloudImpl != null) {
                    tRTCCloudImpl.muteLocalAudio(z, TRTCSubCloud.this);
                }
            }
        });
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud, com.tencent.iliveroom.IOneSecAdapter
    public void muteLocalVideo(final boolean z) {
        runOnSDKThread(new Runnable() { // from class: com.tencent.trtc.TRTCSubCloud.6
            @Override // java.lang.Runnable
            public void run() {
                TRTCSubCloud.this.apiLog("muteLocalVideo " + z + ", roomId=" + ((TRTCCloudImpl) TRTCSubCloud.this).mRoomInfo.getRoomId());
                Monitor.m82978a(1, String.format("muteLocalVideo mute:%b", Boolean.valueOf(z)) + " self:" + TRTCSubCloud.this.hashCode(), "", 0);
                TRTCCloudImpl tRTCCloudImpl = TRTCSubCloud.this.mMainCloud.get();
                if (tRTCCloudImpl != null) {
                    tRTCCloudImpl.muteLocalVideo(z, TRTCSubCloud.this);
                }
            }
        });
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void muteRemoteAudio(String str, boolean z) {
        super.muteRemoteAudio(str, z);
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void muteRemoteVideoStream(String str, boolean z) {
        super.muteRemoteVideoStream(str, z);
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl
    public void onAudioQosChanged(int i, int i2, int i3) {
        TRTCCloudImpl tRTCCloudImpl = this.mMainCloud.get();
        if (tRTCCloudImpl != null) {
            tRTCCloudImpl.onAudioQosChanged(this, i, i2, i3);
        }
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl
    public void onIdrFpsChanged(int i) {
        TRTCCloudImpl tRTCCloudImpl = this.mMainCloud.get();
        if (tRTCCloudImpl != null) {
            tRTCCloudImpl.onIdrFpsChanged(this, i);
        }
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl
    public void onVideoConfigChanged(int i, boolean z) {
        TRTCCloudImpl tRTCCloudImpl = this.mMainCloud.get();
        if (tRTCCloudImpl != null) {
            tRTCCloudImpl.onVideoConfigChanged(this, i, z);
        }
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl
    public void onVideoQosChanged(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        TRTCCloudImpl tRTCCloudImpl = this.mMainCloud.get();
        if (tRTCCloudImpl != null) {
            tRTCCloudImpl.onVideoQosChanged(this, i, i2, i3, i4, i5, i6, i7);
        }
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void pauseAudioEffect(int i) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void pauseBGM() {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void playAudioEffect(TRTCCloudDef.TRTCAudioEffectParam tRTCAudioEffectParam) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void playBGM(String str, TRTCCloud.BGMNotify bGMNotify) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void resumeAudioEffect(int i) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void resumeBGM() {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void selectMotionTmpl(String str) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void sendCustomAudioData(TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public boolean sendCustomCmdMsg(int i, byte[] bArr, boolean z, boolean z2) {
        return super.sendCustomCmdMsg(i, bArr, z, z2);
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void sendCustomVideoData(TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public boolean sendSEIMsg(byte[] bArr, int i) {
        return super.sendSEIMsg(bArr, i);
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void setAllAudioEffectsVolume(int i) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void setAudioCaptureVolume(int i) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void setAudioEffectVolume(int i, int i2) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void setAudioFrameListener(TRTCCloudListener.TRTCAudioFrameListener tRTCAudioFrameListener) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void setAudioPlayoutVolume(int i) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void setAudioRoute(int i) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void setBGMPlayoutVolume(int i) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public int setBGMPosition(int i) {
        return 0;
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void setBGMPublishVolume(int i) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void setBGMVolume(int i) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void setBeautyStyle(int i, int i2, int i3, int i4) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void setChinLevel(int i) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void setDebugViewMargin(String str, TRTCCloud.TRTCViewMargin tRTCViewMargin) {
        super.setDebugViewMargin(str, tRTCViewMargin);
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void setDefaultStreamRecvMode(boolean z, boolean z2) {
        super.setDefaultStreamRecvMode(z, z2);
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void setEyeScaleLevel(int i) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void setFaceShortLevel(int i) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void setFaceSlimLevel(int i) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void setFaceVLevel(int i) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void setFilter(Bitmap bitmap) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void setFilterConcentration(float f) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void setFocusPosition(int i, int i2) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void setGSensorMode(int i) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public boolean setGreenScreenFile(String str) {
        return false;
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void setListener(TRTCCloudListener tRTCCloudListener) {
        super.setListener(tRTCCloudListener);
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void setListenerHandler(Handler handler) {
        super.setListenerHandler(handler);
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public int setLocalVideoRenderListener(int i, int i2, TRTCCloudListener.TRTCVideoRenderListener tRTCVideoRenderListener) {
        return -1;
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void setLocalViewFillMode(int i) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void setLocalViewMirror(int i) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void setLocalViewRotation(int i) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void setMicVolumeOnMixing(int i) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void setMixTranscodingConfig(TRTCCloudDef.TRTCTranscodingConfig tRTCTranscodingConfig) {
        super.setMixTranscodingConfig(tRTCTranscodingConfig);
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void setMotionMute(boolean z) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void setNetworkQosParam(TRTCCloudDef.TRTCNetworkQosParam tRTCNetworkQosParam) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void setNoseSlimLevel(int i) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud, com.tencent.iliveroom.IOneSecAdapter
    public int setPriorRemoteVideoStreamType(int i) {
        return super.setPriorRemoteVideoStreamType(i);
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void setRemoteAudioVolume(String str, int i) {
        super.setRemoteAudioVolume(str, i);
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void setRemoteSubStreamViewFillMode(String str, int i) {
        super.setRemoteSubStreamViewFillMode(str, i);
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void setRemoteSubStreamViewRotation(String str, int i) {
        super.setRemoteSubStreamViewRotation(str, i);
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public int setRemoteVideoRenderListener(String str, int i, int i2, TRTCCloudListener.TRTCVideoRenderListener tRTCVideoRenderListener) {
        return super.setRemoteVideoRenderListener(str, i, i2, tRTCVideoRenderListener);
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud, com.tencent.iliveroom.IOneSecAdapter
    public int setRemoteVideoStreamType(String str, int i) {
        return super.setRemoteVideoStreamType(str, i);
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void setRemoteViewFillMode(String str, int i) {
        super.setRemoteViewFillMode(str, i);
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void setRemoteViewRotation(String str, int i) {
        super.setRemoteViewRotation(str, i);
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void setReverbType(int i) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void setSystemVolumeType(int i) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void setVideoEncoderMirror(boolean z) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void setVideoEncoderParam(TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void setVideoEncoderRotation(int i) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public boolean setVoiceChangerType(int i) {
        return false;
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void setWatermark(Bitmap bitmap, int i, float f, float f2, float f3) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void setZoom(int i) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void showDebugView(int i) {
        super.showDebugView(i);
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void snapshotVideo(String str, int i, TRTCCloudListener.TRTCSnapshotListener tRTCSnapshotListener) {
        apiLog(String.format("snapshotVideo user:%s streamType:%d", str, Integer.valueOf(i)));
        runOnSDKThread(new RunnableC144305(str, i, tRTCSnapshotListener));
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public int startAudioRecording(TRTCCloudDef.TRTCAudioRecordingParams tRTCAudioRecordingParams) {
        return -1;
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void startLocalAudio() {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void startLocalPreview(boolean z, TXCloudVideoView tXCloudVideoView) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void startPublishCDNStream(TRTCCloudDef.TRTCPublishCDNParam tRTCPublishCDNParam) {
        super.startPublishCDNStream(tRTCPublishCDNParam);
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void startPublishing(String str, int i) {
        super.startPublishing(str, i);
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void startRemoteSubStreamView(String str, TXCloudVideoView tXCloudVideoView) {
        super.startRemoteSubStreamView(str, tXCloudVideoView);
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void startRemoteView(String str, TXCloudVideoView tXCloudVideoView) {
        super.startRemoteView(str, tXCloudVideoView);
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void startSpeedTest(int i, String str, String str2) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl
    public void startVolumeLevelCal(boolean z) {
        TXCAudioEngine.getInstance();
        TXCAudioEngine.enableAudioVolumeEvaluation(z, this.mAudioVolumeEvalInterval);
        if (!z) {
            this.mVolumeLevelCalTask = null;
            this.mAudioVolumeEvalInterval = 0;
        } else if (this.mVolumeLevelCalTask == null) {
            RunnableC14434a runnableC14434a = new RunnableC14434a(this);
            this.mVolumeLevelCalTask = runnableC14434a;
            this.mSDKHandler.postDelayed(runnableC14434a, this.mAudioVolumeEvalInterval);
        }
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void stopAllAudioEffects() {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void stopAllRemoteView() {
        super.stopAllRemoteView();
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void stopAudioEffect(int i) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void stopAudioRecording() {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void stopBGM() {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void stopLocalAudio() {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void stopLocalPreview() {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud, com.tencent.iliveroom.IOneSecAdapter
    public void stopPublishCDNStream() {
        super.stopPublishCDNStream();
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void stopPublishing() {
        super.stopPublishing();
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void stopRemoteSubStreamView(String str) {
        super.stopRemoteSubStreamView(str);
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void stopRemoteView(String str) {
        super.stopRemoteView(str);
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void stopSpeedTest() {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud
    public void switchCamera() {
    }

    @Override // com.tencent.liteav.trtc.impl.TRTCCloudImpl, com.tencent.trtc.TRTCCloud, com.tencent.iliveroom.IOneSecAdapter
    public void switchRole(int i) {
        super.switchRole(i);
    }
}
