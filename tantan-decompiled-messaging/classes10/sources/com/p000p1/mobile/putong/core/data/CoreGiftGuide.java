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
public class CoreGiftGuide extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "coregiftguide";

    @ProtobufIndex(index = 1)
    public boolean show;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public GiftGuideStyle style;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String tracker;
    public static ProtobufAdapter<CoreGiftGuide> PROTOBUF_ADAPTER = new MessageNanoAdapter<CoreGiftGuide>() { // from class: com.p1.mobile.putong.core.data.CoreGiftGuide.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(CoreGiftGuide coreGiftGuide) {
            int iB = CodedOutputByteBufferNano.b(1, coreGiftGuide.show);
            GiftGuideStyle giftGuideStyle = coreGiftGuide.style;
            if (giftGuideStyle != null) {
                iB += CodedOutputByteBufferNano.l(2, giftGuideStyle, GiftGuideStyle.PROTOBUF_ADAPTER);
            }
            String str = coreGiftGuide.tracker;
            if (str != null) {
                iB += CodedOutputByteBufferNano.o(3, str);
            }
            ((MessageNano) coreGiftGuide).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public CoreGiftGuide m12481parse(nb5 nb5Var) throws IOException {
            CoreGiftGuide coreGiftGuide = new CoreGiftGuide();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (coreGiftGuide.style == null) {
                        coreGiftGuide.style = GiftGuideStyle.new_();
                    }
                    if (coreGiftGuide.tracker != null) {
                        break;
                    }
                    coreGiftGuide.tracker = "";
                    break;
                }
                if (iU == 8) {
                    coreGiftGuide.show = nb5Var.g();
                } else if (iU == 18) {
                    coreGiftGuide.style = (GiftGuideStyle) nb5Var.l(GiftGuideStyle.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 26) {
                        if (coreGiftGuide.style == null) {
                            coreGiftGuide.style = GiftGuideStyle.new_();
                        }
                        if (coreGiftGuide.tracker != null) {
                            break;
                        }
                        coreGiftGuide.tracker = "";
                        return coreGiftGuide;
                    }
                    coreGiftGuide.tracker = nb5Var.s();
                }
            }
            return coreGiftGuide;
        }

        public void serialize(CoreGiftGuide coreGiftGuide, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, coreGiftGuide.show);
            GiftGuideStyle giftGuideStyle = coreGiftGuide.style;
            if (giftGuideStyle != null) {
                codedOutputByteBufferNano.K(2, giftGuideStyle, GiftGuideStyle.PROTOBUF_ADAPTER);
            }
            String str = coreGiftGuide.tracker;
            if (str != null) {
                codedOutputByteBufferNano.R(3, str);
            }
        }
    };
    public static JsonAdapter<CoreGiftGuide> JSON_ADAPTER = new ObjectJsonAdapter<CoreGiftGuide>() { // from class: com.p1.mobile.putong.core.data.CoreGiftGuide.2
        public Class getDataClass() {
            return CoreGiftGuide.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public CoreGiftGuide m12482newInstance() {
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
                    coreGiftGuide.style = (GiftGuideStyle) GiftGuideStyle.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CoreGiftGuide) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CoreGiftGuide) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CoreGiftGuide new_() {
        CoreGiftGuide coreGiftGuide = new CoreGiftGuide();
        coreGiftGuide.nullCheck();
        return coreGiftGuide;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public CoreGiftGuide m12480clone() {
        CoreGiftGuide coreGiftGuide = new CoreGiftGuide();
        coreGiftGuide.show = this.show;
        GiftGuideStyle giftGuideStyle = this.style;
        if (giftGuideStyle != null) {
            coreGiftGuide.style = giftGuideStyle.m12938clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + (this.show ? 1231 : 1237)) * 41;
        GiftGuideStyle giftGuideStyle = this.style;
        int iHashCode = (i2 + (giftGuideStyle != null ? giftGuideStyle.hashCode() : 0)) * 41;
        String str = this.tracker;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.style == null) {
            this.style = GiftGuideStyle.new_();
        }
        if (this.tracker == null) {
            this.tracker = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
