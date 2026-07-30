package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.HometownChinaItem;
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
public class HometownChinaItem extends BaseData implements Cloneable, Serializable {
    public static final String TYPE = "hometownchinaitem";

    @NonNull
    @ProtobufIndex(index = 1)
    public String region;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public List<String> subRegion;
    public static ProtobufAdapter<HometownChinaItem> PROTOBUF_ADAPTER = new MessageNanoAdapter<HometownChinaItem>() { // from class: com.p1.mobile.putong.core.data.HometownChinaItem.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(HometownChinaItem hometownChinaItem) {
            String str = hometownChinaItem.region;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            List<String> list = hometownChinaItem.subRegion;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) hometownChinaItem).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public HometownChinaItem m13341parse(nb5 nb5Var) throws IOException {
            HometownChinaItem hometownChinaItem = new HometownChinaItem();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (hometownChinaItem.region == null) {
                        hometownChinaItem.region = "";
                    }
                    if (hometownChinaItem.subRegion != null) {
                        break;
                    }
                    hometownChinaItem.subRegion = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    hometownChinaItem.region = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (hometownChinaItem.region == null) {
                            hometownChinaItem.region = "";
                        }
                        if (hometownChinaItem.subRegion != null) {
                            break;
                        }
                        hometownChinaItem.subRegion = new ArrayList();
                        return hometownChinaItem;
                    }
                    hometownChinaItem.subRegion = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return hometownChinaItem;
        }

        public void serialize(HometownChinaItem hometownChinaItem, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = hometownChinaItem.region;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            List<String> list = hometownChinaItem.subRegion;
            if (list != null) {
                codedOutputByteBufferNano.K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<HometownChinaItem> JSON_ADAPTER = new ObjectJsonAdapter<HometownChinaItem>() { // from class: com.p1.mobile.putong.core.data.HometownChinaItem.2
        public Class getDataClass() {
            return HometownChinaItem.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public HometownChinaItem m13342newInstance() {
            return new HometownChinaItem();
        }

        public boolean parseField(HometownChinaItem hometownChinaItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(FigureMessageType.region)) {
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
            if (str.equals(FigureMessageType.region) || str.equals("subRegion")) {
                return true;
            }
            return super.parseFieldCheck(hometownChinaItem, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(HometownChinaItem hometownChinaItem, JsonGenerator jsonGenerator) throws IOException {
            String str = hometownChinaItem.region;
            if (str != null) {
                jsonGenerator.writeStringField(FigureMessageType.region, str);
            }
            if (hometownChinaItem.subRegion != null) {
                jsonGenerator.writeFieldName("subRegion");
                JsonAdapter.serializeArray(hometownChinaItem.subRegion, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((HometownChinaItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((HometownChinaItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m390a(String str) {
        return str;
    }

    public static HometownChinaItem new_() {
        HometownChinaItem hometownChinaItem = new HometownChinaItem();
        hometownChinaItem.nullCheck();
        return hometownChinaItem;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public HometownChinaItem m13340clone() {
        HometownChinaItem hometownChinaItem = new HometownChinaItem();
        hometownChinaItem.region = this.region;
        List<String> list = this.subRegion;
        if (list != null) {
            hometownChinaItem.subRegion = ValueObject.util_map(list, new w9j() { // from class: l.odl
                public final Object call(Object obj) {
                    return HometownChinaItem.m390a((String) obj);
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = super.hashCode() * 41;
        String str = this.region;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 41;
        List<String> list = this.subRegion;
        int iHashCode3 = iHashCode2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        super/*com.tantanapp.common.data.ValueObject*/.nullCheck();
        if (this.region == null) {
            this.region = "";
        }
        if (this.subRegion == null) {
            this.subRegion = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
