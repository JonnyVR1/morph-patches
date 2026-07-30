package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.immomo.momomediaext.sei.BaseSei;
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
public class AdSplash extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "adsplash";

    @NonNull
    @ProtobufIndex(index = 2)
    public AdScenes coldStart;

    @NonNull
    @ProtobufIndex(index = 1)
    public AdSplashExt ext;

    @NonNull
    @ProtobufIndex(index = 3)
    public AdScenes hotStart;
    public static ProtobufAdapter<AdSplash> PROTOBUF_ADAPTER = new MessageNanoAdapter<AdSplash>() { // from class: com.p1.mobile.putong.data.AdSplash.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(AdSplash adSplash) {
            AdSplashExt adSplashExt = adSplash.ext;
            int iM17285l = adSplashExt != null ? CodedOutputByteBufferNano.m17285l(1, adSplashExt, AdSplashExt.PROTOBUF_ADAPTER) : 0;
            AdScenes adScenes = adSplash.coldStart;
            if (adScenes != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, adScenes, AdScenes.PROTOBUF_ADAPTER);
            }
            AdScenes adScenes2 = adSplash.hotStart;
            if (adScenes2 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(3, adScenes2, AdScenes.PROTOBUF_ADAPTER);
            }
            adSplash.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AdSplash parse(nc5 nc5Var) throws IOException {
            AdSplash adSplash = new AdSplash();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (adSplash.ext == null) {
                        adSplash.ext = AdSplashExt.new_();
                    }
                    if (adSplash.coldStart == null) {
                        adSplash.coldStart = AdScenes.new_();
                    }
                    if (adSplash.hotStart != null) {
                        break;
                    }
                    adSplash.hotStart = AdScenes.new_();
                    break;
                }
                if (iM162497u == 10) {
                    adSplash.ext = (AdSplashExt) nc5Var.m162488l(AdSplashExt.PROTOBUF_ADAPTER);
                } else if (iM162497u == 18) {
                    adSplash.coldStart = (AdScenes) nc5Var.m162488l(AdScenes.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 26) {
                        if (adSplash.ext == null) {
                            adSplash.ext = AdSplashExt.new_();
                        }
                        if (adSplash.coldStart == null) {
                            adSplash.coldStart = AdScenes.new_();
                        }
                        if (adSplash.hotStart != null) {
                            break;
                        }
                        adSplash.hotStart = AdScenes.new_();
                        return adSplash;
                    }
                    adSplash.hotStart = (AdScenes) nc5Var.m162488l(AdScenes.PROTOBUF_ADAPTER);
                }
            }
            return adSplash;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AdSplash adSplash, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            AdSplashExt adSplashExt = adSplash.ext;
            if (adSplashExt != null) {
                codedOutputByteBufferNano.m17309K(1, adSplashExt, AdSplashExt.PROTOBUF_ADAPTER);
            }
            AdScenes adScenes = adSplash.coldStart;
            if (adScenes != null) {
                codedOutputByteBufferNano.m17309K(2, adScenes, AdScenes.PROTOBUF_ADAPTER);
            }
            AdScenes adScenes2 = adSplash.hotStart;
            if (adScenes2 != null) {
                codedOutputByteBufferNano.m17309K(3, adScenes2, AdScenes.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<AdSplash> JSON_ADAPTER = new ObjectJsonAdapter<AdSplash>() { // from class: com.p1.mobile.putong.data.AdSplash.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AdSplash.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public AdSplash newInstance() {
            return new AdSplash();
        }

        public boolean parseField(AdSplash adSplash, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "hotStart":
                    adSplash.hotStart = AdScenes.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "ext":
                    adSplash.ext = AdSplashExt.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "coldStart":
                    adSplash.coldStart = AdScenes.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(AdSplash adSplash, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "hotStart":
                case "ext":
                case "coldStart":
                    return true;
                default:
                    return super.parseFieldCheck(adSplash, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AdSplash adSplash, JsonGenerator jsonGenerator) throws IOException {
            if (adSplash.ext != null) {
                jsonGenerator.writeFieldName(BaseSei.EXT);
                AdSplashExt.JSON_ADAPTER.serialize(adSplash.ext, jsonGenerator, true);
            }
            if (adSplash.coldStart != null) {
                jsonGenerator.writeFieldName("coldStart");
                AdScenes.JSON_ADAPTER.serialize(adSplash.coldStart, jsonGenerator, true);
            }
            if (adSplash.hotStart != null) {
                jsonGenerator.writeFieldName("hotStart");
                AdScenes.JSON_ADAPTER.serialize(adSplash.hotStart, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AdSplash) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AdSplash) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AdSplash new_() {
        AdSplash adSplash = new AdSplash();
        adSplash.nullCheck();
        return adSplash;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public AdSplash mo225055clone() {
        AdSplash adSplash = new AdSplash();
        AdSplashExt adSplashExt = this.ext;
        if (adSplashExt != null) {
            adSplash.ext = adSplashExt.mo225055clone();
        }
        AdScenes adScenes = this.coldStart;
        if (adScenes != null) {
            adSplash.coldStart = adScenes.mo225055clone();
        }
        AdScenes adScenes2 = this.hotStart;
        if (adScenes2 != null) {
            adSplash.hotStart = adScenes2.mo225055clone();
        }
        return adSplash;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdSplash)) {
            return false;
        }
        AdSplash adSplash = (AdSplash) obj;
        return ValueObject.util_equals(this.ext, adSplash.ext) && ValueObject.util_equals(this.coldStart, adSplash.coldStart) && ValueObject.util_equals(this.hotStart, adSplash.hotStart);
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
        AdSplashExt adSplashExt = this.ext;
        int iHashCode = (i2 + (adSplashExt != null ? adSplashExt.hashCode() : 0)) * 41;
        AdScenes adScenes = this.coldStart;
        int iHashCode2 = (iHashCode + (adScenes != null ? adScenes.hashCode() : 0)) * 41;
        AdScenes adScenes2 = this.hotStart;
        int iHashCode3 = iHashCode2 + (adScenes2 != null ? adScenes2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.ext == null) {
            this.ext = AdSplashExt.new_();
        }
        if (this.coldStart == null) {
            this.coldStart = AdScenes.new_();
        }
        if (this.hotStart == null) {
            this.hotStart = AdScenes.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
