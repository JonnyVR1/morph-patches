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
public class MsgIcebreakConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "msgicebreakconfig";

    @ProtobufIndex(index = 1)
    public boolean enable;

    @NonNull
    @ProtobufIndex(index = 3)
    public String femaleType;

    @NonNull
    @ProtobufIndex(index = 2)
    public String maleType;
    public static ProtobufAdapter<MsgIcebreakConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<MsgIcebreakConfig>() { // from class: com.p1.mobile.putong.core.data.MsgIcebreakConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MsgIcebreakConfig msgIcebreakConfig) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, msgIcebreakConfig.enable);
            String str = msgIcebreakConfig.maleType;
            if (str != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(2, str);
            }
            String str2 = msgIcebreakConfig.femaleType;
            if (str2 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(3, str2);
            }
            msgIcebreakConfig.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MsgIcebreakConfig parse(nc5 nc5Var) throws IOException {
            MsgIcebreakConfig msgIcebreakConfig = new MsgIcebreakConfig();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (msgIcebreakConfig.maleType == null) {
                        msgIcebreakConfig.maleType = "";
                    }
                    if (msgIcebreakConfig.femaleType != null) {
                        break;
                    }
                    msgIcebreakConfig.femaleType = "";
                    break;
                }
                if (iM162497u == 8) {
                    msgIcebreakConfig.enable = nc5Var.m162483g();
                } else if (iM162497u == 18) {
                    msgIcebreakConfig.maleType = nc5Var.m162495s();
                } else {
                    if (iM162497u != 26) {
                        if (msgIcebreakConfig.maleType == null) {
                            msgIcebreakConfig.maleType = "";
                        }
                        if (msgIcebreakConfig.femaleType != null) {
                            break;
                        }
                        msgIcebreakConfig.femaleType = "";
                        return msgIcebreakConfig;
                    }
                    msgIcebreakConfig.femaleType = nc5Var.m162495s();
                }
            }
            return msgIcebreakConfig;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MsgIcebreakConfig msgIcebreakConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, msgIcebreakConfig.enable);
            String str = msgIcebreakConfig.maleType;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(2, str);
            }
            String str2 = msgIcebreakConfig.femaleType;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(3, str2);
            }
        }
    };
    public static JsonAdapter<MsgIcebreakConfig> JSON_ADAPTER = new ObjectJsonAdapter<MsgIcebreakConfig>() { // from class: com.p1.mobile.putong.core.data.MsgIcebreakConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MsgIcebreakConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MsgIcebreakConfig newInstance() {
            return new MsgIcebreakConfig();
        }

        public boolean parseField(MsgIcebreakConfig msgIcebreakConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "enable":
                    msgIcebreakConfig.enable = jsonParser.getValueAsBoolean();
                    return true;
                case "femaleType":
                    msgIcebreakConfig.femaleType = jsonParser.getValueAsString();
                    return true;
                case "maleType":
                    msgIcebreakConfig.maleType = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MsgIcebreakConfig msgIcebreakConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "enable":
                case "femaleType":
                case "maleType":
                    return true;
                default:
                    return super.parseFieldCheck(msgIcebreakConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MsgIcebreakConfig msgIcebreakConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("enable", msgIcebreakConfig.enable);
            String str = msgIcebreakConfig.maleType;
            if (str != null) {
                jsonGenerator.writeStringField("maleType", str);
            }
            String str2 = msgIcebreakConfig.femaleType;
            if (str2 != null) {
                jsonGenerator.writeStringField("femaleType", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MsgIcebreakConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MsgIcebreakConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MsgIcebreakConfig new_() {
        MsgIcebreakConfig msgIcebreakConfig = new MsgIcebreakConfig();
        msgIcebreakConfig.nullCheck();
        return msgIcebreakConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MsgIcebreakConfig mo225055clone() {
        MsgIcebreakConfig msgIcebreakConfig = new MsgIcebreakConfig();
        msgIcebreakConfig.enable = this.enable;
        msgIcebreakConfig.maleType = this.maleType;
        msgIcebreakConfig.femaleType = this.femaleType;
        return msgIcebreakConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MsgIcebreakConfig)) {
            return false;
        }
        MsgIcebreakConfig msgIcebreakConfig = (MsgIcebreakConfig) obj;
        return this.enable == msgIcebreakConfig.enable && ValueObject.util_equals(this.maleType, msgIcebreakConfig.maleType) && ValueObject.util_equals(this.femaleType, msgIcebreakConfig.femaleType);
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
        int i2 = ((i * 41) + (this.enable ? 1231 : 1237)) * 41;
        String str = this.maleType;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.femaleType;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.maleType == null) {
            this.maleType = "";
        }
        if (this.femaleType == null) {
            this.femaleType = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
