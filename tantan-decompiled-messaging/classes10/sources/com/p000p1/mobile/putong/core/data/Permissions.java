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
public class Permissions extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "permissions";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public boolean canChangeJoinCondition;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public boolean canShareToTantan;

    @ProtobufIndex(index = 1)
    public boolean canShareToWeChat;
    public static ProtobufAdapter<Permissions> PROTOBUF_ADAPTER = new MessageNanoAdapter<Permissions>() { // from class: com.p1.mobile.putong.core.data.Permissions.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Permissions permissions) {
            int iB = CodedOutputByteBufferNano.b(1, permissions.canShareToWeChat) + CodedOutputByteBufferNano.b(2, permissions.canShareToTantan) + CodedOutputByteBufferNano.b(3, permissions.canChangeJoinCondition);
            ((MessageNano) permissions).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Permissions m14747parse(nb5 nb5Var) throws IOException {
            Permissions permissions = new Permissions();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    permissions.canShareToWeChat = nb5Var.g();
                } else if (iU == 16) {
                    permissions.canShareToTantan = nb5Var.g();
                } else {
                    if (iU != 24) {
                        return permissions;
                    }
                    permissions.canChangeJoinCondition = nb5Var.g();
                }
            }
        }

        public void serialize(Permissions permissions, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, permissions.canShareToWeChat);
            codedOutputByteBufferNano.A(2, permissions.canShareToTantan);
            codedOutputByteBufferNano.A(3, permissions.canChangeJoinCondition);
        }
    };
    public static JsonAdapter<Permissions> JSON_ADAPTER = new ObjectJsonAdapter<Permissions>() { // from class: com.p1.mobile.putong.core.data.Permissions.2
        public Class getDataClass() {
            return Permissions.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public Permissions m14748newInstance() {
            return new Permissions();
        }

        public boolean parseField(Permissions permissions, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "canShareToTantan":
                    permissions.canShareToTantan = jsonParser.getValueAsBoolean();
                    return true;
                case "canShareToWeChat":
                    permissions.canShareToWeChat = jsonParser.getValueAsBoolean();
                    return true;
                case "canChangeJoinCondition":
                    permissions.canChangeJoinCondition = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(Permissions permissions, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "canShareToTantan":
                case "canShareToWeChat":
                case "canChangeJoinCondition":
                    return true;
                default:
                    return super.parseFieldCheck(permissions, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(Permissions permissions, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("canShareToWeChat", permissions.canShareToWeChat);
            jsonGenerator.writeBooleanField("canShareToTantan", permissions.canShareToTantan);
            jsonGenerator.writeBooleanField("canChangeJoinCondition", permissions.canChangeJoinCondition);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Permissions) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Permissions) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Permissions new_() {
        Permissions permissions = new Permissions();
        permissions.nullCheck();
        return permissions;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Permissions m14746clone() {
        Permissions permissions = new Permissions();
        permissions.canShareToWeChat = this.canShareToWeChat;
        permissions.canShareToTantan = this.canShareToTantan;
        permissions.canChangeJoinCondition = this.canChangeJoinCondition;
        return permissions;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Permissions)) {
            return false;
        }
        Permissions permissions = (Permissions) obj;
        return this.canShareToWeChat == permissions.canShareToWeChat && this.canShareToTantan == permissions.canShareToTantan && this.canChangeJoinCondition == permissions.canChangeJoinCondition;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((i * 41) + (this.canShareToWeChat ? 1231 : 1237)) * 41) + (this.canShareToTantan ? 1231 : 1237)) * 41) + (this.canChangeJoinCondition ? 1231 : 1237);
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
