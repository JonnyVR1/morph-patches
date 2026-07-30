package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.MessageMomentGuide;
import com.p046p1.mobile.putong.data.Converter;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import com.tencent.connect.share.QzonePublish;
import com.tencent.open.SocialConstants;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes10.dex */
public class MessageMomentGuide extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "messagemomentguide";

    @NonNull
    @ProtobufIndex(index = 7)
    public String audioDuration;

    @ProtobufIndex(index = 3)
    public double createdTime;

    @NonNull
    @ProtobufIndex(index = 6)
    public String desc;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f20446id;

    @NonNull
    @ProtobufIndex(index = 5)
    public List<String> imageUrlList;

    @NonNull
    @ProtobufIndex(index = 2)
    public String ownerId;

    @ProtobufIndex(index = 4)
    public int type;

    @NonNull
    @ProtobufIndex(index = 8)
    public String videoDuration;
    public static ProtobufAdapter<MessageMomentGuide> PROTOBUF_ADAPTER = new MessageNanoAdapter<MessageMomentGuide>() { // from class: com.p1.mobile.putong.core.data.MessageMomentGuide.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MessageMomentGuide messageMomentGuide) {
            String str = messageMomentGuide.f20446id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = messageMomentGuide.ownerId;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            int iM17222d = iM17233o + CodedOutputByteBufferNano.m17222d(3, messageMomentGuide.createdTime) + CodedOutputByteBufferNano.m17226h(4, messageMomentGuide.type);
            List<String> list = messageMomentGuide.imageUrlList;
            if (list != null) {
                iM17222d += CodedOutputByteBufferNano.m17230l(5, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str3 = messageMomentGuide.desc;
            if (str3 != null) {
                iM17222d += CodedOutputByteBufferNano.m17233o(6, str3);
            }
            String str4 = messageMomentGuide.audioDuration;
            if (str4 != null) {
                iM17222d += CodedOutputByteBufferNano.m17233o(7, str4);
            }
            String str5 = messageMomentGuide.videoDuration;
            if (str5 != null) {
                iM17222d += CodedOutputByteBufferNano.m17233o(8, str5);
            }
            messageMomentGuide.cachedSize = iM17222d;
            return iM17222d;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MessageMomentGuide parse(nb5 nb5Var) throws IOException {
            MessageMomentGuide messageMomentGuide = new MessageMomentGuide();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (messageMomentGuide.f20446id == null) {
                        messageMomentGuide.f20446id = "";
                    }
                    if (messageMomentGuide.ownerId == null) {
                        messageMomentGuide.ownerId = "";
                    }
                    if (messageMomentGuide.imageUrlList == null) {
                        messageMomentGuide.imageUrlList = new ArrayList();
                    }
                    if (messageMomentGuide.desc == null) {
                        messageMomentGuide.desc = "";
                    }
                    if (messageMomentGuide.audioDuration == null) {
                        messageMomentGuide.audioDuration = "";
                    }
                    if (messageMomentGuide.videoDuration != null) {
                        break;
                    }
                    messageMomentGuide.videoDuration = "";
                    break;
                }
                if (iM158752u == 10) {
                    messageMomentGuide.f20446id = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    messageMomentGuide.ownerId = nb5Var.m158750s();
                } else if (iM158752u == 25) {
                    messageMomentGuide.createdTime = nb5Var.m158739h();
                } else if (iM158752u == 32) {
                    messageMomentGuide.type = nb5Var.m158741j();
                } else if (iM158752u == 42) {
                    messageMomentGuide.imageUrlList = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iM158752u == 50) {
                    messageMomentGuide.desc = nb5Var.m158750s();
                } else if (iM158752u == 58) {
                    messageMomentGuide.audioDuration = nb5Var.m158750s();
                } else {
                    if (iM158752u != 66) {
                        if (messageMomentGuide.f20446id == null) {
                            messageMomentGuide.f20446id = "";
                        }
                        if (messageMomentGuide.ownerId == null) {
                            messageMomentGuide.ownerId = "";
                        }
                        if (messageMomentGuide.imageUrlList == null) {
                            messageMomentGuide.imageUrlList = new ArrayList();
                        }
                        if (messageMomentGuide.desc == null) {
                            messageMomentGuide.desc = "";
                        }
                        if (messageMomentGuide.audioDuration == null) {
                            messageMomentGuide.audioDuration = "";
                        }
                        if (messageMomentGuide.videoDuration != null) {
                            break;
                        }
                        messageMomentGuide.videoDuration = "";
                        return messageMomentGuide;
                    }
                    messageMomentGuide.videoDuration = nb5Var.m158750s();
                }
            }
            return messageMomentGuide;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MessageMomentGuide messageMomentGuide, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = messageMomentGuide.f20446id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = messageMomentGuide.ownerId;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            codedOutputByteBufferNano.m17246C(3, messageMomentGuide.createdTime);
            codedOutputByteBufferNano.m17250G(4, messageMomentGuide.type);
            List<String> list = messageMomentGuide.imageUrlList;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(5, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str3 = messageMomentGuide.desc;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(6, str3);
            }
            String str4 = messageMomentGuide.audioDuration;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(7, str4);
            }
            String str5 = messageMomentGuide.videoDuration;
            if (str5 != null) {
                codedOutputByteBufferNano.m17261R(8, str5);
            }
        }
    };
    public static JsonAdapter<MessageMomentGuide> JSON_ADAPTER = new ObjectJsonAdapter<MessageMomentGuide>() { // from class: com.p1.mobile.putong.core.data.MessageMomentGuide.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MessageMomentGuide.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MessageMomentGuide newInstance() {
            return new MessageMomentGuide();
        }

        public boolean parseField(MessageMomentGuide messageMomentGuide, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "ownerId":
                    messageMomentGuide.ownerId = jsonParser.getValueAsString();
                    return true;
                case "createdTime":
                    messageMomentGuide.createdTime = Converter.API_TIME.parse(jsonParser, str2).doubleValue();
                    return true;
                case "id":
                    messageMomentGuide.f20446id = jsonParser.getValueAsString();
                    return false;
                case "desc":
                    messageMomentGuide.desc = jsonParser.getValueAsString();
                    return true;
                case "type":
                    messageMomentGuide.type = jsonParser.getValueAsInt();
                    return true;
                case "audioDuration":
                    messageMomentGuide.audioDuration = jsonParser.getValueAsString();
                    return true;
                case "imageUrlList":
                    messageMomentGuide.imageUrlList = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "videoDuration":
                    messageMomentGuide.videoDuration = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MessageMomentGuide messageMomentGuide, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "ownerId":
                case "createdTime":
                    return true;
                case "id":
                    return false;
                case "desc":
                case "type":
                case "audioDuration":
                case "imageUrlList":
                case "videoDuration":
                    return true;
                default:
                    return super.parseFieldCheck(messageMomentGuide, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MessageMomentGuide messageMomentGuide, JsonGenerator jsonGenerator) throws IOException {
            String str = messageMomentGuide.f20446id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = messageMomentGuide.ownerId;
            if (str2 != null) {
                jsonGenerator.writeStringField("ownerId", str2);
            }
            jsonGenerator.writeFieldName("createdTime");
            Converter.API_TIME.serialize(Double.valueOf(messageMomentGuide.createdTime), jsonGenerator, true);
            jsonGenerator.writeNumberField("type", messageMomentGuide.type);
            if (messageMomentGuide.imageUrlList != null) {
                jsonGenerator.writeFieldName("imageUrlList");
                JsonAdapter.serializeArray(messageMomentGuide.imageUrlList, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str3 = messageMomentGuide.desc;
            if (str3 != null) {
                jsonGenerator.writeStringField(SocialConstants.PARAM_APP_DESC, str3);
            }
            String str4 = messageMomentGuide.audioDuration;
            if (str4 != null) {
                jsonGenerator.writeStringField("audioDuration", str4);
            }
            String str5 = messageMomentGuide.videoDuration;
            if (str5 != null) {
                jsonGenerator.writeStringField(QzonePublish.PUBLISH_TO_QZONE_VIDEO_DURATION, str5);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MessageMomentGuide) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MessageMomentGuide) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m35685a(String str) {
        return str;
    }

    public static MessageMomentGuide new_() {
        MessageMomentGuide messageMomentGuide = new MessageMomentGuide();
        messageMomentGuide.nullCheck();
        return messageMomentGuide;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MessageMomentGuide mo223809clone() {
        MessageMomentGuide messageMomentGuide = new MessageMomentGuide();
        messageMomentGuide.f20446id = this.f20446id;
        messageMomentGuide.ownerId = this.ownerId;
        messageMomentGuide.createdTime = this.createdTime;
        messageMomentGuide.type = this.type;
        List<String> list = this.imageUrlList;
        if (list != null) {
            messageMomentGuide.imageUrlList = ValueObject.util_map(list, new w9j() { // from class: l.psz
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return MessageMomentGuide.m35685a((String) obj);
                }
            });
        }
        messageMomentGuide.desc = this.desc;
        messageMomentGuide.audioDuration = this.audioDuration;
        messageMomentGuide.videoDuration = this.videoDuration;
        return messageMomentGuide;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MessageMomentGuide)) {
            return false;
        }
        MessageMomentGuide messageMomentGuide = (MessageMomentGuide) obj;
        return ValueObject.util_equals(this.f20446id, messageMomentGuide.f20446id) && ValueObject.util_equals(this.ownerId, messageMomentGuide.ownerId) && this.createdTime == messageMomentGuide.createdTime && this.type == messageMomentGuide.type && ValueObject.util_equals(this.imageUrlList, messageMomentGuide.imageUrlList) && ValueObject.util_equals(this.desc, messageMomentGuide.desc) && ValueObject.util_equals(this.audioDuration, messageMomentGuide.audioDuration) && ValueObject.util_equals(this.videoDuration, messageMomentGuide.videoDuration);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public String getDefaultContent() {
        int i = this.type;
        if (i == 2) {
            return "视频动态";
        }
        if (i == 1) {
            return "图文动态";
        }
        return i == 4 ? "语音动态" : "动态";
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.f20446id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.ownerId;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        long jDoubleToLongBits = Double.doubleToLongBits(this.createdTime);
        int i3 = (((((iHashCode + iHashCode2) * 41) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 41) + this.type) * 41;
        List<String> list = this.imageUrlList;
        int iHashCode3 = (i3 + (list != null ? list.hashCode() : 0)) * 41;
        String str3 = this.desc;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.audioDuration;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.videoDuration;
        int iHashCode6 = iHashCode5 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f20446id == null) {
            this.f20446id = "";
        }
        if (this.ownerId == null) {
            this.ownerId = "";
        }
        if (this.imageUrlList == null) {
            this.imageUrlList = new ArrayList();
        }
        if (this.desc == null) {
            this.desc = "";
        }
        if (this.audioDuration == null) {
            this.audioDuration = "";
        }
        if (this.videoDuration == null) {
            this.videoDuration = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
