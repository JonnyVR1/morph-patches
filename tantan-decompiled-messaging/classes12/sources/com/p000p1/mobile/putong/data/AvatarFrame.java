package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(AvatarFrame avatarFrame) {
            String str = avatarFrame.resourceUrl;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = avatarFrame.expireTime;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) avatarFrame).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public AvatarFrame m17730parse(nb5 nb5Var) throws IOException {
            AvatarFrame avatarFrame = new AvatarFrame();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (avatarFrame.resourceUrl == null) {
                        avatarFrame.resourceUrl = "";
                    }
                    if (avatarFrame.expireTime != null) {
                        break;
                    }
                    avatarFrame.expireTime = "";
                    break;
                }
                if (iU == 10) {
                    avatarFrame.resourceUrl = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (avatarFrame.resourceUrl == null) {
                            avatarFrame.resourceUrl = "";
                        }
                        if (avatarFrame.expireTime != null) {
                            break;
                        }
                        avatarFrame.expireTime = "";
                        return avatarFrame;
                    }
                    avatarFrame.expireTime = nb5Var.s();
                }
            }
            return avatarFrame;
        }

        public void serialize(AvatarFrame avatarFrame, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = avatarFrame.resourceUrl;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = avatarFrame.expireTime;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<AvatarFrame> JSON_ADAPTER = new ObjectJsonAdapter<AvatarFrame>() { // from class: com.p1.mobile.putong.data.AvatarFrame.2
        public Class getDataClass() {
            return AvatarFrame.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public AvatarFrame mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AvatarFrame) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AvatarFrame) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AvatarFrame new_() {
        AvatarFrame avatarFrame = new AvatarFrame();
        avatarFrame.nullCheck();
        return avatarFrame;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AvatarFrame m17729clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.resourceUrl;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.expireTime;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.resourceUrl == null) {
            this.resourceUrl = "";
        }
        if (this.expireTime == null) {
            this.expireTime = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
