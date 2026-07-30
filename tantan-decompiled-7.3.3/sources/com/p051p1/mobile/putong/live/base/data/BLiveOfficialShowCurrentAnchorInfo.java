package com.p051p1.mobile.putong.live.base.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
import p153l.nc5;

/* JADX INFO: loaded from: classes13.dex */
public class BLiveOfficialShowCurrentAnchorInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "bliveofficialshowcurrentanchorinfo";

    @NonNull
    @ProtobufIndex(index = 4)
    public String anchorAvatar;

    @NonNull
    @ProtobufIndex(index = 1)
    public String anchorId;

    @NonNull
    @ProtobufIndex(index = 2)
    public String anchorLiveId;

    @NonNull
    @ProtobufIndex(index = 6)
    public String anchorName;

    @NonNull
    @ProtobufIndex(index = 3)
    public String anchorRoomId;

    @NonNull
    @ProtobufIndex(index = 5)
    public String programId;

    @NonNull
    @ProtobufIndex(index = 7)
    public String showId;

    @NonNull
    @ProtobufIndex(index = 8)
    public BLiveState state;
    public static ProtobufAdapter<BLiveOfficialShowCurrentAnchorInfo> PROTOBUF_ADAPTER = new C12047a();
    public static JsonAdapter<BLiveOfficialShowCurrentAnchorInfo> JSON_ADAPTER = new ObjectJsonAdapter<BLiveOfficialShowCurrentAnchorInfo>() { // from class: com.p1.mobile.putong.live.base.data.BLiveOfficialShowCurrentAnchorInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveOfficialShowCurrentAnchorInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveOfficialShowCurrentAnchorInfo newInstance() {
            return new BLiveOfficialShowCurrentAnchorInfo();
        }

        public boolean parseField(BLiveOfficialShowCurrentAnchorInfo bLiveOfficialShowCurrentAnchorInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "anchorAvatar":
                    bLiveOfficialShowCurrentAnchorInfo.anchorAvatar = jsonParser.getValueAsString();
                    return true;
                case "anchorName":
                    bLiveOfficialShowCurrentAnchorInfo.anchorName = jsonParser.getValueAsString();
                    return true;
                case "anchorLiveId":
                    bLiveOfficialShowCurrentAnchorInfo.anchorLiveId = jsonParser.getValueAsString();
                    return true;
                case "anchorRoomId":
                    bLiveOfficialShowCurrentAnchorInfo.anchorRoomId = jsonParser.getValueAsString();
                    return true;
                case "anchorId":
                    bLiveOfficialShowCurrentAnchorInfo.anchorId = jsonParser.getValueAsString();
                    return true;
                case "programId":
                    bLiveOfficialShowCurrentAnchorInfo.programId = jsonParser.getValueAsString();
                    return true;
                case "showId":
                    bLiveOfficialShowCurrentAnchorInfo.showId = jsonParser.getValueAsString();
                    return true;
                case "state":
                    bLiveOfficialShowCurrentAnchorInfo.state = BLiveState.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveOfficialShowCurrentAnchorInfo bLiveOfficialShowCurrentAnchorInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveOfficialShowCurrentAnchorInfo.showId;
            if (str != null) {
                jsonGenerator.writeStringField("showId", str);
            }
            String str2 = bLiveOfficialShowCurrentAnchorInfo.anchorId;
            if (str2 != null) {
                jsonGenerator.writeStringField("anchorId", str2);
            }
            String str3 = bLiveOfficialShowCurrentAnchorInfo.anchorLiveId;
            if (str3 != null) {
                jsonGenerator.writeStringField("anchorLiveId", str3);
            }
            String str4 = bLiveOfficialShowCurrentAnchorInfo.anchorRoomId;
            if (str4 != null) {
                jsonGenerator.writeStringField("anchorRoomId", str4);
            }
            String str5 = bLiveOfficialShowCurrentAnchorInfo.anchorAvatar;
            if (str5 != null) {
                jsonGenerator.writeStringField("anchorAvatar", str5);
            }
            String str6 = bLiveOfficialShowCurrentAnchorInfo.anchorName;
            if (str6 != null) {
                jsonGenerator.writeStringField("anchorName", str6);
            }
            String str7 = bLiveOfficialShowCurrentAnchorInfo.programId;
            if (str7 != null) {
                jsonGenerator.writeStringField("programId", str7);
            }
            if (bLiveOfficialShowCurrentAnchorInfo.state != null) {
                jsonGenerator.writeFieldName("state");
                BLiveState.JSON_ADAPTER.serialize(bLiveOfficialShowCurrentAnchorInfo.state, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveOfficialShowCurrentAnchorInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.data.BLiveOfficialShowCurrentAnchorInfo$a */
    public class C12047a extends MessageNanoAdapter<BLiveOfficialShowCurrentAnchorInfo> {
        public C12047a() {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int computeAndCacheSize(BLiveOfficialShowCurrentAnchorInfo bLiveOfficialShowCurrentAnchorInfo) {
            String str = bLiveOfficialShowCurrentAnchorInfo.anchorId;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = bLiveOfficialShowCurrentAnchorInfo.anchorLiveId;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = bLiveOfficialShowCurrentAnchorInfo.anchorRoomId;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            String str4 = bLiveOfficialShowCurrentAnchorInfo.anchorAvatar;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str4);
            }
            String str5 = bLiveOfficialShowCurrentAnchorInfo.programId;
            if (str5 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(5, str5);
            }
            String str6 = bLiveOfficialShowCurrentAnchorInfo.anchorName;
            if (str6 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(6, str6);
            }
            String str7 = bLiveOfficialShowCurrentAnchorInfo.showId;
            if (str7 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(7, str7);
            }
            BLiveState bLiveState = bLiveOfficialShowCurrentAnchorInfo.state;
            if (bLiveState != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(8, bLiveState, BLiveState.PROTOBUF_ADAPTER);
            }
            bLiveOfficialShowCurrentAnchorInfo.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BLiveOfficialShowCurrentAnchorInfo parse(nc5 nc5Var) throws IOException {
            BLiveOfficialShowCurrentAnchorInfo bLiveOfficialShowCurrentAnchorInfo = new BLiveOfficialShowCurrentAnchorInfo();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (bLiveOfficialShowCurrentAnchorInfo.showId == null) {
                        bLiveOfficialShowCurrentAnchorInfo.showId = "";
                    }
                    if (bLiveOfficialShowCurrentAnchorInfo.anchorId == null) {
                        bLiveOfficialShowCurrentAnchorInfo.anchorId = "";
                    }
                    if (bLiveOfficialShowCurrentAnchorInfo.anchorLiveId == null) {
                        bLiveOfficialShowCurrentAnchorInfo.anchorLiveId = "";
                    }
                    if (bLiveOfficialShowCurrentAnchorInfo.anchorRoomId == null) {
                        bLiveOfficialShowCurrentAnchorInfo.anchorRoomId = "";
                    }
                    if (bLiveOfficialShowCurrentAnchorInfo.anchorAvatar == null) {
                        bLiveOfficialShowCurrentAnchorInfo.anchorAvatar = "";
                    }
                    if (bLiveOfficialShowCurrentAnchorInfo.anchorName == null) {
                        bLiveOfficialShowCurrentAnchorInfo.anchorName = "";
                    }
                    if (bLiveOfficialShowCurrentAnchorInfo.programId == null) {
                        bLiveOfficialShowCurrentAnchorInfo.programId = "";
                    }
                    if (bLiveOfficialShowCurrentAnchorInfo.state != null) {
                        break;
                    }
                    bLiveOfficialShowCurrentAnchorInfo.state = (BLiveState) BLiveState.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iM162497u == 10) {
                    bLiveOfficialShowCurrentAnchorInfo.anchorId = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    bLiveOfficialShowCurrentAnchorInfo.anchorLiveId = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    bLiveOfficialShowCurrentAnchorInfo.anchorRoomId = nc5Var.m162495s();
                } else if (iM162497u == 34) {
                    bLiveOfficialShowCurrentAnchorInfo.anchorAvatar = nc5Var.m162495s();
                } else if (iM162497u == 42) {
                    bLiveOfficialShowCurrentAnchorInfo.programId = nc5Var.m162495s();
                } else if (iM162497u == 50) {
                    bLiveOfficialShowCurrentAnchorInfo.anchorName = nc5Var.m162495s();
                } else if (iM162497u == 58) {
                    bLiveOfficialShowCurrentAnchorInfo.showId = nc5Var.m162495s();
                } else {
                    if (iM162497u != 66) {
                        if (bLiveOfficialShowCurrentAnchorInfo.showId == null) {
                            bLiveOfficialShowCurrentAnchorInfo.showId = "";
                        }
                        if (bLiveOfficialShowCurrentAnchorInfo.anchorId == null) {
                            bLiveOfficialShowCurrentAnchorInfo.anchorId = "";
                        }
                        if (bLiveOfficialShowCurrentAnchorInfo.anchorLiveId == null) {
                            bLiveOfficialShowCurrentAnchorInfo.anchorLiveId = "";
                        }
                        if (bLiveOfficialShowCurrentAnchorInfo.anchorRoomId == null) {
                            bLiveOfficialShowCurrentAnchorInfo.anchorRoomId = "";
                        }
                        if (bLiveOfficialShowCurrentAnchorInfo.anchorAvatar == null) {
                            bLiveOfficialShowCurrentAnchorInfo.anchorAvatar = "";
                        }
                        if (bLiveOfficialShowCurrentAnchorInfo.anchorName == null) {
                            bLiveOfficialShowCurrentAnchorInfo.anchorName = "";
                        }
                        if (bLiveOfficialShowCurrentAnchorInfo.programId == null) {
                            bLiveOfficialShowCurrentAnchorInfo.programId = "";
                        }
                        if (bLiveOfficialShowCurrentAnchorInfo.state != null) {
                            break;
                        }
                        bLiveOfficialShowCurrentAnchorInfo.state = (BLiveState) BLiveState.JSON_ADAPTER.defaultEnum();
                        return bLiveOfficialShowCurrentAnchorInfo;
                    }
                    bLiveOfficialShowCurrentAnchorInfo.state = (BLiveState) nc5Var.m162488l(BLiveState.PROTOBUF_ADAPTER);
                }
            }
            return bLiveOfficialShowCurrentAnchorInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void serialize(BLiveOfficialShowCurrentAnchorInfo bLiveOfficialShowCurrentAnchorInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = bLiveOfficialShowCurrentAnchorInfo.anchorId;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = bLiveOfficialShowCurrentAnchorInfo.anchorLiveId;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = bLiveOfficialShowCurrentAnchorInfo.anchorRoomId;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            String str4 = bLiveOfficialShowCurrentAnchorInfo.anchorAvatar;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(4, str4);
            }
            String str5 = bLiveOfficialShowCurrentAnchorInfo.programId;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(5, str5);
            }
            String str6 = bLiveOfficialShowCurrentAnchorInfo.anchorName;
            if (str6 != null) {
                codedOutputByteBufferNano.m17316R(6, str6);
            }
            String str7 = bLiveOfficialShowCurrentAnchorInfo.showId;
            if (str7 != null) {
                codedOutputByteBufferNano.m17316R(7, str7);
            }
            BLiveState bLiveState = bLiveOfficialShowCurrentAnchorInfo.state;
            if (bLiveState != null) {
                codedOutputByteBufferNano.m17309K(8, bLiveState, BLiveState.PROTOBUF_ADAPTER);
            }
        }
    }

    public static BLiveOfficialShowCurrentAnchorInfo new_() {
        BLiveOfficialShowCurrentAnchorInfo bLiveOfficialShowCurrentAnchorInfo = new BLiveOfficialShowCurrentAnchorInfo();
        bLiveOfficialShowCurrentAnchorInfo.nullCheck();
        return bLiveOfficialShowCurrentAnchorInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveOfficialShowCurrentAnchorInfo mo225055clone() {
        BLiveOfficialShowCurrentAnchorInfo bLiveOfficialShowCurrentAnchorInfo = new BLiveOfficialShowCurrentAnchorInfo();
        bLiveOfficialShowCurrentAnchorInfo.showId = this.showId;
        bLiveOfficialShowCurrentAnchorInfo.anchorId = this.anchorId;
        bLiveOfficialShowCurrentAnchorInfo.anchorLiveId = this.anchorLiveId;
        bLiveOfficialShowCurrentAnchorInfo.anchorRoomId = this.anchorRoomId;
        bLiveOfficialShowCurrentAnchorInfo.anchorAvatar = this.anchorAvatar;
        bLiveOfficialShowCurrentAnchorInfo.anchorName = this.anchorName;
        bLiveOfficialShowCurrentAnchorInfo.programId = this.programId;
        bLiveOfficialShowCurrentAnchorInfo.state = this.state;
        return bLiveOfficialShowCurrentAnchorInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveOfficialShowCurrentAnchorInfo)) {
            return false;
        }
        BLiveOfficialShowCurrentAnchorInfo bLiveOfficialShowCurrentAnchorInfo = (BLiveOfficialShowCurrentAnchorInfo) obj;
        return ValueObject.util_equals(this.showId, bLiveOfficialShowCurrentAnchorInfo.showId) && ValueObject.util_equals(this.anchorId, bLiveOfficialShowCurrentAnchorInfo.anchorId) && ValueObject.util_equals(this.anchorLiveId, bLiveOfficialShowCurrentAnchorInfo.anchorLiveId) && ValueObject.util_equals(this.anchorRoomId, bLiveOfficialShowCurrentAnchorInfo.anchorRoomId) && ValueObject.util_equals(this.anchorAvatar, bLiveOfficialShowCurrentAnchorInfo.anchorAvatar) && ValueObject.util_equals(this.anchorName, bLiveOfficialShowCurrentAnchorInfo.anchorName) && ValueObject.util_equals(this.programId, bLiveOfficialShowCurrentAnchorInfo.programId) && ValueObject.util_equals(this.state, bLiveOfficialShowCurrentAnchorInfo.state);
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
        String str = this.showId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.anchorId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.anchorLiveId;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.anchorRoomId;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.anchorAvatar;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.anchorName;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.programId;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 41;
        BLiveState bLiveState = this.state;
        int iHashCode8 = iHashCode7 + (bLiveState != null ? bLiveState.hashCode() : 0);
        this.hashCode = iHashCode8;
        return iHashCode8;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.showId == null) {
            this.showId = "";
        }
        if (this.anchorId == null) {
            this.anchorId = "";
        }
        if (this.anchorLiveId == null) {
            this.anchorLiveId = "";
        }
        if (this.anchorRoomId == null) {
            this.anchorRoomId = "";
        }
        if (this.anchorAvatar == null) {
            this.anchorAvatar = "";
        }
        if (this.anchorName == null) {
            this.anchorName = "";
        }
        if (this.programId == null) {
            this.programId = "";
        }
        if (this.state == null) {
            this.state = (BLiveState) BLiveState.JSON_ADAPTER.defaultEnum();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
