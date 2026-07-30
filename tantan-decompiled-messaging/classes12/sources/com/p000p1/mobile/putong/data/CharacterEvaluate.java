package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.CharacterEvaluate;
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(CharacterEvaluate characterEvaluate) {
            String str = characterEvaluate.classification;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            List<String> list = characterEvaluate.tags;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            int iH = iO + CodedOutputByteBufferNano.h(3, characterEvaluate.actionTemperature) + CodedOutputByteBufferNano.h(4, characterEvaluate.characterSweetness) + CodedOutputByteBufferNano.h(5, characterEvaluate.alcoholConcentration) + CodedOutputByteBufferNano.b(6, characterEvaluate.hideCharacter);
            ((MessageNano) characterEvaluate).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public CharacterEvaluate m17805parse(nb5 nb5Var) throws IOException {
            CharacterEvaluate characterEvaluate = new CharacterEvaluate();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (characterEvaluate.classification == null) {
                        characterEvaluate.classification = "";
                    }
                    if (characterEvaluate.tags != null) {
                        break;
                    }
                    characterEvaluate.tags = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    characterEvaluate.classification = nb5Var.s();
                } else if (iU == 18) {
                    characterEvaluate.tags = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 24) {
                    characterEvaluate.actionTemperature = nb5Var.j();
                } else if (iU == 32) {
                    characterEvaluate.characterSweetness = nb5Var.j();
                } else if (iU == 40) {
                    characterEvaluate.alcoholConcentration = nb5Var.j();
                } else {
                    if (iU != 48) {
                        if (characterEvaluate.classification == null) {
                            characterEvaluate.classification = "";
                        }
                        if (characterEvaluate.tags != null) {
                            break;
                        }
                        characterEvaluate.tags = new ArrayList();
                        return characterEvaluate;
                    }
                    characterEvaluate.hideCharacter = nb5Var.g();
                }
            }
            return characterEvaluate;
        }

        public void serialize(CharacterEvaluate characterEvaluate, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = characterEvaluate.classification;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            List<String> list = characterEvaluate.tags;
            if (list != null) {
                codedOutputByteBufferNano.K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.G(3, characterEvaluate.actionTemperature);
            codedOutputByteBufferNano.G(4, characterEvaluate.characterSweetness);
            codedOutputByteBufferNano.G(5, characterEvaluate.alcoholConcentration);
            codedOutputByteBufferNano.A(6, characterEvaluate.hideCharacter);
        }
    };
    public static JsonAdapter<CharacterEvaluate> JSON_ADAPTER = new ObjectJsonAdapter<CharacterEvaluate>() { // from class: com.p1.mobile.putong.data.CharacterEvaluate.2
        public Class getDataClass() {
            return CharacterEvaluate.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public CharacterEvaluate mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CharacterEvaluate) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CharacterEvaluate) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m597a(String str) {
        return str;
    }

    public static CharacterEvaluate new_() {
        CharacterEvaluate characterEvaluate = new CharacterEvaluate();
        characterEvaluate.nullCheck();
        return characterEvaluate;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public CharacterEvaluate m17804clone() {
        CharacterEvaluate characterEvaluate = new CharacterEvaluate();
        characterEvaluate.classification = this.classification;
        List<String> list = this.tags;
        if (list != null) {
            characterEvaluate.tags = ValueObject.util_map(list, new w9j() { // from class: l.zr4
                public final Object call(Object obj) {
                    return CharacterEvaluate.m597a((String) obj);
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.classification;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<String> list = this.tags;
        int iHashCode2 = ((((((((iHashCode + (list != null ? list.hashCode() : 0)) * 41) + this.actionTemperature) * 41) + this.characterSweetness) * 41) + this.alcoholConcentration) * 41) + (this.hideCharacter ? 1231 : 1237);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.classification == null) {
            this.classification = "";
        }
        if (this.tags == null) {
            this.tags = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
