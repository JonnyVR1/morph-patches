package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.live.external.R$string;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VDraweeView;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0004J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u0018\u001a\u00020\u00178\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u001f\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0016\u0010%\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, m88121d2 = {"Ll/rgn;", "Ll/iam;", "Ll/pgn;", "<init>", "()V", "Landroid/view/View;", OMSTemplateModeType.view, "", "e", "(Landroid/view/View;)V", "presenter", "b", "(Ll/pgn;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "Lv/navigationbar/VNavigationBar;", "_page_title_bar", "Lv/navigationbar/VNavigationBar;", "c", "()Lv/navigationbar/VNavigationBar;", "f", "(Lv/navigationbar/VNavigationBar;)V", "Lv/VDraweeView;", "_result_pic", "Lv/VDraweeView;", Constants.INAPP_DATA_TAG, "()Lv/VDraweeView;", RXScreenCaptureService.KEY_INDEX, "(Lv/VDraweeView;)V", "mPresenter", "Ll/pgn;", "external_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class rgn implements iam<pgn> {
    public VNavigationBar _page_title_bar;
    public VDraweeView _result_pic;
    private pgn mPresenter;

    /* JADX INFO: renamed from: a */
    public static void m181455a(rgn rgnVar, View view) {
        pgn pgnVar = rgnVar.mPresenter;
        if (pgnVar == null) {
            Intrinsics.m88391r("mPresenter");
            pgnVar = null;
        }
        pgnVar.getAct().lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: e */
    private final void m181456e(View view) {
        View viewFindViewById = view.findViewById(ldc0.f131547f1);
        viewFindViewById.getClass();
        m181460f((VNavigationBar) viewFindViewById);
        View viewFindViewById2 = view.findViewById(ldc0.f131587p1);
        viewFindViewById2.getClass();
        m181461i((VDraweeView) viewFindViewById2);
        m181458c().setLeftIconDrawable(tu0.m192702b(view.getContext(), nbc0.f141094D));
        m181458c().setLeftIconOnClick(new View.OnClickListener() { // from class: l.qgn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                rgn.m181455a(this.f157443a, view2);
            }
        });
        m181458c().setTitle(R$string.f45723M);
        izs.m142868s("context_square", m181459d(), "https://fe-static.tancdn.com/v1/images/eyJpZCI6Ijc3SFpLUTM3TDNMQzdSSk9VNVlPVVRZTVRZTVZBRTEyIiwidyI6OTMzLCJoIjo2MjQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3NDExMDE1NzZ9.webp");
    }

    @Override // p153l.iam
    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        pgn pgnVar = this.mPresenter;
        if (pgnVar == null) {
            Intrinsics.m88391r("mPresenter");
            pgnVar = null;
        }
        return pgnVar.getAct();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(@NotNull pgn presenter) {
        presenter.getClass();
        this.mPresenter = presenter;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final VNavigationBar m181458c() {
        VNavigationBar vNavigationBar = this._page_title_bar;
        if (vNavigationBar != null) {
            return vNavigationBar;
        }
        Intrinsics.m88391r("_page_title_bar");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final VDraweeView m181459d() {
        VDraweeView vDraweeView = this._result_pic;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_result_pic");
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final void m181460f(@NotNull VNavigationBar vNavigationBar) {
        vNavigationBar.getClass();
        this._page_title_bar = vNavigationBar;
    }

    /* JADX INFO: renamed from: i */
    public final void m181461i(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._result_pic = vDraweeView;
    }

    @Override // p153l.iam
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewInflate = inflater.inflate(xec0.f193769C, parent, false);
        viewInflate.getClass();
        m181456e(viewInflate);
        return viewInflate;
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
