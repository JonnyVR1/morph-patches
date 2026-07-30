package com.p046p1.mobile.putong.data;

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

/* JADX INFO: loaded from: classes12.dex */
public class AvatarFrame extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "avatarframe";

    @NonNull
    @ProtobufIndex(index = 2)
    public String expireTime;

    @NonNull
    @ProtobufIndex(index = 1)
    public String resourceUrl;
    public static ProtobufAdapter<AvatarFrame> PROTOBUF_ADAPTER = new MessageNanoAdapter<AvatarFrame>() { // from class: com.p1.mobile.putong.data.AvatarFrame.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(AvatarFrame avatarFrame) {
            String str = avatarFrame.resourceUrl;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = avatarFrame.expireTime;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            avatarFrame.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AvatarFrame parse(nb5 nb5Var) throws IOException {
            AvatarFrame avatarFrame = new AvatarFrame();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (avatarFrame.resourceUrl == null) {
                        avatarFrame.resourceUrl = "";
                    }
                    if (avatarFrame.expireTime != null) {
                        break;
                    }
                    avatarFrame.expireTime = "";
                    break;
                }
                if (iM158752u == 10) {
                    avatarFrame.resourceUrl = nb5Var.m158750s();
                } else {
                    if (iM158752u != 18) {
                        if (avatarFrame.resourceUrl == null) {
                            avatarFrame.resourceUrl = "";
                        }
                        if (avatarFrame.expireTime != null) {
                            break;
                        }
                        avatarFrame.expireTime = "";
                        return avatarFrame;
                    }
                    avatarFrame.expireTime = nb5Var.m158750s();
                }
            }
            return avatarFrame;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AvatarFrame avatarFrame, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = avatarFrame.resourceUrl;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = avatarFrame.expireTime;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
        }
    };
    public static JsonAdapter<AvatarFrame> JSON_ADAPTER = new ObjectJsonAdapter<AvatarFrame>() { // from class: com.p1.mobile.putong.data.AvatarFrame.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AvatarFrame.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public AvatarFrame newInstance() {
            return new AvatarFrame();
        }

        public boolean parseField(AvatarFrame avatarFrame, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("expireTime")) {
                avatarFrame.expireTime = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("resourceUrl")) {
                return false;
            }
            avatarFrame.resourceUrl = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(AvatarFrame avatarFrame, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("expireTime") || str.equals("resourceUrl")) {
                return true;
            }
            return super.parseFieldCheck(avatarFrame, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AvatarFrame avatarFrame, JsonGenerator jsonGenerator) throws IOException {
            String str = avatarFrame.resourceUrl;
            if (str != null) {
                jsonGenerator.writeStringField("resourceUrl", str);
            }
            String str2 = avatarFrame.expireTime;
            if (str2 != null) {
                jsonGenerator.writeStringField("expireTime", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AvatarFrame) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AvatarFrame) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AvatarFrame new_() {
        AvatarFrame avatarFrame = new AvatarFrame();
        avatarFrame.nullCheck();
        return avatarFrame;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public AvatarFrame mo223809clone() {
        AvatarFrame avatarFrame = new AvatarFrame();
        avatarFrame.resourceUrl = this.resourceUrl;
        avatarFrame.expireTime = this.expireTime;
        return avatarFrame;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AvatarFrame)) {
            return false;
        }
        AvatarFrame avatarFrame = (AvatarFrame) obj;
        return ValueObject.util_equals(this.resourceUrl, avatarFrame.resourceUrl) && ValueObject.util_equals(this.expireTime, avatarFrame.expireTime);
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
        String str = this.resourceUrl;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.expireTime;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.resourceUrl == null) {
            this.resourceUrl = "";
        }
        if (this.expireTime == null) {
            this.expireTime = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
