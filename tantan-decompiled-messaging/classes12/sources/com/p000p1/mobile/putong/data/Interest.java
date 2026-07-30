package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.Interest;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class Interest extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "interest";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> emoji;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> tags;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<String> taste;
    public static ProtobufAdapter<Interest> PROTOBUF_ADAPTER = new MessageNanoAdapter<Interest>() { // from class: com.p1.mobile.putong.data.Interest.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Interest interest) {
            List<String> list = interest.emoji;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<String> list2 = interest.tags;
            if (list2 != null) {
                iL += CodedOutputByteBufferNano.l(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list3 = interest.taste;
            if (list3 != null) {
                iL += CodedOutputByteBufferNano.l(3, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) interest).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Interest m18223parse(nb5 nb5Var) throws IOException {
            Interest interest = new Interest();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (interest.emoji == null) {
                        interest.emoji = new ArrayList();
                    }
                    if (interest.tags == null) {
                        interest.tags = new ArrayList();
                    }
                    if (interest.taste != null) {
                        break;
                    }
                    interest.taste = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    interest.emoji = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 18) {
                    interest.tags = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 26) {
                        if (interest.emoji == null) {
                            interest.emoji = new ArrayList();
                        }
                        if (interest.tags == null) {
                            interest.tags = new ArrayList();
                        }
                        if (interest.taste != null) {
                            break;
                        }
                        interest.taste = new ArrayList();
                        return interest;
                    }
                    interest.taste = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return interest;
        }

        public void serialize(Interest interest, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = interest.emoji;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = interest.tags;
            if (list2 != null) {
                codedOutputByteBufferNano.K(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list3 = interest.taste;
            if (list3 != null) {
                codedOutputByteBufferNano.K(3, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<Interest> JSON_ADAPTER = new ObjectJsonAdapter<Interest>() { // from class: com.p1.mobile.putong.data.Interest.2
        public Class getDataClass() {
            return Interest.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public Interest mo17830newInstance() {
            return new Interest();
        }

        public boolean parseField(Interest interest, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "tags":
                    interest.tags = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "emoji":
                    interest.emoji = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "taste":
                    interest.taste = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(Interest interest, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "tags":
                case "emoji":
                case "taste":
                    return true;
                default:
                    return super.parseFieldCheck(interest, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Interest interest, JsonGenerator jsonGenerator) throws IOException {
            if (interest.emoji != null) {
                jsonGenerator.writeFieldName("emoji");
                JsonAdapter.serializeArray(interest.emoji, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (interest.tags != null) {
                jsonGenerator.writeFieldName("tags");
                JsonAdapter.serializeArray(interest.tags, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (interest.taste != null) {
                jsonGenerator.writeFieldName("taste");
                JsonAdapter.serializeArray(interest.taste, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Interest) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Interest) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m723a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m724b(String str) {
        return str;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m725c(String str) {
        return str;
    }

    public static Interest new_() {
        Interest interest = new Interest();
        interest.nullCheck();
        return interest;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Interest m18222clone() {
        Interest interest = new Interest();
        List<String> list = this.emoji;
        if (list != null) {
            interest.emoji = ValueObject.util_map(list, new w9j() { // from class: l.cxm
                public final Object call(Object obj) {
                    return Interest.m724b((String) obj);
                }
            });
        }
        List<String> list2 = this.tags;
        if (list2 != null) {
            interest.tags = ValueObject.util_map(list2, new w9j() { // from class: l.dxm
                public final Object call(Object obj) {
                    return Interest.m725c((String) obj);
                }
            });
        }
        List<String> list3 = this.taste;
        if (list3 != null) {
            interest.taste = ValueObject.util_map(list3, new w9j() { // from class: l.exm
                public final Object call(Object obj) {
                    return Interest.m723a((String) obj);
                }
            });
        }
        return interest;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Interest)) {
            return false;
        }
        Interest interest = (Interest) obj;
        return ValueObject.util_equals(this.emoji, interest.emoji) && ValueObject.util_equals(this.tags, interest.tags) && ValueObject.util_equals(this.taste, interest.taste);
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
        List<String> list = this.emoji;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<String> list2 = this.tags;
        int iHashCode2 = (iHashCode + (list2 != null ? list2.hashCode() : 0)) * 41;
        List<String> list3 = this.taste;
        int iHashCode3 = iHashCode2 + (list3 != null ? list3.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.emoji == null) {
            this.emoji = new ArrayList();
        }
        if (this.tags == null) {
            this.tags = new ArrayList();
        }
        if (this.taste == null) {
            this.taste = new ArrayList();
        }
    }

    public Interest subtract(Interest interest) {
        Interest interest2 = new Interest();
        if (!ValueObject.util_equals(this.emoji, interest.emoji)) {
            interest2.emoji = this.emoji;
        }
        if (!ValueObject.util_equals(this.tags, interest.tags)) {
            interest2.tags = this.tags;
        }
        if (!ValueObject.util_equals(this.taste, interest.taste)) {
            interest2.taste = this.taste;
        }
        if (interest2.equals(new Interest())) {
            return null;
        }
        return interest2;
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
