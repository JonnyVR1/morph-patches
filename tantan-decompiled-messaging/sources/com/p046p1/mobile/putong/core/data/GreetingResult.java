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
public class GreetingResult extends ValueObject implements Cloneable, Serializable {
    public static final String RESULT_CREATE_CONVERSATION = "newConversation";
    public static final String RESULT_DEFAULT = "default";
    public static final String TYPE = "greetingresult";

    @NonNull
    @ProtobufIndex(index = 1)
    public String caseValue;
    public static ProtobufAdapter<GreetingResult> PROTOBUF_ADAPTER = new MessageNanoAdapter<GreetingResult>() { // from class: com.p1.mobile.putong.core.data.GreetingResult.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(GreetingResult greetingResult) {
            String str = greetingResult.caseValue;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            greetingResult.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GreetingResult parse(nb5 nb5Var) throws IOException {
            GreetingResult greetingResult = new GreetingResult();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (greetingResult.caseValue != null) {
                        break;
                    }
                    greetingResult.caseValue = "";
                    break;
                }
                if (iM158752u != 10) {
                    if (greetingResult.caseValue != null) {
                        break;
                    }
                    greetingResult.caseValue = "";
                    return greetingResult;
                }
                greetingResult.caseValue = nb5Var.m158750s();
            }
            return greetingResult;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GreetingResult greetingResult, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = greetingResult.caseValue;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
        }
    };
    public static JsonAdapter<GreetingResult> JSON_ADAPTER = new ObjectJsonAdapter<GreetingResult>() { // from class: com.p1.mobile.putong.core.data.GreetingResult.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GreetingResult.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public GreetingResult newInstance() {
            return new GreetingResult();
        }

        public boolean parseField(GreetingResult greetingResult, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("case")) {
                return false;
            }
            greetingResult.caseValue = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(GreetingResult greetingResult, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("case")) {
                return true;
            }
            return super.parseFieldCheck(greetingResult, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GreetingResult greetingResult, JsonGenerator jsonGenerator) throws IOException {
            String str = greetingResult.caseValue;
            if (str != null) {
                jsonGenerator.writeStringField("case", str);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GreetingResult) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GreetingResult) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GreetingResult new_() {
        GreetingResult greetingResult = new GreetingResult();
        greetingResult.nullCheck();
        return greetingResult;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public GreetingResult mo223809clone() {
        GreetingResult greetingResult = new GreetingResult();
        greetingResult.caseValue = this.caseValue;
        return greetingResult;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof GreetingResult) {
            return ValueObject.util_equals(this.caseValue, ((GreetingResult) obj).caseValue);
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
        String str = this.caseValue;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.caseValue == null) {
            this.caseValue = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
