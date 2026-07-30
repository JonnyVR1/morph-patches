package p006l;

import android.view.View;
import com.p000p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.data.AuthData;
import java.util.HashMap;
import java.util.Map;
import l.aoq;
import l.j760;
import l.jkp0;
import l.lsi0;
import l.olp0;
import l.sw3;
import l.w9j;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class rhp0 extends olp0<php0> {

    /* JADX INFO: renamed from: F */
    public Map<String, String> f20552F;

    /* JADX INFO: renamed from: l.rhp0$a */
    public class ViewOnClickListenerC1220a implements View.OnClickListener {
        public ViewOnClickListenerC1220a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((olp0) rhp0.this).g.setVisibility(8);
            rhp0 rhp0Var = rhp0.this;
            rhp0Var.m22854A(rhp0Var.f20552F);
        }
    }

    /* JADX INFO: renamed from: l.rhp0$b */
    public class C1221b implements sw3.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ sw3.a f20554a;

        public C1221b(sw3.a aVar) {
            this.f20554a = aVar;
        }

        /* JADX INFO: renamed from: a */
        public void m22860a(String str) {
            sw3.a aVar = this.f20554a;
            if (aVar != null) {
                aVar.a(str);
            }
            zvf0.D("e_web_open", ((php0) ((olp0) rhp0.this).i).m21122o0(), new j760[]{new j760("web_page_open_state", "success"), new j760("web_page_open_error_msg", ""), new j760("page_id", ((php0) ((olp0) rhp0.this).i).m21122o0()), new j760("page_from_type", "network_h5")});
        }

        /* JADX INFO: renamed from: b */
        public void m22861b(String str) {
            sw3.a aVar = this.f20554a;
            if (aVar != null) {
                aVar.b(str);
            }
        }

        /* JADX INFO: renamed from: c */
        public void m22862c(int i, String str, String str2) {
            rhp0.this.m22856W();
            zvf0.D("e_web_open", ((php0) ((olp0) rhp0.this).i).m21122o0(), new j760[]{new j760("web_page_open_state", "fail"), new j760("web_page_open_error_msg", str), new j760("page_id", ((php0) ((olp0) rhp0.this).i).m21122o0()), new j760("page_from_type", "network_h5")});
        }
    }

    public rhp0(PutongAct putongAct) {
        super(putongAct);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ Boolean m22853V(String str) {
        ((olp0) this).d.loadUrl(str);
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: A */
    public void m22854A(Map<String, String> map) {
        this.f20552F = map;
        if ("p_mytantan".equals(((php0) ((olp0) this).i).m21122o0())) {
            ((php0) ((olp0) this).i).m21121n0();
        } else {
            super.A(map);
        }
    }

    /* JADX INFO: renamed from: U */
    public void m22855U() {
        ((olp0) this).g.setOnClickListener(new ViewOnClickListenerC1220a());
    }

    /* JADX INFO: renamed from: W */
    public void m22856W() {
        ((olp0) this).g.setVisibility(0);
        ((olp0) this).e.setVisibility(8);
        lsi0.y("网络错误");
    }

    /* JADX INFO: renamed from: X */
    public void m22857X(AuthData authData) {
        ((olp0) this).A = new aoq(f(), authData.accessToken, ((olp0) this).d);
        HashMap map = new HashMap();
        if (jkp0.d(q())) {
            map.put("H5-Authorization", authData.accessToken);
        }
        ((olp0) this).d.setOverScrollMode(2);
        super.A(map);
    }

    /* JADX INFO: renamed from: u */
    public w9j<String, Boolean> m22858u() {
        return new w9j() { // from class: l.qhp0
            public final Object call(Object obj) {
                return this.f19759a.m22853V((String) obj);
            }
        };
    }

    /* JADX INFO: renamed from: v */
    public sw3.a m22859v() {
        return new C1221b(super.v());
    }
}
