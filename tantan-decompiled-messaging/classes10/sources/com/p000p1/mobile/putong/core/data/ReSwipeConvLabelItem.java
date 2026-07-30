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
public class ReSwipeConvLabelItem extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "reswipeconvlabelitem";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public long expired;

    @NonNull
    @ProtobufIndex(index = 1)
    public String uid;
    public static ProtobufAdapter<ReSwipeConvLabelItem> PROTOBUF_ADAPTER = new MessageNanoAdapter<ReSwipeConvLabelItem>() { // from class: com.p1.mobile.putong.core.data.ReSwipeConvLabelItem.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ReSwipeConvLabelItem reSwipeConvLabelItem) {
            String str = reSwipeConvLabelItem.uid;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.j(2, reSwipeConvLabelItem.expired);
            ((MessageNano) reSwipeConvLabelItem).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ReSwipeConvLabelItem m15233parse(nb5 nb5Var) throws IOException {
            ReSwipeConvLabelItem reSwipeConvLabelItem = new ReSwipeConvLabelItem();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (reSwipeConvLabelItem.uid != null) {
                        break;
                    }
                    reSwipeConvLabelItem.uid = "";
                    break;
                }
                if (iU == 10) {
                    reSwipeConvLabelItem.uid = nb5Var.s();
                } else {
                    if (iU != 16) {
                        if (reSwipeConvLabelItem.uid != null) {
                            break;
                        }
                        reSwipeConvLabelItem.uid = "";
                        return reSwipeConvLabelItem;
                    }
                    reSwipeConvLabelItem.expired = nb5Var.k();
                }
            }
            return reSwipeConvLabelItem;
        }

        public void serialize(ReSwipeConvLabelItem reSwipeConvLabelItem, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = reSwipeConvLabelItem.uid;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.I(2, reSwipeConvLabelItem.expired);
        }
    };
    public static JsonAdapter<ReSwipeConvLabelItem> JSON_ADAPTER = new ObjectJsonAdapter<ReSwipeConvLabelItem>() { // from class: com.p1.mobile.putong.core.data.ReSwipeConvLabelItem.2
        public Class getDataClass() {
            return ReSwipeConvLabelItem.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ReSwipeConvLabelItem m15234newInstance() {
            return new ReSwipeConvLabelItem();
        }

        public boolean parseField(ReSwipeConvLabelItem reSwipeConvLabelItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("expired")) {
                reSwipeConvLabelItem.expired = jsonParser.getValueAsLong();
                return true;
            }
            if (!str.equals("uid")) {
                return false;
            }
            reSwipeConvLabelItem.uid = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(ReSwipeConvLabelItem reSwipeConvLabelItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("expired") || str.equals("uid")) {
                return true;
            }
            return super.parseFieldCheck(reSwipeConvLabelItem, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(ReSwipeConvLabelItem reSwipeConvLabelItem, JsonGenerator jsonGenerator) throws IOException {
            String str = reSwipeConvLabelItem.uid;
            if (str != null) {
                jsonGenerator.writeStringField("uid", str);
            }
            jsonGenerator.writeNumberField("expired", reSwipeConvLabelItem.expired);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ReSwipeConvLabelItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ReSwipeConvLabelItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ReSwipeConvLabelItem new_() {
        ReSwipeConvLabelItem reSwipeConvLabelItem = new ReSwipeConvLabelItem();
        reSwipeConvLabelItem.nullCheck();
        return reSwipeConvLabelItem;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ReSwipeConvLabelItem m15232clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.uid;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        long j = this.expired;
        int i3 = iHashCode + ((int) (j ^ (j >>> 32)));
        ((ValueObject) this).hashCode = i3;
        return i3;
    }

    public void nullCheck() {
        if (this.uid == null) {
            this.uid = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
