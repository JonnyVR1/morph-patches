package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.BeautyMenuView;

/* JADX INFO: loaded from: classes5.dex */
public class g14 {

    /* JADX INFO: renamed from: a */
    public u04 f100114a;

    /* JADX INFO: renamed from: b */
    public byr f100115b;

    /* JADX INFO: renamed from: c */
    public xu2 f100116c;

    public g14(u04 u04Var, xu2 xu2Var) {
        this.f100114a = u04Var;
        this.f100116c = xu2Var;
    }

    /* JADX INFO: renamed from: b */
    public void m124051b() {
        uep0.m193327n(this.f100115b);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m124052c(View view) {
        uep0.m193327n(this.f100115b);
    }

    /* JADX INFO: renamed from: d */
    public void m124053d() {
        if (this.f100115b == null) {
            BeautyMenuView beautyMenuView = (BeautyMenuView) this.f100114a.act().inflater().inflate(t6c0.f168479q, (ViewGroup) null);
            this.f100116c.m211068Y3(beautyMenuView.f51450e, null);
            this.f100115b = new byr(this.f100114a, beautyMenuView);
            xdl0.m208344M(beautyMenuView.f51451f, false);
            xdl0.m208344M(beautyMenuView.f51449d, false);
            xdl0.m208329E0(beautyMenuView.f51452g, new View.OnClickListener() { // from class: l.f14
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f94039a.m124052c(view);
                }
            });
        }
        this.f100115b.show();
    }
}
