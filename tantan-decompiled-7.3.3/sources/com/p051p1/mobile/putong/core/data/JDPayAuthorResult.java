package com.p051p1.mobile.putong.core.data;

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

/* JADX INFO: loaded from: classes10.dex */
public class JDPayAuthorResult extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "jdpayauthorresult";

    @NonNull
    @ProtobufIndex(index = 2)
    public String errorCode;

    @NonNull
    @ProtobufIndex(index = 3)
    public String extraMsg;

    @NonNull
    @ProtobufIndex(index = 1)
    public String payStatus;
    public static ProtobufAdapter<JDPayAuthorResult> PROTOBUF_ADAPTER = new MessageNanoAdapter<JDPayAuthorResult>() { // from class: com.p1.mobile.putong.core.data.JDPayAuthorResult.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(JDPayAuthorResult jDPayAuthorResult) {
            String str = jDPayAuthorResult.payStatus;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = jDPayAuthorResult.errorCode;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = jDPayAuthorResult.extraMsg;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            jDPayAuthorResult.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public JDPayAuthorResult parse(nc5 nc5Var) throws IOException {
            JDPayAuthorResult jDPayAuthorResult = new JDPayAuthorResult();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (jDPayAuthorResult.payStatus == null) {
                        jDPayAuthorResult.payStatus = "";
                    }
                    if (jDPayAuthorResult.errorCode == null) {
                        jDPayAuthorResult.errorCode = "";
                    }
                    if (jDPayAuthorResult.extraMsg != null) {
                        break;
                    }
                    jDPayAuthorResult.extraMsg = "";
                    break;
                }
                if (iM162497u == 10) {
                    jDPayAuthorResult.payStatus = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    jDPayAuthorResult.errorCode = nc5Var.m162495s();
                } else {
                    if (iM162497u != 26) {
                        if (jDPayAuthorResult.payStatus == null) {
                            jDPayAuthorResult.payStatus = "";
                        }
                        if (jDPayAuthorResult.errorCode == null) {
                            jDPayAuthorResult.errorCode = "";
                        }
                        if (jDPayAuthorResult.extraMsg != null) {
                            break;
                        }
                        jDPayAuthorResult.extraMsg = "";
                        return jDPayAuthorResult;
                    }
                    jDPayAuthorResult.extraMsg = nc5Var.m162495s();
                }
            }
            return jDPayAuthorResult;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(JDPayAuthorResult jDPayAuthorResult, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = jDPayAuthorResult.payStatus;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = jDPayAuthorResult.errorCode;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = jDPayAuthorResult.extraMsg;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
        }
    };
    public static JsonAdapter<JDPayAuthorResult> JSON_ADAPTER = new ObjectJsonAdapter<JDPayAuthorResult>() { // from class: com.p1.mobile.putong.core.data.JDPayAuthorResult.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return JDPayAuthorResult.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public JDPayAuthorResult newInstance() {
            return new JDPayAuthorResult();
        }

        public boolean parseField(JDPayAuthorResult jDPayAuthorResult, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "extraMsg":
                    jDPayAuthorResult.extraMsg = jsonParser.getValueAsString();
                    return true;
                case "payStatus":
                    jDPayAuthorResult.payStatus = jsonParser.getValueAsString();
                    return true;
                case "errorCode":
                    jDPayAuthorResult.errorCode = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(JDPayAuthorResult jDPayAuthorResult, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "extraMsg":
                case "payStatus":
                case "errorCode":
                    return true;
                default:
                    return super.parseFieldCheck(jDPayAuthorResult, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(JDPayAuthorResult jDPayAuthorResult, JsonGenerator jsonGenerator) throws IOException {
            String str = jDPayAuthorResult.payStatus;
            if (str != null) {
                jsonGenerator.writeStringField("payStatus", str);
            }
            String str2 = jDPayAuthorResult.errorCode;
            if (str2 != null) {
                jsonGenerator.writeStringField("errorCode", str2);
            }
            String str3 = jDPayAuthorResult.extraMsg;
            if (str3 != null) {
                jsonGenerator.writeStringField("extraMsg", str3);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((JDPayAuthorResult) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((JDPayAuthorResult) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static JDPayAuthorResult new_() {
        JDPayAuthorResult jDPayAuthorResult = new JDPayAuthorResult();
        jDPayAuthorResult.nullCheck();
        return jDPayAuthorResult;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public JDPayAuthorResult mo225055clone() {
        JDPayAuthorResult jDPayAuthorResult = new JDPayAuthorResult();
        jDPayAuthorResult.payStatus = this.payStatus;
        jDPayAuthorResult.errorCode = this.errorCode;
        jDPayAuthorResult.extraMsg = this.extraMsg;
        return jDPayAuthorResult;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof JDPayAuthorResult)) {
            return false;
        }
        JDPayAuthorResult jDPayAuthorResult = (JDPayAuthorResult) obj;
        return ValueObject.util_equals(this.payStatus, jDPayAuthorResult.payStatus) && ValueObject.util_equals(this.errorCode, jDPayAuthorResult.errorCode) && ValueObject.util_equals(this.extraMsg, jDPayAuthorResult.extraMsg);
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
        String str = this.payStatus;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.errorCode;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.extraMsg;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.payStatus == null) {
            this.payStatus = "";
        }
        if (this.errorCode == null) {
            this.errorCode = "";
        }
        if (this.extraMsg == null) {
            this.extraMsg = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
