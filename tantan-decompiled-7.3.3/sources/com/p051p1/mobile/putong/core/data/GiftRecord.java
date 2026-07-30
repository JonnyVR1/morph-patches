package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.GiftDetail;
import com.p051p1.mobile.putong.data.Converter;
import com.p051p1.mobile.putong.data.Owner;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.asn1.eac.EACTags;
import org.spongycastle.i18n.ErrorBundle;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes10.dex */
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
    @ProtobufIndex(index = 5)
    public String giftType;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f21139id;

    @NonNull
    public String name;

    @NonNull
    @ProtobufIndex(index = 3)
    public GiftUser otherUser;

    @NonNull
    @ProtobufIndex(index = 2)
    public GiftUser owner;

    @ProtobufIndex(index = 10)
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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(GiftRecord giftRecord) {
            String str = giftRecord.f21139id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            GiftUser giftUser = giftRecord.owner;
            if (giftUser != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(2, giftUser, GiftUser.PROTOBUF_ADAPTER);
            }
            GiftUser giftUser2 = giftRecord.otherUser;
            if (giftUser2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(3, giftUser2, GiftUser.PROTOBUF_ADAPTER);
            }
            GiftAction giftAction = giftRecord.action;
            if (giftAction != null) {
                iM17288o += CodedOutputByteBufferNano.m17281h(4, giftAction.ordinal());
            }
            String str2 = giftRecord.giftType;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(5, str2);
            }
            int iM17277d = iM17288o + CodedOutputByteBufferNano.m17277d(6, giftRecord.unitPrice) + CodedOutputByteBufferNano.m17281h(7, giftRecord.total);
            GiftStatus giftStatus = giftRecord.status;
            if (giftStatus != null) {
                iM17277d += CodedOutputByteBufferNano.m17281h(8, giftStatus.ordinal());
            }
            int iM17277d2 = iM17277d + CodedOutputByteBufferNano.m17277d(9, giftRecord.share) + CodedOutputByteBufferNano.m17277d(10, giftRecord.revenue) + CodedOutputByteBufferNano.m17277d(11, giftRecord.giftGivenTime) + CodedOutputByteBufferNano.m17277d(12, giftRecord.giftReceivedTime);
            List<GiftDetail> list = giftRecord.details;
            if (list != null) {
                iM17277d2 += CodedOutputByteBufferNano.m17285l(13, list, GiftDetail.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            int iM17275b = iM17277d2 + CodedOutputByteBufferNano.m17275b(14, giftRecord.giftMatchNewTag);
            GiftAction giftAction2 = giftRecord.action;
            if (giftAction2 != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(15, giftAction2, GiftAction.PROTOBUF_ADAPTER);
            }
            GiftStatus giftStatus2 = giftRecord.status;
            if (giftStatus2 != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(16, giftStatus2, GiftStatus.PROTOBUF_ADAPTER);
            }
            giftRecord.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GiftRecord parse(nc5 nc5Var) throws IOException {
            GiftRecord giftRecord = new GiftRecord();
            Integer numValueOf = null;
            Integer numValueOf2 = null;
            while (true) {
                switch (nc5Var.m162497u()) {
                    case 0:
                        if (giftRecord.action == null && numValueOf != null) {
                            giftRecord.action = (GiftAction) GiftAction.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (giftRecord.status == null && numValueOf2 != null) {
                            giftRecord.status = (GiftStatus) GiftStatus.JSON_ADAPTER.newTEnum(null, numValueOf2.intValue());
                        }
                        if (giftRecord.f21139id == null) {
                            giftRecord.f21139id = "";
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
                    case 10:
                        giftRecord.f21139id = nc5Var.m162495s();
                        continue;
                    case 18:
                        giftRecord.owner = (GiftUser) nc5Var.m162488l(GiftUser.PROTOBUF_ADAPTER);
                        continue;
                    case 26:
                        giftRecord.otherUser = (GiftUser) nc5Var.m162488l(GiftUser.PROTOBUF_ADAPTER);
                        continue;
                    case 32:
                        numValueOf = Integer.valueOf(nc5Var.m162486j());
                        continue;
                    case 42:
                        giftRecord.giftType = nc5Var.m162495s();
                        continue;
                    case 49:
                        giftRecord.unitPrice = nc5Var.m162484h();
                        continue;
                    case 56:
                        giftRecord.total = nc5Var.m162486j();
                        continue;
                    case 64:
                        numValueOf2 = Integer.valueOf(nc5Var.m162486j());
                        continue;
                    case EACTags.CARDHOLDER_PUBLIC_KEY_TEMPLATE /* 73 */:
                        giftRecord.share = nc5Var.m162484h();
                        continue;
                    case EACTags.FILE_REFERENCE /* 81 */:
                        giftRecord.revenue = nc5Var.m162484h();
                        continue;
                    case 89:
                        giftRecord.giftGivenTime = nc5Var.m162484h();
                        continue;
                    case EACTags.APPLICATION_TEMPLATE /* 97 */:
                        giftRecord.giftReceivedTime = nc5Var.m162484h();
                        continue;
                    case 106:
                        giftRecord.details = (List) nc5Var.m162488l(GiftDetail.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 112:
                        giftRecord.giftMatchNewTag = nc5Var.m162483g();
                        continue;
                    case 122:
                        giftRecord.action = (GiftAction) nc5Var.m162488l(GiftAction.PROTOBUF_ADAPTER);
                        continue;
                    case 130:
                        giftRecord.status = (GiftStatus) nc5Var.m162488l(GiftStatus.PROTOBUF_ADAPTER);
                        continue;
                    default:
                        if (giftRecord.action == null && numValueOf != null) {
                            giftRecord.action = (GiftAction) GiftAction.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (giftRecord.status == null && numValueOf2 != null) {
                            giftRecord.status = (GiftStatus) GiftStatus.JSON_ADAPTER.newTEnum(null, numValueOf2.intValue());
                        }
                        if (giftRecord.f21139id == null) {
                            giftRecord.f21139id = "";
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

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GiftRecord giftRecord, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = giftRecord.f21139id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            GiftUser giftUser = giftRecord.owner;
            if (giftUser != null) {
                codedOutputByteBufferNano.m17309K(2, giftUser, GiftUser.PROTOBUF_ADAPTER);
            }
            GiftUser giftUser2 = giftRecord.otherUser;
            if (giftUser2 != null) {
                codedOutputByteBufferNano.m17309K(3, giftUser2, GiftUser.PROTOBUF_ADAPTER);
            }
            GiftAction giftAction = giftRecord.action;
            if (giftAction != null) {
                codedOutputByteBufferNano.m17305G(4, giftAction.ordinal());
            }
            String str2 = giftRecord.giftType;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(5, str2);
            }
            codedOutputByteBufferNano.m17301C(6, giftRecord.unitPrice);
            codedOutputByteBufferNano.m17305G(7, giftRecord.total);
            GiftStatus giftStatus = giftRecord.status;
            if (giftStatus != null) {
                codedOutputByteBufferNano.m17305G(8, giftStatus.ordinal());
            }
            codedOutputByteBufferNano.m17301C(9, giftRecord.share);
            codedOutputByteBufferNano.m17301C(10, giftRecord.revenue);
            codedOutputByteBufferNano.m17301C(11, giftRecord.giftGivenTime);
            codedOutputByteBufferNano.m17301C(12, giftRecord.giftReceivedTime);
            List<GiftDetail> list = giftRecord.details;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(13, list, GiftDetail.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17299A(14, giftRecord.giftMatchNewTag);
            GiftAction giftAction2 = giftRecord.action;
            if (giftAction2 != null) {
                codedOutputByteBufferNano.m17309K(15, giftAction2, GiftAction.PROTOBUF_ADAPTER);
            }
            GiftStatus giftStatus2 = giftRecord.status;
            if (giftStatus2 != null) {
                codedOutputByteBufferNano.m17309K(16, giftStatus2, GiftStatus.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<GiftRecord> JSON_ADAPTER = new ObjectJsonAdapter<GiftRecord>() { // from class: com.p1.mobile.putong.core.data.GiftRecord.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GiftRecord.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public GiftRecord newInstance() {
            return new GiftRecord();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(GiftRecord giftRecord, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1972286050:
                    if (str.equals("giftReceivedTime")) {
                        b = 0;
                    }
                    break;
                case -1945839877:
                    if (str.equals("otherUser")) {
                        b = 1;
                    }
                    break;
                case -1422950858:
                    if (str.equals("action")) {
                        b = 2;
                    }
                    break;
                case -892481550:
                    if (str.equals(NotificationCompat.CATEGORY_STATUS)) {
                        b = 3;
                    }
                    break;
                case -486196699:
                    if (str.equals("unitPrice")) {
                        b = 4;
                    }
                    break;
                case -234896230:
                    if (str.equals("giftGivenTime")) {
                        b = 5;
                    }
                    break;
                case 3355:
                    if (str.equals("id")) {
                        b = 6;
                    }
                    break;
                case 3373707:
                    if (str.equals(AuthenticationTokenClaims.JSON_KEY_NAME)) {
                        b = 7;
                    }
                    break;
                case 3594628:
                    if (str.equals("unit")) {
                        b = 8;
                    }
                    break;
                case 106164915:
                    if (str.equals(Owner.TYPE)) {
                        b = 9;
                    }
                    break;
                case 109400031:
                    if (str.equals("share")) {
                        b = 10;
                    }
                    break;
                case 110549828:
                    if (str.equals("total")) {
                        b = 11;
                    }
                    break;
                case 202373295:
                    if (str.equals("giftMatchNewTag")) {
                        b = 12;
                    }
                    break;
                case 849368202:
                    if (str.equals("giftType")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 1099842588:
                    if (str.equals("revenue")) {
                        b = 14;
                    }
                    break;
                case 1557721666:
                    if (str.equals(ErrorBundle.DETAIL_ENTRY)) {
                        b = 15;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    giftRecord.giftReceivedTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case 1:
                    giftRecord.otherUser = GiftUser.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 2:
                    giftRecord.action = GiftAction.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case 3:
                    giftRecord.status = GiftStatus.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case 4:
                    giftRecord.unitPrice = jsonParser.getValueAsDouble();
                    return true;
                case 5:
                    giftRecord.giftGivenTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case 6:
                    giftRecord.f21139id = jsonParser.getValueAsString();
                    return false;
                case 7:
                    giftRecord.name = jsonParser.getValueAsString();
                    return true;
                case 8:
                    giftRecord.unit = jsonParser.getValueAsString();
                    return true;
                case 9:
                    giftRecord.owner = GiftUser.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case 10:
                    giftRecord.share = jsonParser.getValueAsDouble();
                    return true;
                case 11:
                    giftRecord.total = jsonParser.getValueAsInt();
                    return true;
                case 12:
                    giftRecord.giftMatchNewTag = jsonParser.getValueAsBoolean();
                    return true;
                case 13:
                    giftRecord.giftType = jsonParser.getValueAsString();
                    return true;
                case 14:
                    giftRecord.revenue = jsonParser.getValueAsDouble();
                    return true;
                case 15:
                    giftRecord.details = JsonAdapter.parseArray(jsonParser, GiftDetail.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseFieldCheck(GiftRecord giftRecord, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1972286050:
                    if (str.equals("giftReceivedTime")) {
                        b = 0;
                    }
                    break;
                case -1945839877:
                    if (str.equals("otherUser")) {
                        b = 1;
                    }
                    break;
                case -1422950858:
                    if (str.equals("action")) {
                        b = 2;
                    }
                    break;
                case -892481550:
                    if (str.equals(NotificationCompat.CATEGORY_STATUS)) {
                        b = 3;
                    }
                    break;
                case -486196699:
                    if (str.equals("unitPrice")) {
                        b = 4;
                    }
                    break;
                case -234896230:
                    if (str.equals("giftGivenTime")) {
                        b = 5;
                    }
                    break;
                case 3355:
                    if (str.equals("id")) {
                        b = 6;
                    }
                    break;
                case 3373707:
                    if (str.equals(AuthenticationTokenClaims.JSON_KEY_NAME)) {
                        b = 7;
                    }
                    break;
                case 3594628:
                    if (str.equals("unit")) {
                        b = 8;
                    }
                    break;
                case 106164915:
                    if (str.equals(Owner.TYPE)) {
                        b = 9;
                    }
                    break;
                case 109400031:
                    if (str.equals("share")) {
                        b = 10;
                    }
                    break;
                case 110549828:
                    if (str.equals("total")) {
                        b = 11;
                    }
                    break;
                case 202373295:
                    if (str.equals("giftMatchNewTag")) {
                        b = 12;
                    }
                    break;
                case 849368202:
                    if (str.equals("giftType")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 1099842588:
                    if (str.equals("revenue")) {
                        b = 14;
                    }
                    break;
                case 1557721666:
                    if (str.equals(ErrorBundle.DETAIL_ENTRY)) {
                        b = 15;
                    }
                    break;
            }
            switch (b) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    return true;
                case 6:
                    return false;
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    return true;
                default:
                    return super.parseFieldCheck(giftRecord, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GiftRecord giftRecord, JsonGenerator jsonGenerator) throws IOException {
            String str = giftRecord.f21139id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (giftRecord.owner != null) {
                jsonGenerator.writeFieldName(Owner.TYPE);
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
                jsonGenerator.writeFieldName(NotificationCompat.CATEGORY_STATUS);
                GiftStatus.JSON_ADAPTER.serialize(giftRecord.status, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("share", giftRecord.share);
            jsonGenerator.writeNumberField("revenue", giftRecord.revenue);
            jsonGenerator.writeFieldName("giftGivenTime");
            JsonAdapter<Double> jsonAdapter = Converter.API_TIME;
            jsonAdapter.serialize(Double.valueOf(giftRecord.giftGivenTime), jsonGenerator, true);
            jsonGenerator.writeFieldName("giftReceivedTime");
            jsonAdapter.serialize(Double.valueOf(giftRecord.giftReceivedTime), jsonGenerator, true);
            if (giftRecord.details != null) {
                jsonGenerator.writeFieldName(ErrorBundle.DETAIL_ENTRY);
                JsonAdapter.serializeArray(giftRecord.details, jsonGenerator, GiftDetail.JSON_ADAPTER);
            }
            jsonGenerator.writeBooleanField("giftMatchNewTag", giftRecord.giftMatchNewTag);
            String str3 = giftRecord.name;
            if (str3 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str3);
            }
            String str4 = giftRecord.unit;
            if (str4 != null) {
                jsonGenerator.writeStringField("unit", str4);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GiftRecord) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GiftRecord) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GiftRecord new_() {
        GiftRecord giftRecord = new GiftRecord();
        giftRecord.nullCheck();
        return giftRecord;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public GiftRecord mo225055clone() {
        GiftRecord giftRecord = new GiftRecord();
        giftRecord.f21139id = this.f21139id;
        GiftUser giftUser = this.owner;
        if (giftUser != null) {
            giftRecord.owner = giftUser.mo225055clone();
        }
        GiftUser giftUser2 = this.otherUser;
        if (giftUser2 != null) {
            giftRecord.otherUser = giftUser2.mo225055clone();
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
            giftRecord.details = ValueObject.util_map(list, new qcj() { // from class: l.zwj
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((GiftDetail) obj).mo225055clone();
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
        return ValueObject.util_equals(this.f21139id, giftRecord.f21139id) && ValueObject.util_equals(this.owner, giftRecord.owner) && ValueObject.util_equals(this.otherUser, giftRecord.otherUser) && ValueObject.util_equals(this.action, giftRecord.action) && ValueObject.util_equals(this.giftType, giftRecord.giftType) && this.unitPrice == giftRecord.unitPrice && this.total == giftRecord.total && ValueObject.util_equals(this.status, giftRecord.status) && this.share == giftRecord.share && this.revenue == giftRecord.revenue && this.giftGivenTime == giftRecord.giftGivenTime && this.giftReceivedTime == giftRecord.giftReceivedTime && ValueObject.util_equals(this.details, giftRecord.details) && this.giftMatchNewTag == giftRecord.giftMatchNewTag && ValueObject.util_equals(this.name, giftRecord.name) && ValueObject.util_equals(this.unit, giftRecord.unit);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "gift";
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.f21139id;
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
        this.hashCode = iHashCode9;
        return iHashCode9;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f21139id == null) {
            this.f21139id = "";
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
