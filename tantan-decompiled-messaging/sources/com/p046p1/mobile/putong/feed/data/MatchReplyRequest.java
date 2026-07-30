package com.p046p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.IdBoxed;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.feed.data.MatchReplyRequest;
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
public class MatchReplyRequest extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "matchreplyrequest";

    @NonNull
    @ProtobufIndex(index = 3)
    public IdBoxed message;

    @NonNull
    @ProtobufIndex(index = 1)
    public String state;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> status;
    public static ProtobufAdapter<MatchReplyRequest> PROTOBUF_ADAPTER = new MessageNanoAdapter<MatchReplyRequest>() { // from class: com.p1.mobile.putong.feed.data.MatchReplyRequest.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MatchReplyRequest matchReplyRequest) {
            String str = matchReplyRequest.state;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            List<String> list = matchReplyRequest.status;
            if (list != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            IdBoxed idBoxed = matchReplyRequest.message;
            if (idBoxed != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(3, idBoxed, IdBoxed.PROTOBUF_ADAPTER);
            }
            matchReplyRequest.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MatchReplyRequest parse(nb5 nb5Var) throws IOException {
            MatchReplyRequest matchReplyRequest = new MatchReplyRequest();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (matchReplyRequest.state == null) {
                        matchReplyRequest.state = "";
                    }
                    if (matchReplyRequest.status == null) {
                        matchReplyRequest.status = new ArrayList();
                    }
                    if (matchReplyRequest.message != null) {
                        break;
                    }
                    matchReplyRequest.message = IdBoxed.new_();
                    break;
                }
                if (iM158752u == 10) {
                    matchReplyRequest.state = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    matchReplyRequest.status = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM158752u != 26) {
                        if (matchReplyRequest.state == null) {
                            matchReplyRequest.state = "";
                        }
                        if (matchReplyRequest.status == null) {
                            matchReplyRequest.status = new ArrayList();
                        }
                        if (matchReplyRequest.message != null) {
                            break;
                        }
                        matchReplyRequest.message = IdBoxed.new_();
                        return matchReplyRequest;
                    }
                    matchReplyRequest.message = (IdBoxed) nb5Var.m158743l(IdBoxed.PROTOBUF_ADAPTER);
                }
            }
            return matchReplyRequest;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MatchReplyRequest matchReplyRequest, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = matchReplyRequest.state;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            List<String> list = matchReplyRequest.status;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            IdBoxed idBoxed = matchReplyRequest.message;
            if (idBoxed != null) {
                codedOutputByteBufferNano.m17254K(3, idBoxed, IdBoxed.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<MatchReplyRequest> JSON_ADAPTER = new ObjectJsonAdapter<MatchReplyRequest>() { // from class: com.p1.mobile.putong.feed.data.MatchReplyRequest.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MatchReplyRequest.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MatchReplyRequest newInstance() {
            return new MatchReplyRequest();
        }

        public boolean parseField(MatchReplyRequest matchReplyRequest, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "status":
                    matchReplyRequest.status = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "state":
                    matchReplyRequest.state = jsonParser.getValueAsString();
                    return true;
                case "message":
                    matchReplyRequest.message = IdBoxed.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MatchReplyRequest matchReplyRequest, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "status":
                case "state":
                case "message":
                    return true;
                default:
                    return super.parseFieldCheck(matchReplyRequest, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MatchReplyRequest matchReplyRequest, JsonGenerator jsonGenerator) throws IOException {
            String str = matchReplyRequest.state;
            if (str != null) {
                jsonGenerator.writeStringField("state", str);
            }
            if (matchReplyRequest.status != null) {
                jsonGenerator.writeFieldName(NotificationCompat.CATEGORY_STATUS);
                JsonAdapter.serializeArray(matchReplyRequest.status, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (matchReplyRequest.message != null) {
                jsonGenerator.writeFieldName("message");
                IdBoxed.JSON_ADAPTER.serialize(matchReplyRequest.message, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MatchReplyRequest) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MatchReplyRequest) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m60858a(String str) {
        return str;
    }

    public static MatchReplyRequest new_() {
        MatchReplyRequest matchReplyRequest = new MatchReplyRequest();
        matchReplyRequest.nullCheck();
        return matchReplyRequest;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MatchReplyRequest mo223809clone() {
        MatchReplyRequest matchReplyRequest = new MatchReplyRequest();
        matchReplyRequest.state = this.state;
        List<String> list = this.status;
        if (list != null) {
            matchReplyRequest.status = ValueObject.util_map(list, new w9j() { // from class: l.vbx
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return MatchReplyRequest.m60858a((String) obj);
                }
            });
        }
        IdBoxed idBoxed = this.message;
        if (idBoxed != null) {
            matchReplyRequest.message = idBoxed.mo223809clone();
        }
        return matchReplyRequest;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MatchReplyRequest)) {
            return false;
        }
        MatchReplyRequest matchReplyRequest = (MatchReplyRequest) obj;
        return ValueObject.util_equals(this.state, matchReplyRequest.state) && ValueObject.util_equals(this.status, matchReplyRequest.status) && ValueObject.util_equals(this.message, matchReplyRequest.message);
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
        String str = this.state;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<String> list = this.status;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 41;
        IdBoxed idBoxed = this.message;
        int iHashCode3 = iHashCode2 + (idBoxed != null ? idBoxed.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.state == null) {
            this.state = "";
        }
        if (this.status == null) {
            this.status = new ArrayList();
        }
        if (this.message == null) {
            this.message = IdBoxed.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
