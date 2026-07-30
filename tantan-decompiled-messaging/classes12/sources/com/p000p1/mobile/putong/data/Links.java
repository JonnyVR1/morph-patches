package com.p000p1.mobile.putong.data;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import l.cll;
import l.nb5;
import l.vwb;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class Links extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "links";

    @Nullable
    @ProtobufIndex(index = 2)
    public String next;

    @Nullable
    @ProtobufIndex(index = 1)
    public String previous;
    public static ProtobufAdapter<Links> PROTOBUF_ADAPTER = new MessageNanoAdapter<Links>() { // from class: com.p1.mobile.putong.data.Links.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Links links) {
            String str = links.previous;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = links.next;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) links).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Links m18298parse(nb5 nb5Var) throws IOException {
            Links links = new Links();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 10) {
                    links.previous = nb5Var.s();
                } else {
                    if (iU != 18) {
                        return links;
                    }
                    links.next = nb5Var.s();
                }
            }
        }

        public void serialize(Links links, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = links.previous;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = links.next;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<Links> JSON_ADAPTER = new ObjectJsonAdapter<Links>() { // from class: com.p1.mobile.putong.data.Links.2
        public Class getDataClass() {
            return Links.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public Links mo17830newInstance() {
            return new Links();
        }

        public boolean parseField(Links links, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("previous")) {
                links.previous = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("next")) {
                return false;
            }
            links.next = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(Links links, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("previous") || str.equals("next")) {
                return true;
            }
            return super.parseFieldCheck(links, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Links links, JsonGenerator jsonGenerator) throws IOException {
            String str = links.previous;
            if (str != null) {
                jsonGenerator.writeStringField("previous", str);
            }
            String str2 = links.next;
            if (str2 != null) {
                jsonGenerator.writeStringField("next", str2);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Links) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Links) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static double decodedApiTime(String str, final String str2) {
        if (str == null) {
            return 0.0d;
        }
        String str3 = (String) vwb.s(str.split("&"), new w9j() { // from class: l.umr
            public final Object call(Object obj) {
                return Boolean.valueOf(((String) obj).contains(str2));
            }
        });
        String strDecode = null;
        String str4 = TextUtils.isEmpty(str3) ? null : (String) vwb.s(str3.split("="), new w9j() { // from class: l.vmr
            public final Object call(Object obj) {
                return Boolean.valueOf(!str2.equals((String) obj));
            }
        });
        if (TextUtils.isEmpty(str4)) {
            return 0.0d;
        }
        try {
            strDecode = URLDecoder.decode(str4, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
        }
        return Converter.apiTimeStringToDate(strDecode);
    }

    public static Links new_() {
        Links links = new Links();
        links.nullCheck();
        return links;
    }

    public static void normalize(@NonNull Links links) {
        links.next = normalizeUrl(links.next);
        links.previous = normalizeUrl(links.previous);
    }

    public static String normalizeUrl(String str) {
        cll cllVarR;
        if (str == null || (cllVarR = cll.r(str)) == null) {
            return null;
        }
        boolean zEquals = cllVarR.m().equals("graph.facebook.com");
        int iE = cllVarR.E();
        cll.a aVarB = new cll.a().v("http").h("a.b.com").b("a");
        for (int i = 0; i < iE; i++) {
            String strB = cllVarR.B(i);
            if (zEquals) {
                if (strB.equals(OMSSwipeMoment.after)) {
                    return cllVarR.D(i);
                }
            } else if (strB.equals("since") || strB.equals("until") || strB.equals("limit") || strB.equals("offset") || strB.equals(OMSTemplateModeType.page) || strB.equals("gid") || strB.equals("countle") || strB.equals("query") || strB.equals("untilFeedId") || strB.equals("sort") || strB.equals("haveRead") || strB.equals("untilSortId") || strB.equals("maxHaveReadSortId") || strB.equals("untilSortID") || strB.equals("untilReadSortID") || strB.equals("sinceReadSortID") || strB.equals(Action.TYPE) || strB.equals("currentSeq") || strB.equals("lastSeq") || strB.equals("expertUserID") || strB.equals("type") || strB.equals("auditStatus") || strB.equals("new_top") || strB.equals("filterDistance") || strB.equals("filterAgeMin") || strB.equals("filterAgeMax") || strB.equals("filter") || strB.equals("subUntil") || strB.equals("untilCount") || strB.equals("refresh") || strB.equals("version") || strB.equals("excludeUsers")) {
                aVarB = aVarB.c(strB, cllVarR.D(i));
            }
        }
        return vwb.j(vwb.j(aVarB.d().toString(), "http://a.b.com/a"), "?");
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Links m18297clone() {
        Links links = new Links();
        links.previous = this.previous;
        links.next = this.next;
        return links;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Links)) {
            return false;
        }
        Links links = (Links) obj;
        return ValueObject.util_equals(this.previous, links.previous) && ValueObject.util_equals(this.next, links.next);
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
        String str = this.previous;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.next;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
    }

    public void onApiParseComplete() {
        normalize(this);
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
