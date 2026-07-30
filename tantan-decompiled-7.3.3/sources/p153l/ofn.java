package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.live.base.apibean.BaseLiveListBean;
import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p051p1.mobile.putong.live.external.R$string;
import com.p051p1.mobile.putong.live.external.intl.feedback.upload.C12702a;
import com.p051p1.mobile.putong.live.external.intl.feedback.upload.C12703b;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VRecyclerView;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0004J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u001a\u001a\u00020\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u001d\u001a\u00020\u001c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010$\u001a\u00020#8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0016\u0010*\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u0006/"}, m88121d2 = {"Ll/ofn;", "Ll/iam;", "Lcom/p1/mobile/putong/live/external/intl/feedback/upload/b;", "<init>", "()V", "Landroid/view/View;", OMSTemplateModeType.view, "", "f", "(Landroid/view/View;)V", "presenter", "c", "(Lcom/p1/mobile/putong/live/external/intl/feedback/upload/b;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "Lcom/p1/mobile/putong/live/base/apibean/BaseLiveListBean;", "Lcom/p1/mobile/putong/live/external/intl/feedback/upload/a;", "pageData", RXScreenCaptureService.KEY_INDEX, "(Lcom/p1/mobile/putong/live/base/apibean/BaseLiveListBean;)V", "Lv/navigationbar/VNavigationBar;", "_page_title_bar", "Lv/navigationbar/VNavigationBar;", Constants.INAPP_DATA_TAG, "()Lv/navigationbar/VNavigationBar;", "j", "(Lv/navigationbar/VNavigationBar;)V", "Lv/VRecyclerView;", "_question_list", "Lv/VRecyclerView;", "e", "()Lv/VRecyclerView;", "k", "(Lv/VRecyclerView;)V", "mPresenter", "Lcom/p1/mobile/putong/live/external/intl/feedback/upload/b;", "Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "adapter", "Lcom/p1/mobile/putong/live/base/arch/LiveBaseAdapter;", "external_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class ofn implements iam<C12703b> {
    public VNavigationBar _page_title_bar;
    public VRecyclerView _question_list;

    @NotNull
    private final LiveBaseAdapter adapter = new LiveBaseAdapter();
    private C12703b mPresenter;

    /* JADX INFO: renamed from: a */
    public static void m167459a(ofn ofnVar, View view) {
        C12703b c12703b = ofnVar.mPresenter;
        if (c12703b == null) {
            Intrinsics.m88391r("mPresenter");
            c12703b = null;
        }
        c12703b.m71144h0();
    }

    /* JADX INFO: renamed from: b */
    public static void m167460b(ofn ofnVar, C12702a c12702a, View view) {
        C12703b c12703b = ofnVar.mPresenter;
        if (c12703b == null) {
            Intrinsics.m88391r("mPresenter");
            c12703b = null;
        }
        c12702a.getClass();
        c12703b.m71143g0(c12702a);
    }

    /* JADX INFO: renamed from: f */
    private final void m167461f(View view) {
        View viewFindViewById = view.findViewById(ldc0.f131547f1);
        viewFindViewById.getClass();
        m167466j((VNavigationBar) viewFindViewById);
        View viewFindViewById2 = view.findViewById(ldc0.f131555h1);
        viewFindViewById2.getClass();
        m167467k((VRecyclerView) viewFindViewById2);
        m167463d().setLeftIconDrawable(tu0.m192702b(view.getContext(), nbc0.f141094D));
        m167463d().setLeftIconOnClick(new View.OnClickListener() { // from class: l.mfn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ofn.m167459a(this.f136659a, view2);
            }
        });
        m167463d().setTitle(R$string.f45723M);
        m167464e().setLayoutManager(new LinearLayoutManager(view.getContext(), 1, false));
        m167464e().setAdapter(this.adapter);
    }

    @Override // p153l.iam
    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        C12703b c12703b = this.mPresenter;
        if (c12703b == null) {
            Intrinsics.m88391r("mPresenter");
            c12703b = null;
        }
        return c12703b.getAct();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(@NotNull C12703b presenter) {
        presenter.getClass();
        this.mPresenter = presenter;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final VNavigationBar m167463d() {
        VNavigationBar vNavigationBar = this._page_title_bar;
        if (vNavigationBar != null) {
            return vNavigationBar;
        }
        Intrinsics.m88391r("_page_title_bar");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final VRecyclerView m167464e() {
        VRecyclerView vRecyclerView = this._question_list;
        if (vRecyclerView != null) {
            return vRecyclerView;
        }
        Intrinsics.m88391r("_question_list");
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final void m167465i(@NotNull BaseLiveListBean<C12702a> pageData) {
        pageData.getClass();
        List<C12702a> list = pageData.list;
        ArrayList arrayList = new ArrayList();
        for (final C12702a c12702a : list) {
            kfn kfnVar = new kfn(c12702a);
            arrayList.add(kfnVar);
            kfnVar.mo113881A(new View.OnClickListener() { // from class: l.nfn
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ofn.m167460b(this.f141745a, c12702a, view);
                }
            });
        }
        this.adapter.m68554Z(arrayList);
    }

    @Override // p153l.iam
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewInflate = inflater.inflate(xec0.f193921x, parent, false);
        viewInflate.getClass();
        m167461f(viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: j */
    public final void m167466j(@NotNull VNavigationBar vNavigationBar) {
        vNavigationBar.getClass();
        this._page_title_bar = vNavigationBar;
    }

    /* JADX INFO: renamed from: k */
    public final void m167467k(@NotNull VRecyclerView vRecyclerView) {
        vRecyclerView.getClass();
        this._question_list = vRecyclerView;
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
