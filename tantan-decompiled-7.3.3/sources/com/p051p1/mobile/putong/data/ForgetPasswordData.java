package com.p051p1.mobile.putong.data;

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
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import p153l.nc5;

/* JADX INFO: loaded from: classes12.dex */
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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ForgetPasswordData forgetPasswordData) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, forgetPasswordData.countryCode);
            String str = forgetPasswordData.mobileNumber;
            if (str != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(2, str);
            }
            int iM17281h2 = iM17281h + CodedOutputByteBufferNano.m17281h(3, forgetPasswordData.code);
            String str2 = forgetPasswordData.new_;
            if (str2 != null) {
                iM17281h2 += CodedOutputByteBufferNano.m17288o(4, str2);
            }
            forgetPasswordData.cachedSize = iM17281h2;
            return iM17281h2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ForgetPasswordData parse(nc5 nc5Var) throws IOException {
            ForgetPasswordData forgetPasswordData = new ForgetPasswordData();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (forgetPasswordData.mobileNumber == null) {
                        forgetPasswordData.mobileNumber = "";
                    }
                    if (forgetPasswordData.new_ != null) {
                        break;
                    }
                    forgetPasswordData.new_ = "";
                    break;
                }
                if (iM162497u == 8) {
                    forgetPasswordData.countryCode = nc5Var.m162486j();
                } else if (iM162497u == 18) {
                    forgetPasswordData.mobileNumber = nc5Var.m162495s();
                } else if (iM162497u == 24) {
                    forgetPasswordData.code = nc5Var.m162486j();
                } else {
                    if (iM162497u != 34) {
                        if (forgetPasswordData.mobileNumber == null) {
                            forgetPasswordData.mobileNumber = "";
                        }
                        if (forgetPasswordData.new_ != null) {
                            break;
                        }
                        forgetPasswordData.new_ = "";
                        return forgetPasswordData;
                    }
                    forgetPasswordData.new_ = nc5Var.m162495s();
                }
            }
            return forgetPasswordData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ForgetPasswordData forgetPasswordData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, forgetPasswordData.countryCode);
            String str = forgetPasswordData.mobileNumber;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(2, str);
            }
            codedOutputByteBufferNano.m17305G(3, forgetPasswordData.code);
            String str2 = forgetPasswordData.new_;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(4, str2);
            }
        }
    };
    public static JsonAdapter<ForgetPasswordData> JSON_ADAPTER = new ObjectJsonAdapter<ForgetPasswordData>() { // from class: com.p1.mobile.putong.data.ForgetPasswordData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ForgetPasswordData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ForgetPasswordData newInstance() {
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ForgetPasswordData forgetPasswordData, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("country_code", forgetPasswordData.countryCode);
            String str = forgetPasswordData.mobileNumber;
            if (str != null) {
                jsonGenerator.writeStringField("mobile_number", str);
            }
            jsonGenerator.writeNumberField("code", forgetPasswordData.code);
            String str2 = forgetPasswordData.new_;
            if (str2 != null) {
                jsonGenerator.writeStringField(ShareConstants.NEW_VERSION, str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ForgetPasswordData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ForgetPasswordData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ForgetPasswordData new_() {
        ForgetPasswordData forgetPasswordData = new ForgetPasswordData();
        forgetPasswordData.nullCheck();
        return forgetPasswordData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ForgetPasswordData mo225055clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + this.countryCode) * 41;
        String str = this.mobileNumber;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.code) * 41;
        String str2 = this.new_;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.mobileNumber == null) {
            this.mobileNumber = "";
        }
        if (this.new_ == null) {
            this.new_ = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
