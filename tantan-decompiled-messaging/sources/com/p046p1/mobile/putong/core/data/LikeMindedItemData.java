package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.LikeMindedItemLanguagesData;
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
import java.util.Collections;
import java.util.Map;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes10.dex */
public class LikeMindedItemData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "likemindeditemdata";

    @NonNull
    @ProtobufIndex(index = 2)
    public Map<String, LikeMindedItemLanguagesData> multiLanguage;

    @NonNull
    @ProtobufIndex(index = 1)
    public String type;
    public static ProtobufAdapter<LikeMindedItemData> PROTOBUF_ADAPTER = new MessageNanoAdapter<LikeMindedItemData>() { // from class: com.p1.mobile.putong.core.data.LikeMindedItemData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LikeMindedItemData likeMindedItemData) {
            String str = likeMindedItemData.type;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            Map<String, LikeMindedItemLanguagesData> map = likeMindedItemData.multiLanguage;
            if (map != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(2, map, LikeMindedItemLanguagesData.PROTOBUF_ADAPTER.MAP_ADAPTER());
            }
            likeMindedItemData.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LikeMindedItemData parse(nb5 nb5Var) throws IOException {
            LikeMindedItemData likeMindedItemData = new LikeMindedItemData();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (likeMindedItemData.type == null) {
                        likeMindedItemData.type = "";
                    }
                    if (likeMindedItemData.multiLanguage != null) {
                        break;
                    }
                    likeMindedItemData.multiLanguage = Collections.EMPTY_MAP;
                    break;
                }
                if (iM158752u == 10) {
                    likeMindedItemData.type = nb5Var.m158750s();
                } else {
                    if (iM158752u != 18) {
                        if (likeMindedItemData.type == null) {
                            likeMindedItemData.type = "";
                        }
                        if (likeMindedItemData.multiLanguage != null) {
                            break;
                        }
                        likeMindedItemData.multiLanguage = Collections.EMPTY_MAP;
                        return likeMindedItemData;
                    }
                    likeMindedItemData.multiLanguage = (Map) nb5Var.m158743l(LikeMindedItemLanguagesData.PROTOBUF_ADAPTER.MAP_ADAPTER());
                }
            }
            return likeMindedItemData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LikeMindedItemData likeMindedItemData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = likeMindedItemData.type;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            Map<String, LikeMindedItemLanguagesData> map = likeMindedItemData.multiLanguage;
            if (map != null) {
                codedOutputByteBufferNano.m17254K(2, map, LikeMindedItemLanguagesData.PROTOBUF_ADAPTER.MAP_ADAPTER());
            }
        }
    };
    public static JsonAdapter<LikeMindedItemData> JSON_ADAPTER = new ObjectJsonAdapter<LikeMindedItemData>() { // from class: com.p1.mobile.putong.core.data.LikeMindedItemData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LikeMindedItemData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LikeMindedItemData newInstance() {
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LikeMindedItemData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LikeMindedItemData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LikeMindedItemData new_() {
        LikeMindedItemData likeMindedItemData = new LikeMindedItemData();
        likeMindedItemData.nullCheck();
        return likeMindedItemData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LikeMindedItemData mo223809clone() {
        LikeMindedItemData likeMindedItemData = new LikeMindedItemData();
        likeMindedItemData.type = this.type;
        Map<String, LikeMindedItemLanguagesData> map = this.multiLanguage;
        if (map != null) {
            likeMindedItemData.multiLanguage = ValueObject.util_map(map, new w9j() { // from class: l.pdr
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((LikeMindedItemLanguagesData) obj).mo223809clone();
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
        String str = this.type;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        Map<String, LikeMindedItemLanguagesData> map = this.multiLanguage;
        int iHashCode2 = iHashCode + (map != null ? map.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.type == null) {
            this.type = "";
        }
        if (this.multiLanguage == null) {
            this.multiLanguage = Collections.EMPTY_MAP;
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
