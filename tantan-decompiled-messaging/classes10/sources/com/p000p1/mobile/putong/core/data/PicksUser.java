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
public class PicksUser extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "picksuser";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f130id;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public PicksTagType picksTagType;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String picksTracker;
    public static ProtobufAdapter<PicksUser> PROTOBUF_ADAPTER = new MessageNanoAdapter<PicksUser>() { // from class: com.p1.mobile.putong.core.data.PicksUser.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(PicksUser picksUser) {
            String str = picksUser.f130id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            PicksTagType picksTagType = picksUser.picksTagType;
            if (picksTagType != null) {
                iO += CodedOutputByteBufferNano.h(2, picksTagType.ordinal());
            }
            String str2 = picksUser.picksTracker;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(3, str2);
            }
            PicksTagType picksTagType2 = picksUser.picksTagType;
            if (picksTagType2 != null) {
                iO += CodedOutputByteBufferNano.l(4, picksTagType2, PicksTagType.PROTOBUF_ADAPTER);
            }
            ((MessageNano) picksUser).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public PicksUser m14785parse(nb5 nb5Var) throws IOException {
            PicksUser picksUser = new PicksUser();
            Integer numValueOf = null;
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (picksUser.picksTagType == null && numValueOf != null) {
                        picksUser.picksTagType = (PicksTagType) PicksTagType.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
                    }
                    if (picksUser.f130id == null) {
                        picksUser.f130id = "";
                    }
                    if (picksUser.picksTagType == null) {
                        picksUser.picksTagType = (PicksTagType) PicksTagType.JSON_ADAPTER.defaultEnum();
                    }
                    if (picksUser.picksTracker != null) {
                        break;
                    }
                    picksUser.picksTracker = "";
                    break;
                }
                if (iU == 10) {
                    picksUser.f130id = nb5Var.s();
                } else if (iU == 16) {
                    numValueOf = Integer.valueOf(nb5Var.j());
                } else if (iU == 26) {
                    picksUser.picksTracker = nb5Var.s();
                } else {
                    if (iU != 34) {
                        if (picksUser.picksTagType == null && numValueOf != null) {
                            picksUser.picksTagType = (PicksTagType) PicksTagType.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
                        }
                        if (picksUser.f130id == null) {
                            picksUser.f130id = "";
                        }
                        if (picksUser.picksTagType == null) {
                            picksUser.picksTagType = (PicksTagType) PicksTagType.JSON_ADAPTER.defaultEnum();
                        }
                        if (picksUser.picksTracker != null) {
                            break;
                        }
                        picksUser.picksTracker = "";
                        return picksUser;
                    }
                    picksUser.picksTagType = (PicksTagType) nb5Var.l(PicksTagType.PROTOBUF_ADAPTER);
                }
            }
            return picksUser;
        }

        public void serialize(PicksUser picksUser, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = picksUser.f130id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            PicksTagType picksTagType = picksUser.picksTagType;
            if (picksTagType != null) {
                codedOutputByteBufferNano.G(2, picksTagType.ordinal());
            }
            String str2 = picksUser.picksTracker;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
            PicksTagType picksTagType2 = picksUser.picksTagType;
            if (picksTagType2 != null) {
                codedOutputByteBufferNano.K(4, picksTagType2, PicksTagType.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<PicksUser> JSON_ADAPTER = new ObjectJsonAdapter<PicksUser>() { // from class: com.p1.mobile.putong.core.data.PicksUser.2
        public Class getDataClass() {
            return PicksUser.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public PicksUser m14786newInstance() {
            return new PicksUser();
        }

        public boolean parseField(PicksUser picksUser, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "picksTagType":
                    picksUser.picksTagType = (PicksTagType) PicksTagType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "picksTracker":
                    picksUser.picksTracker = jsonParser.getValueAsString();
                    return true;
                case "id":
                    picksUser.f130id = jsonParser.getValueAsString();
                    return false;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(PicksUser picksUser, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "picksTagType":
                case "picksTracker":
                    return true;
                case "id":
                    return false;
                default:
                    return super.parseFieldCheck(picksUser, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(PicksUser picksUser, JsonGenerator jsonGenerator) throws IOException {
            String str = picksUser.f130id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (picksUser.picksTagType != null) {
                jsonGenerator.writeFieldName("picksTagType");
                PicksTagType.JSON_ADAPTER.serialize(picksUser.picksTagType, jsonGenerator, true);
            }
            String str2 = picksUser.picksTracker;
            if (str2 != null) {
                jsonGenerator.writeStringField("picksTracker", str2);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PicksUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PicksUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PicksUser new_() {
        PicksUser picksUser = new PicksUser();
        picksUser.nullCheck();
        return picksUser;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public PicksUser m14784clone() {
        PicksUser picksUser = new PicksUser();
        picksUser.f130id = this.f130id;
        picksUser.picksTagType = this.picksTagType;
        picksUser.picksTracker = this.picksTracker;
        return picksUser;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PicksUser)) {
            return false;
        }
        PicksUser picksUser = (PicksUser) obj;
        return ValueObject.util_equals(this.f130id, picksUser.f130id) && ValueObject.util_equals(this.picksTagType, picksUser.picksTagType) && ValueObject.util_equals(this.picksTracker, picksUser.picksTracker);
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
        String str = this.f130id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        PicksTagType picksTagType = this.picksTagType;
        int iHashCode2 = (iHashCode + (picksTagType != null ? picksTagType.hashCode() : 0)) * 41;
        String str2 = this.picksTracker;
        int iHashCode3 = iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.f130id == null) {
            this.f130id = "";
        }
        if (this.picksTagType == null) {
            this.picksTagType = (PicksTagType) PicksTagType.JSON_ADAPTER.defaultEnum();
        }
        if (this.picksTracker == null) {
            this.picksTracker = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
