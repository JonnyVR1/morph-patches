package com.sina.weibo.sdk.api;

import android.os.Bundle;
import com.sina.weibo.sdk.constant.WBConstants;
import com.sina.weibo.sdk.utils.LogUtil;
import java.io.Serializable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public final class WeiboMultiMessage implements Serializable {
    public static int NineImageType = 2;
    public static int OneImageType = 1;
    private static final String TAG = "WeiboMultiMessage";
    public ImageObject imageObject;
    public BaseMediaObject mediaObject;
    public int msgType;
    public MultiImageObject multiImageObject;
    public TextObject textObject;
    public VideoSourceObject videoSourceObject;

    public WeiboMultiMessage(Bundle bundle) {
        toBundle(bundle);
    }

    public boolean checkArgs() {
        TextObject textObject = this.textObject;
        if (textObject != null && !textObject.checkArgs()) {
            LogUtil.m10830e(TAG, "checkArgs fail, textObject is invalid");
            return false;
        }
        ImageObject imageObject = this.imageObject;
        if (imageObject != null && !imageObject.checkArgs()) {
            LogUtil.m10830e(TAG, "checkArgs fail, imageObject is invalid");
            return false;
        }
        BaseMediaObject baseMediaObject = this.mediaObject;
        if (baseMediaObject != null && !baseMediaObject.checkArgs()) {
            LogUtil.m10830e(TAG, "checkArgs fail, mediaObject is invalid");
            return false;
        }
        if (this.textObject != null || this.imageObject != null || this.mediaObject != null) {
            return true;
        }
        LogUtil.m10830e(TAG, "checkArgs fail, textObject and imageObject and mediaObject is null");
        return false;
    }

    public int getMsgType() {
        return this.msgType;
    }

    public void setMsgType(int i) {
        this.msgType = i;
    }

    public Bundle toBundle(Bundle bundle) {
        TextObject textObject = this.textObject;
        if (textObject != null) {
            bundle.putParcelable(WBConstants.Msg.TEXT, textObject);
            bundle.putString(WBConstants.Msg.TEXT_EXTRA, this.textObject.toExtraMediaString());
        } else {
            bundle.putParcelable(WBConstants.Msg.TEXT, null);
            bundle.putString(WBConstants.Msg.TEXT_EXTRA, null);
        }
        ImageObject imageObject = this.imageObject;
        if (imageObject != null) {
            bundle.putParcelable(WBConstants.Msg.IMAGE, imageObject);
            bundle.putString(WBConstants.Msg.IMAGE_EXTRA, this.imageObject.toExtraMediaString());
        } else {
            bundle.putParcelable(WBConstants.Msg.IMAGE, null);
            bundle.putString(WBConstants.Msg.IMAGE_EXTRA, null);
        }
        BaseMediaObject baseMediaObject = this.mediaObject;
        if (baseMediaObject != null) {
            bundle.putParcelable(WBConstants.Msg.MEDIA, baseMediaObject);
            bundle.putString(WBConstants.Msg.MEDIA_EXTRA, this.mediaObject.toExtraMediaString());
        } else {
            bundle.putParcelable(WBConstants.Msg.MEDIA, null);
            bundle.putString(WBConstants.Msg.MEDIA_EXTRA, null);
        }
        MultiImageObject multiImageObject = this.multiImageObject;
        if (multiImageObject != null) {
            bundle.putParcelable(WBConstants.Msg.MULTI_IMAGE, multiImageObject);
        } else {
            bundle.putParcelable(WBConstants.Msg.MULTI_IMAGE, null);
        }
        VideoSourceObject videoSourceObject = this.videoSourceObject;
        if (videoSourceObject != null) {
            bundle.putParcelable(WBConstants.Msg.VIDEO_SOURCE, videoSourceObject);
            return bundle;
        }
        bundle.putParcelable(WBConstants.Msg.VIDEO_SOURCE, null);
        return bundle;
    }

    public WeiboMultiMessage toObject(Bundle bundle) {
        TextObject textObject = (TextObject) bundle.getParcelable(WBConstants.Msg.TEXT);
        this.textObject = textObject;
        if (textObject != null) {
            textObject.toExtraMediaObject(bundle.getString(WBConstants.Msg.TEXT_EXTRA));
        }
        ImageObject imageObject = (ImageObject) bundle.getParcelable(WBConstants.Msg.IMAGE);
        this.imageObject = imageObject;
        if (imageObject != null) {
            imageObject.toExtraMediaObject(bundle.getString(WBConstants.Msg.IMAGE_EXTRA));
        }
        BaseMediaObject baseMediaObject = (BaseMediaObject) bundle.getParcelable(WBConstants.Msg.MEDIA);
        this.mediaObject = baseMediaObject;
        if (baseMediaObject != null) {
            baseMediaObject.toExtraMediaObject(bundle.getString(WBConstants.Msg.MEDIA_EXTRA));
        }
        this.multiImageObject = (MultiImageObject) bundle.getParcelable(WBConstants.Msg.MULTI_IMAGE);
        this.videoSourceObject = (VideoSourceObject) bundle.getParcelable(WBConstants.Msg.VIDEO_SOURCE);
        return this;
    }

    public WeiboMultiMessage() {
    }
}
