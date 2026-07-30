package com.p046p1.mobile.putong.core.p053ui.lovebuzz.common;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.buzz.R$string;
import com.p046p1.mobile.putong.core.data.LoveBuzzData;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.common.BaseBuzzCallEndFrag;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.manager.LoveBuzzConstants$MATCH;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;
import p147v.VDraweeView;
import p147v.VText;
import p149l.b2s;
import p149l.c4g0;
import p149l.e30;
import p149l.hhx;
import p149l.j8w;
import p149l.m6w;
import p149l.mkd0;
import p149l.mqi0;
import p149l.pf2;
import p149l.u9w;
import p149l.w9j;
import p149l.xdl0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\bH\u0014¢\u0006\u0004\b\u000e\u0010\fJ\u0019\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0015¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0004H&¢\u0006\u0004\b\u0013\u0010\u0003J\u000f\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0003R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010'\u001a\u00020 8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010+\u001a\u00020 8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b(\u0010\"\u001a\u0004\b)\u0010$\"\u0004\b*\u0010&R\"\u00103\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u00107\u001a\u00020 8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u0010\"\u001a\u0004\b5\u0010$\"\u0004\b6\u0010&R\"\u0010;\u001a\u00020 8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b8\u0010\"\u001a\u0004\b9\u0010$\"\u0004\b:\u0010&R\"\u0010?\u001a\u00020 8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010\"\u001a\u0004\b=\u0010$\"\u0004\b>\u0010&R\"\u0010C\u001a\u00020 8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b@\u0010\"\u001a\u0004\bA\u0010$\"\u0004\bB\u0010&R\u0018\u0010G\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010F¨\u0006H"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/lovebuzz/common/BaseBuzzCallEndFrag;", "Lcom/p1/mobile/putong/app/PutongFrag;", "<init>", "()V", "", "Z4", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "R4", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "container", "inflateView", "Landroid/os/Bundle;", "sis", "g4", "(Landroid/os/Bundle;)V", "a5", "", "b5", "()Z", "onDestroyView", "Landroidx/constraintlayout/widget/ConstraintLayout;", BaseSei.f13932Z, "Landroidx/constraintlayout/widget/ConstraintLayout;", "U4", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_call_end_root", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_call_end_root", "Lv/VText;", "A", "Lv/VText;", "get_call_end_title", "()Lv/VText;", "set_call_end_title", "(Lv/VText;)V", "_call_end_title", "B", "T4", "set_call_duration", "_call_duration", "Lv/VDraweeView;", b2s.C_ZONE, "Lv/VDraweeView;", "W4", "()Lv/VDraweeView;", "set_vb_peer_avatar", "(Lv/VDraweeView;)V", "_vb_peer_avatar", "D", "Y4", "set_vb_peer_name", "_vb_peer_name", "E", "X4", "set_vb_peer_info", "_vb_peer_info", "F", "S4", "set_call_back", "_call_back", "G", "V4", "set_continue_call", "_continue_call", "Ll/c4g0;", "H", "Ll/c4g0;", "lbStatusSub", "buzz_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
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
    public c4g0 lbStatusSub;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public ConstraintLayout _call_end_root;

    /* JADX INFO: renamed from: M4 */
    public static void m46896M4(BaseBuzzCallEndFrag baseBuzzCallEndFrag, LoveBuzzData loveBuzzData) {
        baseBuzzCallEndFrag.mo46911b5();
    }

    /* JADX INFO: renamed from: N4 */
    public static void m46897N4(BaseBuzzCallEndFrag baseBuzzCallEndFrag, View view) {
        baseBuzzCallEndFrag.act().m50458m2();
    }

    /* JADX INFO: renamed from: O4 */
    public static Boolean m46898O4(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: P4 */
    public static Boolean m46899P4(LoveBuzzData loveBuzzData) {
        loveBuzzData.getClass();
        return Boolean.valueOf(NullChecker.m81303a(loveBuzzData) && (loveBuzzData.remainingVoiceBuzz > 0 || loveBuzzData.remainingVideoBuzz > 0));
    }

    /* JADX INFO: renamed from: Q4 */
    public static void m46900Q4(BaseBuzzCallEndFrag baseBuzzCallEndFrag, View view) {
        baseBuzzCallEndFrag.mo46910a5();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0034  */
    /* JADX INFO: renamed from: Z4 */
    private final void m46901Z4() {
        c4g0 c4g0VarSubscribe;
        C22306c c22306cDuringCreated;
        Act act = act();
        if (act == null || (c22306cDuringCreated = act.duringCreated(j8w.INSTANCE.m140473a().m140416A0())) == null) {
            c4g0VarSubscribe = null;
        } else {
            final Function1 function1 = new Function1() { // from class: l.mf2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BaseBuzzCallEndFrag.m46899P4((LoveBuzzData) obj);
                }
            };
            C22306c c22306cDistinctUntilChanged = c22306cDuringCreated.distinctUntilChanged(new w9j() { // from class: l.nf2
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return BaseBuzzCallEndFrag.m46898O4(function1, obj);
                }
            });
            if (c22306cDistinctUntilChanged != null) {
                c4g0VarSubscribe = c22306cDistinctUntilChanged.subscribe(mkd0.m154955G(new e30() { // from class: l.of2
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        BaseBuzzCallEndFrag.m46896M4(this.f143618a, (LoveBuzzData) obj);
                    }
                }));
            } else {
                c4g0VarSubscribe = null;
            }
        }
        this.lbStatusSub = c4g0VarSubscribe;
    }

    @NotNull
    /* JADX INFO: renamed from: R4 */
    public final View m46902R4(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM168584b = pf2.m168584b(this, inflater, parent);
        viewM168584b.getClass();
        return viewM168584b;
    }

    @NotNull
    /* JADX INFO: renamed from: S4 */
    public final VText m46903S4() {
        VText vText = this._call_back;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_call_back");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: T4 */
    public final VText m46904T4() {
        VText vText = this._call_duration;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_call_duration");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: U4 */
    public final ConstraintLayout m46905U4() {
        ConstraintLayout constraintLayout = this._call_end_root;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.m87502r("_call_end_root");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: V4 */
    public final VText m46906V4() {
        VText vText = this._continue_call;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_continue_call");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: W4 */
    public final VDraweeView m46907W4() {
        VDraweeView vDraweeView = this._vb_peer_avatar;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_vb_peer_avatar");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: X4 */
    public final VText m46908X4() {
        VText vText = this._vb_peer_info;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_vb_peer_info");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Y4 */
    public final VText m46909Y4() {
        VText vText = this._vb_peer_name;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_vb_peer_name");
        return null;
    }

    /* JADX INFO: renamed from: a5 */
    public abstract void mo46910a5();

    /* JADX INFO: renamed from: b5 */
    public abstract boolean mo46911b5();

    @Override // com.p046p1.mobile.android.app.Frag
    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(@Nullable Bundle sis) {
        super.mo20586g4(sis);
        xdl0.m208329E0(m46903S4(), new View.OnClickListener() { // from class: l.kf2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseBuzzCallEndFrag.m46897N4(this.f122891a, view);
            }
        });
        xdl0.m208329E0(m46906V4(), new View.OnClickListener() { // from class: l.lf2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseBuzzCallEndFrag.m46900Q4(this.f127826a, view);
            }
        });
        hhx hhxVarM140417B0 = j8w.INSTANCE.m140473a().m140417B0();
        String callEndUserId = hhxVarM140417B0.getCallEndUserId();
        if (callEndUserId != null) {
            User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(callEndUserId);
            if (NullChecker.m81303a(userM169430Pa)) {
                u9w u9wVar = u9w.INSTANCE;
                VDraweeView vDraweeViewM46907W4 = m46907W4();
                userM169430Pa.getClass();
                Picture.ImageUri imageUriProfileSmall = u9wVar.m192677j(userM169430Pa).profileSmall();
                imageUriProfileSmall.getClass();
                u9wVar.m192674g(vDraweeViewM46907W4, imageUriProfileSmall, (hhxVarM140417B0.getMatched() == LoveBuzzConstants$MATCH.MATCHED || hhxVarM140417B0.getMatched() == LoveBuzzConstants$MATCH.PEER_LIKE_ME) ? 100 : 0, true);
                m46909Y4().setText(userM169430Pa.name);
                u9wVar.m192682o(userM169430Pa, m46908X4(), 18.0f, 18.0f);
            }
        }
        m46904T4().setText(getString(R$string.f20265y0) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + m6w.INSTANCE.m153298c(mqi0.m155944o() - hhxVarM140417B0.getStartTime()));
        m46901Z4();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        inflater.getClass();
        return m46902R4(inflater, container);
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onDestroyView() {
        mkd0.m154992z(this.lbStatusSub);
        super.onDestroyView();
    }
}
