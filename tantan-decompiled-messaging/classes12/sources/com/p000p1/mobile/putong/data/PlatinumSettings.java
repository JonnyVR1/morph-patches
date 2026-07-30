package com.p000p1.mobile.putong.data;

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
public class PlatinumSettings extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "platinumsettings";

    @ProtobufIndex(index = 1)
    public boolean isPvip;
    public static ProtobufAdapter<PlatinumSettings> PROTOBUF_ADAPTER = new MessageNanoAdapter<PlatinumSettings>() { // from class: com.p1.mobile.putong.data.PlatinumSettings.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(PlatinumSettings platinumSettings) {
            int iB = CodedOutputByteBufferNano.b(1, platinumSettings.isPvip);
            ((MessageNano) platinumSettings).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public PlatinumSettings m18814parse(nb5 nb5Var) throws IOException {
            PlatinumSettings platinumSettings = new PlatinumSettings();
            while (nb5Var.u() == 8) {
                platinumSettings.isPvip = nb5Var.g();
            }
            return platinumSettings;
        }

        public void serialize(PlatinumSettings platinumSettings, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, platinumSettings.isPvip);
        }
    };
    public static JsonAdapter<PlatinumSettings> JSON_ADAPTER = new ObjectJsonAdapter<PlatinumSettings>() { // from class: com.p1.mobile.putong.data.PlatinumSettings.2
        public Class getDataClass() {
            return PlatinumSettings.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public PlatinumSettings mo17830newInstance() {
            return new PlatinumSettings();
        }

        public boolean parseField(PlatinumSettings platinumSettings, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("isPvip")) {
                return false;
            }
            platinumSettings.isPvip = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(PlatinumSettings platinumSettings, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("isPvip")) {
                return true;
            }
            return super.parseFieldCheck(platinumSettings, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PlatinumSettings platinumSettings, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("isPvip", platinumSettings.isPvip);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PlatinumSettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PlatinumSettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PlatinumSettings new_() {
        PlatinumSettings platinumSettings = new PlatinumSettings();
        platinumSettings.nullCheck();
        return platinumSettings;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public PlatinumSettings m18813clone() {
        PlatinumSettings platinumSettings = new PlatinumSettings();
        platinumSettings.isPvip = this.isPvip;
        return platinumSettings;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof PlatinumSettings) && this.isPvip == ((PlatinumSettings) obj).isPvip;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (i * 41) + (this.isPvip ? 1231 : 1237);
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
