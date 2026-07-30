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
public class NewMatchConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "newmatchconfig";

    @ProtobufIndex(index = 1)
    public boolean suggest;
    public static ProtobufAdapter<NewMatchConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<NewMatchConfig>() { // from class: com.p1.mobile.putong.core.data.NewMatchConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(NewMatchConfig newMatchConfig) {
            int iB = CodedOutputByteBufferNano.b(1, newMatchConfig.suggest);
            ((MessageNano) newMatchConfig).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public NewMatchConfig m14515parse(nb5 nb5Var) throws IOException {
            NewMatchConfig newMatchConfig = new NewMatchConfig();
            while (nb5Var.u() == 8) {
                newMatchConfig.suggest = nb5Var.g();
            }
            return newMatchConfig;
        }

        public void serialize(NewMatchConfig newMatchConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, newMatchConfig.suggest);
        }
    };
    public static JsonAdapter<NewMatchConfig> JSON_ADAPTER = new ObjectJsonAdapter<NewMatchConfig>() { // from class: com.p1.mobile.putong.core.data.NewMatchConfig.2
        public Class getDataClass() {
            return NewMatchConfig.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public NewMatchConfig m14516newInstance() {
            return new NewMatchConfig();
        }

        public boolean parseField(NewMatchConfig newMatchConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("suggest")) {
                return false;
            }
            newMatchConfig.suggest = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(NewMatchConfig newMatchConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("suggest")) {
                return true;
            }
            return super.parseFieldCheck(newMatchConfig, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(NewMatchConfig newMatchConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("suggest", newMatchConfig.suggest);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((NewMatchConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((NewMatchConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static NewMatchConfig new_() {
        NewMatchConfig newMatchConfig = new NewMatchConfig();
        newMatchConfig.nullCheck();
        return newMatchConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public NewMatchConfig m14514clone() {
        NewMatchConfig newMatchConfig = new NewMatchConfig();
        newMatchConfig.suggest = this.suggest;
        return newMatchConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof NewMatchConfig) && this.suggest == ((NewMatchConfig) obj).suggest;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (i * 41) + (this.suggest ? 1231 : 1237);
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
