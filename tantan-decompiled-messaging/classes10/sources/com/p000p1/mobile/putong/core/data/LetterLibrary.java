package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.LetterLibrary;
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
public class LetterLibrary extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "letterlibrary";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> female;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public List<String> male;
    public static ProtobufAdapter<LetterLibrary> PROTOBUF_ADAPTER = new MessageNanoAdapter<LetterLibrary>() { // from class: com.p1.mobile.putong.core.data.LetterLibrary.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(LetterLibrary letterLibrary) {
            List<String> list = letterLibrary.female;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<String> list2 = letterLibrary.male;
            if (list2 != null) {
                iL += CodedOutputByteBufferNano.l(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) letterLibrary).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public LetterLibrary m13829parse(nb5 nb5Var) throws IOException {
            LetterLibrary letterLibrary = new LetterLibrary();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (letterLibrary.female == null) {
                        letterLibrary.female = new ArrayList();
                    }
                    if (letterLibrary.male != null) {
                        break;
                    }
                    letterLibrary.male = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    letterLibrary.female = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 18) {
                        if (letterLibrary.female == null) {
                            letterLibrary.female = new ArrayList();
                        }
                        if (letterLibrary.male != null) {
                            break;
                        }
                        letterLibrary.male = new ArrayList();
                        return letterLibrary;
                    }
                    letterLibrary.male = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return letterLibrary;
        }

        public void serialize(LetterLibrary letterLibrary, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = letterLibrary.female;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = letterLibrary.male;
            if (list2 != null) {
                codedOutputByteBufferNano.K(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<LetterLibrary> JSON_ADAPTER = new ObjectJsonAdapter<LetterLibrary>() { // from class: com.p1.mobile.putong.core.data.LetterLibrary.2
        public Class getDataClass() {
            return LetterLibrary.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public LetterLibrary m13830newInstance() {
            return new LetterLibrary();
        }

        public boolean parseField(LetterLibrary letterLibrary, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("female")) {
                letterLibrary.female = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("male")) {
                return false;
            }
            letterLibrary.male = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(LetterLibrary letterLibrary, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("female") || str.equals("male")) {
                return true;
            }
            return super.parseFieldCheck(letterLibrary, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(LetterLibrary letterLibrary, JsonGenerator jsonGenerator) throws IOException {
            if (letterLibrary.female != null) {
                jsonGenerator.writeFieldName("female");
                JsonAdapter.serializeArray(letterLibrary.female, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (letterLibrary.male != null) {
                jsonGenerator.writeFieldName("male");
                JsonAdapter.serializeArray(letterLibrary.male, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LetterLibrary) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LetterLibrary) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m438a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m439b(String str) {
        return str;
    }

    public static LetterLibrary new_() {
        LetterLibrary letterLibrary = new LetterLibrary();
        letterLibrary.nullCheck();
        return letterLibrary;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public LetterLibrary m13828clone() {
        LetterLibrary letterLibrary = new LetterLibrary();
        List<String> list = this.female;
        if (list != null) {
            letterLibrary.female = ValueObject.util_map(list, new w9j() { // from class: l.abr
                public final Object call(Object obj) {
                    return LetterLibrary.m439b((String) obj);
                }
            });
        }
        List<String> list2 = this.male;
        if (list2 != null) {
            letterLibrary.male = ValueObject.util_map(list2, new w9j() { // from class: l.bbr
                public final Object call(Object obj) {
                    return LetterLibrary.m438a((String) obj);
                }
            });
        }
        return letterLibrary;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LetterLibrary)) {
            return false;
        }
        LetterLibrary letterLibrary = (LetterLibrary) obj;
        return ValueObject.util_equals(this.female, letterLibrary.female) && ValueObject.util_equals(this.male, letterLibrary.male);
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
        List<String> list = this.female;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<String> list2 = this.male;
        int iHashCode2 = iHashCode + (list2 != null ? list2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.female == null) {
            this.female = new ArrayList();
        }
        if (this.male == null) {
            this.male = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
