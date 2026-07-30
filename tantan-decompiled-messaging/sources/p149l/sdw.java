package p149l;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.GreetingItem;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import p147v.VEditText;
import p147v.VLinear;
import p147v.VProgressBar;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes11.dex */
public class sdw implements s7m<pdw> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f163899a;

    /* JADX INFO: renamed from: b */
    public VEditText f163900b;

    /* JADX INFO: renamed from: c */
    public VLinear f163901c;

    /* JADX INFO: renamed from: d */
    public VText_Bold f163902d;

    /* JADX INFO: renamed from: e */
    public VProgressBar f163903e;

    /* JADX INFO: renamed from: f */
    public final Act f163904f;

    /* JADX INFO: renamed from: g */
    public pdw f163905g;

    /* JADX INFO: renamed from: h */
    public GreetingItem f163906h;

    /* JADX INFO: renamed from: i */
    public String f163907i;

    /* JADX INFO: renamed from: j */
    public boolean f163908j = false;

    /* JADX INFO: renamed from: l.sdw$a */
    public class C19912a implements clf0.InterfaceC16186a {
        public C19912a() {
        }

        @Override // p149l.clf0.InterfaceC16186a
        /* JADX INFO: renamed from: a */
        public void mo104524a(int i) {
            xdl0.m208357U(sdw.this.f163902d, t100.m186890d(12.0f));
        }

        @Override // p149l.clf0.InterfaceC16186a
        /* JADX INFO: renamed from: b */
        public void mo104525b(int i) {
            xdl0.m208357U(sdw.this.f163902d, i + t100.m186890d(12.0f));
        }
    }

    /* JADX INFO: renamed from: l.sdw$b */
    public class ViewOnClickListenerC19913b implements View.OnClickListener {
        public ViewOnClickListenerC19913b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (sdw.this.f163908j) {
                return;
            }
            sdw.this.f163905g.m168426o0();
        }
    }

    /* JADX INFO: renamed from: l.sdw$c */
    public class ViewOnClickListenerC19914c implements View.OnClickListener {
        public ViewOnClickListenerC19914c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (sdw.this.f163908j) {
                return;
            }
            Editable text = sdw.this.f163900b.getText();
            if (TextUtils.isEmpty(text)) {
                osi0.m165783g("数据为空");
                return;
            }
            if (sdw.this.f163906h == null) {
                sdw.this.f163906h = GreetingItem.new_();
            }
            sdw.this.f163906h.value = text.toString();
            sdw.this.f163906h.category = TextUtils.equals(text, sdw.this.f163907i) ? "ai" : "custom";
            sdw.this.f163905g.m168429s0(sdw.this.f163906h);
            zvf0.m220396r("e_love_radar_ai_hello", sdw.this.f163904f.pageId());
        }
    }

    public sdw(Act act) {
        this.f163904f = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m183564p() {
        this.f163900b.requestFocus();
        this.f163904f.showInput(this.f163900b, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m183565q(CharSequence charSequence) {
        int length = charSequence.toString().length();
        VText_Bold vText_Bold = this.f163902d;
        if (length > 0) {
            vText_Bold.setBackgroundResource(x2c0.f190570t);
        } else {
            vText_Bold.setBackgroundResource(x2c0.f189842W0);
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f163904f;
    }

    @Override // p149l.s7m
    public Act act() {
        return this.f163904f;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m183566k(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public View m183566k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return tdw.m188463b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(pdw pdwVar) {
        this.f163905g = pdwVar;
    }

    /* JADX INFO: renamed from: m */
    public void m183568m() {
        this.f163908j = false;
        xdl0.m208345M0(this.f163903e, false);
    }

    /* JADX INFO: renamed from: n */
    public void m183569n(Bundle bundle) {
        this.f163899a.setLeftIconAsBack(this.f163904f);
        Intent intent = this.f163904f.getIntent();
        if (intent == null) {
            return;
        }
        GreetingItem greetingItem = (GreetingItem) intent.getSerializableExtra("data_key");
        this.f163906h = greetingItem;
        if (greetingItem == null) {
            this.f163900b.setHint("可以尝试添加开场白，展现你的聊天偏好，收获更有深度的聊天");
        } else {
            String str = greetingItem.value;
            this.f163900b.setText(str);
            this.f163900b.setSelection(str.length());
            if (TextUtils.isEmpty(str) || str.length() <= 0) {
                this.f163902d.setBackgroundResource(x2c0.f189842W0);
            } else {
                this.f163902d.setBackgroundResource(x2c0.f190570t);
            }
        }
        e51.m114743H(this.f163904f, new Runnable() { // from class: l.qdw
            @Override // java.lang.Runnable
            public final void run() {
                this.f153976a.m183564p();
            }
        }, 300L);
        this.f163900b.mo28618i(false).subscribe(mkd0.m154955G(new e30() { // from class: l.rdw
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f159015a.m183565q((CharSequence) obj);
            }
        }));
        clf0.m107459c(this.f163900b, new C19912a());
        xdl0.m208329E0(this.f163901c, new ViewOnClickListenerC19913b());
        xdl0.m208329E0(this.f163902d, new ViewOnClickListenerC19914c());
    }

    /* JADX INFO: renamed from: s */
    public void m183570s(String str) {
        this.f163907i = str;
        this.f163900b.setText(str);
        this.f163900b.setSelection(str.length());
    }

    /* JADX INFO: renamed from: u */
    public void m183571u() {
        this.f163908j = true;
        xdl0.m208344M(this.f163903e, true);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
