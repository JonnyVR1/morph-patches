package com.p051p1.mobile.putong.core.data;

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
import p153l.nc5;

/* JADX INFO: loaded from: classes10.dex */
public class ODiamondListFeedPick extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "odiamondlistfeedpick";

    @NonNull
    @ProtobufIndex(index = 1)
    public String picksTagType;

    @NonNull
    @ProtobufIndex(index = 2)
    public String picksTracker;
    public static ProtobufAdapter<ODiamondListFeedPick> PROTOBUF_ADAPTER = new MessageNanoAdapter<ODiamondListFeedPick>() { // from class: com.p1.mobile.putong.core.data.ODiamondListFeedPick.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ODiamondListFeedPick oDiamondListFeedPick) {
            String str = oDiamondListFeedPick.picksTagType;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = oDiamondListFeedPick.picksTracker;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            oDiamondListFeedPick.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ODiamondListFeedPick parse(nc5 nc5Var) throws IOException {
            ODiamondListFeedPick oDiamondListFeedPick = new ODiamondListFeedPick();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (oDiamondListFeedPick.picksTagType == null) {
                        oDiamondListFeedPick.picksTagType = "";
                    }
                    if (oDiamondListFeedPick.picksTracker != null) {
                        break;
                    }
                    oDiamondListFeedPick.picksTracker = "";
                    break;
                }
                if (iM162497u == 10) {
                    oDiamondListFeedPick.picksTagType = nc5Var.m162495s();
                } else {
                    if (iM162497u != 18) {
                        if (oDiamondListFeedPick.picksTagType == null) {
                            oDiamondListFeedPick.picksTagType = "";
                        }
                        if (oDiamondListFeedPick.picksTracker != null) {
                            break;
                        }
                        oDiamondListFeedPick.picksTracker = "";
                        return oDiamondListFeedPick;
                    }
                    oDiamondListFeedPick.picksTracker = nc5Var.m162495s();
                }
            }
            return oDiamondListFeedPick;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ODiamondListFeedPick oDiamondListFeedPick, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = oDiamondListFeedPick.picksTagType;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = oDiamondListFeedPick.picksTracker;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
        }
    };
    public static JsonAdapter<ODiamondListFeedPick> JSON_ADAPTER = new ObjectJsonAdapter<ODiamondListFeedPick>() { // from class: com.p1.mobile.putong.core.data.ODiamondListFeedPick.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ODiamondListFeedPick.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ODiamondListFeedPick newInstance() {
            return new ODiamondListFeedPick();
        }

        public boolean parseField(ODiamondListFeedPick oDiamondListFeedPick, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("picksTagType")) {
                oDiamondListFeedPick.picksTagType = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("picksTracker")) {
                return false;
            }
            oDiamondListFeedPick.picksTracker = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(ODiamondListFeedPick oDiamondListFeedPick, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("picksTagType") || str.equals("picksTracker")) {
                return true;
            }
            return super.parseFieldCheck(oDiamondListFeedPick, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ODiamondListFeedPick oDiamondListFeedPick, JsonGenerator jsonGenerator) throws IOException {
            String str = oDiamondListFeedPick.picksTagType;
            if (str != null) {
                jsonGenerator.writeStringField("picksTagType", str);
            }
            String str2 = oDiamondListFeedPick.picksTracker;
            if (str2 != null) {
                jsonGenerator.writeStringField("picksTracker", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ODiamondListFeedPick) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ODiamondListFeedPick) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ODiamondListFeedPick new_() {
        ODiamondListFeedPick oDiamondListFeedPick = new ODiamondListFeedPick();
        oDiamondListFeedPick.nullCheck();
        return oDiamondListFeedPick;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ODiamondListFeedPick mo225055clone() {
        ODiamondListFeedPick oDiamondListFeedPick = new ODiamondListFeedPick();
        oDiamondListFeedPick.picksTagType = this.picksTagType;
        oDiamondListFeedPick.picksTracker = this.picksTracker;
        return oDiamondListFeedPick;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ODiamondListFeedPick)) {
            return false;
        }
        ODiamondListFeedPick oDiamondListFeedPick = (ODiamondListFeedPick) obj;
        return ValueObject.util_equals(this.picksTagType, oDiamondListFeedPick.picksTagType) && ValueObject.util_equals(this.picksTracker, oDiamondListFeedPick.picksTracker);
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
        String str = this.picksTagType;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.picksTracker;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.picksTagType == null) {
            this.picksTagType = "";
        }
        if (this.picksTracker == null) {
            this.picksTracker = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
