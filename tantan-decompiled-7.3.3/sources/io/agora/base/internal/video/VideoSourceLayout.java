package io.agora.base.internal.video;

import io.agora.base.internal.CalledByNative;

/* JADX INFO: loaded from: classes2.dex */
public class VideoSourceLayout {
    private int cropped_height;
    private int cropped_width;
    private int cropped_x;
    private int cropped_y;
    private int dest_height;
    private int dest_width;
    private boolean mirror_x;
    private boolean mirror_y;
    private int position_x;
    private int position_y;
    private int rotation;
    private String source_id;
    private VideoSourceType videoSourceType;
    private int z_order;

    public enum VideoSourceType {
        UNKNOWN,
        STREAM,
        PIC,
        GIF,
        CANVAS
    }

    @CalledByNative
    public VideoSourceLayout(String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z, boolean z2, int i10, int i11) {
        this.videoSourceType = VideoSourceType.UNKNOWN;
        this.source_id = str;
        this.position_x = i;
        this.position_y = i2;
        this.cropped_x = i3;
        this.cropped_y = i4;
        this.cropped_width = i5;
        this.cropped_height = i6;
        this.dest_width = i7;
        this.dest_height = i8;
        this.mirror_x = z;
        this.mirror_y = z2;
        this.rotation = i10;
        this.z_order = i9;
        this.videoSourceType = VideoSourceType.values()[i11];
    }

    public int getCroppedHeight() {
        return this.cropped_height;
    }

    public int getCroppedWidth() {
        return this.cropped_width;
    }

    public int getCroppedX() {
        return this.cropped_x;
    }

    public int getCroppedY() {
        return this.cropped_y;
    }

    public int getDestHeight() {
        return this.dest_height;
    }

    public int getDestWidth() {
        return this.dest_width;
    }

    public int getPositionX() {
        return this.position_x;
    }

    public int getPositionY() {
        return this.position_y;
    }

    public int getRotation() {
        return this.rotation;
    }

    public String getSourceId() {
        return this.source_id;
    }

    public VideoSourceType getVideoSourceType() {
        return this.videoSourceType;
    }

    public int getZorder() {
        return this.z_order;
    }

    public boolean isMirrorX() {
        return this.mirror_x;
    }

    public boolean isMirrorY() {
        return this.mirror_y;
    }
}
