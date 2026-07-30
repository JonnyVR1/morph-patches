package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import java.util.List;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class gjq extends gac0<pjq> {

    /* JADX INFO: renamed from: d */
    public List<pjq> f103093d;

    public gjq(List<pjq> list, e30<pjq> e30Var) {
        super(e30Var);
        this.f103093d = list;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int mo28824C() {
        List<pjq> list = this.f103093d;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        View viewInflate = View.inflate(viewGroup.getContext(), t6c0.f168259Z, null);
        viewInflate.setLayoutParams(new ViewGroup.LayoutParams(xdl0.f192404f, t100.f167270s));
        return viewInflate;
    }

    @Override // p149l.gac0, p149l.dac0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, pjq pjqVar, int i, int i2) {
        super.mo28823A(view, pjqVar, i, i2);
        VText vText = (VText) view;
        int i3 = R$string.f46840N;
        String string = pjqVar.m169917a().toString();
        string.getClass();
        switch (string) {
            case "Manager":
                i3 = R$string.f47256ga;
                break;
            case "FollowerAndManager":
                i3 = R$string.f46649E4;
                break;
            case "None":
                i3 = R$string.f46861O;
                break;
        }
        vText.setText(i3);
        vText.setSelected(pjqVar.m169918b());
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public pjq getItem(int i) {
        return this.f103093d.get(i);
    }
}
