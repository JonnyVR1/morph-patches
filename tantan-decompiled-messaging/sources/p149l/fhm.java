package p149l;

import android.graphics.Rect;
import com.facebook.fresco.p027ui.common.ImageLoadStatus;
import com.facebook.fresco.p027ui.common.ImageRenderingInfra;
import com.facebook.fresco.p027ui.common.VisibilityState;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class fhm implements ghm {

    /* JADX INFO: renamed from: a */
    public final ei70 f97513a;

    /* JADX INFO: renamed from: b */
    public final by00 f97514b;

    /* JADX INFO: renamed from: c */
    public final ihm f97515c = new ihm(ImageRenderingInfra.DRAWEE);

    /* JADX INFO: renamed from: d */
    public hhm f97516d;

    /* JADX INFO: renamed from: e */
    public jhm f97517e;

    /* JADX INFO: renamed from: f */
    public d0j f97518f;

    /* JADX INFO: renamed from: g */
    public List<dhm> f97519g;

    /* JADX INFO: renamed from: h */
    public boolean f97520h;

    public fhm(by00 by00Var, ei70 ei70Var) {
        this.f97514b = by00Var;
        this.f97513a = ei70Var;
    }

    @Override // p149l.ghm
    /* JADX INFO: renamed from: a */
    public void mo121360a(ihm ihmVar, ImageLoadStatus imageLoadStatus) {
        List<dhm> list;
        ihmVar.m136250H(imageLoadStatus);
        if (!this.f97520h || (list = this.f97519g) == null || list.isEmpty()) {
            return;
        }
        if (imageLoadStatus == ImageLoadStatus.SUCCESS) {
            m121363d();
        }
        chm chmVarM136261S = ihmVar.m136261S();
        Iterator<dhm> it = this.f97519g.iterator();
        while (it.hasNext()) {
            it.next().m111827b(chmVarM136261S, imageLoadStatus);
        }
    }

    @Override // p149l.ghm
    /* JADX INFO: renamed from: b */
    public void mo121361b(ihm ihmVar, VisibilityState visibilityState) {
        List<dhm> list;
        if (!this.f97520h || (list = this.f97519g) == null || list.isEmpty()) {
            return;
        }
        chm chmVarM136261S = ihmVar.m136261S();
        Iterator<dhm> it = this.f97519g.iterator();
        while (it.hasNext()) {
            it.next().m111826a(chmVarM136261S, visibilityState);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m121362c(dhm dhmVar) {
        if (dhmVar == null) {
            return;
        }
        if (this.f97519g == null) {
            this.f97519g = new CopyOnWriteArrayList();
        }
        this.f97519g.add(dhmVar);
    }

    /* JADX INFO: renamed from: d */
    public void m121363d() {
        ice hierarchy = this.f97513a.getHierarchy();
        if (hierarchy == null || hierarchy.mo112055b() == null) {
            return;
        }
        Rect bounds = hierarchy.mo112055b().getBounds();
        this.f97515c.m136256N(bounds.width());
        this.f97515c.m136255M(bounds.height());
    }

    /* JADX INFO: renamed from: e */
    public void m121364e() {
        List<dhm> list = this.f97519g;
        if (list != null) {
            list.clear();
        }
    }

    /* JADX INFO: renamed from: f */
    public void m121365f() {
        m121364e();
        m121366g(false);
        this.f97515c.m136262w();
    }

    /* JADX INFO: renamed from: g */
    public void m121366g(boolean z) {
        this.f97520h = z;
        if (!z) {
            jhm jhmVar = this.f97517e;
            if (jhmVar != null) {
                this.f97513a.m129585R(jhmVar);
            }
            d0j d0jVar = this.f97518f;
            if (d0jVar != null) {
                this.f97513a.m116650x0(d0jVar);
                return;
            }
            return;
        }
        m121367h();
        jhm jhmVar2 = this.f97517e;
        if (jhmVar2 != null) {
            this.f97513a.m129607k(jhmVar2);
        }
        d0j d0jVar2 = this.f97518f;
        if (d0jVar2 != null) {
            this.f97513a.m116630h0(d0jVar2);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m121367h() {
        if (this.f97517e == null) {
            this.f97517e = new jhm(this.f97514b, this.f97515c, this);
        }
        if (this.f97516d == null) {
            this.f97516d = new hhm(this.f97514b, this.f97515c);
        }
        if (this.f97518f == null) {
            this.f97518f = new d0j(this.f97516d);
        }
    }
}
