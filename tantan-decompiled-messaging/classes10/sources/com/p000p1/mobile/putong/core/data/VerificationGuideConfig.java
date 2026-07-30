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
public class VerificationGuideConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "verificationguideconfig";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int displayCount;

    @ProtobufIndex(index = 1)
    public int swipedCard;
    public static ProtobufAdapter<VerificationGuideConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<VerificationGuideConfig>() { // from class: com.p1.mobile.putong.core.data.VerificationGuideConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(VerificationGuideConfig verificationGuideConfig) {
            int iH = CodedOutputByteBufferNano.h(1, verificationGuideConfig.swipedCard) + CodedOutputByteBufferNano.h(2, verificationGuideConfig.displayCount);
            ((MessageNano) verificationGuideConfig).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public VerificationGuideConfig m16214parse(nb5 nb5Var) throws IOException {
            VerificationGuideConfig verificationGuideConfig = new VerificationGuideConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    verificationGuideConfig.swipedCard = nb5Var.j();
                } else {
                    if (iU != 16) {
                        return verificationGuideConfig;
                    }
                    verificationGuideConfig.displayCount = nb5Var.j();
                }
            }
        }

        public void serialize(VerificationGuideConfig verificationGuideConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, verificationGuideConfig.swipedCard);
            codedOutputByteBufferNano.G(2, verificationGuideConfig.displayCount);
        }
    };
    public static JsonAdapter<VerificationGuideConfig> JSON_ADAPTER = new ObjectJsonAdapter<VerificationGuideConfig>() { // from class: com.p1.mobile.putong.core.data.VerificationGuideConfig.2
        public Class getDataClass() {
            return VerificationGuideConfig.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public VerificationGuideConfig m16215newInstance() {
            return new VerificationGuideConfig();
        }

        public boolean parseField(VerificationGuideConfig verificationGuideConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("swipedCard")) {
                verificationGuideConfig.swipedCard = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals("displayCount")) {
                return false;
            }
            verificationGuideConfig.displayCount = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(VerificationGuideConfig verificationGuideConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("swipedCard") || str.equals("displayCount")) {
                return true;
            }
            return super.parseFieldCheck(verificationGuideConfig, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(VerificationGuideConfig verificationGuideConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("swipedCard", verificationGuideConfig.swipedCard);
            jsonGenerator.writeNumberField("displayCount", verificationGuideConfig.displayCount);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VerificationGuideConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VerificationGuideConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static VerificationGuideConfig new_() {
        VerificationGuideConfig verificationGuideConfig = new VerificationGuideConfig();
        verificationGuideConfig.nullCheck();
        return verificationGuideConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public VerificationGuideConfig m16213clone() {
        VerificationGuideConfig verificationGuideConfig = new VerificationGuideConfig();
        verificationGuideConfig.swipedCard = this.swipedCard;
        verificationGuideConfig.displayCount = this.displayCount;
        return verificationGuideConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VerificationGuideConfig)) {
            return false;
        }
        VerificationGuideConfig verificationGuideConfig = (VerificationGuideConfig) obj;
        return this.swipedCard == verificationGuideConfig.swipedCard && this.displayCount == verificationGuideConfig.displayCount;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((i * 41) + this.swipedCard) * 41) + this.displayCount;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
