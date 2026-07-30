package com.p051p1.mobile.putong.data;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import java.util.Iterator;
import java.util.List;
import p153l.gq2;
import p153l.jyb;
import p153l.nc5;
import p153l.rrq;

/* JADX INFO: loaded from: classes12.dex */
public class Envelope extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "envelope";

    @NonNull
    @ProtobufIndex(index = 2)
    public Counter counters;

    @NonNull
    @ProtobufIndex(index = 4)
    public Data data;
    public ArrayList<BaseData> dataList;

    @ProtobufIndex(index = 3)
    public int localOptions;

    @NonNull
    @ProtobufIndex(index = 1)
    public Meta meta;

    @NonNull
    @ProtobufIndex(index = 5)
    public Pagination pagination;
    public String requestLocalUrl;
    public static List<ApiParseCompleteListener> listeners = new ArrayList();
    public static ProtobufAdapter<Envelope> PROTOBUF_ADAPTER = new MessageNanoAdapter<Envelope>() { // from class: com.p1.mobile.putong.data.Envelope.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Envelope envelope) {
            Meta meta = envelope.meta;
            int iM17285l = meta != null ? CodedOutputByteBufferNano.m17285l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            Counter counter = envelope.counters;
            if (counter != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, counter, Counter.PROTOBUF_ADAPTER);
            }
            int iM17281h = iM17285l + CodedOutputByteBufferNano.m17281h(3, envelope.localOptions);
            Data data = envelope.data;
            if (data != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(4, data, Data.PROTOBUF_ADAPTER);
            }
            Pagination pagination = envelope.pagination;
            if (pagination != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(5, pagination, Pagination.PROTOBUF_ADAPTER);
            }
            envelope.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Envelope parse(nc5 nc5Var) throws IOException {
            Envelope envelope = new Envelope();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (envelope.meta == null) {
                        envelope.meta = Meta.new_();
                    }
                    if (envelope.counters == null) {
                        envelope.counters = Counter.new_();
                    }
                    if (envelope.data == null) {
                        envelope.data = Data.new_();
                    }
                    if (envelope.pagination != null) {
                        break;
                    }
                    envelope.pagination = Pagination.new_();
                    break;
                }
                if (iM162497u == 10) {
                    envelope.meta = (Meta) nc5Var.m162488l(Meta.PROTOBUF_ADAPTER);
                } else if (iM162497u == 18) {
                    envelope.counters = (Counter) nc5Var.m162488l(Counter.PROTOBUF_ADAPTER);
                } else if (iM162497u == 24) {
                    envelope.localOptions = nc5Var.m162486j();
                } else if (iM162497u == 34) {
                    envelope.data = (Data) nc5Var.m162488l(Data.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 42) {
                        if (envelope.meta == null) {
                            envelope.meta = Meta.new_();
                        }
                        if (envelope.counters == null) {
                            envelope.counters = Counter.new_();
                        }
                        if (envelope.data == null) {
                            envelope.data = Data.new_();
                        }
                        if (envelope.pagination != null) {
                            break;
                        }
                        envelope.pagination = Pagination.new_();
                        return envelope;
                    }
                    envelope.pagination = (Pagination) nc5Var.m162488l(Pagination.PROTOBUF_ADAPTER);
                }
            }
            return envelope;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Envelope envelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = envelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.m17309K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            Counter counter = envelope.counters;
            if (counter != null) {
                codedOutputByteBufferNano.m17309K(2, counter, Counter.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17305G(3, envelope.localOptions);
            Data data = envelope.data;
            if (data != null) {
                codedOutputByteBufferNano.m17309K(4, data, Data.PROTOBUF_ADAPTER);
            }
            Pagination pagination = envelope.pagination;
            if (pagination != null) {
                codedOutputByteBufferNano.m17309K(5, pagination, Pagination.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<Envelope> JSON_ADAPTER = new ObjectJsonAdapter<Envelope>() { // from class: com.p1.mobile.putong.data.Envelope.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Envelope.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Envelope newInstance() {
            return new Envelope();
        }

        public boolean parseField(Envelope envelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "counters":
                    envelope.counters = Counter.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "data":
                    envelope.data = Data.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "meta":
                    envelope.meta = Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "pagination":
                    envelope.pagination = Pagination.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "localOptions":
                    envelope.localOptions = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(Envelope envelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "counters":
                case "data":
                case "meta":
                case "pagination":
                case "localOptions":
                    return true;
                default:
                    return super.parseFieldCheck(envelope, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Envelope envelope, JsonGenerator jsonGenerator) throws IOException {
            if (envelope.meta != null) {
                jsonGenerator.writeFieldName("meta");
                Meta.JSON_ADAPTER.serialize(envelope.meta, jsonGenerator, true);
            }
            if (envelope.counters != null) {
                jsonGenerator.writeFieldName("counters");
                Counter.JSON_ADAPTER.serialize(envelope.counters, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("localOptions", envelope.localOptions);
            if (envelope.data != null) {
                jsonGenerator.writeFieldName("data");
                Data.JSON_ADAPTER.serialize(envelope.data, jsonGenerator, true);
            }
            if (envelope.pagination != null) {
                jsonGenerator.writeFieldName(Pagination.TYPE);
                Pagination.JSON_ADAPTER.serialize(envelope.pagination, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Envelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Envelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public interface ApiParseCompleteListener {
        void onComplete(Envelope envelope);
    }

    public static Envelope new_() {
        Envelope envelope = new Envelope();
        envelope.nullCheck();
        return envelope;
    }

    public static void registerApiParseCompleteListener(ApiParseCompleteListener apiParseCompleteListener) {
        if (listeners.contains(apiParseCompleteListener)) {
            return;
        }
        listeners.add(apiParseCompleteListener);
    }

    public static void unregisterApiParseCompleteListener(ApiParseCompleteListener apiParseCompleteListener) {
        listeners.remove(apiParseCompleteListener);
    }

    public void addAll(Envelope envelope) {
        if (jyb.m147479J(envelope.dataList)) {
            return;
        }
        for (BaseData baseData : envelope.dataList) {
            BaseData sameBase = getSameBase(baseData);
            if (sameBase != null) {
                sameBase.addAll(baseData);
            }
        }
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Envelope mo225055clone() {
        Envelope envelope = new Envelope();
        Meta meta = this.meta;
        if (meta != null) {
            envelope.meta = meta.mo225055clone();
        }
        Counter counter = this.counters;
        if (counter != null) {
            envelope.counters = counter.mo225055clone();
        }
        envelope.localOptions = this.localOptions;
        Data data = this.data;
        if (data != null) {
            envelope.data = data.mo225055clone();
        }
        Pagination pagination = this.pagination;
        if (pagination != null) {
            envelope.pagination = pagination.mo225055clone();
        }
        return envelope;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Envelope)) {
            return false;
        }
        Envelope envelope = (Envelope) obj;
        return ValueObject.util_equals(this.meta, envelope.meta) && ValueObject.util_equals(this.counters, envelope.counters) && this.localOptions == envelope.localOptions && ValueObject.util_equals(this.data, envelope.data) && ValueObject.util_equals(this.pagination, envelope.pagination);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public <T extends BaseData> T getModuleData(Class<T> cls) {
        if (!jyb.m147479J(this.dataList)) {
            for (BaseData baseData : this.dataList) {
                if (cls.isInstance(baseData)) {
                    return (T) baseData;
                }
            }
        }
        try {
            T tNewInstance = cls.newInstance();
            try {
                tNewInstance.nullCheck();
                return tNewInstance;
            } catch (Exception unused) {
                return tNewInstance;
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    public BaseData getSameBase(BaseData baseData) {
        if (jyb.m147479J(this.dataList)) {
            return null;
        }
        for (BaseData baseData2 : this.dataList) {
            if (TextUtils.equals(baseData2.getClassParseName(), baseData.getClassParseName())) {
                return baseData2;
            }
        }
        return null;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        Meta meta = this.meta;
        int iHashCode = (i2 + (meta != null ? meta.hashCode() : 0)) * 41;
        Counter counter = this.counters;
        int iHashCode2 = (((iHashCode + (counter != null ? counter.hashCode() : 0)) * 41) + this.localOptions) * 41;
        Data data = this.data;
        int iHashCode3 = (iHashCode2 + (data != null ? data.hashCode() : 0)) * 41;
        Pagination pagination = this.pagination;
        int iHashCode4 = iHashCode3 + (pagination != null ? pagination.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.meta == null) {
            this.meta = Meta.new_();
        }
        if (this.counters == null) {
            this.counters = Counter.new_();
        }
        if (this.data == null) {
            this.data = Data.new_();
        }
        if (this.pagination == null) {
            this.pagination = Pagination.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void onApiParseComplete() {
        Data data = this.data;
        if (data != null) {
            this.dataList = data.dataList;
        }
        if (!jyb.m147479J(this.dataList)) {
            Iterator<BaseData> it = this.dataList.iterator();
            while (it.hasNext()) {
                it.next().nullCheck();
            }
        }
        ArrayList<gq2> arrayListM182818d = rrq.m182815b().m182818d();
        if (arrayListM182818d != null && arrayListM182818d.size() > 0) {
            Iterator<gq2> it2 = arrayListM182818d.iterator();
            while (it2.hasNext()) {
                it2.next().mo131339b(this);
            }
        }
        Iterator<ApiParseCompleteListener> it3 = listeners.iterator();
        while (it3.hasNext()) {
            it3.next().onComplete(this);
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void setParsedApiRequest(String str) {
        super.setParsedApiRequest(str);
        this.requestLocalUrl = str;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
