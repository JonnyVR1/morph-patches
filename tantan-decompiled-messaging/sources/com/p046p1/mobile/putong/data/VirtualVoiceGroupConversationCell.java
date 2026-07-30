package com.p046p1.mobile.putong.data;

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
public class VirtualVoiceGroupConversationCell extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "virtualvoicegroupconversationcell";

    @NonNull
    @ProtobufIndex(index = 1)
    public VirtualVoiceGroupConversationItemInfo cellInfo;

    @NonNull
    @ProtobufIndex(index = 3)
    public VirtualVoiceGroupConversationItemChat chatInfo;

    @NonNull
    @ProtobufIndex(index = 2)
    public VirtualVoiceGroupConversationItemRoom roomInfo;
    public static ProtobufAdapter<VirtualVoiceGroupConversationCell> PROTOBUF_ADAPTER = new MessageNanoAdapter<VirtualVoiceGroupConversationCell>() { // from class: com.p1.mobile.putong.data.VirtualVoiceGroupConversationCell.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell) {
            VirtualVoiceGroupConversationItemInfo virtualVoiceGroupConversationItemInfo = virtualVoiceGroupConversationCell.cellInfo;
            int iM17230l = virtualVoiceGroupConversationItemInfo != null ? CodedOutputByteBufferNano.m17230l(1, virtualVoiceGroupConversationItemInfo, VirtualVoiceGroupConversationItemInfo.PROTOBUF_ADAPTER) : 0;
            VirtualVoiceGroupConversationItemRoom virtualVoiceGroupConversationItemRoom = virtualVoiceGroupConversationCell.roomInfo;
            if (virtualVoiceGroupConversationItemRoom != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, virtualVoiceGroupConversationItemRoom, VirtualVoiceGroupConversationItemRoom.PROTOBUF_ADAPTER);
            }
            VirtualVoiceGroupConversationItemChat virtualVoiceGroupConversationItemChat = virtualVoiceGroupConversationCell.chatInfo;
            if (virtualVoiceGroupConversationItemChat != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(3, virtualVoiceGroupConversationItemChat, VirtualVoiceGroupConversationItemChat.PROTOBUF_ADAPTER);
            }
            virtualVoiceGroupConversationCell.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public VirtualVoiceGroupConversationCell parse(nb5 nb5Var) throws IOException {
            VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell = new VirtualVoiceGroupConversationCell();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (virtualVoiceGroupConversationCell.cellInfo == null) {
                        virtualVoiceGroupConversationCell.cellInfo = VirtualVoiceGroupConversationItemInfo.new_();
                    }
                    if (virtualVoiceGroupConversationCell.roomInfo == null) {
                        virtualVoiceGroupConversationCell.roomInfo = VirtualVoiceGroupConversationItemRoom.new_();
                    }
                    if (virtualVoiceGroupConversationCell.chatInfo != null) {
                        break;
                    }
                    virtualVoiceGroupConversationCell.chatInfo = VirtualVoiceGroupConversationItemChat.new_();
                    break;
                }
                if (iM158752u == 10) {
                    virtualVoiceGroupConversationCell.cellInfo = (VirtualVoiceGroupConversationItemInfo) nb5Var.m158743l(VirtualVoiceGroupConversationItemInfo.PROTOBUF_ADAPTER);
                } else if (iM158752u == 18) {
                    virtualVoiceGroupConversationCell.roomInfo = (VirtualVoiceGroupConversationItemRoom) nb5Var.m158743l(VirtualVoiceGroupConversationItemRoom.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 26) {
                        if (virtualVoiceGroupConversationCell.cellInfo == null) {
                            virtualVoiceGroupConversationCell.cellInfo = VirtualVoiceGroupConversationItemInfo.new_();
                        }
                        if (virtualVoiceGroupConversationCell.roomInfo == null) {
                            virtualVoiceGroupConversationCell.roomInfo = VirtualVoiceGroupConversationItemRoom.new_();
                        }
                        if (virtualVoiceGroupConversationCell.chatInfo != null) {
                            break;
                        }
                        virtualVoiceGroupConversationCell.chatInfo = VirtualVoiceGroupConversationItemChat.new_();
                        return virtualVoiceGroupConversationCell;
                    }
                    virtualVoiceGroupConversationCell.chatInfo = (VirtualVoiceGroupConversationItemChat) nb5Var.m158743l(VirtualVoiceGroupConversationItemChat.PROTOBUF_ADAPTER);
                }
            }
            return virtualVoiceGroupConversationCell;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            VirtualVoiceGroupConversationItemInfo virtualVoiceGroupConversationItemInfo = virtualVoiceGroupConversationCell.cellInfo;
            if (virtualVoiceGroupConversationItemInfo != null) {
                codedOutputByteBufferNano.m17254K(1, virtualVoiceGroupConversationItemInfo, VirtualVoiceGroupConversationItemInfo.PROTOBUF_ADAPTER);
            }
            VirtualVoiceGroupConversationItemRoom virtualVoiceGroupConversationItemRoom = virtualVoiceGroupConversationCell.roomInfo;
            if (virtualVoiceGroupConversationItemRoom != null) {
                codedOutputByteBufferNano.m17254K(2, virtualVoiceGroupConversationItemRoom, VirtualVoiceGroupConversationItemRoom.PROTOBUF_ADAPTER);
            }
            VirtualVoiceGroupConversationItemChat virtualVoiceGroupConversationItemChat = virtualVoiceGroupConversationCell.chatInfo;
            if (virtualVoiceGroupConversationItemChat != null) {
                codedOutputByteBufferNano.m17254K(3, virtualVoiceGroupConversationItemChat, VirtualVoiceGroupConversationItemChat.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<VirtualVoiceGroupConversationCell> JSON_ADAPTER = new ObjectJsonAdapter<VirtualVoiceGroupConversationCell>() { // from class: com.p1.mobile.putong.data.VirtualVoiceGroupConversationCell.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return VirtualVoiceGroupConversationCell.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public VirtualVoiceGroupConversationCell newInstance() {
            return new VirtualVoiceGroupConversationCell();
        }

        public boolean parseField(VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "cellInfo":
                    virtualVoiceGroupConversationCell.cellInfo = VirtualVoiceGroupConversationItemInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "roomInfo":
                    virtualVoiceGroupConversationCell.roomInfo = VirtualVoiceGroupConversationItemRoom.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "chatInfo":
                    virtualVoiceGroupConversationCell.chatInfo = VirtualVoiceGroupConversationItemChat.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "cellInfo":
                case "roomInfo":
                case "chatInfo":
                    return true;
                default:
                    return super.parseFieldCheck(virtualVoiceGroupConversationCell, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell, JsonGenerator jsonGenerator) throws IOException {
            if (virtualVoiceGroupConversationCell.cellInfo != null) {
                jsonGenerator.writeFieldName("cellInfo");
                VirtualVoiceGroupConversationItemInfo.JSON_ADAPTER.serialize(virtualVoiceGroupConversationCell.cellInfo, jsonGenerator, true);
            }
            if (virtualVoiceGroupConversationCell.roomInfo != null) {
                jsonGenerator.writeFieldName("roomInfo");
                VirtualVoiceGroupConversationItemRoom.JSON_ADAPTER.serialize(virtualVoiceGroupConversationCell.roomInfo, jsonGenerator, true);
            }
            if (virtualVoiceGroupConversationCell.chatInfo != null) {
                jsonGenerator.writeFieldName("chatInfo");
                VirtualVoiceGroupConversationItemChat.JSON_ADAPTER.serialize(virtualVoiceGroupConversationCell.chatInfo, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VirtualVoiceGroupConversationCell) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VirtualVoiceGroupConversationCell) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static VirtualVoiceGroupConversationCell new_() {
        VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell = new VirtualVoiceGroupConversationCell();
        virtualVoiceGroupConversationCell.nullCheck();
        return virtualVoiceGroupConversationCell;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public VirtualVoiceGroupConversationCell mo223809clone() {
        VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell = new VirtualVoiceGroupConversationCell();
        VirtualVoiceGroupConversationItemInfo virtualVoiceGroupConversationItemInfo = this.cellInfo;
        if (virtualVoiceGroupConversationItemInfo != null) {
            virtualVoiceGroupConversationCell.cellInfo = virtualVoiceGroupConversationItemInfo.mo223809clone();
        }
        VirtualVoiceGroupConversationItemRoom virtualVoiceGroupConversationItemRoom = this.roomInfo;
        if (virtualVoiceGroupConversationItemRoom != null) {
            virtualVoiceGroupConversationCell.roomInfo = virtualVoiceGroupConversationItemRoom.mo223809clone();
        }
        VirtualVoiceGroupConversationItemChat virtualVoiceGroupConversationItemChat = this.chatInfo;
        if (virtualVoiceGroupConversationItemChat != null) {
            virtualVoiceGroupConversationCell.chatInfo = virtualVoiceGroupConversationItemChat.mo223809clone();
        }
        return virtualVoiceGroupConversationCell;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VirtualVoiceGroupConversationCell)) {
            return false;
        }
        VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell = (VirtualVoiceGroupConversationCell) obj;
        return ValueObject.util_equals(this.cellInfo, virtualVoiceGroupConversationCell.cellInfo) && ValueObject.util_equals(this.roomInfo, virtualVoiceGroupConversationCell.roomInfo) && ValueObject.util_equals(this.chatInfo, virtualVoiceGroupConversationCell.chatInfo);
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
        VirtualVoiceGroupConversationItemInfo virtualVoiceGroupConversationItemInfo = this.cellInfo;
        int iHashCode = (i2 + (virtualVoiceGroupConversationItemInfo != null ? virtualVoiceGroupConversationItemInfo.hashCode() : 0)) * 41;
        VirtualVoiceGroupConversationItemRoom virtualVoiceGroupConversationItemRoom = this.roomInfo;
        int iHashCode2 = (iHashCode + (virtualVoiceGroupConversationItemRoom != null ? virtualVoiceGroupConversationItemRoom.hashCode() : 0)) * 41;
        VirtualVoiceGroupConversationItemChat virtualVoiceGroupConversationItemChat = this.chatInfo;
        int iHashCode3 = iHashCode2 + (virtualVoiceGroupConversationItemChat != null ? virtualVoiceGroupConversationItemChat.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.cellInfo == null) {
            this.cellInfo = VirtualVoiceGroupConversationItemInfo.new_();
        }
        if (this.roomInfo == null) {
            this.roomInfo = VirtualVoiceGroupConversationItemRoom.new_();
        }
        if (this.chatInfo == null) {
            this.chatInfo = VirtualVoiceGroupConversationItemChat.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
