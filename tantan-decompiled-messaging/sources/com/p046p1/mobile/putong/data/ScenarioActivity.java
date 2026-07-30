package com.p046p1.mobile.putong.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes12.dex */
public class ScenarioActivity extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "scenarioactivity";

    @ProtobufIndex(index = 2)
    public double updatedTime;

    @ProtobufIndex(index = 1)
    public long users;
    public static ProtobufAdapter<ScenarioActivity> PROTOBUF_ADAPTER = new MessageNanoAdapter<ScenarioActivity>() { // from class: com.p1.mobile.putong.data.ScenarioActivity.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ScenarioActivity scenarioActivity) {
            int iM17228j = CodedOutputByteBufferNano.m17228j(1, scenarioActivity.users) + CodedOutputByteBufferNano.m17222d(2, scenarioActivity.updatedTime);
            scenarioActivity.cachedSize = iM17228j;
            return iM17228j;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ScenarioActivity parse(nb5 nb5Var) throws IOException {
            ScenarioActivity scenarioActivity = new ScenarioActivity();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    scenarioActivity.users = nb5Var.m158742k();
                } else {
                    if (iM158752u != 17) {
                        return scenarioActivity;
                    }
                    scenarioActivity.updatedTime = nb5Var.m158739h();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ScenarioActivity scenarioActivity, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17252I(1, scenarioActivity.users);
            codedOutputByteBufferNano.m17246C(2, scenarioActivity.updatedTime);
        }
    };
    public static JsonAdapter<ScenarioActivity> JSON_ADAPTER = new ObjectJsonAdapter<ScenarioActivity>() { // from class: com.p1.mobile.putong.data.ScenarioActivity.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ScenarioActivity.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ScenarioActivity newInstance() {
            return new ScenarioActivity();
        }

        public boolean parseField(ScenarioActivity scenarioActivity, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(LocationInvisibleField.updatedTime)) {
                scenarioActivity.updatedTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                return true;
            }
            if (!str.equals("users")) {
                return false;
            }
            scenarioActivity.users = jsonParser.getValueAsLong();
            return true;
        }

        public boolean parseFieldCheck(ScenarioActivity scenarioActivity, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(LocationInvisibleField.updatedTime) || str.equals("users")) {
                return true;
            }
            return super.parseFieldCheck(scenarioActivity, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ScenarioActivity scenarioActivity, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("users", scenarioActivity.users);
            jsonGenerator.writeFieldName(LocationInvisibleField.updatedTime);
            Converter.API_TIME.serialize(Double.valueOf(scenarioActivity.updatedTime), jsonGenerator, true);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ScenarioActivity) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ScenarioActivity) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ScenarioActivity new_() {
        ScenarioActivity scenarioActivity = new ScenarioActivity();
        scenarioActivity.nullCheck();
        return scenarioActivity;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ScenarioActivity mo223809clone() {
        ScenarioActivity scenarioActivity = new ScenarioActivity();
        scenarioActivity.users = this.users;
        scenarioActivity.updatedTime = this.updatedTime;
        return scenarioActivity;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ScenarioActivity)) {
            return false;
        }
        ScenarioActivity scenarioActivity = (ScenarioActivity) obj;
        return this.users == scenarioActivity.users && this.updatedTime == scenarioActivity.updatedTime;
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
        long j = this.users;
        int i2 = (i * 41) + ((int) (j ^ (j >>> 32)));
        long jDoubleToLongBits = Double.doubleToLongBits(this.updatedTime);
        int i3 = (i2 * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
