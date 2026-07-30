package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.p046p1.mobile.putong.data.OMSTemplateType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m87232d2 = {"Ll/fyu;", "Ll/gyu;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Ll/f2s;", OMSTemplateType.dialog, "Ll/cho0;", "presenter", "", "f", "(Ll/f2s;Ll/cho0;)V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class fyu extends gyu {
    public fyu(@NotNull Context context) {
        context.getClass();
        m128734c(LayoutInflater.from(context), null);
    }

    /* JADX INFO: renamed from: d */
    public static Unit m123796d(f2s f2sVar, cho0 cho0Var, View view) {
        view.getClass();
        f2sVar.dismiss();
        cho0Var.m106981m4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public static Unit m123797e(f2s f2sVar, cho0 cho0Var, View view) {
        view.getClass();
        f2sVar.dismiss();
        cho0Var.m106979k4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public final void m123798f(@NotNull final f2s dialog, @NotNull final cho0 presenter) {
        dialog.getClass();
        presenter.getClass();
        TextView textView = this.f105042f;
        textView.getClass();
        cxq.m109105c(textView, new Function1() { // from class: l.dyu
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return fyu.m123796d(dialog, presenter, (View) obj);
            }
        });
        TextView textView2 = this.f105043g;
        textView2.getClass();
        cxq.m109105c(textView2, new Function1() { // from class: l.eyu
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return fyu.m123797e(dialog, presenter, (View) obj);
            }
        });
    }
}
