package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
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
public class SeeSwitchItem extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "seeswitchitem";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public Boolean is_open_for_new_user;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public SeeSwitchOpenType open_time;

    @NonNull
    @ProtobufIndex(index = 1)
    public SeeSwitchName see_switch_name;
    public static ProtobufAdapter<SeeSwitchItem> PROTOBUF_ADAPTER = new MessageNanoAdapter<SeeSwitchItem>() { // from class: com.p1.mobile.putong.core.data.SeeSwitchItem.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SeeSwitchItem seeSwitchItem) {
            SeeSwitchName seeSwitchName = seeSwitchItem.see_switch_name;
            int iH = seeSwitchName != null ? CodedOutputByteBufferNano.h(1, seeSwitchName.ordinal()) : 0;
            Boolean bool = seeSwitchItem.is_open_for_new_user;
            if (bool != null) {
                iH += CodedOutputByteBufferNano.b(2, bool.booleanValue());
            }
            SeeSwitchOpenType seeSwitchOpenType = seeSwitchItem.open_time;
            if (seeSwitchOpenType != null) {
                iH += CodedOutputByteBufferNano.h(3, seeSwitchOpenType.ordinal());
            }
            SeeSwitchName seeSwitchName2 = seeSwitchItem.see_switch_name;
            if (seeSwitchName2 != null) {
                iH += CodedOutputByteBufferNano.l(4, seeSwitchName2, SeeSwitchName.PROTOBUF_ADAPTER);
            }
            SeeSwitchOpenType seeSwitchOpenType2 = seeSwitchItem.open_time;
            if (seeSwitchOpenType2 != null) {
                iH += CodedOutputByteBufferNano.l(5, seeSwitchOpenType2, SeeSwitchOpenType.PROTOBUF_ADAPTER);
            }
            ((MessageNano) seeSwitchItem).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SeeSwitchItem m15539parse(nb5 nb5Var) throws IOException {
            SeeSwitchItem seeSwitchItem = new SeeSwitchItem();
            Integer numValueOf = null;
            Integer numValueOf2 = null;
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (seeSwitchItem.see_switch_name == null && numValueOf != null) {
                        seeSwitchItem.see_switch_name = (SeeSwitchName) SeeSwitchName.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
                    }
                    if (seeSwitchItem.open_time == null && numValueOf2 != null) {
                        seeSwitchItem.open_time = (SeeSwitchOpenType) SeeSwitchOpenType.JSON_ADAPTER.newTEnum((String) null, numValueOf2.intValue());
                    }
                    if (seeSwitchItem.see_switch_name == null) {
                        seeSwitchItem.see_switch_name = (SeeSwitchName) SeeSwitchName.JSON_ADAPTER.defaultEnum();
                    }
                    if (seeSwitchItem.is_open_for_new_user == null) {
                        seeSwitchItem.is_open_for_new_user = Boolean.FALSE;
                    }
                    if (seeSwitchItem.open_time != null) {
                        break;
                    }
                    seeSwitchItem.open_time = (SeeSwitchOpenType) SeeSwitchOpenType.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iU == 8) {
                    numValueOf = Integer.valueOf(nb5Var.j());
                } else if (iU == 16) {
                    seeSwitchItem.is_open_for_new_user = Boolean.valueOf(nb5Var.g());
                } else if (iU == 24) {
                    numValueOf2 = Integer.valueOf(nb5Var.j());
                } else if (iU == 34) {
                    seeSwitchItem.see_switch_name = (SeeSwitchName) nb5Var.l(SeeSwitchName.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 42) {
                        if (seeSwitchItem.see_switch_name == null && numValueOf != null) {
                            seeSwitchItem.see_switch_name = (SeeSwitchName) SeeSwitchName.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
                        }
                        if (seeSwitchItem.open_time == null && numValueOf2 != null) {
                            seeSwitchItem.open_time = (SeeSwitchOpenType) SeeSwitchOpenType.JSON_ADAPTER.newTEnum((String) null, numValueOf2.intValue());
                        }
                        if (seeSwitchItem.see_switch_name == null) {
                            seeSwitchItem.see_switch_name = (SeeSwitchName) SeeSwitchName.JSON_ADAPTER.defaultEnum();
                        }
                        if (seeSwitchItem.is_open_for_new_user == null) {
                            seeSwitchItem.is_open_for_new_user = Boolean.FALSE;
                        }
                        if (seeSwitchItem.open_time != null) {
                            break;
                        }
                        seeSwitchItem.open_time = (SeeSwitchOpenType) SeeSwitchOpenType.JSON_ADAPTER.defaultEnum();
                        return seeSwitchItem;
                    }
                    seeSwitchItem.open_time = (SeeSwitchOpenType) nb5Var.l(SeeSwitchOpenType.PROTOBUF_ADAPTER);
                }
            }
            return seeSwitchItem;
        }

        public void serialize(SeeSwitchItem seeSwitchItem, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            SeeSwitchName seeSwitchName = seeSwitchItem.see_switch_name;
            if (seeSwitchName != null) {
                codedOutputByteBufferNano.G(1, seeSwitchName.ordinal());
            }
            Boolean bool = seeSwitchItem.is_open_for_new_user;
            if (bool != null) {
                codedOutputByteBufferNano.A(2, bool.booleanValue());
            }
            SeeSwitchOpenType seeSwitchOpenType = seeSwitchItem.open_time;
            if (seeSwitchOpenType != null) {
                codedOutputByteBufferNano.G(3, seeSwitchOpenType.ordinal());
            }
            SeeSwitchName seeSwitchName2 = seeSwitchItem.see_switch_name;
            if (seeSwitchName2 != null) {
                codedOutputByteBufferNano.K(4, seeSwitchName2, SeeSwitchName.PROTOBUF_ADAPTER);
            }
            SeeSwitchOpenType seeSwitchOpenType2 = seeSwitchItem.open_time;
            if (seeSwitchOpenType2 != null) {
                codedOutputByteBufferNano.K(5, seeSwitchOpenType2, SeeSwitchOpenType.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<SeeSwitchItem> JSON_ADAPTER = new ObjectJsonAdapter<SeeSwitchItem>() { // from class: com.p1.mobile.putong.core.data.SeeSwitchItem.2
        public Class getDataClass() {
            return SeeSwitchItem.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public SeeSwitchItem m15540newInstance() {
            return new SeeSwitchItem();
        }

        public boolean parseField(SeeSwitchItem seeSwitchItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "is_open_for_new_user":
                    seeSwitchItem.is_open_for_new_user = jsonParser.getCurrentToken() == JsonToken.VALUE_NULL ? null : Boolean.valueOf(jsonParser.getValueAsBoolean());
                    return true;
                case "see_switch_name":
                    seeSwitchItem.see_switch_name = (SeeSwitchName) SeeSwitchName.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "open_time":
                    seeSwitchItem.open_time = (SeeSwitchOpenType) SeeSwitchOpenType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(SeeSwitchItem seeSwitchItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "is_open_for_new_user":
                case "see_switch_name":
                case "open_time":
                    return true;
                default:
                    return super.parseFieldCheck(seeSwitchItem, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(SeeSwitchItem seeSwitchItem, JsonGenerator jsonGenerator) throws IOException {
            if (seeSwitchItem.see_switch_name != null) {
                jsonGenerator.writeFieldName("see_switch_name");
                SeeSwitchName.JSON_ADAPTER.serialize(seeSwitchItem.see_switch_name, jsonGenerator, true);
            }
            Boolean bool = seeSwitchItem.is_open_for_new_user;
            if (bool != null) {
                jsonGenerator.writeBooleanField("is_open_for_new_user", bool.booleanValue());
            }
            if (seeSwitchItem.open_time != null) {
                jsonGenerator.writeFieldName("open_time");
                SeeSwitchOpenType.JSON_ADAPTER.serialize(seeSwitchItem.open_time, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SeeSwitchItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SeeSwitchItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SeeSwitchItem new_() {
        SeeSwitchItem seeSwitchItem = new SeeSwitchItem();
        seeSwitchItem.nullCheck();
        return seeSwitchItem;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SeeSwitchItem m15538clone() {
        SeeSwitchItem seeSwitchItem = new SeeSwitchItem();
        seeSwitchItem.see_switch_name = this.see_switch_name;
        seeSwitchItem.is_open_for_new_user = this.is_open_for_new_user;
        seeSwitchItem.open_time = this.open_time;
        return seeSwitchItem;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SeeSwitchItem)) {
            return false;
        }
        SeeSwitchItem seeSwitchItem = (SeeSwitchItem) obj;
        return ValueObject.util_equals(this.see_switch_name, seeSwitchItem.see_switch_name) && ValueObject.util_equals(this.is_open_for_new_user, seeSwitchItem.is_open_for_new_user) && ValueObject.util_equals(this.open_time, seeSwitchItem.open_time);
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
        SeeSwitchName seeSwitchName = this.see_switch_name;
        int iHashCode = (i2 + (seeSwitchName != null ? seeSwitchName.hashCode() : 0)) * 41;
        Boolean bool = this.is_open_for_new_user;
        int iHashCode2 = (iHashCode + (bool != null ? bool.hashCode() : 0)) * 41;
        SeeSwitchOpenType seeSwitchOpenType = this.open_time;
        int iHashCode3 = iHashCode2 + (seeSwitchOpenType != null ? seeSwitchOpenType.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.see_switch_name == null) {
            this.see_switch_name = (SeeSwitchName) SeeSwitchName.JSON_ADAPTER.defaultEnum();
        }
        if (this.is_open_for_new_user == null) {
            this.is_open_for_new_user = Boolean.FALSE;
        }
        if (this.open_time == null) {
            this.open_time = (SeeSwitchOpenType) SeeSwitchOpenType.JSON_ADAPTER.defaultEnum();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
