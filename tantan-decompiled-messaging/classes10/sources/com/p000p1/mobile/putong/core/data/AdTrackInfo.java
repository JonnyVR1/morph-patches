package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class AdTrackInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "adtrackinfo";

    @NonNull
    @ProtobufIndex(index = 1)
    public String firebaseId;
    public static ProtobufAdapter<AdTrackInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<AdTrackInfo>() { // from class: com.p1.mobile.putong.core.data.AdTrackInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(AdTrackInfo adTrackInfo) {
            String str = adTrackInfo.firebaseId;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            ((MessageNano) adTrackInfo).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public AdTrackInfo m11533parse(nb5 nb5Var) throws IOException {
            AdTrackInfo adTrackInfo = new AdTrackInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (adTrackInfo.firebaseId != null) {
                        break;
                    }
                    adTrackInfo.firebaseId = "";
                    break;
                }
                if (iU != 10) {
                    if (adTrackInfo.firebaseId != null) {
                        break;
                    }
                    adTrackInfo.firebaseId = "";
                    return adTrackInfo;
                }
                adTrackInfo.firebaseId = nb5Var.s();
            }
            return adTrackInfo;
        }

        public void serialize(AdTrackInfo adTrackInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = adTrackInfo.firebaseId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
        }
    };
    public static JsonAdapter<AdTrackInfo> JSON_ADAPTER = new ObjectJsonAdapter<AdTrackInfo>() { // from class: com.p1.mobile.putong.core.data.AdTrackInfo.2
        public Class getDataClass() {
            return AdTrackInfo.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public AdTrackInfo m11534newInstance() {
            return new AdTrackInfo();
        }

        public boolean parseField(AdTrackInfo adTrackInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("firebaseId")) {
                return false;
            }
            adTrackInfo.firebaseId = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(AdTrackInfo adTrackInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("firebaseId")) {
                return true;
            }
            return super.parseFieldCheck(adTrackInfo, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(AdTrackInfo adTrackInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = adTrackInfo.firebaseId;
            if (str != null) {
                jsonGenerator.writeStringField("firebaseId", str);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AdTrackInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AdTrackInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AdTrackInfo new_() {
        AdTrackInfo adTrackInfo = new AdTrackInfo();
        adTrackInfo.nullCheck();
        return adTrackInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AdTrackInfo m11532clone() {
        AdTrackInfo adTrackInfo = new AdTrackInfo();
        adTrackInfo.firebaseId = this.firebaseId;
        return adTrackInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AdTrackInfo) {
            return ValueObject.util_equals(this.firebaseId, ((AdTrackInfo) obj).firebaseId);
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
        String str = this.firebaseId;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.firebaseId == null) {
            this.firebaseId = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
