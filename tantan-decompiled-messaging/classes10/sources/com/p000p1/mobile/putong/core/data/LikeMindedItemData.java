package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.LikeMindedItemLanguagesData;
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
import java.util.Map;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class LikeMindedItemData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "likemindeditemdata";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public Map<String, LikeMindedItemLanguagesData> multiLanguage;

    @NonNull
    @ProtobufIndex(index = 1)
    public String type;
    public static ProtobufAdapter<LikeMindedItemData> PROTOBUF_ADAPTER = new MessageNanoAdapter<LikeMindedItemData>() { // from class: com.p1.mobile.putong.core.data.LikeMindedItemData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(LikeMindedItemData likeMindedItemData) {
            String str = likeMindedItemData.type;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            Map<String, LikeMindedItemLanguagesData> map = likeMindedItemData.multiLanguage;
            if (map != null) {
                iO += CodedOutputByteBufferNano.l(2, map, LikeMindedItemLanguagesData.PROTOBUF_ADAPTER.MAP_ADAPTER());
            }
            ((MessageNano) likeMindedItemData).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public LikeMindedItemData m13851parse(nb5 nb5Var) throws IOException {
            LikeMindedItemData likeMindedItemData = new LikeMindedItemData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (likeMindedItemData.type == null) {
                        likeMindedItemData.type = "";
                    }
                    if (likeMindedItemData.multiLanguage != null) {
                        break;
                    }
                    likeMindedItemData.multiLanguage = Collections.EMPTY_MAP;
                    break;
                }
                if (iU == 10) {
                    likeMindedItemData.type = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (likeMindedItemData.type == null) {
                            likeMindedItemData.type = "";
                        }
                        if (likeMindedItemData.multiLanguage != null) {
                            break;
                        }
                        likeMindedItemData.multiLanguage = Collections.EMPTY_MAP;
                        return likeMindedItemData;
                    }
                    likeMindedItemData.multiLanguage = (Map) nb5Var.l(LikeMindedItemLanguagesData.PROTOBUF_ADAPTER.MAP_ADAPTER());
                }
            }
            return likeMindedItemData;
        }

        public void serialize(LikeMindedItemData likeMindedItemData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = likeMindedItemData.type;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            Map<String, LikeMindedItemLanguagesData> map = likeMindedItemData.multiLanguage;
            if (map != null) {
                codedOutputByteBufferNano.K(2, map, LikeMindedItemLanguagesData.PROTOBUF_ADAPTER.MAP_ADAPTER());
            }
        }
    };
    public static JsonAdapter<LikeMindedItemData> JSON_ADAPTER = new ObjectJsonAdapter<LikeMindedItemData>() { // from class: com.p1.mobile.putong.core.data.LikeMindedItemData.2
        public Class getDataClass() {
            return LikeMindedItemData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public LikeMindedItemData m13852newInstance() {
            return new LikeMindedItemData();
        }

        public boolean parseField(LikeMindedItemData likeMindedItemData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("type")) {
                likeMindedItemData.type = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("multiLanguage")) {
                return false;
            }
            likeMindedItemData.multiLanguage = JsonAdapter.parseMap(jsonParser, LikeMindedItemLanguagesData.JSON_ADAPTER, str2);
            return true;
        }

        public boolean parseFieldCheck(LikeMindedItemData likeMindedItemData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("type") || str.equals("multiLanguage")) {
                return true;
            }
            return super.parseFieldCheck(likeMindedItemData, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(LikeMindedItemData likeMindedItemData, JsonGenerator jsonGenerator) throws IOException {
            String str = likeMindedItemData.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
            if (likeMindedItemData.multiLanguage != null) {
                jsonGenerator.writeFieldName("multiLanguage");
                JsonAdapter.serializeMap(likeMindedItemData.multiLanguage, jsonGenerator, LikeMindedItemLanguagesData.JSON_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LikeMindedItemData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LikeMindedItemData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LikeMindedItemData new_() {
        LikeMindedItemData likeMindedItemData = new LikeMindedItemData();
        likeMindedItemData.nullCheck();
        return likeMindedItemData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public LikeMindedItemData m13850clone() {
        LikeMindedItemData likeMindedItemData = new LikeMindedItemData();
        likeMindedItemData.type = this.type;
        Map<String, LikeMindedItemLanguagesData> map = this.multiLanguage;
        if (map != null) {
            likeMindedItemData.multiLanguage = ValueObject.util_map(map, new w9j() { // from class: l.pdr
                public final Object call(Object obj) {
                    return ((LikeMindedItemLanguagesData) obj).m13854clone();
                }
            });
        }
        return likeMindedItemData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LikeMindedItemData)) {
            return false;
        }
        LikeMindedItemData likeMindedItemData = (LikeMindedItemData) obj;
        return ValueObject.util_equals(this.type, likeMindedItemData.type) && ValueObject.util_equals(this.multiLanguage, likeMindedItemData.multiLanguage);
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
        String str = this.type;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        Map<String, LikeMindedItemLanguagesData> map = this.multiLanguage;
        int iHashCode2 = iHashCode + (map != null ? map.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.type == null) {
            this.type = "";
        }
        if (this.multiLanguage == null) {
            this.multiLanguage = Collections.EMPTY_MAP;
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
