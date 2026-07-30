package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.live.external.R$string;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VDraweeView;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0004J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u0018\u001a\u00020\u00178\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u001f\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0016\u0010%\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, m87232d2 = {"Ll/ren;", "Ll/s7m;", "Ll/pen;", "<init>", "()V", "Landroid/view/View;", OMSTemplateModeType.view, "", "e", "(Landroid/view/View;)V", "presenter", "b", "(Ll/pen;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "Lv/navigationbar/VNavigationBar;", "_page_title_bar", "Lv/navigationbar/VNavigationBar;", "c", "()Lv/navigationbar/VNavigationBar;", "f", "(Lv/navigationbar/VNavigationBar;)V", "Lv/VDraweeView;", "_result_pic", "Lv/VDraweeView;", Constants.INAPP_DATA_TAG, "()Lv/VDraweeView;", RXScreenCaptureService.KEY_INDEX, "(Lv/VDraweeView;)V", "mPresenter", "Ll/pen;", "external_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class ren implements s7m<pen> {
    public VNavigationBar _page_title_bar;
    public VDraweeView _result_pic;
    private pen mPresenter;

    /* JADX INFO: renamed from: a */
    public static void m179054a(ren renVar, View view) {
        pen penVar = renVar.mPresenter;
        if (penVar == null) {
            Intrinsics.m87502r("mPresenter");
            penVar = null;
        }
        penVar.getAct().lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: e */
    private final void m179055e(View view) {
        View viewFindViewById = view.findViewById(f5c0.f95090f1);
        viewFindViewById.getClass();
        m179059f((VNavigationBar) viewFindViewById);
        View viewFindViewById2 = view.findViewById(f5c0.f95130p1);
        viewFindViewById2.getClass();
        m179060i((VDraweeView) viewFindViewById2);
        m179057c().setLeftIconDrawable(nu0.m161424b(view.getContext(), h3c0.f105603D));
        m179057c().setLeftIconOnClick(new View.OnClickListener() { // from class: l.qen
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ren.m179054a(this.f154045a, view2);
            }
        });
        m179057c().setTitle(R$string.f44875M);
        hxs.m133406s("context_square", m179058d(), "https://fe-static.tancdn.com/v1/images/eyJpZCI6Ijc3SFpLUTM3TDNMQzdSSk9VNVlPVVRZTVRZTVZBRTEyIiwidyI6OTMzLCJoIjo2MjQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo3NDExMDE1NzZ9.webp");
    }

    @Override // p149l.s7m
    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        pen penVar = this.mPresenter;
        if (penVar == null) {
            Intrinsics.m87502r("mPresenter");
            penVar = null;
        }
        return penVar.getAct();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(@NotNull pen presenter) {
        presenter.getClass();
        this.mPresenter = presenter;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final VNavigationBar m179057c() {
        VNavigationBar vNavigationBar = this._page_title_bar;
        if (vNavigationBar != null) {
            return vNavigationBar;
        }
        Intrinsics.m87502r("_page_title_bar");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final VDraweeView m179058d() {
        VDraweeView vDraweeView = this._result_pic;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_result_pic");
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final void m179059f(@NotNull VNavigationBar vNavigationBar) {
        vNavigationBar.getClass();
        this._page_title_bar = vNavigationBar;
    }

    /* JADX INFO: renamed from: i */
    public final void m179060i(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._result_pic = vDraweeView;
    }

    @Override // p149l.s7m
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewInflate = inflater.inflate(s6c0.f162655C, parent, false);
        viewInflate.getClass();
        m179055e(viewInflate);
        return viewInflate;
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
