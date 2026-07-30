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
public class GrowthSettings extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "growthsettings";

    @ProtobufIndex(index = 1)
    public boolean fakeTag;
    public static ProtobufAdapter<GrowthSettings> PROTOBUF_ADAPTER = new MessageNanoAdapter<GrowthSettings>() { // from class: com.p1.mobile.putong.data.GrowthSettings.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(GrowthSettings growthSettings) {
            int iM17220b = CodedOutputByteBufferNano.m17220b(1, growthSettings.fakeTag);
            growthSettings.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GrowthSettings parse(nb5 nb5Var) throws IOException {
            GrowthSettings growthSettings = new GrowthSettings();
            while (nb5Var.m158752u() == 8) {
                growthSettings.fakeTag = nb5Var.m158738g();
            }
            return growthSettings;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GrowthSettings growthSettings, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17244A(1, growthSettings.fakeTag);
        }
    };
    public static JsonAdapter<GrowthSettings> JSON_ADAPTER = new ObjectJsonAdapter<GrowthSettings>() { // from class: com.p1.mobile.putong.data.GrowthSettings.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GrowthSettings.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public GrowthSettings newInstance() {
            return new GrowthSettings();
        }

        public boolean parseField(GrowthSettings growthSettings, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("fakeTag")) {
                return false;
            }
            growthSettings.fakeTag = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(GrowthSettings growthSettings, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("fakeTag")) {
                return true;
            }
            return super.parseFieldCheck(growthSettings, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GrowthSettings growthSettings, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("fakeTag", growthSettings.fakeTag);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GrowthSettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GrowthSettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GrowthSettings new_() {
        GrowthSettings growthSettings = new GrowthSettings();
        growthSettings.nullCheck();
        return growthSettings;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public GrowthSettings mo223809clone() {
        GrowthSettings growthSettings = new GrowthSettings();
        growthSettings.fakeTag = this.fakeTag;
        return growthSettings;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof GrowthSettings) && this.fakeTag == ((GrowthSettings) obj).fakeTag;
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
        int i2 = (i * 41) + (this.fakeTag ? 1231 : 1237);
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
