package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Industries;
import com.p046p1.mobile.putong.core.data.NewDatingPurpose;
import com.p046p1.mobile.putong.core.data.NewProfileCompletionConfig;
import com.p046p1.mobile.putong.core.data.PhotoLowConfig;
import com.p046p1.mobile.putong.core.data.ProfessionConfig;
import com.p046p1.mobile.putong.core.data.ProfileCompletionConfig;
import com.p046p1.mobile.putong.core.data.ProfileUiUpgradeExpConfig;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public class lqa {
    /* JADX INFO: renamed from: a */
    public static boolean m150963a() {
        return RemoteConfig.m79298x().m79330s("avatar_cards_enable");
    }

    /* JADX INFO: renamed from: b */
    public static boolean m150964b() {
        return RemoteConfig.m79298x().m79330s("book_movies_pic_2_txt");
    }

    /* JADX INFO: renamed from: c */
    public static ProfileCompletionConfig m150965c() {
        return CoreModule.m29935P().m94651a().mo33628xo();
    }

    /* JADX INFO: renamed from: d */
    public static PhotoLowConfig m150966d() {
        try {
            return (PhotoLowConfig) RemoteConfig.m79298x().m79333v("low_photo_config", PhotoLowConfig.JSON_ADAPTER);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static ProfileUiUpgradeExpConfig m150967e() {
        try {
            return (ProfileUiUpgradeExpConfig) RemoteConfig.m79298x().m79333v("profile_mytab_optimize_config", ProfileUiUpgradeExpConfig.JSON_ADAPTER);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m150968f() {
        return CoreModule.m29935P().m94651a().mo158376f4();
    }

    /* JADX INFO: renamed from: g */
    public static boolean m150969g() {
        return CoreModule.m29935P().m94651a().mo33337Hr();
    }

    /* JADX INFO: renamed from: h */
    public static boolean m150970h() {
        return CoreModule.m29935P().m94651a().mo33536lc();
    }

    /* JADX INFO: renamed from: i */
    public static boolean m150971i() {
        return CoreModule.m29935P().m94651a().mo33480cr();
    }

    /* JADX INFO: renamed from: j */
    public static boolean m150972j() {
        return CoreModule.m29935P().m94651a().mo33336Ho();
    }

    /* JADX INFO: renamed from: k */
    public static boolean m150973k() {
        return CoreModule.m29935P().m94651a().mo33535l6();
    }

    /* JADX INFO: renamed from: l */
    public static boolean m150974l() {
        return CoreModule.m29935P().m94651a().mo33436We();
    }

    /* JADX INFO: renamed from: m */
    public static boolean m150975m() {
        return CoreModule.m29935P().m94651a().mo33559p0();
    }

    /* JADX INFO: renamed from: n */
    public static boolean m150976n() {
        return CoreModule.m29935P().m94651a().mo33575rc();
    }

    /* JADX INFO: renamed from: o */
    public static boolean m150977o() {
        return false;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m150978p() {
        return CoreModule.m29935P().m94651a().mo33522ij();
    }

    /* JADX INFO: renamed from: q */
    public static boolean m150979q() {
        return CoreModule.m29935P().m94651a().mo33439X5();
    }

    /* JADX INFO: renamed from: r */
    public static boolean m150980r() {
        return CoreModule.m29935P().m94651a().mo33582s();
    }

    /* JADX INFO: renamed from: s */
    public static NewProfileCompletionConfig m150981s() {
        NewProfileCompletionConfig newProfileCompletionConfigNew_;
        try {
            newProfileCompletionConfigNew_ = ura.m195053e().m195057d().mo33940w() ? (NewProfileCompletionConfig) RemoteConfig.m79298x().m79333v("home_completion_config", NewProfileCompletionConfig.JSON_ADAPTER) : (NewProfileCompletionConfig) RemoteConfig.m79298x().m79333v("profile_dating_completion_config", NewProfileCompletionConfig.JSON_ADAPTER);
        } catch (Exception unused) {
            newProfileCompletionConfigNew_ = null;
        }
        if (newProfileCompletionConfigNew_ == null) {
            newProfileCompletionConfigNew_ = NewProfileCompletionConfig.new_();
            NewDatingPurpose newDatingPurposeNew_ = NewDatingPurpose.new_();
            newProfileCompletionConfigNew_.weight = newDatingPurposeNew_;
            newDatingPurposeNew_.picture = new ArrayList();
            for (int i = 0; i < 9; i++) {
                NewDatingPurpose newDatingPurpose = newProfileCompletionConfigNew_.weight;
                if (i == 0) {
                    newDatingPurpose.picture.add(10);
                } else {
                    newDatingPurpose.picture.add(5);
                }
            }
            NewDatingPurpose newDatingPurpose2 = newProfileCompletionConfigNew_.weight;
            newDatingPurpose2.introduction = 10;
            newDatingPurpose2.question = 5;
            newDatingPurpose2.socialPersonalityTest = 5;
            newDatingPurpose2.information = 10;
            newDatingPurpose2.livingHabit = 5;
            newDatingPurpose2.myAssets = 5;
            newDatingPurpose2.idealType = 5;
            newDatingPurpose2.others = 5;
        }
        return newProfileCompletionConfigNew_;
    }

    /* JADX INFO: renamed from: t */
    public static List<Industries> m150982t(boolean z) {
        try {
            ProfessionConfig professionConfig = (ProfessionConfig) RemoteConfig.m79298x().m79333v("new_profile_industries_departments", ProfessionConfig.JSON_ADAPTER);
            if (professionConfig == null) {
                professionConfig = ProfessionConfig.JSON_ADAPTER.parse("{\"ch\":[{\"name\":\"暂不透露\",\"departments\":[\"暂不透露\"]},{\"name\":\"IT/互联网/通信\",\"departments\":[\"研发\",\"产品\",\"数据分析\",\"销售\",\"设计\",\"测试\",\"运营\",\"编辑\",\"市场商务\",\"公关\",\"运维\",\"行政\",\"人力资源（HR）\",\"采购物流\",\"财税审计\",\"法务\",\"咨询顾问\",\"客服\",\"生产制造\",\"翻译\",\"科研人员\",\"其他\",\"暂不透露\"]},{\"name\":\"党政机关/事业单位\",\"departments\":[\"公务员\",\"事业编\"]},{\"name\":\"金融业\",\"departments\":[\"银行\",\"保险\",\"风投\",\"分析师\",\"交易员\",\"拍卖师\",\"典当业务\",\"研发\",\"产品\",\"销售\",\"设计\",\"测试\",\"运营\",\"编辑\",\"市场商务\",\"公关\",\"运维\",\"行政\",\"人力资源（HR）\",\"财税审计\",\"法务\",\"咨询顾问\",\"客服\",\"翻译\",\"科研人员\",\"其他\",\"暂不透露\"]},{\"name\":\"房地产业/建筑业\",\"departments\":[\"销售\",\"房产中介\",\"物业\",\"工程师\",\"建筑师\",\"装修施工\",\"操作工\",\"采购物流\",\"质检\",\"生产制造\",\"研发\",\"产品\",\"设计\",\"运营\",\"市场商务\",\"公关\",\"运维\",\"行政\",\"人力资源（HR）\",\"财税审计\",\"法务\",\"客服\",\"其他\",\"暂不透露\"]},{\"name\":\"医疗/医药\",\"departments\":[\"医生\",\"护理/护士\",\"辅诊/药剂\",\"销售\",\"科研人员\",\"医药生产\",\"医务\",\"理疗\",\"美容顾问\",\"营养师\",\"宠物医疗\",\"医疗器械\",\"研发\",\"产品\",\"数据分析\",\"设计\",\"运营\",\"市场商务\",\"公关\",\"运维\",\"行政\",\"人力资源（HR）\",\"采购物流\",\"财税审计\",\"法务\",\"咨询顾问\",\"客服\",\"其他\",\"暂不透露\"]},{\"name\":\"文化/传媒/广告\",\"departments\":[\"销售\",\"策划\",\"设计/动画\",\"运营\",\"编辑\",\"记者\",\"公关\",\"编导制作\",\"摄影/摄像\",\"场务\",\"化妆师/造型师\",\"演员/歌手/模特\",\"播音主持/主播\",\"作家/编剧\",\"配音员\",\"研发\",\"产品\",\"数据分析\",\"市场商务\",\"行政\",\"人力资源（HR）\",\"财税审计\",\"法务\",\"咨询顾问\",\"客服\",\"翻译\",\"其他\",\"暂不透露\"]},{\"name\":\"制造业\",\"departments\":[\"销售\",\"设计\",\"研发\",\"生产制造\",\"采购物流\",\"质检\",\"操作工\",\"门店管理\",\"营业员\",\"工程师\",\"产品\",\"数据分析\",\"运营\",\"编辑\",\"市场商务\",\"公关\",\"行政\",\"人力资源（HR）\",\"财税审计\",\"法务\",\"咨询顾问\",\"客服\",\"翻译\",\"科研人员\",\"其他\",\"暂不透露\"]},{\"name\":\"教育/培训/科研\",\"departments\":[\"教师\",\"科研人员\",\"销售\",\"教务\",\"教练\",\"研发\",\"产品\",\"数据分析\",\"设计\",\"运营\",\"编辑\",\"市场商务\",\"公关\",\"行政\",\"人力资源（HR）\",\"财税审计\",\"法务\",\"咨询顾问\",\"客服\",\"翻译\",\"其他\",\"暂不透露\"]},{\"name\":\"贸易/批发/零售\",\"departments\":[\"销售\",\"贸易进出口\",\"采购物流\",\"门店管理\",\"营业员\",\"网店管理\",\"质检\",\"操作工\",\"研发\",\"产品\",\"数据分析\",\"设计\",\"运营\",\"编辑\",\"市场商务\",\"公关\",\"行政\",\"人力资源（HR）\",\"财税审计\",\"法务\",\"咨询顾问\",\"客服\",\"翻译\",\"科研人员\",\"其他\",\"暂不透露\"]},{\"name\":\"服务业\",\"departments\":[\"销售\",\"人力资源（HR）\",\"财税审计\",\"法务\",\"咨询顾问\",\"行政\",\"市场商务\",\"客服\",\"安保\",\"门店管理\",\"营业员\",\"网店管理\",\"厨师\",\"采购物流\",\"导游\",\"美容顾问\",\"健身教练\",\"摄影/摄像\",\"司机\",\"操作工\",\"家政服务\",\"律师\",\"翻译\",\"猎头\",\"其他\",\"暂不透露\"]},{\"name\":\"能源/矿产/电力\",\"departments\":[\"生产制造\",\"设计\",\"工程师\",\"操作工\",\"销售\",\"采购物流\",\"质检\",\"市场商务\",\"公关\",\"人力资源（HR）\",\"行政\",\"客服\",\"财税审计\",\"法务\",\"咨询顾问\",\"研发\",\"其他\",\"暂不透露\"]},{\"name\":\"农林牧渔\",\"departments\":[\"销售\",\"农业种植\",\"林业技术\",\"养殖\",\"科研人员\",\"生产制造\",\"采购物流\",\"质检\",\"操作工\",\"市场商务\",\"公关\",\"人力资源（HR）\",\"行政\",\"客服\",\"财税审计\",\"法务\",\"咨询顾问\",\"设计\",\"工程师\",\"其他\",\"暂不透露\"]},{\"name\":\"学生\",\"departments\":[\"学生\"]},{\"name\":\"其他\",\"departments\":[\"其他\"]}]}");
            }
            if (!NullChecker.m81303a(professionConfig)) {
                return null;
            }
            Locale locale = Locale.getDefault();
            ArrayList arrayList = new ArrayList();
            if (z) {
                arrayList.addAll(professionConfig.f20473ch);
                arrayList.addAll(professionConfig.f20474eh);
                return arrayList;
            }
            if (!locale.getLanguage().startsWith("zh") && !locale.getLanguage().startsWith("zh_HK")) {
                return professionConfig.f20474eh;
            }
            return professionConfig.f20473ch;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: u */
    public static boolean m150983u() {
        return CoreModule.m29935P().m94651a().mo33402Rn();
    }

    /* JADX INFO: renamed from: v */
    public static boolean m150984v() {
        return CoreModule.m29935P().m94651a().mo33566q0();
    }

    /* JADX INFO: renamed from: w */
    public static boolean m150985w() {
        return CoreModule.m29935P().m94651a().mo33614w();
    }
}
