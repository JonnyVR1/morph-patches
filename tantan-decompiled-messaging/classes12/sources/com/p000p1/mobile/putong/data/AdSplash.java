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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(AdSplash adSplash) {
            AdSplashExt adSplashExt = adSplash.ext;
            int iL = adSplashExt != null ? CodedOutputByteBufferNano.l(1, adSplashExt, AdSplashExt.PROTOBUF_ADAPTER) : 0;
            AdScenes adScenes = adSplash.coldStart;
            if (adScenes != null) {
                iL += CodedOutputByteBufferNano.l(2, adScenes, AdScenes.PROTOBUF_ADAPTER);
            }
            AdScenes adScenes2 = adSplash.hotStart;
            if (adScenes2 != null) {
                iL += CodedOutputByteBufferNano.l(3, adScenes2, AdScenes.PROTOBUF_ADAPTER);
            }
            ((MessageNano) adSplash).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public AdSplash m17653parse(nb5 nb5Var) throws IOException {
            AdSplash adSplash = new AdSplash();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 10) {
                    adSplash.ext = (AdSplashExt) nb5Var.l(AdSplashExt.PROTOBUF_ADAPTER);
                } else if (iU == 18) {
                    adSplash.coldStart = (AdScenes) nb5Var.l(AdScenes.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 26) {
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
                    adSplash.hotStart = (AdScenes) nb5Var.l(AdScenes.PROTOBUF_ADAPTER);
                }
            }
            return adSplash;
        }

        public void serialize(AdSplash adSplash, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            AdSplashExt adSplashExt = adSplash.ext;
            if (adSplashExt != null) {
                codedOutputByteBufferNano.K(1, adSplashExt, AdSplashExt.PROTOBUF_ADAPTER);
            }
            AdScenes adScenes = adSplash.coldStart;
            if (adScenes != null) {
                codedOutputByteBufferNano.K(2, adScenes, AdScenes.PROTOBUF_ADAPTER);
            }
            AdScenes adScenes2 = adSplash.hotStart;
            if (adScenes2 != null) {
                codedOutputByteBufferNano.K(3, adScenes2, AdScenes.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<AdSplash> JSON_ADAPTER = new ObjectJsonAdapter<AdSplash>() { // from class: com.p1.mobile.putong.data.AdSplash.2
        public Class getDataClass() {
            return AdSplash.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public AdSplash mo17830newInstance() {
            return new AdSplash();
        }

        public boolean parseField(AdSplash adSplash, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "hotStart":
                    adSplash.hotStart = (AdScenes) AdScenes.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "ext":
                    adSplash.ext = (AdSplashExt) AdSplashExt.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "coldStart":
                    adSplash.coldStart = (AdScenes) AdScenes.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AdSplash adSplash, JsonGenerator jsonGenerator) throws IOException {
            if (adSplash.ext != null) {
                jsonGenerator.writeFieldName("ext");
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AdSplash) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AdSplash) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AdSplash new_() {
        AdSplash adSplash = new AdSplash();
        adSplash.nullCheck();
        return adSplash;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AdSplash m17652clone() {
        AdSplash adSplash = new AdSplash();
        AdSplashExt adSplashExt = this.ext;
        if (adSplashExt != null) {
            adSplash.ext = adSplashExt.m17655clone();
        }
        AdScenes adScenes = this.coldStart;
        if (adScenes != null) {
            adSplash.coldStart = adScenes.m17643clone();
        }
        AdScenes adScenes2 = this.hotStart;
        if (adScenes2 != null) {
            adSplash.hotStart = adScenes2.m17643clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
