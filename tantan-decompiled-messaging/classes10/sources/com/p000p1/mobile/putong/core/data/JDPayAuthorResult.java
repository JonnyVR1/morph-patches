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
public class JDPayAuthorResult extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "jdpayauthorresult";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String errorCode;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String extraMsg;

    @NonNull
    @ProtobufIndex(index = 1)
    public String payStatus;
    public static ProtobufAdapter<JDPayAuthorResult> PROTOBUF_ADAPTER = new MessageNanoAdapter<JDPayAuthorResult>() { // from class: com.p1.mobile.putong.core.data.JDPayAuthorResult.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(JDPayAuthorResult jDPayAuthorResult) {
            String str = jDPayAuthorResult.payStatus;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = jDPayAuthorResult.errorCode;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = jDPayAuthorResult.extraMsg;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            ((MessageNano) jDPayAuthorResult).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public JDPayAuthorResult m13759parse(nb5 nb5Var) throws IOException {
            JDPayAuthorResult jDPayAuthorResult = new JDPayAuthorResult();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 10) {
                    jDPayAuthorResult.payStatus = nb5Var.s();
                } else if (iU == 18) {
                    jDPayAuthorResult.errorCode = nb5Var.s();
                } else {
                    if (iU != 26) {
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
                    jDPayAuthorResult.extraMsg = nb5Var.s();
                }
            }
            return jDPayAuthorResult;
        }

        public void serialize(JDPayAuthorResult jDPayAuthorResult, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = jDPayAuthorResult.payStatus;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = jDPayAuthorResult.errorCode;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = jDPayAuthorResult.extraMsg;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
        }
    };
    public static JsonAdapter<JDPayAuthorResult> JSON_ADAPTER = new ObjectJsonAdapter<JDPayAuthorResult>() { // from class: com.p1.mobile.putong.core.data.JDPayAuthorResult.2
        public Class getDataClass() {
            return JDPayAuthorResult.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public JDPayAuthorResult m13760newInstance() {
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((JDPayAuthorResult) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((JDPayAuthorResult) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static JDPayAuthorResult new_() {
        JDPayAuthorResult jDPayAuthorResult = new JDPayAuthorResult();
        jDPayAuthorResult.nullCheck();
        return jDPayAuthorResult;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public JDPayAuthorResult m13758clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
