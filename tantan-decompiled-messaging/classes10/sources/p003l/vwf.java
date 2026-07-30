package p003l;

import android.content.Context;
import com.p000p1.mobile.putong.core.data.FakeGoodLifeUserInfo;
import com.p000p1.mobile.putong.core.data.UserHomeMode;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.profile.R;
import com.p1.mobile.putong.core.ui.marry.profile.loop.MarryEditProfileSeriesAct;
import com.p1.mobile.putong.core.ui.profile.MediaReorderCard;
import java.util.ArrayList;
import java.util.List;
import l.e3c0;
import l.j760;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class vwf {

    /* JADX INFO: renamed from: a */
    public List<FakeGoodLifeUserInfo> f8081a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public List<FakeGoodLifeUserInfo> f8082b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public List<FakeGoodLifeUserInfo> f8083c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public List<FakeGoodLifeUserInfo> f8084d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public List<j760<String, Integer>> f8085e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public String[] f8086f = {"真实的正面照", "我的日常", "旅行经历", "兴趣爱好", "我的才艺", "我的宠物", "游戏战绩", "我的厨艺", "任意生活照"};

    /* JADX INFO: renamed from: g */
    public String[] f8087g = {"真实的正面照", "户外照", "全身照", "兴趣爱好", "我的才艺", "我的宠物", "游戏战绩", "我的厨艺", "任意生活照"};

    /* JADX INFO: renamed from: a */
    public void m10386a(String[] strArr, int i) {
        for (String str : strArr) {
            this.f8085e.add(new j760<>(str, Integer.valueOf(i)));
        }
    }

    /* JADX INFO: renamed from: b */
    public vwf m10387b(Context context, MediaReorderCard.CardDataType cardDataType) {
        boolean z = (lqa.m7783q() && ((String) CoreModule.c.e0.Z3.get()).equals(UserHomeMode.marryMode)) ? false : true;
        if (lqa.m7789w() && z) {
            if (!lqa.m7777k()) {
                m10386a(this.f8086f, e3c0.w1);
                return this;
            }
            if (!CoreModule.P().a().v4() || (context instanceof MarryEditProfileSeriesAct)) {
                m10386a(this.f8087g, e3c0.y1);
                return this;
            }
            m10386a(this.f8087g, e3c0.w);
            return this;
        }
        if (lqa.m7780n() || cardDataType == MediaReorderCard.CardDataType.LIFE) {
            if (cardDataType != MediaReorderCard.CardDataType.DEFAULT && cardDataType != MediaReorderCard.CardDataType.EDIT && cardDataType != MediaReorderCard.CardDataType.DIALOG) {
                m10386a(this.f8087g, e3c0.y1);
                return this;
            }
            this.f8085e.add(new j760<>("真实的正面照", Integer.valueOf(CoreModule.c.e0.p9().isFemale() ? e3c0.b0 : e3c0.e0)));
            this.f8085e.add(new j760<>("户外照", Integer.valueOf(e3c0.g0)));
            this.f8085e.add(new j760<>("全身照", Integer.valueOf(e3c0.j0)));
            this.f8085e.add(new j760<>("我的宠物", Integer.valueOf(e3c0.d0)));
            this.f8085e.add(new j760<>("最爱的美食", Integer.valueOf(e3c0.c0)));
            this.f8085e.add(new j760<>("我的有趣视频", Integer.valueOf(e3c0.h0)));
            return this;
        }
        this.f8085e.add(new j760<>(context.getString(R.string.j4), Integer.valueOf(CoreModule.c.e0.p9().isFemale() ? e3c0.b0 : e3c0.e0)));
        this.f8085e.add(new j760<>(context.getString(R.string.k4), Integer.valueOf(e3c0.f0)));
        this.f8085e.add(new j760<>(context.getString(R.string.l4), Integer.valueOf(e3c0.i0)));
        this.f8085e.add(new j760<>(context.getString(R.string.m4), Integer.valueOf(e3c0.d0)));
        this.f8085e.add(new j760<>(context.getString(R.string.n4), Integer.valueOf(e3c0.c0)));
        List<j760<String, Integer>> list = this.f8085e;
        if (z) {
            list.add(new j760<>(context.getString(R.string.o4), Integer.valueOf(e3c0.h0)));
        } else {
            list.add(new j760<>("我的有趣照片", Integer.valueOf(e3c0.h0)));
        }
        if (!z) {
            m10386a(new String[3], e3c0.y1);
        }
        return this;
    }

    /* JADX INFO: renamed from: c */
    public vwf m10388c() {
        FakeGoodLifeUserInfo fakeGoodLifeUserInfoNew_ = FakeGoodLifeUserInfo.new_();
        fakeGoodLifeUserInfoNew_.name = "sunshine";
        fakeGoodLifeUserInfoNew_.likeNum = 1749;
        fakeGoodLifeUserInfoNew_.avatar = e3c0.R;
        fakeGoodLifeUserInfoNew_.picSmall = e3c0.X;
        fakeGoodLifeUserInfoNew_.picBig = "https://auto.tancdn.com/v1/raw/79e47a96-2c37-4d1f-98b0-601b1973bb6812.webp";
        this.f8081a.add(fakeGoodLifeUserInfoNew_);
        FakeGoodLifeUserInfo fakeGoodLifeUserInfoNew_2 = FakeGoodLifeUserInfo.new_();
        fakeGoodLifeUserInfoNew_2.name = "小名叫一一";
        fakeGoodLifeUserInfoNew_2.likeNum = 1425;
        fakeGoodLifeUserInfoNew_2.avatar = e3c0.U;
        fakeGoodLifeUserInfoNew_2.picSmall = e3c0.a0;
        fakeGoodLifeUserInfoNew_2.picBig = "https://auto.tancdn.com/v1/raw/6f4cd239-efbb-410e-b20b-c41dea6e80b512.webp";
        this.f8081a.add(fakeGoodLifeUserInfoNew_2);
        FakeGoodLifeUserInfo fakeGoodLifeUserInfoNew_3 = FakeGoodLifeUserInfo.new_();
        fakeGoodLifeUserInfoNew_3.name = "酱酱酱紫";
        fakeGoodLifeUserInfoNew_3.likeNum = 1687;
        fakeGoodLifeUserInfoNew_3.avatar = e3c0.T;
        fakeGoodLifeUserInfoNew_3.picSmall = e3c0.Z;
        fakeGoodLifeUserInfoNew_3.picBig = "https://auto.tancdn.com/v1/raw/8359e64e-b65c-4172-9f12-01628f6048f912.webp";
        this.f8081a.add(fakeGoodLifeUserInfoNew_3);
        FakeGoodLifeUserInfo fakeGoodLifeUserInfoNew_4 = FakeGoodLifeUserInfo.new_();
        fakeGoodLifeUserInfoNew_4.name = "sunshine";
        fakeGoodLifeUserInfoNew_4.likeNum = 1749;
        fakeGoodLifeUserInfoNew_4.avatar = e3c0.F;
        fakeGoodLifeUserInfoNew_4.picSmall = e3c0.L;
        fakeGoodLifeUserInfoNew_4.picBig = "https://auto.tancdn.com/v1/raw/3c0fd9b1-d5d4-4925-a464-29f6a7dd03d813.webp";
        this.f8082b.add(fakeGoodLifeUserInfoNew_4);
        FakeGoodLifeUserInfo fakeGoodLifeUserInfoNew_5 = FakeGoodLifeUserInfo.new_();
        fakeGoodLifeUserInfoNew_5.name = "小名叫一一";
        fakeGoodLifeUserInfoNew_5.likeNum = 1425;
        fakeGoodLifeUserInfoNew_5.avatar = e3c0.I;
        fakeGoodLifeUserInfoNew_5.picSmall = e3c0.O;
        fakeGoodLifeUserInfoNew_5.picBig = "https://auto.tancdn.com/v1/raw/c1c39370-bb76-4c80-9824-44e9dc075af713.webp";
        this.f8082b.add(fakeGoodLifeUserInfoNew_5);
        FakeGoodLifeUserInfo fakeGoodLifeUserInfoNew_6 = FakeGoodLifeUserInfo.new_();
        fakeGoodLifeUserInfoNew_6.name = "酱酱酱紫";
        fakeGoodLifeUserInfoNew_6.likeNum = 1687;
        fakeGoodLifeUserInfoNew_6.avatar = e3c0.H;
        fakeGoodLifeUserInfoNew_6.picSmall = e3c0.N;
        fakeGoodLifeUserInfoNew_6.picBig = "https://auto.tancdn.com/v1/raw/3d7c1d53-3c5a-4800-ab8b-72a6624779db12.webp";
        this.f8082b.add(fakeGoodLifeUserInfoNew_6);
        FakeGoodLifeUserInfo fakeGoodLifeUserInfoNew_7 = FakeGoodLifeUserInfo.new_();
        fakeGoodLifeUserInfoNew_7.name = "飞鱼罐头";
        fakeGoodLifeUserInfoNew_7.likeNum = 429;
        fakeGoodLifeUserInfoNew_7.avatar = e3c0.Q;
        fakeGoodLifeUserInfoNew_7.picSmall = e3c0.W;
        fakeGoodLifeUserInfoNew_7.picBig = "https://auto.tancdn.com/v1/raw/e43b42e1-224f-4e06-b683-dca16effffe213.webp";
        this.f8083c.add(fakeGoodLifeUserInfoNew_7);
        FakeGoodLifeUserInfo fakeGoodLifeUserInfoNew_8 = FakeGoodLifeUserInfo.new_();
        fakeGoodLifeUserInfoNew_8.name = "yuu";
        fakeGoodLifeUserInfoNew_8.likeNum = 419;
        fakeGoodLifeUserInfoNew_8.avatar = e3c0.P;
        fakeGoodLifeUserInfoNew_8.picSmall = e3c0.V;
        fakeGoodLifeUserInfoNew_8.picBig = "https://auto.tancdn.com/v1/raw/97f3799c-8c47-4f27-91a6-623bf0fba76012.webp";
        this.f8083c.add(fakeGoodLifeUserInfoNew_8);
        FakeGoodLifeUserInfo fakeGoodLifeUserInfoNew_9 = FakeGoodLifeUserInfo.new_();
        fakeGoodLifeUserInfoNew_9.name = "阿z";
        fakeGoodLifeUserInfoNew_9.likeNum = 451;
        fakeGoodLifeUserInfoNew_9.avatar = e3c0.S;
        fakeGoodLifeUserInfoNew_9.picSmall = e3c0.Y;
        fakeGoodLifeUserInfoNew_9.picBig = "https://auto.tancdn.com/v1/raw/3ecbcbf0-9a7b-4793-9059-4d50c2586de813.webp";
        this.f8083c.add(fakeGoodLifeUserInfoNew_9);
        FakeGoodLifeUserInfo fakeGoodLifeUserInfoNew_10 = FakeGoodLifeUserInfo.new_();
        fakeGoodLifeUserInfoNew_10.name = "飞鱼罐头";
        fakeGoodLifeUserInfoNew_10.likeNum = 429;
        fakeGoodLifeUserInfoNew_10.avatar = e3c0.E;
        fakeGoodLifeUserInfoNew_10.picSmall = e3c0.K;
        fakeGoodLifeUserInfoNew_10.picBig = "https://auto.tancdn.com/v1/raw/c8c0431f-00b6-45ab-bb6d-66f37b62635612.webp";
        this.f8084d.add(fakeGoodLifeUserInfoNew_10);
        FakeGoodLifeUserInfo fakeGoodLifeUserInfoNew_11 = FakeGoodLifeUserInfo.new_();
        fakeGoodLifeUserInfoNew_11.name = "yuu";
        fakeGoodLifeUserInfoNew_11.likeNum = 419;
        fakeGoodLifeUserInfoNew_11.avatar = e3c0.D;
        fakeGoodLifeUserInfoNew_11.picSmall = e3c0.J;
        fakeGoodLifeUserInfoNew_11.picBig = "https://auto.tancdn.com/v1/raw/74a296a0-71f4-4be3-9c0f-bde7617e2a1012.webp";
        this.f8084d.add(fakeGoodLifeUserInfoNew_11);
        FakeGoodLifeUserInfo fakeGoodLifeUserInfoNew_12 = FakeGoodLifeUserInfo.new_();
        fakeGoodLifeUserInfoNew_12.name = "阿z";
        fakeGoodLifeUserInfoNew_12.likeNum = 451;
        fakeGoodLifeUserInfoNew_12.avatar = e3c0.G;
        fakeGoodLifeUserInfoNew_12.picSmall = e3c0.M;
        fakeGoodLifeUserInfoNew_12.picBig = "https://auto.tancdn.com/v1/raw/0452e316-19d7-4824-a7e0-d5ed1f5921b813.webp";
        this.f8084d.add(fakeGoodLifeUserInfoNew_12);
        return this;
    }
}
