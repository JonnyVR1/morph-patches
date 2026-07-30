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
public class LiveRevenueCampaignVip extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "liverevenuecampaignvip";

    @ProtobufIndex(index = 1)
    public boolean isVip;
    public static ProtobufAdapter<LiveRevenueCampaignVip> PROTOBUF_ADAPTER = new MessageNanoAdapter<LiveRevenueCampaignVip>() { // from class: com.p1.mobile.putong.data.LiveRevenueCampaignVip.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LiveRevenueCampaignVip liveRevenueCampaignVip) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, liveRevenueCampaignVip.isVip);
            liveRevenueCampaignVip.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LiveRevenueCampaignVip parse(nc5 nc5Var) throws IOException {
            LiveRevenueCampaignVip liveRevenueCampaignVip = new LiveRevenueCampaignVip();
            while (nc5Var.m162497u() == 8) {
                liveRevenueCampaignVip.isVip = nc5Var.m162483g();
            }
            return liveRevenueCampaignVip;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LiveRevenueCampaignVip liveRevenueCampaignVip, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, liveRevenueCampaignVip.isVip);
        }
    };
    public static JsonAdapter<LiveRevenueCampaignVip> JSON_ADAPTER = new ObjectJsonAdapter<LiveRevenueCampaignVip>() { // from class: com.p1.mobile.putong.data.LiveRevenueCampaignVip.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LiveRevenueCampaignVip.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LiveRevenueCampaignVip newInstance() {
            return new LiveRevenueCampaignVip();
        }

        public boolean parseField(LiveRevenueCampaignVip liveRevenueCampaignVip, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("isVip")) {
                return false;
            }
            liveRevenueCampaignVip.isVip = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(LiveRevenueCampaignVip liveRevenueCampaignVip, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("isVip")) {
                return true;
            }
            return super.parseFieldCheck(liveRevenueCampaignVip, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LiveRevenueCampaignVip liveRevenueCampaignVip, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("isVip", liveRevenueCampaignVip.isVip);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LiveRevenueCampaignVip) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LiveRevenueCampaignVip) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LiveRevenueCampaignVip new_() {
        LiveRevenueCampaignVip liveRevenueCampaignVip = new LiveRevenueCampaignVip();
        liveRevenueCampaignVip.nullCheck();
        return liveRevenueCampaignVip;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LiveRevenueCampaignVip mo225055clone() {
        LiveRevenueCampaignVip liveRevenueCampaignVip = new LiveRevenueCampaignVip();
        liveRevenueCampaignVip.isVip = this.isVip;
        return liveRevenueCampaignVip;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof LiveRevenueCampaignVip) && this.isVip == ((LiveRevenueCampaignVip) obj).isVip;
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
        int i2 = (i * 41) + (this.isVip ? 1231 : 1237);
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
