package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveStreamUrl extends ValueObject implements Cloneable, Serializable {
    public static JsonAdapter<BLiveStreamUrl> JSON_ADAPTER = new ObjectJsonAdapter<BLiveStreamUrl>() { // from class: com.p1.mobile.putong.live.base.data.BLiveStreamUrl.1
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveStreamUrl.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveStreamUrl newInstance() {
            return new BLiveStreamUrl();
        }

        public boolean parseField(BLiveStreamUrl bLiveStreamUrl, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "pullFlv":
                    bLiveStreamUrl.pullFlv = jsonParser.getValueAsString();
                    return true;
                case "pullHls":
                    bLiveStreamUrl.pullHls = jsonParser.getValueAsString();
                    return true;
                case "push":
                    bLiveStreamUrl.push = jsonParser.getValueAsString();
                    return true;
                case "useCurrentPullStream":
                    bLiveStreamUrl.useCurrentPullStream = jsonParser.getValueAsBoolean();
                    return true;
                case "pullRtmp":
                    bLiveStreamUrl.pullRtmp = jsonParser.getValueAsString();
                    return true;
                case "pullFlvIpv6":
                    bLiveStreamUrl.pullFlvIpv6 = jsonParser.getValueAsString();
                    return true;
                case "pushIpv6":
                    bLiveStreamUrl.pushIpv6 = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveStreamUrl bLiveStreamUrl, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveStreamUrl.push;
            if (str != null) {
                jsonGenerator.writeStringField("push", str);
            }
            String str2 = bLiveStreamUrl.pullRtmp;
            if (str2 != null) {
                jsonGenerator.writeStringField("pullRtmp", str2);
            }
            String str3 = bLiveStreamUrl.pullFlv;
            if (str3 != null) {
                jsonGenerator.writeStringField("pullFlv", str3);
            }
            String str4 = bLiveStreamUrl.pullHls;
            if (str4 != null) {
                jsonGenerator.writeStringField("pullHls", str4);
            }
            jsonGenerator.writeBooleanField("useCurrentPullStream", bLiveStreamUrl.useCurrentPullStream);
            String str5 = bLiveStreamUrl.pullFlvIpv6;
            if (str5 != null) {
                jsonGenerator.writeStringField("pullFlvIpv6", str5);
            }
            String str6 = bLiveStreamUrl.pushIpv6;
            if (str6 != null) {
                jsonGenerator.writeStringField("pushIpv6", str6);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveStreamUrl) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final String TYPE = "blivestreamurl";

    @NonNull
    @ProtobufIndex(index = 3)
    public String pullFlv;

    @NonNull
    @ProtobufIndex(index = 6)
    public String pullFlvIpv6;

    @NonNull
    @ProtobufIndex(index = 4)
    public String pullHls;

    @NonNull
    @ProtobufIndex(index = 2)
    public String pullRtmp;

    @NonNull
    @ProtobufIndex(index = 1)
    public String push;

    @NonNull
    @ProtobufIndex(index = 7)
    public String pushIpv6;

    @ProtobufIndex(index = 5)
    public boolean useCurrentPullStream;

    public static BLiveStreamUrl new_() {
        BLiveStreamUrl bLiveStreamUrl = new BLiveStreamUrl();
        bLiveStreamUrl.nullCheck();
        return bLiveStreamUrl;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveStreamUrl mo223809clone() {
        BLiveStreamUrl bLiveStreamUrl = new BLiveStreamUrl();
        bLiveStreamUrl.push = this.push;
        bLiveStreamUrl.pullRtmp = this.pullRtmp;
        bLiveStreamUrl.pullFlv = this.pullFlv;
        bLiveStreamUrl.pullHls = this.pullHls;
        bLiveStreamUrl.useCurrentPullStream = this.useCurrentPullStream;
        bLiveStreamUrl.pullFlvIpv6 = this.pullFlvIpv6;
        bLiveStreamUrl.pushIpv6 = this.pushIpv6;
        return bLiveStreamUrl;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveStreamUrl)) {
            return false;
        }
        BLiveStreamUrl bLiveStreamUrl = (BLiveStreamUrl) obj;
        return ValueObject.util_equals(this.push, bLiveStreamUrl.push) && ValueObject.util_equals(this.pullRtmp, bLiveStreamUrl.pullRtmp) && ValueObject.util_equals(this.pullFlv, bLiveStreamUrl.pullFlv) && ValueObject.util_equals(this.pullHls, bLiveStreamUrl.pullHls) && this.useCurrentPullStream == bLiveStreamUrl.useCurrentPullStream && ValueObject.util_equals(this.pullFlvIpv6, bLiveStreamUrl.pullFlvIpv6) && ValueObject.util_equals(this.pushIpv6, bLiveStreamUrl.pushIpv6);
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
        String str = this.push;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.pullRtmp;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.pullFlv;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.pullHls;
        int iHashCode4 = (((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41) + (this.useCurrentPullStream ? 1231 : 1237)) * 41;
        String str5 = this.pullFlvIpv6;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.pushIpv6;
        int iHashCode6 = iHashCode5 + (str6 != null ? str6.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.push == null) {
            this.push = "";
        }
        if (this.pullRtmp == null) {
            this.pullRtmp = "";
        }
        if (this.pullFlv == null) {
            this.pullFlv = "";
        }
        if (this.pullHls == null) {
            this.pullHls = "";
        }
        if (this.pullFlvIpv6 == null) {
            this.pullFlvIpv6 = "";
        }
        if (this.pushIpv6 == null) {
            this.pushIpv6 = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
