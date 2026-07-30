package p009l;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import l.b3c0;
import l.svq;
import l.x4c0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VDraweeView;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\bJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0012J\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Ll/rw40;", "Ll/y4;", "Ll/e0h0;", "viewModel", "<init>", "(Ll/e0h0;)V", "", "f", "()V", "h", "g", "Landroid/graphics/drawable/Drawable;", "b", "()Landroid/graphics/drawable/Drawable;", "", "selected", "", "c", "(Z)I", "clickable", "a", "Lv/VDraweeView;", "maskView", "j", "(Lv/VDraweeView;)V", "Lv/VImage;", "borderView", "k", "(Lv/VImage;)V", "", "d", "()Ljava/lang/String;", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class rw40 extends AbstractC1322y4 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rw40(@NotNull e0h0 e0h0Var) {
        super(e0h0Var);
        e0h0Var.getClass();
    }

    @Override // p009l.AbstractC1322y4
    /* JADX INFO: renamed from: a */
    public int mo18211a(boolean clickable) {
        return Color.parseColor(clickable ? "#000000" : "#33000000");
    }

    @Override // p009l.AbstractC1322y4
    @Nullable
    /* JADX INFO: renamed from: b */
    public Drawable mo18212b() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(svq.c(10));
        gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
        gradientDrawable.setGradientType(0);
        gradientDrawable.setColors(new int[]{Color.parseColor("#FFCF77"), Color.parseColor("#FFEED0"), Color.parseColor("#FFCF77")});
        return gradientDrawable;
    }

    @Override // p009l.AbstractC1322y4
    /* JADX INFO: renamed from: c */
    public int mo18213c(boolean selected) {
        return Color.parseColor(selected ? "#000000" : "#80FFD78C");
    }

    @Override // p009l.AbstractC1322y4
    @NotNull
    /* JADX INFO: renamed from: d */
    public String mo18214d() {
        return "开启全新体验";
    }

    @Override // p009l.AbstractC1322y4
    /* JADX INFO: renamed from: f */
    public void mo18215f() {
        getViewModel().m13608x().setBackground(getViewModel().getAct().getDrawable(b3c0.z1));
        getViewModel().m13607w().setImageResource(b3c0.B1);
        getViewModel().m13582V().setImageResource(b3c0.F1);
        getViewModel().m13572L().setImageResource(b3c0.F1);
        getViewModel().m13609y().setBackground(getViewModel().getAct().getDrawable(b3c0.C1));
        getViewModel().m13610z().setBackground(getViewModel().getAct().getDrawable(b3c0.C1));
        getViewModel().m13605u().setBackground(getViewModel().getAct().getDrawable(b3c0.C1));
        getViewModel().m13561A().setBackground(getViewModel().getAct().getDrawable(b3c0.C1));
        getViewModel().m13606v().setBackground(getViewModel().getAct().getDrawable(b3c0.A1));
        getViewModel().m13581U().setVisibility(4);
        getViewModel().m13571K().setVisibility(4);
        getViewModel().m13577Q().setVisibility(4);
        getViewModel().m13586Z().setText("权益升级包");
        getViewModel().m13583W().setText("选择你喜欢的类型");
        getViewModel().m13584X().setText("享受专属你的交友体验");
        getViewModel().m13590d0().setText("选择你喜欢的类型");
        getViewModel().m13589c0().setText("让我们更了解你的交友偏好");
        getViewModel().m13579S().setText("权益升级包");
        getViewModel().m13576P().setText("开启你的惊喜定制之旅");
        ViewGroup.LayoutParams layoutParams = getViewModel().m13578R().getLayoutParams();
        layoutParams.getClass();
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = svq.c(99);
        ViewGroup.LayoutParams layoutParams2 = getViewModel().m13573M().getLayoutParams();
        layoutParams2.getClass();
        ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = svq.c(78);
        ConstraintLayout.a layoutParams3 = getViewModel().m13574N().getLayoutParams();
        layoutParams3.getClass();
        ConstraintLayout.a aVar = layoutParams3;
        aVar.h = -1;
        aVar.i = x4c0.E;
        ((ViewGroup.MarginLayoutParams) aVar).topMargin = svq.c(90);
        ConstraintLayout.a layoutParams4 = getViewModel().m13575O().getLayoutParams();
        layoutParams4.getClass();
        ConstraintLayout.a aVar2 = layoutParams4;
        aVar2.h = -1;
        aVar2.i = x4c0.E;
        ((ViewGroup.MarginLayoutParams) aVar2).topMargin = svq.c(90);
    }

    @Override // p009l.AbstractC1322y4
    /* JADX INFO: renamed from: g */
    public void mo18216g() {
        m25183i(getViewModel().m13590d0(), Color.parseColor("#C5AD7D"), Color.parseColor("#F9ECCA"), Color.parseColor("#C5AD7D"));
        m25183i(getViewModel().m13589c0(), Color.parseColor("#C5AD7D"), Color.parseColor("#F9ECCA"), Color.parseColor("#C5AD7D"));
        m25183i(getViewModel().m13568H(), Color.parseColor("#C5AD7D"), Color.parseColor("#F9ECCA"), Color.parseColor("#C5AD7D"));
        m25183i(getViewModel().m13567G(), Color.parseColor("#C5AD7D"), Color.parseColor("#F9ECCA"), Color.parseColor("#C5AD7D"));
        m25183i(getViewModel().m13579S(), Color.parseColor("#D1AE68"), Color.parseColor("#FFF7E2"), Color.parseColor("#E2B761"));
        m25183i(getViewModel().m13571K(), Color.parseColor("#D6AF74"), Color.parseColor("#FFE7C3"), Color.parseColor("#D6AF74"));
        m25183i(getViewModel().m13578R(), Color.parseColor("#D1AE68"), Color.parseColor("#FFF7E2"), Color.parseColor("#E2B761"));
        m25183i(getViewModel().m13576P(), Color.parseColor("#C5AD7D"), Color.parseColor("#F9ECCA"), Color.parseColor("#C5AD7D"));
        m25183i(getViewModel().m13577Q(), Color.parseColor("#C5AD7D"), Color.parseColor("#F9ECCA"), Color.parseColor("#C5AD7D"));
    }

    @Override // p009l.AbstractC1322y4
    /* JADX INFO: renamed from: h */
    public void mo18217h() {
        m25183i(getViewModel().m13586Z(), Color.parseColor("#D1AE68"), Color.parseColor("#FFF7E2"), Color.parseColor("#E2B761"));
        m25183i(getViewModel().m13581U(), Color.parseColor("#D6AF74"), Color.parseColor("#FFE7C3"), Color.parseColor("#D6AF74"));
        m25183i(getViewModel().m13585Y(), Color.parseColor("#D1AE68"), Color.parseColor("#FFF7E2"), Color.parseColor("#E2B761"));
        m25183i(getViewModel().m13583W(), Color.parseColor("#C5AD7D"), Color.parseColor("#F9ECCA"), Color.parseColor("#C5AD7D"));
        m25183i(getViewModel().m13584X(), Color.parseColor("#C5AD7D"), Color.parseColor("#F9ECCA"), Color.parseColor("#C5AD7D"));
    }

    @Override // p009l.AbstractC1322y4
    /* JADX INFO: renamed from: j */
    public void mo18218j(@NotNull VDraweeView maskView) {
        maskView.getClass();
        maskView.getHierarchy().D(b3c0.D1);
    }

    @Override // p009l.AbstractC1322y4
    /* JADX INFO: renamed from: k */
    public void mo18219k(@NotNull VImage borderView) {
        borderView.getClass();
        borderView.setImageResource(b3c0.E1);
    }
}
