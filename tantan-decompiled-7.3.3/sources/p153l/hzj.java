package p153l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.data.LangModel;
import com.p051p1.mobile.putong.live.base.data.BLiveTabEntrance;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.view.GiftOuterContentView;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class hzj {

    /* JADX INFO: renamed from: a */
    public List<jjs> f112248a;

    /* JADX INFO: renamed from: b */
    public int f112249b;

    /* JADX INFO: renamed from: c */
    public String f112250c;

    /* JADX INFO: renamed from: d */
    public boolean f112251d = false;

    /* JADX INFO: renamed from: e */
    public final String f112252e;

    /* JADX INFO: renamed from: f */
    public final int f112253f;

    /* JADX INFO: renamed from: g */
    public LangModel f112254g;

    /* JADX INFO: renamed from: h */
    public final BLiveTabEntrance f112255h;

    /* JADX INFO: renamed from: i */
    public final boolean f112256i;

    public hzj(List<jjs> list, int i, String str, int i2, String str2, BLiveTabEntrance bLiveTabEntrance, boolean z) {
        this.f112248a = list;
        this.f112249b = i;
        this.f112250c = str;
        this.f112253f = i2;
        this.f112252e = str2;
        this.f112255h = bLiveTabEntrance;
        this.f112256i = z;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f112254g = cpj.m111775K(str);
    }

    /* JADX INFO: renamed from: a */
    public void m137893a(GiftOuterContentView giftOuterContentView, bjs<?> bjsVar) {
        giftOuterContentView.m75699s0(null, bjsVar);
        giftOuterContentView.m75695E0(this);
    }

    /* JADX INFO: renamed from: b */
    public boolean m137894b() {
        return this.f112256i && this.f112253f == 0;
    }

    /* JADX INFO: renamed from: c */
    public String m137895c() {
        return this.f112252e;
    }

    /* JADX INFO: renamed from: d */
    public String m137896d() {
        LangModel langModel = this.f112254g;
        return (langModel != null ? langModel.getLocalName() : "").trim();
    }

    /* JADX INFO: renamed from: e */
    public BLiveTabEntrance m137897e() {
        return this.f112255h;
    }

    /* JADX INFO: renamed from: f */
    public int m137898f() {
        return this.f112253f;
    }

    /* JADX INFO: renamed from: g */
    public GiftOuterContentView m137899g(ViewGroup viewGroup) {
        return (GiftOuterContentView) LayoutInflater.from(viewGroup.getContext()).inflate(yec0.f199239s1, viewGroup, false);
    }

    /* JADX INFO: renamed from: h */
    public boolean m137900h() {
        return this.f112256i;
    }
}
