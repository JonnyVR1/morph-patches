package p006l;

import android.app.Dialog;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p000p1.mobile.putong.core.p004ui.seeblindbox.SeeBlindBoxItem;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.a;
import com.p1.mobile.putong.core.data.PaymentResultWrapper;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.newui.home.NewNewHomeFrag;
import com.p1.mobile.putong.core.newui.main.NewMainAct;
import com.p1.mobile.putong.core.ui.profile.ProfileAct;
import com.p1.mobile.putong.core.ui.purchase.c;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l.ah60;
import l.d30;
import l.e30;
import l.l5j0;
import l.mkd0;
import l.o7r;
import l.u7e0;
import l.xdl0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VButton;
import v.VFrame;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\n¢\u0006\u0004\b\u001f\u0010\u001aJ\u0017\u0010\"\u001a\u00020\n2\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#J\u0019\u0010%\u001a\u00020\n2\b\u0010$\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b%\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\"\u00105\u001a\u00020.8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010=\u001a\u0002068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010E\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010L\u001a\u00020F8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000b\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\"\u0010O\u001a\u00020F8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0017\u0010G\u001a\u0004\bM\u0010I\"\u0004\bN\u0010KR\"\u0010R\u001a\u00020F8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u0010G\u001a\u0004\bP\u0010I\"\u0004\bQ\u0010KR\"\u0010U\u001a\u00020F8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bH\u0010G\u001a\u0004\bS\u0010I\"\u0004\bT\u0010KR\"\u0010\\\u001a\u00020V8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bM\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bP\u0010]R\u0018\u0010^\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010GR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010_¨\u0006`"}, d2 = {"Ll/t7e0;", "Landroid/view/View$OnClickListener;", "Lcom/p1/mobile/putong/core/newui/home/NewNewHomeFrag;", "homeFrag", "Lcom/p1/mobile/putong/data/User;", "data", "<init>", "(Lcom/p1/mobile/putong/core/newui/home/NewNewHomeFrag;Lcom/p1/mobile/putong/data/User;)V", "Landroid/view/View;", "view", "", "f", "(Landroid/view/View;)V", "user", "q", "(Lcom/p1/mobile/putong/data/User;)V", "Ll/l5j0;", "dialog", "o", "(Ll/l5j0;)V", "Lcom/p1/mobile/android/app/Act;", "act", "rootView", "g", "(Lcom/p1/mobile/android/app/Act;Landroid/view/View;)Ll/l5j0;", "t", "()V", "u", "", "p", "(Landroid/view/View;)Z", "s", "Lcom/p1/mobile/putong/core/data/SwipeDirection;", "swipeDirection", "r", "(Lcom/p1/mobile/putong/core/data/SwipeDirection;)V", "v", "onClick", "a", "Lcom/p1/mobile/putong/core/newui/home/NewNewHomeFrag;", "getHomeFrag", "()Lcom/p1/mobile/putong/core/newui/home/NewNewHomeFrag;", "b", "Lcom/p1/mobile/putong/data/User;", "getData", "()Lcom/p1/mobile/putong/data/User;", "Lv/VFrame;", "c", "Lv/VFrame;", "h", "()Lv/VFrame;", "set_bg_view", "(Lv/VFrame;)V", "_bg_view", "Lv/VImage;", "d", "Lv/VImage;", "n", "()Lv/VImage;", "set_title_icon", "(Lv/VImage;)V", "_title_icon", "Lv/VText;", "e", "Lv/VText;", "get_desc", "()Lv/VText;", "set_desc", "(Lv/VText;)V", "_desc", "Lcom/p1/mobile/putong/core/ui/seeblindbox/SeeBlindBoxItem;", "Lcom/p1/mobile/putong/core/ui/seeblindbox/SeeBlindBoxItem;", "i", "()Lcom/p1/mobile/putong/core/ui/seeblindbox/SeeBlindBoxItem;", "set_card_1", "(Lcom/p1/mobile/putong/core/ui/seeblindbox/SeeBlindBoxItem;)V", "_card_1", "j", "set_card_2", "_card_2", "k", "set_card_3", "_card_3", "l", "set_card_4", "_card_4", "Lv/VButton;", "Lv/VButton;", "m", "()Lv/VButton;", "set_skip", "(Lv/VButton;)V", "_skip", "Ll/l5j0;", "choseView", "Lcom/p1/mobile/putong/core/data/SwipeDirection;", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class t7e0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final NewNewHomeFrag homeFrag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final User data;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VFrame _bg_view;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VImage _title_icon;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VText _desc;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public SeeBlindBoxItem _card_1;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public SeeBlindBoxItem _card_2;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public SeeBlindBoxItem _card_3;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public SeeBlindBoxItem _card_4;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public VButton _skip;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public l5j0 dialog;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public SeeBlindBoxItem choseView;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public SwipeDirection swipeDirection;

    /* JADX INFO: renamed from: l.t7e0$a */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"l/t7e0$a", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", "Landroid/view/View;", "p0", "", "p1", "", "onStateChanged", "(Landroid/view/View;I)V", "", "onSlide", "(Landroid/view/View;F)V", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C1300a extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ l5j0 f21945a;

        public C1300a(l5j0 l5j0Var) {
            this.f21945a = l5j0Var;
        }

        public void onSlide(View p0, float p1) {
            p0.getClass();
        }

        public void onStateChanged(View p0, int p1) {
            p0.getClass();
            if (p1 == 1 || p1 == 2 || p1 == 3) {
                this.f21945a.getBehavior().setState(3);
            }
        }
    }

    public t7e0(@NotNull NewNewHomeFrag newNewHomeFrag, @NotNull User user) {
        newNewHomeFrag.getClass();
        user.getClass();
        this.homeFrag = newNewHomeFrag;
        this.data = user;
    }

    /* JADX INFO: renamed from: a */
    public static void m24500a(t7e0 t7e0Var, PaymentResultWrapper paymentResultWrapper) {
        l5j0 l5j0Var = t7e0Var.dialog;
        if (l5j0Var == null) {
            Intrinsics.r("dialog");
            l5j0Var = null;
        }
        l5j0Var.dismiss();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m24501b(t7e0 t7e0Var, int i, int i2, Intent intent) {
        if (i != 21) {
            return false;
        }
        t7e0Var.m24517r((i2 == SwipeDirection.RIGHT.getValue() || i2 == SwipeDirection.LEFT.getValue() || i2 == SwipeDirection.UP.getValue()) ? SwipeDirection.fromValue(i2) : null);
        return true;
    }

    /* JADX INFO: renamed from: c */
    public static void m24502c() {
        zvf0.x("e_intl_mystery_box_card", "p_intl_mystery_box_popup");
    }

    /* JADX INFO: renamed from: d */
    public static void m24503d(t7e0 t7e0Var, View view) {
        l5j0 l5j0Var = t7e0Var.dialog;
        if (l5j0Var == null) {
            Intrinsics.r("dialog");
            l5j0Var = null;
        }
        l5j0Var.dismiss();
    }

    /* JADX INFO: renamed from: e */
    public static void m24504e(t7e0 t7e0Var) {
        t7e0Var.m24519t();
    }

    /* JADX INFO: renamed from: f */
    public final void m24505f(View view) {
        u7e0.a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public final l5j0 m24506g(Act act, View rootView) {
        l5j0 l5j0Var = new l5j0(act, v7c0.f24184d);
        l5j0Var.setContentView(rootView);
        l5j0Var.setCancelable(true);
        l5j0Var.getBehavior().setState(3);
        l5j0Var.getBehavior().addBottomSheetCallback(new C1300a(l5j0Var));
        return l5j0Var;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final VFrame m24507h() {
        VFrame vFrame = this._bg_view;
        if (vFrame != null) {
            return vFrame;
        }
        Intrinsics.r("_bg_view");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final SeeBlindBoxItem m24508i() {
        SeeBlindBoxItem seeBlindBoxItem = this._card_1;
        if (seeBlindBoxItem != null) {
            return seeBlindBoxItem;
        }
        Intrinsics.r("_card_1");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final SeeBlindBoxItem m24509j() {
        SeeBlindBoxItem seeBlindBoxItem = this._card_2;
        if (seeBlindBoxItem != null) {
            return seeBlindBoxItem;
        }
        Intrinsics.r("_card_2");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final SeeBlindBoxItem m24510k() {
        SeeBlindBoxItem seeBlindBoxItem = this._card_3;
        if (seeBlindBoxItem != null) {
            return seeBlindBoxItem;
        }
        Intrinsics.r("_card_3");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final SeeBlindBoxItem m24511l() {
        SeeBlindBoxItem seeBlindBoxItem = this._card_4;
        if (seeBlindBoxItem != null) {
            return seeBlindBoxItem;
        }
        Intrinsics.r("_card_4");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final VButton m24512m() {
        VButton vButton = this._skip;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.r("_skip");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final VImage m24513n() {
        VImage vImage = this._title_icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_title_icon");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00a9  */
    /* JADX INFO: renamed from: o */
    public final void m24514o(l5j0 dialog) {
        int i;
        xdl0.E0(m24508i(), this);
        xdl0.E0(m24509j(), this);
        xdl0.E0(m24510k(), this);
        xdl0.E0(m24511l(), this);
        m24508i().post(new Runnable() { // from class: l.s7e0
            @Override // java.lang.Runnable
            public final void run() {
                t7e0.m24504e(this.f21130a);
            }
        });
        String language = Locale.getDefault().getLanguage();
        if (language == null) {
            i = x2c0.f25955Ib;
        } else {
            int iHashCode = language.hashCode();
            if (iHashCode != 3241) {
                if (iHashCode != 3365) {
                    if (iHashCode != 3383) {
                        if (iHashCode != 3428) {
                            if (iHashCode != 3700) {
                                if (iHashCode == 3886 && language.equals("zh")) {
                                    i = Intrinsics.d(Locale.getDefault().getCountry(), "TW") ? x2c0.f26141Ob : x2c0.f26110Nb;
                                } else {
                                    i = x2c0.f25955Ib;
                                }
                            } else if (language.equals("th")) {
                                i = x2c0.f26079Mb;
                            } else {
                                i = x2c0.f25955Ib;
                            }
                        } else if (language.equals("ko")) {
                            i = x2c0.f26048Lb;
                        } else {
                            i = x2c0.f25955Ib;
                        }
                    } else if (language.equals("ja")) {
                        i = x2c0.f26017Kb;
                    } else {
                        i = x2c0.f25955Ib;
                    }
                } else if (language.equals("in")) {
                    i = x2c0.f25986Jb;
                } else {
                    i = x2c0.f25955Ib;
                }
            } else if (language.equals("en")) {
                i = x2c0.f25955Ib;
            } else {
                i = x2c0.f25955Ib;
            }
        }
        m24513n().setBackgroundResource(i);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@Nullable View v) {
        if (Intrinsics.d(v, m24508i()) || Intrinsics.d(v, m24509j()) || Intrinsics.d(v, m24510k()) || Intrinsics.d(v, m24511l())) {
            zvf0.r("e_intl_mystery_box_card", "p_intl_mystery_box_popup");
            SeeBlindBoxItem seeBlindBoxItem = this.choseView;
            if (seeBlindBoxItem != null && (!Intrinsics.d(seeBlindBoxItem, v) || this.swipeDirection != null)) {
                if (!Intrinsics.d(this.choseView, v) || this.swipeDirection == null) {
                    c.E1(this.homeFrag.Y4(), "", (Privilege) null, (d30) null, (Object) null, 28, (Object) null);
                    return;
                }
                return;
            }
            v.getClass();
            this.choseView = (SeeBlindBoxItem) v;
            Intent intentN2 = ProfileAct.n2(this.homeFrag.getContext(), ((DbObject) this.data).id, "from_see_blind_box", true);
            m24520u();
            this.homeFrag.u4(21, intentN2, new a.a() { // from class: l.o7e0
                /* JADX INFO: renamed from: a */
                public final boolean m20384a(int i, int i2, Intent intent) {
                    return t7e0.m24501b(this.f18049a, i, i2, intent);
                }
            });
            this.homeFrag.Y4().overridePendingTransition(rzb0.f20953y, 0);
        }
    }

    /* JADX INFO: renamed from: p */
    public final boolean m24515p(View view) {
        return Intrinsics.d(this.choseView, view);
    }

    /* JADX INFO: renamed from: q */
    public final void m24516q(User user) {
        Picture picture = user.picture(0);
        if (picture != null) {
            qib0.f19782G.m12724A0(picture.profileMiddle().formatted());
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m24517r(@Nullable SwipeDirection swipeDirection) {
        this.swipeDirection = swipeDirection;
        SeeBlindBoxItem seeBlindBoxItem = this.choseView;
        if (seeBlindBoxItem != null) {
            seeBlindBoxItem.m8313b();
        }
        m24519t();
        SeeBlindBoxItem seeBlindBoxItem2 = this.choseView;
        if (seeBlindBoxItem2 != null) {
            NewMainAct newMainActY4 = this.homeFrag.Y4();
            newMainActY4.getClass();
            seeBlindBoxItem2.m8314c(newMainActY4, swipeDirection, this.data);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m24518s() {
        l5j0 l5j0Var = null;
        View viewInflate = o7r.a(this.homeFrag.getContext()).inflate(f6c0.f11830J5, (ViewGroup) null);
        viewInflate.getClass();
        m24505f(viewInflate);
        NewMainAct newMainActY4 = this.homeFrag.Y4();
        newMainActY4.getClass();
        l5j0 l5j0VarM24506g = m24506g(newMainActY4, viewInflate);
        this.dialog = l5j0VarM24506g;
        if (l5j0VarM24506g == null) {
            Intrinsics.r("dialog");
            l5j0VarM24506g = null;
        }
        m24514o(l5j0VarM24506g);
        Dialog dialog = this.dialog;
        if (dialog == null) {
            Intrinsics.r("dialog");
            dialog = null;
        }
        dialog.show();
        l5j0 l5j0Var2 = this.dialog;
        if (l5j0Var2 == null) {
            Intrinsics.r("dialog");
        } else {
            l5j0Var = l5j0Var2;
        }
        l5j0Var.duringCreated(ah60.E()).subscribe(mkd0.G(new e30() { // from class: l.p7e0
            public final void call(Object obj) {
                t7e0.m24500a(this.f18620a, (PaymentResultWrapper) obj);
            }
        }));
        xdl0.E0(m24512m(), new View.OnClickListener() { // from class: l.q7e0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                t7e0.m24503d(this.f19658a, view);
            }
        });
        viewInflate.post(new Runnable() { // from class: l.r7e0
            @Override // java.lang.Runnable
            public final void run() {
                t7e0.m24502c();
            }
        });
        m24516q(this.data);
        qib0.f19782G.m12727D(m24507h(), "https://fe-static.tancdn.com/v1/images/eyJpZCI6Ik0zQlA0VUhOTUJYU1o3UEpTSFFRNTZTRUNJVDdWTTE0IiwidyI6MTEyNSwiaCI6MTU5MCwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjE3MzE0OTQ0MTg3NDc3ODc1NzR9.webp");
    }

    /* JADX INFO: renamed from: t */
    public final void m24519t() {
        if (!m24515p(m24508i())) {
            m24508i().m8317f("core_intl_see_blind_box_star_1.svga");
        }
        if (!m24515p(m24511l())) {
            m24511l().m8317f("core_intl_see_blind_box_star_1.svga");
        }
        if (!m24515p(m24509j())) {
            m24509j().m8317f("core_intl_see_blind_box_star_2.svga");
        }
        if (m24515p(m24510k())) {
            return;
        }
        m24510k().m8317f("core_intl_see_blind_box_star_2.svga");
    }

    /* JADX INFO: renamed from: u */
    public final void m24520u() {
        m24508i().m8318g();
        m24511l().m8318g();
        m24509j().m8318g();
        m24510k().m8318g();
    }
}
