package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.LiteraturesComments;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.holder.item.BookMoviesTxtItem;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class e63 extends jic0<LiteraturesComments> {

    /* JADX INFO: renamed from: c */
    public final Act f92254c;

    /* JADX INFO: renamed from: d */
    public boolean f92255d;

    /* JADX INFO: renamed from: e */
    public final List<LiteraturesComments> f92256e;

    public e63(Act act, boolean z, List<LiteraturesComments> list) {
        this.f92254c = act;
        this.f92255d = z;
        this.f92256e = list;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f92256e.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return LayoutInflater.from(this.f92254c).inflate(kec0.f125976o2, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, LiteraturesComments literaturesComments, int i, int i2) {
        ((BookMoviesTxtItem) view).m39162C(literaturesComments, this.f92255d);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public LiteraturesComments getItem(int i) {
        return this.f92256e.get(i);
    }
}
