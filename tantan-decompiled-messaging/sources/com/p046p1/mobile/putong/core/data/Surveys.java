package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.Questions;
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

/* JADX INFO: loaded from: classes10.dex */
public class Surveys extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "surveys";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f20512id;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<Questions> questions;

    @NonNull
    @ProtobufIndex(index = 3)
    public RequiredVersion requiredVersion;
    public static ProtobufAdapter<Surveys> PROTOBUF_ADAPTER = new MessageNanoAdapter<Surveys>() { // from class: com.p1.mobile.putong.core.data.Surveys.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Surveys surveys) {
            String str = surveys.f20512id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            List<Questions> list = surveys.questions;
            if (list != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(2, list, Questions.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            RequiredVersion requiredVersion = surveys.requiredVersion;
            if (requiredVersion != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(3, requiredVersion, RequiredVersion.PROTOBUF_ADAPTER);
            }
            surveys.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Surveys parse(nb5 nb5Var) throws IOException {
            Surveys surveys = new Surveys();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (surveys.f20512id == null) {
                        surveys.f20512id = "";
                    }
                    if (surveys.questions == null) {
                        surveys.questions = new ArrayList();
                    }
                    if (surveys.requiredVersion != null) {
                        break;
                    }
                    surveys.requiredVersion = RequiredVersion.new_();
                    break;
                }
                if (iM158752u == 10) {
                    surveys.f20512id = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    surveys.questions = (List) nb5Var.m158743l(Questions.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM158752u != 26) {
                        if (surveys.f20512id == null) {
                            surveys.f20512id = "";
                        }
                        if (surveys.questions == null) {
                            surveys.questions = new ArrayList();
                        }
                        if (surveys.requiredVersion != null) {
                            break;
                        }
                        surveys.requiredVersion = RequiredVersion.new_();
                        return surveys;
                    }
                    surveys.requiredVersion = (RequiredVersion) nb5Var.m158743l(RequiredVersion.PROTOBUF_ADAPTER);
                }
            }
            return surveys;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Surveys surveys, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = surveys.f20512id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            List<Questions> list = surveys.questions;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(2, list, Questions.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            RequiredVersion requiredVersion = surveys.requiredVersion;
            if (requiredVersion != null) {
                codedOutputByteBufferNano.m17254K(3, requiredVersion, RequiredVersion.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<Surveys> JSON_ADAPTER = new ObjectJsonAdapter<Surveys>() { // from class: com.p1.mobile.putong.core.data.Surveys.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Surveys.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Surveys newInstance() {
            return new Surveys();
        }

        public boolean parseField(Surveys surveys, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "questions":
                    surveys.questions = JsonAdapter.parseArray(jsonParser, Questions.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    surveys.f20512id = jsonParser.getValueAsString();
                    return false;
                case "requiredVersion":
                    surveys.requiredVersion = RequiredVersion.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(Surveys surveys, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "questions":
                    return true;
                case "id":
                    return false;
                case "requiredVersion":
                    return true;
                default:
                    return super.parseFieldCheck(surveys, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Surveys surveys, JsonGenerator jsonGenerator) throws IOException {
            String str = surveys.f20512id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (surveys.questions != null) {
                jsonGenerator.writeFieldName(Questions.TYPE);
                JsonAdapter.serializeArray(surveys.questions, jsonGenerator, Questions.JSON_ADAPTER);
            }
            if (surveys.requiredVersion != null) {
                jsonGenerator.writeFieldName("requiredVersion");
                RequiredVersion.JSON_ADAPTER.serialize(surveys.requiredVersion, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Surveys) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Surveys) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Surveys new_() {
        Surveys surveys = new Surveys();
        surveys.nullCheck();
        return surveys;
    }

    public static Surveys parse(String str, Surveys surveys) {
        try {
            return JSON_ADAPTER.parse(str);
        } catch (IOException e) {
            e.printStackTrace();
            return surveys;
        }
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Surveys mo223809clone() {
        Surveys surveys = new Surveys();
        surveys.f20512id = this.f20512id;
        List<Questions> list = this.questions;
        if (list != null) {
            surveys.questions = ValueObject.util_map(list, new w9j() { // from class: l.h5h0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((Questions) obj).mo223809clone();
                }
            });
        }
        RequiredVersion requiredVersion = this.requiredVersion;
        if (requiredVersion != null) {
            surveys.requiredVersion = requiredVersion.mo223809clone();
        }
        return surveys;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Surveys)) {
            return false;
        }
        Surveys surveys = (Surveys) obj;
        return ValueObject.util_equals(this.f20512id, surveys.f20512id) && ValueObject.util_equals(this.questions, surveys.questions) && ValueObject.util_equals(this.requiredVersion, surveys.requiredVersion);
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
        String str = this.f20512id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<Questions> list = this.questions;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 41;
        RequiredVersion requiredVersion = this.requiredVersion;
        int iHashCode3 = iHashCode2 + (requiredVersion != null ? requiredVersion.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f20512id == null) {
            this.f20512id = "";
        }
        if (this.questions == null) {
            this.questions = new ArrayList();
        }
        if (this.requiredVersion == null) {
            this.requiredVersion = RequiredVersion.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
