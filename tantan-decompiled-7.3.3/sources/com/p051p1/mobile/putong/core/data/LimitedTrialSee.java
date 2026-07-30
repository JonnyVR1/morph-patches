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
public class LimitedTrialSee extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "limitedtrialsee";

    @NonNull
    @ProtobufIndex(index = 1)
    public String actorId;
    public static ProtobufAdapter<LimitedTrialSee> PROTOBUF_ADAPTER = new MessageNanoAdapter<LimitedTrialSee>() { // from class: com.p1.mobile.putong.core.data.LimitedTrialSee.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LimitedTrialSee limitedTrialSee) {
            String str = limitedTrialSee.actorId;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            limitedTrialSee.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LimitedTrialSee parse(nc5 nc5Var) throws IOException {
            LimitedTrialSee limitedTrialSee = new LimitedTrialSee();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (limitedTrialSee.actorId != null) {
                        break;
                    }
                    limitedTrialSee.actorId = "";
                    break;
                }
                if (iM162497u != 10) {
                    if (limitedTrialSee.actorId != null) {
                        break;
                    }
                    limitedTrialSee.actorId = "";
                    return limitedTrialSee;
                }
                limitedTrialSee.actorId = nc5Var.m162495s();
            }
            return limitedTrialSee;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LimitedTrialSee limitedTrialSee, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = limitedTrialSee.actorId;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
        }
    };
    public static JsonAdapter<LimitedTrialSee> JSON_ADAPTER = new ObjectJsonAdapter<LimitedTrialSee>() { // from class: com.p1.mobile.putong.core.data.LimitedTrialSee.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LimitedTrialSee.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LimitedTrialSee newInstance() {
            return new LimitedTrialSee();
        }

        public boolean parseField(LimitedTrialSee limitedTrialSee, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("actorId")) {
                return false;
            }
            limitedTrialSee.actorId = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(LimitedTrialSee limitedTrialSee, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("actorId")) {
                return true;
            }
            return super.parseFieldCheck(limitedTrialSee, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LimitedTrialSee limitedTrialSee, JsonGenerator jsonGenerator) throws IOException {
            String str = limitedTrialSee.actorId;
            if (str != null) {
                jsonGenerator.writeStringField("actorId", str);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LimitedTrialSee) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LimitedTrialSee) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LimitedTrialSee new_() {
        LimitedTrialSee limitedTrialSee = new LimitedTrialSee();
        limitedTrialSee.nullCheck();
        return limitedTrialSee;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LimitedTrialSee mo225055clone() {
        LimitedTrialSee limitedTrialSee = new LimitedTrialSee();
        limitedTrialSee.actorId = this.actorId;
        return limitedTrialSee;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LimitedTrialSee) {
            return ValueObject.util_equals(this.actorId, ((LimitedTrialSee) obj).actorId);
        }
        return false;
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
        String str = this.actorId;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.actorId == null) {
            this.actorId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
