package com.p046p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.analytics.FirebaseAnalytics;
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
public class BLiveVoicePlayModeAnchorItem extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "blivevoiceplaymodeanchoritem";

    @NonNull
    @ProtobufIndex(index = 3)
    public String anchorAvatar;

    @NonNull
    @ProtobufIndex(index = 1)
    public String anchorId;

    @NonNull
    @ProtobufIndex(index = 2)
    public String anchorName;

    @NonNull
    @ProtobufIndex(index = 4)
    public String gender;

    @ProtobufIndex(index = 7)
    public long memberNum;

    @ProtobufIndex(index = 6)
    public long rank;

    @ProtobufIndex(index = 5)
    public long score;
    public static ProtobufAdapter<BLiveVoicePlayModeAnchorItem> PROTOBUF_ADAPTER = new C12350a();
    public static JsonAdapter<BLiveVoicePlayModeAnchorItem> JSON_ADAPTER = new ObjectJsonAdapter<BLiveVoicePlayModeAnchorItem>() { // from class: com.p1.mobile.putong.live.base.data.BLiveVoicePlayModeAnchorItem.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveVoicePlayModeAnchorItem.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveVoicePlayModeAnchorItem newInstance() {
            return new BLiveVoicePlayModeAnchorItem();
        }

        public boolean parseField(BLiveVoicePlayModeAnchorItem bLiveVoicePlayModeAnchorItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "anchorAvatar":
                    bLiveVoicePlayModeAnchorItem.anchorAvatar = jsonParser.getValueAsString();
                    return true;
                case "anchorName":
                    bLiveVoicePlayModeAnchorItem.anchorName = jsonParser.getValueAsString();
                    return true;
                case "gender":
                    bLiveVoicePlayModeAnchorItem.gender = jsonParser.getValueAsString();
                    return true;
                case "anchorId":
                    bLiveVoicePlayModeAnchorItem.anchorId = jsonParser.getValueAsString();
                    return true;
                case "rank":
                    bLiveVoicePlayModeAnchorItem.rank = jsonParser.getValueAsLong();
                    return true;
                case "score":
                    bLiveVoicePlayModeAnchorItem.score = jsonParser.getValueAsLong();
                    return true;
                case "memberNum":
                    bLiveVoicePlayModeAnchorItem.memberNum = jsonParser.getValueAsLong();
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveVoicePlayModeAnchorItem bLiveVoicePlayModeAnchorItem, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveVoicePlayModeAnchorItem.anchorId;
            if (str != null) {
                jsonGenerator.writeStringField("anchorId", str);
            }
            String str2 = bLiveVoicePlayModeAnchorItem.anchorName;
            if (str2 != null) {
                jsonGenerator.writeStringField("anchorName", str2);
            }
            String str3 = bLiveVoicePlayModeAnchorItem.anchorAvatar;
            if (str3 != null) {
                jsonGenerator.writeStringField("anchorAvatar", str3);
            }
            String str4 = bLiveVoicePlayModeAnchorItem.gender;
            if (str4 != null) {
                jsonGenerator.writeStringField("gender", str4);
            }
            jsonGenerator.writeNumberField(FirebaseAnalytics.Param.SCORE, bLiveVoicePlayModeAnchorItem.score);
            jsonGenerator.writeNumberField(BLivePkCategory.rank, bLiveVoicePlayModeAnchorItem.rank);
            jsonGenerator.writeNumberField("memberNum", bLiveVoicePlayModeAnchorItem.memberNum);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveVoicePlayModeAnchorItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveVoicePlayModeAnchorItem$a */
    public class C12350a extends MessageNanoAdapter<BLiveVoicePlayModeAnchorItem> {
        public C12350a() {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int computeAndCacheSize(BLiveVoicePlayModeAnchorItem bLiveVoicePlayModeAnchorItem) {
            String str = bLiveVoicePlayModeAnchorItem.anchorId;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = bLiveVoicePlayModeAnchorItem.anchorName;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = bLiveVoicePlayModeAnchorItem.anchorAvatar;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            String str4 = bLiveVoicePlayModeAnchorItem.gender;
            if (str4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str4);
            }
            int iM17228j = iM17233o + CodedOutputByteBufferNano.m17228j(5, bLiveVoicePlayModeAnchorItem.score) + CodedOutputByteBufferNano.m17228j(6, bLiveVoicePlayModeAnchorItem.rank) + CodedOutputByteBufferNano.m17228j(7, bLiveVoicePlayModeAnchorItem.memberNum);
            bLiveVoicePlayModeAnchorItem.cachedSize = iM17228j;
            return iM17228j;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BLiveVoicePlayModeAnchorItem parse(nb5 nb5Var) throws IOException {
            BLiveVoicePlayModeAnchorItem bLiveVoicePlayModeAnchorItem = new BLiveVoicePlayModeAnchorItem();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (bLiveVoicePlayModeAnchorItem.anchorId == null) {
                        bLiveVoicePlayModeAnchorItem.anchorId = "";
                    }
                    if (bLiveVoicePlayModeAnchorItem.anchorName == null) {
                        bLiveVoicePlayModeAnchorItem.anchorName = "";
                    }
                    if (bLiveVoicePlayModeAnchorItem.anchorAvatar == null) {
                        bLiveVoicePlayModeAnchorItem.anchorAvatar = "";
                    }
                    if (bLiveVoicePlayModeAnchorItem.gender != null) {
                        break;
                    }
                    bLiveVoicePlayModeAnchorItem.gender = "";
                    break;
                }
                if (iM158752u == 10) {
                    bLiveVoicePlayModeAnchorItem.anchorId = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    bLiveVoicePlayModeAnchorItem.anchorName = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    bLiveVoicePlayModeAnchorItem.anchorAvatar = nb5Var.m158750s();
                } else if (iM158752u == 34) {
                    bLiveVoicePlayModeAnchorItem.gender = nb5Var.m158750s();
                } else if (iM158752u == 40) {
                    bLiveVoicePlayModeAnchorItem.score = nb5Var.m158742k();
                } else if (iM158752u == 48) {
                    bLiveVoicePlayModeAnchorItem.rank = nb5Var.m158742k();
                } else {
                    if (iM158752u != 56) {
                        if (bLiveVoicePlayModeAnchorItem.anchorId == null) {
                            bLiveVoicePlayModeAnchorItem.anchorId = "";
                        }
                        if (bLiveVoicePlayModeAnchorItem.anchorName == null) {
                            bLiveVoicePlayModeAnchorItem.anchorName = "";
                        }
                        if (bLiveVoicePlayModeAnchorItem.anchorAvatar == null) {
                            bLiveVoicePlayModeAnchorItem.anchorAvatar = "";
                        }
                        if (bLiveVoicePlayModeAnchorItem.gender != null) {
                            break;
                        }
                        bLiveVoicePlayModeAnchorItem.gender = "";
                        return bLiveVoicePlayModeAnchorItem;
                    }
                    bLiveVoicePlayModeAnchorItem.memberNum = nb5Var.m158742k();
                }
            }
            return bLiveVoicePlayModeAnchorItem;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void serialize(BLiveVoicePlayModeAnchorItem bLiveVoicePlayModeAnchorItem, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = bLiveVoicePlayModeAnchorItem.anchorId;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = bLiveVoicePlayModeAnchorItem.anchorName;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = bLiveVoicePlayModeAnchorItem.anchorAvatar;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            String str4 = bLiveVoicePlayModeAnchorItem.gender;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(4, str4);
            }
            codedOutputByteBufferNano.m17252I(5, bLiveVoicePlayModeAnchorItem.score);
            codedOutputByteBufferNano.m17252I(6, bLiveVoicePlayModeAnchorItem.rank);
            codedOutputByteBufferNano.m17252I(7, bLiveVoicePlayModeAnchorItem.memberNum);
        }
    }

    public static BLiveVoicePlayModeAnchorItem new_() {
        BLiveVoicePlayModeAnchorItem bLiveVoicePlayModeAnchorItem = new BLiveVoicePlayModeAnchorItem();
        bLiveVoicePlayModeAnchorItem.nullCheck();
        return bLiveVoicePlayModeAnchorItem;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveVoicePlayModeAnchorItem mo223809clone() {
        BLiveVoicePlayModeAnchorItem bLiveVoicePlayModeAnchorItem = new BLiveVoicePlayModeAnchorItem();
        bLiveVoicePlayModeAnchorItem.anchorId = this.anchorId;
        bLiveVoicePlayModeAnchorItem.anchorName = this.anchorName;
        bLiveVoicePlayModeAnchorItem.anchorAvatar = this.anchorAvatar;
        bLiveVoicePlayModeAnchorItem.gender = this.gender;
        bLiveVoicePlayModeAnchorItem.score = this.score;
        bLiveVoicePlayModeAnchorItem.rank = this.rank;
        bLiveVoicePlayModeAnchorItem.memberNum = this.memberNum;
        return bLiveVoicePlayModeAnchorItem;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveVoicePlayModeAnchorItem)) {
            return false;
        }
        BLiveVoicePlayModeAnchorItem bLiveVoicePlayModeAnchorItem = (BLiveVoicePlayModeAnchorItem) obj;
        return ValueObject.util_equals(this.anchorId, bLiveVoicePlayModeAnchorItem.anchorId) && ValueObject.util_equals(this.anchorName, bLiveVoicePlayModeAnchorItem.anchorName) && ValueObject.util_equals(this.anchorAvatar, bLiveVoicePlayModeAnchorItem.anchorAvatar) && ValueObject.util_equals(this.gender, bLiveVoicePlayModeAnchorItem.gender) && this.score == bLiveVoicePlayModeAnchorItem.score && this.rank == bLiveVoicePlayModeAnchorItem.rank && this.memberNum == bLiveVoicePlayModeAnchorItem.memberNum;
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
        String str = this.anchorId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.anchorName;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.anchorAvatar;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.gender;
        int iHashCode4 = str4 != null ? str4.hashCode() : 0;
        long j = this.score;
        int i3 = (((iHashCode3 + iHashCode4) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.rank;
        int i4 = (i3 + ((int) (j2 ^ (j2 >>> 32)))) * 41;
        long j3 = this.memberNum;
        int i5 = i4 + ((int) (j3 ^ (j3 >>> 32)));
        this.hashCode = i5;
        return i5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.anchorId == null) {
            this.anchorId = "";
        }
        if (this.anchorName == null) {
            this.anchorName = "";
        }
        if (this.anchorAvatar == null) {
            this.anchorAvatar = "";
        }
        if (this.gender == null) {
            this.gender = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
