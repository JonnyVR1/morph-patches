package com.p051p1.mobile.putong.feed.data;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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

/* JADX INFO: loaded from: classes13.dex */
public class MomentShareInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "momentshareinfo";

    @NonNull
    @ProtobufIndex(index = 2)
    public String description;

    @NonNull
    @ProtobufIndex(index = 4)
    public String landingPage;

    @NonNull
    @ProtobufIndex(index = 5)
    public String name;

    @NonNull
    @ProtobufIndex(index = 6)
    public String shareFrom;

    @NonNull
    @ProtobufIndex(index = 7)
    public String testId;

    @NonNull
    @ProtobufIndex(index = 1)
    public String title;

    @NonNull
    @ProtobufIndex(index = 3)
    public String url;
    public static ProtobufAdapter<MomentShareInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<MomentShareInfo>() { // from class: com.p1.mobile.putong.feed.data.MomentShareInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MomentShareInfo momentShareInfo) {
            String str = momentShareInfo.title;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = momentShareInfo.description;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = momentShareInfo.url;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            String str4 = momentShareInfo.landingPage;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str4);
            }
            String str5 = momentShareInfo.name;
            if (str5 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(5, str5);
            }
            String str6 = momentShareInfo.shareFrom;
            if (str6 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(6, str6);
            }
            String str7 = momentShareInfo.testId;
            if (str7 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(7, str7);
            }
            momentShareInfo.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MomentShareInfo parse(nc5 nc5Var) throws IOException {
            MomentShareInfo momentShareInfo = new MomentShareInfo();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (momentShareInfo.title == null) {
                        momentShareInfo.title = "";
                    }
                    if (momentShareInfo.description == null) {
                        momentShareInfo.description = "";
                    }
                    if (momentShareInfo.url == null) {
                        momentShareInfo.url = "";
                    }
                    if (momentShareInfo.landingPage == null) {
                        momentShareInfo.landingPage = "";
                    }
                    if (momentShareInfo.name == null) {
                        momentShareInfo.name = "";
                    }
                    if (momentShareInfo.shareFrom == null) {
                        momentShareInfo.shareFrom = "";
                    }
                    if (momentShareInfo.testId != null) {
                        break;
                    }
                    momentShareInfo.testId = "";
                    break;
                }
                if (iM162497u == 10) {
                    momentShareInfo.title = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    momentShareInfo.description = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    momentShareInfo.url = nc5Var.m162495s();
                } else if (iM162497u == 34) {
                    momentShareInfo.landingPage = nc5Var.m162495s();
                } else if (iM162497u == 42) {
                    momentShareInfo.name = nc5Var.m162495s();
                } else if (iM162497u == 50) {
                    momentShareInfo.shareFrom = nc5Var.m162495s();
                } else {
                    if (iM162497u != 58) {
                        if (momentShareInfo.title == null) {
                            momentShareInfo.title = "";
                        }
                        if (momentShareInfo.description == null) {
                            momentShareInfo.description = "";
                        }
                        if (momentShareInfo.url == null) {
                            momentShareInfo.url = "";
                        }
                        if (momentShareInfo.landingPage == null) {
                            momentShareInfo.landingPage = "";
                        }
                        if (momentShareInfo.name == null) {
                            momentShareInfo.name = "";
                        }
                        if (momentShareInfo.shareFrom == null) {
                            momentShareInfo.shareFrom = "";
                        }
                        if (momentShareInfo.testId != null) {
                            break;
                        }
                        momentShareInfo.testId = "";
                        return momentShareInfo;
                    }
                    momentShareInfo.testId = nc5Var.m162495s();
                }
            }
            return momentShareInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MomentShareInfo momentShareInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = momentShareInfo.title;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = momentShareInfo.description;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = momentShareInfo.url;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            String str4 = momentShareInfo.landingPage;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(4, str4);
            }
            String str5 = momentShareInfo.name;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(5, str5);
            }
            String str6 = momentShareInfo.shareFrom;
            if (str6 != null) {
                codedOutputByteBufferNano.m17316R(6, str6);
            }
            String str7 = momentShareInfo.testId;
            if (str7 != null) {
                codedOutputByteBufferNano.m17316R(7, str7);
            }
        }
    };
    public static JsonAdapter<MomentShareInfo> JSON_ADAPTER = new ObjectJsonAdapter<MomentShareInfo>() { // from class: com.p1.mobile.putong.feed.data.MomentShareInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MomentShareInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MomentShareInfo newInstance() {
            return new MomentShareInfo();
        }

        public boolean parseField(MomentShareInfo momentShareInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "description":
                    momentShareInfo.description = jsonParser.getValueAsString();
                    return true;
                case "shareFrom":
                    momentShareInfo.shareFrom = jsonParser.getValueAsString();
                    return true;
                case "testId":
                    momentShareInfo.testId = jsonParser.getValueAsString();
                    return true;
                case "url":
                    momentShareInfo.url = jsonParser.getValueAsString();
                    return true;
                case "name":
                    momentShareInfo.name = jsonParser.getValueAsString();
                    return true;
                case "title":
                    momentShareInfo.title = jsonParser.getValueAsString();
                    return true;
                case "landingPage":
                    momentShareInfo.landingPage = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MomentShareInfo momentShareInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "description":
                case "shareFrom":
                case "testId":
                case "url":
                case "name":
                case "title":
                case "landingPage":
                    return true;
                default:
                    return super.parseFieldCheck(momentShareInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MomentShareInfo momentShareInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = momentShareInfo.title;
            if (str != null) {
                jsonGenerator.writeStringField("title", str);
            }
            String str2 = momentShareInfo.description;
            if (str2 != null) {
                jsonGenerator.writeStringField("description", str2);
            }
            String str3 = momentShareInfo.url;
            if (str3 != null) {
                jsonGenerator.writeStringField("url", str3);
            }
            String str4 = momentShareInfo.landingPage;
            if (str4 != null) {
                jsonGenerator.writeStringField("landingPage", str4);
            }
            String str5 = momentShareInfo.name;
            if (str5 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str5);
            }
            String str6 = momentShareInfo.shareFrom;
            if (str6 != null) {
                jsonGenerator.writeStringField("shareFrom", str6);
            }
            String str7 = momentShareInfo.testId;
            if (str7 != null) {
                jsonGenerator.writeStringField("testId", str7);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MomentShareInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MomentShareInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MomentShareInfo new_() {
        MomentShareInfo momentShareInfo = new MomentShareInfo();
        momentShareInfo.nullCheck();
        return momentShareInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MomentShareInfo mo225055clone() {
        MomentShareInfo momentShareInfo = new MomentShareInfo();
        momentShareInfo.title = this.title;
        momentShareInfo.description = this.description;
        momentShareInfo.url = this.url;
        momentShareInfo.landingPage = this.landingPage;
        momentShareInfo.name = this.name;
        momentShareInfo.shareFrom = this.shareFrom;
        momentShareInfo.testId = this.testId;
        return momentShareInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MomentShareInfo)) {
            return false;
        }
        MomentShareInfo momentShareInfo = (MomentShareInfo) obj;
        return ValueObject.util_equals(this.title, momentShareInfo.title) && ValueObject.util_equals(this.description, momentShareInfo.description) && ValueObject.util_equals(this.url, momentShareInfo.url) && ValueObject.util_equals(this.landingPage, momentShareInfo.landingPage) && ValueObject.util_equals(this.name, momentShareInfo.name) && ValueObject.util_equals(this.shareFrom, momentShareInfo.shareFrom) && ValueObject.util_equals(this.testId, momentShareInfo.testId);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public String getTrackInfomation() {
        StringBuilder sb = new StringBuilder();
        sb.append(TextUtils.isEmpty(this.testId) ? "0" : this.testId);
        sb.append(Constants.SEPARATOR_COMMA);
        sb.append(this.shareFrom);
        return sb.toString();
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.title;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.description;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.url;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.landingPage;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.name;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.shareFrom;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.testId;
        int iHashCode7 = iHashCode6 + (str7 != null ? str7.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    public boolean isMomentShareEmpty() {
        return TextUtils.isEmpty(this.landingPage) || TextUtils.isEmpty(this.name);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
        if (this.description == null) {
            this.description = "";
        }
        if (this.url == null) {
            this.url = "";
        }
        if (this.landingPage == null) {
            this.landingPage = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.shareFrom == null) {
            this.shareFrom = "";
        }
        if (this.testId == null) {
            this.testId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
