package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.IceBreaking;
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

/* JADX INFO: loaded from: classes12.dex */
public class BizAnswers extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "bizanswers";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<IceBreaking> iceBreaking;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<IceBreaking> mate;
    public static ProtobufAdapter<BizAnswers> PROTOBUF_ADAPTER = new MessageNanoAdapter<BizAnswers>() { // from class: com.p1.mobile.putong.data.BizAnswers.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(BizAnswers bizAnswers) {
            List<IceBreaking> list = bizAnswers.iceBreaking;
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, list, IceBreaking.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<IceBreaking> list2 = bizAnswers.mate;
            if (list2 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, list2, IceBreaking.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            bizAnswers.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public BizAnswers parse(nb5 nb5Var) throws IOException {
            BizAnswers bizAnswers = new BizAnswers();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (bizAnswers.iceBreaking == null) {
                        bizAnswers.iceBreaking = new ArrayList();
                    }
                    if (bizAnswers.mate != null) {
                        break;
                    }
                    bizAnswers.mate = new ArrayList();
                    break;
                }
                if (iM158752u == 10) {
                    bizAnswers.iceBreaking = (List) nb5Var.m158743l(IceBreaking.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM158752u != 18) {
                        if (bizAnswers.iceBreaking == null) {
                            bizAnswers.iceBreaking = new ArrayList();
                        }
                        if (bizAnswers.mate != null) {
                            break;
                        }
                        bizAnswers.mate = new ArrayList();
                        return bizAnswers;
                    }
                    bizAnswers.mate = (List) nb5Var.m158743l(IceBreaking.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return bizAnswers;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(BizAnswers bizAnswers, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<IceBreaking> list = bizAnswers.iceBreaking;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, IceBreaking.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<IceBreaking> list2 = bizAnswers.mate;
            if (list2 != null) {
                codedOutputByteBufferNano.m17254K(2, list2, IceBreaking.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<BizAnswers> JSON_ADAPTER = new ObjectJsonAdapter<BizAnswers>() { // from class: com.p1.mobile.putong.data.BizAnswers.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BizAnswers.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BizAnswers newInstance() {
            return new BizAnswers();
        }

        public boolean parseField(BizAnswers bizAnswers, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("mate")) {
                bizAnswers.mate = JsonAdapter.parseArray(jsonParser, IceBreaking.JSON_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("iceBreaking")) {
                return false;
            }
            bizAnswers.iceBreaking = JsonAdapter.parseArray(jsonParser, IceBreaking.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(BizAnswers bizAnswers, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("mate") || str.equals("iceBreaking")) {
                return true;
            }
            return super.parseFieldCheck(bizAnswers, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BizAnswers bizAnswers, JsonGenerator jsonGenerator) throws IOException {
            if (bizAnswers.iceBreaking != null) {
                jsonGenerator.writeFieldName("iceBreaking");
                JsonAdapter.serializeArray(bizAnswers.iceBreaking, jsonGenerator, IceBreaking.JSON_ADAPTER);
            }
            if (bizAnswers.mate != null) {
                jsonGenerator.writeFieldName("mate");
                JsonAdapter.serializeArray(bizAnswers.mate, jsonGenerator, IceBreaking.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((BizAnswers) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BizAnswers) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static BizAnswers new_() {
        BizAnswers bizAnswers = new BizAnswers();
        bizAnswers.nullCheck();
        return bizAnswers;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BizAnswers mo223809clone() {
        BizAnswers bizAnswers = new BizAnswers();
        List<IceBreaking> list = this.iceBreaking;
        if (list != null) {
            bizAnswers.iceBreaking = ValueObject.util_map(list, new w9j() { // from class: l.b33
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((IceBreaking) obj).mo223809clone();
                }
            });
        }
        List<IceBreaking> list2 = this.mate;
        if (list2 != null) {
            bizAnswers.mate = ValueObject.util_map(list2, new w9j() { // from class: l.c33
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((IceBreaking) obj).mo223809clone();
                }
            });
        }
        return bizAnswers;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BizAnswers)) {
            return false;
        }
        BizAnswers bizAnswers = (BizAnswers) obj;
        return ValueObject.util_equals(this.iceBreaking, bizAnswers.iceBreaking) && ValueObject.util_equals(this.mate, bizAnswers.mate);
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
        List<IceBreaking> list = this.iceBreaking;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<IceBreaking> list2 = this.mate;
        int iHashCode2 = iHashCode + (list2 != null ? list2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.iceBreaking == null) {
            this.iceBreaking = new ArrayList();
        }
        if (this.mate == null) {
            this.mate = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
