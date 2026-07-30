package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.FilterConditionsCustomItems;
import com.p000p1.mobile.putong.core.data.FilterConditionsStatusItem;
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
public class FilterConditionsCustomItems extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "filterconditionscustomitems";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public List<FilterConditionsStatusItem> feature;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public List<String> selectedInterest;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<FilterConditionsStatusItem> status;
    public static ProtobufAdapter<FilterConditionsCustomItems> PROTOBUF_ADAPTER = new MessageNanoAdapter<FilterConditionsCustomItems>() { // from class: com.p1.mobile.putong.core.data.FilterConditionsCustomItems.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(FilterConditionsCustomItems filterConditionsCustomItems) {
            List<FilterConditionsStatusItem> list = filterConditionsCustomItems.status;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, FilterConditionsStatusItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<String> list2 = filterConditionsCustomItems.selectedInterest;
            if (list2 != null) {
                iL += CodedOutputByteBufferNano.l(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<FilterConditionsStatusItem> list3 = filterConditionsCustomItems.feature;
            if (list3 != null) {
                iL += CodedOutputByteBufferNano.l(3, list3, FilterConditionsStatusItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) filterConditionsCustomItems).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public FilterConditionsCustomItems m12797parse(nb5 nb5Var) throws IOException {
            FilterConditionsCustomItems filterConditionsCustomItems = new FilterConditionsCustomItems();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (filterConditionsCustomItems.status == null) {
                        filterConditionsCustomItems.status = new ArrayList();
                    }
                    if (filterConditionsCustomItems.feature == null) {
                        filterConditionsCustomItems.feature = new ArrayList();
                    }
                    if (filterConditionsCustomItems.selectedInterest != null) {
                        break;
                    }
                    filterConditionsCustomItems.selectedInterest = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    filterConditionsCustomItems.status = (List) nb5Var.l(FilterConditionsStatusItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 18) {
                    filterConditionsCustomItems.selectedInterest = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 26) {
                        if (filterConditionsCustomItems.status == null) {
                            filterConditionsCustomItems.status = new ArrayList();
                        }
                        if (filterConditionsCustomItems.feature == null) {
                            filterConditionsCustomItems.feature = new ArrayList();
                        }
                        if (filterConditionsCustomItems.selectedInterest != null) {
                            break;
                        }
                        filterConditionsCustomItems.selectedInterest = new ArrayList();
                        return filterConditionsCustomItems;
                    }
                    filterConditionsCustomItems.feature = (List) nb5Var.l(FilterConditionsStatusItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return filterConditionsCustomItems;
        }

        public void serialize(FilterConditionsCustomItems filterConditionsCustomItems, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<FilterConditionsStatusItem> list = filterConditionsCustomItems.status;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, FilterConditionsStatusItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = filterConditionsCustomItems.selectedInterest;
            if (list2 != null) {
                codedOutputByteBufferNano.K(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<FilterConditionsStatusItem> list3 = filterConditionsCustomItems.feature;
            if (list3 != null) {
                codedOutputByteBufferNano.K(3, list3, FilterConditionsStatusItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<FilterConditionsCustomItems> JSON_ADAPTER = new ObjectJsonAdapter<FilterConditionsCustomItems>() { // from class: com.p1.mobile.putong.core.data.FilterConditionsCustomItems.2
        public Class getDataClass() {
            return FilterConditionsCustomItems.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public FilterConditionsCustomItems m12798newInstance() {
            return new FilterConditionsCustomItems();
        }

        public boolean parseField(FilterConditionsCustomItems filterConditionsCustomItems, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "feature":
                    filterConditionsCustomItems.feature = JsonAdapter.parseArray(jsonParser, FilterConditionsStatusItem.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "status":
                    filterConditionsCustomItems.status = JsonAdapter.parseArray(jsonParser, FilterConditionsStatusItem.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "selectedInterest":
                    filterConditionsCustomItems.selectedInterest = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(FilterConditionsCustomItems filterConditionsCustomItems, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "feature":
                case "status":
                case "selectedInterest":
                    return true;
                default:
                    return super.parseFieldCheck(filterConditionsCustomItems, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(FilterConditionsCustomItems filterConditionsCustomItems, JsonGenerator jsonGenerator) throws IOException {
            if (filterConditionsCustomItems.status != null) {
                jsonGenerator.writeFieldName("status");
                JsonAdapter.serializeArray(filterConditionsCustomItems.status, jsonGenerator, FilterConditionsStatusItem.JSON_ADAPTER);
            }
            if (filterConditionsCustomItems.feature != null) {
                jsonGenerator.writeFieldName("feature");
                JsonAdapter.serializeArray(filterConditionsCustomItems.feature, jsonGenerator, FilterConditionsStatusItem.JSON_ADAPTER);
            }
            if (filterConditionsCustomItems.selectedInterest != null) {
                jsonGenerator.writeFieldName("selectedInterest");
                JsonAdapter.serializeArray(filterConditionsCustomItems.selectedInterest, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FilterConditionsCustomItems) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FilterConditionsCustomItems) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m334c(String str) {
        return str;
    }

    public static FilterConditionsCustomItems new_() {
        FilterConditionsCustomItems filterConditionsCustomItems = new FilterConditionsCustomItems();
        filterConditionsCustomItems.nullCheck();
        return filterConditionsCustomItems;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public FilterConditionsCustomItems m12796clone() {
        FilterConditionsCustomItems filterConditionsCustomItems = new FilterConditionsCustomItems();
        List<FilterConditionsStatusItem> list = this.status;
        if (list != null) {
            filterConditionsCustomItems.status = ValueObject.util_map(list, new w9j() { // from class: l.sii
                public final Object call(Object obj) {
                    return ((FilterConditionsStatusItem) obj).m12800clone();
                }
            });
        }
        List<FilterConditionsStatusItem> list2 = this.feature;
        if (list2 != null) {
            filterConditionsCustomItems.feature = ValueObject.util_map(list2, new w9j() { // from class: l.tii
                public final Object call(Object obj) {
                    return ((FilterConditionsStatusItem) obj).m12800clone();
                }
            });
        }
        List<String> list3 = this.selectedInterest;
        if (list3 != null) {
            filterConditionsCustomItems.selectedInterest = ValueObject.util_map(list3, new w9j() { // from class: l.uii
                public final Object call(Object obj) {
                    return FilterConditionsCustomItems.m334c((String) obj);
                }
            });
        }
        return filterConditionsCustomItems;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FilterConditionsCustomItems)) {
            return false;
        }
        FilterConditionsCustomItems filterConditionsCustomItems = (FilterConditionsCustomItems) obj;
        return ValueObject.util_equals(this.status, filterConditionsCustomItems.status) && ValueObject.util_equals(this.feature, filterConditionsCustomItems.feature) && ValueObject.util_equals(this.selectedInterest, filterConditionsCustomItems.selectedInterest);
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
        List<FilterConditionsStatusItem> list = this.status;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<FilterConditionsStatusItem> list2 = this.feature;
        int iHashCode2 = (iHashCode + (list2 != null ? list2.hashCode() : 0)) * 41;
        List<String> list3 = this.selectedInterest;
        int iHashCode3 = iHashCode2 + (list3 != null ? list3.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.status == null) {
            this.status = new ArrayList();
        }
        if (this.feature == null) {
            this.feature = new ArrayList();
        }
        if (this.selectedInterest == null) {
            this.selectedInterest = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
