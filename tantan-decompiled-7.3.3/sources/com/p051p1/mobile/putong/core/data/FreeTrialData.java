package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.StudentVerRejectedReason;
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

/* JADX INFO: loaded from: classes10.dex */
public class FreeTrialData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "freetrialdata";

    @ProtobufIndex(index = 3)
    public long endTime;

    @NonNull
    @ProtobufIndex(index = 7)
    public String offerType;

    @NonNull
    @ProtobufIndex(index = 1)
    public String promotionType;

    @NonNull
    @ProtobufIndex(index = 4)
    public String promotionUrl;

    @NonNull
    @ProtobufIndex(index = 6)
    public String skuId;

    @ProtobufIndex(index = 2)
    public long startTime;

    @NonNull
    @ProtobufIndex(index = 5)
    public String titleText;
    public static ProtobufAdapter<FreeTrialData> PROTOBUF_ADAPTER = new MessageNanoAdapter<FreeTrialData>() { // from class: com.p1.mobile.putong.core.data.FreeTrialData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(FreeTrialData freeTrialData) {
            String str = freeTrialData.promotionType;
            int iM17288o = (str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0) + CodedOutputByteBufferNano.m17283j(2, freeTrialData.startTime) + CodedOutputByteBufferNano.m17283j(3, freeTrialData.endTime);
            String str2 = freeTrialData.promotionUrl;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str2);
            }
            String str3 = freeTrialData.titleText;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(5, str3);
            }
            String str4 = freeTrialData.skuId;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(6, str4);
            }
            String str5 = freeTrialData.offerType;
            if (str5 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(7, str5);
            }
            freeTrialData.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public FreeTrialData parse(nc5 nc5Var) throws IOException {
            FreeTrialData freeTrialData = new FreeTrialData();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (freeTrialData.promotionType == null) {
                        freeTrialData.promotionType = "";
                    }
                    if (freeTrialData.promotionUrl == null) {
                        freeTrialData.promotionUrl = "";
                    }
                    if (freeTrialData.titleText == null) {
                        freeTrialData.titleText = "";
                    }
                    if (freeTrialData.skuId == null) {
                        freeTrialData.skuId = "";
                    }
                    if (freeTrialData.offerType != null) {
                        break;
                    }
                    freeTrialData.offerType = "";
                    break;
                }
                if (iM162497u == 10) {
                    freeTrialData.promotionType = nc5Var.m162495s();
                } else if (iM162497u == 16) {
                    freeTrialData.startTime = nc5Var.m162487k();
                } else if (iM162497u == 24) {
                    freeTrialData.endTime = nc5Var.m162487k();
                } else if (iM162497u == 34) {
                    freeTrialData.promotionUrl = nc5Var.m162495s();
                } else if (iM162497u == 42) {
                    freeTrialData.titleText = nc5Var.m162495s();
                } else if (iM162497u == 50) {
                    freeTrialData.skuId = nc5Var.m162495s();
                } else {
                    if (iM162497u != 58) {
                        if (freeTrialData.promotionType == null) {
                            freeTrialData.promotionType = "";
                        }
                        if (freeTrialData.promotionUrl == null) {
                            freeTrialData.promotionUrl = "";
                        }
                        if (freeTrialData.titleText == null) {
                            freeTrialData.titleText = "";
                        }
                        if (freeTrialData.skuId == null) {
                            freeTrialData.skuId = "";
                        }
                        if (freeTrialData.offerType != null) {
                            break;
                        }
                        freeTrialData.offerType = "";
                        return freeTrialData;
                    }
                    freeTrialData.offerType = nc5Var.m162495s();
                }
            }
            return freeTrialData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(FreeTrialData freeTrialData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = freeTrialData.promotionType;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            codedOutputByteBufferNano.m17307I(2, freeTrialData.startTime);
            codedOutputByteBufferNano.m17307I(3, freeTrialData.endTime);
            String str2 = freeTrialData.promotionUrl;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(4, str2);
            }
            String str3 = freeTrialData.titleText;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(5, str3);
            }
            String str4 = freeTrialData.skuId;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(6, str4);
            }
            String str5 = freeTrialData.offerType;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(7, str5);
            }
        }
    };
    public static JsonAdapter<FreeTrialData> JSON_ADAPTER = new ObjectJsonAdapter<FreeTrialData>() { // from class: com.p1.mobile.putong.core.data.FreeTrialData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return FreeTrialData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public FreeTrialData newInstance() {
            return new FreeTrialData();
        }

        public boolean parseField(FreeTrialData freeTrialData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "titleText":
                    freeTrialData.titleText = jsonParser.getValueAsString();
                    return true;
                case "startTime":
                    freeTrialData.startTime = jsonParser.getValueAsLong();
                    return true;
                case "endTime":
                    freeTrialData.endTime = jsonParser.getValueAsLong();
                    return true;
                case "skuId":
                    freeTrialData.skuId = jsonParser.getValueAsString();
                    return true;
                case "promotionType":
                    freeTrialData.promotionType = jsonParser.getValueAsString();
                    return true;
                case "offerType":
                    freeTrialData.offerType = jsonParser.getValueAsString();
                    return true;
                case "promotionUrl":
                    freeTrialData.promotionUrl = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(FreeTrialData freeTrialData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "titleText":
                case "startTime":
                case "endTime":
                case "skuId":
                case "promotionType":
                case "offerType":
                case "promotionUrl":
                    return true;
                default:
                    return super.parseFieldCheck(freeTrialData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FreeTrialData freeTrialData, JsonGenerator jsonGenerator) throws IOException {
            String str = freeTrialData.promotionType;
            if (str != null) {
                jsonGenerator.writeStringField("promotionType", str);
            }
            jsonGenerator.writeNumberField(StudentVerRejectedReason.startTime, freeTrialData.startTime);
            jsonGenerator.writeNumberField("endTime", freeTrialData.endTime);
            String str2 = freeTrialData.promotionUrl;
            if (str2 != null) {
                jsonGenerator.writeStringField("promotionUrl", str2);
            }
            String str3 = freeTrialData.titleText;
            if (str3 != null) {
                jsonGenerator.writeStringField("titleText", str3);
            }
            String str4 = freeTrialData.skuId;
            if (str4 != null) {
                jsonGenerator.writeStringField("skuId", str4);
            }
            String str5 = freeTrialData.offerType;
            if (str5 != null) {
                jsonGenerator.writeStringField("offerType", str5);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FreeTrialData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FreeTrialData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FreeTrialData new_() {
        FreeTrialData freeTrialData = new FreeTrialData();
        freeTrialData.nullCheck();
        return freeTrialData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public FreeTrialData mo225055clone() {
        FreeTrialData freeTrialData = new FreeTrialData();
        freeTrialData.promotionType = this.promotionType;
        freeTrialData.startTime = this.startTime;
        freeTrialData.endTime = this.endTime;
        freeTrialData.promotionUrl = this.promotionUrl;
        freeTrialData.titleText = this.titleText;
        freeTrialData.skuId = this.skuId;
        freeTrialData.offerType = this.offerType;
        return freeTrialData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FreeTrialData)) {
            return false;
        }
        FreeTrialData freeTrialData = (FreeTrialData) obj;
        return ValueObject.util_equals(this.promotionType, freeTrialData.promotionType) && this.startTime == freeTrialData.startTime && this.endTime == freeTrialData.endTime && ValueObject.util_equals(this.promotionUrl, freeTrialData.promotionUrl) && ValueObject.util_equals(this.titleText, freeTrialData.titleText) && ValueObject.util_equals(this.skuId, freeTrialData.skuId) && ValueObject.util_equals(this.offerType, freeTrialData.offerType);
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
        String str = this.promotionType;
        int iHashCode = str != null ? str.hashCode() : 0;
        long j = this.startTime;
        int i3 = (((i2 + iHashCode) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.endTime;
        int i4 = (i3 + ((int) (j2 ^ (j2 >>> 32)))) * 41;
        String str2 = this.promotionUrl;
        int iHashCode2 = (i4 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.titleText;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.skuId;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.offerType;
        int iHashCode5 = iHashCode4 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.promotionType == null) {
            this.promotionType = "";
        }
        if (this.promotionUrl == null) {
            this.promotionUrl = "";
        }
        if (this.titleText == null) {
            this.titleText = "";
        }
        if (this.skuId == null) {
            this.skuId = "";
        }
        if (this.offerType == null) {
            this.offerType = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
