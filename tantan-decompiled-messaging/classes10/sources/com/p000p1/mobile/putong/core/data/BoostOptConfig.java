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
public class BoostOptConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "boostoptconfig";

    @ProtobufIndex(index = 1)
    public int min_match_count;
    public static ProtobufAdapter<BoostOptConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<BoostOptConfig>() { // from class: com.p1.mobile.putong.core.data.BoostOptConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(BoostOptConfig boostOptConfig) {
            int iH = CodedOutputByteBufferNano.h(1, boostOptConfig.min_match_count);
            ((MessageNano) boostOptConfig).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public BoostOptConfig m11783parse(nb5 nb5Var) throws IOException {
            BoostOptConfig boostOptConfig = new BoostOptConfig();
            while (nb5Var.u() == 8) {
                boostOptConfig.min_match_count = nb5Var.j();
            }
            return boostOptConfig;
        }

        public void serialize(BoostOptConfig boostOptConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, boostOptConfig.min_match_count);
        }
    };
    public static JsonAdapter<BoostOptConfig> JSON_ADAPTER = new ObjectJsonAdapter<BoostOptConfig>() { // from class: com.p1.mobile.putong.core.data.BoostOptConfig.2
        public Class getDataClass() {
            return BoostOptConfig.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public BoostOptConfig m11784newInstance() {
            return new BoostOptConfig();
        }

        public boolean parseField(BoostOptConfig boostOptConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("min_match_count")) {
                return false;
            }
            boostOptConfig.min_match_count = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(BoostOptConfig boostOptConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("min_match_count")) {
                return true;
            }
            return super.parseFieldCheck(boostOptConfig, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(BoostOptConfig boostOptConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("min_match_count", boostOptConfig.min_match_count);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((BoostOptConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BoostOptConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static BoostOptConfig new_() {
        BoostOptConfig boostOptConfig = new BoostOptConfig();
        boostOptConfig.nullCheck();
        return boostOptConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public BoostOptConfig m11782clone() {
        BoostOptConfig boostOptConfig = new BoostOptConfig();
        boostOptConfig.min_match_count = this.min_match_count;
        return boostOptConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof BoostOptConfig) && this.min_match_count == ((BoostOptConfig) obj).min_match_count;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (i * 41) + this.min_match_count;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
