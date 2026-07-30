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
public class SeeSettings extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "seesettings";

    @ProtobufIndex(index = 1)
    public boolean likedPush;

    @ProtobufIndex(index = 3)
    public int likedPushInterval;

    @ProtobufIndex(index = 2)
    public boolean likedShow;
    public static ProtobufAdapter<SeeSettings> PROTOBUF_ADAPTER = new MessageNanoAdapter<SeeSettings>() { // from class: com.p1.mobile.putong.data.SeeSettings.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SeeSettings seeSettings) {
            int iB = CodedOutputByteBufferNano.b(1, seeSettings.likedPush) + CodedOutputByteBufferNano.b(2, seeSettings.likedShow) + CodedOutputByteBufferNano.h(3, seeSettings.likedPushInterval);
            ((MessageNano) seeSettings).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SeeSettings m18941parse(nb5 nb5Var) throws IOException {
            SeeSettings seeSettings = new SeeSettings();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    seeSettings.likedPush = nb5Var.g();
                } else if (iU == 16) {
                    seeSettings.likedShow = nb5Var.g();
                } else {
                    if (iU != 24) {
                        return seeSettings;
                    }
                    seeSettings.likedPushInterval = nb5Var.j();
                }
            }
        }

        public void serialize(SeeSettings seeSettings, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, seeSettings.likedPush);
            codedOutputByteBufferNano.A(2, seeSettings.likedShow);
            codedOutputByteBufferNano.G(3, seeSettings.likedPushInterval);
        }
    };
    public static JsonAdapter<SeeSettings> JSON_ADAPTER = new ObjectJsonAdapter<SeeSettings>() { // from class: com.p1.mobile.putong.data.SeeSettings.2
        public Class getDataClass() {
            return SeeSettings.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public SeeSettings mo17830newInstance() {
            return new SeeSettings();
        }

        public boolean parseField(SeeSettings seeSettings, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "likedPushInterval":
                    seeSettings.likedPushInterval = jsonParser.getValueAsInt();
                    return true;
                case "likedPush":
                    seeSettings.likedPush = jsonParser.getValueAsBoolean();
                    return true;
                case "likedShow":
                    seeSettings.likedShow = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(SeeSettings seeSettings, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "likedPushInterval":
                case "likedPush":
                case "likedShow":
                    return true;
                default:
                    return super.parseFieldCheck(seeSettings, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SeeSettings seeSettings, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("likedPush", seeSettings.likedPush);
            jsonGenerator.writeBooleanField("likedShow", seeSettings.likedShow);
            jsonGenerator.writeNumberField("likedPushInterval", seeSettings.likedPushInterval);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SeeSettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SeeSettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SeeSettings new_() {
        SeeSettings seeSettings = new SeeSettings();
        seeSettings.nullCheck();
        return seeSettings;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SeeSettings m18940clone() {
        SeeSettings seeSettings = new SeeSettings();
        seeSettings.likedPush = this.likedPush;
        seeSettings.likedShow = this.likedShow;
        seeSettings.likedPushInterval = this.likedPushInterval;
        return seeSettings;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SeeSettings)) {
            return false;
        }
        SeeSettings seeSettings = (SeeSettings) obj;
        return this.likedPush == seeSettings.likedPush && this.likedShow == seeSettings.likedShow && this.likedPushInterval == seeSettings.likedPushInterval;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((i * 41) + (this.likedPush ? 1231 : 1237)) * 41) + (this.likedShow ? 1231 : 1237)) * 41) + this.likedPushInterval;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
