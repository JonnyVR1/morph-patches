package com.p046p1.mobile.putong.core.data;

import androidx.core.app.NotificationCompat;
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
public class BlockedUserStatusData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "blockeduserstatusdata";

    @ProtobufIndex(index = 1)
    public boolean status;
    public static ProtobufAdapter<BlockedUserStatusData> PROTOBUF_ADAPTER = new MessageNanoAdapter<BlockedUserStatusData>() { // from class: com.p1.mobile.putong.core.data.BlockedUserStatusData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(BlockedUserStatusData blockedUserStatusData) {
            int iM17220b = CodedOutputByteBufferNano.m17220b(1, blockedUserStatusData.status);
            blockedUserStatusData.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public BlockedUserStatusData parse(nb5 nb5Var) throws IOException {
            BlockedUserStatusData blockedUserStatusData = new BlockedUserStatusData();
            while (nb5Var.m158752u() == 8) {
                blockedUserStatusData.status = nb5Var.m158738g();
            }
            return blockedUserStatusData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(BlockedUserStatusData blockedUserStatusData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17244A(1, blockedUserStatusData.status);
        }
    };
    public static JsonAdapter<BlockedUserStatusData> JSON_ADAPTER = new ObjectJsonAdapter<BlockedUserStatusData>() { // from class: com.p1.mobile.putong.core.data.BlockedUserStatusData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BlockedUserStatusData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BlockedUserStatusData newInstance() {
            return new BlockedUserStatusData();
        }

        public boolean parseField(BlockedUserStatusData blockedUserStatusData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals(NotificationCompat.CATEGORY_STATUS)) {
                return false;
            }
            blockedUserStatusData.status = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(BlockedUserStatusData blockedUserStatusData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(NotificationCompat.CATEGORY_STATUS)) {
                return true;
            }
            return super.parseFieldCheck(blockedUserStatusData, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BlockedUserStatusData blockedUserStatusData, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField(NotificationCompat.CATEGORY_STATUS, blockedUserStatusData.status);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((BlockedUserStatusData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BlockedUserStatusData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static BlockedUserStatusData new_() {
        BlockedUserStatusData blockedUserStatusData = new BlockedUserStatusData();
        blockedUserStatusData.nullCheck();
        return blockedUserStatusData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BlockedUserStatusData mo223809clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (i * 41) + (this.status ? 1231 : 1237);
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
