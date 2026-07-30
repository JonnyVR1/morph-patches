package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import java.util.List;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class flq extends mic0<olq> {

    /* JADX INFO: renamed from: d */
    public List<olq> f99683d;

    public flq(List<olq> list, y20<olq> y20Var) {
        super(y20Var);
        this.f99683d = list;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int mo29823C() {
        List<olq> list = this.f99683d;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        View viewInflate = View.inflate(viewGroup.getContext(), yec0.f198991Z, null);
        viewInflate.setLayoutParams(new ViewGroup.LayoutParams(bnl0.f77545f, qa00.f156332s));
        return viewInflate;
    }

    @Override // p153l.mic0, p153l.jic0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, olq olqVar, int i, int i2) {
        super.mo29822A(view, olqVar, i, i2);
        VText vText = (VText) view;
        int i3 = R$string.f47688N;
        String string = olqVar.m168158a().toString();
        string.getClass();
        switch (string) {
            case "Manager":
                i3 = R$string.f48104ga;
                break;
            case "FollowerAndManager":
                i3 = R$string.f47497E4;
                break;
            case "None":
                i3 = R$string.f47709O;
                break;
        }
        vText.setText(i3);
        vText.setSelected(olqVar.m168159b());
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public olq getItem(int i) {
        return this.f99683d.get(i);
    }
}
