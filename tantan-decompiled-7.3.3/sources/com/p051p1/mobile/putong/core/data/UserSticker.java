package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.UserSticker;
import com.p051p1.mobile.putong.data.Converter;
import com.p051p1.mobile.putong.data.LocationInvisibleField;
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
public class UserSticker extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "usersticker";

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> favoriteStickers;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f21268id;

    @ProtobufIndex(index = 3)
    public double updatedTime;
    public static ProtobufAdapter<UserSticker> PROTOBUF_ADAPTER = new MessageNanoAdapter<UserSticker>() { // from class: com.p1.mobile.putong.core.data.UserSticker.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(UserSticker userSticker) {
            String str = userSticker.f21268id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            List<String> list = userSticker.favoriteStickers;
            if (list != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            int iM17277d = iM17288o + CodedOutputByteBufferNano.m17277d(3, userSticker.updatedTime);
            userSticker.cachedSize = iM17277d;
            return iM17277d;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public UserSticker parse(nc5 nc5Var) throws IOException {
            UserSticker userSticker = new UserSticker();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (userSticker.f21268id == null) {
                        userSticker.f21268id = "";
                    }
                    if (userSticker.favoriteStickers != null) {
                        break;
                    }
                    userSticker.favoriteStickers = new ArrayList();
                    break;
                }
                if (iM162497u == 10) {
                    userSticker.f21268id = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    userSticker.favoriteStickers = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM162497u != 25) {
                        if (userSticker.f21268id == null) {
                            userSticker.f21268id = "";
                        }
                        if (userSticker.favoriteStickers != null) {
                            break;
                        }
                        userSticker.favoriteStickers = new ArrayList();
                        return userSticker;
                    }
                    userSticker.updatedTime = nc5Var.m162484h();
                }
            }
            return userSticker;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(UserSticker userSticker, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = userSticker.f21268id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            List<String> list = userSticker.favoriteStickers;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17301C(3, userSticker.updatedTime);
        }
    };
    public static JsonAdapter<UserSticker> JSON_ADAPTER = new ObjectJsonAdapter<UserSticker>() { // from class: com.p1.mobile.putong.core.data.UserSticker.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return UserSticker.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public UserSticker newInstance() {
            return new UserSticker();
        }

        public boolean parseField(UserSticker userSticker, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "favoriteStickers":
                    userSticker.favoriteStickers = JsonAdapter.parseArray(jsonParser, Converter.STICKER_ID, str2, arrayList, dataChecker);
                    return true;
                case "updatedTime":
                    userSticker.updatedTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case "id":
                    userSticker.f21268id = jsonParser.getValueAsString();
                    return false;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(UserSticker userSticker, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "favoriteStickers":
                case "updatedTime":
                    return true;
                case "id":
                    return false;
                default:
                    return super.parseFieldCheck(userSticker, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(UserSticker userSticker, JsonGenerator jsonGenerator) throws IOException {
            String str = userSticker.f21268id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (userSticker.favoriteStickers != null) {
                jsonGenerator.writeFieldName("favoriteStickers");
                JsonAdapter.serializeArray(userSticker.favoriteStickers, jsonGenerator, Converter.STICKER_ID);
            }
            jsonGenerator.writeFieldName(LocationInvisibleField.updatedTime);
            Converter.API_TIME.serialize(Double.valueOf(userSticker.updatedTime), jsonGenerator, true);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserSticker) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserSticker) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m36897a(String str) {
        return str;
    }

    public static UserSticker new_() {
        UserSticker userSticker = new UserSticker();
        userSticker.nullCheck();
        return userSticker;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public UserSticker mo225055clone() {
        UserSticker userSticker = new UserSticker();
        userSticker.f21268id = this.f21268id;
        List<String> list = this.favoriteStickers;
        if (list != null) {
            userSticker.favoriteStickers = ValueObject.util_map(list, new qcj() { // from class: l.mik0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return UserSticker.m36897a((String) obj);
                }
            });
        }
        userSticker.updatedTime = this.updatedTime;
        return userSticker;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UserSticker)) {
            return false;
        }
        UserSticker userSticker = (UserSticker) obj;
        return ValueObject.util_equals(this.f21268id, userSticker.f21268id) && ValueObject.util_equals(this.favoriteStickers, userSticker.favoriteStickers) && this.updatedTime == userSticker.updatedTime;
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
        String str = this.f21268id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<String> list = this.favoriteStickers;
        int iHashCode2 = list != null ? list.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.updatedTime);
        int i3 = ((iHashCode + iHashCode2) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f21268id == null) {
            this.f21268id = "";
        }
        if (this.favoriteStickers == null) {
            this.favoriteStickers = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
