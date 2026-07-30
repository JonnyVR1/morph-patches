package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.data.BLiveHideAvatarEnterConfig;
import com.p051p1.mobile.putong.live.external.R$string;
import com.p051p1.mobile.putong.live.external.page.setting.hideavatar.view.HideAvatarItemView;
import java.util.List;
import p151v.VPager;
import p151v.VPagerCircleIndicator;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes9.dex */
public class i3l implements iam<a3l> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f112735a;

    /* JADX INFO: renamed from: b */
    public VPager f112736b;

    /* JADX INFO: renamed from: c */
    public VPagerCircleIndicator f112737c;

    /* JADX INFO: renamed from: d */
    public VText f112738d;

    /* JADX INFO: renamed from: e */
    public a3l f112739e;

    /* JADX INFO: renamed from: f */
    public o2l f112740f;

    /* JADX INFO: renamed from: g */
    public final y20<q2l> f112741g = new C17631a();

    /* JADX INFO: renamed from: l.i3l$a */
    public class C17631a implements y20<q2l> {
        public C17631a() {
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(q2l q2lVar) {
            i3l.this.f112739e.m95821s0(q2lVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m138305e(View view) {
        act().onBackPressed();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f112736b.getContext();
    }

    /* JADX INFO: renamed from: c */
    public View m138306c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return j3l.m143359b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(a3l a3lVar) {
        this.f112739e = a3lVar;
    }

    /* JADX INFO: renamed from: f */
    public void m138308f(q2l q2lVar, boolean z) {
        if (z) {
            q2l q2lVarM165730q = this.f112740f.m165730q();
            if (q2lVarM165730q != null) {
                q2lVarM165730q.m175045d();
                m138309i(q2lVarM165730q);
            }
            q2lVar.m175044c();
        } else {
            q2lVar.m175045d();
        }
        m138309i(q2lVar);
    }

    /* JADX INFO: renamed from: i */
    public final void m138309i(q2l q2lVar) {
        View viewM137974a = i0k.m137974a(this.f112736b, q2lVar.m175047f());
        if (viewM137974a instanceof HideAvatarItemView) {
            ((HideAvatarItemView) viewM137974a).m71964l0(q2lVar);
        }
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m138306c(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public void m138310j(List<q2l> list, BLiveHideAvatarEnterConfig bLiveHideAvatarEnterConfig) {
        this.f112735a.setTitle(act().getString(R$string.f45731U));
        this.f112735a.setLeftIconOnClick(new View.OnClickListener() { // from class: l.g3l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f102000a.m138305e(view);
            }
        });
        if (this.f112740f == null) {
            o2l o2lVar = new o2l(this.f112741g);
            this.f112740f = o2lVar;
            this.f112736b.setAdapter(o2lVar);
            this.f112736b.setPageMargin(qa00.m175859d(14.0f));
            this.f112737c.setViewPager(this.f112736b);
        }
        bnl0.m105524M(this.f112737c, list.size() >= 2);
        int currentItem = this.f112736b.getCurrentItem();
        this.f112740f.m165731r(list);
        this.f112738d.setText(bLiveHideAvatarEnterConfig.usage);
        if (currentItem != 0 && currentItem < list.size()) {
            this.f112736b.setCurrentItem(currentItem);
            return;
        }
        int iM147476G = jyb.m147476G(list, new h3l());
        if (iM147476G >= 0) {
            this.f112736b.setCurrentItem(iM147476G);
        }
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
