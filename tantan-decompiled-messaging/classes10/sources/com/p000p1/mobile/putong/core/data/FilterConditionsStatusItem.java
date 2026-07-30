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
public class FilterConditionsStatusItem extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "filterconditionsstatusitem";

    /* JADX INFO: renamed from: id */
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public int f53id;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public boolean selected;

    @NonNull
    @ProtobufIndex(index = 1)
    public String value;
    public static ProtobufAdapter<FilterConditionsStatusItem> PROTOBUF_ADAPTER = new MessageNanoAdapter<FilterConditionsStatusItem>() { // from class: com.p1.mobile.putong.core.data.FilterConditionsStatusItem.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(FilterConditionsStatusItem filterConditionsStatusItem) {
            String str = filterConditionsStatusItem.value;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.b(2, filterConditionsStatusItem.selected) + CodedOutputByteBufferNano.h(3, filterConditionsStatusItem.f53id);
            ((MessageNano) filterConditionsStatusItem).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public FilterConditionsStatusItem m12801parse(nb5 nb5Var) throws IOException {
            FilterConditionsStatusItem filterConditionsStatusItem = new FilterConditionsStatusItem();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (filterConditionsStatusItem.value != null) {
                        break;
                    }
                    filterConditionsStatusItem.value = "";
                    break;
                }
                if (iU == 10) {
                    filterConditionsStatusItem.value = nb5Var.s();
                } else if (iU == 16) {
                    filterConditionsStatusItem.selected = nb5Var.g();
                } else {
                    if (iU != 24) {
                        if (filterConditionsStatusItem.value != null) {
                            break;
                        }
                        filterConditionsStatusItem.value = "";
                        return filterConditionsStatusItem;
                    }
                    filterConditionsStatusItem.f53id = nb5Var.j();
                }
            }
            return filterConditionsStatusItem;
        }

        public void serialize(FilterConditionsStatusItem filterConditionsStatusItem, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = filterConditionsStatusItem.value;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.A(2, filterConditionsStatusItem.selected);
            codedOutputByteBufferNano.G(3, filterConditionsStatusItem.f53id);
        }
    };
    public static JsonAdapter<FilterConditionsStatusItem> JSON_ADAPTER = new ObjectJsonAdapter<FilterConditionsStatusItem>() { // from class: com.p1.mobile.putong.core.data.FilterConditionsStatusItem.2
        public Class getDataClass() {
            return FilterConditionsStatusItem.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public FilterConditionsStatusItem m12802newInstance() {
            return new FilterConditionsStatusItem();
        }

        public boolean parseField(FilterConditionsStatusItem filterConditionsStatusItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    filterConditionsStatusItem.f53id = jsonParser.getValueAsInt();
                    return false;
                case "value":
                    filterConditionsStatusItem.value = jsonParser.getValueAsString();
                    return true;
                case "selected":
                    filterConditionsStatusItem.selected = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(FilterConditionsStatusItem filterConditionsStatusItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "id":
                    return false;
                case "value":
                case "selected":
                    return true;
                default:
                    return super.parseFieldCheck(filterConditionsStatusItem, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(FilterConditionsStatusItem filterConditionsStatusItem, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("id", filterConditionsStatusItem.f53id);
            String str = filterConditionsStatusItem.value;
            if (str != null) {
                jsonGenerator.writeStringField("value", str);
            }
            jsonGenerator.writeBooleanField("selected", filterConditionsStatusItem.selected);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FilterConditionsStatusItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FilterConditionsStatusItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FilterConditionsStatusItem new_() {
        FilterConditionsStatusItem filterConditionsStatusItem = new FilterConditionsStatusItem();
        filterConditionsStatusItem.nullCheck();
        return filterConditionsStatusItem;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public FilterConditionsStatusItem m12800clone() {
        FilterConditionsStatusItem filterConditionsStatusItem = new FilterConditionsStatusItem();
        filterConditionsStatusItem.f53id = this.f53id;
        filterConditionsStatusItem.value = this.value;
        filterConditionsStatusItem.selected = this.selected;
        return filterConditionsStatusItem;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FilterConditionsStatusItem)) {
            return false;
        }
        FilterConditionsStatusItem filterConditionsStatusItem = (FilterConditionsStatusItem) obj;
        return this.f53id == filterConditionsStatusItem.f53id && ValueObject.util_equals(this.value, filterConditionsStatusItem.value) && this.selected == filterConditionsStatusItem.selected;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + this.f53id) * 41;
        String str = this.value;
        int iHashCode = ((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.selected ? 1231 : 1237);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.value == null) {
            this.value = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
