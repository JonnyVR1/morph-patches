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
public class FreeTrialData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "freetrialdata";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
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

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public long startTime;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String titleText;
    public static ProtobufAdapter<FreeTrialData> PROTOBUF_ADAPTER = new MessageNanoAdapter<FreeTrialData>() { // from class: com.p1.mobile.putong.core.data.FreeTrialData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(FreeTrialData freeTrialData) {
            String str = freeTrialData.promotionType;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.j(2, freeTrialData.startTime) + CodedOutputByteBufferNano.j(3, freeTrialData.endTime);
            String str2 = freeTrialData.promotionUrl;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(4, str2);
            }
            String str3 = freeTrialData.titleText;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(5, str3);
            }
            String str4 = freeTrialData.skuId;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(6, str4);
            }
            String str5 = freeTrialData.offerType;
            if (str5 != null) {
                iO += CodedOutputByteBufferNano.o(7, str5);
            }
            ((MessageNano) freeTrialData).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public FreeTrialData m12829parse(nb5 nb5Var) throws IOException {
            FreeTrialData freeTrialData = new FreeTrialData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 10) {
                    freeTrialData.promotionType = nb5Var.s();
                } else if (iU == 16) {
                    freeTrialData.startTime = nb5Var.k();
                } else if (iU == 24) {
                    freeTrialData.endTime = nb5Var.k();
                } else if (iU == 34) {
                    freeTrialData.promotionUrl = nb5Var.s();
                } else if (iU == 42) {
                    freeTrialData.titleText = nb5Var.s();
                } else if (iU == 50) {
                    freeTrialData.skuId = nb5Var.s();
                } else {
                    if (iU != 58) {
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
                    freeTrialData.offerType = nb5Var.s();
                }
            }
            return freeTrialData;
        }

        public void serialize(FreeTrialData freeTrialData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = freeTrialData.promotionType;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.I(2, freeTrialData.startTime);
            codedOutputByteBufferNano.I(3, freeTrialData.endTime);
            String str2 = freeTrialData.promotionUrl;
            if (str2 != null) {
                codedOutputByteBufferNano.R(4, str2);
            }
            String str3 = freeTrialData.titleText;
            if (str3 != null) {
                codedOutputByteBufferNano.R(5, str3);
            }
            String str4 = freeTrialData.skuId;
            if (str4 != null) {
                codedOutputByteBufferNano.R(6, str4);
            }
            String str5 = freeTrialData.offerType;
            if (str5 != null) {
                codedOutputByteBufferNano.R(7, str5);
            }
        }
    };
    public static JsonAdapter<FreeTrialData> JSON_ADAPTER = new ObjectJsonAdapter<FreeTrialData>() { // from class: com.p1.mobile.putong.core.data.FreeTrialData.2
        public Class getDataClass() {
            return FreeTrialData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public FreeTrialData m12830newInstance() {
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

        public void serializeFields(FreeTrialData freeTrialData, JsonGenerator jsonGenerator) throws IOException {
            String str = freeTrialData.promotionType;
            if (str != null) {
                jsonGenerator.writeStringField("promotionType", str);
            }
            jsonGenerator.writeNumberField("startTime", freeTrialData.startTime);
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FreeTrialData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FreeTrialData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FreeTrialData new_() {
        FreeTrialData freeTrialData = new FreeTrialData();
        freeTrialData.nullCheck();
        return freeTrialData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public FreeTrialData m12828clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode5;
        return iHashCode5;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
