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
public class IntlRecordNightClub extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlrecordnightclub";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f90id;

    @ProtobufIndex(index = 4)
    public boolean notInterest;

    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public int showRoundNum;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public long startSwipeTime;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int swipeCount;
    public static ProtobufAdapter<IntlRecordNightClub> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlRecordNightClub>() { // from class: com.p1.mobile.putong.core.data.IntlRecordNightClub.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(IntlRecordNightClub intlRecordNightClub) {
            String str = intlRecordNightClub.f90id;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.h(2, intlRecordNightClub.swipeCount) + CodedOutputByteBufferNano.j(3, intlRecordNightClub.startSwipeTime) + CodedOutputByteBufferNano.b(4, intlRecordNightClub.notInterest) + CodedOutputByteBufferNano.h(5, intlRecordNightClub.showRoundNum);
            ((MessageNano) intlRecordNightClub).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public IntlRecordNightClub m13671parse(nb5 nb5Var) throws IOException {
            IntlRecordNightClub intlRecordNightClub = new IntlRecordNightClub();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (intlRecordNightClub.f90id != null) {
                        break;
                    }
                    intlRecordNightClub.f90id = "";
                    break;
                }
                if (iU == 10) {
                    intlRecordNightClub.f90id = nb5Var.s();
                } else if (iU == 16) {
                    intlRecordNightClub.swipeCount = nb5Var.j();
                } else if (iU == 24) {
                    intlRecordNightClub.startSwipeTime = nb5Var.k();
                } else if (iU == 32) {
                    intlRecordNightClub.notInterest = nb5Var.g();
                } else {
                    if (iU != 40) {
                        if (intlRecordNightClub.f90id != null) {
                            break;
                        }
                        intlRecordNightClub.f90id = "";
                        return intlRecordNightClub;
                    }
                    intlRecordNightClub.showRoundNum = nb5Var.j();
                }
            }
            return intlRecordNightClub;
        }

        public void serialize(IntlRecordNightClub intlRecordNightClub, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = intlRecordNightClub.f90id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.G(2, intlRecordNightClub.swipeCount);
            codedOutputByteBufferNano.I(3, intlRecordNightClub.startSwipeTime);
            codedOutputByteBufferNano.A(4, intlRecordNightClub.notInterest);
            codedOutputByteBufferNano.G(5, intlRecordNightClub.showRoundNum);
        }
    };
    public static JsonAdapter<IntlRecordNightClub> JSON_ADAPTER = new ObjectJsonAdapter<IntlRecordNightClub>() { // from class: com.p1.mobile.putong.core.data.IntlRecordNightClub.2
        public Class getDataClass() {
            return IntlRecordNightClub.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public IntlRecordNightClub m13672newInstance() {
            return new IntlRecordNightClub();
        }

        public boolean parseField(IntlRecordNightClub intlRecordNightClub, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "showRoundNum":
                    intlRecordNightClub.showRoundNum = jsonParser.getValueAsInt();
                    return true;
                case "id":
                    intlRecordNightClub.f90id = jsonParser.getValueAsString();
                    return false;
                case "swipeCount":
                    intlRecordNightClub.swipeCount = jsonParser.getValueAsInt();
                    return true;
                case "notInterest":
                    intlRecordNightClub.notInterest = jsonParser.getValueAsBoolean();
                    return true;
                case "startSwipeTime":
                    intlRecordNightClub.startSwipeTime = jsonParser.getValueAsLong();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(IntlRecordNightClub intlRecordNightClub, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "showRoundNum":
                    return true;
                case "id":
                    return false;
                case "swipeCount":
                case "notInterest":
                case "startSwipeTime":
                    return true;
                default:
                    return super.parseFieldCheck(intlRecordNightClub, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(IntlRecordNightClub intlRecordNightClub, JsonGenerator jsonGenerator) throws IOException {
            String str = intlRecordNightClub.f90id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            jsonGenerator.writeNumberField("swipeCount", intlRecordNightClub.swipeCount);
            jsonGenerator.writeNumberField("startSwipeTime", intlRecordNightClub.startSwipeTime);
            jsonGenerator.writeBooleanField("notInterest", intlRecordNightClub.notInterest);
            jsonGenerator.writeNumberField("showRoundNum", intlRecordNightClub.showRoundNum);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlRecordNightClub) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlRecordNightClub) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlRecordNightClub new_() {
        IntlRecordNightClub intlRecordNightClub = new IntlRecordNightClub();
        intlRecordNightClub.nullCheck();
        return intlRecordNightClub;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public IntlRecordNightClub m13670clone() {
        IntlRecordNightClub intlRecordNightClub = new IntlRecordNightClub();
        intlRecordNightClub.f90id = this.f90id;
        intlRecordNightClub.swipeCount = this.swipeCount;
        intlRecordNightClub.startSwipeTime = this.startSwipeTime;
        intlRecordNightClub.notInterest = this.notInterest;
        intlRecordNightClub.showRoundNum = this.showRoundNum;
        return intlRecordNightClub;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntlRecordNightClub)) {
            return false;
        }
        IntlRecordNightClub intlRecordNightClub = (IntlRecordNightClub) obj;
        return ValueObject.util_equals(this.f90id, intlRecordNightClub.f90id) && this.swipeCount == intlRecordNightClub.swipeCount && this.startSwipeTime == intlRecordNightClub.startSwipeTime && this.notInterest == intlRecordNightClub.notInterest && this.showRoundNum == intlRecordNightClub.showRoundNum;
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
        String str = this.f90id;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.swipeCount) * 41;
        long j = this.startSwipeTime;
        int i3 = ((((iHashCode + ((int) (j ^ (j >>> 32)))) * 41) + (this.notInterest ? 1231 : 1237)) * 41) + this.showRoundNum;
        ((ValueObject) this).hashCode = i3;
        return i3;
    }

    public void nullCheck() {
        if (this.f90id == null) {
            this.f90id = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
