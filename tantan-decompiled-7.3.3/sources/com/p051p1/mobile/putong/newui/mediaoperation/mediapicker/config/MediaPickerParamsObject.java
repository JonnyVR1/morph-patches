package com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config;

import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.common.R$string;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Video;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import p153l.w7c0;

/* JADX INFO: loaded from: classes10.dex */
public class MediaPickerParamsObject implements Serializable {
    public static final int FROM_CHAT = 4;
    public static final int FROM_CHAT_LIMIT_SHOOT_PIC = 13;
    public static final int FROM_CHAT_SWITCH_BACK_PIC = 11;
    public static final int FROM_CHAT_SWITCH_PIC = 10;
    public static final int FROM_CITY_CENTER_UPLOAD_PIC = 14;
    public static final int FROM_DEFAULT = 16;
    public static final int FROM_FEED = 2;
    public static final int FROM_JS_BRIDGE = 8;
    public static final int FROM_JS_BRIDGE_SWIPE_CARD = 9;
    public static final int FROM_KAN_KAN = 5;
    public static final int FROM_MY_STATES = 7;
    public static final int FROM_PROFILE_GAME = 15;
    public static final int FROM_PROFILE_PAGE = 1;
    public static final int FROM_PROFILE_PET = 17;
    public static final int FROM_PROFILE_WEALTH = 12;
    public static final int FROM_REGISTER = 3;
    public static final int MEDIA_PICKER_REQUEST_CODE = 66;
    public static final int MEDIA_PICKER_RESULT_CODE = 67;
    public static final String MEDIA_PICKER_RESULT_KEY = "mediaPickerResult";
    public List<Media> alreadySelectedImages;
    public boolean canPickBothImageAndVideo;
    public boolean croppingNewStyle;
    public int finishInAnim;
    public int finishOutAnim;
    public int fromType;
    public int headResource;
    public MediaPickConfig imagePickConfig;
    public boolean initialShowSelectFold;
    public boolean isHasPostStatusHeader;
    public boolean isNewUIAb;
    public long jsBridgeTimestamp;
    public String mediaPickerPageId;
    public String mediaPreviewPageId;
    public boolean needAllSelectedMediaPreview;
    public boolean needClickItemPreview;
    public boolean radioNeedCheckBox;
    public Map<String, Object> reportMap;
    public String selectedFolderPath;
    public String submitButtonTitle;
    public MediaPickConfig videoPickConfig;

    public static final class MediaPickerParamsObjectBuilder implements Serializable {
        List<Media> alreadySelectedImages;
        boolean croppingNewStyle;
        int finishInAnim;
        int finishOutAnim;
        int fromType;
        public int headResource;
        MediaPickConfig imagePickConfig;
        public boolean isHasPostStatusHeader;
        boolean isNewUIAb;
        public long jsBridgeTimestamp;
        public String mediaPickerPageId;
        public String mediaPreviewPageId;
        Map<String, Object> reportMap;
        String selectedFolderPath;
        String submitButtonTitle;
        MediaPickConfig videoPickConfig;
        boolean canPickBothImageAndVideo = false;
        boolean initialShowSelectFold = false;
        boolean needClickPreview = true;
        boolean needEntiretyPreview = false;
        boolean radioNeedCheckBox = false;

        private MediaPickerParamsObjectBuilder() {
            withFadeFinishAnim(true);
            this.mediaPickerPageId = "p_camera_local_album";
            this.submitButtonTitle = App.f16088e.getString(R$string.f18053I0);
        }

        public static MediaPickerParamsObjectBuilder aBuilder() {
            return new MediaPickerParamsObjectBuilder();
        }

        public MediaPickerParamsObjectBuilder addReportMap(Map<String, Object> map) {
            this.reportMap = map;
            return this;
        }

        public MediaPickerParamsObject build() {
            MediaPickerParamsObject mediaPickerParamsObject = new MediaPickerParamsObject();
            mediaPickerParamsObject.canPickBothImageAndVideo = this.canPickBothImageAndVideo;
            mediaPickerParamsObject.imagePickConfig = this.imagePickConfig;
            mediaPickerParamsObject.videoPickConfig = this.videoPickConfig;
            mediaPickerParamsObject.needAllSelectedMediaPreview = this.needEntiretyPreview;
            mediaPickerParamsObject.initialShowSelectFold = this.initialShowSelectFold;
            mediaPickerParamsObject.submitButtonTitle = this.submitButtonTitle;
            mediaPickerParamsObject.fromType = this.fromType;
            mediaPickerParamsObject.croppingNewStyle = this.croppingNewStyle;
            mediaPickerParamsObject.alreadySelectedImages = this.alreadySelectedImages;
            mediaPickerParamsObject.needClickItemPreview = this.needClickPreview;
            mediaPickerParamsObject.selectedFolderPath = this.selectedFolderPath;
            mediaPickerParamsObject.finishInAnim = this.finishInAnim;
            mediaPickerParamsObject.finishOutAnim = this.finishOutAnim;
            mediaPickerParamsObject.radioNeedCheckBox = this.radioNeedCheckBox;
            mediaPickerParamsObject.mediaPickerPageId = this.mediaPickerPageId;
            mediaPickerParamsObject.mediaPreviewPageId = this.mediaPreviewPageId;
            mediaPickerParamsObject.jsBridgeTimestamp = this.jsBridgeTimestamp;
            mediaPickerParamsObject.isHasPostStatusHeader = this.isHasPostStatusHeader;
            mediaPickerParamsObject.headResource = this.headResource;
            mediaPickerParamsObject.reportMap = this.reportMap;
            mediaPickerParamsObject.isNewUIAb = this.isNewUIAb;
            return mediaPickerParamsObject;
        }

