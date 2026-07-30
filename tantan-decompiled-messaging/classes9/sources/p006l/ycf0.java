package p006l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p000p1.mobile.putong.account.R$string;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.IntlProfileInfo;
import com.tantanapp.common.utils.CrashHelper;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l.hvc0;
import l.s7m;
import l.vwb;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VButton;
import v.VImage;
import v.VRecyclerView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0013\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u000bJ\u0015\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010\u000bJ\u000f\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010\"\u001a\u00020\t2\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f2\b\b\u0002\u0010\u0017\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00106\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0011\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010:\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b7\u00101\u001a\u0004\b8\u00103\"\u0004\b9\u00105R\"\u0010=\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0015\u00101\u001a\u0004\b;\u00103\"\u0004\b<\u00105R\"\u0010D\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010L\u001a\u00020E8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010N¨\u0006O"}, d2 = {"Ll/ycf0;", "Ll/s7m;", "Ll/vcf0;", "Lcom/p1/mobile/android/app/Act;", "act", "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "", "language", "", "u", "(Z)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "c", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "inflateView", "presenter", "e", "(Ll/vcf0;)V", "isLanguage", "n", "s", "destroy", "()V", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "", "", "selectedList", "p", "(Ljava/util/List;Z)V", "a", "Lcom/p1/mobile/android/app/Act;", "f", "()Lcom/p1/mobile/android/app/Act;", "Lv/VImage;", "b", "Lv/VImage;", "get_toolbar_icon", "()Lv/VImage;", "set_toolbar_icon", "(Lv/VImage;)V", "_toolbar_icon", "Lv/VText;", "Lv/VText;", "k", "()Lv/VText;", "set_skip", "(Lv/VText;)V", "_skip", "d", "m", "set_title", "_title", "l", "set_sub_title", "_sub_title", "Lv/VRecyclerView;", "Lv/VRecyclerView;", "j", "()Lv/VRecyclerView;", "set_recycler_info", "(Lv/VRecyclerView;)V", "_recycler_info", "Lv/VButton;", "g", "Lv/VButton;", "i", "()Lv/VButton;", "set_continue_", "(Lv/VButton;)V", "_continue_", "h", "Ll/vcf0;", "b_account_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ycf0 implements s7m<vcf0> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VImage _toolbar_icon;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VText _skip;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VText _title;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VText _sub_title;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VRecyclerView _recycler_info;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VButton _continue_;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public vcf0 presenter;

    /* JADX INFO: renamed from: l.ycf0$a */
    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"l/ycf0$a", "Ll/ldf0$a;", "", "", "selectedList", "", "a", "(Ljava/util/List;)V", "b_account_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C1468a implements ldf0.InterfaceC0971a {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f28127b;

        public C1468a(boolean z) {
            this.f28127b = z;
        }

        @Override // p006l.ldf0.InterfaceC0971a
        /* JADX INFO: renamed from: a */
        public void mo18697a(List<String> selectedList) {
            selectedList.getClass();
            ycf0.this.m28159p(selectedList, this.f28127b);
        }
    }

    public ycf0(@NotNull Act act) {
        act.getClass();
        this.act = act;
    }

    /* JADX INFO: renamed from: a */
    public static void m28143a(ycf0 ycf0Var, boolean z, View view) {
        vcf0 vcf0Var = ycf0Var.presenter;
        if (vcf0Var != null) {
            vcf0Var.m25784p0(z);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m28144b(List list, ycf0 ycf0Var, boolean z, View view) {
        if (vwb.J(list)) {
            return;
        }
        ycf0Var.act.progress(R$string.f216j0);
        mbp.INSTANCE.m19203j(list, z);
        vcf0 vcf0Var = ycf0Var.presenter;
        if (vcf0Var != null) {
            vcf0Var.m25783o0(list, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m28146q(ycf0 ycf0Var, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        ycf0Var.m28159p(list, z);
    }

    /* JADX INFO: renamed from: u */
    private final void m28147u(boolean language) {
        m28157m().setText(hvc0.c(language ? R$string.f122S0 : R$string.f62G0));
        m28156l().setText(hvc0.c(language ? R$string.f107P0 : R$string.f57F0));
        m28146q(this, null, false, 3, null);
        m28160s(language);
    }

    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context m28148C0() {
        return this.act;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final View m28149c(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM28687b = zcf0.m28687b(this, inflater, parent);
        viewM28687b.getClass();
        return viewM28687b;
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void m28153i1(@Nullable vcf0 presenter) {
        this.presenter = presenter;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final Act getAct() {
        return this.act;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final VButton m28152i() {
        VButton vButton = this._continue_;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.r("_continue_");
        return null;
    }

    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m28149c(inflater, parent);
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final VRecyclerView m28154j() {
        VRecyclerView vRecyclerView = this._recycler_info;
        if (vRecyclerView != null) {
            return vRecyclerView;
        }
        Intrinsics.r("_recycler_info");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final VText m28155k() {
        VText vText = this._skip;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_skip");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final VText m28156l() {
        VText vText = this._sub_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_sub_title");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final VText m28157m() {
        VText vText = this._title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_title");
        return null;
    }

    /* JADX INFO: renamed from: n */
    public final void m28158n(final boolean isLanguage) {
        m28152i().setBackgroundResource(v2c0.f24014Z);
        xdl0.E0(m28155k(), new View.OnClickListener() { // from class: l.wcf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ycf0.m28143a(this.f25099a, isLanguage, view);
            }
        });
        m28147u(isLanguage);
    }

    /* JADX INFO: renamed from: p */
    public final void m28159p(final List<String> selectedList, final boolean isLanguage) {
        m28152i().setActivated(!vwb.J(selectedList));
        xdl0.E0(m28152i(), new View.OnClickListener() { // from class: l.xcf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ycf0.m28144b(selectedList, this, isLanguage, view);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public final void m28160s(boolean isLanguage) {
        List<IntlProfileInfo> listM19200g = isLanguage ? mbp.INSTANCE.m19200g() : mbp.INSTANCE.m19199f();
        if (vwb.J(listM19200g)) {
            CrashHelper.c(new Exception("intl get profile info config == null in SignUpIntlEthnicityLanguageAct is language " + isLanguage));
        } else {
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(m28148C0());
            linearLayoutManager.setOrientation(1);
            m28154j().setLayoutManager(linearLayoutManager);
            ldf0 ldf0Var = new ldf0(this.act, listM19200g, isLanguage);
            ldf0Var.m18696L(new C1468a(isLanguage));
            m28154j().setAdapter(ldf0Var);
        }
    }

    public void destroy() {
    }
}
