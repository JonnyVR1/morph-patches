package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
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
public class DecorationPropsItem extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "decorationpropsitem";

    @ProtobufIndex(index = 2)
    public int coinPrice;

    @ProtobufIndex(index = 3)
    public long duration;

    @NonNull
    @ProtobufIndex(index = 1)
    public String itemId;
    public static ProtobufAdapter<DecorationPropsItem> PROTOBUF_ADAPTER = new MessageNanoAdapter<DecorationPropsItem>() { // from class: com.p1.mobile.putong.core.data.DecorationPropsItem.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(DecorationPropsItem decorationPropsItem) {
            String str = decorationPropsItem.itemId;
            int iM17233o = (str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0) + CodedOutputByteBufferNano.m17226h(2, decorationPropsItem.coinPrice) + CodedOutputByteBufferNano.m17228j(3, decorationPropsItem.duration);
            decorationPropsItem.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public DecorationPropsItem parse(nb5 nb5Var) throws IOException {
            DecorationPropsItem decorationPropsItem = new DecorationPropsItem();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (decorationPropsItem.itemId != null) {
                        break;
                    }
                    decorationPropsItem.itemId = "";
                    break;
                }
                if (iM158752u == 10) {
                    decorationPropsItem.itemId = nb5Var.m158750s();
                } else if (iM158752u == 16) {
                    decorationPropsItem.coinPrice = nb5Var.m158741j();
                } else {
                    if (iM158752u != 24) {
                        if (decorationPropsItem.itemId != null) {
                            break;
                        }
                        decorationPropsItem.itemId = "";
                        return decorationPropsItem;
                    }
                    decorationPropsItem.duration = nb5Var.m158742k();
                }
            }
            return decorationPropsItem;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(DecorationPropsItem decorationPropsItem, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = decorationPropsItem.itemId;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            codedOutputByteBufferNano.m17250G(2, decorationPropsItem.coinPrice);
            codedOutputByteBufferNano.m17252I(3, decorationPropsItem.duration);
        }
    };
    public static JsonAdapter<DecorationPropsItem> JSON_ADAPTER = new ObjectJsonAdapter<DecorationPropsItem>() { // from class: com.p1.mobile.putong.core.data.DecorationPropsItem.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return DecorationPropsItem.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public DecorationPropsItem newInstance() {
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(DecorationPropsItem decorationPropsItem, JsonGenerator jsonGenerator) throws IOException {
            String str = decorationPropsItem.itemId;
            if (str != null) {
                jsonGenerator.writeStringField("itemId", str);
            }
            jsonGenerator.writeNumberField("coinPrice", decorationPropsItem.coinPrice);
            jsonGenerator.writeNumberField(BLiveOperationTitleShowType.duration, decorationPropsItem.duration);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((DecorationPropsItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((DecorationPropsItem) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static DecorationPropsItem new_() {
        DecorationPropsItem decorationPropsItem = new DecorationPropsItem();
        decorationPropsItem.nullCheck();
        return decorationPropsItem;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public DecorationPropsItem mo223809clone() {
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
        String str = this.itemId;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.coinPrice) * 41;
        long j = this.duration;
        int i3 = iHashCode + ((int) (j ^ (j >>> 32)));
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.itemId == null) {
            this.itemId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
