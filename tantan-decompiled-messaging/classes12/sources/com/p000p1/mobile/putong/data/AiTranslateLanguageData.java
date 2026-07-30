package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.AiTranslateLanguage;
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
public class AiTranslateLanguageData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "aitranslatelanguagedata";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<AiTranslateLanguage> languages;
    public static ProtobufAdapter<AiTranslateLanguageData> PROTOBUF_ADAPTER = new MessageNanoAdapter<AiTranslateLanguageData>() { // from class: com.p1.mobile.putong.data.AiTranslateLanguageData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(AiTranslateLanguageData aiTranslateLanguageData) {
            List<AiTranslateLanguage> list = aiTranslateLanguageData.languages;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, AiTranslateLanguage.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            ((MessageNano) aiTranslateLanguageData).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public AiTranslateLanguageData m17674parse(nb5 nb5Var) throws IOException {
            AiTranslateLanguageData aiTranslateLanguageData = new AiTranslateLanguageData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (aiTranslateLanguageData.languages != null) {
                        break;
                    }
                    aiTranslateLanguageData.languages = new ArrayList();
                    break;
                }
                if (iU != 10) {
                    if (aiTranslateLanguageData.languages != null) {
                        break;
                    }
                    aiTranslateLanguageData.languages = new ArrayList();
                    return aiTranslateLanguageData;
                }
                aiTranslateLanguageData.languages = (List) nb5Var.l(AiTranslateLanguage.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            return aiTranslateLanguageData;
        }

        public void serialize(AiTranslateLanguageData aiTranslateLanguageData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<AiTranslateLanguage> list = aiTranslateLanguageData.languages;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, AiTranslateLanguage.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<AiTranslateLanguageData> JSON_ADAPTER = new ObjectJsonAdapter<AiTranslateLanguageData>() { // from class: com.p1.mobile.putong.data.AiTranslateLanguageData.2
        public Class getDataClass() {
            return AiTranslateLanguageData.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public AiTranslateLanguageData mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AiTranslateLanguageData aiTranslateLanguageData, JsonGenerator jsonGenerator) throws IOException {
            if (aiTranslateLanguageData.languages != null) {
                jsonGenerator.writeFieldName("languages");
                JsonAdapter.serializeArray(aiTranslateLanguageData.languages, jsonGenerator, AiTranslateLanguage.JSON_ADAPTER);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AiTranslateLanguageData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AiTranslateLanguageData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AiTranslateLanguageData new_() {
        AiTranslateLanguageData aiTranslateLanguageData = new AiTranslateLanguageData();
        aiTranslateLanguageData.nullCheck();
        return aiTranslateLanguageData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AiTranslateLanguageData m17673clone() {
        AiTranslateLanguageData aiTranslateLanguageData = new AiTranslateLanguageData();
        List<AiTranslateLanguage> list = this.languages;
        if (list != null) {
            aiTranslateLanguageData.languages = ValueObject.util_map(list, new w9j() { // from class: l.dh0
                public final Object call(Object obj) {
                    return ((AiTranslateLanguage) obj).m17667clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        List<AiTranslateLanguage> list = this.languages;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.languages == null) {
            this.languages = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
