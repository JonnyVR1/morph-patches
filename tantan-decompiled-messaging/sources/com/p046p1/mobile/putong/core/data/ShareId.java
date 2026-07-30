package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes10.dex */
public class ShareId extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "shareid";

    @NonNull
    @ProtobufIndex(index = 2)
    public String momentId;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;
    public static ProtobufAdapter<ShareId> PROTOBUF_ADAPTER = new MessageNanoAdapter<ShareId>() { // from class: com.p1.mobile.putong.core.data.ShareId.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ShareId shareId) {
            String str = shareId.userId;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = shareId.momentId;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            shareId.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ShareId parse(nb5 nb5Var) throws IOException {
            ShareId shareId = new ShareId();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (shareId.userId == null) {
                        shareId.userId = "";
                    }
                    if (shareId.momentId != null) {
                        break;
                    }
                    shareId.momentId = "";
                    break;
                }
                if (iM158752u == 10) {
                    shareId.userId = nb5Var.m158750s();
                } else {
                    if (iM158752u != 18) {
                        if (shareId.userId == null) {
                            shareId.userId = "";
                        }
                        if (shareId.momentId != null) {
                            break;
                        }
                        shareId.momentId = "";
                        return shareId;
                    }
                    shareId.momentId = nb5Var.m158750s();
                }
            }
            return shareId;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ShareId shareId, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = shareId.userId;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = shareId.momentId;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
        }
    };
    public static JsonAdapter<ShareId> JSON_ADAPTER = new ObjectJsonAdapter<ShareId>() { // from class: com.p1.mobile.putong.core.data.ShareId.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ShareId.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ShareId newInstance() {
            return new ShareId();
        }

        public boolean parseField(ShareId shareId, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("userId")) {
                shareId.userId = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("momentId")) {
                return false;
            }
            shareId.momentId = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(ShareId shareId, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("userId") || str.equals("momentId")) {
                return true;
            }
            return super.parseFieldCheck(shareId, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ShareId shareId, JsonGenerator jsonGenerator) throws IOException {
            String str = shareId.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            String str2 = shareId.momentId;
            if (str2 != null) {
                jsonGenerator.writeStringField("momentId", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ShareId) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ShareId) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ShareId new_() {
        ShareId shareId = new ShareId();
        shareId.nullCheck();
        return shareId;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ShareId mo223809clone() {
        ShareId shareId = new ShareId();
        shareId.userId = this.userId;
        shareId.momentId = this.momentId;
        return shareId;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ShareId)) {
            return false;
        }
        ShareId shareId = (ShareId) obj;
        return ValueObject.util_equals(this.userId, shareId.userId) && ValueObject.util_equals(this.momentId, shareId.momentId);
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
        String str2 = this.momentId;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.momentId == null) {
            this.momentId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
