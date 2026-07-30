package com.p046p1.mobile.putong.feed.data;

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

/* JADX INFO: loaded from: classes12.dex */
public class MomentMessageReference extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "momentmessagereference";

    @NonNull
    @ProtobufIndex(index = 3)
    public FeedMomentAction action;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 2)
    public String f39233id;

    @NonNull
    @ProtobufIndex(index = 1)
    public String type;
    public static ProtobufAdapter<MomentMessageReference> PROTOBUF_ADAPTER = new MessageNanoAdapter<MomentMessageReference>() { // from class: com.p1.mobile.putong.feed.data.MomentMessageReference.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MomentMessageReference momentMessageReference) {
            String str = momentMessageReference.type;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = momentMessageReference.f39233id;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            FeedMomentAction feedMomentAction = momentMessageReference.action;
            if (feedMomentAction != null) {
                iM17233o += CodedOutputByteBufferNano.m17226h(3, feedMomentAction.ordinal());
            }
            FeedMomentAction feedMomentAction2 = momentMessageReference.action;
            if (feedMomentAction2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(4, feedMomentAction2, FeedMomentAction.PROTOBUF_ADAPTER);
            }
            momentMessageReference.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MomentMessageReference parse(nb5 nb5Var) throws IOException {
            MomentMessageReference momentMessageReference = new MomentMessageReference();
            Integer numValueOf = null;
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (momentMessageReference.action == null && numValueOf != null) {
                        momentMessageReference.action = (FeedMomentAction) FeedMomentAction.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                    }
                    if (momentMessageReference.type == null) {
                        momentMessageReference.type = "";
                    }
                    if (momentMessageReference.f39233id == null) {
                        momentMessageReference.f39233id = "";
                    }
                    if (momentMessageReference.action != null) {
                        break;
                    }
                    momentMessageReference.action = (FeedMomentAction) FeedMomentAction.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iM158752u == 10) {
                    momentMessageReference.type = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    momentMessageReference.f39233id = nb5Var.m158750s();
                } else if (iM158752u == 24) {
                    numValueOf = Integer.valueOf(nb5Var.m158741j());
                } else {
                    if (iM158752u != 34) {
                        if (momentMessageReference.action == null && numValueOf != null) {
                            momentMessageReference.action = (FeedMomentAction) FeedMomentAction.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (momentMessageReference.type == null) {
                            momentMessageReference.type = "";
                        }
                        if (momentMessageReference.f39233id == null) {
                            momentMessageReference.f39233id = "";
                        }
                        if (momentMessageReference.action != null) {
                            break;
                        }
                        momentMessageReference.action = (FeedMomentAction) FeedMomentAction.JSON_ADAPTER.defaultEnum();
                        return momentMessageReference;
                    }
                    momentMessageReference.action = (FeedMomentAction) nb5Var.m158743l(FeedMomentAction.PROTOBUF_ADAPTER);
                }
            }
            return momentMessageReference;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MomentMessageReference momentMessageReference, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = momentMessageReference.type;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = momentMessageReference.f39233id;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            FeedMomentAction feedMomentAction = momentMessageReference.action;
            if (feedMomentAction != null) {
                codedOutputByteBufferNano.m17250G(3, feedMomentAction.ordinal());
            }
            FeedMomentAction feedMomentAction2 = momentMessageReference.action;
            if (feedMomentAction2 != null) {
                codedOutputByteBufferNano.m17254K(4, feedMomentAction2, FeedMomentAction.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<MomentMessageReference> JSON_ADAPTER = new ObjectJsonAdapter<MomentMessageReference>() { // from class: com.p1.mobile.putong.feed.data.MomentMessageReference.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MomentMessageReference.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MomentMessageReference newInstance() {
            return new MomentMessageReference();
        }

        public boolean parseField(MomentMessageReference momentMessageReference, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "action":
                    momentMessageReference.action = FeedMomentAction.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "id":
                    momentMessageReference.f39233id = jsonParser.getValueAsString();
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MomentMessageReference momentMessageReference, JsonGenerator jsonGenerator) throws IOException {
            String str = momentMessageReference.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
            String str2 = momentMessageReference.f39233id;
            if (str2 != null) {
                jsonGenerator.writeStringField("id", str2);
            }
            if (momentMessageReference.action != null) {
                jsonGenerator.writeFieldName("action");
                FeedMomentAction.JSON_ADAPTER.serialize(momentMessageReference.action, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MomentMessageReference) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MomentMessageReference) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MomentMessageReference new_() {
        MomentMessageReference momentMessageReference = new MomentMessageReference();
        momentMessageReference.nullCheck();
        return momentMessageReference;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MomentMessageReference mo223809clone() {
        MomentMessageReference momentMessageReference = new MomentMessageReference();
        momentMessageReference.type = this.type;
        momentMessageReference.f39233id = this.f39233id;
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
        return ValueObject.util_equals(this.type, momentMessageReference.type) && ValueObject.util_equals(this.f39233id, momentMessageReference.f39233id) && ValueObject.util_equals(this.action, momentMessageReference.action);
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
        String str = this.type;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.f39233id;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        FeedMomentAction feedMomentAction = this.action;
        int iHashCode3 = iHashCode2 + (feedMomentAction != null ? feedMomentAction.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.type == null) {
            this.type = "";
        }
        if (this.f39233id == null) {
            this.f39233id = "";
        }
        if (this.action == null) {
            this.action = (FeedMomentAction) FeedMomentAction.JSON_ADAPTER.defaultEnum();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
