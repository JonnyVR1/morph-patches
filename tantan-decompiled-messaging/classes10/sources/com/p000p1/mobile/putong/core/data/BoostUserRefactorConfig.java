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
public class BoostUserRefactorConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "boostuserrefactorconfig";

    @ProtobufIndex(index = 1)
    public boolean enabled;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int guide_interval_days;
    public static ProtobufAdapter<BoostUserRefactorConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<BoostUserRefactorConfig>() { // from class: com.p1.mobile.putong.core.data.BoostUserRefactorConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(BoostUserRefactorConfig boostUserRefactorConfig) {
            int iB = CodedOutputByteBufferNano.b(1, boostUserRefactorConfig.enabled) + CodedOutputByteBufferNano.h(2, boostUserRefactorConfig.guide_interval_days);
            ((MessageNano) boostUserRefactorConfig).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public BoostUserRefactorConfig m11807parse(nb5 nb5Var) throws IOException {
            BoostUserRefactorConfig boostUserRefactorConfig = new BoostUserRefactorConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    boostUserRefactorConfig.enabled = nb5Var.g();
                } else {
                    if (iU != 16) {
                        return boostUserRefactorConfig;
                    }
                    boostUserRefactorConfig.guide_interval_days = nb5Var.j();
                }
            }
        }

        public void serialize(BoostUserRefactorConfig boostUserRefactorConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, boostUserRefactorConfig.enabled);
            codedOutputByteBufferNano.G(2, boostUserRefactorConfig.guide_interval_days);
        }
    };
    public static JsonAdapter<BoostUserRefactorConfig> JSON_ADAPTER = new ObjectJsonAdapter<BoostUserRefactorConfig>() { // from class: com.p1.mobile.putong.core.data.BoostUserRefactorConfig.2
        public Class getDataClass() {
            return BoostUserRefactorConfig.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public BoostUserRefactorConfig m11808newInstance() {
            return new BoostUserRefactorConfig();
        }

        public boolean parseField(BoostUserRefactorConfig boostUserRefactorConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("enabled")) {
                boostUserRefactorConfig.enabled = jsonParser.getValueAsBoolean();
                return true;
            }
            if (!str.equals("guide_interval_days")) {
                return false;
            }
            boostUserRefactorConfig.guide_interval_days = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(BoostUserRefactorConfig boostUserRefactorConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("enabled") || str.equals("guide_interval_days")) {
                return true;
            }
            return super.parseFieldCheck(boostUserRefactorConfig, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(BoostUserRefactorConfig boostUserRefactorConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("enabled", boostUserRefactorConfig.enabled);
            jsonGenerator.writeNumberField("guide_interval_days", boostUserRefactorConfig.guide_interval_days);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((BoostUserRefactorConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BoostUserRefactorConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static BoostUserRefactorConfig new_() {
        BoostUserRefactorConfig boostUserRefactorConfig = new BoostUserRefactorConfig();
        boostUserRefactorConfig.nullCheck();
        return boostUserRefactorConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public BoostUserRefactorConfig m11806clone() {
        BoostUserRefactorConfig boostUserRefactorConfig = new BoostUserRefactorConfig();
        boostUserRefactorConfig.enabled = this.enabled;
        boostUserRefactorConfig.guide_interval_days = this.guide_interval_days;
        return boostUserRefactorConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BoostUserRefactorConfig)) {
            return false;
        }
        BoostUserRefactorConfig boostUserRefactorConfig = (BoostUserRefactorConfig) obj;
        return this.enabled == boostUserRefactorConfig.enabled && this.guide_interval_days == boostUserRefactorConfig.guide_interval_days;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((i * 41) + (this.enabled ? 1231 : 1237)) * 41) + this.guide_interval_days;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
