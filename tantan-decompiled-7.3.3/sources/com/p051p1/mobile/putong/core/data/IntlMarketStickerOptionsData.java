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
import com.tencent.open.SocialConstants;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import p153l.nc5;

/* JADX INFO: loaded from: classes10.dex */
public class IntlMarketStickerOptionsData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlmarketstickeroptionsdata";

    @NonNull
    @ProtobufIndex(index = 3)
    public String desc;

    /* JADX INFO: renamed from: id */
    @ProtobufIndex(index = 1)
    public int f21168id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String img_url;

    @ProtobufIndex(index = 4)
    public boolean isSelected;

    @NonNull
    @ProtobufIndex(index = 5)
    public String sub_desc;
    public static ProtobufAdapter<IntlMarketStickerOptionsData> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlMarketStickerOptionsData>() { // from class: com.p1.mobile.putong.core.data.IntlMarketStickerOptionsData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IntlMarketStickerOptionsData intlMarketStickerOptionsData) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, intlMarketStickerOptionsData.f21168id);
            String str = intlMarketStickerOptionsData.img_url;
            if (str != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(2, str);
            }
            String str2 = intlMarketStickerOptionsData.desc;
            if (str2 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(3, str2);
            }
            int iM17275b = iM17281h + CodedOutputByteBufferNano.m17275b(4, intlMarketStickerOptionsData.isSelected);
            String str3 = intlMarketStickerOptionsData.sub_desc;
            if (str3 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(5, str3);
            }
            intlMarketStickerOptionsData.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IntlMarketStickerOptionsData parse(nc5 nc5Var) throws IOException {
            IntlMarketStickerOptionsData intlMarketStickerOptionsData = new IntlMarketStickerOptionsData();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (intlMarketStickerOptionsData.img_url == null) {
                        intlMarketStickerOptionsData.img_url = "";
                    }
                    if (intlMarketStickerOptionsData.desc == null) {
                        intlMarketStickerOptionsData.desc = "";
                    }
                    if (intlMarketStickerOptionsData.sub_desc != null) {
                        break;
                    }
                    intlMarketStickerOptionsData.sub_desc = "";
                    break;
                }
                if (iM162497u == 8) {
                    intlMarketStickerOptionsData.f21168id = nc5Var.m162486j();
                } else if (iM162497u == 18) {
                    intlMarketStickerOptionsData.img_url = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    intlMarketStickerOptionsData.desc = nc5Var.m162495s();
                } else if (iM162497u == 32) {
                    intlMarketStickerOptionsData.isSelected = nc5Var.m162483g();
                } else {
                    if (iM162497u != 42) {
                        if (intlMarketStickerOptionsData.img_url == null) {
                            intlMarketStickerOptionsData.img_url = "";
                        }
                        if (intlMarketStickerOptionsData.desc == null) {
                            intlMarketStickerOptionsData.desc = "";
                        }
                        if (intlMarketStickerOptionsData.sub_desc != null) {
                            break;
                        }
                        intlMarketStickerOptionsData.sub_desc = "";
                        return intlMarketStickerOptionsData;
                    }
                    intlMarketStickerOptionsData.sub_desc = nc5Var.m162495s();
                }
            }
            return intlMarketStickerOptionsData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IntlMarketStickerOptionsData intlMarketStickerOptionsData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, intlMarketStickerOptionsData.f21168id);
            String str = intlMarketStickerOptionsData.img_url;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(2, str);
            }
            String str2 = intlMarketStickerOptionsData.desc;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(3, str2);
            }
            codedOutputByteBufferNano.m17299A(4, intlMarketStickerOptionsData.isSelected);
            String str3 = intlMarketStickerOptionsData.sub_desc;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(5, str3);
            }
        }
    };
    public static JsonAdapter<IntlMarketStickerOptionsData> JSON_ADAPTER = new ObjectJsonAdapter<IntlMarketStickerOptionsData>() { // from class: com.p1.mobile.putong.core.data.IntlMarketStickerOptionsData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IntlMarketStickerOptionsData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IntlMarketStickerOptionsData newInstance() {
            return new IntlMarketStickerOptionsData();
        }

        public boolean parseField(IntlMarketStickerOptionsData intlMarketStickerOptionsData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "sub_desc":
                    intlMarketStickerOptionsData.sub_desc = jsonParser.getValueAsString();
                    return true;
                case "id":
                    intlMarketStickerOptionsData.f21168id = jsonParser.getValueAsInt();
                    return false;
                case "desc":
                    intlMarketStickerOptionsData.desc = jsonParser.getValueAsString();
                    return true;
                case "isSelected":
                    intlMarketStickerOptionsData.isSelected = jsonParser.getValueAsBoolean();
                    return true;
                case "img_url":
                    intlMarketStickerOptionsData.img_url = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(IntlMarketStickerOptionsData intlMarketStickerOptionsData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "sub_desc":
                    return true;
                case "id":
                    return false;
                case "desc":
                case "isSelected":
                case "img_url":
                    return true;
                default:
                    return super.parseFieldCheck(intlMarketStickerOptionsData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IntlMarketStickerOptionsData intlMarketStickerOptionsData, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("id", intlMarketStickerOptionsData.f21168id);
            String str = intlMarketStickerOptionsData.img_url;
            if (str != null) {
                jsonGenerator.writeStringField("img_url", str);
            }
            String str2 = intlMarketStickerOptionsData.desc;
            if (str2 != null) {
                jsonGenerator.writeStringField(SocialConstants.PARAM_APP_DESC, str2);
            }
            jsonGenerator.writeBooleanField("isSelected", intlMarketStickerOptionsData.isSelected);
            String str3 = intlMarketStickerOptionsData.sub_desc;
            if (str3 != null) {
                jsonGenerator.writeStringField("sub_desc", str3);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlMarketStickerOptionsData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlMarketStickerOptionsData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlMarketStickerOptionsData new_() {
        IntlMarketStickerOptionsData intlMarketStickerOptionsData = new IntlMarketStickerOptionsData();
        intlMarketStickerOptionsData.nullCheck();
        return intlMarketStickerOptionsData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IntlMarketStickerOptionsData mo225055clone() {
        IntlMarketStickerOptionsData intlMarketStickerOptionsData = new IntlMarketStickerOptionsData();
        intlMarketStickerOptionsData.f21168id = this.f21168id;
        intlMarketStickerOptionsData.img_url = this.img_url;
        intlMarketStickerOptionsData.desc = this.desc;
        intlMarketStickerOptionsData.isSelected = this.isSelected;
        intlMarketStickerOptionsData.sub_desc = this.sub_desc;
        return intlMarketStickerOptionsData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntlMarketStickerOptionsData)) {
            return false;
        }
        IntlMarketStickerOptionsData intlMarketStickerOptionsData = (IntlMarketStickerOptionsData) obj;
        return this.f21168id == intlMarketStickerOptionsData.f21168id && ValueObject.util_equals(this.img_url, intlMarketStickerOptionsData.img_url) && ValueObject.util_equals(this.desc, intlMarketStickerOptionsData.desc) && this.isSelected == intlMarketStickerOptionsData.isSelected && ValueObject.util_equals(this.sub_desc, intlMarketStickerOptionsData.sub_desc);
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
        int i2 = ((i * 41) + this.f21168id) * 41;
        String str = this.img_url;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.desc;
        int iHashCode2 = (((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + (this.isSelected ? 1231 : 1237)) * 41;
        String str3 = this.sub_desc;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.img_url == null) {
            this.img_url = "";
        }
        if (this.desc == null) {
            this.desc = "";
        }
        if (this.sub_desc == null) {
            this.sub_desc = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
