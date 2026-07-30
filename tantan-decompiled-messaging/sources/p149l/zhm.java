package p149l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes7.dex */
public class zhm extends Handler {

    /* JADX INFO: renamed from: a */
    InterfaceC21699a f203193a;

    /* JADX INFO: renamed from: b */
    private int[] f203194b;

    /* JADX INFO: renamed from: l.zhm$a */
    public interface InterfaceC21699a {
        /* JADX INFO: renamed from: a */
        void mo98715a(Message message);

        /* JADX INFO: renamed from: b */
        void mo98716b(Message message);

        /* JADX INFO: renamed from: c */
        void mo98717c(Message message);

        /* JADX INFO: renamed from: d */
        void mo98718d(Message message);

        /* JADX INFO: renamed from: e */
        void mo98719e(Message message);

        /* JADX INFO: renamed from: f */
        void mo98720f(Message message);

        /* JADX INFO: renamed from: g */
        void mo98721g(Message message);

        /* JADX INFO: renamed from: h */
        void mo98722h(Message message);

        /* JADX INFO: renamed from: i */
        void mo98723i(Message message);

        /* JADX INFO: renamed from: j */
        void mo98724j(Message message);

        /* JADX INFO: renamed from: k */
        void mo98725k();

        /* JADX INFO: renamed from: l */
        void mo98726l(Message message);

        /* JADX INFO: renamed from: m */
        void mo98727m(Message message);

        /* JADX INFO: renamed from: n */
        void mo98728n(Message message);

        /* JADX INFO: renamed from: o */
        void mo98729o(Message message);

        void onPause();

        void onResume();

        /* JADX INFO: renamed from: p */
        void mo98730p(Message message);

        /* JADX INFO: renamed from: q */
        void mo98731q(Message message);

        /* JADX INFO: renamed from: r */
        void mo98732r(Message message);

        /* JADX INFO: renamed from: s */
        void mo98733s();

        /* JADX INFO: renamed from: t */
        void mo98734t();

        /* JADX INFO: renamed from: u */
        void mo98735u(Message message);

        /* JADX INFO: renamed from: v */
        void mo98736v(Message message);

        /* JADX INFO: renamed from: w */
        void mo98737w(Message message);
    }

    public zhm(Looper looper) {
        super(looper);
        this.f203194b = new int[]{1, 2, 4, 5, 6, 7, 8, 9, 16, 17, 18, 19, 21, 22, 23, 24, 25, 26, 27, 28, 29, 31, 32, 34};
    }

