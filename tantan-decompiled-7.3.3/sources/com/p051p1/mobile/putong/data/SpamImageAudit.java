package com.p051p1.mobile.putong.data;

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
public class SpamImageAudit extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "spamimageaudit";

    @ProtobufIndex(index = 1)
    public boolean enabled;

    @ProtobufIndex(index = 2)
    public boolean pornCheckEnabled;
    public static ProtobufAdapter<SpamImageAudit> PROTOBUF_ADAPTER = new MessageNanoAdapter<SpamImageAudit>() { // from class: com.p1.mobile.putong.data.SpamImageAudit.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SpamImageAudit spamImageAudit) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, spamImageAudit.enabled) + CodedOutputByteBufferNano.m17275b(2, spamImageAudit.pornCheckEnabled);
            spamImageAudit.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SpamImageAudit parse(nc5 nc5Var) throws IOException {
            SpamImageAudit spamImageAudit = new SpamImageAudit();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    spamImageAudit.enabled = nc5Var.m162483g();
                } else {
                    if (iM162497u != 16) {
                        return spamImageAudit;
                    }
                    spamImageAudit.pornCheckEnabled = nc5Var.m162483g();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SpamImageAudit spamImageAudit, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, spamImageAudit.enabled);
            codedOutputByteBufferNano.m17299A(2, spamImageAudit.pornCheckEnabled);
        }
    };
    public static JsonAdapter<SpamImageAudit> JSON_ADAPTER = new ObjectJsonAdapter<SpamImageAudit>() { // from class: com.p1.mobile.putong.data.SpamImageAudit.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SpamImageAudit.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SpamImageAudit newInstance() {
            return new SpamImageAudit();
        }

        public boolean parseField(SpamImageAudit spamImageAudit, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("enabled")) {
                spamImageAudit.enabled = jsonParser.getValueAsBoolean();
                return true;
            }
            if (!str.equals("pornCheckEnabled")) {
                return false;
            }
            spamImageAudit.pornCheckEnabled = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(SpamImageAudit spamImageAudit, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("enabled") || str.equals("pornCheckEnabled")) {
                return true;
            }
            return super.parseFieldCheck(spamImageAudit, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SpamImageAudit spamImageAudit, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("enabled", spamImageAudit.enabled);
            jsonGenerator.writeBooleanField("pornCheckEnabled", spamImageAudit.pornCheckEnabled);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SpamImageAudit) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SpamImageAudit) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SpamImageAudit new_() {
        SpamImageAudit spamImageAudit = new SpamImageAudit();
        spamImageAudit.nullCheck();
        return spamImageAudit;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SpamImageAudit mo225055clone() {
        SpamImageAudit spamImageAudit = new SpamImageAudit();
        spamImageAudit.enabled = this.enabled;
        spamImageAudit.pornCheckEnabled = this.pornCheckEnabled;
        return spamImageAudit;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SpamImageAudit)) {
            return false;
        }
        SpamImageAudit spamImageAudit = (SpamImageAudit) obj;
        return this.enabled == spamImageAudit.enabled && this.pornCheckEnabled == spamImageAudit.pornCheckEnabled;
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
        int i2 = (((i * 41) + (this.enabled ? 1231 : 1237)) * 41) + (this.pornCheckEnabled ? 1231 : 1237);
        this.hashCode = i2;
        return i2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
