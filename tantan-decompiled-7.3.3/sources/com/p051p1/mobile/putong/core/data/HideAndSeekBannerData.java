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
public class HideAndSeekBannerData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "hideandseekbannerdata";

    @NonNull
    @ProtobufIndex(index = 2)
    public String gameBanner;

    @ProtobufIndex(index = 1)
    public boolean visible;
    public static ProtobufAdapter<HideAndSeekBannerData> PROTOBUF_ADAPTER = new MessageNanoAdapter<HideAndSeekBannerData>() { // from class: com.p1.mobile.putong.core.data.HideAndSeekBannerData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(HideAndSeekBannerData hideAndSeekBannerData) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, hideAndSeekBannerData.visible);
            String str = hideAndSeekBannerData.gameBanner;
            if (str != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(2, str);
            }
            hideAndSeekBannerData.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public HideAndSeekBannerData parse(nc5 nc5Var) throws IOException {
            HideAndSeekBannerData hideAndSeekBannerData = new HideAndSeekBannerData();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (hideAndSeekBannerData.gameBanner != null) {
                        break;
                    }
                    hideAndSeekBannerData.gameBanner = "";
                    break;
                }
                if (iM162497u == 8) {
                    hideAndSeekBannerData.visible = nc5Var.m162483g();
                } else {
                    if (iM162497u != 18) {
                        if (hideAndSeekBannerData.gameBanner != null) {
                            break;
                        }
                        hideAndSeekBannerData.gameBanner = "";
                        return hideAndSeekBannerData;
                    }
                    hideAndSeekBannerData.gameBanner = nc5Var.m162495s();
                }
            }
            return hideAndSeekBannerData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(HideAndSeekBannerData hideAndSeekBannerData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, hideAndSeekBannerData.visible);
            String str = hideAndSeekBannerData.gameBanner;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(2, str);
            }
        }
    };
    public static JsonAdapter<HideAndSeekBannerData> JSON_ADAPTER = new ObjectJsonAdapter<HideAndSeekBannerData>() { // from class: com.p1.mobile.putong.core.data.HideAndSeekBannerData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return HideAndSeekBannerData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public HideAndSeekBannerData newInstance() {
            return new HideAndSeekBannerData();
        }

        public boolean parseField(HideAndSeekBannerData hideAndSeekBannerData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("gameBanner")) {
                hideAndSeekBannerData.gameBanner = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("visible")) {
                return false;
            }
            hideAndSeekBannerData.visible = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(HideAndSeekBannerData hideAndSeekBannerData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("gameBanner") || str.equals("visible")) {
                return true;
            }
            return super.parseFieldCheck(hideAndSeekBannerData, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(HideAndSeekBannerData hideAndSeekBannerData, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("visible", hideAndSeekBannerData.visible);
            String str = hideAndSeekBannerData.gameBanner;
            if (str != null) {
                jsonGenerator.writeStringField("gameBanner", str);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((HideAndSeekBannerData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((HideAndSeekBannerData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static HideAndSeekBannerData new_() {
        HideAndSeekBannerData hideAndSeekBannerData = new HideAndSeekBannerData();
        hideAndSeekBannerData.nullCheck();
        return hideAndSeekBannerData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public HideAndSeekBannerData mo225055clone() {
        HideAndSeekBannerData hideAndSeekBannerData = new HideAndSeekBannerData();
        hideAndSeekBannerData.visible = this.visible;
        hideAndSeekBannerData.gameBanner = this.gameBanner;
        return hideAndSeekBannerData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HideAndSeekBannerData)) {
            return false;
        }
        HideAndSeekBannerData hideAndSeekBannerData = (HideAndSeekBannerData) obj;
        return this.visible == hideAndSeekBannerData.visible && ValueObject.util_equals(this.gameBanner, hideAndSeekBannerData.gameBanner);
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
        int i2 = ((i * 41) + (this.visible ? 1231 : 1237)) * 41;
        String str = this.gameBanner;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.gameBanner == null) {
            this.gameBanner = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
