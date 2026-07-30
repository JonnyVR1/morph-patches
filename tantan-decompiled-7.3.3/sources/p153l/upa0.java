package p153l;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.C8834a;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.ProfileInfoLoopEditAct;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.base.ProfileEditLoopBaseFrag;
import com.p051p1.mobile.putong.core.p058ui.profile.views.ProfileLoopActionLayout;
import com.p051p1.mobile.putong.core.profile.R$string;
import com.p051p1.mobile.putong.data.IntlProfileInfo;
import com.p051p1.mobile.putong.data.Profile;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VRecyclerView;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0010J\u000f\u0010\u0015\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\tJ\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001e\u001a\u00020\u00072\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00192\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\u001c¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u001cH\u0002¢\u0006\u0004\b(\u0010'J\u000f\u0010)\u001a\u00020\u0007H\u0002¢\u0006\u0004\b)\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000f\u0010*\u001a\u0004\b+\u0010,R\"\u00104\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010;\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b(\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010B\u001a\u00020<8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0012\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010CR\u0018\u0010F\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010E¨\u0006G"}, m88121d2 = {"Ll/upa0;", "Ll/iam;", "Ll/tpa0;", "Lcom/p1/mobile/putong/core/ui/profile/loop/base/ProfileEditLoopBaseFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/ui/profile/loop/base/ProfileEditLoopBaseFrag;)V", "", "r", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "a", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", Constants.INAPP_DATA_TAG, "(Ll/tpa0;)V", "inflateView", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "", "Lcom/p1/mobile/putong/data/IntlProfileInfo;", "configInfo", "", "languageType", "m", "(Ljava/util/List;Z)V", "Lcom/p1/mobile/putong/core/ui/profile/loop/ProfileInfoLoopEditAct;", RXScreenCaptureService.KEY_INDEX, "()Lcom/p1/mobile/putong/core/ui/profile/loop/ProfileInfoLoopEditAct;", "Landroid/os/Bundle;", "f", "()Landroid/os/Bundle;", "e", "()Z", "c", "n", "Lcom/p1/mobile/putong/core/ui/profile/loop/base/ProfileEditLoopBaseFrag;", "getFrag", "()Lcom/p1/mobile/putong/core/ui/profile/loop/base/ProfileEditLoopBaseFrag;", "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", "k", "()Landroid/widget/TextView;", "set_first_title", "(Landroid/widget/TextView;)V", "_first_title", "Lv/VRecyclerView;", "Lv/VRecyclerView;", BLiveStormDanmakuGiftResourceType.f45292l, "()Lv/VRecyclerView;", "set_recycler_info", "(Lv/VRecyclerView;)V", "_recycler_info", "Lcom/p1/mobile/putong/core/ui/profile/views/ProfileLoopActionLayout;", "Lcom/p1/mobile/putong/core/ui/profile/views/ProfileLoopActionLayout;", "j", "()Lcom/p1/mobile/putong/core/ui/profile/views/ProfileLoopActionLayout;", "set_action_view", "(Lcom/p1/mobile/putong/core/ui/profile/views/ProfileLoopActionLayout;)V", "_action_view", "Ll/tpa0;", "Ll/ppa0;", "Ll/ppa0;", "adapter", "profile_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class upa0 implements iam<tpa0> {

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
    public tpa0 presenter;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public ppa0 adapter;

    /* JADX INFO: renamed from: l.upa0$a */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"l/upa0$a", "Ll/ppa0$a;", "", "multipleChoice", "", "a", "(Z)V", "profile_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C20612a implements ppa0.InterfaceC19413a {
        public C20612a() {
        }

        @Override // p153l.ppa0.InterfaceC19413a
        /* JADX INFO: renamed from: a */
        public void mo173187a(boolean multipleChoice) {
            upa0 upa0Var = upa0.this;
            if (multipleChoice) {
                upa0Var.m197065n();
            } else {
                upa0Var.m197061j().m54146f();
            }
        }
    }

    public upa0(@NotNull ProfileEditLoopBaseFrag profileEditLoopBaseFrag) {
        profileEditLoopBaseFrag.getClass();
        this.frag = profileEditLoopBaseFrag;
    }

    /* JADX INFO: renamed from: r */
    private final void m197054r() {
        C8834a c8834aM52692b2;
        m197061j().m54152l(this.frag);
        ProfileInfoLoopEditAct profileInfoLoopEditActM197060i = m197060i();
        if (profileInfoLoopEditActM197060i == null || (c8834aM52692b2 = profileInfoLoopEditActM197060i.m52692b2()) == null) {
            return;
        }
        c8834aM52692b2.m52731W0(this.frag);
    }

    @Override // p153l.iam
    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        Act act = this.frag.act();
        act.getClass();
        return act;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final View m197055a(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM202206b = vpa0.m202206b(this, inflater, parent);
        viewM202206b.getClass();
        return viewM202206b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m197056c() {
        ppa0 ppa0Var = this.adapter;
        return (ppa0Var != null ? ppa0Var.m173184I() : 0) > 0;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(@Nullable tpa0 presenter) {
        this.presenter = presenter;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m197058e() {
        tpa0 tpa0Var = this.presenter;
        if (Intrinsics.m88377d(tpa0Var != null ? Boolean.valueOf(tpa0Var.getLanguageType()) : null, Boolean.TRUE)) {
            return m197056c();
        }
        return true;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final Bundle m197059f() {
        return this.frag.getArguments();
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public final ProfileInfoLoopEditAct m197060i() {
        Context context = getContext();
        if (context instanceof ProfileInfoLoopEditAct) {
            return (ProfileInfoLoopEditAct) context;
        }
        return null;
    }

    @Override // p153l.iam
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM197055a = m197055a(inflater, parent);
        m197054r();
        return viewM197055a;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final ProfileLoopActionLayout m197061j() {
        ProfileLoopActionLayout profileLoopActionLayout = this._action_view;
        if (profileLoopActionLayout != null) {
            return profileLoopActionLayout;
        }
        Intrinsics.m88391r("_action_view");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final TextView m197062k() {
        TextView textView = this._first_title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_first_title");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final VRecyclerView m197063l() {
        VRecyclerView vRecyclerView = this._recycler_info;
        if (vRecyclerView != null) {
            return vRecyclerView;
        }
        Intrinsics.m88391r("_recycler_info");
        return null;
    }

    /* JADX INFO: renamed from: m */
    public final void m197064m(@Nullable List<? extends IntlProfileInfo> configInfo, boolean languageType) {
        C8834a c8834aM52692b2;
        User userM52742u0;
        m197062k().setText(languageType ? R$string.f28761q1 : R$string.f28755p1);
        if (configInfo == null) {
            return;
        }
        ProfileInfoLoopEditAct profileInfoLoopEditActM197060i = m197060i();
        if (profileInfoLoopEditActM197060i != null && (c8834aM52692b2 = profileInfoLoopEditActM197060i.m52692b2()) != null && (userM52742u0 = c8834aM52692b2.m52742u0()) != null) {
            Profile profile = userM52742u0.profile;
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
        m197065n();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(1);
        m197063l().setLayoutManager(linearLayoutManager);
        ppa0 ppa0Var = new ppa0(configInfo, languageType);
        this.adapter = ppa0Var;
        ppa0Var.m173186L(new C20612a());
        m197063l().setAdapter(this.adapter);
        bnl0.m105524M(m197061j(), languageType);
    }

    /* JADX INFO: renamed from: n */
    public final void m197065n() {
        boolean zM197056c = m197056c();
        m197061j().f35011b.setEnabled(zM197056c);
        m197061j().f35011b.setBackground(k3d0.m148006b(zM197056c ? kbc0.f124866f : kbc0.f124906r1));
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
