package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.account.R$string;
import com.p051p1.mobile.putong.data.IntlProfileInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.ijk.media.player.IjkMediaMeta;
import com.tencent.open.SocialConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VButton;
import p151v.VImage;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0013\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u000bJ\u0015\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010\u000bJ\u000f\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010\"\u001a\u00020\t2\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f2\b\b\u0002\u0010\u0017\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00106\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0011\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010:\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b7\u00101\u001a\u0004\b8\u00103\"\u0004\b9\u00105R\"\u0010=\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0015\u00101\u001a\u0004\b;\u00103\"\u0004\b<\u00105R\"\u0010D\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010L\u001a\u00020E8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010N¨\u0006O"}, m88121d2 = {"Ll/flf0;", "Ll/iam;", "Ll/clf0;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "", IjkMediaMeta.IJKM_KEY_LANGUAGE, "", "u", "(Z)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "c", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "inflateView", "presenter", "e", "(Ll/clf0;)V", "isLanguage", "n", BLiveStormDanmakuGiftResourceType.f45294s, "destroy", "()V", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "", "", "selectedList", "p", "(Ljava/util/List;Z)V", "a", "Lcom/p1/mobile/android/app/Act;", "f", "()Lcom/p1/mobile/android/app/Act;", "Lv/VImage;", "b", "Lv/VImage;", "get_toolbar_icon", "()Lv/VImage;", "set_toolbar_icon", "(Lv/VImage;)V", "_toolbar_icon", "Lv/VText;", "Lv/VText;", "k", "()Lv/VText;", "set_skip", "(Lv/VText;)V", "_skip", Constants.INAPP_DATA_TAG, "m", "set_title", "_title", BLiveStormDanmakuGiftResourceType.f45292l, "set_sub_title", "_sub_title", "Lv/VRecyclerView;", "Lv/VRecyclerView;", "j", "()Lv/VRecyclerView;", "set_recycler_info", "(Lv/VRecyclerView;)V", "_recycler_info", "Lv/VButton;", "g", "Lv/VButton;", RXScreenCaptureService.KEY_INDEX, "()Lv/VButton;", "set_continue_", "(Lv/VButton;)V", "_continue_", "h", "Ll/clf0;", "b_account_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class flf0 implements iam<clf0> {

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
    public clf0 presenter;

    /* JADX INFO: renamed from: l.flf0$a */
    @Metadata(m88120d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m88121d2 = {"l/flf0$a", "Ll/slf0$a;", "", "", "selectedList", "", "a", "(Ljava/util/List;)V", "b_account_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C17006a implements slf0.InterfaceC20093a {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f99652b;

        public C17006a(boolean z) {
            this.f99652b = z;
        }

        @Override // p153l.slf0.InterfaceC20093a
        /* JADX INFO: renamed from: a */
        public void mo126139a(List<String> selectedList) {
            selectedList.getClass();
            flf0.this.m126137p(selectedList, this.f99652b);
        }
    }

    public flf0(@NotNull Act act) {
        act.getClass();
        this.act = act;
    }

    /* JADX INFO: renamed from: a */
    public static void m126123a(flf0 flf0Var, boolean z, View view) {
        clf0 clf0Var = flf0Var.presenter;
        if (clf0Var != null) {
            clf0Var.m110620p0(z);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m126124b(List list, flf0 flf0Var, boolean z, View view) {
        if (jyb.m147479J(list)) {
            return;
        }
        flf0Var.act.progress(R$string.f16946j0);
        mdp.INSTANCE.m157988j(list, z);
        clf0 clf0Var = flf0Var.presenter;
        if (clf0Var != null) {
            clf0Var.m110619o0(list, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m126126q(flf0 flf0Var, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        flf0Var.m126137p(list, z);
    }

    /* JADX INFO: renamed from: u */
    private final void m126127u(boolean language) {
        m126135m().setText(k3d0.m148007c(language ? R$string.f16852S0 : R$string.f16792G0));
        m126134l().setText(k3d0.m148007c(language ? R$string.f16837P0 : R$string.f16787F0));
        m126126q(this, null, false, 3, null);
        m126138s(language);
    }

    @Override // p153l.iam
    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.act;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final View m126128c(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM130652b = glf0.m130652b(this, inflater, parent);
        viewM130652b.getClass();
        return viewM130652b;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(@Nullable clf0 presenter) {
        this.presenter = presenter;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final Act getAct() {
        return this.act;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final VButton m126131i() {
        VButton vButton = this._continue_;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.m88391r("_continue_");
        return null;
    }

    @Override // p153l.iam
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m126128c(inflater, parent);
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final VRecyclerView m126132j() {
        VRecyclerView vRecyclerView = this._recycler_info;
        if (vRecyclerView != null) {
            return vRecyclerView;
        }
        Intrinsics.m88391r("_recycler_info");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final VText m126133k() {
        VText vText = this._skip;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_skip");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final VText m126134l() {
        VText vText = this._sub_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_sub_title");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final VText m126135m() {
        VText vText = this._title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_title");
        return null;
    }

    /* JADX INFO: renamed from: n */
    public final void m126136n(final boolean isLanguage) {
        m126131i().setBackgroundResource(bbc0.f75856Z);
        bnl0.m105509E0(m126133k(), new View.OnClickListener() { // from class: l.dlf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                flf0.m126123a(this.f89529a, isLanguage, view);
            }
        });
        m126127u(isLanguage);
    }

    /* JADX INFO: renamed from: p */
    public final void m126137p(final List<String> selectedList, final boolean isLanguage) {
        m126131i().setActivated(!jyb.m147479J(selectedList));
        bnl0.m105509E0(m126131i(), new View.OnClickListener() { // from class: l.elf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                flf0.m126124b(selectedList, this, isLanguage, view);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public final void m126138s(boolean isLanguage) {
        List<IntlProfileInfo> listM157985g = isLanguage ? mdp.INSTANCE.m157985g() : mdp.INSTANCE.m157984f();
        if (jyb.m147479J(listM157985g)) {
            CrashHelper.m82479c(new Exception("intl get profile info config == null in SignUpIntlEthnicityLanguageAct is language " + isLanguage));
        } else {
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
            linearLayoutManager.setOrientation(1);
            m126132j().setLayoutManager(linearLayoutManager);
            slf0 slf0Var = new slf0(this.act, listM157985g, isLanguage);
            slf0Var.m186571L(new C17006a(isLanguage));
            m126132j().setAdapter(slf0Var);
        }
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
