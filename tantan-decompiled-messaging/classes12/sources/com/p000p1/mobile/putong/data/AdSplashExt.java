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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(AdSplashExt adSplashExt) {
            int iB = CodedOutputByteBufferNano.b(1, adSplashExt.shakeWeakenSwitch) + CodedOutputByteBufferNano.h(2, adSplashExt.degree) + CodedOutputByteBufferNano.h(3, adSplashExt.interval);
            ((MessageNano) adSplashExt).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public AdSplashExt m17656parse(nb5 nb5Var) throws IOException {
            AdSplashExt adSplashExt = new AdSplashExt();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    adSplashExt.shakeWeakenSwitch = nb5Var.g();
                } else if (iU == 16) {
                    adSplashExt.degree = nb5Var.j();
                } else {
                    if (iU != 24) {
                        return adSplashExt;
                    }
                    adSplashExt.interval = nb5Var.j();
                }
            }
        }

        public void serialize(AdSplashExt adSplashExt, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, adSplashExt.shakeWeakenSwitch);
            codedOutputByteBufferNano.G(2, adSplashExt.degree);
            codedOutputByteBufferNano.G(3, adSplashExt.interval);
        }
    };
    public static JsonAdapter<AdSplashExt> JSON_ADAPTER = new ObjectJsonAdapter<AdSplashExt>() { // from class: com.p1.mobile.putong.data.AdSplashExt.2
        public Class getDataClass() {
            return AdSplashExt.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public AdSplashExt mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AdSplashExt adSplashExt, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("shakeWeakenSwitch", adSplashExt.shakeWeakenSwitch);
            jsonGenerator.writeNumberField("degree", adSplashExt.degree);
            jsonGenerator.writeNumberField(BannerFrequencyType.interval, adSplashExt.interval);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AdSplashExt) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AdSplashExt) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AdSplashExt new_() {
        AdSplashExt adSplashExt = new AdSplashExt();
        adSplashExt.nullCheck();
        return adSplashExt;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AdSplashExt m17655clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((i * 41) + (this.shakeWeakenSwitch ? 1231 : 1237)) * 41) + this.degree) * 41) + this.interval;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
