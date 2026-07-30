package com.p046p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.Emotion;
import com.p046p1.mobile.putong.data.TextTheme;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.feed.data.VoiceLiveStates;
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

/* JADX INFO: loaded from: classes12.dex */
public class VoiceLiveStates extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "voicelivestates";

    @Nullable
    @ProtobufIndex(index = 7)
    public Emotion emotion;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f39252id;

    @NonNull
    @ProtobufIndex(index = 6)
    public TextTheme textTheme;

    @NonNull
    @ProtobufIndex(index = 4)
    public String topicId;

    @NonNull
    @ProtobufIndex(index = 5)
    public String topicName;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<String> userAvatars;

    @NonNull
    @ProtobufIndex(index = 2)
    public String userId;
    public static ProtobufAdapter<VoiceLiveStates> PROTOBUF_ADAPTER = new MessageNanoAdapter<VoiceLiveStates>() { // from class: com.p1.mobile.putong.feed.data.VoiceLiveStates.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(VoiceLiveStates voiceLiveStates) {
            String str = voiceLiveStates.f39252id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = voiceLiveStates.userId;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            List<String> list = voiceLiveStates.userAvatars;
            if (list != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(3, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str3 = voiceLiveStates.topicId;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str3);
            }
            String str4 = voiceLiveStates.topicName;
            if (str4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(5, str4);
            }
            TextTheme textTheme = voiceLiveStates.textTheme;
            if (textTheme != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(6, textTheme, TextTheme.PROTOBUF_ADAPTER);
            }
            Emotion emotion = voiceLiveStates.emotion;
            if (emotion != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(7, emotion, Emotion.PROTOBUF_ADAPTER);
            }
            voiceLiveStates.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public VoiceLiveStates parse(nb5 nb5Var) throws IOException {
            VoiceLiveStates voiceLiveStates = new VoiceLiveStates();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (voiceLiveStates.f39252id == null) {
                        voiceLiveStates.f39252id = "";
                    }
                    if (voiceLiveStates.userId == null) {
                        voiceLiveStates.userId = "";
                    }
                    if (voiceLiveStates.userAvatars == null) {
                        voiceLiveStates.userAvatars = new ArrayList();
                    }
                    if (voiceLiveStates.topicId == null) {
                        voiceLiveStates.topicId = "";
                    }
                    if (voiceLiveStates.topicName == null) {
                        voiceLiveStates.topicName = "";
                    }
                    if (voiceLiveStates.textTheme != null) {
                        break;
                    }
                    voiceLiveStates.textTheme = TextTheme.new_();
                    break;
                }
                if (iM158752u == 10) {
                    voiceLiveStates.f39252id = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    voiceLiveStates.userId = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    voiceLiveStates.userAvatars = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iM158752u == 34) {
                    voiceLiveStates.topicId = nb5Var.m158750s();
                } else if (iM158752u == 42) {
                    voiceLiveStates.topicName = nb5Var.m158750s();
                } else if (iM158752u == 50) {
                    voiceLiveStates.textTheme = (TextTheme) nb5Var.m158743l(TextTheme.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 58) {
                        if (voiceLiveStates.f39252id == null) {
                            voiceLiveStates.f39252id = "";
                        }
                        if (voiceLiveStates.userId == null) {
                            voiceLiveStates.userId = "";
                        }
                        if (voiceLiveStates.userAvatars == null) {
                            voiceLiveStates.userAvatars = new ArrayList();
                        }
                        if (voiceLiveStates.topicId == null) {
                            voiceLiveStates.topicId = "";
                        }
                        if (voiceLiveStates.topicName == null) {
                            voiceLiveStates.topicName = "";
                        }
                        if (voiceLiveStates.textTheme != null) {
                            break;
                        }
                        voiceLiveStates.textTheme = TextTheme.new_();
                        return voiceLiveStates;
                    }
                    voiceLiveStates.emotion = (Emotion) nb5Var.m158743l(Emotion.PROTOBUF_ADAPTER);
                }
            }
            return voiceLiveStates;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(VoiceLiveStates voiceLiveStates, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = voiceLiveStates.f39252id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = voiceLiveStates.userId;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            List<String> list = voiceLiveStates.userAvatars;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(3, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str3 = voiceLiveStates.topicId;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(4, str3);
            }
            String str4 = voiceLiveStates.topicName;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(5, str4);
            }
            TextTheme textTheme = voiceLiveStates.textTheme;
            if (textTheme != null) {
                codedOutputByteBufferNano.m17254K(6, textTheme, TextTheme.PROTOBUF_ADAPTER);
            }
            Emotion emotion = voiceLiveStates.emotion;
            if (emotion != null) {
                codedOutputByteBufferNano.m17254K(7, emotion, Emotion.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<VoiceLiveStates> JSON_ADAPTER = new ObjectJsonAdapter<VoiceLiveStates>() { // from class: com.p1.mobile.putong.feed.data.VoiceLiveStates.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return VoiceLiveStates.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public VoiceLiveStates newInstance() {
            return new VoiceLiveStates();
        }

        public boolean parseField(VoiceLiveStates voiceLiveStates, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "emotion":
                    voiceLiveStates.emotion = Emotion.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "topicId":
                    voiceLiveStates.topicId = jsonParser.getValueAsString();
                    return true;
                case "textTheme":
                    voiceLiveStates.textTheme = TextTheme.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "userAvatars":
                    voiceLiveStates.userAvatars = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "userId":
                    voiceLiveStates.userId = jsonParser.getValueAsString();
                    return true;
                case "id":
                    voiceLiveStates.f39252id = jsonParser.getValueAsString();
                    return false;
                case "topicName":
                    voiceLiveStates.topicName = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(VoiceLiveStates voiceLiveStates, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "emotion":
                case "topicId":
                case "textTheme":
                case "userAvatars":
                case "userId":
                    return true;
                case "id":
                    return false;
                case "topicName":
                    return true;
                default:
                    return super.parseFieldCheck(voiceLiveStates, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(VoiceLiveStates voiceLiveStates, JsonGenerator jsonGenerator) throws IOException {
            String str = voiceLiveStates.f39252id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = voiceLiveStates.userId;
            if (str2 != null) {
                jsonGenerator.writeStringField("userId", str2);
            }
            if (voiceLiveStates.userAvatars != null) {
                jsonGenerator.writeFieldName("userAvatars");
                JsonAdapter.serializeArray(voiceLiveStates.userAvatars, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str3 = voiceLiveStates.topicId;
            if (str3 != null) {
                jsonGenerator.writeStringField("topicId", str3);
            }
            String str4 = voiceLiveStates.topicName;
            if (str4 != null) {
                jsonGenerator.writeStringField("topicName", str4);
            }
            if (voiceLiveStates.textTheme != null) {
                jsonGenerator.writeFieldName("textTheme");
                TextTheme.JSON_ADAPTER.serialize(voiceLiveStates.textTheme, jsonGenerator, true);
            }
            if (voiceLiveStates.emotion != null) {
                jsonGenerator.writeFieldName(Emotion.TYPE);
                Emotion.JSON_ADAPTER.serialize(voiceLiveStates.emotion, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VoiceLiveStates) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VoiceLiveStates) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m60915a(String str) {
        return str;
    }

    public static VoiceLiveStates new_() {
        VoiceLiveStates voiceLiveStates = new VoiceLiveStates();
        voiceLiveStates.nullCheck();
        return voiceLiveStates;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public VoiceLiveStates mo223809clone() {
        VoiceLiveStates voiceLiveStates = new VoiceLiveStates();
        voiceLiveStates.f39252id = this.f39252id;
        voiceLiveStates.userId = this.userId;
        List<String> list = this.userAvatars;
        if (list != null) {
            voiceLiveStates.userAvatars = ValueObject.util_map(list, new w9j() { // from class: l.cwn0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return VoiceLiveStates.m60915a((String) obj);
                }
            });
        }
        voiceLiveStates.topicId = this.topicId;
        voiceLiveStates.topicName = this.topicName;
        TextTheme textTheme = this.textTheme;
        if (textTheme != null) {
            voiceLiveStates.textTheme = textTheme.mo223809clone();
        }
        Emotion emotion = this.emotion;
        if (emotion != null) {
            voiceLiveStates.emotion = emotion.mo223809clone();
        }
        return voiceLiveStates;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VoiceLiveStates)) {
            return false;
        }
        VoiceLiveStates voiceLiveStates = (VoiceLiveStates) obj;
        return ValueObject.util_equals(this.f39252id, voiceLiveStates.f39252id) && ValueObject.util_equals(this.userId, voiceLiveStates.userId) && ValueObject.util_equals(this.userAvatars, voiceLiveStates.userAvatars) && ValueObject.util_equals(this.topicId, voiceLiveStates.topicId) && ValueObject.util_equals(this.topicName, voiceLiveStates.topicName) && ValueObject.util_equals(this.textTheme, voiceLiveStates.textTheme) && ValueObject.util_equals(this.emotion, voiceLiveStates.emotion);
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
        String str = this.f39252id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.userId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<String> list = this.userAvatars;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 41;
        String str3 = this.topicId;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.topicName;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 41;
        TextTheme textTheme = this.textTheme;
        int iHashCode6 = (iHashCode5 + (textTheme != null ? textTheme.hashCode() : 0)) * 41;
        Emotion emotion = this.emotion;
        int iHashCode7 = iHashCode6 + (emotion != null ? emotion.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f39252id == null) {
            this.f39252id = "";
        }
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.userAvatars == null) {
            this.userAvatars = new ArrayList();
        }
        if (this.topicId == null) {
            this.topicId = "";
        }
        if (this.topicName == null) {
            this.topicName = "";
        }
        if (this.textTheme == null) {
            this.textTheme = TextTheme.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
