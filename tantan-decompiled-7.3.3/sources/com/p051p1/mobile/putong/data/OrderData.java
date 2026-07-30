package com.p051p1.mobile.putong.data;

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

/* JADX INFO: loaded from: classes12.dex */
public class OrderData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "orderdata";

    @NonNull
    @ProtobufIndex(index = 2)
    public Order data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<OrderData> PROTOBUF_ADAPTER = new MessageNanoAdapter<OrderData>() { // from class: com.p1.mobile.putong.data.OrderData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(OrderData orderData) {
            Meta meta = orderData.meta;
            int iM17285l = meta != null ? CodedOutputByteBufferNano.m17285l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            Order order = orderData.data;
            if (order != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, order, Order.PROTOBUF_ADAPTER);
            }
            orderData.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public OrderData parse(nc5 nc5Var) throws IOException {
            OrderData orderData = new OrderData();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (orderData.meta == null) {
                        orderData.meta = Meta.new_();
                    }
                    if (orderData.data != null) {
                        break;
                    }
                    orderData.data = Order.new_();
                    break;
                }
                if (iM162497u == 10) {
                    orderData.meta = (Meta) nc5Var.m162488l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 18) {
                        if (orderData.meta == null) {
                            orderData.meta = Meta.new_();
                        }
                        if (orderData.data != null) {
                            break;
                        }
                        orderData.data = Order.new_();
                        return orderData;
                    }
                    orderData.data = (Order) nc5Var.m162488l(Order.PROTOBUF_ADAPTER);
                }
            }
            return orderData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(OrderData orderData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = orderData.meta;
            if (meta != null) {
                codedOutputByteBufferNano.m17309K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            Order order = orderData.data;
            if (order != null) {
                codedOutputByteBufferNano.m17309K(2, order, Order.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<OrderData> JSON_ADAPTER = new ObjectJsonAdapter<OrderData>() { // from class: com.p1.mobile.putong.data.OrderData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return OrderData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public OrderData newInstance() {
            return new OrderData();
        }

        public boolean parseField(OrderData orderData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                orderData.data = Order.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            orderData.meta = Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(OrderData orderData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(orderData, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OrderData orderData, JsonGenerator jsonGenerator) throws IOException {
            if (orderData.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(orderData.meta, jsonGenerator, true);
            }
            if (orderData.data != null) {
                jsonGenerator.writeFieldName("data");
                Order.JSON_ADAPTER.serialize(orderData.data, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OrderData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OrderData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OrderData new_() {
        OrderData orderData = new OrderData();
        orderData.nullCheck();
        return orderData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public OrderData mo225055clone() {
        OrderData orderData = new OrderData();
        Meta meta = this.meta;
        if (meta != null) {
            orderData.meta = meta.mo225055clone();
        }
        Order order = this.data;
        if (order != null) {
            orderData.data = order.mo225055clone();
        }
        return orderData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OrderData)) {
            return false;
        }
        OrderData orderData = (OrderData) obj;
        return ValueObject.util_equals(this.meta, orderData.meta) && ValueObject.util_equals(this.data, orderData.data);
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
        Meta meta = this.meta;
        int iHashCode = (i2 + (meta != null ? meta.hashCode() : 0)) * 41;
        Order order = this.data;
        int iHashCode2 = iHashCode + (order != null ? order.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = Order.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
