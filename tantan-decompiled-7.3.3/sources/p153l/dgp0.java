package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VFrame;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0015\u0010\fJ\u001f\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0014J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\nH\u0014¢\u0006\u0004\b\u001e\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\"\u0010*\u001a\u00020#8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010/\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0015\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010\fR\"\u00103\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u0010+\u001a\u0004\b1\u0010-\"\u0004\b2\u0010\fR\"\u00107\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u0010+\u001a\u0004\b5\u0010-\"\u0004\b6\u0010\fR\"\u0010;\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b8\u0010+\u001a\u0004\b9\u0010-\"\u0004\b:\u0010\fR\"\u0010C\u001a\u00020<8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010F\u001a\u00020<8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010>\u001a\u0004\bD\u0010@\"\u0004\bE\u0010BR\"\u0010N\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\"\u0010V\u001a\u00020O8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\"\u0010Z\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bW\u0010I\u001a\u0004\bX\u0010K\"\u0004\bY\u0010MR\"\u0010^\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b[\u0010I\u001a\u0004\b\\\u0010K\"\u0004\b]\u0010M¨\u0006_"}, m88121d2 = {"Ll/dgp0;", "Lcom/p1/mobile/putong/live/livingroom/archi/module/LiveMenuDialogHolder;", "Ll/fgp0;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "presenter", "<init>", "(Lcom/p1/mobile/android/app/Act;Ll/fgp0;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "H", "(Landroid/view/View;)V", "r", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "I", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "m", "inflateView", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "Ll/moo0;", "editInfo", BloodType.f39576O, "(Ll/moo0;)V", "w", "k", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "Landroidx/constraintlayout/widget/ConstraintLayout;", BLiveStormDanmakuGiftResourceType.f45292l, "Landroidx/constraintlayout/widget/ConstraintLayout;", "get_root", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_root", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_root", "Landroid/view/View;", "K", "()Landroid/view/View;", "set_layout_empty", "_layout_empty", "n", "get_hock", "set_hock", "_hock", "o", "get_bg", "set_bg", "_bg", "p", "get_top_holder", "set_top_holder", "_top_holder", "Lv/VImage;", "q", "Lv/VImage;", "J", "()Lv/VImage;", "set_close", "(Lv/VImage;)V", "_close", "get_icon", "set_icon", "_icon", "Lv/VText;", BLiveStormDanmakuGiftResourceType.f45294s, "Lv/VText;", "M", "()Lv/VText;", "set_title", "(Lv/VText;)V", "_title", "Lv/VFrame;", Constants.KEY_T, "Lv/VFrame;", "get_content", "()Lv/VFrame;", "set_content", "(Lv/VFrame;)V", "_content", "u", "N", "set_title_content", "_title_content", ResourceDirection.f39656v, "L", "set_notice_content", "_notice_content", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class dgp0 extends LiveMenuDialogHolder<fgp0> {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public ConstraintLayout _root;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public View _layout_empty;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public View _hock;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public View _bg;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public View _top_holder;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public VImage _close;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public VImage _icon;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public VText _title;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public VFrame _content;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public VText _title_content;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public VText _notice_content;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgp0(@NotNull Act act, @NotNull fgp0 fgp0Var) {
        super(yec0.f199080fb, act, fgp0Var);
        act.getClass();
        fgp0Var.getClass();
        this.act = act;
    }

    /* JADX INFO: renamed from: F */
    public static void m115661F(dgp0 dgp0Var, View view) {
        dgp0Var.mo73021p();
    }

    /* JADX INFO: renamed from: G */
    public static void m115662G(dgp0 dgp0Var, View view) {
        dgp0Var.mo73021p();
    }

    /* JADX INFO: renamed from: r */
    private final void m115663r() {
        bnl0.m105509E0(m115667K(), new View.OnClickListener() { // from class: l.bgp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dgp0.m115661F(this.f76677a, view);
            }
        });
        bnl0.m105509E0(m115666J(), new View.OnClickListener() { // from class: l.cgp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dgp0.m115662G(this.f81691a, view);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        Context context = m115667K().getContext();
        context.getClass();
        return context;
    }

    /* JADX INFO: renamed from: H */
    public final void m115664H(View view) {
        ggp0.m130190a(this, view);
    }

    @NotNull
    /* JADX INFO: renamed from: I */
    public final View m115665I(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM130191b = ggp0.m130191b(this, inflater, parent);
        viewM130191b.getClass();
        return viewM130191b;
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public final VImage m115666J() {
        VImage vImage = this._close;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_close");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public final View m115667K() {
        View view = this._layout_empty;
        if (view != null) {
            return view;
        }
        Intrinsics.m88391r("_layout_empty");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: L */
    public final VText m115668L() {
        VText vText = this._notice_content;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_notice_content");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: M */
    public final VText m115669M() {
        VText vText = this._title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_title");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: N */
    public final VText m115670N() {
        VText vText = this._title_content;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_title_content");
        return null;
    }

    /* JADX INFO: renamed from: O */
    public final void m115671O(@NotNull moo0 editInfo) {
        editInfo.getClass();
        if (TextUtils.equals("title", editInfo.getType())) {
            m115669M().setText("房间标题");
            bnl0.m105524M(m115668L(), false);
            bnl0.m105524M(m115670N(), true);
            m115670N().setText(editInfo.getRoomInfo().voiceRoomProfile.title);
            return;
        }
        m115669M().setText("房间公告");
        bnl0.m105524M(m115670N(), false);
        bnl0.m105524M(m115668L(), true);
        m115668L().setText(editInfo.getRoomInfo().voiceRoomProfile.announcement);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @NotNull ViewGroup parent) {
        inflater.getClass();
        parent.getClass();
        return m115665I(inflater, parent);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo73019m(@NotNull View view) {
        view.getClass();
        super.mo73019m(view);
        m115664H(view);
        m115663r();
        m115668L().setMovementMethod(ScrollingMovementMethod.getInstance());
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: w */
    public void mo73024w() {
        super.mo73024w();
        m115670N().setText("");
        m115668L().setText("");
    }
}
