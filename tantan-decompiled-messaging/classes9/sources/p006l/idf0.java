package p006l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p1.mobile.android.app.Act;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l.j760;
import l.kfn;
import l.lfn;
import l.s7m;
import l.vwb;
import l.xdl0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VRecyclerView;
import v.VText_NoTopPadding;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010+\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\f\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010,¨\u0006-"}, d2 = {"Ll/idf0;", "Ll/s7m;", "Ll/fdf0;", "Lcom/p1/mobile/android/app/Act;", "act", "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "c", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "inflateView", "presenter", "", "d", "(Ll/fdf0;)V", "r", "()V", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "a", "Lcom/p1/mobile/android/app/Act;", "e", "()Lcom/p1/mobile/android/app/Act;", "Lv/VRecyclerView;", "b", "Lv/VRecyclerView;", "i", "()Lv/VRecyclerView;", "set_list", "(Lv/VRecyclerView;)V", "_list", "Lv/VText_NoTopPadding;", "Lv/VText_NoTopPadding;", "f", "()Lv/VText_NoTopPadding;", "set_btn", "(Lv/VText_NoTopPadding;)V", "_btn", "Ll/fdf0;", "b_account_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class idf0 implements s7m<fdf0> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VRecyclerView _list;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VText_NoTopPadding _btn;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public fdf0 presenter;

    public idf0(@NotNull Act act) {
        act.getClass();
        this.act = act;
    }

    /* JADX INFO: renamed from: a */
    public static void m16620a(kfn kfnVar, idf0 idf0Var, View view) {
        String strN = kfnVar.N();
        if (TextUtils.isEmpty(strN)) {
            return;
        }
        zvf0.u("e_intl_signup_relation_goals_button", "p_intl_signup_relation_goals", new j760[]{vwb.Y("goal_result", strN)});
        fdf0 fdf0Var = idf0Var.presenter;
        if (fdf0Var != null) {
            ArrayList arrayListF0 = vwb.f0(new String[]{strN});
            arrayListF0.getClass();
            fdf0Var.m15317l0(arrayListF0);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m16621b(idf0 idf0Var, boolean z) {
        idf0Var.m16626f().setBackgroundResource(z ? w2c0.f24872x : w2c0.f24874y);
    }

    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context m16622C0() {
        return this.act;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final View m16623c(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM17433b = jdf0.m17433b(this, inflater, parent);
        viewM17433b.getClass();
        return viewM17433b;
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void m16628i1(@Nullable fdf0 presenter) {
        this.presenter = presenter;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final Act getAct() {
        return this.act;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final VText_NoTopPadding m16626f() {
        VText_NoTopPadding vText_NoTopPadding = this._btn;
        if (vText_NoTopPadding != null) {
            return vText_NoTopPadding;
        }
        Intrinsics.r("_btn");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final VRecyclerView m16627i() {
        VRecyclerView vRecyclerView = this._list;
        if (vRecyclerView != null) {
            return vRecyclerView;
        }
        Intrinsics.r("_list");
        return null;
    }

    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m16623c(inflater, parent);
    }

    /* JADX INFO: renamed from: r */
    public final void m16629r() {
        List listC = lfn.INSTANCE.c();
        Iterator it = listC.iterator();
        while (it.hasNext()) {
            ((lfn.a) it.next()).g(false);
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(m16622C0());
        linearLayoutManager.setOrientation(1);
        m16627i().setLayoutManager(linearLayoutManager);
        final kfn kfnVar = new kfn(this.act, listC);
        kfnVar.Q(new kfn.a() { // from class: l.gdf0
            /* JADX INFO: renamed from: a */
            public final void m15713a(boolean z) {
                idf0.m16621b(this.f13224a, z);
            }
        });
        m16627i().setAdapter(kfnVar);
        xdl0.E0(m16626f(), new View.OnClickListener() { // from class: l.hdf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                idf0.m16620a(kfnVar, this, view);
            }
        });
        m16626f().setBackgroundResource(!TextUtils.isEmpty(kfnVar.N()) ? w2c0.f24872x : w2c0.f24874y);
    }

    public void destroy() {
    }
}
