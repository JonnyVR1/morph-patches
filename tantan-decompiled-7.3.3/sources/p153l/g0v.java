package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.p051p1.mobile.putong.data.OMSTemplateType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m88120d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m88121d2 = {"Ll/g0v;", "Ll/h0v;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Ll/g4s;", OMSTemplateType.dialog, "Ll/gqo0;", "presenter", "", "f", "(Ll/g4s;Ll/gqo0;)V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class g0v extends h0v {
    public g0v(@NotNull Context context) {
        context.getClass();
        m133199c(LayoutInflater.from(context), null);
    }

    /* JADX INFO: renamed from: d */
    public static Unit m128469d(g4s g4sVar, gqo0 gqo0Var, View view) {
        view.getClass();
        g4sVar.dismiss();
        gqo0Var.m131413m4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public static Unit m128470e(g4s g4sVar, gqo0 gqo0Var, View view) {
        view.getClass();
        g4sVar.dismiss();
        gqo0Var.m131411k4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public final void m128471f(@NotNull final g4s dialog, @NotNull final gqo0 presenter) {
        dialog.getClass();
        presenter.getClass();
        TextView textView = this.f107336f;
        textView.getClass();
        czq.m113347c(textView, new Function1() { // from class: l.e0v
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g0v.m128469d(dialog, presenter, (View) obj);
            }
        });
        TextView textView2 = this.f107337g;
        textView2.getClass();
        czq.m113347c(textView2, new Function1() { // from class: l.f0v
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g0v.m128470e(dialog, presenter, (View) obj);
            }
        });
    }
}
