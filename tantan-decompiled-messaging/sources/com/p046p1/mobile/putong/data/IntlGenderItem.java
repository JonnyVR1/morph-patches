package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
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
import com.tencent.open.SocialConstants;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import p149l.nb5;

/* JADX INFO: loaded from: classes12.dex */
public class IntlGenderItem extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlgenderitem";

    @NonNull
    @ProtobufIndex(index = 3)
    public String desc;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public SubGender f38761id;

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
            SubGender subGender = intlGenderItem.f38761id;
            int iM17230l = subGender != null ? CodedOutputByteBufferNano.m17230l(1, subGender, SubGender.PROTOBUF_ADAPTER) : 0;
            String str = intlGenderItem.title;
            if (str != null) {
                iM17230l += CodedOutputByteBufferNano.m17233o(2, str);
            }
            String str2 = intlGenderItem.desc;
            if (str2 != null) {
                iM17230l += CodedOutputByteBufferNano.m17233o(3, str2);
            }
            int iM17220b = iM17230l + CodedOutputByteBufferNano.m17220b(4, intlGenderItem.isSelected);
            intlGenderItem.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IntlGenderItem parse(nb5 nb5Var) throws IOException {
            IntlGenderItem intlGenderItem = new IntlGenderItem();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (intlGenderItem.f38761id == null) {
                        intlGenderItem.f38761id = (SubGender) SubGender.JSON_ADAPTER.defaultEnum();
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
                if (iM158752u == 10) {
                    intlGenderItem.f38761id = (SubGender) nb5Var.m158743l(SubGender.PROTOBUF_ADAPTER);
                } else if (iM158752u == 18) {
                    intlGenderItem.title = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    intlGenderItem.desc = nb5Var.m158750s();
                } else {
                    if (iM158752u != 32) {
                        if (intlGenderItem.f38761id == null) {
                            intlGenderItem.f38761id = (SubGender) SubGender.JSON_ADAPTER.defaultEnum();
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
                    intlGenderItem.isSelected = nb5Var.m158738g();
                }
            }
            return intlGenderItem;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IntlGenderItem intlGenderItem, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            SubGender subGender = intlGenderItem.f38761id;
            if (subGender != null) {
                codedOutputByteBufferNano.m17254K(1, subGender, SubGender.PROTOBUF_ADAPTER);
            }
            String str = intlGenderItem.title;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(2, str);
            }
            String str2 = intlGenderItem.desc;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(3, str2);
            }
            codedOutputByteBufferNano.m17244A(4, intlGenderItem.isSelected);
        }
    };
    public static JsonAdapter<IntlGenderItem> JSON_ADAPTER = new ObjectJsonAdapter<IntlGenderItem>() { // from class: com.p1.mobile.putong.data.IntlGenderItem.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IntlGenderItem.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IntlGenderItem newInstance() {
            return new IntlGenderItem();
        }

        public boolean parseField(IntlGenderItem intlGenderItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    intlGenderItem.f38761id = SubGender.JSON_ADAPTER.parse(jsonParser, str2);
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IntlGenderItem intlGenderItem, JsonGenerator jsonGenerator) throws IOException {
            if (intlGenderItem.f38761id != null) {
                jsonGenerator.writeFieldName("id");
                SubGender.JSON_ADAPTER.serialize(intlGenderItem.f38761id, jsonGenerator, true);
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlGenderItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
    public IntlGenderItem mo223809clone() {
        IntlGenderItem intlGenderItem = new IntlGenderItem();
        intlGenderItem.f38761id = this.f38761id;
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
        return ValueObject.util_equals(this.f38761id, intlGenderItem.f38761id) && ValueObject.util_equals(this.title, intlGenderItem.title) && ValueObject.util_equals(this.desc, intlGenderItem.desc) && this.isSelected == intlGenderItem.isSelected;
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
        SubGender subGender = this.f38761id;
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
        if (this.f38761id == null) {
            this.f38761id = (SubGender) SubGender.JSON_ADAPTER.defaultEnum();
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
