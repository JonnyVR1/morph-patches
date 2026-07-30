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
public class IdealTypes extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "idealtypes";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String img;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public boolean selected;

    @NonNull
    @ProtobufIndex(index = 1)
    public String value;
    public static ProtobufAdapter<IdealTypes> PROTOBUF_ADAPTER = new MessageNanoAdapter<IdealTypes>() { // from class: com.p1.mobile.putong.core.data.IdealTypes.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(IdealTypes idealTypes) {
            String str = idealTypes.value;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = idealTypes.img;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            int iB = iO + CodedOutputByteBufferNano.b(3, idealTypes.selected);
            ((MessageNano) idealTypes).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public IdealTypes m13429parse(nb5 nb5Var) throws IOException {
            IdealTypes idealTypes = new IdealTypes();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (idealTypes.value == null) {
                        idealTypes.value = "";
                    }
                    if (idealTypes.img != null) {
                        break;
                    }
                    idealTypes.img = "";
                    break;
                }
                if (iU == 10) {
                    idealTypes.value = nb5Var.s();
                } else if (iU == 18) {
                    idealTypes.img = nb5Var.s();
                } else {
                    if (iU != 24) {
                        if (idealTypes.value == null) {
                            idealTypes.value = "";
                        }
                        if (idealTypes.img != null) {
                            break;
                        }
                        idealTypes.img = "";
                        return idealTypes;
                    }
                    idealTypes.selected = nb5Var.g();
                }
            }
            return idealTypes;
        }

        public void serialize(IdealTypes idealTypes, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = idealTypes.value;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = idealTypes.img;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            codedOutputByteBufferNano.A(3, idealTypes.selected);
        }
    };
    public static JsonAdapter<IdealTypes> JSON_ADAPTER = new ObjectJsonAdapter<IdealTypes>() { // from class: com.p1.mobile.putong.core.data.IdealTypes.2
        public Class getDataClass() {
            return IdealTypes.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public IdealTypes m13430newInstance() {
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

        public void serializeFields(IdealTypes idealTypes, JsonGenerator jsonGenerator) throws IOException {
            String str = idealTypes.value;
            if (str != null) {
                jsonGenerator.writeStringField("value", str);
            }
            String str2 = idealTypes.img;
            if (str2 != null) {
                jsonGenerator.writeStringField(HomeTabModuleTopicShowType.img, str2);
            }
            jsonGenerator.writeBooleanField("selected", idealTypes.selected);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IdealTypes) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IdealTypes) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IdealTypes new_() {
        IdealTypes idealTypes = new IdealTypes();
        idealTypes.nullCheck();
        return idealTypes;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public IdealTypes m13428clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.value;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.img;
        int iHashCode2 = ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + (this.selected ? 1231 : 1237);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.value == null) {
            this.value = "";
        }
        if (this.img == null) {
            this.img = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
