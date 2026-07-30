package com.p051p1.mobile.putong.data;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.IdealTag;
import com.p051p1.mobile.putong.data.MediaLabel;
import com.p051p1.mobile.putong.data.Video;
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
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes12.dex */
public class Video extends Media implements Cloneable, Serializable {
    public static ProtobufAdapter<Video> PROTOBUF_ADAPTER = new MessageNanoAdapter<Video>() { // from class: com.p1.mobile.putong.data.Video.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Video video) {
            MediaLocalStatus mediaLocalStatus = video.status;
            int iM17281h = mediaLocalStatus != null ? CodedOutputByteBufferNano.m17281h(1, mediaLocalStatus.ordinal()) : 0;
            String str = video.url;
            if (str != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(2, str);
            }
            String str2 = video.urlKey;
            if (str2 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(3, str2);
            }
            String str3 = video.name;
            if (str3 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(4, str3);
            }
            String str4 = video.mediaType;
            if (str4 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(5, str4);
            }
            MediaMeta mediaMeta = video.meta;
            if (mediaMeta != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(6, mediaMeta, MediaMeta.PROTOBUF_ADAPTER);
            }
            String str5 = video.originUrl;
            if (str5 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(7, str5);
            }
            int iM17275b = iM17281h + CodedOutputByteBufferNano.m17275b(9, video.isPortrait);
            List<MediaLabel> list = video.labels;
            if (list != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(10, list, MediaLabel.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = video.tags;
            if (list2 != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(11, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<IdealTag> list3 = video.tagIdealInfo;
            if (list3 != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(12, list3, IdealTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            int iM17279f = iM17275b + CodedOutputByteBufferNano.m17279f(51, video.duration);
            Dimension dimension = video.size;
            if (dimension != null) {
                iM17279f += CodedOutputByteBufferNano.m17285l(52, dimension, Dimension.PROTOBUF_ADAPTER);
            }
            Picture picture = video.cover;
            if (picture != null) {
                iM17279f += CodedOutputByteBufferNano.m17285l(53, picture, Picture.PROTOBUF_ADAPTER);
            }
            Music music = video.music;
            if (music != null) {
                iM17279f += CodedOutputByteBufferNano.m17285l(54, music, Music.PROTOBUF_ADAPTER);
            }
            AudioMedia audioMedia = video.audio;
            if (audioMedia != null) {
                iM17279f += CodedOutputByteBufferNano.m17285l(55, audioMedia, AudioMedia.PROTOBUF_ADAPTER);
            }
            GifMedia gifMedia = video.gif;
            if (gifMedia != null) {
                iM17279f += CodedOutputByteBufferNano.m17285l(56, gifMedia, GifMedia.PROTOBUF_ADAPTER);
            }
            int iM17275b2 = iM17279f + CodedOutputByteBufferNano.m17275b(57, video.isFromNewCamera) + CodedOutputByteBufferNano.m17275b(58, video.isLocalMusic) + CodedOutputByteBufferNano.m17275b(59, video.hasOriginalSound) + CodedOutputByteBufferNano.m17275b(60, video.hasMusic);
            CuttingData cuttingData = video.cutting;
            if (cuttingData != null) {
                iM17275b2 += CodedOutputByteBufferNano.m17285l(61, cuttingData, CuttingData.PROTOBUF_ADAPTER);
            }
            MediaLocalStatus mediaLocalStatus2 = video.status;
            if (mediaLocalStatus2 != null) {
                iM17275b2 += CodedOutputByteBufferNano.m17285l(62, mediaLocalStatus2, MediaLocalStatus.PROTOBUF_ADAPTER);
            }
            video.cachedSize = iM17275b2;
            return iM17275b2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Video parse(nc5 nc5Var) throws IOException {
            Video video = new Video();
            Integer numValueOf = null;
            while (true) {
                switch (nc5Var.m162497u()) {
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
                        numValueOf = Integer.valueOf(nc5Var.m162486j());
                        continue;
                    case 18:
                        video.url = nc5Var.m162495s();
                        continue;
                    case 26:
                        video.urlKey = nc5Var.m162495s();
                        continue;
                    case 34:
                        video.name = nc5Var.m162495s();
                        continue;
                    case 42:
                        video.mediaType = nc5Var.m162495s();
                        continue;
                    case 50:
                        video.meta = (MediaMeta) nc5Var.m162488l(MediaMeta.PROTOBUF_ADAPTER);
                        continue;
                    case 58:
                        video.originUrl = nc5Var.m162495s();
                        continue;
                    case 72:
                        video.isPortrait = nc5Var.m162483g();
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        video.labels = (List) nc5Var.m162488l(MediaLabel.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 90:
                        video.tags = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case EACTags.FCP_TEMPLATE /* 98 */:
                        video.tagIdealInfo = (List) nc5Var.m162488l(IdealTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case HttpStatus.REQUEST_ENTITY_TOO_LARGE_413 /* 413 */:
                        video.duration = nc5Var.m162485i();
                        continue;
                    case 418:
                        video.size = (Dimension) nc5Var.m162488l(Dimension.PROTOBUF_ADAPTER);
                        continue;
                    case 426:
                        video.cover = (Picture) nc5Var.m162488l(Picture.PROTOBUF_ADAPTER);
                        continue;
                    case 434:
                        video.music = (Music) nc5Var.m162488l(Music.PROTOBUF_ADAPTER);
                        continue;
                    case 442:
                        video.audio = (AudioMedia) nc5Var.m162488l(AudioMedia.PROTOBUF_ADAPTER);
                        continue;
                    case 450:
                        video.gif = (GifMedia) nc5Var.m162488l(GifMedia.PROTOBUF_ADAPTER);
                        continue;
                    case 456:
                        video.isFromNewCamera = nc5Var.m162483g();
                        continue;
                    case 464:
                        video.isLocalMusic = nc5Var.m162483g();
                        continue;
                    case 472:
                        video.hasOriginalSound = nc5Var.m162483g();
                        continue;
                    case 480:
                        video.hasMusic = nc5Var.m162483g();
                        continue;
                    case 490:
                        video.cutting = (CuttingData) nc5Var.m162488l(CuttingData.PROTOBUF_ADAPTER);
                        continue;
                    case 498:
                        video.status = (MediaLocalStatus) nc5Var.m162488l(MediaLocalStatus.PROTOBUF_ADAPTER);
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
                codedOutputByteBufferNano.m17305G(1, mediaLocalStatus.ordinal());
            }
            String str = video.url;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(2, str);
            }
            String str2 = video.urlKey;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(3, str2);
            }
            String str3 = video.name;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(4, str3);
            }
            String str4 = video.mediaType;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(5, str4);
            }
            MediaMeta mediaMeta = video.meta;
            if (mediaMeta != null) {
                codedOutputByteBufferNano.m17309K(6, mediaMeta, MediaMeta.PROTOBUF_ADAPTER);
            }
            String str5 = video.originUrl;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(7, str5);
            }
            codedOutputByteBufferNano.m17299A(9, video.isPortrait);
            List<MediaLabel> list = video.labels;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(10, list, MediaLabel.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = video.tags;
            if (list2 != null) {
                codedOutputByteBufferNano.m17309K(11, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<IdealTag> list3 = video.tagIdealInfo;
            if (list3 != null) {
                codedOutputByteBufferNano.m17309K(12, list3, IdealTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17303E(51, video.duration);
            Dimension dimension = video.size;
            if (dimension != null) {
                codedOutputByteBufferNano.m17309K(52, dimension, Dimension.PROTOBUF_ADAPTER);
            }
            Picture picture = video.cover;
            if (picture != null) {
                codedOutputByteBufferNano.m17309K(53, picture, Picture.PROTOBUF_ADAPTER);
            }
            Music music = video.music;
            if (music != null) {
                codedOutputByteBufferNano.m17309K(54, music, Music.PROTOBUF_ADAPTER);
            }
            AudioMedia audioMedia = video.audio;
            if (audioMedia != null) {
                codedOutputByteBufferNano.m17309K(55, audioMedia, AudioMedia.PROTOBUF_ADAPTER);
            }
            GifMedia gifMedia = video.gif;
            if (gifMedia != null) {
                codedOutputByteBufferNano.m17309K(56, gifMedia, GifMedia.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17299A(57, video.isFromNewCamera);
            codedOutputByteBufferNano.m17299A(58, video.isLocalMusic);
            codedOutputByteBufferNano.m17299A(59, video.hasOriginalSound);
            codedOutputByteBufferNano.m17299A(60, video.hasMusic);
            CuttingData cuttingData = video.cutting;
            if (cuttingData != null) {
                codedOutputByteBufferNano.m17309K(61, cuttingData, CuttingData.PROTOBUF_ADAPTER);
            }
            MediaLocalStatus mediaLocalStatus2 = video.status;
            if (mediaLocalStatus2 != null) {
                codedOutputByteBufferNano.m17309K(62, mediaLocalStatus2, MediaLocalStatus.PROTOBUF_ADAPTER);
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
    public static /* synthetic */ String m61337b(String str) {
        return str;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ MediaLabel m61338c(MediaLabel mediaLabel) {
        return mediaLabel;
    }

    public static Video new_() {
        Video video = new Video();
        video.nullCheck();
        return video;
    }

    @Override // com.p051p1.mobile.putong.data.Media, com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Video mo225055clone() {
        Video video = new Video();
        video.status = this.status;
        video.url = this.url;
        video.urlKey = this.urlKey;
        video.name = this.name;
        video.mediaType = this.mediaType;
        MediaMeta mediaMeta = this.meta;
        if (mediaMeta != null) {
            video.meta = mediaMeta.mo225055clone();
        }
        video.originUrl = this.originUrl;
        video.isPortrait = this.isPortrait;
        List<MediaLabel> list = this.labels;
        if (list != null) {
            video.labels = ValueObject.util_map(list, new qcj() { // from class: l.cal0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Video.m61338c((MediaLabel) obj);
                }
            });
        }
        List<String> list2 = this.tags;
        if (list2 != null) {
            video.tags = ValueObject.util_map(list2, new qcj() { // from class: l.dal0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Video.m61337b((String) obj);
                }
            });
        }
        List<IdealTag> list3 = this.tagIdealInfo;
        if (list3 != null) {
            video.tagIdealInfo = ValueObject.util_map(list3, new qcj() { // from class: l.eal0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((IdealTag) obj).mo225055clone();
                }
            });
        }
        video.duration = this.duration;
        Dimension dimension = this.size;
        if (dimension != null) {
            video.size = dimension.mo225055clone();
        }
        Picture picture = this.cover;
        if (picture != null) {
            video.cover = picture.mo225055clone();
        }
        Music music = this.music;
        if (music != null) {
            video.music = music.mo225055clone();
        }
        AudioMedia audioMedia = this.audio;
        if (audioMedia != null) {
            video.audio = audioMedia.mo225055clone();
        }
        GifMedia gifMedia = this.gif;
        if (gifMedia != null) {
            video.gif = gifMedia.mo225055clone();
        }
        video.isFromNewCamera = this.isFromNewCamera;
        video.isLocalMusic = this.isLocalMusic;
        video.hasOriginalSound = this.hasOriginalSound;
        video.hasMusic = this.hasMusic;
        CuttingData cuttingData = this.cutting;
        if (cuttingData != null) {
            video.cutting = cuttingData.mo225055clone();
        }
        return video;
    }

    @Override // com.p051p1.mobile.putong.data.Media
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

    @Override // com.p051p1.mobile.putong.data.Media, com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "video";
    }

    @Override // com.p051p1.mobile.putong.data.Media
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

    @Override // com.p051p1.mobile.putong.data.Media, com.tantanapp.common.data.ValueObject
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
