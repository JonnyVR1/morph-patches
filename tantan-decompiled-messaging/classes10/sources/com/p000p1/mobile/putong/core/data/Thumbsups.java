package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.ThumbsupsRecords;
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
public class Thumbsups extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "thumbsups";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f183id;

    @Nullable
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public List<ThumbsupsRecords> records;
    public static ProtobufAdapter<Thumbsups> PROTOBUF_ADAPTER = new MessageNanoAdapter<Thumbsups>() { // from class: com.p1.mobile.putong.core.data.Thumbsups.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Thumbsups thumbsups) {
            String str = thumbsups.f183id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            List<ThumbsupsRecords> list = thumbsups.records;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(2, list, ThumbsupsRecords.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) thumbsups).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Thumbsups m15986parse(nb5 nb5Var) throws IOException {
            Thumbsups thumbsups = new Thumbsups();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (thumbsups.f183id != null) {
                        break;
                    }
                    thumbsups.f183id = "";
                    break;
                }
                if (iU == 10) {
                    thumbsups.f183id = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (thumbsups.f183id != null) {
                            break;
                        }
                        thumbsups.f183id = "";
                        return thumbsups;
                    }
                    thumbsups.records = (List) nb5Var.l(ThumbsupsRecords.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return thumbsups;
        }

        public void serialize(Thumbsups thumbsups, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = thumbsups.f183id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            List<ThumbsupsRecords> list = thumbsups.records;
            if (list != null) {
                codedOutputByteBufferNano.K(2, list, ThumbsupsRecords.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<Thumbsups> JSON_ADAPTER = new ObjectJsonAdapter<Thumbsups>() { // from class: com.p1.mobile.putong.core.data.Thumbsups.2
        public Class getDataClass() {
            return Thumbsups.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public Thumbsups m15987newInstance() {
            return new Thumbsups();
        }

        public boolean parseField(Thumbsups thumbsups, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("id")) {
                thumbsups.f183id = jsonParser.getValueAsString();
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

        public void serializeFields(Thumbsups thumbsups, JsonGenerator jsonGenerator) throws IOException {
            String str = thumbsups.f183id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (thumbsups.records != null) {
                jsonGenerator.writeFieldName("records");
                JsonAdapter.serializeArray(thumbsups.records, jsonGenerator, ThumbsupsRecords.JSON_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Thumbsups) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Thumbsups) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Thumbsups new_() {
        Thumbsups thumbsups = new Thumbsups();
        thumbsups.nullCheck();
        return thumbsups;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Thumbsups m15985clone() {
        Thumbsups thumbsups = new Thumbsups();
        thumbsups.f183id = this.f183id;
        List<ThumbsupsRecords> list = this.records;
        if (list != null) {
            thumbsups.records = ValueObject.util_map(list, new w9j() { // from class: l.bqi0
                public final Object call(Object obj) {
                    return ((ThumbsupsRecords) obj).m15989clone();
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
        return ValueObject.util_equals(this.f183id, thumbsups.f183id) && ValueObject.util_equals(this.records, thumbsups.records);
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
        String str = this.f183id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<ThumbsupsRecords> list = this.records;
        int iHashCode2 = iHashCode + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.f183id == null) {
            this.f183id = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
