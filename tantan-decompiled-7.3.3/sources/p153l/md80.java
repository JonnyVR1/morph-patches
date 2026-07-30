package p153l;

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
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.notifications.SysnotifListener;
import com.p051p1.mobile.putong.data.OMSTemplateType;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantan.library.svga.compose.SVGADynamicEntity;
import com.tencent.open.SocialConstants;
import io.agora.rtc2.internal.AudioRoutingController;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001,B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\"\u0010)\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006-"}, m88121d2 = {"Ll/md80;", "Ll/g1e;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "from", "<init>", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;)V", "", "I", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "G", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/content/DialogInterface;", OMSTemplateType.dialog, "onShow", "(Landroid/content/DialogInterface;)V", "Ll/x20;", SysnotifListener.ACTION_DISMISS, "J", "(Ll/x20;)V", "j", "Lcom/p1/mobile/android/app/Act;", "k", "Ljava/lang/String;", "Lcom/tantan/library/svga/SVGAnimationView;", BLiveStormDanmakuGiftResourceType.f45292l, "Lcom/tantan/library/svga/SVGAnimationView;", "H", "()Lcom/tantan/library/svga/SVGAnimationView;", "set_svga", "(Lcom/tantan/library/svga/SVGAnimationView;)V", "_svga", "m", "Ll/x20;", "a", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class md80 extends g1e {

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
    public x20 dismiss;

    /* JADX INFO: renamed from: l.md80$a */
    @Metadata(m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u000eR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m88121d2 = {"Ll/md80$a;", "", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "", "from", "a", "(Ljava/lang/String;)Ll/md80$a;", "", "b", "()V", "Lcom/p1/mobile/android/app/Act;", "Ljava/lang/String;", "Ll/x20;", "c", "Ll/x20;", SysnotifListener.ACTION_DISMISS, "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C18592a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Act act;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public String from;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        public x20 dismiss;

        public C18592a(@NotNull Act act) {
            act.getClass();
            this.act = act;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final C18592a m157969a(@Nullable String from) {
            this.from = from;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public final void m157970b() {
            md80 md80Var = new md80(this.act, this.from);
            md80Var.m157968J(this.dismiss);
            md80Var.show();
        }
    }

    /* JADX INFO: renamed from: l.md80$b */
    @Metadata(m88120d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m88121d2 = {"l/md80$b", "Lcom/tantan/library/svga/AnimListener;", "", "onFinished", "()V", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C18593b extends AnimListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ DialogInterface f135877a;

        public C18593b(DialogInterface dialogInterface) {
            this.f135877a = dialogInterface;
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            DialogInterface dialogInterface = this.f135877a;
            if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public md80(@NotNull Act act, @Nullable String str) {
        super(act, false, dgc0.f88277b);
        act.getClass();
        this.act = act;
        this.from = str;
    }

    /* JADX INFO: renamed from: E */
    public static boolean m157963E(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        keyEvent.getClass();
        return i == 4 && keyEvent.getRepeatCount() == 0 && keyEvent.getAction() == 0;
    }

    /* JADX INFO: renamed from: F */
    public static void m157964F(md80 md80Var, DialogInterface dialogInterface) {
        x20 x20Var = md80Var.dismiss;
        if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: I */
    private final void m157965I() {
        Window window = getWindow();
        if (window != null) {
            window.clearFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(0);
            window.getDecorView().setSystemUiVisibility(EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK);
            window.setBackgroundDrawableResource(R.color.transparent);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: G */
    public final View m157966G(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM162641b = nd80.m162641b(this, inflater, parent);
        viewM162641b.getClass();
        return viewM162641b;
    }

    @NotNull
    /* JADX INFO: renamed from: H */
    public final SVGAnimationView m157967H() {
        SVGAnimationView sVGAnimationView = this._svga;
        if (sVGAnimationView != null) {
            return sVGAnimationView;
        }
        Intrinsics.m88391r("_svga");
        return null;
    }

    /* JADX INFO: renamed from: J */
    public final void m157968J(@Nullable x20 dismiss) {
        this.dismiss = dismiss;
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0075a, p153l.nu0, android.app.Dialog
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        m157965I();
        LayoutInflater layoutInflater = this.act.getLayoutInflater();
        layoutInflater.getClass();
        View viewM157966G = m157966G(layoutInflater, null);
        viewM157966G.setClickable(true);
        setContentView(viewM157966G);
        m128501y();
        m128500x();
        setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: l.kd80
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                return md80.m157963E(dialogInterface, i, keyEvent);
            }
        });
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.ld80
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                md80.m157964F(this.f131423a, dialogInterface);
            }
        });
    }

    @Override // p153l.g1e, android.content.DialogInterface.OnShowListener
    public void onShow(@Nullable DialogInterface dialog) {
        Picture pictureM61308fp;
        Picture.ImageUri imageUriProfileBig;
        super.onShow(dialog);
        SVGADynamicEntity sVGADynamicEntity = new SVGADynamicEntity();
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        String str = (userM116600p9 == null || (pictureM61308fp = userM116600p9.m61308fp()) == null || (imageUriProfileBig = pictureM61308fp.profileBig()) == null) ? null : imageUriProfileBig.formatted();
        if (str != null && str.length() != 0) {
            sVGADynamicEntity.setDynamicImage(str, "head01");
        }
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(qa00.m175861f(26));
        textPaint.setColor(-1);
        textPaint.setAntiAlias(true);
        Paint.Align align = Paint.Align.CENTER;
        textPaint.setTextAlign(align);
        sVGADynamicEntity.setDynamicText("卡片插队", textPaint, "text01");
        TextPaint textPaint2 = new TextPaint();
        textPaint2.setTextSize(qa00.m175861f(16));
        textPaint2.setColor(Color.parseColor("#99FFFFFF"));
        textPaint2.setAntiAlias(true);
        textPaint2.setTextAlign(align);
        sVGADynamicEntity.setDynamicText("让你的卡片在" + (c17.m107528u0() ? "他" : "她") + "的第一位出现", textPaint2, "text02");
        String str2 = userM116600p9 != null ? userM116600p9.isFemale() : true ? "https://auto.tancdn.com/v1/raw/57fa7558-b9c9-48ae-ac8d-cd070b9f836514.pdf" : "https://auto.tancdn.com/v1/raw/4b0c8ebd-a6f4-43ce-b697-337a8c7a340914.pdf";
        Context context = getContext();
        context.getClass();
        SVGALoader.with(context).from(str2).autoPlay(true).repeatCount(1).dynamic(sVGADynamicEntity).animListener(new C18593b(dialog)).into(m157967H());
    }
}
