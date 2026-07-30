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
public class CommonGiftInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "commongiftinfo";

    @NonNull
    @ProtobufIndex(index = 2)
    public CommonGiftInfoExtra extra;

    @NonNull
    @ProtobufIndex(index = 1)
    public String giftID;
    public static ProtobufAdapter<CommonGiftInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<CommonGiftInfo>() { // from class: com.p1.mobile.putong.data.CommonGiftInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(CommonGiftInfo commonGiftInfo) {
            String str = commonGiftInfo.giftID;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            CommonGiftInfoExtra commonGiftInfoExtra = commonGiftInfo.extra;
            if (commonGiftInfoExtra != null) {
                iO += CodedOutputByteBufferNano.l(2, commonGiftInfoExtra, CommonGiftInfoExtra.PROTOBUF_ADAPTER);
            }
            ((MessageNano) commonGiftInfo).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public CommonGiftInfo m17833parse(nb5 nb5Var) throws IOException {
            CommonGiftInfo commonGiftInfo = new CommonGiftInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (commonGiftInfo.giftID == null) {
                        commonGiftInfo.giftID = "";
                    }
                    if (commonGiftInfo.extra != null) {
                        break;
                    }
                    commonGiftInfo.extra = CommonGiftInfoExtra.new_();
                    break;
                }
                if (iU == 10) {
                    commonGiftInfo.giftID = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (commonGiftInfo.giftID == null) {
                            commonGiftInfo.giftID = "";
                        }
                        if (commonGiftInfo.extra != null) {
                            break;
                        }
                        commonGiftInfo.extra = CommonGiftInfoExtra.new_();
                        return commonGiftInfo;
                    }
                    commonGiftInfo.extra = (CommonGiftInfoExtra) nb5Var.l(CommonGiftInfoExtra.PROTOBUF_ADAPTER);
                }
            }
            return commonGiftInfo;
        }

        public void serialize(CommonGiftInfo commonGiftInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = commonGiftInfo.giftID;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            CommonGiftInfoExtra commonGiftInfoExtra = commonGiftInfo.extra;
            if (commonGiftInfoExtra != null) {
                codedOutputByteBufferNano.K(2, commonGiftInfoExtra, CommonGiftInfoExtra.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<CommonGiftInfo> JSON_ADAPTER = new ObjectJsonAdapter<CommonGiftInfo>() { // from class: com.p1.mobile.putong.data.CommonGiftInfo.2
        public Class getDataClass() {
            return CommonGiftInfo.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public CommonGiftInfo mo17830newInstance() {
            return new CommonGiftInfo();
        }

        public boolean parseField(CommonGiftInfo commonGiftInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("giftID")) {
                commonGiftInfo.giftID = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("extra")) {
                return false;
            }
            commonGiftInfo.extra = (CommonGiftInfoExtra) CommonGiftInfoExtra.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(CommonGiftInfo commonGiftInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("giftID") || str.equals("extra")) {
                return true;
            }
            return super.parseFieldCheck(commonGiftInfo, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CommonGiftInfo commonGiftInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = commonGiftInfo.giftID;
            if (str != null) {
                jsonGenerator.writeStringField("giftID", str);
            }
            if (commonGiftInfo.extra != null) {
                jsonGenerator.writeFieldName("extra");
                CommonGiftInfoExtra.JSON_ADAPTER.serialize(commonGiftInfo.extra, jsonGenerator, true);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CommonGiftInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CommonGiftInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CommonGiftInfo new_() {
        CommonGiftInfo commonGiftInfo = new CommonGiftInfo();
        commonGiftInfo.nullCheck();
        return commonGiftInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public CommonGiftInfo m17832clone() {
        CommonGiftInfo commonGiftInfo = new CommonGiftInfo();
        commonGiftInfo.giftID = this.giftID;
        CommonGiftInfoExtra commonGiftInfoExtra = this.extra;
        if (commonGiftInfoExtra != null) {
            commonGiftInfo.extra = commonGiftInfoExtra.m17835clone();
        }
        return commonGiftInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CommonGiftInfo)) {
            return false;
        }
        CommonGiftInfo commonGiftInfo = (CommonGiftInfo) obj;
        return ValueObject.util_equals(this.giftID, commonGiftInfo.giftID) && ValueObject.util_equals(this.extra, commonGiftInfo.extra);
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
        String str = this.giftID;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        CommonGiftInfoExtra commonGiftInfoExtra = this.extra;
        int iHashCode2 = iHashCode + (commonGiftInfoExtra != null ? commonGiftInfoExtra.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.giftID == null) {
            this.giftID = "";
        }
        if (this.extra == null) {
            this.extra = CommonGiftInfoExtra.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
