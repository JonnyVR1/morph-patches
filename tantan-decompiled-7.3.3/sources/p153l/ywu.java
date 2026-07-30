package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.external.R$string;
import com.p051p1.mobile.putong.live.external.internal.live.square.fragments.videochat.LiveVideoChatFrag;
import com.p051p1.mobile.putong.live.external.internal.virtualVoice.square.fragmentnew2.LiveEmptyErrorView;
import com.p051p1.mobile.putong.live.external.page.teenmode.LiveTeenDialogAct;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p151v.VImage;
import p151v.VLinear;
import p151v.VPullDownRefreshLayout;
import p151v.VRecyclerView;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes9.dex */
public class ywu implements iam<rwu> {
    public LiveEmptyErrorView _empty_error_layout;
    public VImage _empty_error_layout_image;
    public VText _empty_error_layout_tv_tip;
    public VNavigationBar _page_title_bar;
    public VLinear _random_entry;
    public VRecyclerView _recycler_view;
    public TextView _start_video_chat;
    public VPullDownRefreshLayout _swipe_refresh;
    private r0u adapter;
    private h2u footerModel;
    private final LiveVideoChatFrag frag;
    private GridLayoutManager gridLayoutManager;
    private rwu presenter;
    private View rootView;

    /* JADX INFO: renamed from: l.ywu$a */
    public class C21694a extends GridLayoutManager.AbstractC0554c {
        final /* synthetic */ r0u val$adapter;

        public C21694a(r0u r0uVar) {
            this.val$adapter = r0uVar;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0554c
        /* JADX INFO: renamed from: f */
        public int mo3330f(int i) {
            return this.val$adapter.m68539K(i);
        }
    }

