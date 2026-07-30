package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes10.dex */
public class AIAdviceResults extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "aiadviceresults";

    @NonNull
    @ProtobufIndex(index = 1)
    public String content;
    public static ProtobufAdapter<AIAdviceResults> PROTOBUF_ADAPTER = new MessageNanoAdapter<AIAdviceResults>() { // from class: com.p1.mobile.putong.core.data.AIAdviceResults.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(AIAdviceResults aIAdviceResults) {
            String str = aIAdviceResults.content;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            aIAdviceResults.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AIAdviceResults parse(nb5 nb5Var) throws IOException {
            AIAdviceResults aIAdviceResults = new AIAdviceResults();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (aIAdviceResults.content != null) {
                        break;
                    }
                    aIAdviceResults.content = "";
                    break;
                }
                if (iM158752u != 10) {
                    if (aIAdviceResults.content != null) {
                        break;
                    }
                    aIAdviceResults.content = "";
                    return aIAdviceResults;
                }
                aIAdviceResults.content = nb5Var.m158750s();
            }
            return aIAdviceResults;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AIAdviceResults aIAdviceResults, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = aIAdviceResults.content;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
        }
    };
    public static JsonAdapter<AIAdviceResults> JSON_ADAPTER = new ObjectJsonAdapter<AIAdviceResults>() { // from class: com.p1.mobile.putong.core.data.AIAdviceResults.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AIAdviceResults.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public AIAdviceResults newInstance() {
            return new AIAdviceResults();
        }

        public boolean parseField(AIAdviceResults aIAdviceResults, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("content")) {
                return false;
            }
            aIAdviceResults.content = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(AIAdviceResults aIAdviceResults, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("content")) {
                return true;
            }
            return super.parseFieldCheck(aIAdviceResults, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AIAdviceResults aIAdviceResults, JsonGenerator jsonGenerator) throws IOException {
            String str = aIAdviceResults.content;
            if (str != null) {
                jsonGenerator.writeStringField("content", str);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AIAdviceResults) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AIAdviceResults) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AIAdviceResults new_() {
        AIAdviceResults aIAdviceResults = new AIAdviceResults();
        aIAdviceResults.nullCheck();
        return aIAdviceResults;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public AIAdviceResults mo223809clone() {
        AIAdviceResults aIAdviceResults = new AIAdviceResults();
        aIAdviceResults.content = this.content;
        return aIAdviceResults;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AIAdviceResults) {
            return ValueObject.util_equals(this.content, ((AIAdviceResults) obj).content);
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
        String str = this.content;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.content == null) {
            this.content = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
