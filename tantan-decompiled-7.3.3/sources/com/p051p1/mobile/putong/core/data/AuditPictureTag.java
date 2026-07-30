package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.AuditPictureTag;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes10.dex */
public class AuditPictureTag extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "auditpicturetag";

    @NonNull
    @ProtobufIndex(index = 3)
    public List<String> categories;

    @ProtobufIndex(index = 7)
    public int count;

    @NonNull
    @ProtobufIndex(index = 4)
    public String icon;

    /* JADX INFO: renamed from: id */
    @ProtobufIndex(index = 1)
    public int f21089id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;

    @NonNull
    @ProtobufIndex(index = 5)
    public String operation;

    @NonNull
    @ProtobufIndex(index = 6)
    public String status;
    public static ProtobufAdapter<AuditPictureTag> PROTOBUF_ADAPTER = new MessageNanoAdapter<AuditPictureTag>() { // from class: com.p1.mobile.putong.core.data.AuditPictureTag.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(AuditPictureTag auditPictureTag) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, auditPictureTag.f21089id);
            String str = auditPictureTag.name;
            if (str != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(2, str);
            }
            List<String> list = auditPictureTag.categories;
            if (list != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(3, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str2 = auditPictureTag.icon;
            if (str2 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(4, str2);
            }
            String str3 = auditPictureTag.operation;
            if (str3 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(5, str3);
            }
            String str4 = auditPictureTag.status;
            if (str4 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(6, str4);
            }
            int iM17281h2 = iM17281h + CodedOutputByteBufferNano.m17281h(7, auditPictureTag.count);
            auditPictureTag.cachedSize = iM17281h2;
            return iM17281h2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AuditPictureTag parse(nc5 nc5Var) throws IOException {
            AuditPictureTag auditPictureTag = new AuditPictureTag();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
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
                if (iM162497u == 8) {
                    auditPictureTag.f21089id = nc5Var.m162486j();
                } else if (iM162497u == 18) {
                    auditPictureTag.name = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    auditPictureTag.categories = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iM162497u == 34) {
                    auditPictureTag.icon = nc5Var.m162495s();
                } else if (iM162497u == 42) {
                    auditPictureTag.operation = nc5Var.m162495s();
                } else if (iM162497u == 50) {
                    auditPictureTag.status = nc5Var.m162495s();
                } else {
                    if (iM162497u != 56) {
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
                    auditPictureTag.count = nc5Var.m162486j();
                }
            }
            return auditPictureTag;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AuditPictureTag auditPictureTag, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, auditPictureTag.f21089id);
            String str = auditPictureTag.name;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(2, str);
            }
            List<String> list = auditPictureTag.categories;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(3, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str2 = auditPictureTag.icon;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(4, str2);
            }
            String str3 = auditPictureTag.operation;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(5, str3);
            }
            String str4 = auditPictureTag.status;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(6, str4);
            }
            codedOutputByteBufferNano.m17305G(7, auditPictureTag.count);
        }
    };
    public static JsonAdapter<AuditPictureTag> JSON_ADAPTER = new ObjectJsonAdapter<AuditPictureTag>() { // from class: com.p1.mobile.putong.core.data.AuditPictureTag.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AuditPictureTag.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public AuditPictureTag newInstance() {
            return new AuditPictureTag();
        }

        public boolean parseField(AuditPictureTag auditPictureTag, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "status":
                    auditPictureTag.status = jsonParser.getValueAsString();
                    return true;
                case "id":
                    auditPictureTag.f21089id = jsonParser.getValueAsInt();
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AuditPictureTag auditPictureTag, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("id", auditPictureTag.f21089id);
            String str = auditPictureTag.name;
            if (str != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            }
            if (auditPictureTag.categories != null) {
                jsonGenerator.writeFieldName("categories");
                JsonAdapter.serializeArray(auditPictureTag.categories, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str2 = auditPictureTag.icon;
            if (str2 != null) {
                jsonGenerator.writeStringField("icon", str2);
            }
            String str3 = auditPictureTag.operation;
            if (str3 != null) {
                jsonGenerator.writeStringField(MessageType.operation, str3);
            }
            String str4 = auditPictureTag.status;
            if (str4 != null) {
                jsonGenerator.writeStringField(NotificationCompat.CATEGORY_STATUS, str4);
            }
            jsonGenerator.writeNumberField("count", auditPictureTag.count);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AuditPictureTag) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AuditPictureTag) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m36221a(String str) {
        return str;
    }

    public static AuditPictureTag new_() {
        AuditPictureTag auditPictureTag = new AuditPictureTag();
        auditPictureTag.nullCheck();
        return auditPictureTag;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public AuditPictureTag mo225055clone() {
        AuditPictureTag auditPictureTag = new AuditPictureTag();
        auditPictureTag.f21089id = this.f21089id;
        auditPictureTag.name = this.name;
        List<String> list = this.categories;
        if (list != null) {
            auditPictureTag.categories = ValueObject.util_map(list, new qcj() { // from class: l.ud1
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return AuditPictureTag.m36221a((String) obj);
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
        return this.f21089id == auditPictureTag.f21089id && ValueObject.util_equals(this.name, auditPictureTag.name) && ValueObject.util_equals(this.categories, auditPictureTag.categories) && ValueObject.util_equals(this.icon, auditPictureTag.icon) && ValueObject.util_equals(this.operation, auditPictureTag.operation) && ValueObject.util_equals(this.status, auditPictureTag.status) && this.count == auditPictureTag.count;
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
        int i2 = ((i * 41) + this.f21089id) * 41;
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
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
