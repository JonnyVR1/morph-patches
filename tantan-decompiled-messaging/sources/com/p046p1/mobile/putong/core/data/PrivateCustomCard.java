package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.PrivateCustomCard;
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
public class PrivateCustomCard extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "privatecustomcard";

    @NonNull
    @ProtobufIndex(index = 3)
    public PrivateCustomRelation relation;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> tags;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;
    public static ProtobufAdapter<PrivateCustomCard> PROTOBUF_ADAPTER = new MessageNanoAdapter<PrivateCustomCard>() { // from class: com.p1.mobile.putong.core.data.PrivateCustomCard.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(PrivateCustomCard privateCustomCard) {
            String str = privateCustomCard.userId;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            List<String> list = privateCustomCard.tags;
            if (list != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            PrivateCustomRelation privateCustomRelation = privateCustomCard.relation;
            if (privateCustomRelation != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(3, privateCustomRelation, PrivateCustomRelation.PROTOBUF_ADAPTER);
            }
            privateCustomCard.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public PrivateCustomCard parse(nb5 nb5Var) throws IOException {
            PrivateCustomCard privateCustomCard = new PrivateCustomCard();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (privateCustomCard.userId == null) {
                        privateCustomCard.userId = "";
                    }
                    if (privateCustomCard.tags == null) {
                        privateCustomCard.tags = new ArrayList();
                    }
                    if (privateCustomCard.relation != null) {
                        break;
                    }
                    privateCustomCard.relation = PrivateCustomRelation.new_();
                    break;
                }
                if (iM158752u == 10) {
                    privateCustomCard.userId = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    privateCustomCard.tags = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM158752u != 26) {
                        if (privateCustomCard.userId == null) {
                            privateCustomCard.userId = "";
                        }
                        if (privateCustomCard.tags == null) {
                            privateCustomCard.tags = new ArrayList();
                        }
                        if (privateCustomCard.relation != null) {
                            break;
                        }
                        privateCustomCard.relation = PrivateCustomRelation.new_();
                        return privateCustomCard;
                    }
                    privateCustomCard.relation = (PrivateCustomRelation) nb5Var.m158743l(PrivateCustomRelation.PROTOBUF_ADAPTER);
                }
            }
            return privateCustomCard;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(PrivateCustomCard privateCustomCard, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = privateCustomCard.userId;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            List<String> list = privateCustomCard.tags;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            PrivateCustomRelation privateCustomRelation = privateCustomCard.relation;
            if (privateCustomRelation != null) {
                codedOutputByteBufferNano.m17254K(3, privateCustomRelation, PrivateCustomRelation.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<PrivateCustomCard> JSON_ADAPTER = new ObjectJsonAdapter<PrivateCustomCard>() { // from class: com.p1.mobile.putong.core.data.PrivateCustomCard.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return PrivateCustomCard.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public PrivateCustomCard newInstance() {
            return new PrivateCustomCard();
        }

        public boolean parseField(PrivateCustomCard privateCustomCard, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "userId":
                    privateCustomCard.userId = jsonParser.getValueAsString();
                    return true;
                case "relation":
                    privateCustomCard.relation = PrivateCustomRelation.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "tags":
                    privateCustomCard.tags = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(PrivateCustomCard privateCustomCard, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "userId":
                case "relation":
                case "tags":
                    return true;
                default:
                    return super.parseFieldCheck(privateCustomCard, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PrivateCustomCard privateCustomCard, JsonGenerator jsonGenerator) throws IOException {
            String str = privateCustomCard.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            if (privateCustomCard.tags != null) {
                jsonGenerator.writeFieldName("tags");
                JsonAdapter.serializeArray(privateCustomCard.tags, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (privateCustomCard.relation != null) {
                jsonGenerator.writeFieldName("relation");
                PrivateCustomRelation.JSON_ADAPTER.serialize(privateCustomCard.relation, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PrivateCustomCard) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PrivateCustomCard) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m35748a(String str) {
        return str;
    }

    public static PrivateCustomCard new_() {
        PrivateCustomCard privateCustomCard = new PrivateCustomCard();
        privateCustomCard.nullCheck();
        return privateCustomCard;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public PrivateCustomCard mo223809clone() {
        PrivateCustomCard privateCustomCard = new PrivateCustomCard();
        privateCustomCard.userId = this.userId;
        List<String> list = this.tags;
        if (list != null) {
            privateCustomCard.tags = ValueObject.util_map(list, new w9j() { // from class: l.dq80
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return PrivateCustomCard.m35748a((String) obj);
                }
            });
        }
        PrivateCustomRelation privateCustomRelation = this.relation;
        if (privateCustomRelation != null) {
            privateCustomCard.relation = privateCustomRelation.mo223809clone();
        }
        return privateCustomCard;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PrivateCustomCard)) {
            return false;
        }
        PrivateCustomCard privateCustomCard = (PrivateCustomCard) obj;
        return ValueObject.util_equals(this.userId, privateCustomCard.userId) && ValueObject.util_equals(this.tags, privateCustomCard.tags) && ValueObject.util_equals(this.relation, privateCustomCard.relation);
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
        String str = this.userId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<String> list = this.tags;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 41;
        PrivateCustomRelation privateCustomRelation = this.relation;
        int iHashCode3 = iHashCode2 + (privateCustomRelation != null ? privateCustomRelation.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.tags == null) {
            this.tags = new ArrayList();
        }
        if (this.relation == null) {
            this.relation = PrivateCustomRelation.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
