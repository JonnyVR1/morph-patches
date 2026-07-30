package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ODiamondListFeedPick extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "odiamondlistfeedpick";

    @NonNull
    @ProtobufIndex(index = 1)
    public String picksTagType;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String picksTracker;
    public static ProtobufAdapter<ODiamondListFeedPick> PROTOBUF_ADAPTER = new MessageNanoAdapter<ODiamondListFeedPick>() { // from class: com.p1.mobile.putong.core.data.ODiamondListFeedPick.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ODiamondListFeedPick oDiamondListFeedPick) {
            String str = oDiamondListFeedPick.picksTagType;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = oDiamondListFeedPick.picksTracker;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) oDiamondListFeedPick).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ODiamondListFeedPick m14599parse(nb5 nb5Var) throws IOException {
            ODiamondListFeedPick oDiamondListFeedPick = new ODiamondListFeedPick();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (oDiamondListFeedPick.picksTagType == null) {
                        oDiamondListFeedPick.picksTagType = "";
                    }
                    if (oDiamondListFeedPick.picksTracker != null) {
                        break;
                    }
                    oDiamondListFeedPick.picksTracker = "";
                    break;
                }
                if (iU == 10) {
                    oDiamondListFeedPick.picksTagType = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (oDiamondListFeedPick.picksTagType == null) {
                            oDiamondListFeedPick.picksTagType = "";
                        }
                        if (oDiamondListFeedPick.picksTracker != null) {
                            break;
                        }
                        oDiamondListFeedPick.picksTracker = "";
                        return oDiamondListFeedPick;
                    }
                    oDiamondListFeedPick.picksTracker = nb5Var.s();
                }
            }
            return oDiamondListFeedPick;
        }

        public void serialize(ODiamondListFeedPick oDiamondListFeedPick, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = oDiamondListFeedPick.picksTagType;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = oDiamondListFeedPick.picksTracker;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<ODiamondListFeedPick> JSON_ADAPTER = new ObjectJsonAdapter<ODiamondListFeedPick>() { // from class: com.p1.mobile.putong.core.data.ODiamondListFeedPick.2
        public Class getDataClass() {
            return ODiamondListFeedPick.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ODiamondListFeedPick m14600newInstance() {
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ODiamondListFeedPick) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ODiamondListFeedPick) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ODiamondListFeedPick new_() {
        ODiamondListFeedPick oDiamondListFeedPick = new ODiamondListFeedPick();
        oDiamondListFeedPick.nullCheck();
        return oDiamondListFeedPick;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ODiamondListFeedPick m14598clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.picksTagType;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.picksTracker;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.picksTagType == null) {
            this.picksTagType = "";
        }
        if (this.picksTracker == null) {
            this.picksTracker = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
