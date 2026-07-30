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
public class GreetingResult extends ValueObject implements Cloneable, Serializable {
    public static final String RESULT_CREATE_CONVERSATION = "newConversation";
    public static final String RESULT_DEFAULT = "default";
    public static final String TYPE = "greetingresult";

    @NonNull
    @ProtobufIndex(index = 1)
    public String caseValue;
    public static ProtobufAdapter<GreetingResult> PROTOBUF_ADAPTER = new MessageNanoAdapter<GreetingResult>() { // from class: com.p1.mobile.putong.core.data.GreetingResult.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(GreetingResult greetingResult) {
            String str = greetingResult.caseValue;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            ((MessageNano) greetingResult).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public GreetingResult m13053parse(nb5 nb5Var) throws IOException {
            GreetingResult greetingResult = new GreetingResult();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (greetingResult.caseValue != null) {
                        break;
                    }
                    greetingResult.caseValue = "";
                    break;
                }
                if (iU != 10) {
                    if (greetingResult.caseValue != null) {
                        break;
                    }
                    greetingResult.caseValue = "";
                    return greetingResult;
                }
                greetingResult.caseValue = nb5Var.s();
            }
            return greetingResult;
        }

        public void serialize(GreetingResult greetingResult, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = greetingResult.caseValue;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
        }
    };
    public static JsonAdapter<GreetingResult> JSON_ADAPTER = new ObjectJsonAdapter<GreetingResult>() { // from class: com.p1.mobile.putong.core.data.GreetingResult.2
        public Class getDataClass() {
            return GreetingResult.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public GreetingResult m13054newInstance() {
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

        public void serializeFields(GreetingResult greetingResult, JsonGenerator jsonGenerator) throws IOException {
            String str = greetingResult.caseValue;
            if (str != null) {
                jsonGenerator.writeStringField("case", str);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GreetingResult) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GreetingResult) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GreetingResult new_() {
        GreetingResult greetingResult = new GreetingResult();
        greetingResult.nullCheck();
        return greetingResult;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public GreetingResult m13052clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.caseValue;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.caseValue == null) {
            this.caseValue = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
