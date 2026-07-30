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
public class AdConfiguration extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "adconfiguration";

    @NonNull
    @ProtobufIndex(index = 1)
    public AdReward adReward;

    @NonNull
    @ProtobufIndex(index = 2)
    public AdSplash adSplash;
    public static ProtobufAdapter<AdConfiguration> PROTOBUF_ADAPTER = new MessageNanoAdapter<AdConfiguration>() { // from class: com.p1.mobile.putong.data.AdConfiguration.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(AdConfiguration adConfiguration) {
            AdReward adReward = adConfiguration.adReward;
            int iL = adReward != null ? CodedOutputByteBufferNano.l(1, adReward, AdReward.PROTOBUF_ADAPTER) : 0;
            AdSplash adSplash = adConfiguration.adSplash;
            if (adSplash != null) {
                iL += CodedOutputByteBufferNano.l(2, adSplash, AdSplash.PROTOBUF_ADAPTER);
            }
            ((MessageNano) adConfiguration).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public AdConfiguration m17629parse(nb5 nb5Var) throws IOException {
            AdConfiguration adConfiguration = new AdConfiguration();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (adConfiguration.adReward == null) {
                        adConfiguration.adReward = AdReward.new_();
                    }
                    if (adConfiguration.adSplash != null) {
                        break;
                    }
                    adConfiguration.adSplash = AdSplash.new_();
                    break;
                }
                if (iU == 10) {
                    adConfiguration.adReward = (AdReward) nb5Var.l(AdReward.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 18) {
                        if (adConfiguration.adReward == null) {
                            adConfiguration.adReward = AdReward.new_();
                        }
                        if (adConfiguration.adSplash != null) {
                            break;
                        }
                        adConfiguration.adSplash = AdSplash.new_();
                        return adConfiguration;
                    }
                    adConfiguration.adSplash = (AdSplash) nb5Var.l(AdSplash.PROTOBUF_ADAPTER);
                }
            }
            return adConfiguration;
        }

        public void serialize(AdConfiguration adConfiguration, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            AdReward adReward = adConfiguration.adReward;
            if (adReward != null) {
                codedOutputByteBufferNano.K(1, adReward, AdReward.PROTOBUF_ADAPTER);
            }
            AdSplash adSplash = adConfiguration.adSplash;
            if (adSplash != null) {
                codedOutputByteBufferNano.K(2, adSplash, AdSplash.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<AdConfiguration> JSON_ADAPTER = new ObjectJsonAdapter<AdConfiguration>() { // from class: com.p1.mobile.putong.data.AdConfiguration.2
        public Class getDataClass() {
            return AdConfiguration.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public AdConfiguration mo17830newInstance() {
            return new AdConfiguration();
        }

        public boolean parseField(AdConfiguration adConfiguration, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("adReward")) {
                adConfiguration.adReward = (AdReward) AdReward.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("adSplash")) {
                return false;
            }
            adConfiguration.adSplash = (AdSplash) AdSplash.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(AdConfiguration adConfiguration, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("adReward") || str.equals("adSplash")) {
                return true;
            }
            return super.parseFieldCheck(adConfiguration, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AdConfiguration adConfiguration, JsonGenerator jsonGenerator) throws IOException {
            if (adConfiguration.adReward != null) {
                jsonGenerator.writeFieldName("adReward");
                AdReward.JSON_ADAPTER.serialize(adConfiguration.adReward, jsonGenerator, true);
            }
            if (adConfiguration.adSplash != null) {
                jsonGenerator.writeFieldName("adSplash");
                AdSplash.JSON_ADAPTER.serialize(adConfiguration.adSplash, jsonGenerator, true);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AdConfiguration) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AdConfiguration) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AdConfiguration new_() {
        AdConfiguration adConfiguration = new AdConfiguration();
        adConfiguration.nullCheck();
        return adConfiguration;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AdConfiguration m17628clone() {
        AdConfiguration adConfiguration = new AdConfiguration();
        AdReward adReward = this.adReward;
        if (adReward != null) {
            adConfiguration.adReward = adReward.m17634clone();
        }
        AdSplash adSplash = this.adSplash;
        if (adSplash != null) {
            adConfiguration.adSplash = adSplash.m17652clone();
        }
        return adConfiguration;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdConfiguration)) {
            return false;
        }
        AdConfiguration adConfiguration = (AdConfiguration) obj;
        return ValueObject.util_equals(this.adReward, adConfiguration.adReward) && ValueObject.util_equals(this.adSplash, adConfiguration.adSplash);
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
        AdReward adReward = this.adReward;
        int iHashCode = (i2 + (adReward != null ? adReward.hashCode() : 0)) * 41;
        AdSplash adSplash = this.adSplash;
        int iHashCode2 = iHashCode + (adSplash != null ? adSplash.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.adReward == null) {
            this.adReward = AdReward.new_();
        }
        if (this.adSplash == null) {
            this.adSplash = AdSplash.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
