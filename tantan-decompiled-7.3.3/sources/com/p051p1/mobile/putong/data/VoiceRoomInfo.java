package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.VoiceRoomInfoTopic;
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
public class VoiceRoomInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "voiceroominfo";

    @ProtobufIndex(index = 6)
    public boolean freeCall;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f39686id;

    @ProtobufIndex(index = 8)
    public boolean maskMode;

    @ProtobufIndex(index = 7)
    public double memberCount;

    @NonNull
    @ProtobufIndex(index = 2)
    public Owner owner;

    @NonNull
    @ProtobufIndex(index = 3)
    public String title;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<VoiceRoomInfoTopic> topics;

    @NonNull
    @ProtobufIndex(index = 5)
    public String type;
    public static ProtobufAdapter<VoiceRoomInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<VoiceRoomInfo>() { // from class: com.p1.mobile.putong.data.VoiceRoomInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(VoiceRoomInfo voiceRoomInfo) {
            String str = voiceRoomInfo.f39686id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            Owner owner = voiceRoomInfo.owner;
            if (owner != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(2, owner, Owner.PROTOBUF_ADAPTER);
            }
            String str2 = voiceRoomInfo.title;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str2);
            }
            List<VoiceRoomInfoTopic> list = voiceRoomInfo.topics;
            if (list != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(4, list, VoiceRoomInfoTopic.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str3 = voiceRoomInfo.type;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(5, str3);
            }
            int iM17275b = iM17288o + CodedOutputByteBufferNano.m17275b(6, voiceRoomInfo.freeCall) + CodedOutputByteBufferNano.m17277d(7, voiceRoomInfo.memberCount) + CodedOutputByteBufferNano.m17275b(8, voiceRoomInfo.maskMode);
            voiceRoomInfo.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public VoiceRoomInfo parse(nc5 nc5Var) throws IOException {
            VoiceRoomInfo voiceRoomInfo = new VoiceRoomInfo();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (voiceRoomInfo.f39686id == null) {
                        voiceRoomInfo.f39686id = "";
                    }
                    if (voiceRoomInfo.owner == null) {
                        voiceRoomInfo.owner = Owner.new_();
                    }
                    if (voiceRoomInfo.title == null) {
                        voiceRoomInfo.title = "";
                    }
                    if (voiceRoomInfo.topics == null) {
                        voiceRoomInfo.topics = new ArrayList();
                    }
                    if (voiceRoomInfo.type != null) {
                        break;
                    }
                    voiceRoomInfo.type = "";
                    break;
                }
                if (iM162497u == 10) {
                    voiceRoomInfo.f39686id = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    voiceRoomInfo.owner = (Owner) nc5Var.m162488l(Owner.PROTOBUF_ADAPTER);
                } else if (iM162497u == 26) {
                    voiceRoomInfo.title = nc5Var.m162495s();
                } else if (iM162497u == 34) {
                    voiceRoomInfo.topics = (List) nc5Var.m162488l(VoiceRoomInfoTopic.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iM162497u == 42) {
                    voiceRoomInfo.type = nc5Var.m162495s();
                } else if (iM162497u == 48) {
                    voiceRoomInfo.freeCall = nc5Var.m162483g();
                } else if (iM162497u == 57) {
                    voiceRoomInfo.memberCount = nc5Var.m162484h();
                } else {
                    if (iM162497u != 64) {
                        if (voiceRoomInfo.f39686id == null) {
                            voiceRoomInfo.f39686id = "";
                        }
                        if (voiceRoomInfo.owner == null) {
                            voiceRoomInfo.owner = Owner.new_();
                        }
                        if (voiceRoomInfo.title == null) {
                            voiceRoomInfo.title = "";
                        }
                        if (voiceRoomInfo.topics == null) {
                            voiceRoomInfo.topics = new ArrayList();
                        }
                        if (voiceRoomInfo.type != null) {
                            break;
                        }
                        voiceRoomInfo.type = "";
                        return voiceRoomInfo;
                    }
                    voiceRoomInfo.maskMode = nc5Var.m162483g();
                }
            }
            return voiceRoomInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(VoiceRoomInfo voiceRoomInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = voiceRoomInfo.f39686id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            Owner owner = voiceRoomInfo.owner;
            if (owner != null) {
                codedOutputByteBufferNano.m17309K(2, owner, Owner.PROTOBUF_ADAPTER);
            }
            String str2 = voiceRoomInfo.title;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(3, str2);
            }
            List<VoiceRoomInfoTopic> list = voiceRoomInfo.topics;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(4, list, VoiceRoomInfoTopic.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str3 = voiceRoomInfo.type;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(5, str3);
            }
            codedOutputByteBufferNano.m17299A(6, voiceRoomInfo.freeCall);
            codedOutputByteBufferNano.m17301C(7, voiceRoomInfo.memberCount);
            codedOutputByteBufferNano.m17299A(8, voiceRoomInfo.maskMode);
        }
    };
    public static JsonAdapter<VoiceRoomInfo> JSON_ADAPTER = new ObjectJsonAdapter<VoiceRoomInfo>() { // from class: com.p1.mobile.putong.data.VoiceRoomInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return VoiceRoomInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public VoiceRoomInfo newInstance() {
            return new VoiceRoomInfo();
        }

        public boolean parseField(VoiceRoomInfo voiceRoomInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "freeCall":
                    voiceRoomInfo.freeCall = jsonParser.getValueAsBoolean();
                    return true;
                case "topics":
                    voiceRoomInfo.topics = JsonAdapter.parseArray(jsonParser, VoiceRoomInfoTopic.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    voiceRoomInfo.f39686id = jsonParser.getValueAsString();
                    return false;
                case "type":
                    voiceRoomInfo.type = jsonParser.getValueAsString();
                    return true;
                case "owner":
                    voiceRoomInfo.owner = Owner.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "title":
                    voiceRoomInfo.title = jsonParser.getValueAsString();
                    return true;
                case "maskMode":
                    voiceRoomInfo.maskMode = jsonParser.getValueAsBoolean();
                    return true;
                case "memberCount":
                    voiceRoomInfo.memberCount = jsonParser.getValueAsDouble();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(VoiceRoomInfo voiceRoomInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "freeCall":
                case "topics":
                    return true;
                case "id":
                    return false;
                case "type":
                case "owner":
                case "title":
                case "maskMode":
                case "memberCount":
                    return true;
                default:
                    return super.parseFieldCheck(voiceRoomInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(VoiceRoomInfo voiceRoomInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = voiceRoomInfo.f39686id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (voiceRoomInfo.owner != null) {
                jsonGenerator.writeFieldName(Owner.TYPE);
                Owner.JSON_ADAPTER.serialize(voiceRoomInfo.owner, jsonGenerator, true);
            }
            String str2 = voiceRoomInfo.title;
            if (str2 != null) {
                jsonGenerator.writeStringField("title", str2);
            }
            if (voiceRoomInfo.topics != null) {
                jsonGenerator.writeFieldName("topics");
                JsonAdapter.serializeArray(voiceRoomInfo.topics, jsonGenerator, VoiceRoomInfoTopic.JSON_ADAPTER);
            }
            String str3 = voiceRoomInfo.type;
            if (str3 != null) {
                jsonGenerator.writeStringField("type", str3);
            }
            jsonGenerator.writeBooleanField("freeCall", voiceRoomInfo.freeCall);
            jsonGenerator.writeNumberField("memberCount", voiceRoomInfo.memberCount);
            jsonGenerator.writeBooleanField("maskMode", voiceRoomInfo.maskMode);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VoiceRoomInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VoiceRoomInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static VoiceRoomInfo new_() {
        VoiceRoomInfo voiceRoomInfo = new VoiceRoomInfo();
        voiceRoomInfo.nullCheck();
        return voiceRoomInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public VoiceRoomInfo mo225055clone() {
        VoiceRoomInfo voiceRoomInfo = new VoiceRoomInfo();
        voiceRoomInfo.f39686id = this.f39686id;
        Owner owner = this.owner;
        if (owner != null) {
            voiceRoomInfo.owner = owner.mo225055clone();
        }
        voiceRoomInfo.title = this.title;
        List<VoiceRoomInfoTopic> list = this.topics;
        if (list != null) {
            voiceRoomInfo.topics = ValueObject.util_map(list, new qcj() { // from class: l.boo0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((VoiceRoomInfoTopic) obj).mo225055clone();
                }
            });
        }
        voiceRoomInfo.type = this.type;
        voiceRoomInfo.freeCall = this.freeCall;
        voiceRoomInfo.memberCount = this.memberCount;
        voiceRoomInfo.maskMode = this.maskMode;
        return voiceRoomInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VoiceRoomInfo)) {
            return false;
        }
        VoiceRoomInfo voiceRoomInfo = (VoiceRoomInfo) obj;
        return ValueObject.util_equals(this.f39686id, voiceRoomInfo.f39686id) && ValueObject.util_equals(this.owner, voiceRoomInfo.owner) && ValueObject.util_equals(this.title, voiceRoomInfo.title) && ValueObject.util_equals(this.topics, voiceRoomInfo.topics) && ValueObject.util_equals(this.type, voiceRoomInfo.type) && this.freeCall == voiceRoomInfo.freeCall && this.memberCount == voiceRoomInfo.memberCount && this.maskMode == voiceRoomInfo.maskMode;
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
        String str = this.f39686id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        Owner owner = this.owner;
        int iHashCode2 = (iHashCode + (owner != null ? owner.hashCode() : 0)) * 41;
        String str2 = this.title;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<VoiceRoomInfoTopic> list = this.topics;
        int iHashCode4 = (iHashCode3 + (list != null ? list.hashCode() : 0)) * 41;
        String str3 = this.type;
        int iHashCode5 = (iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 41;
        int i3 = this.freeCall ? 1231 : 1237;
        long jDoubleToLongBits = Double.doubleToLongBits(this.memberCount);
        int i4 = ((((iHashCode5 + i3) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41) + (this.maskMode ? 1231 : 1237);
        this.hashCode = i4;
        return i4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f39686id == null) {
            this.f39686id = "";
        }
        if (this.owner == null) {
            this.owner = Owner.new_();
        }
        if (this.title == null) {
            this.title = "";
        }
        if (this.topics == null) {
            this.topics = new ArrayList();
        }
        if (this.type == null) {
            this.type = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
