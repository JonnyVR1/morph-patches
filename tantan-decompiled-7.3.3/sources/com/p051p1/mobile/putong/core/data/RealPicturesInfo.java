package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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

/* JADX INFO: loaded from: classes10.dex */
public class RealPicturesInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "realpicturesinfo";

    @Nullable
    @ProtobufIndex(index = 1)
    public RealPictureInfo fullBody;

    @Nullable
    @ProtobufIndex(index = 2)
    public RealPictureInfo outdoor;

    @NonNull
    @ProtobufIndex(index = 3)
    public String privilegeStatus;
    public static ProtobufAdapter<RealPicturesInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<RealPicturesInfo>() { // from class: com.p1.mobile.putong.core.data.RealPicturesInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(RealPicturesInfo realPicturesInfo) {
            RealPictureInfo realPictureInfo = realPicturesInfo.fullBody;
            int iM17285l = realPictureInfo != null ? CodedOutputByteBufferNano.m17285l(1, realPictureInfo, RealPictureInfo.PROTOBUF_ADAPTER) : 0;
            RealPictureInfo realPictureInfo2 = realPicturesInfo.outdoor;
            if (realPictureInfo2 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, realPictureInfo2, RealPictureInfo.PROTOBUF_ADAPTER);
            }
            String str = realPicturesInfo.privilegeStatus;
            if (str != null) {
                iM17285l += CodedOutputByteBufferNano.m17288o(3, str);
            }
            realPicturesInfo.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public RealPicturesInfo parse(nc5 nc5Var) throws IOException {
            RealPicturesInfo realPicturesInfo = new RealPicturesInfo();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (realPicturesInfo.privilegeStatus != null) {
                        break;
                    }
                    realPicturesInfo.privilegeStatus = "";
                    break;
                }
                if (iM162497u == 10) {
                    realPicturesInfo.fullBody = (RealPictureInfo) nc5Var.m162488l(RealPictureInfo.PROTOBUF_ADAPTER);
                } else if (iM162497u == 18) {
                    realPicturesInfo.outdoor = (RealPictureInfo) nc5Var.m162488l(RealPictureInfo.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 26) {
                        if (realPicturesInfo.privilegeStatus != null) {
                            break;
                        }
                        realPicturesInfo.privilegeStatus = "";
                        return realPicturesInfo;
                    }
                    realPicturesInfo.privilegeStatus = nc5Var.m162495s();
                }
            }
            return realPicturesInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(RealPicturesInfo realPicturesInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            RealPictureInfo realPictureInfo = realPicturesInfo.fullBody;
            if (realPictureInfo != null) {
                codedOutputByteBufferNano.m17309K(1, realPictureInfo, RealPictureInfo.PROTOBUF_ADAPTER);
            }
            RealPictureInfo realPictureInfo2 = realPicturesInfo.outdoor;
            if (realPictureInfo2 != null) {
                codedOutputByteBufferNano.m17309K(2, realPictureInfo2, RealPictureInfo.PROTOBUF_ADAPTER);
            }
            String str = realPicturesInfo.privilegeStatus;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(3, str);
            }
        }
    };
    public static JsonAdapter<RealPicturesInfo> JSON_ADAPTER = new ObjectJsonAdapter<RealPicturesInfo>() { // from class: com.p1.mobile.putong.core.data.RealPicturesInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return RealPicturesInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public RealPicturesInfo newInstance() {
            return new RealPicturesInfo();
        }

        public boolean parseField(RealPicturesInfo realPicturesInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "outdoor":
                    realPicturesInfo.outdoor = RealPictureInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "privilegeStatus":
                    realPicturesInfo.privilegeStatus = jsonParser.getValueAsString();
                    return true;
                case "fullBody":
                    realPicturesInfo.fullBody = RealPictureInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(RealPicturesInfo realPicturesInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "outdoor":
                case "privilegeStatus":
                case "fullBody":
                    return true;
                default:
                    return super.parseFieldCheck(realPicturesInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(RealPicturesInfo realPicturesInfo, JsonGenerator jsonGenerator) throws IOException {
            if (realPicturesInfo.fullBody != null) {
                jsonGenerator.writeFieldName("fullBody");
                RealPictureInfo.JSON_ADAPTER.serialize(realPicturesInfo.fullBody, jsonGenerator, true);
            }
            if (realPicturesInfo.outdoor != null) {
                jsonGenerator.writeFieldName("outdoor");
                RealPictureInfo.JSON_ADAPTER.serialize(realPicturesInfo.outdoor, jsonGenerator, true);
            }
            String str = realPicturesInfo.privilegeStatus;
            if (str != null) {
                jsonGenerator.writeStringField("privilegeStatus", str);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RealPicturesInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RealPicturesInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RealPicturesInfo new_() {
        RealPicturesInfo realPicturesInfo = new RealPicturesInfo();
        realPicturesInfo.nullCheck();
        return realPicturesInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public RealPicturesInfo mo225055clone() {
        RealPicturesInfo realPicturesInfo = new RealPicturesInfo();
        RealPictureInfo realPictureInfo = this.fullBody;
        if (realPictureInfo != null) {
            realPicturesInfo.fullBody = realPictureInfo.mo225055clone();
        }
        RealPictureInfo realPictureInfo2 = this.outdoor;
        if (realPictureInfo2 != null) {
            realPicturesInfo.outdoor = realPictureInfo2.mo225055clone();
        }
        realPicturesInfo.privilegeStatus = this.privilegeStatus;
        return realPicturesInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RealPicturesInfo)) {
            return false;
        }
        RealPicturesInfo realPicturesInfo = (RealPicturesInfo) obj;
        return ValueObject.util_equals(this.fullBody, realPicturesInfo.fullBody) && ValueObject.util_equals(this.outdoor, realPicturesInfo.outdoor) && ValueObject.util_equals(this.privilegeStatus, realPicturesInfo.privilegeStatus);
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
        RealPictureInfo realPictureInfo = this.fullBody;
        int iHashCode = (i2 + (realPictureInfo != null ? realPictureInfo.hashCode() : 0)) * 41;
        RealPictureInfo realPictureInfo2 = this.outdoor;
        int iHashCode2 = (iHashCode + (realPictureInfo2 != null ? realPictureInfo2.hashCode() : 0)) * 41;
        String str = this.privilegeStatus;
        int iHashCode3 = iHashCode2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.privilegeStatus == null) {
            this.privilegeStatus = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
