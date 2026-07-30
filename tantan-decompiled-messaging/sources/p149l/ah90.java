package p149l;

import android.content.DialogInterface;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.data.Tag;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ah90 extends hn2<a1m> {

    /* JADX INFO: renamed from: s */
    public final HashMap<View, View> f69572s;

    /* JADX INFO: renamed from: t */
    public final HashMap<View, View> f69573t;

    /* JADX INFO: renamed from: l.ah90$a */
    public class DialogInterfaceOnDismissListenerC15618a implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ d30 f69574a;

        public DialogInterfaceOnDismissListenerC15618a(d30 d30Var) {
            this.f69574a = d30Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            d30 d30Var = this.f69574a;
            if (d30Var != null) {
                d30Var.call();
            }
        }
    }

    public ah90(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
        this.f69572s = new HashMap<>();
        this.f69573t = new HashMap<>();
    }

    /* JADX INFO: renamed from: C */
    public void m96407C(int i, TextView textView) {
        if (mo52800O().mo51053D2() || mo52800O().mo51082S()) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("+  " + ((Object) textView.getHint()));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(i), 0, 1, 18);
        textView.setHint(spannableStringBuilder);
    }

    /* JADX INFO: renamed from: D */
    public void m96408D(View view, View view2) {
        this.f69573t.put(view, view2);
    }

    /* JADX INFO: renamed from: E */
    public void m96409E(View view, View view2) {
        this.f69572s.put(view, view2);
    }

    /* JADX INFO: renamed from: F */
    public void m96410F(View view, final boolean z, final boolean z2, final String str, final int i, final int i2, final String str2, final e30<String> e30Var, final v9j<String> v9jVar, final d30 d30Var, final d30 d30Var2, final d30 d30Var3) {
        m96418N(view, new d30() { // from class: l.yg90
            @Override // p149l.d30
            public final void call() {
                this.f198135a.m96416L(d30Var, z, str, i, i2, z2, str2, v9jVar, e30Var, d30Var3, d30Var2);
            }
        }, true);
    }

    /* JADX INFO: renamed from: G */
    public String m96411G() {
        User userMo51069K2 = mo52800O().mo51069K2();
        if (userMo51069K2 == null) {
            return "";
        }
        if (userMo51069K2.isBannedNew()) {
            return "对方账号异常";
        }
        if (userMo51069K2.isDelIn()) {
            return "我暂时离开几天~";
        }
        return userMo51069K2.isDelOut() ? "对方已注销" : "";
    }

    /* JADX INFO: renamed from: H */
    public SpannableStringBuilder m96412H(List<Tag> list, Integer num, Boolean bool, List<Tag> list2) {
        return rza.m181734N0(list, list2, num.intValue(), bool.booleanValue(), t100.m186890d(10.0f), mo52800O().mo51119m0());
    }

    /* JADX INFO: renamed from: I */
    public boolean m96413I() {
        if (mo52800O().mo51119m0()) {
            return false;
        }
        User userMo51069K2 = mo52800O().mo51069K2();
        if (userMo51069K2 == null) {
            return true;
        }
        if (TextUtils.equals(userMo51069K2.f56011id, CoreModule.m29931H().userId())) {
            return false;
        }
        return userMo51069K2.isBannedNew() || userMo51069K2.isAccountCancellation();
    }

    /* JADX INFO: renamed from: J */
    public boolean m96414J(User user) {
        return false;
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m96415K(e30 e30Var, d30 d30Var, String str) {
        e30Var.call(str);
        if (d30Var != null) {
            d30Var.call();
        }
        mo52800O().mo51056E();
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m96416L(d30 d30Var, boolean z, String str, int i, int i2, boolean z2, String str2, v9j v9jVar, final e30 e30Var, final d30 d30Var2, d30 d30Var3) {
        if (d30Var != null) {
            d30Var.call();
        }
        Dialog dialogM133821n = i0e.m133795d(mo52800O().act()).m133820J(z ? yij0.f198513j : yij0.f198514k).m133819I(str).m133815E(i).m133814D(i2).m133824q(z2 ? 64 : 0).m133825r(str2).m133818H((String) v9jVar.call()).m133816F(new e30() { // from class: l.zg90
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f203026a.m96415K(e30Var, d30Var2, (String) obj);
            }
        }).m133821n();
        dialogM133821n.show();
        dialogM133821n.setOnDismissListener(new DialogInterfaceOnDismissListenerC15618a(d30Var3));
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m96417M(View view, d30 d30Var, View view2) {
        if (NullChecker.m81303a(mo52800O().mo51050C2()) && NullChecker.m81303a(mo52800O().m94569i2())) {
            view.requestFocus();
            d30Var.call();
            mo52800O().mo51056E();
        }
    }

    /* JADX INFO: renamed from: N */
    public void m96418N(View view, final d30 d30Var, boolean z) {
        final View view2 = this.f69573t.get(view) != null ? this.f69573t.get(view) : view;
        if (z) {
            view2.setOnClickListener(new View.OnClickListener() { // from class: l.xg90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    this.f192747a.m96417M(view2, d30Var, view3);
                }
            });
        } else {
            view.setClickable(false);
        }
    }

    /* JADX INFO: renamed from: O */
    public a1m mo52800O() {
        return (a1m) this.f108534c;
    }

    /* JADX INFO: renamed from: Q */
    public void m96420Q(View view, int i) {
        View view2 = this.f69572s.get(view);
        if (view2 != null) {
            view2.setVisibility(i);
        } else {
            view.setVisibility(i);
        }
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: m */
    public boolean mo52829m() {
        return true;
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: r */
    public void mo52832r(View view) {
        if (view.getBackground() != null) {
            return;
        }
        if (mo52800O().mo51119m0() && mo52800O().mo51053D2()) {
            return;
        }
        view.setBackgroundResource(w0c0.f183862k1);
    }

    /* JADX INFO: renamed from: P */
    public void m96419P(TextView textView, String str, int i) {
    }
}
