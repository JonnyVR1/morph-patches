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
public class ConversationRefreshIntervalConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "conversationrefreshintervalconfig";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int conversationListRefreshInterval;

    @ProtobufIndex(index = 1)
    public int conversationRefreshObsInterval;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public boolean monitorEnable;
    public static ProtobufAdapter<ConversationRefreshIntervalConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<ConversationRefreshIntervalConfig>() { // from class: com.p1.mobile.putong.core.data.ConversationRefreshIntervalConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ConversationRefreshIntervalConfig conversationRefreshIntervalConfig) {
            int iH = CodedOutputByteBufferNano.h(1, conversationRefreshIntervalConfig.conversationRefreshObsInterval) + CodedOutputByteBufferNano.h(2, conversationRefreshIntervalConfig.conversationListRefreshInterval) + CodedOutputByteBufferNano.b(3, conversationRefreshIntervalConfig.monitorEnable);
            ((MessageNano) conversationRefreshIntervalConfig).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ConversationRefreshIntervalConfig m12421parse(nb5 nb5Var) throws IOException {
            ConversationRefreshIntervalConfig conversationRefreshIntervalConfig = new ConversationRefreshIntervalConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    conversationRefreshIntervalConfig.conversationRefreshObsInterval = nb5Var.j();
                } else if (iU == 16) {
                    conversationRefreshIntervalConfig.conversationListRefreshInterval = nb5Var.j();
                } else {
                    if (iU != 24) {
                        return conversationRefreshIntervalConfig;
                    }
                    conversationRefreshIntervalConfig.monitorEnable = nb5Var.g();
                }
            }
        }

        public void serialize(ConversationRefreshIntervalConfig conversationRefreshIntervalConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, conversationRefreshIntervalConfig.conversationRefreshObsInterval);
            codedOutputByteBufferNano.G(2, conversationRefreshIntervalConfig.conversationListRefreshInterval);
            codedOutputByteBufferNano.A(3, conversationRefreshIntervalConfig.monitorEnable);
        }
    };
    public static JsonAdapter<ConversationRefreshIntervalConfig> JSON_ADAPTER = new ObjectJsonAdapter<ConversationRefreshIntervalConfig>() { // from class: com.p1.mobile.putong.core.data.ConversationRefreshIntervalConfig.2
        public Class getDataClass() {
            return ConversationRefreshIntervalConfig.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ConversationRefreshIntervalConfig m12422newInstance() {
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

        public void serializeFields(ConversationRefreshIntervalConfig conversationRefreshIntervalConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("conversationRefreshObsInterval", conversationRefreshIntervalConfig.conversationRefreshObsInterval);
            jsonGenerator.writeNumberField("conversationListRefreshInterval", conversationRefreshIntervalConfig.conversationListRefreshInterval);
            jsonGenerator.writeBooleanField("monitorEnable", conversationRefreshIntervalConfig.monitorEnable);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ConversationRefreshIntervalConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ConversationRefreshIntervalConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ConversationRefreshIntervalConfig new_() {
        ConversationRefreshIntervalConfig conversationRefreshIntervalConfig = new ConversationRefreshIntervalConfig();
        conversationRefreshIntervalConfig.nullCheck();
        return conversationRefreshIntervalConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ConversationRefreshIntervalConfig m12420clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((i * 41) + this.conversationRefreshObsInterval) * 41) + this.conversationListRefreshInterval) * 41) + (this.monitorEnable ? 1231 : 1237);
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
