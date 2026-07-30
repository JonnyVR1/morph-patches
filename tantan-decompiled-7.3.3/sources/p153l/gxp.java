package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Careers;
import com.p051p1.mobile.putong.data.OMSTemplateType;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceManagerInvite;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceManagerInviteStatus;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.manager.invite.IntlVoiceLiveManagerInvitePageView;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m88120d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\n\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0015\u001a\u00020\u00142\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0017\u001a\u00020\u00142\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u0019\u001a\u00020\u00142\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0019\u0010\u0018J\u001b\u0010\u001b\u001a\u00020\u00142\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u001b\u0010\u0018J%\u0010\u001c\u001a\u0004\u0018\u00010\u00102\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u001c\u0010\u0012J\u0011\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0014¢\u0006\u0004\b \u0010\u0004J\u001d\u0010%\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u001d\u0010*\u001a\u00020\u00142\u0006\u0010'\u001a\u00020!2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020\u0014¢\u0006\u0004\b,\u0010\u0004J\u000f\u0010-\u001a\u00020\u0014H\u0016¢\u0006\u0004\b-\u0010\u0004R\"\u00104\u001a\u00020\u00108\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010<\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010D\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010L\u001a\u00020E8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\"\u0010P\u001a\u00020\u00108\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bM\u0010/\u001a\u0004\bN\u00101\"\u0004\bO\u00103R\"\u0010X\u001a\u00020Q8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR&\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010\u0016R$\u0010e\u001a\u0004\u0018\u00010^8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR$\u0010m\u001a\u0004\u0018\u00010f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR$\u0010u\u001a\u0004\u0018\u00010n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bo\u0010p\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR$\u0010x\u001a\u0004\u0018\u00010n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010p\u001a\u0004\bv\u0010r\"\u0004\bw\u0010tR$\u0010\u007f\u001a\u0004\u0018\u00010y8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010z\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~¨\u0006\u0080\u0001"}, m88121d2 = {"Ll/gxp;", "Ll/iam;", "Ll/xwp;", "<init>", "()V", "", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceManagerInvite;", "onlineMembers", "", "Ll/d3q;", "m", "(Ljava/util/List;)Ljava/util/List;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "k", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "anchorPresenter", "", BLiveStormDanmakuGiftResourceType.f45292l, "(Ll/xwp;)V", "G", "(Ljava/util/List;)V", BaseSei.f14626Z, Careers.f39580it, BaseSei.f14624X, "inflateView", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "p", "", AuthenticationTokenClaims.JSON_KEY_NAME, "", "isFemale", c4s.C_ZONE, "(Ljava/lang/String;Z)V", "currentManagerName", "Ll/x20;", "accpetAction", "B", "(Ljava/lang/String;Ll/x20;)V", BaseSei.f14625Y, "destroy", "a", "Landroid/view/View;", "u", "()Landroid/view/View;", "set_empty", "(Landroid/view/View;)V", "_empty", "Landroid/widget/LinearLayout;", "b", "Landroid/widget/LinearLayout;", BLiveStormDanmakuGiftResourceType.f45294s, "()Landroid/widget/LinearLayout;", "set_contentView", "(Landroid/widget/LinearLayout;)V", "_contentView", "Landroid/widget/TextView;", "c", "Landroid/widget/TextView;", "get_managerDialogTitle", "()Landroid/widget/TextView;", "set_managerDialogTitle", "(Landroid/widget/TextView;)V", "_managerDialogTitle", "Landroid/widget/ImageView;", Constants.INAPP_DATA_TAG, "Landroid/widget/ImageView;", "w", "()Landroid/widget/ImageView;", "set_voiceManagerExplain", "(Landroid/widget/ImageView;)V", "_voiceManagerExplain", "e", "get_line", "set_line", "_line", "Lcom/p1/mobile/putong/live/livingroom/voice/intl/manager/invite/IntlVoiceLiveManagerInvitePageView;", "f", "Lcom/p1/mobile/putong/live/livingroom/voice/intl/manager/invite/IntlVoiceLiveManagerInvitePageView;", ResourceDirection.f39656v, "()Lcom/p1/mobile/putong/live/livingroom/voice/intl/manager/invite/IntlVoiceLiveManagerInvitePageView;", "set_onlineView", "(Lcom/p1/mobile/putong/live/livingroom/voice/intl/manager/invite/IntlVoiceLiveManagerInvitePageView;)V", "_onlineView", "g", "Ll/xwp;", "q", "()Ll/xwp;", "A", "Ll/r2o0;", "h", "Ll/r2o0;", "getInviteSuccessView", "()Ll/r2o0;", "setInviteSuccessView", "(Ll/r2o0;)V", "inviteSuccessView", "Ll/z1o0;", RXScreenCaptureService.KEY_INDEX, "Ll/z1o0;", "getInviteAffirmView", "()Ll/z1o0;", "setInviteAffirmView", "(Ll/z1o0;)V", "inviteAffirmView", "Ll/g4s;", "j", "Ll/g4s;", "getAffirmDialog", "()Ll/g4s;", "setAffirmDialog", "(Ll/g4s;)V", "affirmDialog", "getInviteSuccessDialog", "setInviteSuccessDialog", "inviteSuccessDialog", "Ll/c0s;", "Ll/c0s;", "getDialog", "()Ll/c0s;", "setDialog", "(Ll/c0s;)V", OMSTemplateType.dialog, "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class gxp implements iam<xwp<?>> {

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
    public xwp<?> anchorPresenter;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public r2o0 inviteSuccessView;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public z1o0 inviteAffirmView;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public g4s affirmDialog;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public g4s inviteSuccessDialog;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public c0s dialog;

    /* JADX INFO: renamed from: E */
    public static final Unit m132895E(gxp gxpVar, View view) {
        view.getClass();
        g4s g4sVar = gxpVar.inviteSuccessDialog;
        if (g4sVar != null) {
            g4sVar.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F */
    public static final Unit m132896F(gxp gxpVar, View view) {
        view.getClass();
        g4s g4sVar = gxpVar.inviteSuccessDialog;
        if (g4sVar != null) {
            g4sVar.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static void m132897a(List list, final gxp gxpVar, final BLiveVoiceManagerInvite bLiveVoiceManagerInvite) {
        bLiveVoiceManagerInvite.getClass();
        list.add(new ixp(bLiveVoiceManagerInvite, new y20() { // from class: l.fxp
            @Override // p153l.y20
            public final void call(Object obj) {
                gxp.m132905n(this.f101283a, bLiveVoiceManagerInvite, (BLiveVoiceManagerInvite) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: c */
    public static Unit m132899c(gxp gxpVar, View view) {
        view.getClass();
        c0s c0sVar = gxpVar.dialog;
        if (c0sVar != null) {
            c0sVar.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public static void m132900d(gxp gxpVar, x20 x20Var) {
        g4s g4sVar = gxpVar.affirmDialog;
        if (g4sVar != null) {
            g4sVar.dismiss();
        }
        x20Var.call();
    }

    /* JADX INFO: renamed from: e */
    public static Unit m132901e(gxp gxpVar, View view) {
        view.getClass();
        gxpVar.m132914q().m213811F2().OpenH5Event.open().mo199273j(px50.m174112c(900).m174141B(zrv.m221193k().m203714qb()).m174146t(80).m174148v().m174152z(1.0d, 0.7d).m174143q());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public static void m132904j(gxp gxpVar) {
        g4s g4sVar = gxpVar.affirmDialog;
        if (g4sVar != null) {
            g4sVar.dismiss();
        }
    }

    /* JADX INFO: renamed from: n */
    public static final void m132905n(gxp gxpVar, BLiveVoiceManagerInvite bLiveVoiceManagerInvite, BLiveVoiceManagerInvite bLiveVoiceManagerInvite2) {
        if (!bLiveVoiceManagerInvite2.isManager) {
            if (TEnum.equals(bLiveVoiceManagerInvite2.status, BLiveVoiceManagerInviteStatus.inviting)) {
                return;
            }
            gxpVar.m132914q().m213390x4(bLiveVoiceManagerInvite);
        } else {
            xwp<?> xwpVarM132914q = gxpVar.m132914q();
            String str = bLiveVoiceManagerInvite.userId;
            str.getClass();
            xwpVarM132914q.m213384r4(str);
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m132906A(@NotNull xwp<?> xwpVar) {
        xwpVar.getClass();
        this.anchorPresenter = xwpVar;
    }

    /* JADX INFO: renamed from: B */
    public final void m132907B(@NotNull String currentManagerName, @NotNull final x20 accpetAction) {
        currentManagerName.getClass();
        accpetAction.getClass();
        if (this.inviteAffirmView == null) {
            Act act = m132914q().act();
            act.getClass();
            this.inviteAffirmView = new z1o0(act);
            xwp<?> xwpVarM132914q = m132914q();
            z1o0 z1o0Var = this.inviteAffirmView;
            z1o0Var.getClass();
            this.affirmDialog = new g4s(xwpVarM132914q, z1o0Var.getCom.p1.mobile.putong.data.OMSTemplateModeType.view java.lang.String());
        }
        z1o0 z1o0Var2 = this.inviteAffirmView;
        if (z1o0Var2 != null) {
            String strM209911u = xau.m209911u(R$string.f47706Nh, currentManagerName);
            strM209911u.getClass();
            String strM209911u2 = xau.m209911u(R$string.f47685Mh, Integer.valueOf(zrv.m221193k().m203604d6()));
            strM209911u2.getClass();
            z1o0Var2.m218362j(strM209911u, strM209911u2, R$string.f47690N1, R$string.f47631K6, new x20() { // from class: l.axp
                @Override // p153l.x20
                public final void call() {
                    gxp.m132904j(this.f73876a);
                }
            }, new x20() { // from class: l.bxp
                @Override // p153l.x20
                public final void call() {
                    gxp.m132900d(this.f78899a, accpetAction);
                }
            });
        }
        g4s g4sVar = this.affirmDialog;
        if (g4sVar != null) {
            g4sVar.show();
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m132908C(@NotNull String name, boolean isFemale) {
        TextView textViewM179547c;
        name.getClass();
        if (this.inviteSuccessView == null) {
            Act act = m132914q().act();
            act.getClass();
            r2o0 r2o0Var = new r2o0(act);
            czq.m113347c(r2o0Var.m179549e(), new Function1() { // from class: l.cxp
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return gxp.m132895E(this.f84263a, (View) obj);
                }
            });
            czq.m113347c(r2o0Var.m179548d(), new Function1() { // from class: l.dxp
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return gxp.m132896F(this.f91099a, (View) obj);
                }
            });
            this.inviteSuccessView = r2o0Var;
            xwp<?> xwpVarM132914q = m132914q();
            r2o0 r2o0Var2 = this.inviteSuccessView;
            r2o0Var2.getClass();
            this.inviteSuccessDialog = new g4s(xwpVarM132914q, r2o0Var2.getCom.p1.mobile.putong.data.OMSTemplateModeType.view java.lang.String());
        }
        int iM213385s4 = m132914q().m213385s4();
        r2o0 r2o0Var3 = this.inviteSuccessView;
        if (r2o0Var3 != null && (textViewM179547c = r2o0Var3.m179547c()) != null) {
            textViewM179547c.setText(xau.m209912v(R$string.f47664Lh, name, Integer.valueOf(iM213385s4)));
        }
        g4s g4sVar = this.inviteSuccessDialog;
        if (g4sVar != null) {
            g4sVar.show();
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return m132914q().act();
    }

    /* JADX INFO: renamed from: G */
    public final void m132909G(@Nullable List<? extends BLiveVoiceManagerInvite> onlineMembers) {
        List<d3q<?>> listM132912m;
        if (this.dialog == null) {
            LayoutInflater layoutInflaterInflater = m132914q().act().inflater();
            layoutInflaterInflater.getClass();
            View viewM132910k = m132910k(layoutInflaterInflater, null);
            qnp0.m177260c1(m132915s(), 0, 0, 0, -qa00.m175859d(24.0f), qa00.m175859d(24.0f));
            this.dialog = new c0s(m132914q(), viewM132910k);
            czq.m113347c(m132916u(), new Function1() { // from class: l.ywp
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return gxp.m132899c(this.f201853a, (View) obj);
                }
            });
            czq.m113347c(m132918w(), new Function1() { // from class: l.zwp
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return gxp.m132901e(this.f206366a, (View) obj);
                }
            });
            m132917v().m79452c(m132914q());
        }
        if (onlineMembers != null && (listM132912m = m132912m(onlineMembers)) != null) {
            m132917v().setPageData(listM132912m);
        }
        c0s c0sVar = this.dialog;
        c0sVar.getClass();
        c0sVar.show();
    }

    @Override // p153l.iam
    @Nullable
    public View inflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup parent) {
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final View m132910k(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM137632b = hxp.m137632b(this, inflater, parent);
        viewM137632b.getClass();
        return viewM137632b;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(@NotNull xwp<?> anchorPresenter) {
        anchorPresenter.getClass();
        m132906A(anchorPresenter);
    }

    /* JADX INFO: renamed from: m */
    public final List<d3q<?>> m132912m(List<? extends BLiveVoiceManagerInvite> onlineMembers) {
        final ArrayList arrayList = new ArrayList();
        jyb.m147537z(onlineMembers, new y20() { // from class: l.exp
            @Override // p153l.y20
            public final void call(Object obj) {
                gxp.m132897a(arrayList, this, (BLiveVoiceManagerInvite) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: p */
    public final void m132913p() {
        c0s c0sVar = this.dialog;
        if (c0sVar != null) {
            c0sVar.dismiss();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final xwp<?> m132914q() {
        xwp<?> xwpVar = this.anchorPresenter;
        if (xwpVar != null) {
            return xwpVar;
        }
        Intrinsics.m88391r("anchorPresenter");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final LinearLayout m132915s() {
        LinearLayout linearLayout = this._contentView;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m88391r("_contentView");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final View m132916u() {
        View view = this._empty;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("_empty");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final IntlVoiceLiveManagerInvitePageView m132917v() {
        IntlVoiceLiveManagerInvitePageView intlVoiceLiveManagerInvitePageView = this._onlineView;
        if (intlVoiceLiveManagerInvitePageView != null) {
            return intlVoiceLiveManagerInvitePageView;
        }
        Intrinsics.m88391r("_onlineView");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final ImageView m132918w() {
        ImageView imageView = this._voiceManagerExplain;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.m88391r("_voiceManagerExplain");
        return null;
    }

    /* JADX INFO: renamed from: x */
    public final void m132919x(@NotNull List<? extends BLiveVoiceManagerInvite> it) {
        it.getClass();
        m132917v().m79454f(m132912m(it));
    }

    /* JADX INFO: renamed from: y */
    public final void m132920y() {
        m132917v().m79453e();
    }

    /* JADX INFO: renamed from: z */
    public final void m132921z(@NotNull List<? extends BLiveVoiceManagerInvite> onlineMembers) {
        onlineMembers.getClass();
        m132917v().setPageData(m132912m(onlineMembers));
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
