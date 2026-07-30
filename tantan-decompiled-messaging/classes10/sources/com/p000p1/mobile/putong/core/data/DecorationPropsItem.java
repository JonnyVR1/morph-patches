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
public class DecorationPropsItem extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "decorationpropsitem";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int coinPrice;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public long duration;

    @NonNull
    @ProtobufIndex(index = 1)
    public String itemId;
    public static ProtobufAdapter<DecorationPropsItem> PROTOBUF_ADAPTER = new MessageNanoAdapter<DecorationPropsItem>() { // from class: com.p1.mobile.putong.core.data.DecorationPropsItem.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(DecorationPropsItem decorationPropsItem) {
            String str = decorationPropsItem.itemId;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.h(2, decorationPropsItem.coinPrice) + CodedOutputByteBufferNano.j(3, decorationPropsItem.duration);
            ((MessageNano) decorationPropsItem).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public DecorationPropsItem m12603parse(nb5 nb5Var) throws IOException {
            DecorationPropsItem decorationPropsItem = new DecorationPropsItem();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (decorationPropsItem.itemId != null) {
                        break;
                    }
                    decorationPropsItem.itemId = "";
                    break;
                }
                if (iU == 10) {
                    decorationPropsItem.itemId = nb5Var.s();
                } else if (iU == 16) {
                    decorationPropsItem.coinPrice = nb5Var.j();
                } else {
                    if (iU != 24) {
                        if (decorationPropsItem.itemId != null) {
                            break;
                        }
                        decorationPropsItem.itemId = "";
                        return decorationPropsItem;
                    }
                    decorationPropsItem.duration = nb5Var.k();
                }
            }
            return decorationPropsItem;
        }

        public void serialize(DecorationPropsItem decorationPropsItem, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = decorationPropsItem.itemId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.G(2, decorationPropsItem.coinPrice);
            codedOutputByteBufferNano.I(3, decorationPropsItem.duration);
        }
    };
    public static JsonAdapter<DecorationPropsItem> JSON_ADAPTER = new ObjectJsonAdapter<DecorationPropsItem>() { // from class: com.p1.mobile.putong.core.data.DecorationPropsItem.2
        public Class getDataClass() {
            return DecorationPropsItem.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public DecorationPropsItem m12604newInstance() {
            return new DecorationPropsItem();
        }

        public boolean parseField(DecorationPropsItem decorationPropsItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "duration":
                    decorationPropsItem.duration = jsonParser.getValueAsLong();
                    return true;
                case "itemId":
                    decorationPropsItem.itemId = jsonParser.getValueAsString();
                    return true;
                case "coinPrice":
                    decorationPropsItem.coinPrice = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(DecorationPropsItem decorationPropsItem, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "duration":
                case "itemId":
                case "coinPrice":
                    return true;
                default:
                    return super.parseFieldCheck(decorationPropsItem, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(DecorationPropsItem decorationPropsItem, JsonGenerator jsonGenerator) throws IOException {
            String str = decorationPropsItem.itemId;
            if (str != null) {
                jsonGenerator.writeStringField("itemId", str);
            }
            jsonGenerator.writeNumberField("coinPrice", decorationPropsItem.coinPrice);
            jsonGenerator.writeNumberField("duration", decorationPropsItem.duration);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((DecorationPropsItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((DecorationPropsItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static DecorationPropsItem new_() {
        DecorationPropsItem decorationPropsItem = new DecorationPropsItem();
        decorationPropsItem.nullCheck();
        return decorationPropsItem;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public DecorationPropsItem m12602clone() {
        DecorationPropsItem decorationPropsItem = new DecorationPropsItem();
        decorationPropsItem.itemId = this.itemId;
        decorationPropsItem.coinPrice = this.coinPrice;
        decorationPropsItem.duration = this.duration;
        return decorationPropsItem;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DecorationPropsItem)) {
            return false;
        }
        DecorationPropsItem decorationPropsItem = (DecorationPropsItem) obj;
        return ValueObject.util_equals(this.itemId, decorationPropsItem.itemId) && this.coinPrice == decorationPropsItem.coinPrice && this.duration == decorationPropsItem.duration;
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
        String str = this.itemId;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.coinPrice) * 41;
        long j = this.duration;
        int i3 = iHashCode + ((int) (j ^ (j >>> 32)));
        ((ValueObject) this).hashCode = i3;
        return i3;
    }

    public void nullCheck() {
        if (this.itemId == null) {
            this.itemId = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
