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
public class LiveRecommendCard extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "liverecommendcard";

    @NonNull
    @ProtobufIndex(index = 4)
    public String buttonText;

    @NonNull
    @ProtobufIndex(index = 3)
    public String desc;

    @NonNull
    @ProtobufIndex(index = 5)
    public String extra;

    @NonNull
    @ProtobufIndex(index = 6)
    public String icon;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f689id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String title;

    @NonNull
    @ProtobufIndex(index = 7)
    public String type;
    public static ProtobufAdapter<LiveRecommendCard> PROTOBUF_ADAPTER = new MessageNanoAdapter<LiveRecommendCard>() { // from class: com.p1.mobile.putong.feed.data.LiveRecommendCard.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(LiveRecommendCard liveRecommendCard) {
            String str = liveRecommendCard.f689id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = liveRecommendCard.title;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = liveRecommendCard.desc;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = liveRecommendCard.buttonText;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            String str5 = liveRecommendCard.extra;
            if (str5 != null) {
                iO += CodedOutputByteBufferNano.o(5, str5);
            }
            String str6 = liveRecommendCard.icon;
            if (str6 != null) {
                iO += CodedOutputByteBufferNano.o(6, str6);
            }
            String str7 = liveRecommendCard.type;
            if (str7 != null) {
                iO += CodedOutputByteBufferNano.o(7, str7);
            }
            ((MessageNano) liveRecommendCard).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public LiveRecommendCard m19566parse(nb5 nb5Var) throws IOException {
            LiveRecommendCard liveRecommendCard = new LiveRecommendCard();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (liveRecommendCard.f689id == null) {
                        liveRecommendCard.f689id = "";
                    }
                    if (liveRecommendCard.title == null) {
                        liveRecommendCard.title = "";
                    }
                    if (liveRecommendCard.desc == null) {
                        liveRecommendCard.desc = "";
                    }
                    if (liveRecommendCard.buttonText == null) {
                        liveRecommendCard.buttonText = "";
                    }
                    if (liveRecommendCard.extra == null) {
                        liveRecommendCard.extra = "";
                    }
                    if (liveRecommendCard.icon == null) {
                        liveRecommendCard.icon = "";
                    }
                    if (liveRecommendCard.type != null) {
                        break;
                    }
                    liveRecommendCard.type = "";
                    break;
                }
                if (iU == 10) {
                    liveRecommendCard.f689id = nb5Var.s();
                } else if (iU == 18) {
                    liveRecommendCard.title = nb5Var.s();
                } else if (iU == 26) {
                    liveRecommendCard.desc = nb5Var.s();
                } else if (iU == 34) {
                    liveRecommendCard.buttonText = nb5Var.s();
                } else if (iU == 42) {
                    liveRecommendCard.extra = nb5Var.s();
                } else if (iU == 50) {
                    liveRecommendCard.icon = nb5Var.s();
                } else {
                    if (iU != 58) {
                        if (liveRecommendCard.f689id == null) {
                            liveRecommendCard.f689id = "";
                        }
                        if (liveRecommendCard.title == null) {
                            liveRecommendCard.title = "";
                        }
                        if (liveRecommendCard.desc == null) {
                            liveRecommendCard.desc = "";
                        }
                        if (liveRecommendCard.buttonText == null) {
                            liveRecommendCard.buttonText = "";
                        }
                        if (liveRecommendCard.extra == null) {
                            liveRecommendCard.extra = "";
                        }
                        if (liveRecommendCard.icon == null) {
                            liveRecommendCard.icon = "";
                        }
                        if (liveRecommendCard.type != null) {
                            break;
                        }
                        liveRecommendCard.type = "";
                        return liveRecommendCard;
                    }
                    liveRecommendCard.type = nb5Var.s();
                }
            }
            return liveRecommendCard;
        }

        public void serialize(LiveRecommendCard liveRecommendCard, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = liveRecommendCard.f689id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = liveRecommendCard.title;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = liveRecommendCard.desc;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = liveRecommendCard.buttonText;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
            String str5 = liveRecommendCard.extra;
            if (str5 != null) {
                codedOutputByteBufferNano.R(5, str5);
            }
            String str6 = liveRecommendCard.icon;
            if (str6 != null) {
                codedOutputByteBufferNano.R(6, str6);
            }
            String str7 = liveRecommendCard.type;
            if (str7 != null) {
                codedOutputByteBufferNano.R(7, str7);
            }
        }
    };
    public static JsonAdapter<LiveRecommendCard> JSON_ADAPTER = new ObjectJsonAdapter<LiveRecommendCard>() { // from class: com.p1.mobile.putong.feed.data.LiveRecommendCard.2
        public Class getDataClass() {
            return LiveRecommendCard.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public LiveRecommendCard mo17830newInstance() {
            return new LiveRecommendCard();
        }

        public boolean parseField(LiveRecommendCard liveRecommendCard, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    liveRecommendCard.f689id = jsonParser.getValueAsString();
                    return false;
                case "desc":
                    liveRecommendCard.desc = jsonParser.getValueAsString();
                    return true;
                case "icon":
                    liveRecommendCard.icon = jsonParser.getValueAsString();
                    return true;
                case "type":
                    liveRecommendCard.type = jsonParser.getValueAsString();
                    return true;
                case "extra":
                    liveRecommendCard.extra = jsonParser.getValueAsString();
                    return true;
                case "title":
                    liveRecommendCard.title = jsonParser.getValueAsString();
                    return true;
                case "buttonText":
                    liveRecommendCard.buttonText = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(LiveRecommendCard liveRecommendCard, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "id":
                    return false;
                case "desc":
                case "icon":
                case "type":
                case "extra":
                case "title":
                case "buttonText":
                    return true;
                default:
                    return super.parseFieldCheck(liveRecommendCard, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LiveRecommendCard liveRecommendCard, JsonGenerator jsonGenerator) throws IOException {
            String str = liveRecommendCard.f689id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = liveRecommendCard.title;
            if (str2 != null) {
                jsonGenerator.writeStringField("title", str2);
            }
            String str3 = liveRecommendCard.desc;
            if (str3 != null) {
                jsonGenerator.writeStringField("desc", str3);
            }
            String str4 = liveRecommendCard.buttonText;
            if (str4 != null) {
                jsonGenerator.writeStringField("buttonText", str4);
            }
            String str5 = liveRecommendCard.extra;
            if (str5 != null) {
                jsonGenerator.writeStringField("extra", str5);
            }
            String str6 = liveRecommendCard.icon;
            if (str6 != null) {
                jsonGenerator.writeStringField("icon", str6);
            }
            String str7 = liveRecommendCard.type;
            if (str7 != null) {
                jsonGenerator.writeStringField("type", str7);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LiveRecommendCard) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LiveRecommendCard) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LiveRecommendCard new_() {
        LiveRecommendCard liveRecommendCard = new LiveRecommendCard();
        liveRecommendCard.nullCheck();
        return liveRecommendCard;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public LiveRecommendCard m19565clone() {
        LiveRecommendCard liveRecommendCard = new LiveRecommendCard();
        liveRecommendCard.f689id = this.f689id;
        liveRecommendCard.title = this.title;
        liveRecommendCard.desc = this.desc;
        liveRecommendCard.buttonText = this.buttonText;
        liveRecommendCard.extra = this.extra;
        liveRecommendCard.icon = this.icon;
        liveRecommendCard.type = this.type;
        return liveRecommendCard;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LiveRecommendCard)) {
            return false;
        }
        LiveRecommendCard liveRecommendCard = (LiveRecommendCard) obj;
        return ValueObject.util_equals(this.f689id, liveRecommendCard.f689id) && ValueObject.util_equals(this.title, liveRecommendCard.title) && ValueObject.util_equals(this.desc, liveRecommendCard.desc) && ValueObject.util_equals(this.buttonText, liveRecommendCard.buttonText) && ValueObject.util_equals(this.extra, liveRecommendCard.extra) && ValueObject.util_equals(this.icon, liveRecommendCard.icon) && ValueObject.util_equals(this.type, liveRecommendCard.type);
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
        String str = this.f689id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.desc;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.buttonText;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.extra;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.icon;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.type;
        int iHashCode7 = iHashCode6 + (str7 != null ? str7.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode7;
        return iHashCode7;
    }

    public void nullCheck() {
        if (this.f689id == null) {
            this.f689id = "";
        }
        if (this.title == null) {
            this.title = "";
        }
        if (this.desc == null) {
            this.desc = "";
        }
        if (this.buttonText == null) {
            this.buttonText = "";
        }
        if (this.extra == null) {
            this.extra = "";
        }
        if (this.icon == null) {
            this.icon = "";
        }
        if (this.type == null) {
            this.type = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
