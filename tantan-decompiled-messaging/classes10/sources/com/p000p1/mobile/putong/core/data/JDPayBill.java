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
public class JDPayBill extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "jdpaybill";

    @NonNull
    @ProtobufIndex(index = 1)
    public String appId;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String jingdongMD5;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String merchant;

    @NonNull
    @ProtobufIndex(index = 4)
    public String orderId;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String sign;

    @NonNull
    @ProtobufIndex(index = 6)
    public String signData;
    public static ProtobufAdapter<JDPayBill> PROTOBUF_ADAPTER = new MessageNanoAdapter<JDPayBill>() { // from class: com.p1.mobile.putong.core.data.JDPayBill.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(JDPayBill jDPayBill) {
            String str = jDPayBill.appId;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = jDPayBill.sign;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = jDPayBill.merchant;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = jDPayBill.orderId;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            String str5 = jDPayBill.jingdongMD5;
            if (str5 != null) {
                iO += CodedOutputByteBufferNano.o(5, str5);
            }
            String str6 = jDPayBill.signData;
            if (str6 != null) {
                iO += CodedOutputByteBufferNano.o(6, str6);
            }
            ((MessageNano) jDPayBill).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public JDPayBill m13763parse(nb5 nb5Var) throws IOException {
            JDPayBill jDPayBill = new JDPayBill();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (jDPayBill.appId == null) {
                        jDPayBill.appId = "";
                    }
                    if (jDPayBill.sign == null) {
                        jDPayBill.sign = "";
                    }
                    if (jDPayBill.merchant == null) {
                        jDPayBill.merchant = "";
                    }
                    if (jDPayBill.orderId == null) {
                        jDPayBill.orderId = "";
                    }
                    if (jDPayBill.jingdongMD5 == null) {
                        jDPayBill.jingdongMD5 = "";
                    }
                    if (jDPayBill.signData != null) {
                        break;
                    }
                    jDPayBill.signData = "";
                    break;
                }
                if (iU == 10) {
                    jDPayBill.appId = nb5Var.s();
                } else if (iU == 18) {
                    jDPayBill.sign = nb5Var.s();
                } else if (iU == 26) {
                    jDPayBill.merchant = nb5Var.s();
                } else if (iU == 34) {
                    jDPayBill.orderId = nb5Var.s();
                } else if (iU == 42) {
                    jDPayBill.jingdongMD5 = nb5Var.s();
                } else {
                    if (iU != 50) {
                        if (jDPayBill.appId == null) {
                            jDPayBill.appId = "";
                        }
                        if (jDPayBill.sign == null) {
                            jDPayBill.sign = "";
                        }
                        if (jDPayBill.merchant == null) {
                            jDPayBill.merchant = "";
                        }
                        if (jDPayBill.orderId == null) {
                            jDPayBill.orderId = "";
                        }
                        if (jDPayBill.jingdongMD5 == null) {
                            jDPayBill.jingdongMD5 = "";
                        }
                        if (jDPayBill.signData != null) {
                            break;
                        }
                        jDPayBill.signData = "";
                        return jDPayBill;
                    }
                    jDPayBill.signData = nb5Var.s();
                }
            }
            return jDPayBill;
        }

        public void serialize(JDPayBill jDPayBill, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = jDPayBill.appId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = jDPayBill.sign;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = jDPayBill.merchant;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = jDPayBill.orderId;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
            String str5 = jDPayBill.jingdongMD5;
            if (str5 != null) {
                codedOutputByteBufferNano.R(5, str5);
            }
            String str6 = jDPayBill.signData;
            if (str6 != null) {
                codedOutputByteBufferNano.R(6, str6);
            }
        }
    };
    public static JsonAdapter<JDPayBill> JSON_ADAPTER = new ObjectJsonAdapter<JDPayBill>() { // from class: com.p1.mobile.putong.core.data.JDPayBill.2
        public Class getDataClass() {
            return JDPayBill.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public JDPayBill m13764newInstance() {
            return new JDPayBill();
        }

        public boolean parseField(JDPayBill jDPayBill, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "orderId":
                    jDPayBill.orderId = jsonParser.getValueAsString();
                    return true;
                case "jingdongMD5":
                    jDPayBill.jingdongMD5 = jsonParser.getValueAsString();
                    return true;
                case "merchant":
                    jDPayBill.merchant = jsonParser.getValueAsString();
                    return true;
                case "sign":
                    jDPayBill.sign = jsonParser.getValueAsString();
                    return true;
                case "appId":
                    jDPayBill.appId = jsonParser.getValueAsString();
                    return true;
                case "signData":
                    jDPayBill.signData = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(JDPayBill jDPayBill, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "orderId":
                case "jingdongMD5":
                case "merchant":
                case "sign":
                case "appId":
                case "signData":
                    return true;
                default:
                    return super.parseFieldCheck(jDPayBill, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(JDPayBill jDPayBill, JsonGenerator jsonGenerator) throws IOException {
            String str = jDPayBill.appId;
            if (str != null) {
                jsonGenerator.writeStringField("appId", str);
            }
            String str2 = jDPayBill.sign;
            if (str2 != null) {
                jsonGenerator.writeStringField("sign", str2);
            }
            String str3 = jDPayBill.merchant;
            if (str3 != null) {
                jsonGenerator.writeStringField("merchant", str3);
            }
            String str4 = jDPayBill.orderId;
            if (str4 != null) {
                jsonGenerator.writeStringField("orderId", str4);
            }
            String str5 = jDPayBill.jingdongMD5;
            if (str5 != null) {
                jsonGenerator.writeStringField("jingdongMD5", str5);
            }
            String str6 = jDPayBill.signData;
            if (str6 != null) {
                jsonGenerator.writeStringField("signData", str6);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((JDPayBill) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((JDPayBill) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static JDPayBill new_() {
        JDPayBill jDPayBill = new JDPayBill();
        jDPayBill.nullCheck();
        return jDPayBill;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public JDPayBill m13762clone() {
        JDPayBill jDPayBill = new JDPayBill();
        jDPayBill.appId = this.appId;
        jDPayBill.sign = this.sign;
        jDPayBill.merchant = this.merchant;
        jDPayBill.orderId = this.orderId;
        jDPayBill.jingdongMD5 = this.jingdongMD5;
        jDPayBill.signData = this.signData;
        return jDPayBill;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof JDPayBill)) {
            return false;
        }
        JDPayBill jDPayBill = (JDPayBill) obj;
        return ValueObject.util_equals(this.appId, jDPayBill.appId) && ValueObject.util_equals(this.sign, jDPayBill.sign) && ValueObject.util_equals(this.merchant, jDPayBill.merchant) && ValueObject.util_equals(this.orderId, jDPayBill.orderId) && ValueObject.util_equals(this.jingdongMD5, jDPayBill.jingdongMD5) && ValueObject.util_equals(this.signData, jDPayBill.signData);
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
        String str = this.appId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.sign;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.merchant;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.orderId;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.jingdongMD5;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.signData;
        int iHashCode6 = iHashCode5 + (str6 != null ? str6.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode6;
        return iHashCode6;
    }

    public void nullCheck() {
        if (this.appId == null) {
            this.appId = "";
        }
        if (this.sign == null) {
            this.sign = "";
        }
        if (this.merchant == null) {
            this.merchant = "";
        }
        if (this.orderId == null) {
            this.orderId = "";
        }
        if (this.jingdongMD5 == null) {
            this.jingdongMD5 = "";
        }
        if (this.signData == null) {
            this.signData = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
