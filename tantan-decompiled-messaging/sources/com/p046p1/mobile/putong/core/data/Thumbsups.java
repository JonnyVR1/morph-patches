package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.ThumbsupsRecords;
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
public class Thumbsups extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "thumbsups";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f20521id;

    @Nullable
    @ProtobufIndex(index = 2)
    public List<ThumbsupsRecords> records;
    public static ProtobufAdapter<Thumbsups> PROTOBUF_ADAPTER = new MessageNanoAdapter<Thumbsups>() { // from class: com.p1.mobile.putong.core.data.Thumbsups.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Thumbsups thumbsups) {
            String str = thumbsups.f20521id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            List<ThumbsupsRecords> list = thumbsups.records;
            if (list != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(2, list, ThumbsupsRecords.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            thumbsups.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Thumbsups parse(nb5 nb5Var) throws IOException {
            Thumbsups thumbsups = new Thumbsups();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (thumbsups.f20521id != null) {
                        break;
                    }
                    thumbsups.f20521id = "";
                    break;
                }
                if (iM158752u == 10) {
                    thumbsups.f20521id = nb5Var.m158750s();
                } else {
                    if (iM158752u != 18) {
                        if (thumbsups.f20521id != null) {
                            break;
                        }
                        thumbsups.f20521id = "";
                        return thumbsups;
                    }
                    thumbsups.records = (List) nb5Var.m158743l(ThumbsupsRecords.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return thumbsups;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Thumbsups thumbsups, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = thumbsups.f20521id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            List<ThumbsupsRecords> list = thumbsups.records;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(2, list, ThumbsupsRecords.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<Thumbsups> JSON_ADAPTER = new ObjectJsonAdapter<Thumbsups>() { // from class: com.p1.mobile.putong.core.data.Thumbsups.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Thumbsups.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Thumbsups newInstance() {
            return new Thumbsups();
        }

        public boolean parseField(Thumbsups thumbsups, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("id")) {
                thumbsups.f20521id = jsonParser.getValueAsString();
                return false;
            }
            if (!str.equals("records")) {
                return false;
            }
            thumbsups.records = JsonAdapter.parseArray(jsonParser, ThumbsupsRecords.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(Thumbsups thumbsups, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("id")) {
                return false;
            }
            if (str.equals("records")) {
                return true;
            }
            return super.parseFieldCheck(thumbsups, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Thumbsups thumbsups, JsonGenerator jsonGenerator) throws IOException {
            String str = thumbsups.f20521id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (thumbsups.records != null) {
                jsonGenerator.writeFieldName("records");
                JsonAdapter.serializeArray(thumbsups.records, jsonGenerator, ThumbsupsRecords.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Thumbsups) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Thumbsups) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Thumbsups new_() {
        Thumbsups thumbsups = new Thumbsups();
        thumbsups.nullCheck();
        return thumbsups;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Thumbsups mo223809clone() {
        Thumbsups thumbsups = new Thumbsups();
        thumbsups.f20521id = this.f20521id;
        List<ThumbsupsRecords> list = this.records;
        if (list != null) {
            thumbsups.records = ValueObject.util_map(list, new w9j() { // from class: l.bqi0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((ThumbsupsRecords) obj).mo223809clone();
                }
            });
        }
        return thumbsups;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Thumbsups)) {
            return false;
        }
        Thumbsups thumbsups = (Thumbsups) obj;
        return ValueObject.util_equals(this.f20521id, thumbsups.f20521id) && ValueObject.util_equals(this.records, thumbsups.records);
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
        String str = this.f20521id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<ThumbsupsRecords> list = this.records;
        int iHashCode2 = iHashCode + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f20521id == null) {
            this.f20521id = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
