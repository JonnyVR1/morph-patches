package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.sina.weibo.sdk.constant.WBConstants;
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
public class LiveRightCDN extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "liverightcdn";

    @NonNull
    @ProtobufIndex(index = 1)
    public String cdnUrl;

    @NonNull
    @ProtobufIndex(index = 2)
    public String version;
    public static ProtobufAdapter<LiveRightCDN> PROTOBUF_ADAPTER = new MessageNanoAdapter<LiveRightCDN>() { // from class: com.p1.mobile.putong.data.LiveRightCDN.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LiveRightCDN liveRightCDN) {
            String str = liveRightCDN.cdnUrl;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = liveRightCDN.version;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            liveRightCDN.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LiveRightCDN parse(nb5 nb5Var) throws IOException {
            LiveRightCDN liveRightCDN = new LiveRightCDN();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (liveRightCDN.cdnUrl == null) {
                        liveRightCDN.cdnUrl = "";
                    }
                    if (liveRightCDN.version != null) {
                        break;
                    }
                    liveRightCDN.version = "";
                    break;
                }
                if (iM158752u == 10) {
                    liveRightCDN.cdnUrl = nb5Var.m158750s();
                } else {
                    if (iM158752u != 18) {
                        if (liveRightCDN.cdnUrl == null) {
                            liveRightCDN.cdnUrl = "";
                        }
                        if (liveRightCDN.version != null) {
                            break;
                        }
                        liveRightCDN.version = "";
                        return liveRightCDN;
                    }
                    liveRightCDN.version = nb5Var.m158750s();
                }
            }
            return liveRightCDN;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LiveRightCDN liveRightCDN, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = liveRightCDN.cdnUrl;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = liveRightCDN.version;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
        }
    };
    public static JsonAdapter<LiveRightCDN> JSON_ADAPTER = new ObjectJsonAdapter<LiveRightCDN>() { // from class: com.p1.mobile.putong.data.LiveRightCDN.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LiveRightCDN.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LiveRightCDN newInstance() {
            return new LiveRightCDN();
        }

        public boolean parseField(LiveRightCDN liveRightCDN, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("cdnUrl")) {
                liveRightCDN.cdnUrl = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals(WBConstants.AUTH_PARAMS_VERSION)) {
                return false;
            }
            liveRightCDN.version = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(LiveRightCDN liveRightCDN, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("cdnUrl") || str.equals(WBConstants.AUTH_PARAMS_VERSION)) {
                return true;
            }
            return super.parseFieldCheck(liveRightCDN, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LiveRightCDN liveRightCDN, JsonGenerator jsonGenerator) throws IOException {
            String str = liveRightCDN.cdnUrl;
            if (str != null) {
                jsonGenerator.writeStringField("cdnUrl", str);
            }
            String str2 = liveRightCDN.version;
            if (str2 != null) {
                jsonGenerator.writeStringField(WBConstants.AUTH_PARAMS_VERSION, str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LiveRightCDN) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LiveRightCDN) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LiveRightCDN new_() {
        LiveRightCDN liveRightCDN = new LiveRightCDN();
        liveRightCDN.nullCheck();
        return liveRightCDN;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LiveRightCDN mo223809clone() {
        LiveRightCDN liveRightCDN = new LiveRightCDN();
        liveRightCDN.cdnUrl = this.cdnUrl;
        liveRightCDN.version = this.version;
        return liveRightCDN;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LiveRightCDN)) {
            return false;
        }
        LiveRightCDN liveRightCDN = (LiveRightCDN) obj;
        return ValueObject.util_equals(this.cdnUrl, liveRightCDN.cdnUrl) && ValueObject.util_equals(this.version, liveRightCDN.version);
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
        String str = this.cdnUrl;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.version;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.cdnUrl == null) {
            this.cdnUrl = "";
        }
        if (this.version == null) {
            this.version = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
