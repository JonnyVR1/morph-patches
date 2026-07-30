package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.external.R$string;
import com.p046p1.mobile.putong.live.external.internal.live.square.fragments.videochat.LiveVideoChatFrag;
import com.p046p1.mobile.putong.live.external.internal.virtualVoice.square.fragmentnew2.LiveEmptyErrorView;
import com.p046p1.mobile.putong.live.external.page.teenmode.LiveTeenDialogAct;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p147v.VImage;
import p147v.VLinear;
import p147v.VPullDownRefreshLayout;
import p147v.VRecyclerView;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes13.dex */
public class xuu implements s7m<quu> {
    public LiveEmptyErrorView _empty_error_layout;
    public VImage _empty_error_layout_image;
    public VText _empty_error_layout_tv_tip;
    public VNavigationBar _page_title_bar;
    public VLinear _random_entry;
    public VRecyclerView _recycler_view;
    public TextView _start_video_chat;
    public VPullDownRefreshLayout _swipe_refresh;
    private qyt adapter;
    private g0u footerModel;
    private final LiveVideoChatFrag frag;
    private GridLayoutManager gridLayoutManager;
    private quu presenter;
    private View rootView;

    /* JADX INFO: renamed from: l.xuu$a */
    public class C21224a extends GridLayoutManager.AbstractC0553c {
        final /* synthetic */ qyt val$adapter;

        public C21224a(qyt qytVar) {
            this.val$adapter = qytVar;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0553c
        /* JADX INFO: renamed from: f */
        public int mo3329f(int i) {
            return this.val$adapter.m67356K(i);
        }
    }

