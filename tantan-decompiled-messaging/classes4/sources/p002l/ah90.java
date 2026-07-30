package p002l;

import android.content.DialogInterface;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.Tag;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.List;
import l.d30;
import l.e30;
import l.i0e;
import l.mcr;
import l.rza;
import l.t100;
import l.v9j;
import l.w0c0;
import l.yij0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public abstract class ah90 extends hn2<a1m> {

    /* JADX INFO: renamed from: s */
    public final HashMap<View, View> f7609s;

    /* JADX INFO: renamed from: t */
    public final HashMap<View, View> f7610t;

    /* JADX INFO: renamed from: l.ah90$a */
    public class DialogInterfaceOnDismissListenerC0488a implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ d30 f7611a;

        public DialogInterfaceOnDismissListenerC0488a(d30 d30Var) {
            this.f7611a = d30Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            d30 d30Var = this.f7611a;
            if (d30Var != null) {
                d30Var.call();
            }
        }
    }

    public ah90(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
        this.f7609s = new HashMap<>();
        this.f7610t = new HashMap<>();
    }

    /* JADX INFO: renamed from: C */
    public void m9638C(int i, TextView textView) {
        if (mo3351O().mo1501D2() || mo3351O().mo1530S()) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("+  " + ((Object) textView.getHint()));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(i), 0, 1, 18);
        textView.setHint(spannableStringBuilder);
    }

    /* JADX INFO: renamed from: D */
    public void m9639D(View view, View view2) {
        this.f7610t.put(view, view2);
    }

    /* JADX INFO: renamed from: E */
    public void m9640E(View view, View view2) {
        this.f7609s.put(view, view2);
    }

    /* JADX INFO: renamed from: F */
    public void m9641F(View view, final boolean z, final boolean z2, final String str, final int i, final int i2, final String str2, final e30<String> e30Var, final v9j<String> v9jVar, final d30 d30Var, final d30 d30Var2, final d30 d30Var3) {
        m9649N(view, new d30() { // from class: l.yg90
            public final void call() {
                this.f22855a.m9647L(d30Var, z, str, i, i2, z2, str2, v9jVar, e30Var, d30Var3, d30Var2);
            }
        }, true);
    }

    /* JADX INFO: renamed from: G */
    public String m9642G() {
        User userMo1517K2 = mo3351O().mo1517K2();
        if (userMo1517K2 == null) {
            return "";
        }
        if (userMo1517K2.isBannedNew()) {
            return "对方账号异常";
        }
        if (userMo1517K2.isDelIn()) {
            return "我暂时离开几天~";
        }
        return userMo1517K2.isDelOut() ? "对方已注销" : "";
    }

    /* JADX INFO: renamed from: H */
    public SpannableStringBuilder m9643H(List<Tag> list, Integer num, Boolean bool, List<Tag> list2) {
        return rza.N0(list, list2, num.intValue(), bool.booleanValue(), t100.d(10.0f), mo3351O().mo1570m0());
    }

    /* JADX INFO: renamed from: I */
    public boolean m9644I() {
        if (mo3351O().mo1570m0()) {
            return false;
        }
        User userMo1517K2 = mo3351O().mo1517K2();
        if (userMo1517K2 == null) {
            return true;
        }
        if (TextUtils.equals(((DbObject) userMo1517K2).id, CoreModule.H().userId())) {
            return false;
        }
        return userMo1517K2.isBannedNew() || userMo1517K2.isAccountCancellation();
    }

    /* JADX INFO: renamed from: J */
    public boolean m9645J(User user) {
        return false;
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m9646K(e30 e30Var, d30 d30Var, String str) {
        e30Var.call(str);
        if (d30Var != null) {
            d30Var.call();
        }
        mo3351O().mo1504E();
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m9647L(d30 d30Var, boolean z, String str, int i, int i2, boolean z2, String str2, v9j v9jVar, final e30 e30Var, final d30 d30Var2, d30 d30Var3) {
        if (d30Var != null) {
            d30Var.call();
        }
        Dialog dialogN = i0e.d(mo3351O().act()).J(z ? yij0.j : yij0.k).I(str).E(i).D(i2).q(z2 ? 64 : 0).r(str2).H((String) v9jVar.call()).F(new e30() { // from class: l.zg90
            public final void call(Object obj) {
                this.f23392a.m9646K(e30Var, d30Var2, (String) obj);
            }
        }).n();
        dialogN.show();
        dialogN.setOnDismissListener(new DialogInterfaceOnDismissListenerC0488a(d30Var3));
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m9648M(View view, d30 d30Var, View view2) {
        if (NullChecker.a(mo3351O().mo1498C2()) && NullChecker.a(mo3351O().m9268i2())) {
            view.requestFocus();
            d30Var.call();
            mo3351O().mo1504E();
        }
    }

    /* JADX INFO: renamed from: N */
    public void m9649N(View view, final d30 d30Var, boolean z) {
        final View view2 = this.f7610t.get(view) != null ? this.f7610t.get(view) : view;
        if (z) {
            view2.setOnClickListener(new View.OnClickListener() { // from class: l.xg90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    this.f22266a.m9648M(view2, d30Var, view3);
                }
            });
        } else {
            view.setClickable(false);
        }
    }

    /* JADX INFO: renamed from: O */
    public a1m mo3351O() {
        return (a1m) this.f12125c;
    }

    /* JADX INFO: renamed from: Q */
    public void m9651Q(View view, int i) {
        View view2 = this.f7609s.get(view);
        if (view2 != null) {
            view2.setVisibility(i);
        } else {
            view.setVisibility(i);
        }
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: m */
    public boolean mo3380m() {
        return true;
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: r */
    public void mo3383r(View view) {
        if (view.getBackground() != null) {
            return;
        }
        if (mo3351O().mo1570m0() && mo3351O().mo1501D2()) {
            return;
        }
        view.setBackgroundResource(w0c0.k1);
    }

    /* JADX INFO: renamed from: P */
    public void m9650P(TextView textView, String str, int i) {
    }
}
