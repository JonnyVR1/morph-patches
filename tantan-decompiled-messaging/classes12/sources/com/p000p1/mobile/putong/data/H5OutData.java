package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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
public class H5OutData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "h5outdata";

    @Nullable
    @ProtobufIndex(index = 4)
    public String browserVersion;

    @NonNull
    @ProtobufIndex(index = 2)
    public String deviceId;

    @NonNull
    @ProtobufIndex(index = 7)
    public String language;

    @NonNull
    @ProtobufIndex(index = 9)
    public String oneId;

    @NonNull
    @ProtobufIndex(index = 6)
    public String platform;

    @NonNull
    @ProtobufIndex(index = 1)
    public String schemeVersion;

    @NonNull
    @ProtobufIndex(index = 3)
    public String token;

    @NonNull
    @ProtobufIndex(index = 8)
    public String userId;

    @NonNull
    @ProtobufIndex(index = 5)
    public String versionCode;
    public static ProtobufAdapter<H5OutData> PROTOBUF_ADAPTER = new MessageNanoAdapter<H5OutData>() { // from class: com.p1.mobile.putong.data.H5OutData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(H5OutData h5OutData) {
            String str = h5OutData.schemeVersion;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = h5OutData.deviceId;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = h5OutData.token;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = h5OutData.browserVersion;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            String str5 = h5OutData.versionCode;
            if (str5 != null) {
                iO += CodedOutputByteBufferNano.o(5, str5);
            }
            String str6 = h5OutData.platform;
            if (str6 != null) {
                iO += CodedOutputByteBufferNano.o(6, str6);
            }
            String str7 = h5OutData.language;
            if (str7 != null) {
                iO += CodedOutputByteBufferNano.o(7, str7);
            }
            String str8 = h5OutData.userId;
            if (str8 != null) {
                iO += CodedOutputByteBufferNano.o(8, str8);
            }
            String str9 = h5OutData.oneId;
            if (str9 != null) {
                iO += CodedOutputByteBufferNano.o(9, str9);
            }
            ((MessageNano) h5OutData).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public H5OutData m18196parse(nb5 nb5Var) throws IOException {
            H5OutData h5OutData = new H5OutData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (h5OutData.schemeVersion == null) {
                        h5OutData.schemeVersion = "";
                    }
                    if (h5OutData.deviceId == null) {
                        h5OutData.deviceId = "";
                    }
                    if (h5OutData.token == null) {
                        h5OutData.token = "";
                    }
                    if (h5OutData.versionCode == null) {
                        h5OutData.versionCode = "";
                    }
                    if (h5OutData.platform == null) {
                        h5OutData.platform = "";
                    }
                    if (h5OutData.language == null) {
                        h5OutData.language = "";
                    }
                    if (h5OutData.userId == null) {
                        h5OutData.userId = "";
                    }
                    if (h5OutData.oneId != null) {
                        break;
                    }
                    h5OutData.oneId = "";
                    break;
                }
                if (iU == 10) {
                    h5OutData.schemeVersion = nb5Var.s();
                } else if (iU == 18) {
                    h5OutData.deviceId = nb5Var.s();
                } else if (iU == 26) {
                    h5OutData.token = nb5Var.s();
                } else if (iU == 34) {
                    h5OutData.browserVersion = nb5Var.s();
                } else if (iU == 42) {
                    h5OutData.versionCode = nb5Var.s();
                } else if (iU == 50) {
                    h5OutData.platform = nb5Var.s();
                } else if (iU == 58) {
                    h5OutData.language = nb5Var.s();
                } else if (iU == 66) {
                    h5OutData.userId = nb5Var.s();
                } else {
                    if (iU != 74) {
                        if (h5OutData.schemeVersion == null) {
                            h5OutData.schemeVersion = "";
                        }
                        if (h5OutData.deviceId == null) {
                            h5OutData.deviceId = "";
                        }
                        if (h5OutData.token == null) {
                            h5OutData.token = "";
                        }
                        if (h5OutData.versionCode == null) {
                            h5OutData.versionCode = "";
                        }
                        if (h5OutData.platform == null) {
                            h5OutData.platform = "";
                        }
                        if (h5OutData.language == null) {
                            h5OutData.language = "";
                        }
                        if (h5OutData.userId == null) {
                            h5OutData.userId = "";
                        }
                        if (h5OutData.oneId != null) {
                            break;
                        }
                        h5OutData.oneId = "";
                        return h5OutData;
                    }
                    h5OutData.oneId = nb5Var.s();
                }
            }
            return h5OutData;
        }

        public void serialize(H5OutData h5OutData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = h5OutData.schemeVersion;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = h5OutData.deviceId;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = h5OutData.token;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = h5OutData.browserVersion;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
            String str5 = h5OutData.versionCode;
            if (str5 != null) {
                codedOutputByteBufferNano.R(5, str5);
            }
            String str6 = h5OutData.platform;
            if (str6 != null) {
                codedOutputByteBufferNano.R(6, str6);
            }
            String str7 = h5OutData.language;
            if (str7 != null) {
                codedOutputByteBufferNano.R(7, str7);
            }
            String str8 = h5OutData.userId;
            if (str8 != null) {
                codedOutputByteBufferNano.R(8, str8);
            }
            String str9 = h5OutData.oneId;
            if (str9 != null) {
                codedOutputByteBufferNano.R(9, str9);
            }
        }
    };
    public static JsonAdapter<H5OutData> JSON_ADAPTER = new ObjectJsonAdapter<H5OutData>() { // from class: com.p1.mobile.putong.data.H5OutData.2
        public Class getDataClass() {
            return H5OutData.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public H5OutData mo17830newInstance() {
            return new H5OutData();
        }

        public boolean parseField(H5OutData h5OutData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "schemeVersion":
                    h5OutData.schemeVersion = jsonParser.getValueAsString();
                    return true;
                case "language":
                    h5OutData.language = jsonParser.getValueAsString();
                    return true;
                case "userId":
                    h5OutData.userId = jsonParser.getValueAsString();
                    return true;
                case "oneId":
                    h5OutData.oneId = jsonParser.getValueAsString();
                    return true;
                case "token":
                    h5OutData.token = jsonParser.getValueAsString();
                    return true;
                case "versionCode":
                    h5OutData.versionCode = jsonParser.getValueAsString();
                    return true;
                case "browserVersion":
                    h5OutData.browserVersion = jsonParser.getValueAsString();
                    return true;
                case "deviceId":
                    h5OutData.deviceId = jsonParser.getValueAsString();
                    return true;
                case "platform":
                    h5OutData.platform = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(H5OutData h5OutData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "schemeVersion":
                case "language":
                case "userId":
                case "oneId":
                case "token":
                case "versionCode":
                case "browserVersion":
                case "deviceId":
                case "platform":
                    return true;
                default:
                    return super.parseFieldCheck(h5OutData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(H5OutData h5OutData, JsonGenerator jsonGenerator) throws IOException {
            String str = h5OutData.schemeVersion;
            if (str != null) {
                jsonGenerator.writeStringField("schemeVersion", str);
            }
            String str2 = h5OutData.deviceId;
            if (str2 != null) {
                jsonGenerator.writeStringField("deviceId", str2);
            }
            String str3 = h5OutData.token;
            if (str3 != null) {
                jsonGenerator.writeStringField(Token.TYPE, str3);
            }
            String str4 = h5OutData.browserVersion;
            if (str4 != null) {
                jsonGenerator.writeStringField("browserVersion", str4);
            }
            String str5 = h5OutData.versionCode;
            if (str5 != null) {
                jsonGenerator.writeStringField("versionCode", str5);
            }
            String str6 = h5OutData.platform;
            if (str6 != null) {
                jsonGenerator.writeStringField("platform", str6);
            }
            String str7 = h5OutData.language;
            if (str7 != null) {
                jsonGenerator.writeStringField("language", str7);
            }
            String str8 = h5OutData.userId;
            if (str8 != null) {
                jsonGenerator.writeStringField("userId", str8);
            }
            String str9 = h5OutData.oneId;
            if (str9 != null) {
                jsonGenerator.writeStringField("oneId", str9);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((H5OutData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((H5OutData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static H5OutData new_() {
        H5OutData h5OutData = new H5OutData();
        h5OutData.nullCheck();
        return h5OutData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public H5OutData m18195clone() {
        H5OutData h5OutData = new H5OutData();
        h5OutData.schemeVersion = this.schemeVersion;
        h5OutData.deviceId = this.deviceId;
        h5OutData.token = this.token;
        h5OutData.browserVersion = this.browserVersion;
        h5OutData.versionCode = this.versionCode;
        h5OutData.platform = this.platform;
        h5OutData.language = this.language;
        h5OutData.userId = this.userId;
        h5OutData.oneId = this.oneId;
        return h5OutData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof H5OutData)) {
            return false;
        }
        H5OutData h5OutData = (H5OutData) obj;
        return ValueObject.util_equals(this.schemeVersion, h5OutData.schemeVersion) && ValueObject.util_equals(this.deviceId, h5OutData.deviceId) && ValueObject.util_equals(this.token, h5OutData.token) && ValueObject.util_equals(this.browserVersion, h5OutData.browserVersion) && ValueObject.util_equals(this.versionCode, h5OutData.versionCode) && ValueObject.util_equals(this.platform, h5OutData.platform) && ValueObject.util_equals(this.language, h5OutData.language) && ValueObject.util_equals(this.userId, h5OutData.userId) && ValueObject.util_equals(this.oneId, h5OutData.oneId);
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
        String str = this.schemeVersion;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.deviceId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.token;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.browserVersion;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.versionCode;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.platform;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.language;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.userId;
        int iHashCode8 = (iHashCode7 + (str8 != null ? str8.hashCode() : 0)) * 41;
        String str9 = this.oneId;
        int iHashCode9 = iHashCode8 + (str9 != null ? str9.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode9;
        return iHashCode9;
    }

    public void nullCheck() {
        if (this.schemeVersion == null) {
            this.schemeVersion = "";
        }
        if (this.deviceId == null) {
            this.deviceId = "";
        }
        if (this.token == null) {
            this.token = "";
        }
        if (this.versionCode == null) {
            this.versionCode = "";
        }
        if (this.platform == null) {
            this.platform = "";
        }
        if (this.language == null) {
            this.language = "";
        }
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.oneId == null) {
            this.oneId = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
