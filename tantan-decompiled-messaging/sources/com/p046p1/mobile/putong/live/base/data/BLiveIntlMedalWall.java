package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveIntlMedalWallItem;
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
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveIntlMedalWall extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "bliveintlmedalwall";

    @ProtobufIndex(index = 2)
    public int haveMedalNum;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<BLiveIntlMedalWallItem> haveMedals;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<BLiveIntlMedalWallItem> haveNotMedals;

    @ProtobufIndex(index = 1)
    public int medalSum;

    @NonNull
    @ProtobufIndex(index = 6)
    public String userAvatar;

    @NonNull
    @ProtobufIndex(index = 5)
    public String userId;
    public static ProtobufAdapter<BLiveIntlMedalWall> PROTOBUF_ADAPTER = new C11776a();
    public static JsonAdapter<BLiveIntlMedalWall> JSON_ADAPTER = new ObjectJsonAdapter<BLiveIntlMedalWall>() { // from class: com.p1.mobile.putong.live.base.data.BLiveIntlMedalWall.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveIntlMedalWall.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveIntlMedalWall newInstance() {
            return new BLiveIntlMedalWall();
        }

        public boolean parseField(BLiveIntlMedalWall bLiveIntlMedalWall, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "haveNotMedals":
                    bLiveIntlMedalWall.haveNotMedals = JsonAdapter.parseArray(jsonParser, BLiveIntlMedalWallItem.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "haveMedals":
                    bLiveIntlMedalWall.haveMedals = JsonAdapter.parseArray(jsonParser, BLiveIntlMedalWallItem.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "medalSum":
                    bLiveIntlMedalWall.medalSum = jsonParser.getValueAsInt();
                    return true;
                case "userId":
                    bLiveIntlMedalWall.userId = jsonParser.getValueAsString();
                    return true;
                case "userAvatar":
                    bLiveIntlMedalWall.userAvatar = jsonParser.getValueAsString();
                    return true;
                case "haveMedalNum":
                    bLiveIntlMedalWall.haveMedalNum = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveIntlMedalWall bLiveIntlMedalWall, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveIntlMedalWall.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            String str2 = bLiveIntlMedalWall.userAvatar;
            if (str2 != null) {
                jsonGenerator.writeStringField("userAvatar", str2);
            }
            jsonGenerator.writeNumberField("medalSum", bLiveIntlMedalWall.medalSum);
            jsonGenerator.writeNumberField("haveMedalNum", bLiveIntlMedalWall.haveMedalNum);
            if (bLiveIntlMedalWall.haveMedals != null) {
                jsonGenerator.writeFieldName("haveMedals");
                JsonAdapter.serializeArray(bLiveIntlMedalWall.haveMedals, jsonGenerator, BLiveIntlMedalWallItem.JSON_ADAPTER);
            }
            if (bLiveIntlMedalWall.haveNotMedals != null) {
                jsonGenerator.writeFieldName("haveNotMedals");
                JsonAdapter.serializeArray(bLiveIntlMedalWall.haveNotMedals, jsonGenerator, BLiveIntlMedalWallItem.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveIntlMedalWall) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveIntlMedalWall$a */
    public class C11776a extends MessageNanoAdapter<BLiveIntlMedalWall> {
        public C11776a() {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int computeAndCacheSize(BLiveIntlMedalWall bLiveIntlMedalWall) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, bLiveIntlMedalWall.medalSum) + CodedOutputByteBufferNano.m17226h(2, bLiveIntlMedalWall.haveMedalNum);
            List<BLiveIntlMedalWallItem> list = bLiveIntlMedalWall.haveMedals;
            if (list != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(3, list, BLiveIntlMedalWallItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<BLiveIntlMedalWallItem> list2 = bLiveIntlMedalWall.haveNotMedals;
            if (list2 != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(4, list2, BLiveIntlMedalWallItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str = bLiveIntlMedalWall.userId;
            if (str != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(5, str);
            }
            String str2 = bLiveIntlMedalWall.userAvatar;
            if (str2 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(6, str2);
            }
            bLiveIntlMedalWall.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BLiveIntlMedalWall parse(nb5 nb5Var) throws IOException {
            BLiveIntlMedalWall bLiveIntlMedalWall = new BLiveIntlMedalWall();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (bLiveIntlMedalWall.userId == null) {
                        bLiveIntlMedalWall.userId = "";
                    }
                    if (bLiveIntlMedalWall.userAvatar == null) {
                        bLiveIntlMedalWall.userAvatar = "";
                    }
                    if (bLiveIntlMedalWall.haveMedals == null) {
                        bLiveIntlMedalWall.haveMedals = new ArrayList();
                    }
                    if (bLiveIntlMedalWall.haveNotMedals != null) {
                        break;
                    }
                    bLiveIntlMedalWall.haveNotMedals = new ArrayList();
                    break;
                }
                if (iM158752u == 8) {
                    bLiveIntlMedalWall.medalSum = nb5Var.m158741j();
                } else if (iM158752u == 16) {
                    bLiveIntlMedalWall.haveMedalNum = nb5Var.m158741j();
                } else if (iM158752u == 26) {
                    bLiveIntlMedalWall.haveMedals = (List) nb5Var.m158743l(BLiveIntlMedalWallItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iM158752u == 34) {
                    bLiveIntlMedalWall.haveNotMedals = (List) nb5Var.m158743l(BLiveIntlMedalWallItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iM158752u == 42) {
                    bLiveIntlMedalWall.userId = nb5Var.m158750s();
                } else {
                    if (iM158752u != 50) {
                        if (bLiveIntlMedalWall.userId == null) {
                            bLiveIntlMedalWall.userId = "";
                        }
                        if (bLiveIntlMedalWall.userAvatar == null) {
                            bLiveIntlMedalWall.userAvatar = "";
                        }
                        if (bLiveIntlMedalWall.haveMedals == null) {
                            bLiveIntlMedalWall.haveMedals = new ArrayList();
                        }
                        if (bLiveIntlMedalWall.haveNotMedals != null) {
                            break;
                        }
                        bLiveIntlMedalWall.haveNotMedals = new ArrayList();
                        return bLiveIntlMedalWall;
                    }
                    bLiveIntlMedalWall.userAvatar = nb5Var.m158750s();
                }
            }
            return bLiveIntlMedalWall;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void serialize(BLiveIntlMedalWall bLiveIntlMedalWall, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, bLiveIntlMedalWall.medalSum);
            codedOutputByteBufferNano.m17250G(2, bLiveIntlMedalWall.haveMedalNum);
            List<BLiveIntlMedalWallItem> list = bLiveIntlMedalWall.haveMedals;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(3, list, BLiveIntlMedalWallItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<BLiveIntlMedalWallItem> list2 = bLiveIntlMedalWall.haveNotMedals;
            if (list2 != null) {
                codedOutputByteBufferNano.m17254K(4, list2, BLiveIntlMedalWallItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str = bLiveIntlMedalWall.userId;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(5, str);
            }
            String str2 = bLiveIntlMedalWall.userAvatar;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(6, str2);
            }
        }
    }

    public static BLiveIntlMedalWall new_() {
        BLiveIntlMedalWall bLiveIntlMedalWall = new BLiveIntlMedalWall();
        bLiveIntlMedalWall.nullCheck();
        return bLiveIntlMedalWall;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveIntlMedalWall mo223809clone() {
        BLiveIntlMedalWall bLiveIntlMedalWall = new BLiveIntlMedalWall();
        bLiveIntlMedalWall.userId = this.userId;
        bLiveIntlMedalWall.userAvatar = this.userAvatar;
        bLiveIntlMedalWall.medalSum = this.medalSum;
        bLiveIntlMedalWall.haveMedalNum = this.haveMedalNum;
        List<BLiveIntlMedalWallItem> list = this.haveMedals;
        if (list != null) {
            bLiveIntlMedalWall.haveMedals = ValueObject.util_map(list, new w9j() { // from class: l.p12
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveIntlMedalWallItem) obj).mo223809clone();
                }
            });
        }
        List<BLiveIntlMedalWallItem> list2 = this.haveNotMedals;
        if (list2 != null) {
            bLiveIntlMedalWall.haveNotMedals = ValueObject.util_map(list2, new w9j() { // from class: l.q12
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((BLiveIntlMedalWallItem) obj).mo223809clone();
                }
            });
        }
        return bLiveIntlMedalWall;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveIntlMedalWall)) {
            return false;
        }
        BLiveIntlMedalWall bLiveIntlMedalWall = (BLiveIntlMedalWall) obj;
        return ValueObject.util_equals(this.userId, bLiveIntlMedalWall.userId) && ValueObject.util_equals(this.userAvatar, bLiveIntlMedalWall.userAvatar) && this.medalSum == bLiveIntlMedalWall.medalSum && this.haveMedalNum == bLiveIntlMedalWall.haveMedalNum && ValueObject.util_equals(this.haveMedals, bLiveIntlMedalWall.haveMedals) && ValueObject.util_equals(this.haveNotMedals, bLiveIntlMedalWall.haveNotMedals);
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
        String str2 = this.userAvatar;
        int iHashCode2 = (((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + this.medalSum) * 41) + this.haveMedalNum) * 41;
        List<BLiveIntlMedalWallItem> list = this.haveMedals;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 41;
        List<BLiveIntlMedalWallItem> list2 = this.haveNotMedals;
        int iHashCode4 = iHashCode3 + (list2 != null ? list2.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.userAvatar == null) {
            this.userAvatar = "";
        }
        if (this.haveMedals == null) {
            this.haveMedals = new ArrayList();
        }
        if (this.haveNotMedals == null) {
            this.haveNotMedals = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
