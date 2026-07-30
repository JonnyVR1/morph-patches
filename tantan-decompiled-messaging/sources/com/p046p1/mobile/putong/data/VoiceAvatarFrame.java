package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.VoiceAvatarFrame;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
public class VoiceAvatarFrame extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "voiceavatarframe";

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> expiredTime;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> f38835id;
    public static ProtobufAdapter<VoiceAvatarFrame> PROTOBUF_ADAPTER = new MessageNanoAdapter<VoiceAvatarFrame>() { // from class: com.p1.mobile.putong.data.VoiceAvatarFrame.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(VoiceAvatarFrame voiceAvatarFrame) {
            List<String> list = voiceAvatarFrame.f38835id;
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<String> list2 = voiceAvatarFrame.expiredTime;
            if (list2 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            voiceAvatarFrame.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public VoiceAvatarFrame parse(nb5 nb5Var) throws IOException {
            VoiceAvatarFrame voiceAvatarFrame = new VoiceAvatarFrame();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (voiceAvatarFrame.f38835id == null) {
                        voiceAvatarFrame.f38835id = new ArrayList();
                    }
                    if (voiceAvatarFrame.expiredTime != null) {
                        break;
                    }
                    voiceAvatarFrame.expiredTime = new ArrayList();
                    break;
                }
                if (iM158752u == 10) {
                    voiceAvatarFrame.f38835id = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM158752u != 18) {
                        if (voiceAvatarFrame.f38835id == null) {
                            voiceAvatarFrame.f38835id = new ArrayList();
                        }
                        if (voiceAvatarFrame.expiredTime != null) {
                            break;
                        }
                        voiceAvatarFrame.expiredTime = new ArrayList();
                        return voiceAvatarFrame;
                    }
                    voiceAvatarFrame.expiredTime = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return voiceAvatarFrame;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(VoiceAvatarFrame voiceAvatarFrame, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = voiceAvatarFrame.f38835id;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = voiceAvatarFrame.expiredTime;
            if (list2 != null) {
                codedOutputByteBufferNano.m17254K(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<VoiceAvatarFrame> JSON_ADAPTER = new ObjectJsonAdapter<VoiceAvatarFrame>() { // from class: com.p1.mobile.putong.data.VoiceAvatarFrame.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return VoiceAvatarFrame.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public VoiceAvatarFrame newInstance() {
            return new VoiceAvatarFrame();
        }

        public boolean parseField(VoiceAvatarFrame voiceAvatarFrame, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("expiredTime")) {
                voiceAvatarFrame.expiredTime = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("id")) {
                return false;
            }
            voiceAvatarFrame.f38835id = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
            return false;
        }

        public boolean parseFieldCheck(VoiceAvatarFrame voiceAvatarFrame, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("expiredTime")) {
                return true;
            }
            if (str.equals("id")) {
                return false;
            }
            return super.parseFieldCheck(voiceAvatarFrame, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(VoiceAvatarFrame voiceAvatarFrame, JsonGenerator jsonGenerator) throws IOException {
            if (voiceAvatarFrame.f38835id != null) {
                jsonGenerator.writeFieldName("id");
                JsonAdapter.serializeArray(voiceAvatarFrame.f38835id, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (voiceAvatarFrame.expiredTime != null) {
                jsonGenerator.writeFieldName("expiredTime");
                JsonAdapter.serializeArray(voiceAvatarFrame.expiredTime, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VoiceAvatarFrame) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VoiceAvatarFrame) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m60162a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m60163b(String str) {
        return str;
    }

    public static VoiceAvatarFrame new_() {
        VoiceAvatarFrame voiceAvatarFrame = new VoiceAvatarFrame();
        voiceAvatarFrame.nullCheck();
        return voiceAvatarFrame;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public VoiceAvatarFrame mo223809clone() {
        VoiceAvatarFrame voiceAvatarFrame = new VoiceAvatarFrame();
        List<String> list = this.f38835id;
        if (list != null) {
            voiceAvatarFrame.f38835id = ValueObject.util_map(list, new w9j() { // from class: l.eim0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return VoiceAvatarFrame.m60162a((String) obj);
                }
            });
        }
        List<String> list2 = this.expiredTime;
        if (list2 != null) {
            voiceAvatarFrame.expiredTime = ValueObject.util_map(list2, new w9j() { // from class: l.fim0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return VoiceAvatarFrame.m60163b((String) obj);
                }
            });
        }
        return voiceAvatarFrame;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VoiceAvatarFrame)) {
            return false;
        }
        VoiceAvatarFrame voiceAvatarFrame = (VoiceAvatarFrame) obj;
        return ValueObject.util_equals(this.f38835id, voiceAvatarFrame.f38835id) && ValueObject.util_equals(this.expiredTime, voiceAvatarFrame.expiredTime);
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
        List<String> list = this.f38835id;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<String> list2 = this.expiredTime;
        int iHashCode2 = iHashCode + (list2 != null ? list2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f38835id == null) {
            this.f38835id = new ArrayList();
        }
        if (this.expiredTime == null) {
            this.expiredTime = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
