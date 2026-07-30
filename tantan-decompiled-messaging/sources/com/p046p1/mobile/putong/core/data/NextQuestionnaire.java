package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.NextQuestionnaireOptions;
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
public class NextQuestionnaire extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "nextquestionnaire";

    @NonNull
    @ProtobufIndex(index = 2)
    public String description;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<NextQuestionnaireOptions> options;

    @NonNull
    @ProtobufIndex(index = 1)
    public String title;
    public static ProtobufAdapter<NextQuestionnaire> PROTOBUF_ADAPTER = new MessageNanoAdapter<NextQuestionnaire>() { // from class: com.p1.mobile.putong.core.data.NextQuestionnaire.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(NextQuestionnaire nextQuestionnaire) {
            String str = nextQuestionnaire.title;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = nextQuestionnaire.description;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            List<NextQuestionnaireOptions> list = nextQuestionnaire.options;
            if (list != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(3, list, NextQuestionnaireOptions.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            nextQuestionnaire.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public NextQuestionnaire parse(nb5 nb5Var) throws IOException {
            NextQuestionnaire nextQuestionnaire = new NextQuestionnaire();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (nextQuestionnaire.title == null) {
                        nextQuestionnaire.title = "";
                    }
                    if (nextQuestionnaire.description == null) {
                        nextQuestionnaire.description = "";
                    }
                    if (nextQuestionnaire.options != null) {
                        break;
                    }
                    nextQuestionnaire.options = new ArrayList();
                    break;
                }
                if (iM158752u == 10) {
                    nextQuestionnaire.title = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    nextQuestionnaire.description = nb5Var.m158750s();
                } else {
                    if (iM158752u != 26) {
                        if (nextQuestionnaire.title == null) {
                            nextQuestionnaire.title = "";
                        }
                        if (nextQuestionnaire.description == null) {
                            nextQuestionnaire.description = "";
                        }
                        if (nextQuestionnaire.options != null) {
                            break;
                        }
                        nextQuestionnaire.options = new ArrayList();
                        return nextQuestionnaire;
                    }
                    nextQuestionnaire.options = (List) nb5Var.m158743l(NextQuestionnaireOptions.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return nextQuestionnaire;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(NextQuestionnaire nextQuestionnaire, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = nextQuestionnaire.title;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = nextQuestionnaire.description;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            List<NextQuestionnaireOptions> list = nextQuestionnaire.options;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(3, list, NextQuestionnaireOptions.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<NextQuestionnaire> JSON_ADAPTER = new ObjectJsonAdapter<NextQuestionnaire>() { // from class: com.p1.mobile.putong.core.data.NextQuestionnaire.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return NextQuestionnaire.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public NextQuestionnaire newInstance() {
            return new NextQuestionnaire();
        }

        public boolean parseField(NextQuestionnaire nextQuestionnaire, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "description":
                    nextQuestionnaire.description = jsonParser.getValueAsString();
                    return true;
                case "options":
                    nextQuestionnaire.options = JsonAdapter.parseArray(jsonParser, NextQuestionnaireOptions.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "title":
                    nextQuestionnaire.title = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(NextQuestionnaire nextQuestionnaire, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "description":
                case "options":
                case "title":
                    return true;
                default:
                    return super.parseFieldCheck(nextQuestionnaire, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(NextQuestionnaire nextQuestionnaire, JsonGenerator jsonGenerator) throws IOException {
            String str = nextQuestionnaire.title;
            if (str != null) {
                jsonGenerator.writeStringField("title", str);
            }
            String str2 = nextQuestionnaire.description;
            if (str2 != null) {
                jsonGenerator.writeStringField("description", str2);
            }
            if (nextQuestionnaire.options != null) {
                jsonGenerator.writeFieldName(Options.TYPE);
                JsonAdapter.serializeArray(nextQuestionnaire.options, jsonGenerator, NextQuestionnaireOptions.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((NextQuestionnaire) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((NextQuestionnaire) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static NextQuestionnaire new_() {
        NextQuestionnaire nextQuestionnaire = new NextQuestionnaire();
        nextQuestionnaire.nullCheck();
        return nextQuestionnaire;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public NextQuestionnaire mo223809clone() {
        NextQuestionnaire nextQuestionnaire = new NextQuestionnaire();
        nextQuestionnaire.title = this.title;
        nextQuestionnaire.description = this.description;
        List<NextQuestionnaireOptions> list = this.options;
        if (list != null) {
            nextQuestionnaire.options = ValueObject.util_map(list, new w9j() { // from class: l.si40
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((NextQuestionnaireOptions) obj).mo223809clone();
                }
            });
        }
        return nextQuestionnaire;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NextQuestionnaire)) {
            return false;
        }
        NextQuestionnaire nextQuestionnaire = (NextQuestionnaire) obj;
        return ValueObject.util_equals(this.title, nextQuestionnaire.title) && ValueObject.util_equals(this.description, nextQuestionnaire.description) && ValueObject.util_equals(this.options, nextQuestionnaire.options);
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
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<NextQuestionnaireOptions> list = this.options;
        int iHashCode3 = iHashCode2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
        if (this.description == null) {
            this.description = "";
        }
        if (this.options == null) {
            this.options = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
