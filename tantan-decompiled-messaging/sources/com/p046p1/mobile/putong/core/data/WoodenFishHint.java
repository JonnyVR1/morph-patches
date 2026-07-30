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
public class WoodenFishHint extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "woodenfishhint";

    @ProtobufIndex(index = 3)
    public int count;

    @NonNull
    @ProtobufIndex(index = 2)
    public String text;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;
    public static ProtobufAdapter<WoodenFishHint> PROTOBUF_ADAPTER = new MessageNanoAdapter<WoodenFishHint>() { // from class: com.p1.mobile.putong.core.data.WoodenFishHint.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(WoodenFishHint woodenFishHint) {
            String str = woodenFishHint.userId;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = woodenFishHint.text;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            int iM17226h = iM17233o + CodedOutputByteBufferNano.m17226h(3, woodenFishHint.count);
            woodenFishHint.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public WoodenFishHint parse(nb5 nb5Var) throws IOException {
            WoodenFishHint woodenFishHint = new WoodenFishHint();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (woodenFishHint.userId == null) {
                        woodenFishHint.userId = "";
                    }
                    if (woodenFishHint.text != null) {
                        break;
                    }
                    woodenFishHint.text = "";
                    break;
                }
                if (iM158752u == 10) {
                    woodenFishHint.userId = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    woodenFishHint.text = nb5Var.m158750s();
                } else {
                    if (iM158752u != 24) {
                        if (woodenFishHint.userId == null) {
                            woodenFishHint.userId = "";
                        }
                        if (woodenFishHint.text != null) {
                            break;
                        }
                        woodenFishHint.text = "";
                        return woodenFishHint;
                    }
                    woodenFishHint.count = nb5Var.m158741j();
                }
            }
            return woodenFishHint;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(WoodenFishHint woodenFishHint, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = woodenFishHint.userId;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = woodenFishHint.text;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            codedOutputByteBufferNano.m17250G(3, woodenFishHint.count);
        }
    };
    public static JsonAdapter<WoodenFishHint> JSON_ADAPTER = new ObjectJsonAdapter<WoodenFishHint>() { // from class: com.p1.mobile.putong.core.data.WoodenFishHint.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return WoodenFishHint.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public WoodenFishHint newInstance() {
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((WoodenFishHint) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((WoodenFishHint) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static WoodenFishHint new_() {
        WoodenFishHint woodenFishHint = new WoodenFishHint();
        woodenFishHint.nullCheck();
        return woodenFishHint;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public WoodenFishHint mo223809clone() {
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
        String str = this.userId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.text;
        int iHashCode2 = ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + this.count;
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.text == null) {
            this.text = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
