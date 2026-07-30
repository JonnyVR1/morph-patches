package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.p053ui.helpcenter.QuestionAndAnswerAct;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import java.util.ArrayList;
import p147v.VDraweeView;
import p147v.VRelative;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class aob0 implements s7m<ynb0> {

    /* JADX INFO: renamed from: a */
    public VRelative f70827a;

    /* JADX INFO: renamed from: b */
    public VNavigationBar f70828b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f70829c;

    /* JADX INFO: renamed from: d */
    public VText f70830d;

    /* JADX INFO: renamed from: e */
    public View f70831e;

    /* JADX INFO: renamed from: f */
    public ynb0 f70832f;

    /* JADX INFO: renamed from: g */
    public QuestionAndAnswerAct f70833g;

    public aob0(QuestionAndAnswerAct questionAndAnswerAct) {
        this.f70833g = questionAndAnswerAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m97878e(View view) {
        act().onBackPressed();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f70833g;
    }

    @Override // p149l.s7m
    @Nullable
    public Act act() {
        return this.f70833g;
    }

    /* JADX INFO: renamed from: b */
    public View m97879b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return bob0.m102912b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(ynb0 ynb0Var) {
        this.f70832f = ynb0Var;
    }

    /* JADX INFO: renamed from: d */
    public void m97881d(String str, int i) {
        this.f70828b.setTitle(R$string.f17813I6);
        this.f70828b.setLeftIconOnClick(new View.OnClickListener() { // from class: l.znb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f203972a.m97878e(view);
            }
        });
        this.f70830d.setText(str);
        this.f70831e.setVisibility(0);
        boolean z = CoreModule.f17545c.f19639e0.m169527p9() == null || TEnum.equals(CoreModule.f17545c.f19639e0.m169527p9().gender, "male");
        for (Pair pair : (ArrayList) vwb.m200324f0(vwb.m200324f0(new Pair(0, Integer.valueOf(R$string.f17843J6)), new Pair(1, ynb0.m215403h0(z ? "http://auto.tancdn.com/v1/images/eyJpZCI6IlVTTE5XUFdLN0VSVE9HSlJUSlFPNTREVTZTNVc0MiIsInciOjY3MCwiaCI6NTE4LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MTUyNDczODIwMjM4NDExMjI1Nzh9.jpg?format=max_720xX" : "http://auto.tancdn.com/v1/images/eyJpZCI6IlBYNTJVVzY3RFFKQ0RIMktKV1pSQlVYRkhUNFlPQyIsInciOjY3MCwiaCI6NTE4LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MTUyNDczODc1MDg4NDc1MjAwNjB9.jpg?format=max_720xX")), new Pair(2, Integer.valueOf(R$string.f17963N6)), new Pair(0, Integer.valueOf(R$string.f17873K6)), new Pair(1, ynb0.m215403h0(z ? "http://u.tancdn.com/v1/images/eyJpZCI6IlE2UEUyQTZRT0xNNk1SM000RTVMRlRMTlhENFROQSIsInciOjY3MCwiaCI6NTE4LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MzU1ODc4MTc1OTUzNjczNTEzMX0.jpg?format=max_720xX" : "http://auto.tancdn.com/v1/images/eyJpZCI6IjZCUFZVQUVTVllQUDM2RTRFQ0xGSkhUSEdTRTdaQyIsInciOjY3MCwiaCI6NTE4LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6ODE3MDQ4OTk4MzM0OTI3MTUyN30.jpg?format=max_720xX")), new Pair(2, Integer.valueOf(R$string.f17993O6)), new Pair(0, Integer.valueOf(R$string.f17903L6)), new Pair(1, ynb0.m215403h0("http://auto.tancdn.com/v1/images/eyJpZCI6IlVSV0lBVzJHNEJHVFRYV0VEVUpCM1pFTFo0TTY2QiIsInciOjY3MCwiaCI6MzAwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MTA0OTMzMTM4NTQ3MTM5NDg0MDh9.jpg?format=max_720xX")), new Pair(2, Integer.valueOf(R$string.f18023P6)), new Pair(0, Integer.valueOf(R$string.f17933M6))), vwb.m200324f0(new Pair(1, z ? "http://auto.tancdn.com/v1/images/eyJpZCI6IjI1T01NSUs2Wks0QVRXRk5HUk81SFRGM1JJSzRXSCIsInciOjY3MCwiaCI6MzEwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NzMyNjA0MzU5MzYyOTg0ODkxN30.jpg?format=max_720xX" : "http://auto.tancdn.com/v1/images/eyJpZCI6IlRNUFBTNlZTNEZPVEIzQUlES1RGNTI2S0dJS05GRSIsInciOjY3MCwiaCI6MzEwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NjE4MjE1NDA0NDQzNzU2NjI5N30.jpg?format=max_720xX"), new Pair(0, Integer.valueOf(R$string.f17604B7))), vwb.m200324f0(new Pair(0, Integer.valueOf(R$string.f18263X6))), vwb.m200324f0(new Pair(0, Integer.valueOf(R$string.f18083R6))), vwb.m200324f0(new Pair(0, Integer.valueOf(R$string.f18203V6))), vwb.m200324f0(new Pair(0, Integer.valueOf(R$string.f17664D7))), vwb.m200324f0(new Pair(0, Integer.valueOf(R$string.f18143T6))), vwb.m200324f0(new Pair(0, Integer.valueOf(R$string.f17753G6)))).get(i - 1)) {
            int iIntValue = ((Integer) pair.first).intValue();
            if (iIntValue == 0) {
                TextView textView = (TextView) act().inflater().inflate(f6c0.f96035ud, (ViewGroup) this.f70829c, false);
                textView.setText(act().getString(((Integer) pair.second).intValue()));
                if (!TextUtils.isEmpty(textView.getText())) {
                    this.f70829c.addView(textView);
                }
            } else if (iIntValue == 1) {
                VDraweeView vDraweeView = (VDraweeView) act().inflater().inflate(f6c0.f96018td, (ViewGroup) this.f70829c, false);
                this.f70829c.addView(vDraweeView);
                vDraweeView.setHierarchy(qib0.f154691G.m184722l().m116870K(RoundingParams.m8249c(t100.m186890d(6.0f))).m116872a());
                vDraweeView.setController(qib0.f154691G.m184718g(vDraweeView).m8204B(new C15677a(vDraweeView)).mo121501a(Uri.parse(pair.second.toString())).build());
            } else if (iIntValue == 2) {
                TextView textView2 = (TextView) act().inflater().inflate(f6c0.f96052vd, (ViewGroup) this.f70829c, false);
                textView2.setText(act().getString(((Integer) pair.second).intValue()));
                if (!TextUtils.isEmpty(textView2.getText())) {
                    this.f70829c.addView(textView2);
                }
            }
        }
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m97879b(layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.aob0$a */
    public class C15677a extends ei2<ngm> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ VDraweeView f70834b;

        public C15677a(VDraweeView vDraweeView) {
            this.f70834b = vDraweeView;
        }

        @Override // p149l.ei2, p149l.q26
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void mo8234e(String str, @Nullable ngm ngmVar, @Nullable Animatable animatable) {
            if (ngmVar == null) {
                return;
            }
            int height = ngmVar.getHeight();
            int iM208412y0 = ((xdl0.m208412y0() - t100.m186890d(40.0f)) * height) / ngmVar.getWidth();
            ViewGroup.LayoutParams layoutParams = this.f70834b.getLayoutParams();
            layoutParams.height = iM208412y0;
            this.f70834b.setLayoutParams(layoutParams);
        }

        @Override // p149l.ei2, p149l.q26
        /* JADX INFO: renamed from: d */
        public void mo48281d(String str, Throwable th) {
        }

        @Override // p149l.ei2, p149l.q26
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void mo48280b(String str, @Nullable ngm ngmVar) {
        }
    }
}
