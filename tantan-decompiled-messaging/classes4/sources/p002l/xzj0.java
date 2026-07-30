package p002l;

import android.view.View;
import androidx.appcompat.app.a;
import com.p1.mobile.android.app.Act;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.SourceDebugExtension;
import l.e30;
import l.gzo0;
import l.wjm0;
import l.xdl0;
import l.zsn0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\f\u001a\u00020\u000b2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ll/xzj0;", "", "<init>", "()V", "Ll/h4t;", "presenter", "", "", "list", "Ll/e30;", "itemClick", "Landroidx/appcompat/app/a;", "d", "(Ll/h4t;Ljava/util/List;Ll/e30;)Landroidx/appcompat/app/a;", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class xzj0 {

    @NotNull
    public static final xzj0 INSTANCE = new xzj0();

    /* JADX INFO: renamed from: a */
    public static void m26276a(byr byrVar, View view) {
        byrVar.dismiss();
    }

    /* JADX INFO: renamed from: b */
    public static void m26277b(byr byrVar, View view) {
        byrVar.dismiss();
    }

    /* JADX INFO: renamed from: c */
    public static void m26278c(e30 e30Var, String str) {
        str.getClass();
        e30Var.call(str);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: d */
    public static final a m26279d(@NotNull h4t<?, ?> presenter, @NotNull List<String> list, @NotNull final e30<String> itemClick) {
        presenter.getClass();
        list.getClass();
        itemClick.getClass();
        List<String> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (String str : list2) {
            gzo0 gzo0Var = new gzo0(str);
            gzo0Var.d(true);
            gzo0Var.e(str);
            arrayList.add(gzo0Var);
        }
        List mutableList = CollectionsKt.toMutableList(arrayList);
        Act act = presenter.act();
        act.getClass();
        zsn0 zsn0Var = new zsn0(act);
        final byr byrVar = new byr(presenter, zsn0Var.d());
        xdl0.E0(zsn0Var.f(), new View.OnClickListener() { // from class: l.uzj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xzj0.m26276a(byrVar, view);
            }
        });
        xdl0.E0(zsn0Var.e(), new View.OnClickListener() { // from class: l.vzj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xzj0.m26277b(byrVar, view);
            }
        });
        zsn0Var.h(mutableList, (wjm0) null, (String) null, new e30() { // from class: l.wzj0
            public final void call(Object obj) {
                xzj0.m26278c(itemClick, (String) obj);
            }
        });
        byrVar.show();
        return byrVar;
    }
}
