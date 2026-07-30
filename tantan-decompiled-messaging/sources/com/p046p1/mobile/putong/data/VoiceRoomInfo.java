package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.VoiceRoomInfoTopic;
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
public class VoiceRoomInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "voiceroominfo";

    @ProtobufIndex(index = 6)
    public boolean freeCall;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f38838id;

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
            String str = voiceRoomInfo.f38838id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            Owner owner = voiceRoomInfo.owner;
            if (owner != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(2, owner, Owner.PROTOBUF_ADAPTER);
            }
            String str2 = voiceRoomInfo.title;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str2);
            }
            List<VoiceRoomInfoTopic> list = voiceRoomInfo.topics;
            if (list != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(4, list, VoiceRoomInfoTopic.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str3 = voiceRoomInfo.type;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(5, str3);
            }
            int iM17220b = iM17233o + CodedOutputByteBufferNano.m17220b(6, voiceRoomInfo.freeCall) + CodedOutputByteBufferNano.m17222d(7, voiceRoomInfo.memberCount) + CodedOutputByteBufferNano.m17220b(8, voiceRoomInfo.maskMode);
            voiceRoomInfo.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public VoiceRoomInfo parse(nb5 nb5Var) throws IOException {
            VoiceRoomInfo voiceRoomInfo = new VoiceRoomInfo();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (voiceRoomInfo.f38838id == null) {
                        voiceRoomInfo.f38838id = "";
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
                if (iM158752u == 10) {
                    voiceRoomInfo.f38838id = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    voiceRoomInfo.owner = (Owner) nb5Var.m158743l(Owner.PROTOBUF_ADAPTER);
                } else if (iM158752u == 26) {
                    voiceRoomInfo.title = nb5Var.m158750s();
                } else if (iM158752u == 34) {
                    voiceRoomInfo.topics = (List) nb5Var.m158743l(VoiceRoomInfoTopic.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iM158752u == 42) {
                    voiceRoomInfo.type = nb5Var.m158750s();
                } else if (iM158752u == 48) {
                    voiceRoomInfo.freeCall = nb5Var.m158738g();
                } else if (iM158752u == 57) {
                    voiceRoomInfo.memberCount = nb5Var.m158739h();
                } else {
                    if (iM158752u != 64) {
                        if (voiceRoomInfo.f38838id == null) {
                            voiceRoomInfo.f38838id = "";
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
                    voiceRoomInfo.maskMode = nb5Var.m158738g();
                }
            }
            return voiceRoomInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(VoiceRoomInfo voiceRoomInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = voiceRoomInfo.f38838id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            Owner owner = voiceRoomInfo.owner;
            if (owner != null) {
                codedOutputByteBufferNano.m17254K(2, owner, Owner.PROTOBUF_ADAPTER);
            }
            String str2 = voiceRoomInfo.title;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(3, str2);
            }
            List<VoiceRoomInfoTopic> list = voiceRoomInfo.topics;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(4, list, VoiceRoomInfoTopic.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str3 = voiceRoomInfo.type;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(5, str3);
            }
            codedOutputByteBufferNano.m17244A(6, voiceRoomInfo.freeCall);
            codedOutputByteBufferNano.m17246C(7, voiceRoomInfo.memberCount);
            codedOutputByteBufferNano.m17244A(8, voiceRoomInfo.maskMode);
        }
    };
    public static JsonAdapter<VoiceRoomInfo> JSON_ADAPTER = new ObjectJsonAdapter<VoiceRoomInfo>() { // from class: com.p1.mobile.putong.data.VoiceRoomInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return VoiceRoomInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
                    voiceRoomInfo.f38838id = jsonParser.getValueAsString();
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(VoiceRoomInfo voiceRoomInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = voiceRoomInfo.f38838id;
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VoiceRoomInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
    public VoiceRoomInfo mo223809clone() {
        VoiceRoomInfo voiceRoomInfo = new VoiceRoomInfo();
        voiceRoomInfo.f38838id = this.f38838id;
        Owner owner = this.owner;
        if (owner != null) {
            voiceRoomInfo.owner = owner.mo223809clone();
        }
        voiceRoomInfo.title = this.title;
        List<VoiceRoomInfoTopic> list = this.topics;
        if (list != null) {
            voiceRoomInfo.topics = ValueObject.util_map(list, new w9j() { // from class: l.xeo0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((VoiceRoomInfoTopic) obj).mo223809clone();
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
        return ValueObject.util_equals(this.f38838id, voiceRoomInfo.f38838id) && ValueObject.util_equals(this.owner, voiceRoomInfo.owner) && ValueObject.util_equals(this.title, voiceRoomInfo.title) && ValueObject.util_equals(this.topics, voiceRoomInfo.topics) && ValueObject.util_equals(this.type, voiceRoomInfo.type) && this.freeCall == voiceRoomInfo.freeCall && this.memberCount == voiceRoomInfo.memberCount && this.maskMode == voiceRoomInfo.maskMode;
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
        String str = this.f38838id;
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
        if (this.f38838id == null) {
            this.f38838id = "";
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
