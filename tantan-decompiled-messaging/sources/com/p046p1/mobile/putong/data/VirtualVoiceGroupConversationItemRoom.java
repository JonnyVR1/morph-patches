package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.VirtualVoiceGroupConversationItemRoom;
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
public class VirtualVoiceGroupConversationItemRoom extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "virtualvoicegroupconversationitemroom";

    @NonNull
    @ProtobufIndex(index = 9)
    public String anchorId;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<String> avatars;

    @ProtobufIndex(index = 8)
    public boolean isLiving;

    @NonNull
    @ProtobufIndex(index = 4)
    public String liveId;

    @ProtobufIndex(index = 5)
    public int memberCount;

    @NonNull
    @ProtobufIndex(index = 1)
    public String roomId;

    @NonNull
    @ProtobufIndex(index = 6)
    public String roomStateText;

    @NonNull
    @ProtobufIndex(index = 7)
    public String roomStateTextColor;

    @NonNull
    @ProtobufIndex(index = 2)
    public String title;
    public static ProtobufAdapter<VirtualVoiceGroupConversationItemRoom> PROTOBUF_ADAPTER = new MessageNanoAdapter<VirtualVoiceGroupConversationItemRoom>() { // from class: com.p1.mobile.putong.data.VirtualVoiceGroupConversationItemRoom.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(VirtualVoiceGroupConversationItemRoom virtualVoiceGroupConversationItemRoom) {
            String str = virtualVoiceGroupConversationItemRoom.roomId;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = virtualVoiceGroupConversationItemRoom.title;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            List<String> list = virtualVoiceGroupConversationItemRoom.avatars;
            if (list != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(3, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str3 = virtualVoiceGroupConversationItemRoom.liveId;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str3);
            }
            int iM17226h = iM17233o + CodedOutputByteBufferNano.m17226h(5, virtualVoiceGroupConversationItemRoom.memberCount);
            String str4 = virtualVoiceGroupConversationItemRoom.roomStateText;
            if (str4 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(6, str4);
            }
            String str5 = virtualVoiceGroupConversationItemRoom.roomStateTextColor;
            if (str5 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(7, str5);
            }
            int iM17220b = iM17226h + CodedOutputByteBufferNano.m17220b(8, virtualVoiceGroupConversationItemRoom.isLiving);
            String str6 = virtualVoiceGroupConversationItemRoom.anchorId;
            if (str6 != null) {
                iM17220b += CodedOutputByteBufferNano.m17233o(9, str6);
            }
            virtualVoiceGroupConversationItemRoom.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public VirtualVoiceGroupConversationItemRoom parse(nb5 nb5Var) throws IOException {
            VirtualVoiceGroupConversationItemRoom virtualVoiceGroupConversationItemRoom = new VirtualVoiceGroupConversationItemRoom();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (virtualVoiceGroupConversationItemRoom.roomId == null) {
                        virtualVoiceGroupConversationItemRoom.roomId = "";
                    }
                    if (virtualVoiceGroupConversationItemRoom.title == null) {
                        virtualVoiceGroupConversationItemRoom.title = "";
                    }
                    if (virtualVoiceGroupConversationItemRoom.avatars == null) {
                        virtualVoiceGroupConversationItemRoom.avatars = new ArrayList();
                    }
                    if (virtualVoiceGroupConversationItemRoom.liveId == null) {
                        virtualVoiceGroupConversationItemRoom.liveId = "";
                    }
                    if (virtualVoiceGroupConversationItemRoom.roomStateText == null) {
                        virtualVoiceGroupConversationItemRoom.roomStateText = "";
                    }
                    if (virtualVoiceGroupConversationItemRoom.roomStateTextColor == null) {
                        virtualVoiceGroupConversationItemRoom.roomStateTextColor = "";
                    }
                    if (virtualVoiceGroupConversationItemRoom.anchorId != null) {
                        break;
                    }
                    virtualVoiceGroupConversationItemRoom.anchorId = "";
                    break;
                }
                if (iM158752u == 10) {
                    virtualVoiceGroupConversationItemRoom.roomId = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    virtualVoiceGroupConversationItemRoom.title = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    virtualVoiceGroupConversationItemRoom.avatars = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iM158752u == 34) {
                    virtualVoiceGroupConversationItemRoom.liveId = nb5Var.m158750s();
                } else if (iM158752u == 40) {
                    virtualVoiceGroupConversationItemRoom.memberCount = nb5Var.m158741j();
                } else if (iM158752u == 50) {
                    virtualVoiceGroupConversationItemRoom.roomStateText = nb5Var.m158750s();
                } else if (iM158752u == 58) {
                    virtualVoiceGroupConversationItemRoom.roomStateTextColor = nb5Var.m158750s();
                } else if (iM158752u == 64) {
                    virtualVoiceGroupConversationItemRoom.isLiving = nb5Var.m158738g();
                } else {
                    if (iM158752u != 74) {
                        if (virtualVoiceGroupConversationItemRoom.roomId == null) {
                            virtualVoiceGroupConversationItemRoom.roomId = "";
                        }
                        if (virtualVoiceGroupConversationItemRoom.title == null) {
                            virtualVoiceGroupConversationItemRoom.title = "";
                        }
                        if (virtualVoiceGroupConversationItemRoom.avatars == null) {
                            virtualVoiceGroupConversationItemRoom.avatars = new ArrayList();
                        }
                        if (virtualVoiceGroupConversationItemRoom.liveId == null) {
                            virtualVoiceGroupConversationItemRoom.liveId = "";
                        }
                        if (virtualVoiceGroupConversationItemRoom.roomStateText == null) {
                            virtualVoiceGroupConversationItemRoom.roomStateText = "";
                        }
                        if (virtualVoiceGroupConversationItemRoom.roomStateTextColor == null) {
                            virtualVoiceGroupConversationItemRoom.roomStateTextColor = "";
                        }
                        if (virtualVoiceGroupConversationItemRoom.anchorId != null) {
                            break;
                        }
                        virtualVoiceGroupConversationItemRoom.anchorId = "";
                        return virtualVoiceGroupConversationItemRoom;
                    }
                    virtualVoiceGroupConversationItemRoom.anchorId = nb5Var.m158750s();
                }
            }
            return virtualVoiceGroupConversationItemRoom;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(VirtualVoiceGroupConversationItemRoom virtualVoiceGroupConversationItemRoom, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = virtualVoiceGroupConversationItemRoom.roomId;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = virtualVoiceGroupConversationItemRoom.title;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            List<String> list = virtualVoiceGroupConversationItemRoom.avatars;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(3, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str3 = virtualVoiceGroupConversationItemRoom.liveId;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(4, str3);
            }
            codedOutputByteBufferNano.m17250G(5, virtualVoiceGroupConversationItemRoom.memberCount);
            String str4 = virtualVoiceGroupConversationItemRoom.roomStateText;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(6, str4);
            }
            String str5 = virtualVoiceGroupConversationItemRoom.roomStateTextColor;
            if (str5 != null) {
                codedOutputByteBufferNano.m17261R(7, str5);
            }
            codedOutputByteBufferNano.m17244A(8, virtualVoiceGroupConversationItemRoom.isLiving);
            String str6 = virtualVoiceGroupConversationItemRoom.anchorId;
            if (str6 != null) {
                codedOutputByteBufferNano.m17261R(9, str6);
            }
        }
    };
    public static JsonAdapter<VirtualVoiceGroupConversationItemRoom> JSON_ADAPTER = new ObjectJsonAdapter<VirtualVoiceGroupConversationItemRoom>() { // from class: com.p1.mobile.putong.data.VirtualVoiceGroupConversationItemRoom.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return VirtualVoiceGroupConversationItemRoom.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public VirtualVoiceGroupConversationItemRoom newInstance() {
            return new VirtualVoiceGroupConversationItemRoom();
        }

        public boolean parseField(VirtualVoiceGroupConversationItemRoom virtualVoiceGroupConversationItemRoom, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "liveId":
                    virtualVoiceGroupConversationItemRoom.liveId = jsonParser.getValueAsString();
                    return true;
                case "anchorId":
                    virtualVoiceGroupConversationItemRoom.anchorId = jsonParser.getValueAsString();
                    return true;
                case "roomId":
                    virtualVoiceGroupConversationItemRoom.roomId = jsonParser.getValueAsString();
                    return true;
                case "avatars":
                    virtualVoiceGroupConversationItemRoom.avatars = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "roomStateTextColor":
                    virtualVoiceGroupConversationItemRoom.roomStateTextColor = jsonParser.getValueAsString();
                    return true;
                case "isLiving":
                    virtualVoiceGroupConversationItemRoom.isLiving = jsonParser.getValueAsBoolean();
                    return true;
                case "title":
                    virtualVoiceGroupConversationItemRoom.title = jsonParser.getValueAsString();
                    return true;
                case "roomStateText":
                    virtualVoiceGroupConversationItemRoom.roomStateText = jsonParser.getValueAsString();
                    return true;
                case "memberCount":
                    virtualVoiceGroupConversationItemRoom.memberCount = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(VirtualVoiceGroupConversationItemRoom virtualVoiceGroupConversationItemRoom, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "liveId":
                case "anchorId":
                case "roomId":
                case "avatars":
                case "roomStateTextColor":
                case "isLiving":
                case "title":
                case "roomStateText":
                case "memberCount":
                    return true;
                default:
                    return super.parseFieldCheck(virtualVoiceGroupConversationItemRoom, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(VirtualVoiceGroupConversationItemRoom virtualVoiceGroupConversationItemRoom, JsonGenerator jsonGenerator) throws IOException {
            String str = virtualVoiceGroupConversationItemRoom.roomId;
            if (str != null) {
                jsonGenerator.writeStringField("roomId", str);
            }
            String str2 = virtualVoiceGroupConversationItemRoom.title;
            if (str2 != null) {
                jsonGenerator.writeStringField("title", str2);
            }
            if (virtualVoiceGroupConversationItemRoom.avatars != null) {
                jsonGenerator.writeFieldName("avatars");
                JsonAdapter.serializeArray(virtualVoiceGroupConversationItemRoom.avatars, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str3 = virtualVoiceGroupConversationItemRoom.liveId;
            if (str3 != null) {
                jsonGenerator.writeStringField("liveId", str3);
            }
            jsonGenerator.writeNumberField("memberCount", virtualVoiceGroupConversationItemRoom.memberCount);
            String str4 = virtualVoiceGroupConversationItemRoom.roomStateText;
            if (str4 != null) {
                jsonGenerator.writeStringField("roomStateText", str4);
            }
            String str5 = virtualVoiceGroupConversationItemRoom.roomStateTextColor;
            if (str5 != null) {
                jsonGenerator.writeStringField("roomStateTextColor", str5);
            }
            jsonGenerator.writeBooleanField("isLiving", virtualVoiceGroupConversationItemRoom.isLiving);
            String str6 = virtualVoiceGroupConversationItemRoom.anchorId;
            if (str6 != null) {
                jsonGenerator.writeStringField("anchorId", str6);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VirtualVoiceGroupConversationItemRoom) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VirtualVoiceGroupConversationItemRoom) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m60156a(String str) {
        return str;
    }

    public static VirtualVoiceGroupConversationItemRoom new_() {
        VirtualVoiceGroupConversationItemRoom virtualVoiceGroupConversationItemRoom = new VirtualVoiceGroupConversationItemRoom();
        virtualVoiceGroupConversationItemRoom.nullCheck();
        return virtualVoiceGroupConversationItemRoom;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public VirtualVoiceGroupConversationItemRoom mo223809clone() {
        VirtualVoiceGroupConversationItemRoom virtualVoiceGroupConversationItemRoom = new VirtualVoiceGroupConversationItemRoom();
        virtualVoiceGroupConversationItemRoom.roomId = this.roomId;
        virtualVoiceGroupConversationItemRoom.title = this.title;
        List<String> list = this.avatars;
        if (list != null) {
            virtualVoiceGroupConversationItemRoom.avatars = ValueObject.util_map(list, new w9j() { // from class: l.hzl0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return VirtualVoiceGroupConversationItemRoom.m60156a((String) obj);
                }
            });
        }
        virtualVoiceGroupConversationItemRoom.liveId = this.liveId;
        virtualVoiceGroupConversationItemRoom.memberCount = this.memberCount;
        virtualVoiceGroupConversationItemRoom.roomStateText = this.roomStateText;
        virtualVoiceGroupConversationItemRoom.roomStateTextColor = this.roomStateTextColor;
        virtualVoiceGroupConversationItemRoom.isLiving = this.isLiving;
        virtualVoiceGroupConversationItemRoom.anchorId = this.anchorId;
        return virtualVoiceGroupConversationItemRoom;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VirtualVoiceGroupConversationItemRoom)) {
            return false;
        }
        VirtualVoiceGroupConversationItemRoom virtualVoiceGroupConversationItemRoom = (VirtualVoiceGroupConversationItemRoom) obj;
        return ValueObject.util_equals(this.roomId, virtualVoiceGroupConversationItemRoom.roomId) && ValueObject.util_equals(this.title, virtualVoiceGroupConversationItemRoom.title) && ValueObject.util_equals(this.avatars, virtualVoiceGroupConversationItemRoom.avatars) && ValueObject.util_equals(this.liveId, virtualVoiceGroupConversationItemRoom.liveId) && this.memberCount == virtualVoiceGroupConversationItemRoom.memberCount && ValueObject.util_equals(this.roomStateText, virtualVoiceGroupConversationItemRoom.roomStateText) && ValueObject.util_equals(this.roomStateTextColor, virtualVoiceGroupConversationItemRoom.roomStateTextColor) && this.isLiving == virtualVoiceGroupConversationItemRoom.isLiving && ValueObject.util_equals(this.anchorId, virtualVoiceGroupConversationItemRoom.anchorId);
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
        String str = this.roomId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<String> list = this.avatars;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 41;
        String str3 = this.liveId;
        int iHashCode4 = (((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41) + this.memberCount) * 41;
        String str4 = this.roomStateText;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.roomStateTextColor;
        int iHashCode6 = (((iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 41) + (this.isLiving ? 1231 : 1237)) * 41;
        String str6 = this.anchorId;
        int iHashCode7 = iHashCode6 + (str6 != null ? str6.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.roomId == null) {
            this.roomId = "";
        }
        if (this.title == null) {
            this.title = "";
        }
        if (this.avatars == null) {
            this.avatars = new ArrayList();
        }
        if (this.liveId == null) {
            this.liveId = "";
        }
        if (this.roomStateText == null) {
            this.roomStateText = "";
        }
        if (this.roomStateTextColor == null) {
            this.roomStateTextColor = "";
        }
        if (this.anchorId == null) {
            this.anchorId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
