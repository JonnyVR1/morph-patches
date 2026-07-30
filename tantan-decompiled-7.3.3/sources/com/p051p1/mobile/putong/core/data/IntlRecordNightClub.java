package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
import p153l.nc5;

/* JADX INFO: loaded from: classes10.dex */
public class IntlRecordNightClub extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "intlrecordnightclub";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f21170id;

    @ProtobufIndex(index = 4)
    public boolean notInterest;

    @ProtobufIndex(index = 5)
    public int showRoundNum;

    @ProtobufIndex(index = 3)
    public long startSwipeTime;

    @ProtobufIndex(index = 2)
    public int swipeCount;
    public static ProtobufAdapter<IntlRecordNightClub> PROTOBUF_ADAPTER = new MessageNanoAdapter<IntlRecordNightClub>() { // from class: com.p1.mobile.putong.core.data.IntlRecordNightClub.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IntlRecordNightClub intlRecordNightClub) {
            String str = intlRecordNightClub.f21170id;
            int iM17288o = (str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0) + CodedOutputByteBufferNano.m17281h(2, intlRecordNightClub.swipeCount) + CodedOutputByteBufferNano.m17283j(3, intlRecordNightClub.startSwipeTime) + CodedOutputByteBufferNano.m17275b(4, intlRecordNightClub.notInterest) + CodedOutputByteBufferNano.m17281h(5, intlRecordNightClub.showRoundNum);
            intlRecordNightClub.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IntlRecordNightClub parse(nc5 nc5Var) throws IOException {
            IntlRecordNightClub intlRecordNightClub = new IntlRecordNightClub();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (intlRecordNightClub.f21170id != null) {
                        break;
                    }
                    intlRecordNightClub.f21170id = "";
                    break;
                }
                if (iM162497u == 10) {
                    intlRecordNightClub.f21170id = nc5Var.m162495s();
                } else if (iM162497u == 16) {
                    intlRecordNightClub.swipeCount = nc5Var.m162486j();
                } else if (iM162497u == 24) {
                    intlRecordNightClub.startSwipeTime = nc5Var.m162487k();
                } else if (iM162497u == 32) {
                    intlRecordNightClub.notInterest = nc5Var.m162483g();
                } else {
                    if (iM162497u != 40) {
                        if (intlRecordNightClub.f21170id != null) {
                            break;
                        }
                        intlRecordNightClub.f21170id = "";
                        return intlRecordNightClub;
                    }
                    intlRecordNightClub.showRoundNum = nc5Var.m162486j();
                }
            }
            return intlRecordNightClub;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IntlRecordNightClub intlRecordNightClub, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = intlRecordNightClub.f21170id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            codedOutputByteBufferNano.m17305G(2, intlRecordNightClub.swipeCount);
            codedOutputByteBufferNano.m17307I(3, intlRecordNightClub.startSwipeTime);
            codedOutputByteBufferNano.m17299A(4, intlRecordNightClub.notInterest);
            codedOutputByteBufferNano.m17305G(5, intlRecordNightClub.showRoundNum);
        }
    };
    public static JsonAdapter<IntlRecordNightClub> JSON_ADAPTER = new ObjectJsonAdapter<IntlRecordNightClub>() { // from class: com.p1.mobile.putong.core.data.IntlRecordNightClub.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IntlRecordNightClub.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IntlRecordNightClub newInstance() {
            return new IntlRecordNightClub();
        }

        public boolean parseField(IntlRecordNightClub intlRecordNightClub, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "showRoundNum":
                    intlRecordNightClub.showRoundNum = jsonParser.getValueAsInt();
                    return true;
                case "id":
                    intlRecordNightClub.f21170id = jsonParser.getValueAsString();
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IntlRecordNightClub intlRecordNightClub, JsonGenerator jsonGenerator) throws IOException {
            String str = intlRecordNightClub.f21170id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            jsonGenerator.writeNumberField("swipeCount", intlRecordNightClub.swipeCount);
            jsonGenerator.writeNumberField("startSwipeTime", intlRecordNightClub.startSwipeTime);
            jsonGenerator.writeBooleanField("notInterest", intlRecordNightClub.notInterest);
            jsonGenerator.writeNumberField("showRoundNum", intlRecordNightClub.showRoundNum);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IntlRecordNightClub) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IntlRecordNightClub) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IntlRecordNightClub new_() {
        IntlRecordNightClub intlRecordNightClub = new IntlRecordNightClub();
        intlRecordNightClub.nullCheck();
        return intlRecordNightClub;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IntlRecordNightClub mo225055clone() {
        IntlRecordNightClub intlRecordNightClub = new IntlRecordNightClub();
        intlRecordNightClub.f21170id = this.f21170id;
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
        return ValueObject.util_equals(this.f21170id, intlRecordNightClub.f21170id) && this.swipeCount == intlRecordNightClub.swipeCount && this.startSwipeTime == intlRecordNightClub.startSwipeTime && this.notInterest == intlRecordNightClub.notInterest && this.showRoundNum == intlRecordNightClub.showRoundNum;
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
        String str = this.f21170id;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.swipeCount) * 41;
        long j = this.startSwipeTime;
        int i3 = ((((iHashCode + ((int) (j ^ (j >>> 32)))) * 41) + (this.notInterest ? 1231 : 1237)) * 41) + this.showRoundNum;
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f21170id == null) {
            this.f21170id = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
