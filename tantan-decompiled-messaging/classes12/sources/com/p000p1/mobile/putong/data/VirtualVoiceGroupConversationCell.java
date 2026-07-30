package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell) {
            VirtualVoiceGroupConversationItemInfo virtualVoiceGroupConversationItemInfo = virtualVoiceGroupConversationCell.cellInfo;
            int iL = virtualVoiceGroupConversationItemInfo != null ? CodedOutputByteBufferNano.l(1, virtualVoiceGroupConversationItemInfo, VirtualVoiceGroupConversationItemInfo.PROTOBUF_ADAPTER) : 0;
            VirtualVoiceGroupConversationItemRoom virtualVoiceGroupConversationItemRoom = virtualVoiceGroupConversationCell.roomInfo;
            if (virtualVoiceGroupConversationItemRoom != null) {
                iL += CodedOutputByteBufferNano.l(2, virtualVoiceGroupConversationItemRoom, VirtualVoiceGroupConversationItemRoom.PROTOBUF_ADAPTER);
            }
            VirtualVoiceGroupConversationItemChat virtualVoiceGroupConversationItemChat = virtualVoiceGroupConversationCell.chatInfo;
            if (virtualVoiceGroupConversationItemChat != null) {
                iL += CodedOutputByteBufferNano.l(3, virtualVoiceGroupConversationItemChat, VirtualVoiceGroupConversationItemChat.PROTOBUF_ADAPTER);
            }
            ((MessageNano) virtualVoiceGroupConversationCell).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public VirtualVoiceGroupConversationCell m19311parse(nb5 nb5Var) throws IOException {
            VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell = new VirtualVoiceGroupConversationCell();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 10) {
                    virtualVoiceGroupConversationCell.cellInfo = (VirtualVoiceGroupConversationItemInfo) nb5Var.l(VirtualVoiceGroupConversationItemInfo.PROTOBUF_ADAPTER);
                } else if (iU == 18) {
                    virtualVoiceGroupConversationCell.roomInfo = (VirtualVoiceGroupConversationItemRoom) nb5Var.l(VirtualVoiceGroupConversationItemRoom.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 26) {
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
                    virtualVoiceGroupConversationCell.chatInfo = (VirtualVoiceGroupConversationItemChat) nb5Var.l(VirtualVoiceGroupConversationItemChat.PROTOBUF_ADAPTER);
                }
            }
            return virtualVoiceGroupConversationCell;
        }

        public void serialize(VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            VirtualVoiceGroupConversationItemInfo virtualVoiceGroupConversationItemInfo = virtualVoiceGroupConversationCell.cellInfo;
            if (virtualVoiceGroupConversationItemInfo != null) {
                codedOutputByteBufferNano.K(1, virtualVoiceGroupConversationItemInfo, VirtualVoiceGroupConversationItemInfo.PROTOBUF_ADAPTER);
            }
            VirtualVoiceGroupConversationItemRoom virtualVoiceGroupConversationItemRoom = virtualVoiceGroupConversationCell.roomInfo;
            if (virtualVoiceGroupConversationItemRoom != null) {
                codedOutputByteBufferNano.K(2, virtualVoiceGroupConversationItemRoom, VirtualVoiceGroupConversationItemRoom.PROTOBUF_ADAPTER);
            }
            VirtualVoiceGroupConversationItemChat virtualVoiceGroupConversationItemChat = virtualVoiceGroupConversationCell.chatInfo;
            if (virtualVoiceGroupConversationItemChat != null) {
                codedOutputByteBufferNano.K(3, virtualVoiceGroupConversationItemChat, VirtualVoiceGroupConversationItemChat.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<VirtualVoiceGroupConversationCell> JSON_ADAPTER = new ObjectJsonAdapter<VirtualVoiceGroupConversationCell>() { // from class: com.p1.mobile.putong.data.VirtualVoiceGroupConversationCell.2
        public Class getDataClass() {
            return VirtualVoiceGroupConversationCell.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public VirtualVoiceGroupConversationCell mo17830newInstance() {
            return new VirtualVoiceGroupConversationCell();
        }

        public boolean parseField(VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "cellInfo":
                    virtualVoiceGroupConversationCell.cellInfo = (VirtualVoiceGroupConversationItemInfo) VirtualVoiceGroupConversationItemInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "roomInfo":
                    virtualVoiceGroupConversationCell.roomInfo = (VirtualVoiceGroupConversationItemRoom) VirtualVoiceGroupConversationItemRoom.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "chatInfo":
                    virtualVoiceGroupConversationCell.chatInfo = (VirtualVoiceGroupConversationItemChat) VirtualVoiceGroupConversationItemChat.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VirtualVoiceGroupConversationCell) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VirtualVoiceGroupConversationCell) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static VirtualVoiceGroupConversationCell new_() {
        VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell = new VirtualVoiceGroupConversationCell();
        virtualVoiceGroupConversationCell.nullCheck();
        return virtualVoiceGroupConversationCell;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public VirtualVoiceGroupConversationCell m19310clone() {
        VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell = new VirtualVoiceGroupConversationCell();
        VirtualVoiceGroupConversationItemInfo virtualVoiceGroupConversationItemInfo = this.cellInfo;
        if (virtualVoiceGroupConversationItemInfo != null) {
            virtualVoiceGroupConversationCell.cellInfo = virtualVoiceGroupConversationItemInfo.m19316clone();
        }
        VirtualVoiceGroupConversationItemRoom virtualVoiceGroupConversationItemRoom = this.roomInfo;
        if (virtualVoiceGroupConversationItemRoom != null) {
            virtualVoiceGroupConversationCell.roomInfo = virtualVoiceGroupConversationItemRoom.m19319clone();
        }
        VirtualVoiceGroupConversationItemChat virtualVoiceGroupConversationItemChat = this.chatInfo;
        if (virtualVoiceGroupConversationItemChat != null) {
            virtualVoiceGroupConversationCell.chatInfo = virtualVoiceGroupConversationItemChat.m19313clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
