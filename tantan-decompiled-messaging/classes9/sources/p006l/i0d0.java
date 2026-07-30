package p006l;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.DrawableRes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l.d30;
import l.eqh0;
import l.j0d0;
import l.n8c0;
import l.o7r;
import l.szd;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u001c\u0018\u0000 92\u00020\u0001:\u0002:;B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001f\u001a\u00020\u00148\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001aR\"\u0010'\u001a\u00020 8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010+\u001a\u00020 8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b(\u0010\"\u001a\u0004\b)\u0010$\"\u0004\b*\u0010&R\"\u0010/\u001a\u00020 8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010\"\u001a\u0004\b-\u0010$\"\u0004\b.\u0010&R\"\u00103\u001a\u00020 8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u0010\"\u001a\u0004\b1\u0010$\"\u0004\b2\u0010&R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00108\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b6\u00107¨\u0006<"}, d2 = {"Ll/i0d0;", "Ll/szd;", "Ll/i0d0$a;", "builder", "<init>", "(Ll/i0d0$a;)V", "", "P", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "I", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lv/VImage;", "j", "Lv/VImage;", "M", "()Lv/VImage;", "set_icon_close", "(Lv/VImage;)V", "_icon_close", "k", "N", "set_image", "_image", "Lv/VText;", "l", "Lv/VText;", "O", "()Lv/VText;", "set_title", "(Lv/VText;)V", "_title", "m", "L", "set_content", "_content", "n", "K", "set_confirm", "_confirm", "o", "J", "set_cancel", "_cancel", "p", "Ll/i0d0$a;", "q", "Landroid/view/View;", "root", "Companion", "b", "a", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class i0d0 extends szd {

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
    public C0825a builder;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public View root;

    /* JADX INFO: renamed from: l.i0d0$a */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0018\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\fJ\u0015\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\fJ\u0015\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\r¢\u0006\u0004\b\u001a\u0010\u0010J\u0015\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\r¢\u0006\u0004\b\u001c\u0010\u0010J\u0017\u0010\u001f\u001a\u00020\u00002\b\b\u0001\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R$\u0010\u001e\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020\u001d8\u0006@BX\u0087\u000e¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R(\u0010\u0011\u001a\u0004\u0018\u00010\t2\b\u0010%\u001a\u0004\u0018\u00010\t8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R(\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010%\u001a\u0004\u0018\u00010\u00138\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R(\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010%\u001a\u0004\u0018\u00010\t8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b0\u0010+\u001a\u0004\b*\u0010-R(\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010%\u001a\u0004\u0018\u00010\r8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b#\u00102\u001a\u0004\b.\u00103R(\u0010\u0017\u001a\u0004\u0018\u00010\t2\b\u0010%\u001a\u0004\u0018\u00010\t8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b4\u0010+\u001a\u0004\b!\u0010-R(\u0010\u0019\u001a\u0004\u0018\u00010\r2\b\u0010%\u001a\u0004\u0018\u00010\r8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b(\u00102\u001a\u0004\b&\u00103R(\u0010\u001b\u001a\u0004\u0018\u00010\r2\b\u0010%\u001a\u0004\u0018\u00010\r8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b,\u00102\u001a\u0004\b4\u00103¨\u00065"}, d2 = {"Ll/i0d0$a;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Ll/i0d0;", "r", "()Ll/i0d0;", "", "confirm", "m", "(Ljava/lang/String;)Ll/i0d0$a;", "Ll/d30;", "confirmClickAction", "l", "(Ll/d30;)Ll/i0d0$a;", "title", "q", "", "content", "n", "(Ljava/lang/CharSequence;)Ll/i0d0$a;", "cancel", "k", "cancelClickAction", "j", "dismissAction", "o", "", "imageRes", "p", "(I)Ll/i0d0$a;", "a", "Landroid/content/Context;", "f", "()Landroid/content/Context;", "value", "b", "I", "h", "()I", "c", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "d", "Ljava/lang/CharSequence;", "e", "()Ljava/lang/CharSequence;", "Ll/d30;", "()Ll/d30;", "g", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    public static final class C0825a {

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
        public d30 confirmClickAction;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @Nullable
        public String cancel;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @Nullable
        public d30 cancelClickAction;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @Nullable
        public d30 dismissAction;

        public C0825a(@NotNull Context context) {
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
        public final d30 getCancelClickAction() {
            return this.cancelClickAction;
        }

        @Nullable
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getConfirm() {
            return this.confirm;
        }

        @Nullable
        /* JADX INFO: renamed from: d, reason: from getter */
        public final d30 getConfirmClickAction() {
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
        public final d30 getDismissAction() {
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
        public final C0825a m16443j(@NotNull d30 cancelClickAction) {
            cancelClickAction.getClass();
            this.cancelClickAction = cancelClickAction;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: k */
        public final C0825a m16444k(@NotNull String cancel) {
            cancel.getClass();
            this.cancel = cancel;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: l */
        public final C0825a m16445l(@NotNull d30 confirmClickAction) {
            confirmClickAction.getClass();
            this.confirmClickAction = confirmClickAction;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: m */
        public final C0825a m16446m(@NotNull String confirm) {
            confirm.getClass();
            this.confirm = confirm;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: n */
        public final C0825a m16447n(@NotNull CharSequence content) {
            content.getClass();
            this.content = content;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: o */
        public final C0825a m16448o(@NotNull d30 dismissAction) {
            dismissAction.getClass();
            this.dismissAction = dismissAction;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: p */
        public final C0825a m16449p(@DrawableRes int imageRes) {
            this.imageRes = imageRes;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: q */
        public final C0825a m16450q(@NotNull String title) {
            title.getClass();
            this.title = title;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: r */
        public final i0d0 m16451r() {
            i0d0 i0d0Var = new i0d0(this);
            i0d0Var.show();
            return i0d0Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i0d0(@NotNull C0825a c0825a) {
        super(c0825a.getContext(), false, xdl0.y0() >= 1080 ? n8c0.j : n8c0.i);
        c0825a.getClass();
        setCanceledOnTouchOutside(false);
        this.builder = c0825a;
    }

    /* JADX INFO: renamed from: E */
    public static void m16420E(i0d0 i0d0Var, View view) {
        i0d0Var.dismiss();
    }

    /* JADX INFO: renamed from: F */
    public static void m16421F(i0d0 i0d0Var, DialogInterface dialogInterface) {
        d30 dismissAction = i0d0Var.builder.getDismissAction();
        if (dismissAction != null) {
            dismissAction.call();
        }
    }

    /* JADX INFO: renamed from: P */
    private final void m16424P() {
        m16433O().setTypeface(eqh0.c(3), 1);
        if (this.builder.getImageRes() != -1) {
            m16432N().setImageResource(this.builder.getImageRes());
        }
        if (this.builder.getTitle() != null) {
            m16433O().setText(this.builder.getTitle());
        }
        if (this.builder.getContent() != null) {
            m16430L().setText(this.builder.getContent());
        }
        if (this.builder.getConfirm() != null) {
            m16429K().setText(this.builder.getConfirm());
            m16429K().setVisibility(0);
            m16429K().setOnClickListener(new View.OnClickListener() { // from class: l.e0d0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    i0d0.m16425Q(this.f10681a, view);
                }
            });
        }
        if (this.builder.getCancel() != null) {
            m16428J().setText(this.builder.getCancel());
            m16428J().setVisibility(0);
            m16428J().setOnClickListener(new View.OnClickListener() { // from class: l.f0d0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    i0d0.m16426R(this.f11550a, view);
                }
            });
        }
        m16431M().setOnClickListener(new View.OnClickListener() { // from class: l.g0d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                i0d0.m16420E(this.f13014a, view);
            }
        });
        x();
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.h0d0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0d0.m16421F(this.f13621a, dialogInterface);
            }
        });
    }

    /* JADX INFO: renamed from: Q */
    public static final void m16425Q(i0d0 i0d0Var, View view) {
        d30 confirmClickAction = i0d0Var.builder.getConfirmClickAction();
        if (confirmClickAction != null) {
            confirmClickAction.call();
        }
        i0d0Var.dismiss();
    }

    /* JADX INFO: renamed from: R */
    public static final void m16426R(i0d0 i0d0Var, View view) {
        d30 cancelClickAction = i0d0Var.builder.getCancelClickAction();
        if (cancelClickAction != null) {
            cancelClickAction.call();
        }
        i0d0Var.dismiss();
    }

    @NotNull
    /* JADX INFO: renamed from: I */
    public final View m16427I(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewB = j0d0.b(this, inflater, parent);
        viewB.getClass();
        return viewB;
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public final VText m16428J() {
        VText vText = this._cancel;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_cancel");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public final VText m16429K() {
        VText vText = this._confirm;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_confirm");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: L */
    public final VText m16430L() {
        VText vText = this._content;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_content");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: M */
    public final VImage m16431M() {
        VImage vImage = this._icon_close;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_icon_close");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: N */
    public final VImage m16432N() {
        VImage vImage = this._image;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_image");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: O */
    public final VText m16433O() {
        VText vText = this._title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_title");
        return null;
    }

    public void onCreate(@Nullable Bundle savedInstanceState) {
        super/*androidx.appcompat.app.a*/.onCreate(savedInstanceState);
        LayoutInflater layoutInflaterA = o7r.a(this.builder.getContext());
        layoutInflaterA.getClass();
        View view = null;
        View viewM16427I = m16427I(layoutInflaterA, null);
        this.root = viewM16427I;
        if (viewM16427I == null) {
            Intrinsics.r("root");
        } else {
            view = viewM16427I;
        }
        setContentView(view);
        m16424P();
    }
}
