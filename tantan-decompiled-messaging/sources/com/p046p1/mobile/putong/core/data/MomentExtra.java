package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.MomentTag;
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
import java.util.List;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes10.dex */
public class MomentExtra extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "momentextra";

    @NonNull
    @ProtobufIndex(index = 1)
    public String momentId;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<MomentTag> tags;
    public static ProtobufAdapter<MomentExtra> PROTOBUF_ADAPTER = new MessageNanoAdapter<MomentExtra>() { // from class: com.p1.mobile.putong.core.data.MomentExtra.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MomentExtra momentExtra) {
            String str = momentExtra.momentId;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            List<MomentTag> list = momentExtra.tags;
            if (list != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(2, list, MomentTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            momentExtra.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MomentExtra parse(nb5 nb5Var) throws IOException {
            MomentExtra momentExtra = new MomentExtra();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (momentExtra.momentId == null) {
                        momentExtra.momentId = "";
                    }
                    if (momentExtra.tags != null) {
                        break;
                    }
                    momentExtra.tags = new ArrayList();
                    break;
                }
                if (iM158752u == 10) {
                    momentExtra.momentId = nb5Var.m158750s();
                } else {
                    if (iM158752u != 18) {
                        if (momentExtra.momentId == null) {
                            momentExtra.momentId = "";
                        }
                        if (momentExtra.tags != null) {
                            break;
                        }
                        momentExtra.tags = new ArrayList();
                        return momentExtra;
                    }
                    momentExtra.tags = (List) nb5Var.m158743l(MomentTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return momentExtra;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MomentExtra momentExtra, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = momentExtra.momentId;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            List<MomentTag> list = momentExtra.tags;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(2, list, MomentTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<MomentExtra> JSON_ADAPTER = new ObjectJsonAdapter<MomentExtra>() { // from class: com.p1.mobile.putong.core.data.MomentExtra.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MomentExtra.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MomentExtra newInstance() {
            return new MomentExtra();
        }

        public boolean parseField(MomentExtra momentExtra, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("momentId")) {
                momentExtra.momentId = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("tags")) {
                return false;
            }
            momentExtra.tags = JsonAdapter.parseArray(jsonParser, MomentTag.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(MomentExtra momentExtra, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("momentId") || str.equals("tags")) {
                return true;
            }
            return super.parseFieldCheck(momentExtra, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MomentExtra momentExtra, JsonGenerator jsonGenerator) throws IOException {
            String str = momentExtra.momentId;
            if (str != null) {
                jsonGenerator.writeStringField("momentId", str);
            }
            if (momentExtra.tags != null) {
                jsonGenerator.writeFieldName("tags");
                JsonAdapter.serializeArray(momentExtra.tags, jsonGenerator, MomentTag.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MomentExtra) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MomentExtra) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MomentExtra new_() {
        MomentExtra momentExtra = new MomentExtra();
        momentExtra.nullCheck();
        return momentExtra;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MomentExtra mo223809clone() {
        MomentExtra momentExtra = new MomentExtra();
        momentExtra.momentId = this.momentId;
        List<MomentTag> list = this.tags;
        if (list != null) {
            momentExtra.tags = ValueObject.util_map(list, new w9j() { // from class: l.ef00
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((MomentTag) obj).mo223809clone();
                }
            });
        }
        return momentExtra;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MomentExtra)) {
            return false;
        }
        MomentExtra momentExtra = (MomentExtra) obj;
        return ValueObject.util_equals(this.momentId, momentExtra.momentId) && ValueObject.util_equals(this.tags, momentExtra.tags);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "momentextra";
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.momentId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<MomentTag> list = this.tags;
        int iHashCode2 = iHashCode + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.momentId == null) {
            this.momentId = "";
        }
        if (this.tags == null) {
            this.tags = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
