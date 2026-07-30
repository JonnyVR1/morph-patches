package p006l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.k;
import com.p000p1.mobile.putong.core.p004ui.vip.likers.mytab.LikersMyTabFrag;
import com.p1.mobile.putong.core.newui.PlatformQualificationView;
import com.p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l.njr;
import l.q860;
import l.s7m;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VRecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0013\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0013\u0010\u000eJ\u000f\u0010\u0014\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00102\u0010\u0010\u0019\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0018\u00010\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u0011\u0010&\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b&\u0010'R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010\u0007R\"\u00102\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u00109\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0011\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010@\u001a\u00020:8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010G\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010H¨\u0006I"}, d2 = {"Ll/mjr;", "Ll/s7m;", "Ll/ljr;", "Ll/qtl;", "Lcom/p1/mobile/putong/core/ui/vip/likers/mytab/LikersMyTabFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/ui/vip/likers/mytab/LikersMyTabFrag;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "b", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", "", "c", "(Ll/ljr;)V", "inflateView", "destroy", "()V", "r", "Ll/q860;", "Lcom/p1/mobile/putong/data/User;", "users", "j", "(Ll/q860;)V", "", "isLoading", "isEmpty", "a", "(ZZ)V", "", "title", "setTitle", "(Ljava/lang/CharSequence;)V", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "Lcom/p1/mobile/putong/core/ui/vip/likers/mytab/LikersMyTabFrag;", "d", "()Lcom/p1/mobile/putong/core/ui/vip/likers/mytab/LikersMyTabFrag;", "setFrag", "Lv/VRecyclerView;", "Lv/VRecyclerView;", "i", "()Lv/VRecyclerView;", "set_list", "(Lv/VRecyclerView;)V", "_list", "Landroidx/core/widget/NestedScrollView;", "Landroidx/core/widget/NestedScrollView;", "e", "()Landroidx/core/widget/NestedScrollView;", "set_empty", "(Landroidx/core/widget/NestedScrollView;)V", "_empty", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "f", "()Landroid/widget/TextView;", "set_empty_text", "(Landroid/widget/TextView;)V", "_empty_text", "Lcom/p1/mobile/putong/core/newui/PlatformQualificationView;", "Lcom/p1/mobile/putong/core/newui/PlatformQualificationView;", "get_platform_qualification", "()Lcom/p1/mobile/putong/core/newui/PlatformQualificationView;", "set_platform_qualification", "(Lcom/p1/mobile/putong/core/newui/PlatformQualificationView;)V", "_platform_qualification", "Ll/ljr;", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class mjr implements s7m<ljr>, qtl {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public LikersMyTabFrag frag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VRecyclerView _list;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public NestedScrollView _empty;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public TextView _empty_text;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public PlatformQualificationView _platform_qualification;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public ljr presenter;

    /* JADX INFO: renamed from: l.mjr$a */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"l/mjr$a", "Landroidx/recyclerview/widget/GridLayoutManager$c;", "", "position", "f", "(I)I", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C1014a extends GridLayoutManager.c {
        public C1014a() {
        }

        /* JADX INFO: renamed from: f */
        public int m19274f(int position) {
            int itemViewType = mjr.this.getFrag().m10177N4().getItemViewType(position);
            return (itemViewType == 0 || itemViewType != 1) ? 1 : 2;
        }
    }

    /* JADX INFO: renamed from: l.mjr$b */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"l/mjr$b", "Ll/yir$a;", "", "getType", "()I", "Lcom/p1/mobile/putong/data/User;", "getUser", "()Lcom/p1/mobile/putong/data/User;", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C1015b implements yir.InterfaceC1486a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ User f17007a;

        public C1015b(User user) {
            this.f17007a = user;
        }

        @Override // p006l.yir.InterfaceC1486a
        public int getType() {
            return 0;
        }

        @Override // p006l.yir.InterfaceC1486a
        /* JADX INFO: renamed from: getUser, reason: from getter */
        public User getF17007a() {
            return this.f17007a;
        }
    }

    /* JADX INFO: renamed from: l.mjr$c */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"l/mjr$c", "Ll/yir$a;", "", "getType", "()I", "Lcom/p1/mobile/putong/data/User;", "getUser", "()Lcom/p1/mobile/putong/data/User;", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C1016c implements yir.InterfaceC1486a {
        @Override // p006l.yir.InterfaceC1486a
        public int getType() {
            return 1;
        }

        @Override // p006l.yir.InterfaceC1486a
        /* JADX INFO: renamed from: getUser */
        public User getF17007a() {
            return null;
        }
    }

    public mjr(@NotNull LikersMyTabFrag likersMyTabFrag) {
        likersMyTabFrag.getClass();
        this.frag = likersMyTabFrag;
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m19263C0() {
        return this.frag.getContext();
    }

    @Override // p006l.qtl
    /* JADX INFO: renamed from: a */
    public void mo19264a(boolean isLoading, boolean isEmpty) {
        xdl0.M(m19268e(), isEmpty);
        xdl0.M(m19270i(), !isEmpty);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final View m19265b(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewB = njr.b(this, inflater, parent);
        viewB.getClass();
        return viewB;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void m19271i1(@NotNull ljr presenter) {
        presenter.getClass();
        this.presenter = presenter;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final LikersMyTabFrag getFrag() {
        return this.frag;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final NestedScrollView m19268e() {
        NestedScrollView nestedScrollView = this._empty;
        if (nestedScrollView != null) {
            return nestedScrollView;
        }
        Intrinsics.r("_empty");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final TextView m19269f() {
        TextView textView = this._empty_text;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_empty_text");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final VRecyclerView m19270i() {
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
        return m19265b(inflater, parent);
    }

    /* JADX INFO: renamed from: j */
    public final void m19272j(@Nullable q860<User> users) {
        if (users == null || users.a.isEmpty()) {
            mo19264a(false, true);
            return;
        }
        mo19264a(false, false);
        ArrayList arrayList = new ArrayList();
        List list = users.a;
        list.getClass();
        List list2 = list;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList2.add(new C1015b((User) it.next()));
        }
        arrayList.addAll(arrayList2);
        arrayList.add(new C1016c());
        yir yirVarM10177N4 = this.frag.m10177N4();
        if (yirVarM10177N4 != null) {
            yirVarM10177N4.m28268M(arrayList);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m19273r() {
        mo19264a(false, true);
        m19269f().setText("去滑卡获取喜欢和配对");
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.frag.getContext(), 2);
        gridLayoutManager.v(new C1014a());
        m19270i().setLayoutManager(gridLayoutManager);
        m19270i().setAdapter(this.frag.m10177N4());
        new k(this.frag.m10178O4()).g(m19270i());
    }

    @Override // p006l.qtl
    public void setTitle(@NotNull CharSequence title) {
        title.getClass();
    }

    public void destroy() {
    }
}
