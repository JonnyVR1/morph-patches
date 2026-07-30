package p149l;

import android.view.View;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.data.AuthData;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class rhp0 extends olp0<php0> {

    /* JADX INFO: renamed from: F */
    public Map<String, String> f159467F;

    /* JADX INFO: renamed from: l.rhp0$a */
    public class ViewOnClickListenerC19705a implements View.OnClickListener {
        public ViewOnClickListenerC19705a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            rhp0.this.f144533g.setVisibility(8);
            rhp0 rhp0Var = rhp0.this;
            rhp0Var.mo135219A(rhp0Var.f159467F);
        }
    }

    /* JADX INFO: renamed from: l.rhp0$b */
    public class C19706b implements sw3.InterfaceC20043a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ sw3.InterfaceC20043a f159469a;

        public C19706b(sw3.InterfaceC20043a interfaceC20043a) {
            this.f159469a = interfaceC20043a;
        }

        @Override // p149l.sw3.InterfaceC20043a
        /* JADX INFO: renamed from: a */
        public void mo36610a(String str) {
            sw3.InterfaceC20043a interfaceC20043a = this.f159469a;
            if (interfaceC20043a != null) {
                interfaceC20043a.mo36610a(str);
            }
            zvf0.m220371D("e_web_open", ((php0) rhp0.this.f144535i).m169126o0(), new j760("web_page_open_state", "success"), new j760("web_page_open_error_msg", ""), new j760("page_id", ((php0) rhp0.this.f144535i).m169126o0()), new j760("page_from_type", "network_h5"));
        }

        @Override // p149l.sw3.InterfaceC20043a
        /* JADX INFO: renamed from: b */
        public void mo36611b(String str) {
            sw3.InterfaceC20043a interfaceC20043a = this.f159469a;
            if (interfaceC20043a != null) {
                interfaceC20043a.mo36611b(str);
            }
        }

        @Override // p149l.sw3.InterfaceC20043a
        /* JADX INFO: renamed from: c */
        public void mo36612c(int i, String str, String str2) {
            rhp0.this.m179458W();
            zvf0.m220371D("e_web_open", ((php0) rhp0.this.f144535i).m169126o0(), new j760("web_page_open_state", "fail"), new j760("web_page_open_error_msg", str), new j760("page_id", ((php0) rhp0.this.f144535i).m169126o0()), new j760("page_from_type", "network_h5"));
        }
    }

    public rhp0(PutongAct putongAct) {
        super(putongAct);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ Boolean m179456V(String str) {
        this.f144530d.loadUrl(str);
        return Boolean.TRUE;
    }

    @Override // p149l.olp0
    /* JADX INFO: renamed from: A */
    public void mo135219A(Map<String, String> map) {
        this.f159467F = map;
        if ("p_mytantan".equals(((php0) this.f144535i).m169126o0())) {
            ((php0) this.f144535i).m169125n0();
        } else {
            super.mo135219A(map);
        }
    }

    /* JADX INFO: renamed from: U */
    public void m179457U() {
        this.f144533g.setOnClickListener(new ViewOnClickListenerC19705a());
    }

    /* JADX INFO: renamed from: W */
    public void m179458W() {
        this.f144533g.setVisibility(0);
        this.f144531e.setVisibility(8);
        lsi0.m151595y("网络错误");
    }

    /* JADX INFO: renamed from: X */
    public void m179459X(AuthData authData) {
        this.f144522A = new aoq(act(), authData.accessToken, this.f144530d);
        HashMap map = new HashMap();
        if (jkp0.m141904d(m164980q())) {
            map.put("H5-Authorization", authData.accessToken);
        }
        this.f144530d.setOverScrollMode(2);
        super.mo135219A(map);
    }

    @Override // p149l.olp0
    /* JADX INFO: renamed from: u */
    public w9j<String, Boolean> mo135230u() {
        return new w9j() { // from class: l.qhp0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f154505a.m179456V((String) obj);
            }
        };
    }

    @Override // p149l.olp0
    /* JADX INFO: renamed from: v */
    public sw3.InterfaceC20043a mo135231v() {
        return new C19706b(super.mo135231v());
    }
}
