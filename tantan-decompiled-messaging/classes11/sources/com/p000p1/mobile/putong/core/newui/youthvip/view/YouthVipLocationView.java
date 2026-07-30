package com.p000p1.mobile.putong.core.newui.youthvip.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.core.newui.youthvip.view.YouthVipLocationView;
import com.p000p1.mobile.putong.location.Location;
import com.p1.mobile.android.app.App;
import com.p1.mobile.android.app.Frag;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.member.R;
import com.p1.mobile.putong.data.DoublePair;
import com.p1.mobile.putong.data.User;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l.b3c0;
import l.d30;
import l.e30;
import l.ifq0;
import l.mkd0;
import l.osi0;
import l.qib0;
import l.w9j;
import l.xdl0;
import l.xma;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p009l.d90;
import p009l.mjj;
import rx.c;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0019\u0010\u0012R\"\u0010 \u001a\u00020\u00008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u00100\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00104\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u0010+\u001a\u0004\b2\u0010-\"\u0004\b3\u0010/R\"\u0010<\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010@\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b=\u00107\u001a\u0004\b>\u00109\"\u0004\b?\u0010;R\"\u0010D\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bA\u00107\u001a\u0004\bB\u00109\"\u0004\bC\u0010;R\u0016\u0010H\u001a\u00020E8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bF\u0010G¨\u0006I"}, d2 = {"Lcom/p1/mobile/putong/core/newui/youthvip/view/YouthVipLocationView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View;", "view", "", "w0", "(Landroid/view/View;)V", "Lcom/p1/mobile/android/app/Frag;", "frag", "B0", "(Lcom/p1/mobile/android/app/Frag;)V", "", "city", "z0", "(Ljava/lang/String;)V", "onFinishInflate", "()V", "y0", "d", "Lcom/p1/mobile/putong/core/newui/youthvip/view/YouthVipLocationView;", "get_root_view", "()Lcom/p1/mobile/putong/core/newui/youthvip/view/YouthVipLocationView;", "set_root_view", "(Lcom/p1/mobile/putong/core/newui/youthvip/view/YouthVipLocationView;)V", "_root_view", "Lv/VDraweeView;", "e", "Lv/VDraweeView;", "get_texture", "()Lv/VDraweeView;", "set_texture", "(Lv/VDraweeView;)V", "_texture", "Landroid/widget/ImageView;", "f", "Landroid/widget/ImageView;", "get_location_ic", "()Landroid/widget/ImageView;", "set_location_ic", "(Landroid/widget/ImageView;)V", "_location_ic", "g", "get_right_arrow_ic", "set_right_arrow_ic", "_right_arrow_ic", "Landroid/widget/TextView;", "h", "Landroid/widget/TextView;", "get_location_value", "()Landroid/widget/TextView;", "set_location_value", "(Landroid/widget/TextView;)V", "_location_value", "i", "get_title", "set_title", "_title", "j", "get_subtitle", "set_subtitle", "_subtitle", "Ll/mjj;", "k", "Ll/mjj;", "geocoder", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
    public static final void m8120D0(Frag frag, YouthVipLocationView youthVipLocationView, d90 d90Var) {
        d90Var.getClass();
        if (frag.act() == null) {
            return;
        }
        CoreModule.l.h().mo8261nc(d90Var.mo13016b());
        youthVipLocationView.m8144z0(TextUtils.isEmpty(d90Var.mo13016b()) ? frag.act().string(R.string.h1) : d90Var.mo13016b());
    }

    /* JADX INFO: renamed from: E0 */
    public static final void m8121E0(Throwable th) {
        App.d.k(th);
    }

    /* JADX INFO: renamed from: G0 */
    public static final Boolean m8122G0(Location location) {
        return Boolean.valueOf(CoreModule.H().signedIn_());
    }

    /* JADX INFO: renamed from: H0 */
    public static final Boolean m8123H0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: I0 */
    public static final void m8124I0(Frag frag, YouthVipLocationView youthVipLocationView, d90 d90Var) {
        d90Var.getClass();
        if (frag.act() == null) {
            return;
        }
        CoreModule.l.h().mo8261nc(d90Var.mo13016b());
        youthVipLocationView.m8144z0(TextUtils.isEmpty(d90Var.mo13016b()) ? frag.act().string(R.string.h1) : d90Var.mo13016b());
    }

    /* JADX INFO: renamed from: J0 */
    public static final void m8125J0(Throwable th) {
        App.d.k(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i0 */
    public static void m8127i0(Frag frag, YouthVipLocationView youthVipLocationView, View view) {
        zvf0.r("e_youthvip_manyou", "p_youthvip_page");
        if (!CoreModule.l.g().Wa()) {
            osi0.g("你已从青春专区毕业，去其他页面转转吧~");
        } else if (xma.O3()) {
            frag.act().startActivity(CoreModule.P().a().aj(youthVipLocationView.getContext(), "p_youthvip_page"));
        } else {
            CoreModule.P().g().Qs(frag.act(), "p_home_youthvip,manyou", Privilege.youth_roaming, (e30) null, (d30) null, (d30) null, (d30) null);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public static Boolean m8128j0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: k0 */
    public static DoublePair m8129k0(Function1 function1, Object obj) {
        return (DoublePair) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: l0 */
    public static DoublePair m8130l0(User user) {
        user.getClass();
        return user.getLatitudeAndLongitude();
    }

    /* JADX INFO: renamed from: m0 */
    public static c m8131m0(User user) {
        c<Location> cVarM9159p = qib0.E.m9159p();
        final Function1 function1 = new Function1() { // from class: l.xeq0
            public final Object invoke(Object obj) {
                return YouthVipLocationView.m8122G0((Location) obj);
            }
        };
        return cVarM9159p.filter(new w9j() { // from class: l.yeq0
            public final Object call(Object obj) {
                return YouthVipLocationView.m8123H0(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: o0 */
    public static void m8133o0(final Frag frag, final YouthVipLocationView youthVipLocationView, DoublePair doublePair) {
        doublePair.getClass();
        if (frag.act() == null) {
            return;
        }
        String strMo8262pt = CoreModule.l.h().mo8262pt();
        if (TextUtils.isEmpty(strMo8262pt)) {
            strMo8262pt = frag.act().string(R.string.h1);
        }
        youthVipLocationView.m8144z0(strMo8262pt);
        if (Intrinsics.d(DoublePair.new_(), doublePair)) {
            return;
        }
        mjj mjjVar = youthVipLocationView.geocoder;
        if (mjjVar == null) {
            Intrinsics.r("geocoder");
            mjjVar = null;
        }
        mjjVar.m18517e(frag.act(), doublePair.first, doublePair.second, new e30() { // from class: l.veq0
            public final void call(Object obj) {
                YouthVipLocationView.m8120D0(frag, youthVipLocationView, (d90) obj);
            }
        }, new e30() { // from class: l.weq0
            public final void call(Object obj) {
                YouthVipLocationView.m8121E0((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: q0 */
    public static void m8135q0(final Frag frag, final YouthVipLocationView youthVipLocationView, Location location) {
        location.getClass();
        if (frag.act() == null) {
            return;
        }
        DoublePair doublePairNew_ = DoublePair.new_();
        doublePairNew_.first = location.m9126u();
        doublePairNew_.second = location.m9128x();
        if (Intrinsics.d(DoublePair.new_(), CoreModule.c.e0.p9().getLatitudeAndLongitude())) {
            mjj mjjVar = youthVipLocationView.geocoder;
            if (mjjVar == null) {
                Intrinsics.r("geocoder");
                mjjVar = null;
            }
            mjjVar.m18517e(frag.act(), doublePairNew_.first, doublePairNew_.second, new e30() { // from class: l.hfq0
                public final void call(Object obj) {
                    YouthVipLocationView.m8124I0(frag, youthVipLocationView, (d90) obj);
                }
            }, new e30() { // from class: l.ueq0
                public final void call(Object obj) {
                    YouthVipLocationView.m8125J0((Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: r0 */
    public static c m8136r0(Function1 function1, Object obj) {
        return (c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: v0 */
    public static Boolean m8140v0(User user) {
        user.getClass();
        return Boolean.valueOf(Intrinsics.d(DoublePair.new_(), user.getLatitudeAndLongitude()));
    }

    /* JADX INFO: renamed from: B0 */
    public final void m8141B0(final Frag frag) {
        c cVarDuringCreated = frag.duringCreated(CoreModule.c.e0.o9());
        final Function1 function1 = new Function1() { // from class: l.zeq0
            public final Object invoke(Object obj) {
                return YouthVipLocationView.m8130l0((User) obj);
            }
        };
        cVarDuringCreated.map(new w9j() { // from class: l.afq0
            public final Object call(Object obj) {
                return YouthVipLocationView.m8129k0(function1, obj);
            }
        }).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.bfq0
            public final void call(Object obj) {
                YouthVipLocationView.m8133o0(frag, this, (DoublePair) obj);
            }
        }));
        c cVarDuringCreated2 = frag.duringCreated(CoreModule.c.e0.o9());
        final Function1 function2 = new Function1() { // from class: l.cfq0
            public final Object invoke(Object obj) {
                return YouthVipLocationView.m8140v0((User) obj);
            }
        };
        c cVarFilter = cVarDuringCreated2.filter(new w9j() { // from class: l.dfq0
            public final Object call(Object obj) {
                return YouthVipLocationView.m8128j0(function2, obj);
            }
        });
        final Function1 function3 = new Function1() { // from class: l.efq0
            public final Object invoke(Object obj) {
                return YouthVipLocationView.m8131m0((User) obj);
            }
        };
        cVarFilter.switchMap(new w9j() { // from class: l.ffq0
            public final Object call(Object obj) {
                return YouthVipLocationView.m8136r0(function3, obj);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.gfq0
            public final void call(Object obj) {
                YouthVipLocationView.m8135q0(frag, this, (Location) obj);
            }
        }));
    }

    @NotNull
    public final ImageView get_location_ic() {
        ImageView imageView = this._location_ic;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.r("_location_ic");
        return null;
    }

    @NotNull
    public final TextView get_location_value() {
        TextView textView = this._location_value;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_location_value");
        return null;
    }

    @NotNull
    public final ImageView get_right_arrow_ic() {
        ImageView imageView = this._right_arrow_ic;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.r("_right_arrow_ic");
        return null;
    }

    @NotNull
    public final YouthVipLocationView get_root_view() {
        YouthVipLocationView youthVipLocationView = this._root_view;
        if (youthVipLocationView != null) {
            return youthVipLocationView;
        }
        Intrinsics.r("_root_view");
        return null;
    }

    @NotNull
    public final TextView get_subtitle() {
        TextView textView = this._subtitle;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_subtitle");
        return null;
    }

    @NotNull
    public final VDraweeView get_texture() {
        VDraweeView vDraweeView = this._texture;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_texture");
        return null;
    }

    @NotNull
    public final TextView get_title() {
        TextView textView = this._title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_title");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8142w0(this);
        qib0.G.Y0(get_texture(), b3c0.c6);
        xdl0.M(get_location_value(), false);
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
    public final void m8142w0(View view) {
        ifq0.a(this, view);
    }

    /* JADX INFO: renamed from: y0 */
    public final void m8143y0(@NotNull final Frag frag) {
        frag.getClass();
        mjj mjjVarM18515c = mjj.m18515c(frag.act(), false);
        mjjVarM18515c.getClass();
        this.geocoder = mjjVarM18515c;
        m8141B0(frag);
        xdl0.E0(get_root_view(), new View.OnClickListener() { // from class: l.teq0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                YouthVipLocationView.m8127i0(frag, this, view);
            }
        });
    }

    /* JADX INFO: renamed from: z0 */
    public final void m8144z0(String city) {
        if (TextUtils.isEmpty(city)) {
            xdl0.M(get_location_value(), false);
            return;
        }
        xdl0.M(get_location_value(), true);
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
