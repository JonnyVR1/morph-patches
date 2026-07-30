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
public class CardsIcons extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "cardsicons";

    @NonNull
    @ProtobufIndex(index = 2)
    public LikedMeBottomIcon likedMeBottomIcon;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;
    public static ProtobufAdapter<CardsIcons> PROTOBUF_ADAPTER = new MessageNanoAdapter<CardsIcons>() { // from class: com.p1.mobile.putong.core.data.CardsIcons.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CardsIcons cardsIcons) {
            String str = cardsIcons.userId;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            LikedMeBottomIcon likedMeBottomIcon = cardsIcons.likedMeBottomIcon;
            if (likedMeBottomIcon != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(2, likedMeBottomIcon, LikedMeBottomIcon.PROTOBUF_ADAPTER);
            }
            cardsIcons.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CardsIcons parse(nb5 nb5Var) throws IOException {
            CardsIcons cardsIcons = new CardsIcons();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (cardsIcons.userId == null) {
                        cardsIcons.userId = "";
                    }
                    if (cardsIcons.likedMeBottomIcon != null) {
                        break;
                    }
                    cardsIcons.likedMeBottomIcon = LikedMeBottomIcon.new_();
                    break;
                }
                if (iM158752u == 10) {
                    cardsIcons.userId = nb5Var.m158750s();
                } else {
                    if (iM158752u != 18) {
                        if (cardsIcons.userId == null) {
                            cardsIcons.userId = "";
                        }
                        if (cardsIcons.likedMeBottomIcon != null) {
                            break;
                        }
                        cardsIcons.likedMeBottomIcon = LikedMeBottomIcon.new_();
                        return cardsIcons;
                    }
                    cardsIcons.likedMeBottomIcon = (LikedMeBottomIcon) nb5Var.m158743l(LikedMeBottomIcon.PROTOBUF_ADAPTER);
                }
            }
            return cardsIcons;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CardsIcons cardsIcons, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = cardsIcons.userId;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            LikedMeBottomIcon likedMeBottomIcon = cardsIcons.likedMeBottomIcon;
            if (likedMeBottomIcon != null) {
                codedOutputByteBufferNano.m17254K(2, likedMeBottomIcon, LikedMeBottomIcon.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<CardsIcons> JSON_ADAPTER = new ObjectJsonAdapter<CardsIcons>() { // from class: com.p1.mobile.putong.core.data.CardsIcons.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CardsIcons.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CardsIcons newInstance() {
            return new CardsIcons();
        }

        public boolean parseField(CardsIcons cardsIcons, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("likedMeBottomIcon")) {
                cardsIcons.likedMeBottomIcon = LikedMeBottomIcon.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("userId")) {
                return false;
            }
            cardsIcons.userId = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(CardsIcons cardsIcons, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("likedMeBottomIcon") || str.equals("userId")) {
                return true;
            }
            return super.parseFieldCheck(cardsIcons, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CardsIcons cardsIcons, JsonGenerator jsonGenerator) throws IOException {
            String str = cardsIcons.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            if (cardsIcons.likedMeBottomIcon != null) {
                jsonGenerator.writeFieldName("likedMeBottomIcon");
                LikedMeBottomIcon.JSON_ADAPTER.serialize(cardsIcons.likedMeBottomIcon, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CardsIcons) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CardsIcons) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CardsIcons new_() {
        CardsIcons cardsIcons = new CardsIcons();
        cardsIcons.nullCheck();
        return cardsIcons;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CardsIcons mo223809clone() {
        CardsIcons cardsIcons = new CardsIcons();
        cardsIcons.userId = this.userId;
        LikedMeBottomIcon likedMeBottomIcon = this.likedMeBottomIcon;
        if (likedMeBottomIcon != null) {
            cardsIcons.likedMeBottomIcon = likedMeBottomIcon.mo223809clone();
        }
        return cardsIcons;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CardsIcons)) {
            return false;
        }
        CardsIcons cardsIcons = (CardsIcons) obj;
        return ValueObject.util_equals(this.userId, cardsIcons.userId) && ValueObject.util_equals(this.likedMeBottomIcon, cardsIcons.likedMeBottomIcon);
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
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        LikedMeBottomIcon likedMeBottomIcon = this.likedMeBottomIcon;
        int iHashCode2 = iHashCode + (likedMeBottomIcon != null ? likedMeBottomIcon.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.likedMeBottomIcon == null) {
            this.likedMeBottomIcon = LikedMeBottomIcon.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
