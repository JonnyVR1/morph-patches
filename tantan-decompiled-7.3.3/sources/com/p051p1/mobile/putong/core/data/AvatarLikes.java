package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.AvatarsDetail;
import com.p051p1.mobile.putong.data.Converter;
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
import java.util.List;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes10.dex */
public class AvatarLikes extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "avatarlikes";

    @NonNull
    @ProtobufIndex(index = 3)
    public List<AvatarsDetail> avatars;

    @ProtobufIndex(index = 2)
    public double createdTime;

    @NonNull
    @ProtobufIndex(index = 4)
    public String fakeOtherState;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;
    public static ProtobufAdapter<AvatarLikes> PROTOBUF_ADAPTER = new MessageNanoAdapter<AvatarLikes>() { // from class: com.p1.mobile.putong.core.data.AvatarLikes.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(AvatarLikes avatarLikes) {
            String str = avatarLikes.userId;
            int iM17288o = (str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0) + CodedOutputByteBufferNano.m17277d(2, avatarLikes.createdTime);
            List<AvatarsDetail> list = avatarLikes.avatars;
            if (list != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(3, list, AvatarsDetail.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str2 = avatarLikes.fakeOtherState;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str2);
            }
            avatarLikes.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AvatarLikes parse(nc5 nc5Var) throws IOException {
            AvatarLikes avatarLikes = new AvatarLikes();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
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
                if (iM162497u == 10) {
                    avatarLikes.userId = nc5Var.m162495s();
                } else if (iM162497u == 17) {
                    avatarLikes.createdTime = nc5Var.m162484h();
                } else if (iM162497u == 26) {
                    avatarLikes.avatars = (List) nc5Var.m162488l(AvatarsDetail.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM162497u != 34) {
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
                    avatarLikes.fakeOtherState = nc5Var.m162495s();
                }
            }
            return avatarLikes;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AvatarLikes avatarLikes, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = avatarLikes.userId;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            codedOutputByteBufferNano.m17301C(2, avatarLikes.createdTime);
            List<AvatarsDetail> list = avatarLikes.avatars;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(3, list, AvatarsDetail.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str2 = avatarLikes.fakeOtherState;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(4, str2);
            }
        }
    };
    public static JsonAdapter<AvatarLikes> JSON_ADAPTER = new ObjectJsonAdapter<AvatarLikes>() { // from class: com.p1.mobile.putong.core.data.AvatarLikes.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AvatarLikes.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public AvatarLikes newInstance() {
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
                    avatarLikes.createdTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AvatarLikes) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AvatarLikes) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AvatarLikes new_() {
        AvatarLikes avatarLikes = new AvatarLikes();
        avatarLikes.nullCheck();
        return avatarLikes;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public AvatarLikes mo225055clone() {
        AvatarLikes avatarLikes = new AvatarLikes();
        avatarLikes.userId = this.userId;
        avatarLikes.createdTime = this.createdTime;
        List<AvatarsDetail> list = this.avatars;
        if (list != null) {
            avatarLikes.avatars = ValueObject.util_map(list, new qcj() { // from class: l.nm1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((AvatarsDetail) obj).mo225055clone();
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
        String str = this.userId;
        int iHashCode = str != null ? str.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.createdTime);
        int i3 = (((i2 + iHashCode) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41;
        List<AvatarsDetail> list = this.avatars;
        int iHashCode2 = (i3 + (list != null ? list.hashCode() : 0)) * 41;
        String str2 = this.fakeOtherState;
        int iHashCode3 = iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
