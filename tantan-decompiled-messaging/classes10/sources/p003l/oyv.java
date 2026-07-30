package p003l;

import android.view.View;
import androidx.annotation.NonNull;
import com.google.common.base.Optional;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import l.au2;
import l.cjz;
import l.d30;
import l.du2;
import l.e30;
import l.faj;
import l.mcr;
import l.mkd0;
import l.vwb;
import l.w9j;
import l.xdl0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class oyv<T> {

    /* JADX INFO: renamed from: a */
    public final View f6760a;

    /* JADX INFO: renamed from: b */
    public final mcr f6761b;

    /* JADX INFO: renamed from: c */
    public final List<InterfaceC3401a<T>> f6762c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public c<T> f6763d;

    /* JADX INFO: renamed from: e */
    public int f6764e;

    /* JADX INFO: renamed from: f */
    public d30 f6765f;

    /* JADX INFO: renamed from: l.oyv$a */
    public interface InterfaceC3401a<T> {
        /* JADX INFO: renamed from: a */
        boolean m8618a(T t);

        @NonNull
        /* JADX INFO: renamed from: b */
        String m8619b();

        /* JADX INFO: renamed from: c */
        void m8620c(View view);

        /* JADX INFO: renamed from: d */
        c<Boolean> m8621d();
    }

    public oyv(mcr mcrVar, View view) {
        this.f6761b = mcrVar;
        this.f6760a = view;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Optional m8605a(List list, Object[] objArr) {
        List listAsList = Arrays.asList(objArr);
        du2.a("[view_dispatcher]", "condition result: [" + vwb.o0(listAsList, new cjz(), ", ") + "]");
        for (int i = 0; i < listAsList.size(); i++) {
            if (((Boolean) listAsList.get(i)).booleanValue()) {
                du2.a("[view_dispatcher]", "final handle by :" + ((InterfaceC3401a) list.get(i)).m8619b());
                return Optional.of((InterfaceC3401a) list.get(i));
            }
        }
        du2.a("[view_dispatcher]", "no hit strategy");
        return Optional.absent();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Boolean m8609e(Optional optional, InterfaceC3401a interfaceC3401a) {
        try {
            return Boolean.valueOf(interfaceC3401a.m8618a(optional.isPresent() ? optional.get() : null));
        } catch (Exception e) {
            CrashHelper.c(e);
            au2.w(e);
            du2.a("[view_dispatcher]", "error: " + e);
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ c m8612h(InterfaceC3401a interfaceC3401a) {
        return interfaceC3401a.m8621d().onErrorReturn(new w9j() { // from class: l.nyv
            public final Object call(Object obj) {
                return Boolean.FALSE;
            }
        }).distinctUntilChanged().take(this.f6764e != 1 ? Integer.MAX_VALUE : 1);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ c m8613i(final Optional optional) {
        final ArrayList arrayListN = vwb.n(this.f6762c, new w9j() { // from class: l.jyv
            public final Object call(Object obj) {
                return oyv.m8609e(optional, (oyv.InterfaceC3401a) obj);
            }
        });
        if (!vwb.J(arrayListN)) {
            du2.a("[view_dispatcher]", "handled strategies: [" + vwb.o0(arrayListN, new w9j() { // from class: l.kyv
                public final Object call(Object obj) {
                    return ((oyv.InterfaceC3401a) obj).m8619b();
                }
            }, " ,") + "]");
        }
        return mkd0.p(vwb.Q(this.f6762c, new w9j() { // from class: l.lyv
            public final Object call(Object obj) {
                return this.f6234a.m8612h((oyv.InterfaceC3401a) obj);
            }
        }), new faj() { // from class: l.myv
            public final Object call(Object[] objArr) {
                return oyv.m8605a(arrayListN, objArr);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m8614j(Optional optional) {
        boolean zIsPresent = optional.isPresent();
        View view = this.f6760a;
        if (zIsPresent) {
            xdl0.M(view, true);
            ((InterfaceC3401a) optional.get()).m8620c(this.f6760a);
            return;
        }
        xdl0.M(view, false);
        d30 d30Var = this.f6765f;
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: k */
    public void m8615k(InterfaceC3401a<T> interfaceC3401a) {
        this.f6762c.add(interfaceC3401a);
    }

    /* JADX INFO: renamed from: l */
    public void m8616l(int i) {
        this.f6764e = i;
    }

    /* JADX INFO: renamed from: m */
    public void m8617m() {
        c cVarJust;
        c<T> cVar = this.f6763d;
        if (cVar != null) {
            cVarJust = cVar.map(new w9j() { // from class: l.fyv
                public final Object call(Object obj) {
                    return Optional.fromNullable(obj);
                }
            }).take(this.f6764e != 1 ? Integer.MAX_VALUE : 1);
        } else {
            cVarJust = c.just(Optional.absent());
        }
        this.f6761b.duringCreated(cVarJust.switchMap(new w9j() { // from class: l.gyv
            public final Object call(Object obj) {
                return this.f4777a.m8613i((Optional) obj);
            }
        })).subscribe(mkd0.H(new e30() { // from class: l.hyv
            public final void call(Object obj) {
                this.f4971a.m8614j((Optional) obj);
            }
        }, new e30() { // from class: l.iyv
            public final void call(Object obj) {
                du2.a("[view_dispatcher]", "upstream data throw error :" + ((Throwable) obj));
            }
        }));
    }
}
