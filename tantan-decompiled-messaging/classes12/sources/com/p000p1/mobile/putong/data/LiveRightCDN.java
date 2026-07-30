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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(LiveRightCDN liveRightCDN) {
            String str = liveRightCDN.cdnUrl;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = liveRightCDN.version;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) liveRightCDN).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public LiveRightCDN m18373parse(nb5 nb5Var) throws IOException {
            LiveRightCDN liveRightCDN = new LiveRightCDN();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (liveRightCDN.cdnUrl == null) {
                        liveRightCDN.cdnUrl = "";
                    }
                    if (liveRightCDN.version != null) {
                        break;
                    }
                    liveRightCDN.version = "";
                    break;
                }
                if (iU == 10) {
                    liveRightCDN.cdnUrl = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (liveRightCDN.cdnUrl == null) {
                            liveRightCDN.cdnUrl = "";
                        }
                        if (liveRightCDN.version != null) {
                            break;
                        }
                        liveRightCDN.version = "";
                        return liveRightCDN;
                    }
                    liveRightCDN.version = nb5Var.s();
                }
            }
            return liveRightCDN;
        }

        public void serialize(LiveRightCDN liveRightCDN, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = liveRightCDN.cdnUrl;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = liveRightCDN.version;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<LiveRightCDN> JSON_ADAPTER = new ObjectJsonAdapter<LiveRightCDN>() { // from class: com.p1.mobile.putong.data.LiveRightCDN.2
        public Class getDataClass() {
            return LiveRightCDN.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public LiveRightCDN mo17830newInstance() {
            return new LiveRightCDN();
        }

        public boolean parseField(LiveRightCDN liveRightCDN, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("cdnUrl")) {
                liveRightCDN.cdnUrl = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("version")) {
                return false;
            }
            liveRightCDN.version = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(LiveRightCDN liveRightCDN, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("cdnUrl") || str.equals("version")) {
                return true;
            }
            return super.parseFieldCheck(liveRightCDN, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LiveRightCDN liveRightCDN, JsonGenerator jsonGenerator) throws IOException {
            String str = liveRightCDN.cdnUrl;
            if (str != null) {
                jsonGenerator.writeStringField("cdnUrl", str);
            }
            String str2 = liveRightCDN.version;
            if (str2 != null) {
                jsonGenerator.writeStringField("version", str2);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LiveRightCDN) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LiveRightCDN) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LiveRightCDN new_() {
        LiveRightCDN liveRightCDN = new LiveRightCDN();
        liveRightCDN.nullCheck();
        return liveRightCDN;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public LiveRightCDN m18372clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.cdnUrl;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.version;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.cdnUrl == null) {
            this.cdnUrl = "";
        }
        if (this.version == null) {
            this.version = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
