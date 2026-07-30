package com.p000p1.mobile.putong.account.data;

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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class WeChatToken extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "wechattoken";

    @NonNull
    @ProtobufIndex(index = 1)
    public String thirdpartyAccessToken;

    @ProtobufIndex(index = 5)
    public int thirdpartyExpiresIn;

    @NonNull
    @ProtobufIndex(index = CameraSticker.STATE_COMPLETE)
    public String thirdpartyId;

    @NonNull
    @ProtobufIndex(index = 2)
    public String thirdpartyRefreshToken;

    @NonNull
    @ProtobufIndex(index = CameraSticker.STATE_ERROR)
    public String thirdpartyScope;
    public static ProtobufAdapter<WeChatToken> PROTOBUF_ADAPTER = new MessageNanoAdapter<WeChatToken>() { // from class: com.p1.mobile.putong.account.data.WeChatToken.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(WeChatToken weChatToken) {
            String str = weChatToken.thirdpartyAccessToken;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = weChatToken.thirdpartyRefreshToken;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = weChatToken.thirdpartyId;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = weChatToken.thirdpartyScope;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            int iH = iO + CodedOutputByteBufferNano.h(5, weChatToken.thirdpartyExpiresIn);
            ((MessageNano) weChatToken).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public WeChatToken m28951parse(nb5 nb5Var) throws IOException {
            WeChatToken weChatToken = new WeChatToken();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (weChatToken.thirdpartyAccessToken == null) {
                        weChatToken.thirdpartyAccessToken = "";
                    }
                    if (weChatToken.thirdpartyRefreshToken == null) {
                        weChatToken.thirdpartyRefreshToken = "";
                    }
                    if (weChatToken.thirdpartyId == null) {
                        weChatToken.thirdpartyId = "";
                    }
                    if (weChatToken.thirdpartyScope != null) {
                        break;
                    }
                    weChatToken.thirdpartyScope = "";
                    break;
                }
                if (iU == 10) {
                    weChatToken.thirdpartyAccessToken = nb5Var.s();
                } else if (iU == 18) {
                    weChatToken.thirdpartyRefreshToken = nb5Var.s();
                } else if (iU == 26) {
                    weChatToken.thirdpartyId = nb5Var.s();
                } else if (iU == 34) {
                    weChatToken.thirdpartyScope = nb5Var.s();
                } else {
                    if (iU != 40) {
                        if (weChatToken.thirdpartyAccessToken == null) {
                            weChatToken.thirdpartyAccessToken = "";
                        }
                        if (weChatToken.thirdpartyRefreshToken == null) {
                            weChatToken.thirdpartyRefreshToken = "";
                        }
                        if (weChatToken.thirdpartyId == null) {
                            weChatToken.thirdpartyId = "";
                        }
                        if (weChatToken.thirdpartyScope != null) {
                            break;
                        }
                        weChatToken.thirdpartyScope = "";
                        return weChatToken;
                    }
                    weChatToken.thirdpartyExpiresIn = nb5Var.j();
                }
            }
            return weChatToken;
        }

        public void serialize(WeChatToken weChatToken, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = weChatToken.thirdpartyAccessToken;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = weChatToken.thirdpartyRefreshToken;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = weChatToken.thirdpartyId;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = weChatToken.thirdpartyScope;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
            codedOutputByteBufferNano.G(5, weChatToken.thirdpartyExpiresIn);
        }
    };
    public static JsonAdapter<WeChatToken> JSON_ADAPTER = new ObjectJsonAdapter<WeChatToken>() { // from class: com.p1.mobile.putong.account.data.WeChatToken.2
        public Class getDataClass() {
            return WeChatToken.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public WeChatToken m28952newInstance() {
            return new WeChatToken();
        }

        public boolean parseField(WeChatToken weChatToken, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "thirdparty_scope":
                    weChatToken.thirdpartyScope = jsonParser.getValueAsString();
                    return true;
                case "thirdparty_refresh_token":
                    weChatToken.thirdpartyRefreshToken = jsonParser.getValueAsString();
                    return true;
                case "thirdparty_id":
                    weChatToken.thirdpartyId = jsonParser.getValueAsString();
                    return true;
                case "thirdparty_expires_in":
                    weChatToken.thirdpartyExpiresIn = jsonParser.getValueAsInt();
                    return true;
                case "thirdparty_access_token":
                    weChatToken.thirdpartyAccessToken = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(WeChatToken weChatToken, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "thirdparty_scope":
                case "thirdparty_refresh_token":
                case "thirdparty_id":
                case "thirdparty_expires_in":
                case "thirdparty_access_token":
                    return true;
                default:
                    return super.parseFieldCheck(weChatToken, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(WeChatToken weChatToken, JsonGenerator jsonGenerator) throws IOException {
            String str = weChatToken.thirdpartyAccessToken;
            if (str != null) {
                jsonGenerator.writeStringField("thirdparty_access_token", str);
            }
            String str2 = weChatToken.thirdpartyRefreshToken;
            if (str2 != null) {
                jsonGenerator.writeStringField("thirdparty_refresh_token", str2);
            }
            String str3 = weChatToken.thirdpartyId;
            if (str3 != null) {
                jsonGenerator.writeStringField("thirdparty_id", str3);
            }
            String str4 = weChatToken.thirdpartyScope;
            if (str4 != null) {
                jsonGenerator.writeStringField("thirdparty_scope", str4);
            }
            jsonGenerator.writeNumberField("thirdparty_expires_in", weChatToken.thirdpartyExpiresIn);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((WeChatToken) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((WeChatToken) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static WeChatToken new_() {
        WeChatToken weChatToken = new WeChatToken();
        weChatToken.nullCheck();
        return weChatToken;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public WeChatToken m28950clone() {
        WeChatToken weChatToken = new WeChatToken();
        weChatToken.thirdpartyAccessToken = this.thirdpartyAccessToken;
        weChatToken.thirdpartyRefreshToken = this.thirdpartyRefreshToken;
        weChatToken.thirdpartyId = this.thirdpartyId;
        weChatToken.thirdpartyScope = this.thirdpartyScope;
        weChatToken.thirdpartyExpiresIn = this.thirdpartyExpiresIn;
        return weChatToken;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WeChatToken)) {
            return false;
        }
        WeChatToken weChatToken = (WeChatToken) obj;
        return ValueObject.util_equals(this.thirdpartyAccessToken, weChatToken.thirdpartyAccessToken) && ValueObject.util_equals(this.thirdpartyRefreshToken, weChatToken.thirdpartyRefreshToken) && ValueObject.util_equals(this.thirdpartyId, weChatToken.thirdpartyId) && ValueObject.util_equals(this.thirdpartyScope, weChatToken.thirdpartyScope) && this.thirdpartyExpiresIn == weChatToken.thirdpartyExpiresIn;
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
        String str = this.thirdpartyAccessToken;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.thirdpartyRefreshToken;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.thirdpartyId;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.thirdpartyScope;
        int iHashCode4 = ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41) + this.thirdpartyExpiresIn;
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

    public void nullCheck() {
        if (this.thirdpartyAccessToken == null) {
            this.thirdpartyAccessToken = "";
        }
        if (this.thirdpartyRefreshToken == null) {
            this.thirdpartyRefreshToken = "";
        }
        if (this.thirdpartyId == null) {
            this.thirdpartyId = "";
        }
        if (this.thirdpartyScope == null) {
            this.thirdpartyScope = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
