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
public class ConversationRefreshIntervalConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "conversationrefreshintervalconfig";

    @ProtobufIndex(index = 2)
    public int conversationListRefreshInterval;

    @ProtobufIndex(index = 1)
    public int conversationRefreshObsInterval;

    @ProtobufIndex(index = 3)
    public boolean monitorEnable;
    public static ProtobufAdapter<ConversationRefreshIntervalConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<ConversationRefreshIntervalConfig>() { // from class: com.p1.mobile.putong.core.data.ConversationRefreshIntervalConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ConversationRefreshIntervalConfig conversationRefreshIntervalConfig) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, conversationRefreshIntervalConfig.conversationRefreshObsInterval) + CodedOutputByteBufferNano.m17281h(2, conversationRefreshIntervalConfig.conversationListRefreshInterval) + CodedOutputByteBufferNano.m17275b(3, conversationRefreshIntervalConfig.monitorEnable);
            conversationRefreshIntervalConfig.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ConversationRefreshIntervalConfig parse(nc5 nc5Var) throws IOException {
            ConversationRefreshIntervalConfig conversationRefreshIntervalConfig = new ConversationRefreshIntervalConfig();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    conversationRefreshIntervalConfig.conversationRefreshObsInterval = nc5Var.m162486j();
                } else if (iM162497u == 16) {
                    conversationRefreshIntervalConfig.conversationListRefreshInterval = nc5Var.m162486j();
                } else {
                    if (iM162497u != 24) {
                        return conversationRefreshIntervalConfig;
                    }
                    conversationRefreshIntervalConfig.monitorEnable = nc5Var.m162483g();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ConversationRefreshIntervalConfig conversationRefreshIntervalConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, conversationRefreshIntervalConfig.conversationRefreshObsInterval);
            codedOutputByteBufferNano.m17305G(2, conversationRefreshIntervalConfig.conversationListRefreshInterval);
            codedOutputByteBufferNano.m17299A(3, conversationRefreshIntervalConfig.monitorEnable);
        }
    };
    public static JsonAdapter<ConversationRefreshIntervalConfig> JSON_ADAPTER = new ObjectJsonAdapter<ConversationRefreshIntervalConfig>() { // from class: com.p1.mobile.putong.core.data.ConversationRefreshIntervalConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ConversationRefreshIntervalConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ConversationRefreshIntervalConfig newInstance() {
            return new ConversationRefreshIntervalConfig();
        }

        public boolean parseField(ConversationRefreshIntervalConfig conversationRefreshIntervalConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "conversationListRefreshInterval":
                    conversationRefreshIntervalConfig.conversationListRefreshInterval = jsonParser.getValueAsInt();
                    return true;
                case "conversationRefreshObsInterval":
                    conversationRefreshIntervalConfig.conversationRefreshObsInterval = jsonParser.getValueAsInt();
                    return true;
                case "monitorEnable":
                    conversationRefreshIntervalConfig.monitorEnable = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ConversationRefreshIntervalConfig conversationRefreshIntervalConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "conversationListRefreshInterval":
                case "conversationRefreshObsInterval":
                case "monitorEnable":
                    return true;
                default:
                    return super.parseFieldCheck(conversationRefreshIntervalConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ConversationRefreshIntervalConfig conversationRefreshIntervalConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("conversationRefreshObsInterval", conversationRefreshIntervalConfig.conversationRefreshObsInterval);
            jsonGenerator.writeNumberField("conversationListRefreshInterval", conversationRefreshIntervalConfig.conversationListRefreshInterval);
            jsonGenerator.writeBooleanField("monitorEnable", conversationRefreshIntervalConfig.monitorEnable);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ConversationRefreshIntervalConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ConversationRefreshIntervalConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ConversationRefreshIntervalConfig new_() {
        ConversationRefreshIntervalConfig conversationRefreshIntervalConfig = new ConversationRefreshIntervalConfig();
        conversationRefreshIntervalConfig.nullCheck();
        return conversationRefreshIntervalConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ConversationRefreshIntervalConfig mo225055clone() {
        ConversationRefreshIntervalConfig conversationRefreshIntervalConfig = new ConversationRefreshIntervalConfig();
        conversationRefreshIntervalConfig.conversationRefreshObsInterval = this.conversationRefreshObsInterval;
        conversationRefreshIntervalConfig.conversationListRefreshInterval = this.conversationListRefreshInterval;
        conversationRefreshIntervalConfig.monitorEnable = this.monitorEnable;
        return conversationRefreshIntervalConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConversationRefreshIntervalConfig)) {
            return false;
        }
        ConversationRefreshIntervalConfig conversationRefreshIntervalConfig = (ConversationRefreshIntervalConfig) obj;
        return this.conversationRefreshObsInterval == conversationRefreshIntervalConfig.conversationRefreshObsInterval && this.conversationListRefreshInterval == conversationRefreshIntervalConfig.conversationListRefreshInterval && this.monitorEnable == conversationRefreshIntervalConfig.monitorEnable;
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
        int i2 = (((((i * 41) + this.conversationRefreshObsInterval) * 41) + this.conversationListRefreshInterval) * 41) + (this.monitorEnable ? 1231 : 1237);
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
