package com.p051p1.mobile.putong.core.data;

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

/* JADX INFO: loaded from: classes10.dex */
public class RealFeelInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "realfeelinfo";

    @NonNull
    @ProtobufIndex(index = 2)
    public String deviceModel;

    @NonNull
    @ProtobufIndex(index = 3)
    public IPRegion netLocation;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userID;
    public static ProtobufAdapter<RealFeelInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<RealFeelInfo>() { // from class: com.p1.mobile.putong.core.data.RealFeelInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(RealFeelInfo realFeelInfo) {
            String str = realFeelInfo.userID;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = realFeelInfo.deviceModel;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            IPRegion iPRegion = realFeelInfo.netLocation;
            if (iPRegion != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(3, iPRegion, IPRegion.PROTOBUF_ADAPTER);
            }
            realFeelInfo.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public RealFeelInfo parse(nc5 nc5Var) throws IOException {
            RealFeelInfo realFeelInfo = new RealFeelInfo();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
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
                if (iM162497u == 10) {
                    realFeelInfo.userID = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    realFeelInfo.deviceModel = nc5Var.m162495s();
                } else {
                    if (iM162497u != 26) {
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
                    realFeelInfo.netLocation = (IPRegion) nc5Var.m162488l(IPRegion.PROTOBUF_ADAPTER);
                }
            }
            return realFeelInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(RealFeelInfo realFeelInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = realFeelInfo.userID;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = realFeelInfo.deviceModel;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            IPRegion iPRegion = realFeelInfo.netLocation;
            if (iPRegion != null) {
                codedOutputByteBufferNano.m17309K(3, iPRegion, IPRegion.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<RealFeelInfo> JSON_ADAPTER = new ObjectJsonAdapter<RealFeelInfo>() { // from class: com.p1.mobile.putong.core.data.RealFeelInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return RealFeelInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public RealFeelInfo newInstance() {
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
                    realFeelInfo.netLocation = IPRegion.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RealFeelInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RealFeelInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RealFeelInfo new_() {
        RealFeelInfo realFeelInfo = new RealFeelInfo();
        realFeelInfo.nullCheck();
        return realFeelInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public RealFeelInfo mo225055clone() {
        RealFeelInfo realFeelInfo = new RealFeelInfo();
        realFeelInfo.userID = this.userID;
        realFeelInfo.deviceModel = this.deviceModel;
        IPRegion iPRegion = this.netLocation;
        if (iPRegion != null) {
            realFeelInfo.netLocation = iPRegion.mo225055clone();
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
        String str = this.userID;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.deviceModel;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        IPRegion iPRegion = this.netLocation;
        int iHashCode3 = iHashCode2 + (iPRegion != null ? iPRegion.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
