package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.Literatures;
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
public class LiteratureConfigInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "literatureconfiginfo";

    @NonNull
    @ProtobufIndex(index = 2)
    public List<Literatures> literatures;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<Literatures> suggestLiteratures;
    public static ProtobufAdapter<LiteratureConfigInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<LiteratureConfigInfo>() { // from class: com.p1.mobile.putong.core.data.LiteratureConfigInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LiteratureConfigInfo literatureConfigInfo) {
            List<Literatures> list = literatureConfigInfo.suggestLiteratures;
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, list, Literatures.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<Literatures> list2 = literatureConfigInfo.literatures;
            if (list2 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, list2, Literatures.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            literatureConfigInfo.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LiteratureConfigInfo parse(nb5 nb5Var) throws IOException {
            LiteratureConfigInfo literatureConfigInfo = new LiteratureConfigInfo();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (literatureConfigInfo.suggestLiteratures == null) {
                        literatureConfigInfo.suggestLiteratures = new ArrayList();
                    }
                    if (literatureConfigInfo.literatures != null) {
                        break;
                    }
                    literatureConfigInfo.literatures = new ArrayList();
                    break;
                }
                if (iM158752u == 10) {
                    literatureConfigInfo.suggestLiteratures = (List) nb5Var.m158743l(Literatures.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM158752u != 18) {
                        if (literatureConfigInfo.suggestLiteratures == null) {
                            literatureConfigInfo.suggestLiteratures = new ArrayList();
                        }
                        if (literatureConfigInfo.literatures != null) {
                            break;
                        }
                        literatureConfigInfo.literatures = new ArrayList();
                        return literatureConfigInfo;
                    }
                    literatureConfigInfo.literatures = (List) nb5Var.m158743l(Literatures.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return literatureConfigInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LiteratureConfigInfo literatureConfigInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<Literatures> list = literatureConfigInfo.suggestLiteratures;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, Literatures.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Literatures> list2 = literatureConfigInfo.literatures;
            if (list2 != null) {
                codedOutputByteBufferNano.m17254K(2, list2, Literatures.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<LiteratureConfigInfo> JSON_ADAPTER = new ObjectJsonAdapter<LiteratureConfigInfo>() { // from class: com.p1.mobile.putong.core.data.LiteratureConfigInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LiteratureConfigInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LiteratureConfigInfo newInstance() {
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LiteratureConfigInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LiteratureConfigInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LiteratureConfigInfo new_() {
        LiteratureConfigInfo literatureConfigInfo = new LiteratureConfigInfo();
        literatureConfigInfo.nullCheck();
        return literatureConfigInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LiteratureConfigInfo mo223809clone() {
        LiteratureConfigInfo literatureConfigInfo = new LiteratureConfigInfo();
        List<Literatures> list = this.suggestLiteratures;
        if (list != null) {
            literatureConfigInfo.suggestLiteratures = ValueObject.util_map(list, new w9j() { // from class: l.cor
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((Literatures) obj).mo223809clone();
                }
            });
        }
        List<Literatures> list2 = this.literatures;
        if (list2 != null) {
            literatureConfigInfo.literatures = ValueObject.util_map(list2, new w9j() { // from class: l.dor
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((Literatures) obj).mo223809clone();
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
        List<Literatures> list = this.suggestLiteratures;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<Literatures> list2 = this.literatures;
        int iHashCode2 = iHashCode + (list2 != null ? list2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.suggestLiteratures == null) {
            this.suggestLiteratures = new ArrayList();
        }
        if (this.literatures == null) {
            this.literatures = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
