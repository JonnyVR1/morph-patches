package p153l;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.GreetingItem;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import p151v.VEditText;
import p151v.VLinear;
import p151v.VProgressBar;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes11.dex */
public class qfw implements iam<nfw> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f157343a;

    /* JADX INFO: renamed from: b */
    public VEditText f157344b;

    /* JADX INFO: renamed from: c */
    public VLinear f157345c;

    /* JADX INFO: renamed from: d */
    public VText_Bold f157346d;

    /* JADX INFO: renamed from: e */
    public VProgressBar f157347e;

    /* JADX INFO: renamed from: f */
    public final Act f157348f;

    /* JADX INFO: renamed from: g */
    public nfw f157349g;

    /* JADX INFO: renamed from: h */
    public GreetingItem f157350h;

    /* JADX INFO: renamed from: i */
    public String f157351i;

    /* JADX INFO: renamed from: j */
    public boolean f157352j = false;

    /* JADX INFO: renamed from: l.qfw$a */
    public class C19566a implements ltf0.InterfaceC18459a {
        public C19566a() {
        }

        @Override // p153l.ltf0.InterfaceC18459a
        /* JADX INFO: renamed from: a */
        public void mo95584a(int i) {
            bnl0.m105537U(qfw.this.f157346d, qa00.m175859d(12.0f));
        }

        @Override // p153l.ltf0.InterfaceC18459a
        /* JADX INFO: renamed from: b */
        public void mo95585b(int i) {
            bnl0.m105537U(qfw.this.f157346d, i + qa00.m175859d(12.0f));
        }
    }

    /* JADX INFO: renamed from: l.qfw$b */
    public class ViewOnClickListenerC19567b implements View.OnClickListener {
        public ViewOnClickListenerC19567b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (qfw.this.f157352j) {
                return;
            }
            qfw.this.f157349g.m162953o0();
        }
    }

    /* JADX INFO: renamed from: l.qfw$c */
    public class ViewOnClickListenerC19568c implements View.OnClickListener {
        public ViewOnClickListenerC19568c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (qfw.this.f157352j) {
                return;
            }
            Editable text = qfw.this.f157344b.getText();
            if (TextUtils.isEmpty(text)) {
                r1j0.m179420g("数据为空");
                return;
            }
            if (qfw.this.f157350h == null) {
                qfw.this.f157350h = GreetingItem.new_();
            }
            qfw.this.f157350h.value = text.toString();
            qfw.this.f157350h.category = TextUtils.equals(text, qfw.this.f157351i) ? "ai" : "custom";
            qfw.this.f157349g.m162956s0(qfw.this.f157350h);
            i4g0.m138520r("e_love_radar_ai_hello", qfw.this.f157348f.pageId());
        }
    }

    public qfw(Act act) {
        this.f157348f = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m176418p() {
        this.f157344b.requestFocus();
        this.f157348f.showInput(this.f157344b, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m176419q(CharSequence charSequence) {
        int length = charSequence.toString().length();
        VText_Bold vText_Bold = this.f157346d;
        if (length > 0) {
            vText_Bold.setBackgroundResource(dbc0.f87465u);
        } else {
            vText_Bold.setBackgroundResource(dbc0.f86713X0);
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f157348f;
    }

    @Override // p153l.iam
    public Act act() {
        return this.f157348f;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m176420k(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public View m176420k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return rfw.m181308b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(nfw nfwVar) {
        this.f157349g = nfwVar;
    }

    /* JADX INFO: renamed from: m */
    public void m176422m() {
        this.f157352j = false;
        bnl0.m105525M0(this.f157347e, false);
    }

    /* JADX INFO: renamed from: n */
    public void m176423n(Bundle bundle) {
        this.f157343a.setLeftIconAsBack(this.f157348f);
        Intent intent = this.f157348f.getIntent();
        if (intent == null) {
            return;
        }
        GreetingItem greetingItem = (GreetingItem) intent.getSerializableExtra("data_key");
        this.f157350h = greetingItem;
        if (greetingItem == null) {
            this.f157344b.setHint("可以尝试添加开场白，展现你的聊天偏好，收获更有深度的聊天");
        } else {
            String str = greetingItem.value;
            this.f157344b.setText(str);
            this.f157344b.setSelection(str.length());
            if (TextUtils.isEmpty(str) || str.length() <= 0) {
                this.f157346d.setBackgroundResource(dbc0.f86713X0);
            } else {
                this.f157346d.setBackgroundResource(dbc0.f87465u);
            }
        }
        l51.m152888H(this.f157348f, new Runnable() { // from class: l.ofw
            @Override // java.lang.Runnable
            public final void run() {
                this.f147165a.m176418p();
            }
        }, 300L);
        this.f157344b.mo29617i(false).subscribe(psd0.m173596G(new y20() { // from class: l.pfw
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f152210a.m176419q((CharSequence) obj);
            }
        }));
        ltf0.m155773c(this.f157344b, new C19566a());
        bnl0.m105509E0(this.f157345c, new ViewOnClickListenerC19567b());
        bnl0.m105509E0(this.f157346d, new ViewOnClickListenerC19568c());
    }

    /* JADX INFO: renamed from: s */
    public void m176424s(String str) {
        this.f157351i = str;
        this.f157344b.setText(str);
        this.f157344b.setSelection(str.length());
    }

    /* JADX INFO: renamed from: u */
    public void m176425u() {
        this.f157352j = true;
        bnl0.m105524M(this.f157347e, true);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
