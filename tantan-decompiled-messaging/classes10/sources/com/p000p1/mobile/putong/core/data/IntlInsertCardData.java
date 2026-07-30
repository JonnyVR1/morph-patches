package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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
public class IntlInsertCardData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlinsertcarddata";

    @Nullable
    @ProtobufIndex(index = 4)
    public BuzzUser buzzUser;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int cardType;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public FloatUserCardData floatUserCardData;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f86id;

    @Nullable
    @ProtobufIndex(index = 6)
    public RecallMembershipData recallMembership;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public int showType;
    public static ProtobufAdapter<IntlInsertCardData> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlInsertCardData>() { // from class: com.p1.mobile.putong.core.data.IntlInsertCardData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(IntlInsertCardData intlInsertCardData) {
            String str = intlInsertCardData.f86id;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.h(2, intlInsertCardData.cardType) + CodedOutputByteBufferNano.h(3, intlInsertCardData.showType);
            BuzzUser buzzUser = intlInsertCardData.buzzUser;
            if (buzzUser != null) {
                iO += CodedOutputByteBufferNano.l(4, buzzUser, BuzzUser.PROTOBUF_ADAPTER);
            }
            FloatUserCardData floatUserCardData = intlInsertCardData.floatUserCardData;
            if (floatUserCardData != null) {
                iO += CodedOutputByteBufferNano.l(5, floatUserCardData, FloatUserCardData.PROTOBUF_ADAPTER);
            }
            RecallMembershipData recallMembershipData = intlInsertCardData.recallMembership;
            if (recallMembershipData != null) {
                iO += CodedOutputByteBufferNano.l(6, recallMembershipData, RecallMembershipData.PROTOBUF_ADAPTER);
            }
            ((MessageNano) intlInsertCardData).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public IntlInsertCardData m13571parse(nb5 nb5Var) throws IOException {
            IntlInsertCardData intlInsertCardData = new IntlInsertCardData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (intlInsertCardData.f86id == null) {
                        intlInsertCardData.f86id = "";
                    }
                    if (intlInsertCardData.floatUserCardData != null) {
                        break;
                    }
                    intlInsertCardData.floatUserCardData = FloatUserCardData.new_();
                    break;
                }
                if (iU == 10) {
                    intlInsertCardData.f86id = nb5Var.s();
                } else if (iU == 16) {
                    intlInsertCardData.cardType = nb5Var.j();
                } else if (iU == 24) {
                    intlInsertCardData.showType = nb5Var.j();
                } else if (iU == 34) {
                    intlInsertCardData.buzzUser = (BuzzUser) nb5Var.l(BuzzUser.PROTOBUF_ADAPTER);
                } else if (iU == 42) {
                    intlInsertCardData.floatUserCardData = (FloatUserCardData) nb5Var.l(FloatUserCardData.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 50) {
                        if (intlInsertCardData.f86id == null) {
                            intlInsertCardData.f86id = "";
                        }
                        if (intlInsertCardData.floatUserCardData != null) {
                            break;
                        }
                        intlInsertCardData.floatUserCardData = FloatUserCardData.new_();
                        return intlInsertCardData;
                    }
                    intlInsertCardData.recallMembership = (RecallMembershipData) nb5Var.l(RecallMembershipData.PROTOBUF_ADAPTER);
                }
            }
            return intlInsertCardData;
        }

        public void serialize(IntlInsertCardData intlInsertCardData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = intlInsertCardData.f86id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.G(2, intlInsertCardData.cardType);
            codedOutputByteBufferNano.G(3, intlInsertCardData.showType);
            BuzzUser buzzUser = intlInsertCardData.buzzUser;
            if (buzzUser != null) {
                codedOutputByteBufferNano.K(4, buzzUser, BuzzUser.PROTOBUF_ADAPTER);
            }
            FloatUserCardData floatUserCardData = intlInsertCardData.floatUserCardData;
            if (floatUserCardData != null) {
                codedOutputByteBufferNano.K(5, floatUserCardData, FloatUserCardData.PROTOBUF_ADAPTER);
            }
            RecallMembershipData recallMembershipData = intlInsertCardData.recallMembership;
            if (recallMembershipData != null) {
                codedOutputByteBufferNano.K(6, recallMembershipData, RecallMembershipData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<IntlInsertCardData> JSON_ADAPTER = new ObjectJsonAdapter<IntlInsertCardData>() { // from class: com.p1.mobile.putong.core.data.IntlInsertCardData.2
        public Class getDataClass() {
            return IntlInsertCardData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public IntlInsertCardData m13572newInstance() {
            return new IntlInsertCardData();
        }

        public boolean parseField(IntlInsertCardData intlInsertCardData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "floatUserCardData":
                    intlInsertCardData.floatUserCardData = (FloatUserCardData) FloatUserCardData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "buzzUser":
                    intlInsertCardData.buzzUser = (BuzzUser) BuzzUser.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "recallMembership":
                    intlInsertCardData.recallMembership = (RecallMembershipData) RecallMembershipData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "showType":
                    intlInsertCardData.showType = jsonParser.getValueAsInt();
                    return true;
                case "cardType":
                    intlInsertCardData.cardType = jsonParser.getValueAsInt();
                    return true;
                case "id":
                    intlInsertCardData.f86id = jsonParser.getValueAsString();
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

        public void serializeFields(IntlInsertCardData intlInsertCardData, JsonGenerator jsonGenerator) throws IOException {
            String str = intlInsertCardData.f86id;
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlInsertCardData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlInsertCardData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlInsertCardData new_() {
        IntlInsertCardData intlInsertCardData = new IntlInsertCardData();
        intlInsertCardData.nullCheck();
        return intlInsertCardData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public IntlInsertCardData m13570clone() {
        IntlInsertCardData intlInsertCardData = new IntlInsertCardData();
        intlInsertCardData.f86id = this.f86id;
        intlInsertCardData.cardType = this.cardType;
        intlInsertCardData.showType = this.showType;
        BuzzUser buzzUser = this.buzzUser;
        if (buzzUser != null) {
            intlInsertCardData.buzzUser = buzzUser.m11842clone();
        }
        FloatUserCardData floatUserCardData = this.floatUserCardData;
        if (floatUserCardData != null) {
            intlInsertCardData.floatUserCardData = floatUserCardData.m12804clone();
        }
        RecallMembershipData recallMembershipData = this.recallMembership;
        if (recallMembershipData != null) {
            intlInsertCardData.recallMembership = recallMembershipData.m15288clone();
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
        return ValueObject.util_equals(this.f86id, intlInsertCardData.f86id) && this.cardType == intlInsertCardData.cardType && this.showType == intlInsertCardData.showType && ValueObject.util_equals(this.buzzUser, intlInsertCardData.buzzUser) && ValueObject.util_equals(this.floatUserCardData, intlInsertCardData.floatUserCardData) && ValueObject.util_equals(this.recallMembership, intlInsertCardData.recallMembership);
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
        String str = this.f86id;
        int iHashCode = (((((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.cardType) * 41) + this.showType) * 41;
        BuzzUser buzzUser = this.buzzUser;
        int iHashCode2 = (iHashCode + (buzzUser != null ? buzzUser.hashCode() : 0)) * 41;
        FloatUserCardData floatUserCardData = this.floatUserCardData;
        int iHashCode3 = (iHashCode2 + (floatUserCardData != null ? floatUserCardData.hashCode() : 0)) * 41;
        RecallMembershipData recallMembershipData = this.recallMembership;
        int iHashCode4 = iHashCode3 + (recallMembershipData != null ? recallMembershipData.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

    public void nullCheck() {
        if (this.f86id == null) {
            this.f86id = "";
        }
        if (this.floatUserCardData == null) {
            this.floatUserCardData = FloatUserCardData.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
