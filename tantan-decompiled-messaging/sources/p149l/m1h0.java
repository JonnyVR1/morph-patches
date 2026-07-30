package p149l;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.data.MatchFrom;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VDraweeView;
import p147v.VImage;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\bJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0012J\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, m87232d2 = {"Ll/m1h0;", "Ll/y4;", "Ll/e0h0;", "viewModel", "<init>", "(Ll/e0h0;)V", "", "f", "()V", "h", "g", "Landroid/graphics/drawable/Drawable;", "b", "()Landroid/graphics/drawable/Drawable;", "", MatchFrom.selected, "", "c", "(Z)I", "clickable", "a", "Lv/VDraweeView;", "maskView", "j", "(Lv/VDraweeView;)V", "Lv/VImage;", "borderView", "k", "(Lv/VImage;)V", "", Constants.INAPP_DATA_TAG, "()Ljava/lang/String;", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class m1h0 extends AbstractC21304y4 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1h0(@NotNull e0h0 e0h0Var) {
        super(e0h0Var);
        e0h0Var.getClass();
    }

    @Override // p149l.AbstractC21304y4
    /* JADX INFO: renamed from: a */
    public int mo152584a(boolean clickable) {
        return Color.parseColor(clickable ? "#011703" : "#33011703");
    }

    @Override // p149l.AbstractC21304y4
    @Nullable
    /* JADX INFO: renamed from: b */
    public Drawable mo152585b() {
        return getViewModel().getCom.tencent.open.SocialConstants.PARAM_ACT java.lang.String().getDrawable(b3c0.f73088k5);
    }

    @Override // p149l.AbstractC21304y4
    /* JADX INFO: renamed from: c */
    public int mo152586c(boolean selected) {
        return Color.parseColor(selected ? "#133C20" : "#FFD78C");
    }

    @Override // p149l.AbstractC21304y4
    @NotNull
    /* JADX INFO: renamed from: d */
    public String mo152587d() {
        return "开始全新定制体验";
    }

    @Override // p149l.AbstractC21304y4
    /* JADX INFO: renamed from: g */
    public void mo152589g() {
        m212874i(getViewModel().m114218d0(), Color.parseColor("#C5AD7D"), Color.parseColor("#F9ECCA"), Color.parseColor("#C5AD7D"));
        m212874i(getViewModel().m114217c0(), Color.parseColor("#C5AD7D"), Color.parseColor("#F9ECCA"), Color.parseColor("#C5AD7D"));
        m212874i(getViewModel().m114196H(), Color.parseColor("#C5AD7D"), Color.parseColor("#F9ECCA"), Color.parseColor("#C5AD7D"));
        m212874i(getViewModel().m114195G(), Color.parseColor("#C5AD7D"), Color.parseColor("#F9ECCA"), Color.parseColor("#C5AD7D"));
        m212874i(getViewModel().m114207S(), Color.parseColor("#D1AE68"), Color.parseColor("#FFF7E2"), Color.parseColor("#E2B761"));
        m212874i(getViewModel().m114199K(), Color.parseColor("#D6AF74"), Color.parseColor("#FFE7C3"), Color.parseColor("#D6AF74"));
        m212874i(getViewModel().m114206R(), Color.parseColor("#D1AE68"), Color.parseColor("#FFF7E2"), Color.parseColor("#E2B761"));
        m212874i(getViewModel().m114204P(), Color.parseColor("#C5AD7D"), Color.parseColor("#F9ECCA"), Color.parseColor("#C5AD7D"));
        m212874i(getViewModel().m114205Q(), Color.parseColor("#C5AD7D"), Color.parseColor("#F9ECCA"), Color.parseColor("#C5AD7D"));
    }

    @Override // p149l.AbstractC21304y4
    /* JADX INFO: renamed from: h */
    public void mo152590h() {
        m212874i(getViewModel().m114214Z(), Color.parseColor("#D1AE68"), Color.parseColor("#FFF7E2"), Color.parseColor("#E2B761"));
        m212874i(getViewModel().m114209U(), Color.parseColor("#D6AF74"), Color.parseColor("#FFE7C3"), Color.parseColor("#D6AF74"));
        m212874i(getViewModel().m114213Y(), Color.parseColor("#D1AE68"), Color.parseColor("#FFF7E2"), Color.parseColor("#E2B761"));
        m212874i(getViewModel().m114211W(), Color.parseColor("#C5AD7D"), Color.parseColor("#F9ECCA"), Color.parseColor("#C5AD7D"));
        m212874i(getViewModel().m114212X(), Color.parseColor("#C5AD7D"), Color.parseColor("#F9ECCA"), Color.parseColor("#C5AD7D"));
    }

    @Override // p149l.AbstractC21304y4
    /* JADX INFO: renamed from: j */
    public void mo152591j(@NotNull VDraweeView maskView) {
        maskView.getClass();
    }

    @Override // p149l.AbstractC21304y4
    /* JADX INFO: renamed from: k */
    public void mo152592k(@NotNull VImage borderView) {
        borderView.getClass();
    }

    @Override // p149l.AbstractC21304y4
    /* JADX INFO: renamed from: f */
    public void mo152588f() {
    }
}
