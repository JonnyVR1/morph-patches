package p002l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.view.GiftOuterContentView;
import com.p1.mobile.putong.data.LangModel;
import com.p1.mobile.putong.live.base.data.BLiveTabEntrance;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class rwj {

    /* JADX INFO: renamed from: a */
    public List<ihs> f18703a;

    /* JADX INFO: renamed from: b */
    public int f18704b;

    /* JADX INFO: renamed from: c */
    public String f18705c;

    /* JADX INFO: renamed from: d */
    public boolean f18706d = false;

    /* JADX INFO: renamed from: e */
    public final String f18707e;

    /* JADX INFO: renamed from: f */
    public final int f18708f;

    /* JADX INFO: renamed from: g */
    public LangModel f18709g;

    /* JADX INFO: renamed from: h */
    public final BLiveTabEntrance f18710h;

    /* JADX INFO: renamed from: i */
    public final boolean f18711i;

    public rwj(List<ihs> list, int i, String str, int i2, String str2, BLiveTabEntrance bLiveTabEntrance, boolean z) {
        this.f18703a = list;
        this.f18704b = i;
        this.f18705c = str;
        this.f18708f = i2;
        this.f18707e = str2;
        this.f18710h = bLiveTabEntrance;
        this.f18711i = z;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f18709g = mmj.m18050K(str);
    }

    /* JADX INFO: renamed from: a */
    public void m22138a(GiftOuterContentView giftOuterContentView, ahs<?> ahsVar) {
        giftOuterContentView.m8103s0(null, ahsVar);
        giftOuterContentView.m8099E0(this);
    }

    /* JADX INFO: renamed from: b */
    public boolean m22139b() {
        return this.f18711i && this.f18708f == 0;
    }

    /* JADX INFO: renamed from: c */
    public String m22140c() {
        return this.f18707e;
    }

    /* JADX INFO: renamed from: d */
    public String m22141d() {
        LangModel langModel = this.f18709g;
        return (langModel != null ? langModel.getLocalName() : "").trim();
    }

    /* JADX INFO: renamed from: e */
    public BLiveTabEntrance m22142e() {
        return this.f18710h;
    }

    /* JADX INFO: renamed from: f */
    public int m22143f() {
        return this.f18708f;
    }

    /* JADX INFO: renamed from: g */
    public GiftOuterContentView m22144g(ViewGroup viewGroup) {
        return (GiftOuterContentView) LayoutInflater.from(viewGroup.getContext()).inflate(t6c0.f20003s1, viewGroup, false);
    }

    /* JADX INFO: renamed from: h */
    public boolean m22145h() {
        return this.f18711i;
    }
}
