package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.LiveTemplateData;
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
public class LiveTemplateData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "livetemplatedata";

    @NonNull
    @ProtobufIndex(index = 52)
    public List<String> fields;

    /* JADX INFO: renamed from: id */
    @ProtobufIndex(index = 51)
    public int f237id;
    public static ProtobufAdapter<LiveTemplateData> PROTOBUF_ADAPTER = new MessageNanoAdapter<LiveTemplateData>() { // from class: com.p1.mobile.putong.data.LiveTemplateData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(LiveTemplateData liveTemplateData) {
            int iH = CodedOutputByteBufferNano.h(51, liveTemplateData.f237id);
            List<String> list = liveTemplateData.fields;
            if (list != null) {
                iH += CodedOutputByteBufferNano.l(52, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) liveTemplateData).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public LiveTemplateData m18388parse(nb5 nb5Var) throws IOException {
            LiveTemplateData liveTemplateData = new LiveTemplateData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (liveTemplateData.fields != null) {
                        break;
                    }
                    liveTemplateData.fields = new ArrayList();
                    break;
                }
                if (iU == 408) {
                    liveTemplateData.f237id = nb5Var.j();
                } else {
                    if (iU != 418) {
                        if (liveTemplateData.fields != null) {
                            break;
                        }
                        liveTemplateData.fields = new ArrayList();
                        return liveTemplateData;
                    }
                    liveTemplateData.fields = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return liveTemplateData;
        }

        public void serialize(LiveTemplateData liveTemplateData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(51, liveTemplateData.f237id);
            List<String> list = liveTemplateData.fields;
            if (list != null) {
                codedOutputByteBufferNano.K(52, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<LiveTemplateData> JSON_ADAPTER = new ObjectJsonAdapter<LiveTemplateData>() { // from class: com.p1.mobile.putong.data.LiveTemplateData.2
        public Class getDataClass() {
            return LiveTemplateData.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public LiveTemplateData mo17830newInstance() {
            return new LiveTemplateData();
        }

        public boolean parseField(LiveTemplateData liveTemplateData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("fields")) {
                liveTemplateData.fields = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("id")) {
                return false;
            }
            liveTemplateData.f237id = jsonParser.getValueAsInt();
            return false;
        }

        public boolean parseFieldCheck(LiveTemplateData liveTemplateData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("fields")) {
                return true;
            }
            if (str.equals("id")) {
                return false;
            }
            return super.parseFieldCheck(liveTemplateData, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LiveTemplateData liveTemplateData, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("id", liveTemplateData.f237id);
            if (liveTemplateData.fields != null) {
                jsonGenerator.writeFieldName("fields");
                JsonAdapter.serializeArray(liveTemplateData.fields, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LiveTemplateData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LiveTemplateData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m760a(String str) {
        return str;
    }

    public static LiveTemplateData new_() {
        LiveTemplateData liveTemplateData = new LiveTemplateData();
        liveTemplateData.nullCheck();
        return liveTemplateData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public LiveTemplateData m18387clone() {
        LiveTemplateData liveTemplateData = new LiveTemplateData();
        liveTemplateData.f237id = this.f237id;
        List<String> list = this.fields;
        if (list != null) {
            liveTemplateData.fields = ValueObject.util_map(list, new w9j() { // from class: l.dbu
                public final Object call(Object obj) {
                    return LiveTemplateData.m760a((String) obj);
                }
            });
        }
        return liveTemplateData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LiveTemplateData)) {
            return false;
        }
        LiveTemplateData liveTemplateData = (LiveTemplateData) obj;
        return this.f237id == liveTemplateData.f237id && ValueObject.util_equals(this.fields, liveTemplateData.fields);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + this.f237id) * 41;
        List<String> list = this.fields;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.fields == null) {
            this.fields = new ArrayList();
        }
    }

    public LiveTemplateData subtract(LiveTemplateData liveTemplateData) {
        LiveTemplateData liveTemplateData2 = new LiveTemplateData();
        if (!ValueObject.util_equals(this.fields, liveTemplateData.fields)) {
            liveTemplateData2.fields = this.fields;
        }
        if (liveTemplateData2.equals(new LiveTemplateData())) {
            return null;
        }
        return liveTemplateData2;
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
