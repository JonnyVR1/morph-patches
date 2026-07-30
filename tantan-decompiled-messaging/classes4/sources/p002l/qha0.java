package p002l;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.C0096a;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.ProfileInfoLoopEditAct;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.base.ProfileEditLoopBaseFrag;
import com.p000p1.mobile.putong.core.p001ui.profile.views.ProfileLoopActionLayout;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.profile.R;
import com.p1.mobile.putong.data.IntlProfileInfo;
import com.p1.mobile.putong.data.Profile;
import com.p1.mobile.putong.data.User;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l.e3c0;
import l.hvc0;
import l.pha0;
import l.rha0;
import l.s7m;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VRecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0010J\u000f\u0010\u0015\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\tJ\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001e\u001a\u00020\u00072\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00192\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\u001c¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u001cH\u0002¢\u0006\u0004\b(\u0010'J\u000f\u0010)\u001a\u00020\u0007H\u0002¢\u0006\u0004\b)\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000f\u0010*\u001a\u0004\b+\u0010,R\"\u00104\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010;\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b(\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010B\u001a\u00020<8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0012\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010CR\u0018\u0010F\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010E¨\u0006G"}, d2 = {"Ll/qha0;", "Ll/s7m;", "Ll/pha0;", "Lcom/p1/mobile/putong/core/ui/profile/loop/base/ProfileEditLoopBaseFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/ui/profile/loop/base/ProfileEditLoopBaseFrag;)V", "", "r", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "a", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", "d", "(Ll/pha0;)V", "inflateView", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "", "Lcom/p1/mobile/putong/data/IntlProfileInfo;", "configInfo", "", "languageType", "m", "(Ljava/util/List;Z)V", "Lcom/p1/mobile/putong/core/ui/profile/loop/ProfileInfoLoopEditAct;", "i", "()Lcom/p1/mobile/putong/core/ui/profile/loop/ProfileInfoLoopEditAct;", "Landroid/os/Bundle;", "f", "()Landroid/os/Bundle;", "e", "()Z", "c", "n", "Lcom/p1/mobile/putong/core/ui/profile/loop/base/ProfileEditLoopBaseFrag;", "getFrag", "()Lcom/p1/mobile/putong/core/ui/profile/loop/base/ProfileEditLoopBaseFrag;", "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", "k", "()Landroid/widget/TextView;", "set_first_title", "(Landroid/widget/TextView;)V", "_first_title", "Lv/VRecyclerView;", "Lv/VRecyclerView;", "l", "()Lv/VRecyclerView;", "set_recycler_info", "(Lv/VRecyclerView;)V", "_recycler_info", "Lcom/p1/mobile/putong/core/ui/profile/views/ProfileLoopActionLayout;", "Lcom/p1/mobile/putong/core/ui/profile/views/ProfileLoopActionLayout;", "j", "()Lcom/p1/mobile/putong/core/ui/profile/views/ProfileLoopActionLayout;", "set_action_view", "(Lcom/p1/mobile/putong/core/ui/profile/views/ProfileLoopActionLayout;)V", "_action_view", "Ll/pha0;", "Ll/lha0;", "Ll/lha0;", "adapter", "profile_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class qha0 implements s7m<pha0> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ProfileEditLoopBaseFrag frag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public TextView _first_title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VRecyclerView _recycler_info;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public ProfileLoopActionLayout _action_view;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public pha0 presenter;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public lha0 adapter;

    /* JADX INFO: renamed from: l.qha0$a */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"l/qha0$a", "Ll/lha0$a;", "", "multipleChoice", "", "a", "(Z)V", "profile_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0789a implements lha0.InterfaceC0660a {
        public C0789a() {
        }

        @Override // p002l.lha0.InterfaceC0660a
        /* JADX INFO: renamed from: a */
        public void mo17261a(boolean multipleChoice) {
            qha0 qha0Var = qha0.this;
            if (multipleChoice) {
                qha0Var.m21287n();
            } else {
                qha0Var.m21283j().m3521f();
            }
        }
    }

    public qha0(@NotNull ProfileEditLoopBaseFrag profileEditLoopBaseFrag) {
        profileEditLoopBaseFrag.getClass();
        this.frag = profileEditLoopBaseFrag;
    }

    /* JADX INFO: renamed from: r */
    private final void m21274r() {
        C0096a c0096aM1991a2;
        m21283j().m3527l(this.frag);
        ProfileInfoLoopEditAct profileInfoLoopEditActM21281i = m21281i();
        if (profileInfoLoopEditActM21281i == null || (c0096aM1991a2 = profileInfoLoopEditActM21281i.m1991a2()) == null) {
            return;
        }
        c0096aM1991a2.m2030W0(this.frag);
    }

    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context m21275C0() {
        Act act = this.frag.act();
        act.getClass();
        return act;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final View m21276a(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewB = rha0.b(this, inflater, parent);
        viewB.getClass();
        return viewB;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m21277c() {
        lha0 lha0Var = this.adapter;
        return (lha0Var != null ? lha0Var.m17258I() : 0) > 0;
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void m21282i1(@Nullable pha0 presenter) {
        this.presenter = presenter;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m21279e() {
        pha0 pha0Var = this.presenter;
        if (Intrinsics.d(pha0Var != null ? Boolean.valueOf(pha0Var.h0()) : null, Boolean.TRUE)) {
            return m21277c();
        }
        return true;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final Bundle m21280f() {
        return this.frag.getArguments();
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public final ProfileInfoLoopEditAct m21281i() {
        Object objM21275C0 = m21275C0();
        if (objM21275C0 instanceof ProfileInfoLoopEditAct) {
            return (ProfileInfoLoopEditAct) objM21275C0;
        }
        return null;
    }

    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM21276a = m21276a(inflater, parent);
        m21274r();
        return viewM21276a;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final ProfileLoopActionLayout m21283j() {
        ProfileLoopActionLayout profileLoopActionLayout = this._action_view;
        if (profileLoopActionLayout != null) {
            return profileLoopActionLayout;
        }
        Intrinsics.r("_action_view");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final TextView m21284k() {
        TextView textView = this._first_title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_first_title");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final VRecyclerView m21285l() {
        VRecyclerView vRecyclerView = this._recycler_info;
        if (vRecyclerView != null) {
            return vRecyclerView;
        }
        Intrinsics.r("_recycler_info");
        return null;
    }

    /* JADX INFO: renamed from: m */
    public final void m21286m(@Nullable List<? extends IntlProfileInfo> configInfo, boolean languageType) {
        C0096a c0096aM1991a2;
        User userM2043u0;
        m21284k().setText(languageType ? R.string.q1 : R.string.p1);
        if (configInfo == null) {
            return;
        }
        ProfileInfoLoopEditAct profileInfoLoopEditActM21281i = m21281i();
        if (profileInfoLoopEditActM21281i != null && (c0096aM1991a2 = profileInfoLoopEditActM21281i.m1991a2()) != null && (userM2043u0 = c0096aM1991a2.m2043u0()) != null) {
            Profile profile = userM2043u0.profile;
            List<String> list = languageType ? profile.extensions.basic.language : profile.extensions.basic.ethnicity;
            if (list != null) {
                for (String str : list) {
                    IntlProfileInfo intlProfileInfo = new IntlProfileInfo();
                    intlProfileInfo.key = str;
                    int iIndexOf = configInfo.indexOf(intlProfileInfo);
                    if (iIndexOf >= 0) {
                        configInfo.get(iIndexOf).selected = true;
                    }
                }
            }
        }
        m21287n();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(m21275C0());
        linearLayoutManager.setOrientation(1);
        m21285l().setLayoutManager(linearLayoutManager);
        lha0 lha0Var = new lha0(configInfo, languageType);
        this.adapter = lha0Var;
        lha0Var.m17260L(new C0789a());
        m21285l().setAdapter(this.adapter);
        xdl0.M(m21283j(), languageType);
    }

    /* JADX INFO: renamed from: n */
    public final void m21287n() {
        boolean zM21277c = m21277c();
        m21283j().f1985b.setEnabled(zM21277c);
        m21283j().f1985b.setBackground(hvc0.b(zM21277c ? e3c0.f : e3c0.r1));
    }

    public void destroy() {
    }
}
