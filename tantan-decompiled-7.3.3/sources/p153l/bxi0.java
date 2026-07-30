package p153l;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.IntlThirdQuickLoginEnvelope;
import com.p051p1.mobile.putong.core.p058ui.quicklogin.C8984a;
import com.p051p1.mobile.putong.core.p058ui.roundcorners.view.RoundButton;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;
import p151v.VButton;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0010J\u000f\u0010\u0015\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\tJ\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010-\u001a\u00020&8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u00105\u001a\u00020.8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u00109\u001a\u00020.8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b6\u00100\u001a\u0004\b7\u00102\"\u0004\b8\u00104R\"\u0010A\u001a\u00020:8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010G\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010F¨\u0006H"}, m88121d2 = {"Ll/bxi0;", "Ll/iam;", "Ll/swi0;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "", "m", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "k", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", BLiveStormDanmakuGiftResourceType.f45292l, "(Ll/swi0;)V", "inflateView", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "r", "a", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "Lv/VButton;", "b", "Lv/VButton;", "p", "()Lv/VButton;", "set_close", "(Lv/VButton;)V", "_close", "Lv/VDraweeView;", "c", "Lv/VDraweeView;", "n", "()Lv/VDraweeView;", "set_avatar", "(Lv/VDraweeView;)V", "_avatar", "Landroid/widget/TextView;", Constants.INAPP_DATA_TAG, "Landroid/widget/TextView;", BLiveStormDanmakuGiftResourceType.f45294s, "()Landroid/widget/TextView;", "set_id", "(Landroid/widget/TextView;)V", "_id", "e", "get_desc", "set_desc", "_desc", "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundButton;", "f", "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundButton;", "q", "()Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundButton;", "set_confirm", "(Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundButton;)V", "_confirm", "g", "Ll/swi0;", "Ll/kcg0;", "h", "Ll/kcg0;", "coreRequest", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class bxi0 implements iam<swi0> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VButton _close;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VDraweeView _avatar;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public TextView _id;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public TextView _desc;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public RoundButton _confirm;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public swi0 presenter;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public kcg0 coreRequest;

    public bxi0(@NotNull Act act) {
        act.getClass();
        this.act = act;
    }

    /* JADX INFO: renamed from: a */
    public static void m106877a(bxi0 bxi0Var, View view) {
        bxi0Var.act.m45660g2();
    }

    /* JADX INFO: renamed from: b */
    public static void m106878b(final bxi0 bxi0Var, View view) {
        C22421c c22421cObserveOn;
        bxi0Var.act.progress(R$string.f18632L5);
        C22421c c22421cDuringCreated = bxi0Var.act.duringCreated(CoreModule.f18264c.f20298C1.m124888c3());
        if (c22421cDuringCreated != null && (c22421cObserveOn = c22421cDuringCreated.observeOn(fo0.m126432a())) != null) {
            final Function1 function1 = new Function1() { // from class: l.ywi0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return bxi0.m106886u(this.f201842a, (IntlThirdQuickLoginEnvelope) obj);
                }
            };
            c22421cObserveOn.subscribe(new y20() { // from class: l.zwi0
                @Override // p153l.y20
                public final void call(Object obj) {
                    bxi0.m106887v(function1, obj);
                }
            }, new y20() { // from class: l.axi0
                @Override // p153l.y20
                public final void call(Object obj) {
                    bxi0.m106888w(this.f73862a, (Throwable) obj);
                }
            });
        }
        C8984a.INSTANCE.m55806a();
    }

    /* JADX INFO: renamed from: c */
    public static void m106879c(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: e */
    public static void m106881e(Throwable th) {
    }

    /* JADX INFO: renamed from: f */
    public static Unit m106882f(bxi0 bxi0Var, User user) {
        bxi0Var.m106895s().setText(bxi0Var.act.getString(R$string.f19521od) + ": " + user.publicId);
        uqb0.f180374G.m127107H0(bxi0Var.m106891n(), user.m61308fp().profileMiddle(), qa00.m175859d(80.0f), qa00.m175859d(106.0f));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m */
    private final void m106885m() {
        C8984a.INTL_THIRD_QUICK_LOGIN_REDIRECT_URI = null;
        this.act.progressDismiss();
        this.act.m45660g2();
    }

    /* JADX INFO: renamed from: u */
    public static final Unit m106886u(bxi0 bxi0Var, IntlThirdQuickLoginEnvelope intlThirdQuickLoginEnvelope) {
        int i = intlThirdQuickLoginEnvelope.meta.code;
        if (i == 200000) {
            if (!TextUtils.isEmpty(C8984a.INTL_THIRD_QUICK_LOGIN_REDIRECT_URI)) {
                String string = Uri.parse(C8984a.INTL_THIRD_QUICK_LOGIN_REDIRECT_URI).buildUpon().appendQueryParameter("serverCode", intlThirdQuickLoginEnvelope.data.code).build().toString();
                string.getClass();
                erq.m122257b(bxi0Var.act, string);
            }
        } else if (i == 403000) {
            o1j0.m165634h(R$string.f19486n9);
        } else {
            o1j0.m165634h(R$string.f19455m9);
        }
        bxi0Var.m106885m();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v */
    public static final void m106887v(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: w */
    public static final void m106888w(bxi0 bxi0Var, Throwable th) {
        o1j0.m165649w(R$string.f19455m9);
        bxi0Var.m106885m();
    }

    @Override // p153l.iam
    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.act;
    }

    @Override // p153l.iam
    public void destroy() {
        psd0.m173633z(this.coreRequest);
    }

    @Override // p153l.iam
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m106889k(inflater, parent);
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final View m106889k(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM113033b = cxi0.m113033b(this, inflater, parent);
        viewM113033b.getClass();
        return viewM113033b;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(@Nullable swi0 presenter) {
        this.presenter = presenter;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final VDraweeView m106891n() {
        VDraweeView vDraweeView = this._avatar;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_avatar");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final VButton m106892p() {
        VButton vButton = this._close;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.m88391r("_close");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final RoundButton m106893q() {
        RoundButton roundButton = this._confirm;
        if (roundButton != null) {
            return roundButton;
        }
        Intrinsics.m88391r("_confirm");
        return null;
    }

    /* JADX INFO: renamed from: r */
    public final void m106894r() {
        kcg0 kcg0VarSubscribe;
        C22421c c22421cDuringCreated = this.act.duringCreated(uqb0.f180397c0.mo105311me());
        if (c22421cDuringCreated != null) {
            final Function1 function1 = new Function1() { // from class: l.twi0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return bxi0.m106882f(this.f176400a, (User) obj);
                }
            };
            kcg0VarSubscribe = c22421cDuringCreated.subscribe(new y20() { // from class: l.uwi0
                @Override // p153l.y20
                public final void call(Object obj) {
                    bxi0.m106879c(function1, obj);
                }
            }, new y20() { // from class: l.vwi0
                @Override // p153l.y20
                public final void call(Object obj) {
                    bxi0.m106881e((Throwable) obj);
                }
            });
        } else {
            kcg0VarSubscribe = null;
        }
        this.coreRequest = kcg0VarSubscribe;
        bnl0.m105509E0(m106893q(), new View.OnClickListener() { // from class: l.wwi0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bxi0.m106878b(this.f191286a, view);
            }
        });
        bnl0.m105509E0(m106892p(), new View.OnClickListener() { // from class: l.xwi0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bxi0.m106877a(this.f196504a, view);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final TextView m106895s() {
        TextView textView = this._id;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_id");
        return null;
    }
}
