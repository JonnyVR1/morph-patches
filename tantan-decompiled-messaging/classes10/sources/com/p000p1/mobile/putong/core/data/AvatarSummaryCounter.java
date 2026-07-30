package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.data.Converter;
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
public class AvatarSummaryCounter extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "avatarsummarycounter";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public double createdTime;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public int unread;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;
    public static ProtobufAdapter<AvatarSummaryCounter> PROTOBUF_ADAPTER = new MessageNanoAdapter<AvatarSummaryCounter>() { // from class: com.p1.mobile.putong.core.data.AvatarSummaryCounter.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(AvatarSummaryCounter avatarSummaryCounter) {
            String str = avatarSummaryCounter.userId;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.d(2, avatarSummaryCounter.createdTime) + CodedOutputByteBufferNano.h(3, avatarSummaryCounter.unread);
            ((MessageNano) avatarSummaryCounter).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public AvatarSummaryCounter m11687parse(nb5 nb5Var) throws IOException {
            AvatarSummaryCounter avatarSummaryCounter = new AvatarSummaryCounter();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (avatarSummaryCounter.userId != null) {
                        break;
                    }
                    avatarSummaryCounter.userId = "";
                    break;
                }
                if (iU == 10) {
                    avatarSummaryCounter.userId = nb5Var.s();
                } else if (iU == 17) {
                    avatarSummaryCounter.createdTime = nb5Var.h();
                } else {
                    if (iU != 24) {
                        if (avatarSummaryCounter.userId != null) {
                            break;
                        }
                        avatarSummaryCounter.userId = "";
                        return avatarSummaryCounter;
                    }
                    avatarSummaryCounter.unread = nb5Var.j();
                }
            }
            return avatarSummaryCounter;
        }

        public void serialize(AvatarSummaryCounter avatarSummaryCounter, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = avatarSummaryCounter.userId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.C(2, avatarSummaryCounter.createdTime);
            codedOutputByteBufferNano.G(3, avatarSummaryCounter.unread);
        }
    };
    public static JsonAdapter<AvatarSummaryCounter> JSON_ADAPTER = new ObjectJsonAdapter<AvatarSummaryCounter>() { // from class: com.p1.mobile.putong.core.data.AvatarSummaryCounter.2
        public Class getDataClass() {
            return AvatarSummaryCounter.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public AvatarSummaryCounter m11688newInstance() {
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
                    avatarSummaryCounter.createdTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
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

        public void serializeFields(AvatarSummaryCounter avatarSummaryCounter, JsonGenerator jsonGenerator) throws IOException {
            String str = avatarSummaryCounter.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            jsonGenerator.writeFieldName("createdTime");
            Converter.API_TIME.serialize(Double.valueOf(avatarSummaryCounter.createdTime), jsonGenerator, true);
            jsonGenerator.writeNumberField(LimitTimePictureStatus.unread, avatarSummaryCounter.unread);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AvatarSummaryCounter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AvatarSummaryCounter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AvatarSummaryCounter new_() {
        AvatarSummaryCounter avatarSummaryCounter = new AvatarSummaryCounter();
        avatarSummaryCounter.nullCheck();
        return avatarSummaryCounter;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AvatarSummaryCounter m11686clone() {
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
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        long jDoubleToLongBits = Double.doubleToLongBits(this.createdTime);
        int i3 = (((iHashCode * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41) + this.unread;
        ((ValueObject) this).hashCode = i3;
        return i3;
    }

    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
