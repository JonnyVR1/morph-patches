package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.User;
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
import p153l.l6o0;
import p153l.nc5;
import p153l.nsv;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveVoiceAuctionLeaderboard extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "blivevoiceauctionleaderboard";

    @ProtobufIndex(index = 4)
    public long amount;

    @NonNull
    @ProtobufIndex(index = 2)
    public String auctionId;
    public boolean isFromLongLink;

    @ProtobufIndex(index = 1)
    public long rank;
    public nsv<User> user;

    @NonNull
    @ProtobufIndex(index = 3)
    public String userId;

    @NonNull
    @ProtobufIndex(index = 6)
    public String voiceLiveId;

    @NonNull
    @ProtobufIndex(index = 5)
    public String voiceRoomId;
    public static ProtobufAdapter<BLiveVoiceAuctionLeaderboard> PROTOBUF_ADAPTER = new C12409a();
    public static JsonAdapter<BLiveVoiceAuctionLeaderboard> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoiceAuctionLeaderboard>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoiceAuctionLeaderboard.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoiceAuctionLeaderboard.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoiceAuctionLeaderboard newInstance() {
            return new BLiveVoiceAuctionLeaderboard();
        }

        public boolean parseField(BLiveVoiceAuctionLeaderboard bLiveVoiceAuctionLeaderboard, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "amount":
                    bLiveVoiceAuctionLeaderboard.amount = jsonParser.getValueAsLong();
                    return true;
                case "userId":
                    bLiveVoiceAuctionLeaderboard.userId = jsonParser.getValueAsString();
                    return true;
                case "auctionId":
                    bLiveVoiceAuctionLeaderboard.auctionId = jsonParser.getValueAsString();
                    return true;
                case "voiceLiveId":
                    bLiveVoiceAuctionLeaderboard.voiceLiveId = jsonParser.getValueAsString();
                    return true;
                case "voiceRoomId":
                    bLiveVoiceAuctionLeaderboard.voiceRoomId = jsonParser.getValueAsString();
                    return true;
                case "rank":
                    bLiveVoiceAuctionLeaderboard.rank = jsonParser.getValueAsLong();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(BLiveVoiceAuctionLeaderboard bLiveVoiceAuctionLeaderboard, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "amount":
                case "userId":
                case "auctionId":
                case "voiceLiveId":
                case "voiceRoomId":
                case "rank":
                    return true;
                default:
                    return super.parseFieldCheck(bLiveVoiceAuctionLeaderboard, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoiceAuctionLeaderboard bLiveVoiceAuctionLeaderboard, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField(BLivePkCategory.rank, bLiveVoiceAuctionLeaderboard.rank);
            String str = bLiveVoiceAuctionLeaderboard.auctionId;
            if (str != null) {
                jsonGenerator.writeStringField("auctionId", str);
            }
            String str2 = bLiveVoiceAuctionLeaderboard.userId;
            if (str2 != null) {
                jsonGenerator.writeStringField("userId", str2);
            }
            jsonGenerator.writeNumberField("amount", bLiveVoiceAuctionLeaderboard.amount);
            String str3 = bLiveVoiceAuctionLeaderboard.voiceRoomId;
            if (str3 != null) {
                jsonGenerator.writeStringField("voiceRoomId", str3);
            }
            String str4 = bLiveVoiceAuctionLeaderboard.voiceLiveId;
            if (str4 != null) {
                jsonGenerator.writeStringField("voiceLiveId", str4);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((BLiveVoiceAuctionLeaderboard) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoiceAuctionLeaderboard) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveVoiceAuctionLeaderboard$a */
    public class C12409a extends MessageNanoAdapter<BLiveVoiceAuctionLeaderboard> {
        public C12409a() {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int computeAndCacheSize(BLiveVoiceAuctionLeaderboard bLiveVoiceAuctionLeaderboard) {
            int iM17283j = CodedOutputByteBufferNano.m17283j(1, bLiveVoiceAuctionLeaderboard.rank);
            String str = bLiveVoiceAuctionLeaderboard.auctionId;
            if (str != null) {
                iM17283j += CodedOutputByteBufferNano.m17288o(2, str);
            }
            String str2 = bLiveVoiceAuctionLeaderboard.userId;
            if (str2 != null) {
                iM17283j += CodedOutputByteBufferNano.m17288o(3, str2);
            }
            int iM17283j2 = iM17283j + CodedOutputByteBufferNano.m17283j(4, bLiveVoiceAuctionLeaderboard.amount);
            String str3 = bLiveVoiceAuctionLeaderboard.voiceRoomId;
            if (str3 != null) {
                iM17283j2 += CodedOutputByteBufferNano.m17288o(5, str3);
            }
            String str4 = bLiveVoiceAuctionLeaderboard.voiceLiveId;
            if (str4 != null) {
                iM17283j2 += CodedOutputByteBufferNano.m17288o(6, str4);
            }
            bLiveVoiceAuctionLeaderboard.cachedSize = iM17283j2;
            return iM17283j2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BLiveVoiceAuctionLeaderboard parse(nc5 nc5Var) throws IOException {
            BLiveVoiceAuctionLeaderboard bLiveVoiceAuctionLeaderboard = new BLiveVoiceAuctionLeaderboard();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (bLiveVoiceAuctionLeaderboard.auctionId == null) {
                        bLiveVoiceAuctionLeaderboard.auctionId = "";
                    }
                    if (bLiveVoiceAuctionLeaderboard.userId == null) {
                        bLiveVoiceAuctionLeaderboard.userId = "";
                    }
                    if (bLiveVoiceAuctionLeaderboard.voiceRoomId == null) {
                        bLiveVoiceAuctionLeaderboard.voiceRoomId = "";
                    }
                    if (bLiveVoiceAuctionLeaderboard.voiceLiveId != null) {
                        break;
                    }
                    bLiveVoiceAuctionLeaderboard.voiceLiveId = "";
                    break;
                }
                if (iM162497u == 8) {
                    bLiveVoiceAuctionLeaderboard.rank = nc5Var.m162487k();
                } else if (iM162497u == 18) {
                    bLiveVoiceAuctionLeaderboard.auctionId = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    bLiveVoiceAuctionLeaderboard.userId = nc5Var.m162495s();
                } else if (iM162497u == 32) {
                    bLiveVoiceAuctionLeaderboard.amount = nc5Var.m162487k();
                } else if (iM162497u == 42) {
                    bLiveVoiceAuctionLeaderboard.voiceRoomId = nc5Var.m162495s();
                } else {
                    if (iM162497u != 50) {
                        if (bLiveVoiceAuctionLeaderboard.auctionId == null) {
                            bLiveVoiceAuctionLeaderboard.auctionId = "";
                        }
                        if (bLiveVoiceAuctionLeaderboard.userId == null) {
                            bLiveVoiceAuctionLeaderboard.userId = "";
                        }
                        if (bLiveVoiceAuctionLeaderboard.voiceRoomId == null) {
                            bLiveVoiceAuctionLeaderboard.voiceRoomId = "";
                        }
                        if (bLiveVoiceAuctionLeaderboard.voiceLiveId != null) {
                            break;
                        }
                        bLiveVoiceAuctionLeaderboard.voiceLiveId = "";
                        return bLiveVoiceAuctionLeaderboard;
                    }
                    bLiveVoiceAuctionLeaderboard.voiceLiveId = nc5Var.m162495s();
                }
            }
            return bLiveVoiceAuctionLeaderboard;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void serialize(BLiveVoiceAuctionLeaderboard bLiveVoiceAuctionLeaderboard, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17307I(1, bLiveVoiceAuctionLeaderboard.rank);
            String str = bLiveVoiceAuctionLeaderboard.auctionId;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(2, str);
            }
            String str2 = bLiveVoiceAuctionLeaderboard.userId;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(3, str2);
            }
            codedOutputByteBufferNano.m17307I(4, bLiveVoiceAuctionLeaderboard.amount);
            String str3 = bLiveVoiceAuctionLeaderboard.voiceRoomId;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(5, str3);
            }
            String str4 = bLiveVoiceAuctionLeaderboard.voiceLiveId;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(6, str4);
            }
        }
    }

    public static BLiveVoiceAuctionLeaderboard new_() {
        BLiveVoiceAuctionLeaderboard bLiveVoiceAuctionLeaderboard = new BLiveVoiceAuctionLeaderboard();
        bLiveVoiceAuctionLeaderboard.nullCheck();
        return bLiveVoiceAuctionLeaderboard;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoiceAuctionLeaderboard mo225055clone() {
        BLiveVoiceAuctionLeaderboard bLiveVoiceAuctionLeaderboard = new BLiveVoiceAuctionLeaderboard();
        bLiveVoiceAuctionLeaderboard.rank = this.rank;
        bLiveVoiceAuctionLeaderboard.auctionId = this.auctionId;
        bLiveVoiceAuctionLeaderboard.userId = this.userId;
        bLiveVoiceAuctionLeaderboard.amount = this.amount;
        bLiveVoiceAuctionLeaderboard.voiceRoomId = this.voiceRoomId;
        bLiveVoiceAuctionLeaderboard.voiceLiveId = this.voiceLiveId;
        return bLiveVoiceAuctionLeaderboard;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoiceAuctionLeaderboard)) {
            return false;
        }
        BLiveVoiceAuctionLeaderboard bLiveVoiceAuctionLeaderboard = (BLiveVoiceAuctionLeaderboard) obj;
        return this.rank == bLiveVoiceAuctionLeaderboard.rank && ValueObject.util_equals(this.auctionId, bLiveVoiceAuctionLeaderboard.auctionId) && ValueObject.util_equals(this.userId, bLiveVoiceAuctionLeaderboard.userId) && this.amount == bLiveVoiceAuctionLeaderboard.amount && ValueObject.util_equals(this.voiceRoomId, bLiveVoiceAuctionLeaderboard.voiceRoomId) && ValueObject.util_equals(this.voiceLiveId, bLiveVoiceAuctionLeaderboard.voiceLiveId);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public String getUserImageUrl() {
        return ((l6o0) this.user.m164642g()).f130275b.avatar;
    }

    public String getUserName() {
        boolean z = this.isFromLongLink;
        nsv<User> nsvVar = this.user;
        return z ? ((l6o0) nsvVar.m164642g()).f130275b.name : nsvVar.f143542a.name;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        long j = this.rank;
        int i2 = ((i * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        String str = this.auctionId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.userId;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        long j2 = this.amount;
        int i3 = (((iHashCode + iHashCode2) * 41) + ((int) (j2 ^ (j2 >>> 32)))) * 41;
        String str3 = this.voiceRoomId;
        int iHashCode3 = (i3 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.voiceLiveId;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.auctionId == null) {
            this.auctionId = "";
        }
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.voiceRoomId == null) {
            this.voiceRoomId = "";
        }
        if (this.voiceLiveId == null) {
            this.voiceLiveId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
