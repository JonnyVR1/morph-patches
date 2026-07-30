package com.tencent.liteav.trtc.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.tencent.liteav.C14273g;
import com.tencent.liteav.TXCRenderAndDec;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.renderer.TextureViewSurfaceTextureListenerC14348e;
import com.tencent.rtmp.p114ui.TXCloudVideoView;
import com.tencent.trtc.TRTCCloud;
import com.tencent.trtc.TRTCCloudListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes2.dex */
public class TRTCRoomInfo {
    public static final int NETWORK_STATUS_OFFLINE = 1;
    public static final int NETWORK_STATUS_ONLINE = 3;
    public static final int NETWORK_STATUS_RECONNECTING = 2;
    public static final int STATE_AUDIO = 8;
    public static final int STATE_BIG_VIDEO = 1;
    public static final int STATE_MUTE_AUDIO = 64;
    public static final int STATE_MUTE_MAIN_VIDEO = 16;
    public static final int STATE_MUTE_SUB_VIDEO = 32;
    public static final int STATE_SMALL_VIDEO = 2;
    public static final int STATE_SUB_VIDEO = 4;
    private static final String TAG = "TRTCRoomInfo";
    private static final String TOKEN = "TRTC.0x0.Token";
    private static final String TRTC_INFO = "TRTC.Info";
    public long enterTime;
    public int localBufferType;
    public TRTCCloudListener.TRTCVideoRenderListener localListener;
    public int localPixelFormat;
    public String privateMapKey;
    public long roomId;
    public int sdkAppId;
    public String strRoomId;
    public String tinyId;
    public String userSig;
    public String userId = "";
    public byte[] token = null;
    public int networkStatus = 1;
    public TRTCCloud.TRTCViewMargin debugMargin = new TRTCCloud.TRTCViewMargin(0.0f, 0.0f, 0.1f, 0.0f);
    public boolean enableCustomPreprocessor = false;
    public TXCloudVideoView localView = null;
    private HashMap<String, UserInfo> userList = new HashMap<>();
    private HashMap<Long, Integer> recvFirstIFrameCntList = new HashMap<>();
    public boolean muteLocalVideo = false;
    public boolean muteRemoteVideo = false;
    public boolean muteLocalAudio = false;
    public boolean muteRemoteAudio = false;
    public int localRenderRotation = 0;
    private boolean micHasStartd = false;
    private boolean hasExitedRoom = false;
    private int exitRoomCode = 0;
    public JSONArray decProperties = null;
    public boolean enableRestartDecoder = false;
    public C14273g.a bigEncSize = new C14273g.a();
    public C14273g.a smallEncSize = new C14273g.a();

    public static class RenderInfo implements SurfaceHolder.Callback {
        public long tinyID;
        public TXCRenderAndDec render = null;
        public TXCloudVideoView view = null;
        public boolean muteVideo = false;
        public boolean muteAudio = false;

        public void stop() {
            try {
                TXCloudVideoView tXCloudVideoView = this.view;
                if (tXCloudVideoView == null || tXCloudVideoView.getSurfaceView() == null || this.view.getSurfaceView().getHolder() == null) {
                    return;
                }
                this.view.getSurfaceView().getHolder().removeCallback(this);
            } catch (Exception e) {
                TXCLog.m84150e(TRTCRoomInfo.TAG, "remove callback failed.", e);
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            TXCLog.m84152i("RenderInfo", "trtc_api startRemoteView surfaceChanged " + surfaceHolder.getSurface() + " width " + i2 + ", height " + i3 + ", " + this.tinyID + ", " + this.render);
            TXCRenderAndDec tXCRenderAndDec = this.render;
            TextureViewSurfaceTextureListenerC14348e videoRender = tXCRenderAndDec != null ? tXCRenderAndDec.getVideoRender() : null;
            if (videoRender != null) {
                videoRender.m85108c(i2, i3);
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            TXCLog.m84152i("RenderInfo", "trtc_api startRemoteView surfaceCreated " + surfaceHolder.getSurface() + ", " + this.tinyID + ", " + this.render);
            if (surfaceHolder.getSurface().isValid()) {
                TXCRenderAndDec tXCRenderAndDec = this.render;
                TextureViewSurfaceTextureListenerC14348e videoRender = tXCRenderAndDec != null ? tXCRenderAndDec.getVideoRender() : null;
                if (videoRender != null) {
                    videoRender.m85098a(surfaceHolder.getSurface());
                }
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            TXCLog.m84152i("RenderInfo", "trtc_api startRemoteView surfaceDestroyed " + surfaceHolder.getSurface() + ", " + this.tinyID + ", " + this.render);
            TXCRenderAndDec tXCRenderAndDec = this.render;
            TextureViewSurfaceTextureListenerC14348e videoRender = tXCRenderAndDec != null ? tXCRenderAndDec.getVideoRender() : null;
            if (videoRender != null) {
                videoRender.m85098a((Surface) null);
            }
        }
    }

    public interface UserAction {
        void accept(String str, UserInfo userInfo);
    }

    public static class UserInfo {
        public int streamState;
        public int terminalType;
        public long tinyID;
        public String userID;
        public RenderInfo mainRender = new RenderInfo();
        public RenderInfo subRender = new RenderInfo();
        public int streamType = 2;
        public TRTCCloud.TRTCViewMargin debugMargin = new TRTCCloud.TRTCViewMargin(0.0f, 0.0f, 0.1f, 0.0f);
        public boolean muteAudioInSpeaker = false;

        public UserInfo(long j, String str, int i, int i2) {
            this.tinyID = j;
            this.userID = str;
            this.terminalType = i;
            this.streamState = i2;
            this.mainRender.tinyID = j;
            this.subRender.tinyID = j;
        }
    }

    private String byteArrayToHexStr(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        char[] charArray = "0123456789ABCDEF".toCharArray();
        char[] cArr = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            int i2 = i * 2;
            cArr[i2] = charArray[(b & 255) >>> 4];
            cArr[i2 + 1] = charArray[b & 15];
        }
        return new String(cArr);
    }

    public static boolean hasAudio(int i) {
        return (i & 8) != 0;
    }

    public static boolean hasMainVideo(int i) {
        return (i & 1) != 0;
    }

    public static boolean hasSmallVideo(int i) {
        return (i & 2) != 0;
    }

    public static boolean hasSubVideo(int i) {
        return (i & 4) != 0;
    }

    private byte[] hexStrToByteArray(String str) {
        if (str == null) {
            return null;
        }
        if (str.length() == 0) {
            return new byte[0];
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) Integer.parseInt(str.substring(i2, i2 + 2), 16);
        }
        return bArr;
    }

