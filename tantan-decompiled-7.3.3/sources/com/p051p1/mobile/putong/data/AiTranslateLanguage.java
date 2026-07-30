package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(AiTranslateLanguage aiTranslateLanguage) {
            String str = aiTranslateLanguage.key;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = aiTranslateLanguage.name;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            aiTranslateLanguage.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AiTranslateLanguage parse(nc5 nc5Var) throws IOException {
            AiTranslateLanguage aiTranslateLanguage = new AiTranslateLanguage();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (aiTranslateLanguage.key == null) {
                        aiTranslateLanguage.key = "";
                    }
                    if (aiTranslateLanguage.name != null) {
                        break;
                    }
                    aiTranslateLanguage.name = "";
                    break;
                }
                if (iM162497u == 10) {
                    aiTranslateLanguage.key = nc5Var.m162495s();
                } else {
                    if (iM162497u != 18) {
                        if (aiTranslateLanguage.key == null) {
                            aiTranslateLanguage.key = "";
                        }
                        if (aiTranslateLanguage.name != null) {
                            break;
                        }
                        aiTranslateLanguage.name = "";
                        return aiTranslateLanguage;
                    }
                    aiTranslateLanguage.name = nc5Var.m162495s();
                }
            }
            return aiTranslateLanguage;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AiTranslateLanguage aiTranslateLanguage, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = aiTranslateLanguage.key;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = aiTranslateLanguage.name;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
        }
    };
    public static JsonAdapter<AiTranslateLanguage> JSON_ADAPTER = new ObjectJsonAdapter<AiTranslateLanguage>() { // from class: com.p1.mobile.putong.data.AiTranslateLanguage.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AiTranslateLanguage.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public AiTranslateLanguage newInstance() {
            return new AiTranslateLanguage();
        }

        public boolean parseField(AiTranslateLanguage aiTranslateLanguage, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(Constants.KEY_KEY)) {
                aiTranslateLanguage.key = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals(AuthenticationTokenClaims.JSON_KEY_NAME)) {
                return false;
            }
            aiTranslateLanguage.name = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(AiTranslateLanguage aiTranslateLanguage, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(Constants.KEY_KEY) || str.equals(AuthenticationTokenClaims.JSON_KEY_NAME)) {
                return true;
            }
            return super.parseFieldCheck(aiTranslateLanguage, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AiTranslateLanguage aiTranslateLanguage, JsonGenerator jsonGenerator) throws IOException {
            String str = aiTranslateLanguage.key;
            if (str != null) {
                jsonGenerator.writeStringField(Constants.KEY_KEY, str);
            }
            String str2 = aiTranslateLanguage.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AiTranslateLanguage) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AiTranslateLanguage) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AiTranslateLanguage new_() {
        AiTranslateLanguage aiTranslateLanguage = new AiTranslateLanguage();
        aiTranslateLanguage.nullCheck();
        return aiTranslateLanguage;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public AiTranslateLanguage mo225055clone() {
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
        String str = this.key;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.key == null) {
            this.key = "";
        }
        if (this.name == null) {
            this.name = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
