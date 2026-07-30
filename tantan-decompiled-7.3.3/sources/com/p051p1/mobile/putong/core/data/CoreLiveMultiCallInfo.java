package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.Converter;
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
public class CoreLiveMultiCallInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "corelivemulticallinfo";

    @NonNull
    @ProtobufIndex(index = 5)
    public String jumpLiveId;

    @NonNull
    @ProtobufIndex(index = 6)
    public String jumpRoomId;

    @ProtobufIndex(index = 1)
    public boolean onGoing;

    @NonNull
    @ProtobufIndex(index = 2)
    public String ownerRoomId;

    @ProtobufIndex(index = 4)
    public double quitTime;

    @NonNull
    @ProtobufIndex(index = 3)
    public String role;
    public static ProtobufAdapter<CoreLiveMultiCallInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<CoreLiveMultiCallInfo>() { // from class: com.p1.mobile.putong.core.data.CoreLiveMultiCallInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CoreLiveMultiCallInfo coreLiveMultiCallInfo) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, coreLiveMultiCallInfo.onGoing);
            String str = coreLiveMultiCallInfo.ownerRoomId;
            if (str != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(2, str);
            }
            String str2 = coreLiveMultiCallInfo.role;
            if (str2 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(3, str2);
            }
            int iM17277d = iM17275b + CodedOutputByteBufferNano.m17277d(4, coreLiveMultiCallInfo.quitTime);
            String str3 = coreLiveMultiCallInfo.jumpLiveId;
            if (str3 != null) {
                iM17277d += CodedOutputByteBufferNano.m17288o(5, str3);
            }
            String str4 = coreLiveMultiCallInfo.jumpRoomId;
            if (str4 != null) {
                iM17277d += CodedOutputByteBufferNano.m17288o(6, str4);
            }
            coreLiveMultiCallInfo.cachedSize = iM17277d;
            return iM17277d;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CoreLiveMultiCallInfo parse(nc5 nc5Var) throws IOException {
            CoreLiveMultiCallInfo coreLiveMultiCallInfo = new CoreLiveMultiCallInfo();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (coreLiveMultiCallInfo.ownerRoomId == null) {
                        coreLiveMultiCallInfo.ownerRoomId = "";
                    }
                    if (coreLiveMultiCallInfo.role == null) {
                        coreLiveMultiCallInfo.role = "";
                    }
                    if (coreLiveMultiCallInfo.jumpLiveId == null) {
                        coreLiveMultiCallInfo.jumpLiveId = "";
                    }
                    if (coreLiveMultiCallInfo.jumpRoomId != null) {
                        break;
                    }
                    coreLiveMultiCallInfo.jumpRoomId = "";
                    break;
                }
                if (iM162497u == 8) {
                    coreLiveMultiCallInfo.onGoing = nc5Var.m162483g();
                } else if (iM162497u == 18) {
                    coreLiveMultiCallInfo.ownerRoomId = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    coreLiveMultiCallInfo.role = nc5Var.m162495s();
                } else if (iM162497u == 33) {
                    coreLiveMultiCallInfo.quitTime = nc5Var.m162484h();
                } else if (iM162497u == 42) {
                    coreLiveMultiCallInfo.jumpLiveId = nc5Var.m162495s();
                } else {
                    if (iM162497u != 50) {
                        if (coreLiveMultiCallInfo.ownerRoomId == null) {
                            coreLiveMultiCallInfo.ownerRoomId = "";
                        }
                        if (coreLiveMultiCallInfo.role == null) {
                            coreLiveMultiCallInfo.role = "";
                        }
                        if (coreLiveMultiCallInfo.jumpLiveId == null) {
                            coreLiveMultiCallInfo.jumpLiveId = "";
                        }
                        if (coreLiveMultiCallInfo.jumpRoomId != null) {
                            break;
                        }
                        coreLiveMultiCallInfo.jumpRoomId = "";
                        return coreLiveMultiCallInfo;
                    }
                    coreLiveMultiCallInfo.jumpRoomId = nc5Var.m162495s();
                }
            }
            return coreLiveMultiCallInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CoreLiveMultiCallInfo coreLiveMultiCallInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, coreLiveMultiCallInfo.onGoing);
            String str = coreLiveMultiCallInfo.ownerRoomId;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(2, str);
            }
            String str2 = coreLiveMultiCallInfo.role;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(3, str2);
            }
            codedOutputByteBufferNano.m17301C(4, coreLiveMultiCallInfo.quitTime);
            String str3 = coreLiveMultiCallInfo.jumpLiveId;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(5, str3);
            }
            String str4 = coreLiveMultiCallInfo.jumpRoomId;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(6, str4);
            }
        }
    };
    public static JsonAdapter<CoreLiveMultiCallInfo> JSON_ADAPTER = new ObjectJsonAdapter<CoreLiveMultiCallInfo>() { // from class: com.p1.mobile.putong.core.data.CoreLiveMultiCallInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CoreLiveMultiCallInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CoreLiveMultiCallInfo newInstance() {
            return new CoreLiveMultiCallInfo();
        }

        public boolean parseField(CoreLiveMultiCallInfo coreLiveMultiCallInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "onGoing":
                    coreLiveMultiCallInfo.onGoing = jsonParser.getValueAsBoolean();
                    return true;
                case "quitTime":
                    coreLiveMultiCallInfo.quitTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case "jumpLiveId":
                    coreLiveMultiCallInfo.jumpLiveId = jsonParser.getValueAsString();
                    return true;
                case "jumpRoomId":
                    coreLiveMultiCallInfo.jumpRoomId = jsonParser.getValueAsString();
                    return true;
                case "ownerRoomId":
                    coreLiveMultiCallInfo.ownerRoomId = jsonParser.getValueAsString();
                    return true;
                case "role":
                    coreLiveMultiCallInfo.role = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(CoreLiveMultiCallInfo coreLiveMultiCallInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "onGoing":
                case "quitTime":
                case "jumpLiveId":
                case "jumpRoomId":
                case "ownerRoomId":
                case "role":
                    return true;
                default:
                    return super.parseFieldCheck(coreLiveMultiCallInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CoreLiveMultiCallInfo coreLiveMultiCallInfo, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("onGoing", coreLiveMultiCallInfo.onGoing);
            String str = coreLiveMultiCallInfo.ownerRoomId;
            if (str != null) {
                jsonGenerator.writeStringField("ownerRoomId", str);
            }
            String str2 = coreLiveMultiCallInfo.role;
            if (str2 != null) {
                jsonGenerator.writeStringField("role", str2);
            }
            jsonGenerator.writeFieldName("quitTime");
            Converter.API_TIME.serialize(Double.valueOf(coreLiveMultiCallInfo.quitTime), jsonGenerator, true);
            String str3 = coreLiveMultiCallInfo.jumpLiveId;
            if (str3 != null) {
                jsonGenerator.writeStringField("jumpLiveId", str3);
            }
            String str4 = coreLiveMultiCallInfo.jumpRoomId;
            if (str4 != null) {
                jsonGenerator.writeStringField("jumpRoomId", str4);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CoreLiveMultiCallInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CoreLiveMultiCallInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CoreLiveMultiCallInfo new_() {
        CoreLiveMultiCallInfo coreLiveMultiCallInfo = new CoreLiveMultiCallInfo();
        coreLiveMultiCallInfo.nullCheck();
        return coreLiveMultiCallInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CoreLiveMultiCallInfo mo225055clone() {
        CoreLiveMultiCallInfo coreLiveMultiCallInfo = new CoreLiveMultiCallInfo();
        coreLiveMultiCallInfo.onGoing = this.onGoing;
        coreLiveMultiCallInfo.ownerRoomId = this.ownerRoomId;
        coreLiveMultiCallInfo.role = this.role;
        coreLiveMultiCallInfo.quitTime = this.quitTime;
        coreLiveMultiCallInfo.jumpLiveId = this.jumpLiveId;
        coreLiveMultiCallInfo.jumpRoomId = this.jumpRoomId;
        return coreLiveMultiCallInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CoreLiveMultiCallInfo)) {
            return false;
        }
        CoreLiveMultiCallInfo coreLiveMultiCallInfo = (CoreLiveMultiCallInfo) obj;
        return this.onGoing == coreLiveMultiCallInfo.onGoing && ValueObject.util_equals(this.ownerRoomId, coreLiveMultiCallInfo.ownerRoomId) && ValueObject.util_equals(this.role, coreLiveMultiCallInfo.role) && this.quitTime == coreLiveMultiCallInfo.quitTime && ValueObject.util_equals(this.jumpLiveId, coreLiveMultiCallInfo.jumpLiveId) && ValueObject.util_equals(this.jumpRoomId, coreLiveMultiCallInfo.jumpRoomId);
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
        int i2 = ((i * 41) + (this.onGoing ? 1231 : 1237)) * 41;
        String str = this.ownerRoomId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.role;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.quitTime);
        int i3 = (((iHashCode + iHashCode2) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41;
        String str3 = this.jumpLiveId;
        int iHashCode3 = (i3 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.jumpRoomId;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.ownerRoomId == null) {
            this.ownerRoomId = "";
        }
        if (this.role == null) {
            this.role = "";
        }
        if (this.jumpLiveId == null) {
            this.jumpLiveId = "";
        }
        if (this.jumpRoomId == null) {
            this.jumpRoomId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
