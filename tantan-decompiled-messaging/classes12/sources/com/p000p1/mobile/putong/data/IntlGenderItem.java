package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class IntlGenderItem extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlgenderitem";

    @NonNull
    @ProtobufIndex(index = 3)
    public String desc;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public SubGender f222id;

    @ProtobufIndex(index = 4)
    public boolean isSelected;

    @NonNull
    @ProtobufIndex(index = 2)
    public String title;
    public static ProtobufAdapter<IntlGenderItem> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlGenderItem>() { // from class: com.p1.mobile.putong.data.IntlGenderItem.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(IntlGenderItem intlGenderItem) {
            SubGender subGender = intlGenderItem.f222id;
            int iL = subGender != null ? CodedOutputByteBufferNano.l(1, subGender, SubGender.PROTOBUF_ADAPTER) : 0;
            String str = intlGenderItem.title;
            if (str != null) {
                iL += CodedOutputByteBufferNano.o(2, str);
            }
            String str2 = intlGenderItem.desc;
            if (str2 != null) {
                iL += CodedOutputByteBufferNano.o(3, str2);
            }
            int iB = iL + CodedOutputByteBufferNano.b(4, intlGenderItem.isSelected);
            ((MessageNano) intlGenderItem).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public IntlGenderItem m18229parse(nb5 nb5Var) throws IOException {
            IntlGenderItem intlGenderItem = new IntlGenderItem();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (intlGenderItem.f222id == null) {
                        intlGenderItem.f222id = (SubGender) SubGender.JSON_ADAPTER.defaultEnum();
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
                if (iU == 10) {
                    intlGenderItem.f222id = (SubGender) nb5Var.l(SubGender.PROTOBUF_ADAPTER);
                } else if (iU == 18) {
                    intlGenderItem.title = nb5Var.s();
                } else if (iU == 26) {
                    intlGenderItem.desc = nb5Var.s();
                } else {
                    if (iU != 32) {
                        if (intlGenderItem.f222id == null) {
                            intlGenderItem.f222id = (SubGender) SubGender.JSON_ADAPTER.defaultEnum();
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
                    intlGenderItem.isSelected = nb5Var.g();
                }
            }
            return intlGenderItem;
        }

        public void serialize(IntlGenderItem intlGenderItem, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            SubGender subGender = intlGenderItem.f222id;
            if (subGender != null) {
                codedOutputByteBufferNano.K(1, subGender, SubGender.PROTOBUF_ADAPTER);
            }
            String str = intlGenderItem.title;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            String str2 = intlGenderItem.desc;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
            codedOutputByteBufferNano.A(4, intlGenderItem.isSelected);
        }
    };
    public static JsonAdapter<IntlGenderItem> JSON_ADAPTER = new ObjectJsonAdapter<IntlGenderItem>() { // from class: com.p1.mobile.putong.data.IntlGenderItem.2
        public Class getDataClass() {
            return IntlGenderItem.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public IntlGenderItem mo17830newInstance() {
            return new IntlGenderItem();
        }

        public boolean parseField(IntlGenderItem intlGenderItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    intlGenderItem.f222id = (SubGender) SubGender.JSON_ADAPTER.parse(jsonParser, str2);
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IntlGenderItem intlGenderItem, JsonGenerator jsonGenerator) throws IOException {
            if (intlGenderItem.f222id != null) {
                jsonGenerator.writeFieldName("id");
                SubGender.JSON_ADAPTER.serialize(intlGenderItem.f222id, jsonGenerator, true);
            }
            String str = intlGenderItem.title;
            if (str != null) {
                jsonGenerator.writeStringField("title", str);
            }
            String str2 = intlGenderItem.desc;
            if (str2 != null) {
                jsonGenerator.writeStringField("desc", str2);
            }
            jsonGenerator.writeBooleanField("isSelected", intlGenderItem.isSelected);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlGenderItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlGenderItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlGenderItem new_() {
        IntlGenderItem intlGenderItem = new IntlGenderItem();
        intlGenderItem.nullCheck();
        return intlGenderItem;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public IntlGenderItem m18228clone() {
        IntlGenderItem intlGenderItem = new IntlGenderItem();
        intlGenderItem.f222id = this.f222id;
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
        return ValueObject.util_equals(this.f222id, intlGenderItem.f222id) && ValueObject.util_equals(this.title, intlGenderItem.title) && ValueObject.util_equals(this.desc, intlGenderItem.desc) && this.isSelected == intlGenderItem.isSelected;
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
        SubGender subGender = this.f222id;
        int iHashCode = (i2 + (subGender != null ? subGender.hashCode() : 0)) * 41;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.desc;
        int iHashCode3 = ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41) + (this.isSelected ? 1231 : 1237);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.f222id == null) {
            this.f222id = (SubGender) SubGender.JSON_ADAPTER.defaultEnum();
        }
        if (this.title == null) {
            this.title = "";
        }
        if (this.desc == null) {
            this.desc = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
