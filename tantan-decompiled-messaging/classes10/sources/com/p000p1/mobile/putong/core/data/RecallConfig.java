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
public class RecallConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "recallconfig";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public boolean enable;

    @ProtobufIndex(index = 1)
    public int minutes;
    public static ProtobufAdapter<RecallConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<RecallConfig>() { // from class: com.p1.mobile.putong.core.data.RecallConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(RecallConfig recallConfig) {
            int iH = CodedOutputByteBufferNano.h(1, recallConfig.minutes) + CodedOutputByteBufferNano.b(2, recallConfig.enable);
            ((MessageNano) recallConfig).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public RecallConfig m15281parse(nb5 nb5Var) throws IOException {
            RecallConfig recallConfig = new RecallConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    recallConfig.minutes = nb5Var.j();
                } else {
                    if (iU != 16) {
                        return recallConfig;
                    }
                    recallConfig.enable = nb5Var.g();
                }
            }
        }

        public void serialize(RecallConfig recallConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, recallConfig.minutes);
            codedOutputByteBufferNano.A(2, recallConfig.enable);
        }
    };
    public static JsonAdapter<RecallConfig> JSON_ADAPTER = new ObjectJsonAdapter<RecallConfig>() { // from class: com.p1.mobile.putong.core.data.RecallConfig.2
        public Class getDataClass() {
            return RecallConfig.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public RecallConfig m15282newInstance() {
            return new RecallConfig();
        }

        public boolean parseField(RecallConfig recallConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("enable")) {
                recallConfig.enable = jsonParser.getValueAsBoolean();
                return true;
            }
            if (!str.equals("minutes")) {
                return false;
            }
            recallConfig.minutes = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(RecallConfig recallConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("enable") || str.equals("minutes")) {
                return true;
            }
            return super.parseFieldCheck(recallConfig, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(RecallConfig recallConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("minutes", recallConfig.minutes);
            jsonGenerator.writeBooleanField("enable", recallConfig.enable);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RecallConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RecallConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RecallConfig new_() {
        RecallConfig recallConfig = new RecallConfig();
        recallConfig.nullCheck();
        return recallConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public RecallConfig m15280clone() {
        RecallConfig recallConfig = new RecallConfig();
        recallConfig.minutes = this.minutes;
        recallConfig.enable = this.enable;
        return recallConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RecallConfig)) {
            return false;
        }
        RecallConfig recallConfig = (RecallConfig) obj;
        return this.minutes == recallConfig.minutes && this.enable == recallConfig.enable;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((i * 41) + this.minutes) * 41) + (this.enable ? 1231 : 1237);
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
