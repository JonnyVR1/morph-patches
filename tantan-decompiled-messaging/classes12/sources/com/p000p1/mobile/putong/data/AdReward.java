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
public class AdReward extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "adreward";

    @NonNull
    @ProtobufIndex(index = 1)
    public AdScenes swipe;
    public static ProtobufAdapter<AdReward> PROTOBUF_ADAPTER = new MessageNanoAdapter<AdReward>() { // from class: com.p1.mobile.putong.data.AdReward.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(AdReward adReward) {
            AdScenes adScenes = adReward.swipe;
            int iL = adScenes != null ? CodedOutputByteBufferNano.l(1, adScenes, AdScenes.PROTOBUF_ADAPTER) : 0;
            ((MessageNano) adReward).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public AdReward m17635parse(nb5 nb5Var) throws IOException {
            AdReward adReward = new AdReward();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (adReward.swipe != null) {
                        break;
                    }
                    adReward.swipe = AdScenes.new_();
                    break;
                }
                if (iU != 10) {
                    if (adReward.swipe != null) {
                        break;
                    }
                    adReward.swipe = AdScenes.new_();
                    return adReward;
                }
                adReward.swipe = (AdScenes) nb5Var.l(AdScenes.PROTOBUF_ADAPTER);
            }
            return adReward;
        }

        public void serialize(AdReward adReward, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            AdScenes adScenes = adReward.swipe;
            if (adScenes != null) {
                codedOutputByteBufferNano.K(1, adScenes, AdScenes.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<AdReward> JSON_ADAPTER = new ObjectJsonAdapter<AdReward>() { // from class: com.p1.mobile.putong.data.AdReward.2
        public Class getDataClass() {
            return AdReward.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public AdReward mo17830newInstance() {
            return new AdReward();
        }

        public boolean parseField(AdReward adReward, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("swipe")) {
                return false;
            }
            adReward.swipe = (AdScenes) AdScenes.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(AdReward adReward, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("swipe")) {
                return true;
            }
            return super.parseFieldCheck(adReward, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AdReward adReward, JsonGenerator jsonGenerator) throws IOException {
            if (adReward.swipe != null) {
                jsonGenerator.writeFieldName("swipe");
                AdScenes.JSON_ADAPTER.serialize(adReward.swipe, jsonGenerator, true);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AdReward) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AdReward) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AdReward new_() {
        AdReward adReward = new AdReward();
        adReward.nullCheck();
        return adReward;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AdReward m17634clone() {
        AdReward adReward = new AdReward();
        AdScenes adScenes = this.swipe;
        if (adScenes != null) {
            adReward.swipe = adScenes.m17643clone();
        }
        return adReward;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AdReward) {
            return ValueObject.util_equals(this.swipe, ((AdReward) obj).swipe);
        }
        return false;
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
        AdScenes adScenes = this.swipe;
        int iHashCode = i2 + (adScenes != null ? adScenes.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.swipe == null) {
            this.swipe = AdScenes.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
