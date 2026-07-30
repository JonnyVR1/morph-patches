package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.InactivateReasonDetail;
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
public class InactivateReason extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "inactivatereason";

    @NonNull
    @ProtobufIndex(index = 1)
    public String key;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String name;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public List<InactivateReasonDetail> reasons;
    public static ProtobufAdapter<InactivateReason> PROTOBUF_ADAPTER = new MessageNanoAdapter<InactivateReason>() { // from class: com.p1.mobile.putong.core.data.InactivateReason.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(InactivateReason inactivateReason) {
            String str = inactivateReason.key;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = inactivateReason.name;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            List<InactivateReasonDetail> list = inactivateReason.reasons;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(3, list, InactivateReasonDetail.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) inactivateReason).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public InactivateReason m13449parse(nb5 nb5Var) throws IOException {
            InactivateReason inactivateReason = new InactivateReason();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (inactivateReason.key == null) {
                        inactivateReason.key = "";
                    }
                    if (inactivateReason.name == null) {
                        inactivateReason.name = "";
                    }
                    if (inactivateReason.reasons != null) {
                        break;
                    }
                    inactivateReason.reasons = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    inactivateReason.key = nb5Var.s();
                } else if (iU == 18) {
                    inactivateReason.name = nb5Var.s();
                } else {
                    if (iU != 26) {
                        if (inactivateReason.key == null) {
                            inactivateReason.key = "";
                        }
                        if (inactivateReason.name == null) {
                            inactivateReason.name = "";
                        }
                        if (inactivateReason.reasons != null) {
                            break;
                        }
                        inactivateReason.reasons = new ArrayList();
                        return inactivateReason;
                    }
                    inactivateReason.reasons = (List) nb5Var.l(InactivateReasonDetail.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return inactivateReason;
        }

        public void serialize(InactivateReason inactivateReason, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = inactivateReason.key;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = inactivateReason.name;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            List<InactivateReasonDetail> list = inactivateReason.reasons;
            if (list != null) {
                codedOutputByteBufferNano.K(3, list, InactivateReasonDetail.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<InactivateReason> JSON_ADAPTER = new ObjectJsonAdapter<InactivateReason>() { // from class: com.p1.mobile.putong.core.data.InactivateReason.2
        public Class getDataClass() {
            return InactivateReason.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public InactivateReason m13450newInstance() {
            return new InactivateReason();
        }

        public boolean parseField(InactivateReason inactivateReason, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "key":
                    inactivateReason.key = jsonParser.getValueAsString();
                    return true;
                case "name":
                    inactivateReason.name = jsonParser.getValueAsString();
                    return true;
                case "reasons":
                    inactivateReason.reasons = JsonAdapter.parseArray(jsonParser, InactivateReasonDetail.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(InactivateReason inactivateReason, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "key":
                case "name":
                case "reasons":
                    return true;
                default:
                    return super.parseFieldCheck(inactivateReason, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(InactivateReason inactivateReason, JsonGenerator jsonGenerator) throws IOException {
            String str = inactivateReason.key;
            if (str != null) {
                jsonGenerator.writeStringField("key", str);
            }
            String str2 = inactivateReason.name;
            if (str2 != null) {
                jsonGenerator.writeStringField("name", str2);
            }
            if (inactivateReason.reasons != null) {
                jsonGenerator.writeFieldName("reasons");
                JsonAdapter.serializeArray(inactivateReason.reasons, jsonGenerator, InactivateReasonDetail.JSON_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((InactivateReason) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((InactivateReason) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static InactivateReason new_() {
        InactivateReason inactivateReason = new InactivateReason();
        inactivateReason.nullCheck();
        return inactivateReason;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public InactivateReason m13448clone() {
        InactivateReason inactivateReason = new InactivateReason();
        inactivateReason.key = this.key;
        inactivateReason.name = this.name;
        List<InactivateReasonDetail> list = this.reasons;
        if (list != null) {
            inactivateReason.reasons = ValueObject.util_map(list, new w9j() { // from class: l.rqm
                public final Object call(Object obj) {
                    return ((InactivateReasonDetail) obj).m13452clone();
                }
            });
        }
        return inactivateReason;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InactivateReason)) {
            return false;
        }
        InactivateReason inactivateReason = (InactivateReason) obj;
        return ValueObject.util_equals(this.key, inactivateReason.key) && ValueObject.util_equals(this.name, inactivateReason.name) && ValueObject.util_equals(this.reasons, inactivateReason.reasons);
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
        String str = this.key;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<InactivateReasonDetail> list = this.reasons;
        int iHashCode3 = iHashCode2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.key == null) {
            this.key = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.reasons == null) {
            this.reasons = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
