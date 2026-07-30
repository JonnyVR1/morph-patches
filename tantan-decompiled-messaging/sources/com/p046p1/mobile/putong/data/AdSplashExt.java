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
public class AdSplashExt extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "adsplashext";

    @ProtobufIndex(index = 2)
    public int degree;

    @ProtobufIndex(index = 3)
    public int interval;

    @ProtobufIndex(index = 1)
    public boolean shakeWeakenSwitch;
    public static ProtobufAdapter<AdSplashExt> PROTOBUF_ADAPTER = new MessageNanoAdapter<AdSplashExt>() { // from class: com.p1.mobile.putong.data.AdSplashExt.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(AdSplashExt adSplashExt) {
            int iM17220b = CodedOutputByteBufferNano.m17220b(1, adSplashExt.shakeWeakenSwitch) + CodedOutputByteBufferNano.m17226h(2, adSplashExt.degree) + CodedOutputByteBufferNano.m17226h(3, adSplashExt.interval);
            adSplashExt.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AdSplashExt parse(nb5 nb5Var) throws IOException {
            AdSplashExt adSplashExt = new AdSplashExt();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    adSplashExt.shakeWeakenSwitch = nb5Var.m158738g();
                } else if (iM158752u == 16) {
                    adSplashExt.degree = nb5Var.m158741j();
                } else {
                    if (iM158752u != 24) {
                        return adSplashExt;
                    }
                    adSplashExt.interval = nb5Var.m158741j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AdSplashExt adSplashExt, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17244A(1, adSplashExt.shakeWeakenSwitch);
            codedOutputByteBufferNano.m17250G(2, adSplashExt.degree);
            codedOutputByteBufferNano.m17250G(3, adSplashExt.interval);
        }
    };
    public static JsonAdapter<AdSplashExt> JSON_ADAPTER = new ObjectJsonAdapter<AdSplashExt>() { // from class: com.p1.mobile.putong.data.AdSplashExt.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AdSplashExt.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public AdSplashExt newInstance() {
            return new AdSplashExt();
        }

        public boolean parseField(AdSplashExt adSplashExt, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "shakeWeakenSwitch":
                    adSplashExt.shakeWeakenSwitch = jsonParser.getValueAsBoolean();
                    return true;
                case "degree":
                    adSplashExt.degree = jsonParser.getValueAsInt();
                    return true;
                case "interval":
                    adSplashExt.interval = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(AdSplashExt adSplashExt, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "shakeWeakenSwitch":
                case "degree":
                case "interval":
                    return true;
                default:
                    return super.parseFieldCheck(adSplashExt, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AdSplashExt adSplashExt, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("shakeWeakenSwitch", adSplashExt.shakeWeakenSwitch);
            jsonGenerator.writeNumberField("degree", adSplashExt.degree);
            jsonGenerator.writeNumberField(BannerFrequencyType.interval, adSplashExt.interval);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AdSplashExt) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AdSplashExt) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AdSplashExt new_() {
        AdSplashExt adSplashExt = new AdSplashExt();
        adSplashExt.nullCheck();
        return adSplashExt;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public AdSplashExt mo223809clone() {
        AdSplashExt adSplashExt = new AdSplashExt();
        adSplashExt.shakeWeakenSwitch = this.shakeWeakenSwitch;
        adSplashExt.degree = this.degree;
        adSplashExt.interval = this.interval;
        return adSplashExt;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdSplashExt)) {
            return false;
        }
        AdSplashExt adSplashExt = (AdSplashExt) obj;
        return this.shakeWeakenSwitch == adSplashExt.shakeWeakenSwitch && this.degree == adSplashExt.degree && this.interval == adSplashExt.interval;
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
        int i2 = (((((i * 41) + (this.shakeWeakenSwitch ? 1231 : 1237)) * 41) + this.degree) * 41) + this.interval;
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
