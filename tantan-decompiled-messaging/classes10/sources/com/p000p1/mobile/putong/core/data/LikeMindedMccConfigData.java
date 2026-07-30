package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.LikeMindedMccConfigData;
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
public class LikeMindedMccConfigData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "likemindedmccconfigdata";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public List<String> items;

    @ProtobufIndex(index = 1)
    public int swipeCount;
    public static ProtobufAdapter<LikeMindedMccConfigData> PROTOBUF_ADAPTER = new MessageNanoAdapter<LikeMindedMccConfigData>() { // from class: com.p1.mobile.putong.core.data.LikeMindedMccConfigData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(LikeMindedMccConfigData likeMindedMccConfigData) {
            int iH = CodedOutputByteBufferNano.h(1, likeMindedMccConfigData.swipeCount);
            List<String> list = likeMindedMccConfigData.items;
            if (list != null) {
                iH += CodedOutputByteBufferNano.l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) likeMindedMccConfigData).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public LikeMindedMccConfigData m13867parse(nb5 nb5Var) throws IOException {
            LikeMindedMccConfigData likeMindedMccConfigData = new LikeMindedMccConfigData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (likeMindedMccConfigData.items != null) {
                        break;
                    }
                    likeMindedMccConfigData.items = new ArrayList();
                    break;
                }
                if (iU == 8) {
                    likeMindedMccConfigData.swipeCount = nb5Var.j();
                } else {
                    if (iU != 18) {
                        if (likeMindedMccConfigData.items != null) {
                            break;
                        }
                        likeMindedMccConfigData.items = new ArrayList();
                        return likeMindedMccConfigData;
                    }
                    likeMindedMccConfigData.items = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return likeMindedMccConfigData;
        }

        public void serialize(LikeMindedMccConfigData likeMindedMccConfigData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, likeMindedMccConfigData.swipeCount);
            List<String> list = likeMindedMccConfigData.items;
            if (list != null) {
                codedOutputByteBufferNano.K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<LikeMindedMccConfigData> JSON_ADAPTER = new ObjectJsonAdapter<LikeMindedMccConfigData>() { // from class: com.p1.mobile.putong.core.data.LikeMindedMccConfigData.2
        public Class getDataClass() {
            return LikeMindedMccConfigData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public LikeMindedMccConfigData m13868newInstance() {
            return new LikeMindedMccConfigData();
        }

        public boolean parseField(LikeMindedMccConfigData likeMindedMccConfigData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("items")) {
                likeMindedMccConfigData.items = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("swipeCount")) {
                return false;
            }
            likeMindedMccConfigData.swipeCount = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(LikeMindedMccConfigData likeMindedMccConfigData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("items") || str.equals("swipeCount")) {
                return true;
            }
            return super.parseFieldCheck(likeMindedMccConfigData, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(LikeMindedMccConfigData likeMindedMccConfigData, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("swipeCount", likeMindedMccConfigData.swipeCount);
            if (likeMindedMccConfigData.items != null) {
                jsonGenerator.writeFieldName("items");
                JsonAdapter.serializeArray(likeMindedMccConfigData.items, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LikeMindedMccConfigData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LikeMindedMccConfigData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m444a(String str) {
        return str;
    }

    public static LikeMindedMccConfigData new_() {
        LikeMindedMccConfigData likeMindedMccConfigData = new LikeMindedMccConfigData();
        likeMindedMccConfigData.nullCheck();
        return likeMindedMccConfigData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public LikeMindedMccConfigData m13866clone() {
        LikeMindedMccConfigData likeMindedMccConfigData = new LikeMindedMccConfigData();
        likeMindedMccConfigData.swipeCount = this.swipeCount;
        List<String> list = this.items;
        if (list != null) {
            likeMindedMccConfigData.items = ValueObject.util_map(list, new w9j() { // from class: l.qdr
                public final Object call(Object obj) {
                    return LikeMindedMccConfigData.m444a((String) obj);
                }
            });
        }
        return likeMindedMccConfigData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LikeMindedMccConfigData)) {
            return false;
        }
        LikeMindedMccConfigData likeMindedMccConfigData = (LikeMindedMccConfigData) obj;
        return this.swipeCount == likeMindedMccConfigData.swipeCount && ValueObject.util_equals(this.items, likeMindedMccConfigData.items);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + this.swipeCount) * 41;
        List<String> list = this.items;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.items == null) {
            this.items = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
