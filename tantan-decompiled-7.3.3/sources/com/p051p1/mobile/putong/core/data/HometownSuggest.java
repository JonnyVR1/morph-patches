package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.momo.mcamera.ThirdPartEffect.Pott.config.PottParameter;
import com.p051p1.mobile.putong.core.data.HometownChinaItem;
import com.p051p1.mobile.putong.core.data.HometownSuggest;
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
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes10.dex */
public class HometownSuggest extends BaseData implements Cloneable, Serializable {
    public static final String TYPE = "hometownsuggest";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<HometownChinaItem> china;

    @NonNull
    @ProtobufIndex(index = 2)
    public Map<String, List<String>> overseas;
    public static ProtobufAdapter<HometownSuggest> PROTOBUF_ADAPTER = new MessageNanoAdapter<HometownSuggest>() { // from class: com.p1.mobile.putong.core.data.HometownSuggest.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(HometownSuggest hometownSuggest) {
            List<HometownChinaItem> list = hometownSuggest.china;
            int iM17285l = list != null ? CodedOutputByteBufferNano.m17285l(1, list, HometownChinaItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            Map<String, List<String>> map = hometownSuggest.overseas;
            if (map != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, map, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().MAP_ADAPTER());
            }
            hometownSuggest.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public HometownSuggest parse(nc5 nc5Var) throws IOException {
            HometownSuggest hometownSuggest = new HometownSuggest();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (hometownSuggest.china == null) {
                        hometownSuggest.china = new ArrayList();
                    }
                    if (hometownSuggest.overseas != null) {
                        break;
                    }
                    hometownSuggest.overseas = Collections.EMPTY_MAP;
                    break;
                }
                if (iM162497u == 10) {
                    hometownSuggest.china = (List) nc5Var.m162488l(HometownChinaItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM162497u != 18) {
                        if (hometownSuggest.china == null) {
                            hometownSuggest.china = new ArrayList();
                        }
                        if (hometownSuggest.overseas != null) {
                            break;
                        }
                        hometownSuggest.overseas = Collections.EMPTY_MAP;
                        return hometownSuggest;
                    }
                    hometownSuggest.overseas = (Map) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().MAP_ADAPTER());
                }
            }
            return hometownSuggest;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(HometownSuggest hometownSuggest, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<HometownChinaItem> list = hometownSuggest.china;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(1, list, HometownChinaItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            Map<String, List<String>> map = hometownSuggest.overseas;
            if (map != null) {
                codedOutputByteBufferNano.m17309K(2, map, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().MAP_ADAPTER());
            }
        }
    };
    public static JsonAdapter<HometownSuggest> JSON_ADAPTER = new ObjectJsonAdapter<HometownSuggest>() { // from class: com.p1.mobile.putong.core.data.HometownSuggest.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return HometownSuggest.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public HometownSuggest newInstance() {
            return new HometownSuggest();
        }

        public boolean parseField(HometownSuggest hometownSuggest, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(PottParameter.MAP_TYPE_CHINA)) {
                hometownSuggest.china = JsonAdapter.parseArray(jsonParser, HometownChinaItem.JSON_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("overseas")) {
                return false;
            }
            hometownSuggest.overseas = JsonAdapter.parseMap(jsonParser, JsonAdapter.STRING_ADAPTER.ARRAY_ADAPTER(), str2);
            return true;
        }

        public boolean parseFieldCheck(HometownSuggest hometownSuggest, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(PottParameter.MAP_TYPE_CHINA) || str.equals("overseas")) {
                return true;
            }
            return super.parseFieldCheck(hometownSuggest, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(HometownSuggest hometownSuggest, JsonGenerator jsonGenerator) throws IOException {
            if (hometownSuggest.china != null) {
                jsonGenerator.writeFieldName(PottParameter.MAP_TYPE_CHINA);
                JsonAdapter.serializeArray(hometownSuggest.china, jsonGenerator, HometownChinaItem.JSON_ADAPTER);
            }
            if (hometownSuggest.overseas != null) {
                jsonGenerator.writeFieldName("overseas");
                JsonAdapter.serializeMap(hometownSuggest.overseas, jsonGenerator, JsonAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((HometownSuggest) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((HometownSuggest) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m36592a(String str) {
        return str;
    }

    public static HometownSuggest new_() {
        HometownSuggest hometownSuggest = new HometownSuggest();
        hometownSuggest.nullCheck();
        return hometownSuggest;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public HometownSuggest mo225055clone() {
        HometownSuggest hometownSuggest = new HometownSuggest();
        List<HometownChinaItem> list = this.china;
        if (list != null) {
            hometownSuggest.china = ValueObject.util_map(list, new qcj() { // from class: l.fgl
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((HometownChinaItem) obj).mo225055clone();
                }
            });
        }
        Map<String, List<String>> map = this.overseas;
        if (map != null) {
            hometownSuggest.overseas = ValueObject.util_map(map, new qcj() { // from class: l.ggl
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ValueObject.util_map((List) obj, new qcj() { // from class: l.hgl
                        @Override // p153l.qcj
                        public final Object call(Object obj2) {
                            return HometownSuggest.m36592a((String) obj2);
                        }
                    });
                }
            });
        }
        return hometownSuggest;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HometownSuggest)) {
            return false;
        }
        HometownSuggest hometownSuggest = (HometownSuggest) obj;
        return this == obj && ValueObject.util_equals(this.china, hometownSuggest.china) && ValueObject.util_equals(this.overseas, hometownSuggest.overseas);
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
        List<HometownChinaItem> list = this.china;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 41;
        Map<String, List<String>> map = this.overseas;
        int iHashCode3 = iHashCode2 + (map != null ? map.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        super.nullCheck();
        if (this.china == null) {
            this.china = new ArrayList();
        }
        if (this.overseas == null) {
            this.overseas = Collections.EMPTY_MAP;
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
