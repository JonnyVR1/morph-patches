package p153l;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.data.MatchFrom;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VDraweeView;
import p151v.VImage;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\bJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0012J\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, m88121d2 = {"Ll/g550;", "Ll/w4;", "Ll/m8h0;", "viewModel", "<init>", "(Ll/m8h0;)V", "", "f", "()V", "h", "g", "Landroid/graphics/drawable/Drawable;", "b", "()Landroid/graphics/drawable/Drawable;", "", MatchFrom.selected, "", "c", "(Z)I", "clickable", "a", "Lv/VDraweeView;", "maskView", "j", "(Lv/VDraweeView;)V", "Lv/VImage;", "borderView", "k", "(Lv/VImage;)V", "", Constants.INAPP_DATA_TAG, "()Ljava/lang/String;", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class g550 extends AbstractC21009w4 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g550(@NotNull m8h0 m8h0Var) {
        super(m8h0Var);
        m8h0Var.getClass();
    }

    @Override // p153l.AbstractC21009w4
    /* JADX INFO: renamed from: a */
    public int mo129022a(boolean clickable) {
        return Color.parseColor(clickable ? Constants.BLACK : "#33000000");
    }

    @Override // p153l.AbstractC21009w4
    @Nullable
    /* JADX INFO: renamed from: b */
    public Drawable mo129023b() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(txq.m193530c(10));
        gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
        gradientDrawable.setGradientType(0);
        gradientDrawable.setColors(new int[]{Color.parseColor("#FFCF77"), Color.parseColor("#FFEED0"), Color.parseColor("#FFCF77")});
        return gradientDrawable;
    }

    @Override // p153l.AbstractC21009w4
    /* JADX INFO: renamed from: c */
    public int mo129024c(boolean selected) {
        return Color.parseColor(selected ? Constants.BLACK : "#80FFD78C");
    }

    @Override // p153l.AbstractC21009w4
    @NotNull
    /* JADX INFO: renamed from: d */
    public String mo129025d() {
        return "开启全新体验";
    }

    @Override // p153l.AbstractC21009w4
    /* JADX INFO: renamed from: f */
    public void mo129026f() {
        getViewModel().m157431x().setBackground(getViewModel().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String().getDrawable(gbc0.f103449z1));
        getViewModel().m157430w().setImageResource(gbc0.f103080B1);
        getViewModel().m157406V().setImageResource(gbc0.f103108F1);
        getViewModel().m157396L().setImageResource(gbc0.f103108F1);
        getViewModel().m157432y().setBackground(getViewModel().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String().getDrawable(gbc0.f103087C1));
        getViewModel().m157433z().setBackground(getViewModel().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String().getDrawable(gbc0.f103087C1));
        getViewModel().m157428u().setBackground(getViewModel().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String().getDrawable(gbc0.f103087C1));
        getViewModel().m157386A().setBackground(getViewModel().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String().getDrawable(gbc0.f103087C1));
        getViewModel().m157429v().setBackground(getViewModel().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String().getDrawable(gbc0.f103073A1));
        getViewModel().m157405U().setVisibility(4);
        getViewModel().m157395K().setVisibility(4);
        getViewModel().m157401Q().setVisibility(4);
        getViewModel().m157410Z().setText("权益升级包");
        getViewModel().m157407W().setText("选择你喜欢的类型");
        getViewModel().m157408X().setText("享受专属你的交友体验");
        getViewModel().m157414d0().setText("选择你喜欢的类型");
        getViewModel().m157413c0().setText("让我们更了解你的交友偏好");
        getViewModel().m157403S().setText("权益升级包");
        getViewModel().m157400P().setText("开启你的惊喜定制之旅");
        ViewGroup.LayoutParams layoutParams = getViewModel().m157402R().getLayoutParams();
        layoutParams.getClass();
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = txq.m193530c(99);
        ViewGroup.LayoutParams layoutParams2 = getViewModel().m157397M().getLayoutParams();
        layoutParams2.getClass();
        ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = txq.m193530c(78);
        ViewGroup.LayoutParams layoutParams3 = getViewModel().m157398N().getLayoutParams();
        layoutParams3.getClass();
        ConstraintLayout.C0221a c0221a = (ConstraintLayout.C0221a) layoutParams3;
        c0221a.f1251h = -1;
        c0221a.f1253i = ddc0.f87875E;
        ((ViewGroup.MarginLayoutParams) c0221a).topMargin = txq.m193530c(90);
        ViewGroup.LayoutParams layoutParams4 = getViewModel().m157399O().getLayoutParams();
        layoutParams4.getClass();
        ConstraintLayout.C0221a c0221a2 = (ConstraintLayout.C0221a) layoutParams4;
        c0221a2.f1251h = -1;
        c0221a2.f1253i = ddc0.f87875E;
        ((ViewGroup.MarginLayoutParams) c0221a2).topMargin = txq.m193530c(90);
    }

    @Override // p153l.AbstractC21009w4
    /* JADX INFO: renamed from: g */
    public void mo129027g() {
        m204799i(getViewModel().m157414d0(), Color.parseColor("#C5AD7D"), Color.parseColor("#F9ECCA"), Color.parseColor("#C5AD7D"));
        m204799i(getViewModel().m157413c0(), Color.parseColor("#C5AD7D"), Color.parseColor("#F9ECCA"), Color.parseColor("#C5AD7D"));
        m204799i(getViewModel().m157392H(), Color.parseColor("#C5AD7D"), Color.parseColor("#F9ECCA"), Color.parseColor("#C5AD7D"));
        m204799i(getViewModel().m157391G(), Color.parseColor("#C5AD7D"), Color.parseColor("#F9ECCA"), Color.parseColor("#C5AD7D"));
        m204799i(getViewModel().m157403S(), Color.parseColor("#D1AE68"), Color.parseColor("#FFF7E2"), Color.parseColor("#E2B761"));
        m204799i(getViewModel().m157395K(), Color.parseColor("#D6AF74"), Color.parseColor("#FFE7C3"), Color.parseColor("#D6AF74"));
        m204799i(getViewModel().m157402R(), Color.parseColor("#D1AE68"), Color.parseColor("#FFF7E2"), Color.parseColor("#E2B761"));
        m204799i(getViewModel().m157400P(), Color.parseColor("#C5AD7D"), Color.parseColor("#F9ECCA"), Color.parseColor("#C5AD7D"));
        m204799i(getViewModel().m157401Q(), Color.parseColor("#C5AD7D"), Color.parseColor("#F9ECCA"), Color.parseColor("#C5AD7D"));
    }

    @Override // p153l.AbstractC21009w4
    /* JADX INFO: renamed from: h */
    public void mo129028h() {
        m204799i(getViewModel().m157410Z(), Color.parseColor("#D1AE68"), Color.parseColor("#FFF7E2"), Color.parseColor("#E2B761"));
        m204799i(getViewModel().m157405U(), Color.parseColor("#D6AF74"), Color.parseColor("#FFE7C3"), Color.parseColor("#D6AF74"));
        m204799i(getViewModel().m157409Y(), Color.parseColor("#D1AE68"), Color.parseColor("#FFF7E2"), Color.parseColor("#E2B761"));
        m204799i(getViewModel().m157407W(), Color.parseColor("#C5AD7D"), Color.parseColor("#F9ECCA"), Color.parseColor("#C5AD7D"));
        m204799i(getViewModel().m157408X(), Color.parseColor("#C5AD7D"), Color.parseColor("#F9ECCA"), Color.parseColor("#C5AD7D"));
    }

    @Override // p153l.AbstractC21009w4
    /* JADX INFO: renamed from: j */
    public void mo129029j(@NotNull VDraweeView maskView) {
        maskView.getClass();
        maskView.getHierarchy().m207041D(gbc0.f103094D1);
    }

    @Override // p153l.AbstractC21009w4
    /* JADX INFO: renamed from: k */
    public void mo129030k(@NotNull VImage borderView) {
        borderView.getClass();
        borderView.setImageResource(gbc0.f103101E1);
    }
}
