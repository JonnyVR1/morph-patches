package com.p046p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.Questions;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.feed.data.AtChatGuides;
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
public class AtChatGuides extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "atchatguides";

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> questions;

    @NonNull
    @ProtobufIndex(index = 1)
    public String title;
    public static ProtobufAdapter<AtChatGuides> PROTOBUF_ADAPTER = new MessageNanoAdapter<AtChatGuides>() { // from class: com.p1.mobile.putong.feed.data.AtChatGuides.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(AtChatGuides atChatGuides) {
            String str = atChatGuides.title;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            List<String> list = atChatGuides.questions;
            if (list != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            atChatGuides.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AtChatGuides parse(nb5 nb5Var) throws IOException {
            AtChatGuides atChatGuides = new AtChatGuides();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (atChatGuides.title == null) {
                        atChatGuides.title = "";
                    }
                    if (atChatGuides.questions != null) {
                        break;
                    }
                    atChatGuides.questions = new ArrayList();
                    break;
                }
                if (iM158752u == 10) {
                    atChatGuides.title = nb5Var.m158750s();
                } else {
                    if (iM158752u != 18) {
                        if (atChatGuides.title == null) {
                            atChatGuides.title = "";
                        }
                        if (atChatGuides.questions != null) {
                            break;
                        }
                        atChatGuides.questions = new ArrayList();
                        return atChatGuides;
                    }
                    atChatGuides.questions = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return atChatGuides;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AtChatGuides atChatGuides, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = atChatGuides.title;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            List<String> list = atChatGuides.questions;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<AtChatGuides> JSON_ADAPTER = new ObjectJsonAdapter<AtChatGuides>() { // from class: com.p1.mobile.putong.feed.data.AtChatGuides.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AtChatGuides.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public AtChatGuides newInstance() {
            return new AtChatGuides();
        }

        public boolean parseField(AtChatGuides atChatGuides, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(Questions.TYPE)) {
                atChatGuides.questions = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("title")) {
                return false;
            }
            atChatGuides.title = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(AtChatGuides atChatGuides, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(Questions.TYPE) || str.equals("title")) {
                return true;
            }
            return super.parseFieldCheck(atChatGuides, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AtChatGuides atChatGuides, JsonGenerator jsonGenerator) throws IOException {
            String str = atChatGuides.title;
            if (str != null) {
                jsonGenerator.writeStringField("title", str);
            }
            if (atChatGuides.questions != null) {
                jsonGenerator.writeFieldName(Questions.TYPE);
                JsonAdapter.serializeArray(atChatGuides.questions, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AtChatGuides) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AtChatGuides) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m60780a(String str) {
        return str;
    }

    public static AtChatGuides new_() {
        AtChatGuides atChatGuides = new AtChatGuides();
        atChatGuides.nullCheck();
        return atChatGuides;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public AtChatGuides mo223809clone() {
        AtChatGuides atChatGuides = new AtChatGuides();
        atChatGuides.title = this.title;
        List<String> list = this.questions;
        if (list != null) {
            atChatGuides.questions = ValueObject.util_map(list, new w9j() { // from class: l.w21
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return AtChatGuides.m60780a((String) obj);
                }
            });
        }
        return atChatGuides;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AtChatGuides)) {
            return false;
        }
        AtChatGuides atChatGuides = (AtChatGuides) obj;
        return ValueObject.util_equals(this.title, atChatGuides.title) && ValueObject.util_equals(this.questions, atChatGuides.questions);
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
        List<String> list = this.questions;
        int iHashCode2 = iHashCode + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
        if (this.questions == null) {
            this.questions = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
