package com.p000p1.mobile.putong.data;

import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p006ss.bytertc.audio.device.router.AudioRouteDeviceManager;
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
import l.qib0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
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
    public String f190id;

    @Nullable
    @ProtobufIndex(index = 3)
    public BroadcastStatus status;

    @Nullable
    @ProtobufIndex(index = 2)
    public BroadcastType type;
    public static ProtobufAdapter<Broadcast> PROTOBUF_ADAPTER = new MessageNanoAdapter<Broadcast>() { // from class: com.p1.mobile.putong.data.Broadcast.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Broadcast broadcast) {
            String str = broadcast.f190id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            BroadcastType broadcastType = broadcast.type;
            if (broadcastType != null) {
                iO += CodedOutputByteBufferNano.h(2, broadcastType.ordinal());
            }
            BroadcastStatus broadcastStatus = broadcast.status;
            if (broadcastStatus != null) {
                iO += CodedOutputByteBufferNano.h(3, broadcastStatus.ordinal());
            }
            int iB = iO + CodedOutputByteBufferNano.b(4, broadcast.active) + CodedOutputByteBufferNano.d(5, broadcast.expiresTime) + CodedOutputByteBufferNano.j(6, broadcast.duration);
            String str2 = broadcast.contentID;
            if (str2 != null) {
                iB += CodedOutputByteBufferNano.o(7, str2);
            }
            String str3 = broadcast.customContent;
            if (str3 != null) {
                iB += CodedOutputByteBufferNano.o(8, str3);
            }
            int iD = iB + CodedOutputByteBufferNano.d(9, broadcast.checkStartTime);
            BroadcastType broadcastType2 = broadcast.type;
            if (broadcastType2 != null) {
                iD += CodedOutputByteBufferNano.l(10, broadcastType2, BroadcastType.PROTOBUF_ADAPTER);
            }
            BroadcastStatus broadcastStatus2 = broadcast.status;
            if (broadcastStatus2 != null) {
                iD += CodedOutputByteBufferNano.l(11, broadcastStatus2, BroadcastStatus.PROTOBUF_ADAPTER);
            }
            ((MessageNano) broadcast).cachedSize = iD;
            return iD;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Broadcast m17781parse(nb5 nb5Var) throws IOException {
            Broadcast broadcast = new Broadcast();
            Integer numValueOf = null;
            Integer numValueOf2 = null;
            while (true) {
                switch (nb5Var.u()) {
                    case 0:
                        if (broadcast.type == null && numValueOf != null) {
                            broadcast.type = (BroadcastType) BroadcastType.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (broadcast.status == null && numValueOf2 != null) {
                            broadcast.status = (BroadcastStatus) BroadcastStatus.JSON_ADAPTER.newTEnum(null, numValueOf2.intValue());
                        }
                        break;
                    case 10:
                        broadcast.f190id = nb5Var.s();
                        continue;
                    case AudioRouteDeviceManager.RoutingDeviceType.BLUETOOTH_A2DP /* 16 */:
                        numValueOf = Integer.valueOf(nb5Var.j());
                        continue;
                    case 24:
                        numValueOf2 = Integer.valueOf(nb5Var.j());
                        continue;
                    case AudioRouteDeviceManager.RoutingDeviceType.USB_HEADSET /* 32 */:
                        broadcast.active = nb5Var.g();
                        continue;
                    case 41:
                        broadcast.expiresTime = nb5Var.h();
                        continue;
                    case 48:
                        broadcast.duration = nb5Var.k();
                        continue;
                    case 58:
                        broadcast.contentID = nb5Var.s();
                        continue;
                    case 66:
                        broadcast.customContent = nb5Var.s();
                        continue;
                    case 73:
                        broadcast.checkStartTime = nb5Var.h();
                        continue;
                    case 82:
                        broadcast.type = (BroadcastType) nb5Var.l(BroadcastType.PROTOBUF_ADAPTER);
                        continue;
                    case 90:
                        broadcast.status = (BroadcastStatus) nb5Var.l(BroadcastStatus.PROTOBUF_ADAPTER);
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

        public void serialize(Broadcast broadcast, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = broadcast.f190id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            BroadcastType broadcastType = broadcast.type;
            if (broadcastType != null) {
                codedOutputByteBufferNano.G(2, broadcastType.ordinal());
            }
            BroadcastStatus broadcastStatus = broadcast.status;
            if (broadcastStatus != null) {
                codedOutputByteBufferNano.G(3, broadcastStatus.ordinal());
            }
            codedOutputByteBufferNano.A(4, broadcast.active);
            codedOutputByteBufferNano.C(5, broadcast.expiresTime);
            codedOutputByteBufferNano.I(6, broadcast.duration);
            String str2 = broadcast.contentID;
            if (str2 != null) {
                codedOutputByteBufferNano.R(7, str2);
            }
            String str3 = broadcast.customContent;
            if (str3 != null) {
                codedOutputByteBufferNano.R(8, str3);
            }
            codedOutputByteBufferNano.C(9, broadcast.checkStartTime);
            BroadcastType broadcastType2 = broadcast.type;
            if (broadcastType2 != null) {
                codedOutputByteBufferNano.K(10, broadcastType2, BroadcastType.PROTOBUF_ADAPTER);
            }
            BroadcastStatus broadcastStatus2 = broadcast.status;
            if (broadcastStatus2 != null) {
                codedOutputByteBufferNano.K(11, broadcastStatus2, BroadcastStatus.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<Broadcast> JSON_ADAPTER = new ObjectJsonAdapter<Broadcast>() { // from class: com.p1.mobile.putong.data.Broadcast.2
        public Class getDataClass() {
            return Broadcast.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public Broadcast mo17830newInstance() {
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
                    broadcast.status = (BroadcastStatus) BroadcastStatus.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "contentID":
                    broadcast.contentID = jsonParser.getValueAsString();
                    return true;
                case "checkStartTime":
                    broadcast.checkStartTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
                    return true;
                case "expiresTime":
                    broadcast.expiresTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
                    return true;
                case "id":
                    broadcast.f190id = jsonParser.getValueAsString();
                    return false;
                case "type":
                    broadcast.type = (BroadcastType) BroadcastType.JSON_ADAPTER.parse(jsonParser, str2);
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Broadcast broadcast, JsonGenerator jsonGenerator) throws IOException {
            String str = broadcast.f190id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (broadcast.type != null) {
                jsonGenerator.writeFieldName("type");
                BroadcastType.JSON_ADAPTER.serialize(broadcast.type, jsonGenerator, true);
            }
            if (broadcast.status != null) {
                jsonGenerator.writeFieldName("status");
                BroadcastStatus.JSON_ADAPTER.serialize(broadcast.status, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("active", broadcast.active);
            jsonGenerator.writeFieldName("expiresTime");
            JsonAdapter<Double> jsonAdapter = Converter.API_TIME;
            jsonAdapter.serialize(Double.valueOf(broadcast.expiresTime), jsonGenerator, true);
            jsonGenerator.writeNumberField("duration", broadcast.duration);
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Broadcast) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Broadcast) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Broadcast new_() {
        Broadcast broadcast = new Broadcast();
        broadcast.nullCheck();
        return broadcast;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Broadcast m17780clone() {
        Broadcast broadcast = new Broadcast();
        broadcast.f190id = this.f190id;
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
        return ValueObject.util_equals(this.f190id, broadcast.f190id) && ValueObject.util_equals(this.type, broadcast.type) && ValueObject.util_equals(this.status, broadcast.status) && this.active == broadcast.active && this.expiresTime == broadcast.expiresTime && this.duration == broadcast.duration && ValueObject.util_equals(this.contentID, broadcast.contentID) && ValueObject.util_equals(this.customContent, broadcast.customContent) && this.checkStartTime == broadcast.checkStartTime;
    }

    public String getClassParseName() {
        return "broadcast";
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.f190id;
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
        ((ValueObject) this).hashCode = i6;
        return i6;
    }

    public boolean isInUse() {
        return this.expiresTime > ((double) qib0.H.guessedCurrentServerTime());
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
