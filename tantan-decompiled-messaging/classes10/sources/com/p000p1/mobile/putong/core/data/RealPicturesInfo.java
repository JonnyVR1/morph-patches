package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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
public class RealPicturesInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "realpicturesinfo";

    @Nullable
    @ProtobufIndex(index = 1)
    public RealPictureInfo fullBody;

    @Nullable
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public RealPictureInfo outdoor;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String privilegeStatus;
    public static ProtobufAdapter<RealPicturesInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<RealPicturesInfo>() { // from class: com.p1.mobile.putong.core.data.RealPicturesInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(RealPicturesInfo realPicturesInfo) {
            RealPictureInfo realPictureInfo = realPicturesInfo.fullBody;
            int iL = realPictureInfo != null ? CodedOutputByteBufferNano.l(1, realPictureInfo, RealPictureInfo.PROTOBUF_ADAPTER) : 0;
            RealPictureInfo realPictureInfo2 = realPicturesInfo.outdoor;
            if (realPictureInfo2 != null) {
                iL += CodedOutputByteBufferNano.l(2, realPictureInfo2, RealPictureInfo.PROTOBUF_ADAPTER);
            }
            String str = realPicturesInfo.privilegeStatus;
            if (str != null) {
                iL += CodedOutputByteBufferNano.o(3, str);
            }
            ((MessageNano) realPicturesInfo).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public RealPicturesInfo m15269parse(nb5 nb5Var) throws IOException {
            RealPicturesInfo realPicturesInfo = new RealPicturesInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (realPicturesInfo.privilegeStatus != null) {
                        break;
                    }
                    realPicturesInfo.privilegeStatus = "";
                    break;
                }
                if (iU == 10) {
                    realPicturesInfo.fullBody = (RealPictureInfo) nb5Var.l(RealPictureInfo.PROTOBUF_ADAPTER);
                } else if (iU == 18) {
                    realPicturesInfo.outdoor = (RealPictureInfo) nb5Var.l(RealPictureInfo.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 26) {
                        if (realPicturesInfo.privilegeStatus != null) {
                            break;
                        }
                        realPicturesInfo.privilegeStatus = "";
                        return realPicturesInfo;
                    }
                    realPicturesInfo.privilegeStatus = nb5Var.s();
                }
            }
            return realPicturesInfo;
        }

        public void serialize(RealPicturesInfo realPicturesInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            RealPictureInfo realPictureInfo = realPicturesInfo.fullBody;
            if (realPictureInfo != null) {
                codedOutputByteBufferNano.K(1, realPictureInfo, RealPictureInfo.PROTOBUF_ADAPTER);
            }
            RealPictureInfo realPictureInfo2 = realPicturesInfo.outdoor;
            if (realPictureInfo2 != null) {
                codedOutputByteBufferNano.K(2, realPictureInfo2, RealPictureInfo.PROTOBUF_ADAPTER);
            }
            String str = realPicturesInfo.privilegeStatus;
            if (str != null) {
                codedOutputByteBufferNano.R(3, str);
            }
        }
    };
    public static JsonAdapter<RealPicturesInfo> JSON_ADAPTER = new ObjectJsonAdapter<RealPicturesInfo>() { // from class: com.p1.mobile.putong.core.data.RealPicturesInfo.2
        public Class getDataClass() {
            return RealPicturesInfo.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public RealPicturesInfo m15270newInstance() {
            return new RealPicturesInfo();
        }

        public boolean parseField(RealPicturesInfo realPicturesInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "outdoor":
                    realPicturesInfo.outdoor = (RealPictureInfo) RealPictureInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "privilegeStatus":
                    realPicturesInfo.privilegeStatus = jsonParser.getValueAsString();
                    return true;
                case "fullBody":
                    realPicturesInfo.fullBody = (RealPictureInfo) RealPictureInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RealPicturesInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RealPicturesInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RealPicturesInfo new_() {
        RealPicturesInfo realPicturesInfo = new RealPicturesInfo();
        realPicturesInfo.nullCheck();
        return realPicturesInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public RealPicturesInfo m15268clone() {
        RealPicturesInfo realPicturesInfo = new RealPicturesInfo();
        RealPictureInfo realPictureInfo = this.fullBody;
        if (realPictureInfo != null) {
            realPicturesInfo.fullBody = realPictureInfo.m15252clone();
        }
        RealPictureInfo realPictureInfo2 = this.outdoor;
        if (realPictureInfo2 != null) {
            realPicturesInfo.outdoor = realPictureInfo2.m15252clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.privilegeStatus == null) {
            this.privilegeStatus = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
