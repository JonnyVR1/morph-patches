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
public class BanStatus extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "banstatus";

    @ProtobufIndex(index = 1)
    public int code;

    @NonNull
    @ProtobufIndex(index = 2)
    public String text;
    public static ProtobufAdapter<BanStatus> PROTOBUF_ADAPTER = new MessageNanoAdapter<BanStatus>() { // from class: com.p1.mobile.putong.data.BanStatus.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(BanStatus banStatus) {
            int iH = CodedOutputByteBufferNano.h(1, banStatus.code);
            String str = banStatus.text;
            if (str != null) {
                iH += CodedOutputByteBufferNano.o(2, str);
            }
            ((MessageNano) banStatus).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public BanStatus m17742parse(nb5 nb5Var) throws IOException {
            BanStatus banStatus = new BanStatus();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (banStatus.text != null) {
                        break;
                    }
                    banStatus.text = "";
                    break;
                }
                if (iU == 8) {
                    banStatus.code = nb5Var.j();
                } else {
                    if (iU != 18) {
                        if (banStatus.text != null) {
                            break;
                        }
                        banStatus.text = "";
                        return banStatus;
                    }
                    banStatus.text = nb5Var.s();
                }
            }
            return banStatus;
        }

        public void serialize(BanStatus banStatus, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, banStatus.code);
            String str = banStatus.text;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
        }
    };
    public static JsonAdapter<BanStatus> JSON_ADAPTER = new ObjectJsonAdapter<BanStatus>() { // from class: com.p1.mobile.putong.data.BanStatus.2
        public Class getDataClass() {
            return BanStatus.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public BanStatus mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(BanStatus banStatus, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("code", banStatus.code);
            String str = banStatus.text;
            if (str != null) {
                jsonGenerator.writeStringField("text", str);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((BanStatus) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((BanStatus) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static BanStatus new_() {
        BanStatus banStatus = new BanStatus();
        banStatus.nullCheck();
        return banStatus;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public BanStatus m17741clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + this.code) * 41;
        String str = this.text;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.text == null) {
            this.text = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
