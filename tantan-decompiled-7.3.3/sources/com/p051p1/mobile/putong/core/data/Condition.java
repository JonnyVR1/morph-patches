package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.Condition;
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
import java.util.List;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes10.dex */
public class Condition extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "condition";

    @NonNull
    @ProtobufIndex(index = 3)
    public List<String> merchandiseIDs;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> purchaseChannel;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> skuIDs;
    public static ProtobufAdapter<Condition> PROTOBUF_ADAPTER = new MessageNanoAdapter<Condition>() { // from class: com.p1.mobile.putong.core.data.Condition.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Condition condition) {
            List<String> list = condition.purchaseChannel;
            int iM17285l = list != null ? CodedOutputByteBufferNano.m17285l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<String> list2 = condition.skuIDs;
            if (list2 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list3 = condition.merchandiseIDs;
            if (list3 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(3, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            condition.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Condition parse(nc5 nc5Var) throws IOException {
            Condition condition = new Condition();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (condition.purchaseChannel == null) {
                        condition.purchaseChannel = new ArrayList();
                    }
                    if (condition.skuIDs == null) {
                        condition.skuIDs = new ArrayList();
                    }
                    if (condition.merchandiseIDs != null) {
                        break;
                    }
                    condition.merchandiseIDs = new ArrayList();
                    break;
                }
                if (iM162497u == 10) {
                    condition.purchaseChannel = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iM162497u == 18) {
                    condition.skuIDs = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM162497u != 26) {
                        if (condition.purchaseChannel == null) {
                            condition.purchaseChannel = new ArrayList();
                        }
                        if (condition.skuIDs == null) {
                            condition.skuIDs = new ArrayList();
                        }
                        if (condition.merchandiseIDs != null) {
                            break;
                        }
                        condition.merchandiseIDs = new ArrayList();
                        return condition;
                    }
                    condition.merchandiseIDs = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return condition;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Condition condition, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = condition.purchaseChannel;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = condition.skuIDs;
            if (list2 != null) {
                codedOutputByteBufferNano.m17309K(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list3 = condition.merchandiseIDs;
            if (list3 != null) {
                codedOutputByteBufferNano.m17309K(3, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<Condition> JSON_ADAPTER = new ObjectJsonAdapter<Condition>() { // from class: com.p1.mobile.putong.core.data.Condition.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Condition.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Condition newInstance() {
            return new Condition();
        }

        public boolean parseField(Condition condition, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "merchandiseIDs":
                    condition.merchandiseIDs = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "skuIDs":
                    condition.skuIDs = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "purchaseChannel":
                    condition.purchaseChannel = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(Condition condition, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "merchandiseIDs":
                case "skuIDs":
                case "purchaseChannel":
                    return true;
                default:
                    return super.parseFieldCheck(condition, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Condition condition, JsonGenerator jsonGenerator) throws IOException {
            if (condition.purchaseChannel != null) {
                jsonGenerator.writeFieldName("purchaseChannel");
                JsonAdapter.serializeArray(condition.purchaseChannel, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (condition.skuIDs != null) {
                jsonGenerator.writeFieldName("skuIDs");
                JsonAdapter.serializeArray(condition.skuIDs, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (condition.merchandiseIDs != null) {
                jsonGenerator.writeFieldName("merchandiseIDs");
                JsonAdapter.serializeArray(condition.merchandiseIDs, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Condition) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Condition) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m36288a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m36289b(String str) {
        return str;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m36290c(String str) {
        return str;
    }

    public static Condition new_() {
        Condition condition = new Condition();
        condition.nullCheck();
        return condition;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Condition mo225055clone() {
        Condition condition = new Condition();
        List<String> list = this.purchaseChannel;
        if (list != null) {
            condition.purchaseChannel = ValueObject.util_map(list, new qcj() { // from class: l.tt5
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Condition.m36289b((String) obj);
                }
            });
        }
        List<String> list2 = this.skuIDs;
        if (list2 != null) {
            condition.skuIDs = ValueObject.util_map(list2, new qcj() { // from class: l.ut5
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Condition.m36288a((String) obj);
                }
            });
        }
        List<String> list3 = this.merchandiseIDs;
        if (list3 != null) {
            condition.merchandiseIDs = ValueObject.util_map(list3, new qcj() { // from class: l.vt5
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Condition.m36290c((String) obj);
                }
            });
        }
        return condition;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Condition)) {
            return false;
        }
        Condition condition = (Condition) obj;
        return ValueObject.util_equals(this.purchaseChannel, condition.purchaseChannel) && ValueObject.util_equals(this.skuIDs, condition.skuIDs) && ValueObject.util_equals(this.merchandiseIDs, condition.merchandiseIDs);
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
        List<String> list = this.purchaseChannel;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<String> list2 = this.skuIDs;
        int iHashCode2 = (iHashCode + (list2 != null ? list2.hashCode() : 0)) * 41;
        List<String> list3 = this.merchandiseIDs;
        int iHashCode3 = iHashCode2 + (list3 != null ? list3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.purchaseChannel == null) {
            this.purchaseChannel = new ArrayList();
        }
        if (this.skuIDs == null) {
            this.skuIDs = new ArrayList();
        }
        if (this.merchandiseIDs == null) {
            this.merchandiseIDs = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
