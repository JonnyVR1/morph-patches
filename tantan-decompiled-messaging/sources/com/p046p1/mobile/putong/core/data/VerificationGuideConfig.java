package com.p046p1.mobile.putong.core.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes10.dex */
public class VerificationGuideConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "verificationguideconfig";

    @ProtobufIndex(index = 2)
    public int displayCount;

    @ProtobufIndex(index = 1)
    public int swipedCard;
    public static ProtobufAdapter<VerificationGuideConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<VerificationGuideConfig>() { // from class: com.p1.mobile.putong.core.data.VerificationGuideConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(VerificationGuideConfig verificationGuideConfig) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, verificationGuideConfig.swipedCard) + CodedOutputByteBufferNano.m17226h(2, verificationGuideConfig.displayCount);
            verificationGuideConfig.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public VerificationGuideConfig parse(nb5 nb5Var) throws IOException {
            VerificationGuideConfig verificationGuideConfig = new VerificationGuideConfig();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    verificationGuideConfig.swipedCard = nb5Var.m158741j();
                } else {
                    if (iM158752u != 16) {
                        return verificationGuideConfig;
                    }
                    verificationGuideConfig.displayCount = nb5Var.m158741j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(VerificationGuideConfig verificationGuideConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, verificationGuideConfig.swipedCard);
            codedOutputByteBufferNano.m17250G(2, verificationGuideConfig.displayCount);
        }
    };
    public static JsonAdapter<VerificationGuideConfig> JSON_ADAPTER = new ObjectJsonAdapter<VerificationGuideConfig>() { // from class: com.p1.mobile.putong.core.data.VerificationGuideConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return VerificationGuideConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public VerificationGuideConfig newInstance() {
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(VerificationGuideConfig verificationGuideConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("swipedCard", verificationGuideConfig.swipedCard);
            jsonGenerator.writeNumberField("displayCount", verificationGuideConfig.displayCount);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VerificationGuideConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VerificationGuideConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static VerificationGuideConfig new_() {
        VerificationGuideConfig verificationGuideConfig = new VerificationGuideConfig();
        verificationGuideConfig.nullCheck();
        return verificationGuideConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public VerificationGuideConfig mo223809clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((i * 41) + this.swipedCard) * 41) + this.displayCount;
        this.hashCode = i2;
        return i2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
