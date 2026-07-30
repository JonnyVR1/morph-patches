package p153l;

import android.content.Context;
import android.graphics.Color;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.external.R$string;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VDraweeView;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u0004J\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\rJ\u000f\u0010\u001a\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001a\u0010\u0004J\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!R\"\u0010#\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010*\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00100\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u0010+\u001a\u0004\b1\u0010-\"\u0004\b2\u0010/R\"\u00104\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010:\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b:\u00105\u001a\u0004\b;\u00107\"\u0004\b<\u00109R\"\u0010>\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010D\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bD\u00105\u001a\u0004\bE\u00107\"\u0004\bF\u00109R\u0014\u0010G\u001a\u00020\u001e8\u0002X\u0082D¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010I\u001a\u00020\u001e8\u0002X\u0082D¢\u0006\u0006\n\u0004\bI\u0010HR\"\u0010J\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010H\u001a\u0004\bK\u0010L\"\u0004\bM\u0010!R\u0016\u0010N\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bN\u0010O¨\u0006P"}, m88121d2 = {"Ll/yfn;", "Ll/iam;", "Ll/sfn;", "<init>", "()V", "Landroid/view/View;", OMSTemplateModeType.view, "", BLiveStormDanmakuGiftResourceType.f45294s, "(Landroid/view/View;)V", "", "enable", BaseSei.f14624X, "(Z)V", "u", "presenter", RXScreenCaptureService.KEY_INDEX, "(Ll/sfn;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "isChecked", "E", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "", "url", c4s.C_ZONE, "(Ljava/lang/String;)V", "Lv/navigationbar/VNavigationBar;", "_page_title_bar", "Lv/navigationbar/VNavigationBar;", "q", "()Lv/navigationbar/VNavigationBar;", "F", "(Lv/navigationbar/VNavigationBar;)V", "Landroid/widget/EditText;", "desc_view", "Landroid/widget/EditText;", "p", "()Landroid/widget/EditText;", "B", "(Landroid/widget/EditText;)V", "contact_view", "m", BaseSei.f14626Z, "Lv/VDraweeView;", "add_pic_view", "Lv/VDraweeView;", "j", "()Lv/VDraweeView;", ResourceDirection.f39656v, "(Lv/VDraweeView;)V", "delete_button", "n", "A", "Landroid/widget/TextView;", "commit_button", "Landroid/widget/TextView;", BLiveStormDanmakuGiftResourceType.f45292l, "()Landroid/widget/TextView;", BaseSei.f14625Y, "(Landroid/widget/TextView;)V", "check_view", "k", "w", "addImageUrl", "Ljava/lang/String;", "deleteImageUrl", "picUrl", "getPicUrl", "()Ljava/lang/String;", "setPicUrl", "mPresenter", "Ll/sfn;", "external_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class yfn implements iam<sfn> {
    public VNavigationBar _page_title_bar;
    public VDraweeView add_pic_view;
    public VDraweeView check_view;
    public TextView commit_button;
    public EditText contact_view;
    public VDraweeView delete_button;
    public EditText desc_view;
    private sfn mPresenter;

    @NotNull
    private final String addImageUrl = "https://static.tancdn.com/pe-webplatform/r94df-FelenNB--G0LjMxzae.png";

    @NotNull
    private final String deleteImageUrl = "https://static.tancdn.com/pe-webplatform/35-DAxTyz2O3o1xjcbhGLgYz.png";

    @NotNull
    private String picUrl = "";

    /* JADX INFO: renamed from: l.yfn$a */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"l/yfn$a", "Ll/jri0;", "Landroid/text/Editable;", BLiveStormDanmakuGiftResourceType.f45294s, "", "afterTextChanged", "(Landroid/text/Editable;)V", "external_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C21577a extends jri0 {
        public C21577a() {
        }

        @Override // p153l.jri0, android.text.TextWatcher
        public void afterTextChanged(Editable s) {
            super.afterTextChanged(s);
            if (s == null || StringsKt.m94324Z0(s.toString()).toString().length() == 0) {
                yfn.this.m215806x(false);
            } else {
                yfn.this.m215806x(true);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m215783a(yfn yfnVar, View view) {
        izs.m142868s("context_common", yfnVar.m215796j(), yfnVar.addImageUrl);
        yfnVar.m215800n().setVisibility(8);
        yfnVar.picUrl = "";
    }

    /* JADX INFO: renamed from: b */
    public static void m215784b(yfn yfnVar, View view) {
        if (jsi0.m146843b(yfnVar.picUrl)) {
            sfn sfnVar = yfnVar.mPresenter;
            if (sfnVar == null) {
                Intrinsics.m88391r("mPresenter");
                sfnVar = null;
            }
            sfnVar.m185632k0();
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m215785c(yfn yfnVar, View view) {
        yfnVar.m215797k().setSelected(!yfnVar.m215797k().isSelected());
        yfnVar.m215793E(yfnVar.m215797k().isSelected());
    }

    /* JADX INFO: renamed from: d */
    public static void m215786d(yfn yfnVar, View view) {
        sfn sfnVar = yfnVar.mPresenter;
        if (sfnVar == null) {
            Intrinsics.m88391r("mPresenter");
            sfnVar = null;
        }
        sfnVar.m185633l0();
    }

    /* JADX INFO: renamed from: e */
    public static void m215787e(yfn yfnVar, View view) {
        yfnVar.m215803u();
    }

    /* JADX INFO: renamed from: s */
    private final void m215789s(View view) {
        View viewFindViewById = view.findViewById(ldc0.f131547f1);
        viewFindViewById.getClass();
        m215794F((VNavigationBar) viewFindViewById);
        View viewFindViewById2 = view.findViewById(ldc0.f131516X);
        viewFindViewById2.getClass();
        m215791B((EditText) viewFindViewById2);
        View viewFindViewById3 = view.findViewById(ldc0.f131474K);
        viewFindViewById3.getClass();
        m215808z((EditText) viewFindViewById3);
        View viewFindViewById4 = view.findViewById(ldc0.f131537d);
        viewFindViewById4.getClass();
        m215804v((VDraweeView) viewFindViewById4);
        View viewFindViewById5 = view.findViewById(ldc0.f131504T);
        viewFindViewById5.getClass();
        m215790A((VDraweeView) viewFindViewById5);
        View viewFindViewById6 = view.findViewById(ldc0.f131462H);
        viewFindViewById6.getClass();
        m215807y((TextView) viewFindViewById6);
        View viewFindViewById7 = view.findViewById(ldc0.f131450E);
        viewFindViewById7.getClass();
        m215805w((VDraweeView) viewFindViewById7);
        m215802q().setLeftIconDrawable(tu0.m192702b(view.getContext(), nbc0.f141094D));
        m215802q().setLeftIconOnClick(new View.OnClickListener() { // from class: l.tfn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                yfn.m215786d(this.f173981a, view2);
            }
        });
        m215802q().setTitle(R$string.f45723M);
        izs.m142868s("context_common", m215796j(), this.addImageUrl);
        izs.m142868s("context_common", m215800n(), this.deleteImageUrl);
        bnl0.m105509E0(m215798l(), new View.OnClickListener() { // from class: l.ufn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                yfn.m215787e(this.f178792a, view2);
            }
        });
        bnl0.m105509E0(m215796j(), new View.OnClickListener() { // from class: l.vfn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                yfn.m215784b(this.f183959a, view2);
            }
        });
        bnl0.m105509E0(m215800n(), new View.OnClickListener() { // from class: l.wfn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                yfn.m215783a(this.f188863a, view2);
            }
        });
        bnl0.m105509E0(m215797k(), new View.OnClickListener() { // from class: l.xfn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                yfn.m215785c(this.f194074a, view2);
            }
        });
        m215797k().setSelected(true);
        m215793E(true);
        m215801p().addTextChangedListener(new C21577a());
        m215806x(false);
    }

    /* JADX INFO: renamed from: A */
    public final void m215790A(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this.delete_button = vDraweeView;
    }

    /* JADX INFO: renamed from: B */
    public final void m215791B(@NotNull EditText editText) {
        editText.getClass();
        this.desc_view = editText;
    }

    /* JADX INFO: renamed from: C */
    public final void m215792C(@NotNull String url) {
        url.getClass();
        this.picUrl = url;
        izs.m142868s("context_common", m215796j(), this.picUrl);
        bnl0.m105524M(m215800n(), true);
    }

    @Override // p153l.iam
    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        sfn sfnVar = this.mPresenter;
        if (sfnVar == null) {
            Intrinsics.m88391r("mPresenter");
            sfnVar = null;
        }
        return sfnVar.getAct();
    }

    /* JADX INFO: renamed from: E */
    public final void m215793E(boolean isChecked) {
        if (isChecked) {
            izs.m142868s("context_square", m215797k(), "https://fe-static.tancdn.com/v1/images/eyJpZCI6IjJBSDdINkFRMlpNTjZKWVVNRzM0NVJJSlFSR0lTUDEzIiwidyI6NzIsImgiOjcyLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NTEwMDExNjkzMzcyMDIzNTc1fQ.webp");
        } else {
            izs.m142868s("context_square", m215797k(), "https://fe-static.tancdn.com/v1/images/eyJpZCI6IjRET0ZKTkZZV1paQkRCQkI3NUlGU1FSUlBZRFpFRjEzIiwidyI6MjQsImgiOjI0LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MH0.webp");
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m215794F(@NotNull VNavigationBar vNavigationBar) {
        vNavigationBar.getClass();
        this._page_title_bar = vNavigationBar;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(@NotNull sfn presenter) {
        presenter.getClass();
        this.mPresenter = presenter;
    }

    @Override // p153l.iam
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewInflate = inflater.inflate(xec0.f193927z, parent, false);
        viewInflate.getClass();
        m215789s(viewInflate);
        return viewInflate;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final VDraweeView m215796j() {
        VDraweeView vDraweeView = this.add_pic_view;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("add_pic_view");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final VDraweeView m215797k() {
        VDraweeView vDraweeView = this.check_view;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("check_view");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final TextView m215798l() {
        TextView textView = this.commit_button;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("commit_button");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final EditText m215799m() {
        EditText editText = this.contact_view;
        if (editText != null) {
            return editText;
        }
        Intrinsics.m88391r("contact_view");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final VDraweeView m215800n() {
        VDraweeView vDraweeView = this.delete_button;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("delete_button");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final EditText m215801p() {
        EditText editText = this.desc_view;
        if (editText != null) {
            return editText;
        }
        Intrinsics.m88391r("desc_view");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final VNavigationBar m215802q() {
        VNavigationBar vNavigationBar = this._page_title_bar;
        if (vNavigationBar != null) {
            return vNavigationBar;
        }
        Intrinsics.m88391r("_page_title_bar");
        return null;
    }

    /* JADX INFO: renamed from: u */
    public final void m215803u() {
        if (m215801p().getText() == null || m215801p().getText().length() == 0) {
            return;
        }
        sfn sfnVar = null;
        if (m215797k().isSelected()) {
            sfn sfnVar2 = this.mPresenter;
            if (sfnVar2 == null) {
                Intrinsics.m88391r("mPresenter");
                sfnVar2 = null;
            }
            sfnVar2.m185635n0();
        }
        String string = m215799m().getText() != null ? m215799m().getText().toString() : "";
        String str = bnl0.m105529O0(m215800n()) ? this.picUrl : "";
        sfn sfnVar3 = this.mPresenter;
        if (sfnVar3 == null) {
            Intrinsics.m88391r("mPresenter");
        } else {
            sfnVar = sfnVar3;
        }
        sfnVar.m185629h0(m215801p().getText().toString(), string, str, m215797k().isSelected());
    }

    /* JADX INFO: renamed from: v */
    public final void m215804v(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this.add_pic_view = vDraweeView;
    }

    /* JADX INFO: renamed from: w */
    public final void m215805w(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this.check_view = vDraweeView;
    }

    /* JADX INFO: renamed from: x */
    public final void m215806x(boolean enable) {
        if (enable) {
            m215798l().setBackgroundDrawable(gc2.m129823b("#FE7E1D", 10));
            m215798l().setTextColor(Color.parseColor("#e5ffffff"));
        } else {
            m215798l().setBackgroundDrawable(gc2.m129823b("#07000000", 10));
            m215798l().setTextColor(Color.parseColor("#4c000000"));
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m215807y(@NotNull TextView textView) {
        textView.getClass();
        this.commit_button = textView;
    }

    /* JADX INFO: renamed from: z */
    public final void m215808z(@NotNull EditText editText) {
        editText.getClass();
        this.contact_view = editText;
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
