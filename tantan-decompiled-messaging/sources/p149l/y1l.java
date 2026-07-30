package p149l;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.data.Meta;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.data.SettingGroups;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserLiveSettings;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.external.R$string;
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
import p147v.VDraweeView;
import p147v.VSwitchButton;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\u0004J\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001a\u0010\u0004J\r\u0010\u001b\u001a\u00020\u0005¢\u0006\u0004\b\u001b\u0010\u0004R\u0016\u0010\u001e\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001b\u0010'\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001b\u0010,\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b*\u0010+R\u001b\u0010/\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010$\u001a\u0004\b.\u0010+R\u001b\u00104\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010$\u001a\u0004\b2\u00103R\u001b\u00109\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010$\u001a\u0004\b7\u00108¨\u0006:"}, m87232d2 = {"Ll/y1l;", "Ll/s7m;", "Ll/b2l;", "<init>", "()V", "", BaseSei.f13931Y, b2s.C_ZONE, "A", "K", "E", "H", "B", "fragPresenter", "q", "(Ll/b2l;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "destroy", "r", "a", "Landroid/view/View;", "parentView", "b", "Ll/b2l;", "hideWealthIconFragPresenter", "Lv/navigationbar/VNavigationBar;", "c", "Lkotlin/Lazy;", "w", "()Lv/navigationbar/VNavigationBar;", "navigationBar", "Lv/VSwitchButton;", Constants.INAPP_DATA_TAG, BLiveStormDanmakuGiftResourceType.f44446s, "()Lv/VSwitchButton;", "cardSwitch", "e", BaseSei.f13930X, "profileSwitch", "Lv/VText;", "f", "u", "()Lv/VText;", "descText", "Lv/VDraweeView;", "g", ResourceDirection.f38808v, "()Lv/VDraweeView;", "imageDraweeView", "external_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class y1l implements s7m<b2l> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public View parentView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public b2l hideWealthIconFragPresenter;

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

    /* JADX INFO: renamed from: l.y1l$a */
    @Metadata(m87231d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J-\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m87232d2 = {"l/y1l$a", "Ll/ym2;", "", "id", "Ll/ngm;", "imageInfo", "Landroid/graphics/drawable/Animatable;", "animatable", "", "h", "(Ljava/lang/String;Ll/ngm;Landroid/graphics/drawable/Animatable;)V", "external_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C21279a extends ym2 {
        public C21279a() {
        }

        /* JADX INFO: renamed from: j */
        public static void m212238j(y1l y1lVar, int i, int i2) {
            int width = y1lVar.m212236v().getWidth();
            int i3 = (int) ((i / i2) * width);
            ViewGroup.LayoutParams layoutParams = y1lVar.m212236v().getLayoutParams();
            layoutParams.width = width;
            layoutParams.height = i3;
            y1lVar.m212236v().setLayoutParams(layoutParams);
        }

        @Override // p149l.ym2
        /* JADX INFO: renamed from: h */
        public void mo39108h(String id, ngm imageInfo, Animatable animatable) {
            super.mo39108h(id, imageInfo, animatable);
            if (imageInfo == null) {
                return;
            }
            final int height = imageInfo.getHeight();
            final int width = imageInfo.getWidth();
            VDraweeView vDraweeViewM212236v = y1l.this.m212236v();
            final y1l y1lVar = y1l.this;
            vDraweeViewM212236v.post(new Runnable() { // from class: l.x1l
                @Override // java.lang.Runnable
                public final void run() {
                    y1l.C21279a.m212238j(y1lVar, height, width);
                }
            });
        }
    }

    public y1l() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.navigationBar = LazyKt__LazyJVMKt.m87228a(lazyThreadSafetyMode, new Function0() { // from class: l.o1l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return y1l.m212219l(this.f141460a);
            }
        });
        this.cardSwitch = LazyKt__LazyJVMKt.m87228a(lazyThreadSafetyMode, new Function0() { // from class: l.p1l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return y1l.m212214e(this.f146710a);
            }
        });
        this.profileSwitch = LazyKt__LazyJVMKt.m87228a(lazyThreadSafetyMode, new Function0() { // from class: l.q1l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return y1l.m212211b(this.f152140a);
            }
        });
        this.descText = LazyKt__LazyJVMKt.m87228a(lazyThreadSafetyMode, new Function0() { // from class: l.r1l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return y1l.m212217j(this.f157285a);
            }
        });
        this.imageDraweeView = LazyKt__LazyJVMKt.m87228a(lazyThreadSafetyMode, new Function0() { // from class: l.s1l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return y1l.m212218k(this.f161905a);
            }
        });
    }

    /* JADX INFO: renamed from: F */
    public static final void m212206F(y1l y1lVar, BLiveEnvelope bLiveEnvelope) {
        if (bLiveEnvelope != null) {
            Meta meta = bLiveEnvelope.meta;
            int i = meta.code;
            if (i == 43302) {
                lsi0.m151595y(meta.message);
            } else if (i == 200) {
                lsi0.m151595y(y1lVar.m212234s().isChecked() ? w8u.m202217t(R$string.f44871I) : w8u.m202217t(R$string.f44869G));
                l9s.m149055R(l9s.m149093o0());
            }
        }
    }

    /* JADX INFO: renamed from: G */
    public static final void m212207G(y1l y1lVar, Throwable th) {
        if (th != null) {
            y1lVar.m212234s().setCheckedImmediately(!y1lVar.m212234s().isChecked());
            if (th instanceof TantanException.Client.CoreService) {
                TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
                if (coreService.code == 43302) {
                    lsi0.m151595y(coreService.metaMessage);
                    return;
                }
            }
            lsi0.m151566D(w8u.m202217t(R$string.f44889a));
        }
    }

    /* JADX INFO: renamed from: I */
    public static final void m212208I(y1l y1lVar, BLiveEnvelope bLiveEnvelope) {
        if (bLiveEnvelope != null) {
            Meta meta = bLiveEnvelope.meta;
            int i = meta.code;
            if (i == 43303) {
                lsi0.m151595y(meta.message);
            } else if (i == 200) {
                lsi0.m151595y(y1lVar.m212237x().isChecked() ? w8u.m202217t(R$string.f44871I) : w8u.m202217t(R$string.f44869G));
                l9s.m149055R(l9s.m149093o0());
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public static final void m212209J(y1l y1lVar, Throwable th) {
        if (th != null) {
            y1lVar.m212237x().setCheckedImmediately(!y1lVar.m212237x().isChecked());
            if (th instanceof TantanException.Client.CoreService) {
                TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
                if (coreService.code == 43303) {
                    lsi0.m151595y(coreService.metaMessage);
                    return;
                }
            }
            lsi0.m151566D(w8u.m202217t(R$string.f44889a));
        }
    }

    /* JADX INFO: renamed from: b */
    public static VSwitchButton m212211b(y1l y1lVar) {
        View view = y1lVar.parentView;
        if (view == null) {
            Intrinsics.m87502r("parentView");
            view = null;
        }
        return (VSwitchButton) view.findViewById(f5c0.f95137r0);
    }

    /* JADX INFO: renamed from: e */
    public static VSwitchButton m212214e(y1l y1lVar) {
        View view = y1lVar.parentView;
        if (view == null) {
            Intrinsics.m87502r("parentView");
            view = null;
        }
        return (VSwitchButton) view.findViewById(f5c0.f95133q0);
    }

    /* JADX INFO: renamed from: j */
    public static VText m212217j(y1l y1lVar) {
        View view = y1lVar.parentView;
        if (view == null) {
            Intrinsics.m87502r("parentView");
            view = null;
        }
        View viewFindViewById = view.findViewById(f5c0.f95141s0);
        viewFindViewById.getClass();
        return (VText) viewFindViewById;
    }

    /* JADX INFO: renamed from: k */
    public static VDraweeView m212218k(y1l y1lVar) {
        View view = y1lVar.parentView;
        if (view == null) {
            Intrinsics.m87502r("parentView");
            view = null;
        }
        View viewFindViewById = view.findViewById(f5c0.f95056W);
        viewFindViewById.getClass();
        return (VDraweeView) viewFindViewById;
    }

    /* JADX INFO: renamed from: l */
    public static VNavigationBar m212219l(y1l y1lVar) {
        View view = y1lVar.parentView;
        if (view == null) {
            Intrinsics.m87502r("parentView");
            view = null;
        }
        return (VNavigationBar) view.findViewById(f5c0.f95078c1);
    }

    /* JADX INFO: renamed from: m */
    public static void m212220m(final y1l y1lVar, View view) {
        b2l b2lVar = y1lVar.hideWealthIconFragPresenter;
        if (b2lVar == null) {
            Intrinsics.m87502r("hideWealthIconFragPresenter");
            b2lVar = null;
        }
        b2lVar.m99971s2("hideProfile", y1lVar.m212237x().isChecked(), new Action1() { // from class: l.v1l
            @Override // com.tantanapp.media.ttmediautils.download.Action1
            public final void call(Object obj) {
                y1l.m212208I(this.f179263a, (BLiveEnvelope) obj);
            }
        }, new Action1() { // from class: l.w1l
            @Override // com.tantanapp.media.ttmediautils.download.Action1
            public final void call(Object obj) {
                y1l.m212209J(this.f184021a, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public static void m212221n(final y1l y1lVar, View view) {
        b2l b2lVar = y1lVar.hideWealthIconFragPresenter;
        if (b2lVar == null) {
            Intrinsics.m87502r("hideWealthIconFragPresenter");
            b2lVar = null;
        }
        b2lVar.m99971s2("hideCard", y1lVar.m212234s().isChecked(), new Action1() { // from class: l.m1l
            @Override // com.tantanapp.media.ttmediautils.download.Action1
            public final void call(Object obj) {
                y1l.m212206F(this.f130837a, (BLiveEnvelope) obj);
            }
        }, new Action1() { // from class: l.n1l
            @Override // com.tantanapp.media.ttmediautils.download.Action1
            public final void call(Object obj) {
                y1l.m212207G(this.f136661a, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    private final VNavigationBar m212223w() {
        Object value = this.navigationBar.getValue();
        value.getClass();
        return (VNavigationBar) value;
    }

    /* JADX INFO: renamed from: y */
    private final void m212224y() {
        VNavigationBar vNavigationBarM212223w = m212223w();
        vNavigationBarM212223w.setTitle(w8u.m202217t(R$string.f44870H));
        vNavigationBarM212223w.setLeftIconOnClick(new View.OnClickListener() { // from class: l.t1l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y1l.m212225z(this.f167356a, view);
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public static final void m212225z(y1l y1lVar, View view) {
        Act act = y1lVar.getAct();
        if (act != null) {
            act.onBackPressed();
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m212226A() {
        m212235u().setText(s9s.f163228b.m195938s4());
    }

    /* JADX INFO: renamed from: B */
    public final void m212227B() {
        hxs.m133410w("context_livingAct", m212236v(), s9s.f163228b.m195929r4(), new C21279a());
    }

    /* JADX INFO: renamed from: C */
    public final void m212228C() {
        Settings settings;
        List<SettingGroups> list;
        SettingGroups settingGroups;
        UserLiveSettings userLiveSettings;
        User userM149047J = l9s.m149047J();
        if (userM149047J == null || (settings = userM149047J.settings) == null || (list = settings.settingGroups) == null || (settingGroups = list.get(0)) == null || (userLiveSettings = settingGroups.live) == null) {
            return;
        }
        VSwitchButton vSwitchButtonM212234s = m212234s();
        Boolean bool = userLiveSettings.hideSwipeWealthTag;
        bool.getClass();
        vSwitchButtonM212234s.setCheckedImmediately(bool.booleanValue());
        VSwitchButton vSwitchButtonM212237x = m212237x();
        Boolean bool2 = userLiveSettings.hideProfileWealthTag;
        bool2.getClass();
        vSwitchButtonM212237x.setCheckedImmediately(bool2.booleanValue());
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        View view = this.parentView;
        if (view == null) {
            Intrinsics.m87502r("parentView");
            view = null;
        }
        return view.getContext();
    }

    /* JADX INFO: renamed from: E */
    public final void m212229E() {
        m212234s().setOnClickListener(new View.OnClickListener() { // from class: l.l1l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y1l.m212221n(this.f125663a, view);
            }
        });
    }

    /* JADX INFO: renamed from: H */
    public final void m212230H() {
        m212237x().setOnClickListener(new View.OnClickListener() { // from class: l.u1l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y1l.m212220m(this.f173032a, view);
            }
        });
    }

    /* JADX INFO: renamed from: K */
    public final void m212231K() {
        m212229E();
        m212230H();
    }

    @Override // p149l.s7m
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewInflate = inflater.inflate(s6c0.f162789r, parent, false);
        viewInflate.getClass();
        this.parentView = viewInflate;
        if (viewInflate != null) {
            return viewInflate;
        }
        Intrinsics.m87502r("parentView");
        return null;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(@NotNull b2l fragPresenter) {
        fragPresenter.getClass();
        this.hideWealthIconFragPresenter = fragPresenter;
    }

    /* JADX INFO: renamed from: r */
    public final void m212233r() {
        m212224y();
        m212226A();
        m212228C();
        m212231K();
        m212227B();
    }

    /* JADX INFO: renamed from: s */
    public final VSwitchButton m212234s() {
        Object value = this.cardSwitch.getValue();
        value.getClass();
        return (VSwitchButton) value;
    }

    /* JADX INFO: renamed from: u */
    public final VText m212235u() {
        return (VText) this.descText.getValue();
    }

    /* JADX INFO: renamed from: v */
    public final VDraweeView m212236v() {
        return (VDraweeView) this.imageDraweeView.getValue();
    }

    /* JADX INFO: renamed from: x */
    public final VSwitchButton m212237x() {
        Object value = this.profileSwitch.getValue();
        value.getClass();
        return (VSwitchButton) value;
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
