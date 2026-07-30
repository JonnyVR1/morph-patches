package com.p000p1.mobile.putong.core.data;

import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.AiChatAdviceConvs;
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
import java.util.Map;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class AiChatAdviceConvs extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "aichatadviceconvs";

    @Nullable
    @ProtobufIndex(index = 1)
    public Map<String, Long> adviceConvList;
    public static ProtobufAdapter<AiChatAdviceConvs> PROTOBUF_ADAPTER = new MessageNanoAdapter<AiChatAdviceConvs>() { // from class: com.p1.mobile.putong.core.data.AiChatAdviceConvs.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(AiChatAdviceConvs aiChatAdviceConvs) {
            Map<String, Long> map = aiChatAdviceConvs.adviceConvList;
            int iL = map != null ? CodedOutputByteBufferNano.l(1, map, ProtobufAdapter.LONG_BOXED_ADAPTER.MAP_ADAPTER()) : 0;
            ((MessageNano) aiChatAdviceConvs).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public AiChatAdviceConvs m11593parse(nb5 nb5Var) throws IOException {
            AiChatAdviceConvs aiChatAdviceConvs = new AiChatAdviceConvs();
            while (nb5Var.u() == 10) {
                aiChatAdviceConvs.adviceConvList = (Map) nb5Var.l(ProtobufAdapter.LONG_BOXED_ADAPTER.MAP_ADAPTER());
            }
            return aiChatAdviceConvs;
        }

        public void serialize(AiChatAdviceConvs aiChatAdviceConvs, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Map<String, Long> map = aiChatAdviceConvs.adviceConvList;
            if (map != null) {
                codedOutputByteBufferNano.K(1, map, ProtobufAdapter.LONG_BOXED_ADAPTER.MAP_ADAPTER());
            }
        }
    };
    public static JsonAdapter<AiChatAdviceConvs> JSON_ADAPTER = new ObjectJsonAdapter<AiChatAdviceConvs>() { // from class: com.p1.mobile.putong.core.data.AiChatAdviceConvs.2
        public Class getDataClass() {
            return AiChatAdviceConvs.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public AiChatAdviceConvs m11594newInstance() {
            return new AiChatAdviceConvs();
        }

        public boolean parseField(AiChatAdviceConvs aiChatAdviceConvs, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("adviceConvList")) {
                return false;
            }
            aiChatAdviceConvs.adviceConvList = JsonAdapter.parseMap(jsonParser, JsonAdapter.LONG_BOXED_ADAPTER, str2);
            return true;
        }

        public boolean parseFieldCheck(AiChatAdviceConvs aiChatAdviceConvs, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("adviceConvList")) {
                return true;
            }
            return super.parseFieldCheck(aiChatAdviceConvs, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(AiChatAdviceConvs aiChatAdviceConvs, JsonGenerator jsonGenerator) throws IOException {
            if (aiChatAdviceConvs.adviceConvList != null) {
                jsonGenerator.writeFieldName("adviceConvList");
                JsonAdapter.serializeMap(aiChatAdviceConvs.adviceConvList, jsonGenerator, JsonAdapter.LONG_BOXED_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AiChatAdviceConvs) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AiChatAdviceConvs) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Long m17a(Long l2) {
        return l2;
    }

    public static AiChatAdviceConvs new_() {
        AiChatAdviceConvs aiChatAdviceConvs = new AiChatAdviceConvs();
        aiChatAdviceConvs.nullCheck();
        return aiChatAdviceConvs;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AiChatAdviceConvs m11592clone() {
        AiChatAdviceConvs aiChatAdviceConvs = new AiChatAdviceConvs();
        Map<String, Long> map = this.adviceConvList;
        if (map != null) {
            aiChatAdviceConvs.adviceConvList = ValueObject.util_map(map, new w9j() { // from class: l.ah0
                public final Object call(Object obj) {
                    return AiChatAdviceConvs.m17a((Long) obj);
                }
            });
        }
        return aiChatAdviceConvs;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AiChatAdviceConvs) {
            return ValueObject.util_equals(this.adviceConvList, ((AiChatAdviceConvs) obj).adviceConvList);
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
        Map<String, Long> map = this.adviceConvList;
        int iHashCode = i2 + (map != null ? map.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
