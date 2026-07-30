package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
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
public class MarrySettings extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "marrysettings";

    @ProtobufIndex(index = 3)
    public boolean closeMode;

    @ProtobufIndex(index = 2)
    public boolean hasEntered;

    @NonNull
    @ProtobufIndex(index = 1)
    public String profileAudit;
    public static ProtobufAdapter<MarrySettings> PROTOBUF_ADAPTER = new MessageNanoAdapter<MarrySettings>() { // from class: com.p1.mobile.putong.data.MarrySettings.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MarrySettings marrySettings) {
            String str = marrySettings.profileAudit;
            int iM17288o = (str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0) + CodedOutputByteBufferNano.m17275b(2, marrySettings.hasEntered) + CodedOutputByteBufferNano.m17275b(3, marrySettings.closeMode);
            marrySettings.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MarrySettings parse(nc5 nc5Var) throws IOException {
            MarrySettings marrySettings = new MarrySettings();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (marrySettings.profileAudit != null) {
                        break;
                    }
                    marrySettings.profileAudit = "";
                    break;
                }
                if (iM162497u == 10) {
                    marrySettings.profileAudit = nc5Var.m162495s();
                } else if (iM162497u == 16) {
                    marrySettings.hasEntered = nc5Var.m162483g();
                } else {
                    if (iM162497u != 24) {
                        if (marrySettings.profileAudit != null) {
                            break;
                        }
                        marrySettings.profileAudit = "";
                        return marrySettings;
                    }
                    marrySettings.closeMode = nc5Var.m162483g();
                }
            }
            return marrySettings;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MarrySettings marrySettings, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = marrySettings.profileAudit;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            codedOutputByteBufferNano.m17299A(2, marrySettings.hasEntered);
            codedOutputByteBufferNano.m17299A(3, marrySettings.closeMode);
        }
    };
    public static JsonAdapter<MarrySettings> JSON_ADAPTER = new ObjectJsonAdapter<MarrySettings>() { // from class: com.p1.mobile.putong.data.MarrySettings.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MarrySettings.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MarrySettings newInstance() {
            return new MarrySettings();
        }

        public boolean parseField(MarrySettings marrySettings, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "closeMode":
                    marrySettings.closeMode = jsonParser.getValueAsBoolean();
                    return true;
                case "hasEntered":
                    marrySettings.hasEntered = jsonParser.getValueAsBoolean();
                    return true;
                case "profileAudit":
                    marrySettings.profileAudit = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MarrySettings marrySettings, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "closeMode":
                case "hasEntered":
                case "profileAudit":
                    return true;
                default:
                    return super.parseFieldCheck(marrySettings, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MarrySettings marrySettings, JsonGenerator jsonGenerator) throws IOException {
            String str = marrySettings.profileAudit;
            if (str != null) {
                jsonGenerator.writeStringField("profileAudit", str);
            }
            jsonGenerator.writeBooleanField("hasEntered", marrySettings.hasEntered);
            jsonGenerator.writeBooleanField("closeMode", marrySettings.closeMode);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MarrySettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MarrySettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MarrySettings new_() {
        MarrySettings marrySettings = new MarrySettings();
        marrySettings.nullCheck();
        return marrySettings;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MarrySettings mo225055clone() {
        MarrySettings marrySettings = new MarrySettings();
        marrySettings.profileAudit = this.profileAudit;
        marrySettings.hasEntered = this.hasEntered;
        marrySettings.closeMode = this.closeMode;
        return marrySettings;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MarrySettings)) {
            return false;
        }
        MarrySettings marrySettings = (MarrySettings) obj;
        return ValueObject.util_equals(this.profileAudit, marrySettings.profileAudit) && this.hasEntered == marrySettings.hasEntered && this.closeMode == marrySettings.closeMode;
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
        int i2 = i * 41;
        String str = this.profileAudit;
        int iHashCode = ((((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.hasEntered ? 1231 : 1237)) * 41) + (this.closeMode ? 1231 : 1237);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.profileAudit == null) {
            this.profileAudit = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
