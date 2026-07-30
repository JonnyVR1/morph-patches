package com.p046p1.mobile.putong.core.data;

import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.AiChatAdviceConvs;
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
import java.util.Map;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes10.dex */
public class AiChatAdviceConvs extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "aichatadviceconvs";

    @Nullable
    @ProtobufIndex(index = 1)
    public Map<String, Long> adviceConvList;
    public static ProtobufAdapter<AiChatAdviceConvs> PROTOBUF_ADAPTER = new MessageNanoAdapter<AiChatAdviceConvs>() { // from class: com.p1.mobile.putong.core.data.AiChatAdviceConvs.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(AiChatAdviceConvs aiChatAdviceConvs) {
            Map<String, Long> map = aiChatAdviceConvs.adviceConvList;
            int iM17230l = map != null ? CodedOutputByteBufferNano.m17230l(1, map, ProtobufAdapter.LONG_BOXED_ADAPTER.MAP_ADAPTER()) : 0;
            aiChatAdviceConvs.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AiChatAdviceConvs parse(nb5 nb5Var) throws IOException {
            AiChatAdviceConvs aiChatAdviceConvs = new AiChatAdviceConvs();
            while (nb5Var.m158752u() == 10) {
                aiChatAdviceConvs.adviceConvList = (Map) nb5Var.m158743l(ProtobufAdapter.LONG_BOXED_ADAPTER.MAP_ADAPTER());
            }
            return aiChatAdviceConvs;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AiChatAdviceConvs aiChatAdviceConvs, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Map<String, Long> map = aiChatAdviceConvs.adviceConvList;
            if (map != null) {
                codedOutputByteBufferNano.m17254K(1, map, ProtobufAdapter.LONG_BOXED_ADAPTER.MAP_ADAPTER());
            }
        }
    };
    public static JsonAdapter<AiChatAdviceConvs> JSON_ADAPTER = new ObjectJsonAdapter<AiChatAdviceConvs>() { // from class: com.p1.mobile.putong.core.data.AiChatAdviceConvs.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AiChatAdviceConvs.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public AiChatAdviceConvs newInstance() {
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AiChatAdviceConvs aiChatAdviceConvs, JsonGenerator jsonGenerator) throws IOException {
            if (aiChatAdviceConvs.adviceConvList != null) {
                jsonGenerator.writeFieldName("adviceConvList");
                JsonAdapter.serializeMap(aiChatAdviceConvs.adviceConvList, jsonGenerator, JsonAdapter.LONG_BOXED_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AiChatAdviceConvs) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AiChatAdviceConvs) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Long m35215a(Long l2) {
        return l2;
    }

    public static AiChatAdviceConvs new_() {
        AiChatAdviceConvs aiChatAdviceConvs = new AiChatAdviceConvs();
        aiChatAdviceConvs.nullCheck();
        return aiChatAdviceConvs;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public AiChatAdviceConvs mo223809clone() {
        AiChatAdviceConvs aiChatAdviceConvs = new AiChatAdviceConvs();
        Map<String, Long> map = this.adviceConvList;
        if (map != null) {
            aiChatAdviceConvs.adviceConvList = ValueObject.util_map(map, new w9j() { // from class: l.ah0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return AiChatAdviceConvs.m35215a((Long) obj);
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
        Map<String, Long> map = this.adviceConvList;
        int iHashCode = i2 + (map != null ? map.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
