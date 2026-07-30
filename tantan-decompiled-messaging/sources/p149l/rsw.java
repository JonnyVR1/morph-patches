package p149l;

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
import com.clevertap.android.sdk.Constants;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.p053ui.verification.ManualFaceVerificationAct;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes9.dex */
public class rsw implements s7m<gsw> {

    /* JADX INFO: renamed from: a */
    public ImageView f160902a;

    /* JADX INFO: renamed from: b */
    public TextView f160903b;

    /* JADX INFO: renamed from: c */
    public TextView f160904c;

    /* JADX INFO: renamed from: d */
    public TextView f160905d;

    /* JADX INFO: renamed from: e */
    public TextView f160906e;

    /* JADX INFO: renamed from: f */
    public SurfaceView f160907f;

    /* JADX INFO: renamed from: g */
    public ImageView f160908g;

    /* JADX INFO: renamed from: h */
    public TextView f160909h;

    /* JADX INFO: renamed from: i */
    public ManualFaceVerificationAct f160910i;

    /* JADX INFO: renamed from: j */
    public gsw f160911j;

    /* JADX INFO: renamed from: k */
    public SurfaceHolderCallbackC19776a f160912k;

    /* JADX INFO: renamed from: l */
    public sxl f160913l;

    public rsw(ManualFaceVerificationAct manualFaceVerificationAct) {
        this.f160910i = manualFaceVerificationAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m180724m(View view) {
        zvf0.m220396r("e_avatar_verification_video_refuse", "p_avatar_verification_video");
        this.f160910i.onBackPressed();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f160910i;
    }

    @Override // p149l.s7m
    public void destroy() {
        e51.m114746K("ManuelPicVerificationPreview");
        e51.m114746K("ManuelPicVerificationRECORDING");
    }

    /* JADX INFO: renamed from: e */
    public View m180725e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ssw.m185777b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(gsw gswVar) {
        this.f160911j = gswVar;
    }

    /* JADX INFO: renamed from: i */
    public void m180727i(String str, String str2) {
        this.f160910i.lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.hsw
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f109351a.m180728j((C4319c) obj);
            }
        }));
        this.f160903b.setText(String.valueOf(str.charAt(0)));
        this.f160904c.setText(String.valueOf(str.charAt(1)));
        this.f160905d.setText(String.valueOf(str.charAt(2)));
        this.f160906e.setText(String.valueOf(str.charAt(3)));
        this.f160909h.setText(i0g0.m133861b0(this.f160910i.getResources().getString(R$string.f17589Am) + " 5", vwb.m200324f0("5"), Color.parseColor("#d74d37"), Typeface.DEFAULT));
        sxl sxlVarM157980a = n500.m157980a();
        this.f160913l = sxlVarM157980a;
        sxlVarM157980a.mo189579D(new fmw() { // from class: l.isw
            @Override // p149l.fmw
            public final void onFirstFrameRendered() {
                this.f114808a.m180730l();
            }
        });
        rlw rlwVarM179885A = rlw.m179885A();
        rlwVarM179885A.m179908X(new tif0(t100.m186890d(294.0f), t100.m186890d(294.0f)));
        rlwVarM179885A.m179889E(1);
        rlwVarM179885A.m179887C(1);
        rlwVarM179885A.m179906V(30);
        rlwVarM179885A.m179905U(8388608);
        tif0 tif0Var = new tif0(720, EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK);
        rlwVarM179885A.m179890F(tif0Var);
        rlwVarM179885A.m179902R(tif0Var);
        this.f160912k = new SurfaceHolderCallbackC19776a(this.f160910i, str2, this.f160913l, rlwVarM179885A);
        this.f160907f.getHolder().addCallback(this.f160912k);
        xdl0.m208329E0(this.f160902a, new View.OnClickListener() { // from class: l.jsw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f119546a.m180724m(view);
            }
        });
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m180725e(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m180728j(C4319c c4319c) {
        if (c4319c == C4319c.f15549j) {
            if (NullChecker.m81303a(this.f160913l)) {
                this.f160913l.mo186453j();
                this.f160913l.mo189587a();
            }
            this.f160910i.onBackPressed();
        }
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m180729k() {
        this.f160908g.setVisibility(8);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m180730l() {
        e51.m114741F(this.f160910i, new Runnable() { // from class: l.ksw
            @Override // java.lang.Runnable
            public final void run() {
                this.f124510a.m180729k();
            }
        });
    }

    /* JADX INFO: renamed from: l.rsw$a */
    public class SurfaceHolderCallbackC19776a implements SurfaceHolder.Callback {

        /* JADX INFO: renamed from: a */
        public sxl f160914a;

        /* JADX INFO: renamed from: b */
        public Act f160915b;

        /* JADX INFO: renamed from: c */
        public String f160916c;

        /* JADX INFO: renamed from: d */
        public rlw f160917d;

        public SurfaceHolderCallbackC19776a(Act act, String str, sxl sxlVar, rlw rlwVar) {
            this.f160915b = act;
            this.f160916c = str;
            this.f160914a = sxlVar;
            this.f160917d = rlwVar;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m180732b(Throwable th) {
        }

        /* JADX INFO: renamed from: f */
        public static /* synthetic */ void m180736f(Throwable th) {
        }

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ void m180737g(Long l2) {
            rsw.this.f160909h.setText(i0g0.m133861b0(this.f160915b.getResources().getString(R$string.f17589Am) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + (4 - l2.longValue()), vwb.m200324f0(String.valueOf(4 - l2.longValue())), Color.parseColor("#d74d37"), Typeface.DEFAULT));
        }

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ void m180738h(Long l2) {
            rsw.this.f160903b.setTextColor(Color.parseColor(Constants.BLACK));
            rsw.this.f160904c.setTextColor(Color.parseColor(Constants.BLACK));
            rsw.this.f160905d.setTextColor(Color.parseColor(Constants.BLACK));
            rsw.this.f160906e.setTextColor(Color.parseColor(Constants.BLACK));
            int iIntValue = l2.intValue();
            if (iIntValue == 0) {
                rsw.this.f160904c.setTextColor(Color.parseColor("#d74d37"));
            } else if (iIntValue == 1) {
                rsw.this.f160905d.setTextColor(Color.parseColor("#d74d37"));
            } else {
                if (iIntValue != 2) {
                    return;
                }
                rsw.this.f160906e.setTextColor(Color.parseColor("#d74d37"));
            }
        }

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ void m180739i() {
            rsw.this.f160906e.setTextColor(Color.parseColor(Constants.BLACK));
            rsw.this.f160912k.f160914a.mo186454s();
            Act act = this.f160915b;
            act.progress(act.getString(R$string.f18315Ys));
            rsw.this.f160912k.f160914a.mo186449P(new a());
        }

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ void m180740j() {
            rsw.this.f160909h.setText(R$string.f17619Bm);
            rsw.this.f160912k.f160914a.mo186445H(this.f160916c);
            rsw.this.f160912k.f160914a.mo186452i();
            rsw.this.f160903b.setTextColor(Color.parseColor("#d74d37"));
            this.f160915b.duringCreated(e51.m114749N("ManuelPicVerificationRECORDING", 4)).subscribe(mkd0.m154957I(new e30() { // from class: l.osw
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f145516a.m180738h((Long) obj);
                }
            }, new e30() { // from class: l.psw
                @Override // p149l.e30
                public final void call(Object obj) {
                    rsw.SurfaceHolderCallbackC19776a.m180732b((Throwable) obj);
                }
            }, new d30() { // from class: l.qsw
                @Override // p149l.d30
                public final void call() {
                    this.f156278a.m180739i();
                }
            }));
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            this.f160914a.mo189597n(720, EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK);
            this.f160914a.mo186446I(this.f160915b, this.f160917d);
            this.f160914a.mo189609w(surfaceHolder);
            this.f160914a.mo189593g();
            this.f160915b.duringCreated(e51.m114749N("ManuelPicVerificationPreview", 5)).subscribe(mkd0.m154957I(new e30() { // from class: l.lsw
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f129901a.m180737g((Long) obj);
                }
            }, new e30() { // from class: l.msw
                @Override // p149l.e30
                public final void call(Object obj) {
                    rsw.SurfaceHolderCallbackC19776a.m180736f((Throwable) obj);
                }
            }, new d30() { // from class: l.nsw
                @Override // p149l.d30
                public final void call() {
                    this.f140301a.m180740j();
                }
            }));
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            this.f160915b = null;
        }

        /* JADX INFO: renamed from: l.rsw$a$a */
        public class a implements mmw {
            public a() {
            }

            @Override // p149l.mmw
            /* JADX INFO: renamed from: a */
            public void mo101512a(String str) {
                SurfaceHolderCallbackC19776a.this.f160915b.m66873d2();
            }

            @Override // p149l.mmw
            /* JADX INFO: renamed from: c */
            public void mo101514c() {
                rsw.this.f160911j.m127852p0();
            }

            @Override // p149l.mmw
            /* JADX INFO: renamed from: b */
            public void mo101513b(int i) {
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
        }
    }
}
