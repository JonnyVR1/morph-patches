package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.IceBreaking;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(BizAnswers bizAnswers) {
            List<IceBreaking> list = bizAnswers.iceBreaking;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, IceBreaking.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<IceBreaking> list2 = bizAnswers.mate;
            if (list2 != null) {
                iL += CodedOutputByteBufferNano.l(2, list2, IceBreaking.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) bizAnswers).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public BizAnswers m17775parse(nb5 nb5Var) throws IOException {
            BizAnswers bizAnswers = new BizAnswers();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (bizAnswers.iceBreaking == null) {
                        bizAnswers.iceBreaking = new ArrayList();
                    }
                    if (bizAnswers.mate != null) {
                        break;
                    }
                    bizAnswers.mate = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    bizAnswers.iceBreaking = (List) nb5Var.l(IceBreaking.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 18) {
                        if (bizAnswers.iceBreaking == null) {
                            bizAnswers.iceBreaking = new ArrayList();
                        }
                        if (bizAnswers.mate != null) {
                            break;
                        }
                        bizAnswers.mate = new ArrayList();
                        return bizAnswers;
                    }
                    bizAnswers.mate = (List) nb5Var.l(IceBreaking.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return bizAnswers;
        }

        public void serialize(BizAnswers bizAnswers, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<IceBreaking> list = bizAnswers.iceBreaking;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, IceBreaking.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<IceBreaking> list2 = bizAnswers.mate;
            if (list2 != null) {
                codedOutputByteBufferNano.K(2, list2, IceBreaking.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<BizAnswers> JSON_ADAPTER = new ObjectJsonAdapter<BizAnswers>() { // from class: com.p1.mobile.putong.data.BizAnswers.2
        public Class getDataClass() {
            return BizAnswers.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public BizAnswers mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((BizAnswers) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BizAnswers) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static BizAnswers new_() {
        BizAnswers bizAnswers = new BizAnswers();
        bizAnswers.nullCheck();
        return bizAnswers;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public BizAnswers m17774clone() {
        BizAnswers bizAnswers = new BizAnswers();
        List<IceBreaking> list = this.iceBreaking;
        if (list != null) {
            bizAnswers.iceBreaking = ValueObject.util_map(list, new w9j() { // from class: l.b33
                public final Object call(Object obj) {
                    return ((IceBreaking) obj).m18201clone();
                }
            });
        }
        List<IceBreaking> list2 = this.mate;
        if (list2 != null) {
            bizAnswers.mate = ValueObject.util_map(list2, new w9j() { // from class: l.c33
                public final Object call(Object obj) {
                    return ((IceBreaking) obj).m18201clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        List<IceBreaking> list = this.iceBreaking;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<IceBreaking> list2 = this.mate;
        int iHashCode2 = iHashCode + (list2 != null ? list2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.iceBreaking == null) {
            this.iceBreaking = new ArrayList();
        }
        if (this.mate == null) {
            this.mate = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
