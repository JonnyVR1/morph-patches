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
public class BLiveAnchors extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "bliveanchors";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public BAvatar avatar;

    @NonNull
    @ProtobufIndex(index = 1)
    public String onGoingLiveId;
    public static ProtobufAdapter<BLiveAnchors> PROTOBUF_ADAPTER = new MessageNanoAdapter<BLiveAnchors>() { // from class: com.p1.mobile.putong.core.data.BLiveAnchors.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(BLiveAnchors bLiveAnchors) {
            String str = bLiveAnchors.onGoingLiveId;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            BAvatar bAvatar = bLiveAnchors.avatar;
            if (bAvatar != null) {
                iO += CodedOutputByteBufferNano.l(2, bAvatar, BAvatar.PROTOBUF_ADAPTER);
            }
            ((MessageNano) bLiveAnchors).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public BLiveAnchors m11717parse(nb5 nb5Var) throws IOException {
            BLiveAnchors bLiveAnchors = new BLiveAnchors();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (bLiveAnchors.onGoingLiveId == null) {
                        bLiveAnchors.onGoingLiveId = "";
                    }
                    if (bLiveAnchors.avatar != null) {
                        break;
                    }
                    bLiveAnchors.avatar = BAvatar.new_();
                    break;
                }
                if (iU == 10) {
                    bLiveAnchors.onGoingLiveId = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (bLiveAnchors.onGoingLiveId == null) {
                            bLiveAnchors.onGoingLiveId = "";
                        }
                        if (bLiveAnchors.avatar != null) {
                            break;
                        }
                        bLiveAnchors.avatar = BAvatar.new_();
                        return bLiveAnchors;
                    }
                    bLiveAnchors.avatar = (BAvatar) nb5Var.l(BAvatar.PROTOBUF_ADAPTER);
                }
            }
            return bLiveAnchors;
        }

        public void serialize(BLiveAnchors bLiveAnchors, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = bLiveAnchors.onGoingLiveId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            BAvatar bAvatar = bLiveAnchors.avatar;
            if (bAvatar != null) {
                codedOutputByteBufferNano.K(2, bAvatar, BAvatar.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<BLiveAnchors> JSON_ADAPTER = new ObjectJsonAdapter<BLiveAnchors>() { // from class: com.p1.mobile.putong.core.data.BLiveAnchors.2
        public Class getDataClass() {
            return BLiveAnchors.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public BLiveAnchors m11718newInstance() {
            return new BLiveAnchors();
        }

        public boolean parseField(BLiveAnchors bLiveAnchors, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(ReminderAction.avatar)) {
                bLiveAnchors.avatar = (BAvatar) BAvatar.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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
            if (str.equals(ReminderAction.avatar) || str.equals("onGoingLiveId")) {
                return true;
            }
            return super.parseFieldCheck(bLiveAnchors, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(BLiveAnchors bLiveAnchors, JsonGenerator jsonGenerator) throws IOException {
            String str = bLiveAnchors.onGoingLiveId;
            if (str != null) {
                jsonGenerator.writeStringField("onGoingLiveId", str);
            }
            if (bLiveAnchors.avatar != null) {
                jsonGenerator.writeFieldName(ReminderAction.avatar);
                BAvatar.JSON_ADAPTER.serialize(bLiveAnchors.avatar, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((BLiveAnchors) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BLiveAnchors) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static BLiveAnchors new_() {
        BLiveAnchors bLiveAnchors = new BLiveAnchors();
        bLiveAnchors.nullCheck();
        return bLiveAnchors;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public BLiveAnchors m11716clone() {
        BLiveAnchors bLiveAnchors = new BLiveAnchors();
        bLiveAnchors.onGoingLiveId = this.onGoingLiveId;
        BAvatar bAvatar = this.avatar;
        if (bAvatar != null) {
            bLiveAnchors.avatar = bAvatar.m11708clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.onGoingLiveId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        BAvatar bAvatar = this.avatar;
        int iHashCode2 = iHashCode + (bAvatar != null ? bAvatar.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.onGoingLiveId == null) {
            this.onGoingLiveId = "";
        }
        if (this.avatar == null) {
            this.avatar = BAvatar.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
