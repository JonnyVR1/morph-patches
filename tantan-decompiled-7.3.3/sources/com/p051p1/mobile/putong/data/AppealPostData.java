package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.Reason;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import com.tantanapp.ijk.media.player.IjkMediaPlayer;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import org.spongycastle.asn1.eac.EACTags;
import p153l.nc5;

/* JADX INFO: loaded from: classes12.dex */
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
    public String f39570ip;

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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(AppealPostData appealPostData) {
            String str = appealPostData.provider;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            FaceidLiveData faceidLiveData = appealPostData.providerData;
            if (faceidLiveData != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(2, faceidLiveData, FaceidLiveData.PROTOBUF_ADAPTER);
            }
            String str2 = appealPostData.reason;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str2);
            }
            String str3 = appealPostData.f39570ip;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str3);
            }
            String str4 = appealPostData.verificationMethod;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(5, str4);
            }
            IdCard idCard = appealPostData.idCard;
            if (idCard != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(6, idCard, IdCard.PROTOBUF_ADAPTER);
            }
            PhoneNumber phoneNumber = appealPostData.smsPhone;
            if (phoneNumber != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(7, phoneNumber, PhoneNumber.PROTOBUF_ADAPTER);
            }
            AppealMaterial appealMaterial = appealPostData.material;
            if (appealMaterial != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(8, appealMaterial, AppealMaterial.PROTOBUF_ADAPTER);
            }
            String str5 = appealPostData.appeal_type;
            if (str5 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(9, str5);
            }
            String str6 = appealPostData.ticketId;
            if (str6 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(10, str6);
            }
            appealPostData.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AppealPostData parse(nc5 nc5Var) throws IOException {
            AppealPostData appealPostData = new AppealPostData();
            while (true) {
                switch (nc5Var.m162497u()) {
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
                        if (appealPostData.f39570ip == null) {
                            appealPostData.f39570ip = "";
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
                        appealPostData.provider = nc5Var.m162495s();
                        continue;
                    case 18:
                        appealPostData.providerData = (FaceidLiveData) nc5Var.m162488l(FaceidLiveData.PROTOBUF_ADAPTER);
                        continue;
                    case 26:
                        appealPostData.reason = nc5Var.m162495s();
                        continue;
                    case 34:
                        appealPostData.f39570ip = nc5Var.m162495s();
                        continue;
                    case 42:
                        appealPostData.verificationMethod = nc5Var.m162495s();
                        continue;
                    case 50:
                        appealPostData.idCard = (IdCard) nc5Var.m162488l(IdCard.PROTOBUF_ADAPTER);
                        continue;
                    case 58:
                        appealPostData.smsPhone = (PhoneNumber) nc5Var.m162488l(PhoneNumber.PROTOBUF_ADAPTER);
                        continue;
                    case 66:
                        appealPostData.material = (AppealMaterial) nc5Var.m162488l(AppealMaterial.PROTOBUF_ADAPTER);
                        continue;
                    case 74:
                        appealPostData.appeal_type = nc5Var.m162495s();
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        appealPostData.ticketId = nc5Var.m162495s();
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
                        if (appealPostData.f39570ip == null) {
                            appealPostData.f39570ip = "";
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

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AppealPostData appealPostData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = appealPostData.provider;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            FaceidLiveData faceidLiveData = appealPostData.providerData;
            if (faceidLiveData != null) {
                codedOutputByteBufferNano.m17309K(2, faceidLiveData, FaceidLiveData.PROTOBUF_ADAPTER);
            }
            String str2 = appealPostData.reason;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(3, str2);
            }
            String str3 = appealPostData.f39570ip;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(4, str3);
            }
            String str4 = appealPostData.verificationMethod;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(5, str4);
            }
            IdCard idCard = appealPostData.idCard;
            if (idCard != null) {
                codedOutputByteBufferNano.m17309K(6, idCard, IdCard.PROTOBUF_ADAPTER);
            }
            PhoneNumber phoneNumber = appealPostData.smsPhone;
            if (phoneNumber != null) {
                codedOutputByteBufferNano.m17309K(7, phoneNumber, PhoneNumber.PROTOBUF_ADAPTER);
            }
            AppealMaterial appealMaterial = appealPostData.material;
            if (appealMaterial != null) {
                codedOutputByteBufferNano.m17309K(8, appealMaterial, AppealMaterial.PROTOBUF_ADAPTER);
            }
            String str5 = appealPostData.appeal_type;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(9, str5);
            }
            String str6 = appealPostData.ticketId;
            if (str6 != null) {
                codedOutputByteBufferNano.m17316R(10, str6);
            }
        }
    };
    public static JsonAdapter<AppealPostData> JSON_ADAPTER = new ObjectJsonAdapter<AppealPostData>() { // from class: com.p1.mobile.putong.data.AppealPostData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AppealPostData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public AppealPostData newInstance() {
            return new AppealPostData();
        }

        public boolean parseField(AppealPostData appealPostData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "idCard":
                    appealPostData.idCard = IdCard.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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
                    appealPostData.providerData = FaceidLiveData.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "appeal_type":
                    appealPostData.appeal_type = jsonParser.getValueAsString();
                    return true;
                case "smsPhone":
                    appealPostData.smsPhone = PhoneNumber.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "ip":
                    appealPostData.f39570ip = jsonParser.getValueAsString();
                    return true;
                case "material":
                    appealPostData.material = AppealMaterial.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
                jsonGenerator.writeStringField(Reason.TYPE, str2);
            }
            String str3 = appealPostData.f39570ip;
            if (str3 != null) {
                jsonGenerator.writeStringField(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP, str3);
            }
            String str4 = appealPostData.verificationMethod;
            if (str4 != null) {
                jsonGenerator.writeStringField("verificationMethod", str4);
            }
            if (appealPostData.idCard != null) {
                jsonGenerator.writeFieldName("idCard");
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AppealPostData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AppealPostData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AppealPostData new_() {
        AppealPostData appealPostData = new AppealPostData();
        appealPostData.nullCheck();
        return appealPostData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public AppealPostData mo225055clone() {
        AppealPostData appealPostData = new AppealPostData();
        appealPostData.provider = this.provider;
        FaceidLiveData faceidLiveData = this.providerData;
        if (faceidLiveData != null) {
            appealPostData.providerData = faceidLiveData.mo225055clone();
        }
        appealPostData.reason = this.reason;
        appealPostData.f39570ip = this.f39570ip;
        appealPostData.verificationMethod = this.verificationMethod;
        IdCard idCard = this.idCard;
        if (idCard != null) {
            appealPostData.idCard = idCard.mo225055clone();
        }
        PhoneNumber phoneNumber = this.smsPhone;
        if (phoneNumber != null) {
            appealPostData.smsPhone = phoneNumber.mo225055clone();
        }
        AppealMaterial appealMaterial = this.material;
        if (appealMaterial != null) {
            appealPostData.material = appealMaterial.mo225055clone();
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
        return ValueObject.util_equals(this.provider, appealPostData.provider) && ValueObject.util_equals(this.providerData, appealPostData.providerData) && ValueObject.util_equals(this.reason, appealPostData.reason) && ValueObject.util_equals(this.f39570ip, appealPostData.f39570ip) && ValueObject.util_equals(this.verificationMethod, appealPostData.verificationMethod) && ValueObject.util_equals(this.idCard, appealPostData.idCard) && ValueObject.util_equals(this.smsPhone, appealPostData.smsPhone) && ValueObject.util_equals(this.material, appealPostData.material) && ValueObject.util_equals(this.appeal_type, appealPostData.appeal_type) && ValueObject.util_equals(this.ticketId, appealPostData.ticketId);
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
        String str = this.provider;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        FaceidLiveData faceidLiveData = this.providerData;
        int iHashCode2 = (iHashCode + (faceidLiveData != null ? faceidLiveData.hashCode() : 0)) * 41;
        String str2 = this.reason;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.f39570ip;
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
        this.hashCode = iHashCode10;
        return iHashCode10;
    }

    @Override // com.tantanapp.common.data.ValueObject
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
        if (this.f39570ip == null) {
            this.f39570ip = "";
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
