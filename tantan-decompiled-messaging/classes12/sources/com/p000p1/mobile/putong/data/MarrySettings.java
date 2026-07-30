package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MarrySettings marrySettings) {
            String str = marrySettings.profileAudit;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.b(2, marrySettings.hasEntered) + CodedOutputByteBufferNano.b(3, marrySettings.closeMode);
            ((MessageNano) marrySettings).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MarrySettings m18427parse(nb5 nb5Var) throws IOException {
            MarrySettings marrySettings = new MarrySettings();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (marrySettings.profileAudit != null) {
                        break;
                    }
                    marrySettings.profileAudit = "";
                    break;
                }
                if (iU == 10) {
                    marrySettings.profileAudit = nb5Var.s();
                } else if (iU == 16) {
                    marrySettings.hasEntered = nb5Var.g();
                } else {
                    if (iU != 24) {
                        if (marrySettings.profileAudit != null) {
                            break;
                        }
                        marrySettings.profileAudit = "";
                        return marrySettings;
                    }
                    marrySettings.closeMode = nb5Var.g();
                }
            }
            return marrySettings;
        }

        public void serialize(MarrySettings marrySettings, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = marrySettings.profileAudit;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.A(2, marrySettings.hasEntered);
            codedOutputByteBufferNano.A(3, marrySettings.closeMode);
        }
    };
    public static JsonAdapter<MarrySettings> JSON_ADAPTER = new ObjectJsonAdapter<MarrySettings>() { // from class: com.p1.mobile.putong.data.MarrySettings.2
        public Class getDataClass() {
            return MarrySettings.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public MarrySettings mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MarrySettings marrySettings, JsonGenerator jsonGenerator) throws IOException {
            String str = marrySettings.profileAudit;
            if (str != null) {
                jsonGenerator.writeStringField("profileAudit", str);
            }
            jsonGenerator.writeBooleanField("hasEntered", marrySettings.hasEntered);
            jsonGenerator.writeBooleanField("closeMode", marrySettings.closeMode);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MarrySettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MarrySettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MarrySettings new_() {
        MarrySettings marrySettings = new MarrySettings();
        marrySettings.nullCheck();
        return marrySettings;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MarrySettings m18426clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.profileAudit;
        int iHashCode = ((((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.hasEntered ? 1231 : 1237)) * 41) + (this.closeMode ? 1231 : 1237);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.profileAudit == null) {
            this.profileAudit = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
