package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.OMSResourceType;
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
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.asn1.eac.EACTags;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.math.p135ec.Tnaf;
import p153l.nc5;

/* JADX INFO: loaded from: classes10.dex */
public class HomeTabModuleTopic extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "hometabmoduletopic";

    @NonNull
    @ProtobufIndex(index = 4)
    public String background;

    @NonNull
    @ProtobufIndex(index = 18)
    public String broadcastBackground;

    @NonNull
    @ProtobufIndex(index = 23)
    public String broadcastButtonIcon;

    @NonNull
    @ProtobufIndex(index = 22)
    public String broadcastButtonTextFemale;

    @NonNull
    @ProtobufIndex(index = 21)
    public String broadcastButtonTextMale;

    @NonNull
    @ProtobufIndex(index = 20)
    public String broadcastTitleFemale;

    @NonNull
    @ProtobufIndex(index = 19)
    public String broadcastTitleMale;

    @NonNull
    @ProtobufIndex(index = 6)
    public String buttonTextColor;

    @NonNull
    @ProtobufIndex(index = 15)
    public String buyBackground;

    @NonNull
    @ProtobufIndex(index = 14)
    public String buyButtonTextFemale;

    @NonNull
    @ProtobufIndex(index = 13)
    public String buyButtonTextMale;

    @NonNull
    @ProtobufIndex(index = 12)
    public String buySubTitleFemale;

    @NonNull
    @ProtobufIndex(index = 11)
    public String buySubTitleMale;

    @NonNull
    @ProtobufIndex(index = 10)
    public String buyTitleFemale;

    @NonNull
    @ProtobufIndex(index = 9)
    public String buyTitleMale;

    @NonNull
    @ProtobufIndex(index = 2)
    public HomeTabModuleTopicCategory category;

    @NonNull
    @ProtobufIndex(index = 5)
    public String icon;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f21158id;

    @ProtobufIndex(index = 16)
    public boolean limitTime;

    @NonNull
    @ProtobufIndex(index = 17)
    public String matchText;

    @NonNull
    @ProtobufIndex(index = 3)
    public HomeTabModuleTopicShowType showType;

    @NonNull
    @ProtobufIndex(index = 8)
    public String subTitle;

    @NonNull
    @ProtobufIndex(index = 7)
    public String title;
    public static ProtobufAdapter<HomeTabModuleTopic> PROTOBUF_ADAPTER = new MessageNanoAdapter<HomeTabModuleTopic>() { // from class: com.p1.mobile.putong.core.data.HomeTabModuleTopic.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(HomeTabModuleTopic homeTabModuleTopic) {
            String str = homeTabModuleTopic.f21158id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            HomeTabModuleTopicCategory homeTabModuleTopicCategory = homeTabModuleTopic.category;
            if (homeTabModuleTopicCategory != null) {
                iM17288o += CodedOutputByteBufferNano.m17281h(2, homeTabModuleTopicCategory.ordinal());
            }
            HomeTabModuleTopicShowType homeTabModuleTopicShowType = homeTabModuleTopic.showType;
            if (homeTabModuleTopicShowType != null) {
                iM17288o += CodedOutputByteBufferNano.m17281h(3, homeTabModuleTopicShowType.ordinal());
            }
            String str2 = homeTabModuleTopic.background;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str2);
            }
            String str3 = homeTabModuleTopic.icon;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(5, str3);
            }
            String str4 = homeTabModuleTopic.buttonTextColor;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(6, str4);
            }
            String str5 = homeTabModuleTopic.title;
            if (str5 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(7, str5);
            }
            String str6 = homeTabModuleTopic.subTitle;
            if (str6 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(8, str6);
            }
            String str7 = homeTabModuleTopic.buyTitleMale;
            if (str7 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(9, str7);
            }
            String str8 = homeTabModuleTopic.buyTitleFemale;
            if (str8 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(10, str8);
            }
            String str9 = homeTabModuleTopic.buySubTitleMale;
            if (str9 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(11, str9);
            }
            String str10 = homeTabModuleTopic.buySubTitleFemale;
            if (str10 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(12, str10);
            }
            String str11 = homeTabModuleTopic.buyButtonTextMale;
            if (str11 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(13, str11);
            }
            String str12 = homeTabModuleTopic.buyButtonTextFemale;
            if (str12 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(14, str12);
            }
            String str13 = homeTabModuleTopic.buyBackground;
            if (str13 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(15, str13);
            }
            int iM17275b = iM17288o + CodedOutputByteBufferNano.m17275b(16, homeTabModuleTopic.limitTime);
            String str14 = homeTabModuleTopic.matchText;
            if (str14 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(17, str14);
            }
            String str15 = homeTabModuleTopic.broadcastBackground;
            if (str15 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(18, str15);
            }
            String str16 = homeTabModuleTopic.broadcastTitleMale;
            if (str16 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(19, str16);
            }
            String str17 = homeTabModuleTopic.broadcastTitleFemale;
            if (str17 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(20, str17);
            }
            String str18 = homeTabModuleTopic.broadcastButtonTextMale;
            if (str18 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(21, str18);
            }
            String str19 = homeTabModuleTopic.broadcastButtonTextFemale;
            if (str19 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(22, str19);
            }
            String str20 = homeTabModuleTopic.broadcastButtonIcon;
            if (str20 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(23, str20);
            }
            HomeTabModuleTopicCategory homeTabModuleTopicCategory2 = homeTabModuleTopic.category;
            if (homeTabModuleTopicCategory2 != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(24, homeTabModuleTopicCategory2, HomeTabModuleTopicCategory.PROTOBUF_ADAPTER);
            }
            HomeTabModuleTopicShowType homeTabModuleTopicShowType2 = homeTabModuleTopic.showType;
            if (homeTabModuleTopicShowType2 != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(25, homeTabModuleTopicShowType2, HomeTabModuleTopicShowType.PROTOBUF_ADAPTER);
            }
            homeTabModuleTopic.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public HomeTabModuleTopic parse(nc5 nc5Var) throws IOException {
            HomeTabModuleTopic homeTabModuleTopic = new HomeTabModuleTopic();
            Integer numValueOf = null;
            Integer numValueOf2 = null;
            while (true) {
                switch (nc5Var.m162497u()) {
                    case 0:
                        if (homeTabModuleTopic.category == null && numValueOf != null) {
                            homeTabModuleTopic.category = (HomeTabModuleTopicCategory) HomeTabModuleTopicCategory.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (homeTabModuleTopic.showType == null && numValueOf2 != null) {
                            homeTabModuleTopic.showType = (HomeTabModuleTopicShowType) HomeTabModuleTopicShowType.JSON_ADAPTER.newTEnum(null, numValueOf2.intValue());
                        }
                        if (homeTabModuleTopic.f21158id == null) {
                            homeTabModuleTopic.f21158id = "";
                        }
                        if (homeTabModuleTopic.category == null) {
                            homeTabModuleTopic.category = (HomeTabModuleTopicCategory) HomeTabModuleTopicCategory.JSON_ADAPTER.defaultEnum();
                        }
                        if (homeTabModuleTopic.showType == null) {
                            homeTabModuleTopic.showType = (HomeTabModuleTopicShowType) HomeTabModuleTopicShowType.JSON_ADAPTER.defaultEnum();
                        }
                        if (homeTabModuleTopic.background == null) {
                            homeTabModuleTopic.background = "";
                        }
                        if (homeTabModuleTopic.icon == null) {
                            homeTabModuleTopic.icon = "";
                        }
                        if (homeTabModuleTopic.buttonTextColor == null) {
                            homeTabModuleTopic.buttonTextColor = "";
                        }
                        if (homeTabModuleTopic.title == null) {
                            homeTabModuleTopic.title = "";
                        }
                        if (homeTabModuleTopic.subTitle == null) {
                            homeTabModuleTopic.subTitle = "";
                        }
                        if (homeTabModuleTopic.buyTitleMale == null) {
                            homeTabModuleTopic.buyTitleMale = "";
                        }
                        if (homeTabModuleTopic.buyTitleFemale == null) {
                            homeTabModuleTopic.buyTitleFemale = "";
                        }
                        if (homeTabModuleTopic.buySubTitleMale == null) {
                            homeTabModuleTopic.buySubTitleMale = "";
                        }
                        if (homeTabModuleTopic.buySubTitleFemale == null) {
                            homeTabModuleTopic.buySubTitleFemale = "";
                        }
                        if (homeTabModuleTopic.buyButtonTextMale == null) {
                            homeTabModuleTopic.buyButtonTextMale = "";
                        }
                        if (homeTabModuleTopic.buyButtonTextFemale == null) {
                            homeTabModuleTopic.buyButtonTextFemale = "";
                        }
                        if (homeTabModuleTopic.buyBackground == null) {
                            homeTabModuleTopic.buyBackground = "";
                        }
                        if (homeTabModuleTopic.matchText == null) {
                            homeTabModuleTopic.matchText = "";
                        }
                        if (homeTabModuleTopic.broadcastBackground == null) {
                            homeTabModuleTopic.broadcastBackground = "";
                        }
                        if (homeTabModuleTopic.broadcastTitleMale == null) {
                            homeTabModuleTopic.broadcastTitleMale = "";
                        }
                        if (homeTabModuleTopic.broadcastTitleFemale == null) {
                            homeTabModuleTopic.broadcastTitleFemale = "";
                        }
                        if (homeTabModuleTopic.broadcastButtonTextMale == null) {
                            homeTabModuleTopic.broadcastButtonTextMale = "";
                        }
                        if (homeTabModuleTopic.broadcastButtonTextFemale == null) {
                            homeTabModuleTopic.broadcastButtonTextFemale = "";
                        }
                        if (homeTabModuleTopic.broadcastButtonIcon == null) {
                            homeTabModuleTopic.broadcastButtonIcon = "";
                        }
                        break;
                    case 10:
                        homeTabModuleTopic.f21158id = nc5Var.m162495s();
                        continue;
                    case 16:
                        numValueOf = Integer.valueOf(nc5Var.m162486j());
                        continue;
                    case 24:
                        numValueOf2 = Integer.valueOf(nc5Var.m162486j());
                        continue;
                    case 34:
                        homeTabModuleTopic.background = nc5Var.m162495s();
                        continue;
                    case 42:
                        homeTabModuleTopic.icon = nc5Var.m162495s();
                        continue;
                    case 50:
                        homeTabModuleTopic.buttonTextColor = nc5Var.m162495s();
                        continue;
                    case 58:
                        homeTabModuleTopic.title = nc5Var.m162495s();
                        continue;
                    case 66:
                        homeTabModuleTopic.subTitle = nc5Var.m162495s();
                        continue;
                    case 74:
                        homeTabModuleTopic.buyTitleMale = nc5Var.m162495s();
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        homeTabModuleTopic.buyTitleFemale = nc5Var.m162495s();
                        continue;
                    case 90:
                        homeTabModuleTopic.buySubTitleMale = nc5Var.m162495s();
                        continue;
                    case EACTags.FCP_TEMPLATE /* 98 */:
                        homeTabModuleTopic.buySubTitleFemale = nc5Var.m162495s();
                        continue;
                    case 106:
                        homeTabModuleTopic.buyButtonTextMale = nc5Var.m162495s();
                        continue;
                    case 114:
                        homeTabModuleTopic.buyButtonTextFemale = nc5Var.m162495s();
                        continue;
                    case 122:
                        homeTabModuleTopic.buyBackground = nc5Var.m162495s();
                        continue;
                    case 128:
                        homeTabModuleTopic.limitTime = nc5Var.m162483g();
                        continue;
                    case CipherSuite.TLS_PSK_WITH_RC4_128_SHA /* 138 */:
                        homeTabModuleTopic.matchText = nc5Var.m162495s();
                        continue;
                    case CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA /* 146 */:
                        homeTabModuleTopic.broadcastBackground = nc5Var.m162495s();
                        continue;
                    case 154:
                        homeTabModuleTopic.broadcastTitleMale = nc5Var.m162495s();
                        continue;
                    case 162:
                        homeTabModuleTopic.broadcastTitleFemale = nc5Var.m162495s();
                        continue;
                    case CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256 /* 170 */:
                        homeTabModuleTopic.broadcastButtonTextMale = nc5Var.m162495s();
                        continue;
                    case 178:
                        homeTabModuleTopic.broadcastButtonTextFemale = nc5Var.m162495s();
                        continue;
                    case CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256 /* 186 */:
                        homeTabModuleTopic.broadcastButtonIcon = nc5Var.m162495s();
                        continue;
                    case CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256 /* 194 */:
                        homeTabModuleTopic.category = (HomeTabModuleTopicCategory) nc5Var.m162488l(HomeTabModuleTopicCategory.PROTOBUF_ADAPTER);
                        continue;
                    case 202:
                        homeTabModuleTopic.showType = (HomeTabModuleTopicShowType) nc5Var.m162488l(HomeTabModuleTopicShowType.PROTOBUF_ADAPTER);
                        continue;
                    default:
                        if (homeTabModuleTopic.category == null && numValueOf != null) {
                            homeTabModuleTopic.category = (HomeTabModuleTopicCategory) HomeTabModuleTopicCategory.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (homeTabModuleTopic.showType == null && numValueOf2 != null) {
                            homeTabModuleTopic.showType = (HomeTabModuleTopicShowType) HomeTabModuleTopicShowType.JSON_ADAPTER.newTEnum(null, numValueOf2.intValue());
                        }
                        if (homeTabModuleTopic.f21158id == null) {
                            homeTabModuleTopic.f21158id = "";
                        }
                        if (homeTabModuleTopic.category == null) {
                            homeTabModuleTopic.category = (HomeTabModuleTopicCategory) HomeTabModuleTopicCategory.JSON_ADAPTER.defaultEnum();
                        }
                        if (homeTabModuleTopic.showType == null) {
                            homeTabModuleTopic.showType = (HomeTabModuleTopicShowType) HomeTabModuleTopicShowType.JSON_ADAPTER.defaultEnum();
                        }
                        if (homeTabModuleTopic.background == null) {
                            homeTabModuleTopic.background = "";
                        }
                        if (homeTabModuleTopic.icon == null) {
                            homeTabModuleTopic.icon = "";
                        }
                        if (homeTabModuleTopic.buttonTextColor == null) {
                            homeTabModuleTopic.buttonTextColor = "";
                        }
                        if (homeTabModuleTopic.title == null) {
                            homeTabModuleTopic.title = "";
                        }
                        if (homeTabModuleTopic.subTitle == null) {
                            homeTabModuleTopic.subTitle = "";
                        }
                        if (homeTabModuleTopic.buyTitleMale == null) {
                            homeTabModuleTopic.buyTitleMale = "";
                        }
                        if (homeTabModuleTopic.buyTitleFemale == null) {
                            homeTabModuleTopic.buyTitleFemale = "";
                        }
                        if (homeTabModuleTopic.buySubTitleMale == null) {
                            homeTabModuleTopic.buySubTitleMale = "";
                        }
                        if (homeTabModuleTopic.buySubTitleFemale == null) {
                            homeTabModuleTopic.buySubTitleFemale = "";
                        }
                        if (homeTabModuleTopic.buyButtonTextMale == null) {
                            homeTabModuleTopic.buyButtonTextMale = "";
                        }
                        if (homeTabModuleTopic.buyButtonTextFemale == null) {
                            homeTabModuleTopic.buyButtonTextFemale = "";
                        }
                        if (homeTabModuleTopic.buyBackground == null) {
                            homeTabModuleTopic.buyBackground = "";
                        }
                        if (homeTabModuleTopic.matchText == null) {
                            homeTabModuleTopic.matchText = "";
                        }
                        if (homeTabModuleTopic.broadcastBackground == null) {
                            homeTabModuleTopic.broadcastBackground = "";
                        }
                        if (homeTabModuleTopic.broadcastTitleMale == null) {
                            homeTabModuleTopic.broadcastTitleMale = "";
                        }
                        if (homeTabModuleTopic.broadcastTitleFemale == null) {
                            homeTabModuleTopic.broadcastTitleFemale = "";
                        }
                        if (homeTabModuleTopic.broadcastButtonTextMale == null) {
                            homeTabModuleTopic.broadcastButtonTextMale = "";
                        }
                        if (homeTabModuleTopic.broadcastButtonTextFemale == null) {
                            homeTabModuleTopic.broadcastButtonTextFemale = "";
                        }
                        if (homeTabModuleTopic.broadcastButtonIcon == null) {
                            homeTabModuleTopic.broadcastButtonIcon = "";
                            return homeTabModuleTopic;
                        }
                        break;
                }
            }
            return homeTabModuleTopic;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(HomeTabModuleTopic homeTabModuleTopic, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = homeTabModuleTopic.f21158id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            HomeTabModuleTopicCategory homeTabModuleTopicCategory = homeTabModuleTopic.category;
            if (homeTabModuleTopicCategory != null) {
                codedOutputByteBufferNano.m17305G(2, homeTabModuleTopicCategory.ordinal());
            }
            HomeTabModuleTopicShowType homeTabModuleTopicShowType = homeTabModuleTopic.showType;
            if (homeTabModuleTopicShowType != null) {
                codedOutputByteBufferNano.m17305G(3, homeTabModuleTopicShowType.ordinal());
            }
            String str2 = homeTabModuleTopic.background;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(4, str2);
            }
            String str3 = homeTabModuleTopic.icon;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(5, str3);
            }
            String str4 = homeTabModuleTopic.buttonTextColor;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(6, str4);
            }
            String str5 = homeTabModuleTopic.title;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(7, str5);
            }
            String str6 = homeTabModuleTopic.subTitle;
            if (str6 != null) {
                codedOutputByteBufferNano.m17316R(8, str6);
            }
            String str7 = homeTabModuleTopic.buyTitleMale;
            if (str7 != null) {
                codedOutputByteBufferNano.m17316R(9, str7);
            }
            String str8 = homeTabModuleTopic.buyTitleFemale;
            if (str8 != null) {
                codedOutputByteBufferNano.m17316R(10, str8);
            }
            String str9 = homeTabModuleTopic.buySubTitleMale;
            if (str9 != null) {
                codedOutputByteBufferNano.m17316R(11, str9);
            }
            String str10 = homeTabModuleTopic.buySubTitleFemale;
            if (str10 != null) {
                codedOutputByteBufferNano.m17316R(12, str10);
            }
            String str11 = homeTabModuleTopic.buyButtonTextMale;
            if (str11 != null) {
                codedOutputByteBufferNano.m17316R(13, str11);
            }
            String str12 = homeTabModuleTopic.buyButtonTextFemale;
            if (str12 != null) {
                codedOutputByteBufferNano.m17316R(14, str12);
            }
            String str13 = homeTabModuleTopic.buyBackground;
            if (str13 != null) {
                codedOutputByteBufferNano.m17316R(15, str13);
            }
            codedOutputByteBufferNano.m17299A(16, homeTabModuleTopic.limitTime);
            String str14 = homeTabModuleTopic.matchText;
            if (str14 != null) {
                codedOutputByteBufferNano.m17316R(17, str14);
            }
            String str15 = homeTabModuleTopic.broadcastBackground;
            if (str15 != null) {
                codedOutputByteBufferNano.m17316R(18, str15);
            }
            String str16 = homeTabModuleTopic.broadcastTitleMale;
            if (str16 != null) {
                codedOutputByteBufferNano.m17316R(19, str16);
            }
            String str17 = homeTabModuleTopic.broadcastTitleFemale;
            if (str17 != null) {
                codedOutputByteBufferNano.m17316R(20, str17);
            }
            String str18 = homeTabModuleTopic.broadcastButtonTextMale;
            if (str18 != null) {
                codedOutputByteBufferNano.m17316R(21, str18);
            }
            String str19 = homeTabModuleTopic.broadcastButtonTextFemale;
            if (str19 != null) {
                codedOutputByteBufferNano.m17316R(22, str19);
            }
            String str20 = homeTabModuleTopic.broadcastButtonIcon;
            if (str20 != null) {
                codedOutputByteBufferNano.m17316R(23, str20);
            }
            HomeTabModuleTopicCategory homeTabModuleTopicCategory2 = homeTabModuleTopic.category;
            if (homeTabModuleTopicCategory2 != null) {
                codedOutputByteBufferNano.m17309K(24, homeTabModuleTopicCategory2, HomeTabModuleTopicCategory.PROTOBUF_ADAPTER);
            }
            HomeTabModuleTopicShowType homeTabModuleTopicShowType2 = homeTabModuleTopic.showType;
            if (homeTabModuleTopicShowType2 != null) {
                codedOutputByteBufferNano.m17309K(25, homeTabModuleTopicShowType2, HomeTabModuleTopicShowType.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<HomeTabModuleTopic> JSON_ADAPTER = new ObjectJsonAdapter<HomeTabModuleTopic>() { // from class: com.p1.mobile.putong.core.data.HomeTabModuleTopic.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return HomeTabModuleTopic.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public HomeTabModuleTopic newInstance() {
            return new HomeTabModuleTopic();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseField(HomeTabModuleTopic homeTabModuleTopic, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2090050568:
                    if (str.equals("subTitle")) {
                        b = 0;
                    }
                    break;
                case -2030665378:
                    if (str.equals("buyTitleFemale")) {
                        b = 1;
                    }
                    break;
                case -1948191677:
                    if (str.equals("broadcastTitleFemale")) {
                        b = 2;
                    }
                    break;
                case -1676354353:
                    if (str.equals("broadcastBackground")) {
                        b = 3;
                    }
                    break;
                case -1332194002:
                    if (str.equals(OMSResourceType.background)) {
                        b = 4;
                    }
                    break;
                case -338815017:
                    if (str.equals("showType")) {
                        b = 5;
                    }
                    break;
                case -285270236:
                    if (str.equals("buttonTextColor")) {
                        b = 6;
                    }
                    break;
                case -207408956:
                    if (str.equals("broadcastTitleMale")) {
                        b = 7;
                    }
                    break;
                case 3355:
                    if (str.equals("id")) {
                        b = 8;
                    }
                    break;
                case 3226745:
                    if (str.equals("icon")) {
                        b = 9;
                    }
                    break;
                case 14055020:
                    if (str.equals("broadcastButtonIcon")) {
                        b = 10;
                    }
                    break;
                case 33369740:
                    if (str.equals("broadcastButtonTextFemale")) {
                        b = 11;
                    }
                    break;
                case 50511102:
                    if (str.equals("category")) {
                        b = 12;
                    }
                    break;
                case 110371416:
                    if (str.equals("title")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 191394186:
                    if (str.equals("buySubTitleFemale")) {
                        b = 14;
                    }
                    break;
                case 198902354:
                    if (str.equals("buyButtonTextMale")) {
                        b = 15;
                    }
                    break;
                case 451635533:
                    if (str.equals("broadcastButtonTextMale")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case 614017170:
                    if (str.equals("matchText")) {
                        b = 17;
                    }
                    break;
                case 1507573844:
                    if (str.equals("buyBackground")) {
                        b = 18;
                    }
                    break;
                case 1671910347:
                    if (str.equals("buySubTitleMale")) {
                        b = 19;
                    }
                    break;
                case 1744354600:
                    if (str.equals("limitTime")) {
                        b = 20;
                    }
                    break;
                case 1834961055:
                    if (str.equals("buyTitleMale")) {
                        b = 21;
                    }
                    break;
                case 1969920593:
                    if (str.equals("buyButtonTextFemale")) {
                        b = 22;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    homeTabModuleTopic.subTitle = jsonParser.getValueAsString();
                    return true;
                case 1:
                    homeTabModuleTopic.buyTitleFemale = jsonParser.getValueAsString();
                    return true;
                case 2:
                    homeTabModuleTopic.broadcastTitleFemale = jsonParser.getValueAsString();
                    return true;
                case 3:
                    homeTabModuleTopic.broadcastBackground = jsonParser.getValueAsString();
                    return true;
                case 4:
                    homeTabModuleTopic.background = jsonParser.getValueAsString();
                    return true;
                case 5:
                    homeTabModuleTopic.showType = HomeTabModuleTopicShowType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case 6:
                    homeTabModuleTopic.buttonTextColor = jsonParser.getValueAsString();
                    return true;
                case 7:
                    homeTabModuleTopic.broadcastTitleMale = jsonParser.getValueAsString();
                    return true;
                case 8:
                    homeTabModuleTopic.f21158id = jsonParser.getValueAsString();
                    return false;
                case 9:
                    homeTabModuleTopic.icon = jsonParser.getValueAsString();
                    return true;
                case 10:
                    homeTabModuleTopic.broadcastButtonIcon = jsonParser.getValueAsString();
                    return true;
                case 11:
                    homeTabModuleTopic.broadcastButtonTextFemale = jsonParser.getValueAsString();
                    return true;
                case 12:
                    homeTabModuleTopic.category = HomeTabModuleTopicCategory.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case 13:
                    homeTabModuleTopic.title = jsonParser.getValueAsString();
                    return true;
                case 14:
                    homeTabModuleTopic.buySubTitleFemale = jsonParser.getValueAsString();
                    return true;
                case 15:
                    homeTabModuleTopic.buyButtonTextMale = jsonParser.getValueAsString();
                    return true;
                case 16:
                    homeTabModuleTopic.broadcastButtonTextMale = jsonParser.getValueAsString();
                    return true;
                case 17:
                    homeTabModuleTopic.matchText = jsonParser.getValueAsString();
                    return true;
                case 18:
                    homeTabModuleTopic.buyBackground = jsonParser.getValueAsString();
                    return true;
                case 19:
                    homeTabModuleTopic.buySubTitleMale = jsonParser.getValueAsString();
                    return true;
                case 20:
                    homeTabModuleTopic.limitTime = jsonParser.getValueAsBoolean();
                    return true;
                case 21:
                    homeTabModuleTopic.buyTitleMale = jsonParser.getValueAsString();
                    return true;
                case 22:
                    homeTabModuleTopic.buyButtonTextFemale = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public boolean parseFieldCheck(HomeTabModuleTopic homeTabModuleTopic, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -2090050568:
                    if (str.equals("subTitle")) {
                        b = 0;
                    }
                    break;
                case -2030665378:
                    if (str.equals("buyTitleFemale")) {
                        b = 1;
                    }
                    break;
                case -1948191677:
                    if (str.equals("broadcastTitleFemale")) {
                        b = 2;
                    }
                    break;
                case -1676354353:
                    if (str.equals("broadcastBackground")) {
                        b = 3;
                    }
                    break;
                case -1332194002:
                    if (str.equals(OMSResourceType.background)) {
                        b = 4;
                    }
                    break;
                case -338815017:
                    if (str.equals("showType")) {
                        b = 5;
                    }
                    break;
                case -285270236:
                    if (str.equals("buttonTextColor")) {
                        b = 6;
                    }
                    break;
                case -207408956:
                    if (str.equals("broadcastTitleMale")) {
                        b = 7;
                    }
                    break;
                case 3355:
                    if (str.equals("id")) {
                        b = 8;
                    }
                    break;
                case 3226745:
                    if (str.equals("icon")) {
                        b = 9;
                    }
                    break;
                case 14055020:
                    if (str.equals("broadcastButtonIcon")) {
                        b = 10;
                    }
                    break;
                case 33369740:
                    if (str.equals("broadcastButtonTextFemale")) {
                        b = 11;
                    }
                    break;
                case 50511102:
                    if (str.equals("category")) {
                        b = 12;
                    }
                    break;
                case 110371416:
                    if (str.equals("title")) {
                        b = HttpTokens.CARRIAGE_RETURN;
                    }
                    break;
                case 191394186:
                    if (str.equals("buySubTitleFemale")) {
                        b = 14;
                    }
                    break;
                case 198902354:
                    if (str.equals("buyButtonTextMale")) {
                        b = 15;
                    }
                    break;
                case 451635533:
                    if (str.equals("broadcastButtonTextMale")) {
                        b = Tnaf.POW_2_WIDTH;
                    }
                    break;
                case 614017170:
                    if (str.equals("matchText")) {
                        b = 17;
                    }
                    break;
                case 1507573844:
                    if (str.equals("buyBackground")) {
                        b = 18;
                    }
                    break;
                case 1671910347:
                    if (str.equals("buySubTitleMale")) {
                        b = 19;
                    }
                    break;
                case 1744354600:
                    if (str.equals("limitTime")) {
                        b = 20;
                    }
                    break;
                case 1834961055:
                    if (str.equals("buyTitleMale")) {
                        b = 21;
                    }
                    break;
                case 1969920593:
                    if (str.equals("buyButtonTextFemale")) {
                        b = 22;
                    }
                    break;
            }
            switch (b) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    return true;
                case 8:
                    return false;
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                    return true;
                default:
                    return super.parseFieldCheck(homeTabModuleTopic, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(HomeTabModuleTopic homeTabModuleTopic, JsonGenerator jsonGenerator) throws IOException {
            String str = homeTabModuleTopic.f21158id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (homeTabModuleTopic.category != null) {
                jsonGenerator.writeFieldName("category");
                HomeTabModuleTopicCategory.JSON_ADAPTER.serialize(homeTabModuleTopic.category, jsonGenerator, true);
            }
            if (homeTabModuleTopic.showType != null) {
                jsonGenerator.writeFieldName("showType");
                HomeTabModuleTopicShowType.JSON_ADAPTER.serialize(homeTabModuleTopic.showType, jsonGenerator, true);
            }
            String str2 = homeTabModuleTopic.background;
            if (str2 != null) {
                jsonGenerator.writeStringField(OMSResourceType.background, str2);
            }
            String str3 = homeTabModuleTopic.icon;
            if (str3 != null) {
                jsonGenerator.writeStringField("icon", str3);
            }
            String str4 = homeTabModuleTopic.buttonTextColor;
            if (str4 != null) {
                jsonGenerator.writeStringField("buttonTextColor", str4);
            }
            String str5 = homeTabModuleTopic.title;
            if (str5 != null) {
                jsonGenerator.writeStringField("title", str5);
            }
            String str6 = homeTabModuleTopic.subTitle;
            if (str6 != null) {
                jsonGenerator.writeStringField("subTitle", str6);
            }
            String str7 = homeTabModuleTopic.buyTitleMale;
            if (str7 != null) {
                jsonGenerator.writeStringField("buyTitleMale", str7);
            }
            String str8 = homeTabModuleTopic.buyTitleFemale;
            if (str8 != null) {
                jsonGenerator.writeStringField("buyTitleFemale", str8);
            }
            String str9 = homeTabModuleTopic.buySubTitleMale;
            if (str9 != null) {
                jsonGenerator.writeStringField("buySubTitleMale", str9);
            }
            String str10 = homeTabModuleTopic.buySubTitleFemale;
            if (str10 != null) {
                jsonGenerator.writeStringField("buySubTitleFemale", str10);
            }
            String str11 = homeTabModuleTopic.buyButtonTextMale;
            if (str11 != null) {
                jsonGenerator.writeStringField("buyButtonTextMale", str11);
            }
            String str12 = homeTabModuleTopic.buyButtonTextFemale;
            if (str12 != null) {
                jsonGenerator.writeStringField("buyButtonTextFemale", str12);
            }
            String str13 = homeTabModuleTopic.buyBackground;
            if (str13 != null) {
                jsonGenerator.writeStringField("buyBackground", str13);
            }
            jsonGenerator.writeBooleanField("limitTime", homeTabModuleTopic.limitTime);
            String str14 = homeTabModuleTopic.matchText;
            if (str14 != null) {
                jsonGenerator.writeStringField("matchText", str14);
            }
            String str15 = homeTabModuleTopic.broadcastBackground;
            if (str15 != null) {
                jsonGenerator.writeStringField("broadcastBackground", str15);
            }
            String str16 = homeTabModuleTopic.broadcastTitleMale;
            if (str16 != null) {
                jsonGenerator.writeStringField("broadcastTitleMale", str16);
            }
            String str17 = homeTabModuleTopic.broadcastTitleFemale;
            if (str17 != null) {
                jsonGenerator.writeStringField("broadcastTitleFemale", str17);
            }
            String str18 = homeTabModuleTopic.broadcastButtonTextMale;
            if (str18 != null) {
                jsonGenerator.writeStringField("broadcastButtonTextMale", str18);
            }
            String str19 = homeTabModuleTopic.broadcastButtonTextFemale;
            if (str19 != null) {
                jsonGenerator.writeStringField("broadcastButtonTextFemale", str19);
            }
            String str20 = homeTabModuleTopic.broadcastButtonIcon;
            if (str20 != null) {
                jsonGenerator.writeStringField("broadcastButtonIcon", str20);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((HomeTabModuleTopic) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((HomeTabModuleTopic) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static HomeTabModuleTopic new_() {
        HomeTabModuleTopic homeTabModuleTopic = new HomeTabModuleTopic();
        homeTabModuleTopic.nullCheck();
        return homeTabModuleTopic;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public HomeTabModuleTopic mo225055clone() {
        HomeTabModuleTopic homeTabModuleTopic = new HomeTabModuleTopic();
        homeTabModuleTopic.f21158id = this.f21158id;
        homeTabModuleTopic.category = this.category;
        homeTabModuleTopic.showType = this.showType;
        homeTabModuleTopic.background = this.background;
        homeTabModuleTopic.icon = this.icon;
        homeTabModuleTopic.buttonTextColor = this.buttonTextColor;
        homeTabModuleTopic.title = this.title;
        homeTabModuleTopic.subTitle = this.subTitle;
        homeTabModuleTopic.buyTitleMale = this.buyTitleMale;
        homeTabModuleTopic.buyTitleFemale = this.buyTitleFemale;
        homeTabModuleTopic.buySubTitleMale = this.buySubTitleMale;
        homeTabModuleTopic.buySubTitleFemale = this.buySubTitleFemale;
        homeTabModuleTopic.buyButtonTextMale = this.buyButtonTextMale;
        homeTabModuleTopic.buyButtonTextFemale = this.buyButtonTextFemale;
        homeTabModuleTopic.buyBackground = this.buyBackground;
        homeTabModuleTopic.limitTime = this.limitTime;
        homeTabModuleTopic.matchText = this.matchText;
        homeTabModuleTopic.broadcastBackground = this.broadcastBackground;
        homeTabModuleTopic.broadcastTitleMale = this.broadcastTitleMale;
        homeTabModuleTopic.broadcastTitleFemale = this.broadcastTitleFemale;
        homeTabModuleTopic.broadcastButtonTextMale = this.broadcastButtonTextMale;
        homeTabModuleTopic.broadcastButtonTextFemale = this.broadcastButtonTextFemale;
        homeTabModuleTopic.broadcastButtonIcon = this.broadcastButtonIcon;
        return homeTabModuleTopic;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HomeTabModuleTopic)) {
            return false;
        }
        HomeTabModuleTopic homeTabModuleTopic = (HomeTabModuleTopic) obj;
        return ValueObject.util_equals(this.f21158id, homeTabModuleTopic.f21158id) && ValueObject.util_equals(this.category, homeTabModuleTopic.category) && ValueObject.util_equals(this.showType, homeTabModuleTopic.showType) && ValueObject.util_equals(this.background, homeTabModuleTopic.background) && ValueObject.util_equals(this.icon, homeTabModuleTopic.icon) && ValueObject.util_equals(this.buttonTextColor, homeTabModuleTopic.buttonTextColor) && ValueObject.util_equals(this.title, homeTabModuleTopic.title) && ValueObject.util_equals(this.subTitle, homeTabModuleTopic.subTitle) && ValueObject.util_equals(this.buyTitleMale, homeTabModuleTopic.buyTitleMale) && ValueObject.util_equals(this.buyTitleFemale, homeTabModuleTopic.buyTitleFemale) && ValueObject.util_equals(this.buySubTitleMale, homeTabModuleTopic.buySubTitleMale) && ValueObject.util_equals(this.buySubTitleFemale, homeTabModuleTopic.buySubTitleFemale) && ValueObject.util_equals(this.buyButtonTextMale, homeTabModuleTopic.buyButtonTextMale) && ValueObject.util_equals(this.buyButtonTextFemale, homeTabModuleTopic.buyButtonTextFemale) && ValueObject.util_equals(this.buyBackground, homeTabModuleTopic.buyBackground) && this.limitTime == homeTabModuleTopic.limitTime && ValueObject.util_equals(this.matchText, homeTabModuleTopic.matchText) && ValueObject.util_equals(this.broadcastBackground, homeTabModuleTopic.broadcastBackground) && ValueObject.util_equals(this.broadcastTitleMale, homeTabModuleTopic.broadcastTitleMale) && ValueObject.util_equals(this.broadcastTitleFemale, homeTabModuleTopic.broadcastTitleFemale) && ValueObject.util_equals(this.broadcastButtonTextMale, homeTabModuleTopic.broadcastButtonTextMale) && ValueObject.util_equals(this.broadcastButtonTextFemale, homeTabModuleTopic.broadcastButtonTextFemale) && ValueObject.util_equals(this.broadcastButtonIcon, homeTabModuleTopic.broadcastButtonIcon);
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
        String str = this.f21158id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        HomeTabModuleTopicCategory homeTabModuleTopicCategory = this.category;
        int iHashCode2 = (iHashCode + (homeTabModuleTopicCategory != null ? homeTabModuleTopicCategory.hashCode() : 0)) * 41;
        HomeTabModuleTopicShowType homeTabModuleTopicShowType = this.showType;
        int iHashCode3 = (iHashCode2 + (homeTabModuleTopicShowType != null ? homeTabModuleTopicShowType.hashCode() : 0)) * 41;
        String str2 = this.background;
        int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.icon;
        int iHashCode5 = (iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.buttonTextColor;
        int iHashCode6 = (iHashCode5 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.title;
        int iHashCode7 = (iHashCode6 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.subTitle;
        int iHashCode8 = (iHashCode7 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.buyTitleMale;
        int iHashCode9 = (iHashCode8 + (str7 != null ? str7.hashCode() : 0)) * 41;
        String str8 = this.buyTitleFemale;
        int iHashCode10 = (iHashCode9 + (str8 != null ? str8.hashCode() : 0)) * 41;
        String str9 = this.buySubTitleMale;
        int iHashCode11 = (iHashCode10 + (str9 != null ? str9.hashCode() : 0)) * 41;
        String str10 = this.buySubTitleFemale;
        int iHashCode12 = (iHashCode11 + (str10 != null ? str10.hashCode() : 0)) * 41;
        String str11 = this.buyButtonTextMale;
        int iHashCode13 = (iHashCode12 + (str11 != null ? str11.hashCode() : 0)) * 41;
        String str12 = this.buyButtonTextFemale;
        int iHashCode14 = (iHashCode13 + (str12 != null ? str12.hashCode() : 0)) * 41;
        String str13 = this.buyBackground;
        int iHashCode15 = (((iHashCode14 + (str13 != null ? str13.hashCode() : 0)) * 41) + (this.limitTime ? 1231 : 1237)) * 41;
        String str14 = this.matchText;
        int iHashCode16 = (iHashCode15 + (str14 != null ? str14.hashCode() : 0)) * 41;
        String str15 = this.broadcastBackground;
        int iHashCode17 = (iHashCode16 + (str15 != null ? str15.hashCode() : 0)) * 41;
        String str16 = this.broadcastTitleMale;
        int iHashCode18 = (iHashCode17 + (str16 != null ? str16.hashCode() : 0)) * 41;
        String str17 = this.broadcastTitleFemale;
        int iHashCode19 = (iHashCode18 + (str17 != null ? str17.hashCode() : 0)) * 41;
        String str18 = this.broadcastButtonTextMale;
        int iHashCode20 = (iHashCode19 + (str18 != null ? str18.hashCode() : 0)) * 41;
        String str19 = this.broadcastButtonTextFemale;
        int iHashCode21 = (iHashCode20 + (str19 != null ? str19.hashCode() : 0)) * 41;
        String str20 = this.broadcastButtonIcon;
        int iHashCode22 = iHashCode21 + (str20 != null ? str20.hashCode() : 0);
        this.hashCode = iHashCode22;
        return iHashCode22;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f21158id == null) {
            this.f21158id = "";
        }
        if (this.category == null) {
            this.category = (HomeTabModuleTopicCategory) HomeTabModuleTopicCategory.JSON_ADAPTER.defaultEnum();
        }
        if (this.showType == null) {
            this.showType = (HomeTabModuleTopicShowType) HomeTabModuleTopicShowType.JSON_ADAPTER.defaultEnum();
        }
        if (this.background == null) {
            this.background = "";
        }
        if (this.icon == null) {
            this.icon = "";
        }
        if (this.buttonTextColor == null) {
            this.buttonTextColor = "";
        }
        if (this.title == null) {
            this.title = "";
        }
        if (this.subTitle == null) {
            this.subTitle = "";
        }
        if (this.buyTitleMale == null) {
            this.buyTitleMale = "";
        }
        if (this.buyTitleFemale == null) {
            this.buyTitleFemale = "";
        }
        if (this.buySubTitleMale == null) {
            this.buySubTitleMale = "";
        }
        if (this.buySubTitleFemale == null) {
            this.buySubTitleFemale = "";
        }
        if (this.buyButtonTextMale == null) {
            this.buyButtonTextMale = "";
        }
        if (this.buyButtonTextFemale == null) {
            this.buyButtonTextFemale = "";
        }
        if (this.buyBackground == null) {
            this.buyBackground = "";
        }
        if (this.matchText == null) {
            this.matchText = "";
        }
        if (this.broadcastBackground == null) {
            this.broadcastBackground = "";
        }
        if (this.broadcastTitleMale == null) {
            this.broadcastTitleMale = "";
        }
        if (this.broadcastTitleFemale == null) {
            this.broadcastTitleFemale = "";
        }
        if (this.broadcastButtonTextMale == null) {
            this.broadcastButtonTextMale = "";
        }
        if (this.broadcastButtonTextFemale == null) {
            this.broadcastButtonTextFemale = "";
        }
        if (this.broadcastButtonIcon == null) {
            this.broadcastButtonIcon = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
