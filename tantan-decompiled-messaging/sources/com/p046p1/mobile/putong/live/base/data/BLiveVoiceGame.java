package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceGame;
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
public class BLiveVoiceGame extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "blivevoicegame";

    @ProtobufIndex(index = 6)
    public long agoraGameId;

    @NonNull
    @ProtobufIndex(index = 9)
    public String backgroundImage;

    @ProtobufIndex(index = 8)
    public int height;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f44497id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String providerRoundId;

    @NonNull
    @ProtobufIndex(index = 4)
    public String state;

    @NonNull
    @ProtobufIndex(index = 5)
    public String type;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<String> userIds;

    @ProtobufIndex(index = 7)
    public int width;
    public static ProtobufAdapter<BLiveVoiceGame> PROTOBUF_ADAPTER = new C12292a();
    public static JsonAdapter<BLiveVoiceGame> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceGame>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceGame.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceGame.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceGame newInstance() {
            return new BLiveVoiceGame();
        }

        public boolean parseField(BLiveVoiceGame bLiveVoiceGame, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "height":
                    bLiveVoiceGame.height = jsonParser.getValueAsInt();
                    return true;
                case "agoraGameId":
                    bLiveVoiceGame.agoraGameId = jsonParser.getValueAsLong();
                    return true;
                case "providerRoundId":
                    bLiveVoiceGame.providerRoundId = jsonParser.getValueAsString();
                    return true;
                case "userIds":
                    bLiveVoiceGame.userIds = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    bLiveVoiceGame.f44497id = jsonParser.getValueAsString();
                    return false;
                case "type":
                    bLiveVoiceGame.type = jsonParser.getValueAsString();
                    return true;
                case "state":
                    bLiveVoiceGame.state = jsonParser.getValueAsString();
                    return true;
                case "width":
                    bLiveVoiceGame.width = jsonParser.getValueAsInt();
                    return true;
                case "backgroundImage":
                    bLiveVoiceGame.backgroundImage = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceGame bLiveVoiceGame, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoiceGame.f44497id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = bLiveVoiceGame.providerRoundId;
            if (str2 != null) {
                jsonGenerator.writeStringField("providerRoundId", str2);
            }
            if (bLiveVoiceGame.userIds != null) {
                jsonGenerator.writeFieldName("userIds");
                JsonAdapter.serializeArray(bLiveVoiceGame.userIds, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str3 = bLiveVoiceGame.state;
            if (str3 != null) {
                jsonGenerator.writeStringField("state", str3);
            }
            String str4 = bLiveVoiceGame.type;
            if (str4 != null) {
                jsonGenerator.writeStringField("type", str4);
            }
            jsonGenerator.writeNumberField("agoraGameId", bLiveVoiceGame.agoraGameId);
            jsonGenerator.writeNumberField("width", bLiveVoiceGame.width);
            jsonGenerator.writeNumberField("height", bLiveVoiceGame.height);
            String str5 = bLiveVoiceGame.backgroundImage;
            if (str5 != null) {
                jsonGenerator.writeStringField("backgroundImage", str5);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceGame) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveVoiceGame$a */
    public class C12292a extends MessageNanoAdapter<BLiveVoiceGame> {
        public C12292a() {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int computeAndCacheSize(BLiveVoiceGame bLiveVoiceGame) {
            String str = bLiveVoiceGame.f44497id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = bLiveVoiceGame.providerRoundId;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            List<String> list = bLiveVoiceGame.userIds;
            if (list != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(3, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str3 = bLiveVoiceGame.state;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str3);
            }
            String str4 = bLiveVoiceGame.type;
            if (str4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(5, str4);
            }
            int iM17228j = iM17233o + CodedOutputByteBufferNano.m17228j(6, bLiveVoiceGame.agoraGameId) + CodedOutputByteBufferNano.m17226h(7, bLiveVoiceGame.width) + CodedOutputByteBufferNano.m17226h(8, bLiveVoiceGame.height);
            String str5 = bLiveVoiceGame.backgroundImage;
            if (str5 != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(9, str5);
            }
            bLiveVoiceGame.cachedSize = iM17228j;
            return iM17228j;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BLiveVoiceGame parse(nb5 nb5Var) throws IOException {
            BLiveVoiceGame bLiveVoiceGame = new BLiveVoiceGame();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (bLiveVoiceGame.f44497id == null) {
                        bLiveVoiceGame.f44497id = "";
                    }
                    if (bLiveVoiceGame.providerRoundId == null) {
                        bLiveVoiceGame.providerRoundId = "";
                    }
                    if (bLiveVoiceGame.userIds == null) {
                        bLiveVoiceGame.userIds = new ArrayList();
                    }
                    if (bLiveVoiceGame.state == null) {
                        bLiveVoiceGame.state = "";
                    }
                    if (bLiveVoiceGame.type == null) {
                        bLiveVoiceGame.type = "";
                    }
                    if (bLiveVoiceGame.backgroundImage != null) {
                        break;
                    }
                    bLiveVoiceGame.backgroundImage = "";
                    break;
                }
                if (iM158752u == 10) {
                    bLiveVoiceGame.f44497id = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    bLiveVoiceGame.providerRoundId = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    bLiveVoiceGame.userIds = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iM158752u == 34) {
                    bLiveVoiceGame.state = nb5Var.m158750s();
                } else if (iM158752u == 42) {
                    bLiveVoiceGame.type = nb5Var.m158750s();
                } else if (iM158752u == 48) {
                    bLiveVoiceGame.agoraGameId = nb5Var.m158742k();
                } else if (iM158752u == 56) {
                    bLiveVoiceGame.width = nb5Var.m158741j();
                } else if (iM158752u == 64) {
                    bLiveVoiceGame.height = nb5Var.m158741j();
                } else {
                    if (iM158752u != 74) {
                        if (bLiveVoiceGame.f44497id == null) {
                            bLiveVoiceGame.f44497id = "";
                        }
                        if (bLiveVoiceGame.providerRoundId == null) {
                            bLiveVoiceGame.providerRoundId = "";
                        }
                        if (bLiveVoiceGame.userIds == null) {
                            bLiveVoiceGame.userIds = new ArrayList();
                        }
                        if (bLiveVoiceGame.state == null) {
                            bLiveVoiceGame.state = "";
                        }
                        if (bLiveVoiceGame.type == null) {
                            bLiveVoiceGame.type = "";
                        }
                        if (bLiveVoiceGame.backgroundImage != null) {
                            break;
                        }
                        bLiveVoiceGame.backgroundImage = "";
                        return bLiveVoiceGame;
                    }
                    bLiveVoiceGame.backgroundImage = nb5Var.m158750s();
                }
            }
            return bLiveVoiceGame;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void serialize(BLiveVoiceGame bLiveVoiceGame, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = bLiveVoiceGame.f44497id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = bLiveVoiceGame.providerRoundId;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            List<String> list = bLiveVoiceGame.userIds;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(3, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str3 = bLiveVoiceGame.state;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(4, str3);
            }
            String str4 = bLiveVoiceGame.type;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(5, str4);
            }
            codedOutputByteBufferNano.m17252I(6, bLiveVoiceGame.agoraGameId);
            codedOutputByteBufferNano.m17250G(7, bLiveVoiceGame.width);
            codedOutputByteBufferNano.m17250G(8, bLiveVoiceGame.height);
            String str5 = bLiveVoiceGame.backgroundImage;
            if (str5 != null) {
                codedOutputByteBufferNano.m17261R(9, str5);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m68373a(String str) {
        return str;
    }

    public static BLiveVoiceGame new_() {
        BLiveVoiceGame bLiveVoiceGame = new BLiveVoiceGame();
        bLiveVoiceGame.nullCheck();
        return bLiveVoiceGame;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceGame mo223809clone() {
        BLiveVoiceGame bLiveVoiceGame = new BLiveVoiceGame();
        bLiveVoiceGame.f44497id = this.f44497id;
        bLiveVoiceGame.providerRoundId = this.providerRoundId;
        List<String> list = this.userIds;
        if (list != null) {
            bLiveVoiceGame.userIds = ValueObject.util_map(list, new w9j() { // from class: l.s82
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return BLiveVoiceGame.m68373a((String) obj);
                }
            });
        }
        bLiveVoiceGame.state = this.state;
        bLiveVoiceGame.type = this.type;
        bLiveVoiceGame.agoraGameId = this.agoraGameId;
        bLiveVoiceGame.width = this.width;
        bLiveVoiceGame.height = this.height;
        bLiveVoiceGame.backgroundImage = this.backgroundImage;
        return bLiveVoiceGame;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceGame)) {
            return false;
        }
        BLiveVoiceGame bLiveVoiceGame = (BLiveVoiceGame) obj;
        return ValueObject.util_equals(this.f44497id, bLiveVoiceGame.f44497id) && ValueObject.util_equals(this.providerRoundId, bLiveVoiceGame.providerRoundId) && ValueObject.util_equals(this.userIds, bLiveVoiceGame.userIds) && ValueObject.util_equals(this.state, bLiveVoiceGame.state) && ValueObject.util_equals(this.type, bLiveVoiceGame.type) && this.agoraGameId == bLiveVoiceGame.agoraGameId && this.width == bLiveVoiceGame.width && this.height == bLiveVoiceGame.height && ValueObject.util_equals(this.backgroundImage, bLiveVoiceGame.backgroundImage);
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
        String str = this.f44497id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.providerRoundId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<String> list = this.userIds;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 41;
        String str3 = this.state;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.type;
        int iHashCode5 = str4 != null ? str4.hashCode() : 0;
        long j = this.agoraGameId;
        int i3 = (((((((iHashCode4 + iHashCode5) * 41) + ((int) (j ^ (j >>> 32)))) * 41) + this.width) * 41) + this.height) * 41;
        String str5 = this.backgroundImage;
        int iHashCode6 = i3 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f44497id == null) {
            this.f44497id = "";
        }
        if (this.providerRoundId == null) {
            this.providerRoundId = "";
        }
        if (this.userIds == null) {
            this.userIds = new ArrayList();
        }
        if (this.state == null) {
            this.state = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.backgroundImage == null) {
            this.backgroundImage = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
