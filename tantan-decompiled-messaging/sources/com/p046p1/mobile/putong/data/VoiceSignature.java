package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.VoiceSignature;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes12.dex */
public class VoiceSignature extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "voicesignature";

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> duration;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<String> mediaType;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> url;
    public static ProtobufAdapter<VoiceSignature> PROTOBUF_ADAPTER = new MessageNanoAdapter<VoiceSignature>() { // from class: com.p1.mobile.putong.data.VoiceSignature.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(VoiceSignature voiceSignature) {
            List<String> list = voiceSignature.url;
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<String> list2 = voiceSignature.duration;
            if (list2 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list3 = voiceSignature.mediaType;
            if (list3 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(3, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            voiceSignature.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public VoiceSignature parse(nb5 nb5Var) throws IOException {
            VoiceSignature voiceSignature = new VoiceSignature();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (voiceSignature.url == null) {
                        voiceSignature.url = new ArrayList();
                    }
                    if (voiceSignature.duration == null) {
                        voiceSignature.duration = new ArrayList();
                    }
                    if (voiceSignature.mediaType != null) {
                        break;
                    }
                    voiceSignature.mediaType = new ArrayList();
                    break;
                }
                if (iM158752u == 10) {
                    voiceSignature.url = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iM158752u == 18) {
                    voiceSignature.duration = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM158752u != 26) {
                        if (voiceSignature.url == null) {
                            voiceSignature.url = new ArrayList();
                        }
                        if (voiceSignature.duration == null) {
                            voiceSignature.duration = new ArrayList();
                        }
                        if (voiceSignature.mediaType != null) {
                            break;
                        }
                        voiceSignature.mediaType = new ArrayList();
                        return voiceSignature;
                    }
                    voiceSignature.mediaType = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return voiceSignature;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(VoiceSignature voiceSignature, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = voiceSignature.url;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = voiceSignature.duration;
            if (list2 != null) {
                codedOutputByteBufferNano.m17254K(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list3 = voiceSignature.mediaType;
            if (list3 != null) {
                codedOutputByteBufferNano.m17254K(3, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<VoiceSignature> JSON_ADAPTER = new ObjectJsonAdapter<VoiceSignature>() { // from class: com.p1.mobile.putong.data.VoiceSignature.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return VoiceSignature.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public VoiceSignature newInstance() {
            return new VoiceSignature();
        }

        public boolean parseField(VoiceSignature voiceSignature, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "duration":
                    voiceSignature.duration = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "url":
                    voiceSignature.url = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "mediaType":
                    voiceSignature.mediaType = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(VoiceSignature voiceSignature, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "duration":
                case "url":
                case "mediaType":
                    return true;
                default:
                    return super.parseFieldCheck(voiceSignature, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(VoiceSignature voiceSignature, JsonGenerator jsonGenerator) throws IOException {
            if (voiceSignature.url != null) {
                jsonGenerator.writeFieldName("url");
                JsonAdapter.serializeArray(voiceSignature.url, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (voiceSignature.duration != null) {
                jsonGenerator.writeFieldName(BLiveOperationTitleShowType.duration);
                JsonAdapter.serializeArray(voiceSignature.duration, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (voiceSignature.mediaType != null) {
                jsonGenerator.writeFieldName("mediaType");
                JsonAdapter.serializeArray(voiceSignature.mediaType, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VoiceSignature) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VoiceSignature) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m60169a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m60170b(String str) {
        return str;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m60171c(String str) {
        return str;
    }

    public static VoiceSignature new_() {
        VoiceSignature voiceSignature = new VoiceSignature();
        voiceSignature.nullCheck();
        return voiceSignature;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public VoiceSignature mo223809clone() {
        VoiceSignature voiceSignature = new VoiceSignature();
        List<String> list = this.url;
        if (list != null) {
            voiceSignature.url = ValueObject.util_map(list, new w9j() { // from class: l.fko0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return VoiceSignature.m60171c((String) obj);
                }
            });
        }
        List<String> list2 = this.duration;
        if (list2 != null) {
            voiceSignature.duration = ValueObject.util_map(list2, new w9j() { // from class: l.gko0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return VoiceSignature.m60170b((String) obj);
                }
            });
        }
        List<String> list3 = this.mediaType;
        if (list3 != null) {
            voiceSignature.mediaType = ValueObject.util_map(list3, new w9j() { // from class: l.hko0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return VoiceSignature.m60169a((String) obj);
                }
            });
        }
        return voiceSignature;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VoiceSignature)) {
            return false;
        }
        VoiceSignature voiceSignature = (VoiceSignature) obj;
        return ValueObject.util_equals(this.url, voiceSignature.url) && ValueObject.util_equals(this.duration, voiceSignature.duration) && ValueObject.util_equals(this.mediaType, voiceSignature.mediaType);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        List<String> list = this.url;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<String> list2 = this.duration;
        int iHashCode2 = (iHashCode + (list2 != null ? list2.hashCode() : 0)) * 41;
        List<String> list3 = this.mediaType;
        int iHashCode3 = iHashCode2 + (list3 != null ? list3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.url == null) {
            this.url = new ArrayList();
        }
        if (this.duration == null) {
            this.duration = new ArrayList();
        }
        if (this.mediaType == null) {
            this.mediaType = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
