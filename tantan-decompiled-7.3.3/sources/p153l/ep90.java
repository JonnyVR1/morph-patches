package p153l;

import android.content.DialogInterface;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.data.Tag;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ep90 extends on2<t3m> {

    /* JADX INFO: renamed from: s */
    public final HashMap<View, View> f95215s;

    /* JADX INFO: renamed from: t */
    public final HashMap<View, View> f95216t;

    /* JADX INFO: renamed from: l.ep90$a */
    public class DialogInterfaceOnDismissListenerC16802a implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ x20 f95217a;

        public DialogInterfaceOnDismissListenerC16802a(x20 x20Var) {
            this.f95217a = x20Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            x20 x20Var = this.f95217a;
            if (x20Var != null) {
                x20Var.call();
            }
        }
    }

    public ep90(@NonNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
        this.f95215s = new HashMap<>();
        this.f95216t = new HashMap<>();
    }

    /* JADX INFO: renamed from: C */
    public void m121832C(int i, TextView textView) {
        if (mo53983O().mo52236D2() || mo53983O().mo52265S()) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("+  " + ((Object) textView.getHint()));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(i), 0, 1, 18);
        textView.setHint(spannableStringBuilder);
    }

    /* JADX INFO: renamed from: D */
    public void m121833D(View view, View view2) {
        this.f95216t.put(view, view2);
    }

    /* JADX INFO: renamed from: E */
    public void m121834E(View view, View view2) {
        this.f95215s.put(view, view2);
    }

    /* JADX INFO: renamed from: F */
    public void m121835F(View view, final boolean z, final boolean z2, final String str, final int i, final int i2, final String str2, final y20<String> y20Var, final pcj<String> pcjVar, final x20 x20Var, final x20 x20Var2, final x20 x20Var3) {
        m121843N(view, new x20() { // from class: l.cp90
            @Override // p153l.x20
            public final void call() {
                this.f82970a.m121841L(x20Var, z, str, i, i2, z2, str2, pcjVar, y20Var, x20Var3, x20Var2);
            }
        }, true);
    }

    /* JADX INFO: renamed from: G */
    public String m121836G() {
        User userMo52252K2 = mo53983O().mo52252K2();
        if (userMo52252K2 == null) {
            return "";
        }
        if (userMo52252K2.isBannedNew()) {
            return "对方账号异常";
        }
        if (userMo52252K2.isDelIn()) {
            return "我暂时离开几天~";
        }
        return userMo52252K2.isDelOut() ? "对方已注销" : "";
    }

    /* JADX INFO: renamed from: H */
    public SpannableStringBuilder m121837H(List<Tag> list, Integer num, Boolean bool, List<Tag> list2) {
        return e1b.m118956N0(list, list2, num.intValue(), bool.booleanValue(), qa00.m175859d(10.0f), mo53983O().mo52302m0());
    }

    /* JADX INFO: renamed from: I */
    public boolean m121838I() {
        if (mo53983O().mo52302m0()) {
            return false;
        }
        User userMo52252K2 = mo53983O().mo52252K2();
        if (userMo52252K2 == null) {
            return true;
        }
        if (TextUtils.equals(userMo52252K2.f56859id, CoreModule.m30929H().userId())) {
            return false;
        }
        return userMo52252K2.isBannedNew() || userMo52252K2.isAccountCancellation();
    }

    /* JADX INFO: renamed from: J */
    public boolean m121839J(User user) {
        return false;
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m121840K(y20 y20Var, x20 x20Var, String str) {
        y20Var.call(str);
        if (x20Var != null) {
            x20Var.call();
        }
        mo53983O().mo52239E();
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m121841L(x20 x20Var, boolean z, String str, int i, int i2, boolean z2, String str2, pcj pcjVar, final y20 y20Var, final x20 x20Var2, x20 x20Var3) {
        if (x20Var != null) {
            x20Var.call();
        }
        Dialog dialogM204426n = w1e.m204400d(mo53983O().act()).m204425J(z ? bsj0.f78170j : bsj0.f78171k).m204424I(str).m204420E(i).m204419D(i2).m204429q(z2 ? 64 : 0).m204430r(str2).m204423H((String) pcjVar.call()).m204421F(new y20() { // from class: l.dp90
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f90037a.m121840K(y20Var, x20Var2, (String) obj);
            }
        }).m204426n();
        dialogM204426n.show();
        dialogM204426n.setOnDismissListener(new DialogInterfaceOnDismissListenerC16802a(x20Var3));
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m121842M(View view, x20 x20Var, View view2) {
        if (NullChecker.m82486a(mo53983O().mo52233C2()) && NullChecker.m82486a(mo53983O().m189086i2())) {
            view.requestFocus();
            x20Var.call();
            mo53983O().mo52239E();
        }
    }

    /* JADX INFO: renamed from: N */
    public void m121843N(View view, final x20 x20Var, boolean z) {
        final View view2 = this.f95216t.get(view) != null ? this.f95216t.get(view) : view;
        if (z) {
            view2.setOnClickListener(new View.OnClickListener() { // from class: l.bp90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    this.f77739a.m121842M(view2, x20Var, view3);
                }
            });
        } else {
            view.setClickable(false);
        }
    }

    /* JADX INFO: renamed from: O */
    public t3m mo53983O() {
        return (t3m) this.f148056c;
    }

    /* JADX INFO: renamed from: Q */
    public void m121845Q(View view, int i) {
        View view2 = this.f95215s.get(view);
        if (view2 != null) {
            view2.setVisibility(i);
        } else {
            view.setVisibility(i);
        }
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: m */
    public boolean mo54012m() {
        return true;
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: r */
    public void mo54015r(View view) {
        if (view.getBackground() != null) {
            return;
        }
        if (mo53983O().mo52302m0() && mo53983O().mo52236D2()) {
            return;
        }
        view.setBackgroundResource(c9c0.f80435l1);
    }

    /* JADX INFO: renamed from: P */
    public void m121844P(TextView textView, String str, int i) {
    }
}
