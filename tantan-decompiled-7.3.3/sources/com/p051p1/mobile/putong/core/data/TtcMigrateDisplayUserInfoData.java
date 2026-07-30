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
public class TtcMigrateDisplayUserInfoData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "ttcmigratedisplayuserinfodata";

    @NonNull
    @ProtobufIndex(index = 2)
    public String avatar;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 3)
    public String f21266id;

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
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = ttcMigrateDisplayUserInfoData.avatar;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = ttcMigrateDisplayUserInfoData.f21266id;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            int iM17283j = iM17288o + CodedOutputByteBufferNano.m17283j(4, ttcMigrateDisplayUserInfoData.matchNum) + CodedOutputByteBufferNano.m17283j(5, ttcMigrateDisplayUserInfoData.likedYouNum);
            ttcMigrateDisplayUserInfoData.cachedSize = iM17283j;
            return iM17283j;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public TtcMigrateDisplayUserInfoData parse(nc5 nc5Var) throws IOException {
            TtcMigrateDisplayUserInfoData ttcMigrateDisplayUserInfoData = new TtcMigrateDisplayUserInfoData();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (ttcMigrateDisplayUserInfoData.nickname == null) {
                        ttcMigrateDisplayUserInfoData.nickname = "";
                    }
                    if (ttcMigrateDisplayUserInfoData.avatar == null) {
                        ttcMigrateDisplayUserInfoData.avatar = "";
                    }
                    if (ttcMigrateDisplayUserInfoData.f21266id != null) {
                        break;
                    }
                    ttcMigrateDisplayUserInfoData.f21266id = "";
                    break;
                }
                if (iM162497u == 10) {
                    ttcMigrateDisplayUserInfoData.nickname = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    ttcMigrateDisplayUserInfoData.avatar = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    ttcMigrateDisplayUserInfoData.f21266id = nc5Var.m162495s();
                } else if (iM162497u == 32) {
                    ttcMigrateDisplayUserInfoData.matchNum = nc5Var.m162487k();
                } else {
                    if (iM162497u != 40) {
                        if (ttcMigrateDisplayUserInfoData.nickname == null) {
                            ttcMigrateDisplayUserInfoData.nickname = "";
                        }
                        if (ttcMigrateDisplayUserInfoData.avatar == null) {
                            ttcMigrateDisplayUserInfoData.avatar = "";
                        }
                        if (ttcMigrateDisplayUserInfoData.f21266id != null) {
                            break;
                        }
                        ttcMigrateDisplayUserInfoData.f21266id = "";
                        return ttcMigrateDisplayUserInfoData;
                    }
                    ttcMigrateDisplayUserInfoData.likedYouNum = nc5Var.m162487k();
                }
            }
            return ttcMigrateDisplayUserInfoData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(TtcMigrateDisplayUserInfoData ttcMigrateDisplayUserInfoData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = ttcMigrateDisplayUserInfoData.nickname;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = ttcMigrateDisplayUserInfoData.avatar;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = ttcMigrateDisplayUserInfoData.f21266id;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            codedOutputByteBufferNano.m17307I(4, ttcMigrateDisplayUserInfoData.matchNum);
            codedOutputByteBufferNano.m17307I(5, ttcMigrateDisplayUserInfoData.likedYouNum);
        }
    };
    public static JsonAdapter<TtcMigrateDisplayUserInfoData> JSON_ADAPTER = new ObjectJsonAdapter<TtcMigrateDisplayUserInfoData>() { // from class: com.p1.mobile.putong.core.data.TtcMigrateDisplayUserInfoData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return TtcMigrateDisplayUserInfoData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
                    ttcMigrateDisplayUserInfoData.f21266id = jsonParser.getValueAsString();
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(TtcMigrateDisplayUserInfoData ttcMigrateDisplayUserInfoData, JsonGenerator jsonGenerator) throws IOException {
            String str = ttcMigrateDisplayUserInfoData.nickname;
            if (str != null) {
                jsonGenerator.writeStringField("nickname", str);
            }
            String str2 = ttcMigrateDisplayUserInfoData.avatar;
            if (str2 != null) {
                jsonGenerator.writeStringField("avatar", str2);
            }
            String str3 = ttcMigrateDisplayUserInfoData.f21266id;
            if (str3 != null) {
                jsonGenerator.writeStringField("id", str3);
            }
            jsonGenerator.writeNumberField("matchNum", ttcMigrateDisplayUserInfoData.matchNum);
            jsonGenerator.writeNumberField("likedYouNum", ttcMigrateDisplayUserInfoData.likedYouNum);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TtcMigrateDisplayUserInfoData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
    public TtcMigrateDisplayUserInfoData mo225055clone() {
        TtcMigrateDisplayUserInfoData ttcMigrateDisplayUserInfoData = new TtcMigrateDisplayUserInfoData();
        ttcMigrateDisplayUserInfoData.nickname = this.nickname;
        ttcMigrateDisplayUserInfoData.avatar = this.avatar;
        ttcMigrateDisplayUserInfoData.f21266id = this.f21266id;
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
        return ValueObject.util_equals(this.nickname, ttcMigrateDisplayUserInfoData.nickname) && ValueObject.util_equals(this.avatar, ttcMigrateDisplayUserInfoData.avatar) && ValueObject.util_equals(this.f21266id, ttcMigrateDisplayUserInfoData.f21266id) && this.matchNum == ttcMigrateDisplayUserInfoData.matchNum && this.likedYouNum == ttcMigrateDisplayUserInfoData.likedYouNum;
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
        String str3 = this.f21266id;
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
        if (this.f21266id == null) {
            this.f21266id = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
