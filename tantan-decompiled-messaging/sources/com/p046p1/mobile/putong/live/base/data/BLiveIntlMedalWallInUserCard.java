package com.p046p1.mobile.putong.live.base.data;

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

/* JADX INFO: loaded from: classes13.dex */
public class BLiveIntlMedalWallInUserCard extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "bliveintlmedalwallinusercard";

    @ProtobufIndex(index = 4)
    public int amount;

    @NonNull
    @ProtobufIndex(index = 1)
    public String guildId;

    @NonNull
    @ProtobufIndex(index = 2)
    public String icon;

    @NonNull
    @ProtobufIndex(index = 3)
    public String title;
    public static ProtobufAdapter<BLiveIntlMedalWallInUserCard> PROTOBUF_ADAPTER = new C11778a();
    public static JsonAdapter<BLiveIntlMedalWallInUserCard> JSON_ADAPTER = new ObjectJsonAdapter<BLiveIntlMedalWallInUserCard>() { // from class: com.p1.mobile.putong.live.base.data.BLiveIntlMedalWallInUserCard.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveIntlMedalWallInUserCard.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveIntlMedalWallInUserCard newInstance() {
            return new BLiveIntlMedalWallInUserCard();
        }

        public boolean parseField(BLiveIntlMedalWallInUserCard bLiveIntlMedalWallInUserCard, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "amount":
                    bLiveIntlMedalWallInUserCard.amount = jsonParser.getValueAsInt();
                    return true;
                case "icon":
                    bLiveIntlMedalWallInUserCard.icon = jsonParser.getValueAsString();
                    return true;
                case "title":
                    bLiveIntlMedalWallInUserCard.title = jsonParser.getValueAsString();
                    return true;
                case "guildId":
                    bLiveIntlMedalWallInUserCard.guildId = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveIntlMedalWallInUserCard bLiveIntlMedalWallInUserCard, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveIntlMedalWallInUserCard.guildId;
            if (str != null) {
                jsonGenerator.writeStringField("guildId", str);
            }
            String str2 = bLiveIntlMedalWallInUserCard.icon;
            if (str2 != null) {
                jsonGenerator.writeStringField("icon", str2);
            }
            String str3 = bLiveIntlMedalWallInUserCard.title;
            if (str3 != null) {
                jsonGenerator.writeStringField("title", str3);
            }
            jsonGenerator.writeNumberField("amount", bLiveIntlMedalWallInUserCard.amount);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveIntlMedalWallInUserCard) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveIntlMedalWallInUserCard$a */
    public class C11778a extends MessageNanoAdapter<BLiveIntlMedalWallInUserCard> {
        public C11778a() {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int computeAndCacheSize(BLiveIntlMedalWallInUserCard bLiveIntlMedalWallInUserCard) {
            String str = bLiveIntlMedalWallInUserCard.guildId;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = bLiveIntlMedalWallInUserCard.icon;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = bLiveIntlMedalWallInUserCard.title;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            int iM17226h = iM17233o + CodedOutputByteBufferNano.m17226h(4, bLiveIntlMedalWallInUserCard.amount);
            bLiveIntlMedalWallInUserCard.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BLiveIntlMedalWallInUserCard parse(nb5 nb5Var) throws IOException {
            BLiveIntlMedalWallInUserCard bLiveIntlMedalWallInUserCard = new BLiveIntlMedalWallInUserCard();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (bLiveIntlMedalWallInUserCard.guildId == null) {
                        bLiveIntlMedalWallInUserCard.guildId = "";
                    }
                    if (bLiveIntlMedalWallInUserCard.icon == null) {
                        bLiveIntlMedalWallInUserCard.icon = "";
                    }
                    if (bLiveIntlMedalWallInUserCard.title != null) {
                        break;
                    }
                    bLiveIntlMedalWallInUserCard.title = "";
                    break;
                }
                if (iM158752u == 10) {
                    bLiveIntlMedalWallInUserCard.guildId = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    bLiveIntlMedalWallInUserCard.icon = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    bLiveIntlMedalWallInUserCard.title = nb5Var.m158750s();
                } else {
                    if (iM158752u != 32) {
                        if (bLiveIntlMedalWallInUserCard.guildId == null) {
                            bLiveIntlMedalWallInUserCard.guildId = "";
                        }
                        if (bLiveIntlMedalWallInUserCard.icon == null) {
                            bLiveIntlMedalWallInUserCard.icon = "";
                        }
                        if (bLiveIntlMedalWallInUserCard.title != null) {
                            break;
                        }
                        bLiveIntlMedalWallInUserCard.title = "";
                        return bLiveIntlMedalWallInUserCard;
                    }
                    bLiveIntlMedalWallInUserCard.amount = nb5Var.m158741j();
                }
            }
            return bLiveIntlMedalWallInUserCard;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void serialize(BLiveIntlMedalWallInUserCard bLiveIntlMedalWallInUserCard, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = bLiveIntlMedalWallInUserCard.guildId;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = bLiveIntlMedalWallInUserCard.icon;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = bLiveIntlMedalWallInUserCard.title;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            codedOutputByteBufferNano.m17250G(4, bLiveIntlMedalWallInUserCard.amount);
        }
    }

    public static BLiveIntlMedalWallInUserCard new_() {
        BLiveIntlMedalWallInUserCard bLiveIntlMedalWallInUserCard = new BLiveIntlMedalWallInUserCard();
        bLiveIntlMedalWallInUserCard.nullCheck();
        return bLiveIntlMedalWallInUserCard;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveIntlMedalWallInUserCard mo223809clone() {
        BLiveIntlMedalWallInUserCard bLiveIntlMedalWallInUserCard = new BLiveIntlMedalWallInUserCard();
        bLiveIntlMedalWallInUserCard.guildId = this.guildId;
        bLiveIntlMedalWallInUserCard.icon = this.icon;
        bLiveIntlMedalWallInUserCard.title = this.title;
        bLiveIntlMedalWallInUserCard.amount = this.amount;
        return bLiveIntlMedalWallInUserCard;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveIntlMedalWallInUserCard)) {
            return false;
        }
        BLiveIntlMedalWallInUserCard bLiveIntlMedalWallInUserCard = (BLiveIntlMedalWallInUserCard) obj;
        return ValueObject.util_equals(this.guildId, bLiveIntlMedalWallInUserCard.guildId) && ValueObject.util_equals(this.icon, bLiveIntlMedalWallInUserCard.icon) && ValueObject.util_equals(this.title, bLiveIntlMedalWallInUserCard.title) && this.amount == bLiveIntlMedalWallInUserCard.amount;
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
        String str = this.guildId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.icon;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.title;
        int iHashCode3 = ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41) + this.amount;
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.guildId == null) {
            this.guildId = "";
        }
        if (this.icon == null) {
            this.icon = "";
        }
        if (this.title == null) {
            this.title = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