        public MediaPickerParamsObjectBuilder canPickBothImageAndVideo(boolean z) {
            this.canPickBothImageAndVideo = z;
            return this;
        }

        public MediaPickerParamsObjectBuilder initialShowSelectFoldPage() {
            this.initialShowSelectFold = true;
            return this;
        }

        public MediaPickerParamsObjectBuilder jsBridgeTimestamp(long j) {
            this.jsBridgeTimestamp = j;
            return this;
        }

        public MediaPickerParamsObjectBuilder needAllSelectedMediaPreview() {
            this.needEntiretyPreview = true;
            return this;
        }

        public MediaPickerParamsObjectBuilder needClickPreview(boolean z) {
            this.needClickPreview = z;
            return this;
        }

        public MediaPickerParamsObjectBuilder radioNeedCheckBox() {
            this.radioNeedCheckBox = true;
            return this;
        }

        public MediaPickerParamsObjectBuilder setCroppingNewStyle(boolean z) {
            this.croppingNewStyle = z;
            return this;
        }

        public MediaPickerParamsObjectBuilder withAlreadySelectedMedia(List<Media> list) {
            this.alreadySelectedImages = list;
            return this;
        }

        public MediaPickerParamsObjectBuilder withFadeFinishAnim(boolean z) {
            if (z) {
                this.finishInAnim = w7c0.f187732b;
                this.finishOutAnim = w7c0.f187735e;
            }
            return this;
        }

        public MediaPickerParamsObjectBuilder withFinishTransAnim(int i, int i2) {
            this.finishInAnim = i;
            this.finishOutAnim = i2;
            return this;
        }

        public MediaPickerParamsObjectBuilder withFromType(int i) {
            this.fromType = i;
            return this;
        }

        public MediaPickerParamsObjectBuilder withHeadResource(int i) {
            this.headResource = i;
            return this;
        }

        public MediaPickerParamsObjectBuilder withImagePickConfig(MediaPickConfig mediaPickConfig) {
            this.imagePickConfig = mediaPickConfig;
            return this;
        }

        public MediaPickerParamsObjectBuilder withIsHasPostStatusHeader(boolean z) {
            this.isHasPostStatusHeader = z;
            return this;
        }

        public MediaPickerParamsObjectBuilder withIsNewUIAb(boolean z) {
            this.isNewUIAb = z;
            return this;
        }

        public MediaPickerParamsObjectBuilder withMediaPickerPageId(String str) {
            this.mediaPickerPageId = str;
            return this;
        }

        public MediaPickerParamsObjectBuilder withMediaPreviewPageId(String str) {
            this.mediaPreviewPageId = str;
            return this;
        }

        public MediaPickerParamsObjectBuilder withSelectedFolderPath(String str) {
            this.selectedFolderPath = str;
            return this;
        }

        public MediaPickerParamsObjectBuilder withSubmitButtonTitle(String str) {
            this.submitButtonTitle = str;
            return this;
        }

        public MediaPickerParamsObjectBuilder withVideoPickConfig(MediaPickConfig mediaPickConfig) {
            this.videoPickConfig = mediaPickConfig;
            return this;
        }
    }

    public boolean canClickSubmitInPreviewWhenNoSelectedMedia(Media media) {
        if (media instanceof Video) {
            MediaPickConfig mediaPickConfig = this.videoPickConfig;
            return mediaPickConfig != null && mediaPickConfig.canClickSubmitInPreviewWhenNoSelectedMedia;
        }
        MediaPickConfig mediaPickConfig2 = this.imagePickConfig;
        return mediaPickConfig2 != null && mediaPickConfig2.canClickSubmitInPreviewWhenNoSelectedMedia;
    }

    public int getMaxImageSelectCount() {
        MediaPickConfig mediaPickConfig = this.imagePickConfig;
        if (mediaPickConfig != null) {
            return mediaPickConfig.maxPickCount;
        }
        return 0;
    }

    public int getMaxVideoSelectCount() {
        MediaPickConfig mediaPickConfig = this.videoPickConfig;
        if (mediaPickConfig != null) {
            return mediaPickConfig.maxPickCount;
        }
        return 0;
    }

    public int getMinImageSelectCount() {
        MediaPickConfig mediaPickConfig = this.imagePickConfig;
        if (mediaPickConfig != null) {
            return mediaPickConfig.minPickCount;
        }
        return 0;
    }

    public boolean isRadio() {
        MediaPickConfig mediaPickConfig = this.imagePickConfig;
        boolean zIsRadio = mediaPickConfig != null ? mediaPickConfig.isRadio() : true;
        MediaPickConfig mediaPickConfig2 = this.videoPickConfig;
        return zIsRadio && (mediaPickConfig2 != null ? mediaPickConfig2.isRadio() : true);
    }
}
