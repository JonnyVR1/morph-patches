package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.data.Meta;
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
public class BlockedUserStatus extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "blockeduserstatus";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public BlockedUserStatusData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<BlockedUserStatus> PROTOBUF_ADAPTER = new MessageNanoAdapter<BlockedUserStatus>() { // from class: com.p1.mobile.putong.core.data.BlockedUserStatus.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(BlockedUserStatus blockedUserStatus) {
            Meta meta = blockedUserStatus.meta;
            int iL = meta != null ? CodedOutputByteBufferNano.l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            BlockedUserStatusData blockedUserStatusData = blockedUserStatus.data;
            if (blockedUserStatusData != null) {
                iL += CodedOutputByteBufferNano.l(2, blockedUserStatusData, BlockedUserStatusData.PROTOBUF_ADAPTER);
            }
            ((MessageNano) blockedUserStatus).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public BlockedUserStatus m11767parse(nb5 nb5Var) throws IOException {
            BlockedUserStatus blockedUserStatus = new BlockedUserStatus();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (blockedUserStatus.meta == null) {
                        blockedUserStatus.meta = Meta.new_();
                    }
                    if (blockedUserStatus.data != null) {
                        break;
                    }
                    blockedUserStatus.data = BlockedUserStatusData.new_();
                    break;
                }
                if (iU == 10) {
                    blockedUserStatus.meta = (Meta) nb5Var.l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 18) {
                        if (blockedUserStatus.meta == null) {
                            blockedUserStatus.meta = Meta.new_();
                        }
                        if (blockedUserStatus.data != null) {
                            break;
                        }
                        blockedUserStatus.data = BlockedUserStatusData.new_();
                        return blockedUserStatus;
                    }
                    blockedUserStatus.data = (BlockedUserStatusData) nb5Var.l(BlockedUserStatusData.PROTOBUF_ADAPTER);
                }
            }
            return blockedUserStatus;
        }

        public void serialize(BlockedUserStatus blockedUserStatus, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = blockedUserStatus.meta;
            if (meta != null) {
                codedOutputByteBufferNano.K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            BlockedUserStatusData blockedUserStatusData = blockedUserStatus.data;
            if (blockedUserStatusData != null) {
                codedOutputByteBufferNano.K(2, blockedUserStatusData, BlockedUserStatusData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<BlockedUserStatus> JSON_ADAPTER = new ObjectJsonAdapter<BlockedUserStatus>() { // from class: com.p1.mobile.putong.core.data.BlockedUserStatus.2
        public Class getDataClass() {
            return BlockedUserStatus.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public BlockedUserStatus m11768newInstance() {
            return new BlockedUserStatus();
        }

        public boolean parseField(BlockedUserStatus blockedUserStatus, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                blockedUserStatus.data = (BlockedUserStatusData) BlockedUserStatusData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            blockedUserStatus.meta = (Meta) Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(BlockedUserStatus blockedUserStatus, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(blockedUserStatus, str, jsonParser, str2, arrayList, dataChecker);
        }

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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((BlockedUserStatus) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BlockedUserStatus) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static BlockedUserStatus new_() {
        BlockedUserStatus blockedUserStatus = new BlockedUserStatus();
        blockedUserStatus.nullCheck();
        return blockedUserStatus;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public BlockedUserStatus m11766clone() {
        BlockedUserStatus blockedUserStatus = new BlockedUserStatus();
        Meta meta = this.meta;
        if (meta != null) {
            blockedUserStatus.meta = meta.clone();
        }
        BlockedUserStatusData blockedUserStatusData = this.data;
        if (blockedUserStatusData != null) {
            blockedUserStatus.data = blockedUserStatusData.m11770clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        Meta meta = this.meta;
        int iHashCode = (i2 + (meta != null ? meta.hashCode() : 0)) * 41;
        BlockedUserStatusData blockedUserStatusData = this.data;
        int iHashCode2 = iHashCode + (blockedUserStatusData != null ? blockedUserStatusData.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = BlockedUserStatusData.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
