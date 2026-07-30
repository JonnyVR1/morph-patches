package p149l;

import com.immomo.moment.filtermanager.MMPresetFilter;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class rii {

    /* JADX INFO: renamed from: a */
    private List<us2> f159555a;

    /* JADX INFO: renamed from: b */
    private jic0 f159556b;

    /* JADX INFO: renamed from: c */
    private qcr f159557c;

    /* JADX INFO: renamed from: d */
    private List<MMPresetFilter> f159558d;

    public rii(qcr qcrVar, List<MMPresetFilter> list) {
        this.f159557c = qcrVar;
        this.f159558d = list;
        this.f159555a = new CopyOnWriteArrayList();
        if (qcrVar != null) {
            qcrVar.m173923s0(2);
            qcrVar.m173922r0(2);
            this.f159555a.add(qcrVar);
        }
        this.f159556b = new jic0(this.f159555a);
    }

    /* JADX INFO: renamed from: b */
    public us2 m179511b() {
        return this.f159556b;
    }

    /* JADX INFO: renamed from: c */
    public void m179512c(float f) {
        qcr qcrVar = this.f159557c;
        if (qcrVar != null) {
            qcrVar.m173920p0(f);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m179513d(int i) {
        m179514e(i, true, 0.0f);
    }

    /* JADX INFO: renamed from: e */
    public void m179514e(int i, boolean z, float f) {
        if ((f == 0.0f || f == 1.0f) && this.f159557c != null) {
            String strM116976a = eki.m116976a(i, this.f159558d);
            qcr qcrVar = this.f159557c;
            if (strM116976a != null) {
                qcrVar.m173919o0(strM116976a);
            } else {
                qcrVar.m173911e0();
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m179515f(String str, float f) {
        qcr qcrVar;
        if ((f == 0.0f || f == 1.0f) && (qcrVar = this.f159557c) != null) {
            if (str != null) {
                qcrVar.m173919o0(str);
            } else {
                qcrVar.m173911e0();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m179510a() {
    }

    public rii(List<MMPresetFilter> list, qcr qcrVar) {
        this.f159557c = qcrVar;
        this.f159558d = list;
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f159555a = copyOnWriteArrayList;
        copyOnWriteArrayList.add(qcrVar);
        this.f159556b = new jic0(this.f159555a);
    }
}
