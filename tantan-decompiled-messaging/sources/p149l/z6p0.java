package p149l;

import android.content.Context;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.BloodType;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VFrame;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0015\u0010\fJ\u001f\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0014J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\nH\u0014¢\u0006\u0004\b\u001e\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\"\u0010*\u001a\u00020#8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010/\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0015\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010\fR\"\u00103\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u0010+\u001a\u0004\b1\u0010-\"\u0004\b2\u0010\fR\"\u00107\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u0010+\u001a\u0004\b5\u0010-\"\u0004\b6\u0010\fR\"\u0010;\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b8\u0010+\u001a\u0004\b9\u0010-\"\u0004\b:\u0010\fR\"\u0010C\u001a\u00020<8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010F\u001a\u00020<8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010>\u001a\u0004\bD\u0010@\"\u0004\bE\u0010BR\"\u0010N\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\"\u0010V\u001a\u00020O8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\"\u0010Z\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bW\u0010I\u001a\u0004\bX\u0010K\"\u0004\bY\u0010MR\"\u0010^\u001a\u00020G8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b[\u0010I\u001a\u0004\b\\\u0010K\"\u0004\b]\u0010M¨\u0006_"}, m87232d2 = {"Ll/z6p0;", "Lcom/p1/mobile/putong/live/livingroom/archi/module/LiveMenuDialogHolder;", "Ll/b7p0;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "presenter", "<init>", "(Lcom/p1/mobile/android/app/Act;Ll/b7p0;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "H", "(Landroid/view/View;)V", "r", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "I", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "m", "inflateView", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "Ll/ifo0;", "editInfo", BloodType.f38728O, "(Ll/ifo0;)V", "w", "k", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "Landroidx/constraintlayout/widget/ConstraintLayout;", BLiveStormDanmakuGiftResourceType.f44444l, "Landroidx/constraintlayout/widget/ConstraintLayout;", "get_root", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "set_root", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "_root", "Landroid/view/View;", "K", "()Landroid/view/View;", "set_layout_empty", "_layout_empty", "n", "get_hock", "set_hock", "_hock", "o", "get_bg", "set_bg", "_bg", "p", "get_top_holder", "set_top_holder", "_top_holder", "Lv/VImage;", "q", "Lv/VImage;", "J", "()Lv/VImage;", "set_close", "(Lv/VImage;)V", "_close", "get_icon", "set_icon", "_icon", "Lv/VText;", BLiveStormDanmakuGiftResourceType.f44446s, "Lv/VText;", "M", "()Lv/VText;", "set_title", "(Lv/VText;)V", "_title", "Lv/VFrame;", Constants.KEY_T, "Lv/VFrame;", "get_content", "()Lv/VFrame;", "set_content", "(Lv/VFrame;)V", "_content", "u", "N", "set_title_content", "_title_content", ResourceDirection.f38808v, "L", "set_notice_content", "_notice_content", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class z6p0 extends LiveMenuDialogHolder<b7p0> {

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
    public z6p0(@NotNull Act act, @NotNull b7p0 b7p0Var) {
        super(t6c0.f168348fb, act, b7p0Var);
        act.getClass();
        b7p0Var.getClass();
        this.act = act;
    }

    /* JADX INFO: renamed from: F */
    public static void m217403F(z6p0 z6p0Var, View view) {
        z6p0Var.mo71838p();
    }

    /* JADX INFO: renamed from: G */
    public static void m217404G(z6p0 z6p0Var, View view) {
        z6p0Var.mo71838p();
    }

    /* JADX INFO: renamed from: r */
    private final void m217405r() {
        xdl0.m208329E0(m217409K(), new View.OnClickListener() { // from class: l.x6p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                z6p0.m217403F(this.f191259a, view);
            }
        });
        xdl0.m208329E0(m217408J(), new View.OnClickListener() { // from class: l.y6p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                z6p0.m217404G(this.f196601a, view);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    @NotNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        Context context = m217409K().getContext();
        context.getClass();
        return context;
    }

    /* JADX INFO: renamed from: H */
    public final void m217406H(View view) {
        c7p0.m105622a(this, view);
    }

    @NotNull
    /* JADX INFO: renamed from: I */
    public final View m217407I(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM105623b = c7p0.m105623b(this, inflater, parent);
        viewM105623b.getClass();
        return viewM105623b;
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public final VImage m217408J() {
        VImage vImage = this._close;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_close");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public final View m217409K() {
        View view = this._layout_empty;
        if (view != null) {
            return view;
        }
        Intrinsics.m87502r("_layout_empty");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: L */
    public final VText m217410L() {
        VText vText = this._notice_content;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_notice_content");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: M */
    public final VText m217411M() {
        VText vText = this._title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_title");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: N */
    public final VText m217412N() {
        VText vText = this._title_content;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_title_content");
        return null;
    }

    /* JADX INFO: renamed from: O */
    public final void m217413O(@NotNull ifo0 editInfo) {
        editInfo.getClass();
        if (TextUtils.equals("title", editInfo.getType())) {
            m217411M().setText("房间标题");
            xdl0.m208344M(m217410L(), false);
            xdl0.m208344M(m217412N(), true);
            m217412N().setText(editInfo.getRoomInfo().voiceRoomProfile.title);
            return;
        }
        m217411M().setText("房间公告");
        xdl0.m208344M(m217412N(), false);
        xdl0.m208344M(m217410L(), true);
        m217410L().setText(editInfo.getRoomInfo().voiceRoomProfile.announcement);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @NotNull ViewGroup parent) {
        inflater.getClass();
        parent.getClass();
        return m217407I(inflater, parent);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo71836m(@NotNull View view) {
        view.getClass();
        super.mo71836m(view);
        m217406H(view);
        m217405r();
        m217410L().setMovementMethod(ScrollingMovementMethod.getInstance());
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: w */
    public void mo71841w() {
        super.mo71841w();
        m217412N().setText("");
        m217410L().setText("");
    }
}
