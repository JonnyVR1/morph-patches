package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.HometownChinaItem;
import com.p000p1.mobile.putong.core.data.HometownSuggest;
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
import java.util.Collections;
import java.util.List;
import java.util.Map;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class HometownSuggest extends BaseData implements Cloneable, Serializable {
    public static final String TYPE = "hometownsuggest";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<HometownChinaItem> china;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public Map<String, List<String>> overseas;
    public static ProtobufAdapter<HometownSuggest> PROTOBUF_ADAPTER = new MessageNanoAdapter<HometownSuggest>() { // from class: com.p1.mobile.putong.core.data.HometownSuggest.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(HometownSuggest hometownSuggest) {
            List<HometownChinaItem> list = hometownSuggest.china;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, HometownChinaItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            Map<String, List<String>> map = hometownSuggest.overseas;
            if (map != null) {
                iL += CodedOutputByteBufferNano.l(2, map, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().MAP_ADAPTER());
            }
            ((MessageNano) hometownSuggest).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public HometownSuggest m13345parse(nb5 nb5Var) throws IOException {
            HometownSuggest hometownSuggest = new HometownSuggest();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (hometownSuggest.china == null) {
                        hometownSuggest.china = new ArrayList();
                    }
                    if (hometownSuggest.overseas != null) {
                        break;
                    }
                    hometownSuggest.overseas = Collections.EMPTY_MAP;
                    break;
                }
                if (iU == 10) {
                    hometownSuggest.china = (List) nb5Var.l(HometownChinaItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 18) {
                        if (hometownSuggest.china == null) {
                            hometownSuggest.china = new ArrayList();
                        }
                        if (hometownSuggest.overseas != null) {
                            break;
                        }
                        hometownSuggest.overseas = Collections.EMPTY_MAP;
                        return hometownSuggest;
                    }
                    hometownSuggest.overseas = (Map) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().MAP_ADAPTER());
                }
            }
            return hometownSuggest;
        }

        public void serialize(HometownSuggest hometownSuggest, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<HometownChinaItem> list = hometownSuggest.china;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, HometownChinaItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            Map<String, List<String>> map = hometownSuggest.overseas;
            if (map != null) {
                codedOutputByteBufferNano.K(2, map, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER().MAP_ADAPTER());
            }
        }
    };
    public static JsonAdapter<HometownSuggest> JSON_ADAPTER = new ObjectJsonAdapter<HometownSuggest>() { // from class: com.p1.mobile.putong.core.data.HometownSuggest.2
        public Class getDataClass() {
            return HometownSuggest.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public HometownSuggest m13346newInstance() {
            return new HometownSuggest();
        }

        public boolean parseField(HometownSuggest hometownSuggest, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("china")) {
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
            if (str.equals("china") || str.equals("overseas")) {
                return true;
            }
            return super.parseFieldCheck(hometownSuggest, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(HometownSuggest hometownSuggest, JsonGenerator jsonGenerator) throws IOException {
            if (hometownSuggest.china != null) {
                jsonGenerator.writeFieldName("china");
                JsonAdapter.serializeArray(hometownSuggest.china, jsonGenerator, HometownChinaItem.JSON_ADAPTER);
            }
            if (hometownSuggest.overseas != null) {
                jsonGenerator.writeFieldName("overseas");
                JsonAdapter.serializeMap(hometownSuggest.overseas, jsonGenerator, JsonAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((HometownSuggest) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((HometownSuggest) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m391a(String str) {
        return str;
    }

    public static HometownSuggest new_() {
        HometownSuggest hometownSuggest = new HometownSuggest();
        hometownSuggest.nullCheck();
        return hometownSuggest;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public HometownSuggest m13344clone() {
        HometownSuggest hometownSuggest = new HometownSuggest();
        List<HometownChinaItem> list = this.china;
        if (list != null) {
            hometownSuggest.china = ValueObject.util_map(list, new w9j() { // from class: l.pdl
                public final Object call(Object obj) {
                    return ((HometownChinaItem) obj).m13340clone();
                }
            });
        }
        Map<String, List<String>> map = this.overseas;
        if (map != null) {
            hometownSuggest.overseas = ValueObject.util_map(map, new w9j() { // from class: l.qdl
                public final Object call(Object obj) {
                    return ValueObject.util_map((List) obj, new w9j() { // from class: l.rdl
                        public final Object call(Object obj2) {
                            return HometownSuggest.m391a((String) obj2);
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = super.hashCode() * 41;
        List<HometownChinaItem> list = this.china;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 41;
        Map<String, List<String>> map = this.overseas;
        int iHashCode3 = iHashCode2 + (map != null ? map.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        super/*com.tantanapp.common.data.ValueObject*/.nullCheck();
        if (this.china == null) {
            this.china = new ArrayList();
        }
        if (this.overseas == null) {
            this.overseas = Collections.EMPTY_MAP;
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
