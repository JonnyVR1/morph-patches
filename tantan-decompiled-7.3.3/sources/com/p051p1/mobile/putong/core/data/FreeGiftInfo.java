package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
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
import p153l.pzi0;

/* JADX INFO: loaded from: classes10.dex */
public class FreeGiftInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "freegiftinfo";

    @ProtobufIndex(index = 2)
    public double expireTime;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f21135id;

    @ProtobufIndex(index = 3)
    public int remaining;
    public static ProtobufAdapter<FreeGiftInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<FreeGiftInfo>() { // from class: com.p1.mobile.putong.core.data.FreeGiftInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(FreeGiftInfo freeGiftInfo) {
            String str = freeGiftInfo.f21135id;
            int iM17288o = (str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0) + CodedOutputByteBufferNano.m17277d(2, freeGiftInfo.expireTime) + CodedOutputByteBufferNano.m17281h(3, freeGiftInfo.remaining);
            freeGiftInfo.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public FreeGiftInfo parse(nc5 nc5Var) throws IOException {
            FreeGiftInfo freeGiftInfo = new FreeGiftInfo();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (freeGiftInfo.f21135id != null) {
                        break;
                    }
                    freeGiftInfo.f21135id = "";
                    break;
                }
                if (iM162497u == 10) {
                    freeGiftInfo.f21135id = nc5Var.m162495s();
                } else if (iM162497u == 17) {
                    freeGiftInfo.expireTime = nc5Var.m162484h();
                } else {
                    if (iM162497u != 24) {
                        if (freeGiftInfo.f21135id != null) {
                            break;
                        }
                        freeGiftInfo.f21135id = "";
                        return freeGiftInfo;
                    }
                    freeGiftInfo.remaining = nc5Var.m162486j();
                }
            }
            return freeGiftInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(FreeGiftInfo freeGiftInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = freeGiftInfo.f21135id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            codedOutputByteBufferNano.m17301C(2, freeGiftInfo.expireTime);
            codedOutputByteBufferNano.m17305G(3, freeGiftInfo.remaining);
        }
    };
    public static JsonAdapter<FreeGiftInfo> JSON_ADAPTER = new ObjectJsonAdapter<FreeGiftInfo>() { // from class: com.p1.mobile.putong.core.data.FreeGiftInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return FreeGiftInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public FreeGiftInfo newInstance() {
            return new FreeGiftInfo();
        }

        public boolean parseField(FreeGiftInfo freeGiftInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "expireTime":
                    freeGiftInfo.expireTime = jsonParser.getValueAsDouble();
                    return true;
                case "id":
                    freeGiftInfo.f21135id = jsonParser.getValueAsString();
                    return false;
                case "remaining":
                    freeGiftInfo.remaining = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(FreeGiftInfo freeGiftInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "expireTime":
                    return true;
                case "id":
                    return false;
                case "remaining":
                    return true;
                default:
                    return super.parseFieldCheck(freeGiftInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FreeGiftInfo freeGiftInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = freeGiftInfo.f21135id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            jsonGenerator.writeNumberField("expireTime", freeGiftInfo.expireTime);
            jsonGenerator.writeNumberField("remaining", freeGiftInfo.remaining);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FreeGiftInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FreeGiftInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FreeGiftInfo new_() {
        FreeGiftInfo freeGiftInfo = new FreeGiftInfo();
        freeGiftInfo.nullCheck();
        return freeGiftInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public FreeGiftInfo mo225055clone() {
        FreeGiftInfo freeGiftInfo = new FreeGiftInfo();
        freeGiftInfo.f21135id = this.f21135id;
        freeGiftInfo.expireTime = this.expireTime;
        freeGiftInfo.remaining = this.remaining;
        return freeGiftInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FreeGiftInfo)) {
            return false;
        }
        FreeGiftInfo freeGiftInfo = (FreeGiftInfo) obj;
        return ValueObject.util_equals(this.f21135id, freeGiftInfo.f21135id) && this.expireTime == freeGiftInfo.expireTime && this.remaining == freeGiftInfo.remaining;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public boolean hasRemaining() {
        return this.remaining > 0;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.f21135id;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        long jDoubleToLongBits = Double.doubleToLongBits(this.expireTime);
        int i3 = (((iHashCode * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41) + this.remaining;
        this.hashCode = i3;
        return i3;
    }

    public boolean inDuration() {
        return this.expireTime - ((double) pzi0.m174454o()) > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f21135id == null) {
            this.f21135id = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
