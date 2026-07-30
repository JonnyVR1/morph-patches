package p153l;

import android.view.View;
import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.api.Api;
import com.google.common.base.Optional;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes12.dex */
public class l0w<T> {

    /* JADX INFO: renamed from: a */
    public final View f129595a;

    /* JADX INFO: renamed from: b */
    public final ner f129596b;

    /* JADX INFO: renamed from: c */
    public final List<InterfaceC18329a<T>> f129597c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public C22421c<T> f129598d;

    /* JADX INFO: renamed from: e */
    public int f129599e;

    /* JADX INFO: renamed from: f */
    public x20 f129600f;

    /* JADX INFO: renamed from: l.l0w$a */
    public interface InterfaceC18329a<T> {
        /* JADX INFO: renamed from: a */
        boolean mo44575a(T t);

        @NonNull
        /* JADX INFO: renamed from: b */
        String mo44576b();

        /* JADX INFO: renamed from: c */
        void mo44577c(View view);

        /* JADX INFO: renamed from: d */
        C22421c<Boolean> mo44578d();
    }

    public l0w(ner nerVar, View view) {
        this.f129596b = nerVar;
        this.f129595a = view;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Optional m152377a(List list, Object[] objArr) {
        List listAsList = Arrays.asList(objArr);
        tu2.m192703a("[view_dispatcher]", "condition result: [" + jyb.m147525o0(listAsList, new zrz(), ", ") + Constants.AES_SUFFIX);
        for (int i = 0; i < listAsList.size(); i++) {
            if (((Boolean) listAsList.get(i)).booleanValue()) {
                tu2.m192703a("[view_dispatcher]", "final handle by :" + ((InterfaceC18329a) list.get(i)).mo44576b());
                return Optional.m15467of((InterfaceC18329a) list.get(i));
            }
        }
        tu2.m192703a("[view_dispatcher]", "no hit strategy");
        return Optional.absent();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Boolean m152381e(Optional optional, InterfaceC18329a interfaceC18329a) {
        try {
            return Boolean.valueOf(interfaceC18329a.mo44575a(optional.isPresent() ? optional.get() : null));
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            qu2.m178128w(e);
            tu2.m192703a("[view_dispatcher]", "error: " + e);
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C22421c m152384h(InterfaceC18329a interfaceC18329a) {
        return interfaceC18329a.mo44578d().onErrorReturn(new qcj() { // from class: l.k0w
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.FALSE;
            }
        }).distinctUntilChanged().take(this.f129599e != 1 ? Api.BaseClientBuilder.API_PRIORITY_OTHER : 1);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C22421c m152385i(final Optional optional) {
        final ArrayList arrayListM147522n = jyb.m147522n(this.f129597c, new qcj() { // from class: l.g0w
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return l0w.m152381e(optional, (l0w.InterfaceC18329a) obj);
            }
        });
        if (!jyb.m147479J(arrayListM147522n)) {
            tu2.m192703a("[view_dispatcher]", "handled strategies: [" + jyb.m147525o0(arrayListM147522n, new qcj() { // from class: l.h0w
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((l0w.InterfaceC18329a) obj).mo44576b();
                }
            }, " ,") + Constants.AES_SUFFIX);
        }
        return psd0.m173623p(jyb.m147486Q(this.f129597c, new qcj() { // from class: l.i0w
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f112456a.m152384h((l0w.InterfaceC18329a) obj);
            }
        }), new zcj() { // from class: l.j0w
            @Override // p153l.zcj
            public final Object call(Object[] objArr) {
                return l0w.m152377a(arrayListM147522n, objArr);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m152386j(Optional optional) {
        boolean zIsPresent = optional.isPresent();
        View view = this.f129595a;
        if (zIsPresent) {
            bnl0.m105524M(view, true);
            ((InterfaceC18329a) optional.get()).mo44577c(this.f129595a);
            return;
        }
        bnl0.m105524M(view, false);
        x20 x20Var = this.f129600f;
        if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: k */
    public void m152387k(InterfaceC18329a<T> interfaceC18329a) {
        this.f129597c.add(interfaceC18329a);
    }

    /* JADX INFO: renamed from: l */
    public void m152388l(int i) {
        this.f129599e = i;
    }

    /* JADX INFO: renamed from: m */
    public void m152389m() {
        C22421c c22421cJust;
        C22421c<T> c22421c = this.f129598d;
        if (c22421c != null) {
            c22421cJust = c22421c.map(new qcj() { // from class: l.c0w
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Optional.fromNullable(obj);
                }
            }).take(this.f129599e != 1 ? Api.BaseClientBuilder.API_PRIORITY_OTHER : 1);
        } else {
            c22421cJust = C22421c.just(Optional.absent());
        }
        this.f129596b.duringCreated(c22421cJust.switchMap(new qcj() { // from class: l.d0w
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f84625a.m152385i((Optional) obj);
            }
        })).subscribe(psd0.m173597H(new y20() { // from class: l.e0w
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f91553a.m152386j((Optional) obj);
            }
        }, new y20() { // from class: l.f0w
            @Override // p153l.y20
            public final void call(Object obj) {
                tu2.m192703a("[view_dispatcher]", "upstream data throw error :" + ((Throwable) obj));
            }
        }));
    }
}
