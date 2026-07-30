package p153l;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.android.p053ui.bubble.C4496a;
import com.p051p1.mobile.android.p053ui.bubble.C4499d;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.buzz.R$string;
import com.p051p1.mobile.putong.core.data.StickStatus;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.data.Target;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.BuzzComboFrag;
import com.p051p1.mobile.putong.data.Gender;
import com.p051p1.mobile.putong.data.Location;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantan.library.svga.compose.SVGADynamicEntity;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.C15493d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J)\u0010\f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ3\u0010\u0010\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0018\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J1\u0010!\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010 \u001a\u00020\u001e¢\u0006\u0004\b!\u0010\"J\u001d\u0010#\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b#\u0010$J;\u0010&\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010 \u001a\u00020\u001e2\b\b\u0002\u0010%\u001a\u00020\u000e¢\u0006\u0004\b&\u0010'J\u001f\u0010*\u001a\u00020\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\r\u0010-\u001a\u00020,¢\u0006\u0004\b-\u0010.J\r\u0010/\u001a\u00020\n¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\u000e¢\u0006\u0004\b1\u00102J\r\u00103\u001a\u00020\u0004¢\u0006\u0004\b3\u0010\u0003J)\u00108\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u00105\u001a\u0004\u0018\u0001042\u0006\u00107\u001a\u000206¢\u0006\u0004\b8\u00109J=\u0010=\u001a\u00020\u00042\u0006\u00108\u001a\u0002042\b\b\u0002\u0010:\u001a\u00020\n2\b\b\u0002\u0010;\u001a\u00020\n2\b\b\u0002\u0010%\u001a\u00020\n2\b\b\u0002\u0010<\u001a\u00020\n¢\u0006\u0004\b=\u0010>J\u001f\u0010B\u001a\u00020\n2\u0006\u0010?\u001a\u00020\n2\b\u0010A\u001a\u0004\u0018\u00010@¢\u0006\u0004\bB\u0010CJ\u001d\u0010F\u001a\u00020\u00042\u0006\u0010?\u001a\u00020\u00162\u0006\u0010E\u001a\u00020D¢\u0006\u0004\bF\u0010GJ\u0015\u0010I\u001a\u00020H2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\bI\u0010J¨\u0006K"}, m88121d2 = {"Ll/sbw;", "", "<init>", "()V", "", "r", "Lcom/facebook/drawee/view/SimpleDraweeView;", "imageV", "Lcom/p1/mobile/putong/data/Picture$ImageUri;", "url", "", "percent", "f", "(Lcom/facebook/drawee/view/SimpleDraweeView;Lcom/p1/mobile/putong/data/Picture$ImageUri;I)V", "", "mediaBuzz", "g", "(Lcom/facebook/drawee/view/SimpleDraweeView;Lcom/p1/mobile/putong/data/Picture$ImageUri;IZ)V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/tantan/library/svga/compose/SVGADynamicEntity;", "entity", "", Constants.KEY_KEY, BLiveStormDanmakuGiftResourceType.f45294s, "(Lcom/p1/mobile/android/app/Act;Lcom/tantan/library/svga/compose/SVGADynamicEntity;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/p1/mobile/putong/data/User;", "user", "Landroid/widget/TextView;", "tv", "", "width", "height", "o", "(Lcom/p1/mobile/putong/data/User;Landroid/widget/TextView;FF)V", "q", "(Lcom/p1/mobile/putong/data/User;Landroid/widget/TextView;)V", "right", "n", "(Lcom/p1/mobile/putong/data/User;Landroid/widget/TextView;FFZ)V", "Landroid/widget/ImageView;", "region", "p", "(Lcom/p1/mobile/putong/data/User;Landroid/widget/ImageView;)V", "Lcom/p1/mobile/android/app/Frag;", "k", "()Lcom/p1/mobile/android/app/Frag;", "m", "()I", "h", "()Z", RXScreenCaptureService.KEY_INDEX, "Landroid/view/View;", Target.TYPE, "Lcom/p1/mobile/android/ui/bubble/a$c;", "callback", ResourceDirection.f39656v, "(Lcom/p1/mobile/android/app/Act;Landroid/view/View;Lcom/p1/mobile/android/ui/bubble/a$c;)V", BLiveGiftBubblePopupTitlePosition.left, StickStatus.top, "bottom", Constants.KEY_T, "(Landroid/view/View;IIII)V", "type", "Lcom/p1/mobile/putong/data/Gender;", "selfGender", BLiveStormDanmakuGiftResourceType.f45292l, "(ILcom/p1/mobile/putong/data/Gender;)I", "Ll/x0m;", "frag", "e", "(Ljava/lang/String;Ll/x0m;)V", "Lcom/p1/mobile/putong/data/Picture;", "j", "(Lcom/p1/mobile/putong/data/User;)Lcom/p1/mobile/putong/data/Picture;", "buzz_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class sbw {

    @NotNull
    public static final sbw INSTANCE = new sbw();

    /* JADX INFO: renamed from: a */
    public static void m185335a(SVGADynamicEntity sVGADynamicEntity, String str, Bitmap bitmap) {
        if (bitmap != null) {
            sVGADynamicEntity.setDynamicImage(bitmap, str);
        }
    }

    /* JADX INFO: renamed from: b */
    public static Unit m185336b(x0m x0mVar) {
        x0mVar.mo37749V(SwipeDirection.RIGHT);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public static void m185337c(Throwable th) {
    }

    /* JADX INFO: renamed from: d */
    public static void m185338d(String str, gcg0 gcg0Var) {
        gcg0Var.getClass();
        uqb0.f180374G.m127110J(str, new vrb0(gcg0Var), 2, 8);
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m185339u(sbw sbwVar, View view, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i = -1;
        }
        if ((i5 & 4) != 0) {
            i2 = -1;
        }
        if ((i5 & 8) != 0) {
            i3 = -1;
        }
        if ((i5 & 16) != 0) {
            i4 = -1;
        }
        sbwVar.m185355t(view, i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: e */
    public final void m185340e(@NotNull String type, @NotNull final x0m frag) {
        type.getClass();
        frag.getClass();
        haw hawVarM134320a = haw.INSTANCE.m134320a();
        Act actMo37761q1 = frag.mo37761q1();
        actMo37761q1.getClass();
        haw.m134251p0(hawVarM134320a, type, actMo37761q1, new Function0() { // from class: l.rbw
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return sbw.m185336b(frag);
            }
        }, null, true, 8, null);
    }

    /* JADX INFO: renamed from: f */
    public final void m185341f(@Nullable SimpleDraweeView imageV, @NotNull Picture.ImageUri url, int percent) {
        url.getClass();
        m185342g(imageV, url, percent, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public final void m185342g(@Nullable SimpleDraweeView imageV, @NotNull Picture.ImageUri url, int percent, boolean mediaBuzz) {
        url.getClass();
        if (imageV == null) {
            return;
        }
        pf60 pf60VarM172085a = pf60.m172085a(8, Integer.valueOf((100 - percent) / 10));
        pf60VarM172085a.getClass();
        Integer num = (Integer) pf60VarM172085a.f152157b;
        if (num != null) {
            if (num.intValue() > 0) {
                uqb0.f180374G.m127120O(imageV, url.formatted(), 2, 8);
            } else {
                uqb0.f180374G.m127125Q0(imageV, url);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m185343h() {
        Boolean bool = new jxd0("buzz_move_tab_tip_" + CoreModule.m30929H().userId(), Boolean.FALSE).get();
        bool.getClass();
        return bool.booleanValue();
    }

    /* JADX INFO: renamed from: i */
    public final void m185344i() {
        long jM174454o = pzi0.m174454o();
        new byd0("love_buzz_user_click_time_" + CoreModule.m30929H().userId(), -1L).put(Long.valueOf(jM174454o));
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final Picture m185345j(@NotNull User user) {
        user.getClass();
        Picture pictureM61308fp = user.m61308fp();
        pictureM61308fp.getClass();
        return pictureM61308fp;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final Frag m185346k() {
        return new BuzzComboFrag();
    }

    /* JADX INFO: renamed from: l */
    public final int m185347l(int type, @Nullable Gender selfGender) {
        boolean zEquals = TEnum.equals(selfGender, "male");
        if (type == 1) {
            return zEquals ? ebc0.f92884i : ebc0.f92886j;
        }
        if (type != 2) {
            return zEquals ? ebc0.f92882h : ebc0.f92878f;
        }
        return zEquals ? ebc0.f92880g : ebc0.f92876e;
    }

    /* JADX INFO: renamed from: m */
    public final int m185348m() {
        String language = Locale.getDefault().getLanguage();
        if (language == null) {
            language = "";
        }
        if (C15493d.m94374J(language, "ko", false, 2, null)) {
            return ebc0.f92902r;
        }
        if (C15493d.m94374J(language, "th", false, 2, null)) {
            return ebc0.f92904s;
        }
        return C15493d.m94374J(language, "ja", false, 2, null) ? ebc0.f92900q : ebc0.f92896o;
    }

    /* JADX INFO: renamed from: n */
    public final void m185349n(@NotNull User user, @NotNull TextView tv2, float width, float height, boolean right) {
        user.getClass();
        tv2.getClass();
        Drawable drawableM148006b = k3d0.m148006b(!TEnum.equals(user.gender, "female") ? ebc0.f92847F : ebc0.f92855N);
        drawableM148006b.getClass();
        drawableM148006b.setBounds(0, 0, qa00.m175859d(width), qa00.m175859d(height));
        if (right) {
            bnl0.m105565l(tv2, drawableM148006b);
        } else {
            bnl0.m105563k(tv2, drawableM148006b);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m185350o(@NotNull User user, @NotNull TextView tv2, float width, float height) {
        user.getClass();
        tv2.getClass();
        m185352q(user, tv2);
        m185349n(user, tv2, width, height, true);
    }

    /* JADX INFO: renamed from: p */
    public final void m185351p(@Nullable User user, @NotNull ImageView region) {
        Location location;
        region.getClass();
        Integer numM120282d = ebw.INSTANCE.m120282d((user == null || (location = user.location) == null) ? null : location.region);
        if (numM120282d != null) {
            region.setBackgroundResource(numM120282d.intValue());
        }
        bnl0.m105524M(region, NullChecker.m82486a(numM120282d));
    }

    /* JADX INFO: renamed from: q */
    public final void m185352q(@NotNull User user, @NotNull TextView tv2) {
        user.getClass();
        tv2.getClass();
        StringBuilder sb = new StringBuilder();
        Integer num = user.age;
        num.getClass();
        sb.append(num.intValue());
        String strM175804j0 = q8g0.m175804j0(user.profile.zodiac);
        if (!TextUtils.isEmpty(strM175804j0)) {
            sb.append("  ");
            sb.append(strM175804j0);
        }
        tv2.setText(sb.toString());
    }

    /* JADX INFO: renamed from: r */
    public final void m185353r() {
        new jxd0("buzz_move_tab_tip_" + CoreModule.m30929H().userId(), Boolean.FALSE).put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: s */
    public final void m185354s(@Nullable Act act, @NotNull final SVGADynamicEntity entity, @NotNull final String url, @NotNull final String key) {
        C22421c c22421cDuringCreated;
        entity.getClass();
        url.getClass();
        key.getClass();
        if (act == null || (c22421cDuringCreated = act.duringCreated(C22421c.create(new C22421c.a() { // from class: l.obw
            @Override // p153l.y20
            public final void call(Object obj) {
                sbw.m185338d(url, (gcg0) obj);
            }
        }))) == null) {
            return;
        }
        c22421cDuringCreated.subscribe(psd0.m173597H(new y20() { // from class: l.pbw
            @Override // p153l.y20
            public final void call(Object obj) {
                sbw.m185335a(entity, key, (Bitmap) obj);
            }
        }, new y20() { // from class: l.qbw
            @Override // p153l.y20
            public final void call(Object obj) {
                sbw.m185337c((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t */
    public final void m185355t(@NotNull View v2, int left, int top, int right, int bottom) {
        v2.getClass();
        ViewGroup.LayoutParams layoutParams = v2.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            if (left != -1) {
                ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = left;
            }
            if (top != -1) {
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = top;
            }
            if (right != -1) {
                ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = right;
            }
            if (bottom != -1) {
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = bottom;
            }
        }
        v2.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: v */
    public final void m185356v(@Nullable Act act, @Nullable View target, @NotNull C4496a.c callback) {
        callback.getClass();
        if (act == null || !k8w.INSTANCE.m148752a(act) || C4499d.m21895l().m21911x("love_buzz_tab_tip_bubble_key")) {
            xa2.INSTANCE.m209830a("LoveBuzzUIHelper", "showBuzzMoveTabTip act not valid or LOVE_BUZZ_TAB_TIP_BUBBLE_KEY is showing");
            return;
        }
        if (!NullChecker.m82486a(target) || act.isDialogShowing()) {
            xa2.INSTANCE.m209830a("LoveBuzzUIHelper", "showBuzzMoveTabTip target is null or act dlg is show");
            return;
        }
        m185353r();
        C4499d.m21895l().m21908u(new C4496a(act).m21848D(k3d0.m148007c(R$string.f20983m0)).m21869k(j26.m143190c(act, d9c0.f85744a)).m21851G(d9c0.f85745b).m21877t(true).m21854J(14.0f).m21863e(false).m21849E(false).m21881x(qa00.f156318e).m21860b(3000L).m21868j(callback).m21874q(zvk.f206227D), target, "love_buzz_tab_tip_bubble_key");
    }
}
