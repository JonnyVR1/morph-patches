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
public class SeeTrialEligible extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "seetrialeligible";

    @ProtobufIndex(index = 1)
    public boolean eligible;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public long expireAt;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String status;
    public static ProtobufAdapter<SeeTrialEligible> PROTOBUF_ADAPTER = new MessageNanoAdapter<SeeTrialEligible>() { // from class: com.p1.mobile.putong.core.data.SeeTrialEligible.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SeeTrialEligible seeTrialEligible) {
            int iB = CodedOutputByteBufferNano.b(1, seeTrialEligible.eligible) + CodedOutputByteBufferNano.j(2, seeTrialEligible.expireAt);
            String str = seeTrialEligible.status;
            if (str != null) {
                iB += CodedOutputByteBufferNano.o(3, str);
            }
            ((MessageNano) seeTrialEligible).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SeeTrialEligible m15551parse(nb5 nb5Var) throws IOException {
            SeeTrialEligible seeTrialEligible = new SeeTrialEligible();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (seeTrialEligible.status != null) {
                        break;
                    }
                    seeTrialEligible.status = "";
                    break;
                }
                if (iU == 8) {
                    seeTrialEligible.eligible = nb5Var.g();
                } else if (iU == 16) {
                    seeTrialEligible.expireAt = nb5Var.k();
                } else {
                    if (iU != 26) {
                        if (seeTrialEligible.status != null) {
                            break;
                        }
                        seeTrialEligible.status = "";
                        return seeTrialEligible;
                    }
                    seeTrialEligible.status = nb5Var.s();
                }
            }
            return seeTrialEligible;
        }

        public void serialize(SeeTrialEligible seeTrialEligible, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, seeTrialEligible.eligible);
            codedOutputByteBufferNano.I(2, seeTrialEligible.expireAt);
            String str = seeTrialEligible.status;
            if (str != null) {
                codedOutputByteBufferNano.R(3, str);
            }
        }
    };
    public static JsonAdapter<SeeTrialEligible> JSON_ADAPTER = new ObjectJsonAdapter<SeeTrialEligible>() { // from class: com.p1.mobile.putong.core.data.SeeTrialEligible.2
        public Class getDataClass() {
            return SeeTrialEligible.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public SeeTrialEligible m15552newInstance() {
            return new SeeTrialEligible();
        }

        public boolean parseField(SeeTrialEligible seeTrialEligible, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "expireAt":
                    seeTrialEligible.expireAt = jsonParser.getValueAsLong();
                    return true;
                case "status":
                    seeTrialEligible.status = jsonParser.getValueAsString();
                    return true;
                case "eligible":
                    seeTrialEligible.eligible = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(SeeTrialEligible seeTrialEligible, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "expireAt":
                case "status":
                case "eligible":
                    return true;
                default:
                    return super.parseFieldCheck(seeTrialEligible, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(SeeTrialEligible seeTrialEligible, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("eligible", seeTrialEligible.eligible);
            jsonGenerator.writeNumberField("expireAt", seeTrialEligible.expireAt);
            String str = seeTrialEligible.status;
            if (str != null) {
                jsonGenerator.writeStringField("status", str);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SeeTrialEligible) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SeeTrialEligible) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SeeTrialEligible new_() {
        SeeTrialEligible seeTrialEligible = new SeeTrialEligible();
        seeTrialEligible.nullCheck();
        return seeTrialEligible;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SeeTrialEligible m15550clone() {
        SeeTrialEligible seeTrialEligible = new SeeTrialEligible();
        seeTrialEligible.eligible = this.eligible;
        seeTrialEligible.expireAt = this.expireAt;
        seeTrialEligible.status = this.status;
        return seeTrialEligible;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SeeTrialEligible)) {
            return false;
        }
        SeeTrialEligible seeTrialEligible = (SeeTrialEligible) obj;
        return this.eligible == seeTrialEligible.eligible && this.expireAt == seeTrialEligible.expireAt && ValueObject.util_equals(this.status, seeTrialEligible.status);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + (this.eligible ? 1231 : 1237)) * 41;
        long j = this.expireAt;
        int i3 = (i2 + ((int) (j ^ (j >>> 32)))) * 41;
        String str = this.status;
        int iHashCode = i3 + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.status == null) {
            this.status = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
