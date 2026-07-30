package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveHideAvatarEnterConfig;
import com.p046p1.mobile.putong.live.external.R$string;
import com.p046p1.mobile.putong.live.external.page.setting.hideavatar.view.HideAvatarItemView;
import java.util.List;
import p147v.VPager;
import p147v.VPagerCircleIndicator;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes13.dex */
public class s0l implements s7m<k0l> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f161778a;

    /* JADX INFO: renamed from: b */
    public VPager f161779b;

    /* JADX INFO: renamed from: c */
    public VPagerCircleIndicator f161780c;

    /* JADX INFO: renamed from: d */
    public VText f161781d;

    /* JADX INFO: renamed from: e */
    public k0l f161782e;

    /* JADX INFO: renamed from: f */
    public yzk f161783f;

    /* JADX INFO: renamed from: g */
    public final e30<a0l> f161784g = new C19822a();

    /* JADX INFO: renamed from: l.s0l$a */
    public class C19822a implements e30<a0l> {
        public C19822a() {
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(a0l a0lVar) {
            s0l.this.f161782e.m144066s0(a0lVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m181865e(View view) {
        act().onBackPressed();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f161779b.getContext();
    }

    /* JADX INFO: renamed from: c */
    public View m181866c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return t0l.m186873b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(k0l k0lVar) {
        this.f161782e = k0lVar;
    }

    /* JADX INFO: renamed from: f */
    public void m181868f(a0l a0lVar, boolean z) {
        if (z) {
            a0l a0lVarM216682q = this.f161783f.m216682q();
            if (a0lVarM216682q != null) {
                a0lVarM216682q.m94435d();
                m181869i(a0lVarM216682q);
            }
            a0lVar.m94434c();
        } else {
            a0lVar.m94435d();
        }
        m181869i(a0lVar);
    }

    /* JADX INFO: renamed from: i */
    public final void m181869i(a0l a0lVar) {
        View viewM186440a = sxj.m186440a(this.f161779b, a0lVar.m94437f());
        if (viewM186440a instanceof HideAvatarItemView) {
            ((HideAvatarItemView) viewM186440a).m70781l0(a0lVar);
        }
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m181866c(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public void m181870j(List<a0l> list, BLiveHideAvatarEnterConfig bLiveHideAvatarEnterConfig) {
        this.f161778a.setTitle(act().getString(R$string.f44883U));
        this.f161778a.setLeftIconOnClick(new View.OnClickListener() { // from class: l.q0l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f152065a.m181865e(view);
            }
        });
        if (this.f161783f == null) {
            yzk yzkVar = new yzk(this.f161784g);
            this.f161783f = yzkVar;
            this.f161779b.setAdapter(yzkVar);
            this.f161779b.setPageMargin(t100.m186890d(14.0f));
            this.f161780c.setViewPager(this.f161779b);
        }
        xdl0.m208344M(this.f161780c, list.size() >= 2);
        int currentItem = this.f161779b.getCurrentItem();
        this.f161783f.m216683r(list);
        this.f161781d.setText(bLiveHideAvatarEnterConfig.usage);
        if (currentItem != 0 && currentItem < list.size()) {
            this.f161779b.setCurrentItem(currentItem);
            return;
        }
        int iM200293G = vwb.m200293G(list, new r0l());
        if (iM200293G >= 0) {
            this.f161779b.setCurrentItem(iM200293G);
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
