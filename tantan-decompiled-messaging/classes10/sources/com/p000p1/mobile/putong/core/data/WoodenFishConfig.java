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
public class WoodenFishConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "woodenfishconfig";

    @ProtobufIndex(index = 1)
    public boolean exp;
    public static ProtobufAdapter<WoodenFishConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<WoodenFishConfig>() { // from class: com.p1.mobile.putong.core.data.WoodenFishConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(WoodenFishConfig woodenFishConfig) {
            int iB = CodedOutputByteBufferNano.b(1, woodenFishConfig.exp);
            ((MessageNano) woodenFishConfig).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public WoodenFishConfig m16341parse(nb5 nb5Var) throws IOException {
            WoodenFishConfig woodenFishConfig = new WoodenFishConfig();
            while (nb5Var.u() == 8) {
                woodenFishConfig.exp = nb5Var.g();
            }
            return woodenFishConfig;
        }

        public void serialize(WoodenFishConfig woodenFishConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, woodenFishConfig.exp);
        }
    };
    public static JsonAdapter<WoodenFishConfig> JSON_ADAPTER = new ObjectJsonAdapter<WoodenFishConfig>() { // from class: com.p1.mobile.putong.core.data.WoodenFishConfig.2
        public Class getDataClass() {
            return WoodenFishConfig.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public WoodenFishConfig m16342newInstance() {
            return new WoodenFishConfig();
        }

        public boolean parseField(WoodenFishConfig woodenFishConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("exp")) {
                return false;
            }
            woodenFishConfig.exp = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(WoodenFishConfig woodenFishConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("exp")) {
                return true;
            }
            return super.parseFieldCheck(woodenFishConfig, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(WoodenFishConfig woodenFishConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("exp", woodenFishConfig.exp);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((WoodenFishConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((WoodenFishConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static WoodenFishConfig new_() {
        WoodenFishConfig woodenFishConfig = new WoodenFishConfig();
        woodenFishConfig.nullCheck();
        return woodenFishConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public WoodenFishConfig m16340clone() {
        WoodenFishConfig woodenFishConfig = new WoodenFishConfig();
        woodenFishConfig.exp = this.exp;
        return woodenFishConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof WoodenFishConfig) && this.exp == ((WoodenFishConfig) obj).exp;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (i * 41) + (this.exp ? 1231 : 1237);
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
