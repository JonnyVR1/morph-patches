package com.p000p1.mobile.putong.data;

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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SvipPrivacySettings svipPrivacySettings) {
            int iJ = CodedOutputByteBufferNano.j(1, svipPrivacySettings.frozenTime) + CodedOutputByteBufferNano.b(2, svipPrivacySettings.hideAge) + CodedOutputByteBufferNano.b(3, svipPrivacySettings.hideLocation) + CodedOutputByteBufferNano.b(4, svipPrivacySettings.hideIcon);
            ((MessageNano) svipPrivacySettings).cachedSize = iJ;
            return iJ;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SvipPrivacySettings m19055parse(nb5 nb5Var) throws IOException {
            SvipPrivacySettings svipPrivacySettings = new SvipPrivacySettings();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    svipPrivacySettings.frozenTime = nb5Var.k();
                } else if (iU == 16) {
                    svipPrivacySettings.hideAge = nb5Var.g();
                } else if (iU == 24) {
                    svipPrivacySettings.hideLocation = nb5Var.g();
                } else {
                    if (iU != 32) {
                        return svipPrivacySettings;
                    }
                    svipPrivacySettings.hideIcon = nb5Var.g();
                }
            }
        }

        public void serialize(SvipPrivacySettings svipPrivacySettings, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.I(1, svipPrivacySettings.frozenTime);
            codedOutputByteBufferNano.A(2, svipPrivacySettings.hideAge);
            codedOutputByteBufferNano.A(3, svipPrivacySettings.hideLocation);
            codedOutputByteBufferNano.A(4, svipPrivacySettings.hideIcon);
        }
    };
    public static JsonAdapter<SvipPrivacySettings> JSON_ADAPTER = new ObjectJsonAdapter<SvipPrivacySettings>() { // from class: com.p1.mobile.putong.data.SvipPrivacySettings.2
        public Class getDataClass() {
            return SvipPrivacySettings.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public SvipPrivacySettings mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SvipPrivacySettings svipPrivacySettings, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("frozenTime", svipPrivacySettings.frozenTime);
            jsonGenerator.writeBooleanField("hideAge", svipPrivacySettings.hideAge);
            jsonGenerator.writeBooleanField("hideLocation", svipPrivacySettings.hideLocation);
            jsonGenerator.writeBooleanField("hideIcon", svipPrivacySettings.hideIcon);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SvipPrivacySettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SvipPrivacySettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SvipPrivacySettings new_() {
        SvipPrivacySettings svipPrivacySettings = new SvipPrivacySettings();
        svipPrivacySettings.nullCheck();
        return svipPrivacySettings;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SvipPrivacySettings m19054clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        long j = this.frozenTime;
        int i2 = (((((((i * 41) + ((int) (j ^ (j >>> 32)))) * 41) + (this.hideAge ? 1231 : 1237)) * 41) + (this.hideLocation ? 1231 : 1237)) * 41) + (this.hideIcon ? 1231 : 1237);
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
