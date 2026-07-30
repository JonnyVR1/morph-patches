package p003l;

import android.os.Bundle;
import com.p000p1.mobile.putong.core.p001ui.helpcenter.QuestionAndAnswerAct;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import java.util.List;
import l.ag3;
import l.e30;
import l.jq2;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ynb0 extends jq2<aob0> {

    /* JADX INFO: renamed from: a */
    public int f9088a;

    /* JADX INFO: renamed from: b */
    public String f9089b;

    public ynb0(QuestionAndAnswerAct questionAndAnswerAct) {
        super(questionAndAnswerAct);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public /* synthetic */ void m11262g0(Bundle bundle) {
        ((aob0) ((jq2) this).viewModel).m5486d(this.f9089b, this.f9088a);
    }

    /* JADX INFO: renamed from: h0 */
    public static String m11263h0(String str) {
        if (!IntlCountryCodeController.v() || str == null) {
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
    public void m11264f0() {
        creates(new e30() { // from class: l.xnb0
            public final void call(Object obj) {
                this.f8552a.m11262g0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i0 */
    public void m11265i0(int i, String str) {
        this.f9088a = i;
        this.f9089b = str;
    }

    /* JADX INFO: renamed from: j0 */
    public List<Object> m11266j0() {
        return vwb.f0(new Object[]{"index", Integer.valueOf(this.f9088a), ag3.b});
    }

    public void destroy() {
    }
}
