package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.AuditPictureTag;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class AuditPictureTag extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "auditpicturetag";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public List<String> categories;

    @ProtobufIndex(index = 7)
    public int count;

    @NonNull
    @ProtobufIndex(index = 4)
    public String icon;

    /* JADX INFO: renamed from: id */
    @ProtobufIndex(index = 1)
    public int f9id;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String name;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String operation;

    @NonNull
    @ProtobufIndex(index = 6)
    public String status;
    public static ProtobufAdapter<AuditPictureTag> PROTOBUF_ADAPTER = new MessageNanoAdapter<AuditPictureTag>() { // from class: com.p1.mobile.putong.core.data.AuditPictureTag.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(AuditPictureTag auditPictureTag) {
            int iH = CodedOutputByteBufferNano.h(1, auditPictureTag.f9id);
            String str = auditPictureTag.name;
            if (str != null) {
                iH += CodedOutputByteBufferNano.o(2, str);
            }
            List<String> list = auditPictureTag.categories;
            if (list != null) {
                iH += CodedOutputByteBufferNano.l(3, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str2 = auditPictureTag.icon;
            if (str2 != null) {
                iH += CodedOutputByteBufferNano.o(4, str2);
            }
            String str3 = auditPictureTag.operation;
            if (str3 != null) {
                iH += CodedOutputByteBufferNano.o(5, str3);
            }
            String str4 = auditPictureTag.status;
            if (str4 != null) {
                iH += CodedOutputByteBufferNano.o(6, str4);
            }
            int iH2 = iH + CodedOutputByteBufferNano.h(7, auditPictureTag.count);
            ((MessageNano) auditPictureTag).cachedSize = iH2;
            return iH2;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public AuditPictureTag m11667parse(nb5 nb5Var) throws IOException {
            AuditPictureTag auditPictureTag = new AuditPictureTag();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (auditPictureTag.name == null) {
                        auditPictureTag.name = "";
                    }
                    if (auditPictureTag.categories == null) {
                        auditPictureTag.categories = new ArrayList();
                    }
                    if (auditPictureTag.icon == null) {
                        auditPictureTag.icon = "";
                    }
                    if (auditPictureTag.operation == null) {
                        auditPictureTag.operation = "";
                    }
                    if (auditPictureTag.status != null) {
                        break;
                    }
                    auditPictureTag.status = "";
                    break;
                }
                if (iU == 8) {
                    auditPictureTag.f9id = nb5Var.j();
                } else if (iU == 18) {
                    auditPictureTag.name = nb5Var.s();
                } else if (iU == 26) {
                    auditPictureTag.categories = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 34) {
                    auditPictureTag.icon = nb5Var.s();
                } else if (iU == 42) {
                    auditPictureTag.operation = nb5Var.s();
                } else if (iU == 50) {
                    auditPictureTag.status = nb5Var.s();
                } else {
                    if (iU != 56) {
                        if (auditPictureTag.name == null) {
                            auditPictureTag.name = "";
                        }
                        if (auditPictureTag.categories == null) {
                            auditPictureTag.categories = new ArrayList();
                        }
                        if (auditPictureTag.icon == null) {
                            auditPictureTag.icon = "";
                        }
                        if (auditPictureTag.operation == null) {
                            auditPictureTag.operation = "";
                        }
                        if (auditPictureTag.status != null) {
                            break;
                        }
                        auditPictureTag.status = "";
                        return auditPictureTag;
                    }
                    auditPictureTag.count = nb5Var.j();
                }
            }
            return auditPictureTag;
        }

        public void serialize(AuditPictureTag auditPictureTag, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, auditPictureTag.f9id);
            String str = auditPictureTag.name;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            List<String> list = auditPictureTag.categories;
            if (list != null) {
                codedOutputByteBufferNano.K(3, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str2 = auditPictureTag.icon;
            if (str2 != null) {
                codedOutputByteBufferNano.R(4, str2);
            }
            String str3 = auditPictureTag.operation;
            if (str3 != null) {
                codedOutputByteBufferNano.R(5, str3);
            }
            String str4 = auditPictureTag.status;
            if (str4 != null) {
                codedOutputByteBufferNano.R(6, str4);
            }
            codedOutputByteBufferNano.G(7, auditPictureTag.count);
        }
    };
    public static JsonAdapter<AuditPictureTag> JSON_ADAPTER = new ObjectJsonAdapter<AuditPictureTag>() { // from class: com.p1.mobile.putong.core.data.AuditPictureTag.2
        public Class getDataClass() {
            return AuditPictureTag.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public AuditPictureTag m11668newInstance() {
            return new AuditPictureTag();
        }

        public boolean parseField(AuditPictureTag auditPictureTag, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "status":
                    auditPictureTag.status = jsonParser.getValueAsString();
                    return true;
                case "id":
                    auditPictureTag.f9id = jsonParser.getValueAsInt();
                    return false;
                case "icon":
                    auditPictureTag.icon = jsonParser.getValueAsString();
                    return true;
                case "name":
                    auditPictureTag.name = jsonParser.getValueAsString();
                    return true;
                case "count":
                    auditPictureTag.count = jsonParser.getValueAsInt();
                    return true;
                case "categories":
                    auditPictureTag.categories = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "operation":
                    auditPictureTag.operation = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(AuditPictureTag auditPictureTag, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "status":
                    return true;
                case "id":
                    return false;
                case "icon":
                case "name":
                case "count":
                case "categories":
                case "operation":
                    return true;
                default:
                    return super.parseFieldCheck(auditPictureTag, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(AuditPictureTag auditPictureTag, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("id", auditPictureTag.f9id);
            String str = auditPictureTag.name;
            if (str != null) {
                jsonGenerator.writeStringField("name", str);
            }
            if (auditPictureTag.categories != null) {
                jsonGenerator.writeFieldName("categories");
                JsonAdapter.serializeArray(auditPictureTag.categories, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str2 = auditPictureTag.icon;
            if (str2 != null) {
                jsonGenerator.writeStringField(HomeTabModuleTopicShowType.icon, str2);
            }
            String str3 = auditPictureTag.operation;
            if (str3 != null) {
                jsonGenerator.writeStringField(MessageType.operation, str3);
            }
            String str4 = auditPictureTag.status;
            if (str4 != null) {
                jsonGenerator.writeStringField("status", str4);
            }
            jsonGenerator.writeNumberField("count", auditPictureTag.count);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AuditPictureTag) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AuditPictureTag) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m20a(String str) {
        return str;
    }

    public static AuditPictureTag new_() {
        AuditPictureTag auditPictureTag = new AuditPictureTag();
        auditPictureTag.nullCheck();
        return auditPictureTag;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AuditPictureTag m11666clone() {
        AuditPictureTag auditPictureTag = new AuditPictureTag();
        auditPictureTag.f9id = this.f9id;
        auditPictureTag.name = this.name;
        List<String> list = this.categories;
        if (list != null) {
            auditPictureTag.categories = ValueObject.util_map(list, new w9j() { // from class: l.nd1
                public final Object call(Object obj) {
                    return AuditPictureTag.m20a((String) obj);
                }
            });
        }
        auditPictureTag.icon = this.icon;
        auditPictureTag.operation = this.operation;
        auditPictureTag.status = this.status;
        auditPictureTag.count = this.count;
        return auditPictureTag;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AuditPictureTag)) {
            return false;
        }
        AuditPictureTag auditPictureTag = (AuditPictureTag) obj;
        return this.f9id == auditPictureTag.f9id && ValueObject.util_equals(this.name, auditPictureTag.name) && ValueObject.util_equals(this.categories, auditPictureTag.categories) && ValueObject.util_equals(this.icon, auditPictureTag.icon) && ValueObject.util_equals(this.operation, auditPictureTag.operation) && ValueObject.util_equals(this.status, auditPictureTag.status) && this.count == auditPictureTag.count;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + this.f9id) * 41;
        String str = this.name;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<String> list = this.categories;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 41;
        String str2 = this.icon;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.operation;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.status;
        int iHashCode5 = ((iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 41) + this.count;
        ((ValueObject) this).hashCode = iHashCode5;
        return iHashCode5;
    }

    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
        if (this.categories == null) {
            this.categories = new ArrayList();
        }
        if (this.icon == null) {
            this.icon = "";
        }
        if (this.operation == null) {
            this.operation = "";
        }
        if (this.status == null) {
            this.status = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
