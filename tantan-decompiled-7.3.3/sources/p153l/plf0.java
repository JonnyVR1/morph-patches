package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VRecyclerView;
import p151v.VText_NoTopPadding;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010+\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\f\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010,¨\u0006-"}, m88121d2 = {"Ll/plf0;", "Ll/iam;", "Ll/mlf0;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "c", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "inflateView", "presenter", "", Constants.INAPP_DATA_TAG, "(Ll/mlf0;)V", "r", "()V", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "a", "Lcom/p1/mobile/android/app/Act;", "e", "()Lcom/p1/mobile/android/app/Act;", "Lv/VRecyclerView;", "b", "Lv/VRecyclerView;", RXScreenCaptureService.KEY_INDEX, "()Lv/VRecyclerView;", "set_list", "(Lv/VRecyclerView;)V", "_list", "Lv/VText_NoTopPadding;", "Lv/VText_NoTopPadding;", "f", "()Lv/VText_NoTopPadding;", "set_btn", "(Lv/VText_NoTopPadding;)V", "_btn", "Ll/mlf0;", "b_account_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class plf0 implements iam<mlf0> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VRecyclerView _list;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VText_NoTopPadding _btn;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public mlf0 presenter;

    public plf0(@NotNull Act act) {
        act.getClass();
        this.act = act;
    }

    /* JADX INFO: renamed from: a */
    public static void m172824a(khn khnVar, plf0 plf0Var, View view) {
        String strM149802N = khnVar.m149802N();
        if (TextUtils.isEmpty(strM149802N)) {
            return;
        }
        i4g0.m138523u("e_intl_signup_relation_goals_button", "p_intl_signup_relation_goals", jyb.m147494Y("goal_result", strM149802N));
        mlf0 mlf0Var = plf0Var.presenter;
        if (mlf0Var != null) {
            ArrayList arrayListM147507f0 = jyb.m147507f0(strM149802N);
            arrayListM147507f0.getClass();
            mlf0Var.m158874l0(arrayListM147507f0);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m172825b(plf0 plf0Var, boolean z) {
        plf0Var.m172829f().setBackgroundResource(z ? cbc0.f80804x : cbc0.f80806y);
    }

    @Override // p153l.iam
    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.act;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final View m172826c(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM176998b = qlf0.m176998b(this, inflater, parent);
        viewM176998b.getClass();
        return viewM176998b;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(@Nullable mlf0 presenter) {
        this.presenter = presenter;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final Act getAct() {
        return this.act;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final VText_NoTopPadding m172829f() {
        VText_NoTopPadding vText_NoTopPadding = this._btn;
        if (vText_NoTopPadding != null) {
            return vText_NoTopPadding;
        }
        Intrinsics.m88391r("_btn");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final VRecyclerView m172830i() {
        VRecyclerView vRecyclerView = this._list;
        if (vRecyclerView != null) {
            return vRecyclerView;
        }
        Intrinsics.m88391r("_list");
        return null;
    }

    @Override // p153l.iam
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m172826c(inflater, parent);
    }

    /* JADX INFO: renamed from: r */
    public final void m172831r() {
        List<lhn.C18395a> listM154232c = lhn.INSTANCE.m154232c();
        Iterator<lhn.C18395a> it = listM154232c.iterator();
        while (it.hasNext()) {
            it.next().m154241g(false);
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(1);
        m172830i().setLayoutManager(linearLayoutManager);
        final khn khnVar = new khn(this.act, listM154232c);
        khnVar.m149805Q(new khn.InterfaceC18165a() { // from class: l.nlf0
            @Override // p153l.khn.InterfaceC18165a
            /* JADX INFO: renamed from: a */
            public final void mo97883a(boolean z) {
                plf0.m172825b(this.f142540a, z);
            }
        });
        m172830i().setAdapter(khnVar);
        bnl0.m105509E0(m172829f(), new View.OnClickListener() { // from class: l.olf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                plf0.m172824a(khnVar, this, view);
            }
        });
        m172829f().setBackgroundResource(!TextUtils.isEmpty(khnVar.m149802N()) ? cbc0.f80804x : cbc0.f80806y);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
