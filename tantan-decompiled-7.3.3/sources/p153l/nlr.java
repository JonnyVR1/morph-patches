package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.C0607k;
import androidx.recyclerview.widget.GridLayoutManager;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.newui.PlatformQualificationView;
import com.p051p1.mobile.putong.core.p058ui.vip.likers.mytab.LikersMyTabFrag;
import com.p051p1.mobile.putong.data.User;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VRecyclerView;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0013\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0013\u0010\u000eJ\u000f\u0010\u0014\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00102\u0010\u0010\u0019\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0018\u00010\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u0011\u0010&\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b&\u0010'R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010\u0007R\"\u00102\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u00109\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0011\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010@\u001a\u00020:8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010G\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010H¨\u0006I"}, m88121d2 = {"Ll/nlr;", "Ll/iam;", "Ll/mlr;", "Ll/ewl;", "Lcom/p1/mobile/putong/core/ui/vip/likers/mytab/LikersMyTabFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/ui/vip/likers/mytab/LikersMyTabFrag;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "b", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", "", "c", "(Ll/mlr;)V", "inflateView", "destroy", "()V", "r", "Ll/vg60;", "Lcom/p1/mobile/putong/data/User;", "users", "j", "(Ll/vg60;)V", "", "isLoading", "isEmpty", "a", "(ZZ)V", "", "title", "setTitle", "(Ljava/lang/CharSequence;)V", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "Lcom/p1/mobile/putong/core/ui/vip/likers/mytab/LikersMyTabFrag;", Constants.INAPP_DATA_TAG, "()Lcom/p1/mobile/putong/core/ui/vip/likers/mytab/LikersMyTabFrag;", "setFrag", "Lv/VRecyclerView;", "Lv/VRecyclerView;", RXScreenCaptureService.KEY_INDEX, "()Lv/VRecyclerView;", "set_list", "(Lv/VRecyclerView;)V", "_list", "Landroidx/core/widget/NestedScrollView;", "Landroidx/core/widget/NestedScrollView;", "e", "()Landroidx/core/widget/NestedScrollView;", "set_empty", "(Landroidx/core/widget/NestedScrollView;)V", "_empty", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "f", "()Landroid/widget/TextView;", "set_empty_text", "(Landroid/widget/TextView;)V", "_empty_text", "Lcom/p1/mobile/putong/core/newui/PlatformQualificationView;", "Lcom/p1/mobile/putong/core/newui/PlatformQualificationView;", "get_platform_qualification", "()Lcom/p1/mobile/putong/core/newui/PlatformQualificationView;", "set_platform_qualification", "(Lcom/p1/mobile/putong/core/newui/PlatformQualificationView;)V", "_platform_qualification", "Ll/mlr;", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class nlr implements iam<mlr>, ewl {

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
    public mlr presenter;

    /* JADX INFO: renamed from: l.nlr$a */
    @Metadata(m88120d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m88121d2 = {"l/nlr$a", "Landroidx/recyclerview/widget/GridLayoutManager$c;", "", "position", "f", "(I)I", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C18899a extends GridLayoutManager.AbstractC0554c {
        public C18899a() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0554c
        /* JADX INFO: renamed from: f */
        public int mo3330f(int position) {
            int itemViewType = nlr.this.getFrag().m57901N4().getItemViewType(position);
            return (itemViewType == 0 || itemViewType != 1) ? 1 : 2;
        }
    }

    /* JADX INFO: renamed from: l.nlr$b */
    @Metadata(m88120d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m88121d2 = {"l/nlr$b", "Ll/zkr$a;", "", "getType", "()I", "Lcom/p1/mobile/putong/data/User;", "getUser", "()Lcom/p1/mobile/putong/data/User;", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C18900b implements zkr.InterfaceC21831a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ User f142587a;

        public C18900b(User user) {
            this.f142587a = user;
        }

        @Override // p153l.zkr.InterfaceC21831a
        public int getType() {
            return 0;
        }

        @Override // p153l.zkr.InterfaceC21831a
        /* JADX INFO: renamed from: getUser, reason: from getter */
        public User getF142587a() {
            return this.f142587a;
        }
    }

    /* JADX INFO: renamed from: l.nlr$c */
    @Metadata(m88120d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m88121d2 = {"l/nlr$c", "Ll/zkr$a;", "", "getType", "()I", "Lcom/p1/mobile/putong/data/User;", "getUser", "()Lcom/p1/mobile/putong/data/User;", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C18901c implements zkr.InterfaceC21831a {
        @Override // p153l.zkr.InterfaceC21831a
        public int getType() {
            return 1;
        }

        @Override // p153l.zkr.InterfaceC21831a
        /* JADX INFO: renamed from: getUser */
        public User getF142587a() {
            return null;
        }
    }

    public nlr(@NotNull LikersMyTabFrag likersMyTabFrag) {
        likersMyTabFrag.getClass();
        this.frag = likersMyTabFrag;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.frag.getContext();
    }

    @Override // p153l.ewl
    /* JADX INFO: renamed from: a */
    public void mo122954a(boolean isLoading, boolean isEmpty) {
        bnl0.m105524M(m163769e(), isEmpty);
        bnl0.m105524M(m163771i(), !isEmpty);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final View m163766b(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM168162b = olr.m168162b(this, inflater, parent);
        viewM168162b.getClass();
        return viewM168162b;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(@NotNull mlr presenter) {
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
    public final NestedScrollView m163769e() {
        NestedScrollView nestedScrollView = this._empty;
        if (nestedScrollView != null) {
            return nestedScrollView;
        }
        Intrinsics.m88391r("_empty");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final TextView m163770f() {
        TextView textView = this._empty_text;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_empty_text");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final VRecyclerView m163771i() {
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
        return m163766b(inflater, parent);
    }

    /* JADX INFO: renamed from: j */
    public final void m163772j(@Nullable vg60<User> users) {
        if (users == null || users.f184001a.isEmpty()) {
            mo122954a(false, true);
            return;
        }
        mo122954a(false, false);
        ArrayList arrayList = new ArrayList();
        List<User> list = users.f184001a;
        list.getClass();
        List<User> list2 = list;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList2.add(new C18900b((User) it.next()));
        }
        arrayList.addAll(arrayList2);
        arrayList.add(new C18901c());
        zkr zkrVarM57901N4 = this.frag.m57901N4();
        if (zkrVarM57901N4 != null) {
            zkrVarM57901N4.m220140M(arrayList);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m163773r() {
        mo122954a(false, true);
        m163770f().setText("去滑卡获取喜欢和配对");
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.frag.getContext(), 2);
        gridLayoutManager.m3327v(new C18899a());
        m163771i().setLayoutManager(gridLayoutManager);
        m163771i().setAdapter(this.frag.m57901N4());
        new C0607k(this.frag.m57902O4()).m3751g(m163771i());
    }

    @Override // p153l.ewl
    public void setTitle(@NotNull CharSequence title) {
        title.getClass();
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
