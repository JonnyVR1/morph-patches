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
public class GrowthBackUser extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "growthbackuser";

    @NonNull
    @ProtobufIndex(index = 5)
    public String buttonText;

    @ProtobufIndex(index = 2)
    public long expireTime;

    @ProtobufIndex(index = 4)
    public boolean hasClick;

    @ProtobufIndex(index = 3)
    public boolean isNewMatch;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;
    public static ProtobufAdapter<GrowthBackUser> PROTOBUF_ADAPTER = new MessageNanoAdapter<GrowthBackUser>() { // from class: com.p1.mobile.putong.core.data.GrowthBackUser.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(GrowthBackUser growthBackUser) {
            String str = growthBackUser.userId;
            int iM17288o = (str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0) + CodedOutputByteBufferNano.m17283j(2, growthBackUser.expireTime) + CodedOutputByteBufferNano.m17275b(3, growthBackUser.isNewMatch) + CodedOutputByteBufferNano.m17275b(4, growthBackUser.hasClick);
            String str2 = growthBackUser.buttonText;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(5, str2);
            }
            growthBackUser.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GrowthBackUser parse(nc5 nc5Var) throws IOException {
            GrowthBackUser growthBackUser = new GrowthBackUser();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (growthBackUser.userId == null) {
                        growthBackUser.userId = "";
                    }
                    if (growthBackUser.buttonText != null) {
                        break;
                    }
                    growthBackUser.buttonText = "";
                    break;
                }
                if (iM162497u == 10) {
                    growthBackUser.userId = nc5Var.m162495s();
                } else if (iM162497u == 16) {
                    growthBackUser.expireTime = nc5Var.m162487k();
                } else if (iM162497u == 24) {
                    growthBackUser.isNewMatch = nc5Var.m162483g();
                } else if (iM162497u == 32) {
                    growthBackUser.hasClick = nc5Var.m162483g();
                } else {
                    if (iM162497u != 42) {
                        if (growthBackUser.userId == null) {
                            growthBackUser.userId = "";
                        }
                        if (growthBackUser.buttonText != null) {
                            break;
                        }
                        growthBackUser.buttonText = "";
                        return growthBackUser;
                    }
                    growthBackUser.buttonText = nc5Var.m162495s();
                }
            }
            return growthBackUser;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GrowthBackUser growthBackUser, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = growthBackUser.userId;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            codedOutputByteBufferNano.m17307I(2, growthBackUser.expireTime);
            codedOutputByteBufferNano.m17299A(3, growthBackUser.isNewMatch);
            codedOutputByteBufferNano.m17299A(4, growthBackUser.hasClick);
            String str2 = growthBackUser.buttonText;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(5, str2);
            }
        }
    };
    public static JsonAdapter<GrowthBackUser> JSON_ADAPTER = new ObjectJsonAdapter<GrowthBackUser>() { // from class: com.p1.mobile.putong.core.data.GrowthBackUser.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GrowthBackUser.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public GrowthBackUser newInstance() {
            return new GrowthBackUser();
        }

        public boolean parseField(GrowthBackUser growthBackUser, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "userId":
                    growthBackUser.userId = jsonParser.getValueAsString();
                    return true;
                case "expireTime":
                    growthBackUser.expireTime = jsonParser.getValueAsLong();
                    return true;
                case "hasClick":
                    growthBackUser.hasClick = jsonParser.getValueAsBoolean();
                    return true;
                case "buttonText":
                    growthBackUser.buttonText = jsonParser.getValueAsString();
                    return true;
                case "isNewMatch":
                    growthBackUser.isNewMatch = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(GrowthBackUser growthBackUser, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "userId":
                case "expireTime":
                case "hasClick":
                case "buttonText":
                case "isNewMatch":
                    return true;
                default:
                    return super.parseFieldCheck(growthBackUser, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GrowthBackUser growthBackUser, JsonGenerator jsonGenerator) throws IOException {
            String str = growthBackUser.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            jsonGenerator.writeNumberField("expireTime", growthBackUser.expireTime);
            jsonGenerator.writeBooleanField("isNewMatch", growthBackUser.isNewMatch);
            jsonGenerator.writeBooleanField("hasClick", growthBackUser.hasClick);
            String str2 = growthBackUser.buttonText;
            if (str2 != null) {
                jsonGenerator.writeStringField("buttonText", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GrowthBackUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GrowthBackUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GrowthBackUser new_() {
        GrowthBackUser growthBackUser = new GrowthBackUser();
        growthBackUser.nullCheck();
        return growthBackUser;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public GrowthBackUser mo225055clone() {
        GrowthBackUser growthBackUser = new GrowthBackUser();
        growthBackUser.userId = this.userId;
        growthBackUser.expireTime = this.expireTime;
        growthBackUser.isNewMatch = this.isNewMatch;
        growthBackUser.hasClick = this.hasClick;
        growthBackUser.buttonText = this.buttonText;
        return growthBackUser;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GrowthBackUser)) {
            return false;
        }
        GrowthBackUser growthBackUser = (GrowthBackUser) obj;
        return ValueObject.util_equals(this.userId, growthBackUser.userId) && this.expireTime == growthBackUser.expireTime && this.isNewMatch == growthBackUser.isNewMatch && this.hasClick == growthBackUser.hasClick && ValueObject.util_equals(this.buttonText, growthBackUser.buttonText);
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
        int iHashCode = str != null ? str.hashCode() : 0;
        long j = this.expireTime;
        int i3 = (((((((i2 + iHashCode) * 41) + ((int) (j ^ (j >>> 32)))) * 41) + (this.isNewMatch ? 1231 : 1237)) * 41) + (this.hasClick ? 1231 : 1237)) * 41;
        String str2 = this.buttonText;
        int iHashCode2 = i3 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.buttonText == null) {
            this.buttonText = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
