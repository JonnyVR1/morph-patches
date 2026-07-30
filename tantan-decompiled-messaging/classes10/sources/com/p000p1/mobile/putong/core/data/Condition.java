package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.Condition;
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
public class Condition extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "condition";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public List<String> merchandiseIDs;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> purchaseChannel;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public List<String> skuIDs;
    public static ProtobufAdapter<Condition> PROTOBUF_ADAPTER = new MessageNanoAdapter<Condition>() { // from class: com.p1.mobile.putong.core.data.Condition.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Condition condition) {
            List<String> list = condition.purchaseChannel;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<String> list2 = condition.skuIDs;
            if (list2 != null) {
                iL += CodedOutputByteBufferNano.l(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list3 = condition.merchandiseIDs;
            if (list3 != null) {
                iL += CodedOutputByteBufferNano.l(3, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) condition).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Condition m12245parse(nb5 nb5Var) throws IOException {
            Condition condition = new Condition();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 10) {
                    condition.purchaseChannel = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 18) {
                    condition.skuIDs = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 26) {
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
                    condition.merchandiseIDs = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return condition;
        }

        public void serialize(Condition condition, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = condition.purchaseChannel;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = condition.skuIDs;
            if (list2 != null) {
                codedOutputByteBufferNano.K(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list3 = condition.merchandiseIDs;
            if (list3 != null) {
                codedOutputByteBufferNano.K(3, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<Condition> JSON_ADAPTER = new ObjectJsonAdapter<Condition>() { // from class: com.p1.mobile.putong.core.data.Condition.2
        public Class getDataClass() {
            return Condition.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public Condition m12246newInstance() {
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Condition) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Condition) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m87a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m88b(String str) {
        return str;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m89c(String str) {
        return str;
    }

    public static Condition new_() {
        Condition condition = new Condition();
        condition.nullCheck();
        return condition;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Condition m12244clone() {
        Condition condition = new Condition();
        List<String> list = this.purchaseChannel;
        if (list != null) {
            condition.purchaseChannel = ValueObject.util_map(list, new w9j() { // from class: l.ps5
                public final Object call(Object obj) {
                    return Condition.m88b((String) obj);
                }
            });
        }
        List<String> list2 = this.skuIDs;
        if (list2 != null) {
            condition.skuIDs = ValueObject.util_map(list2, new w9j() { // from class: l.qs5
                public final Object call(Object obj) {
                    return Condition.m87a((String) obj);
                }
            });
        }
        List<String> list3 = this.merchandiseIDs;
        if (list3 != null) {
            condition.merchandiseIDs = ValueObject.util_map(list3, new w9j() { // from class: l.rs5
                public final Object call(Object obj) {
                    return Condition.m89c((String) obj);
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
