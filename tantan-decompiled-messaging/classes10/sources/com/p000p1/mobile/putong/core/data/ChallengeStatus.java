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
public class ChallengeStatus extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "challengestatus";

    @ProtobufIndex(index = 1)
    public boolean autoSendCard;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String showText;
    public static ProtobufAdapter<ChallengeStatus> PROTOBUF_ADAPTER = new MessageNanoAdapter<ChallengeStatus>() { // from class: com.p1.mobile.putong.core.data.ChallengeStatus.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ChallengeStatus challengeStatus) {
            int iB = CodedOutputByteBufferNano.b(1, challengeStatus.autoSendCard);
            String str = challengeStatus.showText;
            if (str != null) {
                iB += CodedOutputByteBufferNano.o(2, str);
            }
            ((MessageNano) challengeStatus).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ChallengeStatus m11957parse(nb5 nb5Var) throws IOException {
            ChallengeStatus challengeStatus = new ChallengeStatus();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (challengeStatus.showText != null) {
                        break;
                    }
                    challengeStatus.showText = "";
                    break;
                }
                if (iU == 8) {
                    challengeStatus.autoSendCard = nb5Var.g();
                } else {
                    if (iU != 18) {
                        if (challengeStatus.showText != null) {
                            break;
                        }
                        challengeStatus.showText = "";
                        return challengeStatus;
                    }
                    challengeStatus.showText = nb5Var.s();
                }
            }
            return challengeStatus;
        }

        public void serialize(ChallengeStatus challengeStatus, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, challengeStatus.autoSendCard);
            String str = challengeStatus.showText;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
        }
    };
    public static JsonAdapter<ChallengeStatus> JSON_ADAPTER = new ObjectJsonAdapter<ChallengeStatus>() { // from class: com.p1.mobile.putong.core.data.ChallengeStatus.2
        public Class getDataClass() {
            return ChallengeStatus.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ChallengeStatus m11958newInstance() {
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

        public void serializeFields(ChallengeStatus challengeStatus, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("autoSendCard", challengeStatus.autoSendCard);
            String str = challengeStatus.showText;
            if (str != null) {
                jsonGenerator.writeStringField("showText", str);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ChallengeStatus) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ChallengeStatus) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ChallengeStatus new_() {
        ChallengeStatus challengeStatus = new ChallengeStatus();
        challengeStatus.nullCheck();
        return challengeStatus;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ChallengeStatus m11956clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + (this.autoSendCard ? 1231 : 1237)) * 41;
        String str = this.showText;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.showText == null) {
            this.showText = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
