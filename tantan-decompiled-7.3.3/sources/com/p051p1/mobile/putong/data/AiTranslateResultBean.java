package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
import p153l.nc5;

/* JADX INFO: loaded from: classes12.dex */
public class AiTranslateResultBean extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "aitranslateresultbean";

    @NonNull
    @ProtobufIndex(index = 2)
    public AiTranslateResultData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<AiTranslateResultBean> PROTOBUF_ADAPTER = new MessageNanoAdapter<AiTranslateResultBean>() { // from class: com.p1.mobile.putong.data.AiTranslateResultBean.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(AiTranslateResultBean aiTranslateResultBean) {
            Meta meta = aiTranslateResultBean.meta;
            int iM17285l = meta != null ? CodedOutputByteBufferNano.m17285l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            AiTranslateResultData aiTranslateResultData = aiTranslateResultBean.data;
            if (aiTranslateResultData != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, aiTranslateResultData, AiTranslateResultData.PROTOBUF_ADAPTER);
            }
            aiTranslateResultBean.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AiTranslateResultBean parse(nc5 nc5Var) throws IOException {
            AiTranslateResultBean aiTranslateResultBean = new AiTranslateResultBean();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (aiTranslateResultBean.meta == null) {
                        aiTranslateResultBean.meta = Meta.new_();
                    }
                    if (aiTranslateResultBean.data != null) {
                        break;
                    }
                    aiTranslateResultBean.data = AiTranslateResultData.new_();
                    break;
                }
                if (iM162497u == 10) {
                    aiTranslateResultBean.meta = (Meta) nc5Var.m162488l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 18) {
                        if (aiTranslateResultBean.meta == null) {
                            aiTranslateResultBean.meta = Meta.new_();
                        }
                        if (aiTranslateResultBean.data != null) {
                            break;
                        }
                        aiTranslateResultBean.data = AiTranslateResultData.new_();
                        return aiTranslateResultBean;
                    }
                    aiTranslateResultBean.data = (AiTranslateResultData) nc5Var.m162488l(AiTranslateResultData.PROTOBUF_ADAPTER);
                }
            }
            return aiTranslateResultBean;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AiTranslateResultBean aiTranslateResultBean, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = aiTranslateResultBean.meta;
            if (meta != null) {
                codedOutputByteBufferNano.m17309K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            AiTranslateResultData aiTranslateResultData = aiTranslateResultBean.data;
            if (aiTranslateResultData != null) {
                codedOutputByteBufferNano.m17309K(2, aiTranslateResultData, AiTranslateResultData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<AiTranslateResultBean> JSON_ADAPTER = new ObjectJsonAdapter<AiTranslateResultBean>() { // from class: com.p1.mobile.putong.data.AiTranslateResultBean.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AiTranslateResultBean.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public AiTranslateResultBean newInstance() {
            return new AiTranslateResultBean();
        }

        public boolean parseField(AiTranslateResultBean aiTranslateResultBean, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                aiTranslateResultBean.data = AiTranslateResultData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("meta")) {
                return false;
            }
            aiTranslateResultBean.meta = Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(AiTranslateResultBean aiTranslateResultBean, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("meta")) {
                return true;
            }
            return super.parseFieldCheck(aiTranslateResultBean, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AiTranslateResultBean aiTranslateResultBean, JsonGenerator jsonGenerator) throws IOException {
            if (aiTranslateResultBean.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(aiTranslateResultBean.meta, jsonGenerator, true);
            }
            if (aiTranslateResultBean.data != null) {
                jsonGenerator.writeFieldName("data");
                AiTranslateResultData.JSON_ADAPTER.serialize(aiTranslateResultBean.data, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AiTranslateResultBean) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AiTranslateResultBean) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AiTranslateResultBean new_() {
        AiTranslateResultBean aiTranslateResultBean = new AiTranslateResultBean();
        aiTranslateResultBean.nullCheck();
        return aiTranslateResultBean;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public AiTranslateResultBean mo225055clone() {
        AiTranslateResultBean aiTranslateResultBean = new AiTranslateResultBean();
        Meta meta = this.meta;
        if (meta != null) {
            aiTranslateResultBean.meta = meta.mo225055clone();
        }
        AiTranslateResultData aiTranslateResultData = this.data;
        if (aiTranslateResultData != null) {
            aiTranslateResultBean.data = aiTranslateResultData.mo225055clone();
        }
        return aiTranslateResultBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AiTranslateResultBean)) {
            return false;
        }
        AiTranslateResultBean aiTranslateResultBean = (AiTranslateResultBean) obj;
        return ValueObject.util_equals(this.meta, aiTranslateResultBean.meta) && ValueObject.util_equals(this.data, aiTranslateResultBean.data);
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
        AiTranslateResultData aiTranslateResultData = this.data;
        int iHashCode2 = iHashCode + (aiTranslateResultData != null ? aiTranslateResultData.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = AiTranslateResultData.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
