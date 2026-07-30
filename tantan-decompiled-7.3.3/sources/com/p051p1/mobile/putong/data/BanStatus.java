package com.p051p1.mobile.putong.data;

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

/* JADX INFO: loaded from: classes12.dex */
public class BanStatus extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "banstatus";

    @ProtobufIndex(index = 1)
    public int code;

    @NonNull
    @ProtobufIndex(index = 2)
    public String text;
    public static ProtobufAdapter<BanStatus> PROTOBUF_ADAPTER = new MessageNanoAdapter<BanStatus>() { // from class: com.p1.mobile.putong.data.BanStatus.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(BanStatus banStatus) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, banStatus.code);
            String str = banStatus.text;
            if (str != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(2, str);
            }
            banStatus.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public BanStatus parse(nc5 nc5Var) throws IOException {
            BanStatus banStatus = new BanStatus();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (banStatus.text != null) {
                        break;
                    }
                    banStatus.text = "";
                    break;
                }
                if (iM162497u == 8) {
                    banStatus.code = nc5Var.m162486j();
                } else {
                    if (iM162497u != 18) {
                        if (banStatus.text != null) {
                            break;
                        }
                        banStatus.text = "";
                        return banStatus;
                    }
                    banStatus.text = nc5Var.m162495s();
                }
            }
            return banStatus;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(BanStatus banStatus, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, banStatus.code);
            String str = banStatus.text;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(2, str);
            }
        }
    };
    public static JsonAdapter<BanStatus> JSON_ADAPTER = new ObjectJsonAdapter<BanStatus>() { // from class: com.p1.mobile.putong.data.BanStatus.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return BanStatus.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public BanStatus newInstance() {
            return new BanStatus();
        }

        public boolean parseField(BanStatus banStatus, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("code")) {
                banStatus.code = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals("text")) {
                return false;
            }
            banStatus.text = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(BanStatus banStatus, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("code") || str.equals("text")) {
                return true;
            }
            return super.parseFieldCheck(banStatus, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BanStatus banStatus, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("code", banStatus.code);
            String str = banStatus.text;
            if (str != null) {
                jsonGenerator.writeStringField("text", str);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((BanStatus) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BanStatus) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static BanStatus new_() {
        BanStatus banStatus = new BanStatus();
        banStatus.nullCheck();
        return banStatus;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public BanStatus mo225055clone() {
        BanStatus banStatus = new BanStatus();
        banStatus.code = this.code;
        banStatus.text = this.text;
        return banStatus;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BanStatus)) {
            return false;
        }
        BanStatus banStatus = (BanStatus) obj;
        return this.code == banStatus.code && ValueObject.util_equals(this.text, banStatus.text);
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
        int i2 = ((i * 41) + this.code) * 41;
        String str = this.text;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.text == null) {
            this.text = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
