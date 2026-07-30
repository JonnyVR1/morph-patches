package com.p000p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class BubbleText extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "bubbletext";

    @NonNull
    @ProtobufIndex(index = 1)
    public String city;

    @NonNull
    @ProtobufIndex(index = 3)
    public String noKankan;

    @NonNull
    @ProtobufIndex(index = 4)
    public String picture;

    @NonNull
    @ProtobufIndex(index = 2)
    public String posted;
    public static ProtobufAdapter<BubbleText> PROTOBUF_ADAPTER = new MessageNanoAdapter<BubbleText>() { // from class: com.p1.mobile.putong.feed.data.BubbleText.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(BubbleText bubbleText) {
            String str = bubbleText.city;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = bubbleText.posted;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = bubbleText.noKankan;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = bubbleText.picture;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            ((MessageNano) bubbleText).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public BubbleText m19431parse(nb5 nb5Var) throws IOException {
            BubbleText bubbleText = new BubbleText();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (bubbleText.city == null) {
                        bubbleText.city = "";
                    }
                    if (bubbleText.posted == null) {
                        bubbleText.posted = "";
                    }
                    if (bubbleText.noKankan == null) {
                        bubbleText.noKankan = "";
                    }
                    if (bubbleText.picture != null) {
                        break;
                    }
                    bubbleText.picture = "";
                    break;
                }
                if (iU == 10) {
                    bubbleText.city = nb5Var.s();
                } else if (iU == 18) {
                    bubbleText.posted = nb5Var.s();
                } else if (iU == 26) {
                    bubbleText.noKankan = nb5Var.s();
                } else {
                    if (iU != 34) {
                        if (bubbleText.city == null) {
                            bubbleText.city = "";
                        }
                        if (bubbleText.posted == null) {
                            bubbleText.posted = "";
                        }
                        if (bubbleText.noKankan == null) {
                            bubbleText.noKankan = "";
                        }
                        if (bubbleText.picture != null) {
                            break;
                        }
                        bubbleText.picture = "";
                        return bubbleText;
                    }
                    bubbleText.picture = nb5Var.s();
                }
            }
            return bubbleText;
        }

        public void serialize(BubbleText bubbleText, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = bubbleText.city;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = bubbleText.posted;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = bubbleText.noKankan;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = bubbleText.picture;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
        }
    };
    public static JsonAdapter<BubbleText> JSON_ADAPTER = new ObjectJsonAdapter<BubbleText>() { // from class: com.p1.mobile.putong.feed.data.BubbleText.2
        public Class getDataClass() {
            return BubbleText.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public BubbleText mo17830newInstance() {
            return new BubbleText();
        }

        public boolean parseField(BubbleText bubbleText, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "posted":
                    bubbleText.posted = jsonParser.getValueAsString();
                    return true;
                case "picture":
                    bubbleText.picture = jsonParser.getValueAsString();
                    return true;
                case "city":
                    bubbleText.city = jsonParser.getValueAsString();
                    return true;
                case "noKankan":
                    bubbleText.noKankan = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(BubbleText bubbleText, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "posted":
                case "picture":
                case "city":
                case "noKankan":
                    return true;
                default:
                    return super.parseFieldCheck(bubbleText, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BubbleText bubbleText, JsonGenerator jsonGenerator) throws IOException {
            String str = bubbleText.city;
            if (str != null) {
                jsonGenerator.writeStringField("city", str);
            }
            String str2 = bubbleText.posted;
            if (str2 != null) {
                jsonGenerator.writeStringField("posted", str2);
            }
            String str3 = bubbleText.noKankan;
            if (str3 != null) {
                jsonGenerator.writeStringField("noKankan", str3);
            }
            String str4 = bubbleText.picture;
            if (str4 != null) {
                jsonGenerator.writeStringField("picture", str4);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((BubbleText) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BubbleText) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static BubbleText new_() {
        BubbleText bubbleText = new BubbleText();
        bubbleText.nullCheck();
        return bubbleText;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public BubbleText m19430clone() {
        BubbleText bubbleText = new BubbleText();
        bubbleText.city = this.city;
        bubbleText.posted = this.posted;
        bubbleText.noKankan = this.noKankan;
        bubbleText.picture = this.picture;
        return bubbleText;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BubbleText)) {
            return false;
        }
        BubbleText bubbleText = (BubbleText) obj;
        return ValueObject.util_equals(this.city, bubbleText.city) && ValueObject.util_equals(this.posted, bubbleText.posted) && ValueObject.util_equals(this.noKankan, bubbleText.noKankan) && ValueObject.util_equals(this.picture, bubbleText.picture);
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
        String str = this.city;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.posted;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.noKankan;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.picture;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

    public void nullCheck() {
        if (this.city == null) {
            this.city = "";
        }
        if (this.posted == null) {
            this.posted = "";
        }
        if (this.noKankan == null) {
            this.noKankan = "";
        }
        if (this.picture == null) {
            this.picture = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
