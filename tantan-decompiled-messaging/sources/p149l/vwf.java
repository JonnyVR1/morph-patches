package p149l;

import android.content.Context;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.FakeGoodLifeUserInfo;
import com.p046p1.mobile.putong.core.data.UserHomeMode;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.MarryEditProfileSeriesAct;
import com.p046p1.mobile.putong.core.p053ui.profile.MediaReorderCard;
import com.p046p1.mobile.putong.core.profile.R$string;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class vwf {

    /* JADX INFO: renamed from: a */
    public List<FakeGoodLifeUserInfo> f183331a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public List<FakeGoodLifeUserInfo> f183332b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public List<FakeGoodLifeUserInfo> f183333c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public List<FakeGoodLifeUserInfo> f183334d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public List<j760<String, Integer>> f183335e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public String[] f183336f = {"真实的正面照", "我的日常", "旅行经历", "兴趣爱好", "我的才艺", "我的宠物", "游戏战绩", "我的厨艺", "任意生活照"};

    /* JADX INFO: renamed from: g */
    public String[] f183337g = {"真实的正面照", "户外照", "全身照", "兴趣爱好", "我的才艺", "我的宠物", "游戏战绩", "我的厨艺", "任意生活照"};

    /* JADX INFO: renamed from: a */
    public void m200367a(String[] strArr, int i) {
        for (String str : strArr) {
            this.f183335e.add(new j760<>(str, Integer.valueOf(i)));
        }
    }

    /* JADX INFO: renamed from: b */
    public vwf m200368b(Context context, MediaReorderCard.CardDataType cardDataType) {
        boolean z = (lqa.m150979q() && CoreModule.f17545c.f19639e0.f149321Z3.get().equals(UserHomeMode.marryMode)) ? false : true;
        if (lqa.m150985w() && z) {
            if (!lqa.m150973k()) {
                m200367a(this.f183336f, e3c0.f89158w1);
                return this;
            }
            if (!CoreModule.m29935P().m94651a().mo33606v4() || (context instanceof MarryEditProfileSeriesAct)) {
                m200367a(this.f183337g, e3c0.f89164y1);
                return this;
            }
            m200367a(this.f183337g, e3c0.f89156w);
            return this;
        }
        if (lqa.m150976n() || cardDataType == MediaReorderCard.CardDataType.LIFE) {
            if (cardDataType != MediaReorderCard.CardDataType.DEFAULT && cardDataType != MediaReorderCard.CardDataType.EDIT && cardDataType != MediaReorderCard.CardDataType.DIALOG) {
                m200367a(this.f183337g, e3c0.f89164y1);
                return this;
            }
            this.f183335e.add(new j760<>("真实的正面照", Integer.valueOf(CoreModule.f17545c.f19639e0.m169527p9().isFemale() ? e3c0.f89088b0 : e3c0.f89100e0)));
            this.f183335e.add(new j760<>("户外照", Integer.valueOf(e3c0.f89108g0)));
            this.f183335e.add(new j760<>("全身照", Integer.valueOf(e3c0.f89118j0)));
            this.f183335e.add(new j760<>("我的宠物", Integer.valueOf(e3c0.f89096d0)));
            this.f183335e.add(new j760<>("最爱的美食", Integer.valueOf(e3c0.f89092c0)));
            this.f183335e.add(new j760<>("我的有趣视频", Integer.valueOf(e3c0.f89112h0)));
            return this;
        }
        this.f183335e.add(new j760<>(context.getString(R$string.f27874j4), Integer.valueOf(CoreModule.f17545c.f19639e0.m169527p9().isFemale() ? e3c0.f89088b0 : e3c0.f89100e0)));
        this.f183335e.add(new j760<>(context.getString(R$string.f27880k4), Integer.valueOf(e3c0.f89104f0)));
        this.f183335e.add(new j760<>(context.getString(R$string.f27886l4), Integer.valueOf(e3c0.f89115i0)));
        this.f183335e.add(new j760<>(context.getString(R$string.f27892m4), Integer.valueOf(e3c0.f89096d0)));
        this.f183335e.add(new j760<>(context.getString(R$string.f27898n4), Integer.valueOf(e3c0.f89092c0)));
        List<j760<String, Integer>> list = this.f183335e;
        if (z) {
            list.add(new j760<>(context.getString(R$string.f27904o4), Integer.valueOf(e3c0.f89112h0)));
        } else {
            list.add(new j760<>("我的有趣照片", Integer.valueOf(e3c0.f89112h0)));
        }
        if (!z) {
            m200367a(new String[3], e3c0.f89164y1);
        }
        return this;
    }

    /* JADX INFO: renamed from: c */
    public vwf m200369c() {
        FakeGoodLifeUserInfo fakeGoodLifeUserInfoNew_ = FakeGoodLifeUserInfo.new_();
        fakeGoodLifeUserInfoNew_.name = "sunshine";
        fakeGoodLifeUserInfoNew_.likeNum = 1749;
        fakeGoodLifeUserInfoNew_.avatar = e3c0.f89056R;
        fakeGoodLifeUserInfoNew_.picSmall = e3c0.f89074X;
        fakeGoodLifeUserInfoNew_.picBig = "https://auto.tancdn.com/v1/raw/79e47a96-2c37-4d1f-98b0-601b1973bb6812.webp";
        this.f183331a.add(fakeGoodLifeUserInfoNew_);
        FakeGoodLifeUserInfo fakeGoodLifeUserInfoNew_2 = FakeGoodLifeUserInfo.new_();
        fakeGoodLifeUserInfoNew_2.name = "小名叫一一";
        fakeGoodLifeUserInfoNew_2.likeNum = 1425;
        fakeGoodLifeUserInfoNew_2.avatar = e3c0.f89065U;
        fakeGoodLifeUserInfoNew_2.picSmall = e3c0.f89084a0;
        fakeGoodLifeUserInfoNew_2.picBig = "https://auto.tancdn.com/v1/raw/6f4cd239-efbb-410e-b20b-c41dea6e80b512.webp";
        this.f183331a.add(fakeGoodLifeUserInfoNew_2);
        FakeGoodLifeUserInfo fakeGoodLifeUserInfoNew_3 = FakeGoodLifeUserInfo.new_();
        fakeGoodLifeUserInfoNew_3.name = "酱酱酱紫";
        fakeGoodLifeUserInfoNew_3.likeNum = 1687;
        fakeGoodLifeUserInfoNew_3.avatar = e3c0.f89062T;
        fakeGoodLifeUserInfoNew_3.picSmall = e3c0.f89080Z;
        fakeGoodLifeUserInfoNew_3.picBig = "https://auto.tancdn.com/v1/raw/8359e64e-b65c-4172-9f12-01628f6048f912.webp";
        this.f183331a.add(fakeGoodLifeUserInfoNew_3);
        FakeGoodLifeUserInfo fakeGoodLifeUserInfoNew_4 = FakeGoodLifeUserInfo.new_();
        fakeGoodLifeUserInfoNew_4.name = "sunshine";
        fakeGoodLifeUserInfoNew_4.likeNum = 1749;
        fakeGoodLifeUserInfoNew_4.avatar = e3c0.f89020F;
        fakeGoodLifeUserInfoNew_4.picSmall = e3c0.f89038L;
        fakeGoodLifeUserInfoNew_4.picBig = "https://auto.tancdn.com/v1/raw/3c0fd9b1-d5d4-4925-a464-29f6a7dd03d813.webp";
        this.f183332b.add(fakeGoodLifeUserInfoNew_4);
        FakeGoodLifeUserInfo fakeGoodLifeUserInfoNew_5 = FakeGoodLifeUserInfo.new_();
        fakeGoodLifeUserInfoNew_5.name = "小名叫一一";
        fakeGoodLifeUserInfoNew_5.likeNum = 1425;
        fakeGoodLifeUserInfoNew_5.avatar = e3c0.f89029I;
        fakeGoodLifeUserInfoNew_5.picSmall = e3c0.f89047O;
        fakeGoodLifeUserInfoNew_5.picBig = "https://auto.tancdn.com/v1/raw/c1c39370-bb76-4c80-9824-44e9dc075af713.webp";
        this.f183332b.add(fakeGoodLifeUserInfoNew_5);
        FakeGoodLifeUserInfo fakeGoodLifeUserInfoNew_6 = FakeGoodLifeUserInfo.new_();
        fakeGoodLifeUserInfoNew_6.name = "酱酱酱紫";
        fakeGoodLifeUserInfoNew_6.likeNum = 1687;
        fakeGoodLifeUserInfoNew_6.avatar = e3c0.f89026H;
        fakeGoodLifeUserInfoNew_6.picSmall = e3c0.f89044N;
        fakeGoodLifeUserInfoNew_6.picBig = "https://auto.tancdn.com/v1/raw/3d7c1d53-3c5a-4800-ab8b-72a6624779db12.webp";
        this.f183332b.add(fakeGoodLifeUserInfoNew_6);
        FakeGoodLifeUserInfo fakeGoodLifeUserInfoNew_7 = FakeGoodLifeUserInfo.new_();
        fakeGoodLifeUserInfoNew_7.name = "飞鱼罐头";
        fakeGoodLifeUserInfoNew_7.likeNum = 429;
        fakeGoodLifeUserInfoNew_7.avatar = e3c0.f89053Q;
        fakeGoodLifeUserInfoNew_7.picSmall = e3c0.f89071W;
        fakeGoodLifeUserInfoNew_7.picBig = "https://auto.tancdn.com/v1/raw/e43b42e1-224f-4e06-b683-dca16effffe213.webp";
        this.f183333c.add(fakeGoodLifeUserInfoNew_7);
        FakeGoodLifeUserInfo fakeGoodLifeUserInfoNew_8 = FakeGoodLifeUserInfo.new_();
        fakeGoodLifeUserInfoNew_8.name = "yuu";
        fakeGoodLifeUserInfoNew_8.likeNum = 419;
        fakeGoodLifeUserInfoNew_8.avatar = e3c0.f89050P;
        fakeGoodLifeUserInfoNew_8.picSmall = e3c0.f89068V;
        fakeGoodLifeUserInfoNew_8.picBig = "https://auto.tancdn.com/v1/raw/97f3799c-8c47-4f27-91a6-623bf0fba76012.webp";
        this.f183333c.add(fakeGoodLifeUserInfoNew_8);
        FakeGoodLifeUserInfo fakeGoodLifeUserInfoNew_9 = FakeGoodLifeUserInfo.new_();
        fakeGoodLifeUserInfoNew_9.name = "阿z";
        fakeGoodLifeUserInfoNew_9.likeNum = 451;
        fakeGoodLifeUserInfoNew_9.avatar = e3c0.f89059S;
        fakeGoodLifeUserInfoNew_9.picSmall = e3c0.f89077Y;
        fakeGoodLifeUserInfoNew_9.picBig = "https://auto.tancdn.com/v1/raw/3ecbcbf0-9a7b-4793-9059-4d50c2586de813.webp";
        this.f183333c.add(fakeGoodLifeUserInfoNew_9);
        FakeGoodLifeUserInfo fakeGoodLifeUserInfoNew_10 = FakeGoodLifeUserInfo.new_();
        fakeGoodLifeUserInfoNew_10.name = "飞鱼罐头";
        fakeGoodLifeUserInfoNew_10.likeNum = 429;
        fakeGoodLifeUserInfoNew_10.avatar = e3c0.f89017E;
        fakeGoodLifeUserInfoNew_10.picSmall = e3c0.f89035K;
        fakeGoodLifeUserInfoNew_10.picBig = "https://auto.tancdn.com/v1/raw/c8c0431f-00b6-45ab-bb6d-66f37b62635612.webp";
        this.f183334d.add(fakeGoodLifeUserInfoNew_10);
        FakeGoodLifeUserInfo fakeGoodLifeUserInfoNew_11 = FakeGoodLifeUserInfo.new_();
        fakeGoodLifeUserInfoNew_11.name = "yuu";
        fakeGoodLifeUserInfoNew_11.likeNum = 419;
        fakeGoodLifeUserInfoNew_11.avatar = e3c0.f89014D;
        fakeGoodLifeUserInfoNew_11.picSmall = e3c0.f89032J;
        fakeGoodLifeUserInfoNew_11.picBig = "https://auto.tancdn.com/v1/raw/74a296a0-71f4-4be3-9c0f-bde7617e2a1012.webp";
        this.f183334d.add(fakeGoodLifeUserInfoNew_11);
        FakeGoodLifeUserInfo fakeGoodLifeUserInfoNew_12 = FakeGoodLifeUserInfo.new_();
        fakeGoodLifeUserInfoNew_12.name = "阿z";
        fakeGoodLifeUserInfoNew_12.likeNum = 451;
        fakeGoodLifeUserInfoNew_12.avatar = e3c0.f89023G;
        fakeGoodLifeUserInfoNew_12.picSmall = e3c0.f89041M;
        fakeGoodLifeUserInfoNew_12.picBig = "https://auto.tancdn.com/v1/raw/0452e316-19d7-4824-a7e0-d5ed1f5921b813.webp";
        this.f183334d.add(fakeGoodLifeUserInfoNew_12);
        return this;
    }
}
