package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ShareId extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "shareid";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String momentId;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;
    public static ProtobufAdapter<ShareId> PROTOBUF_ADAPTER = new MessageNanoAdapter<ShareId>() { // from class: com.p1.mobile.putong.core.data.ShareId.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ShareId shareId) {
            String str = shareId.userId;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = shareId.momentId;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) shareId).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ShareId m15601parse(nb5 nb5Var) throws IOException {
            ShareId shareId = new ShareId();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (shareId.userId == null) {
                        shareId.userId = "";
                    }
                    if (shareId.momentId != null) {
                        break;
                    }
                    shareId.momentId = "";
                    break;
                }
                if (iU == 10) {
                    shareId.userId = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (shareId.userId == null) {
                            shareId.userId = "";
                        }
                        if (shareId.momentId != null) {
                            break;
                        }
                        shareId.momentId = "";
                        return shareId;
                    }
                    shareId.momentId = nb5Var.s();
                }
            }
            return shareId;
        }

        public void serialize(ShareId shareId, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = shareId.userId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = shareId.momentId;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<ShareId> JSON_ADAPTER = new ObjectJsonAdapter<ShareId>() { // from class: com.p1.mobile.putong.core.data.ShareId.2
        public Class getDataClass() {
            return ShareId.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ShareId m15602newInstance() {
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ShareId) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ShareId) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ShareId new_() {
        ShareId shareId = new ShareId();
        shareId.nullCheck();
        return shareId;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ShareId m15600clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.userId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.momentId;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.momentId == null) {
            this.momentId = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
