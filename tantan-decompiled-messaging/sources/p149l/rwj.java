package p149l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.data.LangModel;
import com.p046p1.mobile.putong.live.base.data.BLiveTabEntrance;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.view.GiftOuterContentView;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class rwj {

    /* JADX INFO: renamed from: a */
    public List<ihs> f161338a;

    /* JADX INFO: renamed from: b */
    public int f161339b;

    /* JADX INFO: renamed from: c */
    public String f161340c;

    /* JADX INFO: renamed from: d */
    public boolean f161341d = false;

    /* JADX INFO: renamed from: e */
    public final String f161342e;

    /* JADX INFO: renamed from: f */
    public final int f161343f;

    /* JADX INFO: renamed from: g */
    public LangModel f161344g;

    /* JADX INFO: renamed from: h */
    public final BLiveTabEntrance f161345h;

    /* JADX INFO: renamed from: i */
    public final boolean f161346i;

    public rwj(List<ihs> list, int i, String str, int i2, String str2, BLiveTabEntrance bLiveTabEntrance, boolean z) {
        this.f161338a = list;
        this.f161339b = i;
        this.f161340c = str;
        this.f161343f = i2;
        this.f161342e = str2;
        this.f161345h = bLiveTabEntrance;
        this.f161346i = z;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f161344g = mmj.m155408K(str);
    }

    /* JADX INFO: renamed from: a */
    public void m181394a(GiftOuterContentView giftOuterContentView, ahs<?> ahsVar) {
        giftOuterContentView.m74516s0(null, ahsVar);
        giftOuterContentView.m74512E0(this);
    }

    /* JADX INFO: renamed from: b */
    public boolean m181395b() {
        return this.f161346i && this.f161343f == 0;
    }

    /* JADX INFO: renamed from: c */
    public String m181396c() {
        return this.f161342e;
    }

    /* JADX INFO: renamed from: d */
    public String m181397d() {
        LangModel langModel = this.f161344g;
        return (langModel != null ? langModel.getLocalName() : "").trim();
    }

    /* JADX INFO: renamed from: e */
    public BLiveTabEntrance m181398e() {
        return this.f161345h;
    }

    /* JADX INFO: renamed from: f */
    public int m181399f() {
        return this.f161343f;
    }

    /* JADX INFO: renamed from: g */
    public GiftOuterContentView m181400g(ViewGroup viewGroup) {
        return (GiftOuterContentView) LayoutInflater.from(viewGroup.getContext()).inflate(t6c0.f168507s1, viewGroup, false);
    }

    /* JADX INFO: renamed from: h */
    public boolean m181401h() {
        return this.f161346i;
    }
}
