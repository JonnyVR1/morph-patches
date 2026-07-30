package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.VirtualVoiceGroupConversationCell;
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
public class VirtualVoiceGroupConversation extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "virtualvoicegroupconversation";

    @NonNull
    @ProtobufIndex(index = 2)
    public List<VirtualVoiceGroupConversationCell> cells;

    @ProtobufIndex(index = 1)
    public boolean isReceiveNotice;
    public static ProtobufAdapter<VirtualVoiceGroupConversation> PROTOBUF_ADAPTER = new MessageNanoAdapter<VirtualVoiceGroupConversation>() { // from class: com.p1.mobile.putong.data.VirtualVoiceGroupConversation.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(VirtualVoiceGroupConversation virtualVoiceGroupConversation) {
            int iM17220b = CodedOutputByteBufferNano.m17220b(1, virtualVoiceGroupConversation.isReceiveNotice);
            List<VirtualVoiceGroupConversationCell> list = virtualVoiceGroupConversation.cells;
            if (list != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(2, list, VirtualVoiceGroupConversationCell.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            virtualVoiceGroupConversation.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public VirtualVoiceGroupConversation parse(nb5 nb5Var) throws IOException {
            VirtualVoiceGroupConversation virtualVoiceGroupConversation = new VirtualVoiceGroupConversation();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (virtualVoiceGroupConversation.cells != null) {
                        break;
                    }
                    virtualVoiceGroupConversation.cells = new ArrayList();
                    break;
                }
                if (iM158752u == 8) {
                    virtualVoiceGroupConversation.isReceiveNotice = nb5Var.m158738g();
                } else {
                    if (iM158752u != 18) {
                        if (virtualVoiceGroupConversation.cells != null) {
                            break;
                        }
                        virtualVoiceGroupConversation.cells = new ArrayList();
                        return virtualVoiceGroupConversation;
                    }
                    virtualVoiceGroupConversation.cells = (List) nb5Var.m158743l(VirtualVoiceGroupConversationCell.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return virtualVoiceGroupConversation;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(VirtualVoiceGroupConversation virtualVoiceGroupConversation, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17244A(1, virtualVoiceGroupConversation.isReceiveNotice);
            List<VirtualVoiceGroupConversationCell> list = virtualVoiceGroupConversation.cells;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(2, list, VirtualVoiceGroupConversationCell.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<VirtualVoiceGroupConversation> JSON_ADAPTER = new ObjectJsonAdapter<VirtualVoiceGroupConversation>() { // from class: com.p1.mobile.putong.data.VirtualVoiceGroupConversation.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return VirtualVoiceGroupConversation.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public VirtualVoiceGroupConversation newInstance() {
            return new VirtualVoiceGroupConversation();
        }

        public boolean parseField(VirtualVoiceGroupConversation virtualVoiceGroupConversation, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("isReceiveNotice")) {
                virtualVoiceGroupConversation.isReceiveNotice = jsonParser.getValueAsBoolean();
                return true;
            }
            if (!str.equals("cells")) {
                return false;
            }
            virtualVoiceGroupConversation.cells = JsonAdapter.parseArray(jsonParser, VirtualVoiceGroupConversationCell.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(VirtualVoiceGroupConversation virtualVoiceGroupConversation, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("isReceiveNotice") || str.equals("cells")) {
                return true;
            }
            return super.parseFieldCheck(virtualVoiceGroupConversation, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(VirtualVoiceGroupConversation virtualVoiceGroupConversation, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("isReceiveNotice", virtualVoiceGroupConversation.isReceiveNotice);
            if (virtualVoiceGroupConversation.cells != null) {
                jsonGenerator.writeFieldName("cells");
                JsonAdapter.serializeArray(virtualVoiceGroupConversation.cells, jsonGenerator, VirtualVoiceGroupConversationCell.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VirtualVoiceGroupConversation) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VirtualVoiceGroupConversation) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static VirtualVoiceGroupConversation new_() {
        VirtualVoiceGroupConversation virtualVoiceGroupConversation = new VirtualVoiceGroupConversation();
        virtualVoiceGroupConversation.nullCheck();
        return virtualVoiceGroupConversation;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public VirtualVoiceGroupConversation mo223809clone() {
        VirtualVoiceGroupConversation virtualVoiceGroupConversation = new VirtualVoiceGroupConversation();
        virtualVoiceGroupConversation.isReceiveNotice = this.isReceiveNotice;
        List<VirtualVoiceGroupConversationCell> list = this.cells;
        if (list != null) {
            virtualVoiceGroupConversation.cells = ValueObject.util_map(list, new w9j() { // from class: l.gzl0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((VirtualVoiceGroupConversationCell) obj).mo223809clone();
                }
            });
        }
        return virtualVoiceGroupConversation;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VirtualVoiceGroupConversation)) {
            return false;
        }
        VirtualVoiceGroupConversation virtualVoiceGroupConversation = (VirtualVoiceGroupConversation) obj;
        return this.isReceiveNotice == virtualVoiceGroupConversation.isReceiveNotice && ValueObject.util_equals(this.cells, virtualVoiceGroupConversation.cells);
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
        int i2 = ((i * 41) + (this.isReceiveNotice ? 1231 : 1237)) * 41;
        List<VirtualVoiceGroupConversationCell> list = this.cells;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.cells == null) {
            this.cells = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