    /* JADX INFO: renamed from: l.xuu$b */
    public class C21225b extends RecyclerView.AbstractC0582t {
        public C21225b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0 && xuu.this.presenter != null) {
                xuu.this.presenter.m176646H2();
            }
        }
    }

    public xuu(LiveVideoChatFrag liveVideoChatFrag) {
        this.frag = liveVideoChatFrag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m211202p(hnc0 hnc0Var) {
        this.presenter.m176644D2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m211203q(View view) {
        quu quuVar = this.presenter;
        if (quuVar != null) {
            quuVar.m176647I2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m211204s(View view) {
        quu quuVar = this.presenter;
        if (quuVar != null) {
            quuVar.m176645F2();
        }
    }

    /* JADX INFO: renamed from: A */
    public void m211205A() {
        qyt qytVar = this.adapter;
        if (qytVar == null || qytVar.getItemCount() <= 0) {
            return;
        }
        this._recycler_view.scrollToPosition(0);
    }

    /* JADX INFO: renamed from: B */
    public void m211206B(boolean z) {
        VNavigationBar vNavigationBar = this._page_title_bar;
        if (!z) {
            xdl0.m208344M(vNavigationBar, false);
            return;
        }
        xdl0.m208344M(vNavigationBar, z);
        this._page_title_bar.setTitle("视频闪聊");
        this._page_title_bar.setLeftIconOnClick(new View.OnClickListener() { // from class: l.ruu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f161141a.m211214u(view);
            }
        });
        this._page_title_bar.setLeftIconResource(h3c0.f105663e);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: i */
    public View m211207i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return yuu.m216163b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM211207i = m211207i(layoutInflater, viewGroup);
        this.rootView = viewM211207i;
        return viewM211207i;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(quu quuVar) {
        this.presenter = quuVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: k */
    public qyt m211209k() {
        final qyt qytVarM177065J0 = qyt.m177065J0();
        GridLayoutManager gridLayoutManager = new GridLayoutManager((Context) getAct(), 6, 1, false);
        this.gridLayoutManager = gridLayoutManager;
        gridLayoutManager.m3326v(new C21224a(qytVarM177065J0));
        this._recycler_view.setLayoutManager(this.gridLayoutManager);
        this._recycler_view.setAdapter(qytVarM177065J0);
        this._recycler_view.setItemAnimator(null);
        this._recycler_view.addOnScrollListener(new C21225b());
        final LiveVideoChatFrag liveVideoChatFrag = this.frag;
        Objects.requireNonNull(liveVideoChatFrag);
        qytVarM177065J0.m191781o0(liveVideoChatFrag, new v9j() { // from class: l.vuu
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(liveVideoChatFrag.m70821Q4());
            }
        }, LiveTeenDialogAct.f46216g);
        qytVarM177065J0.m67369X(false);
        qytVarM177065J0.m67375c0(new e30() { // from class: l.wuu
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f188166a.m211212n(qytVarM177065J0, (Integer) obj);
            }
        });
        return qytVarM177065J0;
    }

    /* JADX INFO: renamed from: l */
    public void m211210l() {
        this._swipe_refresh.m223775t();
    }

    /* JADX INFO: renamed from: m */
    public final void m211211m(List<? extends d1q<?>> list, boolean z, boolean z2) {
        this.adapter.m67368W(this.footerModel);
        g0u g0uVar = new g0u(6, z, (z2 || list.size() == 0) ? false : true);
        this.footerModel = g0uVar;
        g0uVar.m124005I(this.frag.getResources().getColor(g1c0.f100171z));
        this.footerModel.m124006J(w8u.m202217t(R$string.f44921q));
        this.adapter.m67351E(this.footerModel);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m211212n(qyt qytVar, Integer num) {
        if (num.intValue() >= qytVar.getItemCount() - 2) {
            this.presenter.m176642B2();
        }
    }

    /* JADX INFO: renamed from: r */
    public void m211213r() {
        this._empty_error_layout.m69876c();
        this._swipe_refresh.mo223159O(new df50() { // from class: l.suu
            @Override // p149l.df50
            /* JADX INFO: renamed from: w2 */
            public final void mo57954w2(hnc0 hnc0Var) {
                this.f166501a.m211202p(hnc0Var);
            }
        });
        this._empty_error_layout.setEmptyText(w8u.m202217t(R$string.f44864C0));
        xdl0.m208329E0(this._start_video_chat, new View.OnClickListener() { // from class: l.tuu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f172220a.m211203q(view);
            }
        });
        xdl0.m208329E0(this._random_entry, new View.OnClickListener() { // from class: l.uuu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f178421a.m211204s(view);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m211214u(View view) {
        this.frag.act().m47815F2();
    }

    /* JADX INFO: renamed from: v */
    public boolean m211215v() {
        qyt qytVar = this.adapter;
        return qytVar == null || qytVar.m67355J().size() == 0;
    }

    /* JADX INFO: renamed from: x */
    public void m211217x(List<tvr<?>> list, boolean z, boolean z2) {
        if (this.adapter == null) {
            this.adapter = m211209k();
        }
        this.adapter.m67371Z(list);
        this._empty_error_layout.m69874a(list.size());
        m211211m(list, z, z2);
        this.adapter.m191777k0();
    }

    /* JADX INFO: renamed from: y */
    public void m211218y() {
        qyt qytVar = this.adapter;
        if (qytVar != null) {
            qytVar.m67371Z(new ArrayList());
        }
        this._empty_error_layout.m69875b();
    }

    /* JADX INFO: renamed from: z */
    public void m211219z(boolean z, boolean z2) {
        xdl0.m208344M(this._start_video_chat, false);
        xdl0.m208344M(this._random_entry, false);
        if (z) {
            xdl0.m208344M(this._start_video_chat, true);
            zvf0.m220402x("e_live_video_quickchat_start", "p_live_video_quickchat");
        } else if (z2) {
            xdl0.m208344M(this._random_entry, true);
            zvf0.m220402x("e_live_video_quickchat_random_button", "p_live_video_quickchat");
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: w */
    public void m211216w(boolean z, int i, long j) {
    }
}
