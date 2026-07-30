package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes12.dex */
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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(AdsMaterialRouter adsMaterialRouter) {
            String str = adsMaterialRouter.full_mode;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = adsMaterialRouter.mode;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            adsMaterialRouter.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AdsMaterialRouter parse(nb5 nb5Var) throws IOException {
            AdsMaterialRouter adsMaterialRouter = new AdsMaterialRouter();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (adsMaterialRouter.full_mode == null) {
                        adsMaterialRouter.full_mode = "";
                    }
                    if (adsMaterialRouter.mode != null) {
                        break;
                    }
                    adsMaterialRouter.mode = "";
                    break;
                }
                if (iM158752u == 10) {
                    adsMaterialRouter.full_mode = nb5Var.m158750s();
                } else {
                    if (iM158752u != 18) {
                        if (adsMaterialRouter.full_mode == null) {
                            adsMaterialRouter.full_mode = "";
                        }
                        if (adsMaterialRouter.mode != null) {
                            break;
                        }
                        adsMaterialRouter.mode = "";
                        return adsMaterialRouter;
                    }
                    adsMaterialRouter.mode = nb5Var.m158750s();
                }
            }
            return adsMaterialRouter;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AdsMaterialRouter adsMaterialRouter, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = adsMaterialRouter.full_mode;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = adsMaterialRouter.mode;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
        }
    };
    public static JsonAdapter<AdsMaterialRouter> JSON_ADAPTER = new ObjectJsonAdapter<AdsMaterialRouter>() { // from class: com.p1.mobile.putong.data.AdsMaterialRouter.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AdsMaterialRouter.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public AdsMaterialRouter newInstance() {
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AdsMaterialRouter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AdsMaterialRouter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AdsMaterialRouter new_() {
        AdsMaterialRouter adsMaterialRouter = new AdsMaterialRouter();
        adsMaterialRouter.nullCheck();
        return adsMaterialRouter;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public AdsMaterialRouter mo223809clone() {
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
        String str = this.full_mode;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.mode;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.full_mode == null) {
            this.full_mode = "";
        }
        if (this.mode == null) {
            this.mode = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
