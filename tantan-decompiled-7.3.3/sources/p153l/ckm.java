package p153l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes7.dex */
public class ckm extends Handler {

    /* JADX INFO: renamed from: a */
    InterfaceC16294a f82299a;

    /* JADX INFO: renamed from: b */
    private int[] f82300b;

    /* JADX INFO: renamed from: l.ckm$a */
    public interface InterfaceC16294a {
        /* JADX INFO: renamed from: a */
        void mo110352a(Message message);

        /* JADX INFO: renamed from: b */
        void mo110353b(Message message);

        /* JADX INFO: renamed from: c */
        void mo110354c(Message message);

        /* JADX INFO: renamed from: d */
        void mo110355d(Message message);

        /* JADX INFO: renamed from: e */
        void mo110356e(Message message);

        /* JADX INFO: renamed from: f */
        void mo110357f(Message message);

        /* JADX INFO: renamed from: g */
        void mo110358g(Message message);

        /* JADX INFO: renamed from: h */
        void mo110359h(Message message);

        /* JADX INFO: renamed from: i */
        void mo110360i(Message message);

        /* JADX INFO: renamed from: j */
        void mo110361j(Message message);

        /* JADX INFO: renamed from: k */
        void mo110362k();

        /* JADX INFO: renamed from: l */
        void mo110363l(Message message);

        /* JADX INFO: renamed from: m */
        void mo110364m(Message message);

        /* JADX INFO: renamed from: n */
        void mo110365n(Message message);

        /* JADX INFO: renamed from: o */
        void mo110366o(Message message);

        void onPause();

        void onResume();

        /* JADX INFO: renamed from: p */
        void mo110367p(Message message);

        /* JADX INFO: renamed from: q */
        void mo110368q(Message message);

        /* JADX INFO: renamed from: r */
        void mo110369r(Message message);

        /* JADX INFO: renamed from: s */
        void mo110370s();

        /* JADX INFO: renamed from: t */
        void mo110371t();

        /* JADX INFO: renamed from: u */
        void mo110372u(Message message);

        /* JADX INFO: renamed from: v */
        void mo110373v(Message message);

        /* JADX INFO: renamed from: w */
        void mo110374w(Message message);
    }

    public ckm(Looper looper) {
        super(looper);
        this.f82300b = new int[]{1, 2, 4, 5, 6, 7, 8, 9, 16, 17, 18, 19, 21, 22, 23, 24, 25, 26, 27, 28, 29, 31, 32, 34};
    }

