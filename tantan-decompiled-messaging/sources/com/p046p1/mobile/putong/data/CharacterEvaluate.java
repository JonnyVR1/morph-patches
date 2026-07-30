package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.CharacterEvaluate;
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
public class CharacterEvaluate extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "characterevaluate";

    @ProtobufIndex(index = 3)
    public int actionTemperature;

    @ProtobufIndex(index = 5)
    public int alcoholConcentration;

    @ProtobufIndex(index = 4)
    public int characterSweetness;

    @NonNull
    @ProtobufIndex(index = 1)
    public String classification;

    @ProtobufIndex(index = 6)
    public boolean hideCharacter;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> tags;
    public static ProtobufAdapter<CharacterEvaluate> PROTOBUF_ADAPTER = new MessageNanoAdapter<CharacterEvaluate>() { // from class: com.p1.mobile.putong.data.CharacterEvaluate.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CharacterEvaluate characterEvaluate) {
            String str = characterEvaluate.classification;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            List<String> list = characterEvaluate.tags;
            if (list != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            int iM17226h = iM17233o + CodedOutputByteBufferNano.m17226h(3, characterEvaluate.actionTemperature) + CodedOutputByteBufferNano.m17226h(4, characterEvaluate.characterSweetness) + CodedOutputByteBufferNano.m17226h(5, characterEvaluate.alcoholConcentration) + CodedOutputByteBufferNano.m17220b(6, characterEvaluate.hideCharacter);
            characterEvaluate.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CharacterEvaluate parse(nb5 nb5Var) throws IOException {
            CharacterEvaluate characterEvaluate = new CharacterEvaluate();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (characterEvaluate.classification == null) {
                        characterEvaluate.classification = "";
                    }
                    if (characterEvaluate.tags != null) {
                        break;
                    }
                    characterEvaluate.tags = new ArrayList();
                    break;
                }
                if (iM158752u == 10) {
                    characterEvaluate.classification = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    characterEvaluate.tags = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iM158752u == 24) {
                    characterEvaluate.actionTemperature = nb5Var.m158741j();
                } else if (iM158752u == 32) {
                    characterEvaluate.characterSweetness = nb5Var.m158741j();
                } else if (iM158752u == 40) {
                    characterEvaluate.alcoholConcentration = nb5Var.m158741j();
                } else {
                    if (iM158752u != 48) {
                        if (characterEvaluate.classification == null) {
                            characterEvaluate.classification = "";
                        }
                        if (characterEvaluate.tags != null) {
                            break;
                        }
                        characterEvaluate.tags = new ArrayList();
                        return characterEvaluate;
                    }
                    characterEvaluate.hideCharacter = nb5Var.m158738g();
                }
            }
            return characterEvaluate;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CharacterEvaluate characterEvaluate, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = characterEvaluate.classification;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            List<String> list = characterEvaluate.tags;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17250G(3, characterEvaluate.actionTemperature);
            codedOutputByteBufferNano.m17250G(4, characterEvaluate.characterSweetness);
            codedOutputByteBufferNano.m17250G(5, characterEvaluate.alcoholConcentration);
            codedOutputByteBufferNano.m17244A(6, characterEvaluate.hideCharacter);
        }
    };
    public static JsonAdapter<CharacterEvaluate> JSON_ADAPTER = new ObjectJsonAdapter<CharacterEvaluate>() { // from class: com.p1.mobile.putong.data.CharacterEvaluate.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CharacterEvaluate.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CharacterEvaluate newInstance() {
            return new CharacterEvaluate();
        }

        public boolean parseField(CharacterEvaluate characterEvaluate, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "alcoholConcentration":
                    characterEvaluate.alcoholConcentration = jsonParser.getValueAsInt();
                    return true;
                case "tags":
                    characterEvaluate.tags = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "characterSweetness":
                    characterEvaluate.characterSweetness = jsonParser.getValueAsInt();
                    return true;
                case "classification":
                    characterEvaluate.classification = jsonParser.getValueAsString();
                    return true;
                case "actionTemperature":
                    characterEvaluate.actionTemperature = jsonParser.getValueAsInt();
                    return true;
                case "hideCharacter":
                    characterEvaluate.hideCharacter = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(CharacterEvaluate characterEvaluate, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "alcoholConcentration":
                case "tags":
                case "characterSweetness":
                case "classification":
                case "actionTemperature":
                case "hideCharacter":
                    return true;
                default:
                    return super.parseFieldCheck(characterEvaluate, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CharacterEvaluate characterEvaluate, JsonGenerator jsonGenerator) throws IOException {
            String str = characterEvaluate.classification;
            if (str != null) {
                jsonGenerator.writeStringField("classification", str);
            }
            if (characterEvaluate.tags != null) {
                jsonGenerator.writeFieldName("tags");
                JsonAdapter.serializeArray(characterEvaluate.tags, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            jsonGenerator.writeNumberField("actionTemperature", characterEvaluate.actionTemperature);
            jsonGenerator.writeNumberField("characterSweetness", characterEvaluate.characterSweetness);
            jsonGenerator.writeNumberField("alcoholConcentration", characterEvaluate.alcoholConcentration);
            jsonGenerator.writeBooleanField("hideCharacter", characterEvaluate.hideCharacter);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CharacterEvaluate) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CharacterEvaluate) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m59695a(String str) {
        return str;
    }

    public static CharacterEvaluate new_() {
        CharacterEvaluate characterEvaluate = new CharacterEvaluate();
        characterEvaluate.nullCheck();
        return characterEvaluate;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CharacterEvaluate mo223809clone() {
        CharacterEvaluate characterEvaluate = new CharacterEvaluate();
        characterEvaluate.classification = this.classification;
        List<String> list = this.tags;
        if (list != null) {
            characterEvaluate.tags = ValueObject.util_map(list, new w9j() { // from class: l.zr4
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return CharacterEvaluate.m59695a((String) obj);
                }
            });
        }
        characterEvaluate.actionTemperature = this.actionTemperature;
        characterEvaluate.characterSweetness = this.characterSweetness;
        characterEvaluate.alcoholConcentration = this.alcoholConcentration;
        characterEvaluate.hideCharacter = this.hideCharacter;
        return characterEvaluate;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CharacterEvaluate)) {
            return false;
        }
        CharacterEvaluate characterEvaluate = (CharacterEvaluate) obj;
        return ValueObject.util_equals(this.classification, characterEvaluate.classification) && ValueObject.util_equals(this.tags, characterEvaluate.tags) && this.actionTemperature == characterEvaluate.actionTemperature && this.characterSweetness == characterEvaluate.characterSweetness && this.alcoholConcentration == characterEvaluate.alcoholConcentration && this.hideCharacter == characterEvaluate.hideCharacter;
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
        String str = this.classification;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<String> list = this.tags;
        int iHashCode2 = ((((((((iHashCode + (list != null ? list.hashCode() : 0)) * 41) + this.actionTemperature) * 41) + this.characterSweetness) * 41) + this.alcoholConcentration) * 41) + (this.hideCharacter ? 1231 : 1237);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.classification == null) {
            this.classification = "";
        }
        if (this.tags == null) {
            this.tags = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
