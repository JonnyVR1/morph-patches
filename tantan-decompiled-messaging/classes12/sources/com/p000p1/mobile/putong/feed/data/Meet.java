package com.p000p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
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
import java.util.HashSet;
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class Meet extends ValueObject<Meet> implements Cloneable, Serializable {
    public static final String TYPE = "meet";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 2)
    public String f690id;
    private HashSet<String> parseFieldSet = new HashSet<>();
    private String requestUrl;

    @NonNull
    @ProtobufIndex(index = 1)
    public String type;

    @NonNull
    @ProtobufIndex(index = 3)
    public String userId;
    public static ProtobufAdapter<Meet> PROTOBUF_ADAPTER = new MessageNanoAdapter<Meet>() { // from class: com.p1.mobile.putong.feed.data.Meet.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Meet meet) {
            String str = meet.type;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = meet.f690id;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = meet.userId;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            ((MessageNano) meet).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Meet m19587parse(nb5 nb5Var) throws IOException {
            Meet meet = new Meet();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (meet.type == null) {
                        meet.type = "";
                    }
                    if (meet.f690id == null) {
                        meet.f690id = "";
                    }
                    if (meet.userId != null) {
                        break;
                    }
                    meet.userId = "";
                    break;
                }
                if (iU == 10) {
                    meet.type = nb5Var.s();
                } else if (iU == 18) {
                    meet.f690id = nb5Var.s();
                } else {
                    if (iU != 26) {
                        if (meet.type == null) {
                            meet.type = "";
                        }
                        if (meet.f690id == null) {
                            meet.f690id = "";
                        }
                        if (meet.userId != null) {
                            break;
                        }
                        meet.userId = "";
                        return meet;
                    }
                    meet.userId = nb5Var.s();
                }
            }
            return meet;
        }

        public void serialize(Meet meet, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = meet.type;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = meet.f690id;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = meet.userId;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
        }
    };
    public static JsonAdapter<Meet> JSON_ADAPTER = new ObjectJsonAdapter<Meet>() { // from class: com.p1.mobile.putong.feed.data.Meet.2
        public Class getDataClass() {
            return Meet.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public Meet mo17830newInstance() {
            return new Meet();
        }

        public boolean parseField(Meet meet, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "userId":
                    meet.userId = jsonParser.getValueAsString();
                    return true;
                case "id":
                    meet.f690id = jsonParser.getValueAsString();
                    return false;
                case "type":
                    meet.type = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(Meet meet, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "userId":
                    return true;
                case "id":
                    return false;
                case "type":
                    return true;
                default:
                    return super.parseFieldCheck(meet, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Meet meet, JsonGenerator jsonGenerator) throws IOException {
            String str = meet.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
            String str2 = meet.f690id;
            if (str2 != null) {
                jsonGenerator.writeStringField("id", str2);
            }
            String str3 = meet.userId;
            if (str3 != null) {
                jsonGenerator.writeStringField("userId", str3);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Meet) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Meet) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Meet new_() {
        Meet meet = new Meet();
        meet.nullCheck();
        return meet;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Meet m19586clone() {
        Meet meet = new Meet();
        meet.type = this.type;
        meet.f690id = this.f690id;
        meet.userId = this.userId;
        return meet;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Meet)) {
            return false;
        }
        Meet meet = (Meet) obj;
        return ValueObject.util_equals(this.type, meet.type) && ValueObject.util_equals(this.f690id, meet.f690id) && ValueObject.util_equals(this.userId, meet.userId);
    }

    public String getClassParseName() {
        return "meet";
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.type;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.f690id;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.userId;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public boolean isFieldParsed(String str) {
        return this.parseFieldSet.contains(str);
    }

    public void mergeData(Meet meet) {
        if (!shouldMergeData() || equals(meet)) {
            return;
        }
        if (!isFieldParsed("type")) {
            this.type = meet.type;
        }
        if (!isFieldParsed("id")) {
            this.f690id = meet.f690id;
        }
        if (!isFieldParsed("userId")) {
            this.userId = meet.userId;
        }
        this.parseFieldSet.clear();
    }

    public void nullCheck() {
        if (this.type == null) {
            this.type = "";
        }
        if (this.f690id == null) {
            this.f690id = "";
        }
        if (this.userId == null) {
            this.userId = "";
        }
    }

    public void setParsedApiRequest(String str) {
        this.requestUrl = str;
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