    /* JADX INFO: renamed from: a */
    public void m218824a() {
        for (int i : this.f203194b) {
            removeMessages(i);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m218825b(InterfaceC21699a interfaceC21699a) {
        this.f203193a = interfaceC21699a;
    }

    @Override // android.os.Handler
    @RequiresApi(api = 18)
    public void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                InterfaceC21699a interfaceC21699a = this.f203193a;
                if (interfaceC21699a != null) {
                    interfaceC21699a.mo98715a(message);
                }
                break;
            case 2:
                InterfaceC21699a interfaceC21699a2 = this.f203193a;
                if (interfaceC21699a2 != null) {
                    interfaceC21699a2.mo98727m(message);
                }
                break;
            case 4:
                InterfaceC21699a interfaceC21699a3 = this.f203193a;
                if (interfaceC21699a3 != null) {
                    interfaceC21699a3.mo98723i(message);
                }
                break;
            case 5:
                InterfaceC21699a interfaceC21699a4 = this.f203193a;
                if (interfaceC21699a4 != null) {
                    interfaceC21699a4.mo98736v(message);
                }
                break;
            case 6:
                InterfaceC21699a interfaceC21699a5 = this.f203193a;
                if (interfaceC21699a5 != null) {
                    interfaceC21699a5.mo98717c(message);
                }
                break;
            case 7:
                InterfaceC21699a interfaceC21699a6 = this.f203193a;
                if (interfaceC21699a6 != null) {
                    interfaceC21699a6.mo98735u(message);
                }
                break;
            case 8:
                InterfaceC21699a interfaceC21699a7 = this.f203193a;
                if (interfaceC21699a7 != null) {
                    interfaceC21699a7.mo98718d(message);
                }
                break;
            case 9:
                InterfaceC21699a interfaceC21699a8 = this.f203193a;
                if (interfaceC21699a8 != null) {
                    interfaceC21699a8.mo98722h(message);
                }
                break;
            case 16:
                InterfaceC21699a interfaceC21699a9 = this.f203193a;
                if (interfaceC21699a9 != null) {
                    interfaceC21699a9.mo98734t();
                }
                break;
            case 17:
                InterfaceC21699a interfaceC21699a10 = this.f203193a;
                if (interfaceC21699a10 != null) {
                    interfaceC21699a10.mo98729o(message);
                }
                break;
            case 18:
                InterfaceC21699a interfaceC21699a11 = this.f203193a;
                if (interfaceC21699a11 != null) {
                    interfaceC21699a11.mo98726l(message);
                }
                break;
            case 19:
                InterfaceC21699a interfaceC21699a12 = this.f203193a;
                if (interfaceC21699a12 != null) {
                    interfaceC21699a12.mo98721g(message);
                }
                break;
            case 21:
                InterfaceC21699a interfaceC21699a13 = this.f203193a;
                if (interfaceC21699a13 != null) {
                    interfaceC21699a13.mo98719e(message);
                }
                break;
            case 22:
                InterfaceC21699a interfaceC21699a14 = this.f203193a;
                if (interfaceC21699a14 != null) {
                    interfaceC21699a14.mo98732r(message);
                }
                break;
            case 23:
                InterfaceC21699a interfaceC21699a15 = this.f203193a;
                if (interfaceC21699a15 != null) {
                    interfaceC21699a15.mo98720f(message);
                }
                break;
            case 24:
                InterfaceC21699a interfaceC21699a16 = this.f203193a;
                if (interfaceC21699a16 != null) {
                    interfaceC21699a16.mo98716b(message);
                }
                break;
            case 25:
                InterfaceC21699a interfaceC21699a17 = this.f203193a;
                if (interfaceC21699a17 != null) {
                    interfaceC21699a17.mo98731q(message);
                }
                break;
            case 26:
                InterfaceC21699a interfaceC21699a18 = this.f203193a;
                if (interfaceC21699a18 != null) {
                    interfaceC21699a18.mo98725k();
                }
                break;
            case 27:
                InterfaceC21699a interfaceC21699a19 = this.f203193a;
                if (interfaceC21699a19 != null) {
                    interfaceC21699a19.mo98733s();
                }
                break;
            case 28:
                InterfaceC21699a interfaceC21699a20 = this.f203193a;
                if (interfaceC21699a20 != null) {
                    interfaceC21699a20.onPause();
                }
                break;
            case 29:
                InterfaceC21699a interfaceC21699a21 = this.f203193a;
                if (interfaceC21699a21 != null) {
                    interfaceC21699a21.onResume();
                }
                break;
            case 31:
                InterfaceC21699a interfaceC21699a22 = this.f203193a;
                if (interfaceC21699a22 != null) {
                    interfaceC21699a22.mo98730p(message);
                }
                break;
            case 32:
                InterfaceC21699a interfaceC21699a23 = this.f203193a;
                if (interfaceC21699a23 != null) {
                    interfaceC21699a23.mo98724j(message);
                }
                break;
            case 33:
                InterfaceC21699a interfaceC21699a24 = this.f203193a;
                if (interfaceC21699a24 != null) {
                    interfaceC21699a24.mo98737w(message);
                }
                break;
            case 34:
                InterfaceC21699a interfaceC21699a25 = this.f203193a;
                if (interfaceC21699a25 != null) {
                    interfaceC21699a25.mo98728n(message);
                }
                break;
        }
    }
}
