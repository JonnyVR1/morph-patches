package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.data.RelationshipStatus;
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
public class QuickChatBubble extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "quickchatbubble";

    @NonNull
    @ProtobufIndex(index = 1)
    public String biz;

    @NonNull
    @ProtobufIndex(index = 4)
    public RelationshipStatus rsStateReceiverToSender;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String stage;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String type;
    public static ProtobufAdapter<QuickChatBubble> PROTOBUF_ADAPTER = new MessageNanoAdapter<QuickChatBubble>() { // from class: com.p1.mobile.putong.core.data.QuickChatBubble.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(QuickChatBubble quickChatBubble) {
            String str = quickChatBubble.biz;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = quickChatBubble.stage;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = quickChatBubble.type;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            RelationshipStatus relationshipStatus = quickChatBubble.rsStateReceiverToSender;
            if (relationshipStatus != null) {
                iO += CodedOutputByteBufferNano.l(4, relationshipStatus, RelationshipStatus.PROTOBUF_ADAPTER);
            }
            ((MessageNano) quickChatBubble).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public QuickChatBubble m15163parse(nb5 nb5Var) throws IOException {
            QuickChatBubble quickChatBubble = new QuickChatBubble();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (quickChatBubble.biz == null) {
                        quickChatBubble.biz = "";
                    }
                    if (quickChatBubble.stage == null) {
                        quickChatBubble.stage = "";
                    }
                    if (quickChatBubble.type == null) {
                        quickChatBubble.type = "";
                    }
                    if (quickChatBubble.rsStateReceiverToSender != null) {
                        break;
                    }
                    quickChatBubble.rsStateReceiverToSender = RelationshipStatus.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iU == 10) {
                    quickChatBubble.biz = nb5Var.s();
                } else if (iU == 18) {
                    quickChatBubble.stage = nb5Var.s();
                } else if (iU == 26) {
                    quickChatBubble.type = nb5Var.s();
                } else {
                    if (iU != 34) {
                        if (quickChatBubble.biz == null) {
                            quickChatBubble.biz = "";
                        }
                        if (quickChatBubble.stage == null) {
                            quickChatBubble.stage = "";
                        }
                        if (quickChatBubble.type == null) {
                            quickChatBubble.type = "";
                        }
                        if (quickChatBubble.rsStateReceiverToSender != null) {
                            break;
                        }
                        quickChatBubble.rsStateReceiverToSender = RelationshipStatus.JSON_ADAPTER.defaultEnum();
                        return quickChatBubble;
                    }
                    quickChatBubble.rsStateReceiverToSender = (RelationshipStatus) nb5Var.l(RelationshipStatus.PROTOBUF_ADAPTER);
                }
            }
            return quickChatBubble;
        }

        public void serialize(QuickChatBubble quickChatBubble, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = quickChatBubble.biz;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = quickChatBubble.stage;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = quickChatBubble.type;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            RelationshipStatus relationshipStatus = quickChatBubble.rsStateReceiverToSender;
            if (relationshipStatus != null) {
                codedOutputByteBufferNano.K(4, relationshipStatus, RelationshipStatus.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<QuickChatBubble> JSON_ADAPTER = new ObjectJsonAdapter<QuickChatBubble>() { // from class: com.p1.mobile.putong.core.data.QuickChatBubble.2
        public Class getDataClass() {
            return QuickChatBubble.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public QuickChatBubble m15164newInstance() {
            return new QuickChatBubble();
        }

        public boolean parseField(QuickChatBubble quickChatBubble, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "biz":
                    quickChatBubble.biz = jsonParser.getValueAsString();
                    return true;
                case "type":
                    quickChatBubble.type = jsonParser.getValueAsString();
                    return true;
                case "stage":
                    quickChatBubble.stage = jsonParser.getValueAsString();
                    return true;
                case "rsStateReceiverToSender":
                    quickChatBubble.rsStateReceiverToSender = (RelationshipStatus) RelationshipStatus.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(QuickChatBubble quickChatBubble, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "biz":
                case "type":
                case "stage":
                case "rsStateReceiverToSender":
                    return true;
                default:
                    return super.parseFieldCheck(quickChatBubble, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(QuickChatBubble quickChatBubble, JsonGenerator jsonGenerator) throws IOException {
            String str = quickChatBubble.biz;
            if (str != null) {
                jsonGenerator.writeStringField("biz", str);
            }
            String str2 = quickChatBubble.stage;
            if (str2 != null) {
                jsonGenerator.writeStringField("stage", str2);
            }
            String str3 = quickChatBubble.type;
            if (str3 != null) {
                jsonGenerator.writeStringField("type", str3);
            }
            if (quickChatBubble.rsStateReceiverToSender != null) {
                jsonGenerator.writeFieldName("rsStateReceiverToSender");
                RelationshipStatus.JSON_ADAPTER.serialize(quickChatBubble.rsStateReceiverToSender, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((QuickChatBubble) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((QuickChatBubble) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static QuickChatBubble new_() {
        QuickChatBubble quickChatBubble = new QuickChatBubble();
        quickChatBubble.nullCheck();
        return quickChatBubble;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public QuickChatBubble m15162clone() {
        QuickChatBubble quickChatBubble = new QuickChatBubble();
        quickChatBubble.biz = this.biz;
        quickChatBubble.stage = this.stage;
        quickChatBubble.type = this.type;
        quickChatBubble.rsStateReceiverToSender = this.rsStateReceiverToSender;
        return quickChatBubble;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof QuickChatBubble)) {
            return false;
        }
        QuickChatBubble quickChatBubble = (QuickChatBubble) obj;
        return ValueObject.util_equals(this.biz, quickChatBubble.biz) && ValueObject.util_equals(this.stage, quickChatBubble.stage) && ValueObject.util_equals(this.type, quickChatBubble.type) && ValueObject.util_equals(this.rsStateReceiverToSender, quickChatBubble.rsStateReceiverToSender);
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
        String str = this.biz;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.stage;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.type;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        RelationshipStatus relationshipStatus = this.rsStateReceiverToSender;
        int iHashCode4 = iHashCode3 + (relationshipStatus != null ? relationshipStatus.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

    public void nullCheck() {
        if (this.biz == null) {
            this.biz = "";
        }
        if (this.stage == null) {
            this.stage = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.rsStateReceiverToSender == null) {
            this.rsStateReceiverToSender = RelationshipStatus.JSON_ADAPTER.defaultEnum();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
