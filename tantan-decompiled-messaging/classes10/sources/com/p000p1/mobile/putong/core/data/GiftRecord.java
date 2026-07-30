package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.GiftDetail;
import com.p1.mobile.putong.data.Converter;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class GiftRecord extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "gift";

    @NonNull
    @ProtobufIndex(index = 4)
    public GiftAction action;

    @NonNull
    @ProtobufIndex(index = 13)
    public List<GiftDetail> details;

    @ProtobufIndex(index = 11)
    public double giftGivenTime;

    @ProtobufIndex(index = 14)
    public boolean giftMatchNewTag;

    @ProtobufIndex(index = 12)
    public double giftReceivedTime;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String giftType;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f59id;

    @NonNull
    public String name;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public GiftUser otherUser;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public GiftUser owner;

    @ProtobufIndex(index = Conversation.SURPRISE_LEVEL_TOP)
    public double revenue;

    @ProtobufIndex(index = 9)
    public double share;

    @NonNull
    @ProtobufIndex(index = 8)
    public GiftStatus status;

    @ProtobufIndex(index = 7)
    public int total;

    @NonNull
    public String unit;

    @ProtobufIndex(index = 6)
    public double unitPrice;
    public static ProtobufAdapter<GiftRecord> PROTOBUF_ADAPTER = new MessageNanoAdapter<GiftRecord>() { // from class: com.p1.mobile.putong.core.data.GiftRecord.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(GiftRecord giftRecord) {
            String str = giftRecord.f59id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            GiftUser giftUser = giftRecord.owner;
            if (giftUser != null) {
                iO += CodedOutputByteBufferNano.l(2, giftUser, GiftUser.PROTOBUF_ADAPTER);
            }
            GiftUser giftUser2 = giftRecord.otherUser;
            if (giftUser2 != null) {
                iO += CodedOutputByteBufferNano.l(3, giftUser2, GiftUser.PROTOBUF_ADAPTER);
            }
            GiftAction giftAction = giftRecord.action;
            if (giftAction != null) {
                iO += CodedOutputByteBufferNano.h(4, giftAction.ordinal());
            }
            String str2 = giftRecord.giftType;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(5, str2);
            }
            int iD = iO + CodedOutputByteBufferNano.d(6, giftRecord.unitPrice) + CodedOutputByteBufferNano.h(7, giftRecord.total);
            GiftStatus giftStatus = giftRecord.status;
            if (giftStatus != null) {
                iD += CodedOutputByteBufferNano.h(8, giftStatus.ordinal());
            }
            int iD2 = iD + CodedOutputByteBufferNano.d(9, giftRecord.share) + CodedOutputByteBufferNano.d(10, giftRecord.revenue) + CodedOutputByteBufferNano.d(11, giftRecord.giftGivenTime) + CodedOutputByteBufferNano.d(12, giftRecord.giftReceivedTime);
            List<GiftDetail> list = giftRecord.details;
            if (list != null) {
                iD2 += CodedOutputByteBufferNano.l(13, list, GiftDetail.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            int iB = iD2 + CodedOutputByteBufferNano.b(14, giftRecord.giftMatchNewTag);
            GiftAction giftAction2 = giftRecord.action;
            if (giftAction2 != null) {
                iB += CodedOutputByteBufferNano.l(15, giftAction2, GiftAction.PROTOBUF_ADAPTER);
            }
            GiftStatus giftStatus2 = giftRecord.status;
            if (giftStatus2 != null) {
                iB += CodedOutputByteBufferNano.l(16, giftStatus2, GiftStatus.PROTOBUF_ADAPTER);
            }
            ((MessageNano) giftRecord).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public GiftRecord m12957parse(nb5 nb5Var) throws IOException {
            GiftRecord giftRecord = new GiftRecord();
            Integer numValueOf = null;
            Integer numValueOf2 = null;
            while (true) {
                switch (nb5Var.u()) {
                    case 0:
                        if (giftRecord.action == null && numValueOf != null) {
                            giftRecord.action = (GiftAction) GiftAction.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
                        }
                        if (giftRecord.status == null && numValueOf2 != null) {
                            giftRecord.status = (GiftStatus) GiftStatus.JSON_ADAPTER.newTEnum((String) null, numValueOf2.intValue());
                        }
                        if (giftRecord.f59id == null) {
                            giftRecord.f59id = "";
                        }
                        if (giftRecord.owner == null) {
                            giftRecord.owner = GiftUser.new_();
                        }
                        if (giftRecord.otherUser == null) {
                            giftRecord.otherUser = GiftUser.new_();
                        }
                        if (giftRecord.action == null) {
                            giftRecord.action = (GiftAction) GiftAction.JSON_ADAPTER.defaultEnum();
                        }
                        if (giftRecord.giftType == null) {
                            giftRecord.giftType = "";
                        }
                        if (giftRecord.status == null) {
                            giftRecord.status = (GiftStatus) GiftStatus.JSON_ADAPTER.defaultEnum();
                        }
                        if (giftRecord.details == null) {
                            giftRecord.details = new ArrayList();
                        }
                        if (giftRecord.name == null) {
                            giftRecord.name = "";
                        }
                        if (giftRecord.unit == null) {
                            giftRecord.unit = "";
                        }
                        break;
                    case Conversation.SURPRISE_LEVEL_TOP /* 10 */:
                        giftRecord.f59id = nb5Var.s();
                        continue;
                    case 18:
                        giftRecord.owner = (GiftUser) nb5Var.l(GiftUser.PROTOBUF_ADAPTER);
                        continue;
                    case 26:
                        giftRecord.otherUser = (GiftUser) nb5Var.l(GiftUser.PROTOBUF_ADAPTER);
                        continue;
                    case 32:
                        numValueOf = Integer.valueOf(nb5Var.j());
                        continue;
                    case 42:
                        giftRecord.giftType = nb5Var.s();
                        continue;
                    case 49:
                        giftRecord.unitPrice = nb5Var.h();
                        continue;
                    case 56:
                        giftRecord.total = nb5Var.j();
                        continue;
                    case 64:
                        numValueOf2 = Integer.valueOf(nb5Var.j());
                        continue;
                    case 73:
                        giftRecord.share = nb5Var.h();
                        continue;
                    case 81:
                        giftRecord.revenue = nb5Var.h();
                        continue;
                    case 89:
                        giftRecord.giftGivenTime = nb5Var.h();
                        continue;
                    case 97:
                        giftRecord.giftReceivedTime = nb5Var.h();
                        continue;
                    case 106:
                        giftRecord.details = (List) nb5Var.l(GiftDetail.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 112:
                        giftRecord.giftMatchNewTag = nb5Var.g();
                        continue;
                    case 122:
                        giftRecord.action = (GiftAction) nb5Var.l(GiftAction.PROTOBUF_ADAPTER);
                        continue;
                    case 130:
                        giftRecord.status = (GiftStatus) nb5Var.l(GiftStatus.PROTOBUF_ADAPTER);
                        continue;
                    default:
                        if (giftRecord.action == null && numValueOf != null) {
                            giftRecord.action = (GiftAction) GiftAction.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
                        }
                        if (giftRecord.status == null && numValueOf2 != null) {
                            giftRecord.status = (GiftStatus) GiftStatus.JSON_ADAPTER.newTEnum((String) null, numValueOf2.intValue());
                        }
                        if (giftRecord.f59id == null) {
                            giftRecord.f59id = "";
                        }
                        if (giftRecord.owner == null) {
                            giftRecord.owner = GiftUser.new_();
                        }
                        if (giftRecord.otherUser == null) {
                            giftRecord.otherUser = GiftUser.new_();
                        }
                        if (giftRecord.action == null) {
                            giftRecord.action = (GiftAction) GiftAction.JSON_ADAPTER.defaultEnum();
                        }
                        if (giftRecord.giftType == null) {
                            giftRecord.giftType = "";
                        }
                        if (giftRecord.status == null) {
                            giftRecord.status = (GiftStatus) GiftStatus.JSON_ADAPTER.defaultEnum();
                        }
                        if (giftRecord.details == null) {
                            giftRecord.details = new ArrayList();
                        }
                        if (giftRecord.name == null) {
                            giftRecord.name = "";
                        }
                        if (giftRecord.unit == null) {
                            giftRecord.unit = "";
                            return giftRecord;
                        }
                        break;
                }
            }
            return giftRecord;
        }

        public void serialize(GiftRecord giftRecord, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = giftRecord.f59id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            GiftUser giftUser = giftRecord.owner;
            if (giftUser != null) {
                codedOutputByteBufferNano.K(2, giftUser, GiftUser.PROTOBUF_ADAPTER);
            }
            GiftUser giftUser2 = giftRecord.otherUser;
            if (giftUser2 != null) {
                codedOutputByteBufferNano.K(3, giftUser2, GiftUser.PROTOBUF_ADAPTER);
            }
            GiftAction giftAction = giftRecord.action;
            if (giftAction != null) {
                codedOutputByteBufferNano.G(4, giftAction.ordinal());
            }
            String str2 = giftRecord.giftType;
            if (str2 != null) {
                codedOutputByteBufferNano.R(5, str2);
            }
            codedOutputByteBufferNano.C(6, giftRecord.unitPrice);
            codedOutputByteBufferNano.G(7, giftRecord.total);
            GiftStatus giftStatus = giftRecord.status;
            if (giftStatus != null) {
                codedOutputByteBufferNano.G(8, giftStatus.ordinal());
            }
            codedOutputByteBufferNano.C(9, giftRecord.share);
            codedOutputByteBufferNano.C(10, giftRecord.revenue);
            codedOutputByteBufferNano.C(11, giftRecord.giftGivenTime);
            codedOutputByteBufferNano.C(12, giftRecord.giftReceivedTime);
            List<GiftDetail> list = giftRecord.details;
            if (list != null) {
                codedOutputByteBufferNano.K(13, list, GiftDetail.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.A(14, giftRecord.giftMatchNewTag);
            GiftAction giftAction2 = giftRecord.action;
            if (giftAction2 != null) {
                codedOutputByteBufferNano.K(15, giftAction2, GiftAction.PROTOBUF_ADAPTER);
            }
            GiftStatus giftStatus2 = giftRecord.status;
            if (giftStatus2 != null) {
                codedOutputByteBufferNano.K(16, giftStatus2, GiftStatus.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<GiftRecord> JSON_ADAPTER = new ObjectJsonAdapter<GiftRecord>() { // from class: com.p1.mobile.putong.core.data.GiftRecord.2
        public Class getDataClass() {
            return GiftRecord.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public GiftRecord m12958newInstance() {
            return new GiftRecord();
        }

        public boolean parseField(GiftRecord giftRecord, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "giftReceivedTime":
                    giftRecord.giftReceivedTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
                    return true;
                case "otherUser":
                    giftRecord.otherUser = (GiftUser) GiftUser.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "action":
                    giftRecord.action = (GiftAction) GiftAction.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "status":
                    giftRecord.status = (GiftStatus) GiftStatus.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "unitPrice":
                    giftRecord.unitPrice = jsonParser.getValueAsDouble();
                    return true;
                case "giftGivenTime":
                    giftRecord.giftGivenTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
                    return true;
                case "id":
                    giftRecord.f59id = jsonParser.getValueAsString();
                    return false;
                case "name":
                    giftRecord.name = jsonParser.getValueAsString();
                    return true;
                case "unit":
                    giftRecord.unit = jsonParser.getValueAsString();
                    return true;
                case "owner":
                    giftRecord.owner = (GiftUser) GiftUser.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "share":
                    giftRecord.share = jsonParser.getValueAsDouble();
                    return true;
                case "total":
                    giftRecord.total = jsonParser.getValueAsInt();
                    return true;
                case "giftMatchNewTag":
                    giftRecord.giftMatchNewTag = jsonParser.getValueAsBoolean();
                    return true;
                case "giftType":
                    giftRecord.giftType = jsonParser.getValueAsString();
                    return true;
                case "revenue":
                    giftRecord.revenue = jsonParser.getValueAsDouble();
                    return true;
                case "details":
                    giftRecord.details = JsonAdapter.parseArray(jsonParser, GiftDetail.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(GiftRecord giftRecord, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "giftReceivedTime":
                case "otherUser":
                case "action":
                case "status":
                case "unitPrice":
                case "giftGivenTime":
                    return true;
                case "id":
                    return false;
                case "name":
                case "unit":
                case "owner":
                case "share":
                case "total":
                case "giftMatchNewTag":
                case "giftType":
                case "revenue":
                case "details":
                    return true;
                default:
                    return super.parseFieldCheck(giftRecord, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(GiftRecord giftRecord, JsonGenerator jsonGenerator) throws IOException {
            String str = giftRecord.f59id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (giftRecord.owner != null) {
                jsonGenerator.writeFieldName("owner");
                GiftUser.JSON_ADAPTER.serialize(giftRecord.owner, jsonGenerator, true);
            }
            if (giftRecord.otherUser != null) {
                jsonGenerator.writeFieldName("otherUser");
                GiftUser.JSON_ADAPTER.serialize(giftRecord.otherUser, jsonGenerator, true);
            }
            if (giftRecord.action != null) {
                jsonGenerator.writeFieldName("action");
                GiftAction.JSON_ADAPTER.serialize(giftRecord.action, jsonGenerator, true);
            }
            String str2 = giftRecord.giftType;
            if (str2 != null) {
                jsonGenerator.writeStringField("giftType", str2);
            }
            jsonGenerator.writeNumberField("unitPrice", giftRecord.unitPrice);
            jsonGenerator.writeNumberField("total", giftRecord.total);
            if (giftRecord.status != null) {
                jsonGenerator.writeFieldName("status");
                GiftStatus.JSON_ADAPTER.serialize(giftRecord.status, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("share", giftRecord.share);
            jsonGenerator.writeNumberField("revenue", giftRecord.revenue);
            jsonGenerator.writeFieldName("giftGivenTime");
            JsonAdapter jsonAdapter = Converter.API_TIME;
            jsonAdapter.serialize(Double.valueOf(giftRecord.giftGivenTime), jsonGenerator, true);
            jsonGenerator.writeFieldName("giftReceivedTime");
            jsonAdapter.serialize(Double.valueOf(giftRecord.giftReceivedTime), jsonGenerator, true);
            if (giftRecord.details != null) {
                jsonGenerator.writeFieldName("details");
                JsonAdapter.serializeArray(giftRecord.details, jsonGenerator, GiftDetail.JSON_ADAPTER);
            }
            jsonGenerator.writeBooleanField("giftMatchNewTag", giftRecord.giftMatchNewTag);
            String str3 = giftRecord.name;
            if (str3 != null) {
                jsonGenerator.writeStringField("name", str3);
            }
            String str4 = giftRecord.unit;
            if (str4 != null) {
                jsonGenerator.writeStringField("unit", str4);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GiftRecord) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GiftRecord) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GiftRecord new_() {
        GiftRecord giftRecord = new GiftRecord();
        giftRecord.nullCheck();
        return giftRecord;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public GiftRecord m12956clone() {
        GiftRecord giftRecord = new GiftRecord();
        giftRecord.f59id = this.f59id;
        GiftUser giftUser = this.owner;
        if (giftUser != null) {
            giftRecord.owner = giftUser.m12964clone();
        }
        GiftUser giftUser2 = this.otherUser;
        if (giftUser2 != null) {
            giftRecord.otherUser = giftUser2.m12964clone();
        }
        giftRecord.action = this.action;
        giftRecord.giftType = this.giftType;
        giftRecord.unitPrice = this.unitPrice;
        giftRecord.total = this.total;
        giftRecord.status = this.status;
        giftRecord.share = this.share;
        giftRecord.revenue = this.revenue;
        giftRecord.giftGivenTime = this.giftGivenTime;
        giftRecord.giftReceivedTime = this.giftReceivedTime;
        List<GiftDetail> list = this.details;
        if (list != null) {
            giftRecord.details = ValueObject.util_map(list, new w9j() { // from class: l.juj
                public final Object call(Object obj) {
                    return ((GiftDetail) obj).m12934clone();
                }
            });
        }
        giftRecord.giftMatchNewTag = this.giftMatchNewTag;
        giftRecord.name = this.name;
        giftRecord.unit = this.unit;
        return giftRecord;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GiftRecord)) {
            return false;
        }
        GiftRecord giftRecord = (GiftRecord) obj;
        return ValueObject.util_equals(this.f59id, giftRecord.f59id) && ValueObject.util_equals(this.owner, giftRecord.owner) && ValueObject.util_equals(this.otherUser, giftRecord.otherUser) && ValueObject.util_equals(this.action, giftRecord.action) && ValueObject.util_equals(this.giftType, giftRecord.giftType) && this.unitPrice == giftRecord.unitPrice && this.total == giftRecord.total && ValueObject.util_equals(this.status, giftRecord.status) && this.share == giftRecord.share && this.revenue == giftRecord.revenue && this.giftGivenTime == giftRecord.giftGivenTime && this.giftReceivedTime == giftRecord.giftReceivedTime && ValueObject.util_equals(this.details, giftRecord.details) && this.giftMatchNewTag == giftRecord.giftMatchNewTag && ValueObject.util_equals(this.name, giftRecord.name) && ValueObject.util_equals(this.unit, giftRecord.unit);
    }

    public String getClassParseName() {
        return "gift";
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.f59id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        GiftUser giftUser = this.owner;
        int iHashCode2 = (iHashCode + (giftUser != null ? giftUser.hashCode() : 0)) * 41;
        GiftUser giftUser2 = this.otherUser;
        int iHashCode3 = (iHashCode2 + (giftUser2 != null ? giftUser2.hashCode() : 0)) * 41;
        GiftAction giftAction = this.action;
        int iHashCode4 = (iHashCode3 + (giftAction != null ? giftAction.hashCode() : 0)) * 41;
        String str2 = this.giftType;
        int iHashCode5 = str2 != null ? str2.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.unitPrice);
        int i3 = (((((iHashCode4 + iHashCode5) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41) + this.total) * 41;
        GiftStatus giftStatus = this.status;
        int iHashCode6 = i3 + (giftStatus != null ? giftStatus.hashCode() : 0);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.share);
        int i4 = (iHashCode6 * 41) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.revenue);
        int i5 = (i4 * 41) + ((int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32)));
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.giftGivenTime);
        int i6 = (i5 * 41) + ((int) (jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32)));
        long jDoubleToLongBits5 = Double.doubleToLongBits(this.giftReceivedTime);
        int i7 = ((i6 * 41) + ((int) (jDoubleToLongBits5 ^ (jDoubleToLongBits5 >>> 32)))) * 41;
        List<GiftDetail> list = this.details;
        int iHashCode7 = (((i7 + (list != null ? list.hashCode() : 0)) * 41) + (this.giftMatchNewTag ? 1231 : 1237)) * 41;
        String str3 = this.name;
        int iHashCode8 = (iHashCode7 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.unit;
        int iHashCode9 = iHashCode8 + (str4 != null ? str4.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode9;
        return iHashCode9;
    }

    public void nullCheck() {
        if (this.f59id == null) {
            this.f59id = "";
        }
        if (this.owner == null) {
            this.owner = GiftUser.new_();
        }
        if (this.otherUser == null) {
            this.otherUser = GiftUser.new_();
        }
        if (this.action == null) {
            this.action = (GiftAction) GiftAction.JSON_ADAPTER.defaultEnum();
        }
        if (this.giftType == null) {
            this.giftType = "";
        }
        if (this.status == null) {
            this.status = (GiftStatus) GiftStatus.JSON_ADAPTER.defaultEnum();
        }
        if (this.details == null) {
            this.details = new ArrayList();
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.unit == null) {
            this.unit = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
