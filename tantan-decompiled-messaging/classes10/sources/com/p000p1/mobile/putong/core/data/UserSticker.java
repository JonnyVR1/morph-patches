package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.UserSticker;
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
public class UserSticker extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "usersticker";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public List<String> favoriteStickers;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f188id;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public double updatedTime;
    public static ProtobufAdapter<UserSticker> PROTOBUF_ADAPTER = new MessageNanoAdapter<UserSticker>() { // from class: com.p1.mobile.putong.core.data.UserSticker.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(UserSticker userSticker) {
            String str = userSticker.f188id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            List<String> list = userSticker.favoriteStickers;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            int iD = iO + CodedOutputByteBufferNano.d(3, userSticker.updatedTime);
            ((MessageNano) userSticker).cachedSize = iD;
            return iD;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public UserSticker m16176parse(nb5 nb5Var) throws IOException {
            UserSticker userSticker = new UserSticker();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (userSticker.f188id == null) {
                        userSticker.f188id = "";
                    }
                    if (userSticker.favoriteStickers != null) {
                        break;
                    }
                    userSticker.favoriteStickers = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    userSticker.f188id = nb5Var.s();
                } else if (iU == 18) {
                    userSticker.favoriteStickers = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 25) {
                        if (userSticker.f188id == null) {
                            userSticker.f188id = "";
                        }
                        if (userSticker.favoriteStickers != null) {
                            break;
                        }
                        userSticker.favoriteStickers = new ArrayList();
                        return userSticker;
                    }
                    userSticker.updatedTime = nb5Var.h();
                }
            }
            return userSticker;
        }

        public void serialize(UserSticker userSticker, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = userSticker.f188id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            List<String> list = userSticker.favoriteStickers;
            if (list != null) {
                codedOutputByteBufferNano.K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.C(3, userSticker.updatedTime);
        }
    };
    public static JsonAdapter<UserSticker> JSON_ADAPTER = new ObjectJsonAdapter<UserSticker>() { // from class: com.p1.mobile.putong.core.data.UserSticker.2
        public Class getDataClass() {
            return UserSticker.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public UserSticker m16177newInstance() {
            return new UserSticker();
        }

        public boolean parseField(UserSticker userSticker, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "favoriteStickers":
                    userSticker.favoriteStickers = JsonAdapter.parseArray(jsonParser, Converter.STICKER_ID, str2, arrayList, dataChecker);
                    return true;
                case "updatedTime":
                    userSticker.updatedTime = ((Double) Converter.API_TIME.parse(jsonParser, str2)).doubleValue();
                    return true;
                case "id":
                    userSticker.f188id = jsonParser.getValueAsString();
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

        public void serializeFields(UserSticker userSticker, JsonGenerator jsonGenerator) throws IOException {
            String str = userSticker.f188id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (userSticker.favoriteStickers != null) {
                jsonGenerator.writeFieldName("favoriteStickers");
                JsonAdapter.serializeArray(userSticker.favoriteStickers, jsonGenerator, Converter.STICKER_ID);
            }
            jsonGenerator.writeFieldName("updatedTime");
            Converter.API_TIME.serialize(Double.valueOf(userSticker.updatedTime), jsonGenerator, true);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((UserSticker) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((UserSticker) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m696a(String str) {
        return str;
    }

    public static UserSticker new_() {
        UserSticker userSticker = new UserSticker();
        userSticker.nullCheck();
        return userSticker;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public UserSticker m16175clone() {
        UserSticker userSticker = new UserSticker();
        userSticker.f188id = this.f188id;
        List<String> list = this.favoriteStickers;
        if (list != null) {
            userSticker.favoriteStickers = ValueObject.util_map(list, new w9j() { // from class: l.g9k0
                public final Object call(Object obj) {
                    return UserSticker.m696a((String) obj);
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
        return ValueObject.util_equals(this.f188id, userSticker.f188id) && ValueObject.util_equals(this.favoriteStickers, userSticker.favoriteStickers) && this.updatedTime == userSticker.updatedTime;
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
        String str = this.f188id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<String> list = this.favoriteStickers;
        int iHashCode2 = list != null ? list.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.updatedTime);
        int i3 = ((iHashCode + iHashCode2) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        ((ValueObject) this).hashCode = i3;
        return i3;
    }

    public void nullCheck() {
        if (this.f188id == null) {
            this.f188id = "";
        }
        if (this.favoriteStickers == null) {
            this.favoriteStickers = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
