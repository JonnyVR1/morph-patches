package p149l;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.view.GiftInnerContentView;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class nqj {

    /* JADX INFO: renamed from: a */
    public List<ihs> f140073a;

    /* JADX INFO: renamed from: b */
    public final String f140074b;

    public nqj(List<ihs> list, String str) {
        this.f140073a = list;
        this.f140074b = str;
    }

    /* JADX INFO: renamed from: a */
    public void m160622a(GiftInnerContentView giftInnerContentView, ahs<?> ahsVar) {
        giftInnerContentView.m74493I(this, ahsVar);
    }

    /* JADX INFO: renamed from: b */
    public String m160623b() {
        return this.f140074b;
    }

    /* JADX INFO: renamed from: c */
    public GiftInnerContentView m160624c(ViewGroup viewGroup) {
        return (GiftInnerContentView) LayoutInflater.from(viewGroup.getContext()).inflate(t6c0.f168533u1, viewGroup, false);
    }
}
