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
public class RealFeelInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "realfeelinfo";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String deviceModel;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public IPRegion netLocation;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userID;
    public static ProtobufAdapter<RealFeelInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<RealFeelInfo>() { // from class: com.p1.mobile.putong.core.data.RealFeelInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(RealFeelInfo realFeelInfo) {
            String str = realFeelInfo.userID;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = realFeelInfo.deviceModel;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            IPRegion iPRegion = realFeelInfo.netLocation;
            if (iPRegion != null) {
                iO += CodedOutputByteBufferNano.l(3, iPRegion, IPRegion.PROTOBUF_ADAPTER);
            }
            ((MessageNano) realFeelInfo).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public RealFeelInfo m15249parse(nb5 nb5Var) throws IOException {
            RealFeelInfo realFeelInfo = new RealFeelInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (realFeelInfo.userID == null) {
                        realFeelInfo.userID = "";
                    }
                    if (realFeelInfo.deviceModel == null) {
                        realFeelInfo.deviceModel = "";
                    }
                    if (realFeelInfo.netLocation != null) {
                        break;
                    }
                    realFeelInfo.netLocation = IPRegion.new_();
                    break;
                }
                if (iU == 10) {
                    realFeelInfo.userID = nb5Var.s();
                } else if (iU == 18) {
                    realFeelInfo.deviceModel = nb5Var.s();
                } else {
                    if (iU != 26) {
                        if (realFeelInfo.userID == null) {
                            realFeelInfo.userID = "";
                        }
                        if (realFeelInfo.deviceModel == null) {
                            realFeelInfo.deviceModel = "";
                        }
                        if (realFeelInfo.netLocation != null) {
                            break;
                        }
                        realFeelInfo.netLocation = IPRegion.new_();
                        return realFeelInfo;
                    }
                    realFeelInfo.netLocation = (IPRegion) nb5Var.l(IPRegion.PROTOBUF_ADAPTER);
                }
            }
            return realFeelInfo;
        }

        public void serialize(RealFeelInfo realFeelInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = realFeelInfo.userID;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = realFeelInfo.deviceModel;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            IPRegion iPRegion = realFeelInfo.netLocation;
            if (iPRegion != null) {
                codedOutputByteBufferNano.K(3, iPRegion, IPRegion.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<RealFeelInfo> JSON_ADAPTER = new ObjectJsonAdapter<RealFeelInfo>() { // from class: com.p1.mobile.putong.core.data.RealFeelInfo.2
        public Class getDataClass() {
            return RealFeelInfo.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public RealFeelInfo m15250newInstance() {
            return new RealFeelInfo();
        }

        public boolean parseField(RealFeelInfo realFeelInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "deviceModel":
                    realFeelInfo.deviceModel = jsonParser.getValueAsString();
                    return true;
                case "userID":
                    realFeelInfo.userID = jsonParser.getValueAsString();
                    return true;
                case "netLocation":
                    realFeelInfo.netLocation = (IPRegion) IPRegion.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(RealFeelInfo realFeelInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "deviceModel":
                case "userID":
                case "netLocation":
                    return true;
                default:
                    return super.parseFieldCheck(realFeelInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(RealFeelInfo realFeelInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = realFeelInfo.userID;
            if (str != null) {
                jsonGenerator.writeStringField("userID", str);
            }
            String str2 = realFeelInfo.deviceModel;
            if (str2 != null) {
                jsonGenerator.writeStringField("deviceModel", str2);
            }
            if (realFeelInfo.netLocation != null) {
                jsonGenerator.writeFieldName("netLocation");
                IPRegion.JSON_ADAPTER.serialize(realFeelInfo.netLocation, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RealFeelInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RealFeelInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RealFeelInfo new_() {
        RealFeelInfo realFeelInfo = new RealFeelInfo();
        realFeelInfo.nullCheck();
        return realFeelInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public RealFeelInfo m15248clone() {
        RealFeelInfo realFeelInfo = new RealFeelInfo();
        realFeelInfo.userID = this.userID;
        realFeelInfo.deviceModel = this.deviceModel;
        IPRegion iPRegion = this.netLocation;
        if (iPRegion != null) {
            realFeelInfo.netLocation = iPRegion.m13352clone();
        }
        return realFeelInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RealFeelInfo)) {
            return false;
        }
        RealFeelInfo realFeelInfo = (RealFeelInfo) obj;
        return ValueObject.util_equals(this.userID, realFeelInfo.userID) && ValueObject.util_equals(this.deviceModel, realFeelInfo.deviceModel) && ValueObject.util_equals(this.netLocation, realFeelInfo.netLocation);
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
        String str = this.userID;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.deviceModel;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        IPRegion iPRegion = this.netLocation;
        int iHashCode3 = iHashCode2 + (iPRegion != null ? iPRegion.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.userID == null) {
            this.userID = "";
        }
        if (this.deviceModel == null) {
            this.deviceModel = "";
        }
        if (this.netLocation == null) {
            this.netLocation = IPRegion.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
