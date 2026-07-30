package p006l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.app.PutongAct;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.settings.filter.newui.NewFilterTagItem;
import com.p000p1.mobile.putong.core.p004ui.settings.filter.tags.TagContainerLayout;
import com.p1.mobile.putong.core.data.Privilege;
import java.util.Arrays;
import l.e30;
import l.s7m;
import l.w9j;
import l.xdl0;
import l.yoc0;
import l.zvf0;
import v.VFrame;
import v.VText;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class xoc0 implements s7m<woc0> {

    /* JADX INFO: renamed from: a */
    public VFrame f27654a;

    /* JADX INFO: renamed from: b */
    public VNavigationBar f27655b;

    /* JADX INFO: renamed from: c */
    public TagContainerLayout f27656c;

    /* JADX INFO: renamed from: d */
    public VText f27657d;

    /* JADX INFO: renamed from: e */
    public woc0 f27658e;

    /* JADX INFO: renamed from: f */
    public PutongAct f27659f;

    /* JADX INFO: renamed from: g */
    public ja40 f27660g;

    /* JADX INFO: renamed from: h */
    public String f27661h;

    /* JADX INFO: renamed from: l.xoc0$a */
    public class ViewOnClickListenerC1447a implements View.OnClickListener {
        public ViewOnClickListenerC1447a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NewFilterTagItem newFilterTagItemM15985i = xoc0.this.f27660g.m15985i();
            xoc0 xoc0Var = xoc0.this;
            if (newFilterTagItemM15985i != null) {
                xoc0Var.f27661h = newFilterTagItemM15985i.getBindViewData().f9555d;
            } else {
                xoc0Var.f27661h = "";
            }
            xoc0.this.f27658e.m26555f0(xoc0.this.f27661h);
        }
    }

    /* JADX INFO: renamed from: l.xoc0$b */
    public class C1448b implements w9j<NewFilterTagItem, Boolean> {
        public C1448b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(NewFilterTagItem newFilterTagItem) {
            if (newFilterTagItem == 0 || newFilterTagItem.isSelected() || !xma.m27379e4() || !xma.m27389j4()) {
                return Boolean.FALSE;
            }
            if (newFilterTagItem.getBindViewData().f9552a == 1) {
                CoreModule.m1854P().m11706a().m5502pr(xoc0.this.act(), "p_settings_view,e_intl_select_long_term_fun,click", Privilege.intl_advanced_filter);
            } else {
                CoreModule.m1854P().m11706a().m5502pr(xoc0.this.act(), "p_settings_view,e_intl_select_short_term_fun,click", Privilege.intl_advanced_filter);
            }
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: l.xoc0$c */
    public class C1449c implements e30<NewFilterTagItem> {
        public C1449c() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(NewFilterTagItem newFilterTagItem) {
            if (newFilterTagItem == 0 || !newFilterTagItem.isSelected()) {
                return;
            }
            if (newFilterTagItem.getBindViewData().f9552a == 1) {
                zvf0.r("e_intl_select_long_term_partner", "p_settings_view");
            } else {
                zvf0.r("e_intl_select_short_term_fun", "p_settings_view");
            }
        }
    }

    public xoc0(PutongAct putongAct) {
        this.f27659f = putongAct;
    }

    /* JADX INFO: renamed from: j */
    private void m27571j() {
        ja40 ja40Var = new ja40();
        this.f27660g = ja40Var;
        ja40Var.m15987m(new C1448b());
        this.f27660g.m15988n(new C1449c());
        this.f27656c.setCanAdjustChildHeight(false);
        this.f27656c.setAdapter(this.f27660g);
        this.f27660g.m17409r(Arrays.asList(qne0.f19942i));
        for (ca40 ca40Var : this.f27660g.f15083g) {
            if (TextUtils.equals(ca40Var.f9555d, this.f27661h)) {
                this.f27660g.m15989o(ca40Var);
            }
        }
    }

    /* JADX INFO: renamed from: A3 */
    public void m27572A3(String str) {
        this.f27661h = str;
        this.f27655b.setLeftIconAsBack(this.f27659f);
        m27571j();
        xdl0.E0(this.f27657d, new ViewOnClickListenerC1447a());
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m27573C0() {
        return this.f27659f;
    }

    /* JADX INFO: renamed from: e */
    public View m27574e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return yoc0.b(this, layoutInflater, viewGroup);
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public PutongAct act() {
        return this.f27659f;
    }

    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void m27577i1(woc0 woc0Var) {
        this.f27658e = woc0Var;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m27574e(layoutInflater, viewGroup);
    }

    public void destroy() {
    }
}
