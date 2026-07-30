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
public class BlockedUserStatusData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "blockeduserstatusdata";

    @ProtobufIndex(index = 1)
    public boolean status;
    public static ProtobufAdapter<BlockedUserStatusData> PROTOBUF_ADAPTER = new MessageNanoAdapter<BlockedUserStatusData>() { // from class: com.p1.mobile.putong.core.data.BlockedUserStatusData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(BlockedUserStatusData blockedUserStatusData) {
            int iB = CodedOutputByteBufferNano.b(1, blockedUserStatusData.status);
            ((MessageNano) blockedUserStatusData).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public BlockedUserStatusData m11771parse(nb5 nb5Var) throws IOException {
            BlockedUserStatusData blockedUserStatusData = new BlockedUserStatusData();
            while (nb5Var.u() == 8) {
                blockedUserStatusData.status = nb5Var.g();
            }
            return blockedUserStatusData;
        }

        public void serialize(BlockedUserStatusData blockedUserStatusData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, blockedUserStatusData.status);
        }
    };
    public static JsonAdapter<BlockedUserStatusData> JSON_ADAPTER = new ObjectJsonAdapter<BlockedUserStatusData>() { // from class: com.p1.mobile.putong.core.data.BlockedUserStatusData.2
        public Class getDataClass() {
            return BlockedUserStatusData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public BlockedUserStatusData m11772newInstance() {
            return new BlockedUserStatusData();
        }

        public boolean parseField(BlockedUserStatusData blockedUserStatusData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("status")) {
                return false;
            }
            blockedUserStatusData.status = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(BlockedUserStatusData blockedUserStatusData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("status")) {
                return true;
            }
            return super.parseFieldCheck(blockedUserStatusData, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(BlockedUserStatusData blockedUserStatusData, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("status", blockedUserStatusData.status);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((BlockedUserStatusData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BlockedUserStatusData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static BlockedUserStatusData new_() {
        BlockedUserStatusData blockedUserStatusData = new BlockedUserStatusData();
        blockedUserStatusData.nullCheck();
        return blockedUserStatusData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public BlockedUserStatusData m11770clone() {
        BlockedUserStatusData blockedUserStatusData = new BlockedUserStatusData();
        blockedUserStatusData.status = this.status;
        return blockedUserStatusData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof BlockedUserStatusData) && this.status == ((BlockedUserStatusData) obj).status;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (i * 41) + (this.status ? 1231 : 1237);
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
