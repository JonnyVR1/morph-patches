package com.p051p1.mobile.putong.core.data;

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

/* JADX INFO: loaded from: classes10.dex */
public class FateRadarSearchConditions extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "fateradarsearchconditions";

    @NonNull
    @ProtobufIndex(index = 2)
    public FilterConditionsCustomItems customItems;

    @NonNull
    @ProtobufIndex(index = 1)
    public String option;
    public static ProtobufAdapter<FateRadarSearchConditions> PROTOBUF_ADAPTER = new MessageNanoAdapter<FateRadarSearchConditions>() { // from class: com.p1.mobile.putong.core.data.FateRadarSearchConditions.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(FateRadarSearchConditions fateRadarSearchConditions) {
            String str = fateRadarSearchConditions.option;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            FilterConditionsCustomItems filterConditionsCustomItems = fateRadarSearchConditions.customItems;
            if (filterConditionsCustomItems != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(2, filterConditionsCustomItems, FilterConditionsCustomItems.PROTOBUF_ADAPTER);
            }
            fateRadarSearchConditions.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public FateRadarSearchConditions parse(nc5 nc5Var) throws IOException {
            FateRadarSearchConditions fateRadarSearchConditions = new FateRadarSearchConditions();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (fateRadarSearchConditions.option == null) {
                        fateRadarSearchConditions.option = "";
                    }
                    if (fateRadarSearchConditions.customItems != null) {
                        break;
                    }
                    fateRadarSearchConditions.customItems = FilterConditionsCustomItems.new_();
                    break;
                }
                if (iM162497u == 10) {
                    fateRadarSearchConditions.option = nc5Var.m162495s();
                } else {
                    if (iM162497u != 18) {
                        if (fateRadarSearchConditions.option == null) {
                            fateRadarSearchConditions.option = "";
                        }
                        if (fateRadarSearchConditions.customItems != null) {
                            break;
                        }
                        fateRadarSearchConditions.customItems = FilterConditionsCustomItems.new_();
                        return fateRadarSearchConditions;
                    }
                    fateRadarSearchConditions.customItems = (FilterConditionsCustomItems) nc5Var.m162488l(FilterConditionsCustomItems.PROTOBUF_ADAPTER);
                }
            }
            return fateRadarSearchConditions;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(FateRadarSearchConditions fateRadarSearchConditions, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = fateRadarSearchConditions.option;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            FilterConditionsCustomItems filterConditionsCustomItems = fateRadarSearchConditions.customItems;
            if (filterConditionsCustomItems != null) {
                codedOutputByteBufferNano.m17309K(2, filterConditionsCustomItems, FilterConditionsCustomItems.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<FateRadarSearchConditions> JSON_ADAPTER = new ObjectJsonAdapter<FateRadarSearchConditions>() { // from class: com.p1.mobile.putong.core.data.FateRadarSearchConditions.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return FateRadarSearchConditions.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public FateRadarSearchConditions newInstance() {
            return new FateRadarSearchConditions();
        }

        public boolean parseField(FateRadarSearchConditions fateRadarSearchConditions, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("customItems")) {
                fateRadarSearchConditions.customItems = FilterConditionsCustomItems.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals(Option.TYPE)) {
                return false;
            }
            fateRadarSearchConditions.option = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(FateRadarSearchConditions fateRadarSearchConditions, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("customItems") || str.equals(Option.TYPE)) {
                return true;
            }
            return super.parseFieldCheck(fateRadarSearchConditions, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FateRadarSearchConditions fateRadarSearchConditions, JsonGenerator jsonGenerator) throws IOException {
            String str = fateRadarSearchConditions.option;
            if (str != null) {
                jsonGenerator.writeStringField(Option.TYPE, str);
            }
            if (fateRadarSearchConditions.customItems != null) {
                jsonGenerator.writeFieldName("customItems");
                FilterConditionsCustomItems.JSON_ADAPTER.serialize(fateRadarSearchConditions.customItems, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FateRadarSearchConditions) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FateRadarSearchConditions) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FateRadarSearchConditions new_() {
        FateRadarSearchConditions fateRadarSearchConditions = new FateRadarSearchConditions();
        fateRadarSearchConditions.nullCheck();
        return fateRadarSearchConditions;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public FateRadarSearchConditions mo225055clone() {
        FateRadarSearchConditions fateRadarSearchConditions = new FateRadarSearchConditions();
        fateRadarSearchConditions.option = this.option;
        FilterConditionsCustomItems filterConditionsCustomItems = this.customItems;
        if (filterConditionsCustomItems != null) {
            fateRadarSearchConditions.customItems = filterConditionsCustomItems.mo225055clone();
        }
        return fateRadarSearchConditions;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FateRadarSearchConditions)) {
            return false;
        }
        FateRadarSearchConditions fateRadarSearchConditions = (FateRadarSearchConditions) obj;
        return ValueObject.util_equals(this.option, fateRadarSearchConditions.option) && ValueObject.util_equals(this.customItems, fateRadarSearchConditions.customItems);
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
        String str = this.option;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        FilterConditionsCustomItems filterConditionsCustomItems = this.customItems;
        int iHashCode2 = iHashCode + (filterConditionsCustomItems != null ? filterConditionsCustomItems.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.option == null) {
            this.option = "";
        }
        if (this.customItems == null) {
            this.customItems = FilterConditionsCustomItems.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
