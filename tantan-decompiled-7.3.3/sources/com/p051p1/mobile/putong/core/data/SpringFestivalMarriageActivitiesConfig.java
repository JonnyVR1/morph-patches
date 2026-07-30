package com.p051p1.mobile.putong.core.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.sina.weibo.sdk.constant.WBConstants;
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
import p153l.nc5;

/* JADX INFO: loaded from: classes10.dex */
public class SpringFestivalMarriageActivitiesConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "springfestivalmarriageactivitiesconfig";

    @ProtobufIndex(index = 2)
    public boolean activities;

    @ProtobufIndex(index = 1)
    public int version;
    public static ProtobufAdapter<SpringFestivalMarriageActivitiesConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<SpringFestivalMarriageActivitiesConfig>() { // from class: com.p1.mobile.putong.core.data.SpringFestivalMarriageActivitiesConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SpringFestivalMarriageActivitiesConfig springFestivalMarriageActivitiesConfig) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, springFestivalMarriageActivitiesConfig.version) + CodedOutputByteBufferNano.m17275b(2, springFestivalMarriageActivitiesConfig.activities);
            springFestivalMarriageActivitiesConfig.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SpringFestivalMarriageActivitiesConfig parse(nc5 nc5Var) throws IOException {
            SpringFestivalMarriageActivitiesConfig springFestivalMarriageActivitiesConfig = new SpringFestivalMarriageActivitiesConfig();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    springFestivalMarriageActivitiesConfig.version = nc5Var.m162486j();
                } else {
                    if (iM162497u != 16) {
                        return springFestivalMarriageActivitiesConfig;
                    }
                    springFestivalMarriageActivitiesConfig.activities = nc5Var.m162483g();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SpringFestivalMarriageActivitiesConfig springFestivalMarriageActivitiesConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, springFestivalMarriageActivitiesConfig.version);
            codedOutputByteBufferNano.m17299A(2, springFestivalMarriageActivitiesConfig.activities);
        }
    };
    public static JsonAdapter<SpringFestivalMarriageActivitiesConfig> JSON_ADAPTER = new ObjectJsonAdapter<SpringFestivalMarriageActivitiesConfig>() { // from class: com.p1.mobile.putong.core.data.SpringFestivalMarriageActivitiesConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SpringFestivalMarriageActivitiesConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SpringFestivalMarriageActivitiesConfig newInstance() {
            return new SpringFestivalMarriageActivitiesConfig();
        }

        public boolean parseField(SpringFestivalMarriageActivitiesConfig springFestivalMarriageActivitiesConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(WBConstants.AUTH_PARAMS_VERSION)) {
                springFestivalMarriageActivitiesConfig.version = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals("activities")) {
                return false;
            }
            springFestivalMarriageActivitiesConfig.activities = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(SpringFestivalMarriageActivitiesConfig springFestivalMarriageActivitiesConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(WBConstants.AUTH_PARAMS_VERSION) || str.equals("activities")) {
                return true;
            }
            return super.parseFieldCheck(springFestivalMarriageActivitiesConfig, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SpringFestivalMarriageActivitiesConfig springFestivalMarriageActivitiesConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("activities", springFestivalMarriageActivitiesConfig.activities);
            jsonGenerator.writeNumberField(WBConstants.AUTH_PARAMS_VERSION, springFestivalMarriageActivitiesConfig.version);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SpringFestivalMarriageActivitiesConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SpringFestivalMarriageActivitiesConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SpringFestivalMarriageActivitiesConfig new_() {
        SpringFestivalMarriageActivitiesConfig springFestivalMarriageActivitiesConfig = new SpringFestivalMarriageActivitiesConfig();
        springFestivalMarriageActivitiesConfig.nullCheck();
        return springFestivalMarriageActivitiesConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SpringFestivalMarriageActivitiesConfig mo225055clone() {
        SpringFestivalMarriageActivitiesConfig springFestivalMarriageActivitiesConfig = new SpringFestivalMarriageActivitiesConfig();
        springFestivalMarriageActivitiesConfig.activities = this.activities;
        springFestivalMarriageActivitiesConfig.version = this.version;
        return springFestivalMarriageActivitiesConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SpringFestivalMarriageActivitiesConfig)) {
            return false;
        }
        SpringFestivalMarriageActivitiesConfig springFestivalMarriageActivitiesConfig = (SpringFestivalMarriageActivitiesConfig) obj;
        return this.activities == springFestivalMarriageActivitiesConfig.activities && this.version == springFestivalMarriageActivitiesConfig.version;
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
        int i2 = (((i * 41) + (this.activities ? 1231 : 1237)) * 41) + this.version;
        this.hashCode = i2;
        return i2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
