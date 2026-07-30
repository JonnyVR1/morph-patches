package com.p000p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.Action;
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
public class MomentMessageReference extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "momentmessagereference";

    @NonNull
    @ProtobufIndex(index = 3)
    public FeedMomentAction action;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 2)
    public String f694id;

    @NonNull
    @ProtobufIndex(index = 1)
    public String type;
    public static ProtobufAdapter<MomentMessageReference> PROTOBUF_ADAPTER = new MessageNanoAdapter<MomentMessageReference>() { // from class: com.p1.mobile.putong.feed.data.MomentMessageReference.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MomentMessageReference momentMessageReference) {
            String str = momentMessageReference.type;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = momentMessageReference.f694id;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            FeedMomentAction feedMomentAction = momentMessageReference.action;
            if (feedMomentAction != null) {
                iO += CodedOutputByteBufferNano.h(3, feedMomentAction.ordinal());
            }
            FeedMomentAction feedMomentAction2 = momentMessageReference.action;
            if (feedMomentAction2 != null) {
                iO += CodedOutputByteBufferNano.l(4, feedMomentAction2, FeedMomentAction.PROTOBUF_ADAPTER);
            }
            ((MessageNano) momentMessageReference).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MomentMessageReference m19636parse(nb5 nb5Var) throws IOException {
            MomentMessageReference momentMessageReference = new MomentMessageReference();
            Integer numValueOf = null;
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (momentMessageReference.action == null && numValueOf != null) {
                        momentMessageReference.action = (FeedMomentAction) FeedMomentAction.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                    }
                    if (momentMessageReference.type == null) {
                        momentMessageReference.type = "";
                    }
                    if (momentMessageReference.f694id == null) {
                        momentMessageReference.f694id = "";
                    }
                    if (momentMessageReference.action != null) {
                        break;
                    }
                    momentMessageReference.action = (FeedMomentAction) FeedMomentAction.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iU == 10) {
                    momentMessageReference.type = nb5Var.s();
                } else if (iU == 18) {
                    momentMessageReference.f694id = nb5Var.s();
                } else if (iU == 24) {
                    numValueOf = Integer.valueOf(nb5Var.j());
                } else {
                    if (iU != 34) {
                        if (momentMessageReference.action == null && numValueOf != null) {
                            momentMessageReference.action = (FeedMomentAction) FeedMomentAction.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (momentMessageReference.type == null) {
                            momentMessageReference.type = "";
                        }
                        if (momentMessageReference.f694id == null) {
                            momentMessageReference.f694id = "";
                        }
                        if (momentMessageReference.action != null) {
                            break;
                        }
                        momentMessageReference.action = (FeedMomentAction) FeedMomentAction.JSON_ADAPTER.defaultEnum();
                        return momentMessageReference;
                    }
                    momentMessageReference.action = (FeedMomentAction) nb5Var.l(FeedMomentAction.PROTOBUF_ADAPTER);
                }
            }
            return momentMessageReference;
        }

        public void serialize(MomentMessageReference momentMessageReference, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = momentMessageReference.type;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = momentMessageReference.f694id;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            FeedMomentAction feedMomentAction = momentMessageReference.action;
            if (feedMomentAction != null) {
                codedOutputByteBufferNano.G(3, feedMomentAction.ordinal());
            }
            FeedMomentAction feedMomentAction2 = momentMessageReference.action;
            if (feedMomentAction2 != null) {
                codedOutputByteBufferNano.K(4, feedMomentAction2, FeedMomentAction.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<MomentMessageReference> JSON_ADAPTER = new ObjectJsonAdapter<MomentMessageReference>() { // from class: com.p1.mobile.putong.feed.data.MomentMessageReference.2
        public Class getDataClass() {
            return MomentMessageReference.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public MomentMessageReference mo17830newInstance() {
            return new MomentMessageReference();
        }

        public boolean parseField(MomentMessageReference momentMessageReference, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "action":
                    momentMessageReference.action = (FeedMomentAction) FeedMomentAction.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "id":
                    momentMessageReference.f694id = jsonParser.getValueAsString();
                    return false;
                case "type":
                    momentMessageReference.type = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MomentMessageReference momentMessageReference, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "action":
                    return true;
                case "id":
                    return false;
                case "type":
                    return true;
                default:
                    return super.parseFieldCheck(momentMessageReference, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MomentMessageReference momentMessageReference, JsonGenerator jsonGenerator) throws IOException {
            String str = momentMessageReference.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
            String str2 = momentMessageReference.f694id;
            if (str2 != null) {
                jsonGenerator.writeStringField("id", str2);
            }
            if (momentMessageReference.action != null) {
                jsonGenerator.writeFieldName(Action.TYPE);
                FeedMomentAction.JSON_ADAPTER.serialize(momentMessageReference.action, jsonGenerator, true);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MomentMessageReference) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MomentMessageReference) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MomentMessageReference new_() {
        MomentMessageReference momentMessageReference = new MomentMessageReference();
        momentMessageReference.nullCheck();
        return momentMessageReference;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MomentMessageReference m19635clone() {
        MomentMessageReference momentMessageReference = new MomentMessageReference();
        momentMessageReference.type = this.type;
        momentMessageReference.f694id = this.f694id;
        momentMessageReference.action = this.action;
        return momentMessageReference;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MomentMessageReference)) {
            return false;
        }
        MomentMessageReference momentMessageReference = (MomentMessageReference) obj;
        return ValueObject.util_equals(this.type, momentMessageReference.type) && ValueObject.util_equals(this.f694id, momentMessageReference.f694id) && ValueObject.util_equals(this.action, momentMessageReference.action);
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
        String str = this.type;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.f694id;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        FeedMomentAction feedMomentAction = this.action;
        int iHashCode3 = iHashCode2 + (feedMomentAction != null ? feedMomentAction.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.type == null) {
            this.type = "";
        }
        if (this.f694id == null) {
            this.f694id = "";
        }
        if (this.action == null) {
            this.action = (FeedMomentAction) FeedMomentAction.JSON_ADAPTER.defaultEnum();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
