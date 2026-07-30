package p009l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import l.cxq;
import l.f2s;
import l.gyu;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ll/fyu;", "Ll/gyu;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Ll/f2s;", "dialog", "Ll/cho0;", "presenter", "", "f", "(Ll/f2s;Ll/cho0;)V", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class fyu extends gyu {
    public fyu(@NotNull Context context) {
        context.getClass();
        c(LayoutInflater.from(context), (ViewGroup) null);
    }

    /* JADX INFO: renamed from: d */
    public static Unit m14669d(f2s f2sVar, cho0 cho0Var, View view) {
        view.getClass();
        f2sVar.dismiss();
        cho0Var.m12577m4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public static Unit m14670e(f2s f2sVar, cho0 cho0Var, View view) {
        view.getClass();
        f2sVar.dismiss();
        cho0Var.m12575k4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public final void m14671f(@NotNull final f2s dialog, @NotNull final cho0 presenter) {
        dialog.getClass();
        presenter.getClass();
        TextView textView = ((gyu) this).f;
        textView.getClass();
        cxq.c(textView, new Function1() { // from class: l.dyu
            public final Object invoke(Object obj) {
                return fyu.m14669d(dialog, presenter, (View) obj);
            }
        });
        TextView textView2 = ((gyu) this).g;
        textView2.getClass();
        cxq.c(textView2, new Function1() { // from class: l.eyu
            public final Object invoke(Object obj) {
                return fyu.m14670e(dialog, presenter, (View) obj);
            }
        });
    }
}
