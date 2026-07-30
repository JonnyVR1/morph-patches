package p149l;

import com.p046p1.mobile.putong.live.external.page.rights.list.view.RightNormalTypeView;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class p4d0 extends b1d0<RightNormalTypeView> {

    /* JADX INFO: renamed from: e */
    public List<b1d0> f147156e;

    /* JADX INFO: renamed from: f */
    public g1d0 f147157f;

    /* JADX INFO: renamed from: g */
    public String f147158g;

    /* JADX INFO: renamed from: h */
    public boolean f147159h;

    /* JADX INFO: renamed from: i */
    public boolean f147160i;

    public p4d0(List<b1d0> list, g1d0 g1d0Var, String str, boolean z, boolean z2) {
        this.f147156e = list;
        this.f147157f = g1d0Var;
        this.f147158g = str;
        this.f147159h = z;
        this.f147160i = z2;
    }

    /* JADX INFO: renamed from: I */
    public boolean m167387I() {
        return !vwb.m200296J(this.f147156e) && vwb.m200337m(this.f147156e, new w9j() { // from class: l.o4d0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((b1d0) obj).f72585b);
            }
        });
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo70566u(RightNormalTypeView rightNormalTypeView) {
        super.mo70566u(rightNormalTypeView);
        rightNormalTypeView.m70641o0(this, this.f147157f);
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return s6c0.f162791r1;
    }

    public p4d0(List<b1d0> list, g1d0 g1d0Var, boolean z, boolean z2) {
        this.f147156e = list;
        this.f147157f = g1d0Var;
        this.f147159h = z;
        this.f147160i = z2;
    }
}