    /* JADX INFO: renamed from: a */
    public void m110350a() {
        for (int i : this.f82300b) {
            removeMessages(i);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m110351b(InterfaceC16294a interfaceC16294a) {
        this.f82299a = interfaceC16294a;
    }

    @Override // android.os.Handler
    @RequiresApi(api = 18)
    public void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                InterfaceC16294a interfaceC16294a = this.f82299a;
                if (interfaceC16294a != null) {
                    interfaceC16294a.mo110352a(message);
                }
                break;
            case 2:
                InterfaceC16294a interfaceC16294a2 = this.f82299a;
                if (interfaceC16294a2 != null) {
                    interfaceC16294a2.mo110364m(message);
                }
                break;
            case 4:
                InterfaceC16294a interfaceC16294a3 = this.f82299a;
                if (interfaceC16294a3 != null) {
                    interfaceC16294a3.mo110360i(message);
                }
                break;
            case 5:
                InterfaceC16294a interfaceC16294a4 = this.f82299a;
                if (interfaceC16294a4 != null) {
                    interfaceC16294a4.mo110373v(message);
                }
                break;
            case 6:
                InterfaceC16294a interfaceC16294a5 = this.f82299a;
                if (interfaceC16294a5 != null) {
                    interfaceC16294a5.mo110354c(message);
                }
                break;
            case 7:
                InterfaceC16294a interfaceC16294a6 = this.f82299a;
                if (interfaceC16294a6 != null) {
                    interfaceC16294a6.mo110372u(message);
                }
                break;
            case 8:
                InterfaceC16294a interfaceC16294a7 = this.f82299a;
                if (interfaceC16294a7 != null) {
                    interfaceC16294a7.mo110355d(message);
                }
                break;
            case 9:
                InterfaceC16294a interfaceC16294a8 = this.f82299a;
                if (interfaceC16294a8 != null) {
                    interfaceC16294a8.mo110359h(message);
                }
                break;
            case 16:
                InterfaceC16294a interfaceC16294a9 = this.f82299a;
                if (interfaceC16294a9 != null) {
                    interfaceC16294a9.mo110371t();
                }
                break;
            case 17:
                InterfaceC16294a interfaceC16294a10 = this.f82299a;
                if (interfaceC16294a10 != null) {
                    interfaceC16294a10.mo110366o(message);
                }
                break;
            case 18:
                InterfaceC16294a interfaceC16294a11 = this.f82299a;
                if (interfaceC16294a11 != null) {
                    interfaceC16294a11.mo110363l(message);
                }
                break;
            case 19:
                InterfaceC16294a interfaceC16294a12 = this.f82299a;
                if (interfaceC16294a12 != null) {
                    interfaceC16294a12.mo110358g(message);
                }
                break;
            case 21:
                InterfaceC16294a interfaceC16294a13 = this.f82299a;
                if (interfaceC16294a13 != null) {
                    interfaceC16294a13.mo110356e(message);
                }
                break;
            case 22:
                InterfaceC16294a interfaceC16294a14 = this.f82299a;
                if (interfaceC16294a14 != null) {
                    interfaceC16294a14.mo110369r(message);
                }
                break;
            case 23:
                InterfaceC16294a interfaceC16294a15 = this.f82299a;
                if (interfaceC16294a15 != null) {
                    interfaceC16294a15.mo110357f(message);
                }
                break;
            case 24:
                InterfaceC16294a interfaceC16294a16 = this.f82299a;
                if (interfaceC16294a16 != null) {
                    interfaceC16294a16.mo110353b(message);
                }
                break;
            case 25:
                InterfaceC16294a interfaceC16294a17 = this.f82299a;
                if (interfaceC16294a17 != null) {
                    interfaceC16294a17.mo110368q(message);
                }
                break;
            case 26:
                InterfaceC16294a interfaceC16294a18 = this.f82299a;
                if (interfaceC16294a18 != null) {
                    interfaceC16294a18.mo110362k();
                }
                break;
            case 27:
                InterfaceC16294a interfaceC16294a19 = this.f82299a;
                if (interfaceC16294a19 != null) {
                    interfaceC16294a19.mo110370s();
                }
                break;
            case 28:
                InterfaceC16294a interfaceC16294a20 = this.f82299a;
                if (interfaceC16294a20 != null) {
                    interfaceC16294a20.onPause();
                }
                break;
            case 29:
                InterfaceC16294a interfaceC16294a21 = this.f82299a;
                if (interfaceC16294a21 != null) {
                    interfaceC16294a21.onResume();
                }
                break;
            case 31:
                InterfaceC16294a interfaceC16294a22 = this.f82299a;
                if (interfaceC16294a22 != null) {
                    interfaceC16294a22.mo110367p(message);
                }
                break;
            case 32:
                InterfaceC16294a interfaceC16294a23 = this.f82299a;
                if (interfaceC16294a23 != null) {
                    interfaceC16294a23.mo110361j(message);
                }
                break;
            case 33:
                InterfaceC16294a interfaceC16294a24 = this.f82299a;
                if (interfaceC16294a24 != null) {
                    interfaceC16294a24.mo110374w(message);
                }
                break;
            case 34:
                InterfaceC16294a interfaceC16294a25 = this.f82299a;
                if (interfaceC16294a25 != null) {
                    interfaceC16294a25.mo110365n(message);
                }
                break;
        }
    }
}
