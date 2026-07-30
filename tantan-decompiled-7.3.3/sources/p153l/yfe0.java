package p153l;

import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4468a;
import com.p051p1.mobile.putong.core.data.PaymentResultWrapper;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.newui.home.NewNewHomeFrag;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.p058ui.profile.ProfileAct;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.core.p058ui.seeblindbox.SeeBlindBoxItem;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.OMSTemplateType;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VButton;
import p151v.VFrame;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\n¢\u0006\u0004\b\u001f\u0010\u001aJ\u0017\u0010\"\u001a\u00020\n2\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#J\u0019\u0010%\u001a\u00020\n2\b\u0010$\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b%\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\"\u00105\u001a\u00020.8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010=\u001a\u0002068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010E\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010L\u001a\u00020F8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000b\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\"\u0010O\u001a\u00020F8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0017\u0010G\u001a\u0004\bM\u0010I\"\u0004\bN\u0010KR\"\u0010R\u001a\u00020F8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u0010G\u001a\u0004\bP\u0010I\"\u0004\bQ\u0010KR\"\u0010U\u001a\u00020F8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bH\u0010G\u001a\u0004\bS\u0010I\"\u0004\bT\u0010KR\"\u0010\\\u001a\u00020V8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bM\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bP\u0010]R\u0018\u0010^\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010GR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010_¨\u0006`"}, m88121d2 = {"Ll/yfe0;", "Landroid/view/View$OnClickListener;", "Lcom/p1/mobile/putong/core/newui/home/NewNewHomeFrag;", "homeFrag", "Lcom/p1/mobile/putong/data/User;", "data", "<init>", "(Lcom/p1/mobile/putong/core/newui/home/NewNewHomeFrag;Lcom/p1/mobile/putong/data/User;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "f", "(Landroid/view/View;)V", "user", "q", "(Lcom/p1/mobile/putong/data/User;)V", "Ll/pej0;", OMSTemplateType.dialog, "o", "(Ll/pej0;)V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "rootView", "g", "(Lcom/p1/mobile/android/app/Act;Landroid/view/View;)Ll/pej0;", Constants.KEY_T, "()V", "u", "", "p", "(Landroid/view/View;)Z", BLiveStormDanmakuGiftResourceType.f45294s, "Lcom/p1/mobile/putong/core/data/SwipeDirection;", "swipeDirection", "r", "(Lcom/p1/mobile/putong/core/data/SwipeDirection;)V", ResourceDirection.f39656v, "onClick", "a", "Lcom/p1/mobile/putong/core/newui/home/NewNewHomeFrag;", "getHomeFrag", "()Lcom/p1/mobile/putong/core/newui/home/NewNewHomeFrag;", "b", "Lcom/p1/mobile/putong/data/User;", "getData", "()Lcom/p1/mobile/putong/data/User;", "Lv/VFrame;", "c", "Lv/VFrame;", "h", "()Lv/VFrame;", "set_bg_view", "(Lv/VFrame;)V", "_bg_view", "Lv/VImage;", Constants.INAPP_DATA_TAG, "Lv/VImage;", "n", "()Lv/VImage;", "set_title_icon", "(Lv/VImage;)V", "_title_icon", "Lv/VText;", "e", "Lv/VText;", "get_desc", "()Lv/VText;", "set_desc", "(Lv/VText;)V", "_desc", "Lcom/p1/mobile/putong/core/ui/seeblindbox/SeeBlindBoxItem;", "Lcom/p1/mobile/putong/core/ui/seeblindbox/SeeBlindBoxItem;", RXScreenCaptureService.KEY_INDEX, "()Lcom/p1/mobile/putong/core/ui/seeblindbox/SeeBlindBoxItem;", "set_card_1", "(Lcom/p1/mobile/putong/core/ui/seeblindbox/SeeBlindBoxItem;)V", "_card_1", "j", "set_card_2", "_card_2", "k", "set_card_3", "_card_3", BLiveStormDanmakuGiftResourceType.f45292l, "set_card_4", "_card_4", "Lv/VButton;", "Lv/VButton;", "m", "()Lv/VButton;", "set_skip", "(Lv/VButton;)V", "_skip", "Ll/pej0;", "choseView", "Lcom/p1/mobile/putong/core/data/SwipeDirection;", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class yfe0 implements View.OnClickListener {

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
    public pej0 dialog;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public SeeBlindBoxItem choseView;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public SwipeDirection swipeDirection;

    /* JADX INFO: renamed from: l.yfe0$a */
    @Metadata(m88120d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m88121d2 = {"l/yfe0$a", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", "Landroid/view/View;", "p0", "", "p1", "", "onStateChanged", "(Landroid/view/View;I)V", "", "onSlide", "(Landroid/view/View;F)V", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C21568a extends BottomSheetBehavior.BottomSheetCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ pej0 f199512a;

        public C21568a(pej0 pej0Var) {
            this.f199512a = pej0Var;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(View p0, float p1) {
            p0.getClass();
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(View p0, int p1) {
            p0.getClass();
            if (p1 == 1 || p1 == 2 || p1 == 3) {
                this.f199512a.getBehavior().setState(3);
            }
        }
    }

    public yfe0(@NotNull NewNewHomeFrag newNewHomeFrag, @NotNull User user) {
        newNewHomeFrag.getClass();
        user.getClass();
        this.homeFrag = newNewHomeFrag;
        this.data = user;
    }

    /* JADX INFO: renamed from: a */
    public static void m215560a(yfe0 yfe0Var, PaymentResultWrapper paymentResultWrapper) {
        pej0 pej0Var = yfe0Var.dialog;
        if (pej0Var == null) {
            Intrinsics.m88391r(OMSTemplateType.dialog);
            pej0Var = null;
        }
        pej0Var.dismiss();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m215561b(yfe0 yfe0Var, int i, int i2, Intent intent) {
        if (i != 21) {
            return false;
        }
        yfe0Var.m215577r((i2 == SwipeDirection.RIGHT.getValue() || i2 == SwipeDirection.LEFT.getValue() || i2 == SwipeDirection.UP.getValue()) ? SwipeDirection.fromValue(i2) : null);
        return true;
    }

    /* JADX INFO: renamed from: c */
    public static void m215562c() {
        i4g0.m138526x("e_intl_mystery_box_card", "p_intl_mystery_box_popup");
    }

    /* JADX INFO: renamed from: d */
    public static void m215563d(yfe0 yfe0Var, View view) {
        pej0 pej0Var = yfe0Var.dialog;
        if (pej0Var == null) {
            Intrinsics.m88391r(OMSTemplateType.dialog);
            pej0Var = null;
        }
        pej0Var.dismiss();
    }

    /* JADX INFO: renamed from: e */
    public static void m215564e(yfe0 yfe0Var) {
        yfe0Var.m215579t();
    }

    /* JADX INFO: renamed from: f */
    public final void m215565f(View view) {
        zfe0.m219535a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public final pej0 m215566g(Act act, View rootView) {
        pej0 pej0Var = new pej0(act, agc0.f71118d);
        pej0Var.setContentView(rootView);
        pej0Var.setCancelable(true);
        pej0Var.getBehavior().setState(3);
        pej0Var.getBehavior().addBottomSheetCallback(new C21568a(pej0Var));
        return pej0Var;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final VFrame m215567h() {
        VFrame vFrame = this._bg_view;
        if (vFrame != null) {
            return vFrame;
        }
        Intrinsics.m88391r("_bg_view");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final SeeBlindBoxItem m215568i() {
        SeeBlindBoxItem seeBlindBoxItem = this._card_1;
        if (seeBlindBoxItem != null) {
            return seeBlindBoxItem;
        }
        Intrinsics.m88391r("_card_1");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final SeeBlindBoxItem m215569j() {
        SeeBlindBoxItem seeBlindBoxItem = this._card_2;
        if (seeBlindBoxItem != null) {
            return seeBlindBoxItem;
        }
        Intrinsics.m88391r("_card_2");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final SeeBlindBoxItem m215570k() {
        SeeBlindBoxItem seeBlindBoxItem = this._card_3;
        if (seeBlindBoxItem != null) {
            return seeBlindBoxItem;
        }
        Intrinsics.m88391r("_card_3");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final SeeBlindBoxItem m215571l() {
        SeeBlindBoxItem seeBlindBoxItem = this._card_4;
        if (seeBlindBoxItem != null) {
            return seeBlindBoxItem;
        }
        Intrinsics.m88391r("_card_4");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final VButton m215572m() {
        VButton vButton = this._skip;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.m88391r("_skip");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final VImage m215573n() {
        VImage vImage = this._title_icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_title_icon");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00a9  */
    /* JADX INFO: renamed from: o */
    public final void m215574o(pej0 dialog) {
        int i;
        bnl0.m105509E0(m215568i(), this);
        bnl0.m105509E0(m215569j(), this);
        bnl0.m105509E0(m215570k(), this);
        bnl0.m105509E0(m215571l(), this);
        m215568i().post(new Runnable() { // from class: l.xfe0
            @Override // java.lang.Runnable
            public final void run() {
                yfe0.m215564e(this.f194028a);
            }
        });
        String language = Locale.getDefault().getLanguage();
        if (language == null) {
            i = dbc0.f86276Jb;
        } else {
            int iHashCode = language.hashCode();
            if (iHashCode != 3241) {
                if (iHashCode != 3365) {
                    if (iHashCode != 3383) {
                        if (iHashCode != 3428) {
                            if (iHashCode != 3700) {
                                if (iHashCode == 3886 && language.equals("zh")) {
                                    i = Intrinsics.m88377d(Locale.getDefault().getCountry(), "TW") ? dbc0.f86468Pb : dbc0.f86436Ob;
                                } else {
                                    i = dbc0.f86276Jb;
                                }
                            } else if (language.equals("th")) {
                                i = dbc0.f86404Nb;
                            } else {
                                i = dbc0.f86276Jb;
                            }
                        } else if (language.equals("ko")) {
                            i = dbc0.f86372Mb;
                        } else {
                            i = dbc0.f86276Jb;
                        }
                    } else if (language.equals("ja")) {
                        i = dbc0.f86340Lb;
                    } else {
                        i = dbc0.f86276Jb;
                    }
                } else if (language.equals("in")) {
                    i = dbc0.f86308Kb;
                } else {
                    i = dbc0.f86276Jb;
                }
            } else if (language.equals("en")) {
                i = dbc0.f86276Jb;
            } else {
                i = dbc0.f86276Jb;
            }
        }
        m215573n().setBackgroundResource(i);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@Nullable View v2) {
        if (Intrinsics.m88377d(v2, m215568i()) || Intrinsics.m88377d(v2, m215569j()) || Intrinsics.m88377d(v2, m215570k()) || Intrinsics.m88377d(v2, m215571l())) {
            i4g0.m138520r("e_intl_mystery_box_card", "p_intl_mystery_box_popup");
            SeeBlindBoxItem seeBlindBoxItem = this.choseView;
            if (seeBlindBoxItem != null && (!Intrinsics.m88377d(seeBlindBoxItem, v2) || this.swipeDirection != null)) {
                if (!Intrinsics.m88377d(this.choseView, v2) || this.swipeDirection == null) {
                    C8927c.m54571E1(this.homeFrag.act(), "", null, null, null, 28, null);
                    return;
                }
                return;
            }
            v2.getClass();
            this.choseView = (SeeBlindBoxItem) v2;
            Intent intentM51920o2 = ProfileAct.m51920o2(this.homeFrag.getContext(), this.data.f56859id, "from_see_blind_box", true);
            m215580u();
            this.homeFrag.m21600u4(21, intentM51920o2, new C4468a.a() { // from class: l.tfe0
                @Override // com.p051p1.mobile.android.app.C4468a.a
                /* JADX INFO: renamed from: a */
                public final boolean mo21400a(int i, int i2, Intent intent) {
                    return yfe0.m215561b(this.f173951a, i, i2, intent);
                }
            });
            this.homeFrag.act().overridePendingTransition(x7c0.f192710y, 0);
        }
    }

    /* JADX INFO: renamed from: p */
    public final boolean m215575p(View view) {
        return Intrinsics.m88377d(this.choseView, view);
    }

    /* JADX INFO: renamed from: q */
    public final void m215576q(User user) {
        Picture picture = user.picture(0);
        if (picture != null) {
            uqb0.f180374G.m127095A0(picture.profileMiddle().formatted());
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m215577r(@Nullable SwipeDirection swipeDirection) {
        this.swipeDirection = swipeDirection;
        SeeBlindBoxItem seeBlindBoxItem = this.choseView;
        if (seeBlindBoxItem != null) {
            seeBlindBoxItem.m56132b();
        }
        m215579t();
        SeeBlindBoxItem seeBlindBoxItem2 = this.choseView;
        if (seeBlindBoxItem2 != null) {
            NewMainAct newMainActAct = this.homeFrag.act();
            newMainActAct.getClass();
            seeBlindBoxItem2.m56133c(newMainActAct, swipeDirection, this.data);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m215578s() {
        pej0 pej0Var = null;
        View viewInflate = p9r.m171370a(this.homeFrag.getContext()).inflate(kec0.f125486K5, (ViewGroup) null);
        viewInflate.getClass();
        m215565f(viewInflate);
        NewMainAct newMainActAct = this.homeFrag.act();
        newMainActAct.getClass();
        pej0 pej0VarM215566g = m215566g(newMainActAct, viewInflate);
        this.dialog = pej0VarM215566g;
        if (pej0VarM215566g == null) {
            Intrinsics.m88391r(OMSTemplateType.dialog);
            pej0VarM215566g = null;
        }
        m215574o(pej0VarM215566g);
        pej0 pej0Var2 = this.dialog;
        if (pej0Var2 == null) {
            Intrinsics.m88391r(OMSTemplateType.dialog);
            pej0Var2 = null;
        }
        pej0Var2.show();
        pej0 pej0Var3 = this.dialog;
        if (pej0Var3 == null) {
            Intrinsics.m88391r(OMSTemplateType.dialog);
        } else {
            pej0Var = pej0Var3;
        }
        pej0Var.duringCreated(fp60.m126543E()).subscribe(psd0.m173596G(new y20() { // from class: l.ufe0
            @Override // p153l.y20
            public final void call(Object obj) {
                yfe0.m215560a(this.f178756a, (PaymentResultWrapper) obj);
            }
        }));
        bnl0.m105509E0(m215572m(), new View.OnClickListener() { // from class: l.vfe0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                yfe0.m215563d(this.f183897a, view);
            }
        });
        viewInflate.post(new Runnable() { // from class: l.wfe0
            @Override // java.lang.Runnable
            public final void run() {
                yfe0.m215562c();
            }
        });
        m215576q(this.data);
        uqb0.f180374G.m127098D(m215567h(), "https://fe-static.tancdn.com/v1/images/eyJpZCI6Ik0zQlA0VUhOTUJYU1o3UEpTSFFRNTZTRUNJVDdWTTE0IiwidyI6MTEyNSwiaCI6MTU5MCwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjE3MzE0OTQ0MTg3NDc3ODc1NzR9.webp");
    }

    /* JADX INFO: renamed from: t */
    public final void m215579t() {
        if (!m215575p(m215568i())) {
            m215568i().m56136f("core_intl_see_blind_box_star_1.svga");
        }
        if (!m215575p(m215571l())) {
            m215571l().m56136f("core_intl_see_blind_box_star_1.svga");
        }
        if (!m215575p(m215569j())) {
            m215569j().m56136f("core_intl_see_blind_box_star_2.svga");
        }
        if (m215575p(m215570k())) {
            return;
        }
        m215570k().m56136f("core_intl_see_blind_box_star_2.svga");
    }

    /* JADX INFO: renamed from: u */
    public final void m215580u() {
        m215568i().m56137g();
        m215571l().m56137g();
        m215569j().m56137g();
        m215570k().m56137g();
    }
}
