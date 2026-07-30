package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
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
public class SeeTrialEligible extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "seetrialeligible";

    @ProtobufIndex(index = 1)
    public boolean eligible;

    @ProtobufIndex(index = 2)
    public long expireAt;

    @NonNull
    @ProtobufIndex(index = 3)
    public String status;
    public static ProtobufAdapter<SeeTrialEligible> PROTOBUF_ADAPTER = new MessageNanoAdapter<SeeTrialEligible>() { // from class: com.p1.mobile.putong.core.data.SeeTrialEligible.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SeeTrialEligible seeTrialEligible) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, seeTrialEligible.eligible) + CodedOutputByteBufferNano.m17283j(2, seeTrialEligible.expireAt);
            String str = seeTrialEligible.status;
            if (str != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(3, str);
            }
            seeTrialEligible.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SeeTrialEligible parse(nc5 nc5Var) throws IOException {
            SeeTrialEligible seeTrialEligible = new SeeTrialEligible();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (seeTrialEligible.status != null) {
                        break;
                    }
                    seeTrialEligible.status = "";
                    break;
                }
                if (iM162497u == 8) {
                    seeTrialEligible.eligible = nc5Var.m162483g();
                } else if (iM162497u == 16) {
                    seeTrialEligible.expireAt = nc5Var.m162487k();
                } else {
                    if (iM162497u != 26) {
                        if (seeTrialEligible.status != null) {
                            break;
                        }
                        seeTrialEligible.status = "";
                        return seeTrialEligible;
                    }
                    seeTrialEligible.status = nc5Var.m162495s();
                }
            }
            return seeTrialEligible;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SeeTrialEligible seeTrialEligible, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, seeTrialEligible.eligible);
            codedOutputByteBufferNano.m17307I(2, seeTrialEligible.expireAt);
            String str = seeTrialEligible.status;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(3, str);
            }
        }
    };
    public static JsonAdapter<SeeTrialEligible> JSON_ADAPTER = new ObjectJsonAdapter<SeeTrialEligible>() { // from class: com.p1.mobile.putong.core.data.SeeTrialEligible.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SeeTrialEligible.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SeeTrialEligible newInstance() {
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SeeTrialEligible seeTrialEligible, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("eligible", seeTrialEligible.eligible);
            jsonGenerator.writeNumberField("expireAt", seeTrialEligible.expireAt);
            String str = seeTrialEligible.status;
            if (str != null) {
                jsonGenerator.writeStringField(NotificationCompat.CATEGORY_STATUS, str);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SeeTrialEligible) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SeeTrialEligible) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SeeTrialEligible new_() {
        SeeTrialEligible seeTrialEligible = new SeeTrialEligible();
        seeTrialEligible.nullCheck();
        return seeTrialEligible;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SeeTrialEligible mo225055clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + (this.eligible ? 1231 : 1237)) * 41;
        long j = this.expireAt;
        int i3 = (i2 + ((int) (j ^ (j >>> 32)))) * 41;
        String str = this.status;
        int iHashCode = i3 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.status == null) {
            this.status = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
