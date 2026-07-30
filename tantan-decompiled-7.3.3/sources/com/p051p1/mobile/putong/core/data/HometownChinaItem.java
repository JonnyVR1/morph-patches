package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.HometownChinaItem;
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
public class HometownChinaItem extends BaseData implements Cloneable, Serializable {
    public static final String TYPE = "hometownchinaitem";

    @NonNull
    @ProtobufIndex(index = 1)
    public String region;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> subRegion;
    public static ProtobufAdapter<HometownChinaItem> PROTOBUF_ADAPTER = new MessageNanoAdapter<HometownChinaItem>() { // from class: com.p1.mobile.putong.core.data.HometownChinaItem.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(HometownChinaItem hometownChinaItem) {
            String str = hometownChinaItem.region;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            List<String> list = hometownChinaItem.subRegion;
            if (list != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            hometownChinaItem.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public HometownChinaItem parse(nc5 nc5Var) throws IOException {
            HometownChinaItem hometownChinaItem = new HometownChinaItem();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (hometownChinaItem.region == null) {
                        hometownChinaItem.region = "";
                    }
                    if (hometownChinaItem.subRegion != null) {
                        break;
                    }
                    hometownChinaItem.subRegion = new ArrayList();
                    break;
                }
                if (iM162497u == 10) {
                    hometownChinaItem.region = nc5Var.m162495s();
                } else {
                    if (iM162497u != 18) {
                        if (hometownChinaItem.region == null) {
                            hometownChinaItem.region = "";
                        }
                        if (hometownChinaItem.subRegion != null) {
                            break;
                        }
                        hometownChinaItem.subRegion = new ArrayList();
                        return hometownChinaItem;
                    }
                    hometownChinaItem.subRegion = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return hometownChinaItem;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(HometownChinaItem hometownChinaItem, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = hometownChinaItem.region;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            List<String> list = hometownChinaItem.subRegion;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<HometownChinaItem> JSON_ADAPTER = new ObjectJsonAdapter<HometownChinaItem>() { // from class: com.p1.mobile.putong.core.data.HometownChinaItem.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return HometownChinaItem.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public HometownChinaItem newInstance() {
            return new HometownChinaItem();
        }

        public boolean parseField(HometownChinaItem hometownChinaItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("region")) {
                hometownChinaItem.region = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("subRegion")) {
                return false;
            }
            hometownChinaItem.subRegion = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(HometownChinaItem hometownChinaItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("region") || str.equals("subRegion")) {
                return true;
            }
            return super.parseFieldCheck(hometownChinaItem, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(HometownChinaItem hometownChinaItem, JsonGenerator jsonGenerator) throws IOException {
            String str = hometownChinaItem.region;
            if (str != null) {
                jsonGenerator.writeStringField("region", str);
            }
            if (hometownChinaItem.subRegion != null) {
                jsonGenerator.writeFieldName("subRegion");
                JsonAdapter.serializeArray(hometownChinaItem.subRegion, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((HometownChinaItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((HometownChinaItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m36591a(String str) {
        return str;
    }

    public static HometownChinaItem new_() {
        HometownChinaItem hometownChinaItem = new HometownChinaItem();
        hometownChinaItem.nullCheck();
        return hometownChinaItem;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public HometownChinaItem mo225055clone() {
        HometownChinaItem hometownChinaItem = new HometownChinaItem();
        hometownChinaItem.region = this.region;
        List<String> list = this.subRegion;
        if (list != null) {
            hometownChinaItem.subRegion = ValueObject.util_map(list, new qcj() { // from class: l.egl
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return HometownChinaItem.m36591a((String) obj);
                }
            });
        }
        return hometownChinaItem;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HometownChinaItem)) {
            return false;
        }
        HometownChinaItem hometownChinaItem = (HometownChinaItem) obj;
        return this == obj && ValueObject.util_equals(this.region, hometownChinaItem.region) && ValueObject.util_equals(this.subRegion, hometownChinaItem.subRegion);
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
        int iHashCode = super.hashCode() * 41;
        String str = this.region;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 41;
        List<String> list = this.subRegion;
        int iHashCode3 = iHashCode2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        super.nullCheck();
        if (this.region == null) {
            this.region = "";
        }
        if (this.subRegion == null) {
            this.subRegion = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
