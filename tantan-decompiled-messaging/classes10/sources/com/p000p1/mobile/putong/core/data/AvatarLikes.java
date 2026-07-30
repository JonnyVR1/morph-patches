package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.AvatarsDetail;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class AvatarLikes extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "avatarlikes";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public List<AvatarsDetail> avatars;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public double createdTime;

    @NonNull
    @ProtobufIndex(index = 4)
    public String fakeOtherState;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;
    public static ProtobufAdapter<AvatarLikes> PROTOBUF_ADAPTER = new MessageNanoAdapter<AvatarLikes>() { // from class: com.p1.mobile.putong.core.data.AvatarLikes.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(AvatarLikes avatarLikes) {
            String str = avatarLikes.userId;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.d(2, avatarLikes.createdTime);
            List<AvatarsDetail> list = avatarLikes.avatars;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(3, list, AvatarsDetail.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str2 = avatarLikes.fakeOtherState;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(4, str2);
            }
            ((MessageNano) avatarLikes).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public AvatarLikes m11683parse(nb5 nb5Var) throws IOException {
            AvatarLikes avatarLikes = new AvatarLikes();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (avatarLikes.userId == null) {
                        avatarLikes.userId = "";
                    }
                    if (avatarLikes.avatars == null) {
                        avatarLikes.avatars = new ArrayList();
                    }
                    if (avatarLikes.fakeOtherState != null) {
                        break;
                    }
                    avatarLikes.fakeOtherState = "";
                    break;
                }
                if (iU == 10) {
                    avatarLikes.userId = nb5Var.s();
                } else if (iU == 17) {
                    avatarLikes.createdTime = nb5Var.h();
                } else if (iU == 26) {
                    avatarLikes.avatars = (List) nb5Var.l(AvatarsDetail.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 34) {
                        if (avatarLikes.userId == null) {
                            avatarLikes.userId = "";
                        }
                        if (avatarLikes.avatars == null) {
                            avatarLikes.avatars = new ArrayList();
                        }
                        if (avatarLikes.fakeOtherState != null) {
                            break;
                        }
                        avatarLikes.fakeOtherState = "";
                        return avatarLikes;
                    }
                    avatarLikes.fakeOtherState = nb5Var.s();
                }
            }
            return avatarLikes;
        }

        public void serialize(AvatarLikes avatarLikes, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = avatarLikes.userId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.C(2, avatarLikes.createdTime);
            List<AvatarsDetail> list = avatarLikes.avatars;
            if (list != null) {
                codedOutputByteBufferNano.K(3, list, AvatarsDetail.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str2 = avatarLikes.fakeOtherState;
            if (str2 != null) {
                codedOutputByteBufferNano.R(4, str2);
            }
        }
    };
    public static JsonAdapter<AvatarLikes> JSON_ADAPTER = new ObjectJsonAdapter<AvatarLikes>() { // from class: com.p1.mobile.putong.core.data.AvatarLikes.2
        public Class getDataClass() {
            return AvatarLikes.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public AvatarLikes m11684newInstance() {
            return new AvatarLikes();
        }

        public boolean parseField(AvatarLikes avatarLikes, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "fakeOtherState":
                    avatarLikes.fakeOtherState = jsonParser.getValueAsString();
                    return true;
                case "userId":
                    avatarLikes.userId = jsonParser.getValueAsString();
                    return true;
                case "avatars":
                    avatarLikes.avatars = JsonAdapter.parseArray(jsonParser, AvatarsDetail.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "createdTime":
                    avatarLikes.createdTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(AvatarLikes avatarLikes, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "fakeOtherState":
                case "userId":
                case "avatars":
                case "createdTime":
                    return true;
                default:
                    return super.parseFieldCheck(avatarLikes, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(AvatarLikes avatarLikes, JsonGenerator jsonGenerator) throws IOException {
            String str = avatarLikes.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            jsonGenerator.writeFieldName("createdTime");
            Converter.API_TIME.serialize(Double.valueOf(avatarLikes.createdTime), jsonGenerator, true);
            if (avatarLikes.avatars != null) {
                jsonGenerator.writeFieldName("avatars");
                JsonAdapter.serializeArray(avatarLikes.avatars, jsonGenerator, AvatarsDetail.JSON_ADAPTER);
            }
            String str2 = avatarLikes.fakeOtherState;
            if (str2 != null) {
                jsonGenerator.writeStringField("fakeOtherState", str2);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AvatarLikes) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AvatarLikes) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AvatarLikes new_() {
        AvatarLikes avatarLikes = new AvatarLikes();
        avatarLikes.nullCheck();
        return avatarLikes;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AvatarLikes m11682clone() {
        AvatarLikes avatarLikes = new AvatarLikes();
        avatarLikes.userId = this.userId;
        avatarLikes.createdTime = this.createdTime;
        List<AvatarsDetail> list = this.avatars;
        if (list != null) {
            avatarLikes.avatars = ValueObject.util_map(list, new w9j() { // from class: l.gm1
                public final Object call(Object obj) {
                    return ((AvatarsDetail) obj).m11690clone();
                }
            });
        }
        avatarLikes.fakeOtherState = this.fakeOtherState;
        return avatarLikes;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AvatarLikes)) {
            return false;
        }
        AvatarLikes avatarLikes = (AvatarLikes) obj;
        return ValueObject.util_equals(this.userId, avatarLikes.userId) && this.createdTime == avatarLikes.createdTime && ValueObject.util_equals(this.avatars, avatarLikes.avatars) && ValueObject.util_equals(this.fakeOtherState, avatarLikes.fakeOtherState);
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
        long jDoubleToLongBits = Double.doubleToLongBits(this.createdTime);
        int i3 = (((i2 + iHashCode) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41;
        List<AvatarsDetail> list = this.avatars;
        int iHashCode2 = (i3 + (list != null ? list.hashCode() : 0)) * 41;
        String str2 = this.fakeOtherState;
        int iHashCode3 = iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.avatars == null) {
            this.avatars = new ArrayList();
        }
        if (this.fakeOtherState == null) {
            this.fakeOtherState = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
