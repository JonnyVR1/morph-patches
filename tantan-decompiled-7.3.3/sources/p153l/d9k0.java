package p153l;

import android.view.View;
import androidx.appcompat.app.DialogInterfaceC0075a;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\f\u001a\u00020\u000b2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m88121d2 = {"Ll/d9k0;", "", "<init>", "()V", "Ll/i6t;", "presenter", "", "", "list", "Ll/y20;", "itemClick", "Landroidx/appcompat/app/a;", Constants.INAPP_DATA_TAG, "(Ll/i6t;Ljava/util/List;Ll/y20;)Landroidx/appcompat/app/a;", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class d9k0 {

    @NotNull
    public static final d9k0 INSTANCE = new d9k0();

    /* JADX INFO: renamed from: a */
    public static void m115081a(c0s c0sVar, View view) {
        c0sVar.dismiss();
    }

    /* JADX INFO: renamed from: b */
    public static void m115082b(c0s c0sVar, View view) {
        c0sVar.dismiss();
    }

    /* JADX INFO: renamed from: c */
    public static void m115083c(y20 y20Var, String str) {
        str.getClass();
        y20Var.call(str);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: d */
    public static final DialogInterfaceC0075a m115084d(@NotNull i6t<?, ?> presenter, @NotNull List<String> list, @NotNull final y20<String> itemClick) {
        presenter.getClass();
        list.getClass();
        itemClick.getClass();
        List<String> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (String str : list2) {
            k8p0 k8p0Var = new k8p0(str);
            k8p0Var.m148744d(true);
            k8p0Var.m148745e(str);
            arrayList.add(k8p0Var);
        }
        List<k8p0> mutableList = CollectionsKt.toMutableList((Collection) arrayList);
        Act act = presenter.act();
        act.getClass();
        d2o0 d2o0Var = new d2o0(act);
        final c0s c0sVar = new c0s(presenter, d2o0Var.getCom.p1.mobile.putong.data.OMSTemplateModeType.view java.lang.String());
        bnl0.m105509E0(d2o0Var.m113729f(), new View.OnClickListener() { // from class: l.a9k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d9k0.m115081a(c0sVar, view);
            }
        });
        bnl0.m105509E0(d2o0Var.m113728e(), new View.OnClickListener() { // from class: l.b9k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d9k0.m115082b(c0sVar, view);
            }
        });
        d2o0Var.m113731h(mutableList, null, null, new y20() { // from class: l.c9k0
            @Override // p153l.y20
            public final void call(Object obj) {
                d9k0.m115083c(itemClick, (String) obj);
            }
        });
        c0sVar.show();
        return c0sVar;
    }
}
