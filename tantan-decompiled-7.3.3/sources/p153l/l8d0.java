package p153l;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.DrawableRes;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceSingTogehterState;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u001c\u0018\u0000 92\u00020\u0001:\u0002:;B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001f\u001a\u00020\u00148\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001aR\"\u0010'\u001a\u00020 8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010+\u001a\u00020 8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b(\u0010\"\u001a\u0004\b)\u0010$\"\u0004\b*\u0010&R\"\u0010/\u001a\u00020 8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010\"\u001a\u0004\b-\u0010$\"\u0004\b.\u0010&R\"\u00103\u001a\u00020 8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u0010\"\u001a\u0004\b1\u0010$\"\u0004\b2\u0010&R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00108\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b6\u00107¨\u0006<"}, m88121d2 = {"Ll/l8d0;", "Ll/g1e;", "Ll/l8d0$a;", "builder", "<init>", "(Ll/l8d0$a;)V", "", "P", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "I", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lv/VImage;", "j", "Lv/VImage;", "M", "()Lv/VImage;", "set_icon_close", "(Lv/VImage;)V", "_icon_close", "k", "N", "set_image", "_image", "Lv/VText;", BLiveStormDanmakuGiftResourceType.f45292l, "Lv/VText;", BloodType.f39576O, "()Lv/VText;", "set_title", "(Lv/VText;)V", "_title", "m", "L", "set_content", "_content", "n", "K", "set_confirm", "_confirm", "o", "J", "set_cancel", "_cancel", "p", "Ll/l8d0$a;", "q", "Landroid/view/View;", "root", "Companion", "b", "a", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class l8d0 extends g1e {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public VImage _icon_close;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public VImage _image;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public VText _title;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public VText _content;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public VText _confirm;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public VText _cancel;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public C18362a builder;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public View root;

    /* JADX INFO: renamed from: l.l8d0$a */
    @Metadata(m88120d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0018\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\fJ\u0015\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\fJ\u0015\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\r¢\u0006\u0004\b\u001a\u0010\u0010J\u0015\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\r¢\u0006\u0004\b\u001c\u0010\u0010J\u0017\u0010\u001f\u001a\u00020\u00002\b\b\u0001\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R$\u0010\u001e\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020\u001d8\u0006@BX\u0087\u000e¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R(\u0010\u0011\u001a\u0004\u0018\u00010\t2\b\u0010%\u001a\u0004\u0018\u00010\t8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R(\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010%\u001a\u0004\u0018\u00010\u00138\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R(\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010%\u001a\u0004\u0018\u00010\t8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b0\u0010+\u001a\u0004\b*\u0010-R(\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010%\u001a\u0004\u0018\u00010\r8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b#\u00102\u001a\u0004\b.\u00103R(\u0010\u0017\u001a\u0004\u0018\u00010\t2\b\u0010%\u001a\u0004\u0018\u00010\t8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b4\u0010+\u001a\u0004\b!\u0010-R(\u0010\u0019\u001a\u0004\u0018\u00010\r2\b\u0010%\u001a\u0004\u0018\u00010\r8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b(\u00102\u001a\u0004\b&\u00103R(\u0010\u001b\u001a\u0004\u0018\u00010\r2\b\u0010%\u001a\u0004\u0018\u00010\r8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b,\u00102\u001a\u0004\b4\u00103¨\u00065"}, m88121d2 = {"Ll/l8d0$a;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Ll/l8d0;", "r", "()Ll/l8d0;", "", BLiveVoiceSingTogehterState.confirm, "m", "(Ljava/lang/String;)Ll/l8d0$a;", "Ll/x20;", "confirmClickAction", BLiveStormDanmakuGiftResourceType.f45292l, "(Ll/x20;)Ll/l8d0$a;", "title", "q", "", "content", "n", "(Ljava/lang/CharSequence;)Ll/l8d0$a;", "cancel", "k", "cancelClickAction", "j", "dismissAction", "o", "", "imageRes", "p", "(I)Ll/l8d0$a;", "a", "Landroid/content/Context;", "f", "()Landroid/content/Context;", "value", "b", "I", "h", "()I", "c", "Ljava/lang/String;", RXScreenCaptureService.KEY_INDEX, "()Ljava/lang/String;", Constants.INAPP_DATA_TAG, "Ljava/lang/CharSequence;", "e", "()Ljava/lang/CharSequence;", "Ll/x20;", "()Ll/x20;", "g", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class C18362a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Context context;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @DrawableRes
        public int imageRes;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        public String title;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @Nullable
        public CharSequence content;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @Nullable
        public String confirm;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @Nullable
        public x20 confirmClickAction;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @Nullable
        public String cancel;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @Nullable
        public x20 cancelClickAction;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @Nullable
        public x20 dismissAction;

        public C18362a(@NotNull Context context) {
            context.getClass();
            this.context = context;
            this.imageRes = -1;
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCancel() {
            return this.cancel;
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final x20 getCancelClickAction() {
            return this.cancelClickAction;
        }

        @Nullable
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getConfirm() {
            return this.confirm;
        }

        @Nullable
        /* JADX INFO: renamed from: d, reason: from getter */
        public final x20 getConfirmClickAction() {
            return this.confirmClickAction;
        }

        @Nullable
        /* JADX INFO: renamed from: e, reason: from getter */
        public final CharSequence getContent() {
            return this.content;
        }

        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public final Context getContext() {
            return this.context;
        }

        @Nullable
        /* JADX INFO: renamed from: g, reason: from getter */
        public final x20 getDismissAction() {
            return this.dismissAction;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final int getImageRes() {
            return this.imageRes;
        }

        @Nullable
        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        /* JADX INFO: renamed from: j */
        public final C18362a m153193j(@NotNull x20 cancelClickAction) {
            cancelClickAction.getClass();
            this.cancelClickAction = cancelClickAction;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: k */
        public final C18362a m153194k(@NotNull String cancel) {
            cancel.getClass();
            this.cancel = cancel;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: l */
        public final C18362a m153195l(@NotNull x20 confirmClickAction) {
            confirmClickAction.getClass();
            this.confirmClickAction = confirmClickAction;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: m */
        public final C18362a m153196m(@NotNull String confirm) {
            confirm.getClass();
            this.confirm = confirm;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: n */
        public final C18362a m153197n(@NotNull CharSequence content) {
            content.getClass();
            this.content = content;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: o */
        public final C18362a m153198o(@NotNull x20 dismissAction) {
            dismissAction.getClass();
            this.dismissAction = dismissAction;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: p */
        public final C18362a m153199p(@DrawableRes int imageRes) {
            this.imageRes = imageRes;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: q */
        public final C18362a m153200q(@NotNull String title) {
            title.getClass();
            this.title = title;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: r */
        public final l8d0 m153201r() {
            l8d0 l8d0Var = new l8d0(this);
            l8d0Var.show();
            return l8d0Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l8d0(@NotNull C18362a c18362a) {
        super(c18362a.getContext(), false, bnl0.m105592y0() >= 1080 ? tgc0.f174064j : tgc0.f174063i);
        c18362a.getClass();
        setCanceledOnTouchOutside(false);
        this.builder = c18362a;
    }

    /* JADX INFO: renamed from: E */
    public static void m153170E(l8d0 l8d0Var, View view) {
        l8d0Var.dismiss();
    }

    /* JADX INFO: renamed from: F */
    public static void m153171F(l8d0 l8d0Var, DialogInterface dialogInterface) {
        x20 dismissAction = l8d0Var.builder.getDismissAction();
        if (dismissAction != null) {
            dismissAction.call();
        }
    }

    /* JADX INFO: renamed from: P */
    private final void m153174P() {
        m153183O().setTypeface(lyh0.m156283c(3), 1);
        if (this.builder.getImageRes() != -1) {
            m153182N().setImageResource(this.builder.getImageRes());
        }
        if (this.builder.getTitle() != null) {
            m153183O().setText(this.builder.getTitle());
        }
        if (this.builder.getContent() != null) {
            m153180L().setText(this.builder.getContent());
        }
        if (this.builder.getConfirm() != null) {
            m153179K().setText(this.builder.getConfirm());
            m153179K().setVisibility(0);
            m153179K().setOnClickListener(new View.OnClickListener() { // from class: l.h8d0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    l8d0.m153175Q(this.f108235a, view);
                }
            });
        }
        if (this.builder.getCancel() != null) {
            m153178J().setText(this.builder.getCancel());
            m153178J().setVisibility(0);
            m153178J().setOnClickListener(new View.OnClickListener() { // from class: l.i8d0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    l8d0.m153176R(this.f113334a, view);
                }
            });
        }
        m153181M().setOnClickListener(new View.OnClickListener() { // from class: l.j8d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                l8d0.m153170E(this.f118772a, view);
            }
        });
        m128500x();
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.k8d0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                l8d0.m153171F(this.f124374a, dialogInterface);
            }
        });
    }

    /* JADX INFO: renamed from: Q */
    public static final void m153175Q(l8d0 l8d0Var, View view) {
        x20 confirmClickAction = l8d0Var.builder.getConfirmClickAction();
        if (confirmClickAction != null) {
            confirmClickAction.call();
        }
        l8d0Var.dismiss();
    }

    /* JADX INFO: renamed from: R */
    public static final void m153176R(l8d0 l8d0Var, View view) {
        x20 cancelClickAction = l8d0Var.builder.getCancelClickAction();
        if (cancelClickAction != null) {
            cancelClickAction.call();
        }
        l8d0Var.dismiss();
    }

    @NotNull
    /* JADX INFO: renamed from: I */
    public final View m153177I(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM157358b = m8d0.m157358b(this, inflater, parent);
        viewM157358b.getClass();
        return viewM157358b;
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public final VText m153178J() {
        VText vText = this._cancel;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_cancel");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public final VText m153179K() {
        VText vText = this._confirm;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_confirm");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: L */
    public final VText m153180L() {
        VText vText = this._content;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_content");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: M */
    public final VImage m153181M() {
        VImage vImage = this._icon_close;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_icon_close");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: N */
    public final VImage m153182N() {
        VImage vImage = this._image;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_image");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: O */
    public final VText m153183O() {
        VText vText = this._title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_title");
        return null;
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0075a, p153l.nu0, android.app.Dialog
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LayoutInflater layoutInflaterM171370a = p9r.m171370a(this.builder.getContext());
        layoutInflaterM171370a.getClass();
        View view = null;
        View viewM153177I = m153177I(layoutInflaterM171370a, null);
        this.root = viewM153177I;
        if (viewM153177I == null) {
            Intrinsics.m88391r("root");
        } else {
            view = viewM153177I;
        }
        setContentView(view);
        m153174P();
    }
}
