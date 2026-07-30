package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.BlockGroupList;
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
import java.util.List;
import p153l.nc5;
import p153l.qcj;

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
            int iM17285l = list != null ? CodedOutputByteBufferNano.m17285l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            blockGroupList.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public BlockGroupList parse(nc5 nc5Var) throws IOException {
            BlockGroupList blockGroupList = new BlockGroupList();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (blockGroupList.blockList != null) {
                        break;
                    }
                    blockGroupList.blockList = new ArrayList();
                    break;
                }
                if (iM162497u != 10) {
                    if (blockGroupList.blockList != null) {
                        break;
                    }
                    blockGroupList.blockList = new ArrayList();
                    return blockGroupList;
                }
                blockGroupList.blockList = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            return blockGroupList;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(BlockGroupList blockGroupList, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = blockGroupList.blockList;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<BlockGroupList> JSON_ADAPTER = new ObjectJsonAdapter<BlockGroupList>() { // from class: com.p1.mobile.putong.core.data.BlockGroupList.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BlockGroupList.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BlockGroupList blockGroupList, JsonGenerator jsonGenerator) throws IOException {
            if (blockGroupList.blockList != null) {
                jsonGenerator.writeFieldName("blockList");
                JsonAdapter.serializeArray(blockGroupList.blockList, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((BlockGroupList) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BlockGroupList) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m36228a(String str) {
        return str;
    }

    public static BlockGroupList new_() {
        BlockGroupList blockGroupList = new BlockGroupList();
        blockGroupList.nullCheck();
        return blockGroupList;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BlockGroupList mo225055clone() {
        BlockGroupList blockGroupList = new BlockGroupList();
        List<String> list = this.blockList;
        if (list != null) {
            blockGroupList.blockList = ValueObject.util_map(list, new qcj() { // from class: l.f43
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return BlockGroupList.m36228a((String) obj);
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
