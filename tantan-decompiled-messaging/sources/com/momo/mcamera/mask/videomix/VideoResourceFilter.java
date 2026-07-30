package com.momo.mcamera.mask.videomix;

import android.content.Context;
import android.media.MediaPlayer;
import android.opengl.GLES20;
import p149l.ts2;

/* JADX INFO: loaded from: classes7.dex */
public class VideoResourceFilter extends ts2 implements IVideoResourceInputListener.OnCompletionListener {
    private VideoResourceInput mediaPlayerInput;

    public VideoResourceFilter(Context context, String str, int i) {
        VideoResourceInput videoResourceInput = new VideoResourceInput(context, str, i);
        this.mediaPlayerInput = videoResourceInput;
        videoResourceInput.setOnCompletionListener(this);
    }

    @Override // p149l.mcj, p149l.ccj
    public synchronized void destroy() {
        super.destroy();
        VideoResourceInput videoResourceInput = this.mediaPlayerInput;
        if (videoResourceInput != null) {
            videoResourceInput.stop();
            this.mediaPlayerInput.setOnCompletionListener(null);
            this.mediaPlayerInput.setRenderTimestampListener(null);
            this.mediaPlayerInput.setOnPreparedListener(null);
            this.mediaPlayerInput.destroy();
            this.mediaPlayerInput = null;
        }
    }

    @Override // com.momo.mcamera.mask.videomix.IVideoResourceInputListener.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        VideoResourceInput videoResourceInput = this.mediaPlayerInput;
        if (videoResourceInput != null) {
            videoResourceInput.seek(0L);
            this.mediaPlayerInput.resume();
        }
    }

    @Override // p149l.ccj
    public void onDrawFrame() {
        super.onDrawFrame();
        VideoResourceInput videoResourceInput = this.mediaPlayerInput;
        if (videoResourceInput != null) {
            videoResourceInput.onDrawFrame();
        }
    }

    @Override // p149l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.mediaPlayerInput.getTextOutID());
        GLES20.glUniform1i(this.textureHandle, 0);
    }

    public void setOnPreparedListener(IVideoResourceInputListener.OnPreparedListener onPreparedListener) {
        VideoResourceInput videoResourceInput = this.mediaPlayerInput;
        if (videoResourceInput != null) {
            videoResourceInput.setOnPreparedListener(onPreparedListener);
        }
    }

    public void setRenderTimestampListener(IVideoResourceInputListener.RenderTimestampListener renderTimestampListener) {
        VideoResourceInput videoResourceInput = this.mediaPlayerInput;
        if (videoResourceInput != null) {
            videoResourceInput.setRenderTimestampListener(renderTimestampListener);
        }
    }
}
