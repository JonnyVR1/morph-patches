package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.LiveActivityConversationAnchor;
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
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes12.dex */
public class LiveActivityConversation extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "liveactivityconversation";

    @NonNull
    @ProtobufIndex(index = 7)
    public List<LiveActivityConversationAnchor> activities;

    @ProtobufIndex(index = 6)
    public boolean enterLiveActivity;

    @ProtobufIndex(index = 4)
    public boolean show;

    @ProtobufIndex(index = 3)
    public long startTime;

    @NonNull
    @ProtobufIndex(index = 2)
    public String subTitle;

    @NonNull
    @ProtobufIndex(index = 1)
    public String title;

    @ProtobufIndex(index = 5)
    public int unreadCount;
    public static ProtobufAdapter<LiveActivityConversation> PROTOBUF_ADAPTER = new MessageNanoAdapter<LiveActivityConversation>() { // from class: com.p1.mobile.putong.data.LiveActivityConversation.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LiveActivityConversation liveActivityConversation) {
            String str = liveActivityConversation.title;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = liveActivityConversation.subTitle;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            int iM17228j = iM17233o + CodedOutputByteBufferNano.m17228j(3, liveActivityConversation.startTime) + CodedOutputByteBufferNano.m17220b(4, liveActivityConversation.show) + CodedOutputByteBufferNano.m17226h(5, liveActivityConversation.unreadCount) + CodedOutputByteBufferNano.m17220b(6, liveActivityConversation.enterLiveActivity);
            List<LiveActivityConversationAnchor> list = liveActivityConversation.activities;
            if (list != null) {
                iM17228j += CodedOutputByteBufferNano.m17230l(7, list, LiveActivityConversationAnchor.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            liveActivityConversation.cachedSize = iM17228j;
            return iM17228j;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LiveActivityConversation parse(nb5 nb5Var) throws IOException {
            LiveActivityConversation liveActivityConversation = new LiveActivityConversation();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (liveActivityConversation.title == null) {
                        liveActivityConversation.title = "";
                    }
                    if (liveActivityConversation.subTitle == null) {
                        liveActivityConversation.subTitle = "";
                    }
                    if (liveActivityConversation.activities != null) {
                        break;
                    }
                    liveActivityConversation.activities = new ArrayList();
                    break;
                }
                if (iM158752u == 10) {
                    liveActivityConversation.title = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    liveActivityConversation.subTitle = nb5Var.m158750s();
                } else if (iM158752u == 24) {
                    liveActivityConversation.startTime = nb5Var.m158742k();
                } else if (iM158752u == 32) {
                    liveActivityConversation.show = nb5Var.m158738g();
                } else if (iM158752u == 40) {
                    liveActivityConversation.unreadCount = nb5Var.m158741j();
                } else if (iM158752u == 48) {
                    liveActivityConversation.enterLiveActivity = nb5Var.m158738g();
                } else {
                    if (iM158752u != 58) {
                        if (liveActivityConversation.title == null) {
                            liveActivityConversation.title = "";
                        }
                        if (liveActivityConversation.subTitle == null) {
                            liveActivityConversation.subTitle = "";
                        }
                        if (liveActivityConversation.activities != null) {
                            break;
                        }
                        liveActivityConversation.activities = new ArrayList();
                        return liveActivityConversation;
                    }
                    liveActivityConversation.activities = (List) nb5Var.m158743l(LiveActivityConversationAnchor.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return liveActivityConversation;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LiveActivityConversation liveActivityConversation, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = liveActivityConversation.title;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = liveActivityConversation.subTitle;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            codedOutputByteBufferNano.m17252I(3, liveActivityConversation.startTime);
            codedOutputByteBufferNano.m17244A(4, liveActivityConversation.show);
            codedOutputByteBufferNano.m17250G(5, liveActivityConversation.unreadCount);
            codedOutputByteBufferNano.m17244A(6, liveActivityConversation.enterLiveActivity);
            List<LiveActivityConversationAnchor> list = liveActivityConversation.activities;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(7, list, LiveActivityConversationAnchor.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<LiveActivityConversation> JSON_ADAPTER = new ObjectJsonAdapter<LiveActivityConversation>() { // from class: com.p1.mobile.putong.data.LiveActivityConversation.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LiveActivityConversation.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LiveActivityConversation newInstance() {
            return new LiveActivityConversation();
        }

        public boolean parseField(LiveActivityConversation liveActivityConversation, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "startTime":
                    liveActivityConversation.startTime = jsonParser.getValueAsLong();
                    return true;
                case "subTitle":
                    liveActivityConversation.subTitle = jsonParser.getValueAsString();
                    return true;
                case "unreadCount":
                    liveActivityConversation.unreadCount = jsonParser.getValueAsInt();
                    return true;
                case "enterLiveActivity":
                    liveActivityConversation.enterLiveActivity = jsonParser.getValueAsBoolean();
                    return true;
                case "show":
                    liveActivityConversation.show = jsonParser.getValueAsBoolean();
                    return true;
                case "title":
                    liveActivityConversation.title = jsonParser.getValueAsString();
                    return true;
                case "activities":
                    liveActivityConversation.activities = JsonAdapter.parseArray(jsonParser, LiveActivityConversationAnchor.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(LiveActivityConversation liveActivityConversation, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "startTime":
                case "subTitle":
                case "unreadCount":
                case "enterLiveActivity":
                case "show":
                case "title":
                case "activities":
                    return true;
                default:
                    return super.parseFieldCheck(liveActivityConversation, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LiveActivityConversation liveActivityConversation, JsonGenerator jsonGenerator) throws IOException {
            String str = liveActivityConversation.title;
            if (str != null) {
                jsonGenerator.writeStringField("title", str);
            }
            String str2 = liveActivityConversation.subTitle;
            if (str2 != null) {
                jsonGenerator.writeStringField("subTitle", str2);
            }
            jsonGenerator.writeNumberField(StudentVerRejectedReason.startTime, liveActivityConversation.startTime);
            jsonGenerator.writeBooleanField("show", liveActivityConversation.show);
            jsonGenerator.writeNumberField("unreadCount", liveActivityConversation.unreadCount);
            jsonGenerator.writeBooleanField("enterLiveActivity", liveActivityConversation.enterLiveActivity);
            if (liveActivityConversation.activities != null) {
                jsonGenerator.writeFieldName("activities");
                JsonAdapter.serializeArray(liveActivityConversation.activities, jsonGenerator, LiveActivityConversationAnchor.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LiveActivityConversation) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LiveActivityConversation) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LiveActivityConversation new_() {
        LiveActivityConversation liveActivityConversation = new LiveActivityConversation();
        liveActivityConversation.nullCheck();
        return liveActivityConversation;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LiveActivityConversation mo223809clone() {
        LiveActivityConversation liveActivityConversation = new LiveActivityConversation();
        liveActivityConversation.title = this.title;
        liveActivityConversation.subTitle = this.subTitle;
        liveActivityConversation.startTime = this.startTime;
        liveActivityConversation.show = this.show;
        liveActivityConversation.unreadCount = this.unreadCount;
        liveActivityConversation.enterLiveActivity = this.enterLiveActivity;
        List<LiveActivityConversationAnchor> list = this.activities;
        if (list != null) {
            liveActivityConversation.activities = ValueObject.util_map(list, new w9j() { // from class: l.gsr
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((LiveActivityConversationAnchor) obj).mo223809clone();
                }
            });
        }
        return liveActivityConversation;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LiveActivityConversation)) {
            return false;
        }
        LiveActivityConversation liveActivityConversation = (LiveActivityConversation) obj;
        return ValueObject.util_equals(this.title, liveActivityConversation.title) && ValueObject.util_equals(this.subTitle, liveActivityConversation.subTitle) && this.startTime == liveActivityConversation.startTime && this.show == liveActivityConversation.show && this.unreadCount == liveActivityConversation.unreadCount && this.enterLiveActivity == liveActivityConversation.enterLiveActivity && ValueObject.util_equals(this.activities, liveActivityConversation.activities);
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
        String str = this.title;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.subTitle;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        long j = this.startTime;
        int i3 = (((((((((iHashCode + iHashCode2) * 41) + ((int) (j ^ (j >>> 32)))) * 41) + (this.show ? 1231 : 1237)) * 41) + this.unreadCount) * 41) + (this.enterLiveActivity ? 1231 : 1237)) * 41;
        List<LiveActivityConversationAnchor> list = this.activities;
        int iHashCode3 = i3 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
        if (this.subTitle == null) {
            this.subTitle = "";
        }
        if (this.activities == null) {
            this.activities = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
