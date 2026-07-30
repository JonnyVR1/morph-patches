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
public class SpringFestivalMarriageActivitiesConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "springfestivalmarriageactivitiesconfig";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public boolean activities;

    @ProtobufIndex(index = 1)
    public int version;
    public static ProtobufAdapter<SpringFestivalMarriageActivitiesConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<SpringFestivalMarriageActivitiesConfig>() { // from class: com.p1.mobile.putong.core.data.SpringFestivalMarriageActivitiesConfig.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SpringFestivalMarriageActivitiesConfig springFestivalMarriageActivitiesConfig) {
            int iH = CodedOutputByteBufferNano.h(1, springFestivalMarriageActivitiesConfig.version) + CodedOutputByteBufferNano.b(2, springFestivalMarriageActivitiesConfig.activities);
            ((MessageNano) springFestivalMarriageActivitiesConfig).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SpringFestivalMarriageActivitiesConfig m15730parse(nb5 nb5Var) throws IOException {
            SpringFestivalMarriageActivitiesConfig springFestivalMarriageActivitiesConfig = new SpringFestivalMarriageActivitiesConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    springFestivalMarriageActivitiesConfig.version = nb5Var.j();
                } else {
                    if (iU != 16) {
                        return springFestivalMarriageActivitiesConfig;
                    }
                    springFestivalMarriageActivitiesConfig.activities = nb5Var.g();
                }
            }
        }

        public void serialize(SpringFestivalMarriageActivitiesConfig springFestivalMarriageActivitiesConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, springFestivalMarriageActivitiesConfig.version);
            codedOutputByteBufferNano.A(2, springFestivalMarriageActivitiesConfig.activities);
        }
    };
    public static JsonAdapter<SpringFestivalMarriageActivitiesConfig> JSON_ADAPTER = new ObjectJsonAdapter<SpringFestivalMarriageActivitiesConfig>() { // from class: com.p1.mobile.putong.core.data.SpringFestivalMarriageActivitiesConfig.2
        public Class getDataClass() {
            return SpringFestivalMarriageActivitiesConfig.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public SpringFestivalMarriageActivitiesConfig m15731newInstance() {
            return new SpringFestivalMarriageActivitiesConfig();
        }

        public boolean parseField(SpringFestivalMarriageActivitiesConfig springFestivalMarriageActivitiesConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("version")) {
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
            if (str.equals("version") || str.equals("activities")) {
                return true;
            }
            return super.parseFieldCheck(springFestivalMarriageActivitiesConfig, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(SpringFestivalMarriageActivitiesConfig springFestivalMarriageActivitiesConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("activities", springFestivalMarriageActivitiesConfig.activities);
            jsonGenerator.writeNumberField("version", springFestivalMarriageActivitiesConfig.version);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SpringFestivalMarriageActivitiesConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SpringFestivalMarriageActivitiesConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SpringFestivalMarriageActivitiesConfig new_() {
        SpringFestivalMarriageActivitiesConfig springFestivalMarriageActivitiesConfig = new SpringFestivalMarriageActivitiesConfig();
        springFestivalMarriageActivitiesConfig.nullCheck();
        return springFestivalMarriageActivitiesConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SpringFestivalMarriageActivitiesConfig m15729clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((i * 41) + (this.activities ? 1231 : 1237)) * 41) + this.version;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
