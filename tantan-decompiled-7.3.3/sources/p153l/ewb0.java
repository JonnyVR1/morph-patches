package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.p058ui.helpcenter.QuestionAndAnswerAct;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import java.util.ArrayList;
import p151v.VDraweeView;
import p151v.VRelative;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes3.dex */
public class ewb0 implements iam<cwb0> {

    /* JADX INFO: renamed from: a */
    public VRelative f96139a;

    /* JADX INFO: renamed from: b */
    public VNavigationBar f96140b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f96141c;

    /* JADX INFO: renamed from: d */
    public VText f96142d;

    /* JADX INFO: renamed from: e */
    public View f96143e;

    /* JADX INFO: renamed from: f */
    public cwb0 f96144f;

    /* JADX INFO: renamed from: g */
    public QuestionAndAnswerAct f96145g;

    public ewb0(QuestionAndAnswerAct questionAndAnswerAct) {
        this.f96145g = questionAndAnswerAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m122945e(View view) {
        act().onBackPressed();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f96145g;
    }

    @Override // p153l.iam
    @Nullable
    public Act act() {
        return this.f96145g;
    }

    /* JADX INFO: renamed from: b */
    public View m122946b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return fwb0.m127757b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(cwb0 cwb0Var) {
        this.f96144f = cwb0Var;
    }

    /* JADX INFO: renamed from: d */
    public void m122948d(String str, int i) {
        this.f96140b.setTitle(R$string.f18602K6);
        this.f96140b.setLeftIconOnClick(new View.OnClickListener() { // from class: l.dwb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f91009a.m122945e(view);
            }
        });
        this.f96142d.setText(str);
        this.f96143e.setVisibility(0);
        boolean z = CoreModule.f18264c.f20381e0.m116600p9() == null || TEnum.equals(CoreModule.f18264c.f20381e0.m116600p9().gender, "male");
        for (Pair pair : (ArrayList) jyb.m147507f0(jyb.m147507f0(new Pair(0, Integer.valueOf(R$string.f18633L6)), new Pair(1, cwb0.m112897h0(z ? "http://auto.tancdn.com/v1/images/eyJpZCI6IlVTTE5XUFdLN0VSVE9HSlJUSlFPNTREVTZTNVc0MiIsInciOjY3MCwiaCI6NTE4LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MTUyNDczODIwMjM4NDExMjI1Nzh9.jpg?format=max_720xX" : "http://auto.tancdn.com/v1/images/eyJpZCI6IlBYNTJVVzY3RFFKQ0RIMktKV1pSQlVYRkhUNFlPQyIsInciOjY3MCwiaCI6NTE4LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MTUyNDczODc1MDg4NDc1MjAwNjB9.jpg?format=max_720xX")), new Pair(2, Integer.valueOf(R$string.f18753P6)), new Pair(0, Integer.valueOf(R$string.f18663M6)), new Pair(1, cwb0.m112897h0(z ? "http://u.tancdn.com/v1/images/eyJpZCI6IlE2UEUyQTZRT0xNNk1SM000RTVMRlRMTlhENFROQSIsInciOjY3MCwiaCI6NTE4LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MzU1ODc4MTc1OTUzNjczNTEzMX0.jpg?format=max_720xX" : "http://auto.tancdn.com/v1/images/eyJpZCI6IjZCUFZVQUVTVllQUDM2RTRFQ0xGSkhUSEdTRTdaQyIsInciOjY3MCwiaCI6NTE4LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6ODE3MDQ4OTk4MzM0OTI3MTUyN30.jpg?format=max_720xX")), new Pair(2, Integer.valueOf(R$string.f18783Q6)), new Pair(0, Integer.valueOf(R$string.f18693N6)), new Pair(1, cwb0.m112897h0("http://auto.tancdn.com/v1/images/eyJpZCI6IlVSV0lBVzJHNEJHVFRYV0VEVUpCM1pFTFo0TTY2QiIsInciOjY3MCwiaCI6MzAwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MTA0OTMzMTM4NTQ3MTM5NDg0MDh9.jpg?format=max_720xX")), new Pair(2, Integer.valueOf(R$string.f18813R6)), new Pair(0, Integer.valueOf(R$string.f18723O6))), jyb.m147507f0(new Pair(1, z ? "http://auto.tancdn.com/v1/images/eyJpZCI6IjI1T01NSUs2Wks0QVRXRk5HUk81SFRGM1JJSzRXSCIsInciOjY3MCwiaCI6MzEwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NzMyNjA0MzU5MzYyOTg0ODkxN30.jpg?format=max_720xX" : "http://auto.tancdn.com/v1/images/eyJpZCI6IlRNUFBTNlZTNEZPVEIzQUlES1RGNTI2S0dJS05GRSIsInciOjY3MCwiaCI6MzEwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NjE4MjE1NDA0NDQzNzU2NjI5N30.jpg?format=max_720xX"), new Pair(0, Integer.valueOf(R$string.f18386D7))), jyb.m147507f0(new Pair(0, Integer.valueOf(R$string.f19053Z6))), jyb.m147507f0(new Pair(0, Integer.valueOf(R$string.f18873T6))), jyb.m147507f0(new Pair(0, Integer.valueOf(R$string.f18993X6))), jyb.m147507f0(new Pair(0, Integer.valueOf(R$string.f18448F7))), jyb.m147507f0(new Pair(0, Integer.valueOf(R$string.f18933V6))), jyb.m147507f0(new Pair(0, Integer.valueOf(R$string.f18540I6)))).get(i - 1)) {
            int iIntValue = ((Integer) pair.first).intValue();
            if (iIntValue == 0) {
                TextView textView = (TextView) act().inflater().inflate(kec0.f125346Bd, (ViewGroup) this.f96141c, false);
                textView.setText(act().getString(((Integer) pair.second).intValue()));
                if (!TextUtils.isEmpty(textView.getText())) {
                    this.f96141c.addView(textView);
                }
            } else if (iIntValue == 1) {
                VDraweeView vDraweeView = (VDraweeView) act().inflater().inflate(kec0.f125329Ad, (ViewGroup) this.f96141c, false);
                this.f96141c.addView(vDraweeView);
                vDraweeView.setHierarchy(uqb0.f180374G.m98795l().m211636K(RoundingParams.m8303c(qa00.m175859d(6.0f))).m211638a());
                vDraweeView.setController(uqb0.f180374G.m98791g(vDraweeView).m8258B(new C16851a(vDraweeView)).mo155332a(Uri.parse(pair.second.toString())).build());
            } else if (iIntValue == 2) {
                TextView textView2 = (TextView) act().inflater().inflate(kec0.f125363Cd, (ViewGroup) this.f96141c, false);
                textView2.setText(act().getString(((Integer) pair.second).intValue()));
                if (!TextUtils.isEmpty(textView2.getText())) {
                    this.f96141c.addView(textView2);
                }
            }
        }
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m122946b(layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.ewb0$a */
    public class C16851a extends li2<qim> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ VDraweeView f96146b;

        public C16851a(VDraweeView vDraweeView) {
            this.f96146b = vDraweeView;
        }

        @Override // p153l.li2, p153l.v36
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void mo8288e(String str, @Nullable qim qimVar, @Nullable Animatable animatable) {
            if (qimVar == null) {
                return;
            }
            int height = qimVar.getHeight();
            int iM105592y0 = ((bnl0.m105592y0() - qa00.m175859d(40.0f)) * height) / qimVar.getWidth();
            ViewGroup.LayoutParams layoutParams = this.f96146b.getLayoutParams();
            layoutParams.height = iM105592y0;
            this.f96146b.setLayoutParams(layoutParams);
        }

        @Override // p153l.li2, p153l.v36
        /* JADX INFO: renamed from: d */
        public void mo49464d(String str, Throwable th) {
        }

        @Override // p153l.li2, p153l.v36
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void mo49463b(String str, @Nullable qim qimVar) {
        }
    }
}
