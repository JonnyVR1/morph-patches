package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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
public class PushMessageContent extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "pushmessagecontent";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 2)
    public String f38804id;

    @Nullable
    @ProtobufIndex(index = 3)
    public IdBoxed parent;

    @NonNull
    @ProtobufIndex(index = 1)
    public String type;
    public static ProtobufAdapter<PushMessageContent> PROTOBUF_ADAPTER = new MessageNanoAdapter<PushMessageContent>() { // from class: com.p1.mobile.putong.data.PushMessageContent.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(PushMessageContent pushMessageContent) {
            String str = pushMessageContent.type;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = pushMessageContent.f38804id;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            IdBoxed idBoxed = pushMessageContent.parent;
            if (idBoxed != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(3, idBoxed, IdBoxed.PROTOBUF_ADAPTER);
            }
            pushMessageContent.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public PushMessageContent parse(nb5 nb5Var) throws IOException {
            PushMessageContent pushMessageContent = new PushMessageContent();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (pushMessageContent.type == null) {
                        pushMessageContent.type = "";
                    }
                    if (pushMessageContent.f38804id != null) {
                        break;
                    }
                    pushMessageContent.f38804id = "";
                    break;
                }
                if (iM158752u == 10) {
                    pushMessageContent.type = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    pushMessageContent.f38804id = nb5Var.m158750s();
                } else {
                    if (iM158752u != 26) {
                        if (pushMessageContent.type == null) {
                            pushMessageContent.type = "";
                        }
                        if (pushMessageContent.f38804id != null) {
                            break;
                        }
                        pushMessageContent.f38804id = "";
                        return pushMessageContent;
                    }
                    pushMessageContent.parent = (IdBoxed) nb5Var.m158743l(IdBoxed.PROTOBUF_ADAPTER);
                }
            }
            return pushMessageContent;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(PushMessageContent pushMessageContent, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = pushMessageContent.type;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = pushMessageContent.f38804id;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            IdBoxed idBoxed = pushMessageContent.parent;
            if (idBoxed != null) {
                codedOutputByteBufferNano.m17254K(3, idBoxed, IdBoxed.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<PushMessageContent> JSON_ADAPTER = new ObjectJsonAdapter<PushMessageContent>() { // from class: com.p1.mobile.putong.data.PushMessageContent.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return PushMessageContent.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public PushMessageContent newInstance() {
            return new PushMessageContent();
        }

        public boolean parseField(PushMessageContent pushMessageContent, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "parent":
                    pushMessageContent.parent = IdBoxed.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    pushMessageContent.f38804id = jsonParser.getValueAsString();
                    return false;
                case "type":
                    pushMessageContent.type = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(PushMessageContent pushMessageContent, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "parent":
                    return true;
                case "id":
                    return false;
                case "type":
                    return true;
                default:
                    return super.parseFieldCheck(pushMessageContent, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PushMessageContent pushMessageContent, JsonGenerator jsonGenerator) throws IOException {
            String str = pushMessageContent.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
            String str2 = pushMessageContent.f38804id;
            if (str2 != null) {
                jsonGenerator.writeStringField("id", str2);
            }
            if (pushMessageContent.parent != null) {
                jsonGenerator.writeFieldName("parent");
                IdBoxed.JSON_ADAPTER.serialize(pushMessageContent.parent, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PushMessageContent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PushMessageContent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PushMessageContent new_() {
        PushMessageContent pushMessageContent = new PushMessageContent();
        pushMessageContent.nullCheck();
        return pushMessageContent;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public PushMessageContent mo223809clone() {
        PushMessageContent pushMessageContent = new PushMessageContent();
        pushMessageContent.type = this.type;
        pushMessageContent.f38804id = this.f38804id;
        IdBoxed idBoxed = this.parent;
        if (idBoxed != null) {
            pushMessageContent.parent = idBoxed.mo223809clone();
        }
        return pushMessageContent;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PushMessageContent)) {
            return false;
        }
        PushMessageContent pushMessageContent = (PushMessageContent) obj;
        return ValueObject.util_equals(this.type, pushMessageContent.type) && ValueObject.util_equals(this.f38804id, pushMessageContent.f38804id) && ValueObject.util_equals(this.parent, pushMessageContent.parent);
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
        String str = this.type;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.f38804id;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        IdBoxed idBoxed = this.parent;
        int iHashCode3 = iHashCode2 + (idBoxed != null ? idBoxed.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.type == null) {
            this.type = "";
        }
        if (this.f38804id == null) {
            this.f38804id = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
