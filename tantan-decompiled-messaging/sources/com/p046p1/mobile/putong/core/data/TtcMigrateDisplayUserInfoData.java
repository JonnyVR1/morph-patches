package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes10.dex */
public class TtcMigrateDisplayUserInfoData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "ttcmigratedisplayuserinfodata";

    @NonNull
    @ProtobufIndex(index = 2)
    public String avatar;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 3)
    public String f20524id;

    @ProtobufIndex(index = 5)
    public long likedYouNum;

    @ProtobufIndex(index = 4)
    public long matchNum;

    @NonNull
    @ProtobufIndex(index = 1)
    public String nickname;
    public static ProtobufAdapter<TtcMigrateDisplayUserInfoData> PROTOBUF_ADAPTER = new MessageNanoAdapter<TtcMigrateDisplayUserInfoData>() { // from class: com.p1.mobile.putong.core.data.TtcMigrateDisplayUserInfoData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(TtcMigrateDisplayUserInfoData ttcMigrateDisplayUserInfoData) {
            String str = ttcMigrateDisplayUserInfoData.nickname;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = ttcMigrateDisplayUserInfoData.avatar;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = ttcMigrateDisplayUserInfoData.f20524id;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            int iM17228j = iM17233o + CodedOutputByteBufferNano.m17228j(4, ttcMigrateDisplayUserInfoData.matchNum) + CodedOutputByteBufferNano.m17228j(5, ttcMigrateDisplayUserInfoData.likedYouNum);
            ttcMigrateDisplayUserInfoData.cachedSize = iM17228j;
            return iM17228j;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public TtcMigrateDisplayUserInfoData parse(nb5 nb5Var) throws IOException {
            TtcMigrateDisplayUserInfoData ttcMigrateDisplayUserInfoData = new TtcMigrateDisplayUserInfoData();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (ttcMigrateDisplayUserInfoData.nickname == null) {
                        ttcMigrateDisplayUserInfoData.nickname = "";
                    }
                    if (ttcMigrateDisplayUserInfoData.avatar == null) {
                        ttcMigrateDisplayUserInfoData.avatar = "";
                    }
                    if (ttcMigrateDisplayUserInfoData.f20524id != null) {
                        break;
                    }
                    ttcMigrateDisplayUserInfoData.f20524id = "";
                    break;
                }
                if (iM158752u == 10) {
                    ttcMigrateDisplayUserInfoData.nickname = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    ttcMigrateDisplayUserInfoData.avatar = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    ttcMigrateDisplayUserInfoData.f20524id = nb5Var.m158750s();
                } else if (iM158752u == 32) {
                    ttcMigrateDisplayUserInfoData.matchNum = nb5Var.m158742k();
                } else {
                    if (iM158752u != 40) {
                        if (ttcMigrateDisplayUserInfoData.nickname == null) {
                            ttcMigrateDisplayUserInfoData.nickname = "";
                        }
                        if (ttcMigrateDisplayUserInfoData.avatar == null) {
                            ttcMigrateDisplayUserInfoData.avatar = "";
                        }
                        if (ttcMigrateDisplayUserInfoData.f20524id != null) {
                            break;
                        }
                        ttcMigrateDisplayUserInfoData.f20524id = "";
                        return ttcMigrateDisplayUserInfoData;
                    }
                    ttcMigrateDisplayUserInfoData.likedYouNum = nb5Var.m158742k();
                }
            }
            return ttcMigrateDisplayUserInfoData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(TtcMigrateDisplayUserInfoData ttcMigrateDisplayUserInfoData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = ttcMigrateDisplayUserInfoData.nickname;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = ttcMigrateDisplayUserInfoData.avatar;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = ttcMigrateDisplayUserInfoData.f20524id;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            codedOutputByteBufferNano.m17252I(4, ttcMigrateDisplayUserInfoData.matchNum);
            codedOutputByteBufferNano.m17252I(5, ttcMigrateDisplayUserInfoData.likedYouNum);
        }
    };
    public static JsonAdapter<TtcMigrateDisplayUserInfoData> JSON_ADAPTER = new ObjectJsonAdapter<TtcMigrateDisplayUserInfoData>() { // from class: com.p1.mobile.putong.core.data.TtcMigrateDisplayUserInfoData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return TtcMigrateDisplayUserInfoData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public TtcMigrateDisplayUserInfoData newInstance() {
            return new TtcMigrateDisplayUserInfoData();
        }

        public boolean parseField(TtcMigrateDisplayUserInfoData ttcMigrateDisplayUserInfoData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "avatar":
                    ttcMigrateDisplayUserInfoData.avatar = jsonParser.getValueAsString();
                    return true;
                case "id":
                    ttcMigrateDisplayUserInfoData.f20524id = jsonParser.getValueAsString();
                    return false;
                case "nickname":
                    ttcMigrateDisplayUserInfoData.nickname = jsonParser.getValueAsString();
                    return true;
                case "matchNum":
                    ttcMigrateDisplayUserInfoData.matchNum = jsonParser.getValueAsLong();
                    return true;
                case "likedYouNum":
                    ttcMigrateDisplayUserInfoData.likedYouNum = jsonParser.getValueAsLong();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(TtcMigrateDisplayUserInfoData ttcMigrateDisplayUserInfoData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "avatar":
                    return true;
                case "id":
                    return false;
                case "nickname":
                case "matchNum":
                case "likedYouNum":
                    return true;
                default:
                    return super.parseFieldCheck(ttcMigrateDisplayUserInfoData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(TtcMigrateDisplayUserInfoData ttcMigrateDisplayUserInfoData, JsonGenerator jsonGenerator) throws IOException {
            String str = ttcMigrateDisplayUserInfoData.nickname;
            if (str != null) {
                jsonGenerator.writeStringField("nickname", str);
            }
            String str2 = ttcMigrateDisplayUserInfoData.avatar;
            if (str2 != null) {
                jsonGenerator.writeStringField("avatar", str2);
            }
            String str3 = ttcMigrateDisplayUserInfoData.f20524id;
            if (str3 != null) {
                jsonGenerator.writeStringField("id", str3);
            }
            jsonGenerator.writeNumberField("matchNum", ttcMigrateDisplayUserInfoData.matchNum);
            jsonGenerator.writeNumberField("likedYouNum", ttcMigrateDisplayUserInfoData.likedYouNum);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TtcMigrateDisplayUserInfoData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TtcMigrateDisplayUserInfoData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static TtcMigrateDisplayUserInfoData new_() {
        TtcMigrateDisplayUserInfoData ttcMigrateDisplayUserInfoData = new TtcMigrateDisplayUserInfoData();
        ttcMigrateDisplayUserInfoData.nullCheck();
        return ttcMigrateDisplayUserInfoData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public TtcMigrateDisplayUserInfoData mo223809clone() {
        TtcMigrateDisplayUserInfoData ttcMigrateDisplayUserInfoData = new TtcMigrateDisplayUserInfoData();
        ttcMigrateDisplayUserInfoData.nickname = this.nickname;
        ttcMigrateDisplayUserInfoData.avatar = this.avatar;
        ttcMigrateDisplayUserInfoData.f20524id = this.f20524id;
        ttcMigrateDisplayUserInfoData.matchNum = this.matchNum;
        ttcMigrateDisplayUserInfoData.likedYouNum = this.likedYouNum;
        return ttcMigrateDisplayUserInfoData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TtcMigrateDisplayUserInfoData)) {
            return false;
        }
        TtcMigrateDisplayUserInfoData ttcMigrateDisplayUserInfoData = (TtcMigrateDisplayUserInfoData) obj;
        return ValueObject.util_equals(this.nickname, ttcMigrateDisplayUserInfoData.nickname) && ValueObject.util_equals(this.avatar, ttcMigrateDisplayUserInfoData.avatar) && ValueObject.util_equals(this.f20524id, ttcMigrateDisplayUserInfoData.f20524id) && this.matchNum == ttcMigrateDisplayUserInfoData.matchNum && this.likedYouNum == ttcMigrateDisplayUserInfoData.likedYouNum;
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
        String str = this.nickname;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.avatar;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.f20524id;
        int iHashCode3 = str3 != null ? str3.hashCode() : 0;
        long j = this.matchNum;
        int i3 = (((iHashCode2 + iHashCode3) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.likedYouNum;
        int i4 = i3 + ((int) (j2 ^ (j2 >>> 32)));
        this.hashCode = i4;
        return i4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.nickname == null) {
            this.nickname = "";
        }
        if (this.avatar == null) {
            this.avatar = "";
        }
        if (this.f20524id == null) {
            this.f20524id = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
