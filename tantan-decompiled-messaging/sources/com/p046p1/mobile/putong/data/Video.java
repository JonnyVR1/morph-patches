package com.p046p1.mobile.putong.data;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.IdealTag;
import com.p046p1.mobile.putong.data.MediaLabel;
import com.p046p1.mobile.putong.data.Video;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.jetty.http.HttpStatus;
import org.spongycastle.asn1.eac.EACTags;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes12.dex */
public class Video extends Media implements Cloneable, Serializable {
    public static ProtobufAdapter<Video> PROTOBUF_ADAPTER = new MessageNanoAdapter<Video>() { // from class: com.p1.mobile.putong.data.Video.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Video video) {
            MediaLocalStatus mediaLocalStatus = video.status;
            int iM17226h = mediaLocalStatus != null ? CodedOutputByteBufferNano.m17226h(1, mediaLocalStatus.ordinal()) : 0;
            String str = video.url;
            if (str != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(2, str);
            }
            String str2 = video.urlKey;
            if (str2 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(3, str2);
            }
            String str3 = video.name;
            if (str3 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(4, str3);
            }
            String str4 = video.mediaType;
            if (str4 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(5, str4);
            }
            MediaMeta mediaMeta = video.meta;
            if (mediaMeta != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(6, mediaMeta, MediaMeta.PROTOBUF_ADAPTER);
            }
            String str5 = video.originUrl;
            if (str5 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(7, str5);
            }
            int iM17220b = iM17226h + CodedOutputByteBufferNano.m17220b(9, video.isPortrait);
            List<MediaLabel> list = video.labels;
            if (list != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(10, list, MediaLabel.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = video.tags;
            if (list2 != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(11, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<IdealTag> list3 = video.tagIdealInfo;
            if (list3 != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(12, list3, IdealTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            int iM17224f = iM17220b + CodedOutputByteBufferNano.m17224f(51, video.duration);
            Dimension dimension = video.size;
            if (dimension != null) {
                iM17224f += CodedOutputByteBufferNano.m17230l(52, dimension, Dimension.PROTOBUF_ADAPTER);
            }
            Picture picture = video.cover;
            if (picture != null) {
                iM17224f += CodedOutputByteBufferNano.m17230l(53, picture, Picture.PROTOBUF_ADAPTER);
            }
            Music music = video.music;
            if (music != null) {
                iM17224f += CodedOutputByteBufferNano.m17230l(54, music, Music.PROTOBUF_ADAPTER);
            }
            AudioMedia audioMedia = video.audio;
            if (audioMedia != null) {
                iM17224f += CodedOutputByteBufferNano.m17230l(55, audioMedia, AudioMedia.PROTOBUF_ADAPTER);
            }
            GifMedia gifMedia = video.gif;
            if (gifMedia != null) {
                iM17224f += CodedOutputByteBufferNano.m17230l(56, gifMedia, GifMedia.PROTOBUF_ADAPTER);
            }
            int iM17220b2 = iM17224f + CodedOutputByteBufferNano.m17220b(57, video.isFromNewCamera) + CodedOutputByteBufferNano.m17220b(58, video.isLocalMusic) + CodedOutputByteBufferNano.m17220b(59, video.hasOriginalSound) + CodedOutputByteBufferNano.m17220b(60, video.hasMusic);
            CuttingData cuttingData = video.cutting;
            if (cuttingData != null) {
                iM17220b2 += CodedOutputByteBufferNano.m17230l(61, cuttingData, CuttingData.PROTOBUF_ADAPTER);
            }
            MediaLocalStatus mediaLocalStatus2 = video.status;
            if (mediaLocalStatus2 != null) {
                iM17220b2 += CodedOutputByteBufferNano.m17230l(62, mediaLocalStatus2, MediaLocalStatus.PROTOBUF_ADAPTER);
            }
            video.cachedSize = iM17220b2;
            return iM17220b2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Video parse(nb5 nb5Var) throws IOException {
            Video video = new Video();
            Integer numValueOf = null;
            while (true) {
                switch (nb5Var.m158752u()) {
                    case 0:
                        if (video.status == null && numValueOf != null) {
                            video.status = (MediaLocalStatus) MediaLocalStatus.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (video.status == null) {
                            video.status = (MediaLocalStatus) MediaLocalStatus.JSON_ADAPTER.defaultEnum();
                        }
                        if (video.url == null) {
                            video.url = "";
                        }
                        if (video.urlKey == null) {
                            video.urlKey = "";
                        }
                        if (video.mediaType == null) {
                            video.mediaType = "";
                        }
                        if (video.tags == null) {
                            video.tags = new ArrayList();
                        }
                        if (video.size == null) {
                            video.size = Dimension.new_();
                        }
                        if (video.cover == null) {
                            video.cover = Picture.new_();
                        }
                        break;
                    case 8:
                        numValueOf = Integer.valueOf(nb5Var.m158741j());
                        continue;
                    case 18:
                        video.url = nb5Var.m158750s();
                        continue;
                    case 26:
                        video.urlKey = nb5Var.m158750s();
                        continue;
                    case 34:
                        video.name = nb5Var.m158750s();
                        continue;
                    case 42:
                        video.mediaType = nb5Var.m158750s();
                        continue;
                    case 50:
                        video.meta = (MediaMeta) nb5Var.m158743l(MediaMeta.PROTOBUF_ADAPTER);
                        continue;
                    case 58:
                        video.originUrl = nb5Var.m158750s();
                        continue;
                    case 72:
                        video.isPortrait = nb5Var.m158738g();
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        video.labels = (List) nb5Var.m158743l(MediaLabel.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 90:
                        video.tags = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case EACTags.FCP_TEMPLATE /* 98 */:
                        video.tagIdealInfo = (List) nb5Var.m158743l(IdealTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case HttpStatus.REQUEST_ENTITY_TOO_LARGE_413 /* 413 */:
                        video.duration = nb5Var.m158740i();
                        continue;
                    case 418:
                        video.size = (Dimension) nb5Var.m158743l(Dimension.PROTOBUF_ADAPTER);
                        continue;
                    case 426:
                        video.cover = (Picture) nb5Var.m158743l(Picture.PROTOBUF_ADAPTER);
                        continue;
                    case 434:
                        video.music = (Music) nb5Var.m158743l(Music.PROTOBUF_ADAPTER);
                        continue;
                    case 442:
                        video.audio = (AudioMedia) nb5Var.m158743l(AudioMedia.PROTOBUF_ADAPTER);
                        continue;
                    case 450:
                        video.gif = (GifMedia) nb5Var.m158743l(GifMedia.PROTOBUF_ADAPTER);
                        continue;
                    case 456:
                        video.isFromNewCamera = nb5Var.m158738g();
                        continue;
                    case 464:
                        video.isLocalMusic = nb5Var.m158738g();
                        continue;
                    case 472:
                        video.hasOriginalSound = nb5Var.m158738g();
                        continue;
                    case 480:
                        video.hasMusic = nb5Var.m158738g();
                        continue;
                    case 490:
                        video.cutting = (CuttingData) nb5Var.m158743l(CuttingData.PROTOBUF_ADAPTER);
                        continue;
                    case 498:
                        video.status = (MediaLocalStatus) nb5Var.m158743l(MediaLocalStatus.PROTOBUF_ADAPTER);
                        continue;
                    default:
                        if (video.status == null && numValueOf != null) {
                            video.status = (MediaLocalStatus) MediaLocalStatus.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (video.status == null) {
                            video.status = (MediaLocalStatus) MediaLocalStatus.JSON_ADAPTER.defaultEnum();
                        }
                        if (video.url == null) {
                            video.url = "";
                        }
                        if (video.urlKey == null) {
                            video.urlKey = "";
                        }
                        if (video.mediaType == null) {
                            video.mediaType = "";
                        }
                        if (video.tags == null) {
                            video.tags = new ArrayList();
                        }
                        if (video.size == null) {
                            video.size = Dimension.new_();
                        }
                        if (video.cover == null) {
                            video.cover = Picture.new_();
                            return video;
                        }
                        break;
                }
            }
            return video;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Video video, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            MediaLocalStatus mediaLocalStatus = video.status;
            if (mediaLocalStatus != null) {
                codedOutputByteBufferNano.m17250G(1, mediaLocalStatus.ordinal());
            }
            String str = video.url;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(2, str);
            }
            String str2 = video.urlKey;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(3, str2);
            }
            String str3 = video.name;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(4, str3);
            }
            String str4 = video.mediaType;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(5, str4);
            }
            MediaMeta mediaMeta = video.meta;
            if (mediaMeta != null) {
                codedOutputByteBufferNano.m17254K(6, mediaMeta, MediaMeta.PROTOBUF_ADAPTER);
            }
            String str5 = video.originUrl;
            if (str5 != null) {
                codedOutputByteBufferNano.m17261R(7, str5);
            }
            codedOutputByteBufferNano.m17244A(9, video.isPortrait);
            List<MediaLabel> list = video.labels;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(10, list, MediaLabel.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = video.tags;
            if (list2 != null) {
                codedOutputByteBufferNano.m17254K(11, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<IdealTag> list3 = video.tagIdealInfo;
            if (list3 != null) {
                codedOutputByteBufferNano.m17254K(12, list3, IdealTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17248E(51, video.duration);
            Dimension dimension = video.size;
            if (dimension != null) {
                codedOutputByteBufferNano.m17254K(52, dimension, Dimension.PROTOBUF_ADAPTER);
            }
            Picture picture = video.cover;
            if (picture != null) {
                codedOutputByteBufferNano.m17254K(53, picture, Picture.PROTOBUF_ADAPTER);
            }
            Music music = video.music;
            if (music != null) {
                codedOutputByteBufferNano.m17254K(54, music, Music.PROTOBUF_ADAPTER);
            }
            AudioMedia audioMedia = video.audio;
            if (audioMedia != null) {
                codedOutputByteBufferNano.m17254K(55, audioMedia, AudioMedia.PROTOBUF_ADAPTER);
            }
            GifMedia gifMedia = video.gif;
            if (gifMedia != null) {
                codedOutputByteBufferNano.m17254K(56, gifMedia, GifMedia.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17244A(57, video.isFromNewCamera);
            codedOutputByteBufferNano.m17244A(58, video.isLocalMusic);
            codedOutputByteBufferNano.m17244A(59, video.hasOriginalSound);
            codedOutputByteBufferNano.m17244A(60, video.hasMusic);
            CuttingData cuttingData = video.cutting;
            if (cuttingData != null) {
                codedOutputByteBufferNano.m17254K(61, cuttingData, CuttingData.PROTOBUF_ADAPTER);
            }
            MediaLocalStatus mediaLocalStatus2 = video.status;
            if (mediaLocalStatus2 != null) {
                codedOutputByteBufferNano.m17254K(62, mediaLocalStatus2, MediaLocalStatus.PROTOBUF_ADAPTER);
            }
        }
    };
    public static final String TYPE = "video";

    @Nullable
    @ProtobufIndex(index = 55)
    public AudioMedia audio;

    @NonNull
    @ProtobufIndex(index = 53)
    public Picture cover;

    @Nullable
    @ProtobufIndex(index = 61)
    public CuttingData cutting;

    @ProtobufIndex(index = 51)
    public float duration;

    @Nullable
    @ProtobufIndex(index = 56)
    public GifMedia gif;

    @ProtobufIndex(index = 60)
    public boolean hasMusic;

    @ProtobufIndex(index = 59)
    public boolean hasOriginalSound;

    @ProtobufIndex(index = 57)
    public boolean isFromNewCamera;

    @ProtobufIndex(index = 58)
    public boolean isLocalMusic;

    @Nullable
    @ProtobufIndex(index = 54)
    public Music music;

    @NonNull
    @ProtobufIndex(index = 52)
    public Dimension size;

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m60153b(String str) {
        return str;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ MediaLabel m60154c(MediaLabel mediaLabel) {
        return mediaLabel;
    }

    public static Video new_() {
        Video video = new Video();
        video.nullCheck();
        return video;
    }

    @Override // com.p046p1.mobile.putong.data.Media, com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Video mo223809clone() {
        Video video = new Video();
        video.status = this.status;
        video.url = this.url;
        video.urlKey = this.urlKey;
        video.name = this.name;
        video.mediaType = this.mediaType;
        MediaMeta mediaMeta = this.meta;
        if (mediaMeta != null) {
            video.meta = mediaMeta.mo223809clone();
        }
        video.originUrl = this.originUrl;
        video.isPortrait = this.isPortrait;
        List<MediaLabel> list = this.labels;
        if (list != null) {
            video.labels = ValueObject.util_map(list, new w9j() { // from class: l.x0l0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Video.m60154c((MediaLabel) obj);
                }
            });
        }
        List<String> list2 = this.tags;
        if (list2 != null) {
            video.tags = ValueObject.util_map(list2, new w9j() { // from class: l.y0l0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Video.m60153b((String) obj);
                }
            });
        }
        List<IdealTag> list3 = this.tagIdealInfo;
        if (list3 != null) {
            video.tagIdealInfo = ValueObject.util_map(list3, new w9j() { // from class: l.z0l0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((IdealTag) obj).mo223809clone();
                }
            });
        }
        video.duration = this.duration;
        Dimension dimension = this.size;
        if (dimension != null) {
            video.size = dimension.mo223809clone();
        }
        Picture picture = this.cover;
        if (picture != null) {
            video.cover = picture.mo223809clone();
        }
        Music music = this.music;
        if (music != null) {
            video.music = music.mo223809clone();
        }
        AudioMedia audioMedia = this.audio;
        if (audioMedia != null) {
            video.audio = audioMedia.mo223809clone();
        }
        GifMedia gifMedia = this.gif;
        if (gifMedia != null) {
            video.gif = gifMedia.mo223809clone();
        }
        video.isFromNewCamera = this.isFromNewCamera;
        video.isLocalMusic = this.isLocalMusic;
        video.hasOriginalSound = this.hasOriginalSound;
        video.hasMusic = this.hasMusic;
        CuttingData cuttingData = this.cutting;
        if (cuttingData != null) {
            video.cutting = cuttingData.mo223809clone();
        }
        return video;
    }

    @Override // com.p046p1.mobile.putong.data.Media
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Video)) {
            return false;
        }
        Video video = (Video) obj;
        return super.equals(obj) && this.duration == video.duration && ValueObject.util_equals(this.size, video.size) && ValueObject.util_equals(this.cover, video.cover) && ValueObject.util_equals(this.music, video.music) && ValueObject.util_equals(this.audio, video.audio) && ValueObject.util_equals(this.gif, video.gif) && this.isFromNewCamera == video.isFromNewCamera && this.isLocalMusic == video.isLocalMusic && this.hasOriginalSound == video.hasOriginalSound && this.hasMusic == video.hasMusic && ValueObject.util_equals(this.cutting, video.cutting);
    }

    public String formatAspectRatio(String str) {
        String str2 = this.url;
        if (str2 == null || !str2.startsWith("http")) {
            return this.url;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(withExtension());
        sb.append("?format=");
        if (TextUtils.isEmpty(str)) {
            str = "max_720xX";
        }
        sb.append(str);
        return sb.toString();
    }

    public String formatOriginal() {
        String str = this.url;
        if (str == null || !str.startsWith("http")) {
            return this.url;
        }
        return withExtension() + "?format=originalOFGHLERTH";
    }

    public String formatSquare() {
        String str = this.url;
        if (str == null || !str.startsWith("http")) {
            return this.url;
        }
        return withExtension() + "?format=480x480";
    }

    @Override // com.p046p1.mobile.putong.data.Media, com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "video";
    }

    @Override // com.p046p1.mobile.putong.data.Media
    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((super.hashCode() * 41) + Float.floatToIntBits(this.duration)) * 41;
        Dimension dimension = this.size;
        int iHashCode2 = (iHashCode + (dimension != null ? dimension.hashCode() : 0)) * 41;
        Picture picture = this.cover;
        int iHashCode3 = (iHashCode2 + (picture != null ? picture.hashCode() : 0)) * 41;
        Music music = this.music;
        int iHashCode4 = (iHashCode3 + (music != null ? music.hashCode() : 0)) * 41;
        AudioMedia audioMedia = this.audio;
        int iHashCode5 = (iHashCode4 + (audioMedia != null ? audioMedia.hashCode() : 0)) * 41;
        GifMedia gifMedia = this.gif;
        int iHashCode6 = (((((((((iHashCode5 + (gifMedia != null ? gifMedia.hashCode() : 0)) * 41) + (this.isFromNewCamera ? 1231 : 1237)) * 41) + (this.isLocalMusic ? 1231 : 1237)) * 41) + (this.hasOriginalSound ? 1231 : 1237)) * 41) + (this.hasMusic ? 1231 : 1237)) * 41;
        CuttingData cuttingData = this.cutting;
        int iHashCode7 = iHashCode6 + (cuttingData != null ? cuttingData.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.p046p1.mobile.putong.data.Media, com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        super.nullCheck();
        if (this.size == null) {
            this.size = Dimension.new_();
        }
        if (this.cover == null) {
            this.cover = Picture.new_();
        }
    }

    public String withExtension() {
        boolean zEndsWith = this.url.endsWith(".mp4");
        String str = this.url;
        if (zEndsWith) {
            return str;
        }
        return str + ".mp4";
    }

    public String formatAspectRatio() {
        String str = this.url;
        if (str != null && str.startsWith("http")) {
            return withExtension() + "?format=max_720xX";
        }
        return this.url;
    }
}
