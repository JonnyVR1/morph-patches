package com.p000p1.mobile.putong.core.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class LoveRadarConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "loveradarconfig";

    @ProtobufIndex(index = 1)
    public boolean isHaveLoveRadar;
    public static ProtobufAdapter<LoveRadarConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<LoveRadarConfig>() { // from class: com.p1.mobile.putong.core.data.LoveRadarConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(LoveRadarConfig loveRadarConfig) {
            int iB = CodedOutputByteBufferNano.b(1, loveRadarConfig.isHaveLoveRadar);
            ((MessageNano) loveRadarConfig).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public LoveRadarConfig m14017parse(nb5 nb5Var) throws IOException {
            LoveRadarConfig loveRadarConfig = new LoveRadarConfig();
            while (nb5Var.u() == 8) {
                loveRadarConfig.isHaveLoveRadar = nb5Var.g();
            }
            return loveRadarConfig;
        }

        public void serialize(LoveRadarConfig loveRadarConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, loveRadarConfig.isHaveLoveRadar);
        }
    };
    public static JsonAdapter<LoveRadarConfig> JSON_ADAPTER = new ObjectJsonAdapter<LoveRadarConfig>() { // from class: com.p1.mobile.putong.core.data.LoveRadarConfig.2
        public Class getDataClass() {
            return LoveRadarConfig.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public LoveRadarConfig m14018newInstance() {
            return new LoveRadarConfig();
        }

        public boolean parseField(LoveRadarConfig loveRadarConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("isHaveLoveRadar")) {
                return false;
            }
            loveRadarConfig.isHaveLoveRadar = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(LoveRadarConfig loveRadarConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("isHaveLoveRadar")) {
                return true;
            }
            return super.parseFieldCheck(loveRadarConfig, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(LoveRadarConfig loveRadarConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("isHaveLoveRadar", loveRadarConfig.isHaveLoveRadar);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LoveRadarConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LoveRadarConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LoveRadarConfig new_() {
        LoveRadarConfig loveRadarConfig = new LoveRadarConfig();
        loveRadarConfig.nullCheck();
        return loveRadarConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public LoveRadarConfig m14016clone() {
        LoveRadarConfig loveRadarConfig = new LoveRadarConfig();
        loveRadarConfig.isHaveLoveRadar = this.isHaveLoveRadar;
        return loveRadarConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof LoveRadarConfig) && this.isHaveLoveRadar == ((LoveRadarConfig) obj).isHaveLoveRadar;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (i * 41) + (this.isHaveLoveRadar ? 1231 : 1237);
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
