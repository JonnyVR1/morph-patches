package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.GreetingItem;
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
public class FateRadarGreeting extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "fateradargreeting";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public List<GreetingItem> items;

    @NonNull
    @ProtobufIndex(index = 1)
    public String option;
    public static ProtobufAdapter<FateRadarGreeting> PROTOBUF_ADAPTER = new MessageNanoAdapter<FateRadarGreeting>() { // from class: com.p1.mobile.putong.core.data.FateRadarGreeting.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(FateRadarGreeting fateRadarGreeting) {
            String str = fateRadarGreeting.option;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            List<GreetingItem> list = fateRadarGreeting.items;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(2, list, GreetingItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) fateRadarGreeting).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public FateRadarGreeting m12745parse(nb5 nb5Var) throws IOException {
            FateRadarGreeting fateRadarGreeting = new FateRadarGreeting();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (fateRadarGreeting.option == null) {
                        fateRadarGreeting.option = "";
                    }
                    if (fateRadarGreeting.items != null) {
                        break;
                    }
                    fateRadarGreeting.items = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    fateRadarGreeting.option = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (fateRadarGreeting.option == null) {
                            fateRadarGreeting.option = "";
                        }
                        if (fateRadarGreeting.items != null) {
                            break;
                        }
                        fateRadarGreeting.items = new ArrayList();
                        return fateRadarGreeting;
                    }
                    fateRadarGreeting.items = (List) nb5Var.l(GreetingItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return fateRadarGreeting;
        }

        public void serialize(FateRadarGreeting fateRadarGreeting, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = fateRadarGreeting.option;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            List<GreetingItem> list = fateRadarGreeting.items;
            if (list != null) {
                codedOutputByteBufferNano.K(2, list, GreetingItem.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<FateRadarGreeting> JSON_ADAPTER = new ObjectJsonAdapter<FateRadarGreeting>() { // from class: com.p1.mobile.putong.core.data.FateRadarGreeting.2
        public Class getDataClass() {
            return FateRadarGreeting.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public FateRadarGreeting m12746newInstance() {
            return new FateRadarGreeting();
        }

        public boolean parseField(FateRadarGreeting fateRadarGreeting, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(Option.TYPE)) {
                fateRadarGreeting.option = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("items")) {
                return false;
            }
            fateRadarGreeting.items = JsonAdapter.parseArray(jsonParser, GreetingItem.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(FateRadarGreeting fateRadarGreeting, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(Option.TYPE) || str.equals("items")) {
                return true;
            }
            return super.parseFieldCheck(fateRadarGreeting, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(FateRadarGreeting fateRadarGreeting, JsonGenerator jsonGenerator) throws IOException {
            String str = fateRadarGreeting.option;
            if (str != null) {
                jsonGenerator.writeStringField(Option.TYPE, str);
            }
            if (fateRadarGreeting.items != null) {
                jsonGenerator.writeFieldName("items");
                JsonAdapter.serializeArray(fateRadarGreeting.items, jsonGenerator, GreetingItem.JSON_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FateRadarGreeting) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FateRadarGreeting) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FateRadarGreeting new_() {
        FateRadarGreeting fateRadarGreeting = new FateRadarGreeting();
        fateRadarGreeting.nullCheck();
        return fateRadarGreeting;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public FateRadarGreeting m12744clone() {
        FateRadarGreeting fateRadarGreeting = new FateRadarGreeting();
        fateRadarGreeting.option = this.option;
        List<GreetingItem> list = this.items;
        if (list != null) {
            fateRadarGreeting.items = ValueObject.util_map(list, new w9j() { // from class: l.ujg
                public final Object call(Object obj) {
                    return ((GreetingItem) obj).m13032clone();
                }
            });
        }
        return fateRadarGreeting;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FateRadarGreeting)) {
            return false;
        }
        FateRadarGreeting fateRadarGreeting = (FateRadarGreeting) obj;
        return ValueObject.util_equals(this.option, fateRadarGreeting.option) && ValueObject.util_equals(this.items, fateRadarGreeting.items);
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
        String str = this.option;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<GreetingItem> list = this.items;
        int iHashCode2 = iHashCode + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.option == null) {
            this.option = "";
        }
        if (this.items == null) {
            this.items = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
