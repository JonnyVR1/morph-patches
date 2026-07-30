package com.p051p1.mobile.putong.account.data;

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
import com.tencent.open.SocialOperation;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import p153l.nc5;

/* JADX INFO: loaded from: classes9.dex */
public class WeChatUserInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "wechatuserinfo";

    @NonNull
    @ProtobufIndex(index = 4)
    public String headimgurl;

    @NonNull
    @ProtobufIndex(index = 3)
    public String nickname;

    @NonNull
    @ProtobufIndex(index = 2)
    public String openid;

    @ProtobufIndex(index = 1)
    public int sex;

    @NonNull
    @ProtobufIndex(index = 5)
    public String unionid;
    public static ProtobufAdapter<WeChatUserInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<WeChatUserInfo>() { // from class: com.p1.mobile.putong.account.data.WeChatUserInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(WeChatUserInfo weChatUserInfo) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, weChatUserInfo.sex);
            String str = weChatUserInfo.openid;
            if (str != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(2, str);
            }
            String str2 = weChatUserInfo.nickname;
            if (str2 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(3, str2);
            }
            String str3 = weChatUserInfo.headimgurl;
            if (str3 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(4, str3);
            }
            String str4 = weChatUserInfo.unionid;
            if (str4 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(5, str4);
            }
            weChatUserInfo.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public WeChatUserInfo parse(nc5 nc5Var) throws IOException {
            WeChatUserInfo weChatUserInfo = new WeChatUserInfo();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (weChatUserInfo.openid == null) {
                        weChatUserInfo.openid = "";
                    }
                    if (weChatUserInfo.nickname == null) {
                        weChatUserInfo.nickname = "";
                    }
                    if (weChatUserInfo.headimgurl == null) {
                        weChatUserInfo.headimgurl = "";
                    }
                    if (weChatUserInfo.unionid != null) {
                        break;
                    }
                    weChatUserInfo.unionid = "";
                    break;
                }
                if (iM162497u == 8) {
                    weChatUserInfo.sex = nc5Var.m162486j();
                } else if (iM162497u == 18) {
                    weChatUserInfo.openid = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    weChatUserInfo.nickname = nc5Var.m162495s();
                } else if (iM162497u == 34) {
                    weChatUserInfo.headimgurl = nc5Var.m162495s();
                } else {
                    if (iM162497u != 42) {
                        if (weChatUserInfo.openid == null) {
                            weChatUserInfo.openid = "";
                        }
                        if (weChatUserInfo.nickname == null) {
                            weChatUserInfo.nickname = "";
                        }
                        if (weChatUserInfo.headimgurl == null) {
                            weChatUserInfo.headimgurl = "";
                        }
                        if (weChatUserInfo.unionid != null) {
                            break;
                        }
                        weChatUserInfo.unionid = "";
                        return weChatUserInfo;
                    }
                    weChatUserInfo.unionid = nc5Var.m162495s();
                }
            }
            return weChatUserInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(WeChatUserInfo weChatUserInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, weChatUserInfo.sex);
            String str = weChatUserInfo.openid;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(2, str);
            }
            String str2 = weChatUserInfo.nickname;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(3, str2);
            }
            String str3 = weChatUserInfo.headimgurl;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(4, str3);
            }
            String str4 = weChatUserInfo.unionid;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(5, str4);
            }
        }
    };
    public static JsonAdapter<WeChatUserInfo> JSON_ADAPTER = new ObjectJsonAdapter<WeChatUserInfo>() { // from class: com.p1.mobile.putong.account.data.WeChatUserInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return WeChatUserInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public WeChatUserInfo newInstance() {
            return new WeChatUserInfo();
        }

        public boolean parseField(WeChatUserInfo weChatUserInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "openid":
                    weChatUserInfo.openid = jsonParser.getValueAsString();
                    return true;
                case "unionid":
                    weChatUserInfo.unionid = jsonParser.getValueAsString();
                    return true;
                case "sex":
                    weChatUserInfo.sex = jsonParser.getValueAsInt();
                    return true;
                case "nickname":
                    weChatUserInfo.nickname = jsonParser.getValueAsString();
                    return true;
                case "headimgurl":
                    weChatUserInfo.headimgurl = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(WeChatUserInfo weChatUserInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "openid":
                case "unionid":
                case "sex":
                case "nickname":
                case "headimgurl":
                    return true;
                default:
                    return super.parseFieldCheck(weChatUserInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(WeChatUserInfo weChatUserInfo, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("sex", weChatUserInfo.sex);
            String str = weChatUserInfo.openid;
            if (str != null) {
                jsonGenerator.writeStringField("openid", str);
            }
            String str2 = weChatUserInfo.nickname;
            if (str2 != null) {
                jsonGenerator.writeStringField("nickname", str2);
            }
            String str3 = weChatUserInfo.headimgurl;
            if (str3 != null) {
                jsonGenerator.writeStringField("headimgurl", str3);
            }
            String str4 = weChatUserInfo.unionid;
            if (str4 != null) {
                jsonGenerator.writeStringField(SocialOperation.GAME_UNION_ID, str4);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((WeChatUserInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((WeChatUserInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static WeChatUserInfo new_() {
        WeChatUserInfo weChatUserInfo = new WeChatUserInfo();
        weChatUserInfo.nullCheck();
        return weChatUserInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public WeChatUserInfo mo225055clone() {
        WeChatUserInfo weChatUserInfo = new WeChatUserInfo();
        weChatUserInfo.sex = this.sex;
        weChatUserInfo.openid = this.openid;
        weChatUserInfo.nickname = this.nickname;
        weChatUserInfo.headimgurl = this.headimgurl;
        weChatUserInfo.unionid = this.unionid;
        return weChatUserInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WeChatUserInfo)) {
            return false;
        }
        WeChatUserInfo weChatUserInfo = (WeChatUserInfo) obj;
        return this.sex == weChatUserInfo.sex && ValueObject.util_equals(this.openid, weChatUserInfo.openid) && ValueObject.util_equals(this.nickname, weChatUserInfo.nickname) && ValueObject.util_equals(this.headimgurl, weChatUserInfo.headimgurl) && ValueObject.util_equals(this.unionid, weChatUserInfo.unionid);
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
        int i2 = ((i * 41) + this.sex) * 41;
        String str = this.openid;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.nickname;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.headimgurl;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.unionid;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.openid == null) {
            this.openid = "";
        }
        if (this.nickname == null) {
            this.nickname = "";
        }
        if (this.headimgurl == null) {
            this.headimgurl = "";
        }
        if (this.unionid == null) {
            this.unionid = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
