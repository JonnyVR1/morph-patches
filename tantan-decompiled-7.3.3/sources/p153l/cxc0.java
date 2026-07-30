package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.p058ui.settings.filter.newui.NewFilterTagItem;
import com.p051p1.mobile.putong.core.p058ui.settings.filter.tags.TagContainerLayout;
import java.util.Arrays;
import p151v.VFrame;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes12.dex */
public class cxc0 implements iam<bxc0> {

    /* JADX INFO: renamed from: a */
    public VFrame f84198a;

    /* JADX INFO: renamed from: b */
    public VNavigationBar f84199b;

    /* JADX INFO: renamed from: c */
    public TagContainerLayout f84200c;

    /* JADX INFO: renamed from: d */
    public VText f84201d;

    /* JADX INFO: renamed from: e */
    public bxc0 f84202e;

    /* JADX INFO: renamed from: f */
    public PutongAct f84203f;

    /* JADX INFO: renamed from: g */
    public xi40 f84204g;

    /* JADX INFO: renamed from: h */
    public String f84205h;

    /* JADX INFO: renamed from: l.cxc0$a */
    public class ViewOnClickListenerC16387a implements View.OnClickListener {
        public ViewOnClickListenerC16387a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NewFilterTagItem newFilterTagItemM165613i = cxc0.this.f84204g.m165613i();
            cxc0 cxc0Var = cxc0.this;
            if (newFilterTagItemM165613i != null) {
                cxc0Var.f84205h = newFilterTagItemM165613i.getBindViewData().f157801d;
            } else {
                cxc0Var.f84205h = "";
            }
            cxc0.this.f84202e.m106873f0(cxc0.this.f84205h);
        }
    }

    /* JADX INFO: renamed from: l.cxc0$b */
    public class C16388b implements qcj<NewFilterTagItem, Boolean> {
        public C16388b() {
        }

        @Override // p153l.qcj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(NewFilterTagItem newFilterTagItem) {
            if (newFilterTagItem == null || newFilterTagItem.isSelected() || !joa.m146386f4() || !joa.m146396k4()) {
                return Boolean.FALSE;
            }
            if (newFilterTagItem.getBindViewData().f157798a == 1) {
                CoreModule.m30933P().m143405a().mo34568pr(cxc0.this.act(), "p_settings_view,e_intl_select_long_term_fun,click", Privilege.intl_advanced_filter);
            } else {
                CoreModule.m30933P().m143405a().mo34568pr(cxc0.this.act(), "p_settings_view,e_intl_select_short_term_fun,click", Privilege.intl_advanced_filter);
            }
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: l.cxc0$c */
    public class C16389c implements y20<NewFilterTagItem> {
        public C16389c() {
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(NewFilterTagItem newFilterTagItem) {
            if (newFilterTagItem == null || !newFilterTagItem.isSelected()) {
                return;
            }
            if (newFilterTagItem.getBindViewData().f157798a == 1) {
                i4g0.m138520r("e_intl_select_long_term_partner", "p_settings_view");
            } else {
                i4g0.m138520r("e_intl_select_short_term_fun", "p_settings_view");
            }
        }
    }

    public cxc0(PutongAct putongAct) {
        this.f84203f = putongAct;
    }

    /* JADX INFO: renamed from: j */
    private void m112964j() {
        xi40 xi40Var = new xi40();
        this.f84204g = xi40Var;
        xi40Var.m165616m(new C16388b());
        this.f84204g.m165617n(new C16389c());
        this.f84200c.setCanAdjustChildHeight(false);
        this.f84200c.setAdapter(this.f84204g);
        this.f84204g.m211098r(Arrays.asList(xve0.f196393i));
        for (qi40 qi40Var : this.f84204g.f194432g) {
            if (TextUtils.equals(qi40Var.f157801d, this.f84205h)) {
                this.f84204g.m165618o(qi40Var);
            }
        }
    }

    /* JADX INFO: renamed from: A3 */
    public void m112965A3(String str) {
        this.f84205h = str;
        this.f84199b.setLeftIconAsBack(this.f84203f);
        m112964j();
        bnl0.m105509E0(this.f84201d, new ViewOnClickListenerC16387a());
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f84203f;
    }

    /* JADX INFO: renamed from: e */
    public View m112966e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return dxc0.m118464b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public PutongAct act() {
        return this.f84203f;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(bxc0 bxc0Var) {
        this.f84202e = bxc0Var;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m112966e(layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
