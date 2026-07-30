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
public class SvipResumePurchase extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "svipresumepurchase";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int no_match_days_limit;

    @ProtobufIndex(index = 1)
    public int no_match_swipe_limit;
    public static ProtobufAdapter<SvipResumePurchase> PROTOBUF_ADAPTER = new MessageNanoAdapter<SvipResumePurchase>() { // from class: com.p1.mobile.putong.core.data.SvipResumePurchase.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SvipResumePurchase svipResumePurchase) {
            int iH = CodedOutputByteBufferNano.h(1, svipResumePurchase.no_match_swipe_limit) + CodedOutputByteBufferNano.h(2, svipResumePurchase.no_match_days_limit);
            ((MessageNano) svipResumePurchase).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SvipResumePurchase m15846parse(nb5 nb5Var) throws IOException {
            SvipResumePurchase svipResumePurchase = new SvipResumePurchase();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    svipResumePurchase.no_match_swipe_limit = nb5Var.j();
                } else {
                    if (iU != 16) {
                        return svipResumePurchase;
                    }
                    svipResumePurchase.no_match_days_limit = nb5Var.j();
                }
            }
        }

        public void serialize(SvipResumePurchase svipResumePurchase, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, svipResumePurchase.no_match_swipe_limit);
            codedOutputByteBufferNano.G(2, svipResumePurchase.no_match_days_limit);
        }
    };
    public static JsonAdapter<SvipResumePurchase> JSON_ADAPTER = new ObjectJsonAdapter<SvipResumePurchase>() { // from class: com.p1.mobile.putong.core.data.SvipResumePurchase.2
        public Class getDataClass() {
            return SvipResumePurchase.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public SvipResumePurchase m15847newInstance() {
            return new SvipResumePurchase();
        }

        public boolean parseField(SvipResumePurchase svipResumePurchase, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("no_match_swipe_limit")) {
                svipResumePurchase.no_match_swipe_limit = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals("no_match_days_limit")) {
                return false;
            }
            svipResumePurchase.no_match_days_limit = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(SvipResumePurchase svipResumePurchase, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("no_match_swipe_limit") || str.equals("no_match_days_limit")) {
                return true;
            }
            return super.parseFieldCheck(svipResumePurchase, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(SvipResumePurchase svipResumePurchase, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("no_match_swipe_limit", svipResumePurchase.no_match_swipe_limit);
            jsonGenerator.writeNumberField("no_match_days_limit", svipResumePurchase.no_match_days_limit);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SvipResumePurchase) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SvipResumePurchase) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SvipResumePurchase new_() {
        SvipResumePurchase svipResumePurchase = new SvipResumePurchase();
        svipResumePurchase.nullCheck();
        return svipResumePurchase;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SvipResumePurchase m15845clone() {
        SvipResumePurchase svipResumePurchase = new SvipResumePurchase();
        svipResumePurchase.no_match_swipe_limit = this.no_match_swipe_limit;
        svipResumePurchase.no_match_days_limit = this.no_match_days_limit;
        return svipResumePurchase;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SvipResumePurchase)) {
            return false;
        }
        SvipResumePurchase svipResumePurchase = (SvipResumePurchase) obj;
        return this.no_match_swipe_limit == svipResumePurchase.no_match_swipe_limit && this.no_match_days_limit == svipResumePurchase.no_match_days_limit;
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((i * 41) + this.no_match_swipe_limit) * 41) + this.no_match_days_limit;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
