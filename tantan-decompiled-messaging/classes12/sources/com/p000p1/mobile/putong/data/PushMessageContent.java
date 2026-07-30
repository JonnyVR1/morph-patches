package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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
public class PushMessageContent extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "pushmessagecontent";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 2)
    public String f265id;

    @Nullable
    @ProtobufIndex(index = 3)
    public IdBoxed parent;

    @NonNull
    @ProtobufIndex(index = 1)
    public String type;
    public static ProtobufAdapter<PushMessageContent> PROTOBUF_ADAPTER = new MessageNanoAdapter<PushMessageContent>() { // from class: com.p1.mobile.putong.data.PushMessageContent.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(PushMessageContent pushMessageContent) {
            String str = pushMessageContent.type;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = pushMessageContent.f265id;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            IdBoxed idBoxed = pushMessageContent.parent;
            if (idBoxed != null) {
                iO += CodedOutputByteBufferNano.l(3, idBoxed, IdBoxed.PROTOBUF_ADAPTER);
            }
            ((MessageNano) pushMessageContent).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public PushMessageContent m18863parse(nb5 nb5Var) throws IOException {
            PushMessageContent pushMessageContent = new PushMessageContent();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (pushMessageContent.type == null) {
                        pushMessageContent.type = "";
                    }
                    if (pushMessageContent.f265id != null) {
                        break;
                    }
                    pushMessageContent.f265id = "";
                    break;
                }
                if (iU == 10) {
                    pushMessageContent.type = nb5Var.s();
                } else if (iU == 18) {
                    pushMessageContent.f265id = nb5Var.s();
                } else {
                    if (iU != 26) {
                        if (pushMessageContent.type == null) {
                            pushMessageContent.type = "";
                        }
                        if (pushMessageContent.f265id != null) {
                            break;
                        }
                        pushMessageContent.f265id = "";
                        return pushMessageContent;
                    }
                    pushMessageContent.parent = (IdBoxed) nb5Var.l(IdBoxed.PROTOBUF_ADAPTER);
                }
            }
            return pushMessageContent;
        }

        public void serialize(PushMessageContent pushMessageContent, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = pushMessageContent.type;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = pushMessageContent.f265id;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            IdBoxed idBoxed = pushMessageContent.parent;
            if (idBoxed != null) {
                codedOutputByteBufferNano.K(3, idBoxed, IdBoxed.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<PushMessageContent> JSON_ADAPTER = new ObjectJsonAdapter<PushMessageContent>() { // from class: com.p1.mobile.putong.data.PushMessageContent.2
        public Class getDataClass() {
            return PushMessageContent.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public PushMessageContent mo17830newInstance() {
            return new PushMessageContent();
        }

        public boolean parseField(PushMessageContent pushMessageContent, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "parent":
                    pushMessageContent.parent = (IdBoxed) IdBoxed.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    pushMessageContent.f265id = jsonParser.getValueAsString();
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PushMessageContent pushMessageContent, JsonGenerator jsonGenerator) throws IOException {
            String str = pushMessageContent.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
            String str2 = pushMessageContent.f265id;
            if (str2 != null) {
                jsonGenerator.writeStringField("id", str2);
            }
            if (pushMessageContent.parent != null) {
                jsonGenerator.writeFieldName("parent");
                IdBoxed.JSON_ADAPTER.serialize(pushMessageContent.parent, jsonGenerator, true);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PushMessageContent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PushMessageContent) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PushMessageContent new_() {
        PushMessageContent pushMessageContent = new PushMessageContent();
        pushMessageContent.nullCheck();
        return pushMessageContent;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public PushMessageContent m18862clone() {
        PushMessageContent pushMessageContent = new PushMessageContent();
        pushMessageContent.type = this.type;
        pushMessageContent.f265id = this.f265id;
        IdBoxed idBoxed = this.parent;
        if (idBoxed != null) {
            pushMessageContent.parent = idBoxed.m18204clone();
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
        return ValueObject.util_equals(this.type, pushMessageContent.type) && ValueObject.util_equals(this.f265id, pushMessageContent.f265id) && ValueObject.util_equals(this.parent, pushMessageContent.parent);
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
        String str = this.type;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.f265id;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        IdBoxed idBoxed = this.parent;
        int iHashCode3 = iHashCode2 + (idBoxed != null ? idBoxed.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.type == null) {
            this.type = "";
        }
        if (this.f265id == null) {
            this.f265id = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
