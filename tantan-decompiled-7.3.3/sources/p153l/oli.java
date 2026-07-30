package p153l;

import com.immomo.moment.filtermanager.MMPresetFilter;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class oli {

    /* JADX INFO: renamed from: a */
    private List<kt2> f147837a;

    /* JADX INFO: renamed from: b */
    private qqc0 f147838b;

    /* JADX INFO: renamed from: c */
    private rer f147839c;

    /* JADX INFO: renamed from: d */
    private List<MMPresetFilter> f147840d;

    public oli(rer rerVar, List<MMPresetFilter> list) {
        this.f147839c = rerVar;
        this.f147840d = list;
        this.f147837a = new CopyOnWriteArrayList();
        if (rerVar != null) {
            rerVar.m181062s0(2);
            rerVar.m181061r0(2);
            this.f147837a.add(rerVar);
        }
        this.f147838b = new qqc0(this.f147837a);
    }

    /* JADX INFO: renamed from: b */
    public kt2 m168117b() {
        return this.f147838b;
    }

    /* JADX INFO: renamed from: c */
    public void m168118c(float f) {
        rer rerVar = this.f147839c;
        if (rerVar != null) {
            rerVar.m181059p0(f);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m168119d(int i) {
        m168120e(i, true, 0.0f);
    }

    /* JADX INFO: renamed from: e */
    public void m168120e(int i, boolean z, float f) {
        if ((f == 0.0f || f == 1.0f) && this.f147839c != null) {
            String strM98982a = ani.m98982a(i, this.f147840d);
            rer rerVar = this.f147839c;
            if (strM98982a != null) {
                rerVar.m181058o0(strM98982a);
            } else {
                rerVar.m181050e0();
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m168121f(String str, float f) {
        rer rerVar;
        if ((f == 0.0f || f == 1.0f) && (rerVar = this.f147839c) != null) {
            if (str != null) {
                rerVar.m181058o0(str);
            } else {
                rerVar.m181050e0();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m168116a() {
    }

    public oli(List<MMPresetFilter> list, rer rerVar) {
        this.f147839c = rerVar;
        this.f147840d = list;
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f147837a = copyOnWriteArrayList;
        copyOnWriteArrayList.add(rerVar);
        this.f147838b = new qqc0(this.f147837a);
    }
}
