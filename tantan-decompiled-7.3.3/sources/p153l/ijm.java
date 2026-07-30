package p153l;

import android.graphics.Rect;
import com.facebook.fresco.p028ui.common.ImageLoadStatus;
import com.facebook.fresco.p028ui.common.ImageRenderingInfra;
import com.facebook.fresco.p028ui.common.VisibilityState;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class ijm implements jjm {

    /* JADX INFO: renamed from: a */
    public final kq70 f115241a;

    /* JADX INFO: renamed from: b */
    public final l610 f115242b;

    /* JADX INFO: renamed from: c */
    public final ljm f115243c = new ljm(ImageRenderingInfra.DRAWEE);

    /* JADX INFO: renamed from: d */
    public kjm f115244d;

    /* JADX INFO: renamed from: e */
    public mjm f115245e;

    /* JADX INFO: renamed from: f */
    public y2j f115246f;

    /* JADX INFO: renamed from: g */
    public List<gjm> f115247g;

    /* JADX INFO: renamed from: h */
    public boolean f115248h;

    public ijm(l610 l610Var, kq70 kq70Var) {
        this.f115242b = l610Var;
        this.f115241a = kq70Var;
    }

    @Override // p153l.jjm
    /* JADX INFO: renamed from: a */
    public void mo140212a(ljm ljmVar, ImageLoadStatus imageLoadStatus) {
        List<gjm> list;
        ljmVar.m154535H(imageLoadStatus);
        if (!this.f115248h || (list = this.f115247g) == null || list.isEmpty()) {
            return;
        }
        if (imageLoadStatus == ImageLoadStatus.SUCCESS) {
            m140215d();
        }
        fjm fjmVarM154546S = ljmVar.m154546S();
        Iterator<gjm> it = this.f115247g.iterator();
        while (it.hasNext()) {
            it.next().m130523b(fjmVarM154546S, imageLoadStatus);
        }
    }

    @Override // p153l.jjm
    /* JADX INFO: renamed from: b */
    public void mo140213b(ljm ljmVar, VisibilityState visibilityState) {
        List<gjm> list;
        if (!this.f115248h || (list = this.f115247g) == null || list.isEmpty()) {
            return;
        }
        fjm fjmVarM154546S = ljmVar.m154546S();
        Iterator<gjm> it = this.f115247g.iterator();
        while (it.hasNext()) {
            it.next().m130522a(fjmVarM154546S, visibilityState);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m140214c(gjm gjmVar) {
        if (gjmVar == null) {
            return;
        }
        if (this.f115247g == null) {
            this.f115247g = new CopyOnWriteArrayList();
        }
        this.f115247g.add(gjmVar);
    }

    /* JADX INFO: renamed from: d */
    public void m140215d() {
        mde hierarchy = this.f115241a.getHierarchy();
        if (hierarchy == null || hierarchy.mo157973b() == null) {
            return;
        }
        Rect bounds = hierarchy.mo157973b().getBounds();
        this.f115243c.m154541N(bounds.width());
        this.f115243c.m154540M(bounds.height());
    }

    /* JADX INFO: renamed from: e */
    public void m140216e() {
        List<gjm> list = this.f115247g;
        if (list != null) {
            list.clear();
        }
    }

    /* JADX INFO: renamed from: f */
    public void m140217f() {
        m140216e();
        m140218g(false);
        this.f115243c.m154547w();
    }

    /* JADX INFO: renamed from: g */
    public void m140218g(boolean z) {
        this.f115248h = z;
        if (!z) {
            mjm mjmVar = this.f115245e;
            if (mjmVar != null) {
                this.f115241a.m108221R(mjmVar);
            }
            y2j y2jVar = this.f115246f;
            if (y2jVar != null) {
                this.f115241a.m150840x0(y2jVar);
                return;
            }
            return;
        }
        m140219h();
        mjm mjmVar2 = this.f115245e;
        if (mjmVar2 != null) {
            this.f115241a.m108244k(mjmVar2);
        }
        y2j y2jVar2 = this.f115246f;
        if (y2jVar2 != null) {
            this.f115241a.m150825h0(y2jVar2);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m140219h() {
        if (this.f115245e == null) {
            this.f115245e = new mjm(this.f115242b, this.f115243c, this);
        }
        if (this.f115244d == null) {
            this.f115244d = new kjm(this.f115242b, this.f115243c);
        }
        if (this.f115246f == null) {
            this.f115246f = new y2j(this.f115244d);
        }
    }
}
