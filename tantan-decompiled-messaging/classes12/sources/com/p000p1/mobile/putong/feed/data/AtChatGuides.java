package com.p000p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p000p1.mobile.putong.feed.data.AtChatGuides;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(AtChatGuides atChatGuides) {
            String str = atChatGuides.title;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            List<String> list = atChatGuides.questions;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) atChatGuides).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public AtChatGuides m19410parse(nb5 nb5Var) throws IOException {
            AtChatGuides atChatGuides = new AtChatGuides();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (atChatGuides.title == null) {
                        atChatGuides.title = "";
                    }
                    if (atChatGuides.questions != null) {
                        break;
                    }
                    atChatGuides.questions = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    atChatGuides.title = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (atChatGuides.title == null) {
                            atChatGuides.title = "";
                        }
                        if (atChatGuides.questions != null) {
                            break;
                        }
                        atChatGuides.questions = new ArrayList();
                        return atChatGuides;
                    }
                    atChatGuides.questions = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return atChatGuides;
        }

        public void serialize(AtChatGuides atChatGuides, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = atChatGuides.title;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            List<String> list = atChatGuides.questions;
            if (list != null) {
                codedOutputByteBufferNano.K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<AtChatGuides> JSON_ADAPTER = new ObjectJsonAdapter<AtChatGuides>() { // from class: com.p1.mobile.putong.feed.data.AtChatGuides.2
        public Class getDataClass() {
            return AtChatGuides.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public AtChatGuides mo17830newInstance() {
            return new AtChatGuides();
        }

        public boolean parseField(AtChatGuides atChatGuides, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("questions")) {
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
            if (str.equals("questions") || str.equals("title")) {
                return true;
            }
            return super.parseFieldCheck(atChatGuides, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AtChatGuides atChatGuides, JsonGenerator jsonGenerator) throws IOException {
            String str = atChatGuides.title;
            if (str != null) {
                jsonGenerator.writeStringField("title", str);
            }
            if (atChatGuides.questions != null) {
                jsonGenerator.writeFieldName("questions");
                JsonAdapter.serializeArray(atChatGuides.questions, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AtChatGuides) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AtChatGuides) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m1706a(String str) {
        return str;
    }

    public static AtChatGuides new_() {
        AtChatGuides atChatGuides = new AtChatGuides();
        atChatGuides.nullCheck();
        return atChatGuides;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AtChatGuides m19409clone() {
        AtChatGuides atChatGuides = new AtChatGuides();
        atChatGuides.title = this.title;
        List<String> list = this.questions;
        if (list != null) {
            atChatGuides.questions = ValueObject.util_map(list, new w9j() { // from class: l.w21
                public final Object call(Object obj) {
                    return AtChatGuides.m1706a((String) obj);
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.title;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<String> list = this.questions;
        int iHashCode2 = iHashCode + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
        if (this.questions == null) {
            this.questions = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
