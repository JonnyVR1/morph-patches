package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.MembershipType;
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
public class OrderInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "orderinfo";

    @NonNull
    @ProtobufIndex(index = 2)
    public MembershipType membershipType;

    @NonNull
    @ProtobufIndex(index = 3)
    public Merchandise merchandise;

    @NonNull
    @ProtobufIndex(index = 1)
    public String status;
    public static ProtobufAdapter<OrderInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<OrderInfo>() { // from class: com.p1.mobile.putong.core.data.OrderInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(OrderInfo orderInfo) {
            String str = orderInfo.status;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            MembershipType membershipType = orderInfo.membershipType;
            if (membershipType != null) {
                iM17288o += CodedOutputByteBufferNano.m17281h(2, membershipType.ordinal());
            }
            Merchandise merchandise = orderInfo.merchandise;
            if (merchandise != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(3, merchandise, Merchandise.PROTOBUF_ADAPTER);
            }
            MembershipType membershipType2 = orderInfo.membershipType;
            if (membershipType2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(4, membershipType2, MembershipType.PROTOBUF_ADAPTER);
            }
            orderInfo.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public OrderInfo parse(nc5 nc5Var) throws IOException {
            OrderInfo orderInfo = new OrderInfo();
            Integer numValueOf = null;
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (orderInfo.membershipType == null && numValueOf != null) {
                        orderInfo.membershipType = (MembershipType) MembershipType.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                    }
                    if (orderInfo.status == null) {
                        orderInfo.status = "";
                    }
                    if (orderInfo.membershipType == null) {
                        orderInfo.membershipType = (MembershipType) MembershipType.JSON_ADAPTER.defaultEnum();
                    }
                    if (orderInfo.merchandise != null) {
                        break;
                    }
                    orderInfo.merchandise = Merchandise.new_();
                    break;
                }
                if (iM162497u == 10) {
                    orderInfo.status = nc5Var.m162495s();
                } else if (iM162497u == 16) {
                    numValueOf = Integer.valueOf(nc5Var.m162486j());
                } else if (iM162497u == 26) {
                    orderInfo.merchandise = (Merchandise) nc5Var.m162488l(Merchandise.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 34) {
                        if (orderInfo.membershipType == null && numValueOf != null) {
                            orderInfo.membershipType = (MembershipType) MembershipType.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (orderInfo.status == null) {
                            orderInfo.status = "";
                        }
                        if (orderInfo.membershipType == null) {
                            orderInfo.membershipType = (MembershipType) MembershipType.JSON_ADAPTER.defaultEnum();
                        }
                        if (orderInfo.merchandise != null) {
                            break;
                        }
                        orderInfo.merchandise = Merchandise.new_();
                        return orderInfo;
                    }
                    orderInfo.membershipType = (MembershipType) nc5Var.m162488l(MembershipType.PROTOBUF_ADAPTER);
                }
            }
            return orderInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(OrderInfo orderInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = orderInfo.status;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            MembershipType membershipType = orderInfo.membershipType;
            if (membershipType != null) {
                codedOutputByteBufferNano.m17305G(2, membershipType.ordinal());
            }
            Merchandise merchandise = orderInfo.merchandise;
            if (merchandise != null) {
                codedOutputByteBufferNano.m17309K(3, merchandise, Merchandise.PROTOBUF_ADAPTER);
            }
            MembershipType membershipType2 = orderInfo.membershipType;
            if (membershipType2 != null) {
                codedOutputByteBufferNano.m17309K(4, membershipType2, MembershipType.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<OrderInfo> JSON_ADAPTER = new ObjectJsonAdapter<OrderInfo>() { // from class: com.p1.mobile.putong.core.data.OrderInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return OrderInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public OrderInfo newInstance() {
            return new OrderInfo();
        }

        public boolean parseField(OrderInfo orderInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "status":
                    orderInfo.status = jsonParser.getValueAsString();
                    return true;
                case "membershipType":
                    orderInfo.membershipType = MembershipType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "merchandise":
                    orderInfo.merchandise = Merchandise.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OrderInfo orderInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = orderInfo.status;
            if (str != null) {
                jsonGenerator.writeStringField(NotificationCompat.CATEGORY_STATUS, str);
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OrderInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OrderInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OrderInfo new_() {
        OrderInfo orderInfo = new OrderInfo();
        orderInfo.nullCheck();
        return orderInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public OrderInfo mo225055clone() {
        OrderInfo orderInfo = new OrderInfo();
        orderInfo.status = this.status;
        orderInfo.membershipType = this.membershipType;
        Merchandise merchandise = this.merchandise;
        if (merchandise != null) {
            orderInfo.merchandise = merchandise.mo225055clone();
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
        String str = this.status;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        MembershipType membershipType = this.membershipType;
        int iHashCode2 = (iHashCode + (membershipType != null ? membershipType.hashCode() : 0)) * 41;
        Merchandise merchandise = this.merchandise;
        int iHashCode3 = iHashCode2 + (merchandise != null ? merchandise.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.status == null) {
            this.status = "";
        }
        if (this.membershipType == null) {
            this.membershipType = (MembershipType) MembershipType.JSON_ADAPTER.defaultEnum();
        }
        if (this.merchandise == null) {
            this.merchandise = Merchandise.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
