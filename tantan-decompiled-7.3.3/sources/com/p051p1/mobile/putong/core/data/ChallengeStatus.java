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
public class ChallengeStatus extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "challengestatus";

    @ProtobufIndex(index = 1)
    public boolean autoSendCard;

    @NonNull
    @ProtobufIndex(index = 2)
    public String showText;
    public static ProtobufAdapter<ChallengeStatus> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChallengeStatus>() { // from class: com.p1.mobile.putong.core.data.ChallengeStatus.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ChallengeStatus challengeStatus) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, challengeStatus.autoSendCard);
            String str = challengeStatus.showText;
            if (str != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(2, str);
            }
            challengeStatus.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ChallengeStatus parse(nc5 nc5Var) throws IOException {
            ChallengeStatus challengeStatus = new ChallengeStatus();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (challengeStatus.showText != null) {
                        break;
                    }
                    challengeStatus.showText = "";
                    break;
                }
                if (iM162497u == 8) {
                    challengeStatus.autoSendCard = nc5Var.m162483g();
                } else {
                    if (iM162497u != 18) {
                        if (challengeStatus.showText != null) {
                            break;
                        }
                        challengeStatus.showText = "";
                        return challengeStatus;
                    }
                    challengeStatus.showText = nc5Var.m162495s();
                }
            }
            return challengeStatus;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ChallengeStatus challengeStatus, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, challengeStatus.autoSendCard);
            String str = challengeStatus.showText;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(2, str);
            }
        }
    };
    public static JsonAdapter<ChallengeStatus> JSON_ADAPTER = new ObjectJsonAdapter<ChallengeStatus>() { // from class: com.p1.mobile.putong.core.data.ChallengeStatus.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ChallengeStatus.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ChallengeStatus newInstance() {
            return new ChallengeStatus();
        }

        public boolean parseField(ChallengeStatus challengeStatus, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("showText")) {
                challengeStatus.showText = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("autoSendCard")) {
                return false;
            }
            challengeStatus.autoSendCard = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(ChallengeStatus challengeStatus, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("showText") || str.equals("autoSendCard")) {
                return true;
            }
            return super.parseFieldCheck(challengeStatus, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ChallengeStatus challengeStatus, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("autoSendCard", challengeStatus.autoSendCard);
            String str = challengeStatus.showText;
            if (str != null) {
                jsonGenerator.writeStringField("showText", str);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChallengeStatus) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChallengeStatus) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ChallengeStatus new_() {
        ChallengeStatus challengeStatus = new ChallengeStatus();
        challengeStatus.nullCheck();
        return challengeStatus;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ChallengeStatus mo225055clone() {
        ChallengeStatus challengeStatus = new ChallengeStatus();
        challengeStatus.autoSendCard = this.autoSendCard;
        challengeStatus.showText = this.showText;
        return challengeStatus;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ChallengeStatus)) {
            return false;
        }
        ChallengeStatus challengeStatus = (ChallengeStatus) obj;
        return this.autoSendCard == challengeStatus.autoSendCard && ValueObject.util_equals(this.showText, challengeStatus.showText);
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
        int i2 = ((i * 41) + (this.autoSendCard ? 1231 : 1237)) * 41;
        String str = this.showText;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.showText == null) {
            this.showText = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
