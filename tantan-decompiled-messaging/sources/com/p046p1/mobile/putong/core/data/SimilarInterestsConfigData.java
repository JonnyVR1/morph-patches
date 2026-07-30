package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.SimilarInterestsItemData;
import com.p046p1.mobile.putong.core.data.SimilarInterestsMccConfigData;
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
public class SimilarInterestsConfigData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "similarinterestsconfigdata";

    @NonNull
    @ProtobufIndex(index = 3)
    public SimilarInterestsBaseData baseData;

    @ProtobufIndex(index = 1)
    public boolean enable;

    @NonNull
    @ProtobufIndex(index = 4)
    public Map<String, SimilarInterestsItemData> listData;

    @NonNull
    @ProtobufIndex(index = 2)
    public Map<String, SimilarInterestsMccConfigData> mcc;
    public static ProtobufAdapter<SimilarInterestsConfigData> PROTOBUF_ADAPTER = new MessageNanoAdapter<SimilarInterestsConfigData>() { // from class: com.p1.mobile.putong.core.data.SimilarInterestsConfigData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SimilarInterestsConfigData similarInterestsConfigData) {
            int iM17220b = CodedOutputByteBufferNano.m17220b(1, similarInterestsConfigData.enable);
            Map<String, SimilarInterestsMccConfigData> map = similarInterestsConfigData.mcc;
            if (map != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(2, map, SimilarInterestsMccConfigData.PROTOBUF_ADAPTER.MAP_ADAPTER());
            }
            SimilarInterestsBaseData similarInterestsBaseData = similarInterestsConfigData.baseData;
            if (similarInterestsBaseData != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(3, similarInterestsBaseData, SimilarInterestsBaseData.PROTOBUF_ADAPTER);
            }
            Map<String, SimilarInterestsItemData> map2 = similarInterestsConfigData.listData;
            if (map2 != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(4, map2, SimilarInterestsItemData.PROTOBUF_ADAPTER.MAP_ADAPTER());
            }
            similarInterestsConfigData.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SimilarInterestsConfigData parse(nb5 nb5Var) throws IOException {
            SimilarInterestsConfigData similarInterestsConfigData = new SimilarInterestsConfigData();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (similarInterestsConfigData.mcc == null) {
                        similarInterestsConfigData.mcc = Collections.EMPTY_MAP;
                    }
                    if (similarInterestsConfigData.baseData == null) {
                        similarInterestsConfigData.baseData = SimilarInterestsBaseData.new_();
                    }
                    if (similarInterestsConfigData.listData != null) {
                        break;
                    }
                    similarInterestsConfigData.listData = Collections.EMPTY_MAP;
                    break;
                }
                if (iM158752u == 8) {
                    similarInterestsConfigData.enable = nb5Var.m158738g();
                } else if (iM158752u == 18) {
                    similarInterestsConfigData.mcc = (Map) nb5Var.m158743l(SimilarInterestsMccConfigData.PROTOBUF_ADAPTER.MAP_ADAPTER());
                } else if (iM158752u == 26) {
                    similarInterestsConfigData.baseData = (SimilarInterestsBaseData) nb5Var.m158743l(SimilarInterestsBaseData.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 34) {
                        if (similarInterestsConfigData.mcc == null) {
                            similarInterestsConfigData.mcc = Collections.EMPTY_MAP;
                        }
                        if (similarInterestsConfigData.baseData == null) {
                            similarInterestsConfigData.baseData = SimilarInterestsBaseData.new_();
                        }
                        if (similarInterestsConfigData.listData != null) {
                            break;
                        }
                        similarInterestsConfigData.listData = Collections.EMPTY_MAP;
                        return similarInterestsConfigData;
                    }
                    similarInterestsConfigData.listData = (Map) nb5Var.m158743l(SimilarInterestsItemData.PROTOBUF_ADAPTER.MAP_ADAPTER());
                }
            }
            return similarInterestsConfigData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SimilarInterestsConfigData similarInterestsConfigData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17244A(1, similarInterestsConfigData.enable);
            Map<String, SimilarInterestsMccConfigData> map = similarInterestsConfigData.mcc;
            if (map != null) {
                codedOutputByteBufferNano.m17254K(2, map, SimilarInterestsMccConfigData.PROTOBUF_ADAPTER.MAP_ADAPTER());
            }
            SimilarInterestsBaseData similarInterestsBaseData = similarInterestsConfigData.baseData;
            if (similarInterestsBaseData != null) {
                codedOutputByteBufferNano.m17254K(3, similarInterestsBaseData, SimilarInterestsBaseData.PROTOBUF_ADAPTER);
            }
            Map<String, SimilarInterestsItemData> map2 = similarInterestsConfigData.listData;
            if (map2 != null) {
                codedOutputByteBufferNano.m17254K(4, map2, SimilarInterestsItemData.PROTOBUF_ADAPTER.MAP_ADAPTER());
            }
        }
    };
    public static JsonAdapter<SimilarInterestsConfigData> JSON_ADAPTER = new ObjectJsonAdapter<SimilarInterestsConfigData>() { // from class: com.p1.mobile.putong.core.data.SimilarInterestsConfigData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SimilarInterestsConfigData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SimilarInterestsConfigData newInstance() {
            return new SimilarInterestsConfigData();
        }

        public boolean parseField(SimilarInterestsConfigData similarInterestsConfigData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "baseData":
                    similarInterestsConfigData.baseData = SimilarInterestsBaseData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "enable":
                    similarInterestsConfigData.enable = jsonParser.getValueAsBoolean();
                    return true;
                case "mcc":
                    similarInterestsConfigData.mcc = JsonAdapter.parseMap(jsonParser, SimilarInterestsMccConfigData.JSON_ADAPTER, str2);
                    return true;
                case "listData":
                    similarInterestsConfigData.listData = JsonAdapter.parseMap(jsonParser, SimilarInterestsItemData.JSON_ADAPTER, str2);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(SimilarInterestsConfigData similarInterestsConfigData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "baseData":
                case "enable":
                case "mcc":
                case "listData":
                    return true;
                default:
                    return super.parseFieldCheck(similarInterestsConfigData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SimilarInterestsConfigData similarInterestsConfigData, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("enable", similarInterestsConfigData.enable);
            if (similarInterestsConfigData.mcc != null) {
                jsonGenerator.writeFieldName("mcc");
                JsonAdapter.serializeMap(similarInterestsConfigData.mcc, jsonGenerator, SimilarInterestsMccConfigData.JSON_ADAPTER);
            }
            if (similarInterestsConfigData.baseData != null) {
                jsonGenerator.writeFieldName("baseData");
                SimilarInterestsBaseData.JSON_ADAPTER.serialize(similarInterestsConfigData.baseData, jsonGenerator, true);
            }
            if (similarInterestsConfigData.listData != null) {
                jsonGenerator.writeFieldName("listData");
                JsonAdapter.serializeMap(similarInterestsConfigData.listData, jsonGenerator, SimilarInterestsItemData.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SimilarInterestsConfigData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SimilarInterestsConfigData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SimilarInterestsConfigData new_() {
        SimilarInterestsConfigData similarInterestsConfigData = new SimilarInterestsConfigData();
        similarInterestsConfigData.nullCheck();
        return similarInterestsConfigData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SimilarInterestsConfigData mo223809clone() {
        SimilarInterestsConfigData similarInterestsConfigData = new SimilarInterestsConfigData();
        similarInterestsConfigData.enable = this.enable;
        Map<String, SimilarInterestsMccConfigData> map = this.mcc;
        if (map != null) {
            similarInterestsConfigData.mcc = ValueObject.util_map(map, new w9j() { // from class: l.eff0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((SimilarInterestsMccConfigData) obj).mo223809clone();
                }
            });
        }
        SimilarInterestsBaseData similarInterestsBaseData = this.baseData;
        if (similarInterestsBaseData != null) {
            similarInterestsConfigData.baseData = similarInterestsBaseData.mo223809clone();
        }
        Map<String, SimilarInterestsItemData> map2 = this.listData;
        if (map2 != null) {
            similarInterestsConfigData.listData = ValueObject.util_map(map2, new w9j() { // from class: l.fff0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((SimilarInterestsItemData) obj).mo223809clone();
                }
            });
        }
        return similarInterestsConfigData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SimilarInterestsConfigData)) {
            return false;
        }
        SimilarInterestsConfigData similarInterestsConfigData = (SimilarInterestsConfigData) obj;
        return this.enable == similarInterestsConfigData.enable && ValueObject.util_equals(this.mcc, similarInterestsConfigData.mcc) && ValueObject.util_equals(this.baseData, similarInterestsConfigData.baseData) && ValueObject.util_equals(this.listData, similarInterestsConfigData.listData);
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
        Map<String, SimilarInterestsMccConfigData> map = this.mcc;
        int iHashCode = (i2 + (map != null ? map.hashCode() : 0)) * 41;
        SimilarInterestsBaseData similarInterestsBaseData = this.baseData;
        int iHashCode2 = (iHashCode + (similarInterestsBaseData != null ? similarInterestsBaseData.hashCode() : 0)) * 41;
        Map<String, SimilarInterestsItemData> map2 = this.listData;
        int iHashCode3 = iHashCode2 + (map2 != null ? map2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.mcc == null) {
            this.mcc = Collections.EMPTY_MAP;
        }
        if (this.baseData == null) {
            this.baseData = SimilarInterestsBaseData.new_();
        }
        if (this.listData == null) {
            this.listData = Collections.EMPTY_MAP;
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
