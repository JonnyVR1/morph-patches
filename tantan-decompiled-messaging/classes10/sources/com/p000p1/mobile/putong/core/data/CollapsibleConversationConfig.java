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
public class CollapsibleConversationConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "collapsibleconversationconfig";

    @ProtobufIndex(index = 1)
    public boolean enabled;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public int ignorable_unread_msg_days;

    @ProtobufIndex(index = 4)
    public int ignore_msg_days;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public boolean ignore_old_unread_msg;

    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public int ignore_tip_expose_threshold;

    @ProtobufIndex(index = 6)
    public int last_conversation_not_participating;
    public static ProtobufAdapter<CollapsibleConversationConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<CollapsibleConversationConfig>() { // from class: com.p1.mobile.putong.core.data.CollapsibleConversationConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(CollapsibleConversationConfig collapsibleConversationConfig) {
            int iB = CodedOutputByteBufferNano.b(1, collapsibleConversationConfig.enabled) + CodedOutputByteBufferNano.b(2, collapsibleConversationConfig.ignore_old_unread_msg) + CodedOutputByteBufferNano.h(3, collapsibleConversationConfig.ignorable_unread_msg_days) + CodedOutputByteBufferNano.h(4, collapsibleConversationConfig.ignore_msg_days) + CodedOutputByteBufferNano.h(5, collapsibleConversationConfig.ignore_tip_expose_threshold) + CodedOutputByteBufferNano.h(6, collapsibleConversationConfig.last_conversation_not_participating);
            ((MessageNano) collapsibleConversationConfig).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public CollapsibleConversationConfig m12209parse(nb5 nb5Var) throws IOException {
            CollapsibleConversationConfig collapsibleConversationConfig = new CollapsibleConversationConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    collapsibleConversationConfig.enabled = nb5Var.g();
                } else if (iU == 16) {
                    collapsibleConversationConfig.ignore_old_unread_msg = nb5Var.g();
                } else if (iU == 24) {
                    collapsibleConversationConfig.ignorable_unread_msg_days = nb5Var.j();
                } else if (iU == 32) {
                    collapsibleConversationConfig.ignore_msg_days = nb5Var.j();
                } else if (iU == 40) {
                    collapsibleConversationConfig.ignore_tip_expose_threshold = nb5Var.j();
                } else {
                    if (iU != 48) {
                        return collapsibleConversationConfig;
                    }
                    collapsibleConversationConfig.last_conversation_not_participating = nb5Var.j();
                }
            }
        }

        public void serialize(CollapsibleConversationConfig collapsibleConversationConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, collapsibleConversationConfig.enabled);
            codedOutputByteBufferNano.A(2, collapsibleConversationConfig.ignore_old_unread_msg);
            codedOutputByteBufferNano.G(3, collapsibleConversationConfig.ignorable_unread_msg_days);
            codedOutputByteBufferNano.G(4, collapsibleConversationConfig.ignore_msg_days);
            codedOutputByteBufferNano.G(5, collapsibleConversationConfig.ignore_tip_expose_threshold);
            codedOutputByteBufferNano.G(6, collapsibleConversationConfig.last_conversation_not_participating);
        }
    };
    public static JsonAdapter<CollapsibleConversationConfig> JSON_ADAPTER = new ObjectJsonAdapter<CollapsibleConversationConfig>() { // from class: com.p1.mobile.putong.core.data.CollapsibleConversationConfig.2
        public Class getDataClass() {
            return CollapsibleConversationConfig.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public CollapsibleConversationConfig m12210newInstance() {
            return new CollapsibleConversationConfig();
        }

        public boolean parseField(CollapsibleConversationConfig collapsibleConversationConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "enabled":
                    collapsibleConversationConfig.enabled = jsonParser.getValueAsBoolean();
                    return true;
                case "ignore_msg_days":
                    collapsibleConversationConfig.ignore_msg_days = jsonParser.getValueAsInt();
                    return true;
                case "last_conversation_not_participating":
                    collapsibleConversationConfig.last_conversation_not_participating = jsonParser.getValueAsInt();
                    return true;
                case "ignore_old_unread_msg":
                    collapsibleConversationConfig.ignore_old_unread_msg = jsonParser.getValueAsBoolean();
                    return true;
                case "ignore_tip_expose_threshold":
                    collapsibleConversationConfig.ignore_tip_expose_threshold = jsonParser.getValueAsInt();
                    return true;
                case "ignorable_unread_msg_days":
                    collapsibleConversationConfig.ignorable_unread_msg_days = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(CollapsibleConversationConfig collapsibleConversationConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "enabled":
                case "ignore_msg_days":
                case "last_conversation_not_participating":
                case "ignore_old_unread_msg":
                case "ignore_tip_expose_threshold":
                case "ignorable_unread_msg_days":
                    return true;
                default:
                    return super.parseFieldCheck(collapsibleConversationConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(CollapsibleConversationConfig collapsibleConversationConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("enabled", collapsibleConversationConfig.enabled);
            jsonGenerator.writeBooleanField("ignore_old_unread_msg", collapsibleConversationConfig.ignore_old_unread_msg);
            jsonGenerator.writeNumberField("ignorable_unread_msg_days", collapsibleConversationConfig.ignorable_unread_msg_days);
            jsonGenerator.writeNumberField("ignore_msg_days", collapsibleConversationConfig.ignore_msg_days);
            jsonGenerator.writeNumberField("ignore_tip_expose_threshold", collapsibleConversationConfig.ignore_tip_expose_threshold);
            jsonGenerator.writeNumberField("last_conversation_not_participating", collapsibleConversationConfig.last_conversation_not_participating);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CollapsibleConversationConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CollapsibleConversationConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CollapsibleConversationConfig new_() {
        CollapsibleConversationConfig collapsibleConversationConfig = new CollapsibleConversationConfig();
        collapsibleConversationConfig.nullCheck();
        return collapsibleConversationConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public CollapsibleConversationConfig m12208clone() {
        CollapsibleConversationConfig collapsibleConversationConfig = new CollapsibleConversationConfig();
        collapsibleConversationConfig.enabled = this.enabled;
        collapsibleConversationConfig.ignore_old_unread_msg = this.ignore_old_unread_msg;
        collapsibleConversationConfig.ignorable_unread_msg_days = this.ignorable_unread_msg_days;
        collapsibleConversationConfig.ignore_msg_days = this.ignore_msg_days;
        collapsibleConversationConfig.ignore_tip_expose_threshold = this.ignore_tip_expose_threshold;
        collapsibleConversationConfig.last_conversation_not_participating = this.last_conversation_not_participating;
        return collapsibleConversationConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CollapsibleConversationConfig)) {
            return false;
        }
        CollapsibleConversationConfig collapsibleConversationConfig = (CollapsibleConversationConfig) obj;
        return this.enabled == collapsibleConversationConfig.enabled && this.ignore_old_unread_msg == collapsibleConversationConfig.ignore_old_unread_msg && this.ignorable_unread_msg_days == collapsibleConversationConfig.ignorable_unread_msg_days && this.ignore_msg_days == collapsibleConversationConfig.ignore_msg_days && this.ignore_tip_expose_threshold == collapsibleConversationConfig.ignore_tip_expose_threshold && this.last_conversation_not_participating == collapsibleConversationConfig.last_conversation_not_participating;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((((((((i * 41) + (this.enabled ? 1231 : 1237)) * 41) + (this.ignore_old_unread_msg ? 1231 : 1237)) * 41) + this.ignorable_unread_msg_days) * 41) + this.ignore_msg_days) * 41) + this.ignore_tip_expose_threshold) * 41) + this.last_conversation_not_participating;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
