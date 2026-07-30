package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
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
public class FreeTrialRecords extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "freetrialrecords";

    @ProtobufIndex(index = 4)
    public long closedTime;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public long createdTime;

    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public long expiredTime;

    @NonNull
    @ProtobufIndex(index = 1)
    public String name;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String status;
    public static ProtobufAdapter<FreeTrialRecords> PROTOBUF_ADAPTER = new MessageNanoAdapter<FreeTrialRecords>() { // from class: com.p1.mobile.putong.core.data.FreeTrialRecords.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(FreeTrialRecords freeTrialRecords) {
            String str = freeTrialRecords.name;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = freeTrialRecords.status;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            int iJ = iO + CodedOutputByteBufferNano.j(3, freeTrialRecords.createdTime) + CodedOutputByteBufferNano.j(4, freeTrialRecords.closedTime) + CodedOutputByteBufferNano.j(5, freeTrialRecords.expiredTime);
            ((MessageNano) freeTrialRecords).cachedSize = iJ;
            return iJ;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public FreeTrialRecords m12845parse(nb5 nb5Var) throws IOException {
            FreeTrialRecords freeTrialRecords = new FreeTrialRecords();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (freeTrialRecords.name == null) {
                        freeTrialRecords.name = "";
                    }
                    if (freeTrialRecords.status != null) {
                        break;
                    }
                    freeTrialRecords.status = "";
                    break;
                }
                if (iU == 10) {
                    freeTrialRecords.name = nb5Var.s();
                } else if (iU == 18) {
                    freeTrialRecords.status = nb5Var.s();
                } else if (iU == 24) {
                    freeTrialRecords.createdTime = nb5Var.k();
                } else if (iU == 32) {
                    freeTrialRecords.closedTime = nb5Var.k();
                } else {
                    if (iU != 40) {
                        if (freeTrialRecords.name == null) {
                            freeTrialRecords.name = "";
                        }
                        if (freeTrialRecords.status != null) {
                            break;
                        }
                        freeTrialRecords.status = "";
                        return freeTrialRecords;
                    }
                    freeTrialRecords.expiredTime = nb5Var.k();
                }
            }
            return freeTrialRecords;
        }

        public void serialize(FreeTrialRecords freeTrialRecords, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = freeTrialRecords.name;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = freeTrialRecords.status;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            codedOutputByteBufferNano.I(3, freeTrialRecords.createdTime);
            codedOutputByteBufferNano.I(4, freeTrialRecords.closedTime);
            codedOutputByteBufferNano.I(5, freeTrialRecords.expiredTime);
        }
    };
    public static JsonAdapter<FreeTrialRecords> JSON_ADAPTER = new ObjectJsonAdapter<FreeTrialRecords>() { // from class: com.p1.mobile.putong.core.data.FreeTrialRecords.2
        public Class getDataClass() {
            return FreeTrialRecords.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public FreeTrialRecords m12846newInstance() {
            return new FreeTrialRecords();
        }

        public boolean parseField(FreeTrialRecords freeTrialRecords, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "closedTime":
                    freeTrialRecords.closedTime = jsonParser.getValueAsLong();
                    return true;
                case "status":
                    freeTrialRecords.status = jsonParser.getValueAsString();
                    return true;
                case "createdTime":
                    freeTrialRecords.createdTime = jsonParser.getValueAsLong();
                    return true;
                case "expiredTime":
                    freeTrialRecords.expiredTime = jsonParser.getValueAsLong();
                    return true;
                case "name":
                    freeTrialRecords.name = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(FreeTrialRecords freeTrialRecords, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "closedTime":
                case "status":
                case "createdTime":
                case "expiredTime":
                case "name":
                    return true;
                default:
                    return super.parseFieldCheck(freeTrialRecords, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(FreeTrialRecords freeTrialRecords, JsonGenerator jsonGenerator) throws IOException {
            String str = freeTrialRecords.name;
            if (str != null) {
                jsonGenerator.writeStringField("name", str);
            }
            String str2 = freeTrialRecords.status;
            if (str2 != null) {
                jsonGenerator.writeStringField("status", str2);
            }
            jsonGenerator.writeNumberField("createdTime", freeTrialRecords.createdTime);
            jsonGenerator.writeNumberField("closedTime", freeTrialRecords.closedTime);
            jsonGenerator.writeNumberField("expiredTime", freeTrialRecords.expiredTime);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FreeTrialRecords) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FreeTrialRecords) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FreeTrialRecords new_() {
        FreeTrialRecords freeTrialRecords = new FreeTrialRecords();
        freeTrialRecords.nullCheck();
        return freeTrialRecords;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public FreeTrialRecords m12844clone() {
        FreeTrialRecords freeTrialRecords = new FreeTrialRecords();
        freeTrialRecords.name = this.name;
        freeTrialRecords.status = this.status;
        freeTrialRecords.createdTime = this.createdTime;
        freeTrialRecords.closedTime = this.closedTime;
        freeTrialRecords.expiredTime = this.expiredTime;
        return freeTrialRecords;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FreeTrialRecords)) {
            return false;
        }
        FreeTrialRecords freeTrialRecords = (FreeTrialRecords) obj;
        return ValueObject.util_equals(this.name, freeTrialRecords.name) && ValueObject.util_equals(this.status, freeTrialRecords.status) && this.createdTime == freeTrialRecords.createdTime && this.closedTime == freeTrialRecords.closedTime && this.expiredTime == freeTrialRecords.expiredTime;
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
        String str = this.name;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.status;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        long j = this.createdTime;
        int i3 = (((iHashCode + iHashCode2) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.closedTime;
        int i4 = (i3 + ((int) (j2 ^ (j2 >>> 32)))) * 41;
        long j3 = this.expiredTime;
        int i5 = i4 + ((int) (j3 ^ (j3 >>> 32)));
        ((ValueObject) this).hashCode = i5;
        return i5;
    }

    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
        if (this.status == null) {
            this.status = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
