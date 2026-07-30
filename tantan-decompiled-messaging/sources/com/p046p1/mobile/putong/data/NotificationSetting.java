package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.alibaba.fastjson.asm.Opcodes;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.MomentNotifyBlockType;
import com.p046p1.mobile.putong.data.NotificationSetting;
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
public class NotificationSetting extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "notificationsetting";

    @ProtobufIndex(index = 12)
    public boolean chatPartners;

    @ProtobufIndex(index = 2)
    public boolean conversation;

    @ProtobufIndex(index = 9)
    public boolean extremePick;

    @ProtobufIndex(index = 3)
    public boolean greeting;

    @ProtobufIndex(index = 11)
    public boolean group;

    @ProtobufIndex(index = 1)
    public boolean match;

    @NonNull
    @ProtobufIndex(index = 6)
    public List<MomentNotifyBlockType> momentComment;

    @NonNull
    @ProtobufIndex(index = 7)
    public List<MomentNotifyBlockType> momentLike;

    @ProtobufIndex(index = 8)
    public boolean momentLiked;

    @NonNull
    @ProtobufIndex(index = 5)
    public List<MomentNotifyBlockType> momentUpdate;

    @ProtobufIndex(index = 10)
    public boolean status;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<String> teamAccount;
    public static ProtobufAdapter<NotificationSetting> PROTOBUF_ADAPTER = new MessageNanoAdapter<NotificationSetting>() { // from class: com.p1.mobile.putong.data.NotificationSetting.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(NotificationSetting notificationSetting) {
            int iM17220b = CodedOutputByteBufferNano.m17220b(1, notificationSetting.match) + CodedOutputByteBufferNano.m17220b(2, notificationSetting.conversation) + CodedOutputByteBufferNano.m17220b(3, notificationSetting.greeting);
            List<String> list = notificationSetting.teamAccount;
            if (list != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(4, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<MomentNotifyBlockType> list2 = notificationSetting.momentUpdate;
            if (list2 != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(5, list2, MomentNotifyBlockType.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<MomentNotifyBlockType> list3 = notificationSetting.momentComment;
            if (list3 != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(6, list3, MomentNotifyBlockType.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<MomentNotifyBlockType> list4 = notificationSetting.momentLike;
            if (list4 != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(7, list4, MomentNotifyBlockType.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            int iM17220b2 = iM17220b + CodedOutputByteBufferNano.m17220b(8, notificationSetting.momentLiked) + CodedOutputByteBufferNano.m17220b(9, notificationSetting.extremePick) + CodedOutputByteBufferNano.m17220b(10, notificationSetting.status) + CodedOutputByteBufferNano.m17220b(11, notificationSetting.group) + CodedOutputByteBufferNano.m17220b(12, notificationSetting.chatPartners);
            notificationSetting.cachedSize = iM17220b2;
            return iM17220b2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public NotificationSetting parse(nb5 nb5Var) throws IOException {
            NotificationSetting notificationSetting = new NotificationSetting();
            while (true) {
                switch (nb5Var.m158752u()) {
                    case 0:
                        if (notificationSetting.teamAccount == null) {
                            notificationSetting.teamAccount = new ArrayList();
                        }
                        if (notificationSetting.momentUpdate == null) {
                            notificationSetting.momentUpdate = new ArrayList();
                        }
                        if (notificationSetting.momentComment == null) {
                            notificationSetting.momentComment = new ArrayList();
                        }
                        if (notificationSetting.momentLike == null) {
                            notificationSetting.momentLike = new ArrayList();
                        }
                        break;
                    case 8:
                        notificationSetting.match = nb5Var.m158738g();
                        continue;
                    case 16:
                        notificationSetting.conversation = nb5Var.m158738g();
                        continue;
                    case 24:
                        notificationSetting.greeting = nb5Var.m158738g();
                        continue;
                    case 34:
                        notificationSetting.teamAccount = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 42:
                        notificationSetting.momentUpdate = (List) nb5Var.m158743l(MomentNotifyBlockType.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 50:
                        notificationSetting.momentComment = (List) nb5Var.m158743l(MomentNotifyBlockType.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 58:
                        notificationSetting.momentLike = (List) nb5Var.m158743l(MomentNotifyBlockType.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 64:
                        notificationSetting.momentLiked = nb5Var.m158738g();
                        continue;
                    case 72:
                        notificationSetting.extremePick = nb5Var.m158738g();
                        continue;
                    case 80:
                        notificationSetting.status = nb5Var.m158738g();
                        continue;
                    case 88:
                        notificationSetting.group = nb5Var.m158738g();
                        continue;
                    case Opcodes.IADD /* 96 */:
                        notificationSetting.chatPartners = nb5Var.m158738g();
                        continue;
                    default:
                        if (notificationSetting.teamAccount == null) {
                            notificationSetting.teamAccount = new ArrayList();
                        }
                        if (notificationSetting.momentUpdate == null) {
                            notificationSetting.momentUpdate = new ArrayList();
                        }
                        if (notificationSetting.momentComment == null) {
                            notificationSetting.momentComment = new ArrayList();
                        }
                        if (notificationSetting.momentLike == null) {
                            notificationSetting.momentLike = new ArrayList();
                            return notificationSetting;
                        }
                        break;
                }
            }
            return notificationSetting;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(NotificationSetting notificationSetting, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17244A(1, notificationSetting.match);
            codedOutputByteBufferNano.m17244A(2, notificationSetting.conversation);
            codedOutputByteBufferNano.m17244A(3, notificationSetting.greeting);
            List<String> list = notificationSetting.teamAccount;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(4, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<MomentNotifyBlockType> list2 = notificationSetting.momentUpdate;
            if (list2 != null) {
                codedOutputByteBufferNano.m17254K(5, list2, MomentNotifyBlockType.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<MomentNotifyBlockType> list3 = notificationSetting.momentComment;
            if (list3 != null) {
                codedOutputByteBufferNano.m17254K(6, list3, MomentNotifyBlockType.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<MomentNotifyBlockType> list4 = notificationSetting.momentLike;
            if (list4 != null) {
                codedOutputByteBufferNano.m17254K(7, list4, MomentNotifyBlockType.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17244A(8, notificationSetting.momentLiked);
            codedOutputByteBufferNano.m17244A(9, notificationSetting.extremePick);
            codedOutputByteBufferNano.m17244A(10, notificationSetting.status);
            codedOutputByteBufferNano.m17244A(11, notificationSetting.group);
            codedOutputByteBufferNano.m17244A(12, notificationSetting.chatPartners);
        }
    };
    public static JsonAdapter<NotificationSetting> JSON_ADAPTER = new ObjectJsonAdapter<NotificationSetting>() { // from class: com.p1.mobile.putong.data.NotificationSetting.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return NotificationSetting.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public NotificationSetting newInstance() {
            return new NotificationSetting();
        }

        public boolean parseField(NotificationSetting notificationSetting, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "chatPartners":
                    notificationSetting.chatPartners = jsonParser.getValueAsBoolean();
                    return true;
                case "momentUpdate":
                    notificationSetting.momentUpdate = JsonAdapter.parseArray(jsonParser, MomentNotifyBlockType.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "status":
                    notificationSetting.status = jsonParser.getValueAsBoolean();
                    return true;
                case "momentLiked":
                    notificationSetting.momentLiked = jsonParser.getValueAsBoolean();
                    return true;
                case "group":
                    notificationSetting.group = jsonParser.getValueAsBoolean();
                    return true;
                case "match":
                    notificationSetting.match = jsonParser.getValueAsBoolean();
                    return true;
                case "greeting":
                    notificationSetting.greeting = jsonParser.getValueAsBoolean();
                    return true;
                case "momentComment":
                    notificationSetting.momentComment = JsonAdapter.parseArray(jsonParser, MomentNotifyBlockType.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "momentLike":
                    notificationSetting.momentLike = JsonAdapter.parseArray(jsonParser, MomentNotifyBlockType.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "conversation":
                    notificationSetting.conversation = jsonParser.getValueAsBoolean();
                    return true;
                case "extremePick":
                    notificationSetting.extremePick = jsonParser.getValueAsBoolean();
                    return true;
                case "teamAccount":
                    notificationSetting.teamAccount = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(NotificationSetting notificationSetting, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "chatPartners":
                case "momentUpdate":
                case "status":
                case "momentLiked":
                case "group":
                case "match":
                case "greeting":
                case "momentComment":
                case "momentLike":
                case "conversation":
                case "extremePick":
                case "teamAccount":
                    return true;
                default:
                    return super.parseFieldCheck(notificationSetting, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(NotificationSetting notificationSetting, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("match", notificationSetting.match);
            jsonGenerator.writeBooleanField("conversation", notificationSetting.conversation);
            jsonGenerator.writeBooleanField("greeting", notificationSetting.greeting);
            if (notificationSetting.teamAccount != null) {
                jsonGenerator.writeFieldName("teamAccount");
                JsonAdapter.serializeArray(notificationSetting.teamAccount, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (notificationSetting.momentUpdate != null) {
                jsonGenerator.writeFieldName("momentUpdate");
                JsonAdapter.serializeArray(notificationSetting.momentUpdate, jsonGenerator, MomentNotifyBlockType.JSON_ADAPTER);
            }
            if (notificationSetting.momentComment != null) {
                jsonGenerator.writeFieldName("momentComment");
                JsonAdapter.serializeArray(notificationSetting.momentComment, jsonGenerator, MomentNotifyBlockType.JSON_ADAPTER);
            }
            if (notificationSetting.momentLike != null) {
                jsonGenerator.writeFieldName("momentLike");
                JsonAdapter.serializeArray(notificationSetting.momentLike, jsonGenerator, MomentNotifyBlockType.JSON_ADAPTER);
            }
            jsonGenerator.writeBooleanField("momentLiked", notificationSetting.momentLiked);
            jsonGenerator.writeBooleanField("extremePick", notificationSetting.extremePick);
            jsonGenerator.writeBooleanField(NotificationCompat.CATEGORY_STATUS, notificationSetting.status);
            jsonGenerator.writeBooleanField("group", notificationSetting.group);
            jsonGenerator.writeBooleanField("chatPartners", notificationSetting.chatPartners);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((NotificationSetting) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((NotificationSetting) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ MomentNotifyBlockType m59875a(MomentNotifyBlockType momentNotifyBlockType) {
        return momentNotifyBlockType;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ MomentNotifyBlockType m59876b(MomentNotifyBlockType momentNotifyBlockType) {
        return momentNotifyBlockType;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m59877c(String str) {
        return str;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ MomentNotifyBlockType m59878d(MomentNotifyBlockType momentNotifyBlockType) {
        return momentNotifyBlockType;
    }

    public static NotificationSetting new_() {
        NotificationSetting notificationSetting = new NotificationSetting();
        notificationSetting.nullCheck();
        return notificationSetting;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public NotificationSetting mo223809clone() {
        NotificationSetting notificationSetting = new NotificationSetting();
        notificationSetting.match = this.match;
        notificationSetting.conversation = this.conversation;
        notificationSetting.greeting = this.greeting;
        List<String> list = this.teamAccount;
        if (list != null) {
            notificationSetting.teamAccount = ValueObject.util_map(list, new w9j() { // from class: l.kt40
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return NotificationSetting.m59877c((String) obj);
                }
            });
        }
        List<MomentNotifyBlockType> list2 = this.momentUpdate;
        if (list2 != null) {
            notificationSetting.momentUpdate = ValueObject.util_map(list2, new w9j() { // from class: l.lt40
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return NotificationSetting.m59875a((MomentNotifyBlockType) obj);
                }
            });
        }
        List<MomentNotifyBlockType> list3 = this.momentComment;
        if (list3 != null) {
            notificationSetting.momentComment = ValueObject.util_map(list3, new w9j() { // from class: l.mt40
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return NotificationSetting.m59878d((MomentNotifyBlockType) obj);
                }
            });
        }
        List<MomentNotifyBlockType> list4 = this.momentLike;
        if (list4 != null) {
            notificationSetting.momentLike = ValueObject.util_map(list4, new w9j() { // from class: l.nt40
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return NotificationSetting.m59876b((MomentNotifyBlockType) obj);
                }
            });
        }
        notificationSetting.momentLiked = this.momentLiked;
        notificationSetting.extremePick = this.extremePick;
        notificationSetting.status = this.status;
        notificationSetting.group = this.group;
        notificationSetting.chatPartners = this.chatPartners;
        return notificationSetting;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NotificationSetting)) {
            return false;
        }
        NotificationSetting notificationSetting = (NotificationSetting) obj;
        return this.match == notificationSetting.match && this.conversation == notificationSetting.conversation && this.greeting == notificationSetting.greeting && ValueObject.util_equals(this.teamAccount, notificationSetting.teamAccount) && ValueObject.util_equals(this.momentUpdate, notificationSetting.momentUpdate) && ValueObject.util_equals(this.momentComment, notificationSetting.momentComment) && ValueObject.util_equals(this.momentLike, notificationSetting.momentLike) && this.momentLiked == notificationSetting.momentLiked && this.extremePick == notificationSetting.extremePick && this.status == notificationSetting.status && this.group == notificationSetting.group && this.chatPartners == notificationSetting.chatPartners;
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
        int i2 = ((((((i * 41) + (this.match ? 1231 : 1237)) * 41) + (this.conversation ? 1231 : 1237)) * 41) + (this.greeting ? 1231 : 1237)) * 41;
        List<String> list = this.teamAccount;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<MomentNotifyBlockType> list2 = this.momentUpdate;
        int iHashCode2 = (iHashCode + (list2 != null ? list2.hashCode() : 0)) * 41;
        List<MomentNotifyBlockType> list3 = this.momentComment;
        int iHashCode3 = (iHashCode2 + (list3 != null ? list3.hashCode() : 0)) * 41;
        List<MomentNotifyBlockType> list4 = this.momentLike;
        int iHashCode4 = ((((((((((iHashCode3 + (list4 != null ? list4.hashCode() : 0)) * 41) + (this.momentLiked ? 1231 : 1237)) * 41) + (this.extremePick ? 1231 : 1237)) * 41) + (this.status ? 1231 : 1237)) * 41) + (this.group ? 1231 : 1237)) * 41) + (this.chatPartners ? 1231 : 1237);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.teamAccount == null) {
            this.teamAccount = new ArrayList();
        }
        if (this.momentUpdate == null) {
            this.momentUpdate = new ArrayList();
        }
        if (this.momentComment == null) {
            this.momentComment = new ArrayList();
        }
        if (this.momentLike == null) {
            this.momentLike = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
