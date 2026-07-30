package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.MbtiInfo;
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
import java.util.List;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes10.dex */
public class MbtiConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "mbticonfig";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<MbtiInfo> mbtis;
    public static ProtobufAdapter<MbtiConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<MbtiConfig>() { // from class: com.p1.mobile.putong.core.data.MbtiConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MbtiConfig mbtiConfig) {
            List<MbtiInfo> list = mbtiConfig.mbtis;
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, list, MbtiInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            mbtiConfig.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MbtiConfig parse(nb5 nb5Var) throws IOException {
            MbtiConfig mbtiConfig = new MbtiConfig();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (mbtiConfig.mbtis != null) {
                        break;
                    }
                    mbtiConfig.mbtis = new ArrayList();
                    break;
                }
                if (iM158752u != 10) {
                    if (mbtiConfig.mbtis != null) {
                        break;
                    }
                    mbtiConfig.mbtis = new ArrayList();
                    return mbtiConfig;
                }
                mbtiConfig.mbtis = (List) nb5Var.m158743l(MbtiInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            return mbtiConfig;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MbtiConfig mbtiConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<MbtiInfo> list = mbtiConfig.mbtis;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, MbtiInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<MbtiConfig> JSON_ADAPTER = new ObjectJsonAdapter<MbtiConfig>() { // from class: com.p1.mobile.putong.core.data.MbtiConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MbtiConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MbtiConfig newInstance() {
            return new MbtiConfig();
        }

        public boolean parseField(MbtiConfig mbtiConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("mbtis")) {
                return false;
            }
            mbtiConfig.mbtis = JsonAdapter.parseArray(jsonParser, MbtiInfo.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(MbtiConfig mbtiConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("mbtis")) {
                return true;
            }
            return super.parseFieldCheck(mbtiConfig, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MbtiConfig mbtiConfig, JsonGenerator jsonGenerator) throws IOException {
            if (mbtiConfig.mbtis != null) {
                jsonGenerator.writeFieldName("mbtis");
                JsonAdapter.serializeArray(mbtiConfig.mbtis, jsonGenerator, MbtiInfo.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MbtiConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MbtiConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MbtiConfig new_() {
        MbtiConfig mbtiConfig = new MbtiConfig();
        mbtiConfig.nullCheck();
        return mbtiConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MbtiConfig mo223809clone() {
        MbtiConfig mbtiConfig = new MbtiConfig();
        List<MbtiInfo> list = this.mbtis;
        if (list != null) {
            mbtiConfig.mbtis = ValueObject.util_map(list, new w9j() { // from class: l.uex
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((MbtiInfo) obj).mo223809clone();
                }
            });
        }
        return mbtiConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MbtiConfig) {
            return ValueObject.util_equals(this.mbtis, ((MbtiConfig) obj).mbtis);
        }
        return false;
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
        List<MbtiInfo> list = this.mbtis;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.mbtis == null) {
            this.mbtis = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
