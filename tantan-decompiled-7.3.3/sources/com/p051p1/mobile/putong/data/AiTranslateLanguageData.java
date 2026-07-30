package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.AiTranslateLanguage;
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
public class AiTranslateLanguageData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "aitranslatelanguagedata";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<AiTranslateLanguage> languages;
    public static ProtobufAdapter<AiTranslateLanguageData> PROTOBUF_ADAPTER = new MessageNanoAdapter<AiTranslateLanguageData>() { // from class: com.p1.mobile.putong.data.AiTranslateLanguageData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(AiTranslateLanguageData aiTranslateLanguageData) {
            List<AiTranslateLanguage> list = aiTranslateLanguageData.languages;
            int iM17285l = list != null ? CodedOutputByteBufferNano.m17285l(1, list, AiTranslateLanguage.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            aiTranslateLanguageData.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AiTranslateLanguageData parse(nc5 nc5Var) throws IOException {
            AiTranslateLanguageData aiTranslateLanguageData = new AiTranslateLanguageData();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (aiTranslateLanguageData.languages != null) {
                        break;
                    }
                    aiTranslateLanguageData.languages = new ArrayList();
                    break;
                }
                if (iM162497u != 10) {
                    if (aiTranslateLanguageData.languages != null) {
                        break;
                    }
                    aiTranslateLanguageData.languages = new ArrayList();
                    return aiTranslateLanguageData;
                }
                aiTranslateLanguageData.languages = (List) nc5Var.m162488l(AiTranslateLanguage.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            return aiTranslateLanguageData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AiTranslateLanguageData aiTranslateLanguageData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<AiTranslateLanguage> list = aiTranslateLanguageData.languages;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(1, list, AiTranslateLanguage.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<AiTranslateLanguageData> JSON_ADAPTER = new ObjectJsonAdapter<AiTranslateLanguageData>() { // from class: com.p1.mobile.putong.data.AiTranslateLanguageData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AiTranslateLanguageData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public AiTranslateLanguageData newInstance() {
            return new AiTranslateLanguageData();
        }

        public boolean parseField(AiTranslateLanguageData aiTranslateLanguageData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("languages")) {
                return false;
            }
            aiTranslateLanguageData.languages = JsonAdapter.parseArray(jsonParser, AiTranslateLanguage.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(AiTranslateLanguageData aiTranslateLanguageData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("languages")) {
                return true;
            }
            return super.parseFieldCheck(aiTranslateLanguageData, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AiTranslateLanguageData aiTranslateLanguageData, JsonGenerator jsonGenerator) throws IOException {
            if (aiTranslateLanguageData.languages != null) {
                jsonGenerator.writeFieldName("languages");
                JsonAdapter.serializeArray(aiTranslateLanguageData.languages, jsonGenerator, AiTranslateLanguage.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AiTranslateLanguageData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AiTranslateLanguageData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AiTranslateLanguageData new_() {
        AiTranslateLanguageData aiTranslateLanguageData = new AiTranslateLanguageData();
        aiTranslateLanguageData.nullCheck();
        return aiTranslateLanguageData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public AiTranslateLanguageData mo225055clone() {
        AiTranslateLanguageData aiTranslateLanguageData = new AiTranslateLanguageData();
        List<AiTranslateLanguage> list = this.languages;
        if (list != null) {
            aiTranslateLanguageData.languages = ValueObject.util_map(list, new qcj() { // from class: l.zg0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((AiTranslateLanguage) obj).mo225055clone();
                }
            });
        }
        return aiTranslateLanguageData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AiTranslateLanguageData) {
            return ValueObject.util_equals(this.languages, ((AiTranslateLanguageData) obj).languages);
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
        List<AiTranslateLanguage> list = this.languages;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.languages == null) {
            this.languages = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
