package com.p000p1.mobile.putong.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class ScenarioActivity extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "scenarioactivity";

    @ProtobufIndex(index = 2)
    public double updatedTime;

    @ProtobufIndex(index = 1)
    public long users;
    public static ProtobufAdapter<ScenarioActivity> PROTOBUF_ADAPTER = new MessageNanoAdapter<ScenarioActivity>() { // from class: com.p1.mobile.putong.data.ScenarioActivity.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ScenarioActivity scenarioActivity) {
            int iJ = CodedOutputByteBufferNano.j(1, scenarioActivity.users) + CodedOutputByteBufferNano.d(2, scenarioActivity.updatedTime);
            ((MessageNano) scenarioActivity).cachedSize = iJ;
            return iJ;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ScenarioActivity m18929parse(nb5 nb5Var) throws IOException {
            ScenarioActivity scenarioActivity = new ScenarioActivity();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    scenarioActivity.users = nb5Var.k();
                } else {
                    if (iU != 17) {
                        return scenarioActivity;
                    }
                    scenarioActivity.updatedTime = nb5Var.h();
                }
            }
        }

        public void serialize(ScenarioActivity scenarioActivity, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.I(1, scenarioActivity.users);
            codedOutputByteBufferNano.C(2, scenarioActivity.updatedTime);
        }
    };
    public static JsonAdapter<ScenarioActivity> JSON_ADAPTER = new ObjectJsonAdapter<ScenarioActivity>() { // from class: com.p1.mobile.putong.data.ScenarioActivity.2
        public Class getDataClass() {
            return ScenarioActivity.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public ScenarioActivity mo17830newInstance() {
            return new ScenarioActivity();
        }

        public boolean parseField(ScenarioActivity scenarioActivity, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(LocationInvisibleField.updatedTime)) {
                scenarioActivity.updatedTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ScenarioActivity scenarioActivity, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("users", scenarioActivity.users);
            jsonGenerator.writeFieldName(LocationInvisibleField.updatedTime);
            Converter.API_TIME.serialize(Double.valueOf(scenarioActivity.updatedTime), jsonGenerator, true);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ScenarioActivity) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ScenarioActivity) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ScenarioActivity new_() {
        ScenarioActivity scenarioActivity = new ScenarioActivity();
        scenarioActivity.nullCheck();
        return scenarioActivity;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ScenarioActivity m18928clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        long j = this.users;
        int i2 = (i * 41) + ((int) (j ^ (j >>> 32)));
        long jDoubleToLongBits = Double.doubleToLongBits(this.updatedTime);
        int i3 = (i2 * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        ((ValueObject) this).hashCode = i3;
        return i3;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
