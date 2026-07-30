package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.MomentTag;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class MomentExtra extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "momentextra";

    @NonNull
    @ProtobufIndex(index = 1)
    public String momentId;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public List<MomentTag> tags;
    public static ProtobufAdapter<MomentExtra> PROTOBUF_ADAPTER = new MessageNanoAdapter<MomentExtra>() { // from class: com.p1.mobile.putong.core.data.MomentExtra.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MomentExtra momentExtra) {
            String str = momentExtra.momentId;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            List<MomentTag> list = momentExtra.tags;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(2, list, MomentTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) momentExtra).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MomentExtra m14337parse(nb5 nb5Var) throws IOException {
            MomentExtra momentExtra = new MomentExtra();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (momentExtra.momentId == null) {
                        momentExtra.momentId = "";
                    }
                    if (momentExtra.tags != null) {
                        break;
                    }
                    momentExtra.tags = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    momentExtra.momentId = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (momentExtra.momentId == null) {
                            momentExtra.momentId = "";
                        }
                        if (momentExtra.tags != null) {
                            break;
                        }
                        momentExtra.tags = new ArrayList();
                        return momentExtra;
                    }
                    momentExtra.tags = (List) nb5Var.l(MomentTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return momentExtra;
        }

        public void serialize(MomentExtra momentExtra, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = momentExtra.momentId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            List<MomentTag> list = momentExtra.tags;
            if (list != null) {
                codedOutputByteBufferNano.K(2, list, MomentTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<MomentExtra> JSON_ADAPTER = new ObjectJsonAdapter<MomentExtra>() { // from class: com.p1.mobile.putong.core.data.MomentExtra.2
        public Class getDataClass() {
            return MomentExtra.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public MomentExtra m14338newInstance() {
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MomentExtra) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MomentExtra) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MomentExtra new_() {
        MomentExtra momentExtra = new MomentExtra();
        momentExtra.nullCheck();
        return momentExtra;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MomentExtra m14336clone() {
        MomentExtra momentExtra = new MomentExtra();
        momentExtra.momentId = this.momentId;
        List<MomentTag> list = this.tags;
        if (list != null) {
            momentExtra.tags = ValueObject.util_map(list, new w9j() { // from class: l.ef00
                public final Object call(Object obj) {
                    return ((MomentTag) obj).m14340clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.momentId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<MomentTag> list = this.tags;
        int iHashCode2 = iHashCode + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.momentId == null) {
            this.momentId = "";
        }
        if (this.tags == null) {
            this.tags = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
