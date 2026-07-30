package com.tencent.rtmp;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.Surface;
import com.tencent.rtmp.p114ui.TXCloudVideoView;
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
    private C14568a mTXLivePlayerImpl;

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
        this.mTXLivePlayerImpl = new C14568a(context);
    }

    public boolean addVideoRawData(byte[] bArr) {
        return this.mTXLivePlayerImpl.m85745a(bArr);
    }

    public void callExperimentalAPI(String str) {
        this.mTXLivePlayerImpl.m85749b(str);
    }

    public void enableAudioVolumeEvaluation(int i) {
        this.mTXLivePlayerImpl.m85758e(i);
    }

    public boolean enableHardwareDecode(boolean z) {
        return this.mTXLivePlayerImpl.m85750b(z);
    }

    public boolean isPlaying() {
        return this.mTXLivePlayerImpl.m85744a();
    }

    public void pause() {
        this.mTXLivePlayerImpl.m85747b();
    }

    public int prepareLiveSeek(String str, int i) {
        return this.mTXLivePlayerImpl.m85746b(str, i);
    }

    public void resume() {
        this.mTXLivePlayerImpl.m85751c();
    }

    public int resumeLive() {
        return this.mTXLivePlayerImpl.m85757e();
    }

    public void seek(int i) {
        this.mTXLivePlayerImpl.m85760g(i);
    }

    public void setAudioRawDataListener(ITXAudioRawDataListener iTXAudioRawDataListener) {
        this.mTXLivePlayerImpl.m85738a(iTXAudioRawDataListener);
    }

    public void setAudioRoute(int i) {
        this.mTXLivePlayerImpl.m85755d(i);
    }

    public void setAudioVolumeEvaluationListener(ITXAudioVolumeEvaluationListener iTXAudioVolumeEvaluationListener) {
        this.mTXLivePlayerImpl.m85739a(iTXAudioVolumeEvaluationListener);
    }

    @Deprecated
    public void setAutoPlay(boolean z) {
        this.mTXLivePlayerImpl.m85756d(z);
    }

    public void setConfig(TXLivePlayConfig tXLivePlayConfig) {
        this.mTXLivePlayerImpl.m85737a(tXLivePlayConfig);
    }

    public void setMute(boolean z) {
        this.mTXLivePlayerImpl.m85753c(z);
    }

    public void setPlayListener(ITXLivePlayListener iTXLivePlayListener) {
        this.mTXLivePlayerImpl.m85736a(iTXLivePlayListener);
    }

    public void setPlayerView(TXCloudVideoView tXCloudVideoView) {
        this.mTXLivePlayerImpl.m85742a(tXCloudVideoView);
    }

    @Deprecated
    public void setRate(float f) {
        this.mTXLivePlayerImpl.m85732a(f);
    }

    public void setRenderMode(int i) {
        this.mTXLivePlayerImpl.m85733a(i);
    }

    public void setRenderRotation(int i) {
        this.mTXLivePlayerImpl.m85748b(i);
    }

    public void setSurface(Surface surface) {
        this.mTXLivePlayerImpl.m85735a(surface);
    }

    public void setSurfaceSize(int i, int i2) {
        this.mTXLivePlayerImpl.m85734a(i, i2);
    }

    public void setVideoRawDataListener(ITXVideoRawDataListener iTXVideoRawDataListener) {
        this.mTXLivePlayerImpl.m85741a(iTXVideoRawDataListener);
    }

    public void setVideoRecordListener(TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener) {
        this.mTXLivePlayerImpl.m85743a(iTXVideoRecordListener);
    }

    public int setVideoRenderListener(ITXLivePlayVideoRenderListener iTXLivePlayVideoRenderListener, Object obj) {
        return this.mTXLivePlayerImpl.m85728a(iTXLivePlayVideoRenderListener, obj);
    }

    public void setVolume(int i) {
        this.mTXLivePlayerImpl.m85752c(i);
    }

    public void snapshot(ITXSnapshotListener iTXSnapshotListener) {
        this.mTXLivePlayerImpl.m85740a(iTXSnapshotListener);
    }

    public int startPlay(String str, int i) {
        return this.mTXLivePlayerImpl.m85730a(str, i);
    }

    public int startRecord(int i) {
        return this.mTXLivePlayerImpl.m85759f(i);
    }

    public int stopPlay(boolean z) {
        return this.mTXLivePlayerImpl.m85731a(z);
    }

    public int stopRecord() {
        return this.mTXLivePlayerImpl.m85754d();
    }

    public int switchStream(String str) {
        return this.mTXLivePlayerImpl.m85729a(str);
    }
}
