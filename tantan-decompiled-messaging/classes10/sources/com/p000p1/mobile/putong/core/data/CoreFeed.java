package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
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
public class CoreFeed extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "corefeed";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f38id;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String type;
    public static ProtobufAdapter<CoreFeed> PROTOBUF_ADAPTER = new MessageNanoAdapter<CoreFeed>() { // from class: com.p1.mobile.putong.core.data.CoreFeed.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(CoreFeed coreFeed) {
            String str = coreFeed.f38id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = coreFeed.type;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) coreFeed).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public CoreFeed m12465parse(nb5 nb5Var) throws IOException {
            CoreFeed coreFeed = new CoreFeed();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (coreFeed.f38id == null) {
                        coreFeed.f38id = "";
                    }
                    if (coreFeed.type != null) {
                        break;
                    }
                    coreFeed.type = "";
                    break;
                }
                if (iU == 10) {
                    coreFeed.f38id = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (coreFeed.f38id == null) {
                            coreFeed.f38id = "";
                        }
                        if (coreFeed.type != null) {
                            break;
                        }
                        coreFeed.type = "";
                        return coreFeed;
                    }
                    coreFeed.type = nb5Var.s();
                }
            }
            return coreFeed;
        }

        public void serialize(CoreFeed coreFeed, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = coreFeed.f38id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = coreFeed.type;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<CoreFeed> JSON_ADAPTER = new ObjectJsonAdapter<CoreFeed>() { // from class: com.p1.mobile.putong.core.data.CoreFeed.2
        public Class getDataClass() {
            return CoreFeed.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public CoreFeed m12466newInstance() {
            return new CoreFeed();
        }

        public boolean parseField(CoreFeed coreFeed, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("id")) {
                coreFeed.f38id = jsonParser.getValueAsString();
                return false;
            }
            if (!str.equals("type")) {
                return false;
            }
            coreFeed.type = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(CoreFeed coreFeed, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("id")) {
                return false;
            }
            if (str.equals("type")) {
                return true;
            }
            return super.parseFieldCheck(coreFeed, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(CoreFeed coreFeed, JsonGenerator jsonGenerator) throws IOException {
            String str = coreFeed.f38id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = coreFeed.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((CoreFeed) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((CoreFeed) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static CoreFeed new_() {
        CoreFeed coreFeed = new CoreFeed();
        coreFeed.nullCheck();
        return coreFeed;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public CoreFeed m12464clone() {
        CoreFeed coreFeed = new CoreFeed();
        coreFeed.f38id = this.f38id;
        coreFeed.type = this.type;
        return coreFeed;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CoreFeed)) {
            return false;
        }
        CoreFeed coreFeed = (CoreFeed) obj;
        return ValueObject.util_equals(this.f38id, coreFeed.f38id) && ValueObject.util_equals(this.type, coreFeed.type);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.f38id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public boolean isKankanFeed() {
        return "kankan".equals(this.type);
    }

    public boolean isMomentFeed() {
        return "moment".equals(this.type);
    }

    public void nullCheck() {
        if (this.f38id == null) {
            this.f38id = "";
        }
        if (this.type == null) {
            this.type = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
