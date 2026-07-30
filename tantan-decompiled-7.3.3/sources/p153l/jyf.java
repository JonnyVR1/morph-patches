package p153l;

import android.content.Context;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.FakeGoodLifeUserInfo;
import com.p051p1.mobile.putong.core.data.UserHomeMode;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.MarryEditProfileSeriesAct;
import com.p051p1.mobile.putong.core.p058ui.profile.MediaReorderCard;
import com.p051p1.mobile.putong.core.profile.R$string;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class jyf {

    /* JADX INFO: renamed from: a */
    public List<FakeGoodLifeUserInfo> f123131a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public List<FakeGoodLifeUserInfo> f123132b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public List<FakeGoodLifeUserInfo> f123133c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public List<FakeGoodLifeUserInfo> f123134d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public List<pf60<String, Integer>> f123135e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public String[] f123136f = {"真实的正面照", "我的日常", "旅行经历", "兴趣爱好", "我的才艺", "我的宠物", "游戏战绩", "我的厨艺", "任意生活照"};

    /* JADX INFO: renamed from: g */
    public String[] f123137g = {"真实的正面照", "户外照", "全身照", "兴趣爱好", "我的才艺", "我的宠物", "游戏战绩", "我的厨艺", "任意生活照"};

    /* JADX INFO: renamed from: a */
    public void m147540a(String[] strArr, int i) {
        for (String str : strArr) {
            this.f123135e.add(new pf60<>(str, Integer.valueOf(i)));
        }
    }

    /* JADX INFO: renamed from: b */
    public jyf m147541b(Context context, MediaReorderCard.CardDataType cardDataType) {
        boolean z = (xra.m212798q() && CoreModule.f18264c.f20381e0.f89178Z3.get().equals(UserHomeMode.marryMode)) ? false : true;
        if (xra.m212804w() && z) {
            if (!xra.m212792k()) {
                m147540a(this.f123136f, kbc0.f124921w1);
                return this;
            }
            if (!CoreModule.m30933P().m143405a().mo34609v4() || (context instanceof MarryEditProfileSeriesAct)) {
                m147540a(this.f123137g, kbc0.f124927y1);
                return this;
            }
            m147540a(this.f123137g, kbc0.f124919w);
            return this;
        }
        if (xra.m212795n() || cardDataType == MediaReorderCard.CardDataType.LIFE) {
            if (cardDataType != MediaReorderCard.CardDataType.DEFAULT && cardDataType != MediaReorderCard.CardDataType.EDIT && cardDataType != MediaReorderCard.CardDataType.DIALOG) {
                m147540a(this.f123137g, kbc0.f124927y1);
                return this;
            }
            this.f123135e.add(new pf60<>("真实的正面照", Integer.valueOf(CoreModule.f18264c.f20381e0.m116600p9().isFemale() ? kbc0.f124851b0 : kbc0.f124863e0)));
            this.f123135e.add(new pf60<>("户外照", Integer.valueOf(kbc0.f124871g0)));
            this.f123135e.add(new pf60<>("全身照", Integer.valueOf(kbc0.f124881j0)));
            this.f123135e.add(new pf60<>("我的宠物", Integer.valueOf(kbc0.f124859d0)));
            this.f123135e.add(new pf60<>("最爱的美食", Integer.valueOf(kbc0.f124855c0)));
            this.f123135e.add(new pf60<>("我的有趣视频", Integer.valueOf(kbc0.f124875h0)));
            return this;
        }
        this.f123135e.add(new pf60<>(context.getString(R$string.f28722j4), Integer.valueOf(CoreModule.f18264c.f20381e0.m116600p9().isFemale() ? kbc0.f124851b0 : kbc0.f124863e0)));
        this.f123135e.add(new pf60<>(context.getString(R$string.f28728k4), Integer.valueOf(kbc0.f124867f0)));
        this.f123135e.add(new pf60<>(context.getString(R$string.f28734l4), Integer.valueOf(kbc0.f124878i0)));
        this.f123135e.add(new pf60<>(context.getString(R$string.f28740m4), Integer.valueOf(kbc0.f124859d0)));
        this.f123135e.add(new pf60<>(context.getString(R$string.f28746n4), Integer.valueOf(kbc0.f124855c0)));
        List<pf60<String, Integer>> list = this.f123135e;
        if (z) {
            list.add(new pf60<>(context.getString(R$string.f28752o4), Integer.valueOf(kbc0.f124875h0)));
        } else {
            list.add(new pf60<>("我的有趣照片", Integer.valueOf(kbc0.f124875h0)));
        }
        if (!z) {
            m147540a(new String[3], kbc0.f124927y1);
        }
        return this;
    }

    /* JADX INFO: renamed from: c */
    public jyf m147542c() {
        FakeGoodLifeUserInfo fakeGoodLifeUserInfoNew_ = FakeGoodLifeUserInfo.new_();
        fakeGoodLifeUserInfoNew_.name = "sunshine";
        fakeGoodLifeUserInfoNew_.likeNum = 1749;
        fakeGoodLifeUserInfoNew_.avatar = kbc0.f124819R;
        fakeGoodLifeUserInfoNew_.picSmall = kbc0.f124837X;
        fakeGoodLifeUserInfoNew_.picBig = "https://auto.tancdn.com/v1/raw/79e47a96-2c37-4d1f-98b0-601b1973bb6812.webp";
        this.f123131a.add(fakeGoodLifeUserInfoNew_);
        FakeGoodLifeUserInfo fakeGoodLifeUserInfoNew_2 = FakeGoodLifeUserInfo.new_();
        fakeGoodLifeUserInfoNew_2.name = "小名叫一一";
        fakeGoodLifeUserInfoNew_2.likeNum = 1425;
        fakeGoodLifeUserInfoNew_2.avatar = kbc0.f124828U;
        fakeGoodLifeUserInfoNew_2.picSmall = kbc0.f124847a0;
        fakeGoodLifeUserInfoNew_2.picBig = "https://auto.tancdn.com/v1/raw/6f4cd239-efbb-410e-b20b-c41dea6e80b512.webp";
        this.f123131a.add(fakeGoodLifeUserInfoNew_2);
        FakeGoodLifeUserInfo fakeGoodLifeUserInfoNew_3 = FakeGoodLifeUserInfo.new_();
        fakeGoodLifeUserInfoNew_3.name = "酱酱酱紫";
        fakeGoodLifeUserInfoNew_3.likeNum = 1687;
        fakeGoodLifeUserInfoNew_3.avatar = kbc0.f124825T;
        fakeGoodLifeUserInfoNew_3.picSmall = kbc0.f124843Z;
        fakeGoodLifeUserInfoNew_3.picBig = "https://auto.tancdn.com/v1/raw/8359e64e-b65c-4172-9f12-01628f6048f912.webp";
        this.f123131a.add(fakeGoodLifeUserInfoNew_3);
        FakeGoodLifeUserInfo fakeGoodLifeUserInfoNew_4 = FakeGoodLifeUserInfo.new_();
        fakeGoodLifeUserInfoNew_4.name = "sunshine";
        fakeGoodLifeUserInfoNew_4.likeNum = 1749;
        fakeGoodLifeUserInfoNew_4.avatar = kbc0.f124783F;
        fakeGoodLifeUserInfoNew_4.picSmall = kbc0.f124801L;
        fakeGoodLifeUserInfoNew_4.picBig = "https://auto.tancdn.com/v1/raw/3c0fd9b1-d5d4-4925-a464-29f6a7dd03d813.webp";
        this.f123132b.add(fakeGoodLifeUserInfoNew_4);
        FakeGoodLifeUserInfo fakeGoodLifeUserInfoNew_5 = FakeGoodLifeUserInfo.new_();
        fakeGoodLifeUserInfoNew_5.name = "小名叫一一";
        fakeGoodLifeUserInfoNew_5.likeNum = 1425;
        fakeGoodLifeUserInfoNew_5.avatar = kbc0.f124792I;
        fakeGoodLifeUserInfoNew_5.picSmall = kbc0.f124810O;
        fakeGoodLifeUserInfoNew_5.picBig = "https://auto.tancdn.com/v1/raw/c1c39370-bb76-4c80-9824-44e9dc075af713.webp";
        this.f123132b.add(fakeGoodLifeUserInfoNew_5);
        FakeGoodLifeUserInfo fakeGoodLifeUserInfoNew_6 = FakeGoodLifeUserInfo.new_();
        fakeGoodLifeUserInfoNew_6.name = "酱酱酱紫";
        fakeGoodLifeUserInfoNew_6.likeNum = 1687;
        fakeGoodLifeUserInfoNew_6.avatar = kbc0.f124789H;
        fakeGoodLifeUserInfoNew_6.picSmall = kbc0.f124807N;
        fakeGoodLifeUserInfoNew_6.picBig = "https://auto.tancdn.com/v1/raw/3d7c1d53-3c5a-4800-ab8b-72a6624779db12.webp";
        this.f123132b.add(fakeGoodLifeUserInfoNew_6);
        FakeGoodLifeUserInfo fakeGoodLifeUserInfoNew_7 = FakeGoodLifeUserInfo.new_();
        fakeGoodLifeUserInfoNew_7.name = "飞鱼罐头";
        fakeGoodLifeUserInfoNew_7.likeNum = 429;
        fakeGoodLifeUserInfoNew_7.avatar = kbc0.f124816Q;
        fakeGoodLifeUserInfoNew_7.picSmall = kbc0.f124834W;
        fakeGoodLifeUserInfoNew_7.picBig = "https://auto.tancdn.com/v1/raw/e43b42e1-224f-4e06-b683-dca16effffe213.webp";
        this.f123133c.add(fakeGoodLifeUserInfoNew_7);
        FakeGoodLifeUserInfo fakeGoodLifeUserInfoNew_8 = FakeGoodLifeUserInfo.new_();
        fakeGoodLifeUserInfoNew_8.name = "yuu";
        fakeGoodLifeUserInfoNew_8.likeNum = 419;
        fakeGoodLifeUserInfoNew_8.avatar = kbc0.f124813P;
        fakeGoodLifeUserInfoNew_8.picSmall = kbc0.f124831V;
        fakeGoodLifeUserInfoNew_8.picBig = "https://auto.tancdn.com/v1/raw/97f3799c-8c47-4f27-91a6-623bf0fba76012.webp";
        this.f123133c.add(fakeGoodLifeUserInfoNew_8);
        FakeGoodLifeUserInfo fakeGoodLifeUserInfoNew_9 = FakeGoodLifeUserInfo.new_();
        fakeGoodLifeUserInfoNew_9.name = "阿z";
        fakeGoodLifeUserInfoNew_9.likeNum = 451;
        fakeGoodLifeUserInfoNew_9.avatar = kbc0.f124822S;
        fakeGoodLifeUserInfoNew_9.picSmall = kbc0.f124840Y;
        fakeGoodLifeUserInfoNew_9.picBig = "https://auto.tancdn.com/v1/raw/3ecbcbf0-9a7b-4793-9059-4d50c2586de813.webp";
        this.f123133c.add(fakeGoodLifeUserInfoNew_9);
        FakeGoodLifeUserInfo fakeGoodLifeUserInfoNew_10 = FakeGoodLifeUserInfo.new_();
        fakeGoodLifeUserInfoNew_10.name = "飞鱼罐头";
        fakeGoodLifeUserInfoNew_10.likeNum = 429;
        fakeGoodLifeUserInfoNew_10.avatar = kbc0.f124780E;
        fakeGoodLifeUserInfoNew_10.picSmall = kbc0.f124798K;
        fakeGoodLifeUserInfoNew_10.picBig = "https://auto.tancdn.com/v1/raw/c8c0431f-00b6-45ab-bb6d-66f37b62635612.webp";
        this.f123134d.add(fakeGoodLifeUserInfoNew_10);
        FakeGoodLifeUserInfo fakeGoodLifeUserInfoNew_11 = FakeGoodLifeUserInfo.new_();
        fakeGoodLifeUserInfoNew_11.name = "yuu";
        fakeGoodLifeUserInfoNew_11.likeNum = 419;
        fakeGoodLifeUserInfoNew_11.avatar = kbc0.f124777D;
        fakeGoodLifeUserInfoNew_11.picSmall = kbc0.f124795J;
        fakeGoodLifeUserInfoNew_11.picBig = "https://auto.tancdn.com/v1/raw/74a296a0-71f4-4be3-9c0f-bde7617e2a1012.webp";
        this.f123134d.add(fakeGoodLifeUserInfoNew_11);
        FakeGoodLifeUserInfo fakeGoodLifeUserInfoNew_12 = FakeGoodLifeUserInfo.new_();
        fakeGoodLifeUserInfoNew_12.name = "阿z";
        fakeGoodLifeUserInfoNew_12.likeNum = 451;
        fakeGoodLifeUserInfoNew_12.avatar = kbc0.f124786G;
        fakeGoodLifeUserInfoNew_12.picSmall = kbc0.f124804M;
        fakeGoodLifeUserInfoNew_12.picBig = "https://auto.tancdn.com/v1/raw/0452e316-19d7-4824-a7e0-d5ed1f5921b813.webp";
        this.f123134d.add(fakeGoodLifeUserInfoNew_12);
        return this;
    }
}
