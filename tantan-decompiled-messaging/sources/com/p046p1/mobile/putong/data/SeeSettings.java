package com.p046p1.mobile.putong.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes12.dex */
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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SeeSettings seeSettings) {
            int iM17220b = CodedOutputByteBufferNano.m17220b(1, seeSettings.likedPush) + CodedOutputByteBufferNano.m17220b(2, seeSettings.likedShow) + CodedOutputByteBufferNano.m17226h(3, seeSettings.likedPushInterval);
            seeSettings.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SeeSettings parse(nb5 nb5Var) throws IOException {
            SeeSettings seeSettings = new SeeSettings();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    seeSettings.likedPush = nb5Var.m158738g();
                } else if (iM158752u == 16) {
                    seeSettings.likedShow = nb5Var.m158738g();
                } else {
                    if (iM158752u != 24) {
                        return seeSettings;
                    }
                    seeSettings.likedPushInterval = nb5Var.m158741j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SeeSettings seeSettings, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17244A(1, seeSettings.likedPush);
            codedOutputByteBufferNano.m17244A(2, seeSettings.likedShow);
            codedOutputByteBufferNano.m17250G(3, seeSettings.likedPushInterval);
        }
    };
    public static JsonAdapter<SeeSettings> JSON_ADAPTER = new ObjectJsonAdapter<SeeSettings>() { // from class: com.p1.mobile.putong.data.SeeSettings.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SeeSettings.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SeeSettings newInstance() {
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SeeSettings seeSettings, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("likedPush", seeSettings.likedPush);
            jsonGenerator.writeBooleanField("likedShow", seeSettings.likedShow);
            jsonGenerator.writeNumberField("likedPushInterval", seeSettings.likedPushInterval);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SeeSettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SeeSettings) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SeeSettings new_() {
        SeeSettings seeSettings = new SeeSettings();
        seeSettings.nullCheck();
        return seeSettings;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SeeSettings mo223809clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((i * 41) + (this.likedPush ? 1231 : 1237)) * 41) + (this.likedShow ? 1231 : 1237)) * 41) + this.likedPushInterval;
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
