package com.momo.mcamera.mask.videomix;

import android.content.Context;
import android.media.MediaPlayer;
import android.opengl.GLES20;
import p153l.jt2;

/* JADX INFO: loaded from: classes8.dex */
public class VideoResourceFilter extends jt2 implements IVideoResourceInputListener.OnCompletionListener {
    private VideoResourceInput mediaPlayerInput;

    public VideoResourceFilter(Context context, String str, int i) {
        VideoResourceInput videoResourceInput = new VideoResourceInput(context, str, i);
        this.mediaPlayerInput = videoResourceInput;
        videoResourceInput.setOnCompletionListener(this);
    }

    @Override // p153l.gfj, p153l.wej
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

    @Override // p153l.wej
    public void onDrawFrame() {
        super.onDrawFrame();
        VideoResourceInput videoResourceInput = this.mediaPlayerInput;
        if (videoResourceInput != null) {
            videoResourceInput.onDrawFrame();
        }
    }

    @Override // p153l.wej
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
