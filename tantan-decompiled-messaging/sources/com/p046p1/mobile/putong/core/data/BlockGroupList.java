package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.BlockGroupList;
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
import java.util.List;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes10.dex */
public class BlockGroupList extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "blockgrouplist";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> blockList;
    public static ProtobufAdapter<BlockGroupList> PROTOBUF_ADAPTER = new MessageNanoAdapter<BlockGroupList>() { // from class: com.p1.mobile.putong.core.data.BlockGroupList.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(BlockGroupList blockGroupList) {
            List<String> list = blockGroupList.blockList;
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            blockGroupList.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public BlockGroupList parse(nb5 nb5Var) throws IOException {
            BlockGroupList blockGroupList = new BlockGroupList();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (blockGroupList.blockList != null) {
                        break;
                    }
                    blockGroupList.blockList = new ArrayList();
                    break;
                }
                if (iM158752u != 10) {
                    if (blockGroupList.blockList != null) {
                        break;
                    }
                    blockGroupList.blockList = new ArrayList();
                    return blockGroupList;
                }
                blockGroupList.blockList = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            return blockGroupList;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(BlockGroupList blockGroupList, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = blockGroupList.blockList;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<BlockGroupList> JSON_ADAPTER = new ObjectJsonAdapter<BlockGroupList>() { // from class: com.p1.mobile.putong.core.data.BlockGroupList.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BlockGroupList.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BlockGroupList newInstance() {
            return new BlockGroupList();
        }

        public boolean parseField(BlockGroupList blockGroupList, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("blockList")) {
                return false;
            }
            blockGroupList.blockList = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(BlockGroupList blockGroupList, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("blockList")) {
                return true;
            }
            return super.parseFieldCheck(blockGroupList, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BlockGroupList blockGroupList, JsonGenerator jsonGenerator) throws IOException {
            if (blockGroupList.blockList != null) {
                jsonGenerator.writeFieldName("blockList");
                JsonAdapter.serializeArray(blockGroupList.blockList, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((BlockGroupList) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BlockGroupList) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m35225a(String str) {
        return str;
    }

    public static BlockGroupList new_() {
        BlockGroupList blockGroupList = new BlockGroupList();
        blockGroupList.nullCheck();
        return blockGroupList;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BlockGroupList mo223809clone() {
        BlockGroupList blockGroupList = new BlockGroupList();
        List<String> list = this.blockList;
        if (list != null) {
            blockGroupList.blockList = ValueObject.util_map(list, new w9j() { // from class: l.p33
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return BlockGroupList.m35225a((String) obj);
                }
            });
        }
        return blockGroupList;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BlockGroupList) {
            return ValueObject.util_equals(this.blockList, ((BlockGroupList) obj).blockList);
        }
        return false;
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
        List<String> list = this.blockList;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.blockList == null) {
            this.blockList = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
