package com.p000p1.mobile.putong.live.livingroom.voice.membermanager.online;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.v;
import com.p000p1.mobile.putong.live.livingroom.voice.membermanager.online.MemberOnLinePageView;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.base.data.BLiveMember;
import com.p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p1.mobile.putong.live.base.data.BLiveVoiceCallInvite;
import com.p1.mobile.putong.live.livingroom.R;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l.alk0;
import l.df50;
import l.e30;
import l.hnc0;
import l.ho2;
import l.i3c0;
import l.i5o0;
import l.lsi0;
import l.me50;
import l.mqv;
import l.nnn0;
import l.rsm0;
import l.t6c0;
import l.u4n0;
import l.vwb;
import l.w8u;
import l.xdl0;
import l.yby;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p009l.ecy;
import p009l.fcy;
import p009l.jby;
import p009l.lyn0;
import p009l.ypv;
import v.VImage;
import v.VLinear;
import v.VRecyclerView;
import v.VText;
import v.smart_refresh.SmartRefreshLayout;
import v.smart_refresh.footer.TTRefreshFooter;
import v.smart_refresh.header.TTRefreshHeader;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 k2\u00020\u0001:\u0001lB\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0013\u0010\u000eJ!\u0010\u0018\u001a\u00020\n2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u000eJ\u0015\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010#\u001a\u00020\n2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u000f¢\u0006\u0004\b%\u0010&R\"\u0010-\u001a\u00020\u00008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u00105\u001a\u00020.8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010=\u001a\u0002068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010E\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010M\u001a\u00020F8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\"\u0010Q\u001a\u00020.8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bN\u00100\u001a\u0004\bO\u00102\"\u0004\bP\u00104R\"\u0010U\u001a\u0002068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bR\u00108\u001a\u0004\bS\u0010:\"\u0004\bT\u0010<R\"\u0010]\u001a\u00020V8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R$\u0010e\u001a\u0004\u0018\u00010^8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR,\u0010\u0017\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010\u0019¨\u0006m"}, d2 = {"Lcom/p1/mobile/putong/live/livingroom/voice/membermanager/online/MemberOnLinePageView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/view/View;", "view", "", "m0", "(Landroid/view/View;)V", "q0", "()V", "", "isShow", "n0", "(Z)V", "onFinishInflate", "Ll/ecy;", "Ll/nnn0;", "Ll/fcy;", "presenter", "r0", "(Ll/ecy;)V", "p0", "Ll/lyn0;", "voiceMemberInfo", "setMemberData", "(Ll/lyn0;)V", "", "userId", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceCallInvite;", "invite", "v0", "(Ljava/lang/String;Lcom/p1/mobile/putong/live/base/data/BLiveVoiceCallInvite;)V", "u0", "()Z", "d", "Lcom/p1/mobile/putong/live/livingroom/voice/membermanager/online/MemberOnLinePageView;", "get_rootView", "()Lcom/p1/mobile/putong/live/livingroom/voice/membermanager/online/MemberOnLinePageView;", "set_rootView", "(Lcom/p1/mobile/putong/live/livingroom/voice/membermanager/online/MemberOnLinePageView;)V", "_rootView", "Lv/VLinear;", "e", "Lv/VLinear;", "get_share_root", "()Lv/VLinear;", "set_share_root", "(Lv/VLinear;)V", "_share_root", "Lv/VImage;", "f", "Lv/VImage;", "get_share_root_share_go", "()Lv/VImage;", "set_share_root_share_go", "(Lv/VImage;)V", "_share_root_share_go", "Lv/smart_refresh/SmartRefreshLayout;", "g", "Lv/smart_refresh/SmartRefreshLayout;", "get_refresh_layout", "()Lv/smart_refresh/SmartRefreshLayout;", "set_refresh_layout", "(Lv/smart_refresh/SmartRefreshLayout;)V", "_refresh_layout", "Lv/VRecyclerView;", "h", "Lv/VRecyclerView;", "get_recyclerView", "()Lv/VRecyclerView;", "set_recyclerView", "(Lv/VRecyclerView;)V", "_recyclerView", "i", "get_empty", "set_empty", "_empty", "j", "get_empty_icon", "set_empty_icon", "_empty_icon", "Lv/VText;", "k", "Lv/VText;", "get_empty_text", "()Lv/VText;", "set_empty_text", "(Lv/VText;)V", "_empty_text", "Ll/jby;", "l", "Ll/jby;", "getManagerListAdapter", "()Ll/jby;", "setManagerListAdapter", "(Ll/jby;)V", "managerListAdapter", "m", "Ll/ecy;", "getPresenter", "()Ll/ecy;", "setPresenter", "Companion", "a", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MemberOnLinePageView extends ConstraintLayout {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public MemberOnLinePageView _rootView;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VLinear _share_root;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VImage _share_root_share_go;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public SmartRefreshLayout _refresh_layout;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VRecyclerView _recyclerView;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public VLinear _empty;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public VImage _empty_icon;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public VText _empty_text;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public jby managerListAdapter;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public ecy<?, ?> presenter;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.membermanager.online.MemberOnLinePageView$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/p1/mobile/putong/live/livingroom/voice/membermanager/online/MemberOnLinePageView$a;", "", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Lcom/p1/mobile/putong/live/livingroom/voice/membermanager/online/MemberOnLinePageView;", "a", "(Landroid/view/LayoutInflater;)Lcom/p1/mobile/putong/live/livingroom/voice/membermanager/online/MemberOnLinePageView;", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final MemberOnLinePageView m8860a(@NotNull LayoutInflater inflater) {
            inflater.getClass();
            Object objInflate = inflater.inflate(t6c0.S3, (ViewGroup) null, false);
            objInflate.getClass();
            return (MemberOnLinePageView) objInflate;
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.membermanager.online.MemberOnLinePageView$b */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/p1/mobile/putong/live/livingroom/voice/membermanager/online/MemberOnLinePageView$b", "Landroidx/recyclerview/widget/RecyclerView$t;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "newState", "", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0446b extends RecyclerView.t {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ecy<nnn0, fcy> f7323a;

        public C0446b(ecy<nnn0, fcy> ecyVar) {
            this.f7323a = ecyVar;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
            recyclerView.getClass();
            if (newState != 0 || recyclerView.canScrollVertically(1) || recyclerView.getAdapter() == null) {
                return;
            }
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            adapter.getClass();
            if (adapter.getItemCount() == ((ho2) this.f7323a.E2()).u && this.f7323a.E2().V2().isNormalLive()) {
                lsi0.j(w8u.u(R.string.o7, Integer.valueOf(((ho2) this.f7323a.E2()).u)));
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @JvmOverloads
    public MemberOnLinePageView(@NotNull Context context) {
        context.getClass();
        AttributeSet attributeSet = null;
        this(context, attributeSet, 2, attributeSet);
    }

    /* JADX INFO: renamed from: i0 */
    public static void m8846i0(MemberOnLinePageView memberOnLinePageView, View view) {
        ecy<?, ?> ecyVar = memberOnLinePageView.presenter;
        if (ecyVar != null) {
            i5o0.b(ecyVar);
            ecyVar.F2().VoiceVirtualLiveEvent.openSharePanelDialog().p();
        }
    }

    /* JADX INFO: renamed from: j0 */
    public static void m8847j0(MemberOnLinePageView memberOnLinePageView, String str) {
        nnn0 nnn0VarE2;
        ecy<?, ?> ecyVar = memberOnLinePageView.presenter;
        u4n0.k(memberOnLinePageView.presenter, (ecyVar == null || (nnn0VarE2 = ecyVar.E2()) == null) ? null : nnn0VarE2.j0(), str);
    }

    /* JADX INFO: renamed from: k0 */
    public static void m8848k0(MemberOnLinePageView memberOnLinePageView, mqv mqvVar) {
        mqvVar.getClass();
        BLiveVoiceCall bLiveVoiceCallI = mqvVar.i();
        if (alk0.h(bLiveVoiceCallI)) {
            u4n0.g(memberOnLinePageView.presenter, bLiveVoiceCallI, "voice-manager");
            if (memberOnLinePageView.m8858u0()) {
                rsm0.t();
                return;
            } else {
                rsm0.u();
                return;
            }
        }
        if (Intrinsics.d("canInvite", ((BLiveMember) mqvVar.a).inviteStatus)) {
            if (NullChecker.a(bLiveVoiceCallI)) {
                ecy<?, ?> ecyVar = memberOnLinePageView.presenter;
                if (ecyVar != null) {
                    ecyVar.m13824d4(bLiveVoiceCallI.user);
                }
            } else {
                User userH = mqvVar.h();
                if (userH == null) {
                    return;
                }
                ecy<?, ?> ecyVar2 = memberOnLinePageView.presenter;
                if (ecyVar2 != null) {
                    ecyVar2.m13824d4(((DbObject) userH).id);
                }
            }
            if (memberOnLinePageView.m8858u0()) {
                rsm0.v();
            } else {
                rsm0.w();
            }
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: o0 */
    public static final MemberOnLinePageView m8850o0(@NotNull LayoutInflater layoutInflater) {
        return INSTANCE.m8860a(layoutInflater);
    }

    /* JADX INFO: renamed from: q0 */
    private final void m8851q0() {
        this.managerListAdapter = new jby(this.presenter, new e30() { // from class: l.wby
            public final void call(Object obj) {
                MemberOnLinePageView.m8847j0(this.f21997a, (String) obj);
            }
        }, new e30() { // from class: l.xby
            public final void call(Object obj) {
                MemberOnLinePageView.m8848k0(this.f22505a, (mqv) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s0 */
    public static final void m8852s0(ecy ecyVar, hnc0 hnc0Var) {
        hnc0Var.getClass();
        ecyVar.mo13822V3();
    }

    /* JADX INFO: renamed from: t0 */
    public static final void m8853t0(ecy ecyVar, hnc0 hnc0Var) {
        hnc0Var.getClass();
        ecyVar.mo13821U3();
    }

    @Nullable
    public final jby getManagerListAdapter() {
        return this.managerListAdapter;
    }

    @Nullable
    public final ecy<?, ?> getPresenter() {
        return this.presenter;
    }

    @NotNull
    public final VLinear get_empty() {
        VLinear vLinear = this._empty;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.r("_empty");
        return null;
    }

    @NotNull
    public final VImage get_empty_icon() {
        VImage vImage = this._empty_icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_empty_icon");
        return null;
    }

    @NotNull
    public final VText get_empty_text() {
        VText vText = this._empty_text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_empty_text");
        return null;
    }

    @NotNull
    public final VRecyclerView get_recyclerView() {
        VRecyclerView vRecyclerView = this._recyclerView;
        if (vRecyclerView != null) {
            return vRecyclerView;
        }
        Intrinsics.r("_recyclerView");
        return null;
    }

    @NotNull
    public final SmartRefreshLayout get_refresh_layout() {
        SmartRefreshLayout smartRefreshLayout = this._refresh_layout;
        if (smartRefreshLayout != null) {
            return smartRefreshLayout;
        }
        Intrinsics.r("_refresh_layout");
        return null;
    }

    @NotNull
    public final MemberOnLinePageView get_rootView() {
        MemberOnLinePageView memberOnLinePageView = this._rootView;
        if (memberOnLinePageView != null) {
            return memberOnLinePageView;
        }
        Intrinsics.r("_rootView");
        return null;
    }

    @NotNull
    public final VLinear get_share_root() {
        VLinear vLinear = this._share_root;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.r("_share_root");
        return null;
    }

    @NotNull
    public final VImage get_share_root_share_go() {
        VImage vImage = this._share_root_share_go;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_share_root_share_go");
        return null;
    }

    /* JADX INFO: renamed from: m0 */
    public final void m8854m0(View view) {
        yby.a(this, view);
    }

    /* JADX INFO: renamed from: n0 */
    public final void m8855n0(boolean isShow) {
        xdl0.M(get_empty(), isShow);
        get_empty_icon().setImageDrawable(get_empty_icon().getContext().getDrawable(i3c0.K3));
        get_empty_text().setText("暂无数据");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8854m0(this);
        xdl0.E0(get_share_root(), new View.OnClickListener() { // from class: l.tby
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MemberOnLinePageView.m8846i0(this.f20610a, view);
            }
        });
    }

    /* JADX INFO: renamed from: p0 */
    public final void m8856p0() {
        get_refresh_layout().t();
        get_refresh_layout().o();
    }

    /* JADX INFO: renamed from: r0 */
    public final void m8857r0(@NotNull final ecy<nnn0, fcy> presenter) {
        presenter.getClass();
        this.presenter = presenter;
        m8851q0();
        VRecyclerView vRecyclerView = get_recyclerView();
        vRecyclerView.setAdapter(this.managerListAdapter);
        vRecyclerView.setHasFixedSize(true);
        vRecyclerView.setLayoutManager(new LinearLayoutManager(vRecyclerView.getContext()));
        v itemAnimator = vRecyclerView.getItemAnimator();
        itemAnimator.getClass();
        itemAnimator.setSupportsChangeAnimations(false);
        vRecyclerView.addOnScrollListener(new C0446b(presenter));
        get_refresh_layout().S(new TTRefreshHeader(presenter.act()));
        get_refresh_layout().Q(new TTRefreshFooter(presenter.act()));
        get_refresh_layout().O(new df50() { // from class: l.uby
            /* JADX INFO: renamed from: w2 */
            public final void m22790w2(hnc0 hnc0Var) {
                MemberOnLinePageView.m8852s0(presenter, hnc0Var);
            }
        });
        get_refresh_layout().M(new me50() { // from class: l.vby
            /* JADX INFO: renamed from: a */
            public final void m23345a(hnc0 hnc0Var) {
                MemberOnLinePageView.m8853t0(presenter, hnc0Var);
            }
        });
        jby jbyVar = this.managerListAdapter;
        jbyVar.getClass();
        jbyVar.m16941I(new lyn0(null, false));
    }

    public final void setManagerListAdapter(@Nullable jby jbyVar) {
        this.managerListAdapter = jbyVar;
    }

    public final void setMemberData(@NotNull lyn0 voiceMemberInfo) {
        voiceMemberInfo.getClass();
        jby jbyVar = this.managerListAdapter;
        jbyVar.getClass();
        jbyVar.m16941I(voiceMemberInfo);
        m8856p0();
        m8855n0(vwb.J(voiceMemberInfo.f16447a));
    }

    public final void setPresenter(@Nullable ecy<?, ?> ecyVar) {
        this.presenter = ecyVar;
    }

    public final void set_empty(@NotNull VLinear vLinear) {
        vLinear.getClass();
        this._empty = vLinear;
    }

    public final void set_empty_icon(@NotNull VImage vImage) {
        vImage.getClass();
        this._empty_icon = vImage;
    }

    public final void set_empty_text(@NotNull VText vText) {
        vText.getClass();
        this._empty_text = vText;
    }

    public final void set_recyclerView(@NotNull VRecyclerView vRecyclerView) {
        vRecyclerView.getClass();
        this._recyclerView = vRecyclerView;
    }

    public final void set_refresh_layout(@NotNull SmartRefreshLayout smartRefreshLayout) {
        smartRefreshLayout.getClass();
        this._refresh_layout = smartRefreshLayout;
    }

    public final void set_rootView(@NotNull MemberOnLinePageView memberOnLinePageView) {
        memberOnLinePageView.getClass();
        this._rootView = memberOnLinePageView;
    }

    public final void set_share_root(@NotNull VLinear vLinear) {
        vLinear.getClass();
        this._share_root = vLinear;
    }

    public final void set_share_root_share_go(@NotNull VImage vImage) {
        vImage.getClass();
        this._share_root_share_go = vImage;
    }

    /* JADX INFO: renamed from: u0 */
    public final boolean m8858u0() {
        String strM23619D0 = ypv.f23196a.m23619D0();
        ecy<?, ?> ecyVar = this.presenter;
        ecyVar.getClass();
        String str = ((DbObject) ecyVar.E2().l0()).id;
        str.getClass();
        if (TextUtils.isEmpty(strM23619D0)) {
            return false;
        }
        return Intrinsics.d(strM23619D0, str);
    }

    /* JADX INFO: renamed from: v0 */
    public final void m8859v0(@Nullable String userId, @Nullable BLiveVoiceCallInvite invite) {
        jby jbyVar = this.managerListAdapter;
        jbyVar.getClass();
        jbyVar.m16942J(userId, invite);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MemberOnLinePageView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    public /* synthetic */ MemberOnLinePageView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
