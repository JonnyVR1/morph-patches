package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
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

/* JADX INFO: loaded from: classes13.dex */
public class BLiveBoardGuard extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "bliveboardguard";

    @NonNull
    @ProtobufIndex(index = 1)
    public String name;

    @NonNull
    @ProtobufIndex(index = 5)
    public String schema;

    @NonNull
    @ProtobufIndex(index = 3)
    public String userAvatar;

    @NonNull
    @ProtobufIndex(index = 4)
    public String userAvatarFrame;

    @NonNull
    @ProtobufIndex(index = 2)
    public String userId;
    public static ProtobufAdapter<BLiveBoardGuard> PROTOBUF_ADAPTER = new C11507a();
    public static JsonAdapter<BLiveBoardGuard> JSON_ADAPTER = new ObjectJsonAdapter<BLiveBoardGuard>() { // from class: com.p1.mobile.putong.live.base.data.BLiveBoardGuard.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveBoardGuard.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveBoardGuard newInstance() {
            return new BLiveBoardGuard();
        }

        public boolean parseField(BLiveBoardGuard bLiveBoardGuard, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "userAvatarFrame":
                    bLiveBoardGuard.userAvatarFrame = jsonParser.getValueAsString();
                    return true;
                case "schema":
                    bLiveBoardGuard.schema = jsonParser.getValueAsString();
                    return true;
                case "userId":
                    bLiveBoardGuard.userId = jsonParser.getValueAsString();
                    return true;
                case "name":
                    bLiveBoardGuard.name = jsonParser.getValueAsString();
                    return true;
                case "userAvatar":
                    bLiveBoardGuard.userAvatar = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveBoardGuard bLiveBoardGuard, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveBoardGuard.name;
            if (str != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            }
            String str2 = bLiveBoardGuard.userId;
            if (str2 != null) {
                jsonGenerator.writeStringField("userId", str2);
            }
            String str3 = bLiveBoardGuard.userAvatar;
            if (str3 != null) {
                jsonGenerator.writeStringField("userAvatar", str3);
            }
            String str4 = bLiveBoardGuard.userAvatarFrame;
            if (str4 != null) {
                jsonGenerator.writeStringField("userAvatarFrame", str4);
            }
            String str5 = bLiveBoardGuard.schema;
            if (str5 != null) {
                jsonGenerator.writeStringField("schema", str5);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveBoardGuard) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveBoardGuard$a */
    public class C11507a extends MessageNanoAdapter<BLiveBoardGuard> {
        public C11507a() {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int computeAndCacheSize(BLiveBoardGuard bLiveBoardGuard) {
            String str = bLiveBoardGuard.name;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = bLiveBoardGuard.userId;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = bLiveBoardGuard.userAvatar;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            String str4 = bLiveBoardGuard.userAvatarFrame;
            if (str4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str4);
            }
            String str5 = bLiveBoardGuard.schema;
            if (str5 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(5, str5);
            }
            bLiveBoardGuard.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BLiveBoardGuard parse(nb5 nb5Var) throws IOException {
            BLiveBoardGuard bLiveBoardGuard = new BLiveBoardGuard();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (bLiveBoardGuard.name == null) {
                        bLiveBoardGuard.name = "";
                    }
                    if (bLiveBoardGuard.userId == null) {
                        bLiveBoardGuard.userId = "";
                    }
                    if (bLiveBoardGuard.userAvatar == null) {
                        bLiveBoardGuard.userAvatar = "";
                    }
                    if (bLiveBoardGuard.userAvatarFrame == null) {
                        bLiveBoardGuard.userAvatarFrame = "";
                    }
                    if (bLiveBoardGuard.schema != null) {
                        break;
                    }
                    bLiveBoardGuard.schema = "";
                    break;
                }
                if (iM158752u == 10) {
                    bLiveBoardGuard.name = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    bLiveBoardGuard.userId = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    bLiveBoardGuard.userAvatar = nb5Var.m158750s();
                } else if (iM158752u == 34) {
                    bLiveBoardGuard.userAvatarFrame = nb5Var.m158750s();
                } else {
                    if (iM158752u != 42) {
                        if (bLiveBoardGuard.name == null) {
                            bLiveBoardGuard.name = "";
                        }
                        if (bLiveBoardGuard.userId == null) {
                            bLiveBoardGuard.userId = "";
                        }
                        if (bLiveBoardGuard.userAvatar == null) {
                            bLiveBoardGuard.userAvatar = "";
                        }
                        if (bLiveBoardGuard.userAvatarFrame == null) {
                            bLiveBoardGuard.userAvatarFrame = "";
                        }
                        if (bLiveBoardGuard.schema != null) {
                            break;
                        }
                        bLiveBoardGuard.schema = "";
                        return bLiveBoardGuard;
                    }
                    bLiveBoardGuard.schema = nb5Var.m158750s();
                }
            }
            return bLiveBoardGuard;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void serialize(BLiveBoardGuard bLiveBoardGuard, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = bLiveBoardGuard.name;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = bLiveBoardGuard.userId;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = bLiveBoardGuard.userAvatar;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            String str4 = bLiveBoardGuard.userAvatarFrame;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(4, str4);
            }
            String str5 = bLiveBoardGuard.schema;
            if (str5 != null) {
                codedOutputByteBufferNano.m17261R(5, str5);
            }
        }
    }

    public static BLiveBoardGuard new_() {
        BLiveBoardGuard bLiveBoardGuard = new BLiveBoardGuard();
        bLiveBoardGuard.nullCheck();
        return bLiveBoardGuard;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveBoardGuard mo223809clone() {
        BLiveBoardGuard bLiveBoardGuard = new BLiveBoardGuard();
        bLiveBoardGuard.name = this.name;
        bLiveBoardGuard.userId = this.userId;
        bLiveBoardGuard.userAvatar = this.userAvatar;
        bLiveBoardGuard.userAvatarFrame = this.userAvatarFrame;
        bLiveBoardGuard.schema = this.schema;
        return bLiveBoardGuard;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveBoardGuard)) {
            return false;
        }
        BLiveBoardGuard bLiveBoardGuard = (BLiveBoardGuard) obj;
        return ValueObject.util_equals(this.name, bLiveBoardGuard.name) && ValueObject.util_equals(this.userId, bLiveBoardGuard.userId) && ValueObject.util_equals(this.userAvatar, bLiveBoardGuard.userAvatar) && ValueObject.util_equals(this.userAvatarFrame, bLiveBoardGuard.userAvatarFrame) && ValueObject.util_equals(this.schema, bLiveBoardGuard.schema);
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
        String str = this.name;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.userId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.userAvatar;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.userAvatarFrame;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.schema;
        int iHashCode5 = iHashCode4 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.userAvatar == null) {
            this.userAvatar = "";
        }
        if (this.userAvatarFrame == null) {
            this.userAvatarFrame = "";
        }
        if (this.schema == null) {
            this.schema = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
