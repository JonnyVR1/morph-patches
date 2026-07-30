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
public class Bill extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "bill";

    @NonNull
    @ProtobufIndex(index = 1)
    public String appid;

    @NonNull
    @ProtobufIndex(index = 9)
    public String customer;

    @NonNull
    @ProtobufIndex(index = Conversation.SURPRISE_LEVEL_TOP)
    public String info;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String noncestr;

    @NonNull
    @ProtobufIndex(index = 4)
    public String packageValue;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String partner;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String prepay;

    @NonNull
    @ProtobufIndex(index = 8)
    public String product;

    @NonNull
    @ProtobufIndex(index = 7)
    public String sign;

    @NonNull
    @ProtobufIndex(index = 6)
    public String timestamp;
    public static ProtobufAdapter<Bill> PROTOBUF_ADAPTER = new MessageNanoAdapter<Bill>() { // from class: com.p1.mobile.putong.core.data.Bill.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Bill bill) {
            String str = bill.appid;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = bill.partner;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = bill.prepay;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = bill.packageValue;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            String str5 = bill.noncestr;
            if (str5 != null) {
                iO += CodedOutputByteBufferNano.o(5, str5);
            }
            String str6 = bill.timestamp;
            if (str6 != null) {
                iO += CodedOutputByteBufferNano.o(6, str6);
            }
            String str7 = bill.sign;
            if (str7 != null) {
                iO += CodedOutputByteBufferNano.o(7, str7);
            }
            String str8 = bill.product;
            if (str8 != null) {
                iO += CodedOutputByteBufferNano.o(8, str8);
            }
            String str9 = bill.customer;
            if (str9 != null) {
                iO += CodedOutputByteBufferNano.o(9, str9);
            }
            String str10 = bill.info;
            if (str10 != null) {
                iO += CodedOutputByteBufferNano.o(10, str10);
            }
            ((MessageNano) bill).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Bill m11755parse(nb5 nb5Var) throws IOException {
            Bill bill = new Bill();
            while (true) {
                switch (nb5Var.u()) {
                    case 0:
                        if (bill.appid == null) {
                            bill.appid = "";
                        }
                        if (bill.partner == null) {
                            bill.partner = "";
                        }
                        if (bill.prepay == null) {
                            bill.prepay = "";
                        }
                        if (bill.packageValue == null) {
                            bill.packageValue = "";
                        }
                        if (bill.noncestr == null) {
                            bill.noncestr = "";
                        }
                        if (bill.timestamp == null) {
                            bill.timestamp = "";
                        }
                        if (bill.sign == null) {
                            bill.sign = "";
                        }
                        if (bill.product == null) {
                            bill.product = "";
                        }
                        if (bill.customer == null) {
                            bill.customer = "";
                        }
                        if (bill.info == null) {
                            bill.info = "";
                        }
                        break;
                    case Conversation.SURPRISE_LEVEL_TOP /* 10 */:
                        bill.appid = nb5Var.s();
                        continue;
                    case 18:
                        bill.partner = nb5Var.s();
                        continue;
                    case 26:
                        bill.prepay = nb5Var.s();
                        continue;
                    case 34:
                        bill.packageValue = nb5Var.s();
                        continue;
                    case 42:
                        bill.noncestr = nb5Var.s();
                        continue;
                    case Conversation.EXPOSURE_LEVEL_TOP /* 50 */:
                        bill.timestamp = nb5Var.s();
                        continue;
                    case 58:
                        bill.sign = nb5Var.s();
                        continue;
                    case 66:
                        bill.product = nb5Var.s();
                        continue;
                    case 74:
                        bill.customer = nb5Var.s();
                        continue;
                    case 82:
                        bill.info = nb5Var.s();
                        continue;
                    default:
                        if (bill.appid == null) {
                            bill.appid = "";
                        }
                        if (bill.partner == null) {
                            bill.partner = "";
                        }
                        if (bill.prepay == null) {
                            bill.prepay = "";
                        }
                        if (bill.packageValue == null) {
                            bill.packageValue = "";
                        }
                        if (bill.noncestr == null) {
                            bill.noncestr = "";
                        }
                        if (bill.timestamp == null) {
                            bill.timestamp = "";
                        }
                        if (bill.sign == null) {
                            bill.sign = "";
                        }
                        if (bill.product == null) {
                            bill.product = "";
                        }
                        if (bill.customer == null) {
                            bill.customer = "";
                        }
                        if (bill.info == null) {
                            bill.info = "";
                            return bill;
                        }
                        break;
                }
            }
            return bill;
        }

        public void serialize(Bill bill, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = bill.appid;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = bill.partner;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = bill.prepay;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = bill.packageValue;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
            String str5 = bill.noncestr;
            if (str5 != null) {
                codedOutputByteBufferNano.R(5, str5);
            }
            String str6 = bill.timestamp;
            if (str6 != null) {
                codedOutputByteBufferNano.R(6, str6);
            }
            String str7 = bill.sign;
            if (str7 != null) {
                codedOutputByteBufferNano.R(7, str7);
            }
            String str8 = bill.product;
            if (str8 != null) {
                codedOutputByteBufferNano.R(8, str8);
            }
            String str9 = bill.customer;
            if (str9 != null) {
                codedOutputByteBufferNano.R(9, str9);
            }
            String str10 = bill.info;
            if (str10 != null) {
                codedOutputByteBufferNano.R(10, str10);
            }
        }
    };
    public static JsonAdapter<Bill> JSON_ADAPTER = new ObjectJsonAdapter<Bill>() { // from class: com.p1.mobile.putong.core.data.Bill.2
        public Class getDataClass() {
            return Bill.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public Bill m11756newInstance() {
            return new Bill();
        }

        public boolean parseField(Bill bill, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "partnerid":
                    bill.partner = jsonParser.getValueAsString();
                    return true;
                case "prepayid":
                    bill.prepay = jsonParser.getValueAsString();
                    return true;
                case "package":
                    bill.packageValue = jsonParser.getValueAsString();
                    return true;
                case "user_id":
                    bill.customer = jsonParser.getValueAsString();
                    return true;
                case "sign":
                    bill.sign = jsonParser.getValueAsString();
                    return true;
                case "timestamp":
                    bill.timestamp = jsonParser.getValueAsString();
                    return true;
                case "appid":
                    bill.appid = jsonParser.getValueAsString();
                    return true;
                case "order_info":
                    bill.info = jsonParser.getValueAsString();
                    return true;
                case "noncestr":
                    bill.noncestr = jsonParser.getValueAsString();
                    return true;
                case "product_id":
                    bill.product = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(Bill bill, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "partnerid":
                case "prepayid":
                case "package":
                case "user_id":
                case "sign":
                case "timestamp":
                case "appid":
                case "order_info":
                case "noncestr":
                case "product_id":
                    return true;
                default:
                    return super.parseFieldCheck(bill, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(Bill bill, JsonGenerator jsonGenerator) throws IOException {
            String str = bill.appid;
            if (str != null) {
                jsonGenerator.writeStringField("appid", str);
            }
            String str2 = bill.partner;
            if (str2 != null) {
                jsonGenerator.writeStringField("partnerid", str2);
            }
            String str3 = bill.prepay;
            if (str3 != null) {
                jsonGenerator.writeStringField("prepayid", str3);
            }
            String str4 = bill.packageValue;
            if (str4 != null) {
                jsonGenerator.writeStringField(StickerPackage.TYPE, str4);
            }
            String str5 = bill.noncestr;
            if (str5 != null) {
                jsonGenerator.writeStringField("noncestr", str5);
            }
            String str6 = bill.timestamp;
            if (str6 != null) {
                jsonGenerator.writeStringField("timestamp", str6);
            }
            String str7 = bill.sign;
            if (str7 != null) {
                jsonGenerator.writeStringField("sign", str7);
            }
            String str8 = bill.product;
            if (str8 != null) {
                jsonGenerator.writeStringField("product_id", str8);
            }
            String str9 = bill.customer;
            if (str9 != null) {
                jsonGenerator.writeStringField("user_id", str9);
            }
            String str10 = bill.info;
            if (str10 != null) {
                jsonGenerator.writeStringField("order_info", str10);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Bill) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Bill) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Bill new_() {
        Bill bill = new Bill();
        bill.nullCheck();
        return bill;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Bill m11754clone() {
        Bill bill = new Bill();
        bill.appid = this.appid;
        bill.partner = this.partner;
        bill.prepay = this.prepay;
        bill.packageValue = this.packageValue;
        bill.noncestr = this.noncestr;
        bill.timestamp = this.timestamp;
        bill.sign = this.sign;
        bill.product = this.product;
        bill.customer = this.customer;
        bill.info = this.info;
        return bill;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Bill)) {
            return false;
        }
        Bill bill = (Bill) obj;
        return ValueObject.util_equals(this.appid, bill.appid) && ValueObject.util_equals(this.partner, bill.partner) && ValueObject.util_equals(this.prepay, bill.prepay) && ValueObject.util_equals(this.packageValue, bill.packageValue) && ValueObject.util_equals(this.noncestr, bill.noncestr) && ValueObject.util_equals(this.timestamp, bill.timestamp) && ValueObject.util_equals(this.sign, bill.sign) && ValueObject.util_equals(this.product, bill.product) && ValueObject.util_equals(this.customer, bill.customer) && ValueObject.util_equals(this.info, bill.info);
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
        String str = this.appid;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.partner;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.prepay;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.packageValue;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.noncestr;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.timestamp;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.sign;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.product;
        int iHashCode8 = (iHashCode7 + (str8 != null ? str8.hashCode() : 0)) * 41;
        String str9 = this.customer;
        int iHashCode9 = (iHashCode8 + (str9 != null ? str9.hashCode() : 0)) * 41;
        String str10 = this.info;
        int iHashCode10 = iHashCode9 + (str10 != null ? str10.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode10;
        return iHashCode10;
    }

    public void nullCheck() {
        if (this.appid == null) {
            this.appid = "";
        }
        if (this.partner == null) {
            this.partner = "";
        }
        if (this.prepay == null) {
            this.prepay = "";
        }
        if (this.packageValue == null) {
            this.packageValue = "";
        }
        if (this.noncestr == null) {
            this.noncestr = "";
        }
        if (this.timestamp == null) {
            this.timestamp = "";
        }
        if (this.sign == null) {
            this.sign = "";
        }
        if (this.product == null) {
            this.product = "";
        }
        if (this.customer == null) {
            this.customer = "";
        }
        if (this.info == null) {
            this.info = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
