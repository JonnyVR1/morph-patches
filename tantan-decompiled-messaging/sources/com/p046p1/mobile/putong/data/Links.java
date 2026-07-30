package com.p046p1.mobile.putong.data;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationActionAfterCountdown;
import com.p046p1.mobile.putong.live.base.data.BLivePkInviteSource;
import com.sina.weibo.sdk.constant.WBConstants;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import com.tantanapp.ijk.media.player.IjkMediaPlayer;
import java.io.IOException;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import p149l.cll;
import p149l.nb5;
import p149l.vwb;
import p149l.w9j;

/* JADX INFO: loaded from: classes12.dex */
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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Links links) {
            String str = links.previous;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = links.next;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            links.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Links parse(nb5 nb5Var) throws IOException {
            Links links = new Links();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 10) {
                    links.previous = nb5Var.m158750s();
                } else {
                    if (iM158752u != 18) {
                        return links;
                    }
                    links.next = nb5Var.m158750s();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Links links, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = links.previous;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = links.next;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
        }
    };
    public static JsonAdapter<Links> JSON_ADAPTER = new ObjectJsonAdapter<Links>() { // from class: com.p1.mobile.putong.data.Links.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Links.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Links newInstance() {
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Links) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Links) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static double decodedApiTime(String str, final String str2) {
        if (str == null) {
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
        String str3 = (String) vwb.m200347s(str.split("&"), new w9j() { // from class: l.umr
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((String) obj).contains(str2));
            }
        });
        String strDecode = null;
        String str4 = TextUtils.isEmpty(str3) ? null : (String) vwb.m200347s(str3.split("="), new w9j() { // from class: l.vmr
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!str2.equals((String) obj));
            }
        });
        if (TextUtils.isEmpty(str4)) {
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
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
        cll cllVarM107501r;
        if (str == null || (cllVarM107501r = cll.m107501r(str)) == null) {
            return null;
        }
        boolean zEquals = cllVarM107501r.m107522m().equals("graph.facebook.com");
        int iM107511E = cllVarM107501r.m107511E();
        cll.C16188a c16188aM107535b = new cll.C16188a().m107552v("http").m107540h("a.b.com").m107535b("a");
        for (int i = 0; i < iM107511E; i++) {
            String strM107508B = cllVarM107501r.m107508B(i);
            if (zEquals) {
                if (strM107508B.equals(OMSSwipeMoment.after)) {
                    return cllVarM107501r.m107510D(i);
                }
            } else if (strM107508B.equals("since") || strM107508B.equals("until") || strM107508B.equals(Constants.KEY_LIMIT) || strM107508B.equals(IjkMediaPlayer.OnNativeInvokeListener.ARG_OFFSET) || strM107508B.equals(OMSTemplateModeType.page) || strM107508B.equals("gid") || strM107508B.equals("countle") || strM107508B.equals(BLivePkInviteSource.query) || strM107508B.equals("untilFeedId") || strM107508B.equals("sort") || strM107508B.equals("haveRead") || strM107508B.equals("untilSortId") || strM107508B.equals("maxHaveReadSortId") || strM107508B.equals("untilSortID") || strM107508B.equals("untilReadSortID") || strM107508B.equals("sinceReadSortID") || strM107508B.equals("action") || strM107508B.equals("currentSeq") || strM107508B.equals("lastSeq") || strM107508B.equals("expertUserID") || strM107508B.equals("type") || strM107508B.equals("auditStatus") || strM107508B.equals("new_top") || strM107508B.equals("filterDistance") || strM107508B.equals("filterAgeMin") || strM107508B.equals("filterAgeMax") || strM107508B.equals("filter") || strM107508B.equals("subUntil") || strM107508B.equals("untilCount") || strM107508B.equals(BLiveOperationActionAfterCountdown.refresh) || strM107508B.equals(WBConstants.AUTH_PARAMS_VERSION) || strM107508B.equals("excludeUsers")) {
                c16188aM107535b = c16188aM107535b.m107536c(strM107508B, cllVarM107501r.m107510D(i));
            }
        }
        return vwb.m200331j(vwb.m200331j(c16188aM107535b.m107537d().toString(), "http://a.b.com/a"), "?");
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Links mo223809clone() {
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "links";
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.previous;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.next;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void onApiParseComplete() {
        normalize(this);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
