package p009l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.newui.home.card.expanded.holder.item.BookMoviesTxtItem;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.LiteraturesComments;
import java.util.List;
import l.dac0;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class o53 extends dac0<LiteraturesComments> {

    /* JADX INFO: renamed from: c */
    public final Act f17837c;

    /* JADX INFO: renamed from: d */
    public boolean f17838d;

    /* JADX INFO: renamed from: e */
    public final List<LiteraturesComments> f17839e;

    public o53(Act act, boolean z, List<LiteraturesComments> list) {
        this.f17837c = act;
        this.f17838d = z;
        this.f17839e = list;
    }

    /* JADX INFO: renamed from: C */
    public int m19632C() {
        return this.f17839e.size();
    }

    /* JADX INFO: renamed from: D */
    public View m19633D(ViewGroup viewGroup, int i) {
        return LayoutInflater.from(this.f17837c).inflate(f6c0.o2, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void m19631A(View view, LiteraturesComments literaturesComments, int i, int i2) {
        ((BookMoviesTxtItem) view).m2133C(literaturesComments, this.f17838d);
    }

    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public LiteraturesComments getItem(int i) {
        return this.f17839e.get(i);
    }
}
