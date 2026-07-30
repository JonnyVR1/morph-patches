package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.BlockGroupList;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class BlockGroupList extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "blockgrouplist";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> blockList;
    public static ProtobufAdapter<BlockGroupList> PROTOBUF_ADAPTER = new MessageNanoAdapter<BlockGroupList>() { // from class: com.p1.mobile.putong.core.data.BlockGroupList.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(BlockGroupList blockGroupList) {
            List<String> list = blockGroupList.blockList;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            ((MessageNano) blockGroupList).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public BlockGroupList m11763parse(nb5 nb5Var) throws IOException {
            BlockGroupList blockGroupList = new BlockGroupList();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (blockGroupList.blockList != null) {
                        break;
                    }
                    blockGroupList.blockList = new ArrayList();
                    break;
                }
                if (iU != 10) {
                    if (blockGroupList.blockList != null) {
                        break;
                    }
                    blockGroupList.blockList = new ArrayList();
                    return blockGroupList;
                }
                blockGroupList.blockList = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            return blockGroupList;
        }

        public void serialize(BlockGroupList blockGroupList, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = blockGroupList.blockList;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<BlockGroupList> JSON_ADAPTER = new ObjectJsonAdapter<BlockGroupList>() { // from class: com.p1.mobile.putong.core.data.BlockGroupList.2
        public Class getDataClass() {
            return BlockGroupList.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public BlockGroupList m11764newInstance() {
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

        public void serializeFields(BlockGroupList blockGroupList, JsonGenerator jsonGenerator) throws IOException {
            if (blockGroupList.blockList != null) {
                jsonGenerator.writeFieldName("blockList");
                JsonAdapter.serializeArray(blockGroupList.blockList, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((BlockGroupList) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BlockGroupList) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m27a(String str) {
        return str;
    }

    public static BlockGroupList new_() {
        BlockGroupList blockGroupList = new BlockGroupList();
        blockGroupList.nullCheck();
        return blockGroupList;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public BlockGroupList m11762clone() {
        BlockGroupList blockGroupList = new BlockGroupList();
        List<String> list = this.blockList;
        if (list != null) {
            blockGroupList.blockList = ValueObject.util_map(list, new w9j() { // from class: l.p33
                public final Object call(Object obj) {
                    return BlockGroupList.m27a((String) obj);
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        List<String> list = this.blockList;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.blockList == null) {
            this.blockList = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
