package p149l;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.android.p048ui.bubble.C4345a;
import com.p046p1.mobile.android.p048ui.bubble.C4348d;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.buzz.R$string;
import com.p046p1.mobile.putong.core.data.StickStatus;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.data.Target;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.BuzzComboFrag;
import com.p046p1.mobile.putong.data.Gender;
import com.p046p1.mobile.putong.data.Location;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantan.library.svga.compose.SVGADynamicEntity;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.C15386d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J)\u0010\f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ3\u0010\u0010\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0018\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J1\u0010!\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010 \u001a\u00020\u001e¢\u0006\u0004\b!\u0010\"J\u001d\u0010#\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b#\u0010$J;\u0010&\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010 \u001a\u00020\u001e2\b\b\u0002\u0010%\u001a\u00020\u000e¢\u0006\u0004\b&\u0010'J\u001f\u0010*\u001a\u00020\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\r\u0010-\u001a\u00020,¢\u0006\u0004\b-\u0010.J\r\u0010/\u001a\u00020\n¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\u000e¢\u0006\u0004\b1\u00102J\r\u00103\u001a\u00020\u0004¢\u0006\u0004\b3\u0010\u0003J)\u00108\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u00105\u001a\u0004\u0018\u0001042\u0006\u00107\u001a\u000206¢\u0006\u0004\b8\u00109J=\u0010=\u001a\u00020\u00042\u0006\u00108\u001a\u0002042\b\b\u0002\u0010:\u001a\u00020\n2\b\b\u0002\u0010;\u001a\u00020\n2\b\b\u0002\u0010%\u001a\u00020\n2\b\b\u0002\u0010<\u001a\u00020\n¢\u0006\u0004\b=\u0010>J\u001f\u0010B\u001a\u00020\n2\u0006\u0010?\u001a\u00020\n2\b\u0010A\u001a\u0004\u0018\u00010@¢\u0006\u0004\bB\u0010CJ\u001d\u0010F\u001a\u00020\u00042\u0006\u0010?\u001a\u00020\u00162\u0006\u0010E\u001a\u00020D¢\u0006\u0004\bF\u0010GJ\u0015\u0010I\u001a\u00020H2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\bI\u0010J¨\u0006K"}, m87232d2 = {"Ll/u9w;", "", "<init>", "()V", "", "r", "Lcom/facebook/drawee/view/SimpleDraweeView;", "imageV", "Lcom/p1/mobile/putong/data/Picture$ImageUri;", "url", "", "percent", "f", "(Lcom/facebook/drawee/view/SimpleDraweeView;Lcom/p1/mobile/putong/data/Picture$ImageUri;I)V", "", "mediaBuzz", "g", "(Lcom/facebook/drawee/view/SimpleDraweeView;Lcom/p1/mobile/putong/data/Picture$ImageUri;IZ)V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/tantan/library/svga/compose/SVGADynamicEntity;", "entity", "", Constants.KEY_KEY, BLiveStormDanmakuGiftResourceType.f44446s, "(Lcom/p1/mobile/android/app/Act;Lcom/tantan/library/svga/compose/SVGADynamicEntity;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/p1/mobile/putong/data/User;", "user", "Landroid/widget/TextView;", "tv", "", "width", "height", "o", "(Lcom/p1/mobile/putong/data/User;Landroid/widget/TextView;FF)V", "q", "(Lcom/p1/mobile/putong/data/User;Landroid/widget/TextView;)V", "right", "n", "(Lcom/p1/mobile/putong/data/User;Landroid/widget/TextView;FFZ)V", "Landroid/widget/ImageView;", "region", "p", "(Lcom/p1/mobile/putong/data/User;Landroid/widget/ImageView;)V", "Lcom/p1/mobile/android/app/Frag;", "k", "()Lcom/p1/mobile/android/app/Frag;", "m", "()I", "h", "()Z", RXScreenCaptureService.KEY_INDEX, "Landroid/view/View;", Target.TYPE, "Lcom/p1/mobile/android/ui/bubble/a$c;", "callback", ResourceDirection.f38808v, "(Lcom/p1/mobile/android/app/Act;Landroid/view/View;Lcom/p1/mobile/android/ui/bubble/a$c;)V", BLiveGiftBubblePopupTitlePosition.left, StickStatus.top, "bottom", Constants.KEY_T, "(Landroid/view/View;IIII)V", "type", "Lcom/p1/mobile/putong/data/Gender;", "selfGender", BLiveStormDanmakuGiftResourceType.f44444l, "(ILcom/p1/mobile/putong/data/Gender;)I", "Ll/eyl;", "frag", "e", "(Ljava/lang/String;Ll/eyl;)V", "Lcom/p1/mobile/putong/data/Picture;", "j", "(Lcom/p1/mobile/putong/data/User;)Lcom/p1/mobile/putong/data/Picture;", "buzz_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class u9w {

    @NotNull
    public static final u9w INSTANCE = new u9w();

    /* JADX INFO: renamed from: a */
    public static void m192667a(SVGADynamicEntity sVGADynamicEntity, String str, Bitmap bitmap) {
        if (bitmap != null) {
            sVGADynamicEntity.setDynamicImage(bitmap, str);
        }
    }

    /* JADX INFO: renamed from: b */
    public static Unit m192668b(eyl eylVar) {
        eylVar.mo36746V(SwipeDirection.RIGHT);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public static void m192669c(Throwable th) {
    }

    /* JADX INFO: renamed from: d */
    public static void m192670d(String str, z3g0 z3g0Var) {
        z3g0Var.getClass();
        qib0.f154691G.m102326J(str, new rjb0(z3g0Var), 2, 8);
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m192671u(u9w u9wVar, View view, int i, int i2, int i3, int i4, int i5, Object obj) {
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
        u9wVar.m192687t(view, i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: e */
    public final void m192672e(@NotNull String type, @NotNull final eyl frag) {
        type.getClass();
        frag.getClass();
        j8w j8wVarM140473a = j8w.INSTANCE.m140473a();
        Act actMo36758q1 = frag.mo36758q1();
        actMo36758q1.getClass();
        j8w.m140404p0(j8wVarM140473a, type, actMo36758q1, new Function0() { // from class: l.t9w
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return u9w.m192668b(frag);
            }
        }, null, true, 8, null);
    }

    /* JADX INFO: renamed from: f */
    public final void m192673f(@Nullable SimpleDraweeView imageV, @NotNull Picture.ImageUri url, int percent) {
        url.getClass();
        m192674g(imageV, url, percent, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public final void m192674g(@Nullable SimpleDraweeView imageV, @NotNull Picture.ImageUri url, int percent, boolean mediaBuzz) {
        url.getClass();
        if (imageV == null) {
            return;
        }
        j760 j760VarM140076a = j760.m140076a(8, Integer.valueOf((100 - percent) / 10));
        j760VarM140076a.getClass();
        Integer num = (Integer) j760VarM140076a.f116565b;
        if (num != null) {
            if (num.intValue() > 0) {
                qib0.f154691G.m102336O(imageV, url.formatted(), 2, 8);
            } else {
                qib0.f154691G.m102341Q0(imageV, url);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m192675h() {
        Boolean bool = new hpd0("buzz_move_tab_tip_" + CoreModule.m29931H().userId(), Boolean.FALSE).get();
        bool.getClass();
        return bool.booleanValue();
    }

    /* JADX INFO: renamed from: i */
    public final void m192676i() {
        long jM155944o = mqi0.m155944o();
        new zpd0("love_buzz_user_click_time_" + CoreModule.m29931H().userId(), -1L).put(Long.valueOf(jM155944o));
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final Picture m192677j(@NotNull User user) {
        user.getClass();
        Picture pictureM60124fp = user.m60124fp();
        pictureM60124fp.getClass();
        return pictureM60124fp;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final Frag m192678k() {
        return new BuzzComboFrag();
    }

    /* JADX INFO: renamed from: l */
    public final int m192679l(int type, @Nullable Gender selfGender) {
        boolean zEquals = TEnum.equals(selfGender, "male");
        if (type == 1) {
            return zEquals ? y2c0.f195562i : y2c0.f195564j;
        }
        if (type != 2) {
            return zEquals ? y2c0.f195560h : y2c0.f195556f;
        }
        return zEquals ? y2c0.f195558g : y2c0.f195554e;
    }

    /* JADX INFO: renamed from: m */
    public final int m192680m() {
        String language = Locale.getDefault().getLanguage();
        if (language == null) {
            language = "";
        }
        if (C15386d.m93483J(language, "ko", false, 2, null)) {
            return y2c0.f195580r;
        }
        if (C15386d.m93483J(language, "th", false, 2, null)) {
            return y2c0.f195582s;
        }
        return C15386d.m93483J(language, "ja", false, 2, null) ? y2c0.f195578q : y2c0.f195574o;
    }

    /* JADX INFO: renamed from: n */
    public final void m192681n(@NotNull User user, @NotNull TextView tv2, float width, float height, boolean right) {
        user.getClass();
        tv2.getClass();
        Drawable drawableM133155b = hvc0.m133155b(!TEnum.equals(user.gender, "female") ? y2c0.f195525F : y2c0.f195533N);
        drawableM133155b.getClass();
        drawableM133155b.setBounds(0, 0, t100.m186890d(width), t100.m186890d(height));
        if (right) {
            xdl0.m208385l(tv2, drawableM133155b);
        } else {
            xdl0.m208383k(tv2, drawableM133155b);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m192682o(@NotNull User user, @NotNull TextView tv2, float width, float height) {
        user.getClass();
        tv2.getClass();
        m192684q(user, tv2);
        m192681n(user, tv2, width, height, true);
    }

    /* JADX INFO: renamed from: p */
    public final void m192683p(@Nullable User user, @NotNull ImageView region) {
        Location location;
        region.getClass();
        Integer numM124853d = g9w.INSTANCE.m124853d((user == null || (location = user.location) == null) ? null : location.region);
        if (numM124853d != null) {
            region.setBackgroundResource(numM124853d.intValue());
        }
        xdl0.m208344M(region, NullChecker.m81303a(numM124853d));
    }

    /* JADX INFO: renamed from: q */
    public final void m192684q(@NotNull User user, @NotNull TextView tv2) {
        user.getClass();
        tv2.getClass();
        StringBuilder sb = new StringBuilder();
        Integer num = user.age;
        num.getClass();
        sb.append(num.intValue());
        String strM133869j0 = i0g0.m133869j0(user.profile.zodiac);
        if (!TextUtils.isEmpty(strM133869j0)) {
            sb.append("  ");
            sb.append(strM133869j0);
        }
        tv2.setText(sb.toString());
    }

    /* JADX INFO: renamed from: r */
    public final void m192685r() {
        new hpd0("buzz_move_tab_tip_" + CoreModule.m29931H().userId(), Boolean.FALSE).put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: s */
    public final void m192686s(@Nullable Act act, @NotNull final SVGADynamicEntity entity, @NotNull final String url, @NotNull final String key) {
        C22306c c22306cDuringCreated;
        entity.getClass();
        url.getClass();
        key.getClass();
        if (act == null || (c22306cDuringCreated = act.duringCreated(C22306c.create(new C22306c.a() { // from class: l.q9w
            @Override // p149l.e30
            public final void call(Object obj) {
                u9w.m192670d(url, (z3g0) obj);
            }
        }))) == null) {
            return;
        }
        c22306cDuringCreated.subscribe(mkd0.m154956H(new e30() { // from class: l.r9w
            @Override // p149l.e30
            public final void call(Object obj) {
                u9w.m192667a(entity, key, (Bitmap) obj);
            }
        }, new e30() { // from class: l.s9w
            @Override // p149l.e30
            public final void call(Object obj) {
                u9w.m192669c((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t */
    public final void m192687t(@NotNull View v2, int left, int top, int right, int bottom) {
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
    public final void m192688v(@Nullable Act act, @Nullable View target, @NotNull C4345a.c callback) {
        callback.getClass();
        if (act == null || !m6w.INSTANCE.m153296a(act) || C4348d.m20896l().m20912x("love_buzz_tab_tip_bubble_key")) {
            qa2.INSTANCE.m173681a("LoveBuzzUIHelper", "showBuzzMoveTabTip act not valid or LOVE_BUZZ_TAB_TIP_BUBBLE_KEY is showing");
            return;
        }
        if (!NullChecker.m81303a(target) || act.isDialogShowing()) {
            qa2.INSTANCE.m173681a("LoveBuzzUIHelper", "showBuzzMoveTabTip target is null or act dlg is show");
            return;
        }
        m192685r();
        C4348d.m20896l().m20909u(new C4345a(act).m20849D(hvc0.m133156c(R$string.f20241m0)).m20870k(e16.m114375c(act, x0c0.f188947a)).m20852G(x0c0.f188948b).m20878t(true).m20855J(14.0f).m20864e(false).m20850E(false).m20882x(t100.f167256e).m20861b(3000L).m20869j(callback).m20875q(jtk.f119617D), target, "love_buzz_tab_tip_bubble_key");
    }
}
