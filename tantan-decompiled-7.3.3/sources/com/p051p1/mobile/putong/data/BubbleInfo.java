package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.Media;
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
import java.util.HashSet;
import java.util.List;
import org.spongycastle.asn1.eac.EACTags;
import p153l.nc5;
import p153l.pzi0;
import p153l.qcj;

/* JADX INFO: loaded from: classes12.dex */
public class BubbleInfo extends ValueObject<BubbleInfo> implements Cloneable, Serializable {
    public static final String TYPE = "bubbleinfo";

    @NonNull
    @ProtobufIndex(index = 11)
    public String biz;

    @ProtobufIndex(index = 8)
    public double createdTime;

    @NonNull
    @ProtobufIndex(index = 5)
    public Emotion emotion;

    @ProtobufIndex(index = 9)
    public boolean haveLiked;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f39578id;

    @NonNull
    @ProtobufIndex(index = 6)
    public MessageLocation location;
    public String locationName;

    @NonNull
    @ProtobufIndex(index = 10)
    public List<Media> media;

    @NonNull
    @ProtobufIndex(index = 2)
    public Owner owner;
    private String requestUrl;

    @NonNull
    @ProtobufIndex(index = 7)
    public String status;

    @NonNull
    @ProtobufIndex(index = 4)
    public TextTheme textTheme;

    @NonNull
    @ProtobufIndex(index = 12)
    public String userId;

