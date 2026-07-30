package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.AwardType;
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
import java.util.List;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes10.dex */
public class NextStatus extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "nextstatus";

    @NonNull
    @ProtobufIndex(index = 2)
    public List<AwardType> awards;

    @NonNull
    @ProtobufIndex(index = 1)
    public AwardStatus status;

    @NonNull
    @ProtobufIndex(index = 3)
    public String updateWay;

    @NonNull
    @ProtobufIndex(index = 4)
    public String updateWayVal;
    public static ProtobufAdapter<NextStatus> PROTOBUF_ADAPTER = new MessageNanoAdapter<NextStatus>() { // from class: com.p1.mobile.putong.core.data.NextStatus.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(NextStatus nextStatus) {
            AwardStatus awardStatus = nextStatus.status;
            int iM17226h = awardStatus != null ? CodedOutputByteBufferNano.m17226h(1, awardStatus.ordinal()) : 0;
            List<AwardType> list = nextStatus.awards;
            if (list != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(2, list, AwardType.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str = nextStatus.updateWay;
            if (str != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(3, str);
            }
            String str2 = nextStatus.updateWayVal;
            if (str2 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(4, str2);
            }
            AwardStatus awardStatus2 = nextStatus.status;
            if (awardStatus2 != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(5, awardStatus2, AwardStatus.PROTOBUF_ADAPTER);
            }
            nextStatus.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public NextStatus parse(nb5 nb5Var) throws IOException {
            NextStatus nextStatus = new NextStatus();
            Integer numValueOf = null;
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (nextStatus.status == null && numValueOf != null) {
                        nextStatus.status = (AwardStatus) AwardStatus.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                    }
                    if (nextStatus.status == null) {
                        nextStatus.status = (AwardStatus) AwardStatus.JSON_ADAPTER.defaultEnum();
                    }
                    if (nextStatus.awards == null) {
                        nextStatus.awards = new ArrayList();
                    }
                    if (nextStatus.updateWay == null) {
                        nextStatus.updateWay = "";
                    }
                    if (nextStatus.updateWayVal != null) {
                        break;
                    }
                    nextStatus.updateWayVal = "";
                    break;
                }
                if (iM158752u == 8) {
                    numValueOf = Integer.valueOf(nb5Var.m158741j());
                } else if (iM158752u == 18) {
                    nextStatus.awards = (List) nb5Var.m158743l(AwardType.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iM158752u == 26) {
                    nextStatus.updateWay = nb5Var.m158750s();
                } else if (iM158752u == 34) {
                    nextStatus.updateWayVal = nb5Var.m158750s();
                } else {
                    if (iM158752u != 42) {
                        if (nextStatus.status == null && numValueOf != null) {
                            nextStatus.status = (AwardStatus) AwardStatus.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (nextStatus.status == null) {
                            nextStatus.status = (AwardStatus) AwardStatus.JSON_ADAPTER.defaultEnum();
                        }
                        if (nextStatus.awards == null) {
                            nextStatus.awards = new ArrayList();
                        }
                        if (nextStatus.updateWay == null) {
                            nextStatus.updateWay = "";
                        }
                        if (nextStatus.updateWayVal != null) {
                            break;
                        }
                        nextStatus.updateWayVal = "";
                        return nextStatus;
                    }
                    nextStatus.status = (AwardStatus) nb5Var.m158743l(AwardStatus.PROTOBUF_ADAPTER);
                }
            }
            return nextStatus;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(NextStatus nextStatus, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            AwardStatus awardStatus = nextStatus.status;
            if (awardStatus != null) {
                codedOutputByteBufferNano.m17250G(1, awardStatus.ordinal());
            }
            List<AwardType> list = nextStatus.awards;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(2, list, AwardType.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str = nextStatus.updateWay;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(3, str);
            }
            String str2 = nextStatus.updateWayVal;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(4, str2);
            }
            AwardStatus awardStatus2 = nextStatus.status;
            if (awardStatus2 != null) {
                codedOutputByteBufferNano.m17254K(5, awardStatus2, AwardStatus.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<NextStatus> JSON_ADAPTER = new ObjectJsonAdapter<NextStatus>() { // from class: com.p1.mobile.putong.core.data.NextStatus.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return NextStatus.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public NextStatus newInstance() {
            return new NextStatus();
        }

        public boolean parseField(NextStatus nextStatus, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "updateWay":
                    nextStatus.updateWay = jsonParser.getValueAsString();
                    return true;
                case "awards":
                    nextStatus.awards = JsonAdapter.parseArray(jsonParser, AwardType.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "status":
                    nextStatus.status = AwardStatus.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "updateWayVal":
                    nextStatus.updateWayVal = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(NextStatus nextStatus, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "updateWay":
                case "awards":
                case "status":
                case "updateWayVal":
                    return true;
                default:
                    return super.parseFieldCheck(nextStatus, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(NextStatus nextStatus, JsonGenerator jsonGenerator) throws IOException {
            if (nextStatus.status != null) {
                jsonGenerator.writeFieldName(NotificationCompat.CATEGORY_STATUS);
                AwardStatus.JSON_ADAPTER.serialize(nextStatus.status, jsonGenerator, true);
            }
            if (nextStatus.awards != null) {
                jsonGenerator.writeFieldName("awards");
                JsonAdapter.serializeArray(nextStatus.awards, jsonGenerator, AwardType.JSON_ADAPTER);
            }
            String str = nextStatus.updateWay;
            if (str != null) {
                jsonGenerator.writeStringField("updateWay", str);
            }
            String str2 = nextStatus.updateWayVal;
            if (str2 != null) {
                jsonGenerator.writeStringField("updateWayVal", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((NextStatus) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((NextStatus) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static NextStatus new_() {
        NextStatus nextStatus = new NextStatus();
        nextStatus.nullCheck();
        return nextStatus;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public NextStatus mo223809clone() {
        NextStatus nextStatus = new NextStatus();
        nextStatus.status = this.status;
        List<AwardType> list = this.awards;
        if (list != null) {
            nextStatus.awards = ValueObject.util_map(list, new w9j() { // from class: l.vi40
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((AwardType) obj).mo223809clone();
                }
            });
        }
        nextStatus.updateWay = this.updateWay;
        nextStatus.updateWayVal = this.updateWayVal;
        return nextStatus;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NextStatus)) {
            return false;
        }
        NextStatus nextStatus = (NextStatus) obj;
        return ValueObject.util_equals(this.status, nextStatus.status) && ValueObject.util_equals(this.awards, nextStatus.awards) && ValueObject.util_equals(this.updateWay, nextStatus.updateWay) && ValueObject.util_equals(this.updateWayVal, nextStatus.updateWayVal);
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
        AwardStatus awardStatus = this.status;
        int iHashCode = (i2 + (awardStatus != null ? awardStatus.hashCode() : 0)) * 41;
        List<AwardType> list = this.awards;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 41;
        String str = this.updateWay;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.updateWayVal;
        int iHashCode4 = iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.status == null) {
            this.status = (AwardStatus) AwardStatus.JSON_ADAPTER.defaultEnum();
        }
        if (this.awards == null) {
            this.awards = new ArrayList();
        }
        if (this.updateWay == null) {
            this.updateWay = "";
        }
        if (this.updateWayVal == null) {
            this.updateWayVal = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
