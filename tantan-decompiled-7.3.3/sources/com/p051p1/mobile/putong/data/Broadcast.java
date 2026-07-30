package com.p051p1.mobile.putong.data;

import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.Active;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
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
import org.spongycastle.asn1.eac.EACTags;
import p153l.nc5;
import p153l.uqb0;

/* JADX INFO: loaded from: classes12.dex */
public class Broadcast extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "broadcast";

    @ProtobufIndex(index = 4)
    public boolean active;

    @ProtobufIndex(index = 9)
    public double checkStartTime;

    @Nullable
    @ProtobufIndex(index = 7)
    public String contentID;

    @Nullable
    @ProtobufIndex(index = 8)
    public String customContent;

    @ProtobufIndex(index = 6)
    public long duration;

    @ProtobufIndex(index = 5)
    public double expiresTime;

    /* JADX INFO: renamed from: id */
    @Nullable
    @ProtobufIndex(index = 1)
    public String f39577id;

    @Nullable
    @ProtobufIndex(index = 3)
    public BroadcastStatus status;

    @Nullable
    @ProtobufIndex(index = 2)
    public BroadcastType type;
    public static ProtobufAdapter<Broadcast> PROTOBUF_ADAPTER = new MessageNanoAdapter<Broadcast>() { // from class: com.p1.mobile.putong.data.Broadcast.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Broadcast broadcast) {
            String str = broadcast.f39577id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            BroadcastType broadcastType = broadcast.type;
            if (broadcastType != null) {
                iM17288o += CodedOutputByteBufferNano.m17281h(2, broadcastType.ordinal());
            }
            BroadcastStatus broadcastStatus = broadcast.status;
            if (broadcastStatus != null) {
                iM17288o += CodedOutputByteBufferNano.m17281h(3, broadcastStatus.ordinal());
            }
            int iM17275b = iM17288o + CodedOutputByteBufferNano.m17275b(4, broadcast.active) + CodedOutputByteBufferNano.m17277d(5, broadcast.expiresTime) + CodedOutputByteBufferNano.m17283j(6, broadcast.duration);
            String str2 = broadcast.contentID;
            if (str2 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(7, str2);
            }
            String str3 = broadcast.customContent;
            if (str3 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(8, str3);
            }
            int iM17277d = iM17275b + CodedOutputByteBufferNano.m17277d(9, broadcast.checkStartTime);
            BroadcastType broadcastType2 = broadcast.type;
            if (broadcastType2 != null) {
                iM17277d += CodedOutputByteBufferNano.m17285l(10, broadcastType2, BroadcastType.PROTOBUF_ADAPTER);
            }
            BroadcastStatus broadcastStatus2 = broadcast.status;
            if (broadcastStatus2 != null) {
                iM17277d += CodedOutputByteBufferNano.m17285l(11, broadcastStatus2, BroadcastStatus.PROTOBUF_ADAPTER);
            }
            broadcast.cachedSize = iM17277d;
            return iM17277d;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Broadcast parse(nc5 nc5Var) throws IOException {
            Broadcast broadcast = new Broadcast();
            Integer numValueOf = null;
            Integer numValueOf2 = null;
            while (true) {
                switch (nc5Var.m162497u()) {
                    case 0:
                        if (broadcast.type == null && numValueOf != null) {
                            broadcast.type = (BroadcastType) BroadcastType.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (broadcast.status == null && numValueOf2 != null) {
                            broadcast.status = (BroadcastStatus) BroadcastStatus.JSON_ADAPTER.newTEnum(null, numValueOf2.intValue());
                        }
                        break;
                    case 10:
                        broadcast.f39577id = nc5Var.m162495s();
                        continue;
                    case 16:
                        numValueOf = Integer.valueOf(nc5Var.m162486j());
                        continue;
                    case 24:
                        numValueOf2 = Integer.valueOf(nc5Var.m162486j());
                        continue;
                    case 32:
                        broadcast.active = nc5Var.m162483g();
                        continue;
                    case 41:
                        broadcast.expiresTime = nc5Var.m162484h();
                        continue;
                    case 48:
                        broadcast.duration = nc5Var.m162487k();
                        continue;
                    case 58:
                        broadcast.contentID = nc5Var.m162495s();
                        continue;
                    case 66:
                        broadcast.customContent = nc5Var.m162495s();
                        continue;
                    case EACTags.CARDHOLDER_PUBLIC_KEY_TEMPLATE /* 73 */:
                        broadcast.checkStartTime = nc5Var.m162484h();
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        broadcast.type = (BroadcastType) nc5Var.m162488l(BroadcastType.PROTOBUF_ADAPTER);
                        continue;
                    case 90:
                        broadcast.status = (BroadcastStatus) nc5Var.m162488l(BroadcastStatus.PROTOBUF_ADAPTER);
                        continue;
                    default:
                        if (broadcast.type == null && numValueOf != null) {
                            broadcast.type = (BroadcastType) BroadcastType.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (broadcast.status == null && numValueOf2 != null) {
                            broadcast.status = (BroadcastStatus) BroadcastStatus.JSON_ADAPTER.newTEnum(null, numValueOf2.intValue());
                            return broadcast;
                        }
                        break;
                }
            }
            return broadcast;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Broadcast broadcast, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = broadcast.f39577id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            BroadcastType broadcastType = broadcast.type;
            if (broadcastType != null) {
                codedOutputByteBufferNano.m17305G(2, broadcastType.ordinal());
            }
            BroadcastStatus broadcastStatus = broadcast.status;
            if (broadcastStatus != null) {
                codedOutputByteBufferNano.m17305G(3, broadcastStatus.ordinal());
            }
            codedOutputByteBufferNano.m17299A(4, broadcast.active);
            codedOutputByteBufferNano.m17301C(5, broadcast.expiresTime);
            codedOutputByteBufferNano.m17307I(6, broadcast.duration);
            String str2 = broadcast.contentID;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(7, str2);
            }
            String str3 = broadcast.customContent;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(8, str3);
            }
            codedOutputByteBufferNano.m17301C(9, broadcast.checkStartTime);
            BroadcastType broadcastType2 = broadcast.type;
            if (broadcastType2 != null) {
                codedOutputByteBufferNano.m17309K(10, broadcastType2, BroadcastType.PROTOBUF_ADAPTER);
            }
            BroadcastStatus broadcastStatus2 = broadcast.status;
            if (broadcastStatus2 != null) {
                codedOutputByteBufferNano.m17309K(11, broadcastStatus2, BroadcastStatus.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<Broadcast> JSON_ADAPTER = new ObjectJsonAdapter<Broadcast>() { // from class: com.p1.mobile.putong.data.Broadcast.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Broadcast.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Broadcast newInstance() {
            return new Broadcast();
        }

        public boolean parseField(Broadcast broadcast, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "duration":
                    broadcast.duration = jsonParser.getValueAsLong();
                    return true;
                case "active":
                    broadcast.active = jsonParser.getValueAsBoolean();
                    return true;
                case "status":
                    broadcast.status = BroadcastStatus.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "contentID":
                    broadcast.contentID = jsonParser.getValueAsString();
                    return true;
                case "checkStartTime":
                    broadcast.checkStartTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case "expiresTime":
                    broadcast.expiresTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case "id":
                    broadcast.f39577id = jsonParser.getValueAsString();
                    return false;
                case "type":
                    broadcast.type = BroadcastType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "customContent":
                    broadcast.customContent = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(Broadcast broadcast, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "duration":
                case "active":
                case "status":
                case "contentID":
                case "checkStartTime":
                case "expiresTime":
                    return true;
                case "id":
                    return false;
                case "type":
                case "customContent":
                    return true;
                default:
                    return super.parseFieldCheck(broadcast, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Broadcast broadcast, JsonGenerator jsonGenerator) throws IOException {
            String str = broadcast.f39577id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (broadcast.type != null) {
                jsonGenerator.writeFieldName("type");
                BroadcastType.JSON_ADAPTER.serialize(broadcast.type, jsonGenerator, true);
            }
            if (broadcast.status != null) {
                jsonGenerator.writeFieldName(NotificationCompat.CATEGORY_STATUS);
                BroadcastStatus.JSON_ADAPTER.serialize(broadcast.status, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField(Active.TYPE, broadcast.active);
            jsonGenerator.writeFieldName("expiresTime");
            JsonAdapter<Double> jsonAdapter = Converter.API_TIME;
            jsonAdapter.serialize(Double.valueOf(broadcast.expiresTime), jsonGenerator, true);
            jsonGenerator.writeNumberField(BLiveOperationTitleShowType.duration, broadcast.duration);
            String str2 = broadcast.contentID;
            if (str2 != null) {
                jsonGenerator.writeStringField("contentID", str2);
            }
            String str3 = broadcast.customContent;
            if (str3 != null) {
                jsonGenerator.writeStringField("customContent", str3);
            }
            jsonGenerator.writeFieldName("checkStartTime");
            jsonAdapter.serialize(Double.valueOf(broadcast.checkStartTime), jsonGenerator, true);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Broadcast) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Broadcast) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Broadcast new_() {
        Broadcast broadcast = new Broadcast();
        broadcast.nullCheck();
        return broadcast;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Broadcast mo225055clone() {
        Broadcast broadcast = new Broadcast();
        broadcast.f39577id = this.f39577id;
        broadcast.type = this.type;
        broadcast.status = this.status;
        broadcast.active = this.active;
        broadcast.expiresTime = this.expiresTime;
        broadcast.duration = this.duration;
        broadcast.contentID = this.contentID;
        broadcast.customContent = this.customContent;
        broadcast.checkStartTime = this.checkStartTime;
        return broadcast;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Broadcast)) {
            return false;
        }
        Broadcast broadcast = (Broadcast) obj;
        return ValueObject.util_equals(this.f39577id, broadcast.f39577id) && ValueObject.util_equals(this.type, broadcast.type) && ValueObject.util_equals(this.status, broadcast.status) && this.active == broadcast.active && this.expiresTime == broadcast.expiresTime && this.duration == broadcast.duration && ValueObject.util_equals(this.contentID, broadcast.contentID) && ValueObject.util_equals(this.customContent, broadcast.customContent) && this.checkStartTime == broadcast.checkStartTime;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "broadcast";
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.f39577id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        BroadcastType broadcastType = this.type;
        int iHashCode2 = (iHashCode + (broadcastType != null ? broadcastType.hashCode() : 0)) * 41;
        BroadcastStatus broadcastStatus = this.status;
        int iHashCode3 = (iHashCode2 + (broadcastStatus != null ? broadcastStatus.hashCode() : 0)) * 41;
        int i3 = this.active ? 1231 : 1237;
        long jDoubleToLongBits = Double.doubleToLongBits(this.expiresTime);
        int i4 = (((iHashCode3 + i3) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41;
        long j = this.duration;
        int i5 = (i4 + ((int) (j ^ (j >>> 32)))) * 41;
        String str2 = this.contentID;
        int iHashCode4 = (i5 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.customContent;
        int iHashCode5 = iHashCode4 + (str3 != null ? str3.hashCode() : 0);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.checkStartTime);
        int i6 = (iHashCode5 * 41) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
        this.hashCode = i6;
        return i6;
    }

    public boolean isInUse() {
        return this.expiresTime > ((double) uqb0.f180376H.guessedCurrentServerTime());
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