    @NonNull
    @ProtobufIndex(index = 3)
    public String value;
    public static ProtobufAdapter<BubbleInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<BubbleInfo>() { // from class: com.p1.mobile.putong.data.BubbleInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(BubbleInfo bubbleInfo) {
            String str = bubbleInfo.f39578id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            Owner owner = bubbleInfo.owner;
            if (owner != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(2, owner, Owner.PROTOBUF_ADAPTER);
            }
            String str2 = bubbleInfo.value;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str2);
            }
            TextTheme textTheme = bubbleInfo.textTheme;
            if (textTheme != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(4, textTheme, TextTheme.PROTOBUF_ADAPTER);
            }
            Emotion emotion = bubbleInfo.emotion;
            if (emotion != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(5, emotion, Emotion.PROTOBUF_ADAPTER);
            }
            MessageLocation messageLocation = bubbleInfo.location;
            if (messageLocation != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(6, messageLocation, MessageLocation.PROTOBUF_ADAPTER);
            }
            String str3 = bubbleInfo.status;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(7, str3);
            }
            int iM17277d = iM17288o + CodedOutputByteBufferNano.m17277d(8, bubbleInfo.createdTime) + CodedOutputByteBufferNano.m17275b(9, bubbleInfo.haveLiked);
            List<Media> list = bubbleInfo.media;
            if (list != null) {
                iM17277d += CodedOutputByteBufferNano.m17285l(10, list, Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str4 = bubbleInfo.biz;
            if (str4 != null) {
                iM17277d += CodedOutputByteBufferNano.m17288o(11, str4);
            }
            String str5 = bubbleInfo.userId;
            if (str5 != null) {
                iM17277d += CodedOutputByteBufferNano.m17288o(12, str5);
            }
            bubbleInfo.cachedSize = iM17277d;
            return iM17277d;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public BubbleInfo parse(nc5 nc5Var) throws IOException {
            BubbleInfo bubbleInfo = new BubbleInfo();
            while (true) {
                switch (nc5Var.m162497u()) {
                    case 0:
                        if (bubbleInfo.f39578id == null) {
                            bubbleInfo.f39578id = "";
                        }
                        if (bubbleInfo.owner == null) {
                            bubbleInfo.owner = Owner.new_();
                        }
                        if (bubbleInfo.value == null) {
                            bubbleInfo.value = "";
                        }
                        if (bubbleInfo.textTheme == null) {
                            bubbleInfo.textTheme = TextTheme.new_();
                        }
                        if (bubbleInfo.emotion == null) {
                            bubbleInfo.emotion = Emotion.new_();
                        }
                        if (bubbleInfo.location == null) {
                            bubbleInfo.location = MessageLocation.new_();
                        }
                        if (bubbleInfo.status == null) {
                            bubbleInfo.status = "";
                        }
                        if (bubbleInfo.media == null) {
                            bubbleInfo.media = new ArrayList();
                        }
                        if (bubbleInfo.biz == null) {
                            bubbleInfo.biz = "";
                        }
                        if (bubbleInfo.userId == null) {
                            bubbleInfo.userId = "";
                        }
                        break;
                    case 10:
                        bubbleInfo.f39578id = nc5Var.m162495s();
                        continue;
                    case 18:
                        bubbleInfo.owner = (Owner) nc5Var.m162488l(Owner.PROTOBUF_ADAPTER);
                        continue;
                    case 26:
                        bubbleInfo.value = nc5Var.m162495s();
                        continue;
                    case 34:
                        bubbleInfo.textTheme = (TextTheme) nc5Var.m162488l(TextTheme.PROTOBUF_ADAPTER);
                        continue;
                    case 42:
                        bubbleInfo.emotion = (Emotion) nc5Var.m162488l(Emotion.PROTOBUF_ADAPTER);
                        continue;
                    case 50:
                        bubbleInfo.location = (MessageLocation) nc5Var.m162488l(MessageLocation.PROTOBUF_ADAPTER);
                        continue;
                    case 58:
                        bubbleInfo.status = nc5Var.m162495s();
                        continue;
                    case 65:
                        bubbleInfo.createdTime = nc5Var.m162484h();
                        continue;
                    case 72:
                        bubbleInfo.haveLiked = nc5Var.m162483g();
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        bubbleInfo.media = (List) nc5Var.m162488l(Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 90:
                        bubbleInfo.biz = nc5Var.m162495s();
                        continue;
                    case EACTags.FCP_TEMPLATE /* 98 */:
                        bubbleInfo.userId = nc5Var.m162495s();
                        continue;
                    default:
                        if (bubbleInfo.f39578id == null) {
                            bubbleInfo.f39578id = "";
                        }
                        if (bubbleInfo.owner == null) {
                            bubbleInfo.owner = Owner.new_();
                        }
                        if (bubbleInfo.value == null) {
                            bubbleInfo.value = "";
                        }
                        if (bubbleInfo.textTheme == null) {
                            bubbleInfo.textTheme = TextTheme.new_();
                        }
                        if (bubbleInfo.emotion == null) {
                            bubbleInfo.emotion = Emotion.new_();
                        }
                        if (bubbleInfo.location == null) {
                            bubbleInfo.location = MessageLocation.new_();
                        }
                        if (bubbleInfo.status == null) {
                            bubbleInfo.status = "";
                        }
                        if (bubbleInfo.media == null) {
                            bubbleInfo.media = new ArrayList();
                        }
                        if (bubbleInfo.biz == null) {
                            bubbleInfo.biz = "";
                        }
                        if (bubbleInfo.userId == null) {
                            bubbleInfo.userId = "";
                            return bubbleInfo;
                        }
                        break;
                }
            }
            return bubbleInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(BubbleInfo bubbleInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = bubbleInfo.f39578id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            Owner owner = bubbleInfo.owner;
            if (owner != null) {
                codedOutputByteBufferNano.m17309K(2, owner, Owner.PROTOBUF_ADAPTER);
            }
            String str2 = bubbleInfo.value;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(3, str2);
            }
            TextTheme textTheme = bubbleInfo.textTheme;
            if (textTheme != null) {
                codedOutputByteBufferNano.m17309K(4, textTheme, TextTheme.PROTOBUF_ADAPTER);
            }
            Emotion emotion = bubbleInfo.emotion;
            if (emotion != null) {
                codedOutputByteBufferNano.m17309K(5, emotion, Emotion.PROTOBUF_ADAPTER);
            }
            MessageLocation messageLocation = bubbleInfo.location;
            if (messageLocation != null) {
                codedOutputByteBufferNano.m17309K(6, messageLocation, MessageLocation.PROTOBUF_ADAPTER);
            }
            String str3 = bubbleInfo.status;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(7, str3);
            }
            codedOutputByteBufferNano.m17301C(8, bubbleInfo.createdTime);
            codedOutputByteBufferNano.m17299A(9, bubbleInfo.haveLiked);
            List<Media> list = bubbleInfo.media;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(10, list, Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str4 = bubbleInfo.biz;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(11, str4);
            }
            String str5 = bubbleInfo.userId;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(12, str5);
            }
        }
    };
    public static JsonAdapter<BubbleInfo> JSON_ADAPTER = new ObjectJsonAdapter<BubbleInfo>() { // from class: com.p1.mobile.putong.data.BubbleInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BubbleInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BubbleInfo newInstance() {
            return new BubbleInfo();
        }

        public boolean parseField(BubbleInfo bubbleInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "emotion":
                    bubbleInfo.emotion = Emotion.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "haveLiked":
                    bubbleInfo.haveLiked = jsonParser.getValueAsBoolean();
                    return true;
                case "textTheme":
                    bubbleInfo.textTheme = TextTheme.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "status":
                    bubbleInfo.status = jsonParser.getValueAsString();
                    return true;
                case "userId":
                    bubbleInfo.userId = jsonParser.getValueAsString();
                    return true;
                case "createdTime":
                    bubbleInfo.createdTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case "id":
                    bubbleInfo.f39578id = jsonParser.getValueAsString();
                    return false;
                case "biz":
                    bubbleInfo.biz = jsonParser.getValueAsString();
                    return true;
                case "media":
                    bubbleInfo.media = JsonAdapter.parseArray(jsonParser, Converter.RAW_PICTURE_TO_MEDIA, str2, arrayList, dataChecker);
                    return true;
                case "owner":
                    bubbleInfo.owner = Owner.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "value":
                    bubbleInfo.value = jsonParser.getValueAsString();
                    return true;
                case "location":
                    bubbleInfo.location = MessageLocation.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(BubbleInfo bubbleInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "emotion":
                case "haveLiked":
                case "textTheme":
                case "status":
                case "userId":
                case "createdTime":
                    return true;
                case "id":
                    return false;
                case "biz":
                case "media":
                case "owner":
                case "value":
                case "location":
                    return true;
                default:
                    return super.parseFieldCheck(bubbleInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BubbleInfo bubbleInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = bubbleInfo.f39578id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (bubbleInfo.owner != null) {
                jsonGenerator.writeFieldName(Owner.TYPE);
                Owner.JSON_ADAPTER.serialize(bubbleInfo.owner, jsonGenerator, true);
            }
            String str2 = bubbleInfo.value;
            if (str2 != null) {
                jsonGenerator.writeStringField("value", str2);
            }
            if (bubbleInfo.textTheme != null) {
                jsonGenerator.writeFieldName("textTheme");
                TextTheme.JSON_ADAPTER.serialize(bubbleInfo.textTheme, jsonGenerator, true);
            }
            if (bubbleInfo.emotion != null) {
                jsonGenerator.writeFieldName(Emotion.TYPE);
                Emotion.JSON_ADAPTER.serialize(bubbleInfo.emotion, jsonGenerator, true);
            }
            if (bubbleInfo.location != null) {
                jsonGenerator.writeFieldName("location");
                MessageLocation.JSON_ADAPTER.serialize(bubbleInfo.location, jsonGenerator, true);
            }
            String str3 = bubbleInfo.status;
            if (str3 != null) {
                jsonGenerator.writeStringField(NotificationCompat.CATEGORY_STATUS, str3);
            }
            jsonGenerator.writeFieldName("createdTime");
            Converter.API_TIME.serialize(Double.valueOf(bubbleInfo.createdTime), jsonGenerator, true);
            jsonGenerator.writeBooleanField("haveLiked", bubbleInfo.haveLiked);
            if (bubbleInfo.media != null) {
                jsonGenerator.writeFieldName("media");
                JsonAdapter.serializeArray(bubbleInfo.media, jsonGenerator, Converter.RAW_PICTURE_TO_MEDIA);
            }
            String str4 = bubbleInfo.biz;
            if (str4 != null) {
                jsonGenerator.writeStringField("biz", str4);
            }
            String str5 = bubbleInfo.userId;
            if (str5 != null) {
                jsonGenerator.writeStringField("userId", str5);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((BubbleInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BubbleInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public boolean isPostSelectBubble = false;
    public String recommendReason = null;
    private HashSet<String> parseFieldSet = new HashSet<>();

    public static BubbleInfo new_() {
        BubbleInfo bubbleInfo = new BubbleInfo();
        bubbleInfo.nullCheck();
        return bubbleInfo;
    }

    public boolean checkStateTimeIsValid() {
        return (this.createdTime + 8.64E7d) - ((double) pzi0.m174454o()) > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BubbleInfo mo225055clone() {
        BubbleInfo bubbleInfo = new BubbleInfo();
        bubbleInfo.f39578id = this.f39578id;
        Owner owner = this.owner;
        if (owner != null) {
            bubbleInfo.owner = owner.mo225055clone();
        }
        bubbleInfo.value = this.value;
        TextTheme textTheme = this.textTheme;
        if (textTheme != null) {
            bubbleInfo.textTheme = textTheme.mo225055clone();
        }
        Emotion emotion = this.emotion;
        if (emotion != null) {
            bubbleInfo.emotion = emotion.mo225055clone();
        }
        MessageLocation messageLocation = this.location;
        if (messageLocation != null) {
            bubbleInfo.location = messageLocation.mo225055clone();
        }
        bubbleInfo.status = this.status;
        bubbleInfo.createdTime = this.createdTime;
        bubbleInfo.haveLiked = this.haveLiked;
        List<Media> list = this.media;
        if (list != null) {
            bubbleInfo.media = ValueObject.util_map(list, new qcj() { // from class: l.wf3
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((Media) obj).mo225055clone();
                }
            });
        }
        bubbleInfo.biz = this.biz;
        bubbleInfo.userId = this.userId;
        return bubbleInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BubbleInfo)) {
            return false;
        }
        BubbleInfo bubbleInfo = (BubbleInfo) obj;
        return ValueObject.util_equals(this.f39578id, bubbleInfo.f39578id) && ValueObject.util_equals(this.owner, bubbleInfo.owner) && ValueObject.util_equals(this.value, bubbleInfo.value) && ValueObject.util_equals(this.textTheme, bubbleInfo.textTheme) && ValueObject.util_equals(this.emotion, bubbleInfo.emotion) && ValueObject.util_equals(this.location, bubbleInfo.location) && ValueObject.util_equals(this.status, bubbleInfo.status) && this.createdTime == bubbleInfo.createdTime && this.haveLiked == bubbleInfo.haveLiked && ValueObject.util_equals(this.media, bubbleInfo.media) && ValueObject.util_equals(this.biz, bubbleInfo.biz) && ValueObject.util_equals(this.userId, bubbleInfo.userId);
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
        String str = this.f39578id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        Owner owner = this.owner;
        int iHashCode2 = (iHashCode + (owner != null ? owner.hashCode() : 0)) * 41;
        String str2 = this.value;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41;
        TextTheme textTheme = this.textTheme;
        int iHashCode4 = (iHashCode3 + (textTheme != null ? textTheme.hashCode() : 0)) * 41;
        Emotion emotion = this.emotion;
        int iHashCode5 = (iHashCode4 + (emotion != null ? emotion.hashCode() : 0)) * 41;
        MessageLocation messageLocation = this.location;
        int iHashCode6 = (iHashCode5 + (messageLocation != null ? messageLocation.hashCode() : 0)) * 41;
        String str3 = this.status;
        int iHashCode7 = str3 != null ? str3.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.createdTime);
        int i3 = (((((iHashCode6 + iHashCode7) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41) + (this.haveLiked ? 1231 : 1237)) * 41;
        List<Media> list = this.media;
        int iHashCode8 = (i3 + (list != null ? list.hashCode() : 0)) * 41;
        String str4 = this.biz;
        int iHashCode9 = (iHashCode8 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.userId;
        int iHashCode10 = iHashCode9 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = iHashCode10;
        return iHashCode10;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public boolean isFieldParsed(String str) {
        return this.parseFieldSet.contains(str);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void mergeData(BubbleInfo bubbleInfo) {
        if (!shouldMergeData() || equals(bubbleInfo)) {
            return;
        }
        if (!isFieldParsed("id")) {
            this.f39578id = bubbleInfo.f39578id;
        }
        if (!isFieldParsed(Owner.TYPE)) {
            this.owner = bubbleInfo.owner;
        }
        if (!isFieldParsed("value")) {
            this.value = bubbleInfo.value;
        }
        if (!isFieldParsed("textTheme")) {
            this.textTheme = bubbleInfo.textTheme;
        }
        if (!isFieldParsed(Emotion.TYPE)) {
            this.emotion = bubbleInfo.emotion;
        }
        if (!isFieldParsed("location")) {
            this.location = bubbleInfo.location;
        }
        if (!isFieldParsed(NotificationCompat.CATEGORY_STATUS)) {
            this.status = bubbleInfo.status;
        }
        if (!isFieldParsed("createdTime")) {
            this.createdTime = bubbleInfo.createdTime;
        }
        if (!isFieldParsed("haveLiked")) {
            this.haveLiked = bubbleInfo.haveLiked;
        }
        if (!isFieldParsed("media")) {
            this.media = bubbleInfo.media;
        }
        if (!isFieldParsed("biz")) {
            this.biz = bubbleInfo.biz;
        }
        if (!isFieldParsed("userId")) {
            this.userId = bubbleInfo.userId;
        }
        this.parseFieldSet.clear();
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f39578id == null) {
            this.f39578id = "";
        }
        if (this.owner == null) {
            this.owner = Owner.new_();
        }
        if (this.value == null) {
            this.value = "";
        }
        if (this.textTheme == null) {
            this.textTheme = TextTheme.new_();
        }
        if (this.emotion == null) {
            this.emotion = Emotion.new_();
        }
        if (this.location == null) {
            this.location = MessageLocation.new_();
        }
        if (this.status == null) {
            this.status = "";
        }
        if (this.media == null) {
            this.media = new ArrayList();
        }
        if (this.biz == null) {
            this.biz = "";
        }
        if (this.userId == null) {
            this.userId = "";
        }
    }

    public void setLocationName(String str) {
        this.locationName = str;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void setParsedApiRequest(String str) {
        this.requestUrl = str;
    }

    public void setPostSelectBubbleState(boolean z) {
        this.isPostSelectBubble = z;
    }

    public void setRecommendReason(String str) {
        this.recommendReason = str;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
