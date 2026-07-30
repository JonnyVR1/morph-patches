package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.account.R$string;
import com.p046p1.mobile.putong.data.IntlProfileInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.ijk.media.player.IjkMediaMeta;
import com.tencent.open.SocialConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VButton;
import p147v.VImage;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0013\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u000bJ\u0015\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010\u000bJ\u000f\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010\"\u001a\u00020\t2\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f2\b\b\u0002\u0010\u0017\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00106\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0011\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010:\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b7\u00101\u001a\u0004\b8\u00103\"\u0004\b9\u00105R\"\u0010=\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0015\u00101\u001a\u0004\b;\u00103\"\u0004\b<\u00105R\"\u0010D\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010L\u001a\u00020E8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010N¨\u0006O"}, m87232d2 = {"Ll/ycf0;", "Ll/s7m;", "Ll/vcf0;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "", IjkMediaMeta.IJKM_KEY_LANGUAGE, "", "u", "(Z)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "c", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "inflateView", "presenter", "e", "(Ll/vcf0;)V", "isLanguage", "n", BLiveStormDanmakuGiftResourceType.f44446s, "destroy", "()V", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "", "", "selectedList", "p", "(Ljava/util/List;Z)V", "a", "Lcom/p1/mobile/android/app/Act;", "f", "()Lcom/p1/mobile/android/app/Act;", "Lv/VImage;", "b", "Lv/VImage;", "get_toolbar_icon", "()Lv/VImage;", "set_toolbar_icon", "(Lv/VImage;)V", "_toolbar_icon", "Lv/VText;", "Lv/VText;", "k", "()Lv/VText;", "set_skip", "(Lv/VText;)V", "_skip", Constants.INAPP_DATA_TAG, "m", "set_title", "_title", BLiveStormDanmakuGiftResourceType.f44444l, "set_sub_title", "_sub_title", "Lv/VRecyclerView;", "Lv/VRecyclerView;", "j", "()Lv/VRecyclerView;", "set_recycler_info", "(Lv/VRecyclerView;)V", "_recycler_info", "Lv/VButton;", "g", "Lv/VButton;", RXScreenCaptureService.KEY_INDEX, "()Lv/VButton;", "set_continue_", "(Lv/VButton;)V", "_continue_", "h", "Ll/vcf0;", "b_account_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
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
    @Metadata(m87231d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m87232d2 = {"l/ycf0$a", "Ll/ldf0$a;", "", "", "selectedList", "", "a", "(Ljava/util/List;)V", "b_account_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C21366a implements ldf0.InterfaceC18197a {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f197447b;

        public C21366a(boolean z) {
            this.f197447b = z;
        }

        @Override // p149l.ldf0.InterfaceC18197a
        /* JADX INFO: renamed from: a */
        public void mo149441a(List<String> selectedList) {
            selectedList.getClass();
            ycf0.this.m214157p(selectedList, this.f197447b);
        }
    }

    public ycf0(@NotNull Act act) {
        act.getClass();
        this.act = act;
    }

    /* JADX INFO: renamed from: a */
    public static void m214143a(ycf0 ycf0Var, boolean z, View view) {
        vcf0 vcf0Var = ycf0Var.presenter;
        if (vcf0Var != null) {
            vcf0Var.m197760p0(z);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m214144b(List list, ycf0 ycf0Var, boolean z, View view) {
        if (vwb.m200296J(list)) {
            return;
        }
        ycf0Var.act.progress(R$string.f16227j0);
        mbp.INSTANCE.m153971j(list, z);
        vcf0 vcf0Var = ycf0Var.presenter;
        if (vcf0Var != null) {
            vcf0Var.m197759o0(list, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m214146q(ycf0 ycf0Var, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        ycf0Var.m214157p(list, z);
    }

    /* JADX INFO: renamed from: u */
    private final void m214147u(boolean language) {
        m214155m().setText(hvc0.m133156c(language ? R$string.f16133S0 : R$string.f16073G0));
        m214154l().setText(hvc0.m133156c(language ? R$string.f16118P0 : R$string.f16068F0));
        m214146q(this, null, false, 3, null);
        m214158s(language);
    }

    @Override // p149l.s7m
    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.act;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final View m214148c(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM218022b = zcf0.m218022b(this, inflater, parent);
        viewM218022b.getClass();
        return viewM218022b;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(@Nullable vcf0 presenter) {
        this.presenter = presenter;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final Act getAct() {
        return this.act;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final VButton m214151i() {
        VButton vButton = this._continue_;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.m87502r("_continue_");
        return null;
    }

    @Override // p149l.s7m
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        return m214148c(inflater, parent);
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final VRecyclerView m214152j() {
        VRecyclerView vRecyclerView = this._recycler_info;
        if (vRecyclerView != null) {
            return vRecyclerView;
        }
        Intrinsics.m87502r("_recycler_info");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final VText m214153k() {
        VText vText = this._skip;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_skip");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final VText m214154l() {
        VText vText = this._sub_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_sub_title");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final VText m214155m() {
        VText vText = this._title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_title");
        return null;
    }

    /* JADX INFO: renamed from: n */
    public final void m214156n(final boolean isLanguage) {
        m214151i().setBackgroundResource(v2c0.f179450Z);
        xdl0.m208329E0(m214153k(), new View.OnClickListener() { // from class: l.wcf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ycf0.m214143a(this.f185688a, isLanguage, view);
            }
        });
        m214147u(isLanguage);
    }

    /* JADX INFO: renamed from: p */
    public final void m214157p(final List<String> selectedList, final boolean isLanguage) {
        m214151i().setActivated(!vwb.m200296J(selectedList));
        xdl0.m208329E0(m214151i(), new View.OnClickListener() { // from class: l.xcf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ycf0.m214144b(selectedList, this, isLanguage, view);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public final void m214158s(boolean isLanguage) {
        List<IntlProfileInfo> listM153968g = isLanguage ? mbp.INSTANCE.m153968g() : mbp.INSTANCE.m153967f();
        if (vwb.m200296J(listM153968g)) {
            CrashHelper.m81296c(new Exception("intl get profile info config == null in SignUpIntlEthnicityLanguageAct is language " + isLanguage));
        } else {
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
            linearLayoutManager.setOrientation(1);
            m214152j().setLayoutManager(linearLayoutManager);
            ldf0 ldf0Var = new ldf0(this.act, listM153968g, isLanguage);
            ldf0Var.m149440L(new C21366a(isLanguage));
            m214152j().setAdapter(ldf0Var);
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