    /* JADX INFO: renamed from: l.ywu$b */
    public class C21695b extends RecyclerView.AbstractC0584t {
        public C21695b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0 && ywu.this.presenter != null) {
                ywu.this.presenter.m183472H2();
            }
        }
    }

    public ywu(LiveVideoChatFrag liveVideoChatFrag) {
        this.frag = liveVideoChatFrag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m217635p(mvc0 mvc0Var) {
        this.presenter.m183470D2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m217636q(View view) {
        rwu rwuVar = this.presenter;
        if (rwuVar != null) {
            rwuVar.m183473I2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m217637s(View view) {
        rwu rwuVar = this.presenter;
        if (rwuVar != null) {
            rwuVar.m183471F2();
        }
    }

    /* JADX INFO: renamed from: A */
    public void m217638A() {
        r0u r0uVar = this.adapter;
        if (r0uVar == null || r0uVar.getItemCount() <= 0) {
            return;
        }
        this._recycler_view.scrollToPosition(0);
    }

    /* JADX INFO: renamed from: B */
    public void m217639B(boolean z) {
        VNavigationBar vNavigationBar = this._page_title_bar;
        if (!z) {
            bnl0.m105524M(vNavigationBar, false);
            return;
        }
        bnl0.m105524M(vNavigationBar, z);
        this._page_title_bar.setTitle("视频闪聊");
        this._page_title_bar.setLeftIconOnClick(new View.OnClickListener() { // from class: l.swu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f171006a.m217647u(view);
            }
        });
        this._page_title_bar.setLeftIconResource(nbc0.f141154e);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: i */
    public View m217640i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return zwu.m221953b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM217640i = m217640i(layoutInflater, viewGroup);
        this.rootView = viewM217640i;
        return viewM217640i;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(rwu rwuVar) {
        this.presenter = rwuVar;
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
    public r0u m217642k() {
        final r0u r0uVarM179247J0 = r0u.m179247J0();
        GridLayoutManager gridLayoutManager = new GridLayoutManager((Context) getAct(), 6, 1, false);
        this.gridLayoutManager = gridLayoutManager;
        gridLayoutManager.m3327v(new C21694a(r0uVarM179247J0));
        this._recycler_view.setLayoutManager(this.gridLayoutManager);
        this._recycler_view.setAdapter(r0uVarM179247J0);
        this._recycler_view.setItemAnimator(null);
        this._recycler_view.addOnScrollListener(new C21695b());
        final LiveVideoChatFrag liveVideoChatFrag = this.frag;
        Objects.requireNonNull(liveVideoChatFrag);
        r0uVarM179247J0.m200149o0(liveVideoChatFrag, new pcj() { // from class: l.wwu
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(liveVideoChatFrag.m72004Q4());
            }
        }, LiveTeenDialogAct.f47064g);
        r0uVarM179247J0.m68552X(false);
        r0uVarM179247J0.m68558c0(new y20() { // from class: l.xwu
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f196556a.m217645n(r0uVarM179247J0, (Integer) obj);
            }
        });
        return r0uVarM179247J0;
    }

    /* JADX INFO: renamed from: l */
    public void m217643l() {
        this._swipe_refresh.m225021t();
    }

    /* JADX INFO: renamed from: m */
    public final void m217644m(List<? extends d3q<?>> list, boolean z, boolean z2) {
        this.adapter.m68551W(this.footerModel);
        h2u h2uVar = new h2u(6, z, (z2 || list.size() == 0) ? false : true);
        this.footerModel = h2uVar;
        h2uVar.m133403I(this.frag.getResources().getColor(m9c0.f135401z));
        this.footerModel.m133404J(xau.m209910t(R$string.f45769q));
        this.adapter.m68534E(this.footerModel);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m217645n(r0u r0uVar, Integer num) {
        if (num.intValue() >= r0uVar.getItemCount() - 2) {
            this.presenter.m183468B2();
        }
    }

    /* JADX INFO: renamed from: r */
    public void m217646r() {
        this._empty_error_layout.m71059c();
        this._swipe_refresh.mo224405O(new jn50() { // from class: l.twu
            @Override // p153l.jn50
            /* JADX INFO: renamed from: w2 */
            public final void mo59137w2(mvc0 mvc0Var) {
                this.f176428a.m217635p(mvc0Var);
            }
        });
        this._empty_error_layout.setEmptyText(xau.m209910t(R$string.f45712C0));
        bnl0.m105509E0(this._start_video_chat, new View.OnClickListener() { // from class: l.uwu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f181320a.m217636q(view);
            }
        });
        bnl0.m105509E0(this._random_entry, new View.OnClickListener() { // from class: l.vwu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f186171a.m217637s(view);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m217647u(View view) {
        this.frag.act().m48999H2();
    }

    /* JADX INFO: renamed from: v */
    public boolean m217648v() {
        r0u r0uVar = this.adapter;
        return r0uVar == null || r0uVar.m68538J().size() == 0;
    }

    /* JADX INFO: renamed from: x */
    public void m217650x(List<uxr<?>> list, boolean z, boolean z2) {
        if (this.adapter == null) {
            this.adapter = m217642k();
        }
        this.adapter.m68554Z(list);
        this._empty_error_layout.m71057a(list.size());
        m217644m(list, z, z2);
        this.adapter.m200145k0();
    }

    /* JADX INFO: renamed from: y */
    public void m217651y() {
        r0u r0uVar = this.adapter;
        if (r0uVar != null) {
            r0uVar.m68554Z(new ArrayList());
        }
        this._empty_error_layout.m71058b();
    }

    /* JADX INFO: renamed from: z */
    public void m217652z(boolean z, boolean z2) {
        bnl0.m105524M(this._start_video_chat, false);
        bnl0.m105524M(this._random_entry, false);
        if (z) {
            bnl0.m105524M(this._start_video_chat, true);
            i4g0.m138526x("e_live_video_quickchat_start", "p_live_video_quickchat");
        } else if (z2) {
            bnl0.m105524M(this._random_entry, true);
            i4g0.m138526x("e_live_video_quickchat_random_button", "p_live_video_quickchat");
        }
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: w */
    public void m217649w(boolean z, int i, long j) {
    }
}
