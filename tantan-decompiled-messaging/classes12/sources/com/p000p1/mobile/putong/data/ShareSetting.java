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
public class ShareSetting extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "sharesetting";

    @ProtobufIndex(index = 1)
    public boolean userShare;
    public static ProtobufAdapter<ShareSetting> PROTOBUF_ADAPTER = new MessageNanoAdapter<ShareSetting>() { // from class: com.p1.mobile.putong.data.ShareSetting.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ShareSetting shareSetting) {
            int iB = CodedOutputByteBufferNano.b(1, shareSetting.userShare);
            ((MessageNano) shareSetting).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ShareSetting m18974parse(nb5 nb5Var) throws IOException {
            ShareSetting shareSetting = new ShareSetting();
            while (nb5Var.u() == 8) {
                shareSetting.userShare = nb5Var.g();
            }
            return shareSetting;
        }

        public void serialize(ShareSetting shareSetting, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, shareSetting.userShare);
        }
    };
    public static JsonAdapter<ShareSetting> JSON_ADAPTER = new ObjectJsonAdapter<ShareSetting>() { // from class: com.p1.mobile.putong.data.ShareSetting.2
        public Class getDataClass() {
            return ShareSetting.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public ShareSetting mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ShareSetting shareSetting, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("userShare", shareSetting.userShare);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ShareSetting) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ShareSetting) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ShareSetting new_() {
        ShareSetting shareSetting = new ShareSetting();
        shareSetting.nullCheck();
        return shareSetting;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ShareSetting m18973clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (i * 41) + (this.userShare ? 1231 : 1237);
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
