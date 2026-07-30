package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p149l.nb5;

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
            int iM17230l = realPictureInfo != null ? CodedOutputByteBufferNano.m17230l(1, realPictureInfo, RealPictureInfo.PROTOBUF_ADAPTER) : 0;
            RealPictureInfo realPictureInfo2 = realPicturesInfo.outdoor;
            if (realPictureInfo2 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, realPictureInfo2, RealPictureInfo.PROTOBUF_ADAPTER);
            }
            String str = realPicturesInfo.privilegeStatus;
            if (str != null) {
                iM17230l += CodedOutputByteBufferNano.m17233o(3, str);
            }
            realPicturesInfo.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public RealPicturesInfo parse(nb5 nb5Var) throws IOException {
            RealPicturesInfo realPicturesInfo = new RealPicturesInfo();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (realPicturesInfo.privilegeStatus != null) {
                        break;
                    }
                    realPicturesInfo.privilegeStatus = "";
                    break;
                }
                if (iM158752u == 10) {
                    realPicturesInfo.fullBody = (RealPictureInfo) nb5Var.m158743l(RealPictureInfo.PROTOBUF_ADAPTER);
                } else if (iM158752u == 18) {
                    realPicturesInfo.outdoor = (RealPictureInfo) nb5Var.m158743l(RealPictureInfo.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 26) {
                        if (realPicturesInfo.privilegeStatus != null) {
                            break;
                        }
                        realPicturesInfo.privilegeStatus = "";
                        return realPicturesInfo;
                    }
                    realPicturesInfo.privilegeStatus = nb5Var.m158750s();
                }
            }
            return realPicturesInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(RealPicturesInfo realPicturesInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            RealPictureInfo realPictureInfo = realPicturesInfo.fullBody;
            if (realPictureInfo != null) {
                codedOutputByteBufferNano.m17254K(1, realPictureInfo, RealPictureInfo.PROTOBUF_ADAPTER);
            }
            RealPictureInfo realPictureInfo2 = realPicturesInfo.outdoor;
            if (realPictureInfo2 != null) {
                codedOutputByteBufferNano.m17254K(2, realPictureInfo2, RealPictureInfo.PROTOBUF_ADAPTER);
            }
            String str = realPicturesInfo.privilegeStatus;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(3, str);
            }
        }
    };
    public static JsonAdapter<RealPicturesInfo> JSON_ADAPTER = new ObjectJsonAdapter<RealPicturesInfo>() { // from class: com.p1.mobile.putong.core.data.RealPicturesInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return RealPicturesInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RealPicturesInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
    public RealPicturesInfo mo223809clone() {
        RealPicturesInfo realPicturesInfo = new RealPicturesInfo();
        RealPictureInfo realPictureInfo = this.fullBody;
        if (realPictureInfo != null) {
            realPicturesInfo.fullBody = realPictureInfo.mo223809clone();
        }
        RealPictureInfo realPictureInfo2 = this.outdoor;
        if (realPictureInfo2 != null) {
            realPicturesInfo.outdoor = realPictureInfo2.mo223809clone();
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
