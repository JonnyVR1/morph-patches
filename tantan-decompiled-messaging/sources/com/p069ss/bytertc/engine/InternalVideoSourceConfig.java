package com.p069ss.bytertc.engine;

/* JADX INFO: loaded from: classes13.dex */
public class InternalVideoSourceConfig {
    private int source_category;
    private int source_type;

    public enum VideoContentCategory {
        VIDEO_CONTENT_CATEGORY_CAMERA(0),
        VIDEO_CONTENT_CATEGRORY_SCREEN(1);

        private int value;

        VideoContentCategory(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum VideoSourceType {
        VIDEO_SOURCE_TYPE_EXTERNAL(0),
        VIDEO_SOURCE_TYPE_INTERNAL(1),
        VIDEO_SOURCE_TYPE_ENCODER_WITH_AUTO_SIMULCAST(2),
        VIDEO_SOURCE_TYPE_ENCODER_WITHOUT_AUTO_SIMULCAST(3);

        private int value;

        VideoSourceType(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public InternalVideoSourceConfig(VideoSourceType videoSourceType, VideoContentCategory videoContentCategory) {
        this.source_type = videoSourceType.getValue();
        this.source_category = videoContentCategory.getValue();
    }

    public int getVideoSourceCategory() {
        return this.source_category;
    }

    public int getVideoSourceType() {
        return this.source_type;
    }
}
