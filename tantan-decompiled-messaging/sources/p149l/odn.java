package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.live.base.apibean.BaseLiveListBean;
import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p046p1.mobile.putong.live.external.R$string;
import com.p046p1.mobile.putong.live.external.intl.feedback.upload.C12539a;
import com.p046p1.mobile.putong.live.external.intl.feedback.upload.C12540b;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VRecyclerView;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0004J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u001a\u001a\u00020\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u001d\u001a\u00020\u001c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010$\u001a\u00020#8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0016\u0010*\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u0006/"}, m87232d2 = {"Ll/odn;", "Ll/s7m;", "Lcom/p1/mobile/putong/live/external/intl/feedback/upload/b;", "<init>", "()V", "Landroid/view/View;", OMSTemplateModeType.view, "", "f", "(Landroid/view/View;)V", "presenter", "c", "(Lcom/p1/mobile/putong/live/external/intl/feedback/upload/b;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "Lcom/p1/mobile/putong/live/base/apibean/BaseLiveListBean;", "Lcom/p1/mobile/putong/live/external/intl/feedback/upload/a;", "pageData", RXScreenCaptureService.KEY_INDEX, "(Lcom/p1/mobile/putong/live/base/apibean/BaseLiveListBean;)V", "Lv/navigationbar/VNavigationBar;", "_page_title_bar", "Lv/navigationbar/VNavigationBar;", Constants.INAPP_DATA_TAG, "()Lv/navigationbar/VNavigationBar;", "j", "(Lv/navigationbar/VNavigationBar;)V", "Lv/VRecyclerView;", "_question_list", "Lv/VRecyclerView;", "e", "()Lv/VRecyclerView;", "k", "(Lv/VRecyclerView;)V", "mPresenter", "Lcom/p1/mobile/putong/live/external/intl/feedback/upload/b;", "Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "adapter", "Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "external_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class odn implements s7m<C12540b> {
    public VNavigationBar _page_title_bar;
    public VRecyclerView _question_list;

    @NotNull
    private final LiveBaseAdapter adapter = new LiveBaseAdapter();
    private C12540b mPresenter;

    /* JADX INFO: renamed from: a */
    public static void m163688a(odn odnVar, View view) {
        C12540b c12540b = odnVar.mPresenter;
        if (c12540b == null) {
            Intrinsics.m87502r("mPresenter");
            c12540b = null;
        }
        c12540b.m69961h0();
    }

    /* JADX INFO: renamed from: b */
    public static void m163689b(odn odnVar, C12539a c12539a, View view) {
        C12540b c12540b = odnVar.mPresenter;
        if (c12540b == null) {
            Intrinsics.m87502r("mPresenter");
            c12540b = null;
        }
        c12539a.getClass();
        c12540b.m69960g0(c12539a);
    }

    /* JADX INFO: renamed from: f */
    private final void m163690f(View view) {
        View viewFindViewById = view.findViewById(f5c0.f95090f1);
        viewFindViewById.getClass();
        m163695j((VNavigationBar) viewFindViewById);
        View viewFindViewById2 = view.findViewById(f5c0.f95098h1);
        viewFindViewById2.getClass();
        m163696k((VRecyclerView) viewFindViewById2);
        m163692d().setLeftIconDrawable(nu0.m161424b(view.getContext(), h3c0.f105603D));
        m163692d().setLeftIconOnClick(new View.OnClickListener() { // from class: l.mdn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                odn.m163688a(this.f133278a, view2);
            }
        });
        m163692d().setTitle(R$string.f44875M);
        m163693e().setLayoutManager(new LinearLayoutManager(view.getContext(), 1, false));
        m163693e().setAdapter(this.adapter);
    }

    @Override // p149l.s7m
    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        C12540b c12540b = this.mPresenter;
        if (c12540b == null) {
            Intrinsics.m87502r("mPresenter");
            c12540b = null;
        }
        return c12540b.getAct();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(@NotNull C12540b presenter) {
        presenter.getClass();
        this.mPresenter = presenter;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final VNavigationBar m163692d() {
        VNavigationBar vNavigationBar = this._page_title_bar;
        if (vNavigationBar != null) {
            return vNavigationBar;
        }
        Intrinsics.m87502r("_page_title_bar");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final VRecyclerView m163693e() {
        VRecyclerView vRecyclerView = this._question_list;
        if (vRecyclerView != null) {
            return vRecyclerView;
        }
        Intrinsics.m87502r("_question_list");
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final void m163694i(@NotNull BaseLiveListBean<C12539a> pageData) {
        pageData.getClass();
        List<C12539a> list = pageData.list;
        ArrayList arrayList = new ArrayList();
        for (final C12539a c12539a : list) {
            kdn kdnVar = new kdn(c12539a);
            arrayList.add(kdnVar);
            kdnVar.mo109662A(new View.OnClickListener() { // from class: l.ndn
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    odn.m163689b(this.f138290a, c12539a, view);
                }
            });
        }
        this.adapter.m67371Z(arrayList);
    }

    @Override // p149l.s7m
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewInflate = inflater.inflate(s6c0.f162807x, parent, false);
        viewInflate.getClass();
        m163690f(viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: j */
    public final void m163695j(@NotNull VNavigationBar vNavigationBar) {
        vNavigationBar.getClass();
        this._page_title_bar = vNavigationBar;
    }

    /* JADX INFO: renamed from: k */
    public final void m163696k(@NotNull VRecyclerView vRecyclerView) {
        vRecyclerView.getClass();
        this._question_list = vRecyclerView;
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
