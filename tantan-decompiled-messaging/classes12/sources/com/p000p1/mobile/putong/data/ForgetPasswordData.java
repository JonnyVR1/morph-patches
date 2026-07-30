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
public class ForgetPasswordData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "forgetpassworddata";

    @ProtobufIndex(index = 3)
    public int code;

    @ProtobufIndex(index = 1)
    public int countryCode;

    @NonNull
    @ProtobufIndex(index = 2)
    public String mobileNumber;

    @NonNull
    @ProtobufIndex(index = 4)
    public String new_;
    public static ProtobufAdapter<ForgetPasswordData> PROTOBUF_ADAPTER = new MessageNanoAdapter<ForgetPasswordData>() { // from class: com.p1.mobile.putong.data.ForgetPasswordData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ForgetPasswordData forgetPasswordData) {
            int iH = CodedOutputByteBufferNano.h(1, forgetPasswordData.countryCode);
            String str = forgetPasswordData.mobileNumber;
            if (str != null) {
                iH += CodedOutputByteBufferNano.o(2, str);
            }
            int iH2 = iH + CodedOutputByteBufferNano.h(3, forgetPasswordData.code);
            String str2 = forgetPasswordData.new_;
            if (str2 != null) {
                iH2 += CodedOutputByteBufferNano.o(4, str2);
            }
            ((MessageNano) forgetPasswordData).cachedSize = iH2;
            return iH2;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ForgetPasswordData m18115parse(nb5 nb5Var) throws IOException {
            ForgetPasswordData forgetPasswordData = new ForgetPasswordData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (forgetPasswordData.mobileNumber == null) {
                        forgetPasswordData.mobileNumber = "";
                    }
                    if (forgetPasswordData.new_ != null) {
                        break;
                    }
                    forgetPasswordData.new_ = "";
                    break;
                }
                if (iU == 8) {
                    forgetPasswordData.countryCode = nb5Var.j();
                } else if (iU == 18) {
                    forgetPasswordData.mobileNumber = nb5Var.s();
                } else if (iU == 24) {
                    forgetPasswordData.code = nb5Var.j();
                } else {
                    if (iU != 34) {
                        if (forgetPasswordData.mobileNumber == null) {
                            forgetPasswordData.mobileNumber = "";
                        }
                        if (forgetPasswordData.new_ != null) {
                            break;
                        }
                        forgetPasswordData.new_ = "";
                        return forgetPasswordData;
                    }
                    forgetPasswordData.new_ = nb5Var.s();
                }
            }
            return forgetPasswordData;
        }

        public void serialize(ForgetPasswordData forgetPasswordData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, forgetPasswordData.countryCode);
            String str = forgetPasswordData.mobileNumber;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            codedOutputByteBufferNano.G(3, forgetPasswordData.code);
            String str2 = forgetPasswordData.new_;
            if (str2 != null) {
                codedOutputByteBufferNano.R(4, str2);
            }
        }
    };
    public static JsonAdapter<ForgetPasswordData> JSON_ADAPTER = new ObjectJsonAdapter<ForgetPasswordData>() { // from class: com.p1.mobile.putong.data.ForgetPasswordData.2
        public Class getDataClass() {
            return ForgetPasswordData.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public ForgetPasswordData mo17830newInstance() {
            return new ForgetPasswordData();
        }

        public boolean parseField(ForgetPasswordData forgetPasswordData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "new":
                    forgetPasswordData.new_ = jsonParser.getValueAsString();
                    return true;
                case "code":
                    forgetPasswordData.code = jsonParser.getValueAsInt();
                    return true;
                case "mobile_number":
                    forgetPasswordData.mobileNumber = jsonParser.getValueAsString();
                    return true;
                case "country_code":
                    forgetPasswordData.countryCode = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ForgetPasswordData forgetPasswordData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "new":
                case "code":
                case "mobile_number":
                case "country_code":
                    return true;
                default:
                    return super.parseFieldCheck(forgetPasswordData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ForgetPasswordData forgetPasswordData, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("country_code", forgetPasswordData.countryCode);
            String str = forgetPasswordData.mobileNumber;
            if (str != null) {
                jsonGenerator.writeStringField("mobile_number", str);
            }
            jsonGenerator.writeNumberField("code", forgetPasswordData.code);
            String str2 = forgetPasswordData.new_;
            if (str2 != null) {
                jsonGenerator.writeStringField("new", str2);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ForgetPasswordData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ForgetPasswordData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ForgetPasswordData new_() {
        ForgetPasswordData forgetPasswordData = new ForgetPasswordData();
        forgetPasswordData.nullCheck();
        return forgetPasswordData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ForgetPasswordData m18114clone() {
        ForgetPasswordData forgetPasswordData = new ForgetPasswordData();
        forgetPasswordData.countryCode = this.countryCode;
        forgetPasswordData.mobileNumber = this.mobileNumber;
        forgetPasswordData.code = this.code;
        forgetPasswordData.new_ = this.new_;
        return forgetPasswordData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ForgetPasswordData)) {
            return false;
        }
        ForgetPasswordData forgetPasswordData = (ForgetPasswordData) obj;
        return this.countryCode == forgetPasswordData.countryCode && ValueObject.util_equals(this.mobileNumber, forgetPasswordData.mobileNumber) && this.code == forgetPasswordData.code && ValueObject.util_equals(this.new_, forgetPasswordData.new_);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + this.countryCode) * 41;
        String str = this.mobileNumber;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.code) * 41;
        String str2 = this.new_;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.mobileNumber == null) {
            this.mobileNumber = "";
        }
        if (this.new_ == null) {
            this.new_ = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
