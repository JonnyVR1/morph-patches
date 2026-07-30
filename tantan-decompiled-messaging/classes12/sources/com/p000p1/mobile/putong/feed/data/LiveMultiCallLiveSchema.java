package com.p000p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.OfficialAccountActionType;
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
public class LiveMultiCallLiveSchema extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "livemulticallliveschema";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f688id;

    @NonNull
    @ProtobufIndex(index = 3)
    public String schema;

    @NonNull
    @ProtobufIndex(index = 2)
    public String type;
    public static ProtobufAdapter<LiveMultiCallLiveSchema> PROTOBUF_ADAPTER = new MessageNanoAdapter<LiveMultiCallLiveSchema>() { // from class: com.p1.mobile.putong.feed.data.LiveMultiCallLiveSchema.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(LiveMultiCallLiveSchema liveMultiCallLiveSchema) {
            String str = liveMultiCallLiveSchema.f688id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = liveMultiCallLiveSchema.type;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = liveMultiCallLiveSchema.schema;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            ((MessageNano) liveMultiCallLiveSchema).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public LiveMultiCallLiveSchema m19563parse(nb5 nb5Var) throws IOException {
            LiveMultiCallLiveSchema liveMultiCallLiveSchema = new LiveMultiCallLiveSchema();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (liveMultiCallLiveSchema.f688id == null) {
                        liveMultiCallLiveSchema.f688id = "";
                    }
                    if (liveMultiCallLiveSchema.type == null) {
                        liveMultiCallLiveSchema.type = "";
                    }
                    if (liveMultiCallLiveSchema.schema != null) {
                        break;
                    }
                    liveMultiCallLiveSchema.schema = "";
                    break;
                }
                if (iU == 10) {
                    liveMultiCallLiveSchema.f688id = nb5Var.s();
                } else if (iU == 18) {
                    liveMultiCallLiveSchema.type = nb5Var.s();
                } else {
                    if (iU != 26) {
                        if (liveMultiCallLiveSchema.f688id == null) {
                            liveMultiCallLiveSchema.f688id = "";
                        }
                        if (liveMultiCallLiveSchema.type == null) {
                            liveMultiCallLiveSchema.type = "";
                        }
                        if (liveMultiCallLiveSchema.schema != null) {
                            break;
                        }
                        liveMultiCallLiveSchema.schema = "";
                        return liveMultiCallLiveSchema;
                    }
                    liveMultiCallLiveSchema.schema = nb5Var.s();
                }
            }
            return liveMultiCallLiveSchema;
        }

        public void serialize(LiveMultiCallLiveSchema liveMultiCallLiveSchema, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = liveMultiCallLiveSchema.f688id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = liveMultiCallLiveSchema.type;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = liveMultiCallLiveSchema.schema;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
        }
    };
    public static JsonAdapter<LiveMultiCallLiveSchema> JSON_ADAPTER = new ObjectJsonAdapter<LiveMultiCallLiveSchema>() { // from class: com.p1.mobile.putong.feed.data.LiveMultiCallLiveSchema.2
        public Class getDataClass() {
            return LiveMultiCallLiveSchema.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public LiveMultiCallLiveSchema mo17830newInstance() {
            return new LiveMultiCallLiveSchema();
        }

        public boolean parseField(LiveMultiCallLiveSchema liveMultiCallLiveSchema, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "schema":
                    liveMultiCallLiveSchema.schema = jsonParser.getValueAsString();
                    return true;
                case "id":
                    liveMultiCallLiveSchema.f688id = jsonParser.getValueAsString();
                    return false;
                case "type":
                    liveMultiCallLiveSchema.type = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(LiveMultiCallLiveSchema liveMultiCallLiveSchema, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "schema":
                    return true;
                case "id":
                    return false;
                case "type":
                    return true;
                default:
                    return super.parseFieldCheck(liveMultiCallLiveSchema, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LiveMultiCallLiveSchema liveMultiCallLiveSchema, JsonGenerator jsonGenerator) throws IOException {
            String str = liveMultiCallLiveSchema.f688id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = liveMultiCallLiveSchema.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
            String str3 = liveMultiCallLiveSchema.schema;
            if (str3 != null) {
                jsonGenerator.writeStringField(OfficialAccountActionType.schema, str3);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LiveMultiCallLiveSchema) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LiveMultiCallLiveSchema) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LiveMultiCallLiveSchema new_() {
        LiveMultiCallLiveSchema liveMultiCallLiveSchema = new LiveMultiCallLiveSchema();
        liveMultiCallLiveSchema.nullCheck();
        return liveMultiCallLiveSchema;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public LiveMultiCallLiveSchema m19562clone() {
        LiveMultiCallLiveSchema liveMultiCallLiveSchema = new LiveMultiCallLiveSchema();
        liveMultiCallLiveSchema.f688id = this.f688id;
        liveMultiCallLiveSchema.type = this.type;
        liveMultiCallLiveSchema.schema = this.schema;
        return liveMultiCallLiveSchema;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LiveMultiCallLiveSchema)) {
            return false;
        }
        LiveMultiCallLiveSchema liveMultiCallLiveSchema = (LiveMultiCallLiveSchema) obj;
        return ValueObject.util_equals(this.f688id, liveMultiCallLiveSchema.f688id) && ValueObject.util_equals(this.type, liveMultiCallLiveSchema.type) && ValueObject.util_equals(this.schema, liveMultiCallLiveSchema.schema);
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
        String str = this.f688id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.schema;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.f688id == null) {
            this.f688id = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.schema == null) {
            this.schema = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
