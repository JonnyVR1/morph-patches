package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class lxn0 extends lb2 {

    /* JADX INFO: renamed from: f */
    public static final String[] f133972f;

    /* JADX INFO: renamed from: e */
    public final List<jxn0> f133973e;

    static {
        f133972f = new String[]{xau.m209910t(((civ) zrv.m221194l(htd0.f111524f)).m109970n() ? R$string.f48354rj : R$string.f48112gi), xau.m209910t(R$string.f47914Xf)};
    }

    public lxn0(List<jxn0> list) {
        ArrayList arrayList = new ArrayList();
        this.f133973e = arrayList;
        arrayList.addAll(list);
    }

    @Override // p153l.cf60
    public int getCount() {
        return f133972f.length;
    }

    @Override // p153l.cf60
    @Nullable
    public CharSequence getPageTitle(int i) {
        return f133972f[i];
    }

    @Override // p153l.cf60
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }

    @Override // p153l.lb2
    /* JADX INFO: renamed from: o */
    public void mo40045o(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // p153l.lb2
    /* JADX INFO: renamed from: p */
    public Object mo40046p(ViewGroup viewGroup, int i) {
        View viewM147379l = this.f133973e.get(i).m147379l();
        viewGroup.addView(viewM147379l);
        return viewM147379l;
    }
}
