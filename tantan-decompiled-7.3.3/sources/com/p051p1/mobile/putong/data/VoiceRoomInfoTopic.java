package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
import p153l.nc5;

/* JADX INFO: loaded from: classes12.dex */
public class VoiceRoomInfoTopic extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "voiceroominfotopic";

    @NonNull
    @ProtobufIndex(index = 3)
    public String category;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f39687id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;
    public static ProtobufAdapter<VoiceRoomInfoTopic> PROTOBUF_ADAPTER = new MessageNanoAdapter<VoiceRoomInfoTopic>() { // from class: com.p1.mobile.putong.data.VoiceRoomInfoTopic.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(VoiceRoomInfoTopic voiceRoomInfoTopic) {
            String str = voiceRoomInfoTopic.f39687id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = voiceRoomInfoTopic.name;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = voiceRoomInfoTopic.category;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            voiceRoomInfoTopic.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public VoiceRoomInfoTopic parse(nc5 nc5Var) throws IOException {
            VoiceRoomInfoTopic voiceRoomInfoTopic = new VoiceRoomInfoTopic();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (voiceRoomInfoTopic.f39687id == null) {
                        voiceRoomInfoTopic.f39687id = "";
                    }
                    if (voiceRoomInfoTopic.name == null) {
                        voiceRoomInfoTopic.name = "";
                    }
                    if (voiceRoomInfoTopic.category != null) {
                        break;
                    }
                    voiceRoomInfoTopic.category = "";
                    break;
                }
                if (iM162497u == 10) {
                    voiceRoomInfoTopic.f39687id = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    voiceRoomInfoTopic.name = nc5Var.m162495s();
                } else {
                    if (iM162497u != 26) {
                        if (voiceRoomInfoTopic.f39687id == null) {
                            voiceRoomInfoTopic.f39687id = "";
                        }
                        if (voiceRoomInfoTopic.name == null) {
                            voiceRoomInfoTopic.name = "";
                        }
                        if (voiceRoomInfoTopic.category != null) {
                            break;
                        }
                        voiceRoomInfoTopic.category = "";
                        return voiceRoomInfoTopic;
                    }
                    voiceRoomInfoTopic.category = nc5Var.m162495s();
                }
            }
            return voiceRoomInfoTopic;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(VoiceRoomInfoTopic voiceRoomInfoTopic, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = voiceRoomInfoTopic.f39687id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = voiceRoomInfoTopic.name;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = voiceRoomInfoTopic.category;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
        }
    };
    public static JsonAdapter<VoiceRoomInfoTopic> JSON_ADAPTER = new ObjectJsonAdapter<VoiceRoomInfoTopic>() { // from class: com.p1.mobile.putong.data.VoiceRoomInfoTopic.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return VoiceRoomInfoTopic.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public VoiceRoomInfoTopic newInstance() {
            return new VoiceRoomInfoTopic();
        }

        public boolean parseField(VoiceRoomInfoTopic voiceRoomInfoTopic, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    voiceRoomInfoTopic.f39687id = jsonParser.getValueAsString();
                    return false;
                case "name":
                    voiceRoomInfoTopic.name = jsonParser.getValueAsString();
                    return true;
                case "category":
                    voiceRoomInfoTopic.category = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(VoiceRoomInfoTopic voiceRoomInfoTopic, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "id":
                    return false;
                case "name":
                case "category":
                    return true;
                default:
                    return super.parseFieldCheck(voiceRoomInfoTopic, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(VoiceRoomInfoTopic voiceRoomInfoTopic, JsonGenerator jsonGenerator) throws IOException {
            String str = voiceRoomInfoTopic.f39687id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = voiceRoomInfoTopic.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
            String str3 = voiceRoomInfoTopic.category;
            if (str3 != null) {
                jsonGenerator.writeStringField("category", str3);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VoiceRoomInfoTopic) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VoiceRoomInfoTopic) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static VoiceRoomInfoTopic new_() {
        VoiceRoomInfoTopic voiceRoomInfoTopic = new VoiceRoomInfoTopic();
        voiceRoomInfoTopic.nullCheck();
        return voiceRoomInfoTopic;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public VoiceRoomInfoTopic mo225055clone() {
        VoiceRoomInfoTopic voiceRoomInfoTopic = new VoiceRoomInfoTopic();
        voiceRoomInfoTopic.f39687id = this.f39687id;
        voiceRoomInfoTopic.name = this.name;
        voiceRoomInfoTopic.category = this.category;
        return voiceRoomInfoTopic;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VoiceRoomInfoTopic)) {
            return false;
        }
        VoiceRoomInfoTopic voiceRoomInfoTopic = (VoiceRoomInfoTopic) obj;
        return ValueObject.util_equals(this.f39687id, voiceRoomInfoTopic.f39687id) && ValueObject.util_equals(this.name, voiceRoomInfoTopic.name) && ValueObject.util_equals(this.category, voiceRoomInfoTopic.category);
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
        String str = this.f39687id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.category;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f39687id == null) {
            this.f39687id = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.category == null) {
            this.category = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
