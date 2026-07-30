package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
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
public class BarLoverCitys extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "barlovercitys";

    @NonNull
    @ProtobufIndex(index = 4)
    public String icon;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f21094id;

    /* JADX INFO: renamed from: in */
    @ProtobufIndex(index = 5)
    public boolean f21095in;

    @NonNull
    @ProtobufIndex(index = 3)
    public String key;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;
    public static ProtobufAdapter<BarLoverCitys> PROTOBUF_ADAPTER = new MessageNanoAdapter<BarLoverCitys>() { // from class: com.p1.mobile.putong.core.data.BarLoverCitys.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(BarLoverCitys barLoverCitys) {
            String str = barLoverCitys.f21094id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = barLoverCitys.name;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = barLoverCitys.key;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            String str4 = barLoverCitys.icon;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str4);
            }
            int iM17275b = iM17288o + CodedOutputByteBufferNano.m17275b(5, barLoverCitys.f21095in);
            barLoverCitys.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public BarLoverCitys parse(nc5 nc5Var) throws IOException {
            BarLoverCitys barLoverCitys = new BarLoverCitys();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (barLoverCitys.f21094id == null) {
                        barLoverCitys.f21094id = "";
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
                if (iM162497u == 10) {
                    barLoverCitys.f21094id = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    barLoverCitys.name = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    barLoverCitys.key = nc5Var.m162495s();
                } else if (iM162497u == 34) {
                    barLoverCitys.icon = nc5Var.m162495s();
                } else {
                    if (iM162497u != 40) {
                        if (barLoverCitys.f21094id == null) {
                            barLoverCitys.f21094id = "";
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
                    barLoverCitys.f21095in = nc5Var.m162483g();
                }
            }
            return barLoverCitys;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(BarLoverCitys barLoverCitys, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = barLoverCitys.f21094id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = barLoverCitys.name;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = barLoverCitys.key;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            String str4 = barLoverCitys.icon;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(4, str4);
            }
            codedOutputByteBufferNano.m17299A(5, barLoverCitys.f21095in);
        }
    };
    public static JsonAdapter<BarLoverCitys> JSON_ADAPTER = new ObjectJsonAdapter<BarLoverCitys>() { // from class: com.p1.mobile.putong.core.data.BarLoverCitys.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BarLoverCitys.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BarLoverCitys newInstance() {
            return new BarLoverCitys();
        }

        public boolean parseField(BarLoverCitys barLoverCitys, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    barLoverCitys.f21094id = jsonParser.getValueAsString();
                    return false;
                case "in":
                    barLoverCitys.f21095in = jsonParser.getValueAsBoolean();
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BarLoverCitys barLoverCitys, JsonGenerator jsonGenerator) throws IOException {
            String str = barLoverCitys.f21094id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = barLoverCitys.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
            String str3 = barLoverCitys.key;
            if (str3 != null) {
                jsonGenerator.writeStringField(Constants.KEY_KEY, str3);
            }
            String str4 = barLoverCitys.icon;
            if (str4 != null) {
                jsonGenerator.writeStringField("icon", str4);
            }
            jsonGenerator.writeBooleanField("in", barLoverCitys.f21095in);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((BarLoverCitys) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BarLoverCitys) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static BarLoverCitys new_() {
        BarLoverCitys barLoverCitys = new BarLoverCitys();
        barLoverCitys.nullCheck();
        return barLoverCitys;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BarLoverCitys mo225055clone() {
        BarLoverCitys barLoverCitys = new BarLoverCitys();
        barLoverCitys.f21094id = this.f21094id;
        barLoverCitys.name = this.name;
        barLoverCitys.key = this.key;
        barLoverCitys.icon = this.icon;
        barLoverCitys.f21095in = this.f21095in;
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
        return ValueObject.util_equals(this.f21094id, barLoverCitys.f21094id) && ValueObject.util_equals(this.name, barLoverCitys.name) && ValueObject.util_equals(this.key, barLoverCitys.key) && ValueObject.util_equals(this.icon, barLoverCitys.icon) && this.f21095in == barLoverCitys.f21095in;
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
        String str = this.f21094id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.key;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.icon;
        int iHashCode4 = ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41) + (this.f21095in ? 1231 : 1237);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f21094id == null) {
            this.f21094id = "";
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
