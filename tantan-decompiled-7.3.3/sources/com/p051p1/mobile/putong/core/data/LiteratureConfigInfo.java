package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.Literatures;
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
            int iM17285l = list != null ? CodedOutputByteBufferNano.m17285l(1, list, Literatures.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<Literatures> list2 = literatureConfigInfo.literatures;
            if (list2 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, list2, Literatures.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            literatureConfigInfo.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LiteratureConfigInfo parse(nc5 nc5Var) throws IOException {
            LiteratureConfigInfo literatureConfigInfo = new LiteratureConfigInfo();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (literatureConfigInfo.suggestLiteratures == null) {
                        literatureConfigInfo.suggestLiteratures = new ArrayList();
                    }
                    if (literatureConfigInfo.literatures != null) {
                        break;
                    }
                    literatureConfigInfo.literatures = new ArrayList();
                    break;
                }
                if (iM162497u == 10) {
                    literatureConfigInfo.suggestLiteratures = (List) nc5Var.m162488l(Literatures.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM162497u != 18) {
                        if (literatureConfigInfo.suggestLiteratures == null) {
                            literatureConfigInfo.suggestLiteratures = new ArrayList();
                        }
                        if (literatureConfigInfo.literatures != null) {
                            break;
                        }
                        literatureConfigInfo.literatures = new ArrayList();
                        return literatureConfigInfo;
                    }
                    literatureConfigInfo.literatures = (List) nc5Var.m162488l(Literatures.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return literatureConfigInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LiteratureConfigInfo literatureConfigInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<Literatures> list = literatureConfigInfo.suggestLiteratures;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(1, list, Literatures.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<Literatures> list2 = literatureConfigInfo.literatures;
            if (list2 != null) {
                codedOutputByteBufferNano.m17309K(2, list2, Literatures.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<LiteratureConfigInfo> JSON_ADAPTER = new ObjectJsonAdapter<LiteratureConfigInfo>() { // from class: com.p1.mobile.putong.core.data.LiteratureConfigInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LiteratureConfigInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LiteratureConfigInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
    public LiteratureConfigInfo mo225055clone() {
        LiteratureConfigInfo literatureConfigInfo = new LiteratureConfigInfo();
        List<Literatures> list = this.suggestLiteratures;
        if (list != null) {
            literatureConfigInfo.suggestLiteratures = ValueObject.util_map(list, new qcj() { // from class: l.dqr
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((Literatures) obj).mo225055clone();
                }
            });
        }
        List<Literatures> list2 = this.literatures;
        if (list2 != null) {
            literatureConfigInfo.literatures = ValueObject.util_map(list2, new qcj() { // from class: l.eqr
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((Literatures) obj).mo225055clone();
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
