package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.AwardType;
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
public class NextStatus extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "nextstatus";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public List<AwardType> awards;

    @NonNull
    @ProtobufIndex(index = 1)
    public AwardStatus status;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String updateWay;

    @NonNull
    @ProtobufIndex(index = 4)
    public String updateWayVal;
    public static ProtobufAdapter<NextStatus> PROTOBUF_ADAPTER = new MessageNanoAdapter<NextStatus>() { // from class: com.p1.mobile.putong.core.data.NextStatus.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(NextStatus nextStatus) {
            AwardStatus awardStatus = nextStatus.status;
            int iH = awardStatus != null ? CodedOutputByteBufferNano.h(1, awardStatus.ordinal()) : 0;
            List<AwardType> list = nextStatus.awards;
            if (list != null) {
                iH += CodedOutputByteBufferNano.l(2, list, AwardType.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str = nextStatus.updateWay;
            if (str != null) {
                iH += CodedOutputByteBufferNano.o(3, str);
            }
            String str2 = nextStatus.updateWayVal;
            if (str2 != null) {
                iH += CodedOutputByteBufferNano.o(4, str2);
            }
            AwardStatus awardStatus2 = nextStatus.status;
            if (awardStatus2 != null) {
                iH += CodedOutputByteBufferNano.l(5, awardStatus2, AwardStatus.PROTOBUF_ADAPTER);
            }
            ((MessageNano) nextStatus).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public NextStatus m14563parse(nb5 nb5Var) throws IOException {
            NextStatus nextStatus = new NextStatus();
            Integer numValueOf = null;
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (nextStatus.status == null && numValueOf != null) {
                        nextStatus.status = (AwardStatus) AwardStatus.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
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
                if (iU == 8) {
                    numValueOf = Integer.valueOf(nb5Var.j());
                } else if (iU == 18) {
                    nextStatus.awards = (List) nb5Var.l(AwardType.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 26) {
                    nextStatus.updateWay = nb5Var.s();
                } else if (iU == 34) {
                    nextStatus.updateWayVal = nb5Var.s();
                } else {
                    if (iU != 42) {
                        if (nextStatus.status == null && numValueOf != null) {
                            nextStatus.status = (AwardStatus) AwardStatus.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
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
                    nextStatus.status = (AwardStatus) nb5Var.l(AwardStatus.PROTOBUF_ADAPTER);
                }
            }
            return nextStatus;
        }

        public void serialize(NextStatus nextStatus, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            AwardStatus awardStatus = nextStatus.status;
            if (awardStatus != null) {
                codedOutputByteBufferNano.G(1, awardStatus.ordinal());
            }
            List<AwardType> list = nextStatus.awards;
            if (list != null) {
                codedOutputByteBufferNano.K(2, list, AwardType.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str = nextStatus.updateWay;
            if (str != null) {
                codedOutputByteBufferNano.R(3, str);
            }
            String str2 = nextStatus.updateWayVal;
            if (str2 != null) {
                codedOutputByteBufferNano.R(4, str2);
            }
            AwardStatus awardStatus2 = nextStatus.status;
            if (awardStatus2 != null) {
                codedOutputByteBufferNano.K(5, awardStatus2, AwardStatus.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<NextStatus> JSON_ADAPTER = new ObjectJsonAdapter<NextStatus>() { // from class: com.p1.mobile.putong.core.data.NextStatus.2
        public Class getDataClass() {
            return NextStatus.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public NextStatus m14564newInstance() {
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
                    nextStatus.status = (AwardStatus) AwardStatus.JSON_ADAPTER.parse(jsonParser, str2);
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

        public void serializeFields(NextStatus nextStatus, JsonGenerator jsonGenerator) throws IOException {
            if (nextStatus.status != null) {
                jsonGenerator.writeFieldName("status");
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((NextStatus) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((NextStatus) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static NextStatus new_() {
        NextStatus nextStatus = new NextStatus();
        nextStatus.nullCheck();
        return nextStatus;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public NextStatus m14562clone() {
        NextStatus nextStatus = new NextStatus();
        nextStatus.status = this.status;
        List<AwardType> list = this.awards;
        if (list != null) {
            nextStatus.awards = ValueObject.util_map(list, new w9j() { // from class: l.vi40
                public final Object call(Object obj) {
                    return ((AwardType) obj).m11704clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
