package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.BeautyMenuView;

/* JADX INFO: loaded from: classes5.dex */
public class f24 {

    /* JADX INFO: renamed from: a */
    public t14 f96851a;

    /* JADX INFO: renamed from: b */
    public c0s f96852b;

    /* JADX INFO: renamed from: c */
    public nv2 f96853c;

    public f24(t14 t14Var, nv2 nv2Var) {
        this.f96851a = t14Var;
        this.f96853c = nv2Var;
    }

    /* JADX INFO: renamed from: b */
    public void m123598b() {
        ynp0.m216937n(this.f96852b);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m123599c(View view) {
        ynp0.m216937n(this.f96852b);
    }

    /* JADX INFO: renamed from: d */
    public void m123600d() {
        if (this.f96852b == null) {
            BeautyMenuView beautyMenuView = (BeautyMenuView) this.f96851a.act().inflater().inflate(yec0.f199211q, (ViewGroup) null);
            this.f96853c.m164836Y3(beautyMenuView.f52298e, null);
            this.f96852b = new c0s(this.f96851a, beautyMenuView);
            bnl0.m105524M(beautyMenuView.f52299f, false);
            bnl0.m105524M(beautyMenuView.f52297d, false);
            bnl0.m105509E0(beautyMenuView.f52300g, new View.OnClickListener() { // from class: l.e24
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f91700a.m123599c(view);
                }
            });
        }
        this.f96852b.show();
    }
}
