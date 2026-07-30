package com.p046p1.mobile.putong.feed.data;

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

/* JADX INFO: loaded from: classes12.dex */
public class VoiceLiveMomentFeed extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "voicelivemomentfeed";

    @ProtobufIndex(index = 6)
    public long feedTime;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f39251id;

    @NonNull
    @ProtobufIndex(index = 5)
    public String image;

    @NonNull
    @ProtobufIndex(index = 2)
    public String liveId;

    @NonNull
    @ProtobufIndex(index = 3)
    public String roomId;

    @NonNull
    @ProtobufIndex(index = 4)
    public String userId;
    public VoiceLive voiceLive;
    public static ProtobufAdapter<VoiceLiveMomentFeed> PROTOBUF_ADAPTER = new MessageNanoAdapter<VoiceLiveMomentFeed>() { // from class: com.p1.mobile.putong.feed.data.VoiceLiveMomentFeed.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(VoiceLiveMomentFeed voiceLiveMomentFeed) {
            String str = voiceLiveMomentFeed.f39251id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = voiceLiveMomentFeed.liveId;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = voiceLiveMomentFeed.roomId;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            String str4 = voiceLiveMomentFeed.userId;
            if (str4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str4);
            }
            String str5 = voiceLiveMomentFeed.image;
            if (str5 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(5, str5);
            }
            int iM17228j = iM17233o + CodedOutputByteBufferNano.m17228j(6, voiceLiveMomentFeed.feedTime);
            voiceLiveMomentFeed.cachedSize = iM17228j;
            return iM17228j;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public VoiceLiveMomentFeed parse(nb5 nb5Var) throws IOException {
            VoiceLiveMomentFeed voiceLiveMomentFeed = new VoiceLiveMomentFeed();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (voiceLiveMomentFeed.f39251id == null) {
                        voiceLiveMomentFeed.f39251id = "";
                    }
                    if (voiceLiveMomentFeed.liveId == null) {
                        voiceLiveMomentFeed.liveId = "";
                    }
                    if (voiceLiveMomentFeed.roomId == null) {
                        voiceLiveMomentFeed.roomId = "";
                    }
                    if (voiceLiveMomentFeed.userId == null) {
                        voiceLiveMomentFeed.userId = "";
                    }
                    if (voiceLiveMomentFeed.image != null) {
                        break;
                    }
                    voiceLiveMomentFeed.image = "";
                    break;
                }
                if (iM158752u == 10) {
                    voiceLiveMomentFeed.f39251id = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    voiceLiveMomentFeed.liveId = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    voiceLiveMomentFeed.roomId = nb5Var.m158750s();
                } else if (iM158752u == 34) {
                    voiceLiveMomentFeed.userId = nb5Var.m158750s();
                } else if (iM158752u == 42) {
                    voiceLiveMomentFeed.image = nb5Var.m158750s();
                } else {
                    if (iM158752u != 48) {
                        if (voiceLiveMomentFeed.f39251id == null) {
                            voiceLiveMomentFeed.f39251id = "";
                        }
                        if (voiceLiveMomentFeed.liveId == null) {
                            voiceLiveMomentFeed.liveId = "";
                        }
                        if (voiceLiveMomentFeed.roomId == null) {
                            voiceLiveMomentFeed.roomId = "";
                        }
                        if (voiceLiveMomentFeed.userId == null) {
                            voiceLiveMomentFeed.userId = "";
                        }
                        if (voiceLiveMomentFeed.image != null) {
                            break;
                        }
                        voiceLiveMomentFeed.image = "";
                        return voiceLiveMomentFeed;
                    }
                    voiceLiveMomentFeed.feedTime = nb5Var.m158742k();
                }
            }
            return voiceLiveMomentFeed;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(VoiceLiveMomentFeed voiceLiveMomentFeed, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = voiceLiveMomentFeed.f39251id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = voiceLiveMomentFeed.liveId;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = voiceLiveMomentFeed.roomId;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            String str4 = voiceLiveMomentFeed.userId;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(4, str4);
            }
            String str5 = voiceLiveMomentFeed.image;
            if (str5 != null) {
                codedOutputByteBufferNano.m17261R(5, str5);
            }
            codedOutputByteBufferNano.m17252I(6, voiceLiveMomentFeed.feedTime);
        }
    };
    public static JsonAdapter<VoiceLiveMomentFeed> JSON_ADAPTER = new ObjectJsonAdapter<VoiceLiveMomentFeed>() { // from class: com.p1.mobile.putong.feed.data.VoiceLiveMomentFeed.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return VoiceLiveMomentFeed.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public VoiceLiveMomentFeed newInstance() {
            return new VoiceLiveMomentFeed();
        }

        public boolean parseField(VoiceLiveMomentFeed voiceLiveMomentFeed, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "liveId":
                    voiceLiveMomentFeed.liveId = jsonParser.getValueAsString();
                    return true;
                case "roomId":
                    voiceLiveMomentFeed.roomId = jsonParser.getValueAsString();
                    return true;
                case "userId":
                    voiceLiveMomentFeed.userId = jsonParser.getValueAsString();
                    return true;
                case "feedTime":
                    voiceLiveMomentFeed.feedTime = jsonParser.getValueAsLong();
                    return true;
                case "id":
                    voiceLiveMomentFeed.f39251id = jsonParser.getValueAsString();
                    return false;
                case "image":
                    voiceLiveMomentFeed.image = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(VoiceLiveMomentFeed voiceLiveMomentFeed, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "liveId":
                case "roomId":
                case "userId":
                case "feedTime":
                    return true;
                case "id":
                    return false;
                case "image":
                    return true;
                default:
                    return super.parseFieldCheck(voiceLiveMomentFeed, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(VoiceLiveMomentFeed voiceLiveMomentFeed, JsonGenerator jsonGenerator) throws IOException {
            String str = voiceLiveMomentFeed.f39251id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = voiceLiveMomentFeed.liveId;
            if (str2 != null) {
                jsonGenerator.writeStringField("liveId", str2);
            }
            String str3 = voiceLiveMomentFeed.roomId;
            if (str3 != null) {
                jsonGenerator.writeStringField("roomId", str3);
            }
            String str4 = voiceLiveMomentFeed.userId;
            if (str4 != null) {
                jsonGenerator.writeStringField("userId", str4);
            }
            String str5 = voiceLiveMomentFeed.image;
            if (str5 != null) {
                jsonGenerator.writeStringField("image", str5);
            }
            jsonGenerator.writeNumberField("feedTime", voiceLiveMomentFeed.feedTime);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VoiceLiveMomentFeed) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VoiceLiveMomentFeed) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static VoiceLiveMomentFeed new_() {
        VoiceLiveMomentFeed voiceLiveMomentFeed = new VoiceLiveMomentFeed();
        voiceLiveMomentFeed.nullCheck();
        return voiceLiveMomentFeed;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public VoiceLiveMomentFeed mo223809clone() {
        VoiceLiveMomentFeed voiceLiveMomentFeed = new VoiceLiveMomentFeed();
        voiceLiveMomentFeed.f39251id = this.f39251id;
        voiceLiveMomentFeed.liveId = this.liveId;
        voiceLiveMomentFeed.roomId = this.roomId;
        voiceLiveMomentFeed.userId = this.userId;
        voiceLiveMomentFeed.image = this.image;
        voiceLiveMomentFeed.feedTime = this.feedTime;
        return voiceLiveMomentFeed;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VoiceLiveMomentFeed)) {
            return false;
        }
        VoiceLiveMomentFeed voiceLiveMomentFeed = (VoiceLiveMomentFeed) obj;
        return ValueObject.util_equals(this.f39251id, voiceLiveMomentFeed.f39251id) && ValueObject.util_equals(this.liveId, voiceLiveMomentFeed.liveId) && ValueObject.util_equals(this.roomId, voiceLiveMomentFeed.roomId) && ValueObject.util_equals(this.userId, voiceLiveMomentFeed.userId) && ValueObject.util_equals(this.image, voiceLiveMomentFeed.image) && this.feedTime == voiceLiveMomentFeed.feedTime;
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
        String str = this.f39251id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.liveId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.roomId;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.userId;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.image;
        int iHashCode5 = str5 != null ? str5.hashCode() : 0;
        long j = this.feedTime;
        int i3 = ((iHashCode4 + iHashCode5) * 41) + ((int) (j ^ (j >>> 32)));
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f39251id == null) {
            this.f39251id = "";
        }
        if (this.liveId == null) {
            this.liveId = "";
        }
        if (this.roomId == null) {
            this.roomId = "";
        }
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.image == null) {
            this.image = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
