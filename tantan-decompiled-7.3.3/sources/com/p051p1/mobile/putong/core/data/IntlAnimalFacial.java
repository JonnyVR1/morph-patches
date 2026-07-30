package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.IntlMatchAnimalFacial;
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
import java.util.List;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes10.dex */
public class IntlAnimalFacial extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlanimalfacial";

    @NonNull
    @ProtobufIndex(index = 2)
    public String facial;

    @NonNull
    @ProtobufIndex(index = 3)
    public String icon;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<IntlMatchAnimalFacial> match;

    @NonNull
    @ProtobufIndex(index = 1)
    public String type;
    public static ProtobufAdapter<IntlAnimalFacial> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlAnimalFacial>() { // from class: com.p1.mobile.putong.core.data.IntlAnimalFacial.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IntlAnimalFacial intlAnimalFacial) {
            String str = intlAnimalFacial.type;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = intlAnimalFacial.facial;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = intlAnimalFacial.icon;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            List<IntlMatchAnimalFacial> list = intlAnimalFacial.match;
            if (list != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(4, list, IntlMatchAnimalFacial.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            intlAnimalFacial.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IntlAnimalFacial parse(nc5 nc5Var) throws IOException {
            IntlAnimalFacial intlAnimalFacial = new IntlAnimalFacial();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (intlAnimalFacial.type == null) {
                        intlAnimalFacial.type = "";
                    }
                    if (intlAnimalFacial.facial == null) {
                        intlAnimalFacial.facial = "";
                    }
                    if (intlAnimalFacial.icon == null) {
                        intlAnimalFacial.icon = "";
                    }
                    if (intlAnimalFacial.match != null) {
                        break;
                    }
                    intlAnimalFacial.match = new ArrayList();
                    break;
                }
                if (iM162497u == 10) {
                    intlAnimalFacial.type = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    intlAnimalFacial.facial = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    intlAnimalFacial.icon = nc5Var.m162495s();
                } else {
                    if (iM162497u != 34) {
                        if (intlAnimalFacial.type == null) {
                            intlAnimalFacial.type = "";
                        }
                        if (intlAnimalFacial.facial == null) {
                            intlAnimalFacial.facial = "";
                        }
                        if (intlAnimalFacial.icon == null) {
                            intlAnimalFacial.icon = "";
                        }
                        if (intlAnimalFacial.match != null) {
                            break;
                        }
                        intlAnimalFacial.match = new ArrayList();
                        return intlAnimalFacial;
                    }
                    intlAnimalFacial.match = (List) nc5Var.m162488l(IntlMatchAnimalFacial.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return intlAnimalFacial;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IntlAnimalFacial intlAnimalFacial, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = intlAnimalFacial.type;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = intlAnimalFacial.facial;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = intlAnimalFacial.icon;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            List<IntlMatchAnimalFacial> list = intlAnimalFacial.match;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(4, list, IntlMatchAnimalFacial.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<IntlAnimalFacial> JSON_ADAPTER = new ObjectJsonAdapter<IntlAnimalFacial>() { // from class: com.p1.mobile.putong.core.data.IntlAnimalFacial.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IntlAnimalFacial.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IntlAnimalFacial newInstance() {
            return new IntlAnimalFacial();
        }

        public boolean parseField(IntlAnimalFacial intlAnimalFacial, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "facial":
                    intlAnimalFacial.facial = jsonParser.getValueAsString();
                    return true;
                case "icon":
                    intlAnimalFacial.icon = jsonParser.getValueAsString();
                    return true;
                case "type":
                    intlAnimalFacial.type = jsonParser.getValueAsString();
                    return true;
                case "match":
                    intlAnimalFacial.match = JsonAdapter.parseArray(jsonParser, IntlMatchAnimalFacial.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(IntlAnimalFacial intlAnimalFacial, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "facial":
                case "icon":
                case "type":
                case "match":
                    return true;
                default:
                    return super.parseFieldCheck(intlAnimalFacial, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IntlAnimalFacial intlAnimalFacial, JsonGenerator jsonGenerator) throws IOException {
            String str = intlAnimalFacial.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
            String str2 = intlAnimalFacial.facial;
            if (str2 != null) {
                jsonGenerator.writeStringField("facial", str2);
            }
            String str3 = intlAnimalFacial.icon;
            if (str3 != null) {
                jsonGenerator.writeStringField("icon", str3);
            }
            if (intlAnimalFacial.match != null) {
                jsonGenerator.writeFieldName("match");
                JsonAdapter.serializeArray(intlAnimalFacial.match, jsonGenerator, IntlMatchAnimalFacial.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlAnimalFacial) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlAnimalFacial) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlAnimalFacial new_() {
        IntlAnimalFacial intlAnimalFacial = new IntlAnimalFacial();
        intlAnimalFacial.nullCheck();
        return intlAnimalFacial;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IntlAnimalFacial mo225055clone() {
        IntlAnimalFacial intlAnimalFacial = new IntlAnimalFacial();
        intlAnimalFacial.type = this.type;
        intlAnimalFacial.facial = this.facial;
        intlAnimalFacial.icon = this.icon;
        List<IntlMatchAnimalFacial> list = this.match;
        if (list != null) {
            intlAnimalFacial.match = ValueObject.util_map(list, new qcj() { // from class: l.x3n
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((IntlMatchAnimalFacial) obj).mo225055clone();
                }
            });
        }
        return intlAnimalFacial;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntlAnimalFacial)) {
            return false;
        }
        IntlAnimalFacial intlAnimalFacial = (IntlAnimalFacial) obj;
        return ValueObject.util_equals(this.type, intlAnimalFacial.type) && ValueObject.util_equals(this.facial, intlAnimalFacial.facial) && ValueObject.util_equals(this.icon, intlAnimalFacial.icon) && ValueObject.util_equals(this.match, intlAnimalFacial.match);
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
        String str = this.type;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.facial;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.icon;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        List<IntlMatchAnimalFacial> list = this.match;
        int iHashCode4 = iHashCode3 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.type == null) {
            this.type = "";
        }
        if (this.facial == null) {
            this.facial = "";
        }
        if (this.icon == null) {
            this.icon = "";
        }
        if (this.match == null) {
            this.match = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
