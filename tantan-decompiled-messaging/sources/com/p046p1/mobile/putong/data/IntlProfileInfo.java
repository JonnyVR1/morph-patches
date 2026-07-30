package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
import org.spongycastle.asn1.eac.EACTags;
import p149l.nb5;

/* JADX INFO: loaded from: classes12.dex */
public class IntlProfileInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlprofileinfo";

    @NonNull
    @ProtobufIndex(index = 1)
    public String key;

    @NonNull
    @ProtobufIndex(index = 3)
    public String nameEn;

    @NonNull
    @ProtobufIndex(index = 6)
    public String nameIn;

    @NonNull
    @ProtobufIndex(index = 5)
    public String nameJa;

    @NonNull
    @ProtobufIndex(index = 4)
    public String nameKo;

    @NonNull
    @ProtobufIndex(index = 10)
    public String nameLocal;

    @NonNull
    @ProtobufIndex(index = 7)
    public String nameTh;

    @NonNull
    @ProtobufIndex(index = 8)
    public String nameVi;

    @NonNull
    @ProtobufIndex(index = 2)
    public String nameZh;

    @NonNull
    @ProtobufIndex(index = 9)
    public String nameZhTw;

    @ProtobufIndex(index = 11)
    public boolean selected;
    public static ProtobufAdapter<IntlProfileInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlProfileInfo>() { // from class: com.p1.mobile.putong.data.IntlProfileInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IntlProfileInfo intlProfileInfo) {
            String str = intlProfileInfo.key;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = intlProfileInfo.nameZh;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = intlProfileInfo.nameEn;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            String str4 = intlProfileInfo.nameKo;
            if (str4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str4);
            }
            String str5 = intlProfileInfo.nameJa;
            if (str5 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(5, str5);
            }
            String str6 = intlProfileInfo.nameIn;
            if (str6 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(6, str6);
            }
            String str7 = intlProfileInfo.nameTh;
            if (str7 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(7, str7);
            }
            String str8 = intlProfileInfo.nameVi;
            if (str8 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(8, str8);
            }
            String str9 = intlProfileInfo.nameZhTw;
            if (str9 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(9, str9);
            }
            String str10 = intlProfileInfo.nameLocal;
            if (str10 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(10, str10);
            }
            int iM17220b = iM17233o + CodedOutputByteBufferNano.m17220b(11, intlProfileInfo.selected);
            intlProfileInfo.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IntlProfileInfo parse(nb5 nb5Var) throws IOException {
            IntlProfileInfo intlProfileInfo = new IntlProfileInfo();
            while (true) {
                switch (nb5Var.m158752u()) {
                    case 0:
                        if (intlProfileInfo.key == null) {
                            intlProfileInfo.key = "";
                        }
                        if (intlProfileInfo.nameZh == null) {
                            intlProfileInfo.nameZh = "";
                        }
                        if (intlProfileInfo.nameEn == null) {
                            intlProfileInfo.nameEn = "";
                        }
                        if (intlProfileInfo.nameKo == null) {
                            intlProfileInfo.nameKo = "";
                        }
                        if (intlProfileInfo.nameJa == null) {
                            intlProfileInfo.nameJa = "";
                        }
                        if (intlProfileInfo.nameIn == null) {
                            intlProfileInfo.nameIn = "";
                        }
                        if (intlProfileInfo.nameTh == null) {
                            intlProfileInfo.nameTh = "";
                        }
                        if (intlProfileInfo.nameVi == null) {
                            intlProfileInfo.nameVi = "";
                        }
                        if (intlProfileInfo.nameZhTw == null) {
                            intlProfileInfo.nameZhTw = "";
                        }
                        if (intlProfileInfo.nameLocal == null) {
                            intlProfileInfo.nameLocal = "";
                        }
                        break;
                    case 10:
                        intlProfileInfo.key = nb5Var.m158750s();
                        continue;
                    case 18:
                        intlProfileInfo.nameZh = nb5Var.m158750s();
                        continue;
                    case 26:
                        intlProfileInfo.nameEn = nb5Var.m158750s();
                        continue;
                    case 34:
                        intlProfileInfo.nameKo = nb5Var.m158750s();
                        continue;
                    case 42:
                        intlProfileInfo.nameJa = nb5Var.m158750s();
                        continue;
                    case 50:
                        intlProfileInfo.nameIn = nb5Var.m158750s();
                        continue;
                    case 58:
                        intlProfileInfo.nameTh = nb5Var.m158750s();
                        continue;
                    case 66:
                        intlProfileInfo.nameVi = nb5Var.m158750s();
                        continue;
                    case 74:
                        intlProfileInfo.nameZhTw = nb5Var.m158750s();
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        intlProfileInfo.nameLocal = nb5Var.m158750s();
                        continue;
                    case 88:
                        intlProfileInfo.selected = nb5Var.m158738g();
                        continue;
                    default:
                        if (intlProfileInfo.key == null) {
                            intlProfileInfo.key = "";
                        }
                        if (intlProfileInfo.nameZh == null) {
                            intlProfileInfo.nameZh = "";
                        }
                        if (intlProfileInfo.nameEn == null) {
                            intlProfileInfo.nameEn = "";
                        }
                        if (intlProfileInfo.nameKo == null) {
                            intlProfileInfo.nameKo = "";
                        }
                        if (intlProfileInfo.nameJa == null) {
                            intlProfileInfo.nameJa = "";
                        }
                        if (intlProfileInfo.nameIn == null) {
                            intlProfileInfo.nameIn = "";
                        }
                        if (intlProfileInfo.nameTh == null) {
                            intlProfileInfo.nameTh = "";
                        }
                        if (intlProfileInfo.nameVi == null) {
                            intlProfileInfo.nameVi = "";
                        }
                        if (intlProfileInfo.nameZhTw == null) {
                            intlProfileInfo.nameZhTw = "";
                        }
                        if (intlProfileInfo.nameLocal == null) {
                            intlProfileInfo.nameLocal = "";
                            return intlProfileInfo;
                        }
                        break;
                }
            }
            return intlProfileInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IntlProfileInfo intlProfileInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = intlProfileInfo.key;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = intlProfileInfo.nameZh;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = intlProfileInfo.nameEn;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            String str4 = intlProfileInfo.nameKo;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(4, str4);
            }
            String str5 = intlProfileInfo.nameJa;
            if (str5 != null) {
                codedOutputByteBufferNano.m17261R(5, str5);
            }
            String str6 = intlProfileInfo.nameIn;
            if (str6 != null) {
                codedOutputByteBufferNano.m17261R(6, str6);
            }
            String str7 = intlProfileInfo.nameTh;
            if (str7 != null) {
                codedOutputByteBufferNano.m17261R(7, str7);
            }
            String str8 = intlProfileInfo.nameVi;
            if (str8 != null) {
                codedOutputByteBufferNano.m17261R(8, str8);
            }
            String str9 = intlProfileInfo.nameZhTw;
            if (str9 != null) {
                codedOutputByteBufferNano.m17261R(9, str9);
            }
            String str10 = intlProfileInfo.nameLocal;
            if (str10 != null) {
                codedOutputByteBufferNano.m17261R(10, str10);
            }
            codedOutputByteBufferNano.m17244A(11, intlProfileInfo.selected);
        }
    };
    public static JsonAdapter<IntlProfileInfo> JSON_ADAPTER = new ObjectJsonAdapter<IntlProfileInfo>() { // from class: com.p1.mobile.putong.data.IntlProfileInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IntlProfileInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IntlProfileInfo newInstance() {
            return new IntlProfileInfo();
        }

        public boolean parseField(IntlProfileInfo intlProfileInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "nameEn":
                    intlProfileInfo.nameEn = jsonParser.getValueAsString();
                    return true;
                case "nameIn":
                    intlProfileInfo.nameIn = jsonParser.getValueAsString();
                    return true;
                case "nameJa":
                    intlProfileInfo.nameJa = jsonParser.getValueAsString();
                    return true;
                case "nameKo":
                    intlProfileInfo.nameKo = jsonParser.getValueAsString();
                    return true;
                case "nameTh":
                    intlProfileInfo.nameTh = jsonParser.getValueAsString();
                    return true;
                case "nameVi":
                    intlProfileInfo.nameVi = jsonParser.getValueAsString();
                    return true;
                case "nameZh":
                    intlProfileInfo.nameZh = jsonParser.getValueAsString();
                    return true;
                case "key":
                    intlProfileInfo.key = jsonParser.getValueAsString();
                    return true;
                case "selected":
                    intlProfileInfo.selected = jsonParser.getValueAsBoolean();
                    return true;
                case "nameLocal":
                    intlProfileInfo.nameLocal = jsonParser.getValueAsString();
                    return true;
                case "nameZhTw":
                    intlProfileInfo.nameZhTw = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(IntlProfileInfo intlProfileInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "nameEn":
                case "nameIn":
                case "nameJa":
                case "nameKo":
                case "nameTh":
                case "nameVi":
                case "nameZh":
                case "key":
                case "selected":
                case "nameLocal":
                case "nameZhTw":
                    return true;
                default:
                    return super.parseFieldCheck(intlProfileInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IntlProfileInfo intlProfileInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = intlProfileInfo.key;
            if (str != null) {
                jsonGenerator.writeStringField(Constants.KEY_KEY, str);
            }
            String str2 = intlProfileInfo.nameZh;
            if (str2 != null) {
                jsonGenerator.writeStringField("nameZh", str2);
            }
            String str3 = intlProfileInfo.nameEn;
            if (str3 != null) {
                jsonGenerator.writeStringField("nameEn", str3);
            }
            String str4 = intlProfileInfo.nameKo;
            if (str4 != null) {
                jsonGenerator.writeStringField("nameKo", str4);
            }
            String str5 = intlProfileInfo.nameJa;
            if (str5 != null) {
                jsonGenerator.writeStringField("nameJa", str5);
            }
            String str6 = intlProfileInfo.nameIn;
            if (str6 != null) {
                jsonGenerator.writeStringField("nameIn", str6);
            }
            String str7 = intlProfileInfo.nameTh;
            if (str7 != null) {
                jsonGenerator.writeStringField("nameTh", str7);
            }
            String str8 = intlProfileInfo.nameVi;
            if (str8 != null) {
                jsonGenerator.writeStringField("nameVi", str8);
            }
            String str9 = intlProfileInfo.nameZhTw;
            if (str9 != null) {
                jsonGenerator.writeStringField("nameZhTw", str9);
            }
            String str10 = intlProfileInfo.nameLocal;
            if (str10 != null) {
                jsonGenerator.writeStringField("nameLocal", str10);
            }
            jsonGenerator.writeBooleanField(MatchFrom.selected, intlProfileInfo.selected);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlProfileInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlProfileInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlProfileInfo new_() {
        IntlProfileInfo intlProfileInfo = new IntlProfileInfo();
        intlProfileInfo.nullCheck();
        return intlProfileInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IntlProfileInfo mo223809clone() {
        IntlProfileInfo intlProfileInfo = new IntlProfileInfo();
        intlProfileInfo.key = this.key;
        intlProfileInfo.nameZh = this.nameZh;
        intlProfileInfo.nameEn = this.nameEn;
        intlProfileInfo.nameKo = this.nameKo;
        intlProfileInfo.nameJa = this.nameJa;
        intlProfileInfo.nameIn = this.nameIn;
        intlProfileInfo.nameTh = this.nameTh;
        intlProfileInfo.nameVi = this.nameVi;
        intlProfileInfo.nameZhTw = this.nameZhTw;
        intlProfileInfo.nameLocal = this.nameLocal;
        intlProfileInfo.selected = this.selected;
        return intlProfileInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof IntlProfileInfo) {
            return ValueObject.util_equals(this.key, ((IntlProfileInfo) obj).key);
        }
        return false;
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
        String str = this.key;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.key == null) {
            this.key = "";
        }
        if (this.nameZh == null) {
            this.nameZh = "";
        }
        if (this.nameEn == null) {
            this.nameEn = "";
        }
        if (this.nameKo == null) {
            this.nameKo = "";
        }
        if (this.nameJa == null) {
            this.nameJa = "";
        }
        if (this.nameIn == null) {
            this.nameIn = "";
        }
        if (this.nameTh == null) {
            this.nameTh = "";
        }
        if (this.nameVi == null) {
            this.nameVi = "";
        }
        if (this.nameZhTw == null) {
            this.nameZhTw = "";
        }
        if (this.nameLocal == null) {
            this.nameLocal = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
