package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class AiTranslateLanguageBean extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "aitranslatelanguagebean";

    @NonNull
    @ProtobufIndex(index = 2)
    public AiTranslateLanguageData data;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;
    public static ProtobufAdapter<AiTranslateLanguageBean> PROTOBUF_ADAPTER = new MessageNanoAdapter<AiTranslateLanguageBean>() { // from class: com.p1.mobile.putong.data.AiTranslateLanguageBean.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(AiTranslateLanguageBean aiTranslateLanguageBean) {
            Meta meta = aiTranslateLanguageBean.meta;
            int iL = meta != null ? CodedOutputByteBufferNano.l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            AiTranslateLanguageData aiTranslateLanguageData = aiTranslateLanguageBean.data;
            if (aiTranslateLanguageData != null) {
                iL += CodedOutputByteBufferNano.l(2, aiTranslateLanguageData, AiTranslateLanguageData.PROTOBUF_ADAPTER);
            }
            ((MessageNano) aiTranslateLanguageBean).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public AiTranslateLanguageBean m17671parse(nb5 nb5Var) throws IOException {
            AiTranslateLanguageBean aiTranslateLanguageBean = new AiTranslateLanguageBean();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (aiTranslateLanguageBean.meta == null) {
                        aiTranslateLanguageBean.meta = Meta.new_();
                    }
                    if (aiTranslateLanguageBean.data != null) {
                        break;
                    }
                    aiTranslateLanguageBean.data = AiTranslateLanguageData.new_();
                    break;
                }
                if (iU == 10) {
                    aiTranslateLanguageBean.meta = (Meta) nb5Var.l(Meta.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 18) {
                        if (aiTranslateLanguageBean.meta == null) {
                            aiTranslateLanguageBean.meta = Meta.new_();
                        }
                        if (aiTranslateLanguageBean.data != null) {
                            break;
                        }
                        aiTranslateLanguageBean.data = AiTranslateLanguageData.new_();
                        return aiTranslateLanguageBean;
                    }
                    aiTranslateLanguageBean.data = (AiTranslateLanguageData) nb5Var.l(AiTranslateLanguageData.PROTOBUF_ADAPTER);
                }
            }
            return aiTranslateLanguageBean;
        }

        public void serialize(AiTranslateLanguageBean aiTranslateLanguageBean, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = aiTranslateLanguageBean.meta;
            if (meta != null) {
                codedOutputByteBufferNano.K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            AiTranslateLanguageData aiTranslateLanguageData = aiTranslateLanguageBean.data;
            if (aiTranslateLanguageData != null) {
                codedOutputByteBufferNano.K(2, aiTranslateLanguageData, AiTranslateLanguageData.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<AiTranslateLanguageBean> JSON_ADAPTER = new ObjectJsonAdapter<AiTranslateLanguageBean>() { // from class: com.p1.mobile.putong.data.AiTranslateLanguageBean.2
        public Class getDataClass() {
            return AiTranslateLanguageBean.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public AiTranslateLanguageBean mo17830newInstance() {
            return new AiTranslateLanguageBean();
        }

        public boolean parseField(AiTranslateLanguageBean aiTranslateLanguageBean, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(Data.TYPE)) {
                aiTranslateLanguageBean.data = (AiTranslateLanguageData) AiTranslateLanguageData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals(Meta.TYPE)) {
                return false;
            }
            aiTranslateLanguageBean.meta = (Meta) Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(AiTranslateLanguageBean aiTranslateLanguageBean, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(Data.TYPE) || str.equals(Meta.TYPE)) {
                return true;
            }
            return super.parseFieldCheck(aiTranslateLanguageBean, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AiTranslateLanguageBean aiTranslateLanguageBean, JsonGenerator jsonGenerator) throws IOException {
            if (aiTranslateLanguageBean.meta != null) {
                jsonGenerator.writeFieldName(Meta.TYPE);
                Meta.JSON_ADAPTER.serialize(aiTranslateLanguageBean.meta, jsonGenerator, true);
            }
            if (aiTranslateLanguageBean.data != null) {
                jsonGenerator.writeFieldName(Data.TYPE);
                AiTranslateLanguageData.JSON_ADAPTER.serialize(aiTranslateLanguageBean.data, jsonGenerator, true);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AiTranslateLanguageBean) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AiTranslateLanguageBean) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AiTranslateLanguageBean new_() {
        AiTranslateLanguageBean aiTranslateLanguageBean = new AiTranslateLanguageBean();
        aiTranslateLanguageBean.nullCheck();
        return aiTranslateLanguageBean;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AiTranslateLanguageBean m17670clone() {
        AiTranslateLanguageBean aiTranslateLanguageBean = new AiTranslateLanguageBean();
        Meta meta = this.meta;
        if (meta != null) {
            aiTranslateLanguageBean.meta = meta.m18461clone();
        }
        AiTranslateLanguageData aiTranslateLanguageData = this.data;
        if (aiTranslateLanguageData != null) {
            aiTranslateLanguageBean.data = aiTranslateLanguageData.m17673clone();
        }
        return aiTranslateLanguageBean;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AiTranslateLanguageBean)) {
            return false;
        }
        AiTranslateLanguageBean aiTranslateLanguageBean = (AiTranslateLanguageBean) obj;
        return ValueObject.util_equals(this.meta, aiTranslateLanguageBean.meta) && ValueObject.util_equals(this.data, aiTranslateLanguageBean.data);
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
        AiTranslateLanguageData aiTranslateLanguageData = this.data;
        int iHashCode2 = iHashCode + (aiTranslateLanguageData != null ? aiTranslateLanguageData.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.data == null) {
            this.data = AiTranslateLanguageData.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
