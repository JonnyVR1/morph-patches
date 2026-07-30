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
public class AppealPostData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "appealpostdata";

    @NonNull
    @ProtobufIndex(index = 9)
    public String appeal_type;

    @NonNull
    @ProtobufIndex(index = 6)
    public IdCard idCard;

    /* JADX INFO: renamed from: ip */
    @NonNull
    @ProtobufIndex(index = 4)
    public String f183ip;

    @NonNull
    @ProtobufIndex(index = 8)
    public AppealMaterial material;

    @NonNull
    @ProtobufIndex(index = 1)
    public String provider;

    @NonNull
    @ProtobufIndex(index = 2)
    public FaceidLiveData providerData;

    @NonNull
    @ProtobufIndex(index = 3)
    public String reason;

    @NonNull
    @ProtobufIndex(index = 7)
    public PhoneNumber smsPhone;

    @Nullable
    @ProtobufIndex(index = 10)
    public String ticketId;

    @NonNull
    @ProtobufIndex(index = 5)
    public String verificationMethod;
    public static ProtobufAdapter<AppealPostData> PROTOBUF_ADAPTER = new MessageNanoAdapter<AppealPostData>() { // from class: com.p1.mobile.putong.data.AppealPostData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(AppealPostData appealPostData) {
            String str = appealPostData.provider;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            FaceidLiveData faceidLiveData = appealPostData.providerData;
            if (faceidLiveData != null) {
                iO += CodedOutputByteBufferNano.l(2, faceidLiveData, FaceidLiveData.PROTOBUF_ADAPTER);
            }
            String str2 = appealPostData.reason;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(3, str2);
            }
            String str3 = appealPostData.f183ip;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(4, str3);
            }
            String str4 = appealPostData.verificationMethod;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(5, str4);
            }
            IdCard idCard = appealPostData.idCard;
            if (idCard != null) {
                iO += CodedOutputByteBufferNano.l(6, idCard, IdCard.PROTOBUF_ADAPTER);
            }
            PhoneNumber phoneNumber = appealPostData.smsPhone;
            if (phoneNumber != null) {
                iO += CodedOutputByteBufferNano.l(7, phoneNumber, PhoneNumber.PROTOBUF_ADAPTER);
            }
            AppealMaterial appealMaterial = appealPostData.material;
            if (appealMaterial != null) {
                iO += CodedOutputByteBufferNano.l(8, appealMaterial, AppealMaterial.PROTOBUF_ADAPTER);
            }
            String str5 = appealPostData.appeal_type;
            if (str5 != null) {
                iO += CodedOutputByteBufferNano.o(9, str5);
            }
            String str6 = appealPostData.ticketId;
            if (str6 != null) {
                iO += CodedOutputByteBufferNano.o(10, str6);
            }
            ((MessageNano) appealPostData).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public AppealPostData m17713parse(nb5 nb5Var) throws IOException {
            AppealPostData appealPostData = new AppealPostData();
            while (true) {
                switch (nb5Var.u()) {
                    case 0:
                        if (appealPostData.provider == null) {
                            appealPostData.provider = "";
                        }
                        if (appealPostData.providerData == null) {
                            appealPostData.providerData = FaceidLiveData.new_();
                        }
                        if (appealPostData.reason == null) {
                            appealPostData.reason = "";
                        }
                        if (appealPostData.f183ip == null) {
                            appealPostData.f183ip = "";
                        }
                        if (appealPostData.verificationMethod == null) {
                            appealPostData.verificationMethod = "";
                        }
                        if (appealPostData.idCard == null) {
                            appealPostData.idCard = IdCard.new_();
                        }
                        if (appealPostData.smsPhone == null) {
                            appealPostData.smsPhone = PhoneNumber.new_();
                        }
                        if (appealPostData.material == null) {
                            appealPostData.material = AppealMaterial.new_();
                        }
                        if (appealPostData.appeal_type == null) {
                            appealPostData.appeal_type = "";
                        }
                        break;
                    case 10:
                        appealPostData.provider = nb5Var.s();
                        continue;
                    case 18:
                        appealPostData.providerData = (FaceidLiveData) nb5Var.l(FaceidLiveData.PROTOBUF_ADAPTER);
                        continue;
                    case 26:
                        appealPostData.reason = nb5Var.s();
                        continue;
                    case 34:
                        appealPostData.f183ip = nb5Var.s();
                        continue;
                    case 42:
                        appealPostData.verificationMethod = nb5Var.s();
                        continue;
                    case 50:
                        appealPostData.idCard = (IdCard) nb5Var.l(IdCard.PROTOBUF_ADAPTER);
                        continue;
                    case 58:
                        appealPostData.smsPhone = (PhoneNumber) nb5Var.l(PhoneNumber.PROTOBUF_ADAPTER);
                        continue;
                    case 66:
                        appealPostData.material = (AppealMaterial) nb5Var.l(AppealMaterial.PROTOBUF_ADAPTER);
                        continue;
                    case 74:
                        appealPostData.appeal_type = nb5Var.s();
                        continue;
                    case 82:
                        appealPostData.ticketId = nb5Var.s();
                        continue;
                    default:
                        if (appealPostData.provider == null) {
                            appealPostData.provider = "";
                        }
                        if (appealPostData.providerData == null) {
                            appealPostData.providerData = FaceidLiveData.new_();
                        }
                        if (appealPostData.reason == null) {
                            appealPostData.reason = "";
                        }
                        if (appealPostData.f183ip == null) {
                            appealPostData.f183ip = "";
                        }
                        if (appealPostData.verificationMethod == null) {
                            appealPostData.verificationMethod = "";
                        }
                        if (appealPostData.idCard == null) {
                            appealPostData.idCard = IdCard.new_();
                        }
                        if (appealPostData.smsPhone == null) {
                            appealPostData.smsPhone = PhoneNumber.new_();
                        }
                        if (appealPostData.material == null) {
                            appealPostData.material = AppealMaterial.new_();
                        }
                        if (appealPostData.appeal_type == null) {
                            appealPostData.appeal_type = "";
                            return appealPostData;
                        }
                        break;
                }
            }
            return appealPostData;
        }

        public void serialize(AppealPostData appealPostData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = appealPostData.provider;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            FaceidLiveData faceidLiveData = appealPostData.providerData;
            if (faceidLiveData != null) {
                codedOutputByteBufferNano.K(2, faceidLiveData, FaceidLiveData.PROTOBUF_ADAPTER);
            }
            String str2 = appealPostData.reason;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
            String str3 = appealPostData.f183ip;
            if (str3 != null) {
                codedOutputByteBufferNano.R(4, str3);
            }
            String str4 = appealPostData.verificationMethod;
            if (str4 != null) {
                codedOutputByteBufferNano.R(5, str4);
            }
            IdCard idCard = appealPostData.idCard;
            if (idCard != null) {
                codedOutputByteBufferNano.K(6, idCard, IdCard.PROTOBUF_ADAPTER);
            }
            PhoneNumber phoneNumber = appealPostData.smsPhone;
            if (phoneNumber != null) {
                codedOutputByteBufferNano.K(7, phoneNumber, PhoneNumber.PROTOBUF_ADAPTER);
            }
            AppealMaterial appealMaterial = appealPostData.material;
            if (appealMaterial != null) {
                codedOutputByteBufferNano.K(8, appealMaterial, AppealMaterial.PROTOBUF_ADAPTER);
            }
            String str5 = appealPostData.appeal_type;
            if (str5 != null) {
                codedOutputByteBufferNano.R(9, str5);
            }
            String str6 = appealPostData.ticketId;
            if (str6 != null) {
                codedOutputByteBufferNano.R(10, str6);
            }
        }
    };
    public static JsonAdapter<AppealPostData> JSON_ADAPTER = new ObjectJsonAdapter<AppealPostData>() { // from class: com.p1.mobile.putong.data.AppealPostData.2
        public Class getDataClass() {
            return AppealPostData.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public AppealPostData mo17830newInstance() {
            return new AppealPostData();
        }

        public boolean parseField(AppealPostData appealPostData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "idCard":
                    appealPostData.idCard = (IdCard) IdCard.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "verificationMethod":
                    appealPostData.verificationMethod = jsonParser.getValueAsString();
                    return true;
                case "provider":
                    appealPostData.provider = jsonParser.getValueAsString();
                    return true;
                case "reason":
                    appealPostData.reason = jsonParser.getValueAsString();
                    return true;
                case "providerData":
                    appealPostData.providerData = (FaceidLiveData) FaceidLiveData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "appeal_type":
                    appealPostData.appeal_type = jsonParser.getValueAsString();
                    return true;
                case "smsPhone":
                    appealPostData.smsPhone = (PhoneNumber) PhoneNumber.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "ip":
                    appealPostData.f183ip = jsonParser.getValueAsString();
                    return true;
                case "material":
                    appealPostData.material = (AppealMaterial) AppealMaterial.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "ticketId":
                    appealPostData.ticketId = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(AppealPostData appealPostData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "idCard":
                case "verificationMethod":
                case "provider":
                case "reason":
                case "providerData":
                case "appeal_type":
                case "smsPhone":
                case "ip":
                case "material":
                case "ticketId":
                    return true;
                default:
                    return super.parseFieldCheck(appealPostData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AppealPostData appealPostData, JsonGenerator jsonGenerator) throws IOException {
            String str = appealPostData.provider;
            if (str != null) {
                jsonGenerator.writeStringField("provider", str);
            }
            if (appealPostData.providerData != null) {
                jsonGenerator.writeFieldName("providerData");
                FaceidLiveData.JSON_ADAPTER.serialize(appealPostData.providerData, jsonGenerator, true);
            }
            String str2 = appealPostData.reason;
            if (str2 != null) {
                jsonGenerator.writeStringField("reason", str2);
            }
            String str3 = appealPostData.f183ip;
            if (str3 != null) {
                jsonGenerator.writeStringField("ip", str3);
            }
            String str4 = appealPostData.verificationMethod;
            if (str4 != null) {
                jsonGenerator.writeStringField("verificationMethod", str4);
            }
            if (appealPostData.idCard != null) {
                jsonGenerator.writeFieldName(SearchPriority.idCard);
                IdCard.JSON_ADAPTER.serialize(appealPostData.idCard, jsonGenerator, true);
            }
            if (appealPostData.smsPhone != null) {
                jsonGenerator.writeFieldName("smsPhone");
                PhoneNumber.JSON_ADAPTER.serialize(appealPostData.smsPhone, jsonGenerator, true);
            }
            if (appealPostData.material != null) {
                jsonGenerator.writeFieldName("material");
                AppealMaterial.JSON_ADAPTER.serialize(appealPostData.material, jsonGenerator, true);
            }
            String str5 = appealPostData.appeal_type;
            if (str5 != null) {
                jsonGenerator.writeStringField("appeal_type", str5);
            }
            String str6 = appealPostData.ticketId;
            if (str6 != null) {
                jsonGenerator.writeStringField("ticketId", str6);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AppealPostData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AppealPostData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AppealPostData new_() {
        AppealPostData appealPostData = new AppealPostData();
        appealPostData.nullCheck();
        return appealPostData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AppealPostData m17712clone() {
        AppealPostData appealPostData = new AppealPostData();
        appealPostData.provider = this.provider;
        FaceidLiveData faceidLiveData = this.providerData;
        if (faceidLiveData != null) {
            appealPostData.providerData = faceidLiveData.m18087clone();
        }
        appealPostData.reason = this.reason;
        appealPostData.f183ip = this.f183ip;
        appealPostData.verificationMethod = this.verificationMethod;
        IdCard idCard = this.idCard;
        if (idCard != null) {
            appealPostData.idCard = idCard.m18207clone();
        }
        PhoneNumber phoneNumber = this.smsPhone;
        if (phoneNumber != null) {
            appealPostData.smsPhone = phoneNumber.m18794clone();
        }
        AppealMaterial appealMaterial = this.material;
        if (appealMaterial != null) {
            appealPostData.material = appealMaterial.m17709clone();
        }
        appealPostData.appeal_type = this.appeal_type;
        appealPostData.ticketId = this.ticketId;
        return appealPostData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AppealPostData)) {
            return false;
        }
        AppealPostData appealPostData = (AppealPostData) obj;
        return ValueObject.util_equals(this.provider, appealPostData.provider) && ValueObject.util_equals(this.providerData, appealPostData.providerData) && ValueObject.util_equals(this.reason, appealPostData.reason) && ValueObject.util_equals(this.f183ip, appealPostData.f183ip) && ValueObject.util_equals(this.verificationMethod, appealPostData.verificationMethod) && ValueObject.util_equals(this.idCard, appealPostData.idCard) && ValueObject.util_equals(this.smsPhone, appealPostData.smsPhone) && ValueObject.util_equals(this.material, appealPostData.material) && ValueObject.util_equals(this.appeal_type, appealPostData.appeal_type) && ValueObject.util_equals(this.ticketId, appealPostData.ticketId);
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
        String str = this.provider;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        FaceidLiveData faceidLiveData = this.providerData;
        int iHashCode2 = (iHashCode + (faceidLiveData != null ? faceidLiveData.hashCode() : 0)) * 41;
        String str2 = this.reason;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.f183ip;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.verificationMethod;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 41;
        IdCard idCard = this.idCard;
        int iHashCode6 = (iHashCode5 + (idCard != null ? idCard.hashCode() : 0)) * 41;
        PhoneNumber phoneNumber = this.smsPhone;
        int iHashCode7 = (iHashCode6 + (phoneNumber != null ? phoneNumber.hashCode() : 0)) * 41;
        AppealMaterial appealMaterial = this.material;
        int iHashCode8 = (iHashCode7 + (appealMaterial != null ? appealMaterial.hashCode() : 0)) * 41;
        String str5 = this.appeal_type;
        int iHashCode9 = (iHashCode8 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.ticketId;
        int iHashCode10 = iHashCode9 + (str6 != null ? str6.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode10;
        return iHashCode10;
    }

    public void nullCheck() {
        if (this.provider == null) {
            this.provider = "";
        }
        if (this.providerData == null) {
            this.providerData = FaceidLiveData.new_();
        }
        if (this.reason == null) {
            this.reason = "";
        }
        if (this.f183ip == null) {
            this.f183ip = "";
        }
        if (this.verificationMethod == null) {
            this.verificationMethod = "";
        }
        if (this.idCard == null) {
            this.idCard = IdCard.new_();
        }
        if (this.smsPhone == null) {
            this.smsPhone = PhoneNumber.new_();
        }
        if (this.material == null) {
            this.material = AppealMaterial.new_();
        }
        if (this.appeal_type == null) {
            this.appeal_type = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
