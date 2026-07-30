package p006l;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.core.data.TarotData;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l.c4g0;
import l.e30;
import l.jo0;
import l.mkd0;
import l.o7r;
import l.szd;
import l.t100;
import l.wci0;
import l.xdl0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import rx.c;
import v.VButton;
import v.VCheckBox;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010)\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010\fR\"\u00101\u001a\u00020*8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00109\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010@\u001a\u00020:8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000b\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010C\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u0010%\u001a\u0004\bA\u0010'\"\u0004\bB\u0010\fR\"\u0010J\u001a\u00020D8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010M\u001a\u00020*8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010,\u001a\u0004\bK\u0010.\"\u0004\bL\u00100R\"\u0010U\u001a\u00020N8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\"\u0010W\u001a\u00020:8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bQ\u0010;\u001a\u0004\bO\u0010=\"\u0004\bV\u0010?R\u0016\u0010Z\u001a\u00020X8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b<\u0010YR\u0016\u0010]\u001a\u00020[8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010\\R\u0016\u0010_\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b5\u0010^¨\u0006`"}, d2 = {"Ll/vci0;", "", "Lcom/p1/mobile/android/app/Act;", "act", "Lcom/p1/mobile/putong/core/data/TarotData;", "tarotInfo", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/TarotData;)V", "Landroid/view/View;", "view", "", "g", "(Landroid/view/View;)V", "q", "()V", "h", "i", "rootView", "Lcom/p1/mobile/android/app/Dialog;", "j", "(Lcom/p1/mobile/android/app/Act;Landroid/view/View;)Lcom/p1/mobile/android/app/Dialog;", "r", "a", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "b", "Lcom/p1/mobile/putong/core/data/TarotData;", "Landroid/widget/ImageView;", "c", "Landroid/widget/ImageView;", "get_iv_top", "()Landroid/widget/ImageView;", "set_iv_top", "(Landroid/widget/ImageView;)V", "_iv_top", "d", "Landroid/view/View;", "get_empty_top", "()Landroid/view/View;", "set_empty_top", "_empty_top", "Landroid/widget/TextView;", "e", "Landroid/widget/TextView;", "p", "()Landroid/widget/TextView;", "set_tarot_title", "(Landroid/widget/TextView;)V", "_tarot_title", "Lv/VText;", "f", "Lv/VText;", "o", "()Lv/VText;", "set_tarot_time", "(Lv/VText;)V", "_tarot_time", "Lv/VButton;", "Lv/VButton;", "m", "()Lv/VButton;", "set_close", "(Lv/VButton;)V", "_close", "get_empty_bottom", "set_empty_bottom", "_empty_bottom", "Landroid/widget/Space;", "Landroid/widget/Space;", "get_space", "()Landroid/widget/Space;", "set_space", "(Landroid/widget/Space;)V", "_space", "n", "set_tarot_content", "_tarot_content", "Lv/VCheckBox;", "k", "Lv/VCheckBox;", "l", "()Lv/VCheckBox;", "set_checkbox", "(Lv/VCheckBox;)V", "_checkbox", "set_bottom_button", "_bottom_button", "Ll/c4g0;", "Ll/c4g0;", "countDown", "", "J", "startTime", "Lcom/p1/mobile/android/app/Dialog;", "dialog", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class vci0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final TarotData tarotInfo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public ImageView _iv_top;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public View _empty_top;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public TextView _tarot_title;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VText _tarot_time;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VButton _close;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public View _empty_bottom;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public Space _space;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public TextView _tarot_content;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public VCheckBox _checkbox;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public VButton _bottom_button;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public c4g0 countDown;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public long startTime;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public Dialog dialog;

    public vci0(@NotNull Act act, @NotNull TarotData tarotData) {
        act.getClass();
        tarotData.getClass();
        this.act = act;
        this.tarotInfo = tarotData;
    }

    /* JADX INFO: renamed from: a */
    public static void m25786a(vci0 vci0Var, Long l2) {
        vci0Var.m25794i();
    }

    /* JADX INFO: renamed from: b */
    public static void m25787b(vci0 vci0Var, CompoundButton compoundButton, boolean z) {
        compoundButton.getClass();
        CoreModule.f1534c.f3683w1.getReject().put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: c */
    public static void m25788c(vci0 vci0Var, View view) {
        szd szdVar = null;
        if (vci0Var.tarotInfo.cardType != 0) {
            zvf0.r("e_tarot_check_popup_confirm", "p_tarot_check_popup");
            oci0.INSTANCE.m20528b(vci0Var.act, vci0Var.tarotInfo);
            szd szdVar2 = vci0Var.dialog;
            if (szdVar2 == null) {
                Intrinsics.r("dialog");
            } else {
                szdVar = szdVar2;
            }
            szdVar.dismiss();
            return;
        }
        zvf0.r("e_tarot_making_popup_confirm", "p_tarot_making_popup");
        oci0.INSTANCE.m20527a(vci0Var.act);
        szd szdVar3 = vci0Var.dialog;
        if (szdVar3 == null) {
            Intrinsics.r("dialog");
        } else {
            szdVar = szdVar3;
        }
        szdVar.dismiss();
    }

    /* JADX INFO: renamed from: d */
    public static void m25789d(vci0 vci0Var, DialogInterface dialogInterface) {
        if (vci0Var.tarotInfo.cardType != 0) {
            c4g0 c4g0Var = vci0Var.countDown;
            if (c4g0Var == null) {
                Intrinsics.r("countDown");
                c4g0Var = null;
            }
            mkd0.z(c4g0Var);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m25790e(vci0 vci0Var, View view) {
        szd szdVar = vci0Var.dialog;
        if (szdVar == null) {
            Intrinsics.r("dialog");
            szdVar = null;
        }
        szdVar.dismiss();
    }

    /* JADX INFO: renamed from: f */
    public static void m25791f(Throwable th) {
    }

    /* JADX INFO: renamed from: g */
    public final void m25792g(View view) {
        wci0.a(this, view);
    }

    /* JADX INFO: renamed from: h */
    public final void m25793h() {
        c4g0 c4g0VarSubscribe = c.interval(0L, 500L, TimeUnit.MILLISECONDS).onBackpressureLatest().observeOn(jo0.a()).subscribe(mkd0.H(new e30() { // from class: l.tci0
            public final void call(Object obj) {
                vci0.m25786a(this.f22039a, (Long) obj);
            }
        }, new e30() { // from class: l.uci0
            public final void call(Object obj) {
                vci0.m25791f((Throwable) obj);
            }
        }));
        c4g0VarSubscribe.getClass();
        this.countDown = c4g0VarSubscribe;
    }

    /* JADX INFO: renamed from: i */
    public final void m25794i() {
        long jCurrentTimeMillis = this.startTime - System.currentTimeMillis();
        if (jCurrentTimeMillis < 0 && jCurrentTimeMillis > -7200000) {
            xdl0.H0(m25800o(), this.act.getString(R$string.f2536gf));
            return;
        }
        if (jCurrentTimeMillis > 86400000 || jCurrentTimeMillis < -7200000) {
            this.startTime = adi0.INSTANCE.m11820d();
            return;
        }
        String strM11822f = adi0.INSTANCE.m11822f(jCurrentTimeMillis);
        xdl0.H0(m25800o(), this.act.getString(R$string.f2505ff) + " \n" + strM11822f);
    }

    /* JADX INFO: renamed from: j */
    public final Dialog m25795j(Act act, View rootView) {
        Dialog dialogZ = act.dialog().L(v7c0.f24195o).P(rootView, false).C(t100.d(24.0f), 0, t100.d(24.0f), 0).B(true).z();
        dialogZ.getClass();
        return dialogZ;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final VButton m25796k() {
        VButton vButton = this._bottom_button;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.r("_bottom_button");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final VCheckBox m25797l() {
        VCheckBox vCheckBox = this._checkbox;
        if (vCheckBox != null) {
            return vCheckBox;
        }
        Intrinsics.r("_checkbox");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final VButton m25798m() {
        VButton vButton = this._close;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.r("_close");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final TextView m25799n() {
        TextView textView = this._tarot_content;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_tarot_content");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final VText m25800o() {
        VText vText = this._tarot_time;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_tarot_time");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final TextView m25801p() {
        TextView textView = this._tarot_title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_tarot_title");
        return null;
    }

    /* JADX INFO: renamed from: q */
    public final void m25802q() {
        if (this.tarotInfo.cardType != 0) {
            m25799n().setText(this.act.getString(R$string.f2567hf));
            m25796k().setText(this.act.getString(R$string.f2474ef));
            this.startTime = adi0.INSTANCE.m11820d();
            m25793h();
        } else {
            m25799n().setText(this.act.getString(R$string.f2658kf));
            m25796k().setText(this.act.getString(R$string.f2627jf));
        }
        xdl0.M(m25797l(), this.tarotInfo.cardType != 0);
        xdl0.M(m25800o(), this.tarotInfo.cardType != 0);
        xdl0.E0(m25798m(), new View.OnClickListener() { // from class: l.qci0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vci0.m25790e(this.f19712a, view);
            }
        });
        xdl0.E0(m25796k(), new View.OnClickListener() { // from class: l.rci0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vci0.m25788c(this.f20515a, view);
            }
        });
        m25801p().setTypeface(adi0.m11817i(this.act));
        VCheckBox vCheckBoxM25797l = m25797l();
        Object obj = CoreModule.f1534c.f3683w1.getReject().get();
        obj.getClass();
        vCheckBoxM25797l.setChecked(((Boolean) obj).booleanValue());
        m25797l().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.sci0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                vci0.m25787b(this.f21259a, compoundButton, z);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public final void m25803r() {
        Dialog dialog = null;
        View viewInflate = o7r.a(this.act).inflate(f6c0.f11926P5, (ViewGroup) null);
        viewInflate.getClass();
        m25792g(viewInflate);
        szd szdVarM25795j = m25795j(this.act, viewInflate);
        this.dialog = szdVarM25795j;
        if (szdVarM25795j == null) {
            Intrinsics.r("dialog");
            szdVarM25795j = null;
        }
        szdVarM25795j.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.pci0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                vci0.m25789d(this.f18682a, dialogInterface);
            }
        });
        m25802q();
        Dialog dialog2 = this.dialog;
        if (dialog2 == null) {
            Intrinsics.r("dialog");
        } else {
            dialog = dialog2;
        }
        dialog.show();
    }
}
