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
public class IdealTypes extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "idealtypes";

    @NonNull
    @ProtobufIndex(index = 2)
    public String img;

    @ProtobufIndex(index = 3)
    public boolean selected;

    @NonNull
    @ProtobufIndex(index = 1)
    public String value;
    public static ProtobufAdapter<IdealTypes> PROTOBUF_ADAPTER = new MessageNanoAdapter<IdealTypes>() { // from class: com.p1.mobile.putong.core.data.IdealTypes.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IdealTypes idealTypes) {
            String str = idealTypes.value;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = idealTypes.img;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            int iM17220b = iM17233o + CodedOutputByteBufferNano.m17220b(3, idealTypes.selected);
            idealTypes.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IdealTypes parse(nb5 nb5Var) throws IOException {
            IdealTypes idealTypes = new IdealTypes();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (idealTypes.value == null) {
                        idealTypes.value = "";
                    }
                    if (idealTypes.img != null) {
                        break;
                    }
                    idealTypes.img = "";
                    break;
                }
                if (iM158752u == 10) {
                    idealTypes.value = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    idealTypes.img = nb5Var.m158750s();
                } else {
                    if (iM158752u != 24) {
                        if (idealTypes.value == null) {
                            idealTypes.value = "";
                        }
                        if (idealTypes.img != null) {
                            break;
                        }
                        idealTypes.img = "";
                        return idealTypes;
                    }
                    idealTypes.selected = nb5Var.m158738g();
                }
            }
            return idealTypes;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IdealTypes idealTypes, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = idealTypes.value;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = idealTypes.img;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            codedOutputByteBufferNano.m17244A(3, idealTypes.selected);
        }
    };
    public static JsonAdapter<IdealTypes> JSON_ADAPTER = new ObjectJsonAdapter<IdealTypes>() { // from class: com.p1.mobile.putong.core.data.IdealTypes.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IdealTypes.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IdealTypes newInstance() {
            return new IdealTypes();
        }

        public boolean parseField(IdealTypes idealTypes, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "img":
                    idealTypes.img = jsonParser.getValueAsString();
                    return true;
                case "value":
                    idealTypes.value = jsonParser.getValueAsString();
                    return true;
                case "selected":
                    idealTypes.selected = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(IdealTypes idealTypes, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "img":
                case "value":
                case "selected":
                    return true;
                default:
                    return super.parseFieldCheck(idealTypes, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IdealTypes idealTypes, JsonGenerator jsonGenerator) throws IOException {
            String str = idealTypes.value;
            if (str != null) {
                jsonGenerator.writeStringField("value", str);
            }
            String str2 = idealTypes.img;
            if (str2 != null) {
                jsonGenerator.writeStringField("img", str2);
            }
            jsonGenerator.writeBooleanField(MatchFrom.selected, idealTypes.selected);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IdealTypes) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IdealTypes) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IdealTypes new_() {
        IdealTypes idealTypes = new IdealTypes();
        idealTypes.nullCheck();
        return idealTypes;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IdealTypes mo223809clone() {
        IdealTypes idealTypes = new IdealTypes();
        idealTypes.value = this.value;
        idealTypes.img = this.img;
        idealTypes.selected = this.selected;
        return idealTypes;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IdealTypes)) {
            return false;
        }
        IdealTypes idealTypes = (IdealTypes) obj;
        return ValueObject.util_equals(this.value, idealTypes.value) && ValueObject.util_equals(this.img, idealTypes.img) && this.selected == idealTypes.selected;
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
        String str = this.value;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.img;
        int iHashCode2 = ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + (this.selected ? 1231 : 1237);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.value == null) {
            this.value = "";
        }
        if (this.img == null) {
            this.img = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
