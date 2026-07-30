package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class AIAdviceResults extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "aiadviceresults";

    @NonNull
    @ProtobufIndex(index = 1)
    public String content;
    public static ProtobufAdapter<AIAdviceResults> PROTOBUF_ADAPTER = new MessageNanoAdapter<AIAdviceResults>() { // from class: com.p1.mobile.putong.core.data.AIAdviceResults.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(AIAdviceResults aIAdviceResults) {
            String str = aIAdviceResults.content;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            ((MessageNano) aIAdviceResults).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public AIAdviceResults m11467parse(nb5 nb5Var) throws IOException {
            AIAdviceResults aIAdviceResults = new AIAdviceResults();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (aIAdviceResults.content != null) {
                        break;
                    }
                    aIAdviceResults.content = "";
                    break;
                }
                if (iU != 10) {
                    if (aIAdviceResults.content != null) {
                        break;
                    }
                    aIAdviceResults.content = "";
                    return aIAdviceResults;
                }
                aIAdviceResults.content = nb5Var.s();
            }
            return aIAdviceResults;
        }

        public void serialize(AIAdviceResults aIAdviceResults, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = aIAdviceResults.content;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
        }
    };
    public static JsonAdapter<AIAdviceResults> JSON_ADAPTER = new ObjectJsonAdapter<AIAdviceResults>() { // from class: com.p1.mobile.putong.core.data.AIAdviceResults.2
        public Class getDataClass() {
            return AIAdviceResults.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public AIAdviceResults m11468newInstance() {
            return new AIAdviceResults();
        }

        public boolean parseField(AIAdviceResults aIAdviceResults, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals(Content.TYPE)) {
                return false;
            }
            aIAdviceResults.content = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(AIAdviceResults aIAdviceResults, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(Content.TYPE)) {
                return true;
            }
            return super.parseFieldCheck(aIAdviceResults, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(AIAdviceResults aIAdviceResults, JsonGenerator jsonGenerator) throws IOException {
            String str = aIAdviceResults.content;
            if (str != null) {
                jsonGenerator.writeStringField(Content.TYPE, str);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AIAdviceResults) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AIAdviceResults) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AIAdviceResults new_() {
        AIAdviceResults aIAdviceResults = new AIAdviceResults();
        aIAdviceResults.nullCheck();
        return aIAdviceResults;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AIAdviceResults m11466clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.content;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.content == null) {
            this.content = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
