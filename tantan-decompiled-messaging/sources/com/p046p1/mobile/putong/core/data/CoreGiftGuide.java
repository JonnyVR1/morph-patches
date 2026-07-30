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
public class CoreGiftGuide extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "coregiftguide";

    @ProtobufIndex(index = 1)
    public boolean show;

    @NonNull
    @ProtobufIndex(index = 2)
    public GiftGuideStyle style;

    @NonNull
    @ProtobufIndex(index = 3)
    public String tracker;
    public static ProtobufAdapter<CoreGiftGuide> PROTOBUF_ADAPTER = new MessageNanoAdapter<CoreGiftGuide>() { // from class: com.p1.mobile.putong.core.data.CoreGiftGuide.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(CoreGiftGuide coreGiftGuide) {
            int iM17220b = CodedOutputByteBufferNano.m17220b(1, coreGiftGuide.show);
            GiftGuideStyle giftGuideStyle = coreGiftGuide.style;
            if (giftGuideStyle != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(2, giftGuideStyle, GiftGuideStyle.PROTOBUF_ADAPTER);
            }
            String str = coreGiftGuide.tracker;
            if (str != null) {
                iM17220b += CodedOutputByteBufferNano.m17233o(3, str);
            }
            coreGiftGuide.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public CoreGiftGuide parse(nb5 nb5Var) throws IOException {
            CoreGiftGuide coreGiftGuide = new CoreGiftGuide();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (coreGiftGuide.style == null) {
                        coreGiftGuide.style = GiftGuideStyle.new_();
                    }
                    if (coreGiftGuide.tracker != null) {
                        break;
                    }
                    coreGiftGuide.tracker = "";
                    break;
                }
                if (iM158752u == 8) {
                    coreGiftGuide.show = nb5Var.m158738g();
                } else if (iM158752u == 18) {
                    coreGiftGuide.style = (GiftGuideStyle) nb5Var.m158743l(GiftGuideStyle.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 26) {
                        if (coreGiftGuide.style == null) {
                            coreGiftGuide.style = GiftGuideStyle.new_();
                        }
                        if (coreGiftGuide.tracker != null) {
                            break;
                        }
                        coreGiftGuide.tracker = "";
                        return coreGiftGuide;
                    }
                    coreGiftGuide.tracker = nb5Var.m158750s();
                }
            }
            return coreGiftGuide;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(CoreGiftGuide coreGiftGuide, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17244A(1, coreGiftGuide.show);
            GiftGuideStyle giftGuideStyle = coreGiftGuide.style;
            if (giftGuideStyle != null) {
                codedOutputByteBufferNano.m17254K(2, giftGuideStyle, GiftGuideStyle.PROTOBUF_ADAPTER);
            }
            String str = coreGiftGuide.tracker;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(3, str);
            }
        }
    };
    public static JsonAdapter<CoreGiftGuide> JSON_ADAPTER = new ObjectJsonAdapter<CoreGiftGuide>() { // from class: com.p1.mobile.putong.core.data.CoreGiftGuide.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return CoreGiftGuide.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public CoreGiftGuide newInstance() {
            return new CoreGiftGuide();
        }

        public boolean parseField(CoreGiftGuide coreGiftGuide, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "tracker":
                    coreGiftGuide.tracker = jsonParser.getValueAsString();
                    return true;
                case "show":
                    coreGiftGuide.show = jsonParser.getValueAsBoolean();
                    return true;
                case "style":
                    coreGiftGuide.style = GiftGuideStyle.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(CoreGiftGuide coreGiftGuide, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "tracker":
                case "show":
                case "style":
                    return true;
                default:
                    return super.parseFieldCheck(coreGiftGuide, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(CoreGiftGuide coreGiftGuide, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("show", coreGiftGuide.show);
            if (coreGiftGuide.style != null) {
                jsonGenerator.writeFieldName("style");
                GiftGuideStyle.JSON_ADAPTER.serialize(coreGiftGuide.style, jsonGenerator, true);
            }
            String str = coreGiftGuide.tracker;
            if (str != null) {
                jsonGenerator.writeStringField("tracker", str);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CoreGiftGuide) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CoreGiftGuide) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CoreGiftGuide new_() {
        CoreGiftGuide coreGiftGuide = new CoreGiftGuide();
        coreGiftGuide.nullCheck();
        return coreGiftGuide;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public CoreGiftGuide mo223809clone() {
        CoreGiftGuide coreGiftGuide = new CoreGiftGuide();
        coreGiftGuide.show = this.show;
        GiftGuideStyle giftGuideStyle = this.style;
        if (giftGuideStyle != null) {
            coreGiftGuide.style = giftGuideStyle.mo223809clone();
        }
        coreGiftGuide.tracker = this.tracker;
        return coreGiftGuide;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CoreGiftGuide)) {
            return false;
        }
        CoreGiftGuide coreGiftGuide = (CoreGiftGuide) obj;
        return this.show == coreGiftGuide.show && ValueObject.util_equals(this.style, coreGiftGuide.style) && ValueObject.util_equals(this.tracker, coreGiftGuide.tracker);
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
        int i2 = ((i * 41) + (this.show ? 1231 : 1237)) * 41;
        GiftGuideStyle giftGuideStyle = this.style;
        int iHashCode = (i2 + (giftGuideStyle != null ? giftGuideStyle.hashCode() : 0)) * 41;
        String str = this.tracker;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.style == null) {
            this.style = GiftGuideStyle.new_();
        }
        if (this.tracker == null) {
            this.tracker = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
