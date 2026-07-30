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
public class ComStatusAward extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "comstatusaward";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public List<AwardType> awards;

    @NonNull
    @ProtobufIndex(index = 1)
    public String businessName;

    @ProtobufIndex(index = 6)
    public boolean hide;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public NextStatus nextStatus;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public AwardStatus status;

    @ProtobufIndex(index = 4)
    public long updateTime;
    public static ProtobufAdapter<ComStatusAward> PROTOBUF_ADAPTER = new MessageNanoAdapter<ComStatusAward>() { // from class: com.p1.mobile.putong.core.data.ComStatusAward.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ComStatusAward comStatusAward) {
            String str = comStatusAward.businessName;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            AwardStatus awardStatus = comStatusAward.status;
            if (awardStatus != null) {
                iO += CodedOutputByteBufferNano.h(2, awardStatus.ordinal());
            }
            List<AwardType> list = comStatusAward.awards;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(3, list, AwardType.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            int iJ = iO + CodedOutputByteBufferNano.j(4, comStatusAward.updateTime);
            NextStatus nextStatus = comStatusAward.nextStatus;
            if (nextStatus != null) {
                iJ += CodedOutputByteBufferNano.l(5, nextStatus, NextStatus.PROTOBUF_ADAPTER);
            }
            int iB = iJ + CodedOutputByteBufferNano.b(6, comStatusAward.hide);
            AwardStatus awardStatus2 = comStatusAward.status;
            if (awardStatus2 != null) {
                iB += CodedOutputByteBufferNano.l(7, awardStatus2, AwardStatus.PROTOBUF_ADAPTER);
            }
            ((MessageNano) comStatusAward).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ComStatusAward m12213parse(nb5 nb5Var) throws IOException {
            ComStatusAward comStatusAward = new ComStatusAward();
            Integer numValueOf = null;
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (comStatusAward.status == null && numValueOf != null) {
                        comStatusAward.status = (AwardStatus) AwardStatus.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
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
                if (iU == 10) {
                    comStatusAward.businessName = nb5Var.s();
                } else if (iU == 16) {
                    numValueOf = Integer.valueOf(nb5Var.j());
                } else if (iU == 26) {
                    comStatusAward.awards = (List) nb5Var.l(AwardType.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 32) {
                    comStatusAward.updateTime = nb5Var.k();
                } else if (iU == 42) {
                    comStatusAward.nextStatus = (NextStatus) nb5Var.l(NextStatus.PROTOBUF_ADAPTER);
                } else if (iU == 48) {
                    comStatusAward.hide = nb5Var.g();
                } else {
                    if (iU != 58) {
                        if (comStatusAward.status == null && numValueOf != null) {
                            comStatusAward.status = (AwardStatus) AwardStatus.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
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
                    comStatusAward.status = (AwardStatus) nb5Var.l(AwardStatus.PROTOBUF_ADAPTER);
                }
            }
            return comStatusAward;
        }

        public void serialize(ComStatusAward comStatusAward, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = comStatusAward.businessName;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            AwardStatus awardStatus = comStatusAward.status;
            if (awardStatus != null) {
                codedOutputByteBufferNano.G(2, awardStatus.ordinal());
            }
            List<AwardType> list = comStatusAward.awards;
            if (list != null) {
                codedOutputByteBufferNano.K(3, list, AwardType.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.I(4, comStatusAward.updateTime);
            NextStatus nextStatus = comStatusAward.nextStatus;
            if (nextStatus != null) {
                codedOutputByteBufferNano.K(5, nextStatus, NextStatus.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.A(6, comStatusAward.hide);
            AwardStatus awardStatus2 = comStatusAward.status;
            if (awardStatus2 != null) {
                codedOutputByteBufferNano.K(7, awardStatus2, AwardStatus.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<ComStatusAward> JSON_ADAPTER = new ObjectJsonAdapter<ComStatusAward>() { // from class: com.p1.mobile.putong.core.data.ComStatusAward.2
        public Class getDataClass() {
            return ComStatusAward.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ComStatusAward m12214newInstance() {
            return new ComStatusAward();
        }

        public boolean parseField(ComStatusAward comStatusAward, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "awards":
                    comStatusAward.awards = JsonAdapter.parseArray(jsonParser, AwardType.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "nextStatus":
                    comStatusAward.nextStatus = (NextStatus) NextStatus.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "status":
                    comStatusAward.status = (AwardStatus) AwardStatus.JSON_ADAPTER.parse(jsonParser, str2);
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

        public void serializeFields(ComStatusAward comStatusAward, JsonGenerator jsonGenerator) throws IOException {
            String str = comStatusAward.businessName;
            if (str != null) {
                jsonGenerator.writeStringField("businessName", str);
            }
            if (comStatusAward.status != null) {
                jsonGenerator.writeFieldName("status");
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ComStatusAward) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ComStatusAward) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ComStatusAward new_() {
        ComStatusAward comStatusAward = new ComStatusAward();
        comStatusAward.nullCheck();
        return comStatusAward;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ComStatusAward m12212clone() {
        ComStatusAward comStatusAward = new ComStatusAward();
        comStatusAward.businessName = this.businessName;
        comStatusAward.status = this.status;
        List<AwardType> list = this.awards;
        if (list != null) {
            comStatusAward.awards = ValueObject.util_map(list, new w9j() { // from class: l.ke5
                public final Object call(Object obj) {
                    return ((AwardType) obj).m11704clone();
                }
            });
        }
        comStatusAward.updateTime = this.updateTime;
        NextStatus nextStatus = this.nextStatus;
        if (nextStatus != null) {
            comStatusAward.nextStatus = nextStatus.m14562clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
