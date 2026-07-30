package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.android.libraries.places.api.model.PlaceTypes;
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
public class BarLoverplaces extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "barloverplaces";

    @NonNull
    @ProtobufIndex(index = 3)
    public String address;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f21096id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;

    @ProtobufIndex(index = 5)
    public boolean showRank;

    @NonNull
    @ProtobufIndex(index = 4)
    public BarLoverplacesType type;
    public static ProtobufAdapter<BarLoverplaces> PROTOBUF_ADAPTER = new MessageNanoAdapter<BarLoverplaces>() { // from class: com.p1.mobile.putong.core.data.BarLoverplaces.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(BarLoverplaces barLoverplaces) {
            String str = barLoverplaces.f21096id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = barLoverplaces.name;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = barLoverplaces.address;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            BarLoverplacesType barLoverplacesType = barLoverplaces.type;
            if (barLoverplacesType != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(4, barLoverplacesType, BarLoverplacesType.PROTOBUF_ADAPTER);
            }
            int iM17275b = iM17288o + CodedOutputByteBufferNano.m17275b(5, barLoverplaces.showRank);
            barLoverplaces.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public BarLoverplaces parse(nc5 nc5Var) throws IOException {
            BarLoverplaces barLoverplaces = new BarLoverplaces();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (barLoverplaces.f21096id == null) {
                        barLoverplaces.f21096id = "";
                    }
                    if (barLoverplaces.name == null) {
                        barLoverplaces.name = "";
                    }
                    if (barLoverplaces.address == null) {
                        barLoverplaces.address = "";
                    }
                    if (barLoverplaces.type != null) {
                        break;
                    }
                    barLoverplaces.type = (BarLoverplacesType) BarLoverplacesType.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iM162497u == 10) {
                    barLoverplaces.f21096id = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    barLoverplaces.name = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    barLoverplaces.address = nc5Var.m162495s();
                } else if (iM162497u == 34) {
                    barLoverplaces.type = (BarLoverplacesType) nc5Var.m162488l(BarLoverplacesType.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 40) {
                        if (barLoverplaces.f21096id == null) {
                            barLoverplaces.f21096id = "";
                        }
                        if (barLoverplaces.name == null) {
                            barLoverplaces.name = "";
                        }
                        if (barLoverplaces.address == null) {
                            barLoverplaces.address = "";
                        }
                        if (barLoverplaces.type != null) {
                            break;
                        }
                        barLoverplaces.type = (BarLoverplacesType) BarLoverplacesType.JSON_ADAPTER.defaultEnum();
                        return barLoverplaces;
                    }
                    barLoverplaces.showRank = nc5Var.m162483g();
                }
            }
            return barLoverplaces;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(BarLoverplaces barLoverplaces, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = barLoverplaces.f21096id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = barLoverplaces.name;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = barLoverplaces.address;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            BarLoverplacesType barLoverplacesType = barLoverplaces.type;
            if (barLoverplacesType != null) {
                codedOutputByteBufferNano.m17309K(4, barLoverplacesType, BarLoverplacesType.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17299A(5, barLoverplaces.showRank);
        }
    };
    public static JsonAdapter<BarLoverplaces> JSON_ADAPTER = new ObjectJsonAdapter<BarLoverplaces>() { // from class: com.p1.mobile.putong.core.data.BarLoverplaces.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BarLoverplaces.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BarLoverplaces newInstance() {
            return new BarLoverplaces();
        }

        public boolean parseField(BarLoverplaces barLoverplaces, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "address":
                    barLoverplaces.address = jsonParser.getValueAsString();
                    return true;
                case "showRank":
                    barLoverplaces.showRank = jsonParser.getValueAsBoolean();
                    return true;
                case "id":
                    barLoverplaces.f21096id = jsonParser.getValueAsString();
                    return false;
                case "name":
                    barLoverplaces.name = jsonParser.getValueAsString();
                    return true;
                case "type":
                    barLoverplaces.type = BarLoverplacesType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(BarLoverplaces barLoverplaces, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "address":
                case "showRank":
                    return true;
                case "id":
                    return false;
                case "name":
                case "type":
                    return true;
                default:
                    return super.parseFieldCheck(barLoverplaces, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BarLoverplaces barLoverplaces, JsonGenerator jsonGenerator) throws IOException {
            String str = barLoverplaces.f21096id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = barLoverplaces.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
            String str3 = barLoverplaces.address;
            if (str3 != null) {
                jsonGenerator.writeStringField(PlaceTypes.ADDRESS, str3);
            }
            if (barLoverplaces.type != null) {
                jsonGenerator.writeFieldName("type");
                BarLoverplacesType.JSON_ADAPTER.serialize(barLoverplaces.type, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("showRank", barLoverplaces.showRank);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((BarLoverplaces) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BarLoverplaces) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static BarLoverplaces new_() {
        BarLoverplaces barLoverplaces = new BarLoverplaces();
        barLoverplaces.nullCheck();
        return barLoverplaces;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BarLoverplaces mo225055clone() {
        BarLoverplaces barLoverplaces = new BarLoverplaces();
        barLoverplaces.f21096id = this.f21096id;
        barLoverplaces.name = this.name;
        barLoverplaces.address = this.address;
        barLoverplaces.type = this.type;
        barLoverplaces.showRank = this.showRank;
        return barLoverplaces;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BarLoverplaces)) {
            return false;
        }
        BarLoverplaces barLoverplaces = (BarLoverplaces) obj;
        return ValueObject.util_equals(this.f21096id, barLoverplaces.f21096id) && ValueObject.util_equals(this.name, barLoverplaces.name) && ValueObject.util_equals(this.address, barLoverplaces.address) && ValueObject.util_equals(this.type, barLoverplaces.type) && this.showRank == barLoverplaces.showRank;
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
        String str = this.f21096id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.address;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        BarLoverplacesType barLoverplacesType = this.type;
        int iHashCode4 = ((iHashCode3 + (barLoverplacesType != null ? barLoverplacesType.hashCode() : 0)) * 41) + (this.showRank ? 1231 : 1237);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f21096id == null) {
            this.f21096id = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.address == null) {
            this.address = "";
        }
        if (this.type == null) {
            this.type = (BarLoverplacesType) BarLoverplacesType.JSON_ADAPTER.defaultEnum();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
