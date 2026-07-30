package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
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
import p153l.nc5;

/* JADX INFO: loaded from: classes10.dex */
public class ReSwipeConvLabelItem extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "reswipeconvlabelitem";

    @ProtobufIndex(index = 2)
    public long expired;

    @NonNull
    @ProtobufIndex(index = 1)
    public String uid;
    public static ProtobufAdapter<ReSwipeConvLabelItem> PROTOBUF_ADAPTER = new MessageNanoAdapter<ReSwipeConvLabelItem>() { // from class: com.p1.mobile.putong.core.data.ReSwipeConvLabelItem.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ReSwipeConvLabelItem reSwipeConvLabelItem) {
            String str = reSwipeConvLabelItem.uid;
            int iM17288o = (str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0) + CodedOutputByteBufferNano.m17283j(2, reSwipeConvLabelItem.expired);
            reSwipeConvLabelItem.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ReSwipeConvLabelItem parse(nc5 nc5Var) throws IOException {
            ReSwipeConvLabelItem reSwipeConvLabelItem = new ReSwipeConvLabelItem();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (reSwipeConvLabelItem.uid != null) {
                        break;
                    }
                    reSwipeConvLabelItem.uid = "";
                    break;
                }
                if (iM162497u == 10) {
                    reSwipeConvLabelItem.uid = nc5Var.m162495s();
                } else {
                    if (iM162497u != 16) {
                        if (reSwipeConvLabelItem.uid != null) {
                            break;
                        }
                        reSwipeConvLabelItem.uid = "";
                        return reSwipeConvLabelItem;
                    }
                    reSwipeConvLabelItem.expired = nc5Var.m162487k();
                }
            }
            return reSwipeConvLabelItem;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ReSwipeConvLabelItem reSwipeConvLabelItem, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = reSwipeConvLabelItem.uid;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            codedOutputByteBufferNano.m17307I(2, reSwipeConvLabelItem.expired);
        }
    };
    public static JsonAdapter<ReSwipeConvLabelItem> JSON_ADAPTER = new ObjectJsonAdapter<ReSwipeConvLabelItem>() { // from class: com.p1.mobile.putong.core.data.ReSwipeConvLabelItem.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ReSwipeConvLabelItem.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ReSwipeConvLabelItem newInstance() {
            return new ReSwipeConvLabelItem();
        }

        public boolean parseField(ReSwipeConvLabelItem reSwipeConvLabelItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("expired")) {
                reSwipeConvLabelItem.expired = jsonParser.getValueAsLong();
                return true;
            }
            if (!str.equals(Oauth2AccessToken.KEY_UID)) {
                return false;
            }
            reSwipeConvLabelItem.uid = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(ReSwipeConvLabelItem reSwipeConvLabelItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("expired") || str.equals(Oauth2AccessToken.KEY_UID)) {
                return true;
            }
            return super.parseFieldCheck(reSwipeConvLabelItem, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ReSwipeConvLabelItem reSwipeConvLabelItem, JsonGenerator jsonGenerator) throws IOException {
            String str = reSwipeConvLabelItem.uid;
            if (str != null) {
                jsonGenerator.writeStringField(Oauth2AccessToken.KEY_UID, str);
            }
            jsonGenerator.writeNumberField("expired", reSwipeConvLabelItem.expired);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ReSwipeConvLabelItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ReSwipeConvLabelItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ReSwipeConvLabelItem new_() {
        ReSwipeConvLabelItem reSwipeConvLabelItem = new ReSwipeConvLabelItem();
        reSwipeConvLabelItem.nullCheck();
        return reSwipeConvLabelItem;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ReSwipeConvLabelItem mo225055clone() {
        ReSwipeConvLabelItem reSwipeConvLabelItem = new ReSwipeConvLabelItem();
        reSwipeConvLabelItem.uid = this.uid;
        reSwipeConvLabelItem.expired = this.expired;
        return reSwipeConvLabelItem;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ReSwipeConvLabelItem)) {
            return false;
        }
        ReSwipeConvLabelItem reSwipeConvLabelItem = (ReSwipeConvLabelItem) obj;
        return ValueObject.util_equals(this.uid, reSwipeConvLabelItem.uid) && this.expired == reSwipeConvLabelItem.expired;
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
        String str = this.uid;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        long j = this.expired;
        int i3 = iHashCode + ((int) (j ^ (j >>> 32)));
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.uid == null) {
            this.uid = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
