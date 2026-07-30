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
public class HideAndSeekBannerData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "hideandseekbannerdata";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String gameBanner;

    @ProtobufIndex(index = 1)
    public boolean visible;
    public static ProtobufAdapter<HideAndSeekBannerData> PROTOBUF_ADAPTER = new MessageNanoAdapter<HideAndSeekBannerData>() { // from class: com.p1.mobile.putong.core.data.HideAndSeekBannerData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(HideAndSeekBannerData hideAndSeekBannerData) {
            int iB = CodedOutputByteBufferNano.b(1, hideAndSeekBannerData.visible);
            String str = hideAndSeekBannerData.gameBanner;
            if (str != null) {
                iB += CodedOutputByteBufferNano.o(2, str);
            }
            ((MessageNano) hideAndSeekBannerData).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public HideAndSeekBannerData m13255parse(nb5 nb5Var) throws IOException {
            HideAndSeekBannerData hideAndSeekBannerData = new HideAndSeekBannerData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (hideAndSeekBannerData.gameBanner != null) {
                        break;
                    }
                    hideAndSeekBannerData.gameBanner = "";
                    break;
                }
                if (iU == 8) {
                    hideAndSeekBannerData.visible = nb5Var.g();
                } else {
                    if (iU != 18) {
                        if (hideAndSeekBannerData.gameBanner != null) {
                            break;
                        }
                        hideAndSeekBannerData.gameBanner = "";
                        return hideAndSeekBannerData;
                    }
                    hideAndSeekBannerData.gameBanner = nb5Var.s();
                }
            }
            return hideAndSeekBannerData;
        }

        public void serialize(HideAndSeekBannerData hideAndSeekBannerData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, hideAndSeekBannerData.visible);
            String str = hideAndSeekBannerData.gameBanner;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
        }
    };
    public static JsonAdapter<HideAndSeekBannerData> JSON_ADAPTER = new ObjectJsonAdapter<HideAndSeekBannerData>() { // from class: com.p1.mobile.putong.core.data.HideAndSeekBannerData.2
        public Class getDataClass() {
            return HideAndSeekBannerData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public HideAndSeekBannerData m13256newInstance() {
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

        public void serializeFields(HideAndSeekBannerData hideAndSeekBannerData, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("visible", hideAndSeekBannerData.visible);
            String str = hideAndSeekBannerData.gameBanner;
            if (str != null) {
                jsonGenerator.writeStringField("gameBanner", str);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((HideAndSeekBannerData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((HideAndSeekBannerData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static HideAndSeekBannerData new_() {
        HideAndSeekBannerData hideAndSeekBannerData = new HideAndSeekBannerData();
        hideAndSeekBannerData.nullCheck();
        return hideAndSeekBannerData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public HideAndSeekBannerData m13254clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + (this.visible ? 1231 : 1237)) * 41;
        String str = this.gameBanner;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.gameBanner == null) {
            this.gameBanner = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
