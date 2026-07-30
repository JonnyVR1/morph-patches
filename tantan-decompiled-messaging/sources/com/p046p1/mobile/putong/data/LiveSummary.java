package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes12.dex */
public class LiveSummary extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "livesummary";

    @ProtobufIndex(index = 8)
    public double audienceCount;

    @ProtobufIndex(index = 4)
    public long duration;

    @ProtobufIndex(index = 10)
    public double endTime;

    @NonNull
    @ProtobufIndex(index = 1)
    public String liveId;

    @ProtobufIndex(index = 3)
    public long liveOrder;

    @ProtobufIndex(index = 7)
    public double newFollowCount;

    @ProtobufIndex(index = 5)
    public double rewardPoint;

    @ProtobufIndex(index = 6)
    public double rewarderCount;

    @NonNull
    @ProtobufIndex(index = 2)
    public String roomId;

    @ProtobufIndex(index = 9)
    public double startTime;

    @NonNull
    @ProtobufIndex(index = 11)
    public String type;
    public static ProtobufAdapter<LiveSummary> PROTOBUF_ADAPTER = new MessageNanoAdapter<LiveSummary>() { // from class: com.p1.mobile.putong.data.LiveSummary.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LiveSummary liveSummary) {
            String str = liveSummary.liveId;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = liveSummary.roomId;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            int iM17228j = iM17233o + CodedOutputByteBufferNano.m17228j(3, liveSummary.liveOrder) + CodedOutputByteBufferNano.m17228j(4, liveSummary.duration) + CodedOutputByteBufferNano.m17222d(5, liveSummary.rewardPoint) + CodedOutputByteBufferNano.m17222d(6, liveSummary.rewarderCount) + CodedOutputByteBufferNano.m17222d(7, liveSummary.newFollowCount) + CodedOutputByteBufferNano.m17222d(8, liveSummary.audienceCount) + CodedOutputByteBufferNano.m17222d(9, liveSummary.startTime) + CodedOutputByteBufferNano.m17222d(10, liveSummary.endTime);
            String str3 = liveSummary.type;
            if (str3 != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(11, str3);
            }
            liveSummary.cachedSize = iM17228j;
            return iM17228j;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LiveSummary parse(nb5 nb5Var) throws IOException {
            LiveSummary liveSummary = new LiveSummary();
            while (true) {
                switch (nb5Var.m158752u()) {
                    case 0:
                        if (liveSummary.liveId == null) {
                            liveSummary.liveId = "";
                        }
                        if (liveSummary.roomId == null) {
                            liveSummary.roomId = "";
                        }
                        if (liveSummary.type == null) {
                            liveSummary.type = "";
                        }
                        break;
                    case 10:
                        liveSummary.liveId = nb5Var.m158750s();
                        continue;
                    case 18:
                        liveSummary.roomId = nb5Var.m158750s();
                        continue;
                    case 24:
                        liveSummary.liveOrder = nb5Var.m158742k();
                        continue;
                    case 32:
                        liveSummary.duration = nb5Var.m158742k();
                        continue;
                    case 41:
                        liveSummary.rewardPoint = nb5Var.m158739h();
                        continue;
                    case 49:
                        liveSummary.rewarderCount = nb5Var.m158739h();
                        continue;
                    case 57:
                        liveSummary.newFollowCount = nb5Var.m158739h();
                        continue;
                    case 65:
                        liveSummary.audienceCount = nb5Var.m158739h();
                        continue;
                    case EACTags.CARDHOLDER_PUBLIC_KEY_TEMPLATE /* 73 */:
                        liveSummary.startTime = nb5Var.m158739h();
                        continue;
                    case EACTags.FILE_REFERENCE /* 81 */:
                        liveSummary.endTime = nb5Var.m158739h();
                        continue;
                    case 90:
                        liveSummary.type = nb5Var.m158750s();
                        continue;
                    default:
                        if (liveSummary.liveId == null) {
                            liveSummary.liveId = "";
                        }
                        if (liveSummary.roomId == null) {
                            liveSummary.roomId = "";
                        }
                        if (liveSummary.type == null) {
                            liveSummary.type = "";
                            return liveSummary;
                        }
                        break;
                }
            }
            return liveSummary;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LiveSummary liveSummary, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = liveSummary.liveId;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = liveSummary.roomId;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            codedOutputByteBufferNano.m17252I(3, liveSummary.liveOrder);
            codedOutputByteBufferNano.m17252I(4, liveSummary.duration);
            codedOutputByteBufferNano.m17246C(5, liveSummary.rewardPoint);
            codedOutputByteBufferNano.m17246C(6, liveSummary.rewarderCount);
            codedOutputByteBufferNano.m17246C(7, liveSummary.newFollowCount);
            codedOutputByteBufferNano.m17246C(8, liveSummary.audienceCount);
            codedOutputByteBufferNano.m17246C(9, liveSummary.startTime);
            codedOutputByteBufferNano.m17246C(10, liveSummary.endTime);
            String str3 = liveSummary.type;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(11, str3);
            }
        }
    };
    public static JsonAdapter<LiveSummary> JSON_ADAPTER = new ObjectJsonAdapter<LiveSummary>() { // from class: com.p1.mobile.putong.data.LiveSummary.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LiveSummary.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LiveSummary newInstance() {
            return new LiveSummary();
        }

        public boolean parseField(LiveSummary liveSummary, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "startTime":
                    liveSummary.startTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case "audienceCount":
                    liveSummary.audienceCount = jsonParser.getValueAsDouble();
                    return true;
                case "duration":
                    liveSummary.duration = jsonParser.getValueAsLong();
                    return true;
                case "endTime":
                    liveSummary.endTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case "liveId":
                    liveSummary.liveId = jsonParser.getValueAsString();
                    return true;
                case "roomId":
                    liveSummary.roomId = jsonParser.getValueAsString();
                    return true;
                case "type":
                    liveSummary.type = jsonParser.getValueAsString();
                    return true;
                case "rewardPoint":
                    liveSummary.rewardPoint = jsonParser.getValueAsDouble();
                    return true;
                case "liveOrder":
                    liveSummary.liveOrder = jsonParser.getValueAsLong();
                    return true;
                case "rewarderCount":
                    liveSummary.rewarderCount = jsonParser.getValueAsDouble();
                    return true;
                case "newFollowCount":
                    liveSummary.newFollowCount = jsonParser.getValueAsDouble();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(LiveSummary liveSummary, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "startTime":
                case "audienceCount":
                case "duration":
                case "endTime":
                case "liveId":
                case "roomId":
                case "type":
                case "rewardPoint":
                case "liveOrder":
                case "rewarderCount":
                case "newFollowCount":
                    return true;
                default:
                    return super.parseFieldCheck(liveSummary, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LiveSummary liveSummary, JsonGenerator jsonGenerator) throws IOException {
            String str = liveSummary.liveId;
            if (str != null) {
                jsonGenerator.writeStringField("liveId", str);
            }
            String str2 = liveSummary.roomId;
            if (str2 != null) {
                jsonGenerator.writeStringField("roomId", str2);
            }
            jsonGenerator.writeNumberField("liveOrder", liveSummary.liveOrder);
            jsonGenerator.writeNumberField(BLiveOperationTitleShowType.duration, liveSummary.duration);
            jsonGenerator.writeNumberField("rewardPoint", liveSummary.rewardPoint);
            jsonGenerator.writeNumberField("rewarderCount", liveSummary.rewarderCount);
            jsonGenerator.writeNumberField("newFollowCount", liveSummary.newFollowCount);
            jsonGenerator.writeNumberField("audienceCount", liveSummary.audienceCount);
            jsonGenerator.writeFieldName(StudentVerRejectedReason.startTime);
            JsonAdapter<Double> jsonAdapter = Converter.API_TIME;
            jsonAdapter.serialize(Double.valueOf(liveSummary.startTime), jsonGenerator, true);
            jsonGenerator.writeFieldName("endTime");
            jsonAdapter.serialize(Double.valueOf(liveSummary.endTime), jsonGenerator, true);
            String str3 = liveSummary.type;
            if (str3 != null) {
                jsonGenerator.writeStringField("type", str3);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LiveSummary) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LiveSummary) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LiveSummary new_() {
        LiveSummary liveSummary = new LiveSummary();
        liveSummary.nullCheck();
        return liveSummary;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LiveSummary mo223809clone() {
        LiveSummary liveSummary = new LiveSummary();
        liveSummary.liveId = this.liveId;
        liveSummary.roomId = this.roomId;
        liveSummary.liveOrder = this.liveOrder;
        liveSummary.duration = this.duration;
        liveSummary.rewardPoint = this.rewardPoint;
        liveSummary.rewarderCount = this.rewarderCount;
        liveSummary.newFollowCount = this.newFollowCount;
        liveSummary.audienceCount = this.audienceCount;
        liveSummary.startTime = this.startTime;
        liveSummary.endTime = this.endTime;
        liveSummary.type = this.type;
        return liveSummary;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LiveSummary)) {
            return false;
        }
        LiveSummary liveSummary = (LiveSummary) obj;
        return ValueObject.util_equals(this.liveId, liveSummary.liveId) && ValueObject.util_equals(this.roomId, liveSummary.roomId) && this.liveOrder == liveSummary.liveOrder && this.duration == liveSummary.duration && this.rewardPoint == liveSummary.rewardPoint && this.rewarderCount == liveSummary.rewarderCount && this.newFollowCount == liveSummary.newFollowCount && this.audienceCount == liveSummary.audienceCount && this.startTime == liveSummary.startTime && this.endTime == liveSummary.endTime && ValueObject.util_equals(this.type, liveSummary.type);
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
        String str = this.liveId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.roomId;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        long j = this.liveOrder;
        int i3 = (((iHashCode + iHashCode2) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.duration;
        int i4 = i3 + ((int) (j2 ^ (j2 >>> 32)));
        long jDoubleToLongBits = Double.doubleToLongBits(this.rewardPoint);
        int i5 = (i4 * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.rewarderCount);
        int i6 = (i5 * 41) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.newFollowCount);
        int i7 = (i6 * 41) + ((int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32)));
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.audienceCount);
        int i8 = (i7 * 41) + ((int) (jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32)));
        long jDoubleToLongBits5 = Double.doubleToLongBits(this.startTime);
        int i9 = (i8 * 41) + ((int) (jDoubleToLongBits5 ^ (jDoubleToLongBits5 >>> 32)));
        long jDoubleToLongBits6 = Double.doubleToLongBits(this.endTime);
        int i10 = ((i9 * 41) + ((int) (jDoubleToLongBits6 ^ (jDoubleToLongBits6 >>> 32)))) * 41;
        String str3 = this.type;
        int iHashCode3 = i10 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.liveId == null) {
            this.liveId = "";
        }
        if (this.roomId == null) {
            this.roomId = "";
        }
        if (this.type == null) {
            this.type = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
