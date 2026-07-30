package com.p051p1.mobile.putong.data;

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

/* JADX INFO: loaded from: classes12.dex */
public class IntlGenderItem extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlgenderitem";

    @NonNull
    @ProtobufIndex(index = 3)
    public String desc;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public SubGender f39609id;

    @ProtobufIndex(index = 4)
    public boolean isSelected;

    @NonNull
    @ProtobufIndex(index = 2)
    public String title;
    public static ProtobufAdapter<IntlGenderItem> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlGenderItem>() { // from class: com.p1.mobile.putong.data.IntlGenderItem.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IntlGenderItem intlGenderItem) {
            SubGender subGender = intlGenderItem.f39609id;
            int iM17285l = subGender != null ? CodedOutputByteBufferNano.m17285l(1, subGender, SubGender.PROTOBUF_ADAPTER) : 0;
            String str = intlGenderItem.title;
            if (str != null) {
                iM17285l += CodedOutputByteBufferNano.m17288o(2, str);
            }
            String str2 = intlGenderItem.desc;
            if (str2 != null) {
                iM17285l += CodedOutputByteBufferNano.m17288o(3, str2);
            }
            int iM17275b = iM17285l + CodedOutputByteBufferNano.m17275b(4, intlGenderItem.isSelected);
            intlGenderItem.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IntlGenderItem parse(nc5 nc5Var) throws IOException {
            IntlGenderItem intlGenderItem = new IntlGenderItem();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (intlGenderItem.f39609id == null) {
                        intlGenderItem.f39609id = (SubGender) SubGender.JSON_ADAPTER.defaultEnum();
                    }
                    if (intlGenderItem.title == null) {
                        intlGenderItem.title = "";
                    }
                    if (intlGenderItem.desc != null) {
                        break;
                    }
                    intlGenderItem.desc = "";
                    break;
                }
                if (iM162497u == 10) {
                    intlGenderItem.f39609id = (SubGender) nc5Var.m162488l(SubGender.PROTOBUF_ADAPTER);
                } else if (iM162497u == 18) {
                    intlGenderItem.title = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    intlGenderItem.desc = nc5Var.m162495s();
                } else {
                    if (iM162497u != 32) {
                        if (intlGenderItem.f39609id == null) {
                            intlGenderItem.f39609id = (SubGender) SubGender.JSON_ADAPTER.defaultEnum();
                        }
                        if (intlGenderItem.title == null) {
                            intlGenderItem.title = "";
                        }
                        if (intlGenderItem.desc != null) {
                            break;
                        }
                        intlGenderItem.desc = "";
                        return intlGenderItem;
                    }
                    intlGenderItem.isSelected = nc5Var.m162483g();
                }
            }
            return intlGenderItem;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IntlGenderItem intlGenderItem, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            SubGender subGender = intlGenderItem.f39609id;
            if (subGender != null) {
                codedOutputByteBufferNano.m17309K(1, subGender, SubGender.PROTOBUF_ADAPTER);
            }
            String str = intlGenderItem.title;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(2, str);
            }
            String str2 = intlGenderItem.desc;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(3, str2);
            }
            codedOutputByteBufferNano.m17299A(4, intlGenderItem.isSelected);
        }
    };
    public static JsonAdapter<IntlGenderItem> JSON_ADAPTER = new ObjectJsonAdapter<IntlGenderItem>() { // from class: com.p1.mobile.putong.data.IntlGenderItem.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IntlGenderItem.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IntlGenderItem newInstance() {
            return new IntlGenderItem();
        }

        public boolean parseField(IntlGenderItem intlGenderItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    intlGenderItem.f39609id = SubGender.JSON_ADAPTER.parse(jsonParser, str2);
                    return false;
                case "desc":
                    intlGenderItem.desc = jsonParser.getValueAsString();
                    return true;
                case "title":
                    intlGenderItem.title = jsonParser.getValueAsString();
                    return true;
                case "isSelected":
                    intlGenderItem.isSelected = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(IntlGenderItem intlGenderItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "id":
                    return false;
                case "desc":
                case "title":
                case "isSelected":
                    return true;
                default:
                    return super.parseFieldCheck(intlGenderItem, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IntlGenderItem intlGenderItem, JsonGenerator jsonGenerator) throws IOException {
            if (intlGenderItem.f39609id != null) {
                jsonGenerator.writeFieldName("id");
                SubGender.JSON_ADAPTER.serialize(intlGenderItem.f39609id, jsonGenerator, true);
            }
            String str = intlGenderItem.title;
            if (str != null) {
                jsonGenerator.writeStringField("title", str);
            }
            String str2 = intlGenderItem.desc;
            if (str2 != null) {
                jsonGenerator.writeStringField(SocialConstants.PARAM_APP_DESC, str2);
            }
            jsonGenerator.writeBooleanField("isSelected", intlGenderItem.isSelected);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlGenderItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlGenderItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlGenderItem new_() {
        IntlGenderItem intlGenderItem = new IntlGenderItem();
        intlGenderItem.nullCheck();
        return intlGenderItem;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IntlGenderItem mo225055clone() {
        IntlGenderItem intlGenderItem = new IntlGenderItem();
        intlGenderItem.f39609id = this.f39609id;
        intlGenderItem.title = this.title;
        intlGenderItem.desc = this.desc;
        intlGenderItem.isSelected = this.isSelected;
        return intlGenderItem;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntlGenderItem)) {
            return false;
        }
        IntlGenderItem intlGenderItem = (IntlGenderItem) obj;
        return ValueObject.util_equals(this.f39609id, intlGenderItem.f39609id) && ValueObject.util_equals(this.title, intlGenderItem.title) && ValueObject.util_equals(this.desc, intlGenderItem.desc) && this.isSelected == intlGenderItem.isSelected;
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
        SubGender subGender = this.f39609id;
        int iHashCode = (i2 + (subGender != null ? subGender.hashCode() : 0)) * 41;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.desc;
        int iHashCode3 = ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41) + (this.isSelected ? 1231 : 1237);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f39609id == null) {
            this.f39609id = (SubGender) SubGender.JSON_ADAPTER.defaultEnum();
        }
        if (this.title == null) {
            this.title = "";
        }
        if (this.desc == null) {
            this.desc = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
