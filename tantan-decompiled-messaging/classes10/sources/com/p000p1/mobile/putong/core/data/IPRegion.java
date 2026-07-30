package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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
public class IPRegion extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "ipregion";

    @Nullable
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String city;

    @Nullable
    @ProtobufIndex(index = 4)
    public String country;

    @Nullable
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String district;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f80id;

    @Nullable
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String province;
    public static ProtobufAdapter<IPRegion> PROTOBUF_ADAPTER = new MessageNanoAdapter<IPRegion>() { // from class: com.p1.mobile.putong.core.data.IPRegion.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(IPRegion iPRegion) {
            String str = iPRegion.f80id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = iPRegion.district;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = iPRegion.city;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = iPRegion.country;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            String str5 = iPRegion.province;
            if (str5 != null) {
                iO += CodedOutputByteBufferNano.o(5, str5);
            }
            ((MessageNano) iPRegion).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public IPRegion m13353parse(nb5 nb5Var) throws IOException {
            IPRegion iPRegion = new IPRegion();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (iPRegion.f80id != null) {
                        break;
                    }
                    iPRegion.f80id = "";
                    break;
                }
                if (iU == 10) {
                    iPRegion.f80id = nb5Var.s();
                } else if (iU == 18) {
                    iPRegion.district = nb5Var.s();
                } else if (iU == 26) {
                    iPRegion.city = nb5Var.s();
                } else if (iU == 34) {
                    iPRegion.country = nb5Var.s();
                } else {
                    if (iU != 42) {
                        if (iPRegion.f80id != null) {
                            break;
                        }
                        iPRegion.f80id = "";
                        return iPRegion;
                    }
                    iPRegion.province = nb5Var.s();
                }
            }
            return iPRegion;
        }

        public void serialize(IPRegion iPRegion, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = iPRegion.f80id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = iPRegion.district;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = iPRegion.city;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = iPRegion.country;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
            String str5 = iPRegion.province;
            if (str5 != null) {
                codedOutputByteBufferNano.R(5, str5);
            }
        }
    };
    public static JsonAdapter<IPRegion> JSON_ADAPTER = new ObjectJsonAdapter<IPRegion>() { // from class: com.p1.mobile.putong.core.data.IPRegion.2
        public Class getDataClass() {
            return IPRegion.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public IPRegion m13354newInstance() {
            return new IPRegion();
        }

        public boolean parseField(IPRegion iPRegion, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "province":
                    iPRegion.province = jsonParser.getValueAsString();
                    return true;
                case "id":
                    iPRegion.f80id = jsonParser.getValueAsString();
                    return false;
                case "city":
                    iPRegion.city = jsonParser.getValueAsString();
                    return true;
                case "district":
                    iPRegion.district = jsonParser.getValueAsString();
                    return true;
                case "country":
                    iPRegion.country = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(IPRegion iPRegion, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "province":
                    return true;
                case "id":
                    return false;
                case "city":
                case "district":
                case "country":
                    return true;
                default:
                    return super.parseFieldCheck(iPRegion, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(IPRegion iPRegion, JsonGenerator jsonGenerator) throws IOException {
            String str = iPRegion.f80id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = iPRegion.district;
            if (str2 != null) {
                jsonGenerator.writeStringField(RankLevel.district, str2);
            }
            String str3 = iPRegion.city;
            if (str3 != null) {
                jsonGenerator.writeStringField(RankLevel.city, str3);
            }
            String str4 = iPRegion.country;
            if (str4 != null) {
                jsonGenerator.writeStringField(RankLevel.country, str4);
            }
            String str5 = iPRegion.province;
            if (str5 != null) {
                jsonGenerator.writeStringField(RankLevel.province, str5);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IPRegion) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IPRegion) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static IPRegion new_() {
        IPRegion iPRegion = new IPRegion();
        iPRegion.nullCheck();
        return iPRegion;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public IPRegion m13352clone() {
        IPRegion iPRegion = new IPRegion();
        iPRegion.f80id = this.f80id;
        iPRegion.district = this.district;
        iPRegion.city = this.city;
        iPRegion.country = this.country;
        iPRegion.province = this.province;
        return iPRegion;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IPRegion)) {
            return false;
        }
        IPRegion iPRegion = (IPRegion) obj;
        return ValueObject.util_equals(this.f80id, iPRegion.f80id) && ValueObject.util_equals(this.district, iPRegion.district) && ValueObject.util_equals(this.city, iPRegion.city) && ValueObject.util_equals(this.country, iPRegion.country) && ValueObject.util_equals(this.province, iPRegion.province);
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
        String str = this.f80id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.district;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.city;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.country;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.province;
        int iHashCode5 = iHashCode4 + (str5 != null ? str5.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode5;
        return iHashCode5;
    }

    public void nullCheck() {
        if (this.f80id == null) {
            this.f80id = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
