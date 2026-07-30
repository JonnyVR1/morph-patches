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
public class VisitorFilterSettings extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "visitorfiltersettings";

    @ProtobufIndex(index = 1)
    public int distance;

    @NonNull
    @ProtobufIndex(index = 4)
    public VisitorFilterType filter;

    @ProtobufIndex(index = 3)
    public int maxAge;

    @ProtobufIndex(index = 2)
    public int minAge;

    @NonNull
    @ProtobufIndex(index = 5)
    public VisitorSortType sort;
    public static ProtobufAdapter<VisitorFilterSettings> PROTOBUF_ADAPTER = new MessageNanoAdapter<VisitorFilterSettings>() { // from class: com.p1.mobile.putong.core.data.VisitorFilterSettings.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(VisitorFilterSettings visitorFilterSettings) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, visitorFilterSettings.distance) + CodedOutputByteBufferNano.m17281h(2, visitorFilterSettings.minAge) + CodedOutputByteBufferNano.m17281h(3, visitorFilterSettings.maxAge);
            VisitorFilterType visitorFilterType = visitorFilterSettings.filter;
            if (visitorFilterType != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(4, visitorFilterType, VisitorFilterType.PROTOBUF_ADAPTER);
            }
            VisitorSortType visitorSortType = visitorFilterSettings.sort;
            if (visitorSortType != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(5, visitorSortType, VisitorSortType.PROTOBUF_ADAPTER);
            }
            visitorFilterSettings.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public VisitorFilterSettings parse(nc5 nc5Var) throws IOException {
            VisitorFilterSettings visitorFilterSettings = new VisitorFilterSettings();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (visitorFilterSettings.filter == null) {
                        visitorFilterSettings.filter = (VisitorFilterType) VisitorFilterType.JSON_ADAPTER.defaultEnum();
                    }
                    if (visitorFilterSettings.sort != null) {
                        break;
                    }
                    visitorFilterSettings.sort = (VisitorSortType) VisitorSortType.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iM162497u == 8) {
                    visitorFilterSettings.distance = nc5Var.m162486j();
                } else if (iM162497u == 16) {
                    visitorFilterSettings.minAge = nc5Var.m162486j();
                } else if (iM162497u == 24) {
                    visitorFilterSettings.maxAge = nc5Var.m162486j();
                } else if (iM162497u == 34) {
                    visitorFilterSettings.filter = (VisitorFilterType) nc5Var.m162488l(VisitorFilterType.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 42) {
                        if (visitorFilterSettings.filter == null) {
                            visitorFilterSettings.filter = (VisitorFilterType) VisitorFilterType.JSON_ADAPTER.defaultEnum();
                        }
                        if (visitorFilterSettings.sort != null) {
                            break;
                        }
                        visitorFilterSettings.sort = (VisitorSortType) VisitorSortType.JSON_ADAPTER.defaultEnum();
                        return visitorFilterSettings;
                    }
                    visitorFilterSettings.sort = (VisitorSortType) nc5Var.m162488l(VisitorSortType.PROTOBUF_ADAPTER);
                }
            }
            return visitorFilterSettings;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(VisitorFilterSettings visitorFilterSettings, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, visitorFilterSettings.distance);
            codedOutputByteBufferNano.m17305G(2, visitorFilterSettings.minAge);
            codedOutputByteBufferNano.m17305G(3, visitorFilterSettings.maxAge);
            VisitorFilterType visitorFilterType = visitorFilterSettings.filter;
            if (visitorFilterType != null) {
                codedOutputByteBufferNano.m17309K(4, visitorFilterType, VisitorFilterType.PROTOBUF_ADAPTER);
            }
            VisitorSortType visitorSortType = visitorFilterSettings.sort;
            if (visitorSortType != null) {
                codedOutputByteBufferNano.m17309K(5, visitorSortType, VisitorSortType.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<VisitorFilterSettings> JSON_ADAPTER = new ObjectJsonAdapter<VisitorFilterSettings>() { // from class: com.p1.mobile.putong.core.data.VisitorFilterSettings.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return VisitorFilterSettings.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public VisitorFilterSettings newInstance() {
            return new VisitorFilterSettings();
        }

        public boolean parseField(VisitorFilterSettings visitorFilterSettings, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "filter":
                    visitorFilterSettings.filter = VisitorFilterType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "maxAge":
                    visitorFilterSettings.maxAge = jsonParser.getValueAsInt();
                    return true;
                case "minAge":
                    visitorFilterSettings.minAge = jsonParser.getValueAsInt();
                    return true;
                case "sort":
                    visitorFilterSettings.sort = VisitorSortType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "distance":
                    visitorFilterSettings.distance = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(VisitorFilterSettings visitorFilterSettings, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "filter":
                case "maxAge":
                case "minAge":
                case "sort":
                case "distance":
                    return true;
                default:
                    return super.parseFieldCheck(visitorFilterSettings, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(VisitorFilterSettings visitorFilterSettings, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("distance", visitorFilterSettings.distance);
            jsonGenerator.writeNumberField("minAge", visitorFilterSettings.minAge);
            jsonGenerator.writeNumberField("maxAge", visitorFilterSettings.maxAge);
            if (visitorFilterSettings.filter != null) {
                jsonGenerator.writeFieldName("filter");
                VisitorFilterType.JSON_ADAPTER.serialize(visitorFilterSettings.filter, jsonGenerator, true);
            }
            if (visitorFilterSettings.sort != null) {
                jsonGenerator.writeFieldName("sort");
                VisitorSortType.JSON_ADAPTER.serialize(visitorFilterSettings.sort, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VisitorFilterSettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VisitorFilterSettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static VisitorFilterSettings new_() {
        VisitorFilterSettings visitorFilterSettings = new VisitorFilterSettings();
        visitorFilterSettings.nullCheck();
        return visitorFilterSettings;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public VisitorFilterSettings mo225055clone() {
        VisitorFilterSettings visitorFilterSettings = new VisitorFilterSettings();
        visitorFilterSettings.distance = this.distance;
        visitorFilterSettings.minAge = this.minAge;
        visitorFilterSettings.maxAge = this.maxAge;
        visitorFilterSettings.filter = this.filter;
        visitorFilterSettings.sort = this.sort;
        return visitorFilterSettings;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VisitorFilterSettings)) {
            return false;
        }
        VisitorFilterSettings visitorFilterSettings = (VisitorFilterSettings) obj;
        return this.distance == visitorFilterSettings.distance && this.minAge == visitorFilterSettings.minAge && this.maxAge == visitorFilterSettings.maxAge && ValueObject.util_equals(this.filter, visitorFilterSettings.filter) && ValueObject.util_equals(this.sort, visitorFilterSettings.sort);
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
        int i2 = ((((((i * 41) + this.distance) * 41) + this.minAge) * 41) + this.maxAge) * 41;
        VisitorFilterType visitorFilterType = this.filter;
        int iHashCode = (i2 + (visitorFilterType != null ? visitorFilterType.hashCode() : 0)) * 41;
        VisitorSortType visitorSortType = this.sort;
        int iHashCode2 = iHashCode + (visitorSortType != null ? visitorSortType.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.filter == null) {
            this.filter = (VisitorFilterType) VisitorFilterType.JSON_ADAPTER.defaultEnum();
        }
        if (this.sort == null) {
            this.sort = (VisitorSortType) VisitorSortType.JSON_ADAPTER.defaultEnum();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
