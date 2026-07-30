package p003l;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.facebook.drawee.generic.RoundingParams;
import com.p000p1.mobile.putong.core.p001ui.helpcenter.QuestionAndAnswerAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.data.tenum.TEnum;
import java.util.ArrayList;
import l.ei2;
import l.f6c0;
import l.ngm;
import l.qib0;
import l.s7m;
import l.t100;
import l.vwb;
import l.xdl0;
import v.VDraweeView;
import v.VRelative;
import v.VText;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class aob0 implements s7m<ynb0> {

    /* JADX INFO: renamed from: a */
    public VRelative f2825a;

    /* JADX INFO: renamed from: b */
    public VNavigationBar f2826b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f2827c;

    /* JADX INFO: renamed from: d */
    public VText f2828d;

    /* JADX INFO: renamed from: e */
    public View f2829e;

    /* JADX INFO: renamed from: f */
    public ynb0 f2830f;

    /* JADX INFO: renamed from: g */
    public QuestionAndAnswerAct f2831g;

    public aob0(QuestionAndAnswerAct questionAndAnswerAct) {
        this.f2831g = questionAndAnswerAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m5482e(View view) {
        act().onBackPressed();
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m5483C0() {
        return this.f2831g;
    }

    @Nullable
    public Act act() {
        return this.f2831g;
    }

    /* JADX INFO: renamed from: b */
    public View m5484b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return bob0.m5768b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void m5487i1(ynb0 ynb0Var) {
        this.f2830f = ynb0Var;
    }

    /* JADX INFO: renamed from: d */
    public void m5486d(String str, int i) {
        this.f2826b.setTitle(R.string.I6);
        this.f2826b.setLeftIconOnClick(new View.OnClickListener() { // from class: l.znb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9284a.m5482e(view);
            }
        });
        this.f2828d.setText(str);
        this.f2829e.setVisibility(0);
        boolean z = CoreModule.c.e0.p9() == null || TEnum.equals(CoreModule.c.e0.p9().gender, "male");
        for (Pair pair : (ArrayList) vwb.f0(new ArrayList[]{vwb.f0(new Pair[]{new Pair(0, Integer.valueOf(R.string.J6)), new Pair(1, ynb0.m11263h0(z ? "http://auto.tancdn.com/v1/images/eyJpZCI6IlVTTE5XUFdLN0VSVE9HSlJUSlFPNTREVTZTNVc0MiIsInciOjY3MCwiaCI6NTE4LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MTUyNDczODIwMjM4NDExMjI1Nzh9.jpg?format=max_720xX" : "http://auto.tancdn.com/v1/images/eyJpZCI6IlBYNTJVVzY3RFFKQ0RIMktKV1pSQlVYRkhUNFlPQyIsInciOjY3MCwiaCI6NTE4LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MTUyNDczODc1MDg4NDc1MjAwNjB9.jpg?format=max_720xX")), new Pair(2, Integer.valueOf(R.string.N6)), new Pair(0, Integer.valueOf(R.string.K6)), new Pair(1, ynb0.m11263h0(z ? "http://u.tancdn.com/v1/images/eyJpZCI6IlE2UEUyQTZRT0xNNk1SM000RTVMRlRMTlhENFROQSIsInciOjY3MCwiaCI6NTE4LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MzU1ODc4MTc1OTUzNjczNTEzMX0.jpg?format=max_720xX" : "http://auto.tancdn.com/v1/images/eyJpZCI6IjZCUFZVQUVTVllQUDM2RTRFQ0xGSkhUSEdTRTdaQyIsInciOjY3MCwiaCI6NTE4LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6ODE3MDQ4OTk4MzM0OTI3MTUyN30.jpg?format=max_720xX")), new Pair(2, Integer.valueOf(R.string.O6)), new Pair(0, Integer.valueOf(R.string.L6)), new Pair(1, ynb0.m11263h0("http://auto.tancdn.com/v1/images/eyJpZCI6IlVSV0lBVzJHNEJHVFRYV0VEVUpCM1pFTFo0TTY2QiIsInciOjY3MCwiaCI6MzAwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MTA0OTMzMTM4NTQ3MTM5NDg0MDh9.jpg?format=max_720xX")), new Pair(2, Integer.valueOf(R.string.P6)), new Pair(0, Integer.valueOf(R.string.M6))}), vwb.f0(new Pair[]{new Pair(1, z ? "http://auto.tancdn.com/v1/images/eyJpZCI6IjI1T01NSUs2Wks0QVRXRk5HUk81SFRGM1JJSzRXSCIsInciOjY3MCwiaCI6MzEwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NzMyNjA0MzU5MzYyOTg0ODkxN30.jpg?format=max_720xX" : "http://auto.tancdn.com/v1/images/eyJpZCI6IlRNUFBTNlZTNEZPVEIzQUlES1RGNTI2S0dJS05GRSIsInciOjY3MCwiaCI6MzEwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NjE4MjE1NDA0NDQzNzU2NjI5N30.jpg?format=max_720xX"), new Pair(0, Integer.valueOf(R.string.B7))}), vwb.f0(new Pair[]{new Pair(0, Integer.valueOf(R.string.X6))}), vwb.f0(new Pair[]{new Pair(0, Integer.valueOf(R.string.R6))}), vwb.f0(new Pair[]{new Pair(0, Integer.valueOf(R.string.V6))}), vwb.f0(new Pair[]{new Pair(0, Integer.valueOf(R.string.D7))}), vwb.f0(new Pair[]{new Pair(0, Integer.valueOf(R.string.T6))}), vwb.f0(new Pair[]{new Pair(0, Integer.valueOf(R.string.G6))})}).get(i - 1)) {
            int iIntValue = ((Integer) pair.first).intValue();
            if (iIntValue == 0) {
                TextView textView = (TextView) act().inflater().inflate(f6c0.ud, (ViewGroup) this.f2827c, false);
                textView.setText(act().getString(((Integer) pair.second).intValue()));
                if (!TextUtils.isEmpty(textView.getText())) {
                    this.f2827c.addView(textView);
                }
            } else if (iIntValue == 1) {
                View view = (VDraweeView) act().inflater().inflate(f6c0.td, (ViewGroup) this.f2827c, false);
                this.f2827c.addView(view);
                view.setHierarchy(qib0.G.l().K(RoundingParams.c(t100.d(6.0f))).a());
                view.setController(qib0.G.g(view).B(new C3286a(view)).N(Uri.parse(pair.second.toString())).c());
            } else if (iIntValue == 2) {
                TextView textView2 = (TextView) act().inflater().inflate(f6c0.vd, (ViewGroup) this.f2827c, false);
                textView2.setText(act().getString(((Integer) pair.second).intValue()));
                if (!TextUtils.isEmpty(textView2.getText())) {
                    this.f2827c.addView(textView2);
                }
            }
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m5484b(layoutInflater, viewGroup);
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: l.aob0$a */
    public class C3286a extends ei2<ngm> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ VDraweeView f2832b;

        public C3286a(VDraweeView vDraweeView) {
            this.f2832b = vDraweeView;
        }

        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void m5490e(String str, @Nullable ngm ngmVar, @Nullable Animatable animatable) {
            if (ngmVar == null) {
                return;
            }
            int height = ngmVar.getHeight();
            int iY0 = ((xdl0.y0() - t100.d(40.0f)) * height) / ngmVar.getWidth();
            ViewGroup.LayoutParams layoutParams = this.f2832b.getLayoutParams();
            layoutParams.height = iY0;
            this.f2832b.setLayoutParams(layoutParams);
        }

        /* JADX INFO: renamed from: d */
        public void m5489d(String str, Throwable th) {
        }

        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void m5488b(String str, @Nullable ngm ngmVar) {
        }
    }
}
