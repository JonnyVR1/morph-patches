package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.data.MembershipType;
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
public class OrderInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "orderinfo";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public MembershipType membershipType;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public Merchandise merchandise;

    @NonNull
    @ProtobufIndex(index = 1)
    public String status;
    public static ProtobufAdapter<OrderInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<OrderInfo>() { // from class: com.p1.mobile.putong.core.data.OrderInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(OrderInfo orderInfo) {
            String str = orderInfo.status;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            MembershipType membershipType = orderInfo.membershipType;
            if (membershipType != null) {
                iO += CodedOutputByteBufferNano.h(2, membershipType.ordinal());
            }
            Merchandise merchandise = orderInfo.merchandise;
            if (merchandise != null) {
                iO += CodedOutputByteBufferNano.l(3, merchandise, Merchandise.PROTOBUF_ADAPTER);
            }
            MembershipType membershipType2 = orderInfo.membershipType;
            if (membershipType2 != null) {
                iO += CodedOutputByteBufferNano.l(4, membershipType2, MembershipType.PROTOBUF_ADAPTER);
            }
            ((MessageNano) orderInfo).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public OrderInfo m14703parse(nb5 nb5Var) throws IOException {
            OrderInfo orderInfo = new OrderInfo();
            Integer numValueOf = null;
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (orderInfo.membershipType == null && numValueOf != null) {
                        orderInfo.membershipType = MembershipType.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
                    }
                    if (orderInfo.status == null) {
                        orderInfo.status = "";
                    }
                    if (orderInfo.membershipType == null) {
                        orderInfo.membershipType = MembershipType.JSON_ADAPTER.defaultEnum();
                    }
                    if (orderInfo.merchandise != null) {
                        break;
                    }
                    orderInfo.merchandise = Merchandise.new_();
                    break;
                }
                if (iU == 10) {
                    orderInfo.status = nb5Var.s();
                } else if (iU == 16) {
                    numValueOf = Integer.valueOf(nb5Var.j());
                } else if (iU == 26) {
                    orderInfo.merchandise = (Merchandise) nb5Var.l(Merchandise.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 34) {
                        if (orderInfo.membershipType == null && numValueOf != null) {
                            orderInfo.membershipType = MembershipType.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
                        }
                        if (orderInfo.status == null) {
                            orderInfo.status = "";
                        }
                        if (orderInfo.membershipType == null) {
                            orderInfo.membershipType = MembershipType.JSON_ADAPTER.defaultEnum();
                        }
                        if (orderInfo.merchandise != null) {
                            break;
                        }
                        orderInfo.merchandise = Merchandise.new_();
                        return orderInfo;
                    }
                    orderInfo.membershipType = (MembershipType) nb5Var.l(MembershipType.PROTOBUF_ADAPTER);
                }
            }
            return orderInfo;
        }

        public void serialize(OrderInfo orderInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = orderInfo.status;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            MembershipType membershipType = orderInfo.membershipType;
            if (membershipType != null) {
                codedOutputByteBufferNano.G(2, membershipType.ordinal());
            }
            Merchandise merchandise = orderInfo.merchandise;
            if (merchandise != null) {
                codedOutputByteBufferNano.K(3, merchandise, Merchandise.PROTOBUF_ADAPTER);
            }
            MembershipType membershipType2 = orderInfo.membershipType;
            if (membershipType2 != null) {
                codedOutputByteBufferNano.K(4, membershipType2, MembershipType.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<OrderInfo> JSON_ADAPTER = new ObjectJsonAdapter<OrderInfo>() { // from class: com.p1.mobile.putong.core.data.OrderInfo.2
        public Class getDataClass() {
            return OrderInfo.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public OrderInfo m14704newInstance() {
            return new OrderInfo();
        }

        public boolean parseField(OrderInfo orderInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "status":
                    orderInfo.status = jsonParser.getValueAsString();
                    return true;
                case "membershipType":
                    orderInfo.membershipType = (MembershipType) MembershipType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "merchandise":
                    orderInfo.merchandise = (Merchandise) Merchandise.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(OrderInfo orderInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "status":
                case "membershipType":
                case "merchandise":
                    return true;
                default:
                    return super.parseFieldCheck(orderInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(OrderInfo orderInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = orderInfo.status;
            if (str != null) {
                jsonGenerator.writeStringField("status", str);
            }
            if (orderInfo.membershipType != null) {
                jsonGenerator.writeFieldName("membershipType");
                MembershipType.JSON_ADAPTER.serialize(orderInfo.membershipType, jsonGenerator, true);
            }
            if (orderInfo.merchandise != null) {
                jsonGenerator.writeFieldName(Merchandise.TYPE);
                Merchandise.JSON_ADAPTER.serialize(orderInfo.merchandise, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OrderInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OrderInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OrderInfo new_() {
        OrderInfo orderInfo = new OrderInfo();
        orderInfo.nullCheck();
        return orderInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public OrderInfo m14702clone() {
        OrderInfo orderInfo = new OrderInfo();
        orderInfo.status = this.status;
        orderInfo.membershipType = this.membershipType;
        Merchandise merchandise = this.merchandise;
        if (merchandise != null) {
            orderInfo.merchandise = merchandise.m14136clone();
        }
        return orderInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OrderInfo)) {
            return false;
        }
        OrderInfo orderInfo = (OrderInfo) obj;
        return ValueObject.util_equals(this.status, orderInfo.status) && ValueObject.util_equals(this.membershipType, orderInfo.membershipType) && ValueObject.util_equals(this.merchandise, orderInfo.merchandise);
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
        String str = this.status;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        MembershipType membershipType = this.membershipType;
        int iHashCode2 = (iHashCode + (membershipType != null ? membershipType.hashCode() : 0)) * 41;
        Merchandise merchandise = this.merchandise;
        int iHashCode3 = iHashCode2 + (merchandise != null ? merchandise.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.status == null) {
            this.status = "";
        }
        if (this.membershipType == null) {
            this.membershipType = MembershipType.JSON_ADAPTER.defaultEnum();
        }
        if (this.merchandise == null) {
            this.merchandise = Merchandise.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
