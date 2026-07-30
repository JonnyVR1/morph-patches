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
import l.mqi0;
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class FreeGiftInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "freegiftinfo";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public double expireTime;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f55id;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public int remaining;
    public static ProtobufAdapter<FreeGiftInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<FreeGiftInfo>() { // from class: com.p1.mobile.putong.core.data.FreeGiftInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(FreeGiftInfo freeGiftInfo) {
            String str = freeGiftInfo.f55id;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.d(2, freeGiftInfo.expireTime) + CodedOutputByteBufferNano.h(3, freeGiftInfo.remaining);
            ((MessageNano) freeGiftInfo).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public FreeGiftInfo m12821parse(nb5 nb5Var) throws IOException {
            FreeGiftInfo freeGiftInfo = new FreeGiftInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (freeGiftInfo.f55id != null) {
                        break;
                    }
                    freeGiftInfo.f55id = "";
                    break;
                }
                if (iU == 10) {
                    freeGiftInfo.f55id = nb5Var.s();
                } else if (iU == 17) {
                    freeGiftInfo.expireTime = nb5Var.h();
                } else {
                    if (iU != 24) {
                        if (freeGiftInfo.f55id != null) {
                            break;
                        }
                        freeGiftInfo.f55id = "";
                        return freeGiftInfo;
                    }
                    freeGiftInfo.remaining = nb5Var.j();
                }
            }
            return freeGiftInfo;
        }

        public void serialize(FreeGiftInfo freeGiftInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = freeGiftInfo.f55id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.C(2, freeGiftInfo.expireTime);
            codedOutputByteBufferNano.G(3, freeGiftInfo.remaining);
        }
    };
    public static JsonAdapter<FreeGiftInfo> JSON_ADAPTER = new ObjectJsonAdapter<FreeGiftInfo>() { // from class: com.p1.mobile.putong.core.data.FreeGiftInfo.2
        public Class getDataClass() {
            return FreeGiftInfo.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public FreeGiftInfo m12822newInstance() {
            return new FreeGiftInfo();
        }

        public boolean parseField(FreeGiftInfo freeGiftInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "expireTime":
                    freeGiftInfo.expireTime = jsonParser.getValueAsDouble();
                    return true;
                case "id":
                    freeGiftInfo.f55id = jsonParser.getValueAsString();
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

        public void serializeFields(FreeGiftInfo freeGiftInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = freeGiftInfo.f55id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            jsonGenerator.writeNumberField("expireTime", freeGiftInfo.expireTime);
            jsonGenerator.writeNumberField("remaining", freeGiftInfo.remaining);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FreeGiftInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FreeGiftInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FreeGiftInfo new_() {
        FreeGiftInfo freeGiftInfo = new FreeGiftInfo();
        freeGiftInfo.nullCheck();
        return freeGiftInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public FreeGiftInfo m12820clone() {
        FreeGiftInfo freeGiftInfo = new FreeGiftInfo();
        freeGiftInfo.f55id = this.f55id;
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
        return ValueObject.util_equals(this.f55id, freeGiftInfo.f55id) && this.expireTime == freeGiftInfo.expireTime && this.remaining == freeGiftInfo.remaining;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public boolean hasRemaining() {
        return this.remaining > 0;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.f55id;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        long jDoubleToLongBits = Double.doubleToLongBits(this.expireTime);
        int i3 = (((iHashCode * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41) + this.remaining;
        ((ValueObject) this).hashCode = i3;
        return i3;
    }

    public boolean inDuration() {
        return this.expireTime - ((double) mqi0.o()) > 0.0d;
    }

    public void nullCheck() {
        if (this.f55id == null) {
            this.f55id = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
