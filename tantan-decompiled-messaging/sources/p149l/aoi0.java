package p149l;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.IntlThirdQuickLoginEnvelope;
import com.p046p1.mobile.putong.core.p053ui.quicklogin.C8821a;
import com.p046p1.mobile.putong.core.p053ui.roundcorners.view.RoundButton;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;
import p147v.VButton;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0010J\u000f\u0010\u0015\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\tJ\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010-\u001a\u00020&8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u00105\u001a\u00020.8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u00109\u001a\u00020.8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b6\u00100\u001a\u0004\b7\u00102\"\u0004\b8\u00104R\"\u0010A\u001a\u00020:8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010G\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010F¨\u0006H"}, m87232d2 = {"Ll/aoi0;", "Ll/s7m;", "Ll/rni0;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "", "m", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "k", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", BLiveStormDanmakuGiftResourceType.f44444l, "(Ll/rni0;)V", "inflateView", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "r", "a", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "Lv/VButton;", "b", "Lv/VButton;", "p", "()Lv/VButton;", "set_close", "(Lv/VButton;)V", "_close", "Lv/VDraweeView;", "c", "Lv/VDraweeView;", "n", "()Lv/VDraweeView;", "set_avatar", "(Lv/VDraweeView;)V", "_avatar", "Landroid/widget/TextView;", Constants.INAPP_DATA_TAG, "Landroid/widget/TextView;", BLiveStormDanmakuGiftResourceType.f44446s, "()Landroid/widget/TextView;", "set_id", "(Landroid/widget/TextView;)V", "_id", "e", "get_desc", "set_desc", "_desc", "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundButton;", "f", "Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundButton;", "q", "()Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundButton;", "set_confirm", "(Lcom/p1/mobile/putong/core/ui/roundcorners/view/RoundButton;)V", "_confirm", "g", "Ll/rni0;", "Ll/c4g0;", "h", "Ll/c4g0;", "coreRequest", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class aoi0 implements s7m<rni0> {

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
    public rni0 presenter;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public c4g0 coreRequest;

    public aoi0(@NotNull Act act) {
        act.getClass();
        this.act = act;
    }

    /* JADX INFO: renamed from: a */
    public static void m97898a(aoi0 aoi0Var, View view) {
        aoi0Var.act.m44477e2();
    }

    /* JADX INFO: renamed from: b */
    public static void m97899b(final aoi0 aoi0Var, View view) {
        C22306c c22306cObserveOn;
        aoi0Var.act.progress(R$string.f17842J5);
        C22306c c22306cDuringCreated = aoi0Var.act.duringCreated(CoreModule.f17545c.f19556C1.m202273c3());
        if (c22306cDuringCreated != null && (c22306cObserveOn = c22306cDuringCreated.observeOn(jo0.m142408a())) != null) {
            final Function1 function1 = new Function1() { // from class: l.xni0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return aoi0.m97907u(this.f193697a, (IntlThirdQuickLoginEnvelope) obj);
                }
            };
            c22306cObserveOn.subscribe(new e30() { // from class: l.yni0
                @Override // p149l.e30
                public final void call(Object obj) {
                    aoi0.m97908v(function1, obj);
                }
            }, new e30() { // from class: l.zni0
                @Override // p149l.e30
                public final void call(Object obj) {
                    aoi0.m97909w(this.f203980a, (Throwable) obj);
                }
            });
        }
        C8821a.INSTANCE.m54623a();
    }

    /* JADX INFO: renamed from: c */
    public static void m97900c(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: e */
    public static void m97902e(Throwable th) {
    }

    /* JADX INFO: renamed from: f */
    public static Unit m97903f(aoi0 aoi0Var, User user) {
        aoi0Var.m97916s().setText(aoi0Var.act.getString(R$string.f18239Wc) + ": " + user.publicId);
        qib0.f154691G.m102323H0(aoi0Var.m97912n(), user.m60124fp().profileMiddle(), t100.m186890d(80.0f), t100.m186890d(106.0f));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m */
    private final void m97906m() {
        C8821a.INTL_THIRD_QUICK_LOGIN_REDIRECT_URI = null;
        this.act.progressDismiss();
        this.act.m44477e2();
    }

    /* JADX INFO: renamed from: u */
    public static final Unit m97907u(aoi0 aoi0Var, IntlThirdQuickLoginEnvelope intlThirdQuickLoginEnvelope) {
        int i = intlThirdQuickLoginEnvelope.meta.code;
        if (i == 200000) {
            if (!TextUtils.isEmpty(C8821a.INTL_THIRD_QUICK_LOGIN_REDIRECT_URI)) {
                String string = Uri.parse(C8821a.INTL_THIRD_QUICK_LOGIN_REDIRECT_URI).buildUpon().appendQueryParameter("serverCode", intlThirdQuickLoginEnvelope.data.code).build().toString();
                string.getClass();
                epq.m117671b(aoi0Var.act, string);
            }
        } else if (i == 403000) {
            lsi0.m151578h(R$string.f18694l9);
        } else {
            lsi0.m151578h(R$string.f18663k9);
        }
        aoi0Var.m97906m();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v */
    public static final void m97908v(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: w */
    public static final void m97909w(aoi0 aoi0Var, Throwable th) {
        lsi0.m151593w(R$string.f18663k9);
        aoi0Var.m97906m();
    }

    @Override // p149l.s7m
    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.act;
    }

    @Override // p149l.s7m
    public void destroy() {
        mkd0.m154992z(this.coreRequest);
    }

    @Override // p149l.s7m
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m97910k(inflater, parent);
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final View m97910k(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM102947b = boi0.m102947b(this, inflater, parent);
        viewM102947b.getClass();
        return viewM102947b;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(@Nullable rni0 presenter) {
        this.presenter = presenter;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final VDraweeView m97912n() {
        VDraweeView vDraweeView = this._avatar;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_avatar");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final VButton m97913p() {
        VButton vButton = this._close;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.m87502r("_close");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final RoundButton m97914q() {
        RoundButton roundButton = this._confirm;
        if (roundButton != null) {
            return roundButton;
        }
        Intrinsics.m87502r("_confirm");
        return null;
    }

    /* JADX INFO: renamed from: r */
    public final void m97915r() {
        c4g0 c4g0VarSubscribe;
        C22306c c22306cDuringCreated = this.act.duringCreated(qib0.f154714c0.mo97522me());
        if (c22306cDuringCreated != null) {
            final Function1 function1 = new Function1() { // from class: l.sni0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return aoi0.m97903f(this.f165458a, (User) obj);
                }
            };
            c4g0VarSubscribe = c22306cDuringCreated.subscribe(new e30() { // from class: l.tni0
                @Override // p149l.e30
                public final void call(Object obj) {
                    aoi0.m97900c(function1, obj);
                }
            }, new e30() { // from class: l.uni0
                @Override // p149l.e30
                public final void call(Object obj) {
                    aoi0.m97902e((Throwable) obj);
                }
            });
        } else {
            c4g0VarSubscribe = null;
        }
        this.coreRequest = c4g0VarSubscribe;
        xdl0.m208329E0(m97914q(), new View.OnClickListener() { // from class: l.vni0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                aoi0.m97899b(this.f182253a, view);
            }
        });
        xdl0.m208329E0(m97913p(), new View.OnClickListener() { // from class: l.wni0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                aoi0.m97898a(this.f187311a, view);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final TextView m97916s() {
        TextView textView = this._id;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_id");
        return null;
    }
}
