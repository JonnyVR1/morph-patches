package com.p046p1.mobile.putong.core.data;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.p046p1.mobile.putong.data.AIPosition;
import com.p046p1.mobile.putong.data.Dimension;
import com.p046p1.mobile.putong.data.Extensions;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.MediaLocalStatus;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p149l.pkq0;
import p149l.vwb;

/* JADX INFO: loaded from: classes10.dex */
public class ComplimentMessage {
    public static final String MSG_TYPE = "picture_compliment";
    public ComplimentAdditionalData additionalData;
    public List<ComplimentMessageMedia> media;
    public String msgType = "picture_compliment";
    public String roomId;
    public String value;
    public String voiceFrom;

    public static class ComplimentAdditionalData {
        public ComplimentType compliment;
    }

    public static class ComplimentMessageMedia {
        public int[] aiPosition;
        public int duration;
        public boolean isPortrait;
        public String mediaType;
        public int[] size;
        public String status;
        public List<String> tags;
        public String url;
    }

    public static class ComplimentType {
        public String type;
    }

    private static ComplimentMessageMedia convertMedia(Media media) {
        ComplimentMessageMedia complimentMessageMedia = new ComplimentMessageMedia();
        complimentMessageMedia.url = media.url;
        String str = media.mediaType;
        if (str == null) {
            str = DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG;
        }
        complimentMessageMedia.mediaType = str;
        boolean z = media instanceof Video;
        complimentMessageMedia.duration = z ? (int) ((Video) media).duration : 0;
        complimentMessageMedia.isPortrait = media.isPortrait;
        MediaLocalStatus mediaLocalStatus = media.status;
        complimentMessageMedia.status = mediaLocalStatus != null ? mediaLocalStatus.toString() : "normal";
        complimentMessageMedia.tags = media.tags != null ? new ArrayList(media.tags) : new ArrayList();
        if (!(media instanceof Picture)) {
            if (!z) {
                complimentMessageMedia.size = new int[]{1080, 1080};
                complimentMessageMedia.aiPosition = new int[]{0, 0};
                return complimentMessageMedia;
            }
            Dimension dimension = ((Video) media).size;
            int[] iArr = new int[2];
            if (dimension != null) {
                iArr[0] = dimension.width;
                iArr[1] = dimension.height;
            } else {
                iArr[0] = 1080;
                iArr[1] = 1080;
            }
            complimentMessageMedia.size = iArr;
            complimentMessageMedia.aiPosition = new int[]{0, 0};
            return complimentMessageMedia;
        }
        Picture picture = (Picture) media;
        Dimension dimension2 = picture.size;
        int[] iArr2 = new int[2];
        if (dimension2 != null) {
            iArr2[0] = dimension2.width;
            iArr2[1] = dimension2.height;
        } else {
            iArr2[0] = 1080;
            iArr2[1] = 1080;
        }
        complimentMessageMedia.size = iArr2;
        AIPosition aIPosition = picture.aiPosition;
        int[] iArr3 = new int[2];
        if (aIPosition != null) {
            iArr3[0] = aIPosition.f38717x;
            iArr3[1] = aIPosition.f38718y;
        } else {
            iArr3[0] = 0;
            iArr3[1] = 0;
        }
        complimentMessageMedia.aiPosition = iArr3;
        return complimentMessageMedia;
    }

    public static ComplimentMessage fromMedia(String str, List<Media> list, boolean z, String str2) {
        ComplimentMessage complimentMessage = new ComplimentMessage();
        complimentMessage.value = str;
        ComplimentAdditionalData complimentAdditionalData = new ComplimentAdditionalData();
        complimentMessage.additionalData = complimentAdditionalData;
        complimentAdditionalData.compliment = new ComplimentType();
        complimentMessage.additionalData.compliment.type = z ? "paid" : "free";
        complimentMessage.media = new ArrayList();
        if (!vwb.m200296J(list)) {
            Iterator<Media> it = list.iterator();
            while (it.hasNext()) {
                complimentMessage.media.add(convertMedia(it.next()));
            }
        }
        try {
            if (!TextUtils.isEmpty(str2)) {
                String[] strArrSplit = str2.split(":");
                if (strArrSplit.length >= 2) {
                    complimentMessage.voiceFrom = strArrSplit[0];
                    complimentMessage.roomId = strArrSplit[1];
                }
            }
        } catch (Exception unused) {
        }
        return complimentMessage;
    }