    public static boolean isMuteAudio(int i) {
        return (i & 64) != 0;
    }

    public static boolean isMuteMainVideo(int i) {
        return (i & 16) != 0;
    }

    public static boolean isMuteSubVideo(int i) {
        return (i & 32) != 0;
    }

    public synchronized void addUserInfo(String str, UserInfo userInfo) {
        this.userList.put(str, userInfo);
    }

    public synchronized void clear() {
        this.roomId = 0L;
        this.userId = "";
        this.enterTime = 0L;
        this.tinyId = "";
        this.muteLocalVideo = false;
        this.muteLocalAudio = false;
        this.muteRemoteVideo = false;
        this.muteRemoteAudio = false;
        this.userList.clear();
        this.recvFirstIFrameCntList.clear();
        this.networkStatus = 1;
        this.decProperties = null;
        this.enableRestartDecoder = false;
        this.enableCustomPreprocessor = false;
        this.localListener = null;
    }

    public synchronized void clearUserList() {
        this.userList.clear();
        this.recvFirstIFrameCntList.clear();
    }

    public void forEachUser(UserAction userAction) {
        HashMap map = new HashMap(this.userList.size());
        synchronized (this) {
            map.putAll(this.userList);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (userAction != null && entry.getValue() != null) {
                userAction.accept((String) entry.getKey(), (UserInfo) entry.getValue());
            }
        }
    }

    public long getRoomElapsed() {
        return System.currentTimeMillis() - this.enterTime;
    }

    public synchronized int getRoomExitCode() {
        return this.exitRoomCode;
    }

    public long getRoomId() {
        return this.roomId;
    }

    public String getStrRoomId() {
        return TextUtils.isEmpty(this.strRoomId) ? String.valueOf(this.roomId) : this.strRoomId;
    }

    public String getTinyId() {
        return this.tinyId;
    }

    public byte[] getToken(Context context) {
        try {
            if (this.token == null) {
                this.token = hexStrToByteArray(context.getSharedPreferences(TRTC_INFO, 0).getString(TOKEN, ""));
            }
        } catch (Exception e) {
            TXCLog.m84150e(TAG, "get token failed.", e);
        }
        return this.token;
    }

    public synchronized UserInfo getUser(String str) {
        return this.userList.get(str);
    }

    public String getUserId() {
        return this.userId;
    }

    public synchronized String getUserIdByTinyId(long j) {
        Iterator<Map.Entry<String, UserInfo>> it = this.userList.entrySet().iterator();
        while (it.hasNext()) {
            UserInfo value = it.next().getValue();
            if (value != null && value.tinyID == j) {
                return value.userID;
            }
        }
        return null;
    }

    public synchronized boolean hasRecvFirstIFrame(long j) {
        Integer num;
        num = this.recvFirstIFrameCntList.get(Long.valueOf(j));
        return num != null && num.intValue() > 0;
    }

    public void init(long j, String str) {
        this.roomId = j;
        this.userId = str;
    }

    public synchronized boolean isMicStard() {
        return this.micHasStartd;
    }

    public synchronized boolean isRoomExit() {
        return this.hasExitedRoom;
    }

    public void micStart(boolean z) {
        this.micHasStartd = z;
    }

    public synchronized int recvFirstIFrame(long j) {
        int iIntValue;
        Integer num = this.recvFirstIFrameCntList.get(Long.valueOf(j));
        iIntValue = 1;
        this.recvFirstIFrameCntList.put(Long.valueOf(j), Integer.valueOf(num == null ? 1 : num.intValue() + 1));
        if (num != null) {
            iIntValue = 1 + num.intValue();
        }
        return iIntValue;
    }

    public synchronized void removeRenderInfo(String str) {
        this.recvFirstIFrameCntList.remove(Long.valueOf(this.userList.get(str).tinyID));
        this.userList.remove(str);
    }

    public synchronized void setRoomExit(boolean z, int i) {
        this.hasExitedRoom = z;
        this.exitRoomCode = i;
    }

    public void setRoomId(int i) {
        this.roomId = i;
    }

    public void setTinyId(String str) {
        this.tinyId = str;
    }

    public void setToken(Context context, byte[] bArr) {
        this.token = bArr;
        try {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(TRTC_INFO, 0).edit();
            byte[] bArr2 = this.token;
            if (bArr2 != null) {
                editorEdit.putString(TOKEN, byteArrayToHexStr(bArr2));
            } else {
                editorEdit.clear();
            }
            editorEdit.commit();
        } catch (Exception e) {
            TXCLog.m84150e(TAG, "set token failed.", e);
        }
    }

    public void setUserId(String str) {
        this.userId = str;
    }
}
