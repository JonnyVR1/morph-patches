package com.p046p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.MessageLocation;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.feed.data.PoiEmotionGuide;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import com.tencent.open.SocialConstants;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.spongycastle.asn1.eac.EACTags;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes12.dex */
public class PoiGuidePopWindow extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "poiguidepopwindow";

    @NonNull
    @ProtobufIndex(index = 11)
    public String desc;

    @NonNull
    @ProtobufIndex(index = 9)
    public List<PoiEmotionGuide> emotionGuides;

    @NonNull
    @ProtobufIndex(index = 12)
    public String emotionId;

    @ProtobufIndex(index = 7)
    public boolean firstTimeShow;

    @NonNull
    @ProtobufIndex(index = 4)
    public String icon;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f39239id;

    @ProtobufIndex(index = 8)
    public int intervalHours;

    @Nullable
    @ProtobufIndex(index = 10)
    public MessageLocation location;

    @NonNull
    @ProtobufIndex(index = 3)
    public String subTitle;

    @ProtobufIndex(index = 6)
    public int swipeLimit;

    @NonNull
    @ProtobufIndex(index = 2)
    public String title;

    @NonNull
    @ProtobufIndex(index = 5)
    public PoiGuidePopType type;

    @NonNull
    @ProtobufIndex(index = 13)
    public String userPostType;
    public static ProtobufAdapter<PoiGuidePopWindow> PROTOBUF_ADAPTER = new MessageNanoAdapter<PoiGuidePopWindow>() { // from class: com.p1.mobile.putong.feed.data.PoiGuidePopWindow.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(PoiGuidePopWindow poiGuidePopWindow) {
            String str = poiGuidePopWindow.f39239id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = poiGuidePopWindow.title;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = poiGuidePopWindow.subTitle;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            String str4 = poiGuidePopWindow.icon;
            if (str4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str4);
            }
            PoiGuidePopType poiGuidePopType = poiGuidePopWindow.type;
            if (poiGuidePopType != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(5, poiGuidePopType, PoiGuidePopType.PROTOBUF_ADAPTER);
            }
            int iM17226h = iM17233o + CodedOutputByteBufferNano.m17226h(6, poiGuidePopWindow.swipeLimit) + CodedOutputByteBufferNano.m17220b(7, poiGuidePopWindow.firstTimeShow) + CodedOutputByteBufferNano.m17226h(8, poiGuidePopWindow.intervalHours);
            List<PoiEmotionGuide> list = poiGuidePopWindow.emotionGuides;
            if (list != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(9, list, PoiEmotionGuide.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            MessageLocation messageLocation = poiGuidePopWindow.location;
            if (messageLocation != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(10, messageLocation, MessageLocation.PROTOBUF_ADAPTER);
            }
            String str5 = poiGuidePopWindow.desc;
            if (str5 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(11, str5);
            }
            String str6 = poiGuidePopWindow.emotionId;
            if (str6 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(12, str6);
            }
            String str7 = poiGuidePopWindow.userPostType;
            if (str7 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(13, str7);
            }
            poiGuidePopWindow.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public PoiGuidePopWindow parse(nb5 nb5Var) throws IOException {
            PoiGuidePopWindow poiGuidePopWindow = new PoiGuidePopWindow();
            while (true) {
                switch (nb5Var.m158752u()) {
                    case 0:
                        if (poiGuidePopWindow.f39239id == null) {
                            poiGuidePopWindow.f39239id = "";
                        }
                        if (poiGuidePopWindow.title == null) {
                            poiGuidePopWindow.title = "";
                        }
                        if (poiGuidePopWindow.subTitle == null) {
                            poiGuidePopWindow.subTitle = "";
                        }
                        if (poiGuidePopWindow.icon == null) {
                            poiGuidePopWindow.icon = "";
                        }
                        if (poiGuidePopWindow.type == null) {
                            poiGuidePopWindow.type = (PoiGuidePopType) PoiGuidePopType.JSON_ADAPTER.defaultEnum();
                        }
                        if (poiGuidePopWindow.emotionGuides == null) {
                            poiGuidePopWindow.emotionGuides = new ArrayList();
                        }
                        if (poiGuidePopWindow.desc == null) {
                            poiGuidePopWindow.desc = "";
                        }
                        if (poiGuidePopWindow.emotionId == null) {
                            poiGuidePopWindow.emotionId = "";
                        }
                        if (poiGuidePopWindow.userPostType == null) {
                            poiGuidePopWindow.userPostType = "";
                        }
                        break;
                    case 10:
                        poiGuidePopWindow.f39239id = nb5Var.m158750s();
                        continue;
                    case 18:
                        poiGuidePopWindow.title = nb5Var.m158750s();
                        continue;
                    case 26:
                        poiGuidePopWindow.subTitle = nb5Var.m158750s();
                        continue;
                    case 34:
                        poiGuidePopWindow.icon = nb5Var.m158750s();
                        continue;
                    case 42:
                        poiGuidePopWindow.type = (PoiGuidePopType) nb5Var.m158743l(PoiGuidePopType.PROTOBUF_ADAPTER);
                        continue;
                    case 48:
                        poiGuidePopWindow.swipeLimit = nb5Var.m158741j();
                        continue;
                    case 56:
                        poiGuidePopWindow.firstTimeShow = nb5Var.m158738g();
                        continue;
                    case 64:
                        poiGuidePopWindow.intervalHours = nb5Var.m158741j();
                        continue;
                    case 74:
                        poiGuidePopWindow.emotionGuides = (List) nb5Var.m158743l(PoiEmotionGuide.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        poiGuidePopWindow.location = (MessageLocation) nb5Var.m158743l(MessageLocation.PROTOBUF_ADAPTER);
                        continue;
                    case 90:
                        poiGuidePopWindow.desc = nb5Var.m158750s();
                        continue;
                    case EACTags.FCP_TEMPLATE /* 98 */:
                        poiGuidePopWindow.emotionId = nb5Var.m158750s();
                        continue;
                    case 106:
                        poiGuidePopWindow.userPostType = nb5Var.m158750s();
                        continue;
                    default:
                        if (poiGuidePopWindow.f39239id == null) {
                            poiGuidePopWindow.f39239id = "";
                        }
                        if (poiGuidePopWindow.title == null) {
                            poiGuidePopWindow.title = "";
                        }
                        if (poiGuidePopWindow.subTitle == null) {
                            poiGuidePopWindow.subTitle = "";
                        }
                        if (poiGuidePopWindow.icon == null) {
                            poiGuidePopWindow.icon = "";
                        }
                        if (poiGuidePopWindow.type == null) {
                            poiGuidePopWindow.type = (PoiGuidePopType) PoiGuidePopType.JSON_ADAPTER.defaultEnum();
                        }
                        if (poiGuidePopWindow.emotionGuides == null) {
                            poiGuidePopWindow.emotionGuides = new ArrayList();
                        }
                        if (poiGuidePopWindow.desc == null) {
                            poiGuidePopWindow.desc = "";
                        }
                        if (poiGuidePopWindow.emotionId == null) {
                            poiGuidePopWindow.emotionId = "";
                        }
                        if (poiGuidePopWindow.userPostType == null) {
                            poiGuidePopWindow.userPostType = "";
                            return poiGuidePopWindow;
                        }
                        break;
                }
            }
            return poiGuidePopWindow;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(PoiGuidePopWindow poiGuidePopWindow, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = poiGuidePopWindow.f39239id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = poiGuidePopWindow.title;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = poiGuidePopWindow.subTitle;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            String str4 = poiGuidePopWindow.icon;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(4, str4);
            }
            PoiGuidePopType poiGuidePopType = poiGuidePopWindow.type;
            if (poiGuidePopType != null) {
                codedOutputByteBufferNano.m17254K(5, poiGuidePopType, PoiGuidePopType.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17250G(6, poiGuidePopWindow.swipeLimit);
            codedOutputByteBufferNano.m17244A(7, poiGuidePopWindow.firstTimeShow);
            codedOutputByteBufferNano.m17250G(8, poiGuidePopWindow.intervalHours);
            List<PoiEmotionGuide> list = poiGuidePopWindow.emotionGuides;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(9, list, PoiEmotionGuide.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            MessageLocation messageLocation = poiGuidePopWindow.location;
            if (messageLocation != null) {
                codedOutputByteBufferNano.m17254K(10, messageLocation, MessageLocation.PROTOBUF_ADAPTER);
            }
            String str5 = poiGuidePopWindow.desc;
            if (str5 != null) {
                codedOutputByteBufferNano.m17261R(11, str5);
            }
            String str6 = poiGuidePopWindow.emotionId;
            if (str6 != null) {
                codedOutputByteBufferNano.m17261R(12, str6);
            }
            String str7 = poiGuidePopWindow.userPostType;
            if (str7 != null) {
                codedOutputByteBufferNano.m17261R(13, str7);
            }
        }
    };
    public static JsonAdapter<PoiGuidePopWindow> JSON_ADAPTER = new ObjectJsonAdapter<PoiGuidePopWindow>() { // from class: com.p1.mobile.putong.feed.data.PoiGuidePopWindow.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return PoiGuidePopWindow.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public PoiGuidePopWindow newInstance() {
            return new PoiGuidePopWindow();
        }

        public boolean parseField(PoiGuidePopWindow poiGuidePopWindow, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "subTitle":
                    poiGuidePopWindow.subTitle = jsonParser.getValueAsString();
                    return true;
                case "intervalHours":
                    poiGuidePopWindow.intervalHours = jsonParser.getValueAsInt();
                    return true;
                case "emotionGuides":
                    poiGuidePopWindow.emotionGuides = JsonAdapter.parseArray(jsonParser, PoiEmotionGuide.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "firstTimeShow":
                    poiGuidePopWindow.firstTimeShow = jsonParser.getValueAsBoolean();
                    return true;
                case "userPostType":
                    poiGuidePopWindow.userPostType = jsonParser.getValueAsString();
                    return true;
                case "id":
                    poiGuidePopWindow.f39239id = jsonParser.getValueAsString();
                    return false;
                case "desc":
                    poiGuidePopWindow.desc = jsonParser.getValueAsString();
                    return true;
                case "icon":
                    poiGuidePopWindow.icon = jsonParser.getValueAsString();
                    return true;
                case "type":
                    poiGuidePopWindow.type = PoiGuidePopType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "title":
                    poiGuidePopWindow.title = jsonParser.getValueAsString();
                    return true;
                case "swipeLimit":
                    poiGuidePopWindow.swipeLimit = jsonParser.getValueAsInt();
                    return true;
                case "location":
                    poiGuidePopWindow.location = MessageLocation.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "emotionId":
                    poiGuidePopWindow.emotionId = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(PoiGuidePopWindow poiGuidePopWindow, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "subTitle":
                case "intervalHours":
                case "emotionGuides":
                case "firstTimeShow":
                case "userPostType":
                    return true;
                case "id":
                    return false;
                case "desc":
                case "icon":
                case "type":
                case "title":
                case "swipeLimit":
                case "location":
                case "emotionId":
                    return true;
                default:
                    return super.parseFieldCheck(poiGuidePopWindow, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PoiGuidePopWindow poiGuidePopWindow, JsonGenerator jsonGenerator) throws IOException {
            String str = poiGuidePopWindow.f39239id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = poiGuidePopWindow.title;
            if (str2 != null) {
                jsonGenerator.writeStringField("title", str2);
            }
            String str3 = poiGuidePopWindow.subTitle;
            if (str3 != null) {
                jsonGenerator.writeStringField("subTitle", str3);
            }
            String str4 = poiGuidePopWindow.icon;
            if (str4 != null) {
                jsonGenerator.writeStringField("icon", str4);
            }
            if (poiGuidePopWindow.type != null) {
                jsonGenerator.writeFieldName("type");
                PoiGuidePopType.JSON_ADAPTER.serialize(poiGuidePopWindow.type, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("swipeLimit", poiGuidePopWindow.swipeLimit);
            jsonGenerator.writeBooleanField("firstTimeShow", poiGuidePopWindow.firstTimeShow);
            jsonGenerator.writeNumberField("intervalHours", poiGuidePopWindow.intervalHours);
            if (poiGuidePopWindow.emotionGuides != null) {
                jsonGenerator.writeFieldName("emotionGuides");
                JsonAdapter.serializeArray(poiGuidePopWindow.emotionGuides, jsonGenerator, PoiEmotionGuide.JSON_ADAPTER);
            }
            if (poiGuidePopWindow.location != null) {
                jsonGenerator.writeFieldName("location");
                MessageLocation.JSON_ADAPTER.serialize(poiGuidePopWindow.location, jsonGenerator, true);
            }
            String str5 = poiGuidePopWindow.desc;
            if (str5 != null) {
                jsonGenerator.writeStringField(SocialConstants.PARAM_APP_DESC, str5);
            }
            String str6 = poiGuidePopWindow.emotionId;
            if (str6 != null) {
                jsonGenerator.writeStringField("emotionId", str6);
            }
            String str7 = poiGuidePopWindow.userPostType;
            if (str7 != null) {
                jsonGenerator.writeStringField("userPostType", str7);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PoiGuidePopWindow) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PoiGuidePopWindow) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PoiGuidePopWindow new_() {
        PoiGuidePopWindow poiGuidePopWindow = new PoiGuidePopWindow();
        poiGuidePopWindow.nullCheck();
        return poiGuidePopWindow;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public PoiGuidePopWindow mo223809clone() {
        PoiGuidePopWindow poiGuidePopWindow = new PoiGuidePopWindow();
        poiGuidePopWindow.f39239id = this.f39239id;
        poiGuidePopWindow.title = this.title;
        poiGuidePopWindow.subTitle = this.subTitle;
        poiGuidePopWindow.icon = this.icon;
        poiGuidePopWindow.type = this.type;
        poiGuidePopWindow.swipeLimit = this.swipeLimit;
        poiGuidePopWindow.firstTimeShow = this.firstTimeShow;
        poiGuidePopWindow.intervalHours = this.intervalHours;
        List<PoiEmotionGuide> list = this.emotionGuides;
        if (list != null) {
            poiGuidePopWindow.emotionGuides = ValueObject.util_map(list, new w9j() { // from class: l.x980
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((PoiEmotionGuide) obj).mo223809clone();
                }
            });
        }
        MessageLocation messageLocation = this.location;
        if (messageLocation != null) {
            poiGuidePopWindow.location = messageLocation.mo223809clone();
        }
        poiGuidePopWindow.desc = this.desc;
        poiGuidePopWindow.emotionId = this.emotionId;
        poiGuidePopWindow.userPostType = this.userPostType;
        return poiGuidePopWindow;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PoiGuidePopWindow)) {
            return false;
        }
        PoiGuidePopWindow poiGuidePopWindow = (PoiGuidePopWindow) obj;
        return ValueObject.util_equals(this.f39239id, poiGuidePopWindow.f39239id) && ValueObject.util_equals(this.title, poiGuidePopWindow.title) && ValueObject.util_equals(this.subTitle, poiGuidePopWindow.subTitle) && ValueObject.util_equals(this.icon, poiGuidePopWindow.icon) && ValueObject.util_equals(this.type, poiGuidePopWindow.type) && this.swipeLimit == poiGuidePopWindow.swipeLimit && this.firstTimeShow == poiGuidePopWindow.firstTimeShow && this.intervalHours == poiGuidePopWindow.intervalHours && ValueObject.util_equals(this.emotionGuides, poiGuidePopWindow.emotionGuides) && ValueObject.util_equals(this.location, poiGuidePopWindow.location) && ValueObject.util_equals(this.desc, poiGuidePopWindow.desc) && ValueObject.util_equals(this.emotionId, poiGuidePopWindow.emotionId) && ValueObject.util_equals(this.userPostType, poiGuidePopWindow.userPostType);
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
        String str = this.f39239id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.subTitle;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.icon;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        PoiGuidePopType poiGuidePopType = this.type;
        int iHashCode5 = (((((((iHashCode4 + (poiGuidePopType != null ? poiGuidePopType.hashCode() : 0)) * 41) + this.swipeLimit) * 41) + (this.firstTimeShow ? 1231 : 1237)) * 41) + this.intervalHours) * 41;
        List<PoiEmotionGuide> list = this.emotionGuides;
        int iHashCode6 = (iHashCode5 + (list != null ? list.hashCode() : 0)) * 41;
        MessageLocation messageLocation = this.location;
        int iHashCode7 = (iHashCode6 + (messageLocation != null ? messageLocation.hashCode() : 0)) * 41;
        String str5 = this.desc;
        int iHashCode8 = (iHashCode7 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.emotionId;
        int iHashCode9 = (iHashCode8 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.userPostType;
        int iHashCode10 = iHashCode9 + (str7 != null ? str7.hashCode() : 0);
        this.hashCode = iHashCode10;
        return iHashCode10;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f39239id == null) {
            this.f39239id = "";
        }
        if (this.title == null) {
            this.title = "";
        }
        if (this.subTitle == null) {
            this.subTitle = "";
        }
        if (this.icon == null) {
            this.icon = "";
        }
        if (this.type == null) {
            this.type = (PoiGuidePopType) PoiGuidePopType.JSON_ADAPTER.defaultEnum();
        }
        if (this.emotionGuides == null) {
            this.emotionGuides = new ArrayList();
        }
        if (this.desc == null) {
            this.desc = "";
        }
        if (this.emotionId == null) {
            this.emotionId = "";
        }
        if (this.userPostType == null) {
            this.userPostType = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
