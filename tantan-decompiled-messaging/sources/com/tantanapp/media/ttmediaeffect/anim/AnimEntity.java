package com.tantanapp.media.ttmediaeffect.anim;

import android.graphics.Bitmap;
import com.immomo.svgaplayer.SVGAVideoEntity;
import java.util.HashMap;

/* JADX INFO: loaded from: classes13.dex */
public class AnimEntity {
    private AnimRect mAnimSize;
    private int mFps;
    private int mFrames;
    private HashMap<String, Bitmap> mImages;

    public static AnimEntity fromMomoEntity(SVGAVideoEntity sVGAVideoEntity) {
        AnimEntity animEntity = new AnimEntity();
        animEntity.mFps = sVGAVideoEntity.getFPS();
        animEntity.mFrames = sVGAVideoEntity.getFrames();
        animEntity.mImages = sVGAVideoEntity.getImages();
        animEntity.mAnimSize = AnimRect.fromMomoRect(sVGAVideoEntity.getVideoSize());
        return animEntity;
    }

    public AnimRect getAnimSize() {
        return this.mAnimSize;
    }

    public int getFps() {
        return this.mFps;
    }

    public int getFrames() {
        return this.mFrames;
    }

    public HashMap<String, Bitmap> getImages() {
        return this.mImages;
    }
}
