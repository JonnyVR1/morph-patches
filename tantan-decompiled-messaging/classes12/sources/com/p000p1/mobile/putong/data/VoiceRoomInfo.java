package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.VoiceRoomInfoTopic;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class VoiceRoomInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "voiceroominfo";

    @ProtobufIndex(index = 6)
    public boolean freeCall;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f299id;

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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(VoiceRoomInfo voiceRoomInfo) {
            String str = voiceRoomInfo.f299id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            Owner owner = voiceRoomInfo.owner;
            if (owner != null) {
                iO += CodedOutputByteBufferNano.l(2, owner, Owner.PROTOBUF_ADAPTER);
            }
            String str2 = voiceRoomInfo.title;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(3, str2);
            }
            List<VoiceRoomInfoTopic> list = voiceRoomInfo.topics;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(4, list, VoiceRoomInfoTopic.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str3 = voiceRoomInfo.type;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(5, str3);
            }
            int iB = iO + CodedOutputByteBufferNano.b(6, voiceRoomInfo.freeCall) + CodedOutputByteBufferNano.d(7, voiceRoomInfo.memberCount) + CodedOutputByteBufferNano.b(8, voiceRoomInfo.maskMode);
            ((MessageNano) voiceRoomInfo).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public VoiceRoomInfo m19359parse(nb5 nb5Var) throws IOException {
            VoiceRoomInfo voiceRoomInfo = new VoiceRoomInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (voiceRoomInfo.f299id == null) {
                        voiceRoomInfo.f299id = "";
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
                if (iU == 10) {
                    voiceRoomInfo.f299id = nb5Var.s();
                } else if (iU == 18) {
                    voiceRoomInfo.owner = (Owner) nb5Var.l(Owner.PROTOBUF_ADAPTER);
                } else if (iU == 26) {
                    voiceRoomInfo.title = nb5Var.s();
                } else if (iU == 34) {
                    voiceRoomInfo.topics = (List) nb5Var.l(VoiceRoomInfoTopic.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 42) {
                    voiceRoomInfo.type = nb5Var.s();
                } else if (iU == 48) {
                    voiceRoomInfo.freeCall = nb5Var.g();
                } else if (iU == 57) {
                    voiceRoomInfo.memberCount = nb5Var.h();
                } else {
                    if (iU != 64) {
                        if (voiceRoomInfo.f299id == null) {
                            voiceRoomInfo.f299id = "";
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
                    voiceRoomInfo.maskMode = nb5Var.g();
                }
            }
            return voiceRoomInfo;
        }

        public void serialize(VoiceRoomInfo voiceRoomInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = voiceRoomInfo.f299id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            Owner owner = voiceRoomInfo.owner;
            if (owner != null) {
                codedOutputByteBufferNano.K(2, owner, Owner.PROTOBUF_ADAPTER);
            }
            String str2 = voiceRoomInfo.title;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
            List<VoiceRoomInfoTopic> list = voiceRoomInfo.topics;
            if (list != null) {
                codedOutputByteBufferNano.K(4, list, VoiceRoomInfoTopic.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str3 = voiceRoomInfo.type;
            if (str3 != null) {
                codedOutputByteBufferNano.R(5, str3);
            }
            codedOutputByteBufferNano.A(6, voiceRoomInfo.freeCall);
            codedOutputByteBufferNano.C(7, voiceRoomInfo.memberCount);
            codedOutputByteBufferNano.A(8, voiceRoomInfo.maskMode);
        }
    };
    public static JsonAdapter<VoiceRoomInfo> JSON_ADAPTER = new ObjectJsonAdapter<VoiceRoomInfo>() { // from class: com.p1.mobile.putong.data.VoiceRoomInfo.2
        public Class getDataClass() {
            return VoiceRoomInfo.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public VoiceRoomInfo mo17830newInstance() {
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
                    voiceRoomInfo.f299id = jsonParser.getValueAsString();
                    return false;
                case "type":
                    voiceRoomInfo.type = jsonParser.getValueAsString();
                    return true;
                case "owner":
                    voiceRoomInfo.owner = (Owner) Owner.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(VoiceRoomInfo voiceRoomInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = voiceRoomInfo.f299id;
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VoiceRoomInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VoiceRoomInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static VoiceRoomInfo new_() {
        VoiceRoomInfo voiceRoomInfo = new VoiceRoomInfo();
        voiceRoomInfo.nullCheck();
        return voiceRoomInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public VoiceRoomInfo m19358clone() {
        VoiceRoomInfo voiceRoomInfo = new VoiceRoomInfo();
        voiceRoomInfo.f299id = this.f299id;
        Owner owner = this.owner;
        if (owner != null) {
            voiceRoomInfo.owner = owner.m18761clone();
        }
        voiceRoomInfo.title = this.title;
        List<VoiceRoomInfoTopic> list = this.topics;
        if (list != null) {
            voiceRoomInfo.topics = ValueObject.util_map(list, new w9j() { // from class: l.xeo0
                public final Object call(Object obj) {
                    return ((VoiceRoomInfoTopic) obj).m19361clone();
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
        return ValueObject.util_equals(this.f299id, voiceRoomInfo.f299id) && ValueObject.util_equals(this.owner, voiceRoomInfo.owner) && ValueObject.util_equals(this.title, voiceRoomInfo.title) && ValueObject.util_equals(this.topics, voiceRoomInfo.topics) && ValueObject.util_equals(this.type, voiceRoomInfo.type) && this.freeCall == voiceRoomInfo.freeCall && this.memberCount == voiceRoomInfo.memberCount && this.maskMode == voiceRoomInfo.maskMode;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.f299id;
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
        ((ValueObject) this).hashCode = i4;
        return i4;
    }

    public void nullCheck() {
        if (this.f299id == null) {
            this.f299id = "";
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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
