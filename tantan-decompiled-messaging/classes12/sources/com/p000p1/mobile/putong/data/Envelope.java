package com.p000p1.mobile.putong.data;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
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
import java.util.Iterator;
import java.util.List;
import l.nb5;
import l.vwb;
import p007l.pp2;
import p007l.rpq;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Envelope envelope) {
            Meta meta = envelope.meta;
            int iL = meta != null ? CodedOutputByteBufferNano.l(1, meta, Meta.PROTOBUF_ADAPTER) : 0;
            Counter counter = envelope.counters;
            if (counter != null) {
                iL += CodedOutputByteBufferNano.l(2, counter, Counter.PROTOBUF_ADAPTER);
            }
            int iH = iL + CodedOutputByteBufferNano.h(3, envelope.localOptions);
            Data data = envelope.data;
            if (data != null) {
                iH += CodedOutputByteBufferNano.l(4, data, Data.PROTOBUF_ADAPTER);
            }
            Pagination pagination = envelope.pagination;
            if (pagination != null) {
                iH += CodedOutputByteBufferNano.l(5, pagination, Pagination.PROTOBUF_ADAPTER);
            }
            ((MessageNano) envelope).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Envelope m18022parse(nb5 nb5Var) throws IOException {
            Envelope envelope = new Envelope();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 10) {
                    envelope.meta = (Meta) nb5Var.l(Meta.PROTOBUF_ADAPTER);
                } else if (iU == 18) {
                    envelope.counters = (Counter) nb5Var.l(Counter.PROTOBUF_ADAPTER);
                } else if (iU == 24) {
                    envelope.localOptions = nb5Var.j();
                } else if (iU == 34) {
                    envelope.data = (Data) nb5Var.l(Data.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 42) {
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
                    envelope.pagination = (Pagination) nb5Var.l(Pagination.PROTOBUF_ADAPTER);
                }
            }
            return envelope;
        }

        public void serialize(Envelope envelope, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Meta meta = envelope.meta;
            if (meta != null) {
                codedOutputByteBufferNano.K(1, meta, Meta.PROTOBUF_ADAPTER);
            }
            Counter counter = envelope.counters;
            if (counter != null) {
                codedOutputByteBufferNano.K(2, counter, Counter.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.G(3, envelope.localOptions);
            Data data = envelope.data;
            if (data != null) {
                codedOutputByteBufferNano.K(4, data, Data.PROTOBUF_ADAPTER);
            }
            Pagination pagination = envelope.pagination;
            if (pagination != null) {
                codedOutputByteBufferNano.K(5, pagination, Pagination.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<Envelope> JSON_ADAPTER = new ObjectJsonAdapter<Envelope>() { // from class: com.p1.mobile.putong.data.Envelope.2
        public Class getDataClass() {
            return Envelope.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public Envelope mo17830newInstance() {
            return new Envelope();
        }

        public boolean parseField(Envelope envelope, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "counters":
                    envelope.counters = (Counter) Counter.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "data":
                    envelope.data = (Data) Data.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "meta":
                    envelope.meta = (Meta) Meta.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "pagination":
                    envelope.pagination = (Pagination) Pagination.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Envelope envelope, JsonGenerator jsonGenerator) throws IOException {
            if (envelope.meta != null) {
                jsonGenerator.writeFieldName(Meta.TYPE);
                Meta.JSON_ADAPTER.serialize(envelope.meta, jsonGenerator, true);
            }
            if (envelope.counters != null) {
                jsonGenerator.writeFieldName("counters");
                Counter.JSON_ADAPTER.serialize(envelope.counters, jsonGenerator, true);
            }
            jsonGenerator.writeNumberField("localOptions", envelope.localOptions);
            if (envelope.data != null) {
                jsonGenerator.writeFieldName(Data.TYPE);
                Data.JSON_ADAPTER.serialize(envelope.data, jsonGenerator, true);
            }
            if (envelope.pagination != null) {
                jsonGenerator.writeFieldName(Pagination.TYPE);
                Pagination.JSON_ADAPTER.serialize(envelope.pagination, jsonGenerator, true);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Envelope) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
        if (vwb.J(envelope.dataList)) {
            return;
        }
        for (BaseData baseData : envelope.dataList) {
            BaseData sameBase = getSameBase(baseData);
            if (sameBase != null) {
                sameBase.addAll(baseData);
            }
        }
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Envelope m18021clone() {
        Envelope envelope = new Envelope();
        Meta meta = this.meta;
        if (meta != null) {
            envelope.meta = meta.m18461clone();
        }
        Counter counter = this.counters;
        if (counter != null) {
            envelope.counters = counter.m17871clone();
        }
        envelope.localOptions = this.localOptions;
        Data data = this.data;
        if (data != null) {
            envelope.data = data.m17937clone();
        }
        Pagination pagination = this.pagination;
        if (pagination != null) {
            envelope.pagination = pagination.m18764clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public <T extends BaseData> T getModuleData(Class<T> cls) {
        if (!vwb.J(this.dataList)) {
            Iterator<BaseData> it = this.dataList.iterator();
            while (it.hasNext()) {
                T t = (ValueObject) it.next();
                if (cls.isInstance(t)) {
                    return t;
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
        if (vwb.J(this.dataList)) {
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
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

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

    public void onApiParseComplete() {
        Data data = this.data;
        if (data != null) {
            this.dataList = data.dataList;
        }
        if (!vwb.J(this.dataList)) {
            Iterator<BaseData> it = this.dataList.iterator();
            while (it.hasNext()) {
                it.next().nullCheck();
            }
        }
        ArrayList<pp2> arrayListM13946d = rpq.m13943b().m13946d();
        if (arrayListM13946d != null && arrayListM13946d.size() > 0) {
            Iterator<pp2> it2 = arrayListM13946d.iterator();
            while (it2.hasNext()) {
                it2.next().mo9060b(this);
            }
        }
        Iterator<ApiParseCompleteListener> it3 = listeners.iterator();
        while (it3.hasNext()) {
            it3.next().onComplete(this);
        }
    }

    public void setParsedApiRequest(String str) {
        super.setParsedApiRequest(str);
        this.requestLocalUrl = str;
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
