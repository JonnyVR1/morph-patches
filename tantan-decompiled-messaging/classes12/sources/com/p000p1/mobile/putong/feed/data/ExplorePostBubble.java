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
public class ExplorePostBubble extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "explorepostbubble";

    @NonNull
    @ProtobufIndex(index = 3)
    public String picture;

    @NonNull
    @ProtobufIndex(index = 2)
    public String subtitle;

    @NonNull
    @ProtobufIndex(index = 1)
    public String title;

    @NonNull
    @ProtobufIndex(index = 5)
    public String topicId;

    @NonNull
    @ProtobufIndex(index = 6)
    public String topicName;

    @NonNull
    @ProtobufIndex(index = 4)
    public AtUserIdBox user;
    public static ProtobufAdapter<ExplorePostBubble> PROTOBUF_ADAPTER = new MessageNanoAdapter<ExplorePostBubble>() { // from class: com.p1.mobile.putong.feed.data.ExplorePostBubble.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ExplorePostBubble explorePostBubble) {
            String str = explorePostBubble.title;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = explorePostBubble.subtitle;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = explorePostBubble.picture;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            AtUserIdBox atUserIdBox = explorePostBubble.user;
            if (atUserIdBox != null) {
                iO += CodedOutputByteBufferNano.l(4, atUserIdBox, AtUserIdBox.PROTOBUF_ADAPTER);
            }
            String str4 = explorePostBubble.topicId;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(5, str4);
            }
            String str5 = explorePostBubble.topicName;
            if (str5 != null) {
                iO += CodedOutputByteBufferNano.o(6, str5);
            }
            ((MessageNano) explorePostBubble).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ExplorePostBubble m19482parse(nb5 nb5Var) throws IOException {
            ExplorePostBubble explorePostBubble = new ExplorePostBubble();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (explorePostBubble.title == null) {
                        explorePostBubble.title = "";
                    }
                    if (explorePostBubble.subtitle == null) {
                        explorePostBubble.subtitle = "";
                    }
                    if (explorePostBubble.picture == null) {
                        explorePostBubble.picture = "";
                    }
                    if (explorePostBubble.user == null) {
                        explorePostBubble.user = AtUserIdBox.new_();
                    }
                    if (explorePostBubble.topicId == null) {
                        explorePostBubble.topicId = "";
                    }
                    if (explorePostBubble.topicName != null) {
                        break;
                    }
                    explorePostBubble.topicName = "";
                    break;
                }
                if (iU == 10) {
                    explorePostBubble.title = nb5Var.s();
                } else if (iU == 18) {
                    explorePostBubble.subtitle = nb5Var.s();
                } else if (iU == 26) {
                    explorePostBubble.picture = nb5Var.s();
                } else if (iU == 34) {
                    explorePostBubble.user = (AtUserIdBox) nb5Var.l(AtUserIdBox.PROTOBUF_ADAPTER);
                } else if (iU == 42) {
                    explorePostBubble.topicId = nb5Var.s();
                } else {
                    if (iU != 50) {
                        if (explorePostBubble.title == null) {
                            explorePostBubble.title = "";
                        }
                        if (explorePostBubble.subtitle == null) {
                            explorePostBubble.subtitle = "";
                        }
                        if (explorePostBubble.picture == null) {
                            explorePostBubble.picture = "";
                        }
                        if (explorePostBubble.user == null) {
                            explorePostBubble.user = AtUserIdBox.new_();
                        }
                        if (explorePostBubble.topicId == null) {
                            explorePostBubble.topicId = "";
                        }
                        if (explorePostBubble.topicName != null) {
                            break;
                        }
                        explorePostBubble.topicName = "";
                        return explorePostBubble;
                    }
                    explorePostBubble.topicName = nb5Var.s();
                }
            }
            return explorePostBubble;
        }

        public void serialize(ExplorePostBubble explorePostBubble, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = explorePostBubble.title;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = explorePostBubble.subtitle;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = explorePostBubble.picture;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            AtUserIdBox atUserIdBox = explorePostBubble.user;
            if (atUserIdBox != null) {
                codedOutputByteBufferNano.K(4, atUserIdBox, AtUserIdBox.PROTOBUF_ADAPTER);
            }
            String str4 = explorePostBubble.topicId;
            if (str4 != null) {
                codedOutputByteBufferNano.R(5, str4);
            }
            String str5 = explorePostBubble.topicName;
            if (str5 != null) {
                codedOutputByteBufferNano.R(6, str5);
            }
        }
    };
    public static JsonAdapter<ExplorePostBubble> JSON_ADAPTER = new ObjectJsonAdapter<ExplorePostBubble>() { // from class: com.p1.mobile.putong.feed.data.ExplorePostBubble.2
        public Class getDataClass() {
            return ExplorePostBubble.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public ExplorePostBubble mo17830newInstance() {
            return new ExplorePostBubble();
        }

        public boolean parseField(ExplorePostBubble explorePostBubble, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "subtitle":
                    explorePostBubble.subtitle = jsonParser.getValueAsString();
                    return true;
                case "topicId":
                    explorePostBubble.topicId = jsonParser.getValueAsString();
                    return true;
                case "picture":
                    explorePostBubble.picture = jsonParser.getValueAsString();
                    return true;
                case "user":
                    explorePostBubble.user = (AtUserIdBox) AtUserIdBox.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "title":
                    explorePostBubble.title = jsonParser.getValueAsString();
                    return true;
                case "topicName":
                    explorePostBubble.topicName = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ExplorePostBubble explorePostBubble, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "subtitle":
                case "topicId":
                case "picture":
                case "user":
                case "title":
                case "topicName":
                    return true;
                default:
                    return super.parseFieldCheck(explorePostBubble, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ExplorePostBubble explorePostBubble, JsonGenerator jsonGenerator) throws IOException {
            String str = explorePostBubble.title;
            if (str != null) {
                jsonGenerator.writeStringField("title", str);
            }
            String str2 = explorePostBubble.subtitle;
            if (str2 != null) {
                jsonGenerator.writeStringField("subtitle", str2);
            }
            String str3 = explorePostBubble.picture;
            if (str3 != null) {
                jsonGenerator.writeStringField("picture", str3);
            }
            if (explorePostBubble.user != null) {
                jsonGenerator.writeFieldName("user");
                AtUserIdBox.JSON_ADAPTER.serialize(explorePostBubble.user, jsonGenerator, true);
            }
            String str4 = explorePostBubble.topicId;
            if (str4 != null) {
                jsonGenerator.writeStringField("topicId", str4);
            }
            String str5 = explorePostBubble.topicName;
            if (str5 != null) {
                jsonGenerator.writeStringField("topicName", str5);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ExplorePostBubble) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ExplorePostBubble) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ExplorePostBubble new_() {
        ExplorePostBubble explorePostBubble = new ExplorePostBubble();
        explorePostBubble.nullCheck();
        return explorePostBubble;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ExplorePostBubble m19481clone() {
        ExplorePostBubble explorePostBubble = new ExplorePostBubble();
        explorePostBubble.title = this.title;
        explorePostBubble.subtitle = this.subtitle;
        explorePostBubble.picture = this.picture;
        AtUserIdBox atUserIdBox = this.user;
        if (atUserIdBox != null) {
            explorePostBubble.user = atUserIdBox.m19412clone();
        }
        explorePostBubble.topicId = this.topicId;
        explorePostBubble.topicName = this.topicName;
        return explorePostBubble;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ExplorePostBubble)) {
            return false;
        }
        ExplorePostBubble explorePostBubble = (ExplorePostBubble) obj;
        return ValueObject.util_equals(this.title, explorePostBubble.title) && ValueObject.util_equals(this.subtitle, explorePostBubble.subtitle) && ValueObject.util_equals(this.picture, explorePostBubble.picture) && ValueObject.util_equals(this.user, explorePostBubble.user) && ValueObject.util_equals(this.topicId, explorePostBubble.topicId) && ValueObject.util_equals(this.topicName, explorePostBubble.topicName);
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
        String str = this.title;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.subtitle;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.picture;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        AtUserIdBox atUserIdBox = this.user;
        int iHashCode4 = (iHashCode3 + (atUserIdBox != null ? atUserIdBox.hashCode() : 0)) * 41;
        String str4 = this.topicId;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.topicName;
        int iHashCode6 = iHashCode5 + (str5 != null ? str5.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode6;
        return iHashCode6;
    }

    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
        if (this.subtitle == null) {
            this.subtitle = "";
        }
        if (this.picture == null) {
            this.picture = "";
        }
        if (this.user == null) {
            this.user = AtUserIdBox.new_();
        }
        if (this.topicId == null) {
            this.topicId = "";
        }
        if (this.topicName == null) {
            this.topicName = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
