package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.Medal;
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
public class LiveMedals extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "livemedals";

    @NonNull
    @ProtobufIndex(index = 2)
    public List<Medal> medals;

    @NonNull
    @ProtobufIndex(index = 1)
    public String version;
    public static ProtobufAdapter<LiveMedals> PROTOBUF_ADAPTER = new MessageNanoAdapter<LiveMedals>() { // from class: com.p1.mobile.putong.data.LiveMedals.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(LiveMedals liveMedals) {
            String str = liveMedals.version;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            List<Medal> list = liveMedals.medals;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(2, list, Medal.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) liveMedals).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public LiveMedals m18349parse(nb5 nb5Var) throws IOException {
            LiveMedals liveMedals = new LiveMedals();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (liveMedals.version == null) {
                        liveMedals.version = "";
                    }
                    if (liveMedals.medals != null) {
                        break;
                    }
                    liveMedals.medals = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    liveMedals.version = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (liveMedals.version == null) {
                            liveMedals.version = "";
                        }
                        if (liveMedals.medals != null) {
                            break;
                        }
                        liveMedals.medals = new ArrayList();
                        return liveMedals;
                    }
                    liveMedals.medals = (List) nb5Var.l(Medal.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return liveMedals;
        }

        public void serialize(LiveMedals liveMedals, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = liveMedals.version;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            List<Medal> list = liveMedals.medals;
            if (list != null) {
                codedOutputByteBufferNano.K(2, list, Medal.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<LiveMedals> JSON_ADAPTER = new ObjectJsonAdapter<LiveMedals>() { // from class: com.p1.mobile.putong.data.LiveMedals.2
        public Class getDataClass() {
            return LiveMedals.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public LiveMedals mo17830newInstance() {
            return new LiveMedals();
        }

        public boolean parseField(LiveMedals liveMedals, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("medals")) {
                liveMedals.medals = JsonAdapter.parseArray(jsonParser, Medal.JSON_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("version")) {
                return false;
            }
            liveMedals.version = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(LiveMedals liveMedals, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("medals") || str.equals("version")) {
                return true;
            }
            return super.parseFieldCheck(liveMedals, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LiveMedals liveMedals, JsonGenerator jsonGenerator) throws IOException {
            String str = liveMedals.version;
            if (str != null) {
                jsonGenerator.writeStringField("version", str);
            }
            if (liveMedals.medals != null) {
                jsonGenerator.writeFieldName("medals");
                JsonAdapter.serializeArray(liveMedals.medals, jsonGenerator, Medal.JSON_ADAPTER);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LiveMedals) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LiveMedals) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LiveMedals new_() {
        LiveMedals liveMedals = new LiveMedals();
        liveMedals.nullCheck();
        return liveMedals;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public LiveMedals m18348clone() {
        LiveMedals liveMedals = new LiveMedals();
        liveMedals.version = this.version;
        List<Medal> list = this.medals;
        if (list != null) {
            liveMedals.medals = ValueObject.util_map(list, new w9j() { // from class: l.x1t
                public final Object call(Object obj) {
                    return ((Medal) obj).m18435clone();
                }
            });
        }
        return liveMedals;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LiveMedals)) {
            return false;
        }
        LiveMedals liveMedals = (LiveMedals) obj;
        return ValueObject.util_equals(this.version, liveMedals.version) && ValueObject.util_equals(this.medals, liveMedals.medals);
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
        String str = this.version;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<Medal> list = this.medals;
        int iHashCode2 = iHashCode + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.version == null) {
            this.version = "";
        }
        if (this.medals == null) {
            this.medals = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
