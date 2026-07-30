package com.p051p1.mobile.putong.core.data;

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
public class ChallengeStore extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "challengestore";

    @ProtobufIndex(index = 2)
    public long lastInsertTime;

    @ProtobufIndex(index = 1)
    public boolean switchStatus;
    public static ProtobufAdapter<ChallengeStore> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChallengeStore>() { // from class: com.p1.mobile.putong.core.data.ChallengeStore.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ChallengeStore challengeStore) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, challengeStore.switchStatus) + CodedOutputByteBufferNano.m17283j(2, challengeStore.lastInsertTime);
            challengeStore.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ChallengeStore parse(nc5 nc5Var) throws IOException {
            ChallengeStore challengeStore = new ChallengeStore();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    challengeStore.switchStatus = nc5Var.m162483g();
                } else {
                    if (iM162497u != 16) {
                        return challengeStore;
                    }
                    challengeStore.lastInsertTime = nc5Var.m162487k();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ChallengeStore challengeStore, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, challengeStore.switchStatus);
            codedOutputByteBufferNano.m17307I(2, challengeStore.lastInsertTime);
        }
    };
    public static JsonAdapter<ChallengeStore> JSON_ADAPTER = new ObjectJsonAdapter<ChallengeStore>() { // from class: com.p1.mobile.putong.core.data.ChallengeStore.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ChallengeStore.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ChallengeStore newInstance() {
            return new ChallengeStore();
        }

        public boolean parseField(ChallengeStore challengeStore, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("lastInsertTime")) {
                challengeStore.lastInsertTime = jsonParser.getValueAsLong();
                return true;
            }
            if (!str.equals("switchStatus")) {
                return false;
            }
            challengeStore.switchStatus = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(ChallengeStore challengeStore, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("lastInsertTime") || str.equals("switchStatus")) {
                return true;
            }
            return super.parseFieldCheck(challengeStore, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ChallengeStore challengeStore, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("switchStatus", challengeStore.switchStatus);
            jsonGenerator.writeNumberField("lastInsertTime", challengeStore.lastInsertTime);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChallengeStore) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChallengeStore) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ChallengeStore new_() {
        ChallengeStore challengeStore = new ChallengeStore();
        challengeStore.nullCheck();
        return challengeStore;
    }

    public static ChallengeStore parse(String str) {
        try {
            return JSON_ADAPTER.parse(str);
        } catch (IOException unused) {
            return new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ChallengeStore mo225055clone() {
        ChallengeStore challengeStore = new ChallengeStore();
        challengeStore.switchStatus = this.switchStatus;
        challengeStore.lastInsertTime = this.lastInsertTime;
        return challengeStore;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ChallengeStore)) {
            return false;
        }
        ChallengeStore challengeStore = (ChallengeStore) obj;
        return this.switchStatus == challengeStore.switchStatus && this.lastInsertTime == challengeStore.lastInsertTime;
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
        int i2 = ((i * 41) + (this.switchStatus ? 1231 : 1237)) * 41;
        long j = this.lastInsertTime;
        int i3 = i2 + ((int) (j ^ (j >>> 32)));
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
