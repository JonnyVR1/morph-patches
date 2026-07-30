package p153l;

import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.core.p058ui.helpcenter.QuestionAndAnswerAct;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class cwb0 extends ar2<ewb0> {

    /* JADX INFO: renamed from: a */
    public int f84110a;

    /* JADX INFO: renamed from: b */
    public String f84111b;

    public cwb0(QuestionAndAnswerAct questionAndAnswerAct) {
        super(questionAndAnswerAct);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public /* synthetic */ void m112896g0(Bundle bundle) {
        ((ewb0) this.viewModel).m122948d(this.f84111b, this.f84110a);
    }

    /* JADX INFO: renamed from: h0 */
    public static String m112897h0(String str) {
        if (!IntlCountryCodeController.m29125v() || str == null) {
            return str;
        }
        switch (str) {
            case "http://auto.tancdn.com/v1/images/eyJpZCI6IlVSV0lBVzJHNEJHVFRYV0VEVUpCM1pFTFo0TTY2QiIsInciOjY3MCwiaCI6MzAwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MTA0OTMzMTM4NTQ3MTM5NDg0MDh9.jpg?format=max_720xX":
                return "http://auto.tancdn.com/v1/images/eyJpZCI6IjZWVUZITVJFSUNNQ05FQU9NNktXVzJIM1dRMlU3ViIsInciOjY3MCwiaCI6MzAwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6OTM0MDM3NDcyMzM0MjQyODQwOSwiYWIiOjB9.jpg?format=max_720xX";
            case "http://auto.tancdn.com/v1/images/eyJpZCI6IlVTTE5XUFdLN0VSVE9HSlJUSlFPNTREVTZTNVc0MiIsInciOjY3MCwiaCI6NTE4LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MTUyNDczODIwMjM4NDExMjI1Nzh9.jpg?format=max_720xX":
                return "http://auto.tancdn.com/v1/images/eyJpZCI6IldWM1hHRlk2MkNVQVU0TTJPTUhJMk83S05WNDJPVzA0IiwidyI6MTAwNSwiaCI6Nzc3LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MTIwMDM5NTI5OTI4MTI4MjA5MywiYWIiOjB9.png?format=max_720xX";
            case "http://auto.tancdn.com/v1/images/eyJpZCI6IlBYNTJVVzY3RFFKQ0RIMktKV1pSQlVYRkhUNFlPQyIsInciOjY3MCwiaCI6NTE4LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MTUyNDczODc1MDg4NDc1MjAwNjB9.jpg?format=max_720xX":
                return "http://auto.tancdn.com/v1/images/eyJpZCI6Ikc2Q1JSSlZSTVFTRVo0NlcyWEo3WVVLWEFFU0FTRzA0IiwidyI6MTAwNSwiaCI6Nzc3LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MjU3MjU5Njg3ODg3NTQ2ODg0OSwiYWIiOjB9.png?format=max_720xX";
            case "http://auto.tancdn.com/v1/images/eyJpZCI6IjZCUFZVQUVTVllQUDM2RTRFQ0xGSkhUSEdTRTdaQyIsInciOjY3MCwiaCI6NTE4LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6ODE3MDQ4OTk4MzM0OTI3MTUyN30.jpg?format=max_720xX":
                return "http://auto.tancdn.com/v1/images/eyJpZCI6IjNJUUNOMkhUU1VCNEJGNFozWDRVNU5ZQUlQMkFHNTA0IiwidyI6MTAwNSwiaCI6Nzc3LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6ODMyNDYzNDc4NzEyODQ1MjE0NSwiYWIiOjB9.png?format=max_720xX";
            case "http://u.tancdn.com/v1/images/eyJpZCI6IlE2UEUyQTZRT0xNNk1SM000RTVMRlRMTlhENFROQSIsInciOjY3MCwiaCI6NTE4LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MzU1ODc4MTc1OTUzNjczNTEzMX0.jpg?format=max_720xX":
                return "http://auto.tancdn.com/v1/images/eyJpZCI6IjJTN01aTUZSTFBGM1FLTFozT1UyN1pXWlNYNTRNVDA0IiwidyI6MTAwNSwiaCI6Nzc3LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MTI0MzQ3NzQxMDU0ODU4NDU1NDksImFiIjowfQ.png?format=max_720xX";
            default:
                return str;
        }
    }

    /* JADX INFO: renamed from: f0 */
    public void m112898f0() {
        creates(new y20() { // from class: l.bwb0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f78716a.m112896g0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i0 */
    public void m112899i0(int i, String str) {
        this.f84110a = i;
        this.f84111b = str;
    }

    /* JADX INFO: renamed from: j0 */
    public List<Object> m112900j0() {
        return jyb.m147507f0(FirebaseAnalytics.Param.INDEX, Integer.valueOf(this.f84110a), og3.f147187b);
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
