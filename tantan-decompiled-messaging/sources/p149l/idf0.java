package p149l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VRecyclerView;
import p147v.VText_NoTopPadding;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010+\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\f\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010,¨\u0006-"}, m87232d2 = {"Ll/idf0;", "Ll/s7m;", "Ll/fdf0;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "c", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "inflateView", "presenter", "", Constants.INAPP_DATA_TAG, "(Ll/fdf0;)V", "r", "()V", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "a", "Lcom/p1/mobile/android/app/Act;", "e", "()Lcom/p1/mobile/android/app/Act;", "Lv/VRecyclerView;", "b", "Lv/VRecyclerView;", RXScreenCaptureService.KEY_INDEX, "()Lv/VRecyclerView;", "set_list", "(Lv/VRecyclerView;)V", "_list", "Lv/VText_NoTopPadding;", "Lv/VText_NoTopPadding;", "f", "()Lv/VText_NoTopPadding;", "set_btn", "(Lv/VText_NoTopPadding;)V", "_btn", "Ll/fdf0;", "b_account_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
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
    public static void m135437a(kfn kfnVar, idf0 idf0Var, View view) {
        String strM145869N = kfnVar.m145869N();
        if (TextUtils.isEmpty(strM145869N)) {
            return;
        }
        zvf0.m220399u("e_intl_signup_relation_goals_button", "p_intl_signup_relation_goals", vwb.m200311Y("goal_result", strM145869N));
        fdf0 fdf0Var = idf0Var.presenter;
        if (fdf0Var != null) {
            ArrayList arrayListM200324f0 = vwb.m200324f0(strM145869N);
            arrayListM200324f0.getClass();
            fdf0Var.m120973l0(arrayListM200324f0);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m135438b(idf0 idf0Var, boolean z) {
        idf0Var.m135442f().setBackgroundResource(z ? w2c0.f184208x : w2c0.f184210y);
    }

    @Override // p149l.s7m
    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.act;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final View m135439c(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM141027b = jdf0.m141027b(this, inflater, parent);
        viewM141027b.getClass();
        return viewM141027b;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(@Nullable fdf0 presenter) {
        this.presenter = presenter;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final Act getAct() {
        return this.act;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final VText_NoTopPadding m135442f() {
        VText_NoTopPadding vText_NoTopPadding = this._btn;
        if (vText_NoTopPadding != null) {
            return vText_NoTopPadding;
        }
        Intrinsics.m87502r("_btn");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final VRecyclerView m135443i() {
        VRecyclerView vRecyclerView = this._list;
        if (vRecyclerView != null) {
            return vRecyclerView;
        }
        Intrinsics.m87502r("_list");
        return null;
    }

    @Override // p149l.s7m
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m135439c(inflater, parent);
    }

    /* JADX INFO: renamed from: r */
    public final void m135444r() {
        List<lfn.C18216a> listM149728c = lfn.INSTANCE.m149728c();
        Iterator<lfn.C18216a> it = listM149728c.iterator();
        while (it.hasNext()) {
            it.next().m149737g(false);
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(1);
        m135443i().setLayoutManager(linearLayoutManager);
        final kfn kfnVar = new kfn(this.act, listM149728c);
        kfnVar.m145872Q(new kfn.InterfaceC18004a() { // from class: l.gdf0
            @Override // p149l.kfn.InterfaceC18004a
            /* JADX INFO: renamed from: a */
            public final void mo96266a(boolean z) {
                idf0.m135438b(this.f102110a, z);
            }
        });
        m135443i().setAdapter(kfnVar);
        xdl0.m208329E0(m135442f(), new View.OnClickListener() { // from class: l.hdf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                idf0.m135437a(kfnVar, this, view);
            }
        });
        m135442f().setBackgroundResource(!TextUtils.isEmpty(kfnVar.m145869N()) ? w2c0.f184208x : w2c0.f184210y);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
