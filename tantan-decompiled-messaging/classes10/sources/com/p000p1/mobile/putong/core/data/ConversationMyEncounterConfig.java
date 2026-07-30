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
public class ConversationMyEncounterConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "conversationmyencounterconfig";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public long nearby_cooldown_interval;

    @ProtobufIndex(index = 1)
    public long see_online_cooldown_interval;
    public static ProtobufAdapter<ConversationMyEncounterConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<ConversationMyEncounterConfig>() { // from class: com.p1.mobile.putong.core.data.ConversationMyEncounterConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ConversationMyEncounterConfig conversationMyEncounterConfig) {
            int iJ = CodedOutputByteBufferNano.j(1, conversationMyEncounterConfig.see_online_cooldown_interval) + CodedOutputByteBufferNano.j(2, conversationMyEncounterConfig.nearby_cooldown_interval);
            ((MessageNano) conversationMyEncounterConfig).cachedSize = iJ;
            return iJ;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ConversationMyEncounterConfig m12397parse(nb5 nb5Var) throws IOException {
            ConversationMyEncounterConfig conversationMyEncounterConfig = new ConversationMyEncounterConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    conversationMyEncounterConfig.see_online_cooldown_interval = nb5Var.k();
                } else {
                    if (iU != 16) {
                        return conversationMyEncounterConfig;
                    }
                    conversationMyEncounterConfig.nearby_cooldown_interval = nb5Var.k();
                }
            }
        }

        public void serialize(ConversationMyEncounterConfig conversationMyEncounterConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.I(1, conversationMyEncounterConfig.see_online_cooldown_interval);
            codedOutputByteBufferNano.I(2, conversationMyEncounterConfig.nearby_cooldown_interval);
        }
    };
    public static JsonAdapter<ConversationMyEncounterConfig> JSON_ADAPTER = new ObjectJsonAdapter<ConversationMyEncounterConfig>() { // from class: com.p1.mobile.putong.core.data.ConversationMyEncounterConfig.2
        public Class getDataClass() {
            return ConversationMyEncounterConfig.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ConversationMyEncounterConfig m12398newInstance() {
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

        public void serializeFields(ConversationMyEncounterConfig conversationMyEncounterConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("see_online_cooldown_interval", conversationMyEncounterConfig.see_online_cooldown_interval);
            jsonGenerator.writeNumberField("nearby_cooldown_interval", conversationMyEncounterConfig.nearby_cooldown_interval);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ConversationMyEncounterConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ConversationMyEncounterConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ConversationMyEncounterConfig new_() {
        ConversationMyEncounterConfig conversationMyEncounterConfig = new ConversationMyEncounterConfig();
        conversationMyEncounterConfig.nullCheck();
        return conversationMyEncounterConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ConversationMyEncounterConfig m12396clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        long j = this.see_online_cooldown_interval;
        int i2 = ((i * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.nearby_cooldown_interval;
        int i3 = i2 + ((int) (j2 ^ (j2 >>> 32)));
        ((ValueObject) this).hashCode = i3;
        return i3;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
