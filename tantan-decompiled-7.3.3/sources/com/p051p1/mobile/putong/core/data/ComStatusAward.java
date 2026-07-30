package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.AwardType;
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
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes10.dex */
public class ComStatusAward extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "comstatusaward";

    @NonNull
    @ProtobufIndex(index = 3)
    public List<AwardType> awards;

    @NonNull
    @ProtobufIndex(index = 1)
    public String businessName;

    @ProtobufIndex(index = 6)
    public boolean hide;

    @NonNull
    @ProtobufIndex(index = 5)
    public NextStatus nextStatus;

    @NonNull
    @ProtobufIndex(index = 2)
    public AwardStatus status;

    @ProtobufIndex(index = 4)
    public long updateTime;
    public static ProtobufAdapter<ComStatusAward> PROTOBUF_ADAPTER = new MessageNanoAdapter<ComStatusAward>() { // from class: com.p1.mobile.putong.core.data.ComStatusAward.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ComStatusAward comStatusAward) {
            String str = comStatusAward.businessName;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            AwardStatus awardStatus = comStatusAward.status;
            if (awardStatus != null) {
                iM17288o += CodedOutputByteBufferNano.m17281h(2, awardStatus.ordinal());
            }
            List<AwardType> list = comStatusAward.awards;
            if (list != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(3, list, AwardType.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            int iM17283j = iM17288o + CodedOutputByteBufferNano.m17283j(4, comStatusAward.updateTime);
            NextStatus nextStatus = comStatusAward.nextStatus;
            if (nextStatus != null) {
                iM17283j += CodedOutputByteBufferNano.m17285l(5, nextStatus, NextStatus.PROTOBUF_ADAPTER);
            }
            int iM17275b = iM17283j + CodedOutputByteBufferNano.m17275b(6, comStatusAward.hide);
            AwardStatus awardStatus2 = comStatusAward.status;
            if (awardStatus2 != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(7, awardStatus2, AwardStatus.PROTOBUF_ADAPTER);
            }
            comStatusAward.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ComStatusAward parse(nc5 nc5Var) throws IOException {
            ComStatusAward comStatusAward = new ComStatusAward();
            Integer numValueOf = null;
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (comStatusAward.status == null && numValueOf != null) {
                        comStatusAward.status = (AwardStatus) AwardStatus.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                    }
                    if (comStatusAward.businessName == null) {
                        comStatusAward.businessName = "";
                    }
                    if (comStatusAward.status == null) {
                        comStatusAward.status = (AwardStatus) AwardStatus.JSON_ADAPTER.defaultEnum();
                    }
                    if (comStatusAward.awards == null) {
                        comStatusAward.awards = new ArrayList();
                    }
                    if (comStatusAward.nextStatus != null) {
                        break;
                    }
                    comStatusAward.nextStatus = NextStatus.new_();
                    break;
                }
                if (iM162497u == 10) {
                    comStatusAward.businessName = nc5Var.m162495s();
                } else if (iM162497u == 16) {
                    numValueOf = Integer.valueOf(nc5Var.m162486j());
                } else if (iM162497u == 26) {
                    comStatusAward.awards = (List) nc5Var.m162488l(AwardType.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iM162497u == 32) {
                    comStatusAward.updateTime = nc5Var.m162487k();
                } else if (iM162497u == 42) {
                    comStatusAward.nextStatus = (NextStatus) nc5Var.m162488l(NextStatus.PROTOBUF_ADAPTER);
                } else if (iM162497u == 48) {
                    comStatusAward.hide = nc5Var.m162483g();
                } else {
                    if (iM162497u != 58) {
                        if (comStatusAward.status == null && numValueOf != null) {
                            comStatusAward.status = (AwardStatus) AwardStatus.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (comStatusAward.businessName == null) {
                            comStatusAward.businessName = "";
                        }
                        if (comStatusAward.status == null) {
                            comStatusAward.status = (AwardStatus) AwardStatus.JSON_ADAPTER.defaultEnum();
                        }
                        if (comStatusAward.awards == null) {
                            comStatusAward.awards = new ArrayList();
                        }
                        if (comStatusAward.nextStatus != null) {
                            break;
                        }
                        comStatusAward.nextStatus = NextStatus.new_();
                        return comStatusAward;
                    }
                    comStatusAward.status = (AwardStatus) nc5Var.m162488l(AwardStatus.PROTOBUF_ADAPTER);
                }
            }
            return comStatusAward;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ComStatusAward comStatusAward, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = comStatusAward.businessName;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            AwardStatus awardStatus = comStatusAward.status;
            if (awardStatus != null) {
                codedOutputByteBufferNano.m17305G(2, awardStatus.ordinal());
            }
            List<AwardType> list = comStatusAward.awards;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(3, list, AwardType.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17307I(4, comStatusAward.updateTime);
            NextStatus nextStatus = comStatusAward.nextStatus;
            if (nextStatus != null) {
                codedOutputByteBufferNano.m17309K(5, nextStatus, NextStatus.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17299A(6, comStatusAward.hide);
            AwardStatus awardStatus2 = comStatusAward.status;
            if (awardStatus2 != null) {
                codedOutputByteBufferNano.m17309K(7, awardStatus2, AwardStatus.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<ComStatusAward> JSON_ADAPTER = new ObjectJsonAdapter<ComStatusAward>() { // from class: com.p1.mobile.putong.core.data.ComStatusAward.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ComStatusAward.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ComStatusAward newInstance() {
            return new ComStatusAward();
        }

        public boolean parseField(ComStatusAward comStatusAward, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "awards":
                    comStatusAward.awards = JsonAdapter.parseArray(jsonParser, AwardType.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "nextStatus":
                    comStatusAward.nextStatus = NextStatus.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "status":
                    comStatusAward.status = AwardStatus.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "businessName":
                    comStatusAward.businessName = jsonParser.getValueAsString();
                    return true;
                case "updateTime":
                    comStatusAward.updateTime = jsonParser.getValueAsLong();
                    return true;
                case "hide":
                    comStatusAward.hide = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ComStatusAward comStatusAward, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "awards":
                case "nextStatus":
                case "status":
                case "businessName":
                case "updateTime":
                case "hide":
                    return true;
                default:
                    return super.parseFieldCheck(comStatusAward, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ComStatusAward comStatusAward, JsonGenerator jsonGenerator) throws IOException {
            String str = comStatusAward.businessName;
            if (str != null) {
                jsonGenerator.writeStringField("businessName", str);
            }
            if (comStatusAward.status != null) {
                jsonGenerator.writeFieldName(NotificationCompat.CATEGORY_STATUS);
                AwardStatus.JSON_ADAPTER.serialize(comStatusAward.status, jsonGenerator, true);
            }
            if (comStatusAward.awards != null) {
                jsonGenerator.writeFieldName("awards");
                JsonAdapter.serializeArray(comStatusAward.awards, jsonGenerator, AwardType.JSON_ADAPTER);
            }
            jsonGenerator.writeNumberField("updateTime", comStatusAward.updateTime);
            if (comStatusAward.nextStatus != null) {
                jsonGenerator.writeFieldName("nextStatus");
                NextStatus.JSON_ADAPTER.serialize(comStatusAward.nextStatus, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("hide", comStatusAward.hide);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ComStatusAward) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ComStatusAward) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ComStatusAward new_() {
        ComStatusAward comStatusAward = new ComStatusAward();
        comStatusAward.nullCheck();
        return comStatusAward;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ComStatusAward mo225055clone() {
        ComStatusAward comStatusAward = new ComStatusAward();
        comStatusAward.businessName = this.businessName;
        comStatusAward.status = this.status;
        List<AwardType> list = this.awards;
        if (list != null) {
            comStatusAward.awards = ValueObject.util_map(list, new qcj() { // from class: l.kf5
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((AwardType) obj).mo225055clone();
                }
            });
        }
        comStatusAward.updateTime = this.updateTime;
        NextStatus nextStatus = this.nextStatus;
        if (nextStatus != null) {
            comStatusAward.nextStatus = nextStatus.mo225055clone();
        }
        comStatusAward.hide = this.hide;
        return comStatusAward;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ComStatusAward)) {
            return false;
        }
        ComStatusAward comStatusAward = (ComStatusAward) obj;
        return ValueObject.util_equals(this.businessName, comStatusAward.businessName) && ValueObject.util_equals(this.status, comStatusAward.status) && ValueObject.util_equals(this.awards, comStatusAward.awards) && this.updateTime == comStatusAward.updateTime && ValueObject.util_equals(this.nextStatus, comStatusAward.nextStatus) && this.hide == comStatusAward.hide;
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
        String str = this.businessName;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        AwardStatus awardStatus = this.status;
        int iHashCode2 = (iHashCode + (awardStatus != null ? awardStatus.hashCode() : 0)) * 41;
        List<AwardType> list = this.awards;
        int iHashCode3 = list != null ? list.hashCode() : 0;
        long j = this.updateTime;
        int i3 = (((iHashCode2 + iHashCode3) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        NextStatus nextStatus = this.nextStatus;
        int iHashCode4 = ((i3 + (nextStatus != null ? nextStatus.hashCode() : 0)) * 41) + (this.hide ? 1231 : 1237);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.businessName == null) {
            this.businessName = "";
        }
        if (this.status == null) {
            this.status = (AwardStatus) AwardStatus.JSON_ADAPTER.defaultEnum();
        }
        if (this.awards == null) {
            this.awards = new ArrayList();
        }
        if (this.nextStatus == null) {
            this.nextStatus = NextStatus.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
