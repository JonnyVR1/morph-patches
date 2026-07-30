package com.tantanapp.media.ttmediaeffect.video;

import android.net.Uri;
import com.immomo.velib.player.C4136a;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class VideoEffectConfig {
    public static int GREEN_SCREEN_KEYING = 2;
    public static int MERGE_ALPHA = 1;
    private List<VideoEffectMatchInfo> mEffectMatchInfo;
    VideoEffectModel mEffectModel;
    int mEffectType;
    int mRenderHeight;
    int mRenderWidth;
    Uri mUri;
    int mVideoHeight;
    int mVideoWidth;

    public static class Builder {
        private List<VideoEffectMatchInfo> mEffectMatchInfo;
        private VideoEffectModel mEffectModel;
        private int mEffectType;
        private int mRenderHeight;
        private int mRenderWidth;
        private Uri mUri;
        private int mVideoHeight;
        private int mVideoWidth;

        public VideoEffectConfig build() {
            VideoEffectConfig videoEffectConfig = new VideoEffectConfig();
            videoEffectConfig.mUri = this.mUri;
            videoEffectConfig.mEffectType = this.mEffectType;
            videoEffectConfig.mRenderWidth = this.mRenderWidth;
            videoEffectConfig.mRenderHeight = this.mRenderHeight;
            videoEffectConfig.mVideoWidth = this.mVideoWidth;
            videoEffectConfig.mVideoHeight = this.mVideoHeight;
            videoEffectConfig.mEffectModel = this.mEffectModel;
            videoEffectConfig.mEffectMatchInfo = this.mEffectMatchInfo;
            return videoEffectConfig;
        }

        public Builder setEffectMatchInfo(List<VideoEffectMatchInfo> list) {
            this.mEffectMatchInfo = list;
            return this;
        }

        public Builder setEffectModel(VideoEffectModel videoEffectModel) {
            this.mEffectModel = videoEffectModel;
            return this;
        }

        public Builder setEffectType(int i) {
            this.mEffectType = i;
            return this;
        }

        public Builder setRenderSize(int i, int i2) {
            this.mRenderWidth = i;
            this.mRenderHeight = i2;
            return this;
        }

        public Builder setVideoPath(String str) {
            setVideoUri(str.startsWith("file://") ? Uri.parse(str) : Uri.fromFile(new File(str)));
            return this;
        }

        public Builder setVideoSize(int i, int i2) {
            this.mVideoWidth = i;
            this.mVideoHeight = i2;
            return this;
        }

        public Builder setVideoUri(Uri uri) {
            this.mUri = uri;
            return this;
        }
    }

    private static List<com.immomo.velib.anim.model.VideoEffectMatchInfo> toMMVideoEffectMatchInfoList(List<VideoEffectMatchInfo> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (VideoEffectMatchInfo videoEffectMatchInfo : list) {
                if (videoEffectMatchInfo != null && videoEffectMatchInfo.getRealEffectMatchInfo() != null) {
                    arrayList.add(videoEffectMatchInfo.getRealEffectMatchInfo());
                }
            }
        }
        return arrayList;
    }

    public C4136a toMomoEffectConfig() {
        return new C4136a.a().m20550r(this.mEffectType).m20552t(this.mRenderWidth, this.mRenderHeight).m20553u(this.mUri).m20549q(this.mEffectModel.getRealVidelEffectModel()).m20552t(this.mVideoWidth, this.mVideoHeight).m20548p(toMMVideoEffectMatchInfoList(this.mEffectMatchInfo)).m20547o();
    }
}
