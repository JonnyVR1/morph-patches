package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.VoiceAvatarFrame;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes12.dex */
public class VoiceAvatarFrame extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "voiceavatarframe";

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> expiredTime;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> f39683id;
    public static ProtobufAdapter<VoiceAvatarFrame> PROTOBUF_ADAPTER = new MessageNanoAdapter<VoiceAvatarFrame>() { // from class: com.p1.mobile.putong.data.VoiceAvatarFrame.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(VoiceAvatarFrame voiceAvatarFrame) {
            List<String> list = voiceAvatarFrame.f39683id;
            int iM17285l = list != null ? CodedOutputByteBufferNano.m17285l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<String> list2 = voiceAvatarFrame.expiredTime;
            if (list2 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            voiceAvatarFrame.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public VoiceAvatarFrame parse(nc5 nc5Var) throws IOException {
            VoiceAvatarFrame voiceAvatarFrame = new VoiceAvatarFrame();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (voiceAvatarFrame.f39683id == null) {
                        voiceAvatarFrame.f39683id = new ArrayList();
                    }
                    if (voiceAvatarFrame.expiredTime != null) {
                        break;
                    }
                    voiceAvatarFrame.expiredTime = new ArrayList();
                    break;
                }
                if (iM162497u == 10) {
                    voiceAvatarFrame.f39683id = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM162497u != 18) {
                        if (voiceAvatarFrame.f39683id == null) {
                            voiceAvatarFrame.f39683id = new ArrayList();
                        }
                        if (voiceAvatarFrame.expiredTime != null) {
                            break;
                        }
                        voiceAvatarFrame.expiredTime = new ArrayList();
                        return voiceAvatarFrame;
                    }
                    voiceAvatarFrame.expiredTime = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return voiceAvatarFrame;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(VoiceAvatarFrame voiceAvatarFrame, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = voiceAvatarFrame.f39683id;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = voiceAvatarFrame.expiredTime;
            if (list2 != null) {
                codedOutputByteBufferNano.m17309K(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<VoiceAvatarFrame> JSON_ADAPTER = new ObjectJsonAdapter<VoiceAvatarFrame>() { // from class: com.p1.mobile.putong.data.VoiceAvatarFrame.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return VoiceAvatarFrame.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
            voiceAvatarFrame.f39683id = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(VoiceAvatarFrame voiceAvatarFrame, JsonGenerator jsonGenerator) throws IOException {
            if (voiceAvatarFrame.f39683id != null) {
                jsonGenerator.writeFieldName("id");
                JsonAdapter.serializeArray(voiceAvatarFrame.f39683id, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (voiceAvatarFrame.expiredTime != null) {
                jsonGenerator.writeFieldName("expiredTime");
                JsonAdapter.serializeArray(voiceAvatarFrame.expiredTime, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VoiceAvatarFrame) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VoiceAvatarFrame) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m61346a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m61347b(String str) {
        return str;
    }

    public static VoiceAvatarFrame new_() {
        VoiceAvatarFrame voiceAvatarFrame = new VoiceAvatarFrame();
        voiceAvatarFrame.nullCheck();
        return voiceAvatarFrame;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public VoiceAvatarFrame mo225055clone() {
        VoiceAvatarFrame voiceAvatarFrame = new VoiceAvatarFrame();
        List<String> list = this.f39683id;
        if (list != null) {
            voiceAvatarFrame.f39683id = ValueObject.util_map(list, new qcj() { // from class: l.irm0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return VoiceAvatarFrame.m61346a((String) obj);
                }
            });
        }
        List<String> list2 = this.expiredTime;
        if (list2 != null) {
            voiceAvatarFrame.expiredTime = ValueObject.util_map(list2, new qcj() { // from class: l.jrm0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return VoiceAvatarFrame.m61347b((String) obj);
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
        return ValueObject.util_equals(this.f39683id, voiceAvatarFrame.f39683id) && ValueObject.util_equals(this.expiredTime, voiceAvatarFrame.expiredTime);
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
        List<String> list = this.f39683id;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<String> list2 = this.expiredTime;
        int iHashCode2 = iHashCode + (list2 != null ? list2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f39683id == null) {
            this.f39683id = new ArrayList();
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
