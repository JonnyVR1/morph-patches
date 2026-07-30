package p009l;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.GreetingItem;
import com.p1.mobile.putong.core.ui.VText_Bold;
import l.clf0;
import l.e30;
import l.e51;
import l.mkd0;
import l.osi0;
import l.s7m;
import l.t100;
import l.tdw;
import l.x2c0;
import l.xdl0;
import l.zvf0;
import v.VEditText;
import v.VLinear;
import v.VProgressBar;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class sdw implements s7m<pdw> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f20194a;

    /* JADX INFO: renamed from: b */
    public VEditText f20195b;

    /* JADX INFO: renamed from: c */
    public VLinear f20196c;

    /* JADX INFO: renamed from: d */
    public VText_Bold f20197d;

    /* JADX INFO: renamed from: e */
    public VProgressBar f20198e;

    /* JADX INFO: renamed from: f */
    public final Act f20199f;

    /* JADX INFO: renamed from: g */
    public pdw f20200g;

    /* JADX INFO: renamed from: h */
    public GreetingItem f20201h;

    /* JADX INFO: renamed from: i */
    public String f20202i;

    /* JADX INFO: renamed from: j */
    public boolean f20203j = false;

    /* JADX INFO: renamed from: l.sdw$a */
    public class C1188a implements clf0.a {
        public C1188a() {
        }

        /* JADX INFO: renamed from: a */
        public void m22127a(int i) {
            xdl0.U(sdw.this.f20197d, t100.d(12.0f));
        }

        /* JADX INFO: renamed from: b */
        public void m22128b(int i) {
            xdl0.U(sdw.this.f20197d, i + t100.d(12.0f));
        }
    }

    /* JADX INFO: renamed from: l.sdw$b */
    public class ViewOnClickListenerC1189b implements View.OnClickListener {
        public ViewOnClickListenerC1189b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (sdw.this.f20203j) {
                return;
            }
            sdw.this.f20200g.m20169o0();
        }
    }

    /* JADX INFO: renamed from: l.sdw$c */
    public class ViewOnClickListenerC1190c implements View.OnClickListener {
        public ViewOnClickListenerC1190c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (sdw.this.f20203j) {
                return;
            }
            Editable text = sdw.this.f20195b.getText();
            if (TextUtils.isEmpty(text)) {
                osi0.g("数据为空");
                return;
            }
            if (sdw.this.f20201h == null) {
                sdw.this.f20201h = GreetingItem.new_();
            }
            sdw.this.f20201h.value = text.toString();
            sdw.this.f20201h.category = TextUtils.equals(text, sdw.this.f20202i) ? "ai" : "custom";
            sdw.this.f20200g.m20172s0(sdw.this.f20201h);
            zvf0.r("e_love_radar_ai_hello", sdw.this.f20199f.pageId());
        }
    }

    public sdw(Act act) {
        this.f20199f = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m22117p() {
        this.f20195b.requestFocus();
        this.f20199f.showInput(this.f20195b, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m22118q(CharSequence charSequence) {
        int length = charSequence.toString().length();
        VText_Bold vText_Bold = this.f20197d;
        if (length > 0) {
            vText_Bold.setBackgroundResource(x2c0.t);
        } else {
            vText_Bold.setBackgroundResource(x2c0.W0);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m22119C0() {
        return this.f20199f;
    }

    public Act act() {
        return this.f20199f;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m22121k(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public View m22121k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return tdw.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void m22120i1(pdw pdwVar) {
        this.f20200g = pdwVar;
    }

    /* JADX INFO: renamed from: m */
    public void m22123m() {
        this.f20203j = false;
        xdl0.M0(this.f20198e, false);
    }

    /* JADX INFO: renamed from: n */
    public void m22124n(Bundle bundle) {
        this.f20194a.setLeftIconAsBack(this.f20199f);
        Intent intent = this.f20199f.getIntent();
        if (intent == null) {
            return;
        }
        GreetingItem serializableExtra = intent.getSerializableExtra("data_key");
        this.f20201h = serializableExtra;
        if (serializableExtra == null) {
            this.f20195b.setHint("可以尝试添加开场白，展现你的聊天偏好，收获更有深度的聊天");
        } else {
            String str = serializableExtra.value;
            this.f20195b.setText(str);
            this.f20195b.setSelection(str.length());
            if (TextUtils.isEmpty(str) || str.length() <= 0) {
                this.f20197d.setBackgroundResource(x2c0.W0);
            } else {
                this.f20197d.setBackgroundResource(x2c0.t);
            }
        }
        e51.H(this.f20199f, new Runnable() { // from class: l.qdw
            @Override // java.lang.Runnable
            public final void run() {
                this.f19166a.m22117p();
            }
        }, 300L);
        this.f20195b.i(false).subscribe(mkd0.G(new e30() { // from class: l.rdw
            public final void call(Object obj) {
                this.f19780a.m22118q((CharSequence) obj);
            }
        }));
        clf0.c(this.f20195b, new C1188a());
        xdl0.E0(this.f20196c, new ViewOnClickListenerC1189b());
        xdl0.E0(this.f20197d, new ViewOnClickListenerC1190c());
    }

    /* JADX INFO: renamed from: s */
    public void m22125s(String str) {
        this.f20202i = str;
        this.f20195b.setText(str);
        this.f20195b.setSelection(str.length());
    }

    /* JADX INFO: renamed from: u */
    public void m22126u() {
        this.f20203j = true;
        xdl0.M(this.f20198e, true);
    }

    public void destroy() {
    }
}
