package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.Questions;
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
public class Surveys extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "surveys";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f174id;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public List<Questions> questions;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public RequiredVersion requiredVersion;
    public static ProtobufAdapter<Surveys> PROTOBUF_ADAPTER = new MessageNanoAdapter<Surveys>() { // from class: com.p1.mobile.putong.core.data.Surveys.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Surveys surveys) {
            String str = surveys.f174id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            List<Questions> list = surveys.questions;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(2, list, Questions.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            RequiredVersion requiredVersion = surveys.requiredVersion;
            if (requiredVersion != null) {
                iO += CodedOutputByteBufferNano.l(3, requiredVersion, RequiredVersion.PROTOBUF_ADAPTER);
            }
            ((MessageNano) surveys).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Surveys m15842parse(nb5 nb5Var) throws IOException {
            Surveys surveys = new Surveys();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (surveys.f174id == null) {
                        surveys.f174id = "";
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
                if (iU == 10) {
                    surveys.f174id = nb5Var.s();
                } else if (iU == 18) {
                    surveys.questions = (List) nb5Var.l(Questions.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 26) {
                        if (surveys.f174id == null) {
                            surveys.f174id = "";
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
                    surveys.requiredVersion = (RequiredVersion) nb5Var.l(RequiredVersion.PROTOBUF_ADAPTER);
                }
            }
            return surveys;
        }

        public void serialize(Surveys surveys, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = surveys.f174id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            List<Questions> list = surveys.questions;
            if (list != null) {
                codedOutputByteBufferNano.K(2, list, Questions.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            RequiredVersion requiredVersion = surveys.requiredVersion;
            if (requiredVersion != null) {
                codedOutputByteBufferNano.K(3, requiredVersion, RequiredVersion.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<Surveys> JSON_ADAPTER = new ObjectJsonAdapter<Surveys>() { // from class: com.p1.mobile.putong.core.data.Surveys.2
        public Class getDataClass() {
            return Surveys.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public Surveys m15843newInstance() {
            return new Surveys();
        }

        public boolean parseField(Surveys surveys, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "questions":
                    surveys.questions = JsonAdapter.parseArray(jsonParser, Questions.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    surveys.f174id = jsonParser.getValueAsString();
                    return false;
                case "requiredVersion":
                    surveys.requiredVersion = (RequiredVersion) RequiredVersion.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        public void serializeFields(Surveys surveys, JsonGenerator jsonGenerator) throws IOException {
            String str = surveys.f174id;
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Surveys) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

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
            return (Surveys) JSON_ADAPTER.parse(str);
        } catch (IOException e) {
            e.printStackTrace();
            return surveys;
        }
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Surveys m15841clone() {
        Surveys surveys = new Surveys();
        surveys.f174id = this.f174id;
        List<Questions> list = this.questions;
        if (list != null) {
            surveys.questions = ValueObject.util_map(list, new w9j() { // from class: l.h5h0
                public final Object call(Object obj) {
                    return ((Questions) obj).m15144clone();
                }
            });
        }
        RequiredVersion requiredVersion = this.requiredVersion;
        if (requiredVersion != null) {
            surveys.requiredVersion = requiredVersion.m15414clone();
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
        return ValueObject.util_equals(this.f174id, surveys.f174id) && ValueObject.util_equals(this.questions, surveys.questions) && ValueObject.util_equals(this.requiredVersion, surveys.requiredVersion);
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
        String str = this.f174id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<Questions> list = this.questions;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 41;
        RequiredVersion requiredVersion = this.requiredVersion;
        int iHashCode3 = iHashCode2 + (requiredVersion != null ? requiredVersion.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.f174id == null) {
            this.f174id = "";
        }
        if (this.questions == null) {
            this.questions = new ArrayList();
        }
        if (this.requiredVersion == null) {
            this.requiredVersion = RequiredVersion.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
