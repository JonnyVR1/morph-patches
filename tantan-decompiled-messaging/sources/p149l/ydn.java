package p149l;

import android.content.Context;
import android.graphics.Color;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.external.R$string;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VDraweeView;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u0004J\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\rJ\u000f\u0010\u001a\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001a\u0010\u0004J\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!R\"\u0010#\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010*\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00100\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u0010+\u001a\u0004\b1\u0010-\"\u0004\b2\u0010/R\"\u00104\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010:\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b:\u00105\u001a\u0004\b;\u00107\"\u0004\b<\u00109R\"\u0010>\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010D\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bD\u00105\u001a\u0004\bE\u00107\"\u0004\bF\u00109R\u0014\u0010G\u001a\u00020\u001e8\u0002X\u0082D¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010I\u001a\u00020\u001e8\u0002X\u0082D¢\u0006\u0006\n\u0004\bI\u0010HR\"\u0010J\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010H\u001a\u0004\bK\u0010L\"\u0004\bM\u0010!R\u0016\u0010N\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bN\u0010O¨\u0006P"}, m87232d2 = {"Ll/ydn;", "Ll/s7m;", "Ll/sdn;", "<init>", "()V", "Landroid/view/View;", OMSTemplateModeType.view, "", BLiveStormDanmakuGiftResourceType.f44446s, "(Landroid/view/View;)V", "", "enable", BaseSei.f13930X, "(Z)V", "u", "presenter", RXScreenCaptureService.KEY_INDEX, "(Ll/sdn;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "isChecked", "E", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "", "url", b2s.C_ZONE, "(Ljava/lang/String;)V", "Lv/navigationbar/VNavigationBar;", "_page_title_bar", "Lv/navigationbar/VNavigationBar;", "q", "()Lv/navigationbar/VNavigationBar;", "F", "(Lv/navigationbar/VNavigationBar;)V", "Landroid/widget/EditText;", "desc_view", "Landroid/widget/EditText;", "p", "()Landroid/widget/EditText;", "B", "(Landroid/widget/EditText;)V", "contact_view", "m", BaseSei.f13932Z, "Lv/VDraweeView;", "add_pic_view", "Lv/VDraweeView;", "j", "()Lv/VDraweeView;", ResourceDirection.f38808v, "(Lv/VDraweeView;)V", "delete_button", "n", "A", "Landroid/widget/TextView;", "commit_button", "Landroid/widget/TextView;", BLiveStormDanmakuGiftResourceType.f44444l, "()Landroid/widget/TextView;", BaseSei.f13931Y, "(Landroid/widget/TextView;)V", "check_view", "k", "w", "addImageUrl", "Ljava/lang/String;", "deleteImageUrl", "picUrl", "getPicUrl", "()Ljava/lang/String;", "setPicUrl", "mPresenter", "Ll/sdn;", "external_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class ydn implements s7m<sdn> {
    public VNavigationBar _page_title_bar;
    public VDraweeView add_pic_view;
    public VDraweeView check_view;
    public TextView commit_button;
    public EditText contact_view;
    public VDraweeView delete_button;
    public EditText desc_view;
    private sdn mPresenter;

    @NotNull
    private final String addImageUrl = "https://static.tancdn.com/pe-webplatform/r94df-FelenNB--G0LjMxzae.png";

    @NotNull
    private final String deleteImageUrl = "https://static.tancdn.com/pe-webplatform/35-DAxTyz2O3o1xjcbhGLgYz.png";

    @NotNull
    private String picUrl = "";

    /* JADX INFO: renamed from: l.ydn$a */
    @Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {"l/ydn$a", "Ll/jii0;", "Landroid/text/Editable;", BLiveStormDanmakuGiftResourceType.f44446s, "", "afterTextChanged", "(Landroid/text/Editable;)V", "external_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C21376a extends jii0 {
        public C21376a() {
        }

        @Override // p149l.jii0, android.text.TextWatcher
        public void afterTextChanged(Editable s) {
            super.afterTextChanged(s);
            if (s == null || StringsKt.m93433Z0(s.toString()).toString().length() == 0) {
                ydn.this.m214308x(false);
            } else {
                ydn.this.m214308x(true);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m214285a(ydn ydnVar, View view) {
        hxs.m133406s("context_common", ydnVar.m214298j(), ydnVar.addImageUrl);
        ydnVar.m214302n().setVisibility(8);
        ydnVar.picUrl = "";
    }

    /* JADX INFO: renamed from: b */
    public static void m214286b(ydn ydnVar, View view) {
        if (jji0.m141806b(ydnVar.picUrl)) {
            sdn sdnVar = ydnVar.mPresenter;
            if (sdnVar == null) {
                Intrinsics.m87502r("mPresenter");
                sdnVar = null;
            }
            sdnVar.m183516k0();
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m214287c(ydn ydnVar, View view) {
        ydnVar.m214299k().setSelected(!ydnVar.m214299k().isSelected());
        ydnVar.m214295E(ydnVar.m214299k().isSelected());
    }

    /* JADX INFO: renamed from: d */
    public static void m214288d(ydn ydnVar, View view) {
        sdn sdnVar = ydnVar.mPresenter;
        if (sdnVar == null) {
            Intrinsics.m87502r("mPresenter");
            sdnVar = null;
        }
        sdnVar.m183517l0();
    }

    /* JADX INFO: renamed from: e */
    public static void m214289e(ydn ydnVar, View view) {
        ydnVar.m214305u();
    }

    /* JADX INFO: renamed from: s */
    private final void m214291s(View view) {
        View viewFindViewById = view.findViewById(f5c0.f95090f1);
        viewFindViewById.getClass();
        m214296F((VNavigationBar) viewFindViewById);
        View viewFindViewById2 = view.findViewById(f5c0.f95059X);
        viewFindViewById2.getClass();
        m214293B((EditText) viewFindViewById2);
        View viewFindViewById3 = view.findViewById(f5c0.f95017K);
        viewFindViewById3.getClass();
        m214310z((EditText) viewFindViewById3);
        View viewFindViewById4 = view.findViewById(f5c0.f95080d);
        viewFindViewById4.getClass();
        m214306v((VDraweeView) viewFindViewById4);
        View viewFindViewById5 = view.findViewById(f5c0.f95047T);
        viewFindViewById5.getClass();
        m214292A((VDraweeView) viewFindViewById5);
        View viewFindViewById6 = view.findViewById(f5c0.f95005H);
        viewFindViewById6.getClass();
        m214309y((TextView) viewFindViewById6);
        View viewFindViewById7 = view.findViewById(f5c0.f94993E);
        viewFindViewById7.getClass();
        m214307w((VDraweeView) viewFindViewById7);
        m214304q().setLeftIconDrawable(nu0.m161424b(view.getContext(), h3c0.f105603D));
        m214304q().setLeftIconOnClick(new View.OnClickListener() { // from class: l.tdn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ydn.m214288d(this.f169574a, view2);
            }
        });
        m214304q().setTitle(R$string.f44875M);
        hxs.m133406s("context_common", m214298j(), this.addImageUrl);
        hxs.m133406s("context_common", m214302n(), this.deleteImageUrl);
        xdl0.m208329E0(m214300l(), new View.OnClickListener() { // from class: l.udn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ydn.m214289e(this.f175935a, view2);
            }
        });
        xdl0.m208329E0(m214298j(), new View.OnClickListener() { // from class: l.vdn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ydn.m214286b(this.f181100a, view2);
            }
        });
        xdl0.m208329E0(m214302n(), new View.OnClickListener() { // from class: l.wdn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ydn.m214285a(this.f185812a, view2);
            }
        });
        xdl0.m208329E0(m214299k(), new View.OnClickListener() { // from class: l.xdn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ydn.m214287c(this.f192424a, view2);
            }
        });
        m214299k().setSelected(true);
        m214295E(true);
        m214303p().addTextChangedListener(new C21376a());
        m214308x(false);
    }

    /* JADX INFO: renamed from: A */
    public final void m214292A(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this.delete_button = vDraweeView;
    }

    /* JADX INFO: renamed from: B */
    public final void m214293B(@NotNull EditText editText) {
        editText.getClass();
        this.desc_view = editText;
    }

    /* JADX INFO: renamed from: C */
    public final void m214294C(@NotNull String url) {
        url.getClass();
        this.picUrl = url;
        hxs.m133406s("context_common", m214298j(), this.picUrl);
        xdl0.m208344M(m214302n(), true);
    }

    @Override // p149l.s7m
    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        sdn sdnVar = this.mPresenter;
        if (sdnVar == null) {
            Intrinsics.m87502r("mPresenter");
            sdnVar = null;
        }
        return sdnVar.getAct();
    }

    /* JADX INFO: renamed from: E */
    public final void m214295E(boolean isChecked) {
        if (isChecked) {
            hxs.m133406s("context_square", m214299k(), "https://fe-static.tancdn.com/v1/images/eyJpZCI6IjJBSDdINkFRMlpNTjZKWVVNRzM0NVJJSlFSR0lTUDEzIiwidyI6NzIsImgiOjcyLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NTEwMDExNjkzMzcyMDIzNTc1fQ.webp");
        } else {
            hxs.m133406s("context_square", m214299k(), "https://fe-static.tancdn.com/v1/images/eyJpZCI6IjRET0ZKTkZZV1paQkRCQkI3NUlGU1FSUlBZRFpFRjEzIiwidyI6MjQsImgiOjI0LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MH0.webp");
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m214296F(@NotNull VNavigationBar vNavigationBar) {
        vNavigationBar.getClass();
        this._page_title_bar = vNavigationBar;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(@NotNull sdn presenter) {
        presenter.getClass();
        this.mPresenter = presenter;
    }

    @Override // p149l.s7m
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewInflate = inflater.inflate(s6c0.f162813z, parent, false);
        viewInflate.getClass();
        m214291s(viewInflate);
        return viewInflate;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final VDraweeView m214298j() {
        VDraweeView vDraweeView = this.add_pic_view;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("add_pic_view");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final VDraweeView m214299k() {
        VDraweeView vDraweeView = this.check_view;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("check_view");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final TextView m214300l() {
        TextView textView = this.commit_button;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("commit_button");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final EditText m214301m() {
        EditText editText = this.contact_view;
        if (editText != null) {
            return editText;
        }
        Intrinsics.m87502r("contact_view");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final VDraweeView m214302n() {
        VDraweeView vDraweeView = this.delete_button;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("delete_button");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final EditText m214303p() {
        EditText editText = this.desc_view;
        if (editText != null) {
            return editText;
        }
        Intrinsics.m87502r("desc_view");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final VNavigationBar m214304q() {
        VNavigationBar vNavigationBar = this._page_title_bar;
        if (vNavigationBar != null) {
            return vNavigationBar;
        }
        Intrinsics.m87502r("_page_title_bar");
        return null;
    }

    /* JADX INFO: renamed from: u */
    public final void m214305u() {
        if (m214303p().getText() == null || m214303p().getText().length() == 0) {
            return;
        }
        sdn sdnVar = null;
        if (m214299k().isSelected()) {
            sdn sdnVar2 = this.mPresenter;
            if (sdnVar2 == null) {
                Intrinsics.m87502r("mPresenter");
                sdnVar2 = null;
            }
            sdnVar2.m183519n0();
        }
        String string = m214301m().getText() != null ? m214301m().getText().toString() : "";
        String str = xdl0.m208349O0(m214302n()) ? this.picUrl : "";
        sdn sdnVar3 = this.mPresenter;
        if (sdnVar3 == null) {
            Intrinsics.m87502r("mPresenter");
        } else {
            sdnVar = sdnVar3;
        }
        sdnVar.m183513h0(m214303p().getText().toString(), string, str, m214299k().isSelected());
    }

    /* JADX INFO: renamed from: v */
    public final void m214306v(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this.add_pic_view = vDraweeView;
    }

    /* JADX INFO: renamed from: w */
    public final void m214307w(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this.check_view = vDraweeView;
    }

    /* JADX INFO: renamed from: x */
    public final void m214308x(boolean enable) {
        if (enable) {
            m214300l().setBackgroundDrawable(zb2.m217814b("#FE7E1D", 10));
            m214300l().setTextColor(Color.parseColor("#e5ffffff"));
        } else {
            m214300l().setBackgroundDrawable(zb2.m217814b("#07000000", 10));
            m214300l().setTextColor(Color.parseColor("#4c000000"));
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m214309y(@NotNull TextView textView) {
        textView.getClass();
        this.commit_button = textView;
    }

    /* JADX INFO: renamed from: z */
    public final void m214310z(@NotNull EditText editText) {
        editText.getClass();
        this.contact_view = editText;
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
