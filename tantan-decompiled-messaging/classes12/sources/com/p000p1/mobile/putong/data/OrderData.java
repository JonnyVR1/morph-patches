package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(OrderData orderData) {
            Meta meta = orderData.meta;
            int iL = meta != null ? CodedOutputByteBufferNano.l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            Order order = orderData.data;
            if (order != null) {
                iL += CodedOutputByteBufferNano.l(2, order, Order.PROTOBUF_ADAPTER);
            }
            ((MessageNano) orderData).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public OrderData m18750parse(nb5 nb5Var) throws IOException {
            OrderData orderData = new OrderData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (orderData.meta == null) {
                        orderData.meta = Meta.new_();
                    }
                    if (orderData.data != null) {
                        break;
                    }
                    orderData.data = Order.new_();
                    break;
                }
                if (iU == 10) {
                    orderData.meta = (Meta) nb5Var.l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 18) {
                        if (orderData.meta == null) {
                            orderData.meta = Meta.new_();
                        }
                        if (orderData.data != null) {
                            break;
                        }
                        orderData.data = Order.new_();
                        return orderData;
                    }
                    orderData.data = (Order) nb5Var.l(Order.PROTOBUF_ADAPTER);
                }
            }
            return orderData;
        }

        public void serialize(OrderData orderData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = orderData.meta;
            if (meta != null) {
                codedOutputByteBufferNano.K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            Order order = orderData.data;
            if (order != null) {
                codedOutputByteBufferNano.K(2, order, Order.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<OrderData> JSON_ADAPTER = new ObjectJsonAdapter<OrderData>() { // from class: com.p1.mobile.putong.data.OrderData.2
        public Class getDataClass() {
            return OrderData.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public OrderData mo17830newInstance() {
            return new OrderData();
        }

        public boolean parseField(OrderData orderData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(Data.TYPE)) {
                orderData.data = (Order) Order.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals(Meta.TYPE)) {
                return false;
            }
            orderData.meta = (Meta) Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(OrderData orderData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(Data.TYPE) || str.equals(Meta.TYPE)) {
                return true;
            }
            return super.parseFieldCheck(orderData, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OrderData orderData, JsonGenerator jsonGenerator) throws IOException {
            if (orderData.meta != null) {
                jsonGenerator.writeFieldName(Meta.TYPE);
                Meta.JSON_ADAPTER.serialize(orderData.meta, jsonGenerator, true);
            }
            if (orderData.data != null) {
                jsonGenerator.writeFieldName(Data.TYPE);
                Order.JSON_ADAPTER.serialize(orderData.data, jsonGenerator, true);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OrderData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OrderData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OrderData new_() {
        OrderData orderData = new OrderData();
        orderData.nullCheck();
        return orderData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public OrderData m18749clone() {
        OrderData orderData = new OrderData();
        Meta meta = this.meta;
        if (meta != null) {
            orderData.meta = meta.m18461clone();
        }
        Order order = this.data;
        if (order != null) {
            orderData.data = order.m18746clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        Meta meta = this.meta;
        int iHashCode = (i2 + (meta != null ? meta.hashCode() : 0)) * 41;
        Order order = this.data;
        int iHashCode2 = iHashCode + (order != null ? order.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = Order.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
