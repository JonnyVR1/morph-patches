package com.p051p1.mobile.putong.core.p058ui.lovebuzz.common;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.buzz.R$string;
import com.p051p1.mobile.putong.core.data.LoveBuzzData;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.common.BaseBuzzCallEndFrag;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.manager.LoveBuzzConstants$MATCH;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.c4s;
import p153l.eqx;
import p153l.haw;
import p153l.k8w;
import p153l.kcg0;
import p153l.psd0;
import p153l.pzi0;
import p153l.qcj;
import p153l.sbw;
import p153l.wf2;
import p153l.y20;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\bH\u0014¢\u0006\u0004\b\u000e\u0010\fJ\u0019\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0015¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0004H&¢\u0006\u0004\b\u0013\u0010\u0003J\u000f\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0003R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010'\u001a\u00020 8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010+\u001a\u00020 8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b(\u0010\"\u001a\u0004\b)\u0010$\"\u0004\b*\u0010&R\"\u00103\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u00107\u001a\u00020 8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u0010\"\u001a\u0004\b5\u0010$\"\u0004\b6\u0010&R\"\u0010;\u001a\u00020 8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b8\u0010\"\u001a\u0004\b9\u0010$\"\u0004\b:\u0010&R\"\u0010?\u001a\u00020 8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010\"\u001a\u0004\b=\u0010$\"\u0004\b>\u0010&R\"\u0010C\u001a\u00020 8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b@\u0010\"\u001a\u0004\bA\u0010$\"\u0004\bB\u0010&R\u0018\u0010G\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010F¨\u0006H"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/lovebuzz/common/BaseBuzzCallEndFrag;", "Lcom/p1/mobile/putong/app/PutongFrag;", "<init>", "()V", "", "Z4", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "R4", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "container", "inflateView", "Landroid/os/Bundle;", "sis", "g4", "(Landroid/os/Bundle;)V", "a5", "", "b5", "()Z", "onDestroyView", "Landroidx/constraintlayout/widget/ConstraintLayout;", BaseSei.f14626Z, "Landroidx/constraintlayout/widget/ConstraintLayout;", "U4", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_call_end_root", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_call_end_root", "Lv/VText;", "A", "Lv/VText;", "get_call_end_title", "()Lv/VText;", "set_call_end_title", "(Lv/VText;)V", "_call_end_title", "B", "T4", "set_call_duration", "_call_duration", "Lv/VDraweeView;", c4s.C_ZONE, "Lv/VDraweeView;", "W4", "()Lv/VDraweeView;", "set_vb_peer_avatar", "(Lv/VDraweeView;)V", "_vb_peer_avatar", "D", "Y4", "set_vb_peer_name", "_vb_peer_name", "E", "X4", "set_vb_peer_info", "_vb_peer_info", "F", "S4", "set_call_back", "_call_back", "G", "V4", "set_continue_call", "_continue_call", "Ll/kcg0;", "H", "Ll/kcg0;", "lbStatusSub", "buzz_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public abstract class BaseBuzzCallEndFrag extends PutongFrag {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public VText _call_end_title;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public VText _call_duration;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public VDraweeView _vb_peer_avatar;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public VText _vb_peer_name;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public VText _vb_peer_info;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public VText _call_back;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public VText _continue_call;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @Nullable
    public kcg0 lbStatusSub;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public ConstraintLayout _call_end_root;

    /* JADX INFO: renamed from: M4 */
    public static void m48079M4(BaseBuzzCallEndFrag baseBuzzCallEndFrag, LoveBuzzData loveBuzzData) {
        baseBuzzCallEndFrag.mo48094b5();
    }

    /* JADX INFO: renamed from: N4 */
    public static void m48080N4(BaseBuzzCallEndFrag baseBuzzCallEndFrag, View view) {
        baseBuzzCallEndFrag.act().m51642n2();
    }

    /* JADX INFO: renamed from: O4 */
    public static Boolean m48081O4(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: P4 */
    public static Boolean m48082P4(LoveBuzzData loveBuzzData) {
        loveBuzzData.getClass();
        return Boolean.valueOf(NullChecker.m82486a(loveBuzzData) && (loveBuzzData.remainingVoiceBuzz > 0 || loveBuzzData.remainingVideoBuzz > 0));
    }

    /* JADX INFO: renamed from: Q4 */
    public static void m48083Q4(BaseBuzzCallEndFrag baseBuzzCallEndFrag, View view) {
        baseBuzzCallEndFrag.mo48093a5();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0034  */
    /* JADX INFO: renamed from: Z4 */
    private final void m48084Z4() {
        kcg0 kcg0VarSubscribe;
        C22421c c22421cDuringCreated;
        Act act = act();
        if (act == null || (c22421cDuringCreated = act.duringCreated(haw.INSTANCE.m134320a().m134263A0())) == null) {
            kcg0VarSubscribe = null;
        } else {
            final Function1 function1 = new Function1() { // from class: l.tf2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BaseBuzzCallEndFrag.m48082P4((LoveBuzzData) obj);
                }
            };
            C22421c c22421cDistinctUntilChanged = c22421cDuringCreated.distinctUntilChanged(new qcj() { // from class: l.uf2
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return BaseBuzzCallEndFrag.m48081O4(function1, obj);
                }
            });
            if (c22421cDistinctUntilChanged != null) {
                kcg0VarSubscribe = c22421cDistinctUntilChanged.subscribe(psd0.m173596G(new y20() { // from class: l.vf2
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        BaseBuzzCallEndFrag.m48079M4(this.f183875a, (LoveBuzzData) obj);
                    }
                }));
            } else {
                kcg0VarSubscribe = null;
            }
        }
        this.lbStatusSub = kcg0VarSubscribe;
    }

    @NotNull
    /* JADX INFO: renamed from: R4 */
    public final View m48085R4(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM206044b = wf2.m206044b(this, inflater, parent);
        viewM206044b.getClass();
        return viewM206044b;
    }

    @NotNull
    /* JADX INFO: renamed from: S4 */
    public final VText m48086S4() {
        VText vText = this._call_back;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_call_back");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: T4 */
    public final VText m48087T4() {
        VText vText = this._call_duration;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_call_duration");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: U4 */
    public final ConstraintLayout m48088U4() {
        ConstraintLayout constraintLayout = this._call_end_root;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.m88391r("_call_end_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: V4 */
    public final VText m48089V4() {
        VText vText = this._continue_call;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_continue_call");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: W4 */
    public final VDraweeView m48090W4() {
        VDraweeView vDraweeView = this._vb_peer_avatar;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_vb_peer_avatar");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: X4 */
    public final VText m48091X4() {
        VText vText = this._vb_peer_info;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_vb_peer_info");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Y4 */
    public final VText m48092Y4() {
        VText vText = this._vb_peer_name;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_vb_peer_name");
        return null;
    }

    /* JADX INFO: renamed from: a5 */
    public abstract void mo48093a5();

    /* JADX INFO: renamed from: b5 */
    public abstract boolean mo48094b5();

    @Override // com.p051p1.mobile.android.app.Frag
    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(@Nullable Bundle sis) {
        super.mo21585g4(sis);
        bnl0.m105509E0(m48086S4(), new View.OnClickListener() { // from class: l.rf2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseBuzzCallEndFrag.m48080N4(this.f162757a, view);
            }
        });
        bnl0.m105509E0(m48089V4(), new View.OnClickListener() { // from class: l.sf2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseBuzzCallEndFrag.m48083Q4(this.f167664a, view);
            }
        });
        eqx eqxVarM134264B0 = haw.INSTANCE.m134320a().m134264B0();
        String callEndUserId = eqxVarM134264B0.getCallEndUserId();
        if (callEndUserId != null) {
            User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(callEndUserId);
            if (NullChecker.m82486a(userM116503Pa)) {
                sbw sbwVar = sbw.INSTANCE;
                VDraweeView vDraweeViewM48090W4 = m48090W4();
                userM116503Pa.getClass();
                Picture.ImageUri imageUriProfileSmall = sbwVar.m185345j(userM116503Pa).profileSmall();
                imageUriProfileSmall.getClass();
                sbwVar.m185342g(vDraweeViewM48090W4, imageUriProfileSmall, (eqxVarM134264B0.getMatched() == LoveBuzzConstants$MATCH.MATCHED || eqxVarM134264B0.getMatched() == LoveBuzzConstants$MATCH.PEER_LIKE_ME) ? 100 : 0, true);
                m48092Y4().setText(userM116503Pa.name);
                sbwVar.m185350o(userM116503Pa, m48091X4(), 18.0f, 18.0f);
            }
        }
        m48087T4().setText(getString(R$string.f21007y0) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + k8w.INSTANCE.m148754c(pzi0.m174454o() - eqxVarM134264B0.getStartTime()));
        m48084Z4();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        inflater.getClass();
        return m48085R4(inflater, container);
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onDestroyView() {
        psd0.m173633z(this.lbStatusSub);
        super.onDestroyView();
    }
}
