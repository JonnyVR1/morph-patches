package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
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
import com.tencent.open.SocialConstants;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import p153l.nc5;

/* JADX INFO: loaded from: classes10.dex */
public class OfficialAdvertData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "officialadvertdata";

    @NonNull
    @ProtobufIndex(index = 1)
    public String advertId;

    @NonNull
    @ProtobufIndex(index = 3)
    public String advertLogo;

    @NonNull
    @ProtobufIndex(index = 6)
    public String advertPic;

    @ProtobufIndex(index = 2)
    public int advertType;

    @NonNull
    @ProtobufIndex(index = 7)
    public String buttonText;

    @NonNull
    @ProtobufIndex(index = 8)
    public String buttonUrl;

    @NonNull
    @ProtobufIndex(index = 5)
    public String desc;

    @NonNull
    @ProtobufIndex(index = 4)
    public String titleText;
    public static ProtobufAdapter<OfficialAdvertData> PROTOBUF_ADAPTER = new MessageNanoAdapter<OfficialAdvertData>() { // from class: com.p1.mobile.putong.core.data.OfficialAdvertData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(OfficialAdvertData officialAdvertData) {
            String str = officialAdvertData.advertId;
            int iM17288o = (str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0) + CodedOutputByteBufferNano.m17281h(2, officialAdvertData.advertType);
            String str2 = officialAdvertData.advertLogo;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str2);
            }
            String str3 = officialAdvertData.titleText;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str3);
            }
            String str4 = officialAdvertData.desc;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(5, str4);
            }
            String str5 = officialAdvertData.advertPic;
            if (str5 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(6, str5);
            }
            String str6 = officialAdvertData.buttonText;
            if (str6 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(7, str6);
            }
            String str7 = officialAdvertData.buttonUrl;
            if (str7 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(8, str7);
            }
            officialAdvertData.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public OfficialAdvertData parse(nc5 nc5Var) throws IOException {
            OfficialAdvertData officialAdvertData = new OfficialAdvertData();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (officialAdvertData.advertId == null) {
                        officialAdvertData.advertId = "";
                    }
                    if (officialAdvertData.advertLogo == null) {
                        officialAdvertData.advertLogo = "";
                    }
                    if (officialAdvertData.titleText == null) {
                        officialAdvertData.titleText = "";
                    }
                    if (officialAdvertData.desc == null) {
                        officialAdvertData.desc = "";
                    }
                    if (officialAdvertData.advertPic == null) {
                        officialAdvertData.advertPic = "";
                    }
                    if (officialAdvertData.buttonText == null) {
                        officialAdvertData.buttonText = "";
                    }
                    if (officialAdvertData.buttonUrl != null) {
                        break;
                    }
                    officialAdvertData.buttonUrl = "";
                    break;
                }
                if (iM162497u == 10) {
                    officialAdvertData.advertId = nc5Var.m162495s();
                } else if (iM162497u == 16) {
                    officialAdvertData.advertType = nc5Var.m162486j();
                } else if (iM162497u == 26) {
                    officialAdvertData.advertLogo = nc5Var.m162495s();
                } else if (iM162497u == 34) {
                    officialAdvertData.titleText = nc5Var.m162495s();
                } else if (iM162497u == 42) {
                    officialAdvertData.desc = nc5Var.m162495s();
                } else if (iM162497u == 50) {
                    officialAdvertData.advertPic = nc5Var.m162495s();
                } else if (iM162497u == 58) {
                    officialAdvertData.buttonText = nc5Var.m162495s();
                } else {
                    if (iM162497u != 66) {
                        if (officialAdvertData.advertId == null) {
                            officialAdvertData.advertId = "";
                        }
                        if (officialAdvertData.advertLogo == null) {
                            officialAdvertData.advertLogo = "";
                        }
                        if (officialAdvertData.titleText == null) {
                            officialAdvertData.titleText = "";
                        }
                        if (officialAdvertData.desc == null) {
                            officialAdvertData.desc = "";
                        }
                        if (officialAdvertData.advertPic == null) {
                            officialAdvertData.advertPic = "";
                        }
                        if (officialAdvertData.buttonText == null) {
                            officialAdvertData.buttonText = "";
                        }
                        if (officialAdvertData.buttonUrl != null) {
                            break;
                        }
                        officialAdvertData.buttonUrl = "";
                        return officialAdvertData;
                    }
                    officialAdvertData.buttonUrl = nc5Var.m162495s();
                }
            }
            return officialAdvertData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(OfficialAdvertData officialAdvertData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = officialAdvertData.advertId;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            codedOutputByteBufferNano.m17305G(2, officialAdvertData.advertType);
            String str2 = officialAdvertData.advertLogo;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(3, str2);
            }
            String str3 = officialAdvertData.titleText;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(4, str3);
            }
            String str4 = officialAdvertData.desc;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(5, str4);
            }
            String str5 = officialAdvertData.advertPic;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(6, str5);
            }
            String str6 = officialAdvertData.buttonText;
            if (str6 != null) {
                codedOutputByteBufferNano.m17316R(7, str6);
            }
            String str7 = officialAdvertData.buttonUrl;
            if (str7 != null) {
                codedOutputByteBufferNano.m17316R(8, str7);
            }
        }
    };
    public static JsonAdapter<OfficialAdvertData> JSON_ADAPTER = new ObjectJsonAdapter<OfficialAdvertData>() { // from class: com.p1.mobile.putong.core.data.OfficialAdvertData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return OfficialAdvertData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public OfficialAdvertData newInstance() {
            return new OfficialAdvertData();
        }

        public boolean parseField(OfficialAdvertData officialAdvertData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "titleText":
                    officialAdvertData.titleText = jsonParser.getValueAsString();
                    return true;
                case "advertId":
                    officialAdvertData.advertId = jsonParser.getValueAsString();
                    return true;
                case "advertPic":
                    officialAdvertData.advertPic = jsonParser.getValueAsString();
                    return true;
                case "desc":
                    officialAdvertData.desc = jsonParser.getValueAsString();
                    return true;
                case "buttonUrl":
                    officialAdvertData.buttonUrl = jsonParser.getValueAsString();
                    return true;
                case "advertLogo":
                    officialAdvertData.advertLogo = jsonParser.getValueAsString();
                    return true;
                case "advertType":
                    officialAdvertData.advertType = jsonParser.getValueAsInt();
                    return true;
                case "buttonText":
                    officialAdvertData.buttonText = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(OfficialAdvertData officialAdvertData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "titleText":
                case "advertId":
                case "advertPic":
                case "desc":
                case "buttonUrl":
                case "advertLogo":
                case "advertType":
                case "buttonText":
                    return true;
                default:
                    return super.parseFieldCheck(officialAdvertData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OfficialAdvertData officialAdvertData, JsonGenerator jsonGenerator) throws IOException {
            String str = officialAdvertData.advertId;
            if (str != null) {
                jsonGenerator.writeStringField("advertId", str);
            }
            jsonGenerator.writeNumberField("advertType", officialAdvertData.advertType);
            String str2 = officialAdvertData.advertLogo;
            if (str2 != null) {
                jsonGenerator.writeStringField("advertLogo", str2);
            }
            String str3 = officialAdvertData.titleText;
            if (str3 != null) {
                jsonGenerator.writeStringField("titleText", str3);
            }
            String str4 = officialAdvertData.desc;
            if (str4 != null) {
                jsonGenerator.writeStringField(SocialConstants.PARAM_APP_DESC, str4);
            }
            String str5 = officialAdvertData.advertPic;
            if (str5 != null) {
                jsonGenerator.writeStringField("advertPic", str5);
            }
            String str6 = officialAdvertData.buttonText;
            if (str6 != null) {
                jsonGenerator.writeStringField("buttonText", str6);
            }
            String str7 = officialAdvertData.buttonUrl;
            if (str7 != null) {
                jsonGenerator.writeStringField("buttonUrl", str7);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OfficialAdvertData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OfficialAdvertData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OfficialAdvertData new_() {
        OfficialAdvertData officialAdvertData = new OfficialAdvertData();
        officialAdvertData.nullCheck();
        return officialAdvertData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public OfficialAdvertData mo225055clone() {
        OfficialAdvertData officialAdvertData = new OfficialAdvertData();
        officialAdvertData.advertId = this.advertId;
        officialAdvertData.advertType = this.advertType;
        officialAdvertData.advertLogo = this.advertLogo;
        officialAdvertData.titleText = this.titleText;
        officialAdvertData.desc = this.desc;
        officialAdvertData.advertPic = this.advertPic;
        officialAdvertData.buttonText = this.buttonText;
        officialAdvertData.buttonUrl = this.buttonUrl;
        return officialAdvertData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OfficialAdvertData)) {
            return false;
        }
        OfficialAdvertData officialAdvertData = (OfficialAdvertData) obj;
        return ValueObject.util_equals(this.advertId, officialAdvertData.advertId) && this.advertType == officialAdvertData.advertType && ValueObject.util_equals(this.advertLogo, officialAdvertData.advertLogo) && ValueObject.util_equals(this.titleText, officialAdvertData.titleText) && ValueObject.util_equals(this.desc, officialAdvertData.desc) && ValueObject.util_equals(this.advertPic, officialAdvertData.advertPic) && ValueObject.util_equals(this.buttonText, officialAdvertData.buttonText) && ValueObject.util_equals(this.buttonUrl, officialAdvertData.buttonUrl);
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
        String str = this.advertId;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.advertType) * 41;
        String str2 = this.advertLogo;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.titleText;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.desc;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.advertPic;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.buttonText;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.buttonUrl;
        int iHashCode7 = iHashCode6 + (str7 != null ? str7.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.advertId == null) {
            this.advertId = "";
        }
        if (this.advertLogo == null) {
            this.advertLogo = "";
        }
        if (this.titleText == null) {
            this.titleText = "";
        }
        if (this.desc == null) {
            this.desc = "";
        }
        if (this.advertPic == null) {
            this.advertPic = "";
        }
        if (this.buttonText == null) {
            this.buttonText = "";
        }
        if (this.buttonUrl == null) {
            this.buttonUrl = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
