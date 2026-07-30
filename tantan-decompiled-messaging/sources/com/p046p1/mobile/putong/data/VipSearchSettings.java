package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
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
import java.util.HashSet;
import p149l.nb5;

/* JADX INFO: loaded from: classes12.dex */
public class VipSearchSettings extends ValueObject<VipSearchSettings> implements Cloneable, Serializable {
    public static final String TYPE = "vipsearchsettings";

    @NonNull
    @ProtobufIndex(index = 2)
    public Double momentRoamingLatitude;

    @NonNull
    @ProtobufIndex(index = 1)
    public Double momentRoamingLongitude;
    private HashSet<String> parseFieldSet = new HashSet<>();
    private String requestUrl;
    public static ProtobufAdapter<VipSearchSettings> PROTOBUF_ADAPTER = new MessageNanoAdapter<VipSearchSettings>() { // from class: com.p1.mobile.putong.data.VipSearchSettings.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(VipSearchSettings vipSearchSettings) {
            Double d = vipSearchSettings.momentRoamingLongitude;
            int iM17222d = d != null ? CodedOutputByteBufferNano.m17222d(1, d.doubleValue()) : 0;
            Double d2 = vipSearchSettings.momentRoamingLatitude;
            if (d2 != null) {
                iM17222d += CodedOutputByteBufferNano.m17222d(2, d2.doubleValue());
            }
            vipSearchSettings.cachedSize = iM17222d;
            return iM17222d;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public VipSearchSettings parse(nb5 nb5Var) throws IOException {
            Double dValueOf = Double.valueOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
            VipSearchSettings vipSearchSettings = new VipSearchSettings();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (vipSearchSettings.momentRoamingLongitude == null) {
                        vipSearchSettings.momentRoamingLongitude = dValueOf;
                    }
                    if (vipSearchSettings.momentRoamingLatitude != null) {
                        break;
                    }
                    vipSearchSettings.momentRoamingLatitude = dValueOf;
                    break;
                }
                if (iM158752u == 9) {
                    vipSearchSettings.momentRoamingLongitude = Double.valueOf(nb5Var.m158739h());
                } else {
                    if (iM158752u != 17) {
                        if (vipSearchSettings.momentRoamingLongitude == null) {
                            vipSearchSettings.momentRoamingLongitude = dValueOf;
                        }
                        if (vipSearchSettings.momentRoamingLatitude != null) {
                            break;
                        }
                        vipSearchSettings.momentRoamingLatitude = dValueOf;
                        return vipSearchSettings;
                    }
                    vipSearchSettings.momentRoamingLatitude = Double.valueOf(nb5Var.m158739h());
                }
            }
            return vipSearchSettings;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(VipSearchSettings vipSearchSettings, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Double d = vipSearchSettings.momentRoamingLongitude;
            if (d != null) {
                codedOutputByteBufferNano.m17246C(1, d.doubleValue());
            }
            Double d2 = vipSearchSettings.momentRoamingLatitude;
            if (d2 != null) {
                codedOutputByteBufferNano.m17246C(2, d2.doubleValue());
            }
        }
    };
    public static JsonAdapter<VipSearchSettings> JSON_ADAPTER = new ObjectJsonAdapter<VipSearchSettings>() { // from class: com.p1.mobile.putong.data.VipSearchSettings.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return VipSearchSettings.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public VipSearchSettings newInstance() {
            return new VipSearchSettings();
        }

        public boolean parseField(VipSearchSettings vipSearchSettings, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("momentRoamingLatitude")) {
                vipSearchSettings.momentRoamingLatitude = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Double.valueOf(jsonParser.getValueAsDouble()) : null;
                return true;
            }
            if (!str.equals("momentRoamingLongitude")) {
                return false;
            }
            vipSearchSettings.momentRoamingLongitude = jsonParser.getCurrentToken() != JsonToken.VALUE_NULL ? Double.valueOf(jsonParser.getValueAsDouble()) : null;
            return true;
        }

        public boolean parseFieldCheck(VipSearchSettings vipSearchSettings, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("momentRoamingLatitude") || str.equals("momentRoamingLongitude")) {
                return true;
            }
            return super.parseFieldCheck(vipSearchSettings, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(VipSearchSettings vipSearchSettings, JsonGenerator jsonGenerator) throws IOException {
            Double d = vipSearchSettings.momentRoamingLongitude;
            if (d != null) {
                jsonGenerator.writeNumberField("momentRoamingLongitude", d.doubleValue());
            }
            Double d2 = vipSearchSettings.momentRoamingLatitude;
            if (d2 != null) {
                jsonGenerator.writeNumberField("momentRoamingLatitude", d2.doubleValue());
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VipSearchSettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VipSearchSettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static VipSearchSettings new_() {
        VipSearchSettings vipSearchSettings = new VipSearchSettings();
        vipSearchSettings.nullCheck();
        return vipSearchSettings;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public VipSearchSettings mo223809clone() {
        VipSearchSettings vipSearchSettings = new VipSearchSettings();
        vipSearchSettings.momentRoamingLongitude = this.momentRoamingLongitude;
        vipSearchSettings.momentRoamingLatitude = this.momentRoamingLatitude;
        return vipSearchSettings;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VipSearchSettings)) {
            return false;
        }
        VipSearchSettings vipSearchSettings = (VipSearchSettings) obj;
        return ValueObject.util_equals(this.momentRoamingLongitude, vipSearchSettings.momentRoamingLongitude) && ValueObject.util_equals(this.momentRoamingLatitude, vipSearchSettings.momentRoamingLatitude);
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
        Double d = this.momentRoamingLongitude;
        int iHashCode = (i2 + (d != null ? d.hashCode() : 0)) * 41;
        Double d2 = this.momentRoamingLatitude;
        int iHashCode2 = iHashCode + (d2 != null ? d2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public boolean isFieldParsed(String str) {
        return this.parseFieldSet.contains(str);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void mergeData(VipSearchSettings vipSearchSettings) {
        if (!shouldMergeData() || equals(vipSearchSettings)) {
            return;
        }
        if (!isFieldParsed("momentRoamingLongitude")) {
            this.momentRoamingLongitude = vipSearchSettings.momentRoamingLongitude;
        }
        if (!isFieldParsed("momentRoamingLatitude")) {
            this.momentRoamingLatitude = vipSearchSettings.momentRoamingLatitude;
        }
        this.parseFieldSet.clear();
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        Double dValueOf = Double.valueOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        if (this.momentRoamingLongitude == null) {
            this.momentRoamingLongitude = dValueOf;
        }
        if (this.momentRoamingLatitude == null) {
            this.momentRoamingLatitude = dValueOf;
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void setParsedApiRequest(String str) {
        this.requestUrl = str;
    }

    public VipSearchSettings subtract(VipSearchSettings vipSearchSettings) {
        VipSearchSettings vipSearchSettings2 = new VipSearchSettings();
        if (!ValueObject.util_equals(this.momentRoamingLongitude, vipSearchSettings.momentRoamingLongitude)) {
            vipSearchSettings2.momentRoamingLongitude = this.momentRoamingLongitude;
        }
        if (!ValueObject.util_equals(this.momentRoamingLatitude, vipSearchSettings.momentRoamingLatitude)) {
            vipSearchSettings2.momentRoamingLatitude = this.momentRoamingLatitude;
        }
        if (vipSearchSettings2.equals(new VipSearchSettings())) {
            return null;
        }
        return vipSearchSettings2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
