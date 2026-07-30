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
public class BLiveAnchors extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "bliveanchors";

    @NonNull
    @ProtobufIndex(index = 2)
    public BAvatar avatar;

    @NonNull
    @ProtobufIndex(index = 1)
    public String onGoingLiveId;
    public static ProtobufAdapter<BLiveAnchors> PROTOBUF_ADAPTER = new MessageNanoAdapter<BLiveAnchors>() { // from class: com.p1.mobile.putong.core.data.BLiveAnchors.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(BLiveAnchors bLiveAnchors) {
            String str = bLiveAnchors.onGoingLiveId;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            BAvatar bAvatar = bLiveAnchors.avatar;
            if (bAvatar != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(2, bAvatar, BAvatar.PROTOBUF_ADAPTER);
            }
            bLiveAnchors.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public BLiveAnchors parse(nb5 nb5Var) throws IOException {
            BLiveAnchors bLiveAnchors = new BLiveAnchors();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (bLiveAnchors.onGoingLiveId == null) {
                        bLiveAnchors.onGoingLiveId = "";
                    }
                    if (bLiveAnchors.avatar != null) {
                        break;
                    }
                    bLiveAnchors.avatar = BAvatar.new_();
                    break;
                }
                if (iM158752u == 10) {
                    bLiveAnchors.onGoingLiveId = nb5Var.m158750s();
                } else {
                    if (iM158752u != 18) {
                        if (bLiveAnchors.onGoingLiveId == null) {
                            bLiveAnchors.onGoingLiveId = "";
                        }
                        if (bLiveAnchors.avatar != null) {
                            break;
                        }
                        bLiveAnchors.avatar = BAvatar.new_();
                        return bLiveAnchors;
                    }
                    bLiveAnchors.avatar = (BAvatar) nb5Var.m158743l(BAvatar.PROTOBUF_ADAPTER);
                }
            }
            return bLiveAnchors;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(BLiveAnchors bLiveAnchors, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = bLiveAnchors.onGoingLiveId;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            BAvatar bAvatar = bLiveAnchors.avatar;
            if (bAvatar != null) {
                codedOutputByteBufferNano.m17254K(2, bAvatar, BAvatar.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<BLiveAnchors> JSON_ADAPTER = new ObjectJsonAdapter<BLiveAnchors>() { // from class: com.p1.mobile.putong.core.data.BLiveAnchors.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BLiveAnchors.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BLiveAnchors newInstance() {
            return new BLiveAnchors();
        }

        public boolean parseField(BLiveAnchors bLiveAnchors, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("avatar")) {
                bLiveAnchors.avatar = BAvatar.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("onGoingLiveId")) {
                return false;
            }
            bLiveAnchors.onGoingLiveId = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(BLiveAnchors bLiveAnchors, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("avatar") || str.equals("onGoingLiveId")) {
                return true;
            }
            return super.parseFieldCheck(bLiveAnchors, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BLiveAnchors bLiveAnchors, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveAnchors.onGoingLiveId;
            if (str != null) {
                jsonGenerator.writeStringField("onGoingLiveId", str);
            }
            if (bLiveAnchors.avatar != null) {
                jsonGenerator.writeFieldName("avatar");
                BAvatar.JSON_ADAPTER.serialize(bLiveAnchors.avatar, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((BLiveAnchors) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveAnchors) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static BLiveAnchors new_() {
        BLiveAnchors bLiveAnchors = new BLiveAnchors();
        bLiveAnchors.nullCheck();
        return bLiveAnchors;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BLiveAnchors mo223809clone() {
        BLiveAnchors bLiveAnchors = new BLiveAnchors();
        bLiveAnchors.onGoingLiveId = this.onGoingLiveId;
        BAvatar bAvatar = this.avatar;
        if (bAvatar != null) {
            bLiveAnchors.avatar = bAvatar.mo223809clone();
        }
        return bLiveAnchors;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BLiveAnchors)) {
            return false;
        }
        BLiveAnchors bLiveAnchors = (BLiveAnchors) obj;
        return ValueObject.util_equals(this.onGoingLiveId, bLiveAnchors.onGoingLiveId) && ValueObject.util_equals(this.avatar, bLiveAnchors.avatar);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "bliveanchors";
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.onGoingLiveId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        BAvatar bAvatar = this.avatar;
        int iHashCode2 = iHashCode + (bAvatar != null ? bAvatar.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.onGoingLiveId == null) {
            this.onGoingLiveId = "";
        }
        if (this.avatar == null) {
            this.avatar = BAvatar.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
