package p153l;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.data.Meta;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.data.SettingGroups;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserLiveSettings;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.external.R$string;
import com.tantanapp.media.ttmediautils.download.Action1;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VDraweeView;
import p151v.VSwitchButton;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\u0004J\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001a\u0010\u0004J\r\u0010\u001b\u001a\u00020\u0005¢\u0006\u0004\b\u001b\u0010\u0004R\u0016\u0010\u001e\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001b\u0010'\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001b\u0010,\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b*\u0010+R\u001b\u0010/\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010$\u001a\u0004\b.\u0010+R\u001b\u00104\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010$\u001a\u0004\b2\u00103R\u001b\u00109\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010$\u001a\u0004\b7\u00108¨\u0006:"}, m88121d2 = {"Ll/o4l;", "Ll/iam;", "Ll/r4l;", "<init>", "()V", "", BaseSei.f14625Y, c4s.C_ZONE, "A", "K", "E", "H", "B", "fragPresenter", "q", "(Ll/r4l;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "destroy", "r", "a", "Landroid/view/View;", "parentView", "b", "Ll/r4l;", "hideWealthIconFragPresenter", "Lv/navigationbar/VNavigationBar;", "c", "Lkotlin/Lazy;", "w", "()Lv/navigationbar/VNavigationBar;", "navigationBar", "Lv/VSwitchButton;", Constants.INAPP_DATA_TAG, BLiveStormDanmakuGiftResourceType.f45294s, "()Lv/VSwitchButton;", "cardSwitch", "e", BaseSei.f14624X, "profileSwitch", "Lv/VText;", "f", "u", "()Lv/VText;", "descText", "Lv/VDraweeView;", "g", ResourceDirection.f39656v, "()Lv/VDraweeView;", "imageDraweeView", "external_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class o4l implements iam<r4l> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public View parentView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public r4l hideWealthIconFragPresenter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Lazy navigationBar;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Lazy cardSwitch;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final Lazy profileSwitch;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final Lazy descText;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final Lazy imageDraweeView;

    /* JADX INFO: renamed from: l.o4l$a */
    @Metadata(m88120d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J-\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {"l/o4l$a", "Ll/fn2;", "", "id", "Ll/qim;", "imageInfo", "Landroid/graphics/drawable/Animatable;", "animatable", "", "h", "(Ljava/lang/String;Ll/qim;Landroid/graphics/drawable/Animatable;)V", "external_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C19033a extends fn2 {
        public C19033a() {
        }

        /* JADX INFO: renamed from: j */
        public static void m166060j(o4l o4lVar, int i, int i2) {
            int width = o4lVar.m166058v().getWidth();
            int i3 = (int) ((i / i2) * width);
            ViewGroup.LayoutParams layoutParams = o4lVar.m166058v().getLayoutParams();
            layoutParams.width = width;
            layoutParams.height = i3;
            o4lVar.m166058v().setLayoutParams(layoutParams);
        }

        @Override // p153l.fn2
        /* JADX INFO: renamed from: h */
        public void mo40111h(String id, qim imageInfo, Animatable animatable) {
            super.mo40111h(id, imageInfo, animatable);
            if (imageInfo == null) {
                return;
            }
            final int height = imageInfo.getHeight();
            final int width = imageInfo.getWidth();
            VDraweeView vDraweeViewM166058v = o4l.this.m166058v();
            final o4l o4lVar = o4l.this;
            vDraweeViewM166058v.post(new Runnable() { // from class: l.n4l
                @Override // java.lang.Runnable
                public final void run() {
                    o4l.C19033a.m166060j(o4lVar, height, width);
                }
            });
        }
    }

    public o4l() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.navigationBar = LazyKt__LazyJVMKt.m88117a(lazyThreadSafetyMode, new Function0() { // from class: l.e4l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return o4l.m166041l(this.f92114a);
            }
        });
        this.cardSwitch = LazyKt__LazyJVMKt.m88117a(lazyThreadSafetyMode, new Function0() { // from class: l.f4l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return o4l.m166036e(this.f97113a);
            }
        });
        this.profileSwitch = LazyKt__LazyJVMKt.m88117a(lazyThreadSafetyMode, new Function0() { // from class: l.g4l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return o4l.m166033b(this.f102183a);
            }
        });
        this.descText = LazyKt__LazyJVMKt.m88117a(lazyThreadSafetyMode, new Function0() { // from class: l.h4l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return o4l.m166039j(this.f107814a);
            }
        });
        this.imageDraweeView = LazyKt__LazyJVMKt.m88117a(lazyThreadSafetyMode, new Function0() { // from class: l.i4l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return o4l.m166040k(this.f112926a);
            }
        });
    }

    /* JADX INFO: renamed from: F */
    public static final void m166028F(o4l o4lVar, BLiveEnvelope bLiveEnvelope) {
        if (bLiveEnvelope != null) {
            Meta meta = bLiveEnvelope.meta;
            int i = meta.code;
            if (i == 43302) {
                o1j0.m165651y(meta.message);
            } else if (i == 200) {
                o1j0.m165651y(o4lVar.m166056s().isChecked() ? xau.m209910t(R$string.f45719I) : xau.m209910t(R$string.f45717G));
                mbs.m157832R(mbs.m157870o0());
            }
        }
    }

    /* JADX INFO: renamed from: G */
    public static final void m166029G(o4l o4lVar, Throwable th) {
        if (th != null) {
            o4lVar.m166056s().setCheckedImmediately(!o4lVar.m166056s().isChecked());
            if (th instanceof TantanException.Client.CoreService) {
                TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
                if (coreService.code == 43302) {
                    o1j0.m165651y(coreService.metaMessage);
                    return;
                }
            }
            o1j0.m165622D(xau.m209910t(R$string.f45737a));
        }
    }

    /* JADX INFO: renamed from: I */
    public static final void m166030I(o4l o4lVar, BLiveEnvelope bLiveEnvelope) {
        if (bLiveEnvelope != null) {
            Meta meta = bLiveEnvelope.meta;
            int i = meta.code;
            if (i == 43303) {
                o1j0.m165651y(meta.message);
            } else if (i == 200) {
                o1j0.m165651y(o4lVar.m166059x().isChecked() ? xau.m209910t(R$string.f45719I) : xau.m209910t(R$string.f45717G));
                mbs.m157832R(mbs.m157870o0());
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public static final void m166031J(o4l o4lVar, Throwable th) {
        if (th != null) {
            o4lVar.m166059x().setCheckedImmediately(!o4lVar.m166059x().isChecked());
            if (th instanceof TantanException.Client.CoreService) {
                TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
                if (coreService.code == 43303) {
                    o1j0.m165651y(coreService.metaMessage);
                    return;
                }
            }
            o1j0.m165622D(xau.m209910t(R$string.f45737a));
        }
    }

    /* JADX INFO: renamed from: b */
    public static VSwitchButton m166033b(o4l o4lVar) {
        View view = o4lVar.parentView;
        if (view == null) {
            Intrinsics.m88391r("parentView");
            view = null;
        }
        return (VSwitchButton) view.findViewById(ldc0.f131594r0);
    }

    /* JADX INFO: renamed from: e */
    public static VSwitchButton m166036e(o4l o4lVar) {
        View view = o4lVar.parentView;
        if (view == null) {
            Intrinsics.m88391r("parentView");
            view = null;
        }
        return (VSwitchButton) view.findViewById(ldc0.f131590q0);
    }

    /* JADX INFO: renamed from: j */
    public static VText m166039j(o4l o4lVar) {
        View view = o4lVar.parentView;
        if (view == null) {
            Intrinsics.m88391r("parentView");
            view = null;
        }
        View viewFindViewById = view.findViewById(ldc0.f131598s0);
        viewFindViewById.getClass();
        return (VText) viewFindViewById;
    }

    /* JADX INFO: renamed from: k */
    public static VDraweeView m166040k(o4l o4lVar) {
        View view = o4lVar.parentView;
        if (view == null) {
            Intrinsics.m88391r("parentView");
            view = null;
        }
        View viewFindViewById = view.findViewById(ldc0.f131513W);
        viewFindViewById.getClass();
        return (VDraweeView) viewFindViewById;
    }

    /* JADX INFO: renamed from: l */
    public static VNavigationBar m166041l(o4l o4lVar) {
        View view = o4lVar.parentView;
        if (view == null) {
            Intrinsics.m88391r("parentView");
            view = null;
        }
        return (VNavigationBar) view.findViewById(ldc0.f131535c1);
    }

    /* JADX INFO: renamed from: m */
    public static void m166042m(final o4l o4lVar, View view) {
        r4l r4lVar = o4lVar.hideWealthIconFragPresenter;
        if (r4lVar == null) {
            Intrinsics.m88391r("hideWealthIconFragPresenter");
            r4lVar = null;
        }
        r4lVar.m179774s2("hideProfile", o4lVar.m166059x().isChecked(), new Action1() { // from class: l.l4l
            @Override // com.tantanapp.media.ttmediautils.download.Action1
            public final void call(Object obj) {
                o4l.m166030I(this.f129987a, (BLiveEnvelope) obj);
            }
        }, new Action1() { // from class: l.m4l
            @Override // com.tantanapp.media.ttmediautils.download.Action1
            public final void call(Object obj) {
                o4l.m166031J(this.f134814a, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public static void m166043n(final o4l o4lVar, View view) {
        r4l r4lVar = o4lVar.hideWealthIconFragPresenter;
        if (r4lVar == null) {
            Intrinsics.m88391r("hideWealthIconFragPresenter");
            r4lVar = null;
        }
        r4lVar.m179774s2("hideCard", o4lVar.m166056s().isChecked(), new Action1() { // from class: l.c4l
            @Override // com.tantanapp.media.ttmediautils.download.Action1
            public final void call(Object obj) {
                o4l.m166028F(this.f79711a, (BLiveEnvelope) obj);
            }
        }, new Action1() { // from class: l.d4l
            @Override // com.tantanapp.media.ttmediautils.download.Action1
            public final void call(Object obj) {
                o4l.m166029G(this.f85053a, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    private final VNavigationBar m166045w() {
        Object value = this.navigationBar.getValue();
        value.getClass();
        return (VNavigationBar) value;
    }

    /* JADX INFO: renamed from: y */
    private final void m166046y() {
        VNavigationBar vNavigationBarM166045w = m166045w();
        vNavigationBarM166045w.setTitle(xau.m209910t(R$string.f45718H));
        vNavigationBarM166045w.setLeftIconOnClick(new View.OnClickListener() { // from class: l.j4l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o4l.m166047z(this.f118307a, view);
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public static final void m166047z(o4l o4lVar, View view) {
        Act act = o4lVar.getAct();
        if (act != null) {
            act.onBackPressed();
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m166048A() {
        m166057u().setText(tbs.f172989b.m203725s4());
    }

    /* JADX INFO: renamed from: B */
    public final void m166049B() {
        izs.m142872w("context_livingAct", m166058v(), tbs.f172989b.m203716r4(), new C19033a());
    }

    /* JADX INFO: renamed from: C */
    public final void m166050C() {
        Settings settings;
        List<SettingGroups> list;
        SettingGroups settingGroups;
        UserLiveSettings userLiveSettings;
        User userM157824J = mbs.m157824J();
        if (userM157824J == null || (settings = userM157824J.settings) == null || (list = settings.settingGroups) == null || (settingGroups = list.get(0)) == null || (userLiveSettings = settingGroups.live) == null) {
            return;
        }
        VSwitchButton vSwitchButtonM166056s = m166056s();
        Boolean bool = userLiveSettings.hideSwipeWealthTag;
        bool.getClass();
        vSwitchButtonM166056s.setCheckedImmediately(bool.booleanValue());
        VSwitchButton vSwitchButtonM166059x = m166059x();
        Boolean bool2 = userLiveSettings.hideProfileWealthTag;
        bool2.getClass();
        vSwitchButtonM166059x.setCheckedImmediately(bool2.booleanValue());
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        View view = this.parentView;
        if (view == null) {
            Intrinsics.m88391r("parentView");
            view = null;
        }
        return view.getContext();
    }

    /* JADX INFO: renamed from: E */
    public final void m166051E() {
        m166056s().setOnClickListener(new View.OnClickListener() { // from class: l.b4l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o4l.m166043n(this.f74936a, view);
            }
        });
    }

    /* JADX INFO: renamed from: H */
    public final void m166052H() {
        m166059x().setOnClickListener(new View.OnClickListener() { // from class: l.k4l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o4l.m166042m(this.f123895a, view);
            }
        });
    }

    /* JADX INFO: renamed from: K */
    public final void m166053K() {
        m166051E();
        m166052H();
    }

    @Override // p153l.iam
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewInflate = inflater.inflate(xec0.f193903r, parent, false);
        viewInflate.getClass();
        this.parentView = viewInflate;
        if (viewInflate != null) {
            return viewInflate;
        }
        Intrinsics.m88391r("parentView");
        return null;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(@NotNull r4l fragPresenter) {
        fragPresenter.getClass();
        this.hideWealthIconFragPresenter = fragPresenter;
    }

    /* JADX INFO: renamed from: r */
    public final void m166055r() {
        m166046y();
        m166048A();
        m166050C();
        m166053K();
        m166049B();
    }

    /* JADX INFO: renamed from: s */
    public final VSwitchButton m166056s() {
        Object value = this.cardSwitch.getValue();
        value.getClass();
        return (VSwitchButton) value;
    }

    /* JADX INFO: renamed from: u */
    public final VText m166057u() {
        return (VText) this.descText.getValue();
    }

    /* JADX INFO: renamed from: v */
    public final VDraweeView m166058v() {
        return (VDraweeView) this.imageDraweeView.getValue();
    }

    /* JADX INFO: renamed from: x */
    public final VSwitchButton m166059x() {
        Object value = this.profileSwitch.getValue();
        value.getClass();
        return (VSwitchButton) value;
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
