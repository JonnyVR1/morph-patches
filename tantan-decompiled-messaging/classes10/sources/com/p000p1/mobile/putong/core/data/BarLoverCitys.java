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
public class BarLoverCitys extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "barlovercitys";

    @NonNull
    @ProtobufIndex(index = 4)
    public String icon;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f14id;

    /* JADX INFO: renamed from: in */
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public boolean f15in;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String key;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String name;
    public static ProtobufAdapter<BarLoverCitys> PROTOBUF_ADAPTER = new MessageNanoAdapter<BarLoverCitys>() { // from class: com.p1.mobile.putong.core.data.BarLoverCitys.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(BarLoverCitys barLoverCitys) {
            String str = barLoverCitys.f14id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = barLoverCitys.name;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = barLoverCitys.key;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = barLoverCitys.icon;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            int iB = iO + CodedOutputByteBufferNano.b(5, barLoverCitys.f15in);
            ((MessageNano) barLoverCitys).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public BarLoverCitys m11733parse(nb5 nb5Var) throws IOException {
            BarLoverCitys barLoverCitys = new BarLoverCitys();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (barLoverCitys.f14id == null) {
                        barLoverCitys.f14id = "";
                    }
                    if (barLoverCitys.name == null) {
                        barLoverCitys.name = "";
                    }
                    if (barLoverCitys.key == null) {
                        barLoverCitys.key = "";
                    }
                    if (barLoverCitys.icon != null) {
                        break;
                    }
                    barLoverCitys.icon = "";
                    break;
                }
                if (iU == 10) {
                    barLoverCitys.f14id = nb5Var.s();
                } else if (iU == 18) {
                    barLoverCitys.name = nb5Var.s();
                } else if (iU == 26) {
                    barLoverCitys.key = nb5Var.s();
                } else if (iU == 34) {
                    barLoverCitys.icon = nb5Var.s();
                } else {
                    if (iU != 40) {
                        if (barLoverCitys.f14id == null) {
                            barLoverCitys.f14id = "";
                        }
                        if (barLoverCitys.name == null) {
                            barLoverCitys.name = "";
                        }
                        if (barLoverCitys.key == null) {
                            barLoverCitys.key = "";
                        }
                        if (barLoverCitys.icon != null) {
                            break;
                        }
                        barLoverCitys.icon = "";
                        return barLoverCitys;
                    }
                    barLoverCitys.f15in = nb5Var.g();
                }
            }
            return barLoverCitys;
        }

        public void serialize(BarLoverCitys barLoverCitys, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = barLoverCitys.f14id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = barLoverCitys.name;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = barLoverCitys.key;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = barLoverCitys.icon;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
            codedOutputByteBufferNano.A(5, barLoverCitys.f15in);
        }
    };
    public static JsonAdapter<BarLoverCitys> JSON_ADAPTER = new ObjectJsonAdapter<BarLoverCitys>() { // from class: com.p1.mobile.putong.core.data.BarLoverCitys.2
        public Class getDataClass() {
            return BarLoverCitys.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public BarLoverCitys m11734newInstance() {
            return new BarLoverCitys();
        }

        public boolean parseField(BarLoverCitys barLoverCitys, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    barLoverCitys.f14id = jsonParser.getValueAsString();
                    return false;
                case "in":
                    barLoverCitys.f15in = jsonParser.getValueAsBoolean();
                    return true;
                case "key":
                    barLoverCitys.key = jsonParser.getValueAsString();
                    return true;
                case "icon":
                    barLoverCitys.icon = jsonParser.getValueAsString();
                    return true;
                case "name":
                    barLoverCitys.name = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(BarLoverCitys barLoverCitys, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "id":
                    return false;
                case "in":
                case "key":
                case "icon":
                case "name":
                    return true;
                default:
                    return super.parseFieldCheck(barLoverCitys, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(BarLoverCitys barLoverCitys, JsonGenerator jsonGenerator) throws IOException {
            String str = barLoverCitys.f14id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = barLoverCitys.name;
            if (str2 != null) {
                jsonGenerator.writeStringField("name", str2);
            }
            String str3 = barLoverCitys.key;
            if (str3 != null) {
                jsonGenerator.writeStringField("key", str3);
            }
            String str4 = barLoverCitys.icon;
            if (str4 != null) {
                jsonGenerator.writeStringField(HomeTabModuleTopicShowType.icon, str4);
            }
            jsonGenerator.writeBooleanField("in", barLoverCitys.f15in);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((BarLoverCitys) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BarLoverCitys) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static BarLoverCitys new_() {
        BarLoverCitys barLoverCitys = new BarLoverCitys();
        barLoverCitys.nullCheck();
        return barLoverCitys;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public BarLoverCitys m11732clone() {
        BarLoverCitys barLoverCitys = new BarLoverCitys();
        barLoverCitys.f14id = this.f14id;
        barLoverCitys.name = this.name;
        barLoverCitys.key = this.key;
        barLoverCitys.icon = this.icon;
        barLoverCitys.f15in = this.f15in;
        return barLoverCitys;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BarLoverCitys)) {
            return false;
        }
        BarLoverCitys barLoverCitys = (BarLoverCitys) obj;
        return ValueObject.util_equals(this.f14id, barLoverCitys.f14id) && ValueObject.util_equals(this.name, barLoverCitys.name) && ValueObject.util_equals(this.key, barLoverCitys.key) && ValueObject.util_equals(this.icon, barLoverCitys.icon) && this.f15in == barLoverCitys.f15in;
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
        String str = this.f14id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.key;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.icon;
        int iHashCode4 = ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41) + (this.f15in ? 1231 : 1237);
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

    public void nullCheck() {
        if (this.f14id == null) {
            this.f14id = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.key == null) {
            this.key = "";
        }
        if (this.icon == null) {
            this.icon = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
