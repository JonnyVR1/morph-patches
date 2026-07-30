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
public class Permissions extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "permissions";

    @ProtobufIndex(index = 3)
    public boolean canChangeJoinCondition;

    @ProtobufIndex(index = 2)
    public boolean canShareToTantan;

    @ProtobufIndex(index = 1)
    public boolean canShareToWeChat;
    public static ProtobufAdapter<Permissions> PROTOBUF_ADAPTER = new MessageNanoAdapter<Permissions>() { // from class: com.p1.mobile.putong.core.data.Permissions.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Permissions permissions) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, permissions.canShareToWeChat) + CodedOutputByteBufferNano.m17275b(2, permissions.canShareToTantan) + CodedOutputByteBufferNano.m17275b(3, permissions.canChangeJoinCondition);
            permissions.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Permissions parse(nc5 nc5Var) throws IOException {
            Permissions permissions = new Permissions();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    permissions.canShareToWeChat = nc5Var.m162483g();
                } else if (iM162497u == 16) {
                    permissions.canShareToTantan = nc5Var.m162483g();
                } else {
                    if (iM162497u != 24) {
                        return permissions;
                    }
                    permissions.canChangeJoinCondition = nc5Var.m162483g();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Permissions permissions, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, permissions.canShareToWeChat);
            codedOutputByteBufferNano.m17299A(2, permissions.canShareToTantan);
            codedOutputByteBufferNano.m17299A(3, permissions.canChangeJoinCondition);
        }
    };
    public static JsonAdapter<Permissions> JSON_ADAPTER = new ObjectJsonAdapter<Permissions>() { // from class: com.p1.mobile.putong.core.data.Permissions.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Permissions.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Permissions newInstance() {
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Permissions permissions, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("canShareToWeChat", permissions.canShareToWeChat);
            jsonGenerator.writeBooleanField("canShareToTantan", permissions.canShareToTantan);
            jsonGenerator.writeBooleanField("canChangeJoinCondition", permissions.canChangeJoinCondition);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Permissions) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Permissions) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Permissions new_() {
        Permissions permissions = new Permissions();
        permissions.nullCheck();
        return permissions;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Permissions mo225055clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((i * 41) + (this.canShareToWeChat ? 1231 : 1237)) * 41) + (this.canShareToTantan ? 1231 : 1237)) * 41) + (this.canChangeJoinCondition ? 1231 : 1237);
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
