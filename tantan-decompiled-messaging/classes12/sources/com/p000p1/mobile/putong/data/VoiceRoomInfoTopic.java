package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class VoiceRoomInfoTopic extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "voiceroominfotopic";

    @NonNull
    @ProtobufIndex(index = 3)
    public String category;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f300id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;
    public static ProtobufAdapter<VoiceRoomInfoTopic> PROTOBUF_ADAPTER = new MessageNanoAdapter<VoiceRoomInfoTopic>() { // from class: com.p1.mobile.putong.data.VoiceRoomInfoTopic.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(VoiceRoomInfoTopic voiceRoomInfoTopic) {
            String str = voiceRoomInfoTopic.f300id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = voiceRoomInfoTopic.name;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = voiceRoomInfoTopic.category;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            ((MessageNano) voiceRoomInfoTopic).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public VoiceRoomInfoTopic m19362parse(nb5 nb5Var) throws IOException {
            VoiceRoomInfoTopic voiceRoomInfoTopic = new VoiceRoomInfoTopic();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (voiceRoomInfoTopic.f300id == null) {
                        voiceRoomInfoTopic.f300id = "";
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
                if (iU == 10) {
                    voiceRoomInfoTopic.f300id = nb5Var.s();
                } else if (iU == 18) {
                    voiceRoomInfoTopic.name = nb5Var.s();
                } else {
                    if (iU != 26) {
                        if (voiceRoomInfoTopic.f300id == null) {
                            voiceRoomInfoTopic.f300id = "";
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
                    voiceRoomInfoTopic.category = nb5Var.s();
                }
            }
            return voiceRoomInfoTopic;
        }

        public void serialize(VoiceRoomInfoTopic voiceRoomInfoTopic, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = voiceRoomInfoTopic.f300id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = voiceRoomInfoTopic.name;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = voiceRoomInfoTopic.category;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
        }
    };
    public static JsonAdapter<VoiceRoomInfoTopic> JSON_ADAPTER = new ObjectJsonAdapter<VoiceRoomInfoTopic>() { // from class: com.p1.mobile.putong.data.VoiceRoomInfoTopic.2
        public Class getDataClass() {
            return VoiceRoomInfoTopic.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public VoiceRoomInfoTopic mo17830newInstance() {
            return new VoiceRoomInfoTopic();
        }

        public boolean parseField(VoiceRoomInfoTopic voiceRoomInfoTopic, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    voiceRoomInfoTopic.f300id = jsonParser.getValueAsString();
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(VoiceRoomInfoTopic voiceRoomInfoTopic, JsonGenerator jsonGenerator) throws IOException {
            String str = voiceRoomInfoTopic.f300id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = voiceRoomInfoTopic.name;
            if (str2 != null) {
                jsonGenerator.writeStringField("name", str2);
            }
            String str3 = voiceRoomInfoTopic.category;
            if (str3 != null) {
                jsonGenerator.writeStringField("category", str3);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VoiceRoomInfoTopic) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VoiceRoomInfoTopic) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static VoiceRoomInfoTopic new_() {
        VoiceRoomInfoTopic voiceRoomInfoTopic = new VoiceRoomInfoTopic();
        voiceRoomInfoTopic.nullCheck();
        return voiceRoomInfoTopic;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public VoiceRoomInfoTopic m19361clone() {
        VoiceRoomInfoTopic voiceRoomInfoTopic = new VoiceRoomInfoTopic();
        voiceRoomInfoTopic.f300id = this.f300id;
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
        return ValueObject.util_equals(this.f300id, voiceRoomInfoTopic.f300id) && ValueObject.util_equals(this.name, voiceRoomInfoTopic.name) && ValueObject.util_equals(this.category, voiceRoomInfoTopic.category);
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
        String str = this.f300id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.category;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.f300id == null) {
            this.f300id = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.category == null) {
            this.category = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
