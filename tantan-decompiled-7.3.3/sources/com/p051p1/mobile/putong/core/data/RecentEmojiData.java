package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.RecentEmojiData;
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
public class RecentEmojiData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "recentemojidata";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> identifierList;
    public static ProtobufAdapter<RecentEmojiData> PROTOBUF_ADAPTER = new MessageNanoAdapter<RecentEmojiData>() { // from class: com.p1.mobile.putong.core.data.RecentEmojiData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(RecentEmojiData recentEmojiData) {
            List<String> list = recentEmojiData.identifierList;
            int iM17285l = list != null ? CodedOutputByteBufferNano.m17285l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            recentEmojiData.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public RecentEmojiData parse(nc5 nc5Var) throws IOException {
            RecentEmojiData recentEmojiData = new RecentEmojiData();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (recentEmojiData.identifierList != null) {
                        break;
                    }
                    recentEmojiData.identifierList = new ArrayList();
                    break;
                }
                if (iM162497u != 10) {
                    if (recentEmojiData.identifierList != null) {
                        break;
                    }
                    recentEmojiData.identifierList = new ArrayList();
                    return recentEmojiData;
                }
                recentEmojiData.identifierList = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            return recentEmojiData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(RecentEmojiData recentEmojiData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = recentEmojiData.identifierList;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<RecentEmojiData> JSON_ADAPTER = new ObjectJsonAdapter<RecentEmojiData>() { // from class: com.p1.mobile.putong.core.data.RecentEmojiData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return RecentEmojiData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public RecentEmojiData newInstance() {
            return new RecentEmojiData();
        }

        public boolean parseField(RecentEmojiData recentEmojiData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("identifierList")) {
                return false;
            }
            recentEmojiData.identifierList = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(RecentEmojiData recentEmojiData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("identifierList")) {
                return true;
            }
            return super.parseFieldCheck(recentEmojiData, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(RecentEmojiData recentEmojiData, JsonGenerator jsonGenerator) throws IOException {
            if (recentEmojiData.identifierList != null) {
                jsonGenerator.writeFieldName("identifierList");
                JsonAdapter.serializeArray(recentEmojiData.identifierList, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RecentEmojiData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RecentEmojiData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m36816a(String str) {
        return str;
    }

    public static RecentEmojiData new_() {
        RecentEmojiData recentEmojiData = new RecentEmojiData();
        recentEmojiData.nullCheck();
        return recentEmojiData;
    }

    public static RecentEmojiData parse(String str, RecentEmojiData recentEmojiData) {
        try {
            return JSON_ADAPTER.parse(str);
        } catch (IOException unused) {
            return recentEmojiData;
        }
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public RecentEmojiData mo225055clone() {
        RecentEmojiData recentEmojiData = new RecentEmojiData();
        List<String> list = this.identifierList;
        if (list != null) {
            recentEmojiData.identifierList = ValueObject.util_map(list, new qcj() { // from class: l.dpc0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return RecentEmojiData.m36816a((String) obj);
                }
            });
        }
        return recentEmojiData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RecentEmojiData) {
            return ValueObject.util_equals(this.identifierList, ((RecentEmojiData) obj).identifierList);
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
        List<String> list = this.identifierList;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.identifierList == null) {
            this.identifierList = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
