package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.Literatures;
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
public class LiteratureConfigInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "literatureconfiginfo";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public List<Literatures> literatures;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<Literatures> suggestLiteratures;
    public static ProtobufAdapter<LiteratureConfigInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<LiteratureConfigInfo>() { // from class: com.p1.mobile.putong.core.data.LiteratureConfigInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(LiteratureConfigInfo literatureConfigInfo) {
            List<Literatures> list = literatureConfigInfo.suggestLiteratures;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, Literatures.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<Literatures> list2 = literatureConfigInfo.literatures;
            if (list2 != null) {
                iL += CodedOutputByteBufferNano.l(2, list2, Literatures.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) literatureConfigInfo).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public LiteratureConfigInfo m13911parse(nb5 nb5Var) throws IOException {
            LiteratureConfigInfo literatureConfigInfo = new LiteratureConfigInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (literatureConfigInfo.suggestLiteratures == null) {
                        literatureConfigInfo.suggestLiteratures = new ArrayList();
                    }
                    if (literatureConfigInfo.literatures != null) {
                        break;
                    }
                    literatureConfigInfo.literatures = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    literatureConfigInfo.suggestLiteratures = (List) nb5Var.l(Literatures.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 18) {
                        if (literatureConfigInfo.suggestLiteratures == null) {
                            literatureConfigInfo.suggestLiteratures = new ArrayList();
                        }
                        if (literatureConfigInfo.literatures != null) {
                            break;
                        }
                        literatureConfigInfo.literatures = new ArrayList();
                        return literatureConfigInfo;
                    }
                    literatureConfigInfo.literatures = (List) nb5Var.l(Literatures.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return literatureConfigInfo;
        }

        public void serialize(LiteratureConfigInfo literatureConfigInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<Literatures> list = literatureConfigInfo.suggestLiteratures;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, Literatures.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Literatures> list2 = literatureConfigInfo.literatures;
            if (list2 != null) {
                codedOutputByteBufferNano.K(2, list2, Literatures.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<LiteratureConfigInfo> JSON_ADAPTER = new ObjectJsonAdapter<LiteratureConfigInfo>() { // from class: com.p1.mobile.putong.core.data.LiteratureConfigInfo.2
        public Class getDataClass() {
            return LiteratureConfigInfo.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public LiteratureConfigInfo m13912newInstance() {
            return new LiteratureConfigInfo();
        }

        public boolean parseField(LiteratureConfigInfo literatureConfigInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("suggestLiteratures")) {
                literatureConfigInfo.suggestLiteratures = JsonAdapter.parseArray(jsonParser, Literatures.JSON_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals(Literatures.TYPE)) {
                return false;
            }
            literatureConfigInfo.literatures = JsonAdapter.parseArray(jsonParser, Literatures.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(LiteratureConfigInfo literatureConfigInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("suggestLiteratures") || str.equals(Literatures.TYPE)) {
                return true;
            }
            return super.parseFieldCheck(literatureConfigInfo, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(LiteratureConfigInfo literatureConfigInfo, JsonGenerator jsonGenerator) throws IOException {
            if (literatureConfigInfo.suggestLiteratures != null) {
                jsonGenerator.writeFieldName("suggestLiteratures");
                JsonAdapter.serializeArray(literatureConfigInfo.suggestLiteratures, jsonGenerator, Literatures.JSON_ADAPTER);
            }
            if (literatureConfigInfo.literatures != null) {
                jsonGenerator.writeFieldName(Literatures.TYPE);
                JsonAdapter.serializeArray(literatureConfigInfo.literatures, jsonGenerator, Literatures.JSON_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LiteratureConfigInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LiteratureConfigInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LiteratureConfigInfo new_() {
        LiteratureConfigInfo literatureConfigInfo = new LiteratureConfigInfo();
        literatureConfigInfo.nullCheck();
        return literatureConfigInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public LiteratureConfigInfo m13910clone() {
        LiteratureConfigInfo literatureConfigInfo = new LiteratureConfigInfo();
        List<Literatures> list = this.suggestLiteratures;
        if (list != null) {
            literatureConfigInfo.suggestLiteratures = ValueObject.util_map(list, new w9j() { // from class: l.cor
                public final Object call(Object obj) {
                    return ((Literatures) obj).m13914clone();
                }
            });
        }
        List<Literatures> list2 = this.literatures;
        if (list2 != null) {
            literatureConfigInfo.literatures = ValueObject.util_map(list2, new w9j() { // from class: l.dor
                public final Object call(Object obj) {
                    return ((Literatures) obj).m13914clone();
                }
            });
        }
        return literatureConfigInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LiteratureConfigInfo)) {
            return false;
        }
        LiteratureConfigInfo literatureConfigInfo = (LiteratureConfigInfo) obj;
        return ValueObject.util_equals(this.suggestLiteratures, literatureConfigInfo.suggestLiteratures) && ValueObject.util_equals(this.literatures, literatureConfigInfo.literatures);
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
        List<Literatures> list = this.suggestLiteratures;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<Literatures> list2 = this.literatures;
        int iHashCode2 = iHashCode + (list2 != null ? list2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.suggestLiteratures == null) {
            this.suggestLiteratures = new ArrayList();
        }
        if (this.literatures == null) {
            this.literatures = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
