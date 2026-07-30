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
public class SeeMatchThenPay extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "seematchthenpay";

    @ProtobufIndex(index = 2)
    public boolean expRunning;

    @ProtobufIndex(index = 1)
    public boolean fullReleased;

    @NonNull
    @ProtobufIndex(index = 3)
    public SeeMatchGroup groupA;
    public static ProtobufAdapter<SeeMatchThenPay> PROTOBUF_ADAPTER = new MessageNanoAdapter<SeeMatchThenPay>() { // from class: com.p1.mobile.putong.core.data.SeeMatchThenPay.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SeeMatchThenPay seeMatchThenPay) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, seeMatchThenPay.fullReleased) + CodedOutputByteBufferNano.m17275b(2, seeMatchThenPay.expRunning);
            SeeMatchGroup seeMatchGroup = seeMatchThenPay.groupA;
            if (seeMatchGroup != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(3, seeMatchGroup, SeeMatchGroup.PROTOBUF_ADAPTER);
            }
            seeMatchThenPay.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SeeMatchThenPay parse(nc5 nc5Var) throws IOException {
            SeeMatchThenPay seeMatchThenPay = new SeeMatchThenPay();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (seeMatchThenPay.groupA != null) {
                        break;
                    }
                    seeMatchThenPay.groupA = SeeMatchGroup.new_();
                    break;
                }
                if (iM162497u == 8) {
                    seeMatchThenPay.fullReleased = nc5Var.m162483g();
                } else if (iM162497u == 16) {
                    seeMatchThenPay.expRunning = nc5Var.m162483g();
                } else {
                    if (iM162497u != 26) {
                        if (seeMatchThenPay.groupA != null) {
                            break;
                        }
                        seeMatchThenPay.groupA = SeeMatchGroup.new_();
                        return seeMatchThenPay;
                    }
                    seeMatchThenPay.groupA = (SeeMatchGroup) nc5Var.m162488l(SeeMatchGroup.PROTOBUF_ADAPTER);
                }
            }
            return seeMatchThenPay;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SeeMatchThenPay seeMatchThenPay, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, seeMatchThenPay.fullReleased);
            codedOutputByteBufferNano.m17299A(2, seeMatchThenPay.expRunning);
            SeeMatchGroup seeMatchGroup = seeMatchThenPay.groupA;
            if (seeMatchGroup != null) {
                codedOutputByteBufferNano.m17309K(3, seeMatchGroup, SeeMatchGroup.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<SeeMatchThenPay> JSON_ADAPTER = new ObjectJsonAdapter<SeeMatchThenPay>() { // from class: com.p1.mobile.putong.core.data.SeeMatchThenPay.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SeeMatchThenPay.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SeeMatchThenPay newInstance() {
            return new SeeMatchThenPay();
        }

        public boolean parseField(SeeMatchThenPay seeMatchThenPay, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "fullReleased":
                    seeMatchThenPay.fullReleased = jsonParser.getValueAsBoolean();
                    return true;
                case "groupA":
                    seeMatchThenPay.groupA = SeeMatchGroup.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "expRunning":
                    seeMatchThenPay.expRunning = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(SeeMatchThenPay seeMatchThenPay, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "fullReleased":
                case "groupA":
                case "expRunning":
                    return true;
                default:
                    return super.parseFieldCheck(seeMatchThenPay, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SeeMatchThenPay seeMatchThenPay, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("fullReleased", seeMatchThenPay.fullReleased);
            jsonGenerator.writeBooleanField("expRunning", seeMatchThenPay.expRunning);
            if (seeMatchThenPay.groupA != null) {
                jsonGenerator.writeFieldName("groupA");
                SeeMatchGroup.JSON_ADAPTER.serialize(seeMatchThenPay.groupA, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SeeMatchThenPay) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SeeMatchThenPay) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SeeMatchThenPay new_() {
        SeeMatchThenPay seeMatchThenPay = new SeeMatchThenPay();
        seeMatchThenPay.nullCheck();
        return seeMatchThenPay;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SeeMatchThenPay mo225055clone() {
        SeeMatchThenPay seeMatchThenPay = new SeeMatchThenPay();
        seeMatchThenPay.fullReleased = this.fullReleased;
        seeMatchThenPay.expRunning = this.expRunning;
        SeeMatchGroup seeMatchGroup = this.groupA;
        if (seeMatchGroup != null) {
            seeMatchThenPay.groupA = seeMatchGroup.mo225055clone();
        }
        return seeMatchThenPay;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SeeMatchThenPay)) {
            return false;
        }
        SeeMatchThenPay seeMatchThenPay = (SeeMatchThenPay) obj;
        return this.fullReleased == seeMatchThenPay.fullReleased && this.expRunning == seeMatchThenPay.expRunning && ValueObject.util_equals(this.groupA, seeMatchThenPay.groupA);
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
        int i2 = ((((i * 41) + (this.fullReleased ? 1231 : 1237)) * 41) + (this.expRunning ? 1231 : 1237)) * 41;
        SeeMatchGroup seeMatchGroup = this.groupA;
        int iHashCode = i2 + (seeMatchGroup != null ? seeMatchGroup.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.groupA == null) {
            this.groupA = SeeMatchGroup.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
