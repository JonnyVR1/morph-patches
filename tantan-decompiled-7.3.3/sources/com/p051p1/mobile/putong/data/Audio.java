package com.p051p1.mobile.putong.data;

import androidx.annotation.Nullable;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.Audio;
import com.p051p1.mobile.putong.data.IdealTag;
import com.p051p1.mobile.putong.data.MediaLabel;
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
import p153l.uqb0;

/* JADX INFO: loaded from: classes12.dex */
public class Audio extends Media implements Cloneable, Serializable {
    public static ProtobufAdapter<Audio> PROTOBUF_ADAPTER = new MessageNanoAdapter<Audio>() { // from class: com.p1.mobile.putong.data.Audio.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Audio audio) {
            MediaLocalStatus mediaLocalStatus = audio.status;
            int iM17281h = mediaLocalStatus != null ? CodedOutputByteBufferNano.m17281h(1, mediaLocalStatus.ordinal()) : 0;
            String str = audio.url;
            if (str != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(2, str);
            }
            String str2 = audio.urlKey;
            if (str2 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(3, str2);
            }
            String str3 = audio.name;
            if (str3 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(4, str3);
            }
            String str4 = audio.mediaType;
            if (str4 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(5, str4);
            }
            MediaMeta mediaMeta = audio.meta;
            if (mediaMeta != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(6, mediaMeta, MediaMeta.PROTOBUF_ADAPTER);
            }
            String str5 = audio.originUrl;
            if (str5 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(7, str5);
            }
            int iM17275b = iM17281h + CodedOutputByteBufferNano.m17275b(9, audio.isPortrait);
            List<MediaLabel> list = audio.labels;
            if (list != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(10, list, MediaLabel.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = audio.tags;
            if (list2 != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(11, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<IdealTag> list3 = audio.tagIdealInfo;
            if (list3 != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(12, list3, IdealTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            int iM17279f = iM17275b + CodedOutputByteBufferNano.m17279f(51, audio.duration) + CodedOutputByteBufferNano.m17275b(52, audio.audioRead);
            GaussianBlurParameters gaussianBlurParameters = audio.gaussianBlurParameters;
            if (gaussianBlurParameters != null) {
                iM17279f += CodedOutputByteBufferNano.m17285l(53, gaussianBlurParameters, GaussianBlurParameters.PROTOBUF_ADAPTER);
            }
            MediaLocalStatus mediaLocalStatus2 = audio.status;
            if (mediaLocalStatus2 != null) {
                iM17279f += CodedOutputByteBufferNano.m17285l(54, mediaLocalStatus2, MediaLocalStatus.PROTOBUF_ADAPTER);
            }
            audio.cachedSize = iM17279f;
            return iM17279f;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Audio parse(nc5 nc5Var) throws IOException {
            Audio audio = new Audio();
            Integer numValueOf = null;
            while (true) {
                switch (nc5Var.m162497u()) {
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
                        numValueOf = Integer.valueOf(nc5Var.m162486j());
                        continue;
                    case 18:
                        audio.url = nc5Var.m162495s();
                        continue;
                    case 26:
                        audio.urlKey = nc5Var.m162495s();
                        continue;
                    case 34:
                        audio.name = nc5Var.m162495s();
                        continue;
                    case 42:
                        audio.mediaType = nc5Var.m162495s();
                        continue;
                    case 50:
                        audio.meta = (MediaMeta) nc5Var.m162488l(MediaMeta.PROTOBUF_ADAPTER);
                        continue;
                    case 58:
                        audio.originUrl = nc5Var.m162495s();
                        continue;
                    case 72:
                        audio.isPortrait = nc5Var.m162483g();
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        audio.labels = (List) nc5Var.m162488l(MediaLabel.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 90:
                        audio.tags = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case EACTags.FCP_TEMPLATE /* 98 */:
                        audio.tagIdealInfo = (List) nc5Var.m162488l(IdealTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case HttpStatus.REQUEST_ENTITY_TOO_LARGE_413 /* 413 */:
                        audio.duration = nc5Var.m162485i();
                        continue;
                    case HttpStatus.REQUESTED_RANGE_NOT_SATISFIABLE_416 /* 416 */:
                        audio.audioRead = nc5Var.m162483g();
                        continue;
                    case 426:
                        audio.gaussianBlurParameters = (GaussianBlurParameters) nc5Var.m162488l(GaussianBlurParameters.PROTOBUF_ADAPTER);
                        continue;
                    case 434:
                        audio.status = (MediaLocalStatus) nc5Var.m162488l(MediaLocalStatus.PROTOBUF_ADAPTER);
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
                codedOutputByteBufferNano.m17305G(1, mediaLocalStatus.ordinal());
            }
            String str = audio.url;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(2, str);
            }
            String str2 = audio.urlKey;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(3, str2);
            }
            String str3 = audio.name;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(4, str3);
            }
            String str4 = audio.mediaType;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(5, str4);
            }
            MediaMeta mediaMeta = audio.meta;
            if (mediaMeta != null) {
                codedOutputByteBufferNano.m17309K(6, mediaMeta, MediaMeta.PROTOBUF_ADAPTER);
            }
            String str5 = audio.originUrl;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(7, str5);
            }
            codedOutputByteBufferNano.m17299A(9, audio.isPortrait);
            List<MediaLabel> list = audio.labels;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(10, list, MediaLabel.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = audio.tags;
            if (list2 != null) {
                codedOutputByteBufferNano.m17309K(11, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<IdealTag> list3 = audio.tagIdealInfo;
            if (list3 != null) {
                codedOutputByteBufferNano.m17309K(12, list3, IdealTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17303E(51, audio.duration);
            codedOutputByteBufferNano.m17299A(52, audio.audioRead);
            GaussianBlurParameters gaussianBlurParameters = audio.gaussianBlurParameters;
            if (gaussianBlurParameters != null) {
                codedOutputByteBufferNano.m17309K(53, gaussianBlurParameters, GaussianBlurParameters.PROTOBUF_ADAPTER);
            }
            MediaLocalStatus mediaLocalStatus2 = audio.status;
            if (mediaLocalStatus2 != null) {
                codedOutputByteBufferNano.m17309K(54, mediaLocalStatus2, MediaLocalStatus.PROTOBUF_ADAPTER);
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
    public static /* synthetic */ MediaLabel m60856b(MediaLabel mediaLabel) {
        return mediaLabel;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m60857c(String str) {
        return str;
    }

    public static Audio new_() {
        Audio audio = new Audio();
        audio.nullCheck();
        return audio;
    }

    @Override // com.p051p1.mobile.putong.data.Media, com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Audio mo225055clone() {
        Audio audio = new Audio();
        audio.status = this.status;
        audio.url = this.url;
        audio.urlKey = this.urlKey;
        audio.name = this.name;
        audio.mediaType = this.mediaType;
        MediaMeta mediaMeta = this.meta;
        if (mediaMeta != null) {
            audio.meta = mediaMeta.mo225055clone();
        }
        audio.originUrl = this.originUrl;
        audio.isPortrait = this.isPortrait;
        List<MediaLabel> list = this.labels;
        if (list != null) {
            audio.labels = ValueObject.util_map(list, new qcj() { // from class: l.aa1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Audio.m60856b((MediaLabel) obj);
                }
            });
        }
        List<String> list2 = this.tags;
        if (list2 != null) {
            audio.tags = ValueObject.util_map(list2, new qcj() { // from class: l.ba1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Audio.m60857c((String) obj);
                }
            });
        }
        List<IdealTag> list3 = this.tagIdealInfo;
        if (list3 != null) {
            audio.tagIdealInfo = ValueObject.util_map(list3, new qcj() { // from class: l.ca1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((IdealTag) obj).mo225055clone();
                }
            });
        }
        audio.duration = this.duration;
        audio.audioRead = this.audioRead;
        GaussianBlurParameters gaussianBlurParameters = this.gaussianBlurParameters;
        if (gaussianBlurParameters != null) {
            audio.gaussianBlurParameters = gaussianBlurParameters.mo225055clone();
        }
        return audio;
    }

    @Override // com.p051p1.mobile.putong.data.Media
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

    @Override // com.p051p1.mobile.putong.data.Media, com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "audio";
    }

    @Override // com.p051p1.mobile.putong.data.Media
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

    @Override // com.p051p1.mobile.putong.data.Media, com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        super.nullCheck();
    }

    public String withExtension() {
        CommonAssetsSettings commonAssetsSettingsM144645g = uqb0.f180392X.m144645g();
        if (commonAssetsSettingsM144645g != null && commonAssetsSettingsM144645g.androidAudioExt) {
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
