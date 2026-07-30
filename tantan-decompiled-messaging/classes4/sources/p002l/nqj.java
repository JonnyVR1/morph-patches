package p002l;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.view.GiftInnerContentView;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class nqj {

    /* JADX INFO: renamed from: a */
    public List<ihs> f16163a;

    /* JADX INFO: renamed from: b */
    public final String f16164b;

    public nqj(List<ihs> list, String str) {
        this.f16163a = list;
        this.f16164b = str;
    }

    /* JADX INFO: renamed from: a */
    public void m18972a(GiftInnerContentView giftInnerContentView, ahs<?> ahsVar) {
        giftInnerContentView.m8080I(this, ahsVar);
    }

    /* JADX INFO: renamed from: b */
    public String m18973b() {
        return this.f16164b;
    }

    /* JADX INFO: renamed from: c */
    public GiftInnerContentView m18974c(ViewGroup viewGroup) {
        return (GiftInnerContentView) LayoutInflater.from(viewGroup.getContext()).inflate(t6c0.f20029u1, viewGroup, false);
    }
}
