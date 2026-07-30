package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.Emotion;
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
import java.util.List;
import org.spongycastle.asn1.eac.EACTags;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes12.dex */
public class Emotion extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "emotion";

    @NonNull
    @ProtobufIndex(index = 5)
    public List<String> backgroundColor;

    @NonNull
    @ProtobufIndex(index = 12)
    public String defaultDoc;

    @NonNull
    @ProtobufIndex(index = 1)
    public String emoji;

    @NonNull
    @ProtobufIndex(index = 3)
    public String emojiUrl;

    @NonNull
    @ProtobufIndex(index = 6)
    public List<String> iconColor;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 4)
    public String f38748id;

    @NonNull
    @ProtobufIndex(index = 11)
    public String liveId;

    @NonNull
    @ProtobufIndex(index = 2)
    public String text;

    @NonNull
    @ProtobufIndex(index = 9)
    public String topicId;

    @NonNull
    @ProtobufIndex(index = 10)
    public String topicName;

    @NonNull
    @ProtobufIndex(index = 8)
    public List<String> userAvatars;

    @NonNull
    @ProtobufIndex(index = 7)
    public String userId;
    public static ProtobufAdapter<Emotion> PROTOBUF_ADAPTER = new MessageNanoAdapter<Emotion>() { // from class: com.p1.mobile.putong.data.Emotion.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Emotion emotion) {
            String str = emotion.emoji;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = emotion.text;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = emotion.emojiUrl;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            String str4 = emotion.f38748id;
            if (str4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str4);
            }
            List<String> list = emotion.backgroundColor;
            if (list != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(5, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = emotion.iconColor;
            if (list2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(6, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str5 = emotion.userId;
            if (str5 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(7, str5);
            }
            List<String> list3 = emotion.userAvatars;
            if (list3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(8, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str6 = emotion.topicId;
            if (str6 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(9, str6);
            }
            String str7 = emotion.topicName;
            if (str7 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(10, str7);
            }
            String str8 = emotion.liveId;
            if (str8 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(11, str8);
            }
            String str9 = emotion.defaultDoc;
            if (str9 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(12, str9);
            }
            emotion.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Emotion parse(nb5 nb5Var) throws IOException {
            Emotion emotion = new Emotion();
            while (true) {
                switch (nb5Var.m158752u()) {
                    case 0:
                        if (emotion.emoji == null) {
                            emotion.emoji = "";
                        }
                        if (emotion.text == null) {
                            emotion.text = "";
                        }
                        if (emotion.emojiUrl == null) {
                            emotion.emojiUrl = "";
                        }
                        if (emotion.f38748id == null) {
                            emotion.f38748id = "";
                        }
                        if (emotion.backgroundColor == null) {
                            emotion.backgroundColor = new ArrayList();
                        }
                        if (emotion.iconColor == null) {
                            emotion.iconColor = new ArrayList();
                        }
                        if (emotion.liveId == null) {
                            emotion.liveId = "";
                        }
                        if (emotion.userId == null) {
                            emotion.userId = "";
                        }
                        if (emotion.userAvatars == null) {
                            emotion.userAvatars = new ArrayList();
                        }
                        if (emotion.topicId == null) {
                            emotion.topicId = "";
                        }
                        if (emotion.topicName == null) {
                            emotion.topicName = "";
                        }
                        if (emotion.defaultDoc == null) {
                            emotion.defaultDoc = "";
                        }
                        break;
                    case 10:
                        emotion.emoji = nb5Var.m158750s();
                        continue;
                    case 18:
                        emotion.text = nb5Var.m158750s();
                        continue;
                    case 26:
                        emotion.emojiUrl = nb5Var.m158750s();
                        continue;
                    case 34:
                        emotion.f38748id = nb5Var.m158750s();
                        continue;
                    case 42:
                        emotion.backgroundColor = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 50:
                        emotion.iconColor = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 58:
                        emotion.userId = nb5Var.m158750s();
                        continue;
                    case 66:
                        emotion.userAvatars = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 74:
                        emotion.topicId = nb5Var.m158750s();
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        emotion.topicName = nb5Var.m158750s();
                        continue;
                    case 90:
                        emotion.liveId = nb5Var.m158750s();
                        continue;
                    case EACTags.FCP_TEMPLATE /* 98 */:
                        emotion.defaultDoc = nb5Var.m158750s();
                        continue;
                    default:
                        if (emotion.emoji == null) {
                            emotion.emoji = "";
                        }
                        if (emotion.text == null) {
                            emotion.text = "";
                        }
                        if (emotion.emojiUrl == null) {
                            emotion.emojiUrl = "";
                        }
                        if (emotion.f38748id == null) {
                            emotion.f38748id = "";
                        }
                        if (emotion.backgroundColor == null) {
                            emotion.backgroundColor = new ArrayList();
                        }
                        if (emotion.iconColor == null) {
                            emotion.iconColor = new ArrayList();
                        }
                        if (emotion.liveId == null) {
                            emotion.liveId = "";
                        }
                        if (emotion.userId == null) {
                            emotion.userId = "";
                        }
                        if (emotion.userAvatars == null) {
                            emotion.userAvatars = new ArrayList();
                        }
                        if (emotion.topicId == null) {
                            emotion.topicId = "";
                        }
                        if (emotion.topicName == null) {
                            emotion.topicName = "";
                        }
                        if (emotion.defaultDoc == null) {
                            emotion.defaultDoc = "";
                            return emotion;
                        }
                        break;
                }
            }
            return emotion;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Emotion emotion, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = emotion.emoji;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = emotion.text;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = emotion.emojiUrl;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            String str4 = emotion.f38748id;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(4, str4);
            }
            List<String> list = emotion.backgroundColor;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(5, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = emotion.iconColor;
            if (list2 != null) {
                codedOutputByteBufferNano.m17254K(6, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str5 = emotion.userId;
            if (str5 != null) {
                codedOutputByteBufferNano.m17261R(7, str5);
            }
            List<String> list3 = emotion.userAvatars;
            if (list3 != null) {
                codedOutputByteBufferNano.m17254K(8, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str6 = emotion.topicId;
            if (str6 != null) {
                codedOutputByteBufferNano.m17261R(9, str6);
            }
            String str7 = emotion.topicName;
            if (str7 != null) {
                codedOutputByteBufferNano.m17261R(10, str7);
            }
            String str8 = emotion.liveId;
            if (str8 != null) {
                codedOutputByteBufferNano.m17261R(11, str8);
            }
            String str9 = emotion.defaultDoc;
            if (str9 != null) {
                codedOutputByteBufferNano.m17261R(12, str9);
            }
        }
    };
    public static JsonAdapter<Emotion> JSON_ADAPTER = new ObjectJsonAdapter<Emotion>() { // from class: com.p1.mobile.putong.data.Emotion.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Emotion.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Emotion newInstance() {
            return new Emotion();
        }

        public boolean parseField(Emotion emotion, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "iconColor":
                    emotion.iconColor = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "topicId":
                    emotion.topicId = jsonParser.getValueAsString();
                    return true;
                case "liveId":
                    emotion.liveId = jsonParser.getValueAsString();
                    return true;
                case "userAvatars":
                    emotion.userAvatars = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "userId":
                    emotion.userId = jsonParser.getValueAsString();
                    return true;
                case "id":
                    emotion.f38748id = jsonParser.getValueAsString();
                    return false;
                case "text":
                    emotion.text = jsonParser.getValueAsString();
                    return true;
                case "emoji":
                    emotion.emoji = jsonParser.getValueAsString();
                    return true;
                case "topicName":
                    emotion.topicName = jsonParser.getValueAsString();
                    return true;
                case "defaultDoc":
                    emotion.defaultDoc = jsonParser.getValueAsString();
                    return true;
                case "emojiUrl":
                    emotion.emojiUrl = jsonParser.getValueAsString();
                    return true;
                case "backgroundColor":
                    emotion.backgroundColor = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(Emotion emotion, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "iconColor":
                case "topicId":
                case "liveId":
                case "userAvatars":
                case "userId":
                    return true;
                case "id":
                    return false;
                case "text":
                case "emoji":
                case "topicName":
                case "defaultDoc":
                case "emojiUrl":
                case "backgroundColor":
                    return true;
                default:
                    return super.parseFieldCheck(emotion, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Emotion emotion, JsonGenerator jsonGenerator) throws IOException {
            String str = emotion.emoji;
            if (str != null) {
                jsonGenerator.writeStringField("emoji", str);
            }
            String str2 = emotion.text;
            if (str2 != null) {
                jsonGenerator.writeStringField("text", str2);
            }
            String str3 = emotion.emojiUrl;
            if (str3 != null) {
                jsonGenerator.writeStringField("emojiUrl", str3);
            }
            String str4 = emotion.f38748id;
            if (str4 != null) {
                jsonGenerator.writeStringField("id", str4);
            }
            if (emotion.backgroundColor != null) {
                jsonGenerator.writeFieldName("backgroundColor");
                JsonAdapter.serializeArray(emotion.backgroundColor, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (emotion.iconColor != null) {
                jsonGenerator.writeFieldName("iconColor");
                JsonAdapter.serializeArray(emotion.iconColor, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str5 = emotion.liveId;
            if (str5 != null) {
                jsonGenerator.writeStringField("liveId", str5);
            }
            String str6 = emotion.userId;
            if (str6 != null) {
                jsonGenerator.writeStringField("userId", str6);
            }
            if (emotion.userAvatars != null) {
                jsonGenerator.writeFieldName("userAvatars");
                JsonAdapter.serializeArray(emotion.userAvatars, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str7 = emotion.topicId;
            if (str7 != null) {
                jsonGenerator.writeStringField("topicId", str7);
            }
            String str8 = emotion.topicName;
            if (str8 != null) {
                jsonGenerator.writeStringField("topicName", str8);
            }
            String str9 = emotion.defaultDoc;
            if (str9 != null) {
                jsonGenerator.writeStringField("defaultDoc", str9);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Emotion) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Emotion) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m59757a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m59758b(String str) {
        return str;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m59759c(String str) {
        return str;
    }

    public static Emotion new_() {
        Emotion emotion = new Emotion();
        emotion.nullCheck();
        return emotion;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Emotion mo223809clone() {
        Emotion emotion = new Emotion();
        emotion.emoji = this.emoji;
        emotion.text = this.text;
        emotion.emojiUrl = this.emojiUrl;
        emotion.f38748id = this.f38748id;
        List<String> list = this.backgroundColor;
        if (list != null) {
            emotion.backgroundColor = ValueObject.util_map(list, new w9j() { // from class: l.lye
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Emotion.m59757a((String) obj);
                }
            });
        }
        List<String> list2 = this.iconColor;
        if (list2 != null) {
            emotion.iconColor = ValueObject.util_map(list2, new w9j() { // from class: l.mye
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Emotion.m59758b((String) obj);
                }
            });
        }
        emotion.liveId = this.liveId;
        emotion.userId = this.userId;
        List<String> list3 = this.userAvatars;
        if (list3 != null) {
            emotion.userAvatars = ValueObject.util_map(list3, new w9j() { // from class: l.nye
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Emotion.m59759c((String) obj);
                }
            });
        }
        emotion.topicId = this.topicId;
        emotion.topicName = this.topicName;
        emotion.defaultDoc = this.defaultDoc;
        return emotion;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Emotion)) {
            return false;
        }
        Emotion emotion = (Emotion) obj;
        return ValueObject.util_equals(this.emoji, emotion.emoji) && ValueObject.util_equals(this.text, emotion.text) && ValueObject.util_equals(this.emojiUrl, emotion.emojiUrl) && ValueObject.util_equals(this.f38748id, emotion.f38748id) && ValueObject.util_equals(this.backgroundColor, emotion.backgroundColor) && ValueObject.util_equals(this.iconColor, emotion.iconColor) && ValueObject.util_equals(this.liveId, emotion.liveId) && ValueObject.util_equals(this.userId, emotion.userId) && ValueObject.util_equals(this.userAvatars, emotion.userAvatars) && ValueObject.util_equals(this.topicId, emotion.topicId) && ValueObject.util_equals(this.topicName, emotion.topicName) && ValueObject.util_equals(this.defaultDoc, emotion.defaultDoc);
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
        String str = this.emoji;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.text;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.emojiUrl;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.f38748id;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        List<String> list = this.backgroundColor;
        int iHashCode5 = (iHashCode4 + (list != null ? list.hashCode() : 0)) * 41;
        List<String> list2 = this.iconColor;
        int iHashCode6 = (iHashCode5 + (list2 != null ? list2.hashCode() : 0)) * 41;
        String str5 = this.liveId;
        int iHashCode7 = (iHashCode6 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.userId;
        int iHashCode8 = (iHashCode7 + (str6 != null ? str6.hashCode() : 0)) * 41;
        List<String> list3 = this.userAvatars;
        int iHashCode9 = (iHashCode8 + (list3 != null ? list3.hashCode() : 0)) * 41;
        String str7 = this.topicId;
        int iHashCode10 = (iHashCode9 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.topicName;
        int iHashCode11 = (iHashCode10 + (str8 != null ? str8.hashCode() : 0)) * 41;
        String str9 = this.defaultDoc;
        int iHashCode12 = iHashCode11 + (str9 != null ? str9.hashCode() : 0);
        this.hashCode = iHashCode12;
        return iHashCode12;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.emoji == null) {
            this.emoji = "";
        }
        if (this.text == null) {
            this.text = "";
        }
        if (this.emojiUrl == null) {
            this.emojiUrl = "";
        }
        if (this.f38748id == null) {
            this.f38748id = "";
        }
        if (this.backgroundColor == null) {
            this.backgroundColor = new ArrayList();
        }
        if (this.iconColor == null) {
            this.iconColor = new ArrayList();
        }
        if (this.liveId == null) {
            this.liveId = "";
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
        if (this.defaultDoc == null) {
            this.defaultDoc = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
