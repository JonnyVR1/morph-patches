package com.p051p1.mobile.putong.data;

import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import org.json.JSONException;
import org.json.JSONObject;
import p153l.ecj;
import p153l.nc5;
import p153l.pf60;
import p153l.qv5;

/* JADX INFO: loaded from: classes12.dex */
public abstract class Media extends ValueObject implements Cloneable, Serializable {
    public static ProtobufAdapter<Media> PROTOBUF_ADAPTER = new ProtobufAdapter<Media>() { // from class: com.p1.mobile.putong.data.Media.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Media media) {
            if (media instanceof Picture) {
                return CodedOutputByteBufferNano.m17285l(1, (Picture) media, Picture.PROTOBUF_ADAPTER);
            }
            if (media instanceof Audio) {
                return CodedOutputByteBufferNano.m17285l(3, (Audio) media, Audio.PROTOBUF_ADAPTER);
            }
            if (media instanceof Video) {
                return CodedOutputByteBufferNano.m17285l(2, (Video) media, Video.PROTOBUF_ADAPTER);
            }
            return 0;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int getSize(Media media) {
            if (media instanceof Picture) {
                return CodedOutputByteBufferNano.m17296w(1, (Picture) media, Picture.PROTOBUF_ADAPTER);
            }
            if (media instanceof Audio) {
                return CodedOutputByteBufferNano.m17296w(3, (Audio) media, Audio.PROTOBUF_ADAPTER);
            }
            if (media instanceof Video) {
                return CodedOutputByteBufferNano.m17296w(2, (Video) media, Video.PROTOBUF_ADAPTER);
            }
            return 0;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Media parse(nc5 nc5Var) throws IOException {
            int iM162497u = nc5Var.m162497u();
            if (iM162497u == 10) {
                return (Media) nc5Var.m162488l(Picture.PROTOBUF_ADAPTER);
            }
            if (iM162497u == 18) {
                return (Media) nc5Var.m162488l(Video.PROTOBUF_ADAPTER);
            }
            if (iM162497u != 26) {
                return null;
            }
            return (Media) nc5Var.m162488l(Audio.PROTOBUF_ADAPTER);
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Media media, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            if (media instanceof Picture) {
                codedOutputByteBufferNano.m17309K(1, (Picture) media, Picture.PROTOBUF_ADAPTER);
            } else if (media instanceof Audio) {
                codedOutputByteBufferNano.m17309K(3, (Audio) media, Audio.PROTOBUF_ADAPTER);
            } else if (media instanceof Video) {
                codedOutputByteBufferNano.m17309K(2, (Video) media, Video.PROTOBUF_ADAPTER);
            }
        }
    };
    private static String TANTAN_CDN_URL = "https://auto.tancdn.com";
    public static final String TYPE = "media";
    public int compressType;

    @ProtobufIndex(index = 9)
    public boolean isPortrait;

    @Nullable
    @ProtobufIndex(index = 10)
    public List<MediaLabel> labels;
    public long mediaFileLength;

    @NonNull
    @ProtobufIndex(index = 5)
    public String mediaType;

    @Nullable
    @ProtobufIndex(index = 6)
    public MediaMeta meta;

    @Nullable
    @ProtobufIndex(index = 4)
    public String name;
    public ArrayList<Object> netReqTimeParams;
    public String okPerformanceKey;

    @Nullable
    @ProtobufIndex(index = 7)
    public String originUrl;
    public long processEndTime;
    public long processStartTime;

    @NonNull
    @ProtobufIndex(index = 1)
    public MediaLocalStatus status;

    @Nullable
    @ProtobufIndex(index = 12)
    public List<IdealTag> tagIdealInfo;

    @NonNull
    @ProtobufIndex(index = 11)
    public List<String> tags;
    public String tempUrl;
    public long uploadEndTime;
    public long uploadStartTime;

    @NonNull
    @ProtobufIndex(index = 2)
    public String url;

    @NonNull
    @ProtobufIndex(index = 3)
    public String urlKey;

    public static String URL_TO_CACHEKEY(String str) {
        return ecj.m120376J(str);
    }

    private void add(ArrayList<pf60<String, String>> arrayList, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        arrayList.add(new pf60<>(str, str2));
    }

    public static Media fromUrl(String str) {
        try {
            URL url = new URL(str);
            String[] strArrSplit = url.getPath().substring(1).split("/");
            if (isValidCloudMediaURL(url)) {
                JSONObject jSONObject = new JSONObject(new String(Base64.decode(strArrSplit[strArrSplit.length - 1], 0), StandardCharsets.UTF_8));
                String string = jSONObject.getString("mt");
                int i = jSONObject.getInt("w");
                int i2 = jSONObject.getInt("h");
                if (isImage(string)) {
                    Picture pictureNew_ = Picture.new_();
                    pictureNew_.url = str;
                    pictureNew_.mediaType = string;
                    Dimension dimension = pictureNew_.size;
                    dimension.width = i;
                    dimension.height = i2;
                    return pictureNew_;
                }
                if (isVideo(string)) {
                    Video videoNew_ = Video.new_();
                    videoNew_.url = str;
                    videoNew_.mediaType = string;
                    Dimension dimension2 = videoNew_.size;
                    dimension2.width = i;
                    dimension2.height = i2;
                    return videoNew_;
                }
            }
        } catch (Exception unused) {
        }
        Picture pictureNew_2 = Picture.new_();
        pictureNew_2.url = str;
        return pictureNew_2;
    }

    public static boolean isImage(String str) {
        return TextUtils.equals(str, "image/jpg") || TextUtils.equals(str, DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG) || TextUtils.equals(str, DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_PNG) || TextUtils.equals(str, "image/gif") || TextUtils.equals(str, "image/webp") || TextUtils.equals(str, "image/heif") || TextUtils.equals(str, "image/heic");
    }

    public static boolean isValidCloudMediaURL(URL url) {
        try {
            return (qv5.f159703g.contains(url.getHost()) || TANTAN_CDN_URL.contains(url.getHost())) && url.getPath().substring(1).split("/").length >= 3;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isVideo(String str) {
        return TextUtils.equals(str, DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_MPEG_4);
    }

    public static void setFocusPoint(Media media, float[] fArr) {
        AIPosition aIPosition;
        if (fArr == null || fArr.length < 2) {
            return;
        }
        fArr[0] = 0.5f;
        fArr[1] = 0.5f;
        if (media instanceof Picture) {
            Picture picture = (Picture) media;
            if (picture.size == null || (aIPosition = picture.aiPosition) == null) {
                return;
            }
            int i = aIPosition.f39565x;
            int i2 = aIPosition.f39566y;
            if (i == 0) {
                fArr[0] = 0.0f;
            } else if (i == 1) {
                fArr[0] = 0.5f;
            } else if (i == 2) {
                fArr[0] = 1.0f;
            }
            if (i2 == 0) {
                fArr[1] = 0.0f;
            } else if (i2 == 1) {
                fArr[1] = 0.5f;
            } else if (i2 == 2) {
                fArr[1] = 1.0f;
            }
        }
    }

    public void buildMediaLogParmas(ArrayList<pf60<String, String>> arrayList) {
        MediaMeta mediaMeta = this.meta;
        if (mediaMeta == null) {
            return;
        }
        add(arrayList, "type", mediaMeta.type);
        add(arrayList, "source", this.meta.source);
        add(arrayList, "proportion", this.meta.proportion);
        add(arrayList, "camera", this.meta.camera);
        add(arrayList, "sticker", this.meta.sticker);
        add(arrayList, "filter", this.meta.filter);
        if (this instanceof Video) {
            add(arrayList, "musicreference", this.meta.musicReference);
            add(arrayList, "musicid", this.meta.musicId);
            add(arrayList, "hasaudio", this.meta.hasAudio ? "yes" : "no");
            add(arrayList, "origin", this.meta.isSameMusic ? "yes" : "no");
        }
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public abstract Media mo225055clone();

    public Picture cover() {
        if (this instanceof Video) {
            return ((Video) this).cover;
        }
        if (this instanceof Picture) {
            return (Picture) this;
        }
        return null;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Media)) {
            return false;
        }
        Media media = (Media) obj;
        return ValueObject.util_equals(this.status, media.status) && ((this.urlKey == null && media.urlKey == null && ValueObject.util_equals(this.url, media.url)) || !((str = this.urlKey) == null || (str2 = media.urlKey) == null || !ValueObject.util_equals(str, str2))) && ValueObject.util_equals(this.name, media.name) && ValueObject.util_equals(this.mediaType, media.mediaType) && ValueObject.util_equals(this.meta, media.meta) && ValueObject.util_equals(this.originUrl, media.originUrl) && this.isPortrait == media.isPortrait && ValueObject.util_equals(this.labels, media.labels) && ValueObject.util_equals(this.tags, media.tags) && ValueObject.util_equals(this.tagIdealInfo, media.tagIdealInfo);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "media";
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        MediaLocalStatus mediaLocalStatus = this.status;
        int iHashCode = (i2 + (mediaLocalStatus != null ? mediaLocalStatus.hashCode() : 0)) * 41;
        String str = this.urlKey;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.mediaType;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41;
        MediaMeta mediaMeta = this.meta;
        int iHashCode5 = (iHashCode4 + (mediaMeta != null ? mediaMeta.hashCode() : 0)) * 41;
        String str4 = this.originUrl;
        int iHashCode6 = (((iHashCode5 + (str4 != null ? str4.hashCode() : 0)) * 41) + (this.isPortrait ? 1231 : 1237)) * 41;
        List<MediaLabel> list = this.labels;
        int iHashCode7 = (iHashCode6 + (list != null ? list.hashCode() : 0)) * 41;
        List<String> list2 = this.tags;
        int iHashCode8 = (iHashCode7 + (list2 != null ? list2.hashCode() : 0)) * 41;
        List<IdealTag> list3 = this.tagIdealInfo;
        int iHashCode9 = iHashCode8 + (list3 != null ? list3.hashCode() : 0);
        this.hashCode = iHashCode9;
        return iHashCode9;
    }

    public boolean isFromShoot() {
        MediaMeta mediaMeta = this.meta;
        return mediaMeta != null && TextUtils.equals(mediaMeta.source, "shoot");
    }

    public boolean isSameOrigin(Media media) {
        return this.url.equals(media.url) || this.url.equals(media.originUrl);
    }

    public void newBuildMediaLogParmas(JSONObject jSONObject) {
        try {
            MediaMeta mediaMeta = this.meta;
            if (mediaMeta == null) {
                return;
            }
            jSONObject.put("moment_type", mediaMeta.type);
            jSONObject.put("moment_source", this.meta.source);
            jSONObject.put("moment_proportion", this.meta.proportion);
            jSONObject.put("moment_camera", this.meta.camera);
            jSONObject.put("moment_sticker", this.meta.sticker);
            jSONObject.put("filter_id", this.meta.filter);
            if (this instanceof Video) {
                jSONObject.put("moment_musicreference", this.meta.musicReference);
                jSONObject.put("moment_musicid", this.meta.musicId);
                jSONObject.put("moment_hasaudio", this.meta.hasAudio ? "yes" : "no");
                jSONObject.put("moment_origin", this.meta.isSameMusic ? "yes" : "no");
            }
        } catch (JSONException unused) {
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.status == null) {
            this.status = (MediaLocalStatus) MediaLocalStatus.JSON_ADAPTER.defaultEnum();
        }
        if (this.url == null) {
            this.url = "";
        }
        if (this.urlKey == null) {
            this.urlKey = "";
        }
        if (this.mediaType == null) {
            this.mediaType = "";
        }
        if (this.tags == null) {
            this.tags = new ArrayList();
        }
    }
}
