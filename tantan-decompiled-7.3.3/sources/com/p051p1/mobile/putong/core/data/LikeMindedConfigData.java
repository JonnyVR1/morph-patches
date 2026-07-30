package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.LikeMindedItemData;
import com.p051p1.mobile.putong.core.data.LikeMindedMccConfigData;
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
import java.util.Map;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes10.dex */
public class LikeMindedConfigData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "likemindedconfigdata";

    @ProtobufIndex(index = 1)
    public boolean enable;

    @NonNull
    @ProtobufIndex(index = 2)
    public Map<String, LikeMindedMccConfigData> mcc;

    @NonNull
    @ProtobufIndex(index = 3)
    public Map<String, LikeMindedItemData> same;
    public static ProtobufAdapter<LikeMindedConfigData> PROTOBUF_ADAPTER = new MessageNanoAdapter<LikeMindedConfigData>() { // from class: com.p1.mobile.putong.core.data.LikeMindedConfigData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LikeMindedConfigData likeMindedConfigData) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, likeMindedConfigData.enable);
            Map<String, LikeMindedMccConfigData> map = likeMindedConfigData.mcc;
            if (map != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(2, map, LikeMindedMccConfigData.PROTOBUF_ADAPTER.MAP_ADAPTER());
            }
            Map<String, LikeMindedItemData> map2 = likeMindedConfigData.same;
            if (map2 != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(3, map2, LikeMindedItemData.PROTOBUF_ADAPTER.MAP_ADAPTER());
            }
            likeMindedConfigData.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LikeMindedConfigData parse(nc5 nc5Var) throws IOException {
            LikeMindedConfigData likeMindedConfigData = new LikeMindedConfigData();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (likeMindedConfigData.mcc == null) {
                        likeMindedConfigData.mcc = Collections.EMPTY_MAP;
                    }
                    if (likeMindedConfigData.same != null) {
                        break;
                    }
                    likeMindedConfigData.same = Collections.EMPTY_MAP;
                    break;
                }
                if (iM162497u == 8) {
                    likeMindedConfigData.enable = nc5Var.m162483g();
                } else if (iM162497u == 18) {
                    likeMindedConfigData.mcc = (Map) nc5Var.m162488l(LikeMindedMccConfigData.PROTOBUF_ADAPTER.MAP_ADAPTER());
                } else {
                    if (iM162497u != 26) {
                        if (likeMindedConfigData.mcc == null) {
                            likeMindedConfigData.mcc = Collections.EMPTY_MAP;
                        }
                        if (likeMindedConfigData.same != null) {
                            break;
                        }
                        likeMindedConfigData.same = Collections.EMPTY_MAP;
                        return likeMindedConfigData;
                    }
                    likeMindedConfigData.same = (Map) nc5Var.m162488l(LikeMindedItemData.PROTOBUF_ADAPTER.MAP_ADAPTER());
                }
            }
            return likeMindedConfigData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LikeMindedConfigData likeMindedConfigData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, likeMindedConfigData.enable);
            Map<String, LikeMindedMccConfigData> map = likeMindedConfigData.mcc;
            if (map != null) {
                codedOutputByteBufferNano.m17309K(2, map, LikeMindedMccConfigData.PROTOBUF_ADAPTER.MAP_ADAPTER());
            }
            Map<String, LikeMindedItemData> map2 = likeMindedConfigData.same;
            if (map2 != null) {
                codedOutputByteBufferNano.m17309K(3, map2, LikeMindedItemData.PROTOBUF_ADAPTER.MAP_ADAPTER());
            }
        }
    };
    public static JsonAdapter<LikeMindedConfigData> JSON_ADAPTER = new ObjectJsonAdapter<LikeMindedConfigData>() { // from class: com.p1.mobile.putong.core.data.LikeMindedConfigData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LikeMindedConfigData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LikeMindedConfigData newInstance() {
            return new LikeMindedConfigData();
        }

        public boolean parseField(LikeMindedConfigData likeMindedConfigData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "enable":
                    likeMindedConfigData.enable = jsonParser.getValueAsBoolean();
                    return true;
                case "mcc":
                    likeMindedConfigData.mcc = JsonAdapter.parseMap(jsonParser, LikeMindedMccConfigData.JSON_ADAPTER, str2);
                    return true;
                case "same":
                    likeMindedConfigData.same = JsonAdapter.parseMap(jsonParser, LikeMindedItemData.JSON_ADAPTER, str2);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(LikeMindedConfigData likeMindedConfigData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "enable":
                case "mcc":
                case "same":
                    return true;
                default:
                    return super.parseFieldCheck(likeMindedConfigData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LikeMindedConfigData likeMindedConfigData, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("enable", likeMindedConfigData.enable);
            if (likeMindedConfigData.mcc != null) {
                jsonGenerator.writeFieldName("mcc");
                JsonAdapter.serializeMap(likeMindedConfigData.mcc, jsonGenerator, LikeMindedMccConfigData.JSON_ADAPTER);
            }
            if (likeMindedConfigData.same != null) {
                jsonGenerator.writeFieldName("same");
                JsonAdapter.serializeMap(likeMindedConfigData.same, jsonGenerator, LikeMindedItemData.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LikeMindedConfigData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LikeMindedConfigData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LikeMindedConfigData new_() {
        LikeMindedConfigData likeMindedConfigData = new LikeMindedConfigData();
        likeMindedConfigData.nullCheck();
        return likeMindedConfigData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LikeMindedConfigData mo225055clone() {
        LikeMindedConfigData likeMindedConfigData = new LikeMindedConfigData();
        likeMindedConfigData.enable = this.enable;
        Map<String, LikeMindedMccConfigData> map = this.mcc;
        if (map != null) {
            likeMindedConfigData.mcc = ValueObject.util_map(map, new qcj() { // from class: l.ffr
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((LikeMindedMccConfigData) obj).mo225055clone();
                }
            });
        }
        Map<String, LikeMindedItemData> map2 = this.same;
        if (map2 != null) {
            likeMindedConfigData.same = ValueObject.util_map(map2, new qcj() { // from class: l.gfr
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((LikeMindedItemData) obj).mo225055clone();
                }
            });
        }
        return likeMindedConfigData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LikeMindedConfigData)) {
            return false;
        }
        LikeMindedConfigData likeMindedConfigData = (LikeMindedConfigData) obj;
        return this.enable == likeMindedConfigData.enable && ValueObject.util_equals(this.mcc, likeMindedConfigData.mcc) && ValueObject.util_equals(this.same, likeMindedConfigData.same);
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
        int i2 = ((i * 41) + (this.enable ? 1231 : 1237)) * 41;
        Map<String, LikeMindedMccConfigData> map = this.mcc;
        int iHashCode = (i2 + (map != null ? map.hashCode() : 0)) * 41;
        Map<String, LikeMindedItemData> map2 = this.same;
        int iHashCode2 = iHashCode + (map2 != null ? map2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.mcc == null) {
            this.mcc = Collections.EMPTY_MAP;
        }
        if (this.same == null) {
            this.same = Collections.EMPTY_MAP;
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
