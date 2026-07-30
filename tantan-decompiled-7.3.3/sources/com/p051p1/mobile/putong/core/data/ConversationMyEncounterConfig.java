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
public class ConversationMyEncounterConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "conversationmyencounterconfig";

    @ProtobufIndex(index = 2)
    public long nearby_cooldown_interval;

    @ProtobufIndex(index = 1)
    public long see_online_cooldown_interval;
    public static ProtobufAdapter<ConversationMyEncounterConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<ConversationMyEncounterConfig>() { // from class: com.p1.mobile.putong.core.data.ConversationMyEncounterConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ConversationMyEncounterConfig conversationMyEncounterConfig) {
            int iM17283j = CodedOutputByteBufferNano.m17283j(1, conversationMyEncounterConfig.see_online_cooldown_interval) + CodedOutputByteBufferNano.m17283j(2, conversationMyEncounterConfig.nearby_cooldown_interval);
            conversationMyEncounterConfig.cachedSize = iM17283j;
            return iM17283j;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ConversationMyEncounterConfig parse(nc5 nc5Var) throws IOException {
            ConversationMyEncounterConfig conversationMyEncounterConfig = new ConversationMyEncounterConfig();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    conversationMyEncounterConfig.see_online_cooldown_interval = nc5Var.m162487k();
                } else {
                    if (iM162497u != 16) {
                        return conversationMyEncounterConfig;
                    }
                    conversationMyEncounterConfig.nearby_cooldown_interval = nc5Var.m162487k();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ConversationMyEncounterConfig conversationMyEncounterConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17307I(1, conversationMyEncounterConfig.see_online_cooldown_interval);
            codedOutputByteBufferNano.m17307I(2, conversationMyEncounterConfig.nearby_cooldown_interval);
        }
    };
    public static JsonAdapter<ConversationMyEncounterConfig> JSON_ADAPTER = new ObjectJsonAdapter<ConversationMyEncounterConfig>() { // from class: com.p1.mobile.putong.core.data.ConversationMyEncounterConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ConversationMyEncounterConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ConversationMyEncounterConfig newInstance() {
            return new ConversationMyEncounterConfig();
        }

        public boolean parseField(ConversationMyEncounterConfig conversationMyEncounterConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("nearby_cooldown_interval")) {
                conversationMyEncounterConfig.nearby_cooldown_interval = jsonParser.getValueAsLong();
                return true;
            }
            if (!str.equals("see_online_cooldown_interval")) {
                return false;
            }
            conversationMyEncounterConfig.see_online_cooldown_interval = jsonParser.getValueAsLong();
            return true;
        }

        public boolean parseFieldCheck(ConversationMyEncounterConfig conversationMyEncounterConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("nearby_cooldown_interval") || str.equals("see_online_cooldown_interval")) {
                return true;
            }
            return super.parseFieldCheck(conversationMyEncounterConfig, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ConversationMyEncounterConfig conversationMyEncounterConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("see_online_cooldown_interval", conversationMyEncounterConfig.see_online_cooldown_interval);
            jsonGenerator.writeNumberField("nearby_cooldown_interval", conversationMyEncounterConfig.nearby_cooldown_interval);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ConversationMyEncounterConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ConversationMyEncounterConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ConversationMyEncounterConfig new_() {
        ConversationMyEncounterConfig conversationMyEncounterConfig = new ConversationMyEncounterConfig();
        conversationMyEncounterConfig.nullCheck();
        return conversationMyEncounterConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ConversationMyEncounterConfig mo225055clone() {
        ConversationMyEncounterConfig conversationMyEncounterConfig = new ConversationMyEncounterConfig();
        conversationMyEncounterConfig.see_online_cooldown_interval = this.see_online_cooldown_interval;
        conversationMyEncounterConfig.nearby_cooldown_interval = this.nearby_cooldown_interval;
        return conversationMyEncounterConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConversationMyEncounterConfig)) {
            return false;
        }
        ConversationMyEncounterConfig conversationMyEncounterConfig = (ConversationMyEncounterConfig) obj;
        return this.see_online_cooldown_interval == conversationMyEncounterConfig.see_online_cooldown_interval && this.nearby_cooldown_interval == conversationMyEncounterConfig.nearby_cooldown_interval;
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
        long j = this.see_online_cooldown_interval;
        int i2 = ((i * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.nearby_cooldown_interval;
        int i3 = i2 + ((int) (j2 ^ (j2 >>> 32)));
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
