package com.p051p1.mobile.putong.core.newui.youthvip.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.RankLevel;
import com.p051p1.mobile.putong.core.member.R$string;
import com.p051p1.mobile.putong.core.newui.youthvip.view.YouthVipLocationView;
import com.p051p1.mobile.putong.data.DoublePair;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.location.Location;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.fmj;
import p153l.gbc0;
import p153l.i4g0;
import p153l.joa;
import p153l.noq0;
import p153l.psd0;
import p153l.qcj;
import p153l.r1j0;
import p153l.uqb0;
import p153l.y20;
import p153l.z80;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0019\u0010\u0012R\"\u0010 \u001a\u00020\u00008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u00100\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00104\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u0010+\u001a\u0004\b2\u0010-\"\u0004\b3\u0010/R\"\u0010<\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010@\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b=\u00107\u001a\u0004\b>\u00109\"\u0004\b?\u0010;R\"\u0010D\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bA\u00107\u001a\u0004\bB\u00109\"\u0004\bC\u0010;R\u0016\u0010H\u001a\u00020E8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bF\u0010G¨\u0006I"}, m88121d2 = {"Lcom/p1/mobile/putong/core/newui/youthvip/view/YouthVipLocationView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "w0", "(Landroid/view/View;)V", "Lcom/p1/mobile/android/app/Frag;", "frag", "B0", "(Lcom/p1/mobile/android/app/Frag;)V", "", RankLevel.city, "z0", "(Ljava/lang/String;)V", "onFinishInflate", "()V", "y0", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/core/newui/youthvip/view/YouthVipLocationView;", "get_root_view", "()Lcom/p1/mobile/putong/core/newui/youthvip/view/YouthVipLocationView;", "set_root_view", "(Lcom/p1/mobile/putong/core/newui/youthvip/view/YouthVipLocationView;)V", "_root_view", "Lv/VDraweeView;", "e", "Lv/VDraweeView;", "get_texture", "()Lv/VDraweeView;", "set_texture", "(Lv/VDraweeView;)V", "_texture", "Landroid/widget/ImageView;", "f", "Landroid/widget/ImageView;", "get_location_ic", "()Landroid/widget/ImageView;", "set_location_ic", "(Landroid/widget/ImageView;)V", "_location_ic", "g", "get_right_arrow_ic", "set_right_arrow_ic", "_right_arrow_ic", "Landroid/widget/TextView;", "h", "Landroid/widget/TextView;", "get_location_value", "()Landroid/widget/TextView;", "set_location_value", "(Landroid/widget/TextView;)V", "_location_value", RXScreenCaptureService.KEY_INDEX, "get_title", "set_title", "_title", "j", "get_subtitle", "set_subtitle", "_subtitle", "Ll/fmj;", "k", "Ll/fmj;", "geocoder", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
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
    public fmj geocoder;

    public /* synthetic */ YouthVipLocationView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: D0 */
    public static final void m45037D0(Frag frag, YouthVipLocationView youthVipLocationView, z80 z80Var) {
        z80Var.getClass();
        if (frag.act() == null) {
            return;
        }
        CoreModule.f18273l.m143411h().mo45071nc(z80Var.mo143670b());
        youthVipLocationView.m45061z0(TextUtils.isEmpty(z80Var.mo143670b()) ? frag.act().string(R$string.f21392h1) : z80Var.mo143670b());
    }

    /* JADX INFO: renamed from: E0 */
    public static final void m45038E0(Throwable th) {
        App.f16087d.m21432k(th);
    }

    /* JADX INFO: renamed from: G0 */
    public static final Boolean m45039G0(Location location) {
        return Boolean.valueOf(CoreModule.m30929H().signedIn_());
    }

    /* JADX INFO: renamed from: H0 */
    public static final Boolean m45040H0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: I0 */
    public static final void m45041I0(Frag frag, YouthVipLocationView youthVipLocationView, z80 z80Var) {
        z80Var.getClass();
        if (frag.act() == null) {
            return;
        }
        CoreModule.f18273l.m143411h().mo45071nc(z80Var.mo143670b());
        youthVipLocationView.m45061z0(TextUtils.isEmpty(z80Var.mo143670b()) ? frag.act().string(R$string.f21392h1) : z80Var.mo143670b());
    }

    /* JADX INFO: renamed from: J0 */
    public static final void m45042J0(Throwable th) {
        App.f16087d.m21432k(th);
    }

    /* JADX INFO: renamed from: i0 */
    public static void m45044i0(Frag frag, YouthVipLocationView youthVipLocationView, View view) {
        i4g0.m138520r("e_youthvip_manyou", "p_youthvip_page");
        if (!CoreModule.f18273l.m143410g().mo36038Wa()) {
            r1j0.m179420g("你已从青春专区毕业，去其他页面转转吧~");
        } else if (joa.m146364P3()) {
            frag.act().startActivity(CoreModule.m30933P().m143405a().mo34467aj(youthVipLocationView.getContext(), "p_youthvip_page"));
        } else {
            CoreModule.m30933P().m143410g().mo36030Qs(frag.act(), "p_home_youthvip,manyou", Privilege.youth_roaming, null, null, null, null);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public static Boolean m45045j0(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: k0 */
    public static DoublePair m45046k0(Function1 function1, Object obj) {
        return (DoublePair) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: l0 */
    public static DoublePair m45047l0(User user) {
        user.getClass();
        return user.getLatitudeAndLongitude();
    }

    /* JADX INFO: renamed from: m0 */
    public static C22421c m45048m0(User user) {
        C22421c<Location> c22421cM80047p = uqb0.f180370E.m80047p();
        final Function1 function1 = new Function1() { // from class: l.coq0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return YouthVipLocationView.m45039G0((Location) obj);
            }
        };
        return c22421cM80047p.filter(new qcj() { // from class: l.doq0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return YouthVipLocationView.m45040H0(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: o0 */
    public static void m45050o0(final Frag frag, final YouthVipLocationView youthVipLocationView, DoublePair doublePair) {
        doublePair.getClass();
        if (frag.act() == null) {
            return;
        }
        String strMo45072pt = CoreModule.f18273l.m143411h().mo45072pt();
        if (TextUtils.isEmpty(strMo45072pt)) {
            strMo45072pt = frag.act().string(R$string.f21392h1);
        }
        youthVipLocationView.m45061z0(strMo45072pt);
        if (Intrinsics.m88377d(DoublePair.new_(), doublePair)) {
            return;
        }
        fmj fmjVar = youthVipLocationView.geocoder;
        if (fmjVar == null) {
            Intrinsics.m88391r("geocoder");
            fmjVar = null;
        }
        fmjVar.m126239e(frag.act(), doublePair.first, doublePair.second, new y20() { // from class: l.aoq0
            @Override // p153l.y20
            public final void call(Object obj) {
                YouthVipLocationView.m45037D0(frag, youthVipLocationView, (z80) obj);
            }
        }, new y20() { // from class: l.boq0
            @Override // p153l.y20
            public final void call(Object obj) {
                YouthVipLocationView.m45038E0((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: q0 */
    public static void m45052q0(final Frag frag, final YouthVipLocationView youthVipLocationView, Location location) {
        location.getClass();
        if (frag.act() == null) {
            return;
        }
        DoublePair doublePairNew_ = DoublePair.new_();
        doublePairNew_.first = location.m80014u();
        doublePairNew_.second = location.m80016x();
        if (Intrinsics.m88377d(DoublePair.new_(), CoreModule.f18264c.f20381e0.m116600p9().getLatitudeAndLongitude())) {
            fmj fmjVar = youthVipLocationView.geocoder;
            if (fmjVar == null) {
                Intrinsics.m88391r("geocoder");
                fmjVar = null;
            }
            fmjVar.m126239e(frag.act(), doublePairNew_.first, doublePairNew_.second, new y20() { // from class: l.moq0
                @Override // p153l.y20
                public final void call(Object obj) {
                    YouthVipLocationView.m45041I0(frag, youthVipLocationView, (z80) obj);
                }
            }, new y20() { // from class: l.znq0
                @Override // p153l.y20
                public final void call(Object obj) {
                    YouthVipLocationView.m45042J0((Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: r0 */
    public static C22421c m45053r0(Function1 function1, Object obj) {
        return (C22421c) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: v0 */
    public static Boolean m45057v0(User user) {
        user.getClass();
        return Boolean.valueOf(Intrinsics.m88377d(DoublePair.new_(), user.getLatitudeAndLongitude()));
    }

    /* JADX INFO: renamed from: B0 */
    public final void m45058B0(final Frag frag) {
        C22421c c22421cDuringCreated = frag.duringCreated(CoreModule.f18264c.f20381e0.m116596o9());
        final Function1 function1 = new Function1() { // from class: l.eoq0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return YouthVipLocationView.m45047l0((User) obj);
            }
        };
        c22421cDuringCreated.map(new qcj() { // from class: l.foq0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return YouthVipLocationView.m45046k0(function1, obj);
            }
        }).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.goq0
            @Override // p153l.y20
            public final void call(Object obj) {
                YouthVipLocationView.m45050o0(frag, this, (DoublePair) obj);
            }
        }));
        C22421c c22421cDuringCreated2 = frag.duringCreated(CoreModule.f18264c.f20381e0.m116596o9());
        final Function1 function2 = new Function1() { // from class: l.hoq0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return YouthVipLocationView.m45057v0((User) obj);
            }
        };
        C22421c c22421cFilter = c22421cDuringCreated2.filter(new qcj() { // from class: l.ioq0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return YouthVipLocationView.m45045j0(function2, obj);
            }
        });
        final Function1 function3 = new Function1() { // from class: l.joq0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return YouthVipLocationView.m45048m0((User) obj);
            }
        };
        c22421cFilter.switchMap(new qcj() { // from class: l.koq0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return YouthVipLocationView.m45053r0(function3, obj);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.loq0
            @Override // p153l.y20
            public final void call(Object obj) {
                YouthVipLocationView.m45052q0(frag, this, (Location) obj);
            }
        }));
    }

    @NotNull
    public final ImageView get_location_ic() {
        ImageView imageView = this._location_ic;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.m88391r("_location_ic");
        return null;
    }

    @NotNull
    public final TextView get_location_value() {
        TextView textView = this._location_value;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_location_value");
        return null;
    }

    @NotNull
    public final ImageView get_right_arrow_ic() {
        ImageView imageView = this._right_arrow_ic;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.m88391r("_right_arrow_ic");
        return null;
    }

    @NotNull
    public final YouthVipLocationView get_root_view() {
        YouthVipLocationView youthVipLocationView = this._root_view;
        if (youthVipLocationView != null) {
            return youthVipLocationView;
        }
        Intrinsics.m88391r("_root_view");
        return null;
    }

    @NotNull
    public final TextView get_subtitle() {
        TextView textView = this._subtitle;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_subtitle");
        return null;
    }

    @NotNull
    public final VDraweeView get_texture() {
        VDraweeView vDraweeView = this._texture;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_texture");
        return null;
    }

    @NotNull
    public final TextView get_title() {
        TextView textView = this._title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_title");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m45059w0(this);
        uqb0.f180374G.m127138Y0(get_texture(), gbc0.f103276c6);
        bnl0.m105524M(get_location_value(), false);
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
    public final void m45059w0(View view) {
        noq0.m164182a(this, view);
    }

    /* JADX INFO: renamed from: y0 */
    public final void m45060y0(@NotNull final Frag frag) {
        frag.getClass();
        fmj fmjVarM126236c = fmj.m126236c(frag.act(), false);
        fmjVarM126236c.getClass();
        this.geocoder = fmjVarM126236c;
        m45058B0(frag);
        bnl0.m105509E0(get_root_view(), new View.OnClickListener() { // from class: l.ynq0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                YouthVipLocationView.m45044i0(frag, this, view);
            }
        });
    }

    /* JADX INFO: renamed from: z0 */
    public final void m45061z0(String city) {
        if (TextUtils.isEmpty(city)) {
            bnl0.m105524M(get_location_value(), false);
            return;
        }
        bnl0.m105524M(get_location_value(), true);
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
