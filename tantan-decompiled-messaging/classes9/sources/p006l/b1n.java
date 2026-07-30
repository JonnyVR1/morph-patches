package p006l;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.core.R$string;
import com.p000p1.mobile.putong.core.p004ui.settings.intlGender.IntlAddGenderDetailsAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.IntlGenderItem;
import com.p1.mobile.putong.data.SubGender;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l.c1n;
import l.e51;
import l.s7m;
import l.t100;
import l.vwb;
import l.w9j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VLinear;
import v.VPullUpRecyclerView;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\r\u001a\u00020\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0019\u0010\u0015J\u000f\u0010\u001a\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u0004\u001a\u00020\u001fH\u0016¢\u0006\u0004\b\u0004\u0010 J\r\u0010!\u001a\u00020\f¢\u0006\u0004\b!\u0010\u001bJ'\u0010\"\u001a\u00020\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\"\u0010\u000eR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010\u0006R\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00107\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010>\u001a\u0002088\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0014\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0016\u0010\u0016\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010D\u001a\u00020A8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010G\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010K\u001a\u00020H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010J¨\u0006L"}, d2 = {"Ll/b1n;", "Ll/s7m;", "Ll/x0n;", "Lcom/p1/mobile/putong/core/ui/settings/intlGender/IntlAddGenderDetailsAct;", "act", "<init>", "(Lcom/p1/mobile/putong/core/ui/settings/intlGender/IntlAddGenderDetailsAct;)V", "", "Lcom/p1/mobile/putong/data/IntlGenderItem;", "data", "Lcom/p1/mobile/putong/data/SubGender;", "option", "", "m", "(Ljava/util/List;Lcom/p1/mobile/putong/data/SubGender;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "d", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", "i", "(Ll/x0n;)V", "inflateView", "destroy", "()V", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "Lcom/p1/mobile/android/app/Act;", "()Lcom/p1/mobile/android/app/Act;", "r", "l", "a", "Lcom/p1/mobile/putong/core/ui/settings/intlGender/IntlAddGenderDetailsAct;", "getAct", "()Lcom/p1/mobile/putong/core/ui/settings/intlGender/IntlAddGenderDetailsAct;", "setAct", "Lv/VLinear;", "b", "Lv/VLinear;", "get_root", "()Lv/VLinear;", "set_root", "(Lv/VLinear;)V", "_root", "Lv/navigationbar/VNavigationBar;", "c", "Lv/navigationbar/VNavigationBar;", "k", "()Lv/navigationbar/VNavigationBar;", "set_navigation_bar", "(Lv/navigationbar/VNavigationBar;)V", "_navigation_bar", "Lv/VPullUpRecyclerView;", "Lv/VPullUpRecyclerView;", "j", "()Lv/VPullUpRecyclerView;", "set_list", "(Lv/VPullUpRecyclerView;)V", "_list", "e", "Ll/x0n;", "Ll/yko;", "f", "Ll/yko;", "_adapter", "g", "Lcom/p1/mobile/putong/data/SubGender;", "_currentSubGender", "", "h", "Z", "_isChanged", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class b1n implements s7m<x0n> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public IntlAddGenderDetailsAct act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VLinear _root;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VNavigationBar _navigation_bar;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VPullUpRecyclerView _list;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public x0n presenter;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public yko _adapter;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public SubGender _currentSubGender;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public boolean _isChanged;

    /* JADX INFO: renamed from: l.b1n$a */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ll/b1n$a;", "Landroidx/recyclerview/widget/RecyclerView$n;", "<init>", "()V", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$z;)V", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0541a extends RecyclerView.n {
        public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.z state) {
            outRect.getClass();
            view.getClass();
            parent.getClass();
            state.getClass();
            outRect.set(0, 0, 0, t100.j);
        }
    }

    /* JADX INFO: renamed from: l.b1n$b */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"l/b1n$b", "Ll/yko$a;", "Lcom/p1/mobile/putong/data/SubGender;", "optionId", "", "a", "(Lcom/p1/mobile/putong/data/SubGender;)V", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0542b implements yko.InterfaceC1488a {
        public C0542b() {
        }

        @Override // p006l.yko.InterfaceC1488a
        /* JADX INFO: renamed from: a */
        public void mo12444a(SubGender optionId) {
            b1n b1nVar = b1n.this;
            if (optionId != null) {
                b1nVar._currentSubGender = optionId;
                b1n.this._isChanged = true;
            } else {
                b1nVar._currentSubGender = null;
                b1n.this._isChanged = false;
            }
        }
    }

    public b1n(@NotNull IntlAddGenderDetailsAct intlAddGenderDetailsAct) {
        intlAddGenderDetailsAct.getClass();
        this.act = intlAddGenderDetailsAct;
    }

    /* JADX INFO: renamed from: a */
    public static Boolean m12430a(SubGender subGender, IntlGenderItem intlGenderItem) {
        return Boolean.valueOf(Intrinsics.d(intlGenderItem.id, subGender));
    }

    /* JADX INFO: renamed from: b */
    public static void m12431b(b1n b1nVar, View view) {
        x0n x0nVar = b1nVar.presenter;
        if (x0nVar == null) {
            Intrinsics.r("presenter");
            x0nVar = null;
        }
        x0nVar.m27142i0(b1nVar._currentSubGender);
        b1nVar.act.finish();
    }

    /* JADX INFO: renamed from: c */
    public static void m12432c(b1n b1nVar, int i) {
        b1nVar.m12440j().smoothScrollToPosition(i + 1);
    }

    /* JADX INFO: renamed from: m */
    private final void m12435m(List<? extends IntlGenderItem> data, SubGender option) {
        m12442l(data, option);
    }

    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context m12436C0() {
        return this.act;
    }

    @NotNull
    public Act act() {
        return this.act;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final View m12437d(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewB = c1n.b(this, inflater, parent);
        viewB.getClass();
        return viewB;
    }

    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void m12439i1(@NotNull x0n presenter) {
        presenter.getClass();
        this.presenter = presenter;
    }

    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m12437d(inflater, parent);
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final VPullUpRecyclerView m12440j() {
        VPullUpRecyclerView vPullUpRecyclerView = this._list;
        if (vPullUpRecyclerView != null) {
            return vPullUpRecyclerView;
        }
        Intrinsics.r("_list");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final VNavigationBar m12441k() {
        VNavigationBar vNavigationBar = this._navigation_bar;
        if (vNavigationBar != null) {
            return vNavigationBar;
        }
        Intrinsics.r("_navigation_bar");
        return null;
    }

    /* JADX INFO: renamed from: l */
    public final void m12442l(List<? extends IntlGenderItem> data, final SubGender option) {
        this._currentSubGender = option;
        this._adapter = new yko(this.act);
        VPullUpRecyclerView vPullUpRecyclerViewM12440j = m12440j();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.act);
        linearLayoutManager.setOrientation(1);
        vPullUpRecyclerViewM12440j.setLayoutManager(linearLayoutManager);
        RecyclerView.Adapter adapter = this._adapter;
        yko ykoVar = null;
        if (adapter == null) {
            Intrinsics.r("_adapter");
            adapter = null;
        }
        vPullUpRecyclerViewM12440j.setAdapter(adapter);
        vPullUpRecyclerViewM12440j.addItemDecoration(new C0541a());
        yko ykoVar2 = this._adapter;
        if (ykoVar2 == null) {
            Intrinsics.r("_adapter");
            ykoVar2 = null;
        }
        ykoVar2.m28283L(data, option);
        yko ykoVar3 = this._adapter;
        if (ykoVar3 == null) {
            Intrinsics.r("_adapter");
        } else {
            ykoVar = ykoVar3;
        }
        ykoVar.m28284M(new C0542b());
        final int iG = vwb.G(data, new w9j() { // from class: l.z0n
            public final Object call(Object obj) {
                return b1n.m12430a(option, (IntlGenderItem) obj);
            }
        });
        if (iG > 0) {
            e51.G(new Runnable() { // from class: l.a1n
                @Override // java.lang.Runnable
                public final void run() {
                    b1n.m12432c(this.f8054a, iG);
                }
            });
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m12443r() {
        m12441k().setTitle(R$string.f1661Df);
        m12441k().setLeftIconOnClick(new View.OnClickListener() { // from class: l.y0n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b1n.m12431b(this.f27850a, view);
            }
        });
        x0n x0nVar = this.presenter;
        x0n x0nVar2 = null;
        if (x0nVar == null) {
            Intrinsics.r("presenter");
            x0nVar = null;
        }
        List<IntlGenderItem> listM27140g0 = x0nVar.m27140g0();
        x0n x0nVar3 = this.presenter;
        if (x0nVar3 == null) {
            Intrinsics.r("presenter");
        } else {
            x0nVar2 = x0nVar3;
        }
        m12435m(listM27140g0, x0nVar2.m27141h0());
    }

    public void destroy() {
    }
}
