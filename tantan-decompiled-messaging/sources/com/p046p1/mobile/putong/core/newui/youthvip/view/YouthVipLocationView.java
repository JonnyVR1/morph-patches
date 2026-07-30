package com.p046p1.mobile.putong.core.newui.youthvip.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.RankLevel;
import com.p046p1.mobile.putong.core.member.R$string;
import com.p046p1.mobile.putong.core.newui.youthvip.view.YouthVipLocationView;
import com.p046p1.mobile.putong.data.DoublePair;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.location.Location;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;
import p147v.VDraweeView;
import p149l.b3c0;
import p149l.d90;
import p149l.e30;
import p149l.ifq0;
import p149l.mjj;
import p149l.mkd0;
import p149l.osi0;
import p149l.qib0;
import p149l.w9j;
import p149l.xdl0;
import p149l.xma;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0019\u0010\u0012R\"\u0010 \u001a\u00020\u00008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u00100\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00104\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u0010+\u001a\u0004\b2\u0010-\"\u0004\b3\u0010/R\"\u0010<\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010@\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b=\u00107\u001a\u0004\b>\u00109\"\u0004\b?\u0010;R\"\u0010D\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bA\u00107\u001a\u0004\bB\u00109\"\u0004\bC\u0010;R\u0016\u0010H\u001a\u00020E8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bF\u0010G¨\u0006I"}, m87232d2 = {"Lcom/p1/mobile/putong/core/newui/youthvip/view/YouthVipLocationView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "w0", "(Landroid/view/View;)V", "Lcom/p1/mobile/android/app/Frag;", "frag", "B0", "(Lcom/p1/mobile/android/app/Frag;)V", "", RankLevel.city, "z0", "(Ljava/lang/String;)V", "onFinishInflate", "()V", "y0", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/core/newui/youthvip/view/YouthVipLocationView;", "get_root_view", "()Lcom/p1/mobile/putong/core/newui/youthvip/view/YouthVipLocationView;", "set_root_view", "(Lcom/p1/mobile/putong/core/newui/youthvip/view/YouthVipLocationView;)V", "_root_view", "Lv/VDraweeView;", "e", "Lv/VDraweeView;", "get_texture", "()Lv/VDraweeView;", "set_texture", "(Lv/VDraweeView;)V", "_texture", "Landroid/widget/ImageView;", "f", "Landroid/widget/ImageView;", "get_location_ic", "()Landroid/widget/ImageView;", "set_location_ic", "(Landroid/widget/ImageView;)V", "_location_ic", "g", "get_right_arrow_ic", "set_right_arrow_ic", "_right_arrow_ic", "Landroid/widget/TextView;", "h", "Landroid/widget/TextView;", "get_location_value", "()Landroid/widget/TextView;", "set_location_value", "(Landroid/widget/TextView;)V", "_location_value", RXScreenCaptureService.KEY_INDEX, "get_title", "set_title", "_title", "j", "get_subtitle", "set_subtitle", "_subtitle", "Ll/mjj;", "k", "Ll/mjj;", "geocoder", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class YouthVipLocationView extends ConstraintLayout {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public YouthVipLocationView _root_view;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VDraweeView _texture;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public ImageView _location_ic;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public ImageView _right_arrow_ic;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public TextView _location_value;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public TextView _title;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public TextView _subtitle;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public mjj geocoder;

    public /* synthetic */ YouthVipLocationView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: D0 */
    public static final void m43851D0(Frag frag, YouthVipLocationView youthVipLocationView, d90 d90Var) {
        d90Var.getClass();
        if (frag.act() == null) {
            return;
        }
        CoreModule.f17554l.m94657h().mo43885nc(d90Var.mo110405b());
        youthVipLocationView.m43875z0(TextUtils.isEmpty(d90Var.mo110405b()) ? frag.act().string(R$string.f20650h1) : d90Var.mo110405b());
    }

    /* JADX INFO: renamed from: E0 */
    public static final void m43852E0(Throwable th) {
        App.f15368d.m20433k(th);
    }

    /* JADX INFO: renamed from: G0 */
    public static final Boolean m43853G0(Location location) {
        return Boolean.valueOf(CoreModule.m29931H().signedIn_());
    }

    /* JADX INFO: renamed from: H0 */
    public static final Boolean m43854H0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: I0 */
    public static final void m43855I0(Frag frag, YouthVipLocationView youthVipLocationView, d90 d90Var) {
        d90Var.getClass();
        if (frag.act() == null) {
            return;
        }
        CoreModule.f17554l.m94657h().mo43885nc(d90Var.mo110405b());
        youthVipLocationView.m43875z0(TextUtils.isEmpty(d90Var.mo110405b()) ? frag.act().string(R$string.f20650h1) : d90Var.mo110405b());
    }

    /* JADX INFO: renamed from: J0 */
    public static final void m43856J0(Throwable th) {
        App.f15368d.m20433k(th);
    }

    /* JADX INFO: renamed from: i0 */
    public static void m43858i0(Frag frag, YouthVipLocationView youthVipLocationView, View view) {
        zvf0.m220396r("e_youthvip_manyou", "p_youthvip_page");
        if (!CoreModule.f17554l.m94656g().mo35035Wa()) {
            osi0.m165783g("你已从青春专区毕业，去其他页面转转吧~");
        } else if (xma.m210050O3()) {
            frag.act().startActivity(CoreModule.m29935P().m94651a().mo33464aj(youthVipLocationView.getContext(), "p_youthvip_page"));
        } else {
            CoreModule.m29935P().m94656g().mo35027Qs(frag.act(), "p_home_youthvip,manyou", Privilege.youth_roaming, null, null, null, null);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public static Boolean m43859j0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: k0 */
    public static DoublePair m43860k0(Function1 function1, Object obj) {
        return (DoublePair) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: l0 */
    public static DoublePair m43861l0(User user) {
        user.getClass();
        return user.getLatitudeAndLongitude();
    }

    /* JADX INFO: renamed from: m0 */
    public static C22306c m43862m0(User user) {
        C22306c<Location> c22306cM78864p = qib0.f154687E.m78864p();
        final Function1 function1 = new Function1() { // from class: l.xeq0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return YouthVipLocationView.m43853G0((Location) obj);
            }
        };
        return c22306cM78864p.filter(new w9j() { // from class: l.yeq0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return YouthVipLocationView.m43854H0(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: o0 */
    public static void m43864o0(final Frag frag, final YouthVipLocationView youthVipLocationView, DoublePair doublePair) {
        doublePair.getClass();
        if (frag.act() == null) {
            return;
        }
        String strMo43886pt = CoreModule.f17554l.m94657h().mo43886pt();
        if (TextUtils.isEmpty(strMo43886pt)) {
            strMo43886pt = frag.act().string(R$string.f20650h1);
        }
        youthVipLocationView.m43875z0(strMo43886pt);
        if (Intrinsics.m87488d(DoublePair.new_(), doublePair)) {
            return;
        }
        mjj mjjVar = youthVipLocationView.geocoder;
        if (mjjVar == null) {
            Intrinsics.m87502r("geocoder");
            mjjVar = null;
        }
        mjjVar.m154844e(frag.act(), doublePair.first, doublePair.second, new e30() { // from class: l.veq0
            @Override // p149l.e30
            public final void call(Object obj) {
                YouthVipLocationView.m43851D0(frag, youthVipLocationView, (d90) obj);
            }
        }, new e30() { // from class: l.weq0
            @Override // p149l.e30
            public final void call(Object obj) {
                YouthVipLocationView.m43852E0((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: q0 */
    public static void m43866q0(final Frag frag, final YouthVipLocationView youthVipLocationView, Location location) {
        location.getClass();
        if (frag.act() == null) {
            return;
        }
        DoublePair doublePairNew_ = DoublePair.new_();
        doublePairNew_.first = location.m78831u();
        doublePairNew_.second = location.m78833x();
        if (Intrinsics.m87488d(DoublePair.new_(), CoreModule.f17545c.f19639e0.m169527p9().getLatitudeAndLongitude())) {
            mjj mjjVar = youthVipLocationView.geocoder;
            if (mjjVar == null) {
                Intrinsics.m87502r("geocoder");
                mjjVar = null;
            }
            mjjVar.m154844e(frag.act(), doublePairNew_.first, doublePairNew_.second, new e30() { // from class: l.hfq0
                @Override // p149l.e30
                public final void call(Object obj) {
                    YouthVipLocationView.m43855I0(frag, youthVipLocationView, (d90) obj);
                }
            }, new e30() { // from class: l.ueq0
                @Override // p149l.e30
                public final void call(Object obj) {
                    YouthVipLocationView.m43856J0((Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: r0 */
    public static C22306c m43867r0(Function1 function1, Object obj) {
        return (C22306c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: v0 */
    public static Boolean m43871v0(User user) {
        user.getClass();
        return Boolean.valueOf(Intrinsics.m87488d(DoublePair.new_(), user.getLatitudeAndLongitude()));
    }

    /* JADX INFO: renamed from: B0 */
    public final void m43872B0(final Frag frag) {
        C22306c c22306cDuringCreated = frag.duringCreated(CoreModule.f17545c.f19639e0.m169523o9());
        final Function1 function1 = new Function1() { // from class: l.zeq0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return YouthVipLocationView.m43861l0((User) obj);
            }
        };
        c22306cDuringCreated.map(new w9j() { // from class: l.afq0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return YouthVipLocationView.m43860k0(function1, obj);
            }
        }).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.bfq0
            @Override // p149l.e30
            public final void call(Object obj) {
                YouthVipLocationView.m43864o0(frag, this, (DoublePair) obj);
            }
        }));
        C22306c c22306cDuringCreated2 = frag.duringCreated(CoreModule.f17545c.f19639e0.m169523o9());
        final Function1 function2 = new Function1() { // from class: l.cfq0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return YouthVipLocationView.m43871v0((User) obj);
            }
        };
        C22306c c22306cFilter = c22306cDuringCreated2.filter(new w9j() { // from class: l.dfq0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return YouthVipLocationView.m43859j0(function2, obj);
            }
        });
        final Function1 function3 = new Function1() { // from class: l.efq0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return YouthVipLocationView.m43862m0((User) obj);
            }
        };
        c22306cFilter.switchMap(new w9j() { // from class: l.ffq0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return YouthVipLocationView.m43867r0(function3, obj);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.gfq0
            @Override // p149l.e30
            public final void call(Object obj) {
                YouthVipLocationView.m43866q0(frag, this, (Location) obj);
            }
        }));
    }

    @NotNull
    public final ImageView get_location_ic() {
        ImageView imageView = this._location_ic;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.m87502r("_location_ic");
        return null;
    }

    @NotNull
    public final TextView get_location_value() {
        TextView textView = this._location_value;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_location_value");
        return null;
    }

    @NotNull
    public final ImageView get_right_arrow_ic() {
        ImageView imageView = this._right_arrow_ic;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.m87502r("_right_arrow_ic");
        return null;
    }

    @NotNull
    public final YouthVipLocationView get_root_view() {
        YouthVipLocationView youthVipLocationView = this._root_view;
        if (youthVipLocationView != null) {
            return youthVipLocationView;
        }
        Intrinsics.m87502r("_root_view");
        return null;
    }

    @NotNull
    public final TextView get_subtitle() {
        TextView textView = this._subtitle;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_subtitle");
        return null;
    }

    @NotNull
    public final VDraweeView get_texture() {
        VDraweeView vDraweeView = this._texture;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_texture");
        return null;
    }

    @NotNull
    public final TextView get_title() {
        TextView textView = this._title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_title");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m43873w0(this);
        qib0.f154691G.m102354Y0(get_texture(), b3c0.f73025c6);
        xdl0.m208344M(get_location_value(), false);
    }

    public final void set_location_ic(@NotNull ImageView imageView) {
        imageView.getClass();
        this._location_ic = imageView;
    }

    public final void set_location_value(@NotNull TextView textView) {
        textView.getClass();
        this._location_value = textView;
    }

    public final void set_right_arrow_ic(@NotNull ImageView imageView) {
        imageView.getClass();
        this._right_arrow_ic = imageView;
    }

    public final void set_root_view(@NotNull YouthVipLocationView youthVipLocationView) {
        youthVipLocationView.getClass();
        this._root_view = youthVipLocationView;
    }

    public final void set_subtitle(@NotNull TextView textView) {
        textView.getClass();
        this._subtitle = textView;
    }

    public final void set_texture(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._texture = vDraweeView;
    }

    public final void set_title(@NotNull TextView textView) {
        textView.getClass();
        this._title = textView;
    }

    /* JADX INFO: renamed from: w0 */
    public final void m43873w0(View view) {
        ifq0.m135951a(this, view);
    }

    /* JADX INFO: renamed from: y0 */
    public final void m43874y0(@NotNull final Frag frag) {
        frag.getClass();
        mjj mjjVarM154842c = mjj.m154842c(frag.act(), false);
        mjjVarM154842c.getClass();
        this.geocoder = mjjVarM154842c;
        m43872B0(frag);
        xdl0.m208329E0(get_root_view(), new View.OnClickListener() { // from class: l.teq0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                YouthVipLocationView.m43858i0(frag, this, view);
            }
        });
    }

    /* JADX INFO: renamed from: z0 */
    public final void m43875z0(String city) {
        if (TextUtils.isEmpty(city)) {
            xdl0.m208344M(get_location_value(), false);
            return;
        }
        xdl0.m208344M(get_location_value(), true);
        city.getClass();
        if (city.length() > 5) {
            get_location_value().setText(city.substring(0, 4).concat("..."));
        } else {
            get_location_value().setText(city);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public YouthVipLocationView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public YouthVipLocationView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public YouthVipLocationView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
