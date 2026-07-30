package com.p000p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.OMSTemplateModeType;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class VoiceLiveMomentFeed extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "voicelivemomentfeed";

    @ProtobufIndex(index = 6)
    public long feedTime;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f712id;

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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(VoiceLiveMomentFeed voiceLiveMomentFeed) {
            String str = voiceLiveMomentFeed.f712id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = voiceLiveMomentFeed.liveId;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = voiceLiveMomentFeed.roomId;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = voiceLiveMomentFeed.userId;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            String str5 = voiceLiveMomentFeed.image;
            if (str5 != null) {
                iO += CodedOutputByteBufferNano.o(5, str5);
            }
            int iJ = iO + CodedOutputByteBufferNano.j(6, voiceLiveMomentFeed.feedTime);
            ((MessageNano) voiceLiveMomentFeed).cachedSize = iJ;
            return iJ;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public VoiceLiveMomentFeed m19825parse(nb5 nb5Var) throws IOException {
            VoiceLiveMomentFeed voiceLiveMomentFeed = new VoiceLiveMomentFeed();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (voiceLiveMomentFeed.f712id == null) {
                        voiceLiveMomentFeed.f712id = "";
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
                if (iU == 10) {
                    voiceLiveMomentFeed.f712id = nb5Var.s();
                } else if (iU == 18) {
                    voiceLiveMomentFeed.liveId = nb5Var.s();
                } else if (iU == 26) {
                    voiceLiveMomentFeed.roomId = nb5Var.s();
                } else if (iU == 34) {
                    voiceLiveMomentFeed.userId = nb5Var.s();
                } else if (iU == 42) {
                    voiceLiveMomentFeed.image = nb5Var.s();
                } else {
                    if (iU != 48) {
                        if (voiceLiveMomentFeed.f712id == null) {
                            voiceLiveMomentFeed.f712id = "";
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
                    voiceLiveMomentFeed.feedTime = nb5Var.k();
                }
            }
            return voiceLiveMomentFeed;
        }

        public void serialize(VoiceLiveMomentFeed voiceLiveMomentFeed, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = voiceLiveMomentFeed.f712id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = voiceLiveMomentFeed.liveId;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = voiceLiveMomentFeed.roomId;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = voiceLiveMomentFeed.userId;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
            String str5 = voiceLiveMomentFeed.image;
            if (str5 != null) {
                codedOutputByteBufferNano.R(5, str5);
            }
            codedOutputByteBufferNano.I(6, voiceLiveMomentFeed.feedTime);
        }
    };
    public static JsonAdapter<VoiceLiveMomentFeed> JSON_ADAPTER = new ObjectJsonAdapter<VoiceLiveMomentFeed>() { // from class: com.p1.mobile.putong.feed.data.VoiceLiveMomentFeed.2
        public Class getDataClass() {
            return VoiceLiveMomentFeed.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public VoiceLiveMomentFeed mo17830newInstance() {
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
                    voiceLiveMomentFeed.f712id = jsonParser.getValueAsString();
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(VoiceLiveMomentFeed voiceLiveMomentFeed, JsonGenerator jsonGenerator) throws IOException {
            String str = voiceLiveMomentFeed.f712id;
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
                jsonGenerator.writeStringField(OMSTemplateModeType.image, str5);
            }
            jsonGenerator.writeNumberField("feedTime", voiceLiveMomentFeed.feedTime);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VoiceLiveMomentFeed) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VoiceLiveMomentFeed) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static VoiceLiveMomentFeed new_() {
        VoiceLiveMomentFeed voiceLiveMomentFeed = new VoiceLiveMomentFeed();
        voiceLiveMomentFeed.nullCheck();
        return voiceLiveMomentFeed;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public VoiceLiveMomentFeed m19824clone() {
        VoiceLiveMomentFeed voiceLiveMomentFeed = new VoiceLiveMomentFeed();
        voiceLiveMomentFeed.f712id = this.f712id;
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
        return ValueObject.util_equals(this.f712id, voiceLiveMomentFeed.f712id) && ValueObject.util_equals(this.liveId, voiceLiveMomentFeed.liveId) && ValueObject.util_equals(this.roomId, voiceLiveMomentFeed.roomId) && ValueObject.util_equals(this.userId, voiceLiveMomentFeed.userId) && ValueObject.util_equals(this.image, voiceLiveMomentFeed.image) && this.feedTime == voiceLiveMomentFeed.feedTime;
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
        String str = this.f712id;
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
        ((ValueObject) this).hashCode = i3;
        return i3;
    }

    public void nullCheck() {
        if (this.f712id == null) {
            this.f712id = "";
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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
