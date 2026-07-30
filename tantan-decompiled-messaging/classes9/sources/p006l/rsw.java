package p006l;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.R$string;
import com.p000p1.mobile.putong.core.p004ui.verification.ManualFaceVerificationAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.c;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.e30;
import l.e51;
import l.fmw;
import l.i0g0;
import l.mkd0;
import l.mmw;
import l.n500;
import l.rlw;
import l.s7m;
import l.ssw;
import l.sxl;
import l.t100;
import l.tif0;
import l.vwb;
import l.xdl0;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class rsw implements s7m<gsw> {

    /* JADX INFO: renamed from: a */
    public ImageView f20710a;

    /* JADX INFO: renamed from: b */
    public TextView f20711b;

    /* JADX INFO: renamed from: c */
    public TextView f20712c;

    /* JADX INFO: renamed from: d */
    public TextView f20713d;

    /* JADX INFO: renamed from: e */
    public TextView f20714e;

    /* JADX INFO: renamed from: f */
    public SurfaceView f20715f;

    /* JADX INFO: renamed from: g */
    public ImageView f20716g;

    /* JADX INFO: renamed from: h */
    public TextView f20717h;

    /* JADX INFO: renamed from: i */
    public ManualFaceVerificationAct f20718i;

    /* JADX INFO: renamed from: j */
    public gsw f20719j;

    /* JADX INFO: renamed from: k */
    public SurfaceHolderCallbackC1230a f20720k;

    /* JADX INFO: renamed from: l */
    public sxl f20721l;

    public rsw(ManualFaceVerificationAct manualFaceVerificationAct) {
        this.f20718i = manualFaceVerificationAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m22917m(View view) {
        zvf0.r("e_avatar_verification_video_refuse", "p_avatar_verification_video");
        this.f20718i.onBackPressed();
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m22918C0() {
        return this.f20718i;
    }

    public void destroy() {
        e51.K("ManuelPicVerificationPreview");
        e51.K("ManuelPicVerificationRECORDING");
    }

    /* JADX INFO: renamed from: e */
    public View m22919e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ssw.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void m22922i1(gsw gswVar) {
        this.f20719j = gswVar;
    }

    /* JADX INFO: renamed from: i */
    public void m22921i(String str, String str2) {
        this.f20718i.lifecycle().subscribe(mkd0.G(new e30() { // from class: l.hsw
            public final void call(Object obj) {
                this.f14040a.m22923j((c) obj);
            }
        }));
        this.f20711b.setText(String.valueOf(str.charAt(0)));
        this.f20712c.setText(String.valueOf(str.charAt(1)));
        this.f20713d.setText(String.valueOf(str.charAt(2)));
        this.f20714e.setText(String.valueOf(str.charAt(3)));
        this.f20717h.setText(i0g0.b0(this.f20718i.getResources().getString(R$string.f1578Am) + " 5", vwb.f0(new String[]{"5"}), Color.parseColor("#d74d37"), Typeface.DEFAULT));
        sxl sxlVarA = n500.a();
        this.f20721l = sxlVarA;
        sxlVarA.D(new fmw() { // from class: l.isw
            public final void onFirstFrameRendered() {
                this.f14743a.m22925l();
            }
        });
        rlw rlwVarA = rlw.A();
        rlwVarA.X(new tif0(t100.d(294.0f), t100.d(294.0f)));
        rlwVarA.E(1);
        rlwVarA.C(1);
        rlwVarA.V(30);
        rlwVarA.U(8388608);
        tif0 tif0Var = new tif0(720, 1280);
        rlwVarA.F(tif0Var);
        rlwVarA.R(tif0Var);
        this.f20720k = new SurfaceHolderCallbackC1230a(this.f20718i, str2, this.f20721l, rlwVarA);
        this.f20715f.getHolder().addCallback(this.f20720k);
        xdl0.E0(this.f20710a, new View.OnClickListener() { // from class: l.jsw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15383a.m22917m(view);
            }
        });
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m22919e(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m22923j(c cVar) {
        if (cVar == c.j) {
            if (NullChecker.a(this.f20721l)) {
                this.f20721l.j();
                this.f20721l.a();
            }
            this.f20718i.onBackPressed();
        }
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m22924k() {
        this.f20716g.setVisibility(8);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m22925l() {
        e51.F(this.f20718i, new Runnable() { // from class: l.ksw
            @Override // java.lang.Runnable
            public final void run() {
                this.f15987a.m22924k();
            }
        });
    }

    /* JADX INFO: renamed from: l.rsw$a */
    public class SurfaceHolderCallbackC1230a implements SurfaceHolder.Callback {

        /* JADX INFO: renamed from: a */
        public sxl f20722a;

        /* JADX INFO: renamed from: b */
        public Act f20723b;

        /* JADX INFO: renamed from: c */
        public String f20724c;

        /* JADX INFO: renamed from: d */
        public rlw f20725d;

        public SurfaceHolderCallbackC1230a(Act act, String str, sxl sxlVar, rlw rlwVar) {
            this.f20723b = act;
            this.f20724c = str;
            this.f20722a = sxlVar;
            this.f20725d = rlwVar;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m22927b(Throwable th) {
        }

        /* JADX INFO: renamed from: f */
        public static /* synthetic */ void m22931f(Throwable th) {
        }

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ void m22932g(Long l2) {
            rsw.this.f20717h.setText(i0g0.b0(this.f20723b.getResources().getString(R$string.f1578Am) + " " + (4 - l2.longValue()), vwb.f0(new String[]{String.valueOf(4 - l2.longValue())}), Color.parseColor("#d74d37"), Typeface.DEFAULT));
        }

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ void m22933h(Long l2) {
            rsw.this.f20711b.setTextColor(Color.parseColor("#000000"));
            rsw.this.f20712c.setTextColor(Color.parseColor("#000000"));
            rsw.this.f20713d.setTextColor(Color.parseColor("#000000"));
            rsw.this.f20714e.setTextColor(Color.parseColor("#000000"));
            int iIntValue = l2.intValue();
            if (iIntValue == 0) {
                rsw.this.f20712c.setTextColor(Color.parseColor("#d74d37"));
            } else if (iIntValue == 1) {
                rsw.this.f20713d.setTextColor(Color.parseColor("#d74d37"));
            } else {
                if (iIntValue != 2) {
                    return;
                }
                rsw.this.f20714e.setTextColor(Color.parseColor("#d74d37"));
            }
        }

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ void m22934i() {
            rsw.this.f20714e.setTextColor(Color.parseColor("#000000"));
            rsw.this.f20720k.f20722a.s();
            Act act = this.f20723b;
            act.progress(act.getString(R$string.f2304Ys));
            rsw.this.f20720k.f20722a.P(new a());
        }

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ void m22935j() {
            rsw.this.f20717h.setText(R$string.f1608Bm);
            rsw.this.f20720k.f20722a.H(this.f20724c);
            rsw.this.f20720k.f20722a.i();
            rsw.this.f20711b.setTextColor(Color.parseColor("#d74d37"));
            this.f20723b.duringCreated(e51.N("ManuelPicVerificationRECORDING", 4)).subscribe(mkd0.I(new e30() { // from class: l.osw
                public final void call(Object obj) {
                    this.f18359a.m22933h((Long) obj);
                }
            }, new e30() { // from class: l.psw
                public final void call(Object obj) {
                    rsw.SurfaceHolderCallbackC1230a.m22927b((Throwable) obj);
                }
            }, new d30() { // from class: l.qsw
                public final void call() {
                    this.f20047a.m22934i();
                }
            }));
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            this.f20722a.n(720, 1280);
            this.f20722a.I(this.f20723b, this.f20725d);
            this.f20722a.w(surfaceHolder);
            this.f20722a.g();
            this.f20723b.duringCreated(e51.N("ManuelPicVerificationPreview", 5)).subscribe(mkd0.I(new e30() { // from class: l.lsw
                public final void call(Object obj) {
                    this.f16622a.m22932g((Long) obj);
                }
            }, new e30() { // from class: l.msw
                public final void call(Object obj) {
                    rsw.SurfaceHolderCallbackC1230a.m22931f((Throwable) obj);
                }
            }, new d30() { // from class: l.nsw
                public final void call() {
                    this.f17840a.m22935j();
                }
            }));
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            this.f20723b = null;
        }

        /* JADX INFO: renamed from: l.rsw$a$a */
        public class a implements mmw {
            public a() {
            }

            /* JADX INFO: renamed from: a */
            public void m22936a(String str) {
                SurfaceHolderCallbackC1230a.this.f20723b.finish();
            }

            /* JADX INFO: renamed from: c */
            public void m22938c() {
                rsw.this.f20719j.m15961p0();
            }

            /* JADX INFO: renamed from: b */
            public void m22937b(int i) {
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
        }
    }
}
