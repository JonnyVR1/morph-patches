package com.p000p1.mobile.putong.core.data;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.regex.Pattern;
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class KnowMyselfShareParams extends ValueObject implements Cloneable, Serializable {
    public static final String PARAMS_SHARE_URL = "url";
    public static final String PARAMS_TITLE = "title";
    public static final String PARAMS_TPID = "tpid";
    public static final String TYPE = "knowmyselfshareparams";
    public static final String TYPE_INTRODUCE = "introduce";
    public static final String TYPE_REPORT = "report";
    public static final String TYPE_UNKNOWN = "unknown";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String desc;

    @Nullable
    @ProtobufIndex(index = 1)
    public String ids;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String imgUrl;

    @NonNull
    @ProtobufIndex(index = 4)
    public String link;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String title;

    @NonNull
    @ProtobufIndex(index = 6)
    public String type;
    public static ProtobufAdapter<KnowMyselfShareParams> PROTOBUF_ADAPTER = new MessageNanoAdapter<KnowMyselfShareParams>() { // from class: com.p1.mobile.putong.core.data.KnowMyselfShareParams.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(KnowMyselfShareParams knowMyselfShareParams) {
            String str = knowMyselfShareParams.ids;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = knowMyselfShareParams.title;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = knowMyselfShareParams.desc;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = knowMyselfShareParams.link;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            String str5 = knowMyselfShareParams.imgUrl;
            if (str5 != null) {
                iO += CodedOutputByteBufferNano.o(5, str5);
            }
            String str6 = knowMyselfShareParams.type;
            if (str6 != null) {
                iO += CodedOutputByteBufferNano.o(6, str6);
            }
            ((MessageNano) knowMyselfShareParams).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public KnowMyselfShareParams m13785parse(nb5 nb5Var) throws IOException {
            KnowMyselfShareParams knowMyselfShareParams = new KnowMyselfShareParams();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (knowMyselfShareParams.title == null) {
                        knowMyselfShareParams.title = "";
                    }
                    if (knowMyselfShareParams.desc == null) {
                        knowMyselfShareParams.desc = "";
                    }
                    if (knowMyselfShareParams.link == null) {
                        knowMyselfShareParams.link = "";
                    }
                    if (knowMyselfShareParams.imgUrl == null) {
                        knowMyselfShareParams.imgUrl = "";
                    }
                    if (knowMyselfShareParams.type != null) {
                        break;
                    }
                    knowMyselfShareParams.type = "";
                    break;
                }
                if (iU == 10) {
                    knowMyselfShareParams.ids = nb5Var.s();
                } else if (iU == 18) {
                    knowMyselfShareParams.title = nb5Var.s();
                } else if (iU == 26) {
                    knowMyselfShareParams.desc = nb5Var.s();
                } else if (iU == 34) {
                    knowMyselfShareParams.link = nb5Var.s();
                } else if (iU == 42) {
                    knowMyselfShareParams.imgUrl = nb5Var.s();
                } else {
                    if (iU != 50) {
                        if (knowMyselfShareParams.title == null) {
                            knowMyselfShareParams.title = "";
                        }
                        if (knowMyselfShareParams.desc == null) {
                            knowMyselfShareParams.desc = "";
                        }
                        if (knowMyselfShareParams.link == null) {
                            knowMyselfShareParams.link = "";
                        }
                        if (knowMyselfShareParams.imgUrl == null) {
                            knowMyselfShareParams.imgUrl = "";
                        }
                        if (knowMyselfShareParams.type != null) {
                            break;
                        }
                        knowMyselfShareParams.type = "";
                        return knowMyselfShareParams;
                    }
                    knowMyselfShareParams.type = nb5Var.s();
                }
            }
            return knowMyselfShareParams;
        }

        public void serialize(KnowMyselfShareParams knowMyselfShareParams, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = knowMyselfShareParams.ids;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = knowMyselfShareParams.title;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = knowMyselfShareParams.desc;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = knowMyselfShareParams.link;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
            String str5 = knowMyselfShareParams.imgUrl;
            if (str5 != null) {
                codedOutputByteBufferNano.R(5, str5);
            }
            String str6 = knowMyselfShareParams.type;
            if (str6 != null) {
                codedOutputByteBufferNano.R(6, str6);
            }
        }
    };
    public static JsonAdapter<KnowMyselfShareParams> JSON_ADAPTER = new ObjectJsonAdapter<KnowMyselfShareParams>() { // from class: com.p1.mobile.putong.core.data.KnowMyselfShareParams.2
        public Class getDataClass() {
            return KnowMyselfShareParams.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public KnowMyselfShareParams m13786newInstance() {
            return new KnowMyselfShareParams();
        }

        public boolean parseField(KnowMyselfShareParams knowMyselfShareParams, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "imgUrl":
                    knowMyselfShareParams.imgUrl = jsonParser.getValueAsString();
                    return true;
                case "ids":
                    knowMyselfShareParams.ids = jsonParser.getValueAsString();
                    return true;
                case "desc":
                    knowMyselfShareParams.desc = jsonParser.getValueAsString();
                    return true;
                case "link":
                    knowMyselfShareParams.link = jsonParser.getValueAsString();
                    return true;
                case "type":
                    knowMyselfShareParams.type = jsonParser.getValueAsString();
                    return true;
                case "title":
                    knowMyselfShareParams.title = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(KnowMyselfShareParams knowMyselfShareParams, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "imgUrl":
                case "ids":
                case "desc":
                case "link":
                case "type":
                case "title":
                    return true;
                default:
                    return super.parseFieldCheck(knowMyselfShareParams, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(KnowMyselfShareParams knowMyselfShareParams, JsonGenerator jsonGenerator) throws IOException {
            String str = knowMyselfShareParams.ids;
            if (str != null) {
                jsonGenerator.writeStringField("ids", str);
            }
            String str2 = knowMyselfShareParams.title;
            if (str2 != null) {
                jsonGenerator.writeStringField(KnowMyselfShareParams.PARAMS_TITLE, str2);
            }
            String str3 = knowMyselfShareParams.desc;
            if (str3 != null) {
                jsonGenerator.writeStringField("desc", str3);
            }
            String str4 = knowMyselfShareParams.link;
            if (str4 != null) {
                jsonGenerator.writeStringField("link", str4);
            }
            String str5 = knowMyselfShareParams.imgUrl;
            if (str5 != null) {
                jsonGenerator.writeStringField("imgUrl", str5);
            }
            String str6 = knowMyselfShareParams.type;
            if (str6 != null) {
                jsonGenerator.writeStringField("type", str6);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((KnowMyselfShareParams) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((KnowMyselfShareParams) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static KnowMyselfShareParams new_() {
        KnowMyselfShareParams knowMyselfShareParams = new KnowMyselfShareParams();
        knowMyselfShareParams.nullCheck();
        return knowMyselfShareParams;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004a  */
    private void tryParseScalePoolId() {
        String str;
        if (TextUtils.isEmpty(this.link)) {
            return;
        }
        int iIndexOf = this.link.indexOf("scalePoolId");
        if (iIndexOf != -1) {
            String[] strArrSplit = this.link.substring(iIndexOf).split(Pattern.quote("&"));
            if (strArrSplit.length > 0) {
                for (String str2 : strArrSplit) {
                    String[] strArrSplit2 = str2.split(Pattern.quote("="));
                    if (strArrSplit2.length == 2 && TextUtils.equals("scalePoolId", strArrSplit2[0])) {
                        str = strArrSplit2[1];
                    }
                }
                str = null;
            } else {
                str = null;
            }
        } else {
            str = null;
        }
        this.ids = str;
    }

    public void changeLinkToShareScheme(String str) {
        if (TextUtils.isEmpty(this.link) || TextUtils.isEmpty(str) || this.link.startsWith("tantan")) {
            return;
        }
        this.link = "tantan://knowMyselfShare?url=" + URLEncoder.encode(URLEncoder.encode(this.link)) + "&title=" + URLEncoder.encode("懂我测试") + "&tpid=" + str;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public KnowMyselfShareParams m13784clone() {
        KnowMyselfShareParams knowMyselfShareParams = new KnowMyselfShareParams();
        knowMyselfShareParams.ids = this.ids;
        knowMyselfShareParams.title = this.title;
        knowMyselfShareParams.desc = this.desc;
        knowMyselfShareParams.link = this.link;
        knowMyselfShareParams.imgUrl = this.imgUrl;
        knowMyselfShareParams.type = this.type;
        return knowMyselfShareParams;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof KnowMyselfShareParams)) {
            return false;
        }
        KnowMyselfShareParams knowMyselfShareParams = (KnowMyselfShareParams) obj;
        return ValueObject.util_equals(this.ids, knowMyselfShareParams.ids) && ValueObject.util_equals(this.title, knowMyselfShareParams.title) && ValueObject.util_equals(this.desc, knowMyselfShareParams.desc) && ValueObject.util_equals(this.link, knowMyselfShareParams.link) && ValueObject.util_equals(this.imgUrl, knowMyselfShareParams.imgUrl) && ValueObject.util_equals(this.type, knowMyselfShareParams.type);
    }

    public void generateTypeByLink() {
        if (TextUtils.isEmpty(this.link)) {
            this.type = "unknown";
            return;
        }
        if (this.link.contains("cp/auth") || this.link.contains("cp/index.html") || this.link.contains("cp/share.html")) {
            this.type = TYPE_REPORT;
        } else if (this.link.contains("#/cepingDetail") || (this.link.contains("ceping/index.html") && this.link.contains("#/detail"))) {
            this.type = TYPE_INTRODUCE;
        } else {
            this.type = "unknown";
        }
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
        String str = this.ids;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.desc;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.link;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.imgUrl;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.type;
        int iHashCode6 = iHashCode5 + (str6 != null ? str6.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode6;
        return iHashCode6;
    }

    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
        if (this.desc == null) {
            this.desc = "";
        }
        if (this.link == null) {
            this.link = "";
        }
        if (this.imgUrl == null) {
            this.imgUrl = "";
        }
        if (this.type == null) {
            this.type = "";
        }
    }

    public void reviseDescTextOfReportType() {
        if (TextUtils.equals(this.type, TYPE_REPORT)) {
            this.desc = "刚做了个测试，快来看看我的报告吧";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }

    public String tryParseTPID() {
        return (TextUtils.isEmpty(this.link) || !this.link.startsWith("tantan")) ? "" : Uri.parse(this.link).getQueryParameter(PARAMS_TPID);
    }

    public void tryParserIdAndType() {
        tryParseScalePoolId();
        generateTypeByLink();
    }

    public boolean valid() {
        return (TextUtils.isEmpty(this.title) || TextUtils.isEmpty(this.desc) || TextUtils.isEmpty(this.link) || TextUtils.isEmpty(this.imgUrl)) ? false : true;
    }
}
