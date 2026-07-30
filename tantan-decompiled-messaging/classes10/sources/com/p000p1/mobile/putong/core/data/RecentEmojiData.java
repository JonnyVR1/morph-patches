package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.RecentEmojiData;
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
public class RecentEmojiData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "recentemojidata";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> identifierList;
    public static ProtobufAdapter<RecentEmojiData> PROTOBUF_ADAPTER = new MessageNanoAdapter<RecentEmojiData>() { // from class: com.p1.mobile.putong.core.data.RecentEmojiData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(RecentEmojiData recentEmojiData) {
            List<String> list = recentEmojiData.identifierList;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            ((MessageNano) recentEmojiData).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public RecentEmojiData m15317parse(nb5 nb5Var) throws IOException {
            RecentEmojiData recentEmojiData = new RecentEmojiData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (recentEmojiData.identifierList != null) {
                        break;
                    }
                    recentEmojiData.identifierList = new ArrayList();
                    break;
                }
                if (iU != 10) {
                    if (recentEmojiData.identifierList != null) {
                        break;
                    }
                    recentEmojiData.identifierList = new ArrayList();
                    return recentEmojiData;
                }
                recentEmojiData.identifierList = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            return recentEmojiData;
        }

        public void serialize(RecentEmojiData recentEmojiData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = recentEmojiData.identifierList;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<RecentEmojiData> JSON_ADAPTER = new ObjectJsonAdapter<RecentEmojiData>() { // from class: com.p1.mobile.putong.core.data.RecentEmojiData.2
        public Class getDataClass() {
            return RecentEmojiData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public RecentEmojiData m15318newInstance() {
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

        public void serializeFields(RecentEmojiData recentEmojiData, JsonGenerator jsonGenerator) throws IOException {
            if (recentEmojiData.identifierList != null) {
                jsonGenerator.writeFieldName("identifierList");
                JsonAdapter.serializeArray(recentEmojiData.identifierList, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RecentEmojiData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RecentEmojiData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m615a(String str) {
        return str;
    }

    public static RecentEmojiData new_() {
        RecentEmojiData recentEmojiData = new RecentEmojiData();
        recentEmojiData.nullCheck();
        return recentEmojiData;
    }

    public static RecentEmojiData parse(String str, RecentEmojiData recentEmojiData) {
        try {
            return (RecentEmojiData) JSON_ADAPTER.parse(str);
        } catch (IOException unused) {
            return recentEmojiData;
        }
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public RecentEmojiData m15316clone() {
        RecentEmojiData recentEmojiData = new RecentEmojiData();
        List<String> list = this.identifierList;
        if (list != null) {
            recentEmojiData.identifierList = ValueObject.util_map(list, new w9j() { // from class: l.wgc0
                public final Object call(Object obj) {
                    return RecentEmojiData.m615a((String) obj);
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        List<String> list = this.identifierList;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.identifierList == null) {
            this.identifierList = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
