package com.p051p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p153l.nc5;

/* JADX INFO: loaded from: classes13.dex */
public class Meet extends ValueObject<Meet> implements Cloneable, Serializable {
    public static final String TYPE = "meet";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 2)
    public String f40077id;
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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Meet meet) {
            String str = meet.type;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = meet.f40077id;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = meet.userId;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            meet.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Meet parse(nc5 nc5Var) throws IOException {
            Meet meet = new Meet();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (meet.type == null) {
                        meet.type = "";
                    }
                    if (meet.f40077id == null) {
                        meet.f40077id = "";
                    }
                    if (meet.userId != null) {
                        break;
                    }
                    meet.userId = "";
                    break;
                }
                if (iM162497u == 10) {
                    meet.type = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    meet.f40077id = nc5Var.m162495s();
                } else {
                    if (iM162497u != 26) {
                        if (meet.type == null) {
                            meet.type = "";
                        }
                        if (meet.f40077id == null) {
                            meet.f40077id = "";
                        }
                        if (meet.userId != null) {
                            break;
                        }
                        meet.userId = "";
                        return meet;
                    }
                    meet.userId = nc5Var.m162495s();
                }
            }
            return meet;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Meet meet, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = meet.type;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = meet.f40077id;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = meet.userId;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
        }
    };
    public static JsonAdapter<Meet> JSON_ADAPTER = new ObjectJsonAdapter<Meet>() { // from class: com.p1.mobile.putong.feed.data.Meet.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Meet.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Meet newInstance() {
            return new Meet();
        }

        public boolean parseField(Meet meet, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "userId":
                    meet.userId = jsonParser.getValueAsString();
                    return true;
                case "id":
                    meet.f40077id = jsonParser.getValueAsString();
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Meet meet, JsonGenerator jsonGenerator) throws IOException {
            String str = meet.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
            String str2 = meet.f40077id;
            if (str2 != null) {
                jsonGenerator.writeStringField("id", str2);
            }
            String str3 = meet.userId;
            if (str3 != null) {
                jsonGenerator.writeStringField("userId", str3);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Meet) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Meet) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Meet new_() {
        Meet meet = new Meet();
        meet.nullCheck();
        return meet;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Meet mo225055clone() {
        Meet meet = new Meet();
        meet.type = this.type;
        meet.f40077id = this.f40077id;
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
        return ValueObject.util_equals(this.type, meet.type) && ValueObject.util_equals(this.f40077id, meet.f40077id) && ValueObject.util_equals(this.userId, meet.userId);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "meet";
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.type;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.f40077id;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.userId;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public boolean isFieldParsed(String str) {
        return this.parseFieldSet.contains(str);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void mergeData(Meet meet) {
        if (!shouldMergeData() || equals(meet)) {
            return;
        }
        if (!isFieldParsed("type")) {
            this.type = meet.type;
        }
        if (!isFieldParsed("id")) {
            this.f40077id = meet.f40077id;
        }
        if (!isFieldParsed("userId")) {
            this.userId = meet.userId;
        }
        this.parseFieldSet.clear();
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.type == null) {
            this.type = "";
        }
        if (this.f40077id == null) {
            this.f40077id = "";
        }
        if (this.userId == null) {
            this.userId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void setParsedApiRequest(String str) {
        this.requestUrl = str;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
