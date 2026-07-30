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
public class CityCConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "citycconfig";

    @ProtobufIndex(index = 1)
    public boolean showSelfCard;
    public static ProtobufAdapter<CityCConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<CityCConfig>() { // from class: com.p1.mobile.putong.core.data.CityCConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(CityCConfig cityCConfig) {
            int iB = CodedOutputByteBufferNano.b(1, cityCConfig.showSelfCard);
            ((MessageNano) cityCConfig).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public CityCConfig m12181parse(nb5 nb5Var) throws IOException {
            CityCConfig cityCConfig = new CityCConfig();
            while (nb5Var.u() == 8) {
                cityCConfig.showSelfCard = nb5Var.g();
            }
            return cityCConfig;
        }

        public void serialize(CityCConfig cityCConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, cityCConfig.showSelfCard);
        }
    };
    public static JsonAdapter<CityCConfig> JSON_ADAPTER = new ObjectJsonAdapter<CityCConfig>() { // from class: com.p1.mobile.putong.core.data.CityCConfig.2
        public Class getDataClass() {
            return CityCConfig.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public CityCConfig m12182newInstance() {
            return new CityCConfig();
        }

        public boolean parseField(CityCConfig cityCConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("showSelfCard")) {
                return false;
            }
            cityCConfig.showSelfCard = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(CityCConfig cityCConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("showSelfCard")) {
                return true;
            }
            return super.parseFieldCheck(cityCConfig, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(CityCConfig cityCConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("showSelfCard", cityCConfig.showSelfCard);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CityCConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CityCConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CityCConfig new_() {
        CityCConfig cityCConfig = new CityCConfig();
        cityCConfig.nullCheck();
        return cityCConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public CityCConfig m12180clone() {
        CityCConfig cityCConfig = new CityCConfig();
        cityCConfig.showSelfCard = this.showSelfCard;
        return cityCConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof CityCConfig) && this.showSelfCard == ((CityCConfig) obj).showSelfCard;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (i * 41) + (this.showSelfCard ? 1231 : 1237);
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
