package com.p046p1.mobile.putong.core.data;

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

/* JADX INFO: loaded from: classes10.dex */
public class ImproveInformationConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "improveinformationconfig";

    @ProtobufIndex(index = 5)
    public boolean QA_EqualRightsEnable;

    @ProtobufIndex(index = 1)
    public boolean cardGuidanceEnable;

    @ProtobufIndex(index = 4)
    public int maximumDisplayPerDay;

    @ProtobufIndex(index = 3)
    public int sameInforCanBeDisplayedAtMost;

    @ProtobufIndex(index = 2)
    public int showIntervalCardSwipe;
    public static ProtobufAdapter<ImproveInformationConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<ImproveInformationConfig>() { // from class: com.p1.mobile.putong.core.data.ImproveInformationConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ImproveInformationConfig improveInformationConfig) {
            int iM17220b = CodedOutputByteBufferNano.m17220b(1, improveInformationConfig.cardGuidanceEnable) + CodedOutputByteBufferNano.m17226h(2, improveInformationConfig.showIntervalCardSwipe) + CodedOutputByteBufferNano.m17226h(3, improveInformationConfig.sameInforCanBeDisplayedAtMost) + CodedOutputByteBufferNano.m17226h(4, improveInformationConfig.maximumDisplayPerDay) + CodedOutputByteBufferNano.m17220b(5, improveInformationConfig.QA_EqualRightsEnable);
            improveInformationConfig.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ImproveInformationConfig parse(nb5 nb5Var) throws IOException {
            ImproveInformationConfig improveInformationConfig = new ImproveInformationConfig();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    improveInformationConfig.cardGuidanceEnable = nb5Var.m158738g();
                } else if (iM158752u == 16) {
                    improveInformationConfig.showIntervalCardSwipe = nb5Var.m158741j();
                } else if (iM158752u == 24) {
                    improveInformationConfig.sameInforCanBeDisplayedAtMost = nb5Var.m158741j();
                } else if (iM158752u == 32) {
                    improveInformationConfig.maximumDisplayPerDay = nb5Var.m158741j();
                } else {
                    if (iM158752u != 40) {
                        return improveInformationConfig;
                    }
                    improveInformationConfig.QA_EqualRightsEnable = nb5Var.m158738g();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ImproveInformationConfig improveInformationConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17244A(1, improveInformationConfig.cardGuidanceEnable);
            codedOutputByteBufferNano.m17250G(2, improveInformationConfig.showIntervalCardSwipe);
            codedOutputByteBufferNano.m17250G(3, improveInformationConfig.sameInforCanBeDisplayedAtMost);
            codedOutputByteBufferNano.m17250G(4, improveInformationConfig.maximumDisplayPerDay);
            codedOutputByteBufferNano.m17244A(5, improveInformationConfig.QA_EqualRightsEnable);
        }
    };
    public static JsonAdapter<ImproveInformationConfig> JSON_ADAPTER = new ObjectJsonAdapter<ImproveInformationConfig>() { // from class: com.p1.mobile.putong.core.data.ImproveInformationConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ImproveInformationConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ImproveInformationConfig newInstance() {
            return new ImproveInformationConfig();
        }

        public boolean parseField(ImproveInformationConfig improveInformationConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "showIntervalCardSwipe":
                    improveInformationConfig.showIntervalCardSwipe = jsonParser.getValueAsInt();
                    return true;
                case "maximumDisplayPerDay":
                    improveInformationConfig.maximumDisplayPerDay = jsonParser.getValueAsInt();
                    return true;
                case "sameInforCanBeDisplayedAtMost":
                    improveInformationConfig.sameInforCanBeDisplayedAtMost = jsonParser.getValueAsInt();
                    return true;
                case "cardGuidanceEnable":
                    improveInformationConfig.cardGuidanceEnable = jsonParser.getValueAsBoolean();
                    return true;
                case "QA_EqualRightsEnable":
                    improveInformationConfig.QA_EqualRightsEnable = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ImproveInformationConfig improveInformationConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "showIntervalCardSwipe":
                case "maximumDisplayPerDay":
                case "sameInforCanBeDisplayedAtMost":
                case "cardGuidanceEnable":
                case "QA_EqualRightsEnable":
                    return true;
                default:
                    return super.parseFieldCheck(improveInformationConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ImproveInformationConfig improveInformationConfig, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("cardGuidanceEnable", improveInformationConfig.cardGuidanceEnable);
            jsonGenerator.writeNumberField("showIntervalCardSwipe", improveInformationConfig.showIntervalCardSwipe);
            jsonGenerator.writeNumberField("sameInforCanBeDisplayedAtMost", improveInformationConfig.sameInforCanBeDisplayedAtMost);
            jsonGenerator.writeNumberField("maximumDisplayPerDay", improveInformationConfig.maximumDisplayPerDay);
            jsonGenerator.writeBooleanField("QA_EqualRightsEnable", improveInformationConfig.QA_EqualRightsEnable);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ImproveInformationConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ImproveInformationConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ImproveInformationConfig new_() {
        ImproveInformationConfig improveInformationConfig = new ImproveInformationConfig();
        improveInformationConfig.nullCheck();
        return improveInformationConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ImproveInformationConfig mo223809clone() {
        ImproveInformationConfig improveInformationConfig = new ImproveInformationConfig();
        improveInformationConfig.cardGuidanceEnable = this.cardGuidanceEnable;
        improveInformationConfig.showIntervalCardSwipe = this.showIntervalCardSwipe;
        improveInformationConfig.sameInforCanBeDisplayedAtMost = this.sameInforCanBeDisplayedAtMost;
        improveInformationConfig.maximumDisplayPerDay = this.maximumDisplayPerDay;
        improveInformationConfig.QA_EqualRightsEnable = this.QA_EqualRightsEnable;
        return improveInformationConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImproveInformationConfig)) {
            return false;
        }
        ImproveInformationConfig improveInformationConfig = (ImproveInformationConfig) obj;
        return this.cardGuidanceEnable == improveInformationConfig.cardGuidanceEnable && this.showIntervalCardSwipe == improveInformationConfig.showIntervalCardSwipe && this.sameInforCanBeDisplayedAtMost == improveInformationConfig.sameInforCanBeDisplayedAtMost && this.maximumDisplayPerDay == improveInformationConfig.maximumDisplayPerDay && this.QA_EqualRightsEnable == improveInformationConfig.QA_EqualRightsEnable;
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
        int i2 = (((((((((i * 41) + (this.cardGuidanceEnable ? 1231 : 1237)) * 41) + this.showIntervalCardSwipe) * 41) + this.sameInforCanBeDisplayedAtMost) * 41) + this.maximumDisplayPerDay) * 41) + (this.QA_EqualRightsEnable ? 1231 : 1237);
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
