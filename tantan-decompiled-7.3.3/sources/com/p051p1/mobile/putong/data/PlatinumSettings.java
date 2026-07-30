package com.p051p1.mobile.putong.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: classes12.dex */
public class PlatinumSettings extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "platinumsettings";

    @ProtobufIndex(index = 1)
    public boolean isPvip;
    public static ProtobufAdapter<PlatinumSettings> PROTOBUF_ADAPTER = new MessageNanoAdapter<PlatinumSettings>() { // from class: com.p1.mobile.putong.data.PlatinumSettings.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(PlatinumSettings platinumSettings) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, platinumSettings.isPvip);
            platinumSettings.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public PlatinumSettings parse(nc5 nc5Var) throws IOException {
            PlatinumSettings platinumSettings = new PlatinumSettings();
            while (nc5Var.m162497u() == 8) {
                platinumSettings.isPvip = nc5Var.m162483g();
            }
            return platinumSettings;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(PlatinumSettings platinumSettings, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, platinumSettings.isPvip);
        }
    };
    public static JsonAdapter<PlatinumSettings> JSON_ADAPTER = new ObjectJsonAdapter<PlatinumSettings>() { // from class: com.p1.mobile.putong.data.PlatinumSettings.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return PlatinumSettings.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public PlatinumSettings newInstance() {
            return new PlatinumSettings();
        }

        public boolean parseField(PlatinumSettings platinumSettings, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("isPvip")) {
                return false;
            }
            platinumSettings.isPvip = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(PlatinumSettings platinumSettings, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("isPvip")) {
                return true;
            }
            return super.parseFieldCheck(platinumSettings, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PlatinumSettings platinumSettings, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("isPvip", platinumSettings.isPvip);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PlatinumSettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PlatinumSettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PlatinumSettings new_() {
        PlatinumSettings platinumSettings = new PlatinumSettings();
        platinumSettings.nullCheck();
        return platinumSettings;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public PlatinumSettings mo225055clone() {
        PlatinumSettings platinumSettings = new PlatinumSettings();
        platinumSettings.isPvip = this.isPvip;
        return platinumSettings;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof PlatinumSettings) && this.isPvip == ((PlatinumSettings) obj).isPvip;
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
        int i2 = (i * 41) + (this.isPvip ? 1231 : 1237);
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
