package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class CardsIcons extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "cardsicons";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public LikedMeBottomIcon likedMeBottomIcon;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;
    public static ProtobufAdapter<CardsIcons> PROTOBUF_ADAPTER = new MessageNanoAdapter<CardsIcons>() { // from class: com.p1.mobile.putong.core.data.CardsIcons.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(CardsIcons cardsIcons) {
            String str = cardsIcons.userId;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            LikedMeBottomIcon likedMeBottomIcon = cardsIcons.likedMeBottomIcon;
            if (likedMeBottomIcon != null) {
                iO += CodedOutputByteBufferNano.l(2, likedMeBottomIcon, LikedMeBottomIcon.PROTOBUF_ADAPTER);
            }
            ((MessageNano) cardsIcons).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public CardsIcons m11923parse(nb5 nb5Var) throws IOException {
            CardsIcons cardsIcons = new CardsIcons();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (cardsIcons.userId == null) {
                        cardsIcons.userId = "";
                    }
                    if (cardsIcons.likedMeBottomIcon != null) {
                        break;
                    }
                    cardsIcons.likedMeBottomIcon = LikedMeBottomIcon.new_();
                    break;
                }
                if (iU == 10) {
                    cardsIcons.userId = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (cardsIcons.userId == null) {
                            cardsIcons.userId = "";
                        }
                        if (cardsIcons.likedMeBottomIcon != null) {
                            break;
                        }
                        cardsIcons.likedMeBottomIcon = LikedMeBottomIcon.new_();
                        return cardsIcons;
                    }
                    cardsIcons.likedMeBottomIcon = (LikedMeBottomIcon) nb5Var.l(LikedMeBottomIcon.PROTOBUF_ADAPTER);
                }
            }
            return cardsIcons;
        }

        public void serialize(CardsIcons cardsIcons, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = cardsIcons.userId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            LikedMeBottomIcon likedMeBottomIcon = cardsIcons.likedMeBottomIcon;
            if (likedMeBottomIcon != null) {
                codedOutputByteBufferNano.K(2, likedMeBottomIcon, LikedMeBottomIcon.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<CardsIcons> JSON_ADAPTER = new ObjectJsonAdapter<CardsIcons>() { // from class: com.p1.mobile.putong.core.data.CardsIcons.2
        public Class getDataClass() {
            return CardsIcons.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public CardsIcons m11924newInstance() {
            return new CardsIcons();
        }

        public boolean parseField(CardsIcons cardsIcons, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("likedMeBottomIcon")) {
                cardsIcons.likedMeBottomIcon = (LikedMeBottomIcon) LikedMeBottomIcon.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CardsIcons) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CardsIcons) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CardsIcons new_() {
        CardsIcons cardsIcons = new CardsIcons();
        cardsIcons.nullCheck();
        return cardsIcons;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public CardsIcons m11922clone() {
        CardsIcons cardsIcons = new CardsIcons();
        cardsIcons.userId = this.userId;
        LikedMeBottomIcon likedMeBottomIcon = this.likedMeBottomIcon;
        if (likedMeBottomIcon != null) {
            cardsIcons.likedMeBottomIcon = likedMeBottomIcon.m13882clone();
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
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        LikedMeBottomIcon likedMeBottomIcon = this.likedMeBottomIcon;
        int iHashCode2 = iHashCode + (likedMeBottomIcon != null ? likedMeBottomIcon.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.likedMeBottomIcon == null) {
            this.likedMeBottomIcon = LikedMeBottomIcon.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
