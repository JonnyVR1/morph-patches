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
public class BarLoverplaces extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "barloverplaces";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String address;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f16id;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String name;

    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public boolean showRank;

    @NonNull
    @ProtobufIndex(index = 4)
    public BarLoverplacesType type;
    public static ProtobufAdapter<BarLoverplaces> PROTOBUF_ADAPTER = new MessageNanoAdapter<BarLoverplaces>() { // from class: com.p1.mobile.putong.core.data.BarLoverplaces.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(BarLoverplaces barLoverplaces) {
            String str = barLoverplaces.f16id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = barLoverplaces.name;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = barLoverplaces.address;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            BarLoverplacesType barLoverplacesType = barLoverplaces.type;
            if (barLoverplacesType != null) {
                iO += CodedOutputByteBufferNano.l(4, barLoverplacesType, BarLoverplacesType.PROTOBUF_ADAPTER);
            }
            int iB = iO + CodedOutputByteBufferNano.b(5, barLoverplaces.showRank);
            ((MessageNano) barLoverplaces).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public BarLoverplaces m11741parse(nb5 nb5Var) throws IOException {
            BarLoverplaces barLoverplaces = new BarLoverplaces();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (barLoverplaces.f16id == null) {
                        barLoverplaces.f16id = "";
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
                if (iU == 10) {
                    barLoverplaces.f16id = nb5Var.s();
                } else if (iU == 18) {
                    barLoverplaces.name = nb5Var.s();
                } else if (iU == 26) {
                    barLoverplaces.address = nb5Var.s();
                } else if (iU == 34) {
                    barLoverplaces.type = (BarLoverplacesType) nb5Var.l(BarLoverplacesType.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 40) {
                        if (barLoverplaces.f16id == null) {
                            barLoverplaces.f16id = "";
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
                    barLoverplaces.showRank = nb5Var.g();
                }
            }
            return barLoverplaces;
        }

        public void serialize(BarLoverplaces barLoverplaces, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = barLoverplaces.f16id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = barLoverplaces.name;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = barLoverplaces.address;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            BarLoverplacesType barLoverplacesType = barLoverplaces.type;
            if (barLoverplacesType != null) {
                codedOutputByteBufferNano.K(4, barLoverplacesType, BarLoverplacesType.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.A(5, barLoverplaces.showRank);
        }
    };
    public static JsonAdapter<BarLoverplaces> JSON_ADAPTER = new ObjectJsonAdapter<BarLoverplaces>() { // from class: com.p1.mobile.putong.core.data.BarLoverplaces.2
        public Class getDataClass() {
            return BarLoverplaces.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public BarLoverplaces m11742newInstance() {
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
                    barLoverplaces.f16id = jsonParser.getValueAsString();
                    return false;
                case "name":
                    barLoverplaces.name = jsonParser.getValueAsString();
                    return true;
                case "type":
                    barLoverplaces.type = (BarLoverplacesType) BarLoverplacesType.JSON_ADAPTER.parse(jsonParser, str2);
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

        public void serializeFields(BarLoverplaces barLoverplaces, JsonGenerator jsonGenerator) throws IOException {
            String str = barLoverplaces.f16id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = barLoverplaces.name;
            if (str2 != null) {
                jsonGenerator.writeStringField("name", str2);
            }
            String str3 = barLoverplaces.address;
            if (str3 != null) {
                jsonGenerator.writeStringField("address", str3);
            }
            if (barLoverplaces.type != null) {
                jsonGenerator.writeFieldName("type");
                BarLoverplacesType.JSON_ADAPTER.serialize(barLoverplaces.type, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("showRank", barLoverplaces.showRank);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((BarLoverplaces) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BarLoverplaces) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static BarLoverplaces new_() {
        BarLoverplaces barLoverplaces = new BarLoverplaces();
        barLoverplaces.nullCheck();
        return barLoverplaces;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public BarLoverplaces m11740clone() {
        BarLoverplaces barLoverplaces = new BarLoverplaces();
        barLoverplaces.f16id = this.f16id;
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
        return ValueObject.util_equals(this.f16id, barLoverplaces.f16id) && ValueObject.util_equals(this.name, barLoverplaces.name) && ValueObject.util_equals(this.address, barLoverplaces.address) && ValueObject.util_equals(this.type, barLoverplaces.type) && this.showRank == barLoverplaces.showRank;
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
        String str = this.f16id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.address;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        BarLoverplacesType barLoverplacesType = this.type;
        int iHashCode4 = ((iHashCode3 + (barLoverplacesType != null ? barLoverplacesType.hashCode() : 0)) * 41) + (this.showRank ? 1231 : 1237);
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

    public void nullCheck() {
        if (this.f16id == null) {
            this.f16id = "";
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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
