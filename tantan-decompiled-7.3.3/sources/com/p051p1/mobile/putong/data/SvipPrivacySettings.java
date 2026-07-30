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
public class SvipPrivacySettings extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "svipprivacysettings";

    @ProtobufIndex(index = 1)
    public long frozenTime;

    @ProtobufIndex(index = 2)
    public boolean hideAge;

    @ProtobufIndex(index = 4)
    public boolean hideIcon;

    @ProtobufIndex(index = 3)
    public boolean hideLocation;
    public static ProtobufAdapter<SvipPrivacySettings> PROTOBUF_ADAPTER = new MessageNanoAdapter<SvipPrivacySettings>() { // from class: com.p1.mobile.putong.data.SvipPrivacySettings.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SvipPrivacySettings svipPrivacySettings) {
            int iM17283j = CodedOutputByteBufferNano.m17283j(1, svipPrivacySettings.frozenTime) + CodedOutputByteBufferNano.m17275b(2, svipPrivacySettings.hideAge) + CodedOutputByteBufferNano.m17275b(3, svipPrivacySettings.hideLocation) + CodedOutputByteBufferNano.m17275b(4, svipPrivacySettings.hideIcon);
            svipPrivacySettings.cachedSize = iM17283j;
            return iM17283j;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SvipPrivacySettings parse(nc5 nc5Var) throws IOException {
            SvipPrivacySettings svipPrivacySettings = new SvipPrivacySettings();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    svipPrivacySettings.frozenTime = nc5Var.m162487k();
                } else if (iM162497u == 16) {
                    svipPrivacySettings.hideAge = nc5Var.m162483g();
                } else if (iM162497u == 24) {
                    svipPrivacySettings.hideLocation = nc5Var.m162483g();
                } else {
                    if (iM162497u != 32) {
                        return svipPrivacySettings;
                    }
                    svipPrivacySettings.hideIcon = nc5Var.m162483g();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SvipPrivacySettings svipPrivacySettings, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17307I(1, svipPrivacySettings.frozenTime);
            codedOutputByteBufferNano.m17299A(2, svipPrivacySettings.hideAge);
            codedOutputByteBufferNano.m17299A(3, svipPrivacySettings.hideLocation);
            codedOutputByteBufferNano.m17299A(4, svipPrivacySettings.hideIcon);
        }
    };
    public static JsonAdapter<SvipPrivacySettings> JSON_ADAPTER = new ObjectJsonAdapter<SvipPrivacySettings>() { // from class: com.p1.mobile.putong.data.SvipPrivacySettings.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SvipPrivacySettings.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SvipPrivacySettings newInstance() {
            return new SvipPrivacySettings();
        }

        public boolean parseField(SvipPrivacySettings svipPrivacySettings, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "hideLocation":
                    svipPrivacySettings.hideLocation = jsonParser.getValueAsBoolean();
                    return true;
                case "hideIcon":
                    svipPrivacySettings.hideIcon = jsonParser.getValueAsBoolean();
                    return true;
                case "hideAge":
                    svipPrivacySettings.hideAge = jsonParser.getValueAsBoolean();
                    return true;
                case "frozenTime":
                    svipPrivacySettings.frozenTime = jsonParser.getValueAsLong();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(SvipPrivacySettings svipPrivacySettings, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "hideLocation":
                case "hideIcon":
                case "hideAge":
                case "frozenTime":
                    return true;
                default:
                    return super.parseFieldCheck(svipPrivacySettings, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SvipPrivacySettings svipPrivacySettings, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("frozenTime", svipPrivacySettings.frozenTime);
            jsonGenerator.writeBooleanField("hideAge", svipPrivacySettings.hideAge);
            jsonGenerator.writeBooleanField("hideLocation", svipPrivacySettings.hideLocation);
            jsonGenerator.writeBooleanField("hideIcon", svipPrivacySettings.hideIcon);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SvipPrivacySettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SvipPrivacySettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SvipPrivacySettings new_() {
        SvipPrivacySettings svipPrivacySettings = new SvipPrivacySettings();
        svipPrivacySettings.nullCheck();
        return svipPrivacySettings;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SvipPrivacySettings mo225055clone() {
        SvipPrivacySettings svipPrivacySettings = new SvipPrivacySettings();
        svipPrivacySettings.frozenTime = this.frozenTime;
        svipPrivacySettings.hideAge = this.hideAge;
        svipPrivacySettings.hideLocation = this.hideLocation;
        svipPrivacySettings.hideIcon = this.hideIcon;
        return svipPrivacySettings;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SvipPrivacySettings)) {
            return false;
        }
        SvipPrivacySettings svipPrivacySettings = (SvipPrivacySettings) obj;
        return this.frozenTime == svipPrivacySettings.frozenTime && this.hideAge == svipPrivacySettings.hideAge && this.hideLocation == svipPrivacySettings.hideLocation && this.hideIcon == svipPrivacySettings.hideIcon;
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
        long j = this.frozenTime;
        int i2 = (((((((i * 41) + ((int) (j ^ (j >>> 32)))) * 41) + (this.hideAge ? 1231 : 1237)) * 41) + (this.hideLocation ? 1231 : 1237)) * 41) + (this.hideIcon ? 1231 : 1237);
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
