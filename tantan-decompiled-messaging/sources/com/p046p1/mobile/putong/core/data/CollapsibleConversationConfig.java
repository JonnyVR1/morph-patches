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
public class CollapsibleConversationConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "collapsibleconversationconfig";

    @ProtobufIndex(index = 1)
    public boolean enabled;

    @ProtobufIndex(index = 3)
    public int ignorable_unread_msg_days;

    @ProtobufIndex(index = 4)
    public int ignore_msg_days;

    @ProtobufIndex(index = 2)
    public boolean ignore_old_unread_msg;

    @ProtobufIndex(index = 5)
    public int ignore_tip_expose_threshold;

    @ProtobufIndex(index = 6)
    public int last_conversation_not_participating;
    public static ProtobufAdapter<CollapsibleConversationConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<CollapsibleConversationConfig>() { // from class: com.p1.mobile.putong.core.data.CollapsibleConversationConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CollapsibleConversationConfig collapsibleConversationConfig) {
            int iM17220b = CodedOutputByteBufferNano.m17220b(1, collapsibleConversationConfig.enabled) + CodedOutputByteBufferNano.m17220b(2, collapsibleConversationConfig.ignore_old_unread_msg) + CodedOutputByteBufferNano.m17226h(3, collapsibleConversationConfig.ignorable_unread_msg_days) + CodedOutputByteBufferNano.m17226h(4, collapsibleConversationConfig.ignore_msg_days) + CodedOutputByteBufferNano.m17226h(5, collapsibleConversationConfig.ignore_tip_expose_threshold) + CodedOutputByteBufferNano.m17226h(6, collapsibleConversationConfig.last_conversation_not_participating);
            collapsibleConversationConfig.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CollapsibleConversationConfig parse(nb5 nb5Var) throws IOException {
            CollapsibleConversationConfig collapsibleConversationConfig = new CollapsibleConversationConfig();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    collapsibleConversationConfig.enabled = nb5Var.m158738g();
                } else if (iM158752u == 16) {
                    collapsibleConversationConfig.ignore_old_unread_msg = nb5Var.m158738g();
                } else if (iM158752u == 24) {
                    collapsibleConversationConfig.ignorable_unread_msg_days = nb5Var.m158741j();
                } else if (iM158752u == 32) {
                    collapsibleConversationConfig.ignore_msg_days = nb5Var.m158741j();
                } else if (iM158752u == 40) {
                    collapsibleConversationConfig.ignore_tip_expose_threshold = nb5Var.m158741j();
                } else {
                    if (iM158752u != 48) {
                        return collapsibleConversationConfig;
                    }
                    collapsibleConversationConfig.last_conversation_not_participating = nb5Var.m158741j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CollapsibleConversationConfig collapsibleConversationConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17244A(1, collapsibleConversationConfig.enabled);
            codedOutputByteBufferNano.m17244A(2, collapsibleConversationConfig.ignore_old_unread_msg);
            codedOutputByteBufferNano.m17250G(3, collapsibleConversationConfig.ignorable_unread_msg_days);
            codedOutputByteBufferNano.m17250G(4, collapsibleConversationConfig.ignore_msg_days);
            codedOutputByteBufferNano.m17250G(5, collapsibleConversationConfig.ignore_tip_expose_threshold);
            codedOutputByteBufferNano.m17250G(6, collapsibleConversationConfig.last_conversation_not_participating);
        }
    };
    public static JsonAdapter<CollapsibleConversationConfig> JSON_ADAPTER = new ObjectJsonAdapter<CollapsibleConversationConfig>() { // from class: com.p1.mobile.putong.core.data.CollapsibleConversationConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CollapsibleConversationConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CollapsibleConversationConfig newInstance() {
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CollapsibleConversationConfig collapsibleConversationConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("enabled", collapsibleConversationConfig.enabled);
            jsonGenerator.writeBooleanField("ignore_old_unread_msg", collapsibleConversationConfig.ignore_old_unread_msg);
            jsonGenerator.writeNumberField("ignorable_unread_msg_days", collapsibleConversationConfig.ignorable_unread_msg_days);
            jsonGenerator.writeNumberField("ignore_msg_days", collapsibleConversationConfig.ignore_msg_days);
            jsonGenerator.writeNumberField("ignore_tip_expose_threshold", collapsibleConversationConfig.ignore_tip_expose_threshold);
            jsonGenerator.writeNumberField("last_conversation_not_participating", collapsibleConversationConfig.last_conversation_not_participating);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CollapsibleConversationConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CollapsibleConversationConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CollapsibleConversationConfig new_() {
        CollapsibleConversationConfig collapsibleConversationConfig = new CollapsibleConversationConfig();
        collapsibleConversationConfig.nullCheck();
        return collapsibleConversationConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CollapsibleConversationConfig mo223809clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((((((((i * 41) + (this.enabled ? 1231 : 1237)) * 41) + (this.ignore_old_unread_msg ? 1231 : 1237)) * 41) + this.ignorable_unread_msg_days) * 41) + this.ignore_msg_days) * 41) + this.ignore_tip_expose_threshold) * 41) + this.last_conversation_not_participating;
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
