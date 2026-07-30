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
public class GrowthBackUser extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "growthbackuser";

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String buttonText;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public long expireTime;

    @ProtobufIndex(index = 4)
    public boolean hasClick;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public boolean isNewMatch;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;
    public static ProtobufAdapter<GrowthBackUser> PROTOBUF_ADAPTER = new MessageNanoAdapter<GrowthBackUser>() { // from class: com.p1.mobile.putong.core.data.GrowthBackUser.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(GrowthBackUser growthBackUser) {
            String str = growthBackUser.userId;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.j(2, growthBackUser.expireTime) + CodedOutputByteBufferNano.b(3, growthBackUser.isNewMatch) + CodedOutputByteBufferNano.b(4, growthBackUser.hasClick);
            String str2 = growthBackUser.buttonText;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(5, str2);
            }
            ((MessageNano) growthBackUser).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public GrowthBackUser m13115parse(nb5 nb5Var) throws IOException {
            GrowthBackUser growthBackUser = new GrowthBackUser();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (growthBackUser.userId == null) {
                        growthBackUser.userId = "";
                    }
                    if (growthBackUser.buttonText != null) {
                        break;
                    }
                    growthBackUser.buttonText = "";
                    break;
                }
                if (iU == 10) {
                    growthBackUser.userId = nb5Var.s();
                } else if (iU == 16) {
                    growthBackUser.expireTime = nb5Var.k();
                } else if (iU == 24) {
                    growthBackUser.isNewMatch = nb5Var.g();
                } else if (iU == 32) {
                    growthBackUser.hasClick = nb5Var.g();
                } else {
                    if (iU != 42) {
                        if (growthBackUser.userId == null) {
                            growthBackUser.userId = "";
                        }
                        if (growthBackUser.buttonText != null) {
                            break;
                        }
                        growthBackUser.buttonText = "";
                        return growthBackUser;
                    }
                    growthBackUser.buttonText = nb5Var.s();
                }
            }
            return growthBackUser;
        }

        public void serialize(GrowthBackUser growthBackUser, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = growthBackUser.userId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.I(2, growthBackUser.expireTime);
            codedOutputByteBufferNano.A(3, growthBackUser.isNewMatch);
            codedOutputByteBufferNano.A(4, growthBackUser.hasClick);
            String str2 = growthBackUser.buttonText;
            if (str2 != null) {
                codedOutputByteBufferNano.R(5, str2);
            }
        }
    };
    public static JsonAdapter<GrowthBackUser> JSON_ADAPTER = new ObjectJsonAdapter<GrowthBackUser>() { // from class: com.p1.mobile.putong.core.data.GrowthBackUser.2
        public Class getDataClass() {
            return GrowthBackUser.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public GrowthBackUser m13116newInstance() {
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GrowthBackUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GrowthBackUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GrowthBackUser new_() {
        GrowthBackUser growthBackUser = new GrowthBackUser();
        growthBackUser.nullCheck();
        return growthBackUser;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public GrowthBackUser m13114clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.buttonText == null) {
            this.buttonText = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
