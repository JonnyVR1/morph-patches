package com.p000p1.mobile.putong.data;

import androidx.annotation.Nullable;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.Audio;
import com.p000p1.mobile.putong.data.IdealTag;
import com.p000p1.mobile.putong.data.MediaLabel;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import l.nb5;
import l.qib0;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class Audio extends Media implements Cloneable, Serializable {
    public static ProtobufAdapter<Audio> PROTOBUF_ADAPTER = new MessageNanoAdapter<Audio>() { // from class: com.p1.mobile.putong.data.Audio.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Audio audio) {
            MediaLocalStatus mediaLocalStatus = audio.status;
            int iH = mediaLocalStatus != null ? CodedOutputByteBufferNano.h(1, mediaLocalStatus.ordinal()) : 0;
            String str = audio.url;
            if (str != null) {
                iH += CodedOutputByteBufferNano.o(2, str);
            }
            String str2 = audio.urlKey;
            if (str2 != null) {
                iH += CodedOutputByteBufferNano.o(3, str2);
            }
            String str3 = audio.name;
            if (str3 != null) {
                iH += CodedOutputByteBufferNano.o(4, str3);
            }
            String str4 = audio.mediaType;
            if (str4 != null) {
                iH += CodedOutputByteBufferNano.o(5, str4);
            }
            MediaMeta mediaMeta = audio.meta;
            if (mediaMeta != null) {
                iH += CodedOutputByteBufferNano.l(6, mediaMeta, MediaMeta.PROTOBUF_ADAPTER);
            }
            String str5 = audio.originUrl;
            if (str5 != null) {
                iH += CodedOutputByteBufferNano.o(7, str5);
            }
            int iB = iH + CodedOutputByteBufferNano.b(9, audio.isPortrait);
            List<MediaLabel> list = audio.labels;
            if (list != null) {
                iB += CodedOutputByteBufferNano.l(10, list, MediaLabel.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = audio.tags;
            if (list2 != null) {
                iB += CodedOutputByteBufferNano.l(11, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<IdealTag> list3 = audio.tagIdealInfo;
            if (list3 != null) {
                iB += CodedOutputByteBufferNano.l(12, list3, IdealTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            int iF = iB + CodedOutputByteBufferNano.f(51, audio.duration) + CodedOutputByteBufferNano.b(52, audio.audioRead);
            GaussianBlurParameters gaussianBlurParameters = audio.gaussianBlurParameters;
            if (gaussianBlurParameters != null) {
                iF += CodedOutputByteBufferNano.l(53, gaussianBlurParameters, GaussianBlurParameters.PROTOBUF_ADAPTER);
            }
            MediaLocalStatus mediaLocalStatus2 = audio.status;
            if (mediaLocalStatus2 != null) {
                iF += CodedOutputByteBufferNano.l(54, mediaLocalStatus2, MediaLocalStatus.PROTOBUF_ADAPTER);
            }
            ((MessageNano) audio).cachedSize = iF;
            return iF;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Audio m17715parse(nb5 nb5Var) throws IOException {
            Audio audio = new Audio();
            Integer numValueOf = null;
            while (true) {
                switch (nb5Var.u()) {
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
                        numValueOf = Integer.valueOf(nb5Var.j());
                        continue;
                    case 18:
                        audio.url = nb5Var.s();
                        continue;
                    case 26:
                        audio.urlKey = nb5Var.s();
                        continue;
                    case 34:
                        audio.name = nb5Var.s();
                        continue;
                    case 42:
                        audio.mediaType = nb5Var.s();
                        continue;
                    case 50:
                        audio.meta = (MediaMeta) nb5Var.l(MediaMeta.PROTOBUF_ADAPTER);
                        continue;
                    case 58:
                        audio.originUrl = nb5Var.s();
                        continue;
                    case 72:
                        audio.isPortrait = nb5Var.g();
                        continue;
                    case 82:
                        audio.labels = (List) nb5Var.l(MediaLabel.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 90:
                        audio.tags = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 98:
                        audio.tagIdealInfo = (List) nb5Var.l(IdealTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 413:
                        audio.duration = nb5Var.i();
                        continue;
                    case 416:
                        audio.audioRead = nb5Var.g();
                        continue;
                    case 426:
                        audio.gaussianBlurParameters = (GaussianBlurParameters) nb5Var.l(GaussianBlurParameters.PROTOBUF_ADAPTER);
                        continue;
                    case 434:
                        audio.status = (MediaLocalStatus) nb5Var.l(MediaLocalStatus.PROTOBUF_ADAPTER);
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

        public void serialize(Audio audio, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            MediaLocalStatus mediaLocalStatus = audio.status;
            if (mediaLocalStatus != null) {
                codedOutputByteBufferNano.G(1, mediaLocalStatus.ordinal());
            }
            String str = audio.url;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            String str2 = audio.urlKey;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
            String str3 = audio.name;
            if (str3 != null) {
                codedOutputByteBufferNano.R(4, str3);
            }
            String str4 = audio.mediaType;
            if (str4 != null) {
                codedOutputByteBufferNano.R(5, str4);
            }
            MediaMeta mediaMeta = audio.meta;
            if (mediaMeta != null) {
                codedOutputByteBufferNano.K(6, mediaMeta, MediaMeta.PROTOBUF_ADAPTER);
            }
            String str5 = audio.originUrl;
            if (str5 != null) {
                codedOutputByteBufferNano.R(7, str5);
            }
            codedOutputByteBufferNano.A(9, audio.isPortrait);
            List<MediaLabel> list = audio.labels;
            if (list != null) {
                codedOutputByteBufferNano.K(10, list, MediaLabel.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = audio.tags;
            if (list2 != null) {
                codedOutputByteBufferNano.K(11, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<IdealTag> list3 = audio.tagIdealInfo;
            if (list3 != null) {
                codedOutputByteBufferNano.K(12, list3, IdealTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.E(51, audio.duration);
            codedOutputByteBufferNano.A(52, audio.audioRead);
            GaussianBlurParameters gaussianBlurParameters = audio.gaussianBlurParameters;
            if (gaussianBlurParameters != null) {
                codedOutputByteBufferNano.K(53, gaussianBlurParameters, GaussianBlurParameters.PROTOBUF_ADAPTER);
            }
            MediaLocalStatus mediaLocalStatus2 = audio.status;
            if (mediaLocalStatus2 != null) {
                codedOutputByteBufferNano.K(54, mediaLocalStatus2, MediaLocalStatus.PROTOBUF_ADAPTER);
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
    public static /* synthetic */ MediaLabel m574b(MediaLabel mediaLabel) {
        return mediaLabel;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m575c(String str) {
        return str;
    }

    public static Audio new_() {
        Audio audio = new Audio();
        audio.nullCheck();
        return audio;
    }

    @Override // com.p000p1.mobile.putong.data.Media
    /* JADX INFO: renamed from: clone */
    public Audio mo17714clone() {
        Audio audio = new Audio();
        audio.status = this.status;
        audio.url = this.url;
        audio.urlKey = this.urlKey;
        audio.name = this.name;
        audio.mediaType = this.mediaType;
        MediaMeta mediaMeta = this.meta;
        if (mediaMeta != null) {
            audio.meta = mediaMeta.m18443clone();
        }
        audio.originUrl = this.originUrl;
        audio.isPortrait = this.isPortrait;
        List<MediaLabel> list = this.labels;
        if (list != null) {
            audio.labels = ValueObject.util_map(list, new w9j() { // from class: l.t91
                public final Object call(Object obj) {
                    return Audio.m574b((MediaLabel) obj);
                }
            });
        }
        List<String> list2 = this.tags;
        if (list2 != null) {
            audio.tags = ValueObject.util_map(list2, new w9j() { // from class: l.u91
                public final Object call(Object obj) {
                    return Audio.m575c((String) obj);
                }
            });
        }
        List<IdealTag> list3 = this.tagIdealInfo;
        if (list3 != null) {
            audio.tagIdealInfo = ValueObject.util_map(list3, new w9j() { // from class: l.v91
                public final Object call(Object obj) {
                    return ((IdealTag) obj).m18213clone();
                }
            });
        }
        audio.duration = this.duration;
        audio.audioRead = this.audioRead;
        GaussianBlurParameters gaussianBlurParameters = this.gaussianBlurParameters;
        if (gaussianBlurParameters != null) {
            audio.gaussianBlurParameters = gaussianBlurParameters.m18171clone();
        }
        return audio;
    }

    @Override // com.p000p1.mobile.putong.data.Media
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

    @Override // com.p000p1.mobile.putong.data.Media
    public String getClassParseName() {
        return "audio";
    }

    @Override // com.p000p1.mobile.putong.data.Media
    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((super.hashCode() * 41) + Float.floatToIntBits(this.duration)) * 41) + (this.audioRead ? 1231 : 1237)) * 41;
        GaussianBlurParameters gaussianBlurParameters = this.gaussianBlurParameters;
        int iHashCode2 = iHashCode + (gaussianBlurParameters != null ? gaussianBlurParameters.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.p000p1.mobile.putong.data.Media
    public void nullCheck() {
        super.nullCheck();
    }

    public String withExtension() {
        CommonAssetsSettings commonAssetsSettings = (CommonAssetsSettings) qib0.X.g();
        if (commonAssetsSettings != null && commonAssetsSettings.androidAudioExt) {
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
