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
public class ShareSetting extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "sharesetting";

    @ProtobufIndex(index = 1)
    public boolean userShare;
    public static ProtobufAdapter<ShareSetting> PROTOBUF_ADAPTER = new MessageNanoAdapter<ShareSetting>() { // from class: com.p1.mobile.putong.data.ShareSetting.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ShareSetting shareSetting) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, shareSetting.userShare);
            shareSetting.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ShareSetting parse(nc5 nc5Var) throws IOException {
            ShareSetting shareSetting = new ShareSetting();
            while (nc5Var.m162497u() == 8) {
                shareSetting.userShare = nc5Var.m162483g();
            }
            return shareSetting;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ShareSetting shareSetting, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, shareSetting.userShare);
        }
    };
    public static JsonAdapter<ShareSetting> JSON_ADAPTER = new ObjectJsonAdapter<ShareSetting>() { // from class: com.p1.mobile.putong.data.ShareSetting.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ShareSetting.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ShareSetting newInstance() {
            return new ShareSetting();
        }

        public boolean parseField(ShareSetting shareSetting, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("userShare")) {
                return false;
            }
            shareSetting.userShare = jsonParser.getValueAsBoolean();
            return true;
        }

        public boolean parseFieldCheck(ShareSetting shareSetting, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("userShare")) {
                return true;
            }
            return super.parseFieldCheck(shareSetting, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ShareSetting shareSetting, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("userShare", shareSetting.userShare);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ShareSetting) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ShareSetting) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ShareSetting new_() {
        ShareSetting shareSetting = new ShareSetting();
        shareSetting.nullCheck();
        return shareSetting;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ShareSetting mo225055clone() {
        ShareSetting shareSetting = new ShareSetting();
        shareSetting.userShare = this.userShare;
        return shareSetting;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ShareSetting) && this.userShare == ((ShareSetting) obj).userShare;
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
        int i2 = (i * 41) + (this.userShare ? 1231 : 1237);
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
