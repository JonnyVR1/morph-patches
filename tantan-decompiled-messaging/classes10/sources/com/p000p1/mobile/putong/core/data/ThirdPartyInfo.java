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
public class ThirdPartyInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "thirdpartyinfo";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String avatar;

    @ProtobufIndex(index = 1)
    public int channelId;

    @NonNull
    @ProtobufIndex(index = 4)
    public String nickName;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String openId;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String sign;
    public static ProtobufAdapter<ThirdPartyInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<ThirdPartyInfo>() { // from class: com.p1.mobile.putong.core.data.ThirdPartyInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ThirdPartyInfo thirdPartyInfo) {
            int iH = CodedOutputByteBufferNano.h(1, thirdPartyInfo.channelId);
            String str = thirdPartyInfo.openId;
            if (str != null) {
                iH += CodedOutputByteBufferNano.o(2, str);
            }
            String str2 = thirdPartyInfo.avatar;
            if (str2 != null) {
                iH += CodedOutputByteBufferNano.o(3, str2);
            }
            String str3 = thirdPartyInfo.nickName;
            if (str3 != null) {
                iH += CodedOutputByteBufferNano.o(4, str3);
            }
            String str4 = thirdPartyInfo.sign;
            if (str4 != null) {
                iH += CodedOutputByteBufferNano.o(5, str4);
            }
            ((MessageNano) thirdPartyInfo).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ThirdPartyInfo m15978parse(nb5 nb5Var) throws IOException {
            ThirdPartyInfo thirdPartyInfo = new ThirdPartyInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (thirdPartyInfo.openId == null) {
                        thirdPartyInfo.openId = "";
                    }
                    if (thirdPartyInfo.avatar == null) {
                        thirdPartyInfo.avatar = "";
                    }
                    if (thirdPartyInfo.nickName == null) {
                        thirdPartyInfo.nickName = "";
                    }
                    if (thirdPartyInfo.sign != null) {
                        break;
                    }
                    thirdPartyInfo.sign = "";
                    break;
                }
                if (iU == 8) {
                    thirdPartyInfo.channelId = nb5Var.j();
                } else if (iU == 18) {
                    thirdPartyInfo.openId = nb5Var.s();
                } else if (iU == 26) {
                    thirdPartyInfo.avatar = nb5Var.s();
                } else if (iU == 34) {
                    thirdPartyInfo.nickName = nb5Var.s();
                } else {
                    if (iU != 42) {
                        if (thirdPartyInfo.openId == null) {
                            thirdPartyInfo.openId = "";
                        }
                        if (thirdPartyInfo.avatar == null) {
                            thirdPartyInfo.avatar = "";
                        }
                        if (thirdPartyInfo.nickName == null) {
                            thirdPartyInfo.nickName = "";
                        }
                        if (thirdPartyInfo.sign != null) {
                            break;
                        }
                        thirdPartyInfo.sign = "";
                        return thirdPartyInfo;
                    }
                    thirdPartyInfo.sign = nb5Var.s();
                }
            }
            return thirdPartyInfo;
        }

        public void serialize(ThirdPartyInfo thirdPartyInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, thirdPartyInfo.channelId);
            String str = thirdPartyInfo.openId;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            String str2 = thirdPartyInfo.avatar;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
            String str3 = thirdPartyInfo.nickName;
            if (str3 != null) {
                codedOutputByteBufferNano.R(4, str3);
            }
            String str4 = thirdPartyInfo.sign;
            if (str4 != null) {
                codedOutputByteBufferNano.R(5, str4);
            }
        }
    };
    public static JsonAdapter<ThirdPartyInfo> JSON_ADAPTER = new ObjectJsonAdapter<ThirdPartyInfo>() { // from class: com.p1.mobile.putong.core.data.ThirdPartyInfo.2
        public Class getDataClass() {
            return ThirdPartyInfo.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ThirdPartyInfo m15979newInstance() {
            return new ThirdPartyInfo();
        }

        public boolean parseField(ThirdPartyInfo thirdPartyInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "avatar":
                    thirdPartyInfo.avatar = jsonParser.getValueAsString();
                    return true;
                case "openId":
                    thirdPartyInfo.openId = jsonParser.getValueAsString();
                    return true;
                case "sign":
                    thirdPartyInfo.sign = jsonParser.getValueAsString();
                    return true;
                case "nickName":
                    thirdPartyInfo.nickName = jsonParser.getValueAsString();
                    return true;
                case "channelId":
                    thirdPartyInfo.channelId = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ThirdPartyInfo thirdPartyInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "avatar":
                case "openId":
                case "sign":
                case "nickName":
                case "channelId":
                    return true;
                default:
                    return super.parseFieldCheck(thirdPartyInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(ThirdPartyInfo thirdPartyInfo, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("channelId", thirdPartyInfo.channelId);
            String str = thirdPartyInfo.openId;
            if (str != null) {
                jsonGenerator.writeStringField("openId", str);
            }
            String str2 = thirdPartyInfo.avatar;
            if (str2 != null) {
                jsonGenerator.writeStringField(ReminderAction.avatar, str2);
            }
            String str3 = thirdPartyInfo.nickName;
            if (str3 != null) {
                jsonGenerator.writeStringField("nickName", str3);
            }
            String str4 = thirdPartyInfo.sign;
            if (str4 != null) {
                jsonGenerator.writeStringField("sign", str4);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ThirdPartyInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ThirdPartyInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ThirdPartyInfo new_() {
        ThirdPartyInfo thirdPartyInfo = new ThirdPartyInfo();
        thirdPartyInfo.nullCheck();
        return thirdPartyInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ThirdPartyInfo m15977clone() {
        ThirdPartyInfo thirdPartyInfo = new ThirdPartyInfo();
        thirdPartyInfo.channelId = this.channelId;
        thirdPartyInfo.openId = this.openId;
        thirdPartyInfo.avatar = this.avatar;
        thirdPartyInfo.nickName = this.nickName;
        thirdPartyInfo.sign = this.sign;
        return thirdPartyInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ThirdPartyInfo)) {
            return false;
        }
        ThirdPartyInfo thirdPartyInfo = (ThirdPartyInfo) obj;
        return this.channelId == thirdPartyInfo.channelId && ValueObject.util_equals(this.openId, thirdPartyInfo.openId) && ValueObject.util_equals(this.avatar, thirdPartyInfo.avatar) && ValueObject.util_equals(this.nickName, thirdPartyInfo.nickName) && ValueObject.util_equals(this.sign, thirdPartyInfo.sign);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + this.channelId) * 41;
        String str = this.openId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.avatar;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.nickName;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.sign;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

    public void nullCheck() {
        if (this.openId == null) {
            this.openId = "";
        }
        if (this.avatar == null) {
            this.avatar = "";
        }
        if (this.nickName == null) {
            this.nickName = "";
        }
        if (this.sign == null) {
            this.sign = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
