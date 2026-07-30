package p153l;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.view.GiftInnerContentView;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class dtj {

    /* JADX INFO: renamed from: a */
    public List<jjs> f90600a;

    /* JADX INFO: renamed from: b */
    public final String f90601b;

    public dtj(List<jjs> list, String str) {
        this.f90600a = list;
        this.f90601b = str;
    }

    /* JADX INFO: renamed from: a */
    public void m117879a(GiftInnerContentView giftInnerContentView, bjs<?> bjsVar) {
        giftInnerContentView.m75676I(this, bjsVar);
    }

    /* JADX INFO: renamed from: b */
    public String m117880b() {
        return this.f90601b;
    }

    /* JADX INFO: renamed from: c */
    public GiftInnerContentView m117881c(ViewGroup viewGroup) {
        return (GiftInnerContentView) LayoutInflater.from(viewGroup.getContext()).inflate(yec0.f199265u1, viewGroup, false);
    }
}
