package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
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
public class AiTranslateResultData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "aitranslateresultdata";

    @NonNull
    @ProtobufIndex(index = 1)
    public String translated_text;
    public static ProtobufAdapter<AiTranslateResultData> PROTOBUF_ADAPTER = new MessageNanoAdapter<AiTranslateResultData>() { // from class: com.p1.mobile.putong.data.AiTranslateResultData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(AiTranslateResultData aiTranslateResultData) {
            String str = aiTranslateResultData.translated_text;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            aiTranslateResultData.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AiTranslateResultData parse(nc5 nc5Var) throws IOException {
            AiTranslateResultData aiTranslateResultData = new AiTranslateResultData();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (aiTranslateResultData.translated_text != null) {
                        break;
                    }
                    aiTranslateResultData.translated_text = "";
                    break;
                }
                if (iM162497u != 10) {
                    if (aiTranslateResultData.translated_text != null) {
                        break;
                    }
                    aiTranslateResultData.translated_text = "";
                    return aiTranslateResultData;
                }
                aiTranslateResultData.translated_text = nc5Var.m162495s();
            }
            return aiTranslateResultData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AiTranslateResultData aiTranslateResultData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = aiTranslateResultData.translated_text;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
        }
    };
    public static JsonAdapter<AiTranslateResultData> JSON_ADAPTER = new ObjectJsonAdapter<AiTranslateResultData>() { // from class: com.p1.mobile.putong.data.AiTranslateResultData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AiTranslateResultData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public AiTranslateResultData newInstance() {
            return new AiTranslateResultData();
        }

        public boolean parseField(AiTranslateResultData aiTranslateResultData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("translated_text")) {
                return false;
            }
            aiTranslateResultData.translated_text = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(AiTranslateResultData aiTranslateResultData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("translated_text")) {
                return true;
            }
            return super.parseFieldCheck(aiTranslateResultData, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AiTranslateResultData aiTranslateResultData, JsonGenerator jsonGenerator) throws IOException {
            String str = aiTranslateResultData.translated_text;
            if (str != null) {
                jsonGenerator.writeStringField("translated_text", str);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AiTranslateResultData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AiTranslateResultData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AiTranslateResultData new_() {
        AiTranslateResultData aiTranslateResultData = new AiTranslateResultData();
        aiTranslateResultData.nullCheck();
        return aiTranslateResultData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public AiTranslateResultData mo225055clone() {
        AiTranslateResultData aiTranslateResultData = new AiTranslateResultData();
        aiTranslateResultData.translated_text = this.translated_text;
        return aiTranslateResultData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AiTranslateResultData) {
            return ValueObject.util_equals(this.translated_text, ((AiTranslateResultData) obj).translated_text);
        }
        return false;
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
        String str = this.translated_text;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.translated_text == null) {
            this.translated_text = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
