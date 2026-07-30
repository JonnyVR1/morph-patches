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
public class Captcha extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "captcha";

    @NonNull
    @ProtobufIndex(index = 1)
    public String captchaID;

    @NonNull
    @ProtobufIndex(index = 2)
    public String captchaOutput;

    @NonNull
    @ProtobufIndex(index = 3)
    public String genTime;

    @ProtobufIndex(index = 6)
    public boolean localExpired;

    @NonNull
    @ProtobufIndex(index = 4)
    public String lotNumber;

    @NonNull
    @ProtobufIndex(index = 5)
    public String passToken;
    public static ProtobufAdapter<Captcha> PROTOBUF_ADAPTER = new MessageNanoAdapter<Captcha>() { // from class: com.p1.mobile.putong.data.Captcha.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Captcha captcha) {
            String str = captcha.captchaID;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = captcha.captchaOutput;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = captcha.genTime;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = captcha.lotNumber;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            String str5 = captcha.passToken;
            if (str5 != null) {
                iO += CodedOutputByteBufferNano.o(5, str5);
            }
            int iB = iO + CodedOutputByteBufferNano.b(6, captcha.localExpired);
            ((MessageNano) captcha).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Captcha m17796parse(nb5 nb5Var) throws IOException {
            Captcha captcha = new Captcha();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (captcha.captchaID == null) {
                        captcha.captchaID = "";
                    }
                    if (captcha.captchaOutput == null) {
                        captcha.captchaOutput = "";
                    }
                    if (captcha.genTime == null) {
                        captcha.genTime = "";
                    }
                    if (captcha.lotNumber == null) {
                        captcha.lotNumber = "";
                    }
                    if (captcha.passToken != null) {
                        break;
                    }
                    captcha.passToken = "";
                    break;
                }
                if (iU == 10) {
                    captcha.captchaID = nb5Var.s();
                } else if (iU == 18) {
                    captcha.captchaOutput = nb5Var.s();
                } else if (iU == 26) {
                    captcha.genTime = nb5Var.s();
                } else if (iU == 34) {
                    captcha.lotNumber = nb5Var.s();
                } else if (iU == 42) {
                    captcha.passToken = nb5Var.s();
                } else {
                    if (iU != 48) {
                        if (captcha.captchaID == null) {
                            captcha.captchaID = "";
                        }
                        if (captcha.captchaOutput == null) {
                            captcha.captchaOutput = "";
                        }
                        if (captcha.genTime == null) {
                            captcha.genTime = "";
                        }
                        if (captcha.lotNumber == null) {
                            captcha.lotNumber = "";
                        }
                        if (captcha.passToken != null) {
                            break;
                        }
                        captcha.passToken = "";
                        return captcha;
                    }
                    captcha.localExpired = nb5Var.g();
                }
            }
            return captcha;
        }

        public void serialize(Captcha captcha, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = captcha.captchaID;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = captcha.captchaOutput;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = captcha.genTime;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = captcha.lotNumber;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
            String str5 = captcha.passToken;
            if (str5 != null) {
                codedOutputByteBufferNano.R(5, str5);
            }
            codedOutputByteBufferNano.A(6, captcha.localExpired);
        }
    };
    public static JsonAdapter<Captcha> JSON_ADAPTER = new ObjectJsonAdapter<Captcha>() { // from class: com.p1.mobile.putong.data.Captcha.2
        public Class getDataClass() {
            return Captcha.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public Captcha mo17830newInstance() {
            return new Captcha();
        }

        public boolean parseField(Captcha captcha, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "captchaID":
                    captcha.captchaID = jsonParser.getValueAsString();
                    return true;
                case "passToken":
                    captcha.passToken = jsonParser.getValueAsString();
                    return true;
                case "genTime":
                    captcha.genTime = jsonParser.getValueAsString();
                    return true;
                case "lotNumber":
                    captcha.lotNumber = jsonParser.getValueAsString();
                    return true;
                case "captchaOutput":
                    captcha.captchaOutput = jsonParser.getValueAsString();
                    return true;
                case "localExpired":
                    captcha.localExpired = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(Captcha captcha, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "captchaID":
                case "passToken":
                case "genTime":
                case "lotNumber":
                case "captchaOutput":
                case "localExpired":
                    return true;
                default:
                    return super.parseFieldCheck(captcha, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Captcha captcha, JsonGenerator jsonGenerator) throws IOException {
            String str = captcha.captchaID;
            if (str != null) {
                jsonGenerator.writeStringField("captchaID", str);
            }
            String str2 = captcha.captchaOutput;
            if (str2 != null) {
                jsonGenerator.writeStringField("captchaOutput", str2);
            }
            String str3 = captcha.genTime;
            if (str3 != null) {
                jsonGenerator.writeStringField("genTime", str3);
            }
            String str4 = captcha.lotNumber;
            if (str4 != null) {
                jsonGenerator.writeStringField("lotNumber", str4);
            }
            String str5 = captcha.passToken;
            if (str5 != null) {
                jsonGenerator.writeStringField("passToken", str5);
            }
            jsonGenerator.writeBooleanField("localExpired", captcha.localExpired);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Captcha) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Captcha) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Captcha new_() {
        Captcha captcha = new Captcha();
        captcha.nullCheck();
        return captcha;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Captcha m17795clone() {
        Captcha captcha = new Captcha();
        captcha.captchaID = this.captchaID;
        captcha.captchaOutput = this.captchaOutput;
        captcha.genTime = this.genTime;
        captcha.lotNumber = this.lotNumber;
        captcha.passToken = this.passToken;
        captcha.localExpired = this.localExpired;
        return captcha;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Captcha)) {
            return false;
        }
        Captcha captcha = (Captcha) obj;
        return ValueObject.util_equals(this.captchaID, captcha.captchaID) && ValueObject.util_equals(this.captchaOutput, captcha.captchaOutput) && ValueObject.util_equals(this.genTime, captcha.genTime) && ValueObject.util_equals(this.lotNumber, captcha.lotNumber) && ValueObject.util_equals(this.passToken, captcha.passToken) && this.localExpired == captcha.localExpired;
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
        String str = this.captchaID;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.captchaOutput;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.genTime;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.lotNumber;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.passToken;
        int iHashCode5 = ((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41) + (this.localExpired ? 1231 : 1237);
        ((ValueObject) this).hashCode = iHashCode5;
        return iHashCode5;
    }

    public void nullCheck() {
        if (this.captchaID == null) {
            this.captchaID = "";
        }
        if (this.captchaOutput == null) {
            this.captchaOutput = "";
        }
        if (this.genTime == null) {
            this.genTime = "";
        }
        if (this.lotNumber == null) {
            this.lotNumber = "";
        }
        if (this.passToken == null) {
            this.passToken = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
