package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
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
import java.util.HashSet;
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(VipSearchSettings vipSearchSettings) {
            Double d = vipSearchSettings.momentRoamingLongitude;
            int iD = d != null ? CodedOutputByteBufferNano.d(1, d.doubleValue()) : 0;
            Double d2 = vipSearchSettings.momentRoamingLatitude;
            if (d2 != null) {
                iD += CodedOutputByteBufferNano.d(2, d2.doubleValue());
            }
            ((MessageNano) vipSearchSettings).cachedSize = iD;
            return iD;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public VipSearchSettings m19305parse(nb5 nb5Var) throws IOException {
            Double dValueOf = Double.valueOf(0.0d);
            VipSearchSettings vipSearchSettings = new VipSearchSettings();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (vipSearchSettings.momentRoamingLongitude == null) {
                        vipSearchSettings.momentRoamingLongitude = dValueOf;
                    }
                    if (vipSearchSettings.momentRoamingLatitude != null) {
                        break;
                    }
                    vipSearchSettings.momentRoamingLatitude = dValueOf;
                    break;
                }
                if (iU == 9) {
                    vipSearchSettings.momentRoamingLongitude = Double.valueOf(nb5Var.h());
                } else {
                    if (iU != 17) {
                        if (vipSearchSettings.momentRoamingLongitude == null) {
                            vipSearchSettings.momentRoamingLongitude = dValueOf;
                        }
                        if (vipSearchSettings.momentRoamingLatitude != null) {
                            break;
                        }
                        vipSearchSettings.momentRoamingLatitude = dValueOf;
                        return vipSearchSettings;
                    }
                    vipSearchSettings.momentRoamingLatitude = Double.valueOf(nb5Var.h());
                }
            }
            return vipSearchSettings;
        }

        public void serialize(VipSearchSettings vipSearchSettings, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Double d = vipSearchSettings.momentRoamingLongitude;
            if (d != null) {
                codedOutputByteBufferNano.C(1, d.doubleValue());
            }
            Double d2 = vipSearchSettings.momentRoamingLatitude;
            if (d2 != null) {
                codedOutputByteBufferNano.C(2, d2.doubleValue());
            }
        }
    };
    public static JsonAdapter<VipSearchSettings> JSON_ADAPTER = new ObjectJsonAdapter<VipSearchSettings>() { // from class: com.p1.mobile.putong.data.VipSearchSettings.2
        public Class getDataClass() {
            return VipSearchSettings.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public VipSearchSettings mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VipSearchSettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VipSearchSettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static VipSearchSettings new_() {
        VipSearchSettings vipSearchSettings = new VipSearchSettings();
        vipSearchSettings.nullCheck();
        return vipSearchSettings;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public VipSearchSettings m19304clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        Double d = this.momentRoamingLongitude;
        int iHashCode = (i2 + (d != null ? d.hashCode() : 0)) * 41;
        Double d2 = this.momentRoamingLatitude;
        int iHashCode2 = iHashCode + (d2 != null ? d2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public boolean isFieldParsed(String str) {
        return this.parseFieldSet.contains(str);
    }

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

    public void nullCheck() {
        Double dValueOf = Double.valueOf(0.0d);
        if (this.momentRoamingLongitude == null) {
            this.momentRoamingLongitude = dValueOf;
        }
        if (this.momentRoamingLatitude == null) {
            this.momentRoamingLatitude = dValueOf;
        }
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
