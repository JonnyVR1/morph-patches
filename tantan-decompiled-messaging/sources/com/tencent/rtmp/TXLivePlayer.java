package com.tencent.rtmp;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.Surface;
import com.tencent.rtmp.p109ui.TXCloudVideoView;
import com.tencent.ugc.TXRecordCommon;

/* JADX INFO: loaded from: classes2.dex */
public class TXLivePlayer {
    public static final int PLAY_TYPE_LIVE_FLV = 1;
    public static final int PLAY_TYPE_LIVE_RTMP = 0;
    public static final int PLAY_TYPE_LIVE_RTMP_ACC = 5;
    public static final int PLAY_TYPE_LOCAL_VIDEO = 6;
    public static final int PLAY_TYPE_VOD_FLV = 2;
    public static final int PLAY_TYPE_VOD_HLS = 3;
    public static final int PLAY_TYPE_VOD_MP4 = 4;
    public static final String TAG = "TXLivePlayer";
    private C14405a mTXLivePlayerImpl;

    public interface ITXAudioRawDataListener {
        void onAudioInfoChanged(int i, int i2, int i3);

        void onPcmDataAvailable(byte[] bArr, long j);
    }

    public interface ITXAudioVolumeEvaluationListener {
        void onAudioVolumeEvaluationNotify(int i);
    }

    public interface ITXLivePlayVideoRenderListener {
        void onRenderVideoFrame(TXLiteAVTexture tXLiteAVTexture);
    }

    public interface ITXSnapshotListener {
        void onSnapshot(Bitmap bitmap);
    }

    public interface ITXVideoRawDataListener {
        void onVideoRawDataAvailable(byte[] bArr, int i, int i2, int i3);
    }

    public static class TXLiteAVTexture {
        public Object eglContext;
        public int height;
        public int textureId;
        public int width;
    }

    public TXLivePlayer(Context context) {
        this.mTXLivePlayerImpl = new C14405a(context);
    }

    public boolean addVideoRawData(byte[] bArr) {
        return this.mTXLivePlayerImpl.m84562a(bArr);
    }

    public void callExperimentalAPI(String str) {
        this.mTXLivePlayerImpl.m84566b(str);
    }

    public void enableAudioVolumeEvaluation(int i) {
        this.mTXLivePlayerImpl.m84575e(i);
    }

    public boolean enableHardwareDecode(boolean z) {
        return this.mTXLivePlayerImpl.m84567b(z);
    }

    public boolean isPlaying() {
        return this.mTXLivePlayerImpl.m84561a();
    }

    public void pause() {
        this.mTXLivePlayerImpl.m84564b();
    }

    public int prepareLiveSeek(String str, int i) {
        return this.mTXLivePlayerImpl.m84563b(str, i);
    }

    public void resume() {
        this.mTXLivePlayerImpl.m84568c();
    }

    public int resumeLive() {
        return this.mTXLivePlayerImpl.m84574e();
    }

    public void seek(int i) {
        this.mTXLivePlayerImpl.m84577g(i);
    }

    public void setAudioRawDataListener(ITXAudioRawDataListener iTXAudioRawDataListener) {
        this.mTXLivePlayerImpl.m84555a(iTXAudioRawDataListener);
    }

    public void setAudioRoute(int i) {
        this.mTXLivePlayerImpl.m84572d(i);
    }

    public void setAudioVolumeEvaluationListener(ITXAudioVolumeEvaluationListener iTXAudioVolumeEvaluationListener) {
        this.mTXLivePlayerImpl.m84556a(iTXAudioVolumeEvaluationListener);
    }

    @Deprecated
    public void setAutoPlay(boolean z) {
        this.mTXLivePlayerImpl.m84573d(z);
    }

    public void setConfig(TXLivePlayConfig tXLivePlayConfig) {
        this.mTXLivePlayerImpl.m84554a(tXLivePlayConfig);
    }

    public void setMute(boolean z) {
        this.mTXLivePlayerImpl.m84570c(z);
    }

    public void setPlayListener(ITXLivePlayListener iTXLivePlayListener) {
        this.mTXLivePlayerImpl.m84553a(iTXLivePlayListener);
    }

    public void setPlayerView(TXCloudVideoView tXCloudVideoView) {
        this.mTXLivePlayerImpl.m84559a(tXCloudVideoView);
    }

    @Deprecated
    public void setRate(float f) {
        this.mTXLivePlayerImpl.m84549a(f);
    }

    public void setRenderMode(int i) {
        this.mTXLivePlayerImpl.m84550a(i);
    }

    public void setRenderRotation(int i) {
        this.mTXLivePlayerImpl.m84565b(i);
    }

    public void setSurface(Surface surface) {
        this.mTXLivePlayerImpl.m84552a(surface);
    }

    public void setSurfaceSize(int i, int i2) {
        this.mTXLivePlayerImpl.m84551a(i, i2);
    }

    public void setVideoRawDataListener(ITXVideoRawDataListener iTXVideoRawDataListener) {
        this.mTXLivePlayerImpl.m84558a(iTXVideoRawDataListener);
    }

    public void setVideoRecordListener(TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener) {
        this.mTXLivePlayerImpl.m84560a(iTXVideoRecordListener);
    }

    public int setVideoRenderListener(ITXLivePlayVideoRenderListener iTXLivePlayVideoRenderListener, Object obj) {
        return this.mTXLivePlayerImpl.m84545a(iTXLivePlayVideoRenderListener, obj);
    }

    public void setVolume(int i) {
        this.mTXLivePlayerImpl.m84569c(i);
    }

    public void snapshot(ITXSnapshotListener iTXSnapshotListener) {
        this.mTXLivePlayerImpl.m84557a(iTXSnapshotListener);
    }

    public int startPlay(String str, int i) {
        return this.mTXLivePlayerImpl.m84547a(str, i);
    }

    public int startRecord(int i) {
        return this.mTXLivePlayerImpl.m84576f(i);
    }

    public int stopPlay(boolean z) {
        return this.mTXLivePlayerImpl.m84548a(z);
    }

    public int stopRecord() {
        return this.mTXLivePlayerImpl.m84571d();
    }

    public int switchStream(String str) {
        return this.mTXLivePlayerImpl.m84546a(str);
    }
}
