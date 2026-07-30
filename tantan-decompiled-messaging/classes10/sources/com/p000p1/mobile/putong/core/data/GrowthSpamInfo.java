package com.p000p1.mobile.putong.core.data;

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
public class GrowthSpamInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "growthspaminfo";

    @ProtobufIndex(index = 1)
    public boolean pop;
    public static ProtobufAdapter<GrowthSpamInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<GrowthSpamInfo>() { // from class: com.p1.mobile.putong.core.data.GrowthSpamInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(GrowthSpamInfo growthSpamInfo) {
            int iB = CodedOutputByteBufferNano.b(1, growthSpamInfo.pop);
            ((MessageNano) growthSpamInfo).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public GrowthSpamInfo m13155parse(nb5 nb5Var) throws IOException {
            GrowthSpamInfo growthSpamInfo = new GrowthSpamInfo();
            while (nb5Var.u() == 8) {
                growthSpamInfo.pop = nb5Var.g();
            }
            return growthSpamInfo;
        }

        public void serialize(GrowthSpamInfo growthSpamInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, growthSpamInfo.pop);
        }
    };
    public static JsonAdapter<GrowthSpamInfo> JSON_ADAPTER = new ObjectJsonAdapter<GrowthSpamInfo>() { // from class: com.p1.mobile.putong.core.data.GrowthSpamInfo.2
        public Class getDataClass() {
            return GrowthSpamInfo.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public GrowthSpamInfo m13156newInstance() {
            return new GrowthSpamInfo();
        }

        public boolean parseField(GrowthSpamInfo growthSpamInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals(GuideBoostMode.pop)) {
                return false;
            }
            growthSpamInfo.pop = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(GrowthSpamInfo growthSpamInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(GuideBoostMode.pop)) {
                return true;
            }
            return super.parseFieldCheck(growthSpamInfo, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(GrowthSpamInfo growthSpamInfo, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField(GuideBoostMode.pop, growthSpamInfo.pop);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GrowthSpamInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GrowthSpamInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GrowthSpamInfo new_() {
        GrowthSpamInfo growthSpamInfo = new GrowthSpamInfo();
        growthSpamInfo.nullCheck();
        return growthSpamInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public GrowthSpamInfo m13154clone() {
        GrowthSpamInfo growthSpamInfo = new GrowthSpamInfo();
        growthSpamInfo.pop = this.pop;
        return growthSpamInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof GrowthSpamInfo) && this.pop == ((GrowthSpamInfo) obj).pop;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (i * 41) + (this.pop ? 1231 : 1237);
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
