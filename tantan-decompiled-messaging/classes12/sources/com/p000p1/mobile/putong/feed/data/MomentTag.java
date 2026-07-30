package com.p000p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
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
public class MomentTag extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "momenttag";

    @NonNull
    @ProtobufIndex(index = 2)
    public String href;

    @NonNull
    @ProtobufIndex(index = 3)
    public String icon;

    @NonNull
    @ProtobufIndex(index = 1)
    public String value;
    public static ProtobufAdapter<MomentTag> PROTOBUF_ADAPTER = new MessageNanoAdapter<MomentTag>() { // from class: com.p1.mobile.putong.feed.data.MomentTag.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MomentTag momentTag) {
            String str = momentTag.value;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = momentTag.href;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = momentTag.icon;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            ((MessageNano) momentTag).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MomentTag m19654parse(nb5 nb5Var) throws IOException {
            MomentTag momentTag = new MomentTag();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (momentTag.value == null) {
                        momentTag.value = "";
                    }
                    if (momentTag.href == null) {
                        momentTag.href = "";
                    }
                    if (momentTag.icon != null) {
                        break;
                    }
                    momentTag.icon = "";
                    break;
                }
                if (iU == 10) {
                    momentTag.value = nb5Var.s();
                } else if (iU == 18) {
                    momentTag.href = nb5Var.s();
                } else {
                    if (iU != 26) {
                        if (momentTag.value == null) {
                            momentTag.value = "";
                        }
                        if (momentTag.href == null) {
                            momentTag.href = "";
                        }
                        if (momentTag.icon != null) {
                            break;
                        }
                        momentTag.icon = "";
                        return momentTag;
                    }
                    momentTag.icon = nb5Var.s();
                }
            }
            return momentTag;
        }

        public void serialize(MomentTag momentTag, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = momentTag.value;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = momentTag.href;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = momentTag.icon;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
        }
    };
    public static JsonAdapter<MomentTag> JSON_ADAPTER = new ObjectJsonAdapter<MomentTag>() { // from class: com.p1.mobile.putong.feed.data.MomentTag.2
        public Class getDataClass() {
            return MomentTag.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public MomentTag mo17830newInstance() {
            return new MomentTag();
        }

        public boolean parseField(MomentTag momentTag, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "href":
                    momentTag.href = jsonParser.getValueAsString();
                    return true;
                case "icon":
                    momentTag.icon = jsonParser.getValueAsString();
                    return true;
                case "value":
                    momentTag.value = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MomentTag momentTag, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "href":
                case "icon":
                case "value":
                    return true;
                default:
                    return super.parseFieldCheck(momentTag, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MomentTag momentTag, JsonGenerator jsonGenerator) throws IOException {
            String str = momentTag.value;
            if (str != null) {
                jsonGenerator.writeStringField("value", str);
            }
            String str2 = momentTag.href;
            if (str2 != null) {
                jsonGenerator.writeStringField("href", str2);
            }
            String str3 = momentTag.icon;
            if (str3 != null) {
                jsonGenerator.writeStringField("icon", str3);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MomentTag) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MomentTag) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MomentTag new_() {
        MomentTag momentTag = new MomentTag();
        momentTag.nullCheck();
        return momentTag;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MomentTag m19653clone() {
        MomentTag momentTag = new MomentTag();
        momentTag.value = this.value;
        momentTag.href = this.href;
        momentTag.icon = this.icon;
        return momentTag;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MomentTag)) {
            return false;
        }
        MomentTag momentTag = (MomentTag) obj;
        return ValueObject.util_equals(this.value, momentTag.value) && ValueObject.util_equals(this.href, momentTag.href) && ValueObject.util_equals(this.icon, momentTag.icon);
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
        String str = this.value;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.href;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.icon;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.value == null) {
            this.value = "";
        }
        if (this.href == null) {
            this.href = "";
        }
        if (this.icon == null) {
            this.icon = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
