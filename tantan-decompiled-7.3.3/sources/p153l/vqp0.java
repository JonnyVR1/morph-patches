package p153l;

import android.view.View;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.data.AuthData;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class vqp0 extends sup0<tqp0> {

    /* JADX INFO: renamed from: F */
    public Map<String, String> f185388F;

    /* JADX INFO: renamed from: l.vqp0$a */
    public class ViewOnClickListenerC20905a implements View.OnClickListener {
        public ViewOnClickListenerC20905a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            vqp0.this.f170718g.setVisibility(8);
            vqp0 vqp0Var = vqp0.this;
            vqp0Var.mo115145A(vqp0Var.f185388F);
        }
    }

    /* JADX INFO: renamed from: l.vqp0$b */
    public class C20906b implements rx3.InterfaceC19928a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ rx3.InterfaceC19928a f185390a;

        public C20906b(rx3.InterfaceC19928a interfaceC19928a) {
            this.f185390a = interfaceC19928a;
        }

        @Override // p153l.rx3.InterfaceC19928a
        /* JADX INFO: renamed from: a */
        public void mo37613a(String str) {
            rx3.InterfaceC19928a interfaceC19928a = this.f185390a;
            if (interfaceC19928a != null) {
                interfaceC19928a.mo37613a(str);
            }
            i4g0.m138495D("e_web_open", ((tqp0) vqp0.this.f170720i).m192349o0(), new pf60("web_page_open_state", "success"), new pf60("web_page_open_error_msg", ""), new pf60("page_id", ((tqp0) vqp0.this.f170720i).m192349o0()), new pf60("page_from_type", "network_h5"));
        }

        @Override // p153l.rx3.InterfaceC19928a
        /* JADX INFO: renamed from: b */
        public void mo37614b(String str) {
            rx3.InterfaceC19928a interfaceC19928a = this.f185390a;
            if (interfaceC19928a != null) {
                interfaceC19928a.mo37614b(str);
            }
        }

        @Override // p153l.rx3.InterfaceC19928a
        /* JADX INFO: renamed from: c */
        public void mo37615c(int i, String str, String str2) {
            vqp0.this.m202452W();
            i4g0.m138495D("e_web_open", ((tqp0) vqp0.this.f170720i).m192349o0(), new pf60("web_page_open_state", "fail"), new pf60("web_page_open_error_msg", str), new pf60("page_id", ((tqp0) vqp0.this.f170720i).m192349o0()), new pf60("page_from_type", "network_h5"));
        }
    }

    public vqp0(PutongAct putongAct) {
        super(putongAct);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ Boolean m202450V(String str) {
        this.f170715d.loadUrl(str);
        return Boolean.TRUE;
    }

    @Override // p153l.sup0
    /* JADX INFO: renamed from: A */
    public void mo115145A(Map<String, String> map) {
        this.f185388F = map;
        if ("p_mytantan".equals(((tqp0) this.f170720i).m192349o0())) {
            ((tqp0) this.f170720i).m192348n0();
        } else {
            super.mo115145A(map);
        }
    }

    /* JADX INFO: renamed from: U */
    public void m202451U() {
        this.f170718g.setOnClickListener(new ViewOnClickListenerC20905a());
    }

    /* JADX INFO: renamed from: W */
    public void m202452W() {
        this.f170718g.setVisibility(0);
        this.f170716e.setVisibility(8);
        o1j0.m165651y("网络错误");
    }

    /* JADX INFO: renamed from: X */
    public void m202453X(AuthData authData) {
        this.f170707A = new zpq(act(), authData.accessToken, this.f170715d);
        HashMap map = new HashMap();
        if (ntp0.m164746d(m188067q())) {
            map.put("H5-Authorization", authData.accessToken);
        }
        this.f170715d.setOverScrollMode(2);
        super.mo115145A(map);
    }

    @Override // p153l.sup0
    /* JADX INFO: renamed from: u */
    public qcj<String, Boolean> mo98401u() {
        return new qcj() { // from class: l.uqp0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f180499a.m202450V((String) obj);
            }
        };
    }

    @Override // p153l.sup0
    /* JADX INFO: renamed from: v */
    public rx3.InterfaceC19928a mo98402v() {
        return new C20906b(super.mo98402v());
    }
}
