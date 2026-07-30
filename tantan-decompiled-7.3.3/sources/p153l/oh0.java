package p153l;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes3.dex */
public class oh0 extends ogk {

    /* JADX INFO: renamed from: a */
    private h6j f147328a = new h6j();

    /* JADX INFO: renamed from: b */
    private h6j f147329b = new h6j();

    /* JADX INFO: renamed from: c */
    private nh0 f147330c;

    public oh0() {
        nh0 nh0Var = new nh0();
        this.f147330c = nh0Var;
        this.f147328a.addTarget(nh0Var);
        this.f147329b.addTarget(this.f147330c);
        this.f147330c.registerFilterLocation(this.f147328a, 0);
        this.f147330c.registerFilterLocation(this.f147329b, 1);
        this.f147330c.addTarget(this);
        registerInitialFilter(this.f147328a);
        registerInitialFilter(this.f147329b);
        registerTerminalFilter(this.f147330c);
        this.f147330c.m163016Q1(true);
    }

    /* JADX INFO: renamed from: Q1 */
    public void m167676Q1(Bitmap bitmap, Bitmap bitmap2) {
        h6j h6jVar = this.f147328a;
        if (h6jVar == null || this.f147329b == null || this.f147330c == null) {
            return;
        }
        h6jVar.mo129266R1(bitmap2);
        this.f147329b.mo129266R1(bitmap);
        this.f147330c.m163016Q1(true);
    }
}
