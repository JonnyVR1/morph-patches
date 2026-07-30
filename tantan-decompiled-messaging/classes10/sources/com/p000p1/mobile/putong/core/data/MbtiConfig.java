package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.MbtiInfo;
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
public class MbtiConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "mbticonfig";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<MbtiInfo> mbtis;
    public static ProtobufAdapter<MbtiConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<MbtiConfig>() { // from class: com.p1.mobile.putong.core.data.MbtiConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MbtiConfig mbtiConfig) {
            List<MbtiInfo> list = mbtiConfig.mbtis;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, MbtiInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            ((MessageNano) mbtiConfig).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MbtiConfig m14093parse(nb5 nb5Var) throws IOException {
            MbtiConfig mbtiConfig = new MbtiConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (mbtiConfig.mbtis != null) {
                        break;
                    }
                    mbtiConfig.mbtis = new ArrayList();
                    break;
                }
                if (iU != 10) {
                    if (mbtiConfig.mbtis != null) {
                        break;
                    }
                    mbtiConfig.mbtis = new ArrayList();
                    return mbtiConfig;
                }
                mbtiConfig.mbtis = (List) nb5Var.l(MbtiInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            return mbtiConfig;
        }

        public void serialize(MbtiConfig mbtiConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<MbtiInfo> list = mbtiConfig.mbtis;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, MbtiInfo.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<MbtiConfig> JSON_ADAPTER = new ObjectJsonAdapter<MbtiConfig>() { // from class: com.p1.mobile.putong.core.data.MbtiConfig.2
        public Class getDataClass() {
            return MbtiConfig.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public MbtiConfig m14094newInstance() {
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

        public void serializeFields(MbtiConfig mbtiConfig, JsonGenerator jsonGenerator) throws IOException {
            if (mbtiConfig.mbtis != null) {
                jsonGenerator.writeFieldName("mbtis");
                JsonAdapter.serializeArray(mbtiConfig.mbtis, jsonGenerator, MbtiInfo.JSON_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MbtiConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MbtiConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MbtiConfig new_() {
        MbtiConfig mbtiConfig = new MbtiConfig();
        mbtiConfig.nullCheck();
        return mbtiConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MbtiConfig m14092clone() {
        MbtiConfig mbtiConfig = new MbtiConfig();
        List<MbtiInfo> list = this.mbtis;
        if (list != null) {
            mbtiConfig.mbtis = ValueObject.util_map(list, new w9j() { // from class: l.uex
                public final Object call(Object obj) {
                    return ((MbtiInfo) obj).m14096clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        List<MbtiInfo> list = this.mbtis;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.mbtis == null) {
            this.mbtis = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