    private static JSONObject mediaToJson(ComplimentMessageMedia complimentMessageMedia) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = complimentMessageMedia.url;
        if (str == null) {
            str = "";
        }
        jSONObject.put("url", str);
        String str2 = complimentMessageMedia.mediaType;
        if (str2 == null) {
            str2 = DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG;
        }
        jSONObject.put("mediaType", str2);
        jSONObject.put(BLiveOperationTitleShowType.duration, complimentMessageMedia.duration);
        jSONObject.put("isPortrait", complimentMessageMedia.isPortrait);
        String str3 = complimentMessageMedia.status;
        if (str3 == null) {
            str3 = "normal";
        }
        jSONObject.put(NotificationCompat.CATEGORY_STATUS, str3);
        jSONObject.put("tags", complimentMessageMedia.tags != null ? new JSONArray((Collection) complimentMessageMedia.tags) : new JSONArray());
        JSONArray jSONArray = new JSONArray();
        int[] iArr = complimentMessageMedia.size;
        if (iArr == null || iArr.length < 2) {
            jSONArray.put(1080);
            jSONArray.put(1080);
        } else {
            jSONArray.put(iArr[0]);
            jSONArray.put(complimentMessageMedia.size[1]);
        }
        jSONObject.put("size", jSONArray);
        JSONArray jSONArray2 = new JSONArray();
        int[] iArr2 = complimentMessageMedia.aiPosition;
        if (iArr2 == null || iArr2.length < 2) {
            jSONArray2.put(0);
            jSONArray2.put(0);
        } else {
            jSONArray2.put(iArr2[0]);
            jSONArray2.put(complimentMessageMedia.aiPosition[1]);
        }
        jSONObject.put("aiPosition", jSONArray2);
        return jSONObject;
    }

    public String toJson() {
        try {
            JSONObject jSONObject = new JSONObject();
            String str = this.msgType;
            if (str == null) {
                str = "picture_compliment";
            }
            jSONObject.put("msgType", str);
            String str2 = this.value;
            if (str2 == null) {
                str2 = "";
            }
            jSONObject.put("value", str2);
            if (!TextUtils.isEmpty(this.voiceFrom) && !TextUtils.isEmpty(this.roomId)) {
                jSONObject.put("localLikeFrom", this.voiceFrom);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("roomID", this.roomId);
                jSONObject.put(Extensions.TYPE, jSONObject2);
            }
            ComplimentAdditionalData complimentAdditionalData = this.additionalData;
            if (complimentAdditionalData != null && complimentAdditionalData.compliment != null) {
                JSONObject jSONObject3 = new JSONObject();
                String str3 = this.additionalData.compliment.type;
                if (str3 == null) {
                    str3 = "free";
                }
                jSONObject3.put("type", str3);
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("compliment", jSONObject3);
                jSONObject.put("additionalData", jSONObject4);
            }
            JSONArray jSONArray = new JSONArray();
            if (!vwb.m200296J(this.media)) {
                Iterator<ComplimentMessageMedia> it = this.media.iterator();
                while (it.hasNext()) {
                    jSONArray.put(mediaToJson(it.next()));
                }
            }
            jSONObject.put("media", jSONArray);
            return jSONObject.toString();
        } catch (JSONException e) {
            pkq0.m170054a("ComplimentMessage.toJson failed", e);
            return null;
        }
    }
}
