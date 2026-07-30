package p006l;

import android.app.Dialog;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.TarotData;
import com.p1.mobile.putong.core.data.TarotDataEnvelope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l.e30;
import l.jo0;
import l.l5j0;
import l.lsi0;
import l.nci0;
import l.o7r;
import l.xdl0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import rx.c;
import v.VButton;
import v.VRadioButton;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010,\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010#\u001a\u0004\b*\u0010%\"\u0004\b+\u0010'R\"\u00104\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010<\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010?\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\t\u00107\u001a\u0004\b=\u00109\"\u0004\b>\u0010;R\"\u0010B\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u00107\u001a\u0004\b@\u00109\"\u0004\bA\u0010;R\"\u0010E\u001a\u00020\u00198\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0012\u0010\u001b\u001a\u0004\bC\u0010\u001d\"\u0004\bD\u0010\u001fR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bC\u0010F¨\u0006G"}, d2 = {"Ll/mci0;", "", "Lcom/p1/mobile/android/app/Act;", "act", "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "Landroid/view/View;", "view", "", "g", "(Landroid/view/View;)V", "Ll/l5j0;", "dialog", "n", "(Ll/l5j0;)V", "h", "()V", "rootView", "i", "(Lcom/p1/mobile/android/app/Act;Landroid/view/View;)Ll/l5j0;", "o", "a", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "Lv/VButton;", "b", "Lv/VButton;", "k", "()Lv/VButton;", "set_close", "(Lv/VButton;)V", "_close", "Lv/VText;", "c", "Lv/VText;", "m", "()Lv/VText;", "set_title", "(Lv/VText;)V", "_title", "d", "get_content", "set_content", "_content", "Landroid/widget/RadioGroup;", "e", "Landroid/widget/RadioGroup;", "l", "()Landroid/widget/RadioGroup;", "set_radio_group", "(Landroid/widget/RadioGroup;)V", "_radio_group", "Lv/VRadioButton;", "f", "Lv/VRadioButton;", "get_radio_group_radio_left", "()Lv/VRadioButton;", "set_radio_group_radio_left", "(Lv/VRadioButton;)V", "_radio_group_radio_left", "get_radio_group_radio_center", "set_radio_group_radio_center", "_radio_group_radio_center", "get_radio_group_radio_right", "set_radio_group_radio_right", "_radio_group_radio_right", "j", "set_bottom_button", "_bottom_button", "Ll/l5j0;", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class mci0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VButton _close;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VText _title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VText _content;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public RadioGroup _radio_group;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VRadioButton _radio_group_radio_left;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VRadioButton _radio_group_radio_center;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VRadioButton _radio_group_radio_right;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public VButton _bottom_button;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public l5j0 dialog;

    public mci0(@NotNull Act act) {
        act.getClass();
        this.act = act;
    }

    /* JADX INFO: renamed from: a */
    public static void m19206a(Throwable th) {
        lsi0.h(R$string.f2516fq);
    }

    /* JADX INFO: renamed from: b */
    public static void m19207b(l5j0 l5j0Var, View view) {
        l5j0Var.dismiss();
    }

    /* JADX INFO: renamed from: c */
    public static void m19208c(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: d */
    public static void m19209d(mci0 mci0Var, View view) {
        if (mci0Var.m19217l().getCheckedRadioButtonId() != -1) {
            zvf0.r("e_tarot_choose_popup_confirm", "p_tarot_choose_popup");
            mci0Var.m19213h();
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m19210e(mci0 mci0Var, RadioGroup radioGroup, int i) {
        radioGroup.getClass();
        mci0Var.m19215j().setAlpha(1.0f);
    }

    /* JADX INFO: renamed from: f */
    public static Unit m19211f(mci0 mci0Var, TarotDataEnvelope tarotDataEnvelope) {
        int i = tarotDataEnvelope.data.cardType;
        if (1 > i || i >= 45) {
            lsi0.h(R$string.f2516fq);
        } else {
            CoreModule.f1534c.f3683w1.m20366r3(tarotDataEnvelope);
            CoreModule.f1534c.f3683w1.m20365q3(tarotDataEnvelope.data.cardType);
            oci0.Companion c1083a = oci0.INSTANCE;
            Act act = mci0Var.act;
            TarotData tarotData = tarotDataEnvelope.data;
            tarotData.getClass();
            c1083a.m20528b(act, tarotData);
            l5j0 l5j0Var = mci0Var.dialog;
            if (l5j0Var == null) {
                Intrinsics.r("dialog");
                l5j0Var = null;
            }
            l5j0Var.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g */
    public final void m19212g(View view) {
        nci0.a(this, view);
    }

    /* JADX INFO: renamed from: h */
    public final void m19213h() {
        l5j0 l5j0Var = this.dialog;
        if (l5j0Var == null) {
            Intrinsics.r("dialog");
            l5j0Var = null;
        }
        c cVarObserveOn = l5j0Var.duringCreated(CoreModule.f1534c.f3683w1.m20358g3()).observeOn(jo0.a());
        final Function1 function1 = new Function1() { // from class: l.jci0
            public final Object invoke(Object obj) {
                return mci0.m19211f(this.f15114a, (TarotDataEnvelope) obj);
            }
        };
        cVarObserveOn.subscribe(new e30() { // from class: l.kci0
            public final void call(Object obj) {
                mci0.m19208c(function1, obj);
            }
        }, new e30() { // from class: l.lci0
            public final void call(Object obj) {
                mci0.m19206a((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public final l5j0 m19214i(Act act, View rootView) {
        l5j0 l5j0Var = new l5j0(act, v7c0.f24184d);
        l5j0Var.setContentView(rootView);
        l5j0Var.setCancelable(true);
        return l5j0Var;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final VButton m19215j() {
        VButton vButton = this._bottom_button;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.r("_bottom_button");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final VButton m19216k() {
        VButton vButton = this._close;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.r("_close");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final RadioGroup m19217l() {
        RadioGroup radioGroup = this._radio_group;
        if (radioGroup != null) {
            return radioGroup;
        }
        Intrinsics.r("_radio_group");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final VText m19218m() {
        VText vText = this._title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_title");
        return null;
    }

    /* JADX INFO: renamed from: n */
    public final void m19219n(final l5j0 dialog) {
        m19218m().setTypeface(adi0.m11817i(this.act));
        m19217l().setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: l.gci0
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                mci0.m19210e(this.f13214a, radioGroup, i);
            }
        });
        xdl0.E0(m19216k(), new View.OnClickListener() { // from class: l.hci0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mci0.m19207b(dialog, view);
            }
        });
        xdl0.E0(m19215j(), new View.OnClickListener() { // from class: l.ici0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mci0.m19209d(this.f14359a, view);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public final void m19220o() {
        Dialog dialog = null;
        View viewInflate = o7r.a(this.act).inflate(f6c0.f11910O5, (ViewGroup) null);
        viewInflate.getClass();
        m19212g(viewInflate);
        qib0.f19782G.m12727D(viewInflate, "https://fe-static.tancdn.com/v1/images/eyJpZCI6IlVMVUdYV0JMUUFKRk5HVFVYSkFZSkI3WVhRRlZWNDE0IiwidyI6MTEyNSwiaCI6MTIzOSwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjE0NzU3MTcwNDA4ODI2Mzc0MTY5fQ.webp");
        l5j0 l5j0VarM19214i = m19214i(this.act, viewInflate);
        this.dialog = l5j0VarM19214i;
        if (l5j0VarM19214i == null) {
            Intrinsics.r("dialog");
            l5j0VarM19214i = null;
        }
        m19219n(l5j0VarM19214i);
        Dialog dialog2 = this.dialog;
        if (dialog2 == null) {
            Intrinsics.r("dialog");
        } else {
            dialog = dialog2;
        }
        dialog.show();
    }
}
