package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.Item;
import com.p000p1.mobile.putong.core.data.ServiceItem;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ServiceItem extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "serviceitem";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<Item> list;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public List<Integer> mcc;
    public static ProtobufAdapter<ServiceItem> PROTOBUF_ADAPTER = new MessageNanoAdapter<ServiceItem>() { // from class: com.p1.mobile.putong.core.data.ServiceItem.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ServiceItem serviceItem) {
            List<Item> list = serviceItem.list;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, Item.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<Integer> list2 = serviceItem.mcc;
            if (list2 != null) {
                iL += CodedOutputByteBufferNano.l(2, list2, ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) serviceItem).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ServiceItem m15589parse(nb5 nb5Var) throws IOException {
            ServiceItem serviceItem = new ServiceItem();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (serviceItem.list == null) {
                        serviceItem.list = new ArrayList();
                    }
                    if (serviceItem.mcc != null) {
                        break;
                    }
                    serviceItem.mcc = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    serviceItem.list = (List) nb5Var.l(Item.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 18) {
                        if (serviceItem.list == null) {
                            serviceItem.list = new ArrayList();
                        }
                        if (serviceItem.mcc != null) {
                            break;
                        }
                        serviceItem.mcc = new ArrayList();
                        return serviceItem;
                    }
                    serviceItem.mcc = (List) nb5Var.l(ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return serviceItem;
        }

        public void serialize(ServiceItem serviceItem, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<Item> list = serviceItem.list;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, Item.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Integer> list2 = serviceItem.mcc;
            if (list2 != null) {
                codedOutputByteBufferNano.K(2, list2, ProtobufAdapter.INT_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<ServiceItem> JSON_ADAPTER = new ObjectJsonAdapter<ServiceItem>() { // from class: com.p1.mobile.putong.core.data.ServiceItem.2
        public Class getDataClass() {
            return ServiceItem.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ServiceItem m15590newInstance() {
            return new ServiceItem();
        }

        public boolean parseField(ServiceItem serviceItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("mcc")) {
                serviceItem.mcc = JsonAdapter.parseArray(jsonParser, JsonAdapter.INT_BOXED_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("list")) {
                return false;
            }
            serviceItem.list = JsonAdapter.parseArray(jsonParser, Item.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(ServiceItem serviceItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("mcc") || str.equals("list")) {
                return true;
            }
            return super.parseFieldCheck(serviceItem, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(ServiceItem serviceItem, JsonGenerator jsonGenerator) throws IOException {
            if (serviceItem.list != null) {
                jsonGenerator.writeFieldName("list");
                JsonAdapter.serializeArray(serviceItem.list, jsonGenerator, Item.JSON_ADAPTER);
            }
            if (serviceItem.mcc != null) {
                jsonGenerator.writeFieldName("mcc");
                JsonAdapter.serializeArray(serviceItem.mcc, jsonGenerator, JsonAdapter.INT_BOXED_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ServiceItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ServiceItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Integer m638a(Integer num) {
        return num;
    }

    public static ServiceItem new_() {
        ServiceItem serviceItem = new ServiceItem();
        serviceItem.nullCheck();
        return serviceItem;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ServiceItem m15588clone() {
        ServiceItem serviceItem = new ServiceItem();
        List<Item> list = this.list;
        if (list != null) {
            serviceItem.list = ValueObject.util_map(list, new w9j() { // from class: l.ije0
                public final Object call(Object obj) {
                    return ((Item) obj).m13754clone();
                }
            });
        }
        List<Integer> list2 = this.mcc;
        if (list2 != null) {
            serviceItem.mcc = ValueObject.util_map(list2, new w9j() { // from class: l.jje0
                public final Object call(Object obj) {
                    return ServiceItem.m638a((Integer) obj);
                }
            });
        }
        return serviceItem;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ServiceItem)) {
            return false;
        }
        ServiceItem serviceItem = (ServiceItem) obj;
        return ValueObject.util_equals(this.list, serviceItem.list) && ValueObject.util_equals(this.mcc, serviceItem.mcc);
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
        List<Item> list = this.list;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<Integer> list2 = this.mcc;
        int iHashCode2 = iHashCode + (list2 != null ? list2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.list == null) {
            this.list = new ArrayList();
        }
        if (this.mcc == null) {
            this.mcc = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
