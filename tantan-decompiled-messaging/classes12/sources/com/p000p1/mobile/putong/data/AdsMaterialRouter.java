package com.p000p1.mobile.putong.data;

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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class AdsMaterialRouter extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "adsmaterialrouter";

    @NonNull
    @ProtobufIndex(index = 1)
    public String full_mode;

    @NonNull
    @ProtobufIndex(index = 2)
    public String mode;
    public static ProtobufAdapter<AdsMaterialRouter> PROTOBUF_ADAPTER = new MessageNanoAdapter<AdsMaterialRouter>() { // from class: com.p1.mobile.putong.data.AdsMaterialRouter.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(AdsMaterialRouter adsMaterialRouter) {
            String str = adsMaterialRouter.full_mode;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = adsMaterialRouter.mode;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) adsMaterialRouter).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public AdsMaterialRouter m17662parse(nb5 nb5Var) throws IOException {
            AdsMaterialRouter adsMaterialRouter = new AdsMaterialRouter();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (adsMaterialRouter.full_mode == null) {
                        adsMaterialRouter.full_mode = "";
                    }
                    if (adsMaterialRouter.mode != null) {
                        break;
                    }
                    adsMaterialRouter.mode = "";
                    break;
                }
                if (iU == 10) {
                    adsMaterialRouter.full_mode = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (adsMaterialRouter.full_mode == null) {
                            adsMaterialRouter.full_mode = "";
                        }
                        if (adsMaterialRouter.mode != null) {
                            break;
                        }
                        adsMaterialRouter.mode = "";
                        return adsMaterialRouter;
                    }
                    adsMaterialRouter.mode = nb5Var.s();
                }
            }
            return adsMaterialRouter;
        }

        public void serialize(AdsMaterialRouter adsMaterialRouter, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = adsMaterialRouter.full_mode;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = adsMaterialRouter.mode;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<AdsMaterialRouter> JSON_ADAPTER = new ObjectJsonAdapter<AdsMaterialRouter>() { // from class: com.p1.mobile.putong.data.AdsMaterialRouter.2
        public Class getDataClass() {
            return AdsMaterialRouter.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public AdsMaterialRouter mo17830newInstance() {
            return new AdsMaterialRouter();
        }

        public boolean parseField(AdsMaterialRouter adsMaterialRouter, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("full_mode")) {
                adsMaterialRouter.full_mode = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("mode")) {
                return false;
            }
            adsMaterialRouter.mode = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(AdsMaterialRouter adsMaterialRouter, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("full_mode") || str.equals("mode")) {
                return true;
            }
            return super.parseFieldCheck(adsMaterialRouter, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AdsMaterialRouter adsMaterialRouter, JsonGenerator jsonGenerator) throws IOException {
            String str = adsMaterialRouter.full_mode;
            if (str != null) {
                jsonGenerator.writeStringField("full_mode", str);
            }
            String str2 = adsMaterialRouter.mode;
            if (str2 != null) {
                jsonGenerator.writeStringField("mode", str2);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AdsMaterialRouter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AdsMaterialRouter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AdsMaterialRouter new_() {
        AdsMaterialRouter adsMaterialRouter = new AdsMaterialRouter();
        adsMaterialRouter.nullCheck();
        return adsMaterialRouter;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AdsMaterialRouter m17661clone() {
        AdsMaterialRouter adsMaterialRouter = new AdsMaterialRouter();
        adsMaterialRouter.full_mode = this.full_mode;
        adsMaterialRouter.mode = this.mode;
        return adsMaterialRouter;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdsMaterialRouter)) {
            return false;
        }
        AdsMaterialRouter adsMaterialRouter = (AdsMaterialRouter) obj;
        return ValueObject.util_equals(this.full_mode, adsMaterialRouter.full_mode) && ValueObject.util_equals(this.mode, adsMaterialRouter.mode);
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
        String str = this.full_mode;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.mode;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.full_mode == null) {
            this.full_mode = "";
        }
        if (this.mode == null) {
            this.mode = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
