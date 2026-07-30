package p149l;

import android.view.View;
import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.api.Api;
import com.google.common.base.Optional;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes10.dex */
public class oyv<T> {

    /* JADX INFO: renamed from: a */
    public final View f146361a;

    /* JADX INFO: renamed from: b */
    public final mcr f146362b;

    /* JADX INFO: renamed from: c */
    public final List<InterfaceC19081a<T>> f146363c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public C22306c<T> f146364d;

    /* JADX INFO: renamed from: e */
    public int f146365e;

    /* JADX INFO: renamed from: f */
    public d30 f146366f;

    /* JADX INFO: renamed from: l.oyv$a */
    public interface InterfaceC19081a<T> {
        /* JADX INFO: renamed from: a */
        boolean mo43389a(T t);

        @NonNull
        /* JADX INFO: renamed from: b */
        String mo43390b();

        /* JADX INFO: renamed from: c */
        void mo43391c(View view);

        /* JADX INFO: renamed from: d */
        C22306c<Boolean> mo43392d();
    }

    public oyv(mcr mcrVar, View view) {
        this.f146362b = mcrVar;
        this.f146361a = view;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Optional m166710a(List list, Object[] objArr) {
        List listAsList = Arrays.asList(objArr);
        du2.m113670a("[view_dispatcher]", "condition result: [" + vwb.m200342o0(listAsList, new cjz(), ", ") + Constants.AES_SUFFIX);
        for (int i = 0; i < listAsList.size(); i++) {
            if (((Boolean) listAsList.get(i)).booleanValue()) {
                du2.m113670a("[view_dispatcher]", "final handle by :" + ((InterfaceC19081a) list.get(i)).mo43390b());
                return Optional.m15413of((InterfaceC19081a) list.get(i));
            }
        }
        du2.m113670a("[view_dispatcher]", "no hit strategy");
        return Optional.absent();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Boolean m166714e(Optional optional, InterfaceC19081a interfaceC19081a) {
        try {
            return Boolean.valueOf(interfaceC19081a.mo43389a(optional.isPresent() ? optional.get() : null));
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            au2.m98935w(e);
            du2.m113670a("[view_dispatcher]", "error: " + e);
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C22306c m166717h(InterfaceC19081a interfaceC19081a) {
        return interfaceC19081a.mo43392d().onErrorReturn(new w9j() { // from class: l.nyv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.FALSE;
            }
        }).distinctUntilChanged().take(this.f146365e != 1 ? Api.BaseClientBuilder.API_PRIORITY_OTHER : 1);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C22306c m166718i(final Optional optional) {
        final ArrayList arrayListM200339n = vwb.m200339n(this.f146363c, new w9j() { // from class: l.jyv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return oyv.m166714e(optional, (oyv.InterfaceC19081a) obj);
            }
        });
        if (!vwb.m200296J(arrayListM200339n)) {
            du2.m113670a("[view_dispatcher]", "handled strategies: [" + vwb.m200342o0(arrayListM200339n, new w9j() { // from class: l.kyv
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((oyv.InterfaceC19081a) obj).mo43390b();
                }
            }, " ,") + Constants.AES_SUFFIX);
        }
        return mkd0.m154982p(vwb.m200303Q(this.f146363c, new w9j() { // from class: l.lyv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f130609a.m166717h((oyv.InterfaceC19081a) obj);
            }
        }), new faj() { // from class: l.myv
            @Override // p149l.faj
            public final Object call(Object[] objArr) {
                return oyv.m166710a(arrayListM200339n, objArr);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m166719j(Optional optional) {
        boolean zIsPresent = optional.isPresent();
        View view = this.f146361a;
        if (zIsPresent) {
            xdl0.m208344M(view, true);
            ((InterfaceC19081a) optional.get()).mo43391c(this.f146361a);
            return;
        }
        xdl0.m208344M(view, false);
        d30 d30Var = this.f146366f;
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: k */
    public void m166720k(InterfaceC19081a<T> interfaceC19081a) {
        this.f146363c.add(interfaceC19081a);
    }

    /* JADX INFO: renamed from: l */
    public void m166721l(int i) {
        this.f146365e = i;
    }

    /* JADX INFO: renamed from: m */
    public void m166722m() {
        C22306c c22306cJust;
        C22306c<T> c22306c = this.f146364d;
        if (c22306c != null) {
            c22306cJust = c22306c.map(new w9j() { // from class: l.fyv
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Optional.fromNullable(obj);
                }
            }).take(this.f146365e != 1 ? Api.BaseClientBuilder.API_PRIORITY_OTHER : 1);
        } else {
            c22306cJust = C22306c.just(Optional.absent());
        }
        this.f146362b.duringCreated(c22306cJust.switchMap(new w9j() { // from class: l.gyv
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f105045a.m166718i((Optional) obj);
            }
        })).subscribe(mkd0.m154956H(new e30() { // from class: l.hyv
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f110150a.m166719j((Optional) obj);
            }
        }, new e30() { // from class: l.iyv
            @Override // p149l.e30
            public final void call(Object obj) {
                du2.m113670a("[view_dispatcher]", "upstream data throw error :" + ((Throwable) obj));
            }
        }));
    }
}
