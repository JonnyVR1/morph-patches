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
    @ProtobufIndex(index = Conversation.SURPRISE_LEVEL_TOP)
    public String buyTitleFemale;

    @NonNull
    @ProtobufIndex(index = 9)
    public String buyTitleMale;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public HomeTabModuleTopicCategory category;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String icon;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f78id;

    @ProtobufIndex(index = 16)
    public boolean limitTime;

    @NonNull
    @ProtobufIndex(index = 17)
    public String matchText;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public HomeTabModuleTopicShowType showType;

    @NonNull
    @ProtobufIndex(index = 8)
    public String subTitle;

    @NonNull
    @ProtobufIndex(index = 7)
    public String title;
    public static ProtobufAdapter<HomeTabModuleTopic> PROTOBUF_ADAPTER = new MessageNanoAdapter<HomeTabModuleTopic>() { // from class: com.p1.mobile.putong.core.data.HomeTabModuleTopic.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(HomeTabModuleTopic homeTabModuleTopic) {
            String str = homeTabModuleTopic.f78id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            HomeTabModuleTopicCategory homeTabModuleTopicCategory = homeTabModuleTopic.category;
            if (homeTabModuleTopicCategory != null) {
                iO += CodedOutputByteBufferNano.h(2, homeTabModuleTopicCategory.ordinal());
            }
            HomeTabModuleTopicShowType homeTabModuleTopicShowType = homeTabModuleTopic.showType;
            if (homeTabModuleTopicShowType != null) {
                iO += CodedOutputByteBufferNano.h(3, homeTabModuleTopicShowType.ordinal());
            }
            String str2 = homeTabModuleTopic.background;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(4, str2);
            }
            String str3 = homeTabModuleTopic.icon;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(5, str3);
            }
            String str4 = homeTabModuleTopic.buttonTextColor;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(6, str4);
            }
            String str5 = homeTabModuleTopic.title;
            if (str5 != null) {
                iO += CodedOutputByteBufferNano.o(7, str5);
            }
            String str6 = homeTabModuleTopic.subTitle;
            if (str6 != null) {
                iO += CodedOutputByteBufferNano.o(8, str6);
            }
            String str7 = homeTabModuleTopic.buyTitleMale;
            if (str7 != null) {
                iO += CodedOutputByteBufferNano.o(9, str7);
            }
            String str8 = homeTabModuleTopic.buyTitleFemale;
            if (str8 != null) {
                iO += CodedOutputByteBufferNano.o(10, str8);
            }
            String str9 = homeTabModuleTopic.buySubTitleMale;
            if (str9 != null) {
                iO += CodedOutputByteBufferNano.o(11, str9);
            }
            String str10 = homeTabModuleTopic.buySubTitleFemale;
            if (str10 != null) {
                iO += CodedOutputByteBufferNano.o(12, str10);
            }
            String str11 = homeTabModuleTopic.buyButtonTextMale;
            if (str11 != null) {
                iO += CodedOutputByteBufferNano.o(13, str11);
            }
            String str12 = homeTabModuleTopic.buyButtonTextFemale;
            if (str12 != null) {
                iO += CodedOutputByteBufferNano.o(14, str12);
            }
            String str13 = homeTabModuleTopic.buyBackground;
            if (str13 != null) {
                iO += CodedOutputByteBufferNano.o(15, str13);
            }
            int iB = iO + CodedOutputByteBufferNano.b(16, homeTabModuleTopic.limitTime);
            String str14 = homeTabModuleTopic.matchText;
            if (str14 != null) {
                iB += CodedOutputByteBufferNano.o(17, str14);
            }
            String str15 = homeTabModuleTopic.broadcastBackground;
            if (str15 != null) {
                iB += CodedOutputByteBufferNano.o(18, str15);
            }
            String str16 = homeTabModuleTopic.broadcastTitleMale;
            if (str16 != null) {
                iB += CodedOutputByteBufferNano.o(19, str16);
            }
            String str17 = homeTabModuleTopic.broadcastTitleFemale;
            if (str17 != null) {
                iB += CodedOutputByteBufferNano.o(20, str17);
            }
            String str18 = homeTabModuleTopic.broadcastButtonTextMale;
            if (str18 != null) {
                iB += CodedOutputByteBufferNano.o(21, str18);
            }
            String str19 = homeTabModuleTopic.broadcastButtonTextFemale;
            if (str19 != null) {
                iB += CodedOutputByteBufferNano.o(22, str19);
            }
            String str20 = homeTabModuleTopic.broadcastButtonIcon;
            if (str20 != null) {
                iB += CodedOutputByteBufferNano.o(23, str20);
            }
            HomeTabModuleTopicCategory homeTabModuleTopicCategory2 = homeTabModuleTopic.category;
            if (homeTabModuleTopicCategory2 != null) {
                iB += CodedOutputByteBufferNano.l(24, homeTabModuleTopicCategory2, HomeTabModuleTopicCategory.PROTOBUF_ADAPTER);
            }
            HomeTabModuleTopicShowType homeTabModuleTopicShowType2 = homeTabModuleTopic.showType;
            if (homeTabModuleTopicShowType2 != null) {
                iB += CodedOutputByteBufferNano.l(25, homeTabModuleTopicShowType2, HomeTabModuleTopicShowType.PROTOBUF_ADAPTER);
            }
            ((MessageNano) homeTabModuleTopic).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public HomeTabModuleTopic m13325parse(nb5 nb5Var) throws IOException {
            HomeTabModuleTopic homeTabModuleTopic = new HomeTabModuleTopic();
            Integer numValueOf = null;
            Integer numValueOf2 = null;
            while (true) {
                switch (nb5Var.u()) {
                    case 0:
                        if (homeTabModuleTopic.category == null && numValueOf != null) {
                            homeTabModuleTopic.category = (HomeTabModuleTopicCategory) HomeTabModuleTopicCategory.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
                        }
                        if (homeTabModuleTopic.showType == null && numValueOf2 != null) {
                            homeTabModuleTopic.showType = (HomeTabModuleTopicShowType) HomeTabModuleTopicShowType.JSON_ADAPTER.newTEnum((String) null, numValueOf2.intValue());
                        }
                        if (homeTabModuleTopic.f78id == null) {
                            homeTabModuleTopic.f78id = "";
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
                    case Conversation.SURPRISE_LEVEL_TOP /* 10 */:
                        homeTabModuleTopic.f78id = nb5Var.s();
                        continue;
                    case 16:
                        numValueOf = Integer.valueOf(nb5Var.j());
                        continue;
                    case 24:
                        numValueOf2 = Integer.valueOf(nb5Var.j());
                        continue;
                    case 34:
                        homeTabModuleTopic.background = nb5Var.s();
                        continue;
                    case 42:
                        homeTabModuleTopic.icon = nb5Var.s();
                        continue;
                    case Conversation.EXPOSURE_LEVEL_TOP /* 50 */:
                        homeTabModuleTopic.buttonTextColor = nb5Var.s();
                        continue;
                    case 58:
                        homeTabModuleTopic.title = nb5Var.s();
                        continue;
                    case 66:
                        homeTabModuleTopic.subTitle = nb5Var.s();
                        continue;
                    case 74:
                        homeTabModuleTopic.buyTitleMale = nb5Var.s();
                        continue;
                    case 82:
                        homeTabModuleTopic.buyTitleFemale = nb5Var.s();
                        continue;
                    case Conversation.LEVEL_TOP_PLATINUM /* 90 */:
                        homeTabModuleTopic.buySubTitleMale = nb5Var.s();
                        continue;
                    case 98:
                        homeTabModuleTopic.buySubTitleFemale = nb5Var.s();
                        continue;
                    case 106:
                        homeTabModuleTopic.buyButtonTextMale = nb5Var.s();
                        continue;
                    case 114:
                        homeTabModuleTopic.buyButtonTextFemale = nb5Var.s();
                        continue;
                    case 122:
                        homeTabModuleTopic.buyBackground = nb5Var.s();
                        continue;
                    case 128:
                        homeTabModuleTopic.limitTime = nb5Var.g();
                        continue;
                    case 138:
                        homeTabModuleTopic.matchText = nb5Var.s();
                        continue;
                    case 146:
                        homeTabModuleTopic.broadcastBackground = nb5Var.s();
                        continue;
                    case 154:
                        homeTabModuleTopic.broadcastTitleMale = nb5Var.s();
                        continue;
                    case 162:
                        homeTabModuleTopic.broadcastTitleFemale = nb5Var.s();
                        continue;
                    case 170:
                        homeTabModuleTopic.broadcastButtonTextMale = nb5Var.s();
                        continue;
                    case 178:
                        homeTabModuleTopic.broadcastButtonTextFemale = nb5Var.s();
                        continue;
                    case 186:
                        homeTabModuleTopic.broadcastButtonIcon = nb5Var.s();
                        continue;
                    case 194:
                        homeTabModuleTopic.category = (HomeTabModuleTopicCategory) nb5Var.l(HomeTabModuleTopicCategory.PROTOBUF_ADAPTER);
                        continue;
                    case 202:
                        homeTabModuleTopic.showType = (HomeTabModuleTopicShowType) nb5Var.l(HomeTabModuleTopicShowType.PROTOBUF_ADAPTER);
                        continue;
                    default:
                        if (homeTabModuleTopic.category == null && numValueOf != null) {
                            homeTabModuleTopic.category = (HomeTabModuleTopicCategory) HomeTabModuleTopicCategory.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
                        }
                        if (homeTabModuleTopic.showType == null && numValueOf2 != null) {
                            homeTabModuleTopic.showType = (HomeTabModuleTopicShowType) HomeTabModuleTopicShowType.JSON_ADAPTER.newTEnum((String) null, numValueOf2.intValue());
                        }
                        if (homeTabModuleTopic.f78id == null) {
                            homeTabModuleTopic.f78id = "";
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

        public void serialize(HomeTabModuleTopic homeTabModuleTopic, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = homeTabModuleTopic.f78id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            HomeTabModuleTopicCategory homeTabModuleTopicCategory = homeTabModuleTopic.category;
            if (homeTabModuleTopicCategory != null) {
                codedOutputByteBufferNano.G(2, homeTabModuleTopicCategory.ordinal());
            }
            HomeTabModuleTopicShowType homeTabModuleTopicShowType = homeTabModuleTopic.showType;
            if (homeTabModuleTopicShowType != null) {
                codedOutputByteBufferNano.G(3, homeTabModuleTopicShowType.ordinal());
            }
            String str2 = homeTabModuleTopic.background;
            if (str2 != null) {
                codedOutputByteBufferNano.R(4, str2);
            }
            String str3 = homeTabModuleTopic.icon;
            if (str3 != null) {
                codedOutputByteBufferNano.R(5, str3);
            }
            String str4 = homeTabModuleTopic.buttonTextColor;
            if (str4 != null) {
                codedOutputByteBufferNano.R(6, str4);
            }
            String str5 = homeTabModuleTopic.title;
            if (str5 != null) {
                codedOutputByteBufferNano.R(7, str5);
            }
            String str6 = homeTabModuleTopic.subTitle;
            if (str6 != null) {
                codedOutputByteBufferNano.R(8, str6);
            }
            String str7 = homeTabModuleTopic.buyTitleMale;
            if (str7 != null) {
                codedOutputByteBufferNano.R(9, str7);
            }
            String str8 = homeTabModuleTopic.buyTitleFemale;
            if (str8 != null) {
                codedOutputByteBufferNano.R(10, str8);
            }
            String str9 = homeTabModuleTopic.buySubTitleMale;
            if (str9 != null) {
                codedOutputByteBufferNano.R(11, str9);
            }
            String str10 = homeTabModuleTopic.buySubTitleFemale;
            if (str10 != null) {
                codedOutputByteBufferNano.R(12, str10);
            }
            String str11 = homeTabModuleTopic.buyButtonTextMale;
            if (str11 != null) {
                codedOutputByteBufferNano.R(13, str11);
            }
            String str12 = homeTabModuleTopic.buyButtonTextFemale;
            if (str12 != null) {
                codedOutputByteBufferNano.R(14, str12);
            }
            String str13 = homeTabModuleTopic.buyBackground;
            if (str13 != null) {
                codedOutputByteBufferNano.R(15, str13);
            }
            codedOutputByteBufferNano.A(16, homeTabModuleTopic.limitTime);
            String str14 = homeTabModuleTopic.matchText;
            if (str14 != null) {
                codedOutputByteBufferNano.R(17, str14);
            }
            String str15 = homeTabModuleTopic.broadcastBackground;
            if (str15 != null) {
                codedOutputByteBufferNano.R(18, str15);
            }
            String str16 = homeTabModuleTopic.broadcastTitleMale;
            if (str16 != null) {
                codedOutputByteBufferNano.R(19, str16);
            }
            String str17 = homeTabModuleTopic.broadcastTitleFemale;
            if (str17 != null) {
                codedOutputByteBufferNano.R(20, str17);
            }
            String str18 = homeTabModuleTopic.broadcastButtonTextMale;
            if (str18 != null) {
                codedOutputByteBufferNano.R(21, str18);
            }
            String str19 = homeTabModuleTopic.broadcastButtonTextFemale;
            if (str19 != null) {
                codedOutputByteBufferNano.R(22, str19);
            }
            String str20 = homeTabModuleTopic.broadcastButtonIcon;
            if (str20 != null) {
                codedOutputByteBufferNano.R(23, str20);
            }
            HomeTabModuleTopicCategory homeTabModuleTopicCategory2 = homeTabModuleTopic.category;
            if (homeTabModuleTopicCategory2 != null) {
                codedOutputByteBufferNano.K(24, homeTabModuleTopicCategory2, HomeTabModuleTopicCategory.PROTOBUF_ADAPTER);
            }
            HomeTabModuleTopicShowType homeTabModuleTopicShowType2 = homeTabModuleTopic.showType;
            if (homeTabModuleTopicShowType2 != null) {
                codedOutputByteBufferNano.K(25, homeTabModuleTopicShowType2, HomeTabModuleTopicShowType.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<HomeTabModuleTopic> JSON_ADAPTER = new ObjectJsonAdapter<HomeTabModuleTopic>() { // from class: com.p1.mobile.putong.core.data.HomeTabModuleTopic.2
        public Class getDataClass() {
            return HomeTabModuleTopic.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public HomeTabModuleTopic m13326newInstance() {
            return new HomeTabModuleTopic();
        }

        public boolean parseField(HomeTabModuleTopic homeTabModuleTopic, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "subTitle":
                    homeTabModuleTopic.subTitle = jsonParser.getValueAsString();
                    return true;
                case "buyTitleFemale":
                    homeTabModuleTopic.buyTitleFemale = jsonParser.getValueAsString();
                    return true;
                case "broadcastTitleFemale":
                    homeTabModuleTopic.broadcastTitleFemale = jsonParser.getValueAsString();
                    return true;
                case "broadcastBackground":
                    homeTabModuleTopic.broadcastBackground = jsonParser.getValueAsString();
                    return true;
                case "background":
                    homeTabModuleTopic.background = jsonParser.getValueAsString();
                    return true;
                case "showType":
                    homeTabModuleTopic.showType = (HomeTabModuleTopicShowType) HomeTabModuleTopicShowType.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "buttonTextColor":
                    homeTabModuleTopic.buttonTextColor = jsonParser.getValueAsString();
                    return true;
                case "broadcastTitleMale":
                    homeTabModuleTopic.broadcastTitleMale = jsonParser.getValueAsString();
                    return true;
                case "id":
                    homeTabModuleTopic.f78id = jsonParser.getValueAsString();
                    return false;
                case "icon":
                    homeTabModuleTopic.icon = jsonParser.getValueAsString();
                    return true;
                case "broadcastButtonIcon":
                    homeTabModuleTopic.broadcastButtonIcon = jsonParser.getValueAsString();
                    return true;
                case "broadcastButtonTextFemale":
                    homeTabModuleTopic.broadcastButtonTextFemale = jsonParser.getValueAsString();
                    return true;
                case "category":
                    homeTabModuleTopic.category = (HomeTabModuleTopicCategory) HomeTabModuleTopicCategory.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "title":
                    homeTabModuleTopic.title = jsonParser.getValueAsString();
                    return true;
                case "buySubTitleFemale":
                    homeTabModuleTopic.buySubTitleFemale = jsonParser.getValueAsString();
                    return true;
                case "buyButtonTextMale":
                    homeTabModuleTopic.buyButtonTextMale = jsonParser.getValueAsString();
                    return true;
                case "broadcastButtonTextMale":
                    homeTabModuleTopic.broadcastButtonTextMale = jsonParser.getValueAsString();
                    return true;
                case "matchText":
                    homeTabModuleTopic.matchText = jsonParser.getValueAsString();
                    return true;
                case "buyBackground":
                    homeTabModuleTopic.buyBackground = jsonParser.getValueAsString();
                    return true;
                case "buySubTitleMale":
                    homeTabModuleTopic.buySubTitleMale = jsonParser.getValueAsString();
                    return true;
                case "limitTime":
                    homeTabModuleTopic.limitTime = jsonParser.getValueAsBoolean();
                    return true;
                case "buyTitleMale":
                    homeTabModuleTopic.buyTitleMale = jsonParser.getValueAsString();
                    return true;
                case "buyButtonTextFemale":
                    homeTabModuleTopic.buyButtonTextFemale = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(HomeTabModuleTopic homeTabModuleTopic, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "subTitle":
                case "buyTitleFemale":
                case "broadcastTitleFemale":
                case "broadcastBackground":
                case "background":
                case "showType":
                case "buttonTextColor":
                case "broadcastTitleMale":
                    return true;
                case "id":
                    return false;
                case "icon":
                case "broadcastButtonIcon":
                case "broadcastButtonTextFemale":
                case "category":
                case "title":
                case "buySubTitleFemale":
                case "buyButtonTextMale":
                case "broadcastButtonTextMale":
                case "matchText":
                case "buyBackground":
                case "buySubTitleMale":
                case "limitTime":
                case "buyTitleMale":
                case "buyButtonTextFemale":
                    return true;
                default:
                    return super.parseFieldCheck(homeTabModuleTopic, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(HomeTabModuleTopic homeTabModuleTopic, JsonGenerator jsonGenerator) throws IOException {
            String str = homeTabModuleTopic.f78id;
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
                jsonGenerator.writeStringField("background", str2);
            }
            String str3 = homeTabModuleTopic.icon;
            if (str3 != null) {
                jsonGenerator.writeStringField(HomeTabModuleTopicShowType.icon, str3);
            }
            String str4 = homeTabModuleTopic.buttonTextColor;
            if (str4 != null) {
                jsonGenerator.writeStringField("buttonTextColor", str4);
            }
            String str5 = homeTabModuleTopic.title;
            if (str5 != null) {
                jsonGenerator.writeStringField(KnowMyselfShareParams.PARAMS_TITLE, str5);
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((HomeTabModuleTopic) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((HomeTabModuleTopic) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static HomeTabModuleTopic new_() {
        HomeTabModuleTopic homeTabModuleTopic = new HomeTabModuleTopic();
        homeTabModuleTopic.nullCheck();
        return homeTabModuleTopic;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public HomeTabModuleTopic m13324clone() {
        HomeTabModuleTopic homeTabModuleTopic = new HomeTabModuleTopic();
        homeTabModuleTopic.f78id = this.f78id;
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
        return ValueObject.util_equals(this.f78id, homeTabModuleTopic.f78id) && ValueObject.util_equals(this.category, homeTabModuleTopic.category) && ValueObject.util_equals(this.showType, homeTabModuleTopic.showType) && ValueObject.util_equals(this.background, homeTabModuleTopic.background) && ValueObject.util_equals(this.icon, homeTabModuleTopic.icon) && ValueObject.util_equals(this.buttonTextColor, homeTabModuleTopic.buttonTextColor) && ValueObject.util_equals(this.title, homeTabModuleTopic.title) && ValueObject.util_equals(this.subTitle, homeTabModuleTopic.subTitle) && ValueObject.util_equals(this.buyTitleMale, homeTabModuleTopic.buyTitleMale) && ValueObject.util_equals(this.buyTitleFemale, homeTabModuleTopic.buyTitleFemale) && ValueObject.util_equals(this.buySubTitleMale, homeTabModuleTopic.buySubTitleMale) && ValueObject.util_equals(this.buySubTitleFemale, homeTabModuleTopic.buySubTitleFemale) && ValueObject.util_equals(this.buyButtonTextMale, homeTabModuleTopic.buyButtonTextMale) && ValueObject.util_equals(this.buyButtonTextFemale, homeTabModuleTopic.buyButtonTextFemale) && ValueObject.util_equals(this.buyBackground, homeTabModuleTopic.buyBackground) && this.limitTime == homeTabModuleTopic.limitTime && ValueObject.util_equals(this.matchText, homeTabModuleTopic.matchText) && ValueObject.util_equals(this.broadcastBackground, homeTabModuleTopic.broadcastBackground) && ValueObject.util_equals(this.broadcastTitleMale, homeTabModuleTopic.broadcastTitleMale) && ValueObject.util_equals(this.broadcastTitleFemale, homeTabModuleTopic.broadcastTitleFemale) && ValueObject.util_equals(this.broadcastButtonTextMale, homeTabModuleTopic.broadcastButtonTextMale) && ValueObject.util_equals(this.broadcastButtonTextFemale, homeTabModuleTopic.broadcastButtonTextFemale) && ValueObject.util_equals(this.broadcastButtonIcon, homeTabModuleTopic.broadcastButtonIcon);
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
        String str = this.f78id;
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
        ((ValueObject) this).hashCode = iHashCode22;
        return iHashCode22;
    }

    public void nullCheck() {
        if (this.f78id == null) {
            this.f78id = "";
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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
