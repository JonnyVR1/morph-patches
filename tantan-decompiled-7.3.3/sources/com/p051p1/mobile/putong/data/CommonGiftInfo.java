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
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import p153l.nc5;

/* JADX INFO: loaded from: classes12.dex */
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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CommonGiftInfo commonGiftInfo) {
            String str = commonGiftInfo.giftID;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            CommonGiftInfoExtra commonGiftInfoExtra = commonGiftInfo.extra;
            if (commonGiftInfoExtra != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(2, commonGiftInfoExtra, CommonGiftInfoExtra.PROTOBUF_ADAPTER);
            }
            commonGiftInfo.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CommonGiftInfo parse(nc5 nc5Var) throws IOException {
            CommonGiftInfo commonGiftInfo = new CommonGiftInfo();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (commonGiftInfo.giftID == null) {
                        commonGiftInfo.giftID = "";
                    }
                    if (commonGiftInfo.extra != null) {
                        break;
                    }
                    commonGiftInfo.extra = CommonGiftInfoExtra.new_();
                    break;
                }
                if (iM162497u == 10) {
                    commonGiftInfo.giftID = nc5Var.m162495s();
                } else {
                    if (iM162497u != 18) {
                        if (commonGiftInfo.giftID == null) {
                            commonGiftInfo.giftID = "";
                        }
                        if (commonGiftInfo.extra != null) {
                            break;
                        }
                        commonGiftInfo.extra = CommonGiftInfoExtra.new_();
                        return commonGiftInfo;
                    }
                    commonGiftInfo.extra = (CommonGiftInfoExtra) nc5Var.m162488l(CommonGiftInfoExtra.PROTOBUF_ADAPTER);
                }
            }
            return commonGiftInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CommonGiftInfo commonGiftInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = commonGiftInfo.giftID;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            CommonGiftInfoExtra commonGiftInfoExtra = commonGiftInfo.extra;
            if (commonGiftInfoExtra != null) {
                codedOutputByteBufferNano.m17309K(2, commonGiftInfoExtra, CommonGiftInfoExtra.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<CommonGiftInfo> JSON_ADAPTER = new ObjectJsonAdapter<CommonGiftInfo>() { // from class: com.p1.mobile.putong.data.CommonGiftInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CommonGiftInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CommonGiftInfo newInstance() {
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
            commonGiftInfo.extra = CommonGiftInfoExtra.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(CommonGiftInfo commonGiftInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("giftID") || str.equals("extra")) {
                return true;
            }
            return super.parseFieldCheck(commonGiftInfo, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CommonGiftInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CommonGiftInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CommonGiftInfo new_() {
        CommonGiftInfo commonGiftInfo = new CommonGiftInfo();
        commonGiftInfo.nullCheck();
        return commonGiftInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CommonGiftInfo mo225055clone() {
        CommonGiftInfo commonGiftInfo = new CommonGiftInfo();
        commonGiftInfo.giftID = this.giftID;
        CommonGiftInfoExtra commonGiftInfoExtra = this.extra;
        if (commonGiftInfoExtra != null) {
            commonGiftInfo.extra = commonGiftInfoExtra.mo225055clone();
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
        String str = this.giftID;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        CommonGiftInfoExtra commonGiftInfoExtra = this.extra;
        int iHashCode2 = iHashCode + (commonGiftInfoExtra != null ? commonGiftInfoExtra.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.giftID == null) {
            this.giftID = "";
        }
        if (this.extra == null) {
            this.extra = CommonGiftInfoExtra.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
