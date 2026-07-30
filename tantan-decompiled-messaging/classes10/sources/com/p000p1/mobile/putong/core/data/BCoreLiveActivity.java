package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.data.IdBoxed;
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
public class BCoreLiveActivity extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "bcoreliveactivity";

    @NonNull
    @ProtobufIndex(index = 8)
    public String category;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f11id;

    @NonNull
    @ProtobufIndex(index = 4)
    public IdBoxed owner;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public IdBoxed reference;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String title;

    @NonNull
    @ProtobufIndex(index = 6)
    public String type;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String value;

    @NonNull
    @ProtobufIndex(index = 9)
    public String valueColor;

    @NonNull
    @ProtobufIndex(index = 7)
    public String valueType;
    public static ProtobufAdapter<BCoreLiveActivity> PROTOBUF_ADAPTER = new MessageNanoAdapter<BCoreLiveActivity>() { // from class: com.p1.mobile.putong.core.data.BCoreLiveActivity.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(BCoreLiveActivity bCoreLiveActivity) {
            String str = bCoreLiveActivity.f11id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = bCoreLiveActivity.title;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = bCoreLiveActivity.value;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            IdBoxed idBoxed = bCoreLiveActivity.owner;
            if (idBoxed != null) {
                iO += CodedOutputByteBufferNano.l(4, idBoxed, IdBoxed.PROTOBUF_ADAPTER);
            }
            IdBoxed idBoxed2 = bCoreLiveActivity.reference;
            if (idBoxed2 != null) {
                iO += CodedOutputByteBufferNano.l(5, idBoxed2, IdBoxed.PROTOBUF_ADAPTER);
            }
            String str4 = bCoreLiveActivity.type;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(6, str4);
            }
            String str5 = bCoreLiveActivity.valueType;
            if (str5 != null) {
                iO += CodedOutputByteBufferNano.o(7, str5);
            }
            String str6 = bCoreLiveActivity.category;
            if (str6 != null) {
                iO += CodedOutputByteBufferNano.o(8, str6);
            }
            String str7 = bCoreLiveActivity.valueColor;
            if (str7 != null) {
                iO += CodedOutputByteBufferNano.o(9, str7);
            }
            ((MessageNano) bCoreLiveActivity).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public BCoreLiveActivity m11713parse(nb5 nb5Var) throws IOException {
            BCoreLiveActivity bCoreLiveActivity = new BCoreLiveActivity();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (bCoreLiveActivity.f11id == null) {
                        bCoreLiveActivity.f11id = "";
                    }
                    if (bCoreLiveActivity.title == null) {
                        bCoreLiveActivity.title = "";
                    }
                    if (bCoreLiveActivity.value == null) {
                        bCoreLiveActivity.value = "";
                    }
                    if (bCoreLiveActivity.owner == null) {
                        bCoreLiveActivity.owner = IdBoxed.new_();
                    }
                    if (bCoreLiveActivity.reference == null) {
                        bCoreLiveActivity.reference = IdBoxed.new_();
                    }
                    if (bCoreLiveActivity.type == null) {
                        bCoreLiveActivity.type = "";
                    }
                    if (bCoreLiveActivity.valueType == null) {
                        bCoreLiveActivity.valueType = "";
                    }
                    if (bCoreLiveActivity.category == null) {
                        bCoreLiveActivity.category = "";
                    }
                    if (bCoreLiveActivity.valueColor != null) {
                        break;
                    }
                    bCoreLiveActivity.valueColor = "";
                    break;
                }
                if (iU == 10) {
                    bCoreLiveActivity.f11id = nb5Var.s();
                } else if (iU == 18) {
                    bCoreLiveActivity.title = nb5Var.s();
                } else if (iU == 26) {
                    bCoreLiveActivity.value = nb5Var.s();
                } else if (iU == 34) {
                    bCoreLiveActivity.owner = (IdBoxed) nb5Var.l(IdBoxed.PROTOBUF_ADAPTER);
                } else if (iU == 42) {
                    bCoreLiveActivity.reference = (IdBoxed) nb5Var.l(IdBoxed.PROTOBUF_ADAPTER);
                } else if (iU == 50) {
                    bCoreLiveActivity.type = nb5Var.s();
                } else if (iU == 58) {
                    bCoreLiveActivity.valueType = nb5Var.s();
                } else if (iU == 66) {
                    bCoreLiveActivity.category = nb5Var.s();
                } else {
                    if (iU != 74) {
                        if (bCoreLiveActivity.f11id == null) {
                            bCoreLiveActivity.f11id = "";
                        }
                        if (bCoreLiveActivity.title == null) {
                            bCoreLiveActivity.title = "";
                        }
                        if (bCoreLiveActivity.value == null) {
                            bCoreLiveActivity.value = "";
                        }
                        if (bCoreLiveActivity.owner == null) {
                            bCoreLiveActivity.owner = IdBoxed.new_();
                        }
                        if (bCoreLiveActivity.reference == null) {
                            bCoreLiveActivity.reference = IdBoxed.new_();
                        }
                        if (bCoreLiveActivity.type == null) {
                            bCoreLiveActivity.type = "";
                        }
                        if (bCoreLiveActivity.valueType == null) {
                            bCoreLiveActivity.valueType = "";
                        }
                        if (bCoreLiveActivity.category == null) {
                            bCoreLiveActivity.category = "";
                        }
                        if (bCoreLiveActivity.valueColor != null) {
                            break;
                        }
                        bCoreLiveActivity.valueColor = "";
                        return bCoreLiveActivity;
                    }
                    bCoreLiveActivity.valueColor = nb5Var.s();
                }
            }
            return bCoreLiveActivity;
        }

        public void serialize(BCoreLiveActivity bCoreLiveActivity, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = bCoreLiveActivity.f11id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = bCoreLiveActivity.title;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = bCoreLiveActivity.value;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            IdBoxed idBoxed = bCoreLiveActivity.owner;
            if (idBoxed != null) {
                codedOutputByteBufferNano.K(4, idBoxed, IdBoxed.PROTOBUF_ADAPTER);
            }
            IdBoxed idBoxed2 = bCoreLiveActivity.reference;
            if (idBoxed2 != null) {
                codedOutputByteBufferNano.K(5, idBoxed2, IdBoxed.PROTOBUF_ADAPTER);
            }
            String str4 = bCoreLiveActivity.type;
            if (str4 != null) {
                codedOutputByteBufferNano.R(6, str4);
            }
            String str5 = bCoreLiveActivity.valueType;
            if (str5 != null) {
                codedOutputByteBufferNano.R(7, str5);
            }
            String str6 = bCoreLiveActivity.category;
            if (str6 != null) {
                codedOutputByteBufferNano.R(8, str6);
            }
            String str7 = bCoreLiveActivity.valueColor;
            if (str7 != null) {
                codedOutputByteBufferNano.R(9, str7);
            }
        }
    };
    public static JsonAdapter<BCoreLiveActivity> JSON_ADAPTER = new ObjectJsonAdapter<BCoreLiveActivity>() { // from class: com.p1.mobile.putong.core.data.BCoreLiveActivity.2
        public Class getDataClass() {
            return BCoreLiveActivity.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public BCoreLiveActivity m11714newInstance() {
            return new BCoreLiveActivity();
        }

        public boolean parseField(BCoreLiveActivity bCoreLiveActivity, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "reference":
                    bCoreLiveActivity.reference = (IdBoxed) IdBoxed.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "valueType":
                    bCoreLiveActivity.valueType = jsonParser.getValueAsString();
                    return true;
                case "id":
                    bCoreLiveActivity.f11id = jsonParser.getValueAsString();
                    return false;
                case "type":
                    bCoreLiveActivity.type = jsonParser.getValueAsString();
                    return true;
                case "category":
                    bCoreLiveActivity.category = jsonParser.getValueAsString();
                    return true;
                case "owner":
                    bCoreLiveActivity.owner = (IdBoxed) IdBoxed.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "title":
                    bCoreLiveActivity.title = jsonParser.getValueAsString();
                    return true;
                case "value":
                    bCoreLiveActivity.value = jsonParser.getValueAsString();
                    return true;
                case "valueColor":
                    bCoreLiveActivity.valueColor = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(BCoreLiveActivity bCoreLiveActivity, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "reference":
                case "valueType":
                    return true;
                case "id":
                    return false;
                case "type":
                case "category":
                case "owner":
                case "title":
                case "value":
                case "valueColor":
                    return true;
                default:
                    return super.parseFieldCheck(bCoreLiveActivity, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(BCoreLiveActivity bCoreLiveActivity, JsonGenerator jsonGenerator) throws IOException {
            String str = bCoreLiveActivity.f11id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bCoreLiveActivity.title;
            if (str2 != null) {
                jsonGenerator.writeStringField(KnowMyselfShareParams.PARAMS_TITLE, str2);
            }
            String str3 = bCoreLiveActivity.value;
            if (str3 != null) {
                jsonGenerator.writeStringField("value", str3);
            }
            if (bCoreLiveActivity.owner != null) {
                jsonGenerator.writeFieldName("owner");
                IdBoxed.JSON_ADAPTER.serialize(bCoreLiveActivity.owner, jsonGenerator, true);
            }
            if (bCoreLiveActivity.reference != null) {
                jsonGenerator.writeFieldName("reference");
                IdBoxed.JSON_ADAPTER.serialize(bCoreLiveActivity.reference, jsonGenerator, true);
            }
            String str4 = bCoreLiveActivity.type;
            if (str4 != null) {
                jsonGenerator.writeStringField("type", str4);
            }
            String str5 = bCoreLiveActivity.valueType;
            if (str5 != null) {
                jsonGenerator.writeStringField("valueType", str5);
            }
            String str6 = bCoreLiveActivity.category;
            if (str6 != null) {
                jsonGenerator.writeStringField("category", str6);
            }
            String str7 = bCoreLiveActivity.valueColor;
            if (str7 != null) {
                jsonGenerator.writeStringField("valueColor", str7);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((BCoreLiveActivity) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BCoreLiveActivity) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static BCoreLiveActivity new_() {
        BCoreLiveActivity bCoreLiveActivity = new BCoreLiveActivity();
        bCoreLiveActivity.nullCheck();
        return bCoreLiveActivity;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public BCoreLiveActivity m11712clone() {
        BCoreLiveActivity bCoreLiveActivity = new BCoreLiveActivity();
        bCoreLiveActivity.f11id = this.f11id;
        bCoreLiveActivity.title = this.title;
        bCoreLiveActivity.value = this.value;
        IdBoxed idBoxed = this.owner;
        if (idBoxed != null) {
            bCoreLiveActivity.owner = idBoxed.clone();
        }
        IdBoxed idBoxed2 = this.reference;
        if (idBoxed2 != null) {
            bCoreLiveActivity.reference = idBoxed2.clone();
        }
        bCoreLiveActivity.type = this.type;
        bCoreLiveActivity.valueType = this.valueType;
        bCoreLiveActivity.category = this.category;
        bCoreLiveActivity.valueColor = this.valueColor;
        return bCoreLiveActivity;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BCoreLiveActivity)) {
            return false;
        }
        BCoreLiveActivity bCoreLiveActivity = (BCoreLiveActivity) obj;
        return ValueObject.util_equals(this.f11id, bCoreLiveActivity.f11id) && ValueObject.util_equals(this.title, bCoreLiveActivity.title) && ValueObject.util_equals(this.value, bCoreLiveActivity.value) && ValueObject.util_equals(this.owner, bCoreLiveActivity.owner) && ValueObject.util_equals(this.reference, bCoreLiveActivity.reference) && ValueObject.util_equals(this.type, bCoreLiveActivity.type) && ValueObject.util_equals(this.valueType, bCoreLiveActivity.valueType) && ValueObject.util_equals(this.category, bCoreLiveActivity.category) && ValueObject.util_equals(this.valueColor, bCoreLiveActivity.valueColor);
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
        String str = this.f11id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.value;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        IdBoxed idBoxed = this.owner;
        int iHashCode4 = (iHashCode3 + (idBoxed != null ? idBoxed.hashCode() : 0)) * 41;
        IdBoxed idBoxed2 = this.reference;
        int iHashCode5 = (iHashCode4 + (idBoxed2 != null ? idBoxed2.hashCode() : 0)) * 41;
        String str4 = this.type;
        int iHashCode6 = (iHashCode5 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.valueType;
        int iHashCode7 = (iHashCode6 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.category;
        int iHashCode8 = (iHashCode7 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.valueColor;
        int iHashCode9 = iHashCode8 + (str7 != null ? str7.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode9;
        return iHashCode9;
    }

    public void nullCheck() {
        if (this.f11id == null) {
            this.f11id = "";
        }
        if (this.title == null) {
            this.title = "";
        }
        if (this.value == null) {
            this.value = "";
        }
        if (this.owner == null) {
            this.owner = IdBoxed.new_();
        }
        if (this.reference == null) {
            this.reference = IdBoxed.new_();
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.valueType == null) {
            this.valueType = "";
        }
        if (this.category == null) {
            this.category = "";
        }
        if (this.valueColor == null) {
            this.valueColor = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
