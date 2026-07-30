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
public class ContinuousChatTip extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "continuouschattip";

    @NonNull
    @ProtobufIndex(index = 3)
    public String clickH5Url;

    @ProtobufIndex(index = 1)
    public int days;

    @NonNull
    @ProtobufIndex(index = 2)
    public String flameImgUrl;
    public static ProtobufAdapter<ContinuousChatTip> PROTOBUF_ADAPTER = new MessageNanoAdapter<ContinuousChatTip>() { // from class: com.p1.mobile.putong.core.data.ContinuousChatTip.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ContinuousChatTip continuousChatTip) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, continuousChatTip.days);
            String str = continuousChatTip.flameImgUrl;
            if (str != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(2, str);
            }
            String str2 = continuousChatTip.clickH5Url;
            if (str2 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(3, str2);
            }
            continuousChatTip.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ContinuousChatTip parse(nc5 nc5Var) throws IOException {
            ContinuousChatTip continuousChatTip = new ContinuousChatTip();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (continuousChatTip.flameImgUrl == null) {
                        continuousChatTip.flameImgUrl = "";
                    }
                    if (continuousChatTip.clickH5Url != null) {
                        break;
                    }
                    continuousChatTip.clickH5Url = "";
                    break;
                }
                if (iM162497u == 8) {
                    continuousChatTip.days = nc5Var.m162486j();
                } else if (iM162497u == 18) {
                    continuousChatTip.flameImgUrl = nc5Var.m162495s();
                } else {
                    if (iM162497u != 26) {
                        if (continuousChatTip.flameImgUrl == null) {
                            continuousChatTip.flameImgUrl = "";
                        }
                        if (continuousChatTip.clickH5Url != null) {
                            break;
                        }
                        continuousChatTip.clickH5Url = "";
                        return continuousChatTip;
                    }
                    continuousChatTip.clickH5Url = nc5Var.m162495s();
                }
            }
            return continuousChatTip;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ContinuousChatTip continuousChatTip, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, continuousChatTip.days);
            String str = continuousChatTip.flameImgUrl;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(2, str);
            }
            String str2 = continuousChatTip.clickH5Url;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(3, str2);
            }
        }
    };
    public static JsonAdapter<ContinuousChatTip> JSON_ADAPTER = new ObjectJsonAdapter<ContinuousChatTip>() { // from class: com.p1.mobile.putong.core.data.ContinuousChatTip.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ContinuousChatTip.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ContinuousChatTip newInstance() {
            return new ContinuousChatTip();
        }

        public boolean parseField(ContinuousChatTip continuousChatTip, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "clickH5Url":
                    continuousChatTip.clickH5Url = jsonParser.getValueAsString();
                    return true;
                case "days":
                    continuousChatTip.days = jsonParser.getValueAsInt();
                    return true;
                case "flameImgUrl":
                    continuousChatTip.flameImgUrl = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ContinuousChatTip continuousChatTip, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "clickH5Url":
                case "days":
                case "flameImgUrl":
                    return true;
                default:
                    return super.parseFieldCheck(continuousChatTip, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ContinuousChatTip continuousChatTip, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("days", continuousChatTip.days);
            String str = continuousChatTip.flameImgUrl;
            if (str != null) {
                jsonGenerator.writeStringField("flameImgUrl", str);
            }
            String str2 = continuousChatTip.clickH5Url;
            if (str2 != null) {
                jsonGenerator.writeStringField("clickH5Url", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ContinuousChatTip) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ContinuousChatTip) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ContinuousChatTip new_() {
        ContinuousChatTip continuousChatTip = new ContinuousChatTip();
        continuousChatTip.nullCheck();
        return continuousChatTip;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ContinuousChatTip mo225055clone() {
        ContinuousChatTip continuousChatTip = new ContinuousChatTip();
        continuousChatTip.days = this.days;
        continuousChatTip.flameImgUrl = this.flameImgUrl;
        continuousChatTip.clickH5Url = this.clickH5Url;
        return continuousChatTip;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ContinuousChatTip)) {
            return false;
        }
        ContinuousChatTip continuousChatTip = (ContinuousChatTip) obj;
        return this.days == continuousChatTip.days && ValueObject.util_equals(this.flameImgUrl, continuousChatTip.flameImgUrl) && ValueObject.util_equals(this.clickH5Url, continuousChatTip.clickH5Url);
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
        int i2 = ((i * 41) + this.days) * 41;
        String str = this.flameImgUrl;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.clickH5Url;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.flameImgUrl == null) {
            this.flameImgUrl = "";
        }
        if (this.clickH5Url == null) {
            this.clickH5Url = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
