package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.p058ui.verification.ManualFaceVerificationAct;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes12.dex */
public class qvw implements iam<fvw> {

    /* JADX INFO: renamed from: a */
    public ImageView f159814a;

    /* JADX INFO: renamed from: b */
    public TextView f159815b;

    /* JADX INFO: renamed from: c */
    public TextView f159816c;

    /* JADX INFO: renamed from: d */
    public TextView f159817d;

    /* JADX INFO: renamed from: e */
    public TextView f159818e;

    /* JADX INFO: renamed from: f */
    public SurfaceView f159819f;

    /* JADX INFO: renamed from: g */
    public ImageView f159820g;

    /* JADX INFO: renamed from: h */
    public TextView f159821h;

    /* JADX INFO: renamed from: i */
    public ManualFaceVerificationAct f159822i;

    /* JADX INFO: renamed from: j */
    public fvw f159823j;

    /* JADX INFO: renamed from: k */
    public SurfaceHolderCallbackC19681a f159824k;

    /* JADX INFO: renamed from: l */
    public l0m f159825l;

    public qvw(ManualFaceVerificationAct manualFaceVerificationAct) {
        this.f159822i = manualFaceVerificationAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m178382m(View view) {
        i4g0.m138520r("e_avatar_verification_video_refuse", "p_avatar_verification_video");
        this.f159822i.onBackPressed();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f159822i;
    }

    @Override // p153l.iam
    public void destroy() {
        l51.m152891K("ManuelPicVerificationPreview");
        l51.m152891K("ManuelPicVerificationRECORDING");
    }

    /* JADX INFO: renamed from: e */
    public View m178383e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return rvw.m183322b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(fvw fvwVar) {
        this.f159823j = fvwVar;
    }

    /* JADX INFO: renamed from: i */
    public void m178385i(String str, String str2) {
        this.f159822i.lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.gvw
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f106695a.m178386j((C4470c) obj);
            }
        }));
        this.f159815b.setText(String.valueOf(str.charAt(0)));
        this.f159816c.setText(String.valueOf(str.charAt(1)));
        this.f159817d.setText(String.valueOf(str.charAt(2)));
        this.f159818e.setText(String.valueOf(str.charAt(3)));
        this.f159821h.setText(q8g0.m175796b0(this.f159822i.getResources().getString(R$string.f18979Wm) + " 5", jyb.m147507f0("5"), Color.parseColor("#d74d37"), Typeface.DEFAULT));
        l0m l0mVarM103674a = be00.m103674a();
        this.f159825l = l0mVarM103674a;
        l0mVarM103674a.mo117984D(new epw() { // from class: l.hvw
            @Override // p153l.epw
            public final void onFirstFrameRendered() {
                this.f111843a.m178388l();
            }
        });
        qow qowVarM177325A = qow.m177325A();
        qowVarM177325A.m177348X(new crf0(qa00.m175859d(294.0f), qa00.m175859d(294.0f)));
        qowVarM177325A.m177329E(1);
        qowVarM177325A.m177327C(1);
        qowVarM177325A.m177346V(30);
        qowVarM177325A.m177345U(8388608);
        crf0 crf0Var = new crf0(720, EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK);
        qowVarM177325A.m177330F(crf0Var);
        qowVarM177325A.m177342R(crf0Var);
        this.f159824k = new SurfaceHolderCallbackC19681a(this.f159822i, str2, this.f159825l, qowVarM177325A);
        this.f159819f.getHolder().addCallback(this.f159824k);
        bnl0.m105509E0(this.f159814a, new View.OnClickListener() { // from class: l.ivw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f117129a.m178382m(view);
            }
        });
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m178383e(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m178386j(C4470c c4470c) {
        if (c4470c == C4470c.f16268j) {
            if (NullChecker.m82486a(this.f159825l)) {
                this.f159825l.mo118008j();
                this.f159825l.mo117999a();
            }
            this.f159822i.onBackPressed();
        }
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m178387k() {
        this.f159820g.setVisibility(8);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m178388l() {
        l51.m152886F(this.f159822i, new Runnable() { // from class: l.jvw
            @Override // java.lang.Runnable
            public final void run() {
                this.f122842a.m178387k();
            }
        });
    }

    /* JADX INFO: renamed from: l.qvw$a */
    public class SurfaceHolderCallbackC19681a implements SurfaceHolder.Callback {

        /* JADX INFO: renamed from: a */
        public l0m f159826a;

        /* JADX INFO: renamed from: b */
        public Act f159827b;

        /* JADX INFO: renamed from: c */
        public String f159828c;

        /* JADX INFO: renamed from: d */
        public qow f159829d;

        public SurfaceHolderCallbackC19681a(Act act, String str, l0m l0mVar, qow qowVar) {
            this.f159827b = act;
            this.f159828c = str;
            this.f159826a = l0mVar;
            this.f159829d = qowVar;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m178390b(Throwable th) {
        }

        /* JADX INFO: renamed from: f */
        public static /* synthetic */ void m178394f(Throwable th) {
        }

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ void m178395g(Long l2) {
            qvw.this.f159821h.setText(q8g0.m175796b0(this.f159827b.getResources().getString(R$string.f18979Wm) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + (4 - l2.longValue()), jyb.m147507f0(String.valueOf(4 - l2.longValue())), Color.parseColor("#d74d37"), Typeface.DEFAULT));
        }

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ void m178396h(Long l2) {
            qvw.this.f159815b.setTextColor(Color.parseColor(Constants.BLACK));
            qvw.this.f159816c.setTextColor(Color.parseColor(Constants.BLACK));
            qvw.this.f159817d.setTextColor(Color.parseColor(Constants.BLACK));
            qvw.this.f159818e.setTextColor(Color.parseColor(Constants.BLACK));
            int iIntValue = l2.intValue();
            if (iIntValue == 0) {
                qvw.this.f159816c.setTextColor(Color.parseColor("#d74d37"));
            } else if (iIntValue == 1) {
                qvw.this.f159817d.setTextColor(Color.parseColor("#d74d37"));
            } else {
                if (iIntValue != 2) {
                    return;
                }
                qvw.this.f159818e.setTextColor(Color.parseColor("#d74d37"));
            }
        }

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ void m178397i() {
            qvw.this.f159818e.setTextColor(Color.parseColor(Constants.BLACK));
            qvw.this.f159824k.f159826a.mo118020s();
            Act act = this.f159827b;
            act.progress(act.getString(R$string.f19754vt));
            qvw.this.f159824k.f159826a.mo117996P(new a());
        }

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ void m178398j() {
            qvw.this.f159821h.setText(R$string.f19009Xm);
            qvw.this.f159824k.f159826a.mo117988H(this.f159828c);
            qvw.this.f159824k.f159826a.mo118007i();
            qvw.this.f159815b.setTextColor(Color.parseColor("#d74d37"));
            this.f159827b.duringCreated(l51.m152894N("ManuelPicVerificationRECORDING", 4)).subscribe(psd0.m173598I(new y20() { // from class: l.nvw
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f143873a.m178396h((Long) obj);
                }
            }, new y20() { // from class: l.ovw
                @Override // p153l.y20
                public final void call(Object obj) {
                    qvw.SurfaceHolderCallbackC19681a.m178390b((Throwable) obj);
                }
            }, new x20() { // from class: l.pvw
                @Override // p153l.x20
                public final void call() {
                    this.f154336a.m178397i();
                }
            }));
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            this.f159826a.mo118012n(720, EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK);
            this.f159826a.mo117989I(this.f159827b, this.f159829d);
            this.f159826a.mo118025w(surfaceHolder);
            this.f159826a.mo118005g();
            this.f159827b.duringCreated(l51.m152894N("ManuelPicVerificationPreview", 5)).subscribe(psd0.m173598I(new y20() { // from class: l.kvw
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f129004a.m178395g((Long) obj);
                }
            }, new y20() { // from class: l.lvw
                @Override // p153l.y20
                public final void call(Object obj) {
                    qvw.SurfaceHolderCallbackC19681a.m178394f((Throwable) obj);
                }
            }, new x20() { // from class: l.mvw
                @Override // p153l.x20
                public final void call() {
                    this.f138958a.m178398j();
                }
            }));
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            this.f159827b = null;
        }

        /* JADX INFO: renamed from: l.qvw$a$a */
        public class a implements lpw {
            public a() {
            }

            @Override // p153l.lpw
            /* JADX INFO: renamed from: a */
            public void mo97168a(String str) {
                SurfaceHolderCallbackC19681a.this.f159827b.m68056e2();
            }

            @Override // p153l.lpw
            /* JADX INFO: renamed from: c */
            public void mo97170c() {
                qvw.this.f159823j.m127712p0();
            }

            @Override // p153l.lpw
            /* JADX INFO: renamed from: b */
            public void mo97169b(int i) {
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
        }
    }
}
