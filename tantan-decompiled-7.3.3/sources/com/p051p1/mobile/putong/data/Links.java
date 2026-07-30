package com.p051p1.mobile.putong.data;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationActionAfterCountdown;
import com.p051p1.mobile.putong.live.base.data.BLivePkInviteSource;
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
import p153l.jyb;
import p153l.nc5;
import p153l.qcj;
import p153l.rnl;

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
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = links.next;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            links.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Links parse(nc5 nc5Var) throws IOException {
            Links links = new Links();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 10) {
                    links.previous = nc5Var.m162495s();
                } else {
                    if (iM162497u != 18) {
                        return links;
                    }
                    links.next = nc5Var.m162495s();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Links links, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = links.previous;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = links.next;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
        }
    };
    public static JsonAdapter<Links> JSON_ADAPTER = new ObjectJsonAdapter<Links>() { // from class: com.p1.mobile.putong.data.Links.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Links.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Links) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Links) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static double decodedApiTime(String str, final String str2) {
        if (str == null) {
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
        String str3 = (String) jyb.m147530s(str.split("&"), new qcj() { // from class: l.vor
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((String) obj).contains(str2));
            }
        });
        String strDecode = null;
        String str4 = TextUtils.isEmpty(str3) ? null : (String) jyb.m147530s(str3.split("="), new qcj() { // from class: l.wor
            @Override // p153l.qcj
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
        rnl rnlVarM182265r;
        if (str == null || (rnlVarM182265r = rnl.m182265r(str)) == null) {
            return null;
        }
        boolean zEquals = rnlVarM182265r.m182286m().equals("graph.facebook.com");
        int iM182275E = rnlVarM182265r.m182275E();
        rnl.C19886a c19886aM182299b = new rnl.C19886a().m182316v("http").m182304h("a.b.com").m182299b("a");
        for (int i = 0; i < iM182275E; i++) {
            String strM182272B = rnlVarM182265r.m182272B(i);
            if (zEquals) {
                if (strM182272B.equals(OMSSwipeMoment.after)) {
                    return rnlVarM182265r.m182274D(i);
                }
            } else if (strM182272B.equals("since") || strM182272B.equals("until") || strM182272B.equals(Constants.KEY_LIMIT) || strM182272B.equals(IjkMediaPlayer.OnNativeInvokeListener.ARG_OFFSET) || strM182272B.equals(OMSTemplateModeType.page) || strM182272B.equals("gid") || strM182272B.equals("countle") || strM182272B.equals(BLivePkInviteSource.query) || strM182272B.equals("untilFeedId") || strM182272B.equals("sort") || strM182272B.equals("haveRead") || strM182272B.equals("untilSortId") || strM182272B.equals("maxHaveReadSortId") || strM182272B.equals("untilSortID") || strM182272B.equals("untilReadSortID") || strM182272B.equals("sinceReadSortID") || strM182272B.equals("action") || strM182272B.equals("currentSeq") || strM182272B.equals("lastSeq") || strM182272B.equals("expertUserID") || strM182272B.equals("type") || strM182272B.equals("auditStatus") || strM182272B.equals("new_top") || strM182272B.equals("filterDistance") || strM182272B.equals("filterAgeMin") || strM182272B.equals("filterAgeMax") || strM182272B.equals("filter") || strM182272B.equals("subUntil") || strM182272B.equals("untilCount") || strM182272B.equals(BLiveOperationActionAfterCountdown.refresh) || strM182272B.equals(WBConstants.AUTH_PARAMS_VERSION) || strM182272B.equals("excludeUsers")) {
                c19886aM182299b = c19886aM182299b.m182300c(strM182272B, rnlVarM182265r.m182274D(i));
            }
        }
        return jyb.m147514j(jyb.m147514j(c19886aM182299b.m182301d().toString(), "http://a.b.com/a"), "?");
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Links mo225055clone() {
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
