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
public class AvatarSummaryCounter extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "avatarsummarycounter";

    @ProtobufIndex(index = 2)
    public double createdTime;

    @ProtobufIndex(index = 3)
    public int unread;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;
    public static ProtobufAdapter<AvatarSummaryCounter> PROTOBUF_ADAPTER = new MessageNanoAdapter<AvatarSummaryCounter>() { // from class: com.p1.mobile.putong.core.data.AvatarSummaryCounter.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(AvatarSummaryCounter avatarSummaryCounter) {
            String str = avatarSummaryCounter.userId;
            int iM17288o = (str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0) + CodedOutputByteBufferNano.m17277d(2, avatarSummaryCounter.createdTime) + CodedOutputByteBufferNano.m17281h(3, avatarSummaryCounter.unread);
            avatarSummaryCounter.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AvatarSummaryCounter parse(nc5 nc5Var) throws IOException {
            AvatarSummaryCounter avatarSummaryCounter = new AvatarSummaryCounter();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (avatarSummaryCounter.userId != null) {
                        break;
                    }
                    avatarSummaryCounter.userId = "";
                    break;
                }
                if (iM162497u == 10) {
                    avatarSummaryCounter.userId = nc5Var.m162495s();
                } else if (iM162497u == 17) {
                    avatarSummaryCounter.createdTime = nc5Var.m162484h();
                } else {
                    if (iM162497u != 24) {
                        if (avatarSummaryCounter.userId != null) {
                            break;
                        }
                        avatarSummaryCounter.userId = "";
                        return avatarSummaryCounter;
                    }
                    avatarSummaryCounter.unread = nc5Var.m162486j();
                }
            }
            return avatarSummaryCounter;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AvatarSummaryCounter avatarSummaryCounter, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = avatarSummaryCounter.userId;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            codedOutputByteBufferNano.m17301C(2, avatarSummaryCounter.createdTime);
            codedOutputByteBufferNano.m17305G(3, avatarSummaryCounter.unread);
        }
    };
    public static JsonAdapter<AvatarSummaryCounter> JSON_ADAPTER = new ObjectJsonAdapter<AvatarSummaryCounter>() { // from class: com.p1.mobile.putong.core.data.AvatarSummaryCounter.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AvatarSummaryCounter.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public AvatarSummaryCounter newInstance() {
            return new AvatarSummaryCounter();
        }

        public boolean parseField(AvatarSummaryCounter avatarSummaryCounter, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "unread":
                    avatarSummaryCounter.unread = jsonParser.getValueAsInt();
                    return true;
                case "userId":
                    avatarSummaryCounter.userId = jsonParser.getValueAsString();
                    return true;
                case "createdTime":
                    avatarSummaryCounter.createdTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(AvatarSummaryCounter avatarSummaryCounter, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "unread":
                case "userId":
                case "createdTime":
                    return true;
                default:
                    return super.parseFieldCheck(avatarSummaryCounter, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AvatarSummaryCounter avatarSummaryCounter, JsonGenerator jsonGenerator) throws IOException {
            String str = avatarSummaryCounter.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            jsonGenerator.writeFieldName("createdTime");
            Converter.API_TIME.serialize(Double.valueOf(avatarSummaryCounter.createdTime), jsonGenerator, true);
            jsonGenerator.writeNumberField(LimitTimePictureStatus.unread, avatarSummaryCounter.unread);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AvatarSummaryCounter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AvatarSummaryCounter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AvatarSummaryCounter new_() {
        AvatarSummaryCounter avatarSummaryCounter = new AvatarSummaryCounter();
        avatarSummaryCounter.nullCheck();
        return avatarSummaryCounter;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public AvatarSummaryCounter mo225055clone() {
        AvatarSummaryCounter avatarSummaryCounter = new AvatarSummaryCounter();
        avatarSummaryCounter.userId = this.userId;
        avatarSummaryCounter.createdTime = this.createdTime;
        avatarSummaryCounter.unread = this.unread;
        return avatarSummaryCounter;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AvatarSummaryCounter)) {
            return false;
        }
        AvatarSummaryCounter avatarSummaryCounter = (AvatarSummaryCounter) obj;
        return ValueObject.util_equals(this.userId, avatarSummaryCounter.userId) && this.createdTime == avatarSummaryCounter.createdTime && this.unread == avatarSummaryCounter.unread;
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
        String str = this.userId;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        long jDoubleToLongBits = Double.doubleToLongBits(this.createdTime);
        int i3 = (((iHashCode * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41) + this.unread;
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
