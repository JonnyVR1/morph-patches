package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.Meta;
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
public class BlockedUserStatus extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "blockeduserstatus";

    @NonNull
    @ProtobufIndex(index = 2)
    public BlockedUserStatusData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<BlockedUserStatus> PROTOBUF_ADAPTER = new MessageNanoAdapter<BlockedUserStatus>() { // from class: com.p1.mobile.putong.core.data.BlockedUserStatus.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(BlockedUserStatus blockedUserStatus) {
            Meta meta = blockedUserStatus.meta;
            int iM17230l = meta != null ? CodedOutputByteBufferNano.m17230l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            BlockedUserStatusData blockedUserStatusData = blockedUserStatus.data;
            if (blockedUserStatusData != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, blockedUserStatusData, BlockedUserStatusData.PROTOBUF_ADAPTER);
            }
            blockedUserStatus.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public BlockedUserStatus parse(nb5 nb5Var) throws IOException {
            BlockedUserStatus blockedUserStatus = new BlockedUserStatus();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (blockedUserStatus.meta == null) {
                        blockedUserStatus.meta = Meta.new_();
                    }
                    if (blockedUserStatus.data != null) {
                        break;
                    }
                    blockedUserStatus.data = BlockedUserStatusData.new_();
                    break;
                }
                if (iM158752u == 10) {
                    blockedUserStatus.meta = (Meta) nb5Var.m158743l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 18) {
                        if (blockedUserStatus.meta == null) {
                            blockedUserStatus.meta = Meta.new_();
                        }
                        if (blockedUserStatus.data != null) {
                            break;
                        }
                        blockedUserStatus.data = BlockedUserStatusData.new_();
                        return blockedUserStatus;
                    }
                    blockedUserStatus.data = (BlockedUserStatusData) nb5Var.m158743l(BlockedUserStatusData.PROTOBUF_ADAPTER);
                }
            }
            return blockedUserStatus;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(BlockedUserStatus blockedUserStatus, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = blockedUserStatus.meta;
            if (meta != null) {
                codedOutputByteBufferNano.m17254K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            BlockedUserStatusData blockedUserStatusData = blockedUserStatus.data;
            if (blockedUserStatusData != null) {
                codedOutputByteBufferNano.m17254K(2, blockedUserStatusData, BlockedUserStatusData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<BlockedUserStatus> JSON_ADAPTER = new ObjectJsonAdapter<BlockedUserStatus>() { // from class: com.p1.mobile.putong.core.data.BlockedUserStatus.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BlockedUserStatus.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BlockedUserStatus newInstance() {
            return new BlockedUserStatus();
        }

        public boolean parseField(BlockedUserStatus blockedUserStatus, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                blockedUserStatus.data = BlockedUserStatusData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            blockedUserStatus.meta = Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(BlockedUserStatus blockedUserStatus, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(blockedUserStatus, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BlockedUserStatus blockedUserStatus, JsonGenerator jsonGenerator) throws IOException {
            if (blockedUserStatus.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(blockedUserStatus.meta, jsonGenerator, true);
            }
            if (blockedUserStatus.data != null) {
                jsonGenerator.writeFieldName("data");
                BlockedUserStatusData.JSON_ADAPTER.serialize(blockedUserStatus.data, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((BlockedUserStatus) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BlockedUserStatus) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static BlockedUserStatus new_() {
        BlockedUserStatus blockedUserStatus = new BlockedUserStatus();
        blockedUserStatus.nullCheck();
        return blockedUserStatus;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BlockedUserStatus mo223809clone() {
        BlockedUserStatus blockedUserStatus = new BlockedUserStatus();
        Meta meta = this.meta;
        if (meta != null) {
            blockedUserStatus.meta = meta.mo223809clone();
        }
        BlockedUserStatusData blockedUserStatusData = this.data;
        if (blockedUserStatusData != null) {
            blockedUserStatus.data = blockedUserStatusData.mo223809clone();
        }
        return blockedUserStatus;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BlockedUserStatus)) {
            return false;
        }
        BlockedUserStatus blockedUserStatus = (BlockedUserStatus) obj;
        return ValueObject.util_equals(this.meta, blockedUserStatus.meta) && ValueObject.util_equals(this.data, blockedUserStatus.data);
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
        int i2 = i * 41;
        Meta meta = this.meta;
        int iHashCode = (i2 + (meta != null ? meta.hashCode() : 0)) * 41;
        BlockedUserStatusData blockedUserStatusData = this.data;
        int iHashCode2 = iHashCode + (blockedUserStatusData != null ? blockedUserStatusData.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = BlockedUserStatusData.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
