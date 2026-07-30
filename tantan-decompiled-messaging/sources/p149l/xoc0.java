package p149l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.p053ui.settings.filter.newui.NewFilterTagItem;
import com.p046p1.mobile.putong.core.p053ui.settings.filter.tags.TagContainerLayout;
import java.util.Arrays;
import p147v.VFrame;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes9.dex */
public class xoc0 implements s7m<woc0> {

    /* JADX INFO: renamed from: a */
    public VFrame f193813a;

    /* JADX INFO: renamed from: b */
    public VNavigationBar f193814b;

    /* JADX INFO: renamed from: c */
    public TagContainerLayout f193815c;

    /* JADX INFO: renamed from: d */
    public VText f193816d;

    /* JADX INFO: renamed from: e */
    public woc0 f193817e;

    /* JADX INFO: renamed from: f */
    public PutongAct f193818f;

    /* JADX INFO: renamed from: g */
    public ja40 f193819g;

    /* JADX INFO: renamed from: h */
    public String f193820h;

    /* JADX INFO: renamed from: l.xoc0$a */
    public class ViewOnClickListenerC21189a implements View.OnClickListener {
        public ViewOnClickListenerC21189a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NewFilterTagItem newFilterTagItemM127947i = xoc0.this.f193819g.m127947i();
            xoc0 xoc0Var = xoc0.this;
            if (newFilterTagItemM127947i != null) {
                xoc0Var.f193820h = newFilterTagItemM127947i.getBindViewData().f80004d;
            } else {
                xoc0Var.f193820h = "";
            }
            xoc0.this.f193817e.m204802f0(xoc0.this.f193820h);
        }
    }

    /* JADX INFO: renamed from: l.xoc0$b */
    public class C21190b implements w9j<NewFilterTagItem, Boolean> {
        public C21190b() {
        }

        @Override // p149l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(NewFilterTagItem newFilterTagItem) {
            if (newFilterTagItem == null || newFilterTagItem.isSelected() || !xma.m210071e4() || !xma.m210081j4()) {
                return Boolean.FALSE;
            }
            if (newFilterTagItem.getBindViewData().f80001a == 1) {
                CoreModule.m29935P().m94651a().mo33565pr(xoc0.this.act(), "p_settings_view,e_intl_select_long_term_fun,click", Privilege.intl_advanced_filter);
            } else {
                CoreModule.m29935P().m94651a().mo33565pr(xoc0.this.act(), "p_settings_view,e_intl_select_short_term_fun,click", Privilege.intl_advanced_filter);
            }
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: l.xoc0$c */
    public class C21191c implements e30<NewFilterTagItem> {
        public C21191c() {
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(NewFilterTagItem newFilterTagItem) {
            if (newFilterTagItem == null || !newFilterTagItem.isSelected()) {
                return;
            }
            if (newFilterTagItem.getBindViewData().f80001a == 1) {
                zvf0.m220396r("e_intl_select_long_term_partner", "p_settings_view");
            } else {
                zvf0.m220396r("e_intl_select_short_term_fun", "p_settings_view");
            }
        }
    }

    public xoc0(PutongAct putongAct) {
        this.f193818f = putongAct;
    }

    /* JADX INFO: renamed from: j */
    private void m210396j() {
        ja40 ja40Var = new ja40();
        this.f193819g = ja40Var;
        ja40Var.m127949m(new C21190b());
        this.f193819g.m127950n(new C21191c());
        this.f193815c.setCanAdjustChildHeight(false);
        this.f193815c.setAdapter(this.f193819g);
        this.f193819g.m140687r(Arrays.asList(qne0.f155429i));
        for (ca40 ca40Var : this.f193819g.f117065g) {
            if (TextUtils.equals(ca40Var.f80004d, this.f193820h)) {
                this.f193819g.m127951o(ca40Var);
            }
        }
    }

    /* JADX INFO: renamed from: A3 */
    public void m210397A3(String str) {
        this.f193820h = str;
        this.f193814b.setLeftIconAsBack(this.f193818f);
        m210396j();
        xdl0.m208329E0(this.f193816d, new ViewOnClickListenerC21189a());
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f193818f;
    }

    /* JADX INFO: renamed from: e */
    public View m210398e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return yoc0.m215490b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public PutongAct act() {
        return this.f193818f;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(woc0 woc0Var) {
        this.f193817e = woc0Var;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m210398e(layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
