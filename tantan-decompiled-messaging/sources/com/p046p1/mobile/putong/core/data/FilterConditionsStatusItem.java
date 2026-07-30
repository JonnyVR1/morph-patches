package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.MatchFrom;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes10.dex */
public class FilterConditionsStatusItem extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "filterconditionsstatusitem";

    /* JADX INFO: renamed from: id */
    @ProtobufIndex(index = 3)
    public int f20391id;

    @ProtobufIndex(index = 2)
    public boolean selected;

    @NonNull
    @ProtobufIndex(index = 1)
    public String value;
    public static ProtobufAdapter<FilterConditionsStatusItem> PROTOBUF_ADAPTER = new MessageNanoAdapter<FilterConditionsStatusItem>() { // from class: com.p1.mobile.putong.core.data.FilterConditionsStatusItem.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(FilterConditionsStatusItem filterConditionsStatusItem) {
            String str = filterConditionsStatusItem.value;
            int iM17233o = (str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0) + CodedOutputByteBufferNano.m17220b(2, filterConditionsStatusItem.selected) + CodedOutputByteBufferNano.m17226h(3, filterConditionsStatusItem.f20391id);
            filterConditionsStatusItem.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public FilterConditionsStatusItem parse(nb5 nb5Var) throws IOException {
            FilterConditionsStatusItem filterConditionsStatusItem = new FilterConditionsStatusItem();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (filterConditionsStatusItem.value != null) {
                        break;
                    }
                    filterConditionsStatusItem.value = "";
                    break;
                }
                if (iM158752u == 10) {
                    filterConditionsStatusItem.value = nb5Var.m158750s();
                } else if (iM158752u == 16) {
                    filterConditionsStatusItem.selected = nb5Var.m158738g();
                } else {
                    if (iM158752u != 24) {
                        if (filterConditionsStatusItem.value != null) {
                            break;
                        }
                        filterConditionsStatusItem.value = "";
                        return filterConditionsStatusItem;
                    }
                    filterConditionsStatusItem.f20391id = nb5Var.m158741j();
                }
            }
            return filterConditionsStatusItem;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(FilterConditionsStatusItem filterConditionsStatusItem, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = filterConditionsStatusItem.value;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            codedOutputByteBufferNano.m17244A(2, filterConditionsStatusItem.selected);
            codedOutputByteBufferNano.m17250G(3, filterConditionsStatusItem.f20391id);
        }
    };
    public static JsonAdapter<FilterConditionsStatusItem> JSON_ADAPTER = new ObjectJsonAdapter<FilterConditionsStatusItem>() { // from class: com.p1.mobile.putong.core.data.FilterConditionsStatusItem.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return FilterConditionsStatusItem.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public FilterConditionsStatusItem newInstance() {
            return new FilterConditionsStatusItem();
        }

        public boolean parseField(FilterConditionsStatusItem filterConditionsStatusItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    filterConditionsStatusItem.f20391id = jsonParser.getValueAsInt();
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FilterConditionsStatusItem filterConditionsStatusItem, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("id", filterConditionsStatusItem.f20391id);
            String str = filterConditionsStatusItem.value;
            if (str != null) {
                jsonGenerator.writeStringField("value", str);
            }
            jsonGenerator.writeBooleanField(MatchFrom.selected, filterConditionsStatusItem.selected);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FilterConditionsStatusItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FilterConditionsStatusItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FilterConditionsStatusItem new_() {
        FilterConditionsStatusItem filterConditionsStatusItem = new FilterConditionsStatusItem();
        filterConditionsStatusItem.nullCheck();
        return filterConditionsStatusItem;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public FilterConditionsStatusItem mo223809clone() {
        FilterConditionsStatusItem filterConditionsStatusItem = new FilterConditionsStatusItem();
        filterConditionsStatusItem.f20391id = this.f20391id;
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
        return this.f20391id == filterConditionsStatusItem.f20391id && ValueObject.util_equals(this.value, filterConditionsStatusItem.value) && this.selected == filterConditionsStatusItem.selected;
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
        int i2 = ((i * 41) + this.f20391id) * 41;
        String str = this.value;
        int iHashCode = ((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.selected ? 1231 : 1237);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.value == null) {
            this.value = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
