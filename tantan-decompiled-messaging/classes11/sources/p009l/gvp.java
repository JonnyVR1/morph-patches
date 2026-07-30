package p009l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.live.livingroom.voice.intl.manager.invite.IntlVoiceLiveManagerInvitePageView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.live.base.data.BLiveVoiceManagerInvite;
import com.p1.mobile.putong.live.livingroom.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l.byr;
import l.cxq;
import l.d1q;
import l.d30;
import l.e30;
import l.f2s;
import l.hvp;
import l.jp50;
import l.mep0;
import l.s7m;
import l.t100;
import l.vwb;
import l.w8u;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\n\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0015\u001a\u00020\u00142\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0017\u001a\u00020\u00142\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u0019\u001a\u00020\u00142\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0019\u0010\u0018J\u001b\u0010\u001b\u001a\u00020\u00142\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u001b\u0010\u0018J%\u0010\u001c\u001a\u0004\u0018\u00010\u00102\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u001c\u0010\u0012J\u0011\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0014¢\u0006\u0004\b \u0010\u0004J\u001d\u0010%\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u001d\u0010*\u001a\u00020\u00142\u0006\u0010'\u001a\u00020!2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020\u0014¢\u0006\u0004\b,\u0010\u0004J\u000f\u0010-\u001a\u00020\u0014H\u0016¢\u0006\u0004\b-\u0010\u0004R\"\u00104\u001a\u00020\u00108\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010<\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010D\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010L\u001a\u00020E8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\"\u0010P\u001a\u00020\u00108\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bM\u0010/\u001a\u0004\bN\u00101\"\u0004\bO\u00103R\"\u0010X\u001a\u00020Q8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR&\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010\u0016R$\u0010e\u001a\u0004\u0018\u00010^8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR$\u0010m\u001a\u0004\u0018\u00010f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR$\u0010u\u001a\u0004\u0018\u00010n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bo\u0010p\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR$\u0010x\u001a\u0004\u0018\u00010n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010p\u001a\u0004\bv\u0010r\"\u0004\bw\u0010tR$\u0010\u007f\u001a\u0004\u0018\u00010y8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010z\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~¨\u0006\u0080\u0001"}, d2 = {"Ll/gvp;", "Ll/s7m;", "Ll/xup;", "<init>", "()V", "", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceManagerInvite;", "onlineMembers", "", "Ll/d1q;", "m", "(Ljava/util/List;)Ljava/util/List;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "k", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "anchorPresenter", "", "l", "(Ll/xup;)V", "G", "(Ljava/util/List;)V", "z", "it", "x", "inflateView", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "p", "", "name", "", "isFemale", "C", "(Ljava/lang/String;Z)V", "currentManagerName", "Ll/d30;", "accpetAction", "B", "(Ljava/lang/String;Ll/d30;)V", "y", "destroy", "a", "Landroid/view/View;", "u", "()Landroid/view/View;", "set_empty", "(Landroid/view/View;)V", "_empty", "Landroid/widget/LinearLayout;", "b", "Landroid/widget/LinearLayout;", "s", "()Landroid/widget/LinearLayout;", "set_contentView", "(Landroid/widget/LinearLayout;)V", "_contentView", "Landroid/widget/TextView;", "c", "Landroid/widget/TextView;", "get_managerDialogTitle", "()Landroid/widget/TextView;", "set_managerDialogTitle", "(Landroid/widget/TextView;)V", "_managerDialogTitle", "Landroid/widget/ImageView;", "d", "Landroid/widget/ImageView;", "w", "()Landroid/widget/ImageView;", "set_voiceManagerExplain", "(Landroid/widget/ImageView;)V", "_voiceManagerExplain", "e", "get_line", "set_line", "_line", "Lcom/p1/mobile/putong/live/livingroom/voice/intl/manager/invite/IntlVoiceLiveManagerInvitePageView;", "f", "Lcom/p1/mobile/putong/live/livingroom/voice/intl/manager/invite/IntlVoiceLiveManagerInvitePageView;", "v", "()Lcom/p1/mobile/putong/live/livingroom/voice/intl/manager/invite/IntlVoiceLiveManagerInvitePageView;", "set_onlineView", "(Lcom/p1/mobile/putong/live/livingroom/voice/intl/manager/invite/IntlVoiceLiveManagerInvitePageView;)V", "_onlineView", "g", "Ll/xup;", "q", "()Ll/xup;", "A", "Ll/ntn0;", "h", "Ll/ntn0;", "getInviteSuccessView", "()Ll/ntn0;", "setInviteSuccessView", "(Ll/ntn0;)V", "inviteSuccessView", "Ll/vsn0;", "i", "Ll/vsn0;", "getInviteAffirmView", "()Ll/vsn0;", "setInviteAffirmView", "(Ll/vsn0;)V", "inviteAffirmView", "Ll/f2s;", "j", "Ll/f2s;", "getAffirmDialog", "()Ll/f2s;", "setAffirmDialog", "(Ll/f2s;)V", "affirmDialog", "getInviteSuccessDialog", "setInviteSuccessDialog", "inviteSuccessDialog", "Ll/byr;", "Ll/byr;", "getDialog", "()Ll/byr;", "setDialog", "(Ll/byr;)V", "dialog", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class gvp implements s7m<xup<?>> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public View _empty;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public LinearLayout _contentView;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public TextView _managerDialogTitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public ImageView _voiceManagerExplain;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public View _line;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public IntlVoiceLiveManagerInvitePageView _onlineView;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public xup<?> anchorPresenter;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public ntn0 inviteSuccessView;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public vsn0 inviteAffirmView;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public f2s affirmDialog;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public f2s inviteSuccessDialog;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public byr dialog;

    /* JADX INFO: renamed from: E */
    public static final Unit m15315E(gvp gvpVar, View view) {
        view.getClass();
        f2s f2sVar = gvpVar.inviteSuccessDialog;
        if (f2sVar != null) {
            f2sVar.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F */
    public static final Unit m15316F(gvp gvpVar, View view) {
        view.getClass();
        f2s f2sVar = gvpVar.inviteSuccessDialog;
        if (f2sVar != null) {
            f2sVar.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static void m15317a(List list, final gvp gvpVar, final BLiveVoiceManagerInvite bLiveVoiceManagerInvite) {
        bLiveVoiceManagerInvite.getClass();
        list.add(new ivp(bLiveVoiceManagerInvite, new e30() { // from class: l.fvp
            public final void call(Object obj) {
                gvp.m15325n(this.f13182a, bLiveVoiceManagerInvite, (BLiveVoiceManagerInvite) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: c */
    public static Unit m15319c(gvp gvpVar, View view) {
        view.getClass();
        byr byrVar = gvpVar.dialog;
        if (byrVar != null) {
            byrVar.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public static void m15320d(gvp gvpVar, d30 d30Var) {
        f2s f2sVar = gvpVar.affirmDialog;
        if (f2sVar != null) {
            f2sVar.dismiss();
        }
        d30Var.call();
    }

    /* JADX INFO: renamed from: e */
    public static Unit m15321e(gvp gvpVar, View view) {
        view.getClass();
        gvpVar.m15336q().F2().OpenH5Event.open().j(jp50.c(900).B(ypv.m25490k().qb()).t(80).v().z(1.0d, 0.7d).q());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public static void m15324j(gvp gvpVar) {
        f2s f2sVar = gvpVar.affirmDialog;
        if (f2sVar != null) {
            f2sVar.dismiss();
        }
    }

    /* JADX INFO: renamed from: n */
    public static final void m15325n(gvp gvpVar, BLiveVoiceManagerInvite bLiveVoiceManagerInvite, BLiveVoiceManagerInvite bLiveVoiceManagerInvite2) {
        if (!bLiveVoiceManagerInvite2.isManager) {
            if (TEnum.equals(bLiveVoiceManagerInvite2.status, "inviting")) {
                return;
            }
            gvpVar.m15336q().m25025x4(bLiveVoiceManagerInvite);
        } else {
            xup<?> xupVarM15336q = gvpVar.m15336q();
            String str = bLiveVoiceManagerInvite.userId;
            str.getClass();
            xupVarM15336q.m25019r4(str);
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m15326A(@NotNull xup<?> xupVar) {
        xupVar.getClass();
        this.anchorPresenter = xupVar;
    }

    /* JADX INFO: renamed from: B */
    public final void m15327B(@NotNull String currentManagerName, @NotNull final d30 accpetAction) {
        currentManagerName.getClass();
        accpetAction.getClass();
        if (this.inviteAffirmView == null) {
            Act act = m15336q().act();
            act.getClass();
            this.inviteAffirmView = new vsn0(act);
            xup<?> xupVarM15336q = m15336q();
            vsn0 vsn0Var = this.inviteAffirmView;
            vsn0Var.getClass();
            this.affirmDialog = new f2s(xupVarM15336q, vsn0Var.getView());
        }
        vsn0 vsn0Var2 = this.inviteAffirmView;
        if (vsn0Var2 != null) {
            String strU = w8u.u(R.string.Nh, currentManagerName);
            strU.getClass();
            String strU2 = w8u.u(R.string.Mh, Integer.valueOf(ypv.m25490k().d6()));
            strU2.getClass();
            vsn0Var2.m23718j(strU, strU2, R.string.N1, R.string.K6, new d30() { // from class: l.avp
                public final void call() {
                    gvp.m15324j(this.f9713a);
                }
            }, new d30() { // from class: l.bvp
                public final void call() {
                    gvp.m15320d(this.f10333a, accpetAction);
                }
            });
        }
        f2s f2sVar = this.affirmDialog;
        if (f2sVar != null) {
            f2sVar.show();
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m15328C(@NotNull String name, boolean isFemale) {
        TextView textViewM19524c;
        name.getClass();
        if (this.inviteSuccessView == null) {
            Act act = m15336q().act();
            act.getClass();
            ntn0 ntn0Var = new ntn0(act);
            cxq.c(ntn0Var.m19526e(), new Function1() { // from class: l.cvp
                public final Object invoke(Object obj) {
                    return gvp.m15315E(this.f10784a, (View) obj);
                }
            });
            cxq.c(ntn0Var.m19525d(), new Function1() { // from class: l.dvp
                public final Object invoke(Object obj) {
                    return gvp.m15316F(this.f12014a, (View) obj);
                }
            });
            this.inviteSuccessView = ntn0Var;
            xup<?> xupVarM15336q = m15336q();
            ntn0 ntn0Var2 = this.inviteSuccessView;
            ntn0Var2.getClass();
            this.inviteSuccessDialog = new f2s(xupVarM15336q, ntn0Var2.getView());
        }
        int iM25020s4 = m15336q().m25020s4();
        ntn0 ntn0Var3 = this.inviteSuccessView;
        if (ntn0Var3 != null && (textViewM19524c = ntn0Var3.m19524c()) != null) {
            textViewM19524c.setText(w8u.v(R.string.Lh, new Object[]{name, Integer.valueOf(iM25020s4)}));
        }
        f2s f2sVar = this.inviteSuccessDialog;
        if (f2sVar != null) {
            f2sVar.show();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m15329C0() {
        return m15336q().act();
    }

    /* JADX INFO: renamed from: G */
    public final void m15330G(@Nullable List<? extends BLiveVoiceManagerInvite> onlineMembers) {
        List<d1q<?>> listM15334m;
        if (this.dialog == null) {
            LayoutInflater layoutInflaterInflater = m15336q().act().inflater();
            layoutInflaterInflater.getClass();
            View viewM15332k = m15332k(layoutInflaterInflater, null);
            mep0.c1(m15337s(), 0, 0, 0, -t100.d(24.0f), t100.d(24.0f));
            this.dialog = new byr(m15336q(), viewM15332k);
            cxq.c(m15338u(), new Function1() { // from class: l.yup
                public final Object invoke(Object obj) {
                    return gvp.m15319c(this.f23248a, (View) obj);
                }
            });
            cxq.c(m15340w(), new Function1() { // from class: l.zup
                public final Object invoke(Object obj) {
                    return gvp.m15321e(this.f23920a, (View) obj);
                }
            });
            m15339v().m8458c(m15336q());
        }
        if (onlineMembers != null && (listM15334m = m15334m(onlineMembers)) != null) {
            m15339v().setPageData(listM15334m);
        }
        byr byrVar = this.dialog;
        byrVar.getClass();
        byrVar.show();
    }

    @Nullable
    public View inflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup parent) {
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final View m15332k(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewB = hvp.b(this, inflater, parent);
        viewB.getClass();
        return viewB;
    }

    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void m15331i1(@NotNull xup<?> anchorPresenter) {
        anchorPresenter.getClass();
        m15326A(anchorPresenter);
    }

    /* JADX INFO: renamed from: m */
    public final List<d1q<?>> m15334m(List<? extends BLiveVoiceManagerInvite> onlineMembers) {
        final ArrayList arrayList = new ArrayList();
        vwb.z(onlineMembers, new e30() { // from class: l.evp
            public final void call(Object obj) {
                gvp.m15317a(arrayList, this, (BLiveVoiceManagerInvite) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: p */
    public final void m15335p() {
        byr byrVar = this.dialog;
        if (byrVar != null) {
            byrVar.dismiss();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final xup<?> m15336q() {
        xup<?> xupVar = this.anchorPresenter;
        if (xupVar != null) {
            return xupVar;
        }
        Intrinsics.r("anchorPresenter");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final LinearLayout m15337s() {
        LinearLayout linearLayout = this._contentView;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.r("_contentView");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final View m15338u() {
        View view = this._empty;
        if (view != null) {
            return view;
        }
        Intrinsics.r("_empty");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final IntlVoiceLiveManagerInvitePageView m15339v() {
        IntlVoiceLiveManagerInvitePageView intlVoiceLiveManagerInvitePageView = this._onlineView;
        if (intlVoiceLiveManagerInvitePageView != null) {
            return intlVoiceLiveManagerInvitePageView;
        }
        Intrinsics.r("_onlineView");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final ImageView m15340w() {
        ImageView imageView = this._voiceManagerExplain;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.r("_voiceManagerExplain");
        return null;
    }

    /* JADX INFO: renamed from: x */
    public final void m15341x(@NotNull List<? extends BLiveVoiceManagerInvite> it) {
        it.getClass();
        m15339v().m8460f(m15334m(it));
    }

    /* JADX INFO: renamed from: y */
    public final void m15342y() {
        m15339v().m8459e();
    }

    /* JADX INFO: renamed from: z */
    public final void m15343z(@NotNull List<? extends BLiveVoiceManagerInvite> onlineMembers) {
        onlineMembers.getClass();
        m15339v().setPageData(m15334m(onlineMembers));
    }

    public void destroy() {
    }
}
