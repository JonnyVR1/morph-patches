package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
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

/* JADX INFO: loaded from: classes10.dex */
public class ExpandedSwipeSvgaConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "expandedswipesvgaconfig";

    @NonNull
    @ProtobufIndex(index = 6)
    public String card_btn_click_dislike;

    @NonNull
    @ProtobufIndex(index = 5)
    public String card_btn_click_like;

    @NonNull
    @ProtobufIndex(index = 7)
    public String card_btn_click_superlike;

    @NonNull
    @ProtobufIndex(index = 4)
    public String card_btn_dislike;

    @NonNull
    @ProtobufIndex(index = 3)
    public String card_btn_like;

    @NonNull
    @ProtobufIndex(index = 2)
    public String card_dislike;

    @NonNull
    @ProtobufIndex(index = 1)
    public String card_like;
    public static ProtobufAdapter<ExpandedSwipeSvgaConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<ExpandedSwipeSvgaConfig>() { // from class: com.p1.mobile.putong.core.data.ExpandedSwipeSvgaConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ExpandedSwipeSvgaConfig expandedSwipeSvgaConfig) {
            String str = expandedSwipeSvgaConfig.card_like;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = expandedSwipeSvgaConfig.card_dislike;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = expandedSwipeSvgaConfig.card_btn_like;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            String str4 = expandedSwipeSvgaConfig.card_btn_dislike;
            if (str4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str4);
            }
            String str5 = expandedSwipeSvgaConfig.card_btn_click_like;
            if (str5 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(5, str5);
            }
            String str6 = expandedSwipeSvgaConfig.card_btn_click_dislike;
            if (str6 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(6, str6);
            }
            String str7 = expandedSwipeSvgaConfig.card_btn_click_superlike;
            if (str7 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(7, str7);
            }
            expandedSwipeSvgaConfig.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ExpandedSwipeSvgaConfig parse(nb5 nb5Var) throws IOException {
            ExpandedSwipeSvgaConfig expandedSwipeSvgaConfig = new ExpandedSwipeSvgaConfig();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (expandedSwipeSvgaConfig.card_like == null) {
                        expandedSwipeSvgaConfig.card_like = "";
                    }
                    if (expandedSwipeSvgaConfig.card_dislike == null) {
                        expandedSwipeSvgaConfig.card_dislike = "";
                    }
                    if (expandedSwipeSvgaConfig.card_btn_like == null) {
                        expandedSwipeSvgaConfig.card_btn_like = "";
                    }
                    if (expandedSwipeSvgaConfig.card_btn_dislike == null) {
                        expandedSwipeSvgaConfig.card_btn_dislike = "";
                    }
                    if (expandedSwipeSvgaConfig.card_btn_click_like == null) {
                        expandedSwipeSvgaConfig.card_btn_click_like = "";
                    }
                    if (expandedSwipeSvgaConfig.card_btn_click_dislike == null) {
                        expandedSwipeSvgaConfig.card_btn_click_dislike = "";
                    }
                    if (expandedSwipeSvgaConfig.card_btn_click_superlike != null) {
                        break;
                    }
                    expandedSwipeSvgaConfig.card_btn_click_superlike = "";
                    break;
                }
                if (iM158752u == 10) {
                    expandedSwipeSvgaConfig.card_like = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    expandedSwipeSvgaConfig.card_dislike = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    expandedSwipeSvgaConfig.card_btn_like = nb5Var.m158750s();
                } else if (iM158752u == 34) {
                    expandedSwipeSvgaConfig.card_btn_dislike = nb5Var.m158750s();
                } else if (iM158752u == 42) {
                    expandedSwipeSvgaConfig.card_btn_click_like = nb5Var.m158750s();
                } else if (iM158752u == 50) {
                    expandedSwipeSvgaConfig.card_btn_click_dislike = nb5Var.m158750s();
                } else {
                    if (iM158752u != 58) {
                        if (expandedSwipeSvgaConfig.card_like == null) {
                            expandedSwipeSvgaConfig.card_like = "";
                        }
                        if (expandedSwipeSvgaConfig.card_dislike == null) {
                            expandedSwipeSvgaConfig.card_dislike = "";
                        }
                        if (expandedSwipeSvgaConfig.card_btn_like == null) {
                            expandedSwipeSvgaConfig.card_btn_like = "";
                        }
                        if (expandedSwipeSvgaConfig.card_btn_dislike == null) {
                            expandedSwipeSvgaConfig.card_btn_dislike = "";
                        }
                        if (expandedSwipeSvgaConfig.card_btn_click_like == null) {
                            expandedSwipeSvgaConfig.card_btn_click_like = "";
                        }
                        if (expandedSwipeSvgaConfig.card_btn_click_dislike == null) {
                            expandedSwipeSvgaConfig.card_btn_click_dislike = "";
                        }
                        if (expandedSwipeSvgaConfig.card_btn_click_superlike != null) {
                            break;
                        }
                        expandedSwipeSvgaConfig.card_btn_click_superlike = "";
                        return expandedSwipeSvgaConfig;
                    }
                    expandedSwipeSvgaConfig.card_btn_click_superlike = nb5Var.m158750s();
                }
            }
            return expandedSwipeSvgaConfig;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ExpandedSwipeSvgaConfig expandedSwipeSvgaConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = expandedSwipeSvgaConfig.card_like;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = expandedSwipeSvgaConfig.card_dislike;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = expandedSwipeSvgaConfig.card_btn_like;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            String str4 = expandedSwipeSvgaConfig.card_btn_dislike;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(4, str4);
            }
            String str5 = expandedSwipeSvgaConfig.card_btn_click_like;
            if (str5 != null) {
                codedOutputByteBufferNano.m17261R(5, str5);
            }
            String str6 = expandedSwipeSvgaConfig.card_btn_click_dislike;
            if (str6 != null) {
                codedOutputByteBufferNano.m17261R(6, str6);
            }
            String str7 = expandedSwipeSvgaConfig.card_btn_click_superlike;
            if (str7 != null) {
                codedOutputByteBufferNano.m17261R(7, str7);
            }
        }
    };
    public static JsonAdapter<ExpandedSwipeSvgaConfig> JSON_ADAPTER = new ObjectJsonAdapter<ExpandedSwipeSvgaConfig>() { // from class: com.p1.mobile.putong.core.data.ExpandedSwipeSvgaConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ExpandedSwipeSvgaConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ExpandedSwipeSvgaConfig newInstance() {
            return new ExpandedSwipeSvgaConfig();
        }

        public boolean parseField(ExpandedSwipeSvgaConfig expandedSwipeSvgaConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "card_btn_click_dislike":
                    expandedSwipeSvgaConfig.card_btn_click_dislike = jsonParser.getValueAsString();
                    return true;
                case "card_like":
                    expandedSwipeSvgaConfig.card_like = jsonParser.getValueAsString();
                    return true;
                case "card_dislike":
                    expandedSwipeSvgaConfig.card_dislike = jsonParser.getValueAsString();
                    return true;
                case "card_btn_click_superlike":
                    expandedSwipeSvgaConfig.card_btn_click_superlike = jsonParser.getValueAsString();
                    return true;
                case "card_btn_dislike":
                    expandedSwipeSvgaConfig.card_btn_dislike = jsonParser.getValueAsString();
                    return true;
                case "card_btn_click_like":
                    expandedSwipeSvgaConfig.card_btn_click_like = jsonParser.getValueAsString();
                    return true;
                case "card_btn_like":
                    expandedSwipeSvgaConfig.card_btn_like = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ExpandedSwipeSvgaConfig expandedSwipeSvgaConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "card_btn_click_dislike":
                case "card_like":
                case "card_dislike":
                case "card_btn_click_superlike":
                case "card_btn_dislike":
                case "card_btn_click_like":
                case "card_btn_like":
                    return true;
                default:
                    return super.parseFieldCheck(expandedSwipeSvgaConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ExpandedSwipeSvgaConfig expandedSwipeSvgaConfig, JsonGenerator jsonGenerator) throws IOException {
            String str = expandedSwipeSvgaConfig.card_like;
            if (str != null) {
                jsonGenerator.writeStringField("card_like", str);
            }
            String str2 = expandedSwipeSvgaConfig.card_dislike;
            if (str2 != null) {
                jsonGenerator.writeStringField("card_dislike", str2);
            }
            String str3 = expandedSwipeSvgaConfig.card_btn_like;
            if (str3 != null) {
                jsonGenerator.writeStringField("card_btn_like", str3);
            }
            String str4 = expandedSwipeSvgaConfig.card_btn_dislike;
            if (str4 != null) {
                jsonGenerator.writeStringField("card_btn_dislike", str4);
            }
            String str5 = expandedSwipeSvgaConfig.card_btn_click_like;
            if (str5 != null) {
                jsonGenerator.writeStringField("card_btn_click_like", str5);
            }
            String str6 = expandedSwipeSvgaConfig.card_btn_click_dislike;
            if (str6 != null) {
                jsonGenerator.writeStringField("card_btn_click_dislike", str6);
            }
            String str7 = expandedSwipeSvgaConfig.card_btn_click_superlike;
            if (str7 != null) {
                jsonGenerator.writeStringField("card_btn_click_superlike", str7);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ExpandedSwipeSvgaConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ExpandedSwipeSvgaConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ExpandedSwipeSvgaConfig new_() {
        ExpandedSwipeSvgaConfig expandedSwipeSvgaConfig = new ExpandedSwipeSvgaConfig();
        expandedSwipeSvgaConfig.nullCheck();
        return expandedSwipeSvgaConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ExpandedSwipeSvgaConfig mo223809clone() {
        ExpandedSwipeSvgaConfig expandedSwipeSvgaConfig = new ExpandedSwipeSvgaConfig();
        expandedSwipeSvgaConfig.card_like = this.card_like;
        expandedSwipeSvgaConfig.card_dislike = this.card_dislike;
        expandedSwipeSvgaConfig.card_btn_like = this.card_btn_like;
        expandedSwipeSvgaConfig.card_btn_dislike = this.card_btn_dislike;
        expandedSwipeSvgaConfig.card_btn_click_like = this.card_btn_click_like;
        expandedSwipeSvgaConfig.card_btn_click_dislike = this.card_btn_click_dislike;
        expandedSwipeSvgaConfig.card_btn_click_superlike = this.card_btn_click_superlike;
        return expandedSwipeSvgaConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ExpandedSwipeSvgaConfig)) {
            return false;
        }
        ExpandedSwipeSvgaConfig expandedSwipeSvgaConfig = (ExpandedSwipeSvgaConfig) obj;
        return ValueObject.util_equals(this.card_like, expandedSwipeSvgaConfig.card_like) && ValueObject.util_equals(this.card_dislike, expandedSwipeSvgaConfig.card_dislike) && ValueObject.util_equals(this.card_btn_like, expandedSwipeSvgaConfig.card_btn_like) && ValueObject.util_equals(this.card_btn_dislike, expandedSwipeSvgaConfig.card_btn_dislike) && ValueObject.util_equals(this.card_btn_click_like, expandedSwipeSvgaConfig.card_btn_click_like) && ValueObject.util_equals(this.card_btn_click_dislike, expandedSwipeSvgaConfig.card_btn_click_dislike) && ValueObject.util_equals(this.card_btn_click_superlike, expandedSwipeSvgaConfig.card_btn_click_superlike);
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
        int i2 = i * 41;
        String str = this.card_like;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.card_dislike;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.card_btn_like;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.card_btn_dislike;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.card_btn_click_like;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.card_btn_click_dislike;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.card_btn_click_superlike;
        int iHashCode7 = iHashCode6 + (str7 != null ? str7.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.card_like == null) {
            this.card_like = "";
        }
        if (this.card_dislike == null) {
            this.card_dislike = "";
        }
        if (this.card_btn_like == null) {
            this.card_btn_like = "";
        }
        if (this.card_btn_dislike == null) {
            this.card_btn_dislike = "";
        }
        if (this.card_btn_click_like == null) {
            this.card_btn_click_like = "";
        }
        if (this.card_btn_click_dislike == null) {
            this.card_btn_click_dislike = "";
        }
        if (this.card_btn_click_superlike == null) {
            this.card_btn_click_superlike = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
