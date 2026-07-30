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
public class AiTranslateLanguage extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "aitranslatelanguage";

    @NonNull
    @ProtobufIndex(index = 1)
    public String key;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;
    public static ProtobufAdapter<AiTranslateLanguage> PROTOBUF_ADAPTER = new MessageNanoAdapter<AiTranslateLanguage>() { // from class: com.p1.mobile.putong.data.AiTranslateLanguage.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(AiTranslateLanguage aiTranslateLanguage) {
            String str = aiTranslateLanguage.key;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = aiTranslateLanguage.name;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) aiTranslateLanguage).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public AiTranslateLanguage m17668parse(nb5 nb5Var) throws IOException {
            AiTranslateLanguage aiTranslateLanguage = new AiTranslateLanguage();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (aiTranslateLanguage.key == null) {
                        aiTranslateLanguage.key = "";
                    }
                    if (aiTranslateLanguage.name != null) {
                        break;
                    }
                    aiTranslateLanguage.name = "";
                    break;
                }
                if (iU == 10) {
                    aiTranslateLanguage.key = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (aiTranslateLanguage.key == null) {
                            aiTranslateLanguage.key = "";
                        }
                        if (aiTranslateLanguage.name != null) {
                            break;
                        }
                        aiTranslateLanguage.name = "";
                        return aiTranslateLanguage;
                    }
                    aiTranslateLanguage.name = nb5Var.s();
                }
            }
            return aiTranslateLanguage;
        }

        public void serialize(AiTranslateLanguage aiTranslateLanguage, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = aiTranslateLanguage.key;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = aiTranslateLanguage.name;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<AiTranslateLanguage> JSON_ADAPTER = new ObjectJsonAdapter<AiTranslateLanguage>() { // from class: com.p1.mobile.putong.data.AiTranslateLanguage.2
        public Class getDataClass() {
            return AiTranslateLanguage.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public AiTranslateLanguage mo17830newInstance() {
            return new AiTranslateLanguage();
        }

        public boolean parseField(AiTranslateLanguage aiTranslateLanguage, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("key")) {
                aiTranslateLanguage.key = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("name")) {
                return false;
            }
            aiTranslateLanguage.name = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(AiTranslateLanguage aiTranslateLanguage, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("key") || str.equals("name")) {
                return true;
            }
            return super.parseFieldCheck(aiTranslateLanguage, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AiTranslateLanguage aiTranslateLanguage, JsonGenerator jsonGenerator) throws IOException {
            String str = aiTranslateLanguage.key;
            if (str != null) {
                jsonGenerator.writeStringField("key", str);
            }
            String str2 = aiTranslateLanguage.name;
            if (str2 != null) {
                jsonGenerator.writeStringField("name", str2);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AiTranslateLanguage) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AiTranslateLanguage) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AiTranslateLanguage new_() {
        AiTranslateLanguage aiTranslateLanguage = new AiTranslateLanguage();
        aiTranslateLanguage.nullCheck();
        return aiTranslateLanguage;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AiTranslateLanguage m17667clone() {
        AiTranslateLanguage aiTranslateLanguage = new AiTranslateLanguage();
        aiTranslateLanguage.key = this.key;
        aiTranslateLanguage.name = this.name;
        return aiTranslateLanguage;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AiTranslateLanguage)) {
            return false;
        }
        AiTranslateLanguage aiTranslateLanguage = (AiTranslateLanguage) obj;
        return ValueObject.util_equals(this.key, aiTranslateLanguage.key) && ValueObject.util_equals(this.name, aiTranslateLanguage.name);
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
        String str = this.key;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.key == null) {
            this.key = "";
        }
        if (this.name == null) {
            this.name = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
