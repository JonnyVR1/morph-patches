package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
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
public class OutLikeMsgFrontTextConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "outlikemsgfronttextconfig";

    @NonNull
    @ProtobufIndex(index = 1)
    public String female;

    @NonNull
    @ProtobufIndex(index = 2)
    public String male;
    public static ProtobufAdapter<OutLikeMsgFrontTextConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<OutLikeMsgFrontTextConfig>() { // from class: com.p1.mobile.putong.core.data.OutLikeMsgFrontTextConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(OutLikeMsgFrontTextConfig outLikeMsgFrontTextConfig) {
            String str = outLikeMsgFrontTextConfig.female;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = outLikeMsgFrontTextConfig.male;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            outLikeMsgFrontTextConfig.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public OutLikeMsgFrontTextConfig parse(nb5 nb5Var) throws IOException {
            OutLikeMsgFrontTextConfig outLikeMsgFrontTextConfig = new OutLikeMsgFrontTextConfig();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (outLikeMsgFrontTextConfig.female == null) {
                        outLikeMsgFrontTextConfig.female = "";
                    }
                    if (outLikeMsgFrontTextConfig.male != null) {
                        break;
                    }
                    outLikeMsgFrontTextConfig.male = "";
                    break;
                }
                if (iM158752u == 10) {
                    outLikeMsgFrontTextConfig.female = nb5Var.m158750s();
                } else {
                    if (iM158752u != 18) {
                        if (outLikeMsgFrontTextConfig.female == null) {
                            outLikeMsgFrontTextConfig.female = "";
                        }
                        if (outLikeMsgFrontTextConfig.male != null) {
                            break;
                        }
                        outLikeMsgFrontTextConfig.male = "";
                        return outLikeMsgFrontTextConfig;
                    }
                    outLikeMsgFrontTextConfig.male = nb5Var.m158750s();
                }
            }
            return outLikeMsgFrontTextConfig;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(OutLikeMsgFrontTextConfig outLikeMsgFrontTextConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = outLikeMsgFrontTextConfig.female;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = outLikeMsgFrontTextConfig.male;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
        }
    };
    public static JsonAdapter<OutLikeMsgFrontTextConfig> JSON_ADAPTER = new ObjectJsonAdapter<OutLikeMsgFrontTextConfig>() { // from class: com.p1.mobile.putong.core.data.OutLikeMsgFrontTextConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return OutLikeMsgFrontTextConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public OutLikeMsgFrontTextConfig newInstance() {
            return new OutLikeMsgFrontTextConfig();
        }

        public boolean parseField(OutLikeMsgFrontTextConfig outLikeMsgFrontTextConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("female")) {
                outLikeMsgFrontTextConfig.female = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("male")) {
                return false;
            }
            outLikeMsgFrontTextConfig.male = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(OutLikeMsgFrontTextConfig outLikeMsgFrontTextConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("female") || str.equals("male")) {
                return true;
            }
            return super.parseFieldCheck(outLikeMsgFrontTextConfig, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OutLikeMsgFrontTextConfig outLikeMsgFrontTextConfig, JsonGenerator jsonGenerator) throws IOException {
            String str = outLikeMsgFrontTextConfig.female;
            if (str != null) {
                jsonGenerator.writeStringField("female", str);
            }
            String str2 = outLikeMsgFrontTextConfig.male;
            if (str2 != null) {
                jsonGenerator.writeStringField("male", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OutLikeMsgFrontTextConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OutLikeMsgFrontTextConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OutLikeMsgFrontTextConfig new_() {
        OutLikeMsgFrontTextConfig outLikeMsgFrontTextConfig = new OutLikeMsgFrontTextConfig();
        outLikeMsgFrontTextConfig.nullCheck();
        return outLikeMsgFrontTextConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public OutLikeMsgFrontTextConfig mo223809clone() {
        OutLikeMsgFrontTextConfig outLikeMsgFrontTextConfig = new OutLikeMsgFrontTextConfig();
        outLikeMsgFrontTextConfig.female = this.female;
        outLikeMsgFrontTextConfig.male = this.male;
        return outLikeMsgFrontTextConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OutLikeMsgFrontTextConfig)) {
            return false;
        }
        OutLikeMsgFrontTextConfig outLikeMsgFrontTextConfig = (OutLikeMsgFrontTextConfig) obj;
        return ValueObject.util_equals(this.female, outLikeMsgFrontTextConfig.female) && ValueObject.util_equals(this.male, outLikeMsgFrontTextConfig.male);
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
        String str = this.female;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.male;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.female == null) {
            this.female = "";
        }
        if (this.male == null) {
            this.male = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
