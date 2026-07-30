package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.MatchFrom;
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
public class FilterConditionsStatusItem extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "filterconditionsstatusitem";

    /* JADX INFO: renamed from: id */
    @ProtobufIndex(index = 3)
    public int f21133id;

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
            int iM17288o = (str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0) + CodedOutputByteBufferNano.m17275b(2, filterConditionsStatusItem.selected) + CodedOutputByteBufferNano.m17281h(3, filterConditionsStatusItem.f21133id);
            filterConditionsStatusItem.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public FilterConditionsStatusItem parse(nc5 nc5Var) throws IOException {
            FilterConditionsStatusItem filterConditionsStatusItem = new FilterConditionsStatusItem();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (filterConditionsStatusItem.value != null) {
                        break;
                    }
                    filterConditionsStatusItem.value = "";
                    break;
                }
                if (iM162497u == 10) {
                    filterConditionsStatusItem.value = nc5Var.m162495s();
                } else if (iM162497u == 16) {
                    filterConditionsStatusItem.selected = nc5Var.m162483g();
                } else {
                    if (iM162497u != 24) {
                        if (filterConditionsStatusItem.value != null) {
                            break;
                        }
                        filterConditionsStatusItem.value = "";
                        return filterConditionsStatusItem;
                    }
                    filterConditionsStatusItem.f21133id = nc5Var.m162486j();
                }
            }
            return filterConditionsStatusItem;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(FilterConditionsStatusItem filterConditionsStatusItem, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = filterConditionsStatusItem.value;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            codedOutputByteBufferNano.m17299A(2, filterConditionsStatusItem.selected);
            codedOutputByteBufferNano.m17305G(3, filterConditionsStatusItem.f21133id);
        }
    };
    public static JsonAdapter<FilterConditionsStatusItem> JSON_ADAPTER = new ObjectJsonAdapter<FilterConditionsStatusItem>() { // from class: com.p1.mobile.putong.core.data.FilterConditionsStatusItem.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return FilterConditionsStatusItem.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public FilterConditionsStatusItem newInstance() {
            return new FilterConditionsStatusItem();
        }

        public boolean parseField(FilterConditionsStatusItem filterConditionsStatusItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    filterConditionsStatusItem.f21133id = jsonParser.getValueAsInt();
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FilterConditionsStatusItem filterConditionsStatusItem, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("id", filterConditionsStatusItem.f21133id);
            String str = filterConditionsStatusItem.value;
            if (str != null) {
                jsonGenerator.writeStringField("value", str);
            }
            jsonGenerator.writeBooleanField(MatchFrom.selected, filterConditionsStatusItem.selected);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FilterConditionsStatusItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
    public FilterConditionsStatusItem mo225055clone() {
        FilterConditionsStatusItem filterConditionsStatusItem = new FilterConditionsStatusItem();
        filterConditionsStatusItem.f21133id = this.f21133id;
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
        return this.f21133id == filterConditionsStatusItem.f21133id && ValueObject.util_equals(this.value, filterConditionsStatusItem.value) && this.selected == filterConditionsStatusItem.selected;
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
        int i2 = ((i * 41) + this.f21133id) * 41;
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
