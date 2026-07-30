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
public class WoodenFishHint extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "woodenfishhint";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public int count;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String text;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;
    public static ProtobufAdapter<WoodenFishHint> PROTOBUF_ADAPTER = new MessageNanoAdapter<WoodenFishHint>() { // from class: com.p1.mobile.putong.core.data.WoodenFishHint.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(WoodenFishHint woodenFishHint) {
            String str = woodenFishHint.userId;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = woodenFishHint.text;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            int iH = iO + CodedOutputByteBufferNano.h(3, woodenFishHint.count);
            ((MessageNano) woodenFishHint).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public WoodenFishHint m16345parse(nb5 nb5Var) throws IOException {
            WoodenFishHint woodenFishHint = new WoodenFishHint();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (woodenFishHint.userId == null) {
                        woodenFishHint.userId = "";
                    }
                    if (woodenFishHint.text != null) {
                        break;
                    }
                    woodenFishHint.text = "";
                    break;
                }
                if (iU == 10) {
                    woodenFishHint.userId = nb5Var.s();
                } else if (iU == 18) {
                    woodenFishHint.text = nb5Var.s();
                } else {
                    if (iU != 24) {
                        if (woodenFishHint.userId == null) {
                            woodenFishHint.userId = "";
                        }
                        if (woodenFishHint.text != null) {
                            break;
                        }
                        woodenFishHint.text = "";
                        return woodenFishHint;
                    }
                    woodenFishHint.count = nb5Var.j();
                }
            }
            return woodenFishHint;
        }

        public void serialize(WoodenFishHint woodenFishHint, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = woodenFishHint.userId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = woodenFishHint.text;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            codedOutputByteBufferNano.G(3, woodenFishHint.count);
        }
    };
    public static JsonAdapter<WoodenFishHint> JSON_ADAPTER = new ObjectJsonAdapter<WoodenFishHint>() { // from class: com.p1.mobile.putong.core.data.WoodenFishHint.2
        public Class getDataClass() {
            return WoodenFishHint.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public WoodenFishHint m16346newInstance() {
            return new WoodenFishHint();
        }

        public boolean parseField(WoodenFishHint woodenFishHint, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "userId":
                    woodenFishHint.userId = jsonParser.getValueAsString();
                    return true;
                case "text":
                    woodenFishHint.text = jsonParser.getValueAsString();
                    return true;
                case "count":
                    woodenFishHint.count = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(WoodenFishHint woodenFishHint, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "userId":
                case "text":
                case "count":
                    return true;
                default:
                    return super.parseFieldCheck(woodenFishHint, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(WoodenFishHint woodenFishHint, JsonGenerator jsonGenerator) throws IOException {
            String str = woodenFishHint.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            String str2 = woodenFishHint.text;
            if (str2 != null) {
                jsonGenerator.writeStringField("text", str2);
            }
            jsonGenerator.writeNumberField("count", woodenFishHint.count);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((WoodenFishHint) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((WoodenFishHint) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static WoodenFishHint new_() {
        WoodenFishHint woodenFishHint = new WoodenFishHint();
        woodenFishHint.nullCheck();
        return woodenFishHint;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public WoodenFishHint m16344clone() {
        WoodenFishHint woodenFishHint = new WoodenFishHint();
        woodenFishHint.userId = this.userId;
        woodenFishHint.text = this.text;
        woodenFishHint.count = this.count;
        return woodenFishHint;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WoodenFishHint)) {
            return false;
        }
        WoodenFishHint woodenFishHint = (WoodenFishHint) obj;
        return ValueObject.util_equals(this.userId, woodenFishHint.userId) && ValueObject.util_equals(this.text, woodenFishHint.text) && this.count == woodenFishHint.count;
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
        String str2 = this.text;
        int iHashCode2 = ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + this.count;
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.text == null) {
            this.text = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
