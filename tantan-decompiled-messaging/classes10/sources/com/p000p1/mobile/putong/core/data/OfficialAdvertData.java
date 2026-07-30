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
public class OfficialAdvertData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "officialadvertdata";

    @NonNull
    @ProtobufIndex(index = 1)
    public String advertId;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String advertLogo;

    @NonNull
    @ProtobufIndex(index = 6)
    public String advertPic;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int advertType;

    @NonNull
    @ProtobufIndex(index = 7)
    public String buttonText;

    @NonNull
    @ProtobufIndex(index = 8)
    public String buttonUrl;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String desc;

    @NonNull
    @ProtobufIndex(index = 4)
    public String titleText;
    public static ProtobufAdapter<OfficialAdvertData> PROTOBUF_ADAPTER = new MessageNanoAdapter<OfficialAdvertData>() { // from class: com.p1.mobile.putong.core.data.OfficialAdvertData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(OfficialAdvertData officialAdvertData) {
            String str = officialAdvertData.advertId;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.h(2, officialAdvertData.advertType);
            String str2 = officialAdvertData.advertLogo;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(3, str2);
            }
            String str3 = officialAdvertData.titleText;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(4, str3);
            }
            String str4 = officialAdvertData.desc;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(5, str4);
            }
            String str5 = officialAdvertData.advertPic;
            if (str5 != null) {
                iO += CodedOutputByteBufferNano.o(6, str5);
            }
            String str6 = officialAdvertData.buttonText;
            if (str6 != null) {
                iO += CodedOutputByteBufferNano.o(7, str6);
            }
            String str7 = officialAdvertData.buttonUrl;
            if (str7 != null) {
                iO += CodedOutputByteBufferNano.o(8, str7);
            }
            ((MessageNano) officialAdvertData).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public OfficialAdvertData m14645parse(nb5 nb5Var) throws IOException {
            OfficialAdvertData officialAdvertData = new OfficialAdvertData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 10) {
                    officialAdvertData.advertId = nb5Var.s();
                } else if (iU == 16) {
                    officialAdvertData.advertType = nb5Var.j();
                } else if (iU == 26) {
                    officialAdvertData.advertLogo = nb5Var.s();
                } else if (iU == 34) {
                    officialAdvertData.titleText = nb5Var.s();
                } else if (iU == 42) {
                    officialAdvertData.desc = nb5Var.s();
                } else if (iU == 50) {
                    officialAdvertData.advertPic = nb5Var.s();
                } else if (iU == 58) {
                    officialAdvertData.buttonText = nb5Var.s();
                } else {
                    if (iU != 66) {
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
                    officialAdvertData.buttonUrl = nb5Var.s();
                }
            }
            return officialAdvertData;
        }

        public void serialize(OfficialAdvertData officialAdvertData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = officialAdvertData.advertId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.G(2, officialAdvertData.advertType);
            String str2 = officialAdvertData.advertLogo;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
            String str3 = officialAdvertData.titleText;
            if (str3 != null) {
                codedOutputByteBufferNano.R(4, str3);
            }
            String str4 = officialAdvertData.desc;
            if (str4 != null) {
                codedOutputByteBufferNano.R(5, str4);
            }
            String str5 = officialAdvertData.advertPic;
            if (str5 != null) {
                codedOutputByteBufferNano.R(6, str5);
            }
            String str6 = officialAdvertData.buttonText;
            if (str6 != null) {
                codedOutputByteBufferNano.R(7, str6);
            }
            String str7 = officialAdvertData.buttonUrl;
            if (str7 != null) {
                codedOutputByteBufferNano.R(8, str7);
            }
        }
    };
    public static JsonAdapter<OfficialAdvertData> JSON_ADAPTER = new ObjectJsonAdapter<OfficialAdvertData>() { // from class: com.p1.mobile.putong.core.data.OfficialAdvertData.2
        public Class getDataClass() {
            return OfficialAdvertData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public OfficialAdvertData m14646newInstance() {
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
                jsonGenerator.writeStringField("desc", str4);
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OfficialAdvertData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OfficialAdvertData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OfficialAdvertData new_() {
        OfficialAdvertData officialAdvertData = new OfficialAdvertData();
        officialAdvertData.nullCheck();
        return officialAdvertData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public OfficialAdvertData m14644clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode7;
        return iHashCode7;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
