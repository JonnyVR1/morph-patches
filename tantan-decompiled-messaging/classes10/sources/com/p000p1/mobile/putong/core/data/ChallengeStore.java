package com.p000p1.mobile.putong.core.data;

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
public class ChallengeStore extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "challengestore";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public long lastInsertTime;

    @ProtobufIndex(index = 1)
    public boolean switchStatus;
    public static ProtobufAdapter<ChallengeStore> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChallengeStore>() { // from class: com.p1.mobile.putong.core.data.ChallengeStore.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ChallengeStore challengeStore) {
            int iB = CodedOutputByteBufferNano.b(1, challengeStore.switchStatus) + CodedOutputByteBufferNano.j(2, challengeStore.lastInsertTime);
            ((MessageNano) challengeStore).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ChallengeStore m11961parse(nb5 nb5Var) throws IOException {
            ChallengeStore challengeStore = new ChallengeStore();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    challengeStore.switchStatus = nb5Var.g();
                } else {
                    if (iU != 16) {
                        return challengeStore;
                    }
                    challengeStore.lastInsertTime = nb5Var.k();
                }
            }
        }

        public void serialize(ChallengeStore challengeStore, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, challengeStore.switchStatus);
            codedOutputByteBufferNano.I(2, challengeStore.lastInsertTime);
        }
    };
    public static JsonAdapter<ChallengeStore> JSON_ADAPTER = new ObjectJsonAdapter<ChallengeStore>() { // from class: com.p1.mobile.putong.core.data.ChallengeStore.2
        public Class getDataClass() {
            return ChallengeStore.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ChallengeStore m11962newInstance() {
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

        public void serializeFields(ChallengeStore challengeStore, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("switchStatus", challengeStore.switchStatus);
            jsonGenerator.writeNumberField("lastInsertTime", challengeStore.lastInsertTime);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChallengeStore) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

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
            return (ChallengeStore) JSON_ADAPTER.parse(str);
        } catch (IOException unused) {
            return new_();
        }
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ChallengeStore m11960clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + (this.switchStatus ? 1231 : 1237)) * 41;
        long j = this.lastInsertTime;
        int i3 = i2 + ((int) (j ^ (j >>> 32)));
        ((ValueObject) this).hashCode = i3;
        return i3;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
