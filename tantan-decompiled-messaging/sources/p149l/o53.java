package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.LiteraturesComments;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.holder.item.BookMoviesTxtItem;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class o53 extends dac0<LiteraturesComments> {

    /* JADX INFO: renamed from: c */
    public final Act f141868c;

    /* JADX INFO: renamed from: d */
    public boolean f141869d;

    /* JADX INFO: renamed from: e */
    public final List<LiteraturesComments> f141870e;

    public o53(Act act, boolean z, List<LiteraturesComments> list) {
        this.f141868c = act;
        this.f141869d = z;
        this.f141870e = list;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f141870e.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return LayoutInflater.from(this.f141868c).inflate(f6c0.f95922o2, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, LiteraturesComments literaturesComments, int i, int i2) {
        ((BookMoviesTxtItem) view).m38159C(literaturesComments, this.f141869d);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public LiteraturesComments getItem(int i) {
        return this.f141870e.get(i);
    }
}
