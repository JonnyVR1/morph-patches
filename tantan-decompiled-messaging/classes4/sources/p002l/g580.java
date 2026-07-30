package p002l;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.p000p1.mobile.putong.core.p001ui.notifications.SysnotifListener;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.User;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantan.library.svga.compose.SVGADynamicEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l.d30;
import l.h580;
import l.szd;
import l.t100;
import l.y7c0;
import l.zz6;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001,B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\"\u0010)\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006-"}, d2 = {"Ll/g580;", "Ll/szd;", "Lcom/p1/mobile/android/app/Act;", "act", "", "from", "<init>", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;)V", "", "I", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "G", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/content/DialogInterface;", "dialog", "onShow", "(Landroid/content/DialogInterface;)V", "Ll/d30;", SysnotifListener.ACTION_DISMISS, "J", "(Ll/d30;)V", "j", "Lcom/p1/mobile/android/app/Act;", "k", "Ljava/lang/String;", "Lcom/tantan/library/svga/SVGAnimationView;", "l", "Lcom/tantan/library/svga/SVGAnimationView;", "H", "()Lcom/tantan/library/svga/SVGAnimationView;", "set_svga", "(Lcom/tantan/library/svga/SVGAnimationView;)V", "_svga", "m", "Ll/d30;", "a", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g580 extends szd {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public final String from;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public SVGAnimationView _svga;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public d30 dismiss;

    /* JADX INFO: renamed from: l.g580$a */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u000eR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Ll/g580$a;", "", "Lcom/p1/mobile/android/app/Act;", "act", "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "", "from", "a", "(Ljava/lang/String;)Ll/g580$a;", "", "b", "()V", "Lcom/p1/mobile/android/app/Act;", "Ljava/lang/String;", "Ll/d30;", "c", "Ll/d30;", SysnotifListener.ACTION_DISMISS, "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0585a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Act act;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public String from;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        public d30 dismiss;

        public C0585a(@NotNull Act act) {
            act.getClass();
            this.act = act;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final C0585a m13637a(@Nullable String from) {
            this.from = from;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public final void m13638b() {
            g580 g580Var = new g580(this.act, this.from);
            g580Var.m13636J(this.dismiss);
            g580Var.show();
        }
    }

    /* JADX INFO: renamed from: l.g580$b */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"l/g580$b", "Lcom/tantan/library/svga/AnimListener;", "", "onFinished", "()V", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0586b extends AnimListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ DialogInterface f10786a;

        public C0586b(DialogInterface dialogInterface) {
            this.f10786a = dialogInterface;
        }

        public void onFinished() {
            DialogInterface dialogInterface = this.f10786a;
            if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g580(@NotNull Act act, @Nullable String str) {
        super(act, false, y7c0.b);
        act.getClass();
        this.act = act;
        this.from = str;
    }

    /* JADX INFO: renamed from: E */
    public static boolean m13631E(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        keyEvent.getClass();
        return i == 4 && keyEvent.getRepeatCount() == 0 && keyEvent.getAction() == 0;
    }

    /* JADX INFO: renamed from: F */
    public static void m13632F(g580 g580Var, DialogInterface dialogInterface) {
        d30 d30Var = g580Var.dismiss;
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: I */
    private final void m13633I() {
        Window window = getWindow();
        if (window != null) {
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(0);
            window.getDecorView().setSystemUiVisibility(1280);
            window.setBackgroundDrawableResource(R.color.transparent);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: G */
    public final View m13634G(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewB = h580.b(this, inflater, parent);
        viewB.getClass();
        return viewB;
    }

    @NotNull
    /* JADX INFO: renamed from: H */
    public final SVGAnimationView m13635H() {
        SVGAnimationView sVGAnimationView = this._svga;
        if (sVGAnimationView != null) {
            return sVGAnimationView;
        }
        Intrinsics.r("_svga");
        return null;
    }

    /* JADX INFO: renamed from: J */
    public final void m13636J(@Nullable d30 dismiss) {
        this.dismiss = dismiss;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super/*androidx.appcompat.app.a*/.onCreate(savedInstanceState);
        m13633I();
        LayoutInflater layoutInflater = this.act.getLayoutInflater();
        layoutInflater.getClass();
        View viewM13634G = m13634G(layoutInflater, null);
        viewM13634G.setClickable(true);
        setContentView(viewM13634G);
        y();
        x();
        setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: l.e580
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                return g580.m13631E(dialogInterface, i, keyEvent);
            }
        });
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.f580
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                g580.m13632F(this.f10126a, dialogInterface);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onShow(@Nullable DialogInterface dialog) {
        Picture pictureFp;
        Picture.ImageUri imageUriProfileBig;
        super.onShow(dialog);
        SVGADynamicEntity sVGADynamicEntity = new SVGADynamicEntity();
        User userP9 = CoreModule.c.e0.p9();
        String str = (userP9 == null || (pictureFp = userP9.fp()) == null || (imageUriProfileBig = pictureFp.profileBig()) == null) ? null : imageUriProfileBig.formatted();
        if (str != null && str.length() != 0) {
            sVGADynamicEntity.setDynamicImage(str, "head01");
        }
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(t100.f(26));
        textPaint.setColor(-1);
        textPaint.setAntiAlias(true);
        Paint.Align align = Paint.Align.CENTER;
        textPaint.setTextAlign(align);
        sVGADynamicEntity.setDynamicText("卡片插队", textPaint, "text01");
        TextPaint textPaint2 = new TextPaint();
        textPaint2.setTextSize(t100.f(16));
        textPaint2.setColor(Color.parseColor("#99FFFFFF"));
        textPaint2.setAntiAlias(true);
        textPaint2.setTextAlign(align);
        sVGADynamicEntity.setDynamicText("让你的卡片在" + (zz6.u0() ? "他" : "她") + "的第一位出现", textPaint2, "text02");
        String str2 = userP9 != null ? userP9.isFemale() : true ? "https://auto.tancdn.com/v1/raw/57fa7558-b9c9-48ae-ac8d-cd070b9f836514.pdf" : "https://auto.tancdn.com/v1/raw/4b0c8ebd-a6f4-43ce-b697-337a8c7a340914.pdf";
        Context context = getContext();
        context.getClass();
        SVGALoader.with(context).from(str2).autoPlay(true).repeatCount(1).dynamic(sVGADynamicEntity).animListener(new C0586b(dialog)).into(m13635H());
    }
}
