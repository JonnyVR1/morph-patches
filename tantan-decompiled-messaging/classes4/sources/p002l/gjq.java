package p002l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import java.util.List;
import l.e30;
import l.gac0;
import l.t100;
import l.xdl0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class gjq extends gac0<pjq> {

    /* JADX INFO: renamed from: d */
    public List<pjq> f11476d;

    public gjq(List<pjq> list, e30<pjq> e30Var) {
        super(e30Var);
        this.f11476d = list;
    }

    /* JADX INFO: renamed from: C */
    public int m13867C() {
        List<pjq> list = this.f11476d;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* JADX INFO: renamed from: D */
    public View m13868D(ViewGroup viewGroup, int i) {
        View viewInflate = View.inflate(viewGroup.getContext(), t6c0.f19755Z, null);
        viewInflate.setLayoutParams(new ViewGroup.LayoutParams(xdl0.f, t100.s));
        return viewInflate;
    }

    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void m13866A(View view, pjq pjqVar, int i, int i2) {
        super.A(view, pjqVar, i, i2);
        VText vText = (VText) view;
        int i3 = R$string.f2882N;
        String string = pjqVar.m20376a().toString();
        string.getClass();
        switch (string) {
            case "Manager":
                i3 = R$string.f3298ga;
                break;
            case "FollowerAndManager":
                i3 = R$string.f2691E4;
                break;
            case "None":
                i3 = R$string.f2903O;
                break;
        }
        vText.setText(i3);
        vText.setSelected(pjqVar.m20377b());
    }

    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public pjq getItem(int i) {
        return this.f11476d.get(i);
    }
}
