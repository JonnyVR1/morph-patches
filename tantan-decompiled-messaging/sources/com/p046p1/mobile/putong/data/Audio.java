package com.p046p1.mobile.putong.data;

import androidx.annotation.Nullable;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.Audio;
import com.p046p1.mobile.putong.data.IdealTag;
import com.p046p1.mobile.putong.data.MediaLabel;
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
import p149l.qib0;
import p149l.w9j;

/* JADX INFO: loaded from: classes12.dex */
public class Audio extends Media implements Cloneable, Serializable {
    public static ProtobufAdapter<Audio> PROTOBUF_ADAPTER = new MessageNanoAdapter<Audio>() { // from class: com.p1.mobile.putong.data.Audio.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Audio audio) {
            MediaLocalStatus mediaLocalStatus = audio.status;
            int iM17226h = mediaLocalStatus != null ? CodedOutputByteBufferNano.m17226h(1, mediaLocalStatus.ordinal()) : 0;
            String str = audio.url;
            if (str != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(2, str);
            }
            String str2 = audio.urlKey;
            if (str2 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(3, str2);
            }
            String str3 = audio.name;
            if (str3 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(4, str3);
            }
            String str4 = audio.mediaType;
            if (str4 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(5, str4);
            }
            MediaMeta mediaMeta = audio.meta;
            if (mediaMeta != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(6, mediaMeta, MediaMeta.PROTOBUF_ADAPTER);
            }
            String str5 = audio.originUrl;
            if (str5 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(7, str5);
            }
            int iM17220b = iM17226h + CodedOutputByteBufferNano.m17220b(9, audio.isPortrait);
            List<MediaLabel> list = audio.labels;
            if (list != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(10, list, MediaLabel.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = audio.tags;
            if (list2 != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(11, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<IdealTag> list3 = audio.tagIdealInfo;
            if (list3 != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(12, list3, IdealTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            int iM17224f = iM17220b + CodedOutputByteBufferNano.m17224f(51, audio.duration) + CodedOutputByteBufferNano.m17220b(52, audio.audioRead);
            GaussianBlurParameters gaussianBlurParameters = audio.gaussianBlurParameters;
            if (gaussianBlurParameters != null) {
                iM17224f += CodedOutputByteBufferNano.m17230l(53, gaussianBlurParameters, GaussianBlurParameters.PROTOBUF_ADAPTER);
            }
            MediaLocalStatus mediaLocalStatus2 = audio.status;
            if (mediaLocalStatus2 != null) {
                iM17224f += CodedOutputByteBufferNano.m17230l(54, mediaLocalStatus2, MediaLocalStatus.PROTOBUF_ADAPTER);
            }
            audio.cachedSize = iM17224f;
            return iM17224f;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Audio parse(nb5 nb5Var) throws IOException {
            Audio audio = new Audio();
            Integer numValueOf = null;
            while (true) {
                switch (nb5Var.m158752u()) {
                    case 0:
                        if (audio.status == null && numValueOf != null) {
                            audio.status = (MediaLocalStatus) MediaLocalStatus.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (audio.status == null) {
                            audio.status = (MediaLocalStatus) MediaLocalStatus.JSON_ADAPTER.defaultEnum();
                        }
                        if (audio.url == null) {
                            audio.url = "";
                        }
                        if (audio.urlKey == null) {
                            audio.urlKey = "";
                        }
                        if (audio.mediaType == null) {
                            audio.mediaType = "";
                        }
                        if (audio.tags == null) {
                            audio.tags = new ArrayList();
                        }
                        break;
                    case 8:
                        numValueOf = Integer.valueOf(nb5Var.m158741j());
                        continue;
                    case 18:
                        audio.url = nb5Var.m158750s();
                        continue;
                    case 26:
                        audio.urlKey = nb5Var.m158750s();
                        continue;
                    case 34:
                        audio.name = nb5Var.m158750s();
                        continue;
                    case 42:
                        audio.mediaType = nb5Var.m158750s();
                        continue;
                    case 50:
                        audio.meta = (MediaMeta) nb5Var.m158743l(MediaMeta.PROTOBUF_ADAPTER);
                        continue;
                    case 58:
                        audio.originUrl = nb5Var.m158750s();
                        continue;
                    case 72:
                        audio.isPortrait = nb5Var.m158738g();
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        audio.labels = (List) nb5Var.m158743l(MediaLabel.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 90:
                        audio.tags = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case EACTags.FCP_TEMPLATE /* 98 */:
                        audio.tagIdealInfo = (List) nb5Var.m158743l(IdealTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case HttpStatus.REQUEST_ENTITY_TOO_LARGE_413 /* 413 */:
                        audio.duration = nb5Var.m158740i();
                        continue;
                    case HttpStatus.REQUESTED_RANGE_NOT_SATISFIABLE_416 /* 416 */:
                        audio.audioRead = nb5Var.m158738g();
                        continue;
                    case 426:
                        audio.gaussianBlurParameters = (GaussianBlurParameters) nb5Var.m158743l(GaussianBlurParameters.PROTOBUF_ADAPTER);
                        continue;
                    case 434:
                        audio.status = (MediaLocalStatus) nb5Var.m158743l(MediaLocalStatus.PROTOBUF_ADAPTER);
                        continue;
                    default:
                        if (audio.status == null && numValueOf != null) {
                            audio.status = (MediaLocalStatus) MediaLocalStatus.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (audio.status == null) {
                            audio.status = (MediaLocalStatus) MediaLocalStatus.JSON_ADAPTER.defaultEnum();
                        }
                        if (audio.url == null) {
                            audio.url = "";
                        }
                        if (audio.urlKey == null) {
                            audio.urlKey = "";
                        }
                        if (audio.mediaType == null) {
                            audio.mediaType = "";
                        }
                        if (audio.tags == null) {
                            audio.tags = new ArrayList();
                            return audio;
                        }
                        break;
                }
            }
            return audio;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Audio audio, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            MediaLocalStatus mediaLocalStatus = audio.status;
            if (mediaLocalStatus != null) {
                codedOutputByteBufferNano.m17250G(1, mediaLocalStatus.ordinal());
            }
            String str = audio.url;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(2, str);
            }
            String str2 = audio.urlKey;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(3, str2);
            }
            String str3 = audio.name;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(4, str3);
            }
            String str4 = audio.mediaType;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(5, str4);
            }
            MediaMeta mediaMeta = audio.meta;
            if (mediaMeta != null) {
                codedOutputByteBufferNano.m17254K(6, mediaMeta, MediaMeta.PROTOBUF_ADAPTER);
            }
            String str5 = audio.originUrl;
            if (str5 != null) {
                codedOutputByteBufferNano.m17261R(7, str5);
            }
            codedOutputByteBufferNano.m17244A(9, audio.isPortrait);
            List<MediaLabel> list = audio.labels;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(10, list, MediaLabel.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = audio.tags;
            if (list2 != null) {
                codedOutputByteBufferNano.m17254K(11, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<IdealTag> list3 = audio.tagIdealInfo;
            if (list3 != null) {
                codedOutputByteBufferNano.m17254K(12, list3, IdealTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17248E(51, audio.duration);
            codedOutputByteBufferNano.m17244A(52, audio.audioRead);
            GaussianBlurParameters gaussianBlurParameters = audio.gaussianBlurParameters;
            if (gaussianBlurParameters != null) {
                codedOutputByteBufferNano.m17254K(53, gaussianBlurParameters, GaussianBlurParameters.PROTOBUF_ADAPTER);
            }
            MediaLocalStatus mediaLocalStatus2 = audio.status;
            if (mediaLocalStatus2 != null) {
                codedOutputByteBufferNano.m17254K(54, mediaLocalStatus2, MediaLocalStatus.PROTOBUF_ADAPTER);
            }
        }
    };
    public static final String TYPE = "audio";

    @ProtobufIndex(index = 52)
    public boolean audioRead;

    @ProtobufIndex(index = 51)
    public float duration;

    @Nullable
    @ProtobufIndex(index = 53)
    public GaussianBlurParameters gaussianBlurParameters;

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ MediaLabel m59672b(MediaLabel mediaLabel) {
        return mediaLabel;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m59673c(String str) {
        return str;
    }

    public static Audio new_() {
        Audio audio = new Audio();
        audio.nullCheck();
        return audio;
    }

    @Override // com.p046p1.mobile.putong.data.Media, com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Audio mo223809clone() {
        Audio audio = new Audio();
        audio.status = this.status;
        audio.url = this.url;
        audio.urlKey = this.urlKey;
        audio.name = this.name;
        audio.mediaType = this.mediaType;
        MediaMeta mediaMeta = this.meta;
        if (mediaMeta != null) {
            audio.meta = mediaMeta.mo223809clone();
        }
        audio.originUrl = this.originUrl;
        audio.isPortrait = this.isPortrait;
        List<MediaLabel> list = this.labels;
        if (list != null) {
            audio.labels = ValueObject.util_map(list, new w9j() { // from class: l.t91
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Audio.m59672b((MediaLabel) obj);
                }
            });
        }
        List<String> list2 = this.tags;
        if (list2 != null) {
            audio.tags = ValueObject.util_map(list2, new w9j() { // from class: l.u91
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Audio.m59673c((String) obj);
                }
            });
        }
        List<IdealTag> list3 = this.tagIdealInfo;
        if (list3 != null) {
            audio.tagIdealInfo = ValueObject.util_map(list3, new w9j() { // from class: l.v91
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((IdealTag) obj).mo223809clone();
                }
            });
        }
        audio.duration = this.duration;
        audio.audioRead = this.audioRead;
        GaussianBlurParameters gaussianBlurParameters = this.gaussianBlurParameters;
        if (gaussianBlurParameters != null) {
            audio.gaussianBlurParameters = gaussianBlurParameters.mo223809clone();
        }
        return audio;
    }

    @Override // com.p046p1.mobile.putong.data.Media
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Audio)) {
            return false;
        }
        Audio audio = (Audio) obj;
        return super.equals(obj) && this.duration == audio.duration && this.audioRead == audio.audioRead && ValueObject.util_equals(this.gaussianBlurParameters, audio.gaussianBlurParameters);
    }

    public String format32() {
        if (!this.url.startsWith("http")) {
            return this.url;
        }
        return withExtension() + "?format=32";
    }

    @Override // com.p046p1.mobile.putong.data.Media, com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "audio";
    }

    @Override // com.p046p1.mobile.putong.data.Media
    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((super.hashCode() * 41) + Float.floatToIntBits(this.duration)) * 41) + (this.audioRead ? 1231 : 1237)) * 41;
        GaussianBlurParameters gaussianBlurParameters = this.gaussianBlurParameters;
        int iHashCode2 = iHashCode + (gaussianBlurParameters != null ? gaussianBlurParameters.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.p046p1.mobile.putong.data.Media, com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        super.nullCheck();
    }

    public String withExtension() {
        CommonAssetsSettings commonAssetsSettingsM95177g = qib0.f154709X.m95177g();
        if (commonAssetsSettingsM95177g != null && commonAssetsSettingsM95177g.androidAudioExt) {
            boolean zEndsWith = this.url.endsWith(".m4a");
            String str = this.url;
            if (zEndsWith) {
                return str;
            }
            boolean zStartsWith = str.startsWith("http");
            String str2 = this.url;
            if (!zStartsWith) {
                return str2;
            }
            return str2 + ".m4a";
        }
        boolean zEndsWith2 = this.url.endsWith(".mp3");
        String str3 = this.url;
        if (zEndsWith2) {
            return str3;
        }
        boolean zEndsWith3 = str3.endsWith(".m4a");
        String str4 = this.url;
        if (zEndsWith3) {
            return str4.replace(".m4a", ".mp3");
        }
        boolean zStartsWith2 = str4.startsWith("http");
        String str5 = this.url;
        if (!zStartsWith2) {
            return str5;
        }
        return str5 + ".mp3";
    }
}
