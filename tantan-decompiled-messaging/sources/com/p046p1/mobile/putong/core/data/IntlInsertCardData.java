package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes10.dex */
public class IntlInsertCardData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlinsertcarddata";

    @Nullable
    @ProtobufIndex(index = 4)
    public BuzzUser buzzUser;

    @ProtobufIndex(index = 2)
    public int cardType;

    @NonNull
    @ProtobufIndex(index = 5)
    public FloatUserCardData floatUserCardData;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f20424id;

    @Nullable
    @ProtobufIndex(index = 6)
    public RecallMembershipData recallMembership;

    @ProtobufIndex(index = 3)
    public int showType;
    public static ProtobufAdapter<IntlInsertCardData> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlInsertCardData>() { // from class: com.p1.mobile.putong.core.data.IntlInsertCardData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IntlInsertCardData intlInsertCardData) {
            String str = intlInsertCardData.f20424id;
            int iM17233o = (str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0) + CodedOutputByteBufferNano.m17226h(2, intlInsertCardData.cardType) + CodedOutputByteBufferNano.m17226h(3, intlInsertCardData.showType);
            BuzzUser buzzUser = intlInsertCardData.buzzUser;
            if (buzzUser != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(4, buzzUser, BuzzUser.PROTOBUF_ADAPTER);
            }
            FloatUserCardData floatUserCardData = intlInsertCardData.floatUserCardData;
            if (floatUserCardData != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(5, floatUserCardData, FloatUserCardData.PROTOBUF_ADAPTER);
            }
            RecallMembershipData recallMembershipData = intlInsertCardData.recallMembership;
            if (recallMembershipData != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(6, recallMembershipData, RecallMembershipData.PROTOBUF_ADAPTER);
            }
            intlInsertCardData.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IntlInsertCardData parse(nb5 nb5Var) throws IOException {
            IntlInsertCardData intlInsertCardData = new IntlInsertCardData();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (intlInsertCardData.f20424id == null) {
                        intlInsertCardData.f20424id = "";
                    }
                    if (intlInsertCardData.floatUserCardData != null) {
                        break;
                    }
                    intlInsertCardData.floatUserCardData = FloatUserCardData.new_();
                    break;
                }
                if (iM158752u == 10) {
                    intlInsertCardData.f20424id = nb5Var.m158750s();
                } else if (iM158752u == 16) {
                    intlInsertCardData.cardType = nb5Var.m158741j();
                } else if (iM158752u == 24) {
                    intlInsertCardData.showType = nb5Var.m158741j();
                } else if (iM158752u == 34) {
                    intlInsertCardData.buzzUser = (BuzzUser) nb5Var.m158743l(BuzzUser.PROTOBUF_ADAPTER);
                } else if (iM158752u == 42) {
                    intlInsertCardData.floatUserCardData = (FloatUserCardData) nb5Var.m158743l(FloatUserCardData.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 50) {
                        if (intlInsertCardData.f20424id == null) {
                            intlInsertCardData.f20424id = "";
                        }
                        if (intlInsertCardData.floatUserCardData != null) {
                            break;
                        }
                        intlInsertCardData.floatUserCardData = FloatUserCardData.new_();
                        return intlInsertCardData;
                    }
                    intlInsertCardData.recallMembership = (RecallMembershipData) nb5Var.m158743l(RecallMembershipData.PROTOBUF_ADAPTER);
                }
            }
            return intlInsertCardData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IntlInsertCardData intlInsertCardData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = intlInsertCardData.f20424id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            codedOutputByteBufferNano.m17250G(2, intlInsertCardData.cardType);
            codedOutputByteBufferNano.m17250G(3, intlInsertCardData.showType);
            BuzzUser buzzUser = intlInsertCardData.buzzUser;
            if (buzzUser != null) {
                codedOutputByteBufferNano.m17254K(4, buzzUser, BuzzUser.PROTOBUF_ADAPTER);
            }
            FloatUserCardData floatUserCardData = intlInsertCardData.floatUserCardData;
            if (floatUserCardData != null) {
                codedOutputByteBufferNano.m17254K(5, floatUserCardData, FloatUserCardData.PROTOBUF_ADAPTER);
            }
            RecallMembershipData recallMembershipData = intlInsertCardData.recallMembership;
            if (recallMembershipData != null) {
                codedOutputByteBufferNano.m17254K(6, recallMembershipData, RecallMembershipData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<IntlInsertCardData> JSON_ADAPTER = new ObjectJsonAdapter<IntlInsertCardData>() { // from class: com.p1.mobile.putong.core.data.IntlInsertCardData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IntlInsertCardData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IntlInsertCardData newInstance() {
            return new IntlInsertCardData();
        }

        public boolean parseField(IntlInsertCardData intlInsertCardData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "floatUserCardData":
                    intlInsertCardData.floatUserCardData = FloatUserCardData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "buzzUser":
                    intlInsertCardData.buzzUser = BuzzUser.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "recallMembership":
                    intlInsertCardData.recallMembership = RecallMembershipData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "showType":
                    intlInsertCardData.showType = jsonParser.getValueAsInt();
                    return true;
                case "cardType":
                    intlInsertCardData.cardType = jsonParser.getValueAsInt();
                    return true;
                case "id":
                    intlInsertCardData.f20424id = jsonParser.getValueAsString();
                    return false;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(IntlInsertCardData intlInsertCardData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "floatUserCardData":
                case "buzzUser":
                case "recallMembership":
                case "showType":
                case "cardType":
                    return true;
                case "id":
                    return false;
                default:
                    return super.parseFieldCheck(intlInsertCardData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IntlInsertCardData intlInsertCardData, JsonGenerator jsonGenerator) throws IOException {
            String str = intlInsertCardData.f20424id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            jsonGenerator.writeNumberField("cardType", intlInsertCardData.cardType);
            jsonGenerator.writeNumberField("showType", intlInsertCardData.showType);
            if (intlInsertCardData.buzzUser != null) {
                jsonGenerator.writeFieldName("buzzUser");
                BuzzUser.JSON_ADAPTER.serialize(intlInsertCardData.buzzUser, jsonGenerator, true);
            }
            if (intlInsertCardData.floatUserCardData != null) {
                jsonGenerator.writeFieldName("floatUserCardData");
                FloatUserCardData.JSON_ADAPTER.serialize(intlInsertCardData.floatUserCardData, jsonGenerator, true);
            }
            if (intlInsertCardData.recallMembership != null) {
                jsonGenerator.writeFieldName("recallMembership");
                RecallMembershipData.JSON_ADAPTER.serialize(intlInsertCardData.recallMembership, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlInsertCardData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlInsertCardData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlInsertCardData new_() {
        IntlInsertCardData intlInsertCardData = new IntlInsertCardData();
        intlInsertCardData.nullCheck();
        return intlInsertCardData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IntlInsertCardData mo223809clone() {
        IntlInsertCardData intlInsertCardData = new IntlInsertCardData();
        intlInsertCardData.f20424id = this.f20424id;
        intlInsertCardData.cardType = this.cardType;
        intlInsertCardData.showType = this.showType;
        BuzzUser buzzUser = this.buzzUser;
        if (buzzUser != null) {
            intlInsertCardData.buzzUser = buzzUser.mo223809clone();
        }
        FloatUserCardData floatUserCardData = this.floatUserCardData;
        if (floatUserCardData != null) {
            intlInsertCardData.floatUserCardData = floatUserCardData.mo223809clone();
        }
        RecallMembershipData recallMembershipData = this.recallMembership;
        if (recallMembershipData != null) {
            intlInsertCardData.recallMembership = recallMembershipData.mo223809clone();
        }
        return intlInsertCardData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntlInsertCardData)) {
            return false;
        }
        IntlInsertCardData intlInsertCardData = (IntlInsertCardData) obj;
        return ValueObject.util_equals(this.f20424id, intlInsertCardData.f20424id) && this.cardType == intlInsertCardData.cardType && this.showType == intlInsertCardData.showType && ValueObject.util_equals(this.buzzUser, intlInsertCardData.buzzUser) && ValueObject.util_equals(this.floatUserCardData, intlInsertCardData.floatUserCardData) && ValueObject.util_equals(this.recallMembership, intlInsertCardData.recallMembership);
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
        String str = this.f20424id;
        int iHashCode = (((((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.cardType) * 41) + this.showType) * 41;
        BuzzUser buzzUser = this.buzzUser;
        int iHashCode2 = (iHashCode + (buzzUser != null ? buzzUser.hashCode() : 0)) * 41;
        FloatUserCardData floatUserCardData = this.floatUserCardData;
        int iHashCode3 = (iHashCode2 + (floatUserCardData != null ? floatUserCardData.hashCode() : 0)) * 41;
        RecallMembershipData recallMembershipData = this.recallMembership;
        int iHashCode4 = iHashCode3 + (recallMembershipData != null ? recallMembershipData.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f20424id == null) {
            this.f20424id = "";
        }
        if (this.floatUserCardData == null) {
            this.floatUserCardData = FloatUserCardData.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
