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
public class SeeMatchThenPay extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "seematchthenpay";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public boolean expRunning;

    @ProtobufIndex(index = 1)
    public boolean fullReleased;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public SeeMatchGroup groupA;
    public static ProtobufAdapter<SeeMatchThenPay> PROTOBUF_ADAPTER = new MessageNanoAdapter<SeeMatchThenPay>() { // from class: com.p1.mobile.putong.core.data.SeeMatchThenPay.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SeeMatchThenPay seeMatchThenPay) {
            int iB = CodedOutputByteBufferNano.b(1, seeMatchThenPay.fullReleased) + CodedOutputByteBufferNano.b(2, seeMatchThenPay.expRunning);
            SeeMatchGroup seeMatchGroup = seeMatchThenPay.groupA;
            if (seeMatchGroup != null) {
                iB += CodedOutputByteBufferNano.l(3, seeMatchGroup, SeeMatchGroup.PROTOBUF_ADAPTER);
            }
            ((MessageNano) seeMatchThenPay).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SeeMatchThenPay m15523parse(nb5 nb5Var) throws IOException {
            SeeMatchThenPay seeMatchThenPay = new SeeMatchThenPay();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (seeMatchThenPay.groupA != null) {
                        break;
                    }
                    seeMatchThenPay.groupA = SeeMatchGroup.new_();
                    break;
                }
                if (iU == 8) {
                    seeMatchThenPay.fullReleased = nb5Var.g();
                } else if (iU == 16) {
                    seeMatchThenPay.expRunning = nb5Var.g();
                } else {
                    if (iU != 26) {
                        if (seeMatchThenPay.groupA != null) {
                            break;
                        }
                        seeMatchThenPay.groupA = SeeMatchGroup.new_();
                        return seeMatchThenPay;
                    }
                    seeMatchThenPay.groupA = (SeeMatchGroup) nb5Var.l(SeeMatchGroup.PROTOBUF_ADAPTER);
                }
            }
            return seeMatchThenPay;
        }

        public void serialize(SeeMatchThenPay seeMatchThenPay, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, seeMatchThenPay.fullReleased);
            codedOutputByteBufferNano.A(2, seeMatchThenPay.expRunning);
            SeeMatchGroup seeMatchGroup = seeMatchThenPay.groupA;
            if (seeMatchGroup != null) {
                codedOutputByteBufferNano.K(3, seeMatchGroup, SeeMatchGroup.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<SeeMatchThenPay> JSON_ADAPTER = new ObjectJsonAdapter<SeeMatchThenPay>() { // from class: com.p1.mobile.putong.core.data.SeeMatchThenPay.2
        public Class getDataClass() {
            return SeeMatchThenPay.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public SeeMatchThenPay m15524newInstance() {
            return new SeeMatchThenPay();
        }

        public boolean parseField(SeeMatchThenPay seeMatchThenPay, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "fullReleased":
                    seeMatchThenPay.fullReleased = jsonParser.getValueAsBoolean();
                    return true;
                case "groupA":
                    seeMatchThenPay.groupA = (SeeMatchGroup) SeeMatchGroup.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        public void serializeFields(SeeMatchThenPay seeMatchThenPay, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("fullReleased", seeMatchThenPay.fullReleased);
            jsonGenerator.writeBooleanField("expRunning", seeMatchThenPay.expRunning);
            if (seeMatchThenPay.groupA != null) {
                jsonGenerator.writeFieldName("groupA");
                SeeMatchGroup.JSON_ADAPTER.serialize(seeMatchThenPay.groupA, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SeeMatchThenPay) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SeeMatchThenPay) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SeeMatchThenPay new_() {
        SeeMatchThenPay seeMatchThenPay = new SeeMatchThenPay();
        seeMatchThenPay.nullCheck();
        return seeMatchThenPay;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SeeMatchThenPay m15522clone() {
        SeeMatchThenPay seeMatchThenPay = new SeeMatchThenPay();
        seeMatchThenPay.fullReleased = this.fullReleased;
        seeMatchThenPay.expRunning = this.expRunning;
        SeeMatchGroup seeMatchGroup = this.groupA;
        if (seeMatchGroup != null) {
            seeMatchThenPay.groupA = seeMatchGroup.m15518clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((((i * 41) + (this.fullReleased ? 1231 : 1237)) * 41) + (this.expRunning ? 1231 : 1237)) * 41;
        SeeMatchGroup seeMatchGroup = this.groupA;
        int iHashCode = i2 + (seeMatchGroup != null ? seeMatchGroup.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.groupA == null) {
            this.groupA = SeeMatchGroup.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
