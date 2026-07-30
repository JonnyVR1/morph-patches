package com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config;

import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public class MediaPickConfig implements Serializable {
    public boolean canClickSubmitInPreviewWhenNoSelectedMedia;
    public int clickEvent;
    public float imageCropProportion;
    public int imageCropWidth;
    public int maxPickCount;
    public int minPickCount;
    private boolean showPreviewEditBtn;

    public static final class MediaPickConfigBuilder implements Serializable {
        private boolean canClickSubmitInPreviewWhenNoSelectedMedia;
        private int clickEvent;
        private float imageCropProportion;
        private int imageCropWidth;
        private int maxPickCount;
        private int minPickCount;
        private boolean showPreviewEditBtn = true;

        private MediaPickConfigBuilder() {
        }

        public static MediaPickConfigBuilder aBuilder() {
            return new MediaPickConfigBuilder();
        }

        public MediaPickConfig build() {
            return new MediaPickConfig(this);
        }

        public MediaPickConfigBuilder canClickSubmitInPreviewWhenNoSelectedMedia() {
            this.canClickSubmitInPreviewWhenNoSelectedMedia = true;
            return this;
        }

        public MediaPickConfigBuilder radioSelect() {
            withMaxPickCount(1);
            return this;
        }

        public MediaPickConfigBuilder showPreviewEditBtn(boolean z) {
            this.showPreviewEditBtn = z;
            return this;
        }

        public MediaPickConfigBuilder withClickEvent(int i) {
            this.clickEvent = i;
            return this;
        }

        public MediaPickConfigBuilder withImageCropProportion(float f) {
            this.imageCropProportion = f;
            return this;
        }

        public MediaPickConfigBuilder withImageCropWidth(int i) {
            this.imageCropWidth = i;
            return this;
        }

        public MediaPickConfigBuilder withMaxPickCount(int i) {
            this.maxPickCount = i;
            return this;
        }

        public MediaPickConfigBuilder withMinPickCount(int i) {
            this.minPickCount = i;
            return this;
        }
    }

    private MediaPickConfig(MediaPickConfigBuilder mediaPickConfigBuilder) {
        this.showPreviewEditBtn = true;
        this.clickEvent = mediaPickConfigBuilder.clickEvent;
        this.maxPickCount = mediaPickConfigBuilder.maxPickCount;
        this.minPickCount = mediaPickConfigBuilder.minPickCount;
        this.imageCropWidth = mediaPickConfigBuilder.imageCropWidth;
        this.imageCropProportion = mediaPickConfigBuilder.imageCropProportion;
        this.canClickSubmitInPreviewWhenNoSelectedMedia = mediaPickConfigBuilder.canClickSubmitInPreviewWhenNoSelectedMedia;
        this.showPreviewEditBtn = mediaPickConfigBuilder.showPreviewEditBtn;
    }

    public boolean isRadio() {
        return this.maxPickCount == 1;
    }

    public boolean showPreviewEditBtn() {
        return this.showPreviewEditBtn;
    }
}
