package com.p046p1.mobile.putong.core.data;

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

/* JADX INFO: loaded from: classes10.dex */
public class BaseQuestionnaire extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "basequestionnaire";

    @NonNull
    @ProtobufIndex(index = 2)
    public String description;

    @NonNull
    @ProtobufIndex(index = 1)
    public String title;
    public static ProtobufAdapter<BaseQuestionnaire> PROTOBUF_ADAPTER = new MessageNanoAdapter<BaseQuestionnaire>() { // from class: com.p1.mobile.putong.core.data.BaseQuestionnaire.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(BaseQuestionnaire baseQuestionnaire) {
            String str = baseQuestionnaire.title;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = baseQuestionnaire.description;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            baseQuestionnaire.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public BaseQuestionnaire parse(nb5 nb5Var) throws IOException {
            BaseQuestionnaire baseQuestionnaire = new BaseQuestionnaire();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (baseQuestionnaire.title == null) {
                        baseQuestionnaire.title = "";
                    }
                    if (baseQuestionnaire.description != null) {
                        break;
                    }
                    baseQuestionnaire.description = "";
                    break;
                }
                if (iM158752u == 10) {
                    baseQuestionnaire.title = nb5Var.m158750s();
                } else {
                    if (iM158752u != 18) {
                        if (baseQuestionnaire.title == null) {
                            baseQuestionnaire.title = "";
                        }
                        if (baseQuestionnaire.description != null) {
                            break;
                        }
                        baseQuestionnaire.description = "";
                        return baseQuestionnaire;
                    }
                    baseQuestionnaire.description = nb5Var.m158750s();
                }
            }
            return baseQuestionnaire;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(BaseQuestionnaire baseQuestionnaire, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = baseQuestionnaire.title;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = baseQuestionnaire.description;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
        }
    };
    public static JsonAdapter<BaseQuestionnaire> JSON_ADAPTER = new ObjectJsonAdapter<BaseQuestionnaire>() { // from class: com.p1.mobile.putong.core.data.BaseQuestionnaire.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BaseQuestionnaire.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BaseQuestionnaire newInstance() {
            return new BaseQuestionnaire();
        }

        public boolean parseField(BaseQuestionnaire baseQuestionnaire, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("description")) {
                baseQuestionnaire.description = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("title")) {
                return false;
            }
            baseQuestionnaire.title = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(BaseQuestionnaire baseQuestionnaire, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("description") || str.equals("title")) {
                return true;
            }
            return super.parseFieldCheck(baseQuestionnaire, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BaseQuestionnaire baseQuestionnaire, JsonGenerator jsonGenerator) throws IOException {
            String str = baseQuestionnaire.title;
            if (str != null) {
                jsonGenerator.writeStringField("title", str);
            }
            String str2 = baseQuestionnaire.description;
            if (str2 != null) {
                jsonGenerator.writeStringField("description", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((BaseQuestionnaire) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BaseQuestionnaire) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static BaseQuestionnaire new_() {
        BaseQuestionnaire baseQuestionnaire = new BaseQuestionnaire();
        baseQuestionnaire.nullCheck();
        return baseQuestionnaire;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BaseQuestionnaire mo223809clone() {
        BaseQuestionnaire baseQuestionnaire = new BaseQuestionnaire();
        baseQuestionnaire.title = this.title;
        baseQuestionnaire.description = this.description;
        return baseQuestionnaire;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BaseQuestionnaire)) {
            return false;
        }
        BaseQuestionnaire baseQuestionnaire = (BaseQuestionnaire) obj;
        return ValueObject.util_equals(this.title, baseQuestionnaire.title) && ValueObject.util_equals(this.description, baseQuestionnaire.description);
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
        String str = this.title;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.description;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
        if (this.description == null) {
            this.description = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
